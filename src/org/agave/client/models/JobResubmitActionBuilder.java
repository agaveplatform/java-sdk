/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class JobResubmitActionBuilder 
        extends JobActionBuilder {
    //the instance to build
    private JobResubmitAction jobResubmitAction;

    /**
     * Default constructor to initialize the instance
     */
    public JobResubmitActionBuilder() {
        jobResubmitAction = new JobResubmitAction();
    }

    public JobResubmitActionBuilder action(JobActionTypeEnum action) {
        jobResubmitAction.setAction(action);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public JobResubmitAction build() {
        return jobResubmitAction;
    }
}