/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationParameterNumericValueBuilder 
        extends AbstractApplicationParameterValueBuilder {
    //the instance to build
    private ApplicationParameterNumericValue applicationParameterNumericValue;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationParameterNumericValueBuilder() {
        applicationParameterNumericValue = new ApplicationParameterNumericValue();
    }

    /**
     * The primary type of this parameter
     */
    public ApplicationParameterNumericValueBuilder type(String type) {
        applicationParameterNumericValue.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationParameterNumericValue build() {
        return applicationParameterNumericValue;
    }
}