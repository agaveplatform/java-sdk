/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class JobSubmissionBuilder {
    //the instance to build
    private JobSubmission jobSubmission;

    /**
     * Default constructor to initialize the instance
     */
    public JobSubmissionBuilder() {
        jobSubmission = new JobSubmission();
    }

    /**
     * The unique name of the application being run by this job. This must be a valid application that the calling user has permission to run.
     */
    public JobSubmissionBuilder appId(String appId) {
        jobSubmission.setAppId(appId);
        return this;
    }

    /**
     * Whether the output from this job should be archived. If true, all new files created by this application's execution will be archived to the archivePath in the user's default storage system.
     */
    public JobSubmissionBuilder archive(boolean archive) {
        jobSubmission.setArchive(archive);
        return this;
    }

    /**
     * The path of the archive folder for this job on the archiveSystem. Defaults to the user's default storage system.
     */
    public JobSubmissionBuilder archivePath(String archivePath) {
        jobSubmission.setArchivePath(archivePath);
        return this;
    }

    /**
     * The system on which the job data will be archived
     */
    public JobSubmissionBuilder archiveSystem(String archiveSystem) {
        jobSubmission.setArchiveSystem(archiveSystem);
        return this;
    }

    /**
     * The queue to which this job should be submitted. This is optional and only applies when the execution system has a batch scheduler.
     */
    public JobSubmissionBuilder batchQueue(String batchQueue) {
        jobSubmission.setBatchQueue(batchQueue);
        return this;
    }

    /**
     * The application specific input files needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. Inputs may be given as relative paths in the user's default storage system or as URI. If a URI is given, the data will be staged in by the IO service and made avaialble to the application at run time.
     */
    public JobSubmissionBuilder inputs(LinkedHashMap<String, String> inputs) {
        jobSubmission.setInputs(inputs);
        return this;
    }

    /**
     * The maximum amount of memory needed for this application to run given in GB.
     */
    public JobSubmissionBuilder maxMemory(String maxMemory) {
        jobSubmission.setMaxMemory(maxMemory);
        return this;
    }

    /**
     * The estimated compute time needed for this application to complete given in hh:mm:ss format.
     */
    public JobSubmissionBuilder maxRunTime(String maxRunTime) {
        jobSubmission.setMaxRunTime(maxRunTime);
        return this;
    }

    /**
     * The name of the job.
     */
    public JobSubmissionBuilder name(String name) {
        jobSubmission.setName(name);
        return this;
    }

    /**
     * The number of nodes this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.
     */
    public JobSubmissionBuilder nodeCount(int nodeCount) {
        jobSubmission.setNodeCount(nodeCount);
        return this;
    }

    /**
     * An array of notifications you wish to receive.
     */
    public JobSubmissionBuilder notifications(List<Notification> notifications) {
        jobSubmission.setNotifications(notifications);
        return this;
    }

    /**
     * The application specific parameters needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. The actual dataType will be determined by the application description.
     */
    public JobSubmissionBuilder parameters(LinkedHashMap<String, Object> parameters) {
        jobSubmission.setParameters(parameters);
        return this;
    }

    /**
     * The number of processors this application should utilize while running.
     */
    public JobSubmissionBuilder processorsPerNode(int processorsPerNode) {
        jobSubmission.setProcessorsPerNode(processorsPerNode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public JobSubmission build() {
        return jobSubmission;
    }
}