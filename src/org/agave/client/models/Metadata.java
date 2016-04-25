/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Metadata 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5105728929068411571L;
    private List<String> associationIds;
    private Date created;
    private String internalUsername;
    private Date lastUpdated;
    private String name;
    private String owner;
    private String uuid;
    private String value;
    /** GETTER
     * UUIDs of associated Agave entities, including the Data to which this Metadata belongs.
     */
    @JsonGetter("associationIds")
    public List<String> getAssociationIds ( ) { 
        return this.associationIds;
    }
    
    /** SETTER
     * UUIDs of associated Agave entities, including the Data to which this Metadata belongs.
     */
    @JsonSetter("associationIds")
    public void setAssociationIds (List<String> value) { 
        this.associationIds = value;
    }
 
    /** GETTER
     * A timestamp indicating when this Metadata was created in the metadata store.
     */
    @JsonGetter("created")
    public Date getCreated ( ) { 
        return this.created;
    }
    
    /** SETTER
     * A timestamp indicating when this Metadata was created in the metadata store.
     */
    @JsonSetter("created")
    public void setCreated (Date value) { 
        this.created = value;
    }
 
    /** GETTER
     * The name of the Internal User, if any, who owns this metadata.
     */
    @JsonGetter("internalUsername")
    public String getInternalUsername ( ) { 
        return this.internalUsername;
    }
    
    /** SETTER
     * The name of the Internal User, if any, who owns this metadata.
     */
    @JsonSetter("internalUsername")
    public void setInternalUsername (String value) { 
        this.internalUsername = value;
    }
 
    /** GETTER
     * A timestamp indicating when this Metadata was last updated in the metadata store.
     */
    @JsonGetter("lastUpdated")
    public Date getLastUpdated ( ) { 
        return this.lastUpdated;
    }
    
    /** SETTER
     * A timestamp indicating when this Metadata was last updated in the metadata store.
     */
    @JsonSetter("lastUpdated")
    public void setLastUpdated (Date value) { 
        this.lastUpdated = value;
    }
 
    /** GETTER
     * The name of this metadata
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The name of this metadata
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * The API user who owns this Metadata.
     */
    @JsonGetter("owner")
    public String getOwner ( ) { 
        return this.owner;
    }
    
    /** SETTER
     * The API user who owns this Metadata.
     */
    @JsonSetter("owner")
    public void setOwner (String value) { 
        this.owner = value;
    }
 
    /** GETTER
     * The UUID for this Metadata.
     */
    @JsonGetter("uuid")
    public String getUuid ( ) { 
        return this.uuid;
    }
    
    /** SETTER
     * The UUID for this Metadata.
     */
    @JsonSetter("uuid")
    public void setUuid (String value) { 
        this.uuid = value;
    }
 
    /** GETTER
     * A free text or JSON string containing the metadata stored for the given associationIds
     */
    @JsonGetter("value")
    public String getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * A free text or JSON string containing the metadata stored for the given associationIds
     */
    @JsonSetter("value")
    public void setValue (String value) { 
        this.value = value;
    }
 
}
 