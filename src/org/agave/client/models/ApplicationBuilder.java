/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationBuilder {
    //the instance to build
    private Application application;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationBuilder() {
        application = new Application();
    }

    /**
     * Whether the application is available.
     */
    public ApplicationBuilder available(String available) {
        application.setAvailable(available);
        return this;
    }

    /**
     * Whether the application supports checkpointing.
     */
    public ApplicationBuilder checkpointable(String checkpointable) {
        application.setCheckpointable(checkpointable);
        return this;
    }

    /**
     * The max execution time that should be used if none is given in a job description. Ignore if the system does not support schedulers.
     */
    public ApplicationBuilder defaultMaxRunTime(String defaultMaxRunTime) {
        application.setDefaultMaxRunTime(defaultMaxRunTime);
        return this;
    }

    /**
     * The default memory in GB to pass to the scheduler if none is given in the job description. This must be less than the max memory parameter in the target queue definition.
     */
    public ApplicationBuilder defaultMemoryPerNode(String defaultMemoryPerNode) {
        application.setDefaultMemoryPerNode(defaultMemoryPerNode);
        return this;
    }

    /**
     * The number of nodes that should be used if none is given in a job description. Ignore if the system does not support schedulers.
     */
    public ApplicationBuilder defaultNodeCount(String defaultNodeCount) {
        application.setDefaultNodeCount(defaultNodeCount);
        return this;
    }

    /**
     * The number of processors to pass to the scheduler if none are given in the job description. This must be 1 if the app is serial.
     */
    public ApplicationBuilder defaultProcessorsPerNode(String defaultProcessorsPerNode) {
        application.setDefaultProcessorsPerNode(defaultProcessorsPerNode);
        return this;
    }

    /**
     * The queue on the execution system that should be used if none is given in a job description. Ignore if the system does not support schedulers.
     */
    public ApplicationBuilder defaultQueue(String defaultQueue) {
        application.setDefaultQueue(defaultQueue);
        return this;
    }

    /**
     * The location in the user's default storage system containing the application wrapper and dependencies.
     */
    public ApplicationBuilder deploymentPath(String deploymentPath) {
        application.setDeploymentPath(deploymentPath);
        return this;
    }

    /**
     * The system id of the storage system where this app should run.
     */
    public ApplicationBuilder deploymentSystem(String deploymentSystem) {
        application.setDeploymentSystem(deploymentSystem);
        return this;
    }

    /**
     * The system id of the execution system where this app should run.
     */
    public ApplicationBuilder executionSystem(String executionSystem) {
        application.setExecutionSystem(executionSystem);
        return this;
    }

    /**
     * The execution type of the application. If you're unsure, it's probably HPC.
     */
    public ApplicationBuilder executionType(String executionType) {
        application.setExecutionType(executionType);
        return this;
    }

    /**
     * The URL where users can go for more information about the app.
     */
    public ApplicationBuilder helpURI(String helpURI) {
        application.setHelpURI(helpURI);
        return this;
    }

    /**
     * The icon to associate with this app.
     */
    public ApplicationBuilder icon(String icon) {
        application.setIcon(icon);
        return this;
    }

    /**
     * Unique id of this app. Comprised of the app name-version.
     */
    public ApplicationBuilder id(String id) {
        application.setId(id);
        return this;
    }

    /**
     * The inputs files for this application. 
     */
    public ApplicationBuilder inputs(String inputs) {
        application.setInputs(inputs);
        return this;
    }

    /**
     * Whether the application is public or private.
     */
    public ApplicationBuilder isPublic(String isPublic) {
        application.setIsPublic(isPublic);
        return this;
    }

    /**
     * The label to use when generating forms.
     */
    public ApplicationBuilder label(String label) {
        application.setLabel(label);
        return this;
    }

    /**
     * The date this application was last modified in ISO 8601 format.
     */
    public ApplicationBuilder lastModified(String lastModified) {
        application.setLastModified(lastModified);
        return this;
    }

    /**
     * The full text description of this input to use when generating forms.
     */
    public ApplicationBuilder longDescription(String longDescription) {
        application.setLongDescription(longDescription);
        return this;
    }

    /**
     * An array of modules to load prior to the execution of the application.
     */
    public ApplicationBuilder modules(String modules) {
        application.setModules(modules);
        return this;
    }

    /**
     * The name of the application. The name does not have to be unique, but the combination of name and version does.
     */
    public ApplicationBuilder name(String name) {
        application.setName(name);
        return this;
    }

    /**
     * An array of ontology values describing this application.
     */
    public ApplicationBuilder ontology(String ontology) {
        application.setOntology(ontology);
        return this;
    }

    /**
     * The outputs files for this application. 
     */
    public ApplicationBuilder outputs(String outputs) {
        application.setOutputs(outputs);
        return this;
    }

    /**
     * The parallelism type of the application. If you're unsure, it's probably SERIAL.
     */
    public ApplicationBuilder parallelism(String parallelism) {
        application.setParallelism(parallelism);
        return this;
    }

    /**
     * The inputs parameters for this application. 
     */
    public ApplicationBuilder parameters(String parameters) {
        application.setParameters(parameters);
        return this;
    }

    /**
     * The number of times this application has been revised.
     */
    public ApplicationBuilder revision(String revision) {
        application.setRevision(revision);
        return this;
    }

    /**
     * The short description of this application.
     */
    public ApplicationBuilder shortDescription(String shortDescription) {
        application.setShortDescription(shortDescription);
        return this;
    }

    /**
     * An array of tags related to this application.
     */
    public ApplicationBuilder tags(String tags) {
        application.setTags(tags);
        return this;
    }

    /**
     * The path to the wrapper script relative to the deploymentPath.
     */
    public ApplicationBuilder templatePath(String templatePath) {
        application.setTemplatePath(templatePath);
        return this;
    }

    /**
     * The path to the test script relative to the deploymentPath.
     */
    public ApplicationBuilder testPath(String testPath) {
        application.setTestPath(testPath);
        return this;
    }

    /**
     * The UUID of this application. UUID are 36 alphanumeric string.
     */
    public ApplicationBuilder uuid(String uuid) {
        application.setUuid(uuid);
        return this;
    }

    /**
     * The version of the application in #.#.# format. While the version does not need to be unique, the combination of name and version does have to be unique.
     */
    public ApplicationBuilder version(String version) {
        application.setVersion(version);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Application build() {
        return application;
    }
}