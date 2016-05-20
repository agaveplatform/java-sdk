/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationArgument 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5268427659440670299L;
    private ApplicationArgumentDetails details;
    private String id;
    private ApplicationArgumentSemantics semantics;
    private ApplicationArgumentValue value;
    /** GETTER
     * The details for this argument. 
     */
    @JsonGetter("details")
    public ApplicationArgumentDetails getDetails ( ) { 
        return this.details;
    }
    
    /** SETTER
     * The details for this argument. 
     */
    @JsonSetter("details")
    public void setDetails (ApplicationArgumentDetails value) { 
        this.details = value;
    }
 
    /** GETTER
     * The id of this argument. This will be the replacement string in your wrapper scripts.
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The id of this argument. This will be the replacement string in your wrapper scripts.
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
    }
 
    /** GETTER
     * The semantic information for this output. 
     */
    @JsonGetter("semantics")
    public ApplicationArgumentSemantics getSemantics ( ) { 
        return this.semantics;
    }
    
    /** SETTER
     * The semantic information for this output. 
     */
    @JsonSetter("semantics")
    public void setSemantics (ApplicationArgumentSemantics value) { 
        this.semantics = value;
    }
 
    /** GETTER
     * The validation and type information for this argument.
     */
    @JsonGetter("value")
    public ApplicationArgumentValue getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * The validation and type information for this argument.
     */
    @JsonSetter("value")
    public void setValue (ApplicationArgumentValue value) { 
        this.value = value;
    }
 
}
 