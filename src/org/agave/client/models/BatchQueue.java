/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BatchQueue 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5259806111428212220L;
    private String customDirectives;
    private boolean isDefault;
    private int maxJobs;
    private String maxMemoryPerNode;
    private String maxNodes;
    private int maxProcessorsPerNode;
    private String maxRequestedTime;
    private int maxUserJobs;
    private String name;
    /** GETTER
     * Any custom directives that should be appended to scheduler directives. ex. #$ -A TG-12345
     */
    @JsonGetter("customDirectives")
    public String getCustomDirectives ( ) { 
        return this.customDirectives;
    }
    
    /** SETTER
     * Any custom directives that should be appended to scheduler directives. ex. #$ -A TG-12345
     */
    @JsonSetter("customDirectives")
    public void setCustomDirectives (String value) { 
        this.customDirectives = value;
    }
 
    /** GETTER
     * Is this the default queue for the system.
     */
    @JsonGetter("isDefault")
    public boolean getIsDefault ( ) { 
        return this.isDefault;
    }
    
    /** SETTER
     * Is this the default queue for the system.
     */
    @JsonSetter("isDefault")
    public void setIsDefault (boolean value) { 
        this.isDefault = value;
    }
 
    /** GETTER
     * The maximum number of jobs that can be in queue at once.
     */
    @JsonGetter("maxJobs")
    public int getMaxJobs ( ) { 
        return this.maxJobs;
    }
    
    /** SETTER
     * The maximum number of jobs that can be in queue at once.
     */
    @JsonSetter("maxJobs")
    public void setMaxJobs (int value) { 
        this.maxJobs = value;
    }
 
    /** GETTER
     * The max memory available per node to jobs submitted to this queue.
     */
    @JsonGetter("maxMemoryPerNode")
    public String getMaxMemoryPerNode ( ) { 
        return this.maxMemoryPerNode;
    }
    
    /** SETTER
     * The max memory available per node to jobs submitted to this queue.
     */
    @JsonSetter("maxMemoryPerNode")
    public void setMaxMemoryPerNode (String value) { 
        this.maxMemoryPerNode = value;
    }
 
    /** GETTER
     * The max nodes available per node to jobs submitted to this queue.
     */
    @JsonGetter("maxNodes")
    public String getMaxNodes ( ) { 
        return this.maxNodes;
    }
    
    /** SETTER
     * The max nodes available per node to jobs submitted to this queue.
     */
    @JsonSetter("maxNodes")
    public void setMaxNodes (String value) { 
        this.maxNodes = value;
    }
 
    /** GETTER
     * The max processors per node available to jobs submitted to this queue.
     */
    @JsonGetter("maxProcessorsPerNode")
    public int getMaxProcessorsPerNode ( ) { 
        return this.maxProcessorsPerNode;
    }
    
    /** SETTER
     * The max processors per node available to jobs submitted to this queue.
     */
    @JsonSetter("maxProcessorsPerNode")
    public void setMaxProcessorsPerNode (int value) { 
        this.maxProcessorsPerNode = value;
    }
 
    /** GETTER
     * The max length of jobs submitted to this queue in hhh:mm:ss format.
     */
    @JsonGetter("maxRequestedTime")
    public String getMaxRequestedTime ( ) { 
        return this.maxRequestedTime;
    }
    
    /** SETTER
     * The max length of jobs submitted to this queue in hhh:mm:ss format.
     */
    @JsonSetter("maxRequestedTime")
    public void setMaxRequestedTime (String value) { 
        this.maxRequestedTime = value;
    }
 
    /** GETTER
     * The maximum number of jobs per user that can be in queue at once.
     */
    @JsonGetter("maxUserJobs")
    public int getMaxUserJobs ( ) { 
        return this.maxUserJobs;
    }
    
    /** SETTER
     * The maximum number of jobs per user that can be in queue at once.
     */
    @JsonSetter("maxUserJobs")
    public void setMaxUserJobs (int value) { 
        this.maxUserJobs = value;
    }
 
    /** GETTER
     * The name of the batch queue.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The name of the batch queue.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
}
 