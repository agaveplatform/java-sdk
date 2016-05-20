/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TransformRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5615753705031312556L;
    private String callbackUrl;
    private String nativeFormat;
    private String url;
    /** GETTER
     * The URI to notify when the transfer is complete. This can be an email address or http URL. If a URL is given, a GET will be made to this address. URL templating is supported. Valid template values are: ${NAME}, ${SOURCE_FORMAT}, ${DEST_FORMAT}, ${STATUS}
     */
    @JsonGetter("callbackUrl")
    public String getCallbackUrl ( ) { 
        return this.callbackUrl;
    }
    
    /** SETTER
     * The URI to notify when the transfer is complete. This can be an email address or http URL. If a URL is given, a GET will be made to this address. URL templating is supported. Valid template values are: ${NAME}, ${SOURCE_FORMAT}, ${DEST_FORMAT}, ${STATUS}
     */
    @JsonSetter("callbackUrl")
    public void setCallbackUrl (String value) { 
        this.callbackUrl = value;
    }
 
    /** GETTER
     * The original file type of the file. If not given, the file type is assumed to be raw.
     */
    @JsonGetter("nativeFormat")
    public String getNativeFormat ( ) { 
        return this.nativeFormat;
    }
    
    /** SETTER
     * The original file type of the file. If not given, the file type is assumed to be raw.
     */
    @JsonSetter("nativeFormat")
    public void setNativeFormat (String value) { 
        this.nativeFormat = value;
    }
 
    /** GETTER
     * The uri to which the transformed file will be staged.
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * The uri to which the transformed file will be staged.
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
}
 