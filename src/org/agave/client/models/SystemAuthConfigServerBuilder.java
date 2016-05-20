/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class SystemAuthConfigServerBuilder {
    //the instance to build
    private SystemAuthConfigServer systemAuthConfigServer;

    /**
     * Default constructor to initialize the instance
     */
    public SystemAuthConfigServerBuilder() {
        systemAuthConfigServer = new SystemAuthConfigServer();
    }

    /**
     * The hostname or ip address of the remote server.
     */
    public SystemAuthConfigServerBuilder endpoint(String endpoint) {
        systemAuthConfigServer.setEndpoint(endpoint);
        return this;
    }

    /**
     * The port number of the remote server..
     */
    public SystemAuthConfigServerBuilder port(int port) {
        systemAuthConfigServer.setPort(port);
        return this;
    }

    /**
     * The protocol used to obtain a credential from the remote server.
     */
    public SystemAuthConfigServerBuilder protocol(SystemAuthConfigServerProtocolTypeEnum protocol) {
        systemAuthConfigServer.setProtocol(protocol);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SystemAuthConfigServer build() {
        return systemAuthConfigServer;
    }
}