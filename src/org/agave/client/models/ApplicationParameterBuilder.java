/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationParameterBuilder 
        extends ApplicationArgumentBuilder {
    //the instance to build
    private ApplicationParameter applicationParameter;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationParameterBuilder() {
        applicationParameter = new ApplicationParameter();
    }

    /**
     * The inputs files for this parameter. 
     */
    public ApplicationParameterBuilder value(AbstractApplicationParameterValue value) {
        applicationParameter.setValue(value);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationParameter build() {
        return applicationParameter;
    }
}