/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class JobRequestBuilder {
    //the instance to build
    private JobRequest jobRequest;

    /**
     * Default constructor to initialize the instance
     */
    public JobRequestBuilder() {
        jobRequest = new JobRequest();
    }

    /**
     * The unique name of the application being run by this job. This must be a valid application that the calling user has permission to run.
     */
    public JobRequestBuilder appId(String appId) {
        jobRequest.setAppId(appId);
        return this;
    }

    /**
     * Whether the output from this job should be archived. If true, all new files created by this application's execution will be archived to the archivePath in the user's default storage system.
     */
    public JobRequestBuilder archive(boolean archive) {
        jobRequest.setArchive(archive);
        return this;
    }

    /**
     * The path of the archive folder for this job on the user's default storage sytem.
     */
    public JobRequestBuilder archivePath(String archivePath) {
        jobRequest.setArchivePath(archivePath);
        return this;
    }

    /**
     * The unique id of the storage system on which this job's output will be staged.
     */
    public JobRequestBuilder archiveSystem(String archiveSystem) {
        jobRequest.setArchiveSystem(archiveSystem);
        return this;
    }

    /**
     * The queue to which this job should be submitted. This is optional and only applies when the execution system has a batch scheduler.
     */
    public JobRequestBuilder batchQueue(String batchQueue) {
        jobRequest.setBatchQueue(batchQueue);
        return this;
    }

    /**
     * The application specific input files needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. Inputs may be given as relative paths in the user's default storage system or as URI. If a URI is given, the data will be staged in by the IO service and made avaialble to the application at run time.
     */
    public JobRequestBuilder inputs(LinkedHashMap<String, Object> inputs) {
        jobRequest.setInputs(inputs);
        return this;
    }

    /**
     * The requested compute time needed for this application to complete given in HH:mm:ss format.
     */
    public JobRequestBuilder maxRunTime(String maxRunTime) {
        jobRequest.setMaxRunTime(maxRunTime);
        return this;
    }

    /**
     * The requested memory for this application to run given in GB.
     */
    public JobRequestBuilder memoryPerNode(Integer memoryPerNode) {
        jobRequest.setMemoryPerNode(memoryPerNode);
        return this;
    }

    /**
     * The name of the job.
     */
    public JobRequestBuilder name(String name) {
        jobRequest.setName(name);
        return this;
    }

    /**
     * The number of processors this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.
     */
    public JobRequestBuilder nodeCount(Integer nodeCount) {
        jobRequest.setNodeCount(nodeCount);
        return this;
    }

    /**
     * An array of notifications you wish to receive.
     */
    public JobRequestBuilder notifications(List<Notification> notifications) {
        jobRequest.setNotifications(notifications);
        return this;
    }

    /**
     * The application specific parameters needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. The actual dataType will be determined by the application description.
     */
    public JobRequestBuilder parameters(LinkedHashMap<String, Object> parameters) {
        jobRequest.setParameters(parameters);
        return this;
    }

    /**
     * The number of processors this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.
     */
    public JobRequestBuilder processorsPerNode(Integer processorsPerNode) {
        jobRequest.setProcessorsPerNode(processorsPerNode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public JobRequest build() {
        return jobRequest;
    }
}