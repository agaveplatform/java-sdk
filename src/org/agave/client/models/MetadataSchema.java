/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MetadataSchema 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4654907967656414650L;
    private Date created;
    private String internalUsername;
    private Date lastUpdated;
    private String owner;
    private String schema;
    private String uuid;
    /** GETTER
     * A timestamp indicating when this Metadata was created in the metadata schema store.
     */
    @JsonGetter("created")
    public Date getCreated ( ) { 
        return this.created;
    }
    
    /** SETTER
     * A timestamp indicating when this Metadata was created in the metadata schema store.
     */
    @JsonSetter("created")
    public void setCreated (Date value) { 
        this.created = value;
    }
 
    /** GETTER
     * The name of the Internal User, if any, who owns this schema.
     */
    @JsonGetter("internalUsername")
    public String getInternalUsername ( ) { 
        return this.internalUsername;
    }
    
    /** SETTER
     * The name of the Internal User, if any, who owns this schema.
     */
    @JsonSetter("internalUsername")
    public void setInternalUsername (String value) { 
        this.internalUsername = value;
    }
 
    /** GETTER
     * A timestamp indicating when this Metadata was last updated in the metadata schema store.
     */
    @JsonGetter("lastUpdated")
    public Date getLastUpdated ( ) { 
        return this.lastUpdated;
    }
    
    /** SETTER
     * A timestamp indicating when this Metadata was last updated in the metadata schema store.
     */
    @JsonSetter("lastUpdated")
    public void setLastUpdated (Date value) { 
        this.lastUpdated = value;
    }
 
    /** GETTER
     * The API user who owns this Schema.
     */
    @JsonGetter("owner")
    public String getOwner ( ) { 
        return this.owner;
    }
    
    /** SETTER
     * The API user who owns this Schema.
     */
    @JsonSetter("owner")
    public void setOwner (String value) { 
        this.owner = value;
    }
 
    /** GETTER
     * A JSON Schema
     */
    @JsonGetter("schema")
    public String getSchema ( ) { 
        return this.schema;
    }
    
    /** SETTER
     * A JSON Schema
     */
    @JsonSetter("schema")
    public void setSchema (String value) { 
        this.schema = value;
    }
 
    /** GETTER
     * The UUID for this Schema.
     */
    @JsonGetter("uuid")
    public String getUuid ( ) { 
        return this.uuid;
    }
    
    /** SETTER
     * The UUID for this Schema.
     */
    @JsonSetter("uuid")
    public void setUuid (String value) { 
        this.uuid = value;
    }
 
}
 