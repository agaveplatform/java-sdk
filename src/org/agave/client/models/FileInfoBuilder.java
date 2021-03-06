/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class FileInfoBuilder {
    //the instance to build
    private FileInfo fileInfo;

    /**
     * Default constructor to initialize the instance
     */
    public FileInfoBuilder() {
        fileInfo = new FileInfo();
    }

    /**
     * The file type of the file.
     */
    public FileInfoBuilder format(String format) {
        fileInfo.setFormat(format);
        return this;
    }

    /**
     * The date this file was last modified in ISO 8601 format.
     */
    public FileInfoBuilder lastModified(Date lastModified) {
        fileInfo.setLastModified(lastModified);
        return this;
    }

    /**
     * The length of the file/folder.
     */
    public FileInfoBuilder length(int length) {
        fileInfo.setLength(length);
        return this;
    }

    /**
     * The mime type of the file/folder. If unknown, it defaults to application/binary.
     */
    public FileInfoBuilder mimeType(String mimeType) {
        fileInfo.setMimeType(mimeType);
        return this;
    }

    /**
     * The name of the file/folder.
     */
    public FileInfoBuilder name(String name) {
        fileInfo.setName(name);
        return this;
    }

    /**
     * The absolute path to the file/folder.
     */
    public FileInfoBuilder path(String path) {
        fileInfo.setPath(path);
        return this;
    }

    /**
     * The remote system permission of the invoking user on the file/folder.
     */
    public FileInfoBuilder permissions(String permissions) {
        fileInfo.setPermissions(permissions);
        return this;
    }

    /**
     * The id of the system where this file lives.
     */
    public FileInfoBuilder system(String system) {
        fileInfo.setSystem(system);
        return this;
    }

    /**
     * Whether it is a file or folder.
     */
    public FileInfoBuilder type(FileTypeEnum type) {
        fileInfo.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FileInfo build() {
        return fileInfo;
    }
}