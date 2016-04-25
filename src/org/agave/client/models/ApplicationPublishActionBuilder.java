/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationPublishActionBuilder 
        extends ApplicationActionBuilder {
    //the instance to build
    private ApplicationPublishAction applicationPublishAction;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationPublishActionBuilder() {
        applicationPublishAction = new ApplicationPublishAction();
    }

    /**
     * The id of the public system on which this app will run after publication
     */
    public ApplicationPublishActionBuilder executionSystem(String executionSystem) {
        applicationPublishAction.setExecutionSystem(executionSystem);
        return this;
    }

    /**
     * The new name of the app after publication
     */
    public ApplicationPublishActionBuilder name(String name) {
        applicationPublishAction.setName(name);
        return this;
    }

    /**
     * The new version of the app after publication
     */
    public ApplicationPublishActionBuilder version(String version) {
        applicationPublishAction.setVersion(version);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationPublishAction build() {
        return applicationPublishAction;
    }
}