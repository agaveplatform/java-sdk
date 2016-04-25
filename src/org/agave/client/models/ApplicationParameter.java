/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationParameter 
        extends ApplicationArgument {
    private static final long serialVersionUID = 5175111844599111040L;
    private AbstractApplicationParameterValue value;
    /** GETTER
     * The inputs files for this parameter. 
     */
    @JsonGetter("value")
    public AbstractApplicationParameterValue getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * The inputs files for this parameter. 
     */
    @JsonSetter("value")
    public void setValue (AbstractApplicationParameterValue value) { 
        this.value = value;
    }
 
}
 