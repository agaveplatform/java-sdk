/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemSummary 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4645303440802540555L;
    private String description;
    private String id;
    private boolean isDefault;
    private boolean isPublic;
    private String name;
    private SystemStatusTypeEnum status;
    private SystemTypeEnum type;
    /** GETTER
     * Verbose description of this system.
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Verbose description of this system.
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Unique identifier for this system.
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * Unique identifier for this system.
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * Is the system the default for the authenticated user?
     */
    @JsonGetter("isDefault")
    public boolean getIsDefault ( ) { 
        return this.isDefault;
    }
    
    /** SETTER
     * Is the system the default for the authenticated user?
     */
    @JsonSetter("isDefault")
    public void setIsDefault (boolean value) { 
        this.isDefault = value;
    }
 
    /** GETTER
     * Is the system publicly available?
     */
    @JsonGetter("isPublic")
    public boolean getIsPublic ( ) { 
        return this.isPublic;
    }
    
    /** SETTER
     * Is the system publicly available?
     */
    @JsonSetter("isPublic")
    public void setIsPublic (boolean value) { 
        this.isPublic = value;
    }
 
    /** GETTER
     * Common name for this system.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Common name for this system.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * The status of this system. Systems must be in UP status to be used.
     */
    @JsonGetter("status")
    public SystemStatusTypeEnum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * The status of this system. Systems must be in UP status to be used.
     */
    @JsonSetter("status")
    public void setStatus (SystemStatusTypeEnum value) { 
        this.status = value;
    }
 
    /** GETTER
     * The type of this system.
     */
    @JsonGetter("type")
    public SystemTypeEnum getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The type of this system.
     */
    @JsonSetter("type")
    public void setType (SystemTypeEnum value) { 
        this.type = value;
    }
 
}
 