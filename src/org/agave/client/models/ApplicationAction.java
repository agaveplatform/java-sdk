/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationAction 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5427525236822083399L;
    private ApplicationActionTypeEnum action;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("action")
    public ApplicationActionTypeEnum getAction ( ) { 
        return this.action;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("action")
    public void setAction (ApplicationActionTypeEnum value) { 
        this.action = value;
    }
 
}
 