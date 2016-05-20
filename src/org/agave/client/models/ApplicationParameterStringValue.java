/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationParameterStringValue 
        extends ApplicationArgumentValue {
    private static final long serialVersionUID = 5483204705205641604L;
    private String type = "STRING";
    /** GETTER
     * The primary type of this parameter
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The primary type of this parameter
     */
    @JsonSetter("type")
    private void setType (String value) { 
        this.type = value;
    }
 
}
 