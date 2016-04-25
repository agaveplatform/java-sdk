/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationInputBuilder 
        extends ApplicationArgumentBuilder {
    //the instance to build
    private ApplicationInput applicationInput;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationInputBuilder() {
        applicationInput = new ApplicationInput();
    }

    /**
     * The ontologies for this input. 
     */
    public ApplicationInputBuilder semantics(ApplicationArgumentDataSemantics semantics) {
        applicationInput.setSemantics(semantics);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationInput build() {
        return applicationInput;
    }
}