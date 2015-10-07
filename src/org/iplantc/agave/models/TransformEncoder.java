/*
 * AgavePlatformScienceAPILib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 10/07/2015
 */
package org.iplantc.agave.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TransformEncoder 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5271521240850231914L;
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
 