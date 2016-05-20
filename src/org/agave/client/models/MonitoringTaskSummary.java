/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MonitoringTaskSummary 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5418409639415500230L;
    private boolean active = true;
    private int frequency;
    private String id;
    private String internalUsername;
    private String target;
    private boolean updateSystemStatus = false;
    /** GETTER
     * Whether this monitor is currently active.
     */
    @JsonGetter("active")
    public boolean getActive ( ) { 
        return this.active;
    }
    
    /** SETTER
     * Whether this monitor is currently active.
     */
    @JsonSetter("active")
    public void setActive (boolean value) { 
        this.active = value;
    }
 
    /** GETTER
     * The interval in minutes on which this monitor will run. Minimum is 5. Default is 720.
     */
    @JsonGetter("frequency")
    public int getFrequency ( ) { 
        return this.frequency;
    }
    
    /** SETTER
     * The interval in minutes on which this monitor will run. Minimum is 5. Default is 720.
     */
    @JsonSetter("frequency")
    public void setFrequency (int value) { 
        this.frequency = value;
    }
 
    /** GETTER
     * The unique id of the monitor
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The unique id of the monitor
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * Internal user account used to perform the check.
     */
    @JsonGetter("internalUsername")
    public String getInternalUsername ( ) { 
        return this.internalUsername;
    }
    
    /** SETTER
     * Internal user account used to perform the check.
     */
    @JsonSetter("internalUsername")
    public void setInternalUsername (String value) { 
        this.internalUsername = value;
    }
 
    /** GETTER
     * The id of the sytem to be monitored. This must be an active system registered with the Systems service.
     */
    @JsonGetter("target")
    public String getTarget ( ) { 
        return this.target;
    }
    
    /** SETTER
     * The id of the sytem to be monitored. This must be an active system registered with the Systems service.
     */
    @JsonSetter("target")
    public void setTarget (String value) { 
        this.target = value;
    }
 
    /** GETTER
     * Whether this Monitor should update the system status when the results change. You must have the ADMIN role on the target system to use this feature.
     */
    @JsonGetter("updateSystemStatus")
    public boolean getUpdateSystemStatus ( ) { 
        return this.updateSystemStatus;
    }
    
    /** SETTER
     * Whether this Monitor should update the system status when the results change. You must have the ADMIN role on the target system to use this feature.
     */
    @JsonSetter("updateSystemStatus")
    public void setUpdateSystemStatus (boolean value) { 
        this.updateSystemStatus = value;
    }
 
}
 