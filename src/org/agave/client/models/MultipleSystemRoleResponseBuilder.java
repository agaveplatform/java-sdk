/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class MultipleSystemRoleResponseBuilder {
    //the instance to build
    private MultipleSystemRoleResponse multipleSystemRoleResponse;

    /**
     * Default constructor to initialize the instance
     */
    public MultipleSystemRoleResponseBuilder() {
        multipleSystemRoleResponse = new MultipleSystemRoleResponse();
    }

    /**
     * success or failure
     */
    public MultipleSystemRoleResponseBuilder message(String message) {
        multipleSystemRoleResponse.setMessage(message);
        return this;
    }

    /**
     * All matching roles for this system
     */
    public MultipleSystemRoleResponseBuilder result(List<SystemRoleRequest> result) {
        multipleSystemRoleResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public MultipleSystemRoleResponseBuilder status(String status) {
        multipleSystemRoleResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MultipleSystemRoleResponse build() {
        return multipleSystemRoleResponse;
    }
}