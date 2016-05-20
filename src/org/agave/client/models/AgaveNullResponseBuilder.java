/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class AgaveNullResponseBuilder 
        extends AgaveResponseBuilder {
    //the instance to build
    private AgaveNullResponse agaveNullResponse;

    /**
     * Default constructor to initialize the instance
     */
    public AgaveNullResponseBuilder() {
        agaveNullResponse = new AgaveNullResponse();
    }

    public AgaveNullResponseBuilder result(String result) {
        agaveNullResponse.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AgaveNullResponse build() {
        return agaveNullResponse;
    }
}