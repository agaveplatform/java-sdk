/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FilePermissionRequest 
        extends PermissionRequest {
    private static final long serialVersionUID = 5324096799046604784L;
    private boolean recursive;
    /** GETTER
     * Should updated permissions be applied recursively. Defaults to false.
     */
    @JsonGetter("recursive")
    public boolean getRecursive ( ) { 
        return this.recursive;
    }
    
    /** SETTER
     * Should updated permissions be applied recursively. Defaults to false.
     */
    @JsonSetter("recursive")
    public void setRecursive (boolean value) { 
        this.recursive = value;
    }
 
}
 