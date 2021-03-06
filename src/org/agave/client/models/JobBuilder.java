/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class JobBuilder {
    //the instance to build
    private Job job;

    /**
     * Default constructor to initialize the instance
     */
    public JobBuilder() {
        job = new Job();
    }

    /**
     * The unique name of the application being run by this job. This must be a valid application that the calling user has permission to run.
     */
    public JobBuilder appId(String appId) {
        job.setAppId(appId);
        return this;
    }

    /**
     * Whether the output from this job should be archived. If true, all new files created by this application's execution will be archived to the archivePath in the user's default storage system.
     */
    public JobBuilder archive(boolean archive) {
        job.setArchive(archive);
        return this;
    }

    /**
     * The path of the archive folder for this job on the user's default storage sytem.
     */
    public JobBuilder archivePath(String archivePath) {
        job.setArchivePath(archivePath);
        return this;
    }

    /**
     * The unique id of the storage system on which this job's output will be staged.
     */
    public JobBuilder archiveSystem(String archiveSystem) {
        job.setArchiveSystem(archiveSystem);
        return this;
    }

    /**
     * The queue to which this job should be submitted. This is optional and only applies when the execution system has a batch scheduler.
     */
    public JobBuilder batchQueue(String batchQueue) {
        job.setBatchQueue(batchQueue);
        return this;
    }

    /**
     * The date the job stopped running due to termination, completion, or error in ISO 8601 format.
     */
    public JobBuilder endTime(Date endTime) {
        job.setEndTime(endTime);
        return this;
    }

    /**
     * The system id of the execution system.
     */
    public JobBuilder executionSystem(String executionSystem) {
        job.setExecutionSystem(executionSystem);
        return this;
    }

    /**
     * The unique id of the job.
     */
    public JobBuilder id(int id) {
        job.setId(id);
        return this;
    }

    /**
     * The application specific input files needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. Inputs may be given as relative paths in the user's default storage system or as URI. If a URI is given, the data will be staged in by the IO service and made avaialble to the application at run time.
     */
    public JobBuilder inputs(JobInputs inputs) {
        job.setInputs(inputs);
        return this;
    }

    /**
     * The process or local job id of the job on the remote execution system.
     */
    public JobBuilder localId(String localId) {
        job.setLocalId(localId);
        return this;
    }

    /**
     * The requested compute time needed for this application to complete given in HH:mm:ss format.
     */
    public JobBuilder maxRunTime(String maxRunTime) {
        job.setMaxRunTime(maxRunTime);
        return this;
    }

    /**
     * The requested memory for this application to run given in GB.
     */
    public JobBuilder memoryPerNode(String memoryPerNode) {
        job.setMemoryPerNode(memoryPerNode);
        return this;
    }

    /**
     * The error message incurred when the job failed.
     */
    public JobBuilder message(String message) {
        job.setMessage(message);
        return this;
    }

    /**
     * The name of the job.
     */
    public JobBuilder name(String name) {
        job.setName(name);
        return this;
    }

    /**
     * The number of processors this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.
     */
    public JobBuilder nodeCount(int nodeCount) {
        job.setNodeCount(nodeCount);
        return this;
    }

    /**
     * An array of notifications you wish to receive.
     */
    public JobBuilder notifications(List<Notification> notifications) {
        job.setNotifications(notifications);
        return this;
    }

    /**
     * Relative path of the job's output data.
     */
    public JobBuilder outputPath(String outputPath) {
        job.setOutputPath(outputPath);
        return this;
    }

    /**
     * The job owner.
     */
    public JobBuilder owner(String owner) {
        job.setOwner(owner);
        return this;
    }

    /**
     * The application specific parameters needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. The actual dataType will be determined by the application description.
     */
    public JobBuilder parameters(JobParameters parameters) {
        job.setParameters(parameters);
        return this;
    }

    /**
     * The number of processors this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.
     */
    public JobBuilder processorsPerNode(int processorsPerNode) {
        job.setProcessorsPerNode(processorsPerNode);
        return this;
    }

    /**
     * The number of retires it took to submit this job.
     */
    public JobBuilder retries(int retries) {
        job.setRetries(retries);
        return this;
    }

    /**
     * The date the job started in ISO 8601 format.
     */
    public JobBuilder startTime(Date startTime) {
        job.setStartTime(startTime);
        return this;
    }

    /**
     * The status of the job. Possible values are: PENDING, STAGING_INPUTS, CLEANING_UP, ARCHIVING, STAGING_JOB, FINISHED, KILLED, FAILED, STOPPED, RUNNING, PAUSED, QUEUED, SUBMITTING, STAGED, PROCESSING_INPUTS, ARCHIVING_FINISHED, ARCHIVING_FAILED
     */
    public JobBuilder status(String status) {
        job.setStatus(status);
        return this;
    }

    /**
     * The date the job was submitted in ISO 8601 format.
     */
    public JobBuilder submitTime(Date submitTime) {
        job.setSubmitTime(submitTime);
        return this;
    }

    /**
     * The directory on the remote execution system from which the job is running.
     */
    public JobBuilder workPath(String workPath) {
        job.setWorkPath(workPath);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Job build() {
        return job;
    }
}