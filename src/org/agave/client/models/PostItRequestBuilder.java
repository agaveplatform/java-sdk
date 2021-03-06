/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class PostItRequestBuilder {
    //the instance to build
    private PostItRequest postItRequest;

    /**
     * Default constructor to initialize the instance
     */
    public PostItRequestBuilder() {
        postItRequest = new PostItRequest();
    }

    /**
     * The username of the internal user attached to this PostIt.
     */
    public PostItRequestBuilder internalUsername(String internalUsername) {
        postItRequest.setInternalUsername(internalUsername);
        return this;
    }

    /**
     * The maximum lifetime in seconds of this PostIt on this token. Defaults to 2592000 (30 days)
     */
    public PostItRequestBuilder lifetime(int lifetime) {
        postItRequest.setLifetime(lifetime);
        return this;
    }

    /**
     * The maximum number of invocations remaining on this PostIt. Defaults to no limit
     */
    public PostItRequestBuilder maxUses(int maxUses) {
        postItRequest.setMaxUses(maxUses);
        return this;
    }

    /**
     * The method that will be invoked when the PostIt is redeemed.
     */
    public PostItRequestBuilder method(PostItRequestMethodEnum method) {
        postItRequest.setMethod(method);
        return this;
    }

    /**
     * If true, the provided url will be called without authentication. Default is false
     */
    public PostItRequestBuilder noauth(boolean noauth) {
        postItRequest.setNoauth(noauth);
        return this;
    }

    /**
     * The url that will be invoked when the PostIt is redeemed.
     */
    public PostItRequestBuilder url(String url) {
        postItRequest.setUrl(url);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PostItRequest build() {
        return postItRequest;
    }
}