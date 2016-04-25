/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class MultipleRemoteFileResponseBuilder {
    //the instance to build
    private MultipleRemoteFileResponse multipleRemoteFileResponse;

    /**
     * Default constructor to initialize the instance
     */
    public MultipleRemoteFileResponseBuilder() {
        multipleRemoteFileResponse = new MultipleRemoteFileResponse();
    }

    /**
     * success or failure
     */
    public MultipleRemoteFileResponseBuilder message(String message) {
        multipleRemoteFileResponse.setMessage(message);
        return this;
    }

    /**
     * response body
     */
    public MultipleRemoteFileResponseBuilder result(List<FileInfo> result) {
        multipleRemoteFileResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public MultipleRemoteFileResponseBuilder status(String status) {
        multipleRemoteFileResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MultipleRemoteFileResponse build() {
        return multipleRemoteFileResponse;
    }
}