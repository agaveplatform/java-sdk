/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class JobActionBuilder {
    //the instance to build
    private JobAction jobAction;

    /**
     * Default constructor to initialize the instance
     */
    public JobActionBuilder() {
        jobAction = new JobAction();
    }

    /**
     * Action to perform on the job.
     */
    public JobActionBuilder action(JobActionTypeEnum action) {
        jobAction.setAction(action);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public JobAction build() {
        return jobAction;
    }
}