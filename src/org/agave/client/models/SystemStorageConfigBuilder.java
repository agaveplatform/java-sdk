/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class SystemStorageConfigBuilder {
    //the instance to build
    private SystemStorageConfig systemStorageConfig;

    /**
     * Default constructor to initialize the instance
     */
    public SystemStorageConfigBuilder() {
        systemStorageConfig = new SystemStorageConfig();
    }

    /**
     * The default authentication credential used for this system.
     */
    public SystemStorageConfigBuilder auth(SystemAuthConfig auth) {
        systemStorageConfig.setAuth(auth);
        return this;
    }

    /**
     * The name of the bucket to interact with when using an object store.
     */
    public SystemStorageConfigBuilder containerName(String containerName) {
        systemStorageConfig.setContainerName(containerName);
        return this;
    }

    /**
     * The path on the remote system to use as the home directory for all API requests. For cases where the home directory should be dynamically defined, the ${USERNAME} token can be included in the homeDir value to represent the username of the authenticated user. ex. /home/${USERNAME}.
     */
    public SystemStorageConfigBuilder homeDir(String homeDir) {
        systemStorageConfig.setHomeDir(homeDir);
        return this;
    }

    /**
     * The hostname or ip address of the storage server
     */
    public SystemStorageConfigBuilder host(String host) {
        systemStorageConfig.setHost(host);
        return this;
    }

    /**
     * Whether the permissions set on the server should be pushed to the storage system itself. This only applies to IRODS and AWS systems.
     */
    public SystemStorageConfigBuilder mirror(Boolean mirror) {
        systemStorageConfig.setMirror(mirror);
        return this;
    }

    /**
     * The port number of the storage server.
     */
    public SystemStorageConfigBuilder port(int port) {
        systemStorageConfig.setPort(port);
        return this;
    }

    /**
     * The protocol used to authenticate to the storage server.
     */
    public SystemStorageConfigBuilder protocol(SystemStorageProtocolTypeEnum protocol) {
        systemStorageConfig.setProtocol(protocol);
        return this;
    }

    /**
     * The path on the remote system where apps will be stored if this is set as the default public storage system.
     */
    public SystemStorageConfigBuilder publicAppsDir(String publicAppsDir) {
        systemStorageConfig.setPublicAppsDir(publicAppsDir);
        return this;
    }

    /**
     * The name of the target resource when defining an IRODS system.
     */
    public SystemStorageConfigBuilder resource(String resource) {
        systemStorageConfig.setResource(resource);
        return this;
    }

    /**
     * The path on the remote system to use as the root for all API requests.
     */
    public SystemStorageConfigBuilder rootDir(String rootDir) {
        systemStorageConfig.setRootDir(rootDir);
        return this;
    }

    /**
     * The name of the zone when defining an IRODS system.
     */
    public SystemStorageConfigBuilder zone(String zone) {
        systemStorageConfig.setZone(zone);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SystemStorageConfig build() {
        return systemStorageConfig;
    }
}