package com.redefine.quartz.bean;

import org.quartz.JobDataMap;

import java.io.Serializable;

/**
 * @author : Kaustav Sarkar
 * @since : 12/11/2019
 **/
public class QuartzJobDetail implements Serializable {
    private String jobClassString;
    private String jobName;
    private String jobGroup;
    private JobDataMap jobDataMap;
    private boolean isDurable;
    private String description;
    private boolean isRecvorable;

    public String getJobClassString() {
        return jobClassString;
    }

    public void setJobClassString(String jobClassString) {
        this.jobClassString = jobClassString;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public JobDataMap getJobDataMap() {
        return jobDataMap;
    }

    public boolean isDurable() {
        return isDurable;
    }

    public void setDurable(boolean durable) {
        isDurable = durable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRecvorable() {
        return isRecvorable;
    }

    public void setRecvorable(boolean recvorable) {
        isRecvorable = recvorable;
    }
}
