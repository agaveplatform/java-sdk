/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PostItModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4911893482706080047L;
    private Date created;
    private String creator;
    private Date expires;
    private String internalUsername;
    private String method;
    private boolean noauth;
    private String postit;
    private int remainingUses;
    private String url;
    /** GETTER
     * The creation date in ISO 8601 format.
     */
    @JsonGetter("created")
    public Date getCreated ( ) { 
        return this.created;
    }
    
    /** SETTER
     * The creation date in ISO 8601 format.
     */
    @JsonSetter("created")
    public void setCreated (Date value) { 
        this.created = value;
    }
 
    /** GETTER
     * The api user who made the PostIt creation request.
     */
    @JsonGetter("creator")
    public String getCreator ( ) { 
        return this.creator;
    }
    
    /** SETTER
     * The api user who made the PostIt creation request.
     */
    @JsonSetter("creator")
    public void setCreator (String value) { 
        this.creator = value;
    }
 
    /** GETTER
     * The expiration date in ISO 8601 format.
     */
    @JsonGetter("expires")
    public Date getExpires ( ) { 
        return this.expires;
    }
    
    /** SETTER
     * The expiration date in ISO 8601 format.
     */
    @JsonSetter("expires")
    public void setExpires (Date value) { 
        this.expires = value;
    }
 
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
     * The url that will be invoked when the PostIt is redeemed.
     */
    @JsonGetter("method")
    public String getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * The url that will be invoked when the PostIt is redeemed.
     */
    @JsonSetter("method")
    public void setMethod (String value) { 
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
     * The PostIt nonce.
     */
    @JsonGetter("postit")
    public String getPostit ( ) { 
        return this.postit;
    }
    
    /** SETTER
     * The PostIt nonce.
     */
    @JsonSetter("postit")
    public void setPostit (String value) { 
        this.postit = value;
    }
 
    /** GETTER
     * The number of invocations remaining on this token. 
     */
    @JsonGetter("remainingUses")
    public int getRemainingUses ( ) { 
        return this.remainingUses;
    }
    
    /** SETTER
     * The number of invocations remaining on this token. 
     */
    @JsonSetter("remainingUses")
    public void setRemainingUses (int value) { 
        this.remainingUses = value;
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
 