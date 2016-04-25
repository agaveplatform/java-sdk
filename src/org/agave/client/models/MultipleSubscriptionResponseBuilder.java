/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class MultipleSubscriptionResponseBuilder {
    //the instance to build
    private MultipleSubscriptionResponse multipleSubscriptionResponse;

    /**
     * Default constructor to initialize the instance
     */
    public MultipleSubscriptionResponseBuilder() {
        multipleSubscriptionResponse = new MultipleSubscriptionResponse();
    }

    /**
     * success or failure
     */
    public MultipleSubscriptionResponseBuilder message(String message) {
        multipleSubscriptionResponse.setMessage(message);
        return this;
    }

    /**
     * List of subscriptions
     */
    public MultipleSubscriptionResponseBuilder result(List<ClientAPISubscription> result) {
        multipleSubscriptionResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public MultipleSubscriptionResponseBuilder status(String status) {
        multipleSubscriptionResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MultipleSubscriptionResponse build() {
        return multipleSubscriptionResponse;
    }
}