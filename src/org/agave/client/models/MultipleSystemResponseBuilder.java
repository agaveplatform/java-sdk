/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class MultipleSystemResponseBuilder {
    //the instance to build
    private MultipleSystemResponse multipleSystemResponse;

    /**
     * Default constructor to initialize the instance
     */
    public MultipleSystemResponseBuilder() {
        multipleSystemResponse = new MultipleSystemResponse();
    }

    /**
     * success or failure
     */
    public MultipleSystemResponseBuilder message(String message) {
        multipleSystemResponse.setMessage(message);
        return this;
    }

    /**
     * response body
     */
    public MultipleSystemResponseBuilder result(List<SystemSummary> result) {
        multipleSystemResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public MultipleSystemResponseBuilder status(String status) {
        multipleSystemResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MultipleSystemResponse build() {
        return multipleSystemResponse;
    }
}