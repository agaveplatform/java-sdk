/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ExecutionSystem 
        extends System {
    private static final long serialVersionUID = 4983618627803554134L;
    private SystemExecutionTypeEnum executionType;
    private SystemLoginConfig login;
    private Integer maxSystemJobs;
    private Integer maxSystemJobsPerUser;
    private BatchQueue queues;
    private BatchSchedulerTypeEnum scheduler;
    private String scratchDir;
    private String startupScript;
    private SystemTypeEnum type = SystemTypeEnum.fromString("EXECUTION");
    private String workDir;
    /** GETTER
     * The execution paradigm used to run jobs on this system.
     */
    @JsonGetter("executionType")
    public SystemExecutionTypeEnum getExecutionType ( ) { 
        return this.executionType;
    }
    
    /** SETTER
     * The execution paradigm used to run jobs on this system.
     */
    @JsonSetter("executionType")
    public void setExecutionType (SystemExecutionTypeEnum value) { 
        this.executionType = value;
    }
 
    /** GETTER
     * The login config defining how to connect to this system for job submission.
     */
    @JsonGetter("login")
    public SystemLoginConfig getLogin ( ) { 
        return this.login;
    }
    
    /** SETTER
     * The login config defining how to connect to this system for job submission.
     */
    @JsonSetter("login")
    public void setLogin (SystemLoginConfig value) { 
        this.login = value;
    }
 
    /** GETTER
     * The maximum number of jobs that can be simultaneously run on the system across all queues.
     */
    @JsonGetter("maxSystemJobs")
    public Integer getMaxSystemJobs ( ) { 
        return this.maxSystemJobs;
    }
    
    /** SETTER
     * The maximum number of jobs that can be simultaneously run on the system across all queues.
     */
    @JsonSetter("maxSystemJobs")
    public void setMaxSystemJobs (Integer value) { 
        this.maxSystemJobs = value;
    }
 
    /** GETTER
     * The maximum number of jobs that can be simultaneously run on the system across all queues by a single user.
     */
    @JsonGetter("maxSystemJobsPerUser")
    public Integer getMaxSystemJobsPerUser ( ) { 
        return this.maxSystemJobsPerUser;
    }
    
    /** SETTER
     * The maximum number of jobs that can be simultaneously run on the system across all queues by a single user.
     */
    @JsonSetter("maxSystemJobsPerUser")
    public void setMaxSystemJobsPerUser (Integer value) { 
        this.maxSystemJobsPerUser = value;
    }
 
    /** GETTER
     * The execution paradigm used to run jobs on this system.
     */
    @JsonGetter("queues")
    public BatchQueue getQueues ( ) { 
        return this.queues;
    }
    
    /** SETTER
     * The execution paradigm used to run jobs on this system.
     */
    @JsonSetter("queues")
    public void setQueues (BatchQueue value) { 
        this.queues = value;
    }
 
    /** GETTER
     * The type of scheduled used to run jobs.
     */
    @JsonGetter("scheduler")
    public BatchSchedulerTypeEnum getScheduler ( ) { 
        return this.scheduler;
    }
    
    /** SETTER
     * The type of scheduled used to run jobs.
     */
    @JsonSetter("scheduler")
    public void setScheduler (BatchSchedulerTypeEnum value) { 
        this.scheduler = value;
    }
 
    /** GETTER
     * The scratch directory where job execution directories will be created at runtime. The workDir is used if this is not specified.
     */
    @JsonGetter("scratchDir")
    public String getScratchDir ( ) { 
        return this.scratchDir;
    }
    
    /** SETTER
     * The scratch directory where job execution directories will be created at runtime. The workDir is used if this is not specified.
     */
    @JsonSetter("scratchDir")
    public void setScratchDir (String value) { 
        this.scratchDir = value;
    }
 
    /** GETTER
     * Script to be run after login and prior to execution.
     */
    @JsonGetter("startupScript")
    public String getStartupScript ( ) { 
        return this.startupScript;
    }
    
    /** SETTER
     * Script to be run after login and prior to execution.
     */
    @JsonSetter("startupScript")
    public void setStartupScript (String value) { 
        this.startupScript = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public SystemTypeEnum getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    private void setType (SystemTypeEnum value) { 
        this.type = value;
    }
 
    /** GETTER
     * The work directory where job execution directories will be created at runtime. This is used if scratchDir is not specified. If neither are specified, the job directory will be created in the system homeDir.
     */
    @JsonGetter("workDir")
    public String getWorkDir ( ) { 
        return this.workDir;
    }
    
    /** SETTER
     * The work directory where job execution directories will be created at runtime. This is used if scratchDir is not specified. If neither are specified, the job directory will be created in the system homeDir.
     */
    @JsonSetter("workDir")
    public void setWorkDir (String value) { 
        this.workDir = value;
    }
 
}
 