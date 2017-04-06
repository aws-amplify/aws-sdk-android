/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import com.amazonaws.ClientConfiguration;

/**
 * Allows configuration of certain KinesisRecorder parameters, such as
 * maxStoargeSize
 */
public class KinesisRecorderConfig {

    private long maxStorageSize = 1024 * 1024 * 5L;
    private final ClientConfiguration clientConfiguration;
    private String partitionKey;

    /**
     * Construct an instance of KinesisRecorderConfig which has default values
     * of maxStorageSize = 5MiB; and a default ClientConfiguration
     */
    public KinesisRecorderConfig() {
        this(new ClientConfiguration());
    }

    /**
     * Construct an instance of KinesisRecorderConfig which has default values
     * of maxStorageSize = 5MiB; and the specified ClientConfiguration
     *
     * @param clientConfiguration The client configuration used when making
     *            requests to Amazon Kinesis
     */
    public KinesisRecorderConfig(ClientConfiguration clientConfiguration) {
        if (clientConfiguration == null) {
            throw new IllegalArgumentException();
        }
        this.clientConfiguration = new ClientConfiguration(clientConfiguration);

    }

    /**
     * Creates a copy of the passed in KinesisRecorderConfig
     *
     * @param other the KinesisRecorderConfig to copy.
     */
    public KinesisRecorderConfig(KinesisRecorderConfig other) {
        this.maxStorageSize = other.getMaxStorageSize();
        this.clientConfiguration = new ClientConfiguration(other.getClientConfiguration());
        this.partitionKey = other.partitionKey;
    }

    /**
     * Optionally set partition key.
     *
     * @param partitionKey
     * @return This class for chaining
     */
    public KinesisRecorderConfig withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * Sets the max storage in bytes that KinesisRecorder is allowed to use.
     * Requests saved that exceed the max stoarge limit will be dropped.
     *
     * @param maxStorageSize
     * @return This class for chaining
     */
    public KinesisRecorderConfig withMaxStorageSize(long maxStorageSize) {
        this.maxStorageSize = maxStorageSize;
        return this;
    }

    /**
     * @return The current max storage in bytes that KinesisRecorder is allowed
     *         to use.
     */
    public long getMaxStorageSize() {
        return this.maxStorageSize;
    }

    /**
     * Returns the client configuration the Kinesis Recorder will use when
     * making requests to Amazon Kinesis
     *
     * @return The client configuration
     */
    public ClientConfiguration getClientConfiguration() {
        return clientConfiguration;
    }

    /**
     * Returns the partition key.
     * 
     * @return the partition key.
     */
    public String getPartitionKey() {
        return partitionKey;
    }
}
