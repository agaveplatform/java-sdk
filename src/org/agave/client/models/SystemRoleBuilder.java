/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class SystemRoleBuilder {
    //the instance to build
    private SystemRole systemRole;

    /**
     * Default constructor to initialize the instance
     */
    public SystemRoleBuilder() {
        systemRole = new SystemRole();
    }

    /**
     * The date the role was first granted
     */
    public SystemRoleBuilder created(Date created) {
        systemRole.setCreated(created);
        return this;
    }

    /**
     * The unique id of this role grant
     */
    public SystemRoleBuilder id(String id) {
        systemRole.setId(id);
        return this;
    }

    /**
     * The date the role was last updated.
     */
    public SystemRoleBuilder lastUpdated(Date lastUpdated) {
        systemRole.setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * The role granted to the suer
     */
    public SystemRoleBuilder role(SystemRoleTypeEnum role) {
        systemRole.setRole(role);
        return this;
    }

    /**
     * The username to whom the role applies.
     */
    public SystemRoleBuilder username(String username) {
        systemRole.setUsername(username);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SystemRole build() {
        return systemRole;
    }
}