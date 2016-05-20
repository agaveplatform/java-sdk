/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationOutputBuilder 
        extends ApplicationArgumentBuilder {
    //the instance to build
    private ApplicationOutput applicationOutput;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationOutputBuilder() {
        applicationOutput = new ApplicationOutput();
    }

    /**
     * The ontologies for this output. 
     */
    public ApplicationOutputBuilder semantics(ApplicationArgumentDataSemantics semantics) {
        applicationOutput.setSemantics(semantics);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationOutput build() {
        return applicationOutput;
    }
}