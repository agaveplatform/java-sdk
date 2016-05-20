/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class MonitoringTaskDetailsBuilder 
        extends MonitoringTaskSummaryBuilder {
    //the instance to build
    private MonitoringTaskDetails monitoringTaskDetails;

    /**
     * Default constructor to initialize the instance
     */
    public MonitoringTaskDetailsBuilder() {
        monitoringTaskDetails = new MonitoringTaskDetails();
    }

    /**
     * The unique id of the monitoring task
     */
    public MonitoringTaskDetailsBuilder id(String id) {
        monitoringTaskDetails.setId(id);
        return this;
    }

    /**
     * A summary of the result of the last check run for this monitoring task
     */
    public MonitoringTaskDetailsBuilder lastCheck(MonitoringTaskCheck lastCheck) {
        monitoringTaskDetails.setLastCheck(lastCheck);
        return this;
    }

    /**
     * The last time the monitoring task had a successful check
     */
    public MonitoringTaskDetailsBuilder lastSuccess(Date lastSuccess) {
        monitoringTaskDetails.setLastSuccess(lastSuccess);
        return this;
    }

    /**
     * The last time the monitor was updated
     */
    public MonitoringTaskDetailsBuilder lastUpdated(Date lastUpdated) {
        monitoringTaskDetails.setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * The next time the check will run
     */
    public MonitoringTaskDetailsBuilder nextUpdate(Date nextUpdate) {
        monitoringTaskDetails.setNextUpdate(nextUpdate);
        return this;
    }

    /**
     * The user who created the monitoring task
     */
    public MonitoringTaskDetailsBuilder owner(String owner) {
        monitoringTaskDetails.setOwner(owner);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MonitoringTaskDetails build() {
        return monitoringTaskDetails;
    }
}