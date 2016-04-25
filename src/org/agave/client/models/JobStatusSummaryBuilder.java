/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class JobStatusSummaryBuilder {
    //the instance to build
    private JobStatusSummary jobStatusSummary;

    /**
     * Default constructor to initialize the instance
     */
    public JobStatusSummaryBuilder() {
        jobStatusSummary = new JobStatusSummary();
    }

    /**
     * The unique id of the job.
     */
    public JobStatusSummaryBuilder id(int id) {
        jobStatusSummary.setId(id);
        return this;
    }

    /**
     * The status of the job. Possible values are: PENDING, STAGING_INPUTS, CLEANING_UP, ARCHIVING, STAGING_JOB, FINISHED, KILLED, FAILED, STOPPED, RUNNING, PAUSED, QUEUED, SUBMITTING, STAGED, PROCESSING_INPUTS, ARCHIVING_FINISHED, ARCHIVING_FAILED
     */
    public JobStatusSummaryBuilder status(String status) {
        jobStatusSummary.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public JobStatusSummary build() {
        return jobStatusSummary;
    }
}