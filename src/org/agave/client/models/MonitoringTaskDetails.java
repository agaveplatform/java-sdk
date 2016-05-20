/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MonitoringTaskDetails 
        extends MonitoringTaskSummary {
    private static final long serialVersionUID = 5589561672173335895L;
    private String id;
    private MonitoringTaskCheck lastCheck;
    private Date lastSuccess;
    private Date lastUpdated;
    private Date nextUpdate;
    private String owner;
    /** GETTER
     * The unique id of the monitoring task
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The unique id of the monitoring task
     */
    @JsonSetter("id")
    private void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * A summary of the result of the last check run for this monitoring task
     */
    @JsonGetter("lastCheck")
    public MonitoringTaskCheck getLastCheck ( ) { 
        return this.lastCheck;
    }
    
    /** SETTER
     * A summary of the result of the last check run for this monitoring task
     */
    @JsonSetter("lastCheck")
    private void setLastCheck (MonitoringTaskCheck value) { 
        this.lastCheck = value;
    }
 
    /** GETTER
     * The last time the monitoring task had a successful check
     */
    @JsonGetter("lastSuccess")
    public Date getLastSuccess ( ) { 
        return this.lastSuccess;
    }
    
    /** SETTER
     * The last time the monitoring task had a successful check
     */
    @JsonSetter("lastSuccess")
    private void setLastSuccess (Date value) { 
        this.lastSuccess = value;
    }
 
    /** GETTER
     * The last time the monitor was updated
     */
    @JsonGetter("lastUpdated")
    public Date getLastUpdated ( ) { 
        return this.lastUpdated;
    }
    
    /** SETTER
     * The last time the monitor was updated
     */
    @JsonSetter("lastUpdated")
    private void setLastUpdated (Date value) { 
        this.lastUpdated = value;
    }
 
    /** GETTER
     * The next time the check will run
     */
    @JsonGetter("nextUpdate")
    public Date getNextUpdate ( ) { 
        return this.nextUpdate;
    }
    
    /** SETTER
     * The next time the check will run
     */
    @JsonSetter("nextUpdate")
    private void setNextUpdate (Date value) { 
        this.nextUpdate = value;
    }
 
    /** GETTER
     * The user who created the monitoring task
     */
    @JsonGetter("owner")
    public String getOwner ( ) { 
        return this.owner;
    }
    
    /** SETTER
     * The user who created the monitoring task
     */
    @JsonSetter("owner")
    private void setOwner (String value) { 
        this.owner = value;
    }
 
}
 