/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TransferTaskProgressSummary 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4738662266243061785L;
    private int averageRate = 0;
    private String source;
    private int totalActiveTransfers = 0;
    private int totalBytes = 0;
    private int totalBytesTransferred = 0;
    private int totalFiles = 0;
    private String uuid;
    /** GETTER
     * Average transfer rate in bytes/sec
     */
    @JsonGetter("averageRate")
    public int getAverageRate ( ) { 
        return this.averageRate;
    }
    
    /** SETTER
     * Average transfer rate in bytes/sec
     */
    @JsonSetter("averageRate")
    public void setAverageRate (int value) { 
        this.averageRate = value;
    }
 
    /** GETTER
     * The source URL of the transfer operation
     */
    @JsonGetter("source")
    public String getSource ( ) { 
        return this.source;
    }
    
    /** SETTER
     * The source URL of the transfer operation
     */
    @JsonSetter("source")
    public void setSource (String value) { 
        this.source = value;
    }
 
    /** GETTER
     * The number of concurrent transfers behind this transfer task
     */
    @JsonGetter("totalActiveTransfers")
    public int getTotalActiveTransfers ( ) { 
        return this.totalActiveTransfers;
    }
    
    /** SETTER
     * The number of concurrent transfers behind this transfer task
     */
    @JsonSetter("totalActiveTransfers")
    public void setTotalActiveTransfers (int value) { 
        this.totalActiveTransfers = value;
    }
 
    /** GETTER
     * The total number of bytes to be transferred
     */
    @JsonGetter("totalBytes")
    public int getTotalBytes ( ) { 
        return this.totalBytes;
    }
    
    /** SETTER
     * The total number of bytes to be transferred
     */
    @JsonSetter("totalBytes")
    public void setTotalBytes (int value) { 
        this.totalBytes = value;
    }
 
    /** GETTER
     * The total number of bytes transferred thus far
     */
    @JsonGetter("totalBytesTransferred")
    public int getTotalBytesTransferred ( ) { 
        return this.totalBytesTransferred;
    }
    
    /** SETTER
     * The total number of bytes transferred thus far
     */
    @JsonSetter("totalBytesTransferred")
    public void setTotalBytesTransferred (int value) { 
        this.totalBytesTransferred = value;
    }
 
    /** GETTER
     * The total number of files transferred to date
     */
    @JsonGetter("totalFiles")
    public int getTotalFiles ( ) { 
        return this.totalFiles;
    }
    
    /** SETTER
     * The total number of files transferred to date
     */
    @JsonSetter("totalFiles")
    public void setTotalFiles (int value) { 
        this.totalFiles = value;
    }
 
    /** GETTER
     * The id of the transfer task associated with this object
     */
    @JsonGetter("uuid")
    public String getUuid ( ) { 
        return this.uuid;
    }
    
    /** SETTER
     * The id of the transfer task associated with this object
     */
    @JsonSetter("uuid")
    public void setUuid (String value) { 
        this.uuid = value;
    }
 
}
 