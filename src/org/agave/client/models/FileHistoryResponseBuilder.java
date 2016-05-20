/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class FileHistoryResponseBuilder 
        extends AgaveResponseBuilder {
    //the instance to build
    private FileHistoryResponse fileHistoryResponse;

    /**
     * Default constructor to initialize the instance
     */
    public FileHistoryResponseBuilder() {
        fileHistoryResponse = new FileHistoryResponse();
    }

    /**
     * response body
     */
    public FileHistoryResponseBuilder result(List<HistoryEvent> result) {
        fileHistoryResponse.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FileHistoryResponse build() {
        return fileHistoryResponse;
    }
}