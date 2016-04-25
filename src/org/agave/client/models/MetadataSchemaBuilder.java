/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class MetadataSchemaBuilder {
    //the instance to build
    private MetadataSchema metadataSchema;

    /**
     * Default constructor to initialize the instance
     */
    public MetadataSchemaBuilder() {
        metadataSchema = new MetadataSchema();
    }

    /**
     * A timestamp indicating when this Metadata was created in the metadata schema store.
     */
    public MetadataSchemaBuilder created(Date created) {
        metadataSchema.setCreated(created);
        return this;
    }

    /**
     * The name of the Internal User, if any, who owns this schema.
     */
    public MetadataSchemaBuilder internalUsername(String internalUsername) {
        metadataSchema.setInternalUsername(internalUsername);
        return this;
    }

    /**
     * A timestamp indicating when this Metadata was last updated in the metadata schema store.
     */
    public MetadataSchemaBuilder lastUpdated(Date lastUpdated) {
        metadataSchema.setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * The API user who owns this Schema.
     */
    public MetadataSchemaBuilder owner(String owner) {
        metadataSchema.setOwner(owner);
        return this;
    }

    /**
     * A JSON Schema
     */
    public MetadataSchemaBuilder schema(String schema) {
        metadataSchema.setSchema(schema);
        return this;
    }

    /**
     * The UUID for this Schema.
     */
    public MetadataSchemaBuilder uuid(String uuid) {
        metadataSchema.setUuid(uuid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MetadataSchema build() {
        return metadataSchema;
    }
}