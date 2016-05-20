/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemCredential 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4792879092607056777L;
    private String caCerts;
    private String credential;
    private Date expirationDate;
    private String internalUsername;
    private boolean isDefault;
    private SystemTypeEnum parentType;
    private String password;
    private String privateKey;
    private String publicKey;
    private SystemAuthConfigServerProtocolTypeEnum server;
    private AuthenticationTypeEnum type;
    private String username;
    private boolean valid;
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
     * The date the credential expires in ISO 8601 format.
     */
    @JsonGetter("expirationDate")
    public Date getExpirationDate ( ) { 
        return this.expirationDate;
    }
    
    /** SETTER
     * The date the credential expires in ISO 8601 format.
     */
    @JsonSetter("expirationDate")
    public void setExpirationDate (Date value) { 
        this.expirationDate = value;
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
     * Is this the default credential for this internal user of this type on this system?
     */
    @JsonGetter("isDefault")
    public boolean getIsDefault ( ) { 
        return this.isDefault;
    }
    
    /** SETTER
     * Is this the default credential for this internal user of this type on this system?
     */
    @JsonSetter("isDefault")
    public void setIsDefault (boolean value) { 
        this.isDefault = value;
    }
 
    /** GETTER
     * The system type this credential is associated with.
     */
    @JsonGetter("parentType")
    public SystemTypeEnum getParentType ( ) { 
        return this.parentType;
    }
    
    /** SETTER
     * The system type this credential is associated with.
     */
    @JsonSetter("parentType")
    public void setParentType (SystemTypeEnum value) { 
        this.parentType = value;
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
    public SystemAuthConfigServerProtocolTypeEnum getServer ( ) { 
        return this.server;
    }
    
    /** SETTER
     * The server from which a credential may be obtained.
     */
    @JsonSetter("server")
    public void setServer (SystemAuthConfigServerProtocolTypeEnum value) { 
        this.server = value;
    }
 
    /** GETTER
     * The authentication type.
     */
    @JsonGetter("type")
    public AuthenticationTypeEnum getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The authentication type.
     */
    @JsonSetter("type")
    public void setType (AuthenticationTypeEnum value) { 
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
 
    /** GETTER
     * Is the credential still valid or has it expired?.
     */
    @JsonGetter("valid")
    public boolean getValid ( ) { 
        return this.valid;
    }
    
    /** SETTER
     * Is the credential still valid or has it expired?.
     */
    @JsonSetter("valid")
    public void setValid (boolean value) { 
        this.valid = value;
    }
 
}
 