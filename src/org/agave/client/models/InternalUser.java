/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class InternalUser 
        extends Profile {
    private static final long serialVersionUID = 5101256874325135082L;
    private Date created;
    private Date lastUpdated;
    private String parent;
    /** GETTER
     * The date the internal user was created
     */
    @JsonGetter("created")
    public Date getCreated ( ) { 
        return this.created;
    }
    
    /** SETTER
     * The date the internal user was created
     */
    @JsonSetter("created")
    public void setCreated (Date value) { 
        this.created = value;
    }
 
    /** GETTER
     * The date the internal user was last updated
     */
    @JsonGetter("lastUpdated ")
    public Date getLastUpdated ( ) { 
        return this.lastUpdated;
    }
    
    /** SETTER
     * The date the internal user was last updated
     */
    @JsonSetter("lastUpdated ")
    public void setLastUpdated (Date value) { 
        this.lastUpdated = value;
    }
 
    /** GETTER
     * The uuid of the parent to which this internal user account belongs
     */
    @JsonGetter("parent")
    public String getParent ( ) { 
        return this.parent;
    }
    
    /** SETTER
     * The uuid of the parent to which this internal user account belongs
     */
    @JsonSetter("parent")
    public void setParent (String value) { 
        this.parent = value;
    }
 
}
 