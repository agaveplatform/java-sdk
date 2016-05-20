/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class ACLBuilder {
    //the instance to build
    private ACL aCL;

    /**
     * Default constructor to initialize the instance
     */
    public ACLBuilder() {
        aCL = new ACL();
    }

    /**
     * can execute
     */
    public ACLBuilder execute(boolean execute) {
        aCL.setExecute(execute);
        return this;
    }

    /**
     * can read
     */
    public ACLBuilder read(boolean read) {
        aCL.setRead(read);
        return this;
    }

    /**
     * can write
     */
    public ACLBuilder write(boolean write) {
        aCL.setWrite(write);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ACL build() {
        return aCL;
    }
}