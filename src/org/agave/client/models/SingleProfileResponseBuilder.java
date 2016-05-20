/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class SingleProfileResponseBuilder {
    //the instance to build
    private SingleProfileResponse singleProfileResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SingleProfileResponseBuilder() {
        singleProfileResponse = new SingleProfileResponse();
    }

    /**
     * success or failure
     */
    public SingleProfileResponseBuilder message(String message) {
        singleProfileResponse.setMessage(message);
        return this;
    }

    public SingleProfileResponseBuilder result(Profile result) {
        singleProfileResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public SingleProfileResponseBuilder status(String status) {
        singleProfileResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SingleProfileResponse build() {
        return singleProfileResponse;
    }
}