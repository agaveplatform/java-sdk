/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FileCopyAction 
        extends FileAction {
    private static final long serialVersionUID = 5166967662311726017L;
    private FileManagementActionTypeEnum action = FileManagementActionTypeEnum.fromString("COPY");
    private boolean append = false;
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
     * True if the contents of the source file should be appended to the end of file given in the URL.
     */
    @JsonGetter("append")
    public boolean getAppend ( ) { 
        return this.append;
    }
    
    /** SETTER
     * True if the contents of the source file should be appended to the end of file given in the URL.
     */
    @JsonSetter("append")
    public void setAppend (boolean value) { 
        this.append = value;
    }
 
    /** GETTER
     * New name of the file or folder specified in the URL. 
     */
    @JsonGetter("path")
    public String getPath ( ) { 
        return this.path;
    }
    
    /** SETTER
     * New name of the file or folder specified in the URL. 
     */
    @JsonSetter("path")
    public void setPath (String value) { 
        this.path = value;
    }
 
}
 