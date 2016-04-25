/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class JobInputsBuilder {
    //the instance to build
    private JobInputs jobInputs;

    /**
     * Default constructor to initialize the instance
     */
    public JobInputsBuilder() {
        jobInputs = new JobInputs();
    }

    /**
     * One or more inputs identified in the description of the app you're running. 
     */
    public JobInputsBuilder parameter1(String parameter1) {
        jobInputs.setParameter1(parameter1);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public JobInputs build() {
        return jobInputs;
    }
}