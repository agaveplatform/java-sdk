/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.http.client;

import org.agave.client.http.request.HttpRequest;
import org.agave.client.http.response.HttpResponse;

public class HttpContext {
    private HttpRequest _request;
    private HttpResponse _response;

    public HttpContext(HttpRequest request, HttpResponse response) {
        _request = request;
        _response = response;
    }

    /**
     * GETTER for the Http Request
     * @return HttpRequest request
     */
    public HttpRequest getRequest() {
        return _request;
    }

    /**
     * GETTER for the Http Response
     * @return HttpResponse response
     */
    public HttpResponse getResponse() {
        return _response;
    }
}