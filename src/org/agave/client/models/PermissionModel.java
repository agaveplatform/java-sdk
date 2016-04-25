/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PermissionModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5346821918560746184L;
    private Date created;
    private String id;
    private String internalUsername;
    private Date lastUpdated;
    private PermissionStanza permission;
    private String username;
    /** GETTER
     * The date the permission was created
     */
    @JsonGetter("created")
    public Date getCreated ( ) { 
        return this.created;
    }
    
    /** SETTER
     * The date the permission was created
     */
    @JsonSetter("created")
    public void setCreated (Date value) { 
        this.created = value;
    }
 
    /** GETTER
     * The unique id of this permission
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The unique id of this permission
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * The internal user associated with this permission
     */
    @JsonGetter("internalUsername")
    public String getInternalUsername ( ) { 
        return this.internalUsername;
    }
    
    /** SETTER
     * The internal user associated with this permission
     */
    @JsonSetter("internalUsername")
    public void setInternalUsername (String value) { 
        this.internalUsername = value;
    }
 
    /** GETTER
     * The date the permission was last updated
     */
    @JsonGetter("lastUpdated ")
    public Date getLastUpdated ( ) { 
        return this.lastUpdated;
    }
    
    /** SETTER
     * The date the permission was last updated
     */
    @JsonSetter("lastUpdated ")
    public void setLastUpdated (Date value) { 
        this.lastUpdated = value;
    }
 
    /** GETTER
     * The permissions granted to the user
     */
    @JsonGetter("permission")
    public PermissionStanza getPermission ( ) { 
        return this.permission;
    }
    
    /** SETTER
     * The permissions granted to the user
     */
    @JsonSetter("permission")
    public void setPermission (PermissionStanza value) { 
        this.permission = value;
    }
 
    /** GETTER
     * The username to whom this permission grant applies
     */
    @JsonGetter("username")
    public String getUsername ( ) { 
        return this.username;
    }
    
    /** SETTER
     * The username to whom this permission grant applies
     */
    @JsonSetter("username")
    public void setUsername (String value) { 
        this.username = value;
    }
 
}
 