/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class FileCopyActionBuilder 
        extends FileActionBuilder {
    //the instance to build
    private FileCopyAction fileCopyAction;

    /**
     * Default constructor to initialize the instance
     */
    public FileCopyActionBuilder() {
        fileCopyAction = new FileCopyAction();
    }

    /**
     * True if the contents of the source file should be appended to the end of file given in the URL.
     */
    public FileCopyActionBuilder append(boolean append) {
        fileCopyAction.setAppend(append);
        return this;
    }

    /**
     * New name of the file or folder specified in the URL. 
     */
    public FileCopyActionBuilder path(String path) {
        fileCopyAction.setPath(path);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FileCopyAction build() {
        return fileCopyAction;
    }
}