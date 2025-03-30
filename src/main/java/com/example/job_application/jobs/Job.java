package com.example.job_application.jobs;

public class Job {
    private long id;
    private String name;
    private String description;
    private String maxSalary;
    private String minSalary;
    private String location;

    public Job(long id, String name, String description, String maxSalary, String minSalary, String location) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
        this.location = location;


    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(String minSalary) {
        this.minSalary = minSalary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
