/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationCloneAction 
        extends ApplicationAction {
    private static final long serialVersionUID = 5688659727450346864L;
    private ApplicationActionTypeEnum action = ApplicationActionTypeEnum.fromString("CLONE");
    private String deploymentPath;
    private String deploymentSystem;
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
     * The path on the deployment system where the app assets will be copied during cloning
     */
    @JsonGetter("deploymentPath")
    public String getDeploymentPath ( ) { 
        return this.deploymentPath;
    }
    
    /** SETTER
     * The path on the deployment system where the app assets will be copied during cloning
     */
    @JsonSetter("deploymentPath")
    public void setDeploymentPath (String value) { 
        this.deploymentPath = value;
    }
 
    /** GETTER
     * The id of the system on which the app assets will be stored after cloning
     */
    @JsonGetter("deploymentSystem")
    public String getDeploymentSystem ( ) { 
        return this.deploymentSystem;
    }
    
    /** SETTER
     * The id of the system on which the app assets will be stored after cloning
     */
    @JsonSetter("deploymentSystem")
    public void setDeploymentSystem (String value) { 
        this.deploymentSystem = value;
    }
 
    /** GETTER
     * The id of the private system on which this app will run after publication
     */
    @JsonGetter("executionSystem")
    public String getExecutionSystem ( ) { 
        return this.executionSystem;
    }
    
    /** SETTER
     * The id of the private system on which this app will run after publication
     */
    @JsonSetter("executionSystem")
    public void setExecutionSystem (String value) { 
        this.executionSystem = value;
    }
 
    /** GETTER
     * The new name of the app after cloning
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The new name of the app after cloning
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * The new version of the app after cloning
     */
    @JsonGetter("version")
    public String getVersion ( ) { 
        return this.version;
    }
    
    /** SETTER
     * The new version of the app after cloning
     */
    @JsonSetter("version")
    public void setVersion (String value) { 
        this.version = value;
    }
 
}
 