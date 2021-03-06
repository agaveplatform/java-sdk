/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class SystemBuilder {
    //the instance to build
    private System system;

    /**
     * Default constructor to initialize the instance
     */
    public SystemBuilder() {
        system = new System();
    }

    /**
     * Verbose description of this system.
     */
    public SystemBuilder description(String description) {
        system.setDescription(description);
        return this;
    }

    /**
     * Environment variables to set upon login prior to job submission.
     */
    public SystemBuilder environment(String environment) {
        system.setEnvironment(environment);
        return this;
    }

    /**
     * Unique identifier for this system.
     */
    public SystemBuilder id(String id) {
        system.setId(id);
        return this;
    }

    /**
     * Is the system the default for the authenticated user?
     */
    public SystemBuilder isDefault(boolean isDefault) {
        system.setIsDefault(isDefault);
        return this;
    }

    /**
     * Is the system publicly available?
     */
    public SystemBuilder isPublic(boolean isPublic) {
        system.setIsPublic(isPublic);
        return this;
    }

    /**
     * The date this system was last modified in ISO 8601 format.
     */
    public SystemBuilder lastModified(Date lastModified) {
        system.setLastModified(lastModified);
        return this;
    }

    /**
     * Common name for this system.
     */
    public SystemBuilder name(String name) {
        system.setName(name);
        return this;
    }

    /**
     * The number of times this app has been updated.
     */
    public SystemBuilder revision(int revision) {
        system.setRevision(revision);
        return this;
    }

    /**
     * The scratch directory where job execution directories will be created at runtime. The workDir is used if this is not specified.
     */
    public SystemBuilder scratchDir(String scratchDir) {
        system.setScratchDir(scratchDir);
        return this;
    }

    /**
     * The site associated with this system.
     */
    public SystemBuilder site(String site) {
        system.setSite(site);
        return this;
    }

    /**
     * The status of this system. Systems must be in UP status to be used.
     */
    public SystemBuilder status(SystemStatusTypeEnum status) {
        system.setStatus(status);
        return this;
    }

    /**
     * The storage config defining how to connect to this system for data staging.
     */
    public SystemBuilder storage(SystemStorageConfig storage) {
        system.setStorage(storage);
        return this;
    }

    /**
     * The type of this system.
     */
    public SystemBuilder type(SystemTypeEnum type) {
        system.setType(type);
        return this;
    }

    /**
     * The uuid of this system.
     */
    public SystemBuilder uuid(String uuid) {
        system.setUuid(uuid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public System build() {
        return system;
    }
}