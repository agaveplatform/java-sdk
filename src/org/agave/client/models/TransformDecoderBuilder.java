/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class TransformDecoderBuilder {
    //the instance to build
    private TransformDecoder transformDecoder;

    /**
     * Default constructor to initialize the instance
     */
    public TransformDecoderBuilder() {
        transformDecoder = new TransformDecoder();
    }

    /**
     * The description of what this decoder is and what it does.
     */
    public TransformDecoderBuilder description(String description) {
        transformDecoder.setDescription(description);
        return this;
    }

    /**
     * The decoder name.
     */
    public TransformDecoderBuilder name(String name) {
        transformDecoder.setName(name);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TransformDecoder build() {
        return transformDecoder;
    }
}