/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class FileRenameActionBuilder 
        extends FileActionBuilder {
    //the instance to build
    private FileRenameAction fileRenameAction;

    /**
     * Default constructor to initialize the instance
     */
    public FileRenameActionBuilder() {
        fileRenameAction = new FileRenameAction();
    }

    public FileRenameActionBuilder action(FileManagementActionTypeEnum action) {
        fileRenameAction.setAction(action);
        return this;
    }

    /**
     * New name of the file or folder specified in the URL. 
     */
    public FileRenameActionBuilder path(String path) {
        fileRenameAction.setPath(path);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FileRenameAction build() {
        return fileRenameAction;
    }
}