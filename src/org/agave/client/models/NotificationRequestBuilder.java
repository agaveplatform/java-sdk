/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class NotificationRequestBuilder {
    //the instance to build
    private NotificationRequest notificationRequest;

    /**
     * Default constructor to initialize the instance
     */
    public NotificationRequestBuilder() {
        notificationRequest = new NotificationRequest();
    }

    /**
     * UUID of resource to whome the event applies.
     */
    public NotificationRequestBuilder associatedUuid(String associatedUuid) {
        notificationRequest.setAssociatedUuid(associatedUuid);
        return this;
    }

    /**
     * Whether this notification should stay active after it fires the first time.
     */
    public NotificationRequestBuilder persistent(boolean persistent) {
        notificationRequest.setPersistent(persistent);
        return this;
    }

    /**
     * The url or email address that will be notified of the event.
     */
    public NotificationRequestBuilder url(String url) {
        notificationRequest.setUrl(url);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public NotificationRequest build() {
        return notificationRequest;
    }
}