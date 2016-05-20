/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationDisableActionBuilder 
        extends ApplicationActionBuilder {
    //the instance to build
    private ApplicationDisableAction applicationDisableAction;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationDisableActionBuilder() {
        applicationDisableAction = new ApplicationDisableAction();
    }

    public ApplicationDisableActionBuilder action(ApplicationActionTypeEnum action) {
        applicationDisableAction.setAction(action);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationDisableAction build() {
        return applicationDisableAction;
    }
}