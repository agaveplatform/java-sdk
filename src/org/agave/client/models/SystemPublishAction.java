/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemPublishAction 
        extends SystemAction {
    private static final long serialVersionUID = 4730341136586050966L;
    private String action = "PUBLISH";
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("action")
    public String getAction ( ) { 
        return this.action;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("action")
    private void setAction (String value) { 
        this.action = value;
    }
 
}
 