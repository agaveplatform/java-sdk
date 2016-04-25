/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class JobAction 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5480992244843243192L;
    private JobActionTypeEnum action;
    /** GETTER
     * Action to perform on the job.
     */
    @JsonGetter("action")
    public JobActionTypeEnum getAction ( ) { 
        return this.action;
    }
    
    /** SETTER
     * Action to perform on the job.
     */
    @JsonSetter("action")
    public void setAction (JobActionTypeEnum value) { 
        this.action = value;
    }
 
}
 