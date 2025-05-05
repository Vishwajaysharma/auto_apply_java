package com.vishwajay.jobbot;

public class JobApplicationStarter {

    public static void main(String[] args) {
        // Your LinkedIn credentials
        String email = "vishwajaysharma@gmail.com";
        String password = "ilove9234662437";

        // Job preferences
        String jobTitle = "Quality assurance, testing ,testng";
        String location = "India";

        // Start the job application process
        JobApplicationProcess process = new JobApplicationProcess();
        process.startApplicationProcess(email, password, jobTitle, location);
    }
}
