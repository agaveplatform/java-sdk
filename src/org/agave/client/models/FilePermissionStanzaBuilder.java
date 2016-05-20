/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class FilePermissionStanzaBuilder 
        extends PermissionStanzaBuilder {
    //the instance to build
    private FilePermissionStanza filePermissionStanza;

    /**
     * Default constructor to initialize the instance
     */
    public FilePermissionStanzaBuilder() {
        filePermissionStanza = new FilePermissionStanza();
    }

    /**
     * Is the resource executable
     */
    public FilePermissionStanzaBuilder execute(boolean execute) {
        filePermissionStanza.setExecute(execute);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FilePermissionStanza build() {
        return filePermissionStanza;
    }
}