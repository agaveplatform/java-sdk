/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MultipleApplicationResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5083403362428106029L;
    private String message;
    private List<ApplicationSummary> result;
    private String status;
    /** GETTER
     * success or failure
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * success or failure
     */
    @JsonSetter("message")
    public void setMessage (String value) { 
        this.message = value;
    }
 
    /** GETTER
     * response body
     */
    @JsonGetter("result")
    public List<ApplicationSummary> getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * response body
     */
    @JsonSetter("result")
    public void setResult (List<ApplicationSummary> value) { 
        this.result = value;
    }
 
    /** GETTER
     * success or failure
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * success or failure
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
}
 