/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class EmptyRemoteFileResponseBuilder {
    //the instance to build
    private EmptyRemoteFileResponse emptyRemoteFileResponse;

    /**
     * Default constructor to initialize the instance
     */
    public EmptyRemoteFileResponseBuilder() {
        emptyRemoteFileResponse = new EmptyRemoteFileResponse();
    }

    /**
     * success or failure
     */
    public EmptyRemoteFileResponseBuilder message(String message) {
        emptyRemoteFileResponse.setMessage(message);
        return this;
    }

    /**
     * empty result
     */
    public EmptyRemoteFileResponseBuilder result(String result) {
        emptyRemoteFileResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public EmptyRemoteFileResponseBuilder status(String status) {
        emptyRemoteFileResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public EmptyRemoteFileResponse build() {
        return emptyRemoteFileResponse;
    }
}