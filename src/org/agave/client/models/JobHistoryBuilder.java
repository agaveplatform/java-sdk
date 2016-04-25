/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class JobHistoryBuilder {
    //the instance to build
    private JobHistory jobHistory;

    /**
     * Default constructor to initialize the instance
     */
    public JobHistoryBuilder() {
        jobHistory = new JobHistory();
    }

    /**
     * The date of the event.
     */
    public JobHistoryBuilder created(Date created) {
        jobHistory.setCreated(created);
        return this;
    }

    /**
     * A brief description of the event details.
     */
    public JobHistoryBuilder description(String description) {
        jobHistory.setDescription(description);
        return this;
    }

    /**
     * The status of the job after this event.
     */
    public JobHistoryBuilder status(String status) {
        jobHistory.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public JobHistory build() {
        return jobHistory;
    }
}