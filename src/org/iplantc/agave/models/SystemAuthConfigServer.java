/*
 * AgavePlatformScienceAPILib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 10/07/2015
 */
package org.iplantc.agave.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemAuthConfigServer 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4937445126724300339L;
    private String endpoint;
    private int port;
    private SystemAuthConfigServerProtocolTypeEnum protocol;
    /** GETTER
     * The hostname or ip address of the remote server.
     */
    @JsonGetter("endpoint")
    public String getEndpoint ( ) { 
        return this.endpoint;
    }
    
    /** SETTER
     * The hostname or ip address of the remote server.
     */
    @JsonSetter("endpoint")
    public void setEndpoint (String value) { 
        this.endpoint = value;
    }
 
    /** GETTER
     * The port number of the remote server..
     */
    @JsonGetter("port")
    public int getPort ( ) { 
        return this.port;
    }
    
    /** SETTER
     * The port number of the remote server..
     */
    @JsonSetter("port")
    public void setPort (int value) { 
        this.port = value;
    }
 
    /** GETTER
     * The protocol used to obtain a credential from the remote server.
     */
    @JsonGetter("protocol")
    public SystemAuthConfigServerProtocolTypeEnum getProtocol ( ) { 
        return this.protocol;
    }
    
    /** SETTER
     * The protocol used to obtain a credential from the remote server.
     */
    @JsonSetter("protocol")
    public void setProtocol (SystemAuthConfigServerProtocolTypeEnum value) { 
        this.protocol = value;
    }
 
}
 