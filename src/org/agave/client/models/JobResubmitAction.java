/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class JobResubmitAction 
        extends JobAction {
    private static final long serialVersionUID = 4675676340859809866L;
    private JobActionTypeEnum action = JobActionTypeEnum.fromString("RESUBMIT");
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("action")
    public JobActionTypeEnum getAction ( ) { 
        return this.action;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("action")
    private void setAction (JobActionTypeEnum value) { 
        this.action = value;
    }
 
}
 