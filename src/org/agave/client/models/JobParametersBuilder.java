/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class JobParametersBuilder {
    //the instance to build
    private JobParameters jobParameters;

    /**
     * Default constructor to initialize the instance
     */
    public JobParametersBuilder() {
        jobParameters = new JobParameters();
    }

    /**
     * One or more parameters identified in the description of the app you're running. 
     */
    public JobParametersBuilder parameter1(String parameter1) {
        jobParameters.setParameter1(parameter1);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public JobParameters build() {
        return jobParameters;
    }
}