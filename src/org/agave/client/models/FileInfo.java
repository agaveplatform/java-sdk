/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FileInfo 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5462591897272540029L;
    private String format;
    private Date lastModified;
    private int length;
    private String mimeType;
    private String name;
    private String path;
    private String permissions;
    private String system;
    private FileTypeEnum type = FileTypeEnum.fromString("FILE");
    /** GETTER
     * The file type of the file.
     */
    @JsonGetter("format")
    public String getFormat ( ) { 
        return this.format;
    }
    
    /** SETTER
     * The file type of the file.
     */
    @JsonSetter("format")
    public void setFormat (String value) { 
        this.format = value;
    }
 
    /** GETTER
     * The date this file was last modified in ISO 8601 format.
     */
    @JsonGetter("lastModified")
    public Date getLastModified ( ) { 
        return this.lastModified;
    }
    
    /** SETTER
     * The date this file was last modified in ISO 8601 format.
     */
    @JsonSetter("lastModified")
    public void setLastModified (Date value) { 
        this.lastModified = value;
    }
 
    /** GETTER
     * The length of the file/folder.
     */
    @JsonGetter("length")
    public int getLength ( ) { 
        return this.length;
    }
    
    /** SETTER
     * The length of the file/folder.
     */
    @JsonSetter("length")
    public void setLength (int value) { 
        this.length = value;
    }
 
    /** GETTER
     * The mime type of the file/folder. If unknown, it defaults to application/binary.
     */
    @JsonGetter("mimeType")
    public String getMimeType ( ) { 
        return this.mimeType;
    }
    
    /** SETTER
     * The mime type of the file/folder. If unknown, it defaults to application/binary.
     */
    @JsonSetter("mimeType")
    public void setMimeType (String value) { 
        this.mimeType = value;
    }
 
    /** GETTER
     * The name of the file/folder.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The name of the file/folder.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * The absolute path to the file/folder.
     */
    @JsonGetter("path")
    public String getPath ( ) { 
        return this.path;
    }
    
    /** SETTER
     * The absolute path to the file/folder.
     */
    @JsonSetter("path")
    public void setPath (String value) { 
        this.path = value;
    }
 
    /** GETTER
     * The remote system permission of the invoking user on the file/folder.
     */
    @JsonGetter("permissions")
    public String getPermissions ( ) { 
        return this.permissions;
    }
    
    /** SETTER
     * The remote system permission of the invoking user on the file/folder.
     */
    @JsonSetter("permissions")
    public void setPermissions (String value) { 
        this.permissions = value;
    }
 
    /** GETTER
     * The id of the system where this file lives.
     */
    @JsonGetter("system")
    public String getSystem ( ) { 
        return this.system;
    }
    
    /** SETTER
     * The id of the system where this file lives.
     */
    @JsonSetter("system")
    public void setSystem (String value) { 
        this.system = value;
    }
 
    /** GETTER
     * Whether it is a file or folder.
     */
    @JsonGetter("type")
    public FileTypeEnum getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Whether it is a file or folder.
     */
    @JsonSetter("type")
    public void setType (FileTypeEnum value) { 
        this.type = value;
    }
 
}
 