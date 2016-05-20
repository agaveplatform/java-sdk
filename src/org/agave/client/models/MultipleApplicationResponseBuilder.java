/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class MultipleApplicationResponseBuilder {
    //the instance to build
    private MultipleApplicationResponse multipleApplicationResponse;

    /**
     * Default constructor to initialize the instance
     */
    public MultipleApplicationResponseBuilder() {
        multipleApplicationResponse = new MultipleApplicationResponse();
    }

    /**
     * success or failure
     */
    public MultipleApplicationResponseBuilder message(String message) {
        multipleApplicationResponse.setMessage(message);
        return this;
    }

    /**
     * response body
     */
    public MultipleApplicationResponseBuilder result(List<ApplicationSummary> result) {
        multipleApplicationResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public MultipleApplicationResponseBuilder status(String status) {
        multipleApplicationResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MultipleApplicationResponse build() {
        return multipleApplicationResponse;
    }
}