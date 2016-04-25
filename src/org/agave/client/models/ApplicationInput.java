/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationInput 
        extends ApplicationArgument {
    private static final long serialVersionUID = 4857753159058789397L;
    private ApplicationArgumentDataSemantics semantics;
    /** GETTER
     * The ontologies for this input. 
     */
    @JsonGetter("semantics")
    public ApplicationArgumentDataSemantics getSemantics ( ) { 
        return this.semantics;
    }
    
    /** SETTER
     * The ontologies for this input. 
     */
    @JsonSetter("semantics")
    public void setSemantics (ApplicationArgumentDataSemantics value) { 
        this.semantics = value;
    }
 
}
 