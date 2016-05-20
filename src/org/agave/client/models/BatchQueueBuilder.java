/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
 */
package org.agave.client.models;

import java.util.*;

public class BatchQueueBuilder {
    //the instance to build
    private BatchQueue batchQueue;

    /**
     * Default constructor to initialize the instance
     */
    public BatchQueueBuilder() {
        batchQueue = new BatchQueue();
    }

    /**
     * Any custom directives that should be appended to scheduler directives. ex. #$ -A TG-12345
     */
    public BatchQueueBuilder customDirectives(String customDirectives) {
        batchQueue.setCustomDirectives(customDirectives);
        return this;
    }

    /**
     * Is this the default queue for the system.
     */
    public BatchQueueBuilder isDefault(boolean isDefault) {
        batchQueue.setIsDefault(isDefault);
        return this;
    }

    /**
     * The maximum number of jobs that can be in queue at once.
     */
    public BatchQueueBuilder maxJobs(int maxJobs) {
        batchQueue.setMaxJobs(maxJobs);
        return this;
    }

    /**
     * The max memory available per node to jobs submitted to this queue.
     */
    public BatchQueueBuilder maxMemoryPerNode(String maxMemoryPerNode) {
        batchQueue.setMaxMemoryPerNode(maxMemoryPerNode);
        return this;
    }

    /**
     * The max nodes available per node to jobs submitted to this queue.
     */
    public BatchQueueBuilder maxNodes(String maxNodes) {
        batchQueue.setMaxNodes(maxNodes);
        return this;
    }

    /**
     * The max processors per node available to jobs submitted to this queue.
     */
    public BatchQueueBuilder maxProcessorsPerNode(int maxProcessorsPerNode) {
        batchQueue.setMaxProcessorsPerNode(maxProcessorsPerNode);
        return this;
    }

    /**
     * The max length of jobs submitted to this queue in hhh:mm:ss format.
     */
    public BatchQueueBuilder maxRequestedTime(String maxRequestedTime) {
        batchQueue.setMaxRequestedTime(maxRequestedTime);
        return this;
    }

    /**
     * The maximum number of jobs per user that can be in queue at once.
     */
    public BatchQueueBuilder maxUserJobs(int maxUserJobs) {
        batchQueue.setMaxUserJobs(maxUserJobs);
        return this;
    }

    /**
     * The name of the batch queue.
     */
    public BatchQueueBuilder name(String name) {
        batchQueue.setName(name);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BatchQueue build() {
        return batchQueue;
    }
}