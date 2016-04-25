/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationOutput 
        extends ApplicationArgument {
    private static final long serialVersionUID = 5377366287188587462L;
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
 