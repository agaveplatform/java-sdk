/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.controllers;

import org.agave.client.http.client.HttpClient;
import org.agave.client.http.client.UnirestClient;

public abstract class BaseController {
    /**
     * Protected variable to keep reference of client instance
     */
    protected HttpClient clientInstance = null;

    /**
     * Initialize with the default http client
     */
    public BaseController() {
        clientInstance = UnirestClient.getSharedInstance();
    }

    /**
     * Initialize the base controller using the given http client
     *
     * @param _client The given http client
     */
    public BaseController(HttpClient _client) {
        clientInstance = _client;
    }
}
