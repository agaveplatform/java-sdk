/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ClientSubscriptionRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5754506044229860341L;
    private String apiName;
    private String apiProvider;
    private String apiVersion;
    private ClientSubscriptionTierEnum tier;
    /** GETTER
     * The name of the API.
     */
    @JsonGetter("apiName")
    public String getApiName ( ) { 
        return this.apiName;
    }
    
    /** SETTER
     * The name of the API.
     */
    @JsonSetter("apiName")
    public void setApiName (String value) { 
        this.apiName = value;
    }
 
    /** GETTER
     * The user who registered the API.
     */
    @JsonGetter("apiProvider")
    public String getApiProvider ( ) { 
        return this.apiProvider;
    }
    
    /** SETTER
     * The user who registered the API.
     */
    @JsonSetter("apiProvider")
    public void setApiProvider (String value) { 
        this.apiProvider = value;
    }
 
    /** GETTER
     * The current major version of the API. This is appended to the api_context to create the base API url.
     */
    @JsonGetter("apiVersion")
    public String getApiVersion ( ) { 
        return this.apiVersion;
    }
    
    /** SETTER
     * The current major version of the API. This is appended to the api_context to create the base API url.
     */
    @JsonSetter("apiVersion")
    public void setApiVersion (String value) { 
        this.apiVersion = value;
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
 