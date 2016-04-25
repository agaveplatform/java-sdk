/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class SingleTransformResponseBuilder {
    //the instance to build
    private SingleTransformResponse singleTransformResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SingleTransformResponseBuilder() {
        singleTransformResponse = new SingleTransformResponse();
    }

    /**
     * success or failure
     */
    public SingleTransformResponseBuilder message(String message) {
        singleTransformResponse.setMessage(message);
        return this;
    }

    public SingleTransformResponseBuilder result(Transform result) {
        singleTransformResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public SingleTransformResponseBuilder status(String status) {
        singleTransformResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SingleTransformResponse build() {
        return singleTransformResponse;
    }
}