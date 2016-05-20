/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class SingleSubscriptionResponseBuilder {
    //the instance to build
    private SingleSubscriptionResponse singleSubscriptionResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SingleSubscriptionResponseBuilder() {
        singleSubscriptionResponse = new SingleSubscriptionResponse();
    }

    /**
     * success or failure
     */
    public SingleSubscriptionResponseBuilder message(String message) {
        singleSubscriptionResponse.setMessage(message);
        return this;
    }

    public SingleSubscriptionResponseBuilder result(ClientAPISubscription result) {
        singleSubscriptionResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public SingleSubscriptionResponseBuilder status(String status) {
        singleSubscriptionResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SingleSubscriptionResponse build() {
        return singleSubscriptionResponse;
    }
}