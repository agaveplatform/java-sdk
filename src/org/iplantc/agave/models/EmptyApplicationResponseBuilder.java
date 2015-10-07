/*
 * AgavePlatformScienceAPILib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 10/07/2015
 */
package org.iplantc.agave.models;

import java.util.*;

public class EmptyApplicationResponseBuilder {
    //the instance to build
    private EmptyApplicationResponse emptyApplicationResponse;

    /**
     * Default constructor to initialize the instance
     */
    public EmptyApplicationResponseBuilder() {
        emptyApplicationResponse = new EmptyApplicationResponse();
    }

    /**
     * success or failure
     */
    public EmptyApplicationResponseBuilder message(String message) {
        emptyApplicationResponse.setMessage(message);
        return this;
    }

    /**
     * empty result
     */
    public EmptyApplicationResponseBuilder result(String result) {
        emptyApplicationResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public EmptyApplicationResponseBuilder status(String status) {
        emptyApplicationResponse.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public EmptyApplicationResponse build() {
        return emptyApplicationResponse;
    }
}