/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PermissionStanza 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5188991383183721237L;
    private boolean read = false;
    private boolean write = false;
    /** GETTER
     * Is the resource readable
     */
    @JsonGetter("read")
    public boolean getRead ( ) { 
        return this.read;
    }
    
    /** SETTER
     * Is the resource readable
     */
    @JsonSetter("read")
    public void setRead (boolean value) { 
        this.read = value;
    }
 
    /** GETTER
     * Is the resource writable
     */
    @JsonGetter("write")
    public boolean getWrite ( ) { 
        return this.write;
    }
    
    /** SETTER
     * Is the resource writable
     */
    @JsonSetter("write")
    public void setWrite (boolean value) { 
        this.write = value;
    }
 
}
 