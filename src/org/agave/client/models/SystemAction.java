/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SystemAction 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5488275939945511744L;
    private SystemActionTypeEnum action;
    /** GETTER
     * Action to perform on the system.
     */
    @JsonGetter("action")
    public SystemActionTypeEnum getAction ( ) { 
        return this.action;
    }
    
    /** SETTER
     * Action to perform on the system.
     */
    @JsonSetter("action")
    public void setAction (SystemActionTypeEnum value) { 
        this.action = value;
    }
 
}
 