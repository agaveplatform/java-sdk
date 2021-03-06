/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemAuthConfig 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5544196571360084374L;
    private String caCerts;
    private String credential;
    private String internalUsername;
    private String password;
    private String privateKey;
    private String publicKey;
    private SystemAuthConfigServer server;
    private SystemLoginAuthenticationTypeEnum type;
    private String username;
    /** GETTER
     * A public URL to the location of the trusted CA certs to use with this credential.
     */
    @JsonGetter("caCerts")
    public String getCaCerts ( ) { 
        return this.caCerts;
    }
    
    /** SETTER
     * A public URL to the location of the trusted CA certs to use with this credential.
     */
    @JsonSetter("caCerts")
    public void setCaCerts (String value) { 
        this.caCerts = value;
    }
 
    /** GETTER
     * The credential used to authenticate to the remote system. Depending on the authentication protocol of the remote system, this could be an OAuth Token, X.509 certificate, Kerberose token, or an private key..
     */
    @JsonGetter("credential")
    public String getCredential ( ) { 
        return this.credential;
    }
    
    /** SETTER
     * The credential used to authenticate to the remote system. Depending on the authentication protocol of the remote system, this could be an OAuth Token, X.509 certificate, Kerberose token, or an private key..
     */
    @JsonSetter("credential")
    public void setCredential (String value) { 
        this.credential = value;
    }
 
    /** GETTER
     * The username of the internal user associated with this credential.
     */
    @JsonGetter("internalUsername")
    public String getInternalUsername ( ) { 
        return this.internalUsername;
    }
    
    /** SETTER
     * The username of the internal user associated with this credential.
     */
    @JsonSetter("internalUsername")
    public void setInternalUsername (String value) { 
        this.internalUsername = value;
    }
 
    /** GETTER
     * The password on the remote system used to authenticate.
     */
    @JsonGetter("password")
    public String getPassword ( ) { 
        return this.password;
    }
    
    /** SETTER
     * The password on the remote system used to authenticate.
     */
    @JsonSetter("password")
    public void setPassword (String value) { 
        this.password = value;
    }
 
    /** GETTER
     * The public ssh key used to authenticate to the remote system..
     */
    @JsonGetter("privateKey")
    public String getPrivateKey ( ) { 
        return this.privateKey;
    }
    
    /** SETTER
     * The public ssh key used to authenticate to the remote system..
     */
    @JsonSetter("privateKey")
    public void setPrivateKey (String value) { 
        this.privateKey = value;
    }
 
    /** GETTER
     * The public ssh key used to authenticate to the remote system.
     */
    @JsonGetter("publicKey")
    public String getPublicKey ( ) { 
        return this.publicKey;
    }
    
    /** SETTER
     * The public ssh key used to authenticate to the remote system.
     */
    @JsonSetter("publicKey")
    public void setPublicKey (String value) { 
        this.publicKey = value;
    }
 
    /** GETTER
     * The server from which a credential may be obtained.
     */
    @JsonGetter("server")
    public SystemAuthConfigServer getServer ( ) { 
        return this.server;
    }
    
    /** SETTER
     * The server from which a credential may be obtained.
     */
    @JsonSetter("server")
    public void setServer (SystemAuthConfigServer value) { 
        this.server = value;
    }
 
    /** GETTER
     * The authentication type.
     */
    @JsonGetter("type")
    public SystemLoginAuthenticationTypeEnum getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The authentication type.
     */
    @JsonSetter("type")
    public void setType (SystemLoginAuthenticationTypeEnum value) { 
        this.type = value;
    }
 
    /** GETTER
     * The local username on the remote system used to authenticate.
     */
    @JsonGetter("username")
    public String getUsername ( ) { 
        return this.username;
    }
    
    /** SETTER
     * The local username on the remote system used to authenticate.
     */
    @JsonSetter("username")
    public void setUsername (String value) { 
        this.username = value;
    }
 
}
 