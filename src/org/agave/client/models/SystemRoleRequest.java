/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemRoleRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4759625903965797011L;
    private SystemRoleTypeEnum role;
    private String username;
    /** GETTER
     * The role granted this user.
     */
    @JsonGetter("role")
    public SystemRoleTypeEnum getRole ( ) { 
        return this.role;
    }
    
    /** SETTER
     * The role granted this user.
     */
    @JsonSetter("role")
    public void setRole (SystemRoleTypeEnum value) { 
        this.role = value;
    }
 
    /** GETTER
     * The username of the api user granted this role.
     */
    @JsonGetter("username")
    public String getUsername ( ) { 
        return this.username;
    }
    
    /** SETTER
     * The username of the api user granted this role.
     */
    @JsonSetter("username")
    public void setUsername (String value) { 
        this.username = value;
    }
 
}
 