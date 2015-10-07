/*
 * AgavePlatformScienceAPILib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 10/07/2015
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationUnpublishActionBuilder 
        extends ApplicationActionBuilder {
    //the instance to build
    private ApplicationUnpublishAction applicationUnpublishAction;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationUnpublishActionBuilder() {
        applicationUnpublishAction = new ApplicationUnpublishAction();
    }

    public ApplicationUnpublishActionBuilder action(ApplicationActionTypeEnum action) {
        applicationUnpublishAction.setAction(action);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationUnpublishAction build() {
        return applicationUnpublishAction;
    }
}