/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class JobSummary 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5341549924451551896L;
    private String appId;
    private Date endTime;
    private String executionSystem;
    private int id;
    private String name;
    private String owner;
    private Date startTime;
    private String status;
    /** GETTER
     * The unique name of the application being run by this job. This must be a valid application that the calling user has permission to run.
     */
    @JsonGetter("appId")
    public String getAppId ( ) { 
        return this.appId;
    }
    
    /** SETTER
     * The unique name of the application being run by this job. This must be a valid application that the calling user has permission to run.
     */
    @JsonSetter("appId")
    public void setAppId (String value) { 
        this.appId = value;
    }
 
    /** GETTER
     * The date the job ended in ISO 8601 format.
     */
    @JsonGetter("endTime")
    public Date getEndTime ( ) { 
        return this.endTime;
    }
    
    /** SETTER
     * The date the job ended in ISO 8601 format.
     */
    @JsonSetter("endTime")
    public void setEndTime (Date value) { 
        this.endTime = value;
    }
 
    /** GETTER
     * The system id of the execution system.
     */
    @JsonGetter("executionSystem")
    public String getExecutionSystem ( ) { 
        return this.executionSystem;
    }
    
    /** SETTER
     * The system id of the execution system.
     */
    @JsonSetter("executionSystem")
    public void setExecutionSystem (String value) { 
        this.executionSystem = value;
    }
 
    /** GETTER
     * The unique id of the job.
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The unique id of the job.
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
    }
 
    /** GETTER
     * The name of the job.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The name of the job.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * The job owner.
     */
    @JsonGetter("owner")
    public String getOwner ( ) { 
        return this.owner;
    }
    
    /** SETTER
     * The job owner.
     */
    @JsonSetter("owner")
    public void setOwner (String value) { 
        this.owner = value;
    }
 
    /** GETTER
     * The date the job started in ISO 8601 format.
     */
    @JsonGetter("startTime")
    public Date getStartTime ( ) { 
        return this.startTime;
    }
    
    /** SETTER
     * The date the job started in ISO 8601 format.
     */
    @JsonSetter("startTime")
    public void setStartTime (Date value) { 
        this.startTime = value;
    }
 
    /** GETTER
     * The status of the job. Possible values are: PENDING, STAGING_INPUTS, CLEANING_UP, ARCHIVING, STAGING_JOB, FINISHED, KILLED, FAILED, STOPPED, RUNNING, PAUSED, QUEUED, SUBMITTING, STAGED, PROCESSING_INPUTS, ARCHIVING_FINISHED, ARCHIVING_FAILED
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * The status of the job. Possible values are: PENDING, STAGING_INPUTS, CLEANING_UP, ARCHIVING, STAGING_JOB, FINISHED, KILLED, FAILED, STOPPED, RUNNING, PAUSED, QUEUED, SUBMITTING, STAGED, PROCESSING_INPUTS, ARCHIVING_FINISHED, ARCHIVING_FAILED
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
}
 