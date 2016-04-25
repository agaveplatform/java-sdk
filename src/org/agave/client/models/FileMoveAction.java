/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FileMoveAction 
        extends FileAction {
    private static final long serialVersionUID = 5635824309727037822L;
    private FileManagementActionTypeEnum action = FileManagementActionTypeEnum.fromString("MOVE");
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
     * The relative or absolute path of the renamed file/folder. 
     */
    @JsonGetter("path")
    public String getPath ( ) { 
        return this.path;
    }
    
    /** SETTER
     * The relative or absolute path of the renamed file/folder. 
     */
    @JsonSetter("path")
    public void setPath (String value) { 
        this.path = value;
    }
 
}
 