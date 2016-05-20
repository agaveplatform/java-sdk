/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PostItRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4902868506278769995L;
    private String internalUsername;
    private int lifetime;
    private int maxUses;
    private PostItRequestMethodEnum method;
    private boolean noauth;
    private String url;
    /** GETTER
     * The username of the internal user attached to this PostIt.
     */
    @JsonGetter("internalUsername")
    public String getInternalUsername ( ) { 
        return this.internalUsername;
    }
    
    /** SETTER
     * The username of the internal user attached to this PostIt.
     */
    @JsonSetter("internalUsername")
    public void setInternalUsername (String value) { 
        this.internalUsername = value;
    }
 
    /** GETTER
     * The maximum lifetime in seconds of this PostIt on this token. Defaults to 2592000 (30 days)
     */
    @JsonGetter("lifetime")
    public int getLifetime ( ) { 
        return this.lifetime;
    }
    
    /** SETTER
     * The maximum lifetime in seconds of this PostIt on this token. Defaults to 2592000 (30 days)
     */
    @JsonSetter("lifetime")
    public void setLifetime (int value) { 
        this.lifetime = value;
    }
 
    /** GETTER
     * The maximum number of invocations remaining on this PostIt. Defaults to no limit
     */
    @JsonGetter("maxUses")
    public int getMaxUses ( ) { 
        return this.maxUses;
    }
    
    /** SETTER
     * The maximum number of invocations remaining on this PostIt. Defaults to no limit
     */
    @JsonSetter("maxUses")
    public void setMaxUses (int value) { 
        this.maxUses = value;
    }
 
    /** GETTER
     * The method that will be invoked when the PostIt is redeemed.
     */
    @JsonGetter("method")
    public PostItRequestMethodEnum getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * The method that will be invoked when the PostIt is redeemed.
     */
    @JsonSetter("method")
    public void setMethod (PostItRequestMethodEnum value) { 
        this.method = value;
    }
 
    /** GETTER
     * If true, the provided url will be called without authentication. Default is false
     */
    @JsonGetter("noauth")
    public boolean getNoauth ( ) { 
        return this.noauth;
    }
    
    /** SETTER
     * If true, the provided url will be called without authentication. Default is false
     */
    @JsonSetter("noauth")
    public void setNoauth (boolean value) { 
        this.noauth = value;
    }
 
    /** GETTER
     * The url that will be invoked when the PostIt is redeemed.
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * The url that will be invoked when the PostIt is redeemed.
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
}
 