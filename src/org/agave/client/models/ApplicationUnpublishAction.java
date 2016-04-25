/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationUnpublishAction 
        extends ApplicationAction {
    private static final long serialVersionUID = 5032277439477271966L;
    private ApplicationActionTypeEnum action = ApplicationActionTypeEnum.fromString("UNPUBLISH");
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("action")
    public ApplicationActionTypeEnum getAction ( ) { 
        return this.action;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("action")
    private void setAction (ApplicationActionTypeEnum value) { 
        this.action = value;
    }
 
}
 