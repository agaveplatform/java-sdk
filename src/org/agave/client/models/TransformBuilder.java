/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class TransformBuilder {
    //the instance to build
    private Transform transform;

    /**
     * Default constructor to initialize the instance
     */
    public TransformBuilder() {
        transform = new Transform();
    }

    /**
     * The available decoders for this transform.
     */
    public TransformBuilder decoders(List<TransformDecoder> decoders) {
        transform.setDecoders(decoders);
        return this;
    }

    /**
     * Description of this transform.
     */
    public TransformBuilder description(String description) {
        transform.setDescription(description);
        return this;
    }

    /**
     * The URL to find out more information.
     */
    public TransformBuilder descriptionurl(String descriptionurl) {
        transform.setDescriptionurl(descriptionurl);
        return this;
    }

    /**
     * Whether this transform is enabled or not.
     */
    public TransformBuilder enabled(boolean enabled) {
        transform.setEnabled(enabled);
        return this;
    }

    /**
     * The encoder to use to convert to this format.
     */
    public TransformBuilder encoder(TransformEncoder encoder) {
        transform.setEncoder(encoder);
        return this;
    }

    /**
     * The name of this transform.
     */
    public TransformBuilder name(String name) {
        transform.setName(name);
        return this;
    }

    /**
     * The tags describing this transform.
     */
    public TransformBuilder tags(List<String> tags) {
        transform.setTags(tags);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Transform build() {
        return transform;
    }
}