package com.example.job_application.jobs.impl;

import com.example.job_application.jobs.Job;
import com.example.job_application.jobs.JobRepository;
import com.example.job_application.jobs.JobService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class JobImplementation implements JobService {

    // private List<Job> jobs = new ArrayList<>();
    JobRepository jobRepository;

    public JobImplementation(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> findall() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job job) {
        jobRepository.save(job);
    }

    @Override
    public Job getJobByID(Long id) {
      return jobRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteJobById(Long id) {
       try {
           jobRepository.deleteById(id);
           return true;
       } catch (Exception e){
           return false;
       }
    }

    @Override
    public boolean updateJob(Long id, Job updatedJob) {
        Optional<Job> jobOptional = jobRepository.findById(id);
            if(jobOptional.isPresent()){
                Job job = jobOptional.get();
                job.setName(updatedJob.getName());
                job.setDescription(updatedJob.getDescription());
                job.setMaxSalary(updatedJob.getMaxSalary());
                job.setMinSalary(updatedJob.getMinSalary());
                job.setLocation(updatedJob.getLocation());
                jobRepository.save(job);
                return true;
            }
        return false;
        }

    }
