/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class JobSubmission 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5143094728896317030L;
    private String appId;
    private boolean archive;
    private String archivePath;
    private String archiveSystem;
    private String batchQueue;
    private LinkedHashMap<String, String> inputs;
    private String maxMemory;
    private String maxRunTime;
    private String name;
    private int nodeCount;
    private List<Notification> notifications;
    private LinkedHashMap<String, Object> parameters;
    private int processorsPerNode;
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
     * The path of the archive folder for this job on the archiveSystem. Defaults to the user's default storage system.
     */
    @JsonGetter("archivePath")
    public String getArchivePath ( ) { 
        return this.archivePath;
    }
    
    /** SETTER
     * The path of the archive folder for this job on the archiveSystem. Defaults to the user's default storage system.
     */
    @JsonSetter("archivePath")
    public void setArchivePath (String value) { 
        this.archivePath = value;
    }
 
    /** GETTER
     * The system on which the job data will be archived
     */
    @JsonGetter("archiveSystem")
    public String getArchiveSystem ( ) { 
        return this.archiveSystem;
    }
    
    /** SETTER
     * The system on which the job data will be archived
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
     * The application specific input files needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. Inputs may be given as relative paths in the user's default storage system or as URI. If a URI is given, the data will be staged in by the IO service and made avaialble to the application at run time.
     */
    @JsonGetter("inputs")
    public LinkedHashMap<String, String> getInputs ( ) { 
        return this.inputs;
    }
    
    /** SETTER
     * The application specific input files needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. Inputs may be given as relative paths in the user's default storage system or as URI. If a URI is given, the data will be staged in by the IO service and made avaialble to the application at run time.
     */
    @JsonSetter("inputs")
    public void setInputs (LinkedHashMap<String, String> value) { 
        this.inputs = value;
    }
 
    /** GETTER
     * The maximum amount of memory needed for this application to run given in GB.
     */
    @JsonGetter("maxMemory")
    public String getMaxMemory ( ) { 
        return this.maxMemory;
    }
    
    /** SETTER
     * The maximum amount of memory needed for this application to run given in GB.
     */
    @JsonSetter("maxMemory")
    public void setMaxMemory (String value) { 
        this.maxMemory = value;
    }
 
    /** GETTER
     * The estimated compute time needed for this application to complete given in hh:mm:ss format.
     */
    @JsonGetter("maxRunTime")
    public String getMaxRunTime ( ) { 
        return this.maxRunTime;
    }
    
    /** SETTER
     * The estimated compute time needed for this application to complete given in hh:mm:ss format.
     */
    @JsonSetter("maxRunTime")
    public void setMaxRunTime (String value) { 
        this.maxRunTime = value;
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
     * The number of nodes this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.
     */
    @JsonGetter("nodeCount")
    public int getNodeCount ( ) { 
        return this.nodeCount;
    }
    
    /** SETTER
     * The number of nodes this application should utilize while running. If the application is not of executionType PARALLEL, this should be 1.
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
     * The application specific parameters needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. The actual dataType will be determined by the application description.
     */
    @JsonGetter("parameters")
    public LinkedHashMap<String, Object> getParameters ( ) { 
        return this.parameters;
    }
    
    /** SETTER
     * The application specific parameters needed for this job. These vary from application to application and should be entered as multiple individual parameters in the form. The actual dataType will be determined by the application description.
     */
    @JsonSetter("parameters")
    public void setParameters (LinkedHashMap<String, Object> value) { 
        this.parameters = value;
    }
 
    /** GETTER
     * The number of processors this application should utilize while running.
     */
    @JsonGetter("processorsPerNode")
    public int getProcessorsPerNode ( ) { 
        return this.processorsPerNode;
    }
    
    /** SETTER
     * The number of processors this application should utilize while running.
     */
    @JsonSetter("processorsPerNode")
    public void setProcessorsPerNode (int value) { 
        this.processorsPerNode = value;
    }
 
}
 