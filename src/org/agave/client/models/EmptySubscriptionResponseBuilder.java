/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class EmptySubscriptionResponseBuilder {
    //the instance to build
    private EmptySubscriptionResponse emptySubscriptionResponse;

    /**
     * Default constructor to initialize the instance
     */
    public EmptySubscriptionResponseBuilder() {
        emptySubscriptionResponse = new EmptySubscriptionResponse();
    }

    /**
     * success or failure
     */
    public EmptySubscriptionResponseBuilder message(String message) {
        emptySubscriptionResponse.setMessage(message);
        return this;
    }

    public EmptySubscriptionResponseBuilder result(String result) {
        emptySubscriptionResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public EmptySubscriptionResponseBuilder status(String status) {
        emptySubscriptionResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public EmptySubscriptionResponse build() {
        return emptySubscriptionResponse;
    }
}