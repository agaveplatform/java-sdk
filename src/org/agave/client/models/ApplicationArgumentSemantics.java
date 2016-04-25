/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ApplicationArgumentSemantics 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5521816370972947358L;
    private List<String> fileTypes;
    private int maxCardinality;
    private int minCardinality;
    private List<String> ontology;
    /** GETTER
     * The file types acceptable for this output.
     */
    @JsonGetter("fileTypes")
    public List<String> getFileTypes ( ) { 
        return this.fileTypes;
    }
    
    /** SETTER
     * The file types acceptable for this output.
     */
    @JsonSetter("fileTypes")
    public void setFileTypes (List<String> value) { 
        this.fileTypes = value;
    }
 
    /** GETTER
     * The maximum number of times this output may appear.
     */
    @JsonGetter("maxCardinality")
    public int getMaxCardinality ( ) { 
        return this.maxCardinality;
    }
    
    /** SETTER
     * The maximum number of times this output may appear.
     */
    @JsonSetter("maxCardinality")
    public void setMaxCardinality (int value) { 
        this.maxCardinality = value;
    }
 
    /** GETTER
     * The minimum number of times this output may appear. -1 is unlimited
     */
    @JsonGetter("minCardinality")
    public int getMinCardinality ( ) { 
        return this.minCardinality;
    }
    
    /** SETTER
     * The minimum number of times this output may appear. -1 is unlimited
     */
    @JsonSetter("minCardinality")
    public void setMinCardinality (int value) { 
        this.minCardinality = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ontology")
    public List<String> getOntology ( ) { 
        return this.ontology;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ontology")
    public void setOntology (List<String> value) { 
        this.ontology = value;
    }
 
}
 