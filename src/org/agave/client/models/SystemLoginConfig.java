/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemLoginConfig 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4876182913316869630L;
    private SystemAuthConfig auth;
    private String host;
    private int port;
    private SystemLoginProtocolTypeEnum protocol;
    /** GETTER
     * The default authentication credential used for this system.
     */
    @JsonGetter("auth")
    public SystemAuthConfig getAuth ( ) { 
        return this.auth;
    }
    
    /** SETTER
     * The default authentication credential used for this system.
     */
    @JsonSetter("auth")
    public void setAuth (SystemAuthConfig value) { 
        this.auth = value;
    }
 
    /** GETTER
     * The hostname or ip address of the submission server
     */
    @JsonGetter("host")
    public String getHost ( ) { 
        return this.host;
    }
    
    /** SETTER
     * The hostname or ip address of the submission server
     */
    @JsonSetter("host")
    public void setHost (String value) { 
        this.host = value;
    }
 
    /** GETTER
     * The port number of the submission server.
     */
    @JsonGetter("port")
    public int getPort ( ) { 
        return this.port;
    }
    
    /** SETTER
     * The port number of the submission server.
     */
    @JsonSetter("port")
    public void setPort (int value) { 
        this.port = value;
    }
 
    /** GETTER
     * The protocol used to authenticate to the submission server.
     */
    @JsonGetter("protocol")
    public SystemLoginProtocolTypeEnum getProtocol ( ) { 
        return this.protocol;
    }
    
    /** SETTER
     * The protocol used to authenticate to the submission server.
     */
    @JsonSetter("protocol")
    public void setProtocol (SystemLoginProtocolTypeEnum value) { 
        this.protocol = value;
    }
 
}
 