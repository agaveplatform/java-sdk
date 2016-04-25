/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class FileMkdirActionBuilder 
        extends FileActionBuilder {
    //the instance to build
    private FileMkdirAction fileMkdirAction;

    /**
     * Default constructor to initialize the instance
     */
    public FileMkdirActionBuilder() {
        fileMkdirAction = new FileMkdirAction();
    }

    /**
     * Absolute or relative path of the new directory
     */
    public FileMkdirActionBuilder path(String path) {
        fileMkdirAction.setPath(path);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FileMkdirAction build() {
        return fileMkdirAction;
    }
}