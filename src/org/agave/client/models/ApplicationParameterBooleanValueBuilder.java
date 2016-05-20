/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationParameterBooleanValueBuilder 
        extends AbstractApplicationParameterValueBuilder {
    //the instance to build
    private ApplicationParameterBooleanValue applicationParameterBooleanValue;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationParameterBooleanValueBuilder() {
        applicationParameterBooleanValue = new ApplicationParameterBooleanValue();
    }

    /**
     * The primary type of this parameter
     */
    public ApplicationParameterBooleanValueBuilder type(String type) {
        applicationParameterBooleanValue.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationParameterBooleanValue build() {
        return applicationParameterBooleanValue;
    }
}