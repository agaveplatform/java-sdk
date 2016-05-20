/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class SystemCredentialsResponseBuilder {
    //the instance to build
    private SystemCredentialsResponse systemCredentialsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SystemCredentialsResponseBuilder() {
        systemCredentialsResponse = new SystemCredentialsResponse();
    }

    /**
     * success or failure
     */
    public SystemCredentialsResponseBuilder message(String message) {
        systemCredentialsResponse.setMessage(message);
        return this;
    }

    public SystemCredentialsResponseBuilder result(SystemCredential result) {
        systemCredentialsResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public SystemCredentialsResponseBuilder status(String status) {
        systemCredentialsResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SystemCredentialsResponse build() {
        return systemCredentialsResponse;
    }
}