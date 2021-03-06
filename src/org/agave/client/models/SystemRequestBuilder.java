/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class SystemRequestBuilder {
    //the instance to build
    private SystemRequest systemRequest;

    /**
     * Default constructor to initialize the instance
     */
    public SystemRequestBuilder() {
        systemRequest = new SystemRequest();
    }

    /**
     * Verbose description of this system.
     */
    public SystemRequestBuilder description(String description) {
        systemRequest.setDescription(description);
        return this;
    }

    /**
     * Environment variables to set upon login prior to job submission.
     */
    public SystemRequestBuilder environment(String environment) {
        systemRequest.setEnvironment(environment);
        return this;
    }

    /**
     * The execution paradigm used to run jobs on this system.
     */
    public SystemRequestBuilder executionType(SystemExecutionTypeEnum executionType) {
        systemRequest.setExecutionType(executionType);
        return this;
    }

    /**
     * Unique identifier for this system.
     */
    public SystemRequestBuilder id(String id) {
        systemRequest.setId(id);
        return this;
    }

    /**
     * The login config defining how to connect to this system for job submission.
     */
    public SystemRequestBuilder login(SystemLoginConfig login) {
        systemRequest.setLogin(login);
        return this;
    }

    /**
     * The maximum number of jobs that can be simultaneously run on the system across all queues.
     */
    public SystemRequestBuilder maxSystemJobs(Integer maxSystemJobs) {
        systemRequest.setMaxSystemJobs(maxSystemJobs);
        return this;
    }

    /**
     * The maximum number of jobs that can be simultaneously run on the system across all queues by a single user.
     */
    public SystemRequestBuilder maxSystemJobsPerUser(Integer maxSystemJobsPerUser) {
        systemRequest.setMaxSystemJobsPerUser(maxSystemJobsPerUser);
        return this;
    }

    /**
     * Common name for this system.
     */
    public SystemRequestBuilder name(String name) {
        systemRequest.setName(name);
        return this;
    }

    /**
     * The execution paradigm used to run jobs on this system.
     */
    public SystemRequestBuilder queues(List<BatchQueue> queues) {
        systemRequest.setQueues(queues);
        return this;
    }

    /**
     * The type of scheduled used to run jobs.
     */
    public SystemRequestBuilder scheduler(BatchSchedulerTypeEnum scheduler) {
        systemRequest.setScheduler(scheduler);
        return this;
    }

    /**
     * The scratch directory where job execution directories will be created at runtime. The workDir is used if this is not specified.
     */
    public SystemRequestBuilder scratchDir(String scratchDir) {
        systemRequest.setScratchDir(scratchDir);
        return this;
    }

    /**
     * The site associated with this system.
     */
    public SystemRequestBuilder site(String site) {
        systemRequest.setSite(site);
        return this;
    }

    /**
     * Script to be run after login and prior to execution.
     */
    public SystemRequestBuilder startupScript(String startupScript) {
        systemRequest.setStartupScript(startupScript);
        return this;
    }

    /**
     * The functional status of this system. Systems must be in UP status to be used.
     */
    public SystemRequestBuilder status(SystemStatusTypeEnum status) {
        systemRequest.setStatus(status);
        return this;
    }

    /**
     * The storage config defining how to connect to this system for data staging.
     */
    public SystemRequestBuilder storage(SystemStorageConfig storage) {
        systemRequest.setStorage(storage);
        return this;
    }

    /**
     * The type of this system.
     */
    public SystemRequestBuilder type(SystemTypeEnum type) {
        systemRequest.setType(type);
        return this;
    }

    /**
     * The work directory where job execution directories will be created at runtime. This is used if scratchDir is not specified. If neither are specified, the job directory will be created in the system homeDir.
     */
    public SystemRequestBuilder workDir(String workDir) {
        systemRequest.setWorkDir(workDir);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SystemRequest build() {
        return systemRequest;
    }
}