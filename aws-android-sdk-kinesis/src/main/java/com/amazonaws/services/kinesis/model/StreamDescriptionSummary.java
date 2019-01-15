/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output for <a>DescribeStreamSummary</a>
 * </p>
 */
public class StreamDescriptionSummary implements Serializable {
    /**
     * <p>
     * The name of the stream being described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream being described.
     * </p>
     */
    private String streamARN;

    /**
     * <p>
     * The current status of the stream being described. The stream status is
     * one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The stream is being created. Kinesis Data Streams
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The stream is being deleted. The specified stream
     * is in the <code>DELETING</code> state until Kinesis Data Streams
     * completes the deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The stream exists and is ready for read and write
     * operations or deletion. You should perform read and write operations only
     * on an <code>ACTIVE</code> stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Shards in the stream are being merged or split.
     * Read and write operations continue to work while the stream is in the
     * <code>UPDATING</code> state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, ACTIVE, UPDATING
     */
    private String streamStatus;

    /**
     * <p>
     * The current retention period, in hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     */
    private Integer retentionPeriodHours;

    /**
     * <p>
     * The approximate time that the stream was created.
     * </p>
     */
    private java.util.Date streamCreationTimestamp;

    /**
     * <p>
     * Represents the current enhanced monitoring settings of the stream.
     * </p>
     */
    private java.util.List<EnhancedMetrics> enhancedMonitoring = new java.util.ArrayList<EnhancedMetrics>();

    /**
     * <p>
     * The encryption type used. This value is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KMS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     */
    private String encryptionType;

    /**
     * <p>
     * The GUID for the customer-managed AWS KMS key to use for encryption. This
     * value can be a globally unique identifier, a fully specified ARN to
     * either an alias or a key, or an alias name prefixed by "alias/".You can
     * also use a master key owned by Kinesis Data Streams by specifying the
     * alias <code>aws/kinesis</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN example:
     * <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN example:
     * <code> arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally unique key ID example:
     * <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name example: <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * The number of open shards in the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     */
    private Integer openShardCount;

