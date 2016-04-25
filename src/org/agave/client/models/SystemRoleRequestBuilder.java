/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class SystemRoleRequestBuilder {
    //the instance to build
    private SystemRoleRequest systemRoleRequest;

    /**
     * Default constructor to initialize the instance
     */
    public SystemRoleRequestBuilder() {
        systemRoleRequest = new SystemRoleRequest();
    }

    /**
     * The role granted this user.
     */
    public SystemRoleRequestBuilder role(SystemRoleTypeEnum role) {
        systemRoleRequest.setRole(role);
        return this;
    }

    /**
     * The username of the api user granted this role.
     */
    public SystemRoleRequestBuilder username(String username) {
        systemRoleRequest.setUsername(username);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SystemRoleRequest build() {
        return systemRoleRequest;
    }
}