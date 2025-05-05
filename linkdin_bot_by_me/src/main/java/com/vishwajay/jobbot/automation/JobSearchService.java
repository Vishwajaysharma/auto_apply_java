package com.vishwajay.jobbot.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobSearchService {

    public void searchJobs(WebDriver driver, String jobTitle, String location) throws InterruptedException {
        driver.get("https://www.linkedin.com/jobs");
        Thread.sleep(3000);

        WebElement searchBoxKeyword = driver.findElement(By.xpath("//input[@id='jobs-search-box-keyword-id-ember33']"));
        WebElement searchBoxLocation = driver.findElement(By.xpath("//input[contains(@aria-label, 'Search location')]"));

        // Clear and type job title
        searchBoxKeyword.sendKeys(Keys.CONTROL + "a");
        searchBoxKeyword.sendKeys(Keys.DELETE);
        searchBoxKeyword.sendKeys(jobTitle);
        Thread.sleep(1000);

        // Clear and type location
        searchBoxLocation.sendKeys(Keys.CONTROL + "a");
        searchBoxLocation.sendKeys(Keys.DELETE);
        searchBoxLocation.sendKeys(location);
        Thread.sleep(1000);

        // Submit search
        searchBoxLocation.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }
}

