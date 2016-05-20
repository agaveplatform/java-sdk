/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class JobStatusSummary 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4942495670428994776L;
    private int id;
    private String status;
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
 