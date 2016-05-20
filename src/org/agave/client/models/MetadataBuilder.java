/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class MetadataBuilder {
    //the instance to build
    private Metadata metadata;

    /**
     * Default constructor to initialize the instance
     */
    public MetadataBuilder() {
        metadata = new Metadata();
    }

    /**
     * UUIDs of associated Agave entities, including the Data to which this Metadata belongs.
     */
    public MetadataBuilder associationIds(List<String> associationIds) {
        metadata.setAssociationIds(associationIds);
        return this;
    }

    /**
     * A timestamp indicating when this Metadata was created in the metadata store.
     */
    public MetadataBuilder created(Date created) {
        metadata.setCreated(created);
        return this;
    }

    /**
     * The name of the Internal User, if any, who owns this metadata.
     */
    public MetadataBuilder internalUsername(String internalUsername) {
        metadata.setInternalUsername(internalUsername);
        return this;
    }

    /**
     * A timestamp indicating when this Metadata was last updated in the metadata store.
     */
    public MetadataBuilder lastUpdated(Date lastUpdated) {
        metadata.setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * The name of this metadata
     */
    public MetadataBuilder name(String name) {
        metadata.setName(name);
        return this;
    }

    /**
     * The API user who owns this Metadata.
     */
    public MetadataBuilder owner(String owner) {
        metadata.setOwner(owner);
        return this;
    }

    /**
     * The UUID for this Metadata.
     */
    public MetadataBuilder uuid(String uuid) {
        metadata.setUuid(uuid);
        return this;
    }

    /**
     * A free text or JSON string containing the metadata stored for the given associationIds
     */
    public MetadataBuilder value(String value) {
        metadata.setValue(value);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Metadata build() {
        return metadata;
    }
}