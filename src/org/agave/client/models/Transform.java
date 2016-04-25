/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Transform 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5410803437106514842L;
    private List<TransformDecoder> decoders;
    private String description;
    private String descriptionurl;
    private boolean enabled;
    private TransformEncoder encoder;
    private String name;
    private List<String> tags;
    /** GETTER
     * The available decoders for this transform.
     */
    @JsonGetter("decoders")
    public List<TransformDecoder> getDecoders ( ) { 
        return this.decoders;
    }
    
    /** SETTER
     * The available decoders for this transform.
     */
    @JsonSetter("decoders")
    public void setDecoders (List<TransformDecoder> value) { 
        this.decoders = value;
    }
 
    /** GETTER
     * Description of this transform.
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description of this transform.
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * The URL to find out more information.
     */
    @JsonGetter("descriptionurl")
    public String getDescriptionurl ( ) { 
        return this.descriptionurl;
    }
    
    /** SETTER
     * The URL to find out more information.
     */
    @JsonSetter("descriptionurl")
    public void setDescriptionurl (String value) { 
        this.descriptionurl = value;
    }
 
    /** GETTER
     * Whether this transform is enabled or not.
     */
    @JsonGetter("enabled")
    public boolean getEnabled ( ) { 
        return this.enabled;
    }
    
    /** SETTER
     * Whether this transform is enabled or not.
     */
    @JsonSetter("enabled")
    public void setEnabled (boolean value) { 
        this.enabled = value;
    }
 
    /** GETTER
     * The encoder to use to convert to this format.
     */
    @JsonGetter("encoder")
    public TransformEncoder getEncoder ( ) { 
        return this.encoder;
    }
    
    /** SETTER
     * The encoder to use to convert to this format.
     */
    @JsonSetter("encoder")
    public void setEncoder (TransformEncoder value) { 
        this.encoder = value;
    }
 
    /** GETTER
     * The name of this transform.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The name of this transform.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * The tags describing this transform.
     */
    @JsonGetter("tags")
    public List<String> getTags ( ) { 
        return this.tags;
    }
    
    /** SETTER
     * The tags describing this transform.
     */
    @JsonSetter("tags")
    public void setTags (List<String> value) { 
        this.tags = value;
    }
 
}
 