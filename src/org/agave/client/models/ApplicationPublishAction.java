/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationPublishAction 
        extends ApplicationAction {
    private static final long serialVersionUID = 4959132020571823879L;
    private ApplicationActionTypeEnum action = ApplicationActionTypeEnum.fromString("PUBLISH");
    private String executionSystem;
    private String name;
    private String version;
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
 
    /** GETTER
     * The id of the public system on which this app will run after publication
     */
    @JsonGetter("executionSystem")
    public String getExecutionSystem ( ) { 
        return this.executionSystem;
    }
    
    /** SETTER
     * The id of the public system on which this app will run after publication
     */
    @JsonSetter("executionSystem")
    public void setExecutionSystem (String value) { 
        this.executionSystem = value;
    }
 
    /** GETTER
     * The new name of the app after publication
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The new name of the app after publication
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * The new version of the app after publication
     */
    @JsonGetter("version")
    public String getVersion ( ) { 
        return this.version;
    }
    
    /** SETTER
     * The new version of the app after publication
     */
    @JsonSetter("version")
    public void setVersion (String value) { 
        this.version = value;
    }
 
}
 