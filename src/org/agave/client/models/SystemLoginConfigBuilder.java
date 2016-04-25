/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class SystemLoginConfigBuilder {
    //the instance to build
    private SystemLoginConfig systemLoginConfig;

    /**
     * Default constructor to initialize the instance
     */
    public SystemLoginConfigBuilder() {
        systemLoginConfig = new SystemLoginConfig();
    }

    /**
     * The default authentication credential used for this system.
     */
    public SystemLoginConfigBuilder auth(SystemAuthConfig auth) {
        systemLoginConfig.setAuth(auth);
        return this;
    }

    /**
     * The hostname or ip address of the submission server
     */
    public SystemLoginConfigBuilder host(String host) {
        systemLoginConfig.setHost(host);
        return this;
    }

    /**
     * The port number of the submission server.
     */
    public SystemLoginConfigBuilder port(int port) {
        systemLoginConfig.setPort(port);
        return this;
    }

    /**
     * The protocol used to authenticate to the submission server.
     */
    public SystemLoginConfigBuilder protocol(SystemLoginProtocolTypeEnum protocol) {
        systemLoginConfig.setProtocol(protocol);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SystemLoginConfig build() {
        return systemLoginConfig;
    }
}