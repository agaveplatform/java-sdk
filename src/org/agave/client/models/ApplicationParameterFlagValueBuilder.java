/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationParameterFlagValueBuilder 
        extends AbstractApplicationParameterValueBuilder {
    //the instance to build
    private ApplicationParameterFlagValue applicationParameterFlagValue;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationParameterFlagValueBuilder() {
        applicationParameterFlagValue = new ApplicationParameterFlagValue();
    }

    /**
     * The primary type of this parameter
     */
    public ApplicationParameterFlagValueBuilder type(String type) {
        applicationParameterFlagValue.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationParameterFlagValue build() {
        return applicationParameterFlagValue;
    }
}