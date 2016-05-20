/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class MultipleTransformResponseBuilder {
    //the instance to build
    private MultipleTransformResponse multipleTransformResponse;

    /**
     * Default constructor to initialize the instance
     */
    public MultipleTransformResponseBuilder() {
        multipleTransformResponse = new MultipleTransformResponse();
    }

    /**
     * success or failure
     */
    public MultipleTransformResponseBuilder message(String message) {
        multipleTransformResponse.setMessage(message);
        return this;
    }

    /**
     * response body
     */
    public MultipleTransformResponseBuilder result(List<Transform> result) {
        multipleTransformResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public MultipleTransformResponseBuilder status(String status) {
        multipleTransformResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MultipleTransformResponse build() {
        return multipleTransformResponse;
    }
}