/*
 * AgavePlatformScienceAPILib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 10/07/2015
 */
package org.iplantc.agave.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemPublishAction 
        extends SystemAction {
    private static final long serialVersionUID = 5606088680251407980L;
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
 