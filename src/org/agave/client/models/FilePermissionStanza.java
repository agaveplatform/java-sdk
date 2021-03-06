/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FilePermissionStanza 
        extends PermissionStanza {
    private static final long serialVersionUID = 5573714321167111151L;
    private boolean execute = false;
    /** GETTER
     * Is the resource executable
     */
    @JsonGetter("execute")
    public boolean getExecute ( ) { 
        return this.execute;
    }
    
    /** SETTER
     * Is the resource executable
     */
    @JsonSetter("execute")
    public void setExecute (boolean value) { 
        this.execute = value;
    }
 
}
 