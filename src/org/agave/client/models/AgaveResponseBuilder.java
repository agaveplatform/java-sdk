/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class AgaveResponseBuilder {
    //the instance to build
    private AgaveResponse agaveResponse;

    /**
     * Default constructor to initialize the instance
     */
    public AgaveResponseBuilder() {
        agaveResponse = new AgaveResponse();
    }

    /**
     * success or failure
     */
    public AgaveResponseBuilder message(String message) {
        agaveResponse.setMessage(message);
        return this;
    }

    /**
     * success or failure
     */
    public AgaveResponseBuilder status(String status) {
        agaveResponse.setStatus(status);
        return this;
    }

    /**
     * The current api version
     */
    public AgaveResponseBuilder version(String version) {
        agaveResponse.setVersion(version);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AgaveResponse build() {
        return agaveResponse;
    }
}