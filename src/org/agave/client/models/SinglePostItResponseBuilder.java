/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class SinglePostItResponseBuilder {
    //the instance to build
    private SinglePostItResponse singlePostItResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SinglePostItResponseBuilder() {
        singlePostItResponse = new SinglePostItResponse();
    }

    /**
     * success or failure
     */
    public SinglePostItResponseBuilder message(String message) {
        singlePostItResponse.setMessage(message);
        return this;
    }

    public SinglePostItResponseBuilder result(PostItModel result) {
        singlePostItResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public SinglePostItResponseBuilder status(String status) {
        singlePostItResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SinglePostItResponse build() {
        return singlePostItResponse;
    }
}