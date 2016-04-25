/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class JobHistory 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5038859812535201544L;
    private Date created;
    private String description;
    private String status;
    /** GETTER
     * The date of the event.
     */
    @JsonGetter("created")
    public Date getCreated ( ) { 
        return this.created;
    }
    
    /** SETTER
     * The date of the event.
     */
    @JsonSetter("created")
    public void setCreated (Date value) { 
        this.created = value;
    }
 
    /** GETTER
     * A brief description of the event details.
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * A brief description of the event details.
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * The status of the job after this event.
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * The status of the job after this event.
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
}
 