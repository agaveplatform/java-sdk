/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class ClientRequestBuilder {
    //the instance to build
    private ClientRequest clientRequest;

    /**
     * Default constructor to initialize the instance
     */
    public ClientRequestBuilder() {
        clientRequest = new ClientRequest();
    }

    /**
     * Callback URL for OAuth authentication grant.
     */
    public ClientRequestBuilder callbackUrl(String callbackUrl) {
        clientRequest.setCallbackUrl(callbackUrl);
        return this;
    }

    /**
     * Description of the client. This will be shown to users when authentication via OAuth web flows
     */
    public ClientRequestBuilder description(String description) {
        clientRequest.setDescription(description);
        return this;
    }

    /**
     * The name of the client.
     */
    public ClientRequestBuilder name(String name) {
        clientRequest.setName(name);
        return this;
    }

    /**
     * The access tier for this client.
     */
    public ClientRequestBuilder tier(ClientSubscriptionTierEnum tier) {
        clientRequest.setTier(tier);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ClientRequest build() {
        return clientRequest;
    }
}