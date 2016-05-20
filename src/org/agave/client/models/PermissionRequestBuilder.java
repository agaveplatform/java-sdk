/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class PermissionRequestBuilder {
    //the instance to build
    private PermissionRequest permissionRequest;

    /**
     * Default constructor to initialize the instance
     */
    public PermissionRequestBuilder() {
        permissionRequest = new PermissionRequest();
    }

    /**
     * The permission to set
     */
    public PermissionRequestBuilder permission(PermissionTypeEnum permission) {
        permissionRequest.setPermission(permission);
        return this;
    }

    /**
     * The name of the user for this permission object.
     */
    public PermissionRequestBuilder username(String username) {
        permissionRequest.setUsername(username);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PermissionRequest build() {
        return permissionRequest;
    }
}