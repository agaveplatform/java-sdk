/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemCloneAction 
        extends SystemAction {
    private static final long serialVersionUID = 5075104868163829436L;
    private String id;
    /** GETTER
     * Unique name for new system
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * Unique name for new system
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
}
 