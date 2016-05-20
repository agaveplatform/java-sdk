/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class TransformEncoderBuilder {
    //the instance to build
    private TransformEncoder transformEncoder;

    /**
     * Default constructor to initialize the instance
     */
    public TransformEncoderBuilder() {
        transformEncoder = new TransformEncoder();
    }

    /**
     * The description of what this encoder is and what it does.
     */
    public TransformEncoderBuilder description(String description) {
        transformEncoder.setDescription(description);
        return this;
    }

    /**
     * The encoder name.
     */
    public TransformEncoderBuilder name(String name) {
        transformEncoder.setName(name);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TransformEncoder build() {
        return transformEncoder;
    }
}