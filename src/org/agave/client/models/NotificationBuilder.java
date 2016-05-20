/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class NotificationBuilder {
    //the instance to build
    private Notification notification;

    /**
     * Default constructor to initialize the instance
     */
    public NotificationBuilder() {
        notification = new Notification();
    }

    /**
     * The event you wish to recieve a notification about. Specify * for all events.
     */
    public NotificationBuilder event(String event) {
        notification.setEvent(event);
        return this;
    }

    /**
     * Whether this event should remain active after it triggers the first time.
     */
    public NotificationBuilder persistent(boolean persistent) {
        notification.setPersistent(persistent);
        return this;
    }

    /**
     * The URI to notify when the import is complete. This can be an email address or URL. If a URL is given, a POST will be made to this address. URL templating is supported. Valid template values are: ${JOB_STATUS}, ${JOB_URL}, ${JOB_ID}, ${JOB_SYSTEM}, ${JOB_NAME}, ${JOB_START_TIME}, ${JOB_END_TIME}, ${JOB_SUBMIT_TIME}, ${JOB_ARCHIVE_PATH}, ${JOB_ARCHIVE_URL}, ${JOB_ERROR}
     */
    public NotificationBuilder url(int url) {
        notification.setUrl(url);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Notification build() {
        return notification;
    }
}