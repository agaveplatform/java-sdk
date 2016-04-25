/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class ExecutionSystemBuilder 
        extends SystemBuilder {
    //the instance to build
    private ExecutionSystem executionSystem;

    /**
     * Default constructor to initialize the instance
     */
    public ExecutionSystemBuilder() {
        executionSystem = new ExecutionSystem();
    }

    /**
     * The execution paradigm used to run jobs on this system.
     */
    public ExecutionSystemBuilder executionType(SystemExecutionTypeEnum executionType) {
        executionSystem.setExecutionType(executionType);
        return this;
    }

    /**
     * The login config defining how to connect to this system for job submission.
     */
    public ExecutionSystemBuilder login(SystemLoginConfig login) {
        executionSystem.setLogin(login);
        return this;
    }

    /**
     * The maximum number of jobs that can be simultaneously run on the system across all queues.
     */
    public ExecutionSystemBuilder maxSystemJobs(Integer maxSystemJobs) {
        executionSystem.setMaxSystemJobs(maxSystemJobs);
        return this;
    }

    /**
     * The maximum number of jobs that can be simultaneously run on the system across all queues by a single user.
     */
    public ExecutionSystemBuilder maxSystemJobsPerUser(Integer maxSystemJobsPerUser) {
        executionSystem.setMaxSystemJobsPerUser(maxSystemJobsPerUser);
        return this;
    }

    /**
     * The execution paradigm used to run jobs on this system.
     */
    public ExecutionSystemBuilder queues(BatchQueue queues) {
        executionSystem.setQueues(queues);
        return this;
    }

    /**
     * The type of scheduled used to run jobs.
     */
    public ExecutionSystemBuilder scheduler(BatchSchedulerTypeEnum scheduler) {
        executionSystem.setScheduler(scheduler);
        return this;
    }

    /**
     * The scratch directory where job execution directories will be created at runtime. The workDir is used if this is not specified.
     */
    public ExecutionSystemBuilder scratchDir(String scratchDir) {
        executionSystem.setScratchDir(scratchDir);
        return this;
    }

    /**
     * Script to be run after login and prior to execution.
     */
    public ExecutionSystemBuilder startupScript(String startupScript) {
        executionSystem.setStartupScript(startupScript);
        return this;
    }

    /**
     * The work directory where job execution directories will be created at runtime. This is used if scratchDir is not specified. If neither are specified, the job directory will be created in the system homeDir.
     */
    public ExecutionSystemBuilder workDir(String workDir) {
        executionSystem.setWorkDir(workDir);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ExecutionSystem build() {
        return executionSystem;
    }
}