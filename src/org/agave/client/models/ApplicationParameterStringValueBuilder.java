/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationParameterStringValueBuilder 
        extends ApplicationArgumentValueBuilder {
    //the instance to build
    private ApplicationParameterStringValue applicationParameterStringValue;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationParameterStringValueBuilder() {
        applicationParameterStringValue = new ApplicationParameterStringValue();
    }

    /**
     * The primary type of this parameter
     */
    public ApplicationParameterStringValueBuilder type(String type) {
        applicationParameterStringValue.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationParameterStringValue build() {
        return applicationParameterStringValue;
    }
}