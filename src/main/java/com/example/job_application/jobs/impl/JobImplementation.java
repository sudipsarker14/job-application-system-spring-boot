package com.example.job_application.jobs.impl;

import com.example.job_application.jobs.Job;
import com.example.job_application.jobs.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobImplementation implements JobService {

    private List<Job> jobs = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public List<Job> findall() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        jobs.add(job);
    }

    @Override
    public Job getJobByID(Long id) {
        for (Job job:
        jobs) {
            if (job.getId()==id){
                return job;
             }
        }
        return null;
    }
}
