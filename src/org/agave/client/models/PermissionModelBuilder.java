/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class PermissionModelBuilder {
    //the instance to build
    private PermissionModel permissionModel;

    /**
     * Default constructor to initialize the instance
     */
    public PermissionModelBuilder() {
        permissionModel = new PermissionModel();
    }

    /**
     * The date the permission was created
     */
    public PermissionModelBuilder created(Date created) {
        permissionModel.setCreated(created);
        return this;
    }

    /**
     * The unique id of this permission
     */
    public PermissionModelBuilder id(String id) {
        permissionModel.setId(id);
        return this;
    }

    /**
     * The internal user associated with this permission
     */
    public PermissionModelBuilder internalUsername(String internalUsername) {
        permissionModel.setInternalUsername(internalUsername);
        return this;
    }

    /**
     * The date the permission was last updated
     */
    public PermissionModelBuilder lastUpdated(Date lastUpdated) {
        permissionModel.setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * The permissions granted to the user
     */
    public PermissionModelBuilder permission(PermissionStanza permission) {
        permissionModel.setPermission(permission);
        return this;
    }

    /**
     * The username to whom this permission grant applies
     */
    public PermissionModelBuilder username(String username) {
        permissionModel.setUsername(username);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PermissionModel build() {
        return permissionModel;
    }
}