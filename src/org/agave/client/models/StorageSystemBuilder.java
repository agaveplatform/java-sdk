/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class StorageSystemBuilder 
        extends SystemBuilder {
    //the instance to build
    private StorageSystem storageSystem;

    /**
     * Default constructor to initialize the instance
     */
    public StorageSystemBuilder() {
        storageSystem = new StorageSystem();
    }

    public StorageSystemBuilder type(SystemTypeEnum type) {
        storageSystem.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StorageSystem build() {
        return storageSystem;
    }
}