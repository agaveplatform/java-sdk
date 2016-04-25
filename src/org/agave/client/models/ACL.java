/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ACL 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5119995912424172479L;
    private boolean execute;
    private boolean read;
    private boolean write;
    /** GETTER
     * can execute
     */
    @JsonGetter("execute")
    public boolean getExecute ( ) { 
        return this.execute;
    }
    
    /** SETTER
     * can execute
     */
    @JsonSetter("execute")
    public void setExecute (boolean value) { 
        this.execute = value;
    }
 
    /** GETTER
     * can read
     */
    @JsonGetter("read")
    public boolean getRead ( ) { 
        return this.read;
    }
    
    /** SETTER
     * can read
     */
    @JsonSetter("read")
    public void setRead (boolean value) { 
        this.read = value;
    }
 
    /** GETTER
     * can write
     */
    @JsonGetter("write")
    public boolean getWrite ( ) { 
        return this.write;
    }
    
    /** SETTER
     * can write
     */
    @JsonSetter("write")
    public void setWrite (boolean value) { 
        this.write = value;
    }
 
}
 