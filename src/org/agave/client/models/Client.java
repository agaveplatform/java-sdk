/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Client 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5296972187070334327L;
    private String callbackUrl;
    private String description;
    private String key;
    private String name;
    private String secret;
    private String tier;
    /** GETTER
     * Callback URL for OAuth authentication grant.
     */
    @JsonGetter("callbackUrl")
    public String getCallbackUrl ( ) { 
        return this.callbackUrl;
    }
    
    /** SETTER
     * Callback URL for OAuth authentication grant.
     */
    @JsonSetter("callbackUrl")
    public void setCallbackUrl (String value) { 
        this.callbackUrl = value;
    }
 
    /** GETTER
     * Description of the client. This will be shown to users when authentication via OAuth web flows
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description of the client. This will be shown to users when authentication via OAuth web flows
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * The API key for this client.
     */
    @JsonGetter("key")
    public String getKey ( ) { 
        return this.key;
    }
    
    /** SETTER
     * The API key for this client.
     */
    @JsonSetter("key")
    public void setKey (String value) { 
        this.key = value;
    }
 
    /** GETTER
     * The name of the client.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The name of the client.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * The API secret for this client.
     */
    @JsonGetter("secret")
    public String getSecret ( ) { 
        return this.secret;
    }
    
    /** SETTER
     * The API secret for this client.
     */
    @JsonSetter("secret")
    public void setSecret (String value) { 
        this.secret = value;
    }
 
    /** GETTER
     * The access tier for this client.
     */
    @JsonGetter("tier")
    public String getTier ( ) { 
        return this.tier;
    }
    
    /** SETTER
     * The access tier for this client.
     */
    @JsonSetter("tier")
    public void setTier (String value) { 
        this.tier = value;
    }
 
}
 