/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class ClientAPISubscriptionBuilder {
    //the instance to build
    private ClientAPISubscription clientAPISubscription;

    /**
     * Default constructor to initialize the instance
     */
    public ClientAPISubscriptionBuilder() {
        clientAPISubscription = new ClientAPISubscription();
    }

    /**
     * The base url path of the API.
     */
    public ClientAPISubscriptionBuilder apiContext(String apiContext) {
        clientAPISubscription.setApiContext(apiContext);
        return this;
    }

    /**
     * The name of the API.
     */
    public ClientAPISubscriptionBuilder apiName(String apiName) {
        clientAPISubscription.setApiName(apiName);
        return this;
    }

    /**
     * The user who registered the API.
     */
    public ClientAPISubscriptionBuilder apiProvider(String apiProvider) {
        clientAPISubscription.setApiProvider(apiProvider);
        return this;
    }

    /**
     * The current major version of the API. This is appended to the api_context to create the base API url.
     */
    public ClientAPISubscriptionBuilder apiVersion(String apiVersion) {
        clientAPISubscription.setApiVersion(apiVersion);
        return this;
    }

    /**
     * The current status of the API.
     */
    public ClientAPISubscriptionBuilder status(ClientAPISubscriptionStatusTypeEnum status) {
        clientAPISubscription.setStatus(status);
        return this;
    }

    /**
     * The access tier for this client.
     */
    public ClientAPISubscriptionBuilder tier(ClientSubscriptionTierEnum tier) {
        clientAPISubscription.setTier(tier);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ClientAPISubscription build() {
        return clientAPISubscription;
    }
}