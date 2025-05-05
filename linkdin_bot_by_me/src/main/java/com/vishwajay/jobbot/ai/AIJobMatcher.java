package com.vishwajay.jobbot.ai;

import com.vishwajay.jobbot.JobPreferences; // Import JobPreferences
import java.util.List;
import java.util.ArrayList;

public class AIJobMatcher {

    // Method to match job descriptions with user preferences
    public void matchJobsWithPreferences(List<String> jobDescriptions, JobPreferences preferences) {
        // List to store the matched jobs
        List<String> matchedJobs = new ArrayList<>();

        for (String jobDescription : jobDescriptions) {
            if (isJobMatching(jobDescription, preferences)) {
                matchedJobs.add(jobDescription);
            }
        }

        // Display matched jobs
        if (matchedJobs.isEmpty()) {
            System.out.println("No jobs matched the preferences.");
        } else {
            System.out.println("Matched Jobs:");
            for (String job : matchedJobs) {
                System.out.println(job);
            }
        }
    }

    // Simple matching logic (can be enhanced with AI/ML)
    private boolean isJobMatching(String jobDescription, JobPreferences preferences) {
        return jobDescription.contains(preferences.getJobTitle()) &&
               jobDescription.contains(preferences.getLocation()) &&
               jobDescription.contains(preferences.getIndustry()) &&
               jobDescription.contains(preferences.getJobType());
    }
}
