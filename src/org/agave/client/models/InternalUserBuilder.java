/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class InternalUserBuilder 
        extends ProfileBuilder {
    //the instance to build
    private InternalUser internalUser;

    /**
     * Default constructor to initialize the instance
     */
    public InternalUserBuilder() {
        internalUser = new InternalUser();
    }

    /**
     * The date the internal user was created
     */
    public InternalUserBuilder created(Date created) {
        internalUser.setCreated(created);
        return this;
    }

    /**
     * The date the internal user was last updated
     */
    public InternalUserBuilder lastUpdated(Date lastUpdated) {
        internalUser.setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * The uuid of the parent to which this internal user account belongs
     */
    public InternalUserBuilder parent(String parent) {
        internalUser.setParent(parent);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public InternalUser build() {
        return internalUser;
    }
}