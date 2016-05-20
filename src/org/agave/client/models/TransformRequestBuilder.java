/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class TransformRequestBuilder {
    //the instance to build
    private TransformRequest transformRequest;

    /**
     * Default constructor to initialize the instance
     */
    public TransformRequestBuilder() {
        transformRequest = new TransformRequest();
    }

    /**
     * The URI to notify when the transfer is complete. This can be an email address or http URL. If a URL is given, a GET will be made to this address. URL templating is supported. Valid template values are: ${NAME}, ${SOURCE_FORMAT}, ${DEST_FORMAT}, ${STATUS}
     */
    public TransformRequestBuilder callbackUrl(String callbackUrl) {
        transformRequest.setCallbackUrl(callbackUrl);
        return this;
    }

    /**
     * The original file type of the file. If not given, the file type is assumed to be raw.
     */
    public TransformRequestBuilder nativeFormat(String nativeFormat) {
        transformRequest.setNativeFormat(nativeFormat);
        return this;
    }

    /**
     * The uri to which the transformed file will be staged.
     */
    public TransformRequestBuilder url(String url) {
        transformRequest.setUrl(url);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TransformRequest build() {
        return transformRequest;
    }
}