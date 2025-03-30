package com.example.job_application.jobs;

import java.util.List;

public interface JobService {
    List<Job> findall();
    void createJob(Job job);

    Job getJobByID(Long id);
}
