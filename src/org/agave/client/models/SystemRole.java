/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemRole 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4677205468446104235L;
    private Date created;
    private String id;
    private Date lastUpdated;
    private SystemRoleTypeEnum role;
    private String username;
    /** GETTER
     * The date the role was first granted
     */
    @JsonGetter("created")
    public Date getCreated ( ) { 
        return this.created;
    }
    
    /** SETTER
     * The date the role was first granted
     */
    @JsonSetter("created")
    public void setCreated (Date value) { 
        this.created = value;
    }
 
    /** GETTER
     * The unique id of this role grant
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The unique id of this role grant
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * The date the role was last updated.
     */
    @JsonGetter("lastUpdated")
    public Date getLastUpdated ( ) { 
        return this.lastUpdated;
    }
    
    /** SETTER
     * The date the role was last updated.
     */
    @JsonSetter("lastUpdated")
    public void setLastUpdated (Date value) { 
        this.lastUpdated = value;
    }
 
    /** GETTER
     * The role granted to the suer
     */
    @JsonGetter("role")
    public SystemRoleTypeEnum getRole ( ) { 
        return this.role;
    }
    
    /** SETTER
     * The role granted to the suer
     */
    @JsonSetter("role")
    public void setRole (SystemRoleTypeEnum value) { 
        this.role = value;
    }
 
    /** GETTER
     * The username to whom the role applies.
     */
    @JsonGetter("username")
    public String getUsername ( ) { 
        return this.username;
    }
    
    /** SETTER
     * The username to whom the role applies.
     */
    @JsonSetter("username")
    public void setUsername (String value) { 
        this.username = value;
    }
 
}
 