    /**
     * <p>
     * The name of the stream being described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream being described.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream being described.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream being described.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream being described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream being described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamDescriptionSummary withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream being described.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the stream being described.
     *         </p>
     */
    public String getStreamARN() {
        return streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream being described.
     * </p>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) for the stream being described.
     *            </p>
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream being described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) for the stream being described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamDescriptionSummary withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * <p>
     * The current status of the stream being described. The stream status is
     * one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The stream is being created. Kinesis Data Streams
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The stream is being deleted. The specified stream
     * is in the <code>DELETING</code> state until Kinesis Data Streams
     * completes the deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The stream exists and is ready for read and write
     * operations or deletion. You should perform read and write operations only
     * on an <code>ACTIVE</code> stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Shards in the stream are being merged or split.
     * Read and write operations continue to work while the stream is in the
     * <code>UPDATING</code> state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, ACTIVE, UPDATING
     *
     * @return <p>
     *         The current status of the stream being described. The stream
     *         status is one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The stream is being created. Kinesis Data
     *         Streams immediately returns and sets <code>StreamStatus</code> to
     *         <code>CREATING</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The stream is being deleted. The
     *         specified stream is in the <code>DELETING</code> state until
     *         Kinesis Data Streams completes the deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The stream exists and is ready for read and
     *         write operations or deletion. You should perform read and write
     *         operations only on an <code>ACTIVE</code> stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - Shards in the stream are being merged or
     *         split. Read and write operations continue to work while the
     *         stream is in the <code>UPDATING</code> state.
     *         </p>
     *         </li>
     *         </ul>
     * @see StreamStatus
     */
    public String getStreamStatus() {
        return streamStatus;
    }

    /**
     * <p>
     * The current status of the stream being described. The stream status is
     * one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The stream is being created. Kinesis Data Streams
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The stream is being deleted. The specified stream
     * is in the <code>DELETING</code> state until Kinesis Data Streams
     * completes the deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The stream exists and is ready for read and write
     * operations or deletion. You should perform read and write operations only
     * on an <code>ACTIVE</code> stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Shards in the stream are being merged or split.
     * Read and write operations continue to work while the stream is in the
     * <code>UPDATING</code> state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, ACTIVE, UPDATING
     *
     * @param streamStatus <p>
     *            The current status of the stream being described. The stream
     *            status is one of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The stream is being created. Kinesis
     *            Data Streams immediately returns and sets
     *            <code>StreamStatus</code> to <code>CREATING</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The stream is being deleted. The
     *            specified stream is in the <code>DELETING</code> state until
     *            Kinesis Data Streams completes the deletion.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The stream exists and is ready for read
     *            and write operations or deletion. You should perform read and
     *            write operations only on an <code>ACTIVE</code> stream.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - Shards in the stream are being merged
     *            or split. Read and write operations continue to work while the
     *            stream is in the <code>UPDATING</code> state.
     *            </p>
     *            </li>
     *            </ul>
     * @see StreamStatus
     */
    public void setStreamStatus(String streamStatus) {
        this.streamStatus = streamStatus;
    }

    /**
     * <p>
     * The current status of the stream being described. The stream status is
     * one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The stream is being created. Kinesis Data Streams
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The stream is being deleted. The specified stream
     * is in the <code>DELETING</code> state until Kinesis Data Streams
     * completes the deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The stream exists and is ready for read and write
     * operations or deletion. You should perform read and write operations only
     * on an <code>ACTIVE</code> stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Shards in the stream are being merged or split.
     * Read and write operations continue to work while the stream is in the
     * <code>UPDATING</code> state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, ACTIVE, UPDATING
     *
     * @param streamStatus <p>
     *            The current status of the stream being described. The stream
     *            status is one of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The stream is being created. Kinesis
     *            Data Streams immediately returns and sets
     *            <code>StreamStatus</code> to <code>CREATING</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The stream is being deleted. The
     *            specified stream is in the <code>DELETING</code> state until
     *            Kinesis Data Streams completes the deletion.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The stream exists and is ready for read
     *            and write operations or deletion. You should perform read and
     *            write operations only on an <code>ACTIVE</code> stream.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - Shards in the stream are being merged
     *            or split. Read and write operations continue to work while the
     *            stream is in the <code>UPDATING</code> state.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StreamStatus
     */
    public StreamDescriptionSummary withStreamStatus(String streamStatus) {
        this.streamStatus = streamStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the stream being described. The stream status is
     * one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The stream is being created. Kinesis Data Streams
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The stream is being deleted. The specified stream
     * is in the <code>DELETING</code> state until Kinesis Data Streams
     * completes the deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The stream exists and is ready for read and write
     * operations or deletion. You should perform read and write operations only
     * on an <code>ACTIVE</code> stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Shards in the stream are being merged or split.
     * Read and write operations continue to work while the stream is in the
     * <code>UPDATING</code> state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, ACTIVE, UPDATING
     *
     * @param streamStatus <p>
     *            The current status of the stream being described. The stream
     *            status is one of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The stream is being created. Kinesis
     *            Data Streams immediately returns and sets
     *            <code>StreamStatus</code> to <code>CREATING</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The stream is being deleted. The
     *            specified stream is in the <code>DELETING</code> state until
     *            Kinesis Data Streams completes the deletion.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The stream exists and is ready for read
     *            and write operations or deletion. You should perform read and
     *            write operations only on an <code>ACTIVE</code> stream.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - Shards in the stream are being merged
     *            or split. Read and write operations continue to work while the
     *            stream is in the <code>UPDATING</code> state.
     *            </p>
     *            </li>
     *            </ul>
     * @see StreamStatus
     */
    public void setStreamStatus(StreamStatus streamStatus) {
        this.streamStatus = streamStatus.toString();
    }

    /**
     * <p>
     * The current status of the stream being described. The stream status is
     * one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The stream is being created. Kinesis Data Streams
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The stream is being deleted. The specified stream
     * is in the <code>DELETING</code> state until Kinesis Data Streams
     * completes the deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The stream exists and is ready for read and write
     * operations or deletion. You should perform read and write operations only
     * on an <code>ACTIVE</code> stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - Shards in the stream are being merged or split.
     * Read and write operations continue to work while the stream is in the
     * <code>UPDATING</code> state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, ACTIVE, UPDATING
     *
     * @param streamStatus <p>
     *            The current status of the stream being described. The stream
     *            status is one of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATING</code> - The stream is being created. Kinesis
     *            Data Streams immediately returns and sets
     *            <code>StreamStatus</code> to <code>CREATING</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DELETING</code> - The stream is being deleted. The
     *            specified stream is in the <code>DELETING</code> state until
     *            Kinesis Data Streams completes the deletion.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ACTIVE</code> - The stream exists and is ready for read
     *            and write operations or deletion. You should perform read and
     *            write operations only on an <code>ACTIVE</code> stream.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATING</code> - Shards in the stream are being merged
     *            or split. Read and write operations continue to work while the
     *            stream is in the <code>UPDATING</code> state.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StreamStatus
     */
    public StreamDescriptionSummary withStreamStatus(StreamStatus streamStatus) {
        this.streamStatus = streamStatus.toString();
        return this;
    }

    /**
     * <p>
     * The current retention period, in hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @return <p>
     *         The current retention period, in hours.
     *         </p>
     */
    public Integer getRetentionPeriodHours() {
        return retentionPeriodHours;
    }

    /**
     * <p>
     * The current retention period, in hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @param retentionPeriodHours <p>
     *            The current retention period, in hours.
     *            </p>
     */
    public void setRetentionPeriodHours(Integer retentionPeriodHours) {
        this.retentionPeriodHours = retentionPeriodHours;
    }

    /**
     * <p>
     * The current retention period, in hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100000<br/>
     *
     * @param retentionPeriodHours <p>
     *            The current retention period, in hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamDescriptionSummary withRetentionPeriodHours(Integer retentionPeriodHours) {
        this.retentionPeriodHours = retentionPeriodHours;
        return this;
    }

    /**
     * <p>
     * The approximate time that the stream was created.
     * </p>
     *
     * @return <p>
     *         The approximate time that the stream was created.
     *         </p>
     */
    public java.util.Date getStreamCreationTimestamp() {
        return streamCreationTimestamp;
    }

    /**
     * <p>
     * The approximate time that the stream was created.
     * </p>
     *
     * @param streamCreationTimestamp <p>
     *            The approximate time that the stream was created.
     *            </p>
     */
    public void setStreamCreationTimestamp(java.util.Date streamCreationTimestamp) {
        this.streamCreationTimestamp = streamCreationTimestamp;
    }

    /**
     * <p>
     * The approximate time that the stream was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamCreationTimestamp <p>
     *            The approximate time that the stream was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamDescriptionSummary withStreamCreationTimestamp(
            java.util.Date streamCreationTimestamp) {
        this.streamCreationTimestamp = streamCreationTimestamp;
        return this;
    }

    /**
     * <p>
     * Represents the current enhanced monitoring settings of the stream.
     * </p>
     *
     * @return <p>
     *         Represents the current enhanced monitoring settings of the
     *         stream.
     *         </p>
     */
    public java.util.List<EnhancedMetrics> getEnhancedMonitoring() {
        return enhancedMonitoring;
    }

    /**
     * <p>
     * Represents the current enhanced monitoring settings of the stream.
     * </p>
     *
     * @param enhancedMonitoring <p>
     *            Represents the current enhanced monitoring settings of the
     *            stream.
     *            </p>
     */
    public void setEnhancedMonitoring(java.util.Collection<EnhancedMetrics> enhancedMonitoring) {
        if (enhancedMonitoring == null) {
            this.enhancedMonitoring = null;
            return;
        }

        this.enhancedMonitoring = new java.util.ArrayList<EnhancedMetrics>(enhancedMonitoring);
    }

    /**
     * <p>
     * Represents the current enhanced monitoring settings of the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enhancedMonitoring <p>
     *            Represents the current enhanced monitoring settings of the
     *            stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamDescriptionSummary withEnhancedMonitoring(EnhancedMetrics... enhancedMonitoring) {
        if (getEnhancedMonitoring() == null) {
            this.enhancedMonitoring = new java.util.ArrayList<EnhancedMetrics>(
                    enhancedMonitoring.length);
        }
        for (EnhancedMetrics value : enhancedMonitoring) {
            this.enhancedMonitoring.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents the current enhanced monitoring settings of the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enhancedMonitoring <p>
     *            Represents the current enhanced monitoring settings of the
     *            stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamDescriptionSummary withEnhancedMonitoring(
            java.util.Collection<EnhancedMetrics> enhancedMonitoring) {
        setEnhancedMonitoring(enhancedMonitoring);
        return this;
    }

    /**
     * <p>
     * The encryption type used. This value is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KMS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @return <p>
     *         The encryption type used. This value is one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KMS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code>
     *         </p>
     *         </li>
     *         </ul>
     * @see EncryptionType
     */
    public String getEncryptionType() {
        return encryptionType;
    }

    /**
     * <p>
     * The encryption type used. This value is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KMS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @param encryptionType <p>
     *            The encryption type used. This value is one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KMS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see EncryptionType
     */
    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The encryption type used. This value is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KMS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @param encryptionType <p>
     *            The encryption type used. This value is one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KMS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionType
     */
    public StreamDescriptionSummary withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * <p>
     * The encryption type used. This value is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KMS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @param encryptionType <p>
     *            The encryption type used. This value is one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KMS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see EncryptionType
     */
    public void setEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
    }

    /**
     * <p>
     * The encryption type used. This value is one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KMS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, KMS
     *
     * @param encryptionType <p>
     *            The encryption type used. This value is one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KMS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncryptionType
     */
    public StreamDescriptionSummary withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * <p>
     * The GUID for the customer-managed AWS KMS key to use for encryption. This
     * value can be a globally unique identifier, a fully specified ARN to
     * either an alias or a key, or an alias name prefixed by "alias/".You can
     * also use a master key owned by Kinesis Data Streams by specifying the
     * alias <code>aws/kinesis</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN example:
     * <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN example:
     * <code> arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally unique key ID example:
     * <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name example: <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The GUID for the customer-managed AWS KMS key to use for
     *         encryption. This value can be a globally unique identifier, a
     *         fully specified ARN to either an alias or a key, or an alias name
     *         prefixed by "alias/".You can also use a master key owned by
     *         Kinesis Data Streams by specifying the alias
     *         <code>aws/kinesis</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ARN example:
     *         <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN example:
     *         <code> arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Globally unique key ID example:
     *         <code>12345678-1234-1234-1234-123456789012</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias name example: <code>alias/MyAliasName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Master key owned by Kinesis Data Streams:
     *         <code>alias/aws/kinesis</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The GUID for the customer-managed AWS KMS key to use for encryption. This
     * value can be a globally unique identifier, a fully specified ARN to
     * either an alias or a key, or an alias name prefixed by "alias/".You can
     * also use a master key owned by Kinesis Data Streams by specifying the
     * alias <code>aws/kinesis</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN example:
     * <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN example:
     * <code> arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally unique key ID example:
     * <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name example: <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The GUID for the customer-managed AWS KMS key to use for
     *            encryption. This value can be a globally unique identifier, a
     *            fully specified ARN to either an alias or a key, or an alias
     *            name prefixed by "alias/".You can also use a master key owned
     *            by Kinesis Data Streams by specifying the alias
     *            <code>aws/kinesis</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ARN example:
     *            <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN example:
     *            <code> arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Globally unique key ID example:
     *            <code>12345678-1234-1234-1234-123456789012</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias name example: <code>alias/MyAliasName</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Master key owned by Kinesis Data Streams:
     *            <code>alias/aws/kinesis</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The GUID for the customer-managed AWS KMS key to use for encryption. This
     * value can be a globally unique identifier, a fully specified ARN to
     * either an alias or a key, or an alias name prefixed by "alias/".You can
     * also use a master key owned by Kinesis Data Streams by specifying the
     * alias <code>aws/kinesis</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ARN example:
     * <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN example:
     * <code> arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Globally unique key ID example:
     * <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name example: <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            The GUID for the customer-managed AWS KMS key to use for
     *            encryption. This value can be a globally unique identifier, a
     *            fully specified ARN to either an alias or a key, or an alias
     *            name prefixed by "alias/".You can also use a master key owned
     *            by Kinesis Data Streams by specifying the alias
     *            <code>aws/kinesis</code>.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key ARN example:
     *            <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias ARN example:
     *            <code> arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Globally unique key ID example:
     *            <code>12345678-1234-1234-1234-123456789012</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Alias name example: <code>alias/MyAliasName</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Master key owned by Kinesis Data Streams:
     *            <code>alias/aws/kinesis</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamDescriptionSummary withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * The number of open shards in the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     *
     * @return <p>
     *         The number of open shards in the stream.
     *         </p>
     */
    public Integer getOpenShardCount() {
        return openShardCount;
    }

    /**
     * <p>
     * The number of open shards in the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     *
     * @param openShardCount <p>
     *            The number of open shards in the stream.
     *            </p>
     */
    public void setOpenShardCount(Integer openShardCount) {
        this.openShardCount = openShardCount;
    }

    /**
     * <p>
     * The number of open shards in the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     *
     * @param openShardCount <p>
     *            The number of open shards in the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamDescriptionSummary withOpenShardCount(Integer openShardCount) {
        this.openShardCount = openShardCount;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getStreamARN() != null)
            sb.append("StreamARN: " + getStreamARN() + ",");
        if (getStreamStatus() != null)
            sb.append("StreamStatus: " + getStreamStatus() + ",");
        if (getRetentionPeriodHours() != null)
            sb.append("RetentionPeriodHours: " + getRetentionPeriodHours() + ",");
        if (getStreamCreationTimestamp() != null)
            sb.append("StreamCreationTimestamp: " + getStreamCreationTimestamp() + ",");
        if (getEnhancedMonitoring() != null)
            sb.append("EnhancedMonitoring: " + getEnhancedMonitoring() + ",");
        if (getEncryptionType() != null)
            sb.append("EncryptionType: " + getEncryptionType() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getOpenShardCount() != null)
            sb.append("OpenShardCount: " + getOpenShardCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode
                + ((getStreamStatus() == null) ? 0 : getStreamStatus().hashCode());
        hashCode = prime * hashCode
                + ((getRetentionPeriodHours() == null) ? 0 : getRetentionPeriodHours().hashCode());
        hashCode = prime
                * hashCode
                + ((getStreamCreationTimestamp() == null) ? 0 : getStreamCreationTimestamp()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEnhancedMonitoring() == null) ? 0 : getEnhancedMonitoring().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getOpenShardCount() == null) ? 0 : getOpenShardCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamDescriptionSummary == false)
            return false;
        StreamDescriptionSummary other = (StreamDescriptionSummary) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null
                && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getStreamStatus() == null ^ this.getStreamStatus() == null)
            return false;
        if (other.getStreamStatus() != null
                && other.getStreamStatus().equals(this.getStreamStatus()) == false)
            return false;
        if (other.getRetentionPeriodHours() == null ^ this.getRetentionPeriodHours() == null)
            return false;
        if (other.getRetentionPeriodHours() != null
                && other.getRetentionPeriodHours().equals(this.getRetentionPeriodHours()) == false)
            return false;
        if (other.getStreamCreationTimestamp() == null ^ this.getStreamCreationTimestamp() == null)
            return false;
        if (other.getStreamCreationTimestamp() != null
                && other.getStreamCreationTimestamp().equals(this.getStreamCreationTimestamp()) == false)
            return false;
        if (other.getEnhancedMonitoring() == null ^ this.getEnhancedMonitoring() == null)
            return false;
        if (other.getEnhancedMonitoring() != null
                && other.getEnhancedMonitoring().equals(this.getEnhancedMonitoring()) == false)
            return false;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null
                && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getOpenShardCount() == null ^ this.getOpenShardCount() == null)
            return false;
        if (other.getOpenShardCount() != null
                && other.getOpenShardCount().equals(this.getOpenShardCount()) == false)
            return false;
        return true;
    }
}
