/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationSummary 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4980419988878924965L;
    private String executionSystem;
    private String id;
    private boolean isPublic;
    private Date lastModified;
    private String name;
    private int revision;
    private String shortDescription;
    private String version;
    /** GETTER
     * The system id of the execution system where this app should run.
     */
    @JsonGetter("executionSystem")
    public String getExecutionSystem ( ) { 
        return this.executionSystem;
    }
    
    /** SETTER
     * The system id of the execution system where this app should run.
     */
    @JsonSetter("executionSystem")
    public void setExecutionSystem (String value) { 
        this.executionSystem = value;
    }
 
    /** GETTER
     * Unique id of this app. Comprised of the app name-version.
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * Unique id of this app. Comprised of the app name-version.
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * Whether the application is public or private.
     */
    @JsonGetter("isPublic")
    public boolean getIsPublic ( ) { 
        return this.isPublic;
    }
    
    /** SETTER
     * Whether the application is public or private.
     */
    @JsonSetter("isPublic")
    public void setIsPublic (boolean value) { 
        this.isPublic = value;
    }
 
    /** GETTER
     * The date this application was last modified in ISO 8601 format.
     */
    @JsonGetter("lastModified")
    public Date getLastModified ( ) { 
        return this.lastModified;
    }
    
    /** SETTER
     * The date this application was last modified in ISO 8601 format.
     */
    @JsonSetter("lastModified")
    public void setLastModified (Date value) { 
        this.lastModified = value;
    }
 
    /** GETTER
     * The name of the application. The name does not have to be unique, but the combination of name and version does.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The name of the application. The name does not have to be unique, but the combination of name and version does.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * The number of times this application has been revised.
     */
    @JsonGetter("revision")
    public int getRevision ( ) { 
        return this.revision;
    }
    
    /** SETTER
     * The number of times this application has been revised.
     */
    @JsonSetter("revision")
    public void setRevision (int value) { 
        this.revision = value;
    }
 
    /** GETTER
     * The short description of this application.
     */
    @JsonGetter("shortDescription")
    public String getShortDescription ( ) { 
        return this.shortDescription;
    }
    
    /** SETTER
     * The short description of this application.
     */
    @JsonSetter("shortDescription")
    public void setShortDescription (String value) { 
        this.shortDescription = value;
    }
 
    /** GETTER
     * The version of the application in #.#.# format. While the version does not need to be unique, the combination of name and version does have to be unique.
     */
    @JsonGetter("version")
    public String getVersion ( ) { 
        return this.version;
    }
    
    /** SETTER
     * The version of the application in #.#.# format. While the version does not need to be unique, the combination of name and version does have to be unique.
     */
    @JsonSetter("version")
    public void setVersion (String value) { 
        this.version = value;
    }
 
}
 