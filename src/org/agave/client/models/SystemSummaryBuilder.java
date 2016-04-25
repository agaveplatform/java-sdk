/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class SystemSummaryBuilder {
    //the instance to build
    private SystemSummary systemSummary;

    /**
     * Default constructor to initialize the instance
     */
    public SystemSummaryBuilder() {
        systemSummary = new SystemSummary();
    }

    /**
     * Verbose description of this system.
     */
    public SystemSummaryBuilder description(String description) {
        systemSummary.setDescription(description);
        return this;
    }

    /**
     * Unique identifier for this system.
     */
    public SystemSummaryBuilder id(String id) {
        systemSummary.setId(id);
        return this;
    }

    /**
     * Is the system the default for the authenticated user?
     */
    public SystemSummaryBuilder isDefault(boolean isDefault) {
        systemSummary.setIsDefault(isDefault);
        return this;
    }

    /**
     * Is the system publicly available?
     */
    public SystemSummaryBuilder isPublic(boolean isPublic) {
        systemSummary.setIsPublic(isPublic);
        return this;
    }

    /**
     * Common name for this system.
     */
    public SystemSummaryBuilder name(String name) {
        systemSummary.setName(name);
        return this;
    }

    /**
     * The status of this system. Systems must be in UP status to be used.
     */
    public SystemSummaryBuilder status(SystemStatusTypeEnum status) {
        systemSummary.setStatus(status);
        return this;
    }

    /**
     * The type of this system.
     */
    public SystemSummaryBuilder type(SystemTypeEnum type) {
        systemSummary.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SystemSummary build() {
        return systemSummary;
    }
}