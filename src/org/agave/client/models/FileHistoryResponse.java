/*
 * AgavePlatformScienceAPILib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 10/07/2015
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FileHistoryResponse 
        extends AgaveResponse {
    private static final long serialVersionUID = 4666557740097665368L;
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
 