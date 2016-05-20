/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class JobInputs 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4662413769635507345L;
    private String parameter1;
    /** GETTER
     * One or more inputs identified in the description of the app you're running. 
     */
    @JsonGetter("parameter1")
    public String getParameter1 ( ) { 
        return this.parameter1;
    }
    
    /** SETTER
     * One or more inputs identified in the description of the app you're running. 
     */
    @JsonSetter("parameter1")
    public void setParameter1 (String value) { 
        this.parameter1 = value;
    }
 
}
 