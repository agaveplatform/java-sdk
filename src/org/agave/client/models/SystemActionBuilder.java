/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class SystemActionBuilder {
    //the instance to build
    private SystemAction systemAction;

    /**
     * Default constructor to initialize the instance
     */
    public SystemActionBuilder() {
        systemAction = new SystemAction();
    }

    /**
     * Action to perform on the system.
     */
    public SystemActionBuilder action(SystemActionTypeEnum action) {
        systemAction.setAction(action);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SystemAction build() {
        return systemAction;
    }
}