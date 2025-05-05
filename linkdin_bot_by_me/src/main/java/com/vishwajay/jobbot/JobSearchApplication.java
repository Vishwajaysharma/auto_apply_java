package com.vishwajay.jobbot;

import com.vishwajay.jobbot.ai.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class JobSearchApplication {
    public static void main(String[] args) {
        // User preferences
        JobPreferences preferences = new JobPreferences("Software Quality Engineer", "Remote", "Tech", "Full-time");

        // Sample job descriptions
        List<String> jobDescriptions = Arrays.asList(
           // " "
          //  "Data Scientist at Facebook in New York, Full-time, Tech industry"
        );

        // AI Matcher
        AIJobMatcher matcher = new AIJobMatcher();
        matcher.matchJobsWithPreferences(jobDescriptions, preferences);
    }
}
