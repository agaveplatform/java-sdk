/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class MultipleClientResponseBuilder {
    //the instance to build
    private MultipleClientResponse multipleClientResponse;

    /**
     * Default constructor to initialize the instance
     */
    public MultipleClientResponseBuilder() {
        multipleClientResponse = new MultipleClientResponse();
    }

    /**
     * success or failure
     */
    public MultipleClientResponseBuilder message(String message) {
        multipleClientResponse.setMessage(message);
        return this;
    }

    /**
     * List of clients
     */
    public MultipleClientResponseBuilder result(List<Client> result) {
        multipleClientResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public MultipleClientResponseBuilder status(String status) {
        multipleClientResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MultipleClientResponse build() {
        return multipleClientResponse;
    }
}