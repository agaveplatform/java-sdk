/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class PermissionStanzaBuilder {
    //the instance to build
    private PermissionStanza permissionStanza;

    /**
     * Default constructor to initialize the instance
     */
    public PermissionStanzaBuilder() {
        permissionStanza = new PermissionStanza();
    }

    /**
     * Is the resource readable
     */
    public PermissionStanzaBuilder read(boolean read) {
        permissionStanza.setRead(read);
        return this;
    }

    /**
     * Is the resource writable
     */
    public PermissionStanzaBuilder write(boolean write) {
        permissionStanza.setWrite(write);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PermissionStanza build() {
        return permissionStanza;
    }
}