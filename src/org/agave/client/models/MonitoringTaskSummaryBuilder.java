/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class MonitoringTaskSummaryBuilder {
    //the instance to build
    private MonitoringTaskSummary monitoringTaskSummary;

    /**
     * Default constructor to initialize the instance
     */
    public MonitoringTaskSummaryBuilder() {
        monitoringTaskSummary = new MonitoringTaskSummary();
    }

    /**
     * Whether this monitor is currently active.
     */
    public MonitoringTaskSummaryBuilder active(boolean active) {
        monitoringTaskSummary.setActive(active);
        return this;
    }

    /**
     * The interval in minutes on which this monitor will run. Minimum is 5. Default is 720.
     */
    public MonitoringTaskSummaryBuilder frequency(int frequency) {
        monitoringTaskSummary.setFrequency(frequency);
        return this;
    }

    /**
     * The unique id of the monitor
     */
    public MonitoringTaskSummaryBuilder id(String id) {
        monitoringTaskSummary.setId(id);
        return this;
    }

    /**
     * Internal user account used to perform the check.
     */
    public MonitoringTaskSummaryBuilder internalUsername(String internalUsername) {
        monitoringTaskSummary.setInternalUsername(internalUsername);
        return this;
    }

    /**
     * The id of the sytem to be monitored. This must be an active system registered with the Systems service.
     */
    public MonitoringTaskSummaryBuilder target(String target) {
        monitoringTaskSummary.setTarget(target);
        return this;
    }

    /**
     * Whether this Monitor should update the system status when the results change. You must have the ADMIN role on the target system to use this feature.
     */
    public MonitoringTaskSummaryBuilder updateSystemStatus(boolean updateSystemStatus) {
        monitoringTaskSummary.setUpdateSystemStatus(updateSystemStatus);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MonitoringTaskSummary build() {
        return monitoringTaskSummary;
    }
}