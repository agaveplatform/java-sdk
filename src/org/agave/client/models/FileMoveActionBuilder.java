/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class FileMoveActionBuilder 
        extends FileActionBuilder {
    //the instance to build
    private FileMoveAction fileMoveAction;

    /**
     * Default constructor to initialize the instance
     */
    public FileMoveActionBuilder() {
        fileMoveAction = new FileMoveAction();
    }

    /**
     * The relative or absolute path of the renamed file/folder. 
     */
    public FileMoveActionBuilder path(String path) {
        fileMoveAction.setPath(path);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FileMoveAction build() {
        return fileMoveAction;
    }
}