/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class SystemCredentialBuilder {
    //the instance to build
    private SystemCredential systemCredential;

    /**
     * Default constructor to initialize the instance
     */
    public SystemCredentialBuilder() {
        systemCredential = new SystemCredential();
    }

    /**
     * A public URL to the location of the trusted CA certs to use with this credential.
     */
    public SystemCredentialBuilder caCerts(String caCerts) {
        systemCredential.setCaCerts(caCerts);
        return this;
    }

    /**
     * The credential used to authenticate to the remote system. Depending on the authentication protocol of the remote system, this could be an OAuth Token, X.509 certificate, Kerberose token, or an private key..
     */
    public SystemCredentialBuilder credential(String credential) {
        systemCredential.setCredential(credential);
        return this;
    }

    /**
     * The date the credential expires in ISO 8601 format.
     */
    public SystemCredentialBuilder expirationDate(Date expirationDate) {
        systemCredential.setExpirationDate(expirationDate);
        return this;
    }

    /**
     * The username of the internal user associated with this credential.
     */
    public SystemCredentialBuilder internalUsername(String internalUsername) {
        systemCredential.setInternalUsername(internalUsername);
        return this;
    }

    /**
     * Is this the default credential for this internal user of this type on this system?
     */
    public SystemCredentialBuilder isDefault(boolean isDefault) {
        systemCredential.setIsDefault(isDefault);
        return this;
    }

    /**
     * The system type this credential is associated with.
     */
    public SystemCredentialBuilder parentType(SystemTypeEnum parentType) {
        systemCredential.setParentType(parentType);
        return this;
    }

    /**
     * The password on the remote system used to authenticate.
     */
    public SystemCredentialBuilder password(String password) {
        systemCredential.setPassword(password);
        return this;
    }

    /**
     * The public ssh key used to authenticate to the remote system..
     */
    public SystemCredentialBuilder privateKey(String privateKey) {
        systemCredential.setPrivateKey(privateKey);
        return this;
    }

    /**
     * The public ssh key used to authenticate to the remote system.
     */
    public SystemCredentialBuilder publicKey(String publicKey) {
        systemCredential.setPublicKey(publicKey);
        return this;
    }

    /**
     * The server from which a credential may be obtained.
     */
    public SystemCredentialBuilder server(SystemAuthConfigServerProtocolTypeEnum server) {
        systemCredential.setServer(server);
        return this;
    }

    /**
     * The authentication type.
     */
    public SystemCredentialBuilder type(AuthenticationTypeEnum type) {
        systemCredential.setType(type);
        return this;
    }

    /**
     * The local username on the remote system used to authenticate.
     */
    public SystemCredentialBuilder username(String username) {
        systemCredential.setUsername(username);
        return this;
    }

    /**
     * Is the credential still valid or has it expired?.
     */
    public SystemCredentialBuilder valid(boolean valid) {
        systemCredential.setValid(valid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SystemCredential build() {
        return systemCredential;
    }
}