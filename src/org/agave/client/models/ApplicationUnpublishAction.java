/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationUnpublishAction 
        extends ApplicationAction {
    private static final long serialVersionUID = 5756211117528093519L;
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
 