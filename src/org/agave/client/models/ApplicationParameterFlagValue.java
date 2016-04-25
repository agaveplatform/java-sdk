/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationParameterFlagValue 
        extends AbstractApplicationParameterValue {
    private static final long serialVersionUID = 4864942269043933089L;
    private String type = "flag";
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
 