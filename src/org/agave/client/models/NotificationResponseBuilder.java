/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class NotificationResponseBuilder {
    //the instance to build
    private NotificationResponse notificationResponse;

    /**
     * Default constructor to initialize the instance
     */
    public NotificationResponseBuilder() {
        notificationResponse = new NotificationResponse();
    }

    /**
     * success or failure
     */
    public NotificationResponseBuilder message(String message) {
        notificationResponse.setMessage(message);
        return this;
    }

    public NotificationResponseBuilder result(Notification result) {
        notificationResponse.setResult(result);
        return this;
    }

    /**
     * success or failure
     */
    public NotificationResponseBuilder status(String status) {
        notificationResponse.setStatus(status);
        return this;
    }

    /**
     * API version number
     */
    public NotificationResponseBuilder version(String version) {
        notificationResponse.setVersion(version);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public NotificationResponse build() {
        return notificationResponse;
    }
}