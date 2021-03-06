/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class FilePermissionBuilder 
        extends PermissionModelBuilder {
    //the instance to build
    private FilePermission filePermission;

    /**
     * Default constructor to initialize the instance
     */
    public FilePermissionBuilder() {
        filePermission = new FilePermission();
    }

    /**
     * The permisisons associated with this objectf
     */
    public FilePermissionBuilder permission(FilePermissionStanza permission) {
        filePermission.setPermission(permission);
        return this;
    }

    /**
     * Boolean flag indicating whether the permission applies recursively to the remote file item.
     */
    public FilePermissionBuilder recursive(Boolean recursive) {
        filePermission.setRecursive(recursive);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FilePermission build() {
        return filePermission;
    }
}