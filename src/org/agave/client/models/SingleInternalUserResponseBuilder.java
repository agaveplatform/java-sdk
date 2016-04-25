/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class SingleInternalUserResponseBuilder {
    //the instance to build
    private SingleInternalUserResponse singleInternalUserResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SingleInternalUserResponseBuilder() {
        singleInternalUserResponse = new SingleInternalUserResponse();
    }

    /**
     * success or failure
     */
    public SingleInternalUserResponseBuilder message(String message) {
        singleInternalUserResponse.setMessage(message);
        return this;
    }

    public SingleInternalUserResponseBuilder result(InternalUser result) {
        singleInternalUserResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public SingleInternalUserResponseBuilder status(String status) {
        singleInternalUserResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SingleInternalUserResponse build() {
        return singleInternalUserResponse;
    }
}