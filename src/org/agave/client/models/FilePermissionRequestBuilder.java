/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class FilePermissionRequestBuilder 
        extends PermissionRequestBuilder {
    //the instance to build
    private FilePermissionRequest filePermissionRequest;

    /**
     * Default constructor to initialize the instance
     */
    public FilePermissionRequestBuilder() {
        filePermissionRequest = new FilePermissionRequest();
    }

    /**
     * Should updated permissions be applied recursively. Defaults to false.
     */
    public FilePermissionRequestBuilder recursive(boolean recursive) {
        filePermissionRequest.setRecursive(recursive);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FilePermissionRequest build() {
        return filePermissionRequest;
    }
}