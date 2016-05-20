/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FileHistoryResponse 
        extends AgaveResponse {
    private static final long serialVersionUID = 4682377466509174378L;
    private List<HistoryEvent> result;
    /** GETTER
     * response body
     */
    @JsonGetter("result")
    public List<HistoryEvent> getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * response body
     */
    @JsonSetter("result")
    public void setResult (List<HistoryEvent> value) { 
        this.result = value;
    }
 
}
 