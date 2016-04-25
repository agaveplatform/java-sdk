/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationArgumentBuilder {
    //the instance to build
    private ApplicationArgument applicationArgument;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationArgumentBuilder() {
        applicationArgument = new ApplicationArgument();
    }

    /**
     * The details for this argument. 
     */
    public ApplicationArgumentBuilder details(ApplicationArgumentDetails details) {
        applicationArgument.setDetails(details);
        return this;
    }

    /**
     * The id of this argument. This will be the replacement string in your wrapper scripts.
     */
    public ApplicationArgumentBuilder id(String id) {
        applicationArgument.setId(id);
        return this;
    }

    /**
     * The semantic information for this output. 
     */
    public ApplicationArgumentBuilder semantics(ApplicationArgumentSemantics semantics) {
        applicationArgument.setSemantics(semantics);
        return this;
    }

    /**
     * The validation and type information for this argument.
     */
    public ApplicationArgumentBuilder value(ApplicationArgumentValue value) {
        applicationArgument.setValue(value);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationArgument build() {
        return applicationArgument;
    }
}