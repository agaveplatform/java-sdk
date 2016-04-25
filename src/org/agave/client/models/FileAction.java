/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FileAction 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5738581570762806076L;
    private FileManagementActionTypeEnum action;
    private String path;
    /** GETTER
     * Action to perform on the file or folder.
     */
    @JsonGetter("action")
    public FileManagementActionTypeEnum getAction ( ) { 
        return this.action;
    }
    
    /** SETTER
     * Action to perform on the file or folder.
     */
    @JsonSetter("action")
    public void setAction (FileManagementActionTypeEnum value) { 
        this.action = value;
    }
 
    /** GETTER
     * Name of new directory or target file or folder.
     */
    @JsonGetter("path")
    public String getPath ( ) { 
        return this.path;
    }
    
    /** SETTER
     * Name of new directory or target file or folder.
     */
    @JsonSetter("path")
    public void setPath (String value) { 
        this.path = value;
    }
 
}
 