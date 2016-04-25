/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TransformDecoder 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5371077140318943191L;
    private String description;
    private String name;
    /** GETTER
     * The description of what this decoder is and what it does.
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * The description of what this decoder is and what it does.
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * The decoder name.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The decoder name.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
}
 