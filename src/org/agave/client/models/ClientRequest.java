/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ClientRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5317679078997773713L;
    private String callbackUrl;
    private String description;
    private String name;
    private ClientSubscriptionTierEnum tier = ClientSubscriptionTierEnum.fromString("UNLIMITED");
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
     * The access tier for this client.
     */
    @JsonGetter("tier")
    public ClientSubscriptionTierEnum getTier ( ) { 
        return this.tier;
    }
    
    /** SETTER
     * The access tier for this client.
     */
    @JsonSetter("tier")
    public void setTier (ClientSubscriptionTierEnum value) { 
        this.tier = value;
    }
 
}
 