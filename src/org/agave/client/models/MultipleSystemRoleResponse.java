/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MultipleSystemRoleResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4736316555465569239L;
    private String message;
    private List<SystemRoleRequest> result;
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
     * All matching roles for this system
     */
    @JsonGetter("result")
    public List<SystemRoleRequest> getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * All matching roles for this system
     */
    @JsonSetter("result")
    public void setResult (List<SystemRoleRequest> value) { 
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
 