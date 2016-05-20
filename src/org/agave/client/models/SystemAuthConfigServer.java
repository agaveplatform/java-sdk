/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemAuthConfigServer 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5492091527751955683L;
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
 