/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FileMkdirAction 
        extends FileAction {
    private static final long serialVersionUID = 5647038215247343459L;
    private FileManagementActionTypeEnum action = FileManagementActionTypeEnum.fromString("MKDIR");
    private String path;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("action")
    public FileManagementActionTypeEnum getAction ( ) { 
        return this.action;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("action")
    private void setAction (FileManagementActionTypeEnum value) { 
        this.action = value;
    }
 
    /** GETTER
     * Absolute or relative path of the new directory
     */
    @JsonGetter("path")
    public String getPath ( ) { 
        return this.path;
    }
    
    /** SETTER
     * Absolute or relative path of the new directory
     */
    @JsonSetter("path")
    public void setPath (String value) { 
        this.path = value;
    }
 
}
 