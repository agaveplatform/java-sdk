/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationParameter 
        extends ApplicationArgument {
    private static final long serialVersionUID = 4925674880266642758L;
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
 