/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationActionBuilder {
    //the instance to build
    private ApplicationAction applicationAction;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationActionBuilder() {
        applicationAction = new ApplicationAction();
    }

    public ApplicationActionBuilder action(ApplicationActionTypeEnum action) {
        applicationAction.setAction(action);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationAction build() {
        return applicationAction;
    }
}