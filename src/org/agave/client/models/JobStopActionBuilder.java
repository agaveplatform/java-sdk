/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class JobStopActionBuilder 
        extends JobActionBuilder {
    //the instance to build
    private JobStopAction jobStopAction;

    /**
     * Default constructor to initialize the instance
     */
    public JobStopActionBuilder() {
        jobStopAction = new JobStopAction();
    }

    public JobStopActionBuilder action(JobActionTypeEnum action) {
        jobStopAction.setAction(action);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public JobStopAction build() {
        return jobStopAction;
    }
}