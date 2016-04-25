/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.models;

import java.util.*;

public class HistoryEventBuilder {
    //the instance to build
    private HistoryEvent historyEvent;

    /**
     * Default constructor to initialize the instance
     */
    public HistoryEventBuilder() {
        historyEvent = new HistoryEvent();
    }

    /**
     * The date of the event.
     */
    public HistoryEventBuilder created(Date created) {
        historyEvent.setCreated(created);
        return this;
    }

    /**
     * A brief description of the event details.
     */
    public HistoryEventBuilder description(String description) {
        historyEvent.setDescription(description);
        return this;
    }

    /**
     * A summary progress report of the transfer operation associated with this file event, if any.
     */
    public HistoryEventBuilder progress(TransferTaskProgressSummary progress) {
        historyEvent.setProgress(progress);
        return this;
    }

    /**
     * The status of the file/folder after this event.
     */
    public HistoryEventBuilder status(String status) {
        historyEvent.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HistoryEvent build() {
        return historyEvent;
    }
}