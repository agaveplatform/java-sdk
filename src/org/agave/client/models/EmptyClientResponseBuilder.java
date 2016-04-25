/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class EmptyClientResponseBuilder {
    //the instance to build
    private EmptyClientResponse emptyClientResponse;

    /**
     * Default constructor to initialize the instance
     */
    public EmptyClientResponseBuilder() {
        emptyClientResponse = new EmptyClientResponse();
    }

    /**
     * success or failure
     */
    public EmptyClientResponseBuilder message(String message) {
        emptyClientResponse.setMessage(message);
        return this;
    }

    public EmptyClientResponseBuilder result(String result) {
        emptyClientResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public EmptyClientResponseBuilder status(String status) {
        emptyClientResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public EmptyClientResponse build() {
        return emptyClientResponse;
    }
}