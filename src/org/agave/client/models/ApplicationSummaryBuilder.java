/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class ApplicationSummaryBuilder {
    //the instance to build
    private ApplicationSummary applicationSummary;

    /**
     * Default constructor to initialize the instance
     */
    public ApplicationSummaryBuilder() {
        applicationSummary = new ApplicationSummary();
    }

    /**
     * The system id of the execution system where this app should run.
     */
    public ApplicationSummaryBuilder executionSystem(String executionSystem) {
        applicationSummary.setExecutionSystem(executionSystem);
        return this;
    }

    /**
     * Unique id of this app. Comprised of the app name-version.
     */
    public ApplicationSummaryBuilder id(String id) {
        applicationSummary.setId(id);
        return this;
    }

    /**
     * Whether the application is public or private.
     */
    public ApplicationSummaryBuilder isPublic(boolean isPublic) {
        applicationSummary.setIsPublic(isPublic);
        return this;
    }

    /**
     * The date this application was last modified in ISO 8601 format.
     */
    public ApplicationSummaryBuilder lastModified(Date lastModified) {
        applicationSummary.setLastModified(lastModified);
        return this;
    }

    /**
     * The name of the application. The name does not have to be unique, but the combination of name and version does.
     */
    public ApplicationSummaryBuilder name(String name) {
        applicationSummary.setName(name);
        return this;
    }

    /**
     * The number of times this application has been revised.
     */
    public ApplicationSummaryBuilder revision(int revision) {
        applicationSummary.setRevision(revision);
        return this;
    }

    /**
     * The short description of this application.
     */
    public ApplicationSummaryBuilder shortDescription(String shortDescription) {
        applicationSummary.setShortDescription(shortDescription);
        return this;
    }

    /**
     * The version of the application in #.#.# format. While the version does not need to be unique, the combination of name and version does have to be unique.
     */
    public ApplicationSummaryBuilder version(String version) {
        applicationSummary.setVersion(version);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ApplicationSummary build() {
        return applicationSummary;
    }
}