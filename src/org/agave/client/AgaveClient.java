/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client;

import org.agave.client.controllers.*;
import org.agave.client.http.client.HttpClient;

public class AgaveClient {
    /**
     * Singleton access to Clients controller
     * @return	Returns the ClientsController instance 
     */
    public ClientsController getClients() {
        return ClientsController.getInstance();
    }

    /**
     * Singleton access to Apps controller
     * @return	Returns the AppsController instance 
     */
    public AppsController getApps() {
        return AppsController.getInstance();
    }

    /**
     * Singleton access to Files controller
     * @return	Returns the FilesController instance 
     */
    public FilesController getFiles() {
        return FilesController.getInstance();
    }

    /**
     * Singleton access to Jobs controller
     * @return	Returns the JobsController instance 
     */
    public JobsController getJobs() {
        return JobsController.getInstance();
    }

    /**
     * Singleton access to Meta controller
     * @return	Returns the MetaController instance 
     */
    public MetaController getMeta() {
        return MetaController.getInstance();
    }

    /**
     * Singleton access to Monitors controller
     * @return	Returns the MonitorsController instance 
     */
    public MonitorsController getMonitors() {
        return MonitorsController.getInstance();
    }

    /**
     * Singleton access to Notifications controller
     * @return	Returns the NotificationsController instance 
     */
    public NotificationsController getNotifications() {
        return NotificationsController.getInstance();
    }

    /**
     * Singleton access to Postits controller
     * @return	Returns the PostitsController instance 
     */
    public PostitsController getPostits() {
        return PostitsController.getInstance();
    }

    /**
     * Singleton access to Profiles controller
     * @return	Returns the ProfilesController instance 
     */
    public ProfilesController getProfiles() {
        return ProfilesController.getInstance();
    }

    /**
     * Singleton access to Systems controller
     * @return	Returns the SystemsController instance 
     */
    public SystemsController getSystems() {
        return SystemsController.getInstance();
    }

    /**
     * Singleton access to Transforms controller
     * @return	Returns the TransformsController instance 
     */
    public TransformsController getTransforms() {
        return TransformsController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public AgaveClient() { }

    /**
     * Client initialization constructor 
     */     
    public AgaveClient(String oAuthAccessToken) {
        Configuration.oAuthAccessToken = oAuthAccessToken;
    }
}