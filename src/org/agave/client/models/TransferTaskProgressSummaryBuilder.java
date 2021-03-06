/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class TransferTaskProgressSummaryBuilder {
    //the instance to build
    private TransferTaskProgressSummary transferTaskProgressSummary;

    /**
     * Default constructor to initialize the instance
     */
    public TransferTaskProgressSummaryBuilder() {
        transferTaskProgressSummary = new TransferTaskProgressSummary();
    }

    /**
     * Average transfer rate in bytes/sec
     */
    public TransferTaskProgressSummaryBuilder averageRate(int averageRate) {
        transferTaskProgressSummary.setAverageRate(averageRate);
        return this;
    }

    /**
     * The source URL of the transfer operation
     */
    public TransferTaskProgressSummaryBuilder source(String source) {
        transferTaskProgressSummary.setSource(source);
        return this;
    }

    /**
     * The number of concurrent transfers behind this transfer task
     */
    public TransferTaskProgressSummaryBuilder totalActiveTransfers(int totalActiveTransfers) {
        transferTaskProgressSummary.setTotalActiveTransfers(totalActiveTransfers);
        return this;
    }

    /**
     * The total number of bytes to be transferred
     */
    public TransferTaskProgressSummaryBuilder totalBytes(int totalBytes) {
        transferTaskProgressSummary.setTotalBytes(totalBytes);
        return this;
    }

    /**
     * The total number of bytes transferred thus far
     */
    public TransferTaskProgressSummaryBuilder totalBytesTransferred(int totalBytesTransferred) {
        transferTaskProgressSummary.setTotalBytesTransferred(totalBytesTransferred);
        return this;
    }

    /**
     * The total number of files transferred to date
     */
    public TransferTaskProgressSummaryBuilder totalFiles(int totalFiles) {
        transferTaskProgressSummary.setTotalFiles(totalFiles);
        return this;
    }

    /**
     * The id of the transfer task associated with this object
     */
    public TransferTaskProgressSummaryBuilder uuid(String uuid) {
        transferTaskProgressSummary.setUuid(uuid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TransferTaskProgressSummary build() {
        return transferTaskProgressSummary;
    }
}