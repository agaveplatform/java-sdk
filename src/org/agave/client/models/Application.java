/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Application 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4855413500355691370L;
    private String available;
    private String checkpointable;
    private String defaultMaxRunTime;
    private String defaultMemoryPerNode;
    private String defaultNodeCount;
    private String defaultProcessorsPerNode;
    private String defaultQueue;
    private String deploymentPath;
    private String deploymentSystem;
    private String executionSystem;
    private String executionType;
    private String helpURI;
    private String icon;
    private String id;
    private String inputs;
    private String isPublic;
    private String label;
    private String lastModified;
    private String longDescription;
    private String modules;
    private String name;
    private String ontology;
    private String outputs;
    private String parallelism;
    private String parameters;
    private String revision;
    private String shortDescription;
    private String tags;
    private String templatePath;
    private String testPath;
    private String uuid;
    private String version;
    /** GETTER
     * Whether the application is available.
     */
    @JsonGetter("available")
    public String getAvailable ( ) { 
        return this.available;
    }
    
    /** SETTER
     * Whether the application is available.
     */
    @JsonSetter("available")
    public void setAvailable (String value) { 
        this.available = value;
    }
 
    /** GETTER
     * Whether the application supports checkpointing.
     */
    @JsonGetter("checkpointable")
    public String getCheckpointable ( ) { 
        return this.checkpointable;
    }
    
    /** SETTER
     * Whether the application supports checkpointing.
     */
    @JsonSetter("checkpointable")
    public void setCheckpointable (String value) { 
        this.checkpointable = value;
    }
 
    /** GETTER
     * The max execution time that should be used if none is given in a job description. Ignore if the system does not support schedulers.
     */
    @JsonGetter("defaultMaxRunTime")
    public String getDefaultMaxRunTime ( ) { 
        return this.defaultMaxRunTime;
    }
    
    /** SETTER
     * The max execution time that should be used if none is given in a job description. Ignore if the system does not support schedulers.
     */
    @JsonSetter("defaultMaxRunTime")
    public void setDefaultMaxRunTime (String value) { 
        this.defaultMaxRunTime = value;
    }
 
    /** GETTER
     * The default memory in GB to pass to the scheduler if none is given in the job description. This must be less than the max memory parameter in the target queue definition.
     */
    @JsonGetter("defaultMemoryPerNode")
    public String getDefaultMemoryPerNode ( ) { 
        return this.defaultMemoryPerNode;
    }
    
    /** SETTER
     * The default memory in GB to pass to the scheduler if none is given in the job description. This must be less than the max memory parameter in the target queue definition.
     */
    @JsonSetter("defaultMemoryPerNode")
    public void setDefaultMemoryPerNode (String value) { 
        this.defaultMemoryPerNode = value;
    }
 
    /** GETTER
     * The number of nodes that should be used if none is given in a job description. Ignore if the system does not support schedulers.
     */
    @JsonGetter("defaultNodeCount")
    public String getDefaultNodeCount ( ) { 
        return this.defaultNodeCount;
    }
    
    /** SETTER
     * The number of nodes that should be used if none is given in a job description. Ignore if the system does not support schedulers.
     */
    @JsonSetter("defaultNodeCount")
    public void setDefaultNodeCount (String value) { 
        this.defaultNodeCount = value;
    }
 
    /** GETTER
     * The number of processors to pass to the scheduler if none are given in the job description. This must be 1 if the app is serial.
     */
    @JsonGetter("defaultProcessorsPerNode")
    public String getDefaultProcessorsPerNode ( ) { 
        return this.defaultProcessorsPerNode;
    }
    
    /** SETTER
     * The number of processors to pass to the scheduler if none are given in the job description. This must be 1 if the app is serial.
     */
    @JsonSetter("defaultProcessorsPerNode")
    public void setDefaultProcessorsPerNode (String value) { 
        this.defaultProcessorsPerNode = value;
    }
 
    /** GETTER
     * The queue on the execution system that should be used if none is given in a job description. Ignore if the system does not support schedulers.
     */
    @JsonGetter("defaultQueue")
    public String getDefaultQueue ( ) { 
        return this.defaultQueue;
    }
    
    /** SETTER
     * The queue on the execution system that should be used if none is given in a job description. Ignore if the system does not support schedulers.
     */
    @JsonSetter("defaultQueue")
    public void setDefaultQueue (String value) { 
        this.defaultQueue = value;
    }
 
    /** GETTER
     * The location in the user's default storage system containing the application wrapper and dependencies.
     */
    @JsonGetter("deploymentPath")
    public String getDeploymentPath ( ) { 
        return this.deploymentPath;
    }
    
    /** SETTER
     * The location in the user's default storage system containing the application wrapper and dependencies.
     */
    @JsonSetter("deploymentPath")
    public void setDeploymentPath (String value) { 
        this.deploymentPath = value;
    }
 
    /** GETTER
     * The system id of the storage system where this app should run.
     */
    @JsonGetter("deploymentSystem")
    public String getDeploymentSystem ( ) { 
        return this.deploymentSystem;
    }
    
    /** SETTER
     * The system id of the storage system where this app should run.
     */
    @JsonSetter("deploymentSystem")
    public void setDeploymentSystem (String value) { 
        this.deploymentSystem = value;
    }
 
    /** GETTER
     * The system id of the execution system where this app should run.
     */
    @JsonGetter("executionSystem")
    public String getExecutionSystem ( ) { 
        return this.executionSystem;
    }
    
    /** SETTER
     * The system id of the execution system where this app should run.
     */
    @JsonSetter("executionSystem")
    public void setExecutionSystem (String value) { 
        this.executionSystem = value;
    }
 
    /** GETTER
     * The execution type of the application. If you're unsure, it's probably HPC.
     */
    @JsonGetter("executionType")
    public String getExecutionType ( ) { 
        return this.executionType;
    }
    
    /** SETTER
     * The execution type of the application. If you're unsure, it's probably HPC.
     */
    @JsonSetter("executionType")
    public void setExecutionType (String value) { 
        this.executionType = value;
    }
 
    /** GETTER
     * The URL where users can go for more information about the app.
     */
    @JsonGetter("helpURI")
    public String getHelpURI ( ) { 
        return this.helpURI;
    }
    
    /** SETTER
     * The URL where users can go for more information about the app.
     */
    @JsonSetter("helpURI")
    public void setHelpURI (String value) { 
        this.helpURI = value;
    }
 
    /** GETTER
     * The icon to associate with this app.
     */
    @JsonGetter("icon")
    public String getIcon ( ) { 
        return this.icon;
    }
    
    /** SETTER
     * The icon to associate with this app.
     */
    @JsonSetter("icon")
    public void setIcon (String value) { 
        this.icon = value;
    }
 
    /** GETTER
     * Unique id of this app. Comprised of the app name-version.
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * Unique id of this app. Comprised of the app name-version.
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * The inputs files for this application. 
     */
    @JsonGetter("inputs")
    public String getInputs ( ) { 
        return this.inputs;
    }
    
    /** SETTER
     * The inputs files for this application. 
     */
    @JsonSetter("inputs")
    public void setInputs (String value) { 
        this.inputs = value;
    }
 
    /** GETTER
     * Whether the application is public or private.
     */
    @JsonGetter("isPublic")
    public String getIsPublic ( ) { 
        return this.isPublic;
    }
    
    /** SETTER
     * Whether the application is public or private.
     */
    @JsonSetter("isPublic")
    public void setIsPublic (String value) { 
        this.isPublic = value;
    }
 
    /** GETTER
     * The label to use when generating forms.
     */
    @JsonGetter("label")
    public String getLabel ( ) { 
        return this.label;
    }
    
    /** SETTER
     * The label to use when generating forms.
     */
    @JsonSetter("label")
    public void setLabel (String value) { 
        this.label = value;
    }
 
    /** GETTER
     * The date this application was last modified in ISO 8601 format.
     */
    @JsonGetter("lastModified")
    public String getLastModified ( ) { 
        return this.lastModified;
    }
    
    /** SETTER
     * The date this application was last modified in ISO 8601 format.
     */
    @JsonSetter("lastModified")
    public void setLastModified (String value) { 
        this.lastModified = value;
    }
 
    /** GETTER
     * The full text description of this input to use when generating forms.
     */
    @JsonGetter("longDescription")
    public String getLongDescription ( ) { 
        return this.longDescription;
    }
    
    /** SETTER
     * The full text description of this input to use when generating forms.
     */
    @JsonSetter("longDescription")
    public void setLongDescription (String value) { 
        this.longDescription = value;
    }
 
    /** GETTER
     * An array of modules to load prior to the execution of the application.
     */
    @JsonGetter("modules")
    public String getModules ( ) { 
        return this.modules;
    }
    
    /** SETTER
     * An array of modules to load prior to the execution of the application.
     */
    @JsonSetter("modules")
    public void setModules (String value) { 
        this.modules = value;
    }
 
    /** GETTER
     * The name of the application. The name does not have to be unique, but the combination of name and version does.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The name of the application. The name does not have to be unique, but the combination of name and version does.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * An array of ontology values describing this application.
     */
    @JsonGetter("ontology")
    public String getOntology ( ) { 
        return this.ontology;
    }
    
    /** SETTER
     * An array of ontology values describing this application.
     */
    @JsonSetter("ontology")
    public void setOntology (String value) { 
        this.ontology = value;
    }
 
    /** GETTER
     * The outputs files for this application. 
     */
    @JsonGetter("outputs")
    public String getOutputs ( ) { 
        return this.outputs;
    }
    
    /** SETTER
     * The outputs files for this application. 
     */
    @JsonSetter("outputs")
    public void setOutputs (String value) { 
        this.outputs = value;
    }
 
    /** GETTER
     * The parallelism type of the application. If you're unsure, it's probably SERIAL.
     */
    @JsonGetter("parallelism")
    public String getParallelism ( ) { 
        return this.parallelism;
    }
    
    /** SETTER
     * The parallelism type of the application. If you're unsure, it's probably SERIAL.
     */
    @JsonSetter("parallelism")
    public void setParallelism (String value) { 
        this.parallelism = value;
    }
 
    /** GETTER
     * The inputs parameters for this application. 
     */
    @JsonGetter("parameters")
    public String getParameters ( ) { 
        return this.parameters;
    }
    
    /** SETTER
     * The inputs parameters for this application. 
     */
    @JsonSetter("parameters")
    public void setParameters (String value) { 
        this.parameters = value;
    }
 
    /** GETTER
     * The number of times this application has been revised.
     */
    @JsonGetter("revision")
    public String getRevision ( ) { 
        return this.revision;
    }
    
    /** SETTER
     * The number of times this application has been revised.
     */
    @JsonSetter("revision")
    public void setRevision (String value) { 
        this.revision = value;
    }
 
    /** GETTER
     * The short description of this application.
     */
    @JsonGetter("shortDescription")
    public String getShortDescription ( ) { 
        return this.shortDescription;
    }
    
    /** SETTER
     * The short description of this application.
     */
    @JsonSetter("shortDescription")
    public void setShortDescription (String value) { 
        this.shortDescription = value;
    }
 
    /** GETTER
     * An array of tags related to this application.
     */
    @JsonGetter("tags")
    public String getTags ( ) { 
        return this.tags;
    }
    
    /** SETTER
     * An array of tags related to this application.
     */
    @JsonSetter("tags")
    public void setTags (String value) { 
        this.tags = value;
    }
 
    /** GETTER
     * The path to the wrapper script relative to the deploymentPath.
     */
    @JsonGetter("templatePath")
    public String getTemplatePath ( ) { 
        return this.templatePath;
    }
    
    /** SETTER
     * The path to the wrapper script relative to the deploymentPath.
     */
    @JsonSetter("templatePath")
    public void setTemplatePath (String value) { 
        this.templatePath = value;
    }
 
    /** GETTER
     * The path to the test script relative to the deploymentPath.
     */
    @JsonGetter("testPath")
    public String getTestPath ( ) { 
        return this.testPath;
    }
    
    /** SETTER
     * The path to the test script relative to the deploymentPath.
     */
    @JsonSetter("testPath")
    public void setTestPath (String value) { 
        this.testPath = value;
    }
 
    /** GETTER
     * The UUID of this application. UUID are 36 alphanumeric string.
     */
    @JsonGetter("uuid")
    public String getUuid ( ) { 
        return this.uuid;
    }
    
    /** SETTER
     * The UUID of this application. UUID are 36 alphanumeric string.
     */
    @JsonSetter("uuid")
    public void setUuid (String value) { 
        this.uuid = value;
    }
 
    /** GETTER
     * The version of the application in #.#.# format. While the version does not need to be unique, the combination of name and version does have to be unique.
     */
    @JsonGetter("version")
    public String getVersion ( ) { 
        return this.version;
    }
    
    /** SETTER
     * The version of the application in #.#.# format. While the version does not need to be unique, the combination of name and version does have to be unique.
     */
    @JsonSetter("version")
    public void setVersion (String value) { 
        this.version = value;
    }
 
}
 