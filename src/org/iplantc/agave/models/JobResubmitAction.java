/*
 * AgavePlatformScienceAPILib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 10/07/2015
 */
package org.iplantc.agave.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class JobResubmitAction 
        extends JobAction {
    private static final long serialVersionUID = 4959150767847625825L;
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
 