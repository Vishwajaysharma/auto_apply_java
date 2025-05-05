package com.vishwajay.jobbot.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class AutoApplyService {

    public void applyToJobs(WebDriver driver) throws InterruptedException {
        List<WebElement> jobCards = driver.findElements(By.cssSelector("ul.jobs-search__results-list li"));

        for (WebElement jobCard : jobCards) {
            try {
                jobCard.click();
                Thread.sleep(3000);

                WebElement easyApplyButton = driver.findElement(By.xpath("//button[contains(text(),'Easy Apply')]"));
                easyApplyButton.click();
                Thread.sleep(2000);

                // Click next/submit repeatedly until done or fail
                while (true) {
                    List<WebElement> nextButtons = driver.findElements(By.xpath("//button[contains(text(),'Next')]"));
                    if (!nextButtons.isEmpty()) {
                        nextButtons.get(0).click();
                        Thread.sleep(1500);
                    } else {
                        WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit application')]"));
                        submitButton.click();
                        Thread.sleep(2000);
                        break;
                    }
                }

                // Optionally close confirmation dialog
                List<WebElement> closeButtons = driver.findElements(By.xpath("//button[@aria-label='Dismiss']"));
                if (!closeButtons.isEmpty()) closeButtons.get(0).click();

            } catch (Exception e) {
                System.out.println("Skipping job due to error: " + e.getMessage());
                continue;
            }
            Thread.sleep(3000); // Delay between applications
        }
    }
}
