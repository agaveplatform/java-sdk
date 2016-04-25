/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Notification 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5046893483162910531L;
    private String event;
    private boolean persistent;
    private int url;
    /** GETTER
     * The event you wish to recieve a notification about. Specify * for all events.
     */
    @JsonGetter("event")
    public String getEvent ( ) { 
        return this.event;
    }
    
    /** SETTER
     * The event you wish to recieve a notification about. Specify * for all events.
     */
    @JsonSetter("event")
    public void setEvent (String value) { 
        this.event = value;
    }
 
    /** GETTER
     * Whether this event should remain active after it triggers the first time.
     */
    @JsonGetter("persistent")
    public boolean getPersistent ( ) { 
        return this.persistent;
    }
    
    /** SETTER
     * Whether this event should remain active after it triggers the first time.
     */
    @JsonSetter("persistent")
    public void setPersistent (boolean value) { 
        this.persistent = value;
    }
 
    /** GETTER
     * The URI to notify when the import is complete. This can be an email address or URL. If a URL is given, a POST will be made to this address. URL templating is supported. Valid template values are: ${JOB_STATUS}, ${JOB_URL}, ${JOB_ID}, ${JOB_SYSTEM}, ${JOB_NAME}, ${JOB_START_TIME}, ${JOB_END_TIME}, ${JOB_SUBMIT_TIME}, ${JOB_ARCHIVE_PATH}, ${JOB_ARCHIVE_URL}, ${JOB_ERROR}
     */
    @JsonGetter("url")
    public int getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * The URI to notify when the import is complete. This can be an email address or URL. If a URL is given, a POST will be made to this address. URL templating is supported. Valid template values are: ${JOB_STATUS}, ${JOB_URL}, ${JOB_ID}, ${JOB_SYSTEM}, ${JOB_NAME}, ${JOB_START_TIME}, ${JOB_END_TIME}, ${JOB_SUBMIT_TIME}, ${JOB_ARCHIVE_PATH}, ${JOB_ARCHIVE_URL}, ${JOB_ERROR}
     */
    @JsonSetter("url")
    public void setUrl (int value) { 
        this.url = value;
    }
 
}
 