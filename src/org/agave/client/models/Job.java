/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Job 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5426349440940753268L;
    private String appId;
    private boolean archive;
    private String archivePath;
    private String archiveSystem;
    private String batchQueue;
    private Date endTime;
    private String executionSystem;
    private int id;
    private JobInputs inputs;
    private String localId;
    private String maxRunTime;
    private String memoryPerNode;
    private String message;
    private String name;
    private int nodeCount;
    private List<Notification> notifications;
    private String outputPath;
    private String owner;
    private JobParameters parameters;
    private int processorsPerNode;
    private int retries;
    private Date startTime;
    private String status;
    private Date submitTime;
    private String workPath;
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
     * Whether the output from this job should be archived. If true, all new files created by this application's execution will be archived to the archivePath in the user's default storage system.
     */
    @JsonGetter("archive")
    public boolean getArchive ( ) { 
        return this.archive;
    }
    
    /** SETTER
     * Whether the output from this job should be archived. If true, all new files created by this application's execution will be archived to the archivePath in the user's default storage system.
     */
    @JsonSetter("archive")
    public void setArchive (boolean value) { 
        this.archive = value;
    }
 
    /** GETTER
     * The path of the archive folder for this job on the user's default storage sytem.
     */
    @JsonGetter("archivePath")
    public String getArchivePath ( ) { 
        return this.archivePath;
    }
    
    /** SETTER
     * The path of the archive folder for this job on the user's default storage sytem.
     */
    @JsonSetter("archivePath")
    public void setArchivePath (String value) { 
        this.archivePath = value;
    }
 
    /** GETTER
     * The unique id of the storage system on which this job's output will be staged.
     */
    @JsonGetter("archiveSystem")
    public String getArchiveSystem ( ) { 
        return this.archiveSystem;
    }
    
    /** SETTER
     * The unique id of the storage system on which this job's output will be staged.
     */
    @JsonSetter("archiveSystem")
    public void setArchiveSystem (String value) { 
        this.archiveSystem = value;
    }
 
    /** GETTER
     * The queue to which this job should be submitted. This is optional and only applies when the execution system has a batch scheduler.
     */
    @JsonGetter("batchQueue")
    public String getBatchQueue ( ) { 
        return this.batchQueue;
    }
    
    /** SETTER
     * The queue to which this job should be submitted. This is optional and only applies when the execution system has a batch scheduler.
     */
    @JsonSetter("batchQueue")
    public void setBatchQueue (String value) { 
        this.batchQueue = value;
    }
 
    /** GETTER
     * The date the job stopped running due to termination, completion, or error in ISO 8601 format.
     */
    @JsonGetter("endTime")
    public Date getEndTime ( ) { 
        return this.endTime;
    }
    
    /** SETTER
     * The date the job stopped running due to termination, completion, or error in ISO 8601 format.
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
     * The application specific input files needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. Inputs may be given as relative paths in the user's default storage system or as URI. If a URI is given, the data will be staged in by the IO service and made avaialble to the application at run time.
     */
    @JsonGetter("inputs")
    public JobInputs getInputs ( ) { 
        return this.inputs;
    }
    
    /** SETTER
     * The application specific input files needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. Inputs may be given as relative paths in the user's default storage system or as URI. If a URI is given, the data will be staged in by the IO service and made avaialble to the application at run time.
     */
    @JsonSetter("inputs")
    public void setInputs (JobInputs value) { 
        this.inputs = value;
    }
 
    /** GETTER
     * The process or local job id of the job on the remote execution system.
     */
    @JsonGetter("localId")
    public String getLocalId ( ) { 
        return this.localId;
    }
    
    /** SETTER
     * The process or local job id of the job on the remote execution system.
     */
    @JsonSetter("localId")
    public void setLocalId (String value) { 
        this.localId = value;
    }
 
    /** GETTER
     * The requested compute time needed for this application to complete given in HH:mm:ss format.
     */
    @JsonGetter("maxRunTime")
    public String getMaxRunTime ( ) { 
        return this.maxRunTime;
    }
    
    /** SETTER
     * The requested compute time needed for this application to complete given in HH:mm:ss format.
     */
    @JsonSetter("maxRunTime")
    public void setMaxRunTime (String value) { 
        this.maxRunTime = value;
    }
 
    /** GETTER
     * The requested memory for this application to run given in GB.
     */
    @JsonGetter("memoryPerNode")
    public String getMemoryPerNode ( ) { 
        return this.memoryPerNode;
    }
    
    /** SETTER
     * The requested memory for this application to run given in GB.
     */
    @JsonSetter("memoryPerNode")
    public void setMemoryPerNode (String value) { 
        this.memoryPerNode = value;
    }
 
    /** GETTER
     * The error message incurred when the job failed.
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * The error message incurred when the job failed.
     */
    @JsonSetter("message")
    public void setMessage (String value) { 
        this.message = value;
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
     * The number of processors this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.
     */
    @JsonGetter("nodeCount")
    public int getNodeCount ( ) { 
        return this.nodeCount;
    }
    
    /** SETTER
     * The number of processors this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.
     */
    @JsonSetter("nodeCount")
    public void setNodeCount (int value) { 
        this.nodeCount = value;
    }
 
    /** GETTER
     * An array of notifications you wish to receive.
     */
    @JsonGetter("notifications")
    public List<Notification> getNotifications ( ) { 
        return this.notifications;
    }
    
    /** SETTER
     * An array of notifications you wish to receive.
     */
    @JsonSetter("notifications")
    public void setNotifications (List<Notification> value) { 
        this.notifications = value;
    }
 
    /** GETTER
     * Relative path of the job's output data.
     */
    @JsonGetter("outputPath")
    public String getOutputPath ( ) { 
        return this.outputPath;
    }
    
    /** SETTER
     * Relative path of the job's output data.
     */
    @JsonSetter("outputPath")
    public void setOutputPath (String value) { 
        this.outputPath = value;
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
     * The application specific parameters needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. The actual dataType will be determined by the application description.
     */
    @JsonGetter("parameters")
    public JobParameters getParameters ( ) { 
        return this.parameters;
    }
    
    /** SETTER
     * The application specific parameters needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. The actual dataType will be determined by the application description.
     */
    @JsonSetter("parameters")
    public void setParameters (JobParameters value) { 
        this.parameters = value;
    }
 
    /** GETTER
     * The number of processors this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.
     */
    @JsonGetter("processorsPerNode")
    public int getProcessorsPerNode ( ) { 
        return this.processorsPerNode;
    }
    
    /** SETTER
     * The number of processors this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.
     */
    @JsonSetter("processorsPerNode")
    public void setProcessorsPerNode (int value) { 
        this.processorsPerNode = value;
    }
 
    /** GETTER
     * The number of retires it took to submit this job.
     */
    @JsonGetter("retries")
    public int getRetries ( ) { 
        return this.retries;
    }
    
    /** SETTER
     * The number of retires it took to submit this job.
     */
    @JsonSetter("retries")
    public void setRetries (int value) { 
        this.retries = value;
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
 
    /** GETTER
     * The date the job was submitted in ISO 8601 format.
     */
    @JsonGetter("submitTime")
    public Date getSubmitTime ( ) { 
        return this.submitTime;
    }
    
    /** SETTER
     * The date the job was submitted in ISO 8601 format.
     */
    @JsonSetter("submitTime")
    public void setSubmitTime (Date value) { 
        this.submitTime = value;
    }
 
    /** GETTER
     * The directory on the remote execution system from which the job is running.
     */
    @JsonGetter("workPath")
    public String getWorkPath ( ) { 
        return this.workPath;
    }
    
    /** SETTER
     * The directory on the remote execution system from which the job is running.
     */
    @JsonSetter("workPath")
    public void setWorkPath (String value) { 
        this.workPath = value;
    }
 
}
 