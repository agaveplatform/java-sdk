/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5439140276446172030L;
    private String description;
    private String environment;
    private SystemExecutionTypeEnum executionType;
    private String id;
    private SystemLoginConfig login;
    private Integer maxSystemJobs;
    private Integer maxSystemJobsPerUser;
    private String name;
    private List<BatchQueue> queues;
    private BatchSchedulerTypeEnum scheduler;
    private String scratchDir;
    private String site;
    private String startupScript;
    private SystemStatusTypeEnum status;
    private SystemStorageConfig storage;
    private SystemTypeEnum type;
    private String workDir;
    /** GETTER
     * Verbose description of this system.
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Verbose description of this system.
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Environment variables to set upon login prior to job submission.
     */
    @JsonGetter("environment")
    public String getEnvironment ( ) { 
        return this.environment;
    }
    
    /** SETTER
     * Environment variables to set upon login prior to job submission.
     */
    @JsonSetter("environment")
    public void setEnvironment (String value) { 
        this.environment = value;
    }
 
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
     * Unique identifier for this system.
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * Unique identifier for this system.
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
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
     * Common name for this system.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Common name for this system.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * The execution paradigm used to run jobs on this system.
     */
    @JsonGetter("queues")
    public List<BatchQueue> getQueues ( ) { 
        return this.queues;
    }
    
    /** SETTER
     * The execution paradigm used to run jobs on this system.
     */
    @JsonSetter("queues")
    public void setQueues (List<BatchQueue> value) { 
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
     * The site associated with this system.
     */
    @JsonGetter("site")
    public String getSite ( ) { 
        return this.site;
    }
    
    /** SETTER
     * The site associated with this system.
     */
    @JsonSetter("site")
    public void setSite (String value) { 
        this.site = value;
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
     * The functional status of this system. Systems must be in UP status to be used.
     */
    @JsonGetter("status")
    public SystemStatusTypeEnum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * The functional status of this system. Systems must be in UP status to be used.
     */
    @JsonSetter("status")
    public void setStatus (SystemStatusTypeEnum value) { 
        this.status = value;
    }
 
    /** GETTER
     * The storage config defining how to connect to this system for data staging.
     */
    @JsonGetter("storage")
    public SystemStorageConfig getStorage ( ) { 
        return this.storage;
    }
    
    /** SETTER
     * The storage config defining how to connect to this system for data staging.
     */
    @JsonSetter("storage")
    public void setStorage (SystemStorageConfig value) { 
        this.storage = value;
    }
 
    /** GETTER
     * The type of this system.
     */
    @JsonGetter("type")
    public SystemTypeEnum getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The type of this system.
     */
    @JsonSetter("type")
    public void setType (SystemTypeEnum value) { 
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
 