/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TransformEncoder 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5487787014050868640L;
    private String description;
    private String name;
    /** GETTER
     * The description of what this encoder is and what it does.
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * The description of what this encoder is and what it does.
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * The encoder name.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The encoder name.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
}
 