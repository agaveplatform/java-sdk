/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class MonitoringTaskCheckBuilder {
    //the instance to build
    private MonitoringTaskCheck monitoringTaskCheck;

    /**
     * Default constructor to initialize the instance
     */
    public MonitoringTaskCheckBuilder() {
        monitoringTaskCheck = new MonitoringTaskCheck();
    }

    /**
     * A timestamp indicating when this monitor check was created.
     */
    public MonitoringTaskCheckBuilder created(Date created) {
        monitoringTaskCheck.setCreated(created);
        return this;
    }

    /**
     * The UUID for this monitor check.
     */
    public MonitoringTaskCheckBuilder id(String id) {
        monitoringTaskCheck.setId(id);
        return this;
    }

    /**
     * The error message if this monitor check failed.
     */
    public MonitoringTaskCheckBuilder message(String message) {
        monitoringTaskCheck.setMessage(message);
        return this;
    }

    /**
     * The results of this monitor check.
     */
    public MonitoringTaskCheckBuilder result(MonitorCheckResultTypeEnum result) {
        monitoringTaskCheck.setResult(result);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MonitoringTaskCheck build() {
        return monitoringTaskCheck;
    }
}