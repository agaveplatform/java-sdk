/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class SingleSystemResponseBuilder {
    //the instance to build
    private SingleSystemResponse singleSystemResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SingleSystemResponseBuilder() {
        singleSystemResponse = new SingleSystemResponse();
    }

    /**
     * success or failure
     */
    public SingleSystemResponseBuilder message(String message) {
        singleSystemResponse.setMessage(message);
        return this;
    }

    public SingleSystemResponseBuilder result(System result) {
        singleSystemResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public SingleSystemResponseBuilder status(String status) {
        singleSystemResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SingleSystemResponse build() {
        return singleSystemResponse;
    }
}