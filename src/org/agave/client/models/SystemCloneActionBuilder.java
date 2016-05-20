/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class SystemCloneActionBuilder 
        extends SystemActionBuilder {
    //the instance to build
    private SystemCloneAction systemCloneAction;

    /**
     * Default constructor to initialize the instance
     */
    public SystemCloneActionBuilder() {
        systemCloneAction = new SystemCloneAction();
    }

    /**
     * Unique name for new system
     */
    public SystemCloneActionBuilder id(String id) {
        systemCloneAction.setId(id);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SystemCloneAction build() {
        return systemCloneAction;
    }
}