/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FilePermission 
        extends PermissionModel {
    private static final long serialVersionUID = 5449007267110482186L;
    private FilePermissionStanza permission;
    private Boolean recursive = false;
    /** GETTER
     * The permisisons associated with this objectf
     */
    @JsonGetter("permission")
    public FilePermissionStanza getPermission ( ) { 
        return this.permission;
    }
    
    /** SETTER
     * The permisisons associated with this objectf
     */
    @JsonSetter("permission")
    public void setPermission (FilePermissionStanza value) { 
        this.permission = value;
    }
 
    /** GETTER
     * Boolean flag indicating whether the permission applies recursively to the remote file item.
     */
    @JsonGetter("recursive")
    public Boolean getRecursive ( ) { 
        return this.recursive;
    }
    
    /** SETTER
     * Boolean flag indicating whether the permission applies recursively to the remote file item.
     */
    @JsonSetter("recursive")
    public void setRecursive (Boolean value) { 
        this.recursive = value;
    }
 
}
 