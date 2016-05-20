/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationArgumentDataSemantics 
        extends ApplicationArgumentSemantics {
    private static final long serialVersionUID = 4783233888302267504L;
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
 