/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PermissionRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5160209410689973281L;
    private PermissionTypeEnum permission;
    private String username;
    /** GETTER
     * The permission to set
     */
    @JsonGetter("permission")
    public PermissionTypeEnum getPermission ( ) { 
        return this.permission;
    }
    
    /** SETTER
     * The permission to set
     */
    @JsonSetter("permission")
    public void setPermission (PermissionTypeEnum value) { 
        this.permission = value;
    }
 
    /** GETTER
     * The name of the user for this permission object.
     */
    @JsonGetter("username")
    public String getUsername ( ) { 
        return this.username;
    }
    
    /** SETTER
     * The name of the user for this permission object.
     */
    @JsonSetter("username")
    public void setUsername (String value) { 
        this.username = value;
    }
 
}
 