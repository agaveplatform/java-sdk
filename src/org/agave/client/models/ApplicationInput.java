/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationInput 
        extends ApplicationArgument {
    private static final long serialVersionUID = 5571968739651214383L;
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
 