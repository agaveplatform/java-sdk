/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class SystemPublishActionBuilder 
        extends SystemActionBuilder {
    //the instance to build
    private SystemPublishAction systemPublishAction;

    /**
     * Default constructor to initialize the instance
     */
    public SystemPublishActionBuilder() {
        systemPublishAction = new SystemPublishAction();
    }

    public SystemPublishActionBuilder action(String action) {
        systemPublishAction.setAction(action);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SystemPublishAction build() {
        return systemPublishAction;
    }
}