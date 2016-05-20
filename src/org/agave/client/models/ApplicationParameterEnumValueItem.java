/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationParameterEnumValueItem 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5215323427401166516L;
    private LinkedHashMap<String, String> key;
    private String value;
    /** GETTER
     * The enumerated value.
     */
    @JsonGetter("key")
    public LinkedHashMap<String, String> getKey ( ) { 
        return this.key;
    }
    
    /** SETTER
     * The enumerated value.
     */
    @JsonSetter("key")
    public void setKey (LinkedHashMap<String, String> value) { 
        this.key = value;
    }
 
    /** GETTER
     * The value of the enumeration to display in a dropdown list
     */
    @JsonGetter("value")
    public String getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * The value of the enumeration to display in a dropdown list
     */
    @JsonSetter("value")
    public void setValue (String value) { 
        this.value = value;
    }
 
}
 