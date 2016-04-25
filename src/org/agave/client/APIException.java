/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client;

import java.io.InputStream;

import org.agave.client.http.client.HttpContext;

public class APIException extends Exception {
    //UID for serialization
    private static final long serialVersionUID = 6424174253911720338L;

    //private fields
    private int responseCode;

    //private fields
    private HttpContext httpContext;

    /**
    * The HTTP response code from the API request
    */
    public int getResponseCode() {
        return (httpContext != null) ? httpContext.getResponse().getStatusCode() : -1;
    }

    /**
     * The HTTP response body from the API request
     */
    public HttpContext getHttpContext() {
        return httpContext;
    }

    /**
     * Initialization constructor
     * @param	reason	The reason for throwing exception
     */
    public APIException(String reason) {
        super(reason);
    }

    /**
     * Initialization constructor
     * @param	reason	The reason for throwing exception
     * @param	context	The http context of the API exception
     */
    public APIException(String reason, HttpContext context) {
        super(reason);
        this.httpContext = context;
    }
}