/*
 * AgavePlatformScienceAPILib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 10/07/2015
 */
package org.iplantc.agave.models;

import java.util.*;

public class ApplicationCloneActionBuilder 
        extends ApplicationActionBuilder {
    //the instance to build
    private ApplicationCloneAction applicationCloneAction;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationCloneActionBuilder() {
        applicationCloneAction = new ApplicationCloneAction();
    }

    public ApplicationCloneActionBuilder action(ApplicationActionTypeEnum action) {
        applicationCloneAction.setAction(action);
        return this;
    }

    /**
     * The path on the deployment system where the app assets will be copied during cloning
     */
    public ApplicationCloneActionBuilder deploymentPath(String deploymentPath) {
        applicationCloneAction.setDeploymentPath(deploymentPath);
        return this;
    }

    /**
     * The id of the system on which the app assets will be stored after cloning
     */
    public ApplicationCloneActionBuilder deploymentSystem(String deploymentSystem) {
        applicationCloneAction.setDeploymentSystem(deploymentSystem);
        return this;
    }

    /**
     * The id of the private system on which this app will run after publication
     */
    public ApplicationCloneActionBuilder executionSystem(String executionSystem) {
        applicationCloneAction.setExecutionSystem(executionSystem);
        return this;
    }

    /**
     * The new name of the app after cloning
     */
    public ApplicationCloneActionBuilder name(String name) {
        applicationCloneAction.setName(name);
        return this;
    }

    /**
     * The new version of the app after cloning
     */
    public ApplicationCloneActionBuilder version(String version) {
        applicationCloneAction.setVersion(version);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationCloneAction build() {
        return applicationCloneAction;
    }
}