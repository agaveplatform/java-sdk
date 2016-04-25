/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class SingleRemoteFileResponseBuilder {
    //the instance to build
    private SingleRemoteFileResponse singleRemoteFileResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SingleRemoteFileResponseBuilder() {
        singleRemoteFileResponse = new SingleRemoteFileResponse();
    }

    /**
     * success or failure
     */
    public SingleRemoteFileResponseBuilder message(String message) {
        singleRemoteFileResponse.setMessage(message);
        return this;
    }

    public SingleRemoteFileResponseBuilder result(FileInfo result) {
        singleRemoteFileResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public SingleRemoteFileResponseBuilder status(String status) {
        singleRemoteFileResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SingleRemoteFileResponse build() {
        return singleRemoteFileResponse;
    }
}