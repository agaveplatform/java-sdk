/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class ClientBuilder {
    //the instance to build
    private Client client;

    /**
     * Default constructor to initialize the instance
     */
    public ClientBuilder() {
        client = new Client();
    }

    /**
     * Callback URL for OAuth authentication grant.
     */
    public ClientBuilder callbackUrl(String callbackUrl) {
        client.setCallbackUrl(callbackUrl);
        return this;
    }

    /**
     * Description of the client. This will be shown to users when authentication via OAuth web flows
     */
    public ClientBuilder description(String description) {
        client.setDescription(description);
        return this;
    }

    /**
     * The API key for this client.
     */
    public ClientBuilder key(String key) {
        client.setKey(key);
        return this;
    }

    /**
     * The name of the client.
     */
    public ClientBuilder name(String name) {
        client.setName(name);
        return this;
    }

    /**
     * The API secret for this client.
     */
    public ClientBuilder secret(String secret) {
        client.setSecret(secret);
        return this;
    }

    /**
     * The access tier for this client.
     */
    public ClientBuilder tier(String tier) {
        client.setTier(tier);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Client build() {
        return client;
    }
}