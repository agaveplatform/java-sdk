/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class FileActionBuilder {
    //the instance to build
    private FileAction fileAction;

    /**
     * Default constructor to initialize the instance
     */
    public FileActionBuilder() {
        fileAction = new FileAction();
    }

    /**
     * Action to perform on the file or folder.
     */
    public FileActionBuilder action(FileManagementActionTypeEnum action) {
        fileAction.setAction(action);
        return this;
    }

    /**
     * Name of new directory or target file or folder.
     */
    public FileActionBuilder path(String path) {
        fileAction.setPath(path);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FileAction build() {
        return fileAction;
    }
}