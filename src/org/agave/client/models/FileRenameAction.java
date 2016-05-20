/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FileRenameAction 
        extends FileAction {
    private static final long serialVersionUID = 5096206482715947489L;
    private FileManagementActionTypeEnum action = FileManagementActionTypeEnum.fromString("RENAME");
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
 