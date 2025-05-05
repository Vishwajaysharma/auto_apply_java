package com.vishwajay.jobbot.ai;

import java.util.List;
import java.util.Arrays;

public class AIJobMatcher {

    public boolean matchJob(String jobDescription, String[] userSkills, String jobLocation) {
        // Simple matching using keywords
        for (String skill : userSkills) {
            if (jobDescription.contains(skill) && jobDescription.contains(jobLocation)) {
                return true;
            }
        }
        return false;
    }
}
