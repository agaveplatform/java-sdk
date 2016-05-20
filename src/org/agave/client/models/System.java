/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class System 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5496400537776666867L;
    private String description;
    private String environment;
    private String id;
    private boolean isDefault = false;
    private boolean isPublic = false;
    private Date lastModified;
    private String name;
    private int revision = 1;
    private String scratchDir;
    private String site;
    private SystemStatusTypeEnum status;
    private SystemStorageConfig storage;
    private SystemTypeEnum type;
    private String uuid;
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
     * Is the system the default for the authenticated user?
     */
    @JsonGetter("isDefault")
    public boolean getIsDefault ( ) { 
        return this.isDefault;
    }
    
    /** SETTER
     * Is the system the default for the authenticated user?
     */
    @JsonSetter("isDefault")
    public void setIsDefault (boolean value) { 
        this.isDefault = value;
    }
 
    /** GETTER
     * Is the system publicly available?
     */
    @JsonGetter("isPublic")
    public boolean getIsPublic ( ) { 
        return this.isPublic;
    }
    
    /** SETTER
     * Is the system publicly available?
     */
    @JsonSetter("isPublic")
    public void setIsPublic (boolean value) { 
        this.isPublic = value;
    }
 
    /** GETTER
     * The date this system was last modified in ISO 8601 format.
     */
    @JsonGetter("lastModified")
    public Date getLastModified ( ) { 
        return this.lastModified;
    }
    
    /** SETTER
     * The date this system was last modified in ISO 8601 format.
     */
    @JsonSetter("lastModified")
    public void setLastModified (Date value) { 
        this.lastModified = value;
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
     * The number of times this app has been updated.
     */
    @JsonGetter("revision")
    public int getRevision ( ) { 
        return this.revision;
    }
    
    /** SETTER
     * The number of times this app has been updated.
     */
    @JsonSetter("revision")
    private void setRevision (int value) { 
        this.revision = value;
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
     * The status of this system. Systems must be in UP status to be used.
     */
    @JsonGetter("status")
    public SystemStatusTypeEnum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * The status of this system. Systems must be in UP status to be used.
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
     * The uuid of this system.
     */
    @JsonGetter("uuid")
    public String getUuid ( ) { 
        return this.uuid;
    }
    
    /** SETTER
     * The uuid of this system.
     */
    @JsonSetter("uuid")
    private void setUuid (String value) { 
        this.uuid = value;
    }
 
}
 