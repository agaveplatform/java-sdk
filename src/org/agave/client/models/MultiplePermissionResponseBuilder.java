/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class MultiplePermissionResponseBuilder {
    //the instance to build
    private MultiplePermissionResponse multiplePermissionResponse;

    /**
     * Default constructor to initialize the instance
     */
    public MultiplePermissionResponseBuilder() {
        multiplePermissionResponse = new MultiplePermissionResponse();
    }

    /**
     * success or failure
     */
    public MultiplePermissionResponseBuilder message(String message) {
        multiplePermissionResponse.setMessage(message);
        return this;
    }

    /**
     * One or more file permissions
     */
    public MultiplePermissionResponseBuilder result(List<FilePermission> result) {
        multiplePermissionResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public MultiplePermissionResponseBuilder status(String status) {
        multiplePermissionResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MultiplePermissionResponse build() {
        return multiplePermissionResponse;
    }
}