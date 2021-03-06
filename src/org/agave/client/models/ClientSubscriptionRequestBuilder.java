/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class ClientSubscriptionRequestBuilder {
    //the instance to build
    private ClientSubscriptionRequest clientSubscriptionRequest;

    /**
     * Default constructor to initialize the instance
     */
    public ClientSubscriptionRequestBuilder() {
        clientSubscriptionRequest = new ClientSubscriptionRequest();
    }

    /**
     * The name of the API.
     */
    public ClientSubscriptionRequestBuilder apiName(String apiName) {
        clientSubscriptionRequest.setApiName(apiName);
        return this;
    }

    /**
     * The user who registered the API.
     */
    public ClientSubscriptionRequestBuilder apiProvider(String apiProvider) {
        clientSubscriptionRequest.setApiProvider(apiProvider);
        return this;
    }

    /**
     * The current major version of the API. This is appended to the api_context to create the base API url.
     */
    public ClientSubscriptionRequestBuilder apiVersion(String apiVersion) {
        clientSubscriptionRequest.setApiVersion(apiVersion);
        return this;
    }

    /**
     * The access tier for this client.
     */
    public ClientSubscriptionRequestBuilder tier(ClientSubscriptionTierEnum tier) {
        clientSubscriptionRequest.setTier(tier);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ClientSubscriptionRequest build() {
        return clientSubscriptionRequest;
    }
}