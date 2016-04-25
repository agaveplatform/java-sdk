/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemCloneAction 
        extends SystemAction {
    private static final long serialVersionUID = 5199481900724327484L;
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
 