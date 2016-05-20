/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemStorageConfig 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5091339143106965053L;
    private SystemAuthConfig auth;
    private String containerName;
    private String homeDir = "/";
    private String host;
    private Boolean mirror = false;
    private int port;
    private SystemStorageProtocolTypeEnum protocol;
    private String publicAppsDir;
    private String resource;
    private String rootDir = "/";
    private String zone;
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
     * The name of the bucket to interact with when using an object store.
     */
    @JsonGetter("containerName")
    public String getContainerName ( ) { 
        return this.containerName;
    }
    
    /** SETTER
     * The name of the bucket to interact with when using an object store.
     */
    @JsonSetter("containerName")
    public void setContainerName (String value) { 
        this.containerName = value;
    }
 
    /** GETTER
     * The path on the remote system to use as the home directory for all API requests. For cases where the home directory should be dynamically defined, the ${USERNAME} token can be included in the homeDir value to represent the username of the authenticated user. ex. /home/${USERNAME}.
     */
    @JsonGetter("homeDir")
    public String getHomeDir ( ) { 
        return this.homeDir;
    }
    
    /** SETTER
     * The path on the remote system to use as the home directory for all API requests. For cases where the home directory should be dynamically defined, the ${USERNAME} token can be included in the homeDir value to represent the username of the authenticated user. ex. /home/${USERNAME}.
     */
    @JsonSetter("homeDir")
    public void setHomeDir (String value) { 
        this.homeDir = value;
    }
 
    /** GETTER
     * The hostname or ip address of the storage server
     */
    @JsonGetter("host")
    public String getHost ( ) { 
        return this.host;
    }
    
    /** SETTER
     * The hostname or ip address of the storage server
     */
    @JsonSetter("host")
    public void setHost (String value) { 
        this.host = value;
    }
 
    /** GETTER
     * Whether the permissions set on the server should be pushed to the storage system itself. This only applies to IRODS and AWS systems.
     */
    @JsonGetter("mirror")
    public Boolean getMirror ( ) { 
        return this.mirror;
    }
    
    /** SETTER
     * Whether the permissions set on the server should be pushed to the storage system itself. This only applies to IRODS and AWS systems.
     */
    @JsonSetter("mirror")
    public void setMirror (Boolean value) { 
        this.mirror = value;
    }
 
    /** GETTER
     * The port number of the storage server.
     */
    @JsonGetter("port")
    public int getPort ( ) { 
        return this.port;
    }
    
    /** SETTER
     * The port number of the storage server.
     */
    @JsonSetter("port")
    public void setPort (int value) { 
        this.port = value;
    }
 
    /** GETTER
     * The protocol used to authenticate to the storage server.
     */
    @JsonGetter("protocol")
    public SystemStorageProtocolTypeEnum getProtocol ( ) { 
        return this.protocol;
    }
    
    /** SETTER
     * The protocol used to authenticate to the storage server.
     */
    @JsonSetter("protocol")
    public void setProtocol (SystemStorageProtocolTypeEnum value) { 
        this.protocol = value;
    }
 
    /** GETTER
     * The path on the remote system where apps will be stored if this is set as the default public storage system.
     */
    @JsonGetter("publicAppsDir")
    public String getPublicAppsDir ( ) { 
        return this.publicAppsDir;
    }
    
    /** SETTER
     * The path on the remote system where apps will be stored if this is set as the default public storage system.
     */
    @JsonSetter("publicAppsDir")
    public void setPublicAppsDir (String value) { 
        this.publicAppsDir = value;
    }
 
    /** GETTER
     * The name of the target resource when defining an IRODS system.
     */
    @JsonGetter("resource")
    public String getResource ( ) { 
        return this.resource;
    }
    
    /** SETTER
     * The name of the target resource when defining an IRODS system.
     */
    @JsonSetter("resource")
    public void setResource (String value) { 
        this.resource = value;
    }
 
    /** GETTER
     * The path on the remote system to use as the root for all API requests.
     */
    @JsonGetter("rootDir")
    public String getRootDir ( ) { 
        return this.rootDir;
    }
    
    /** SETTER
     * The path on the remote system to use as the root for all API requests.
     */
    @JsonSetter("rootDir")
    public void setRootDir (String value) { 
        this.rootDir = value;
    }
 
    /** GETTER
     * The name of the zone when defining an IRODS system.
     */
    @JsonGetter("zone")
    public String getZone ( ) { 
        return this.zone;
    }
    
    /** SETTER
     * The name of the zone when defining an IRODS system.
     */
    @JsonSetter("zone")
    public void setZone (String value) { 
        this.zone = value;
    }
 
}
 