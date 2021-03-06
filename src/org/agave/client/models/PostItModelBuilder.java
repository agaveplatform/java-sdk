/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class PostItModelBuilder {
    //the instance to build
    private PostItModel postItModel;

    /**
     * Default constructor to initialize the instance
     */
    public PostItModelBuilder() {
        postItModel = new PostItModel();
    }

    /**
     * The creation date in ISO 8601 format.
     */
    public PostItModelBuilder created(Date created) {
        postItModel.setCreated(created);
        return this;
    }

    /**
     * The api user who made the PostIt creation request.
     */
    public PostItModelBuilder creator(String creator) {
        postItModel.setCreator(creator);
        return this;
    }

    /**
     * The expiration date in ISO 8601 format.
     */
    public PostItModelBuilder expires(Date expires) {
        postItModel.setExpires(expires);
        return this;
    }

    /**
     * The username of the internal user attached to this PostIt.
     */
    public PostItModelBuilder internalUsername(String internalUsername) {
        postItModel.setInternalUsername(internalUsername);
        return this;
    }

    /**
     * The url that will be invoked when the PostIt is redeemed.
     */
    public PostItModelBuilder method(String method) {
        postItModel.setMethod(method);
        return this;
    }

    /**
     * If true, the provided url will be called without authentication. Default is false
     */
    public PostItModelBuilder noauth(boolean noauth) {
        postItModel.setNoauth(noauth);
        return this;
    }

    /**
     * The PostIt nonce.
     */
    public PostItModelBuilder postit(String postit) {
        postItModel.setPostit(postit);
        return this;
    }

    /**
     * The number of invocations remaining on this token. 
     */
    public PostItModelBuilder remainingUses(int remainingUses) {
        postItModel.setRemainingUses(remainingUses);
        return this;
    }

    /**
     * The url that will be invoked when the PostIt is redeemed.
     */
    public PostItModelBuilder url(String url) {
        postItModel.setUrl(url);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PostItModel build() {
        return postItModel;
    }
}