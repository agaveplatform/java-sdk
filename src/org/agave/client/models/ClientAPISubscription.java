/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ClientAPISubscription 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5468499093735423719L;
    private String apiContext;
    private String apiName;
    private String apiProvider;
    private String apiVersion;
    private ClientAPISubscriptionStatusTypeEnum status;
    private ClientSubscriptionTierEnum tier;
    /** GETTER
     * The base url path of the API.
     */
    @JsonGetter("apiContext")
    public String getApiContext ( ) { 
        return this.apiContext;
    }
    
    /** SETTER
     * The base url path of the API.
     */
    @JsonSetter("apiContext")
    public void setApiContext (String value) { 
        this.apiContext = value;
    }
 
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
     * The current status of the API.
     */
    @JsonGetter("status")
    public ClientAPISubscriptionStatusTypeEnum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * The current status of the API.
     */
    @JsonSetter("status")
    public void setStatus (ClientAPISubscriptionStatusTypeEnum value) { 
        this.status = value;
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
 