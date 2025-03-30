package com.example.job_application.jobs;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> findall(){
        return jobService.findall();
    }

    @PostMapping("/jobs")
    public String createJobs(@RequestBody Job job){
        jobService.createJob(job);
        return "Job added successfully";
    }

    @GetMapping("/jobs/{id}")
    public Job getJobById (@PathVariable Long id){
        Job job = jobService.getJobByID(id);
        if (job != null){
            return job;
        }
        return new Job(156L, "test", "testcase", "2000", "3000", "dhaka");

    }
}
