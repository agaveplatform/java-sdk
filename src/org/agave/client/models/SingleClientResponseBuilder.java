/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class SingleClientResponseBuilder {
    //the instance to build
    private SingleClientResponse singleClientResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SingleClientResponseBuilder() {
        singleClientResponse = new SingleClientResponse();
    }

    /**
     * success or failure
     */
    public SingleClientResponseBuilder message(String message) {
        singleClientResponse.setMessage(message);
        return this;
    }

    public SingleClientResponseBuilder result(Client result) {
        singleClientResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public SingleClientResponseBuilder status(String status) {
        singleClientResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SingleClientResponse build() {
        return singleClientResponse;
    }
}