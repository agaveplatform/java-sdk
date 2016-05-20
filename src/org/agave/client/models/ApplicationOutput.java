/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationOutput 
        extends ApplicationArgument {
    private static final long serialVersionUID = 5736616236050823373L;
    private ApplicationArgumentDataSemantics semantics;
    /** GETTER
     * The ontologies for this output. 
     */
    @JsonGetter("semantics")
    public ApplicationArgumentDataSemantics getSemantics ( ) { 
        return this.semantics;
    }
    
    /** SETTER
     * The ontologies for this output. 
     */
    @JsonSetter("semantics")
    public void setSemantics (ApplicationArgumentDataSemantics value) { 
        this.semantics = value;
    }
 
}
 