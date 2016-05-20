/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class StorageSystem 
        extends System {
    private static final long serialVersionUID = 5585344320793512371L;
    private SystemTypeEnum type = SystemTypeEnum.fromString("STORAGE");
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public SystemTypeEnum getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    private void setType (SystemTypeEnum value) { 
        this.type = value;
    }
 
}
 