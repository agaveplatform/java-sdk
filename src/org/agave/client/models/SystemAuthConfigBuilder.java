/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class SystemAuthConfigBuilder {
    //the instance to build
    private SystemAuthConfig systemAuthConfig;

    /**
     * Default constructor to initialize the instance
     */
    public SystemAuthConfigBuilder() {
        systemAuthConfig = new SystemAuthConfig();
    }

    /**
     * A public URL to the location of the trusted CA certs to use with this credential.
     */
    public SystemAuthConfigBuilder caCerts(String caCerts) {
        systemAuthConfig.setCaCerts(caCerts);
        return this;
    }

    /**
     * The credential used to authenticate to the remote system. Depending on the authentication protocol of the remote system, this could be an OAuth Token, X.509 certificate, Kerberose token, or an private key..
     */
    public SystemAuthConfigBuilder credential(String credential) {
        systemAuthConfig.setCredential(credential);
        return this;
    }

    /**
     * The username of the internal user associated with this credential.
     */
    public SystemAuthConfigBuilder internalUsername(String internalUsername) {
        systemAuthConfig.setInternalUsername(internalUsername);
        return this;
    }

    /**
     * The password on the remote system used to authenticate.
     */
    public SystemAuthConfigBuilder password(String password) {
        systemAuthConfig.setPassword(password);
        return this;
    }

    /**
     * The public ssh key used to authenticate to the remote system..
     */
    public SystemAuthConfigBuilder privateKey(String privateKey) {
        systemAuthConfig.setPrivateKey(privateKey);
        return this;
    }

    /**
     * The public ssh key used to authenticate to the remote system.
     */
    public SystemAuthConfigBuilder publicKey(String publicKey) {
        systemAuthConfig.setPublicKey(publicKey);
        return this;
    }

    /**
     * The server from which a credential may be obtained.
     */
    public SystemAuthConfigBuilder server(SystemAuthConfigServer server) {
        systemAuthConfig.setServer(server);
        return this;
    }

    /**
     * The authentication type.
     */
    public SystemAuthConfigBuilder type(SystemLoginAuthenticationTypeEnum type) {
        systemAuthConfig.setType(type);
        return this;
    }

    /**
     * The local username on the remote system used to authenticate.
     */
    public SystemAuthConfigBuilder username(String username) {
        systemAuthConfig.setUsername(username);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SystemAuthConfig build() {
        return systemAuthConfig;
    }
}