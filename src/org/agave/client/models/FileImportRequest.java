/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FileImportRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5204786026880213940L;
    private Boolean append = false;
    private String fileName;
    private String fileType;
    private List<NotificationRequest> notifications;
    private String urlToImport;
    /** GETTER
     * Boolean flag indicating this file should be appended to the target file
     */
    @JsonGetter("append")
    public Boolean getAppend ( ) { 
        return this.append;
    }
    
    /** SETTER
     * Boolean flag indicating this file should be appended to the target file
     */
    @JsonSetter("append")
    public void setAppend (Boolean value) { 
        this.append = value;
    }
 
    /** GETTER
     * The name to give the upload file. If unset, takes the original file name.
     */
    @JsonGetter("fileName")
    public String getFileName ( ) { 
        return this.fileName;
    }
    
    /** SETTER
     * The name to give the upload file. If unset, takes the original file name.
     */
    @JsonSetter("fileName")
    public void setFileName (String value) { 
        this.fileName = value;
    }
 
    /** GETTER
     * The file format this file is in. Defaults to raw. This will be used in file transform operations.
     */
    @JsonGetter("fileType")
    public String getFileType ( ) { 
        return this.fileType;
    }
    
    /** SETTER
     * The file format this file is in. Defaults to raw. This will be used in file transform operations.
     */
    @JsonSetter("fileType")
    public void setFileType (String value) { 
        this.fileType = value;
    }
 
    /** GETTER
     * Notifications to set with the successful acceptance of this upload request
     */
    @JsonGetter("notifications")
    public List<NotificationRequest> getNotifications ( ) { 
        return this.notifications;
    }
    
    /** SETTER
     * Notifications to set with the successful acceptance of this upload request
     */
    @JsonSetter("notifications")
    public void setNotifications (List<NotificationRequest> value) { 
        this.notifications = value;
    }
 
    /** GETTER
     * The URL to import the file from. This parameter is used if not file is uploaded with this post.
     */
    @JsonGetter("urlToImport")
    public String getUrlToImport ( ) { 
        return this.urlToImport;
    }
    
    /** SETTER
     * The URL to import the file from. This parameter is used if not file is uploaded with this post.
     */
    @JsonSetter("urlToImport")
    public void setUrlToImport (String value) { 
        this.urlToImport = value;
    }
 
}
 