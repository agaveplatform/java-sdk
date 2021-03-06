/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class FileImportRequestBuilder {
    //the instance to build
    private FileImportRequest fileImportRequest;

    /**
     * Default constructor to initialize the instance
     */
    public FileImportRequestBuilder() {
        fileImportRequest = new FileImportRequest();
    }

    /**
     * Boolean flag indicating this file should be appended to the target file
     */
    public FileImportRequestBuilder append(Boolean append) {
        fileImportRequest.setAppend(append);
        return this;
    }

    /**
     * The name to give the upload file. If unset, takes the original file name.
     */
    public FileImportRequestBuilder fileName(String fileName) {
        fileImportRequest.setFileName(fileName);
        return this;
    }

    /**
     * The file format this file is in. Defaults to raw. This will be used in file transform operations.
     */
    public FileImportRequestBuilder fileType(String fileType) {
        fileImportRequest.setFileType(fileType);
        return this;
    }

    /**
     * Notifications to set with the successful acceptance of this upload request
     */
    public FileImportRequestBuilder notifications(List<NotificationRequest> notifications) {
        fileImportRequest.setNotifications(notifications);
        return this;
    }

    /**
     * The URL to import the file from. This parameter is used if not file is uploaded with this post.
     */
    public FileImportRequestBuilder urlToImport(String urlToImport) {
        fileImportRequest.setUrlToImport(urlToImport);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FileImportRequest build() {
        return fileImportRequest;
    }
}