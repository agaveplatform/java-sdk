/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class EmptySystemResponseBuilder {
    //the instance to build
    private EmptySystemResponse emptySystemResponse;

    /**
     * Default constructor to initialize the instance
     */
    public EmptySystemResponseBuilder() {
        emptySystemResponse = new EmptySystemResponse();
    }

    /**
     * success or failure
     */
    public EmptySystemResponseBuilder message(String message) {
        emptySystemResponse.setMessage(message);
        return this;
    }

    /**
     * empty result
     */
    public EmptySystemResponseBuilder result(String result) {
        emptySystemResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public EmptySystemResponseBuilder status(String status) {
        emptySystemResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public EmptySystemResponse build() {
        return emptySystemResponse;
    }
}