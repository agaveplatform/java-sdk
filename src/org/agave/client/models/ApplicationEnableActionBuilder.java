/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationEnableActionBuilder 
        extends ApplicationActionBuilder {
    //the instance to build
    private ApplicationEnableAction applicationEnableAction;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationEnableActionBuilder() {
        applicationEnableAction = new ApplicationEnableAction();
    }

    public ApplicationEnableActionBuilder action(ApplicationActionTypeEnum action) {
        applicationEnableAction.setAction(action);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationEnableAction build() {
        return applicationEnableAction;
    }
}