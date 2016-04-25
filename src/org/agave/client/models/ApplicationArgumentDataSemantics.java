/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationArgumentDataSemantics 
        extends ApplicationArgumentSemantics {
    private static final long serialVersionUID = 4903740834353430657L;
    private List<String> fileTypes;
    /** GETTER
     * The file types acceptable for this input.
     */
    @JsonGetter("fileTypes")
    public List<String> getFileTypes ( ) { 
        return this.fileTypes;
    }
    
    /** SETTER
     * The file types acceptable for this input.
     */
    @JsonSetter("fileTypes")
    public void setFileTypes (List<String> value) { 
        this.fileTypes = value;
    }
 
}
 