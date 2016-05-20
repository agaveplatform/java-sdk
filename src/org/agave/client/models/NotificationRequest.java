/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class NotificationRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4619116371461666488L;
    private String associatedUuid;
    private boolean persistent;
    private String url;
    /** GETTER
     * UUID of resource to whome the event applies.
     */
    @JsonGetter("associatedUuid")
    public String getAssociatedUuid ( ) { 
        return this.associatedUuid;
    }
    
    /** SETTER
     * UUID of resource to whome the event applies.
     */
    @JsonSetter("associatedUuid")
    public void setAssociatedUuid (String value) { 
        this.associatedUuid = value;
    }
 
    /** GETTER
     * Whether this notification should stay active after it fires the first time.
     */
    @JsonGetter("persistent")
    public boolean getPersistent ( ) { 
        return this.persistent;
    }
    
    /** SETTER
     * Whether this notification should stay active after it fires the first time.
     */
    @JsonSetter("persistent")
    public void setPersistent (boolean value) { 
        this.persistent = value;
    }
 
    /** GETTER
     * The url or email address that will be notified of the event.
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * The url or email address that will be notified of the event.
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
}
 