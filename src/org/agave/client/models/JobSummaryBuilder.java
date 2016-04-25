/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class JobSummaryBuilder {
    //the instance to build
    private JobSummary jobSummary;

    /**
     * Default constructor to initialize the instance
     */
    public JobSummaryBuilder() {
        jobSummary = new JobSummary();
    }

    /**
     * The unique name of the application being run by this job. This must be a valid application that the calling user has permission to run.
     */
    public JobSummaryBuilder appId(String appId) {
        jobSummary.setAppId(appId);
        return this;
    }

    /**
     * The date the job ended in ISO 8601 format.
     */
    public JobSummaryBuilder endTime(Date endTime) {
        jobSummary.setEndTime(endTime);
        return this;
    }

    /**
     * The system id of the execution system.
     */
    public JobSummaryBuilder executionSystem(String executionSystem) {
        jobSummary.setExecutionSystem(executionSystem);
        return this;
    }

    /**
     * The unique id of the job.
     */
    public JobSummaryBuilder id(int id) {
        jobSummary.setId(id);
        return this;
    }

    /**
     * The name of the job.
     */
    public JobSummaryBuilder name(String name) {
        jobSummary.setName(name);
        return this;
    }

    /**
     * The job owner.
     */
    public JobSummaryBuilder owner(String owner) {
        jobSummary.setOwner(owner);
        return this;
    }

    /**
     * The date the job started in ISO 8601 format.
     */
    public JobSummaryBuilder startTime(Date startTime) {
        jobSummary.setStartTime(startTime);
        return this;
    }

    /**
     * The status of the job. Possible values are: PENDING, STAGING_INPUTS, CLEANING_UP, ARCHIVING, STAGING_JOB, FINISHED, KILLED, FAILED, STOPPED, RUNNING, PAUSED, QUEUED, SUBMITTING, STAGED, PROCESSING_INPUTS, ARCHIVING_FINISHED, ARCHIVING_FAILED
     */
    public JobSummaryBuilder status(String status) {
        jobSummary.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public JobSummary build() {
        return jobSummary;
    }
}