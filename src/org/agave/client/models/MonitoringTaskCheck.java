/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MonitoringTaskCheck 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5656324378886979926L;
    private Date created;
    private String id;
    private String message;
    private MonitorCheckResultTypeEnum result;
    /** GETTER
     * A timestamp indicating when this monitor check was created.
     */
    @JsonGetter("created")
    public Date getCreated ( ) { 
        return this.created;
    }
    
    /** SETTER
     * A timestamp indicating when this monitor check was created.
     */
    @JsonSetter("created")
    public void setCreated (Date value) { 
        this.created = value;
    }
 
    /** GETTER
     * The UUID for this monitor check.
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The UUID for this monitor check.
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * The error message if this monitor check failed.
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * The error message if this monitor check failed.
     */
    @JsonSetter("message")
    public void setMessage (String value) { 
        this.message = value;
    }
 
    /** GETTER
     * The results of this monitor check.
     */
    @JsonGetter("result")
    public MonitorCheckResultTypeEnum getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * The results of this monitor check.
     */
    @JsonSetter("result")
    public void setResult (MonitorCheckResultTypeEnum value) { 
        this.result = value;
    }
 
}
 