/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the output for <a>DescribeStream</a>.
 * </p>
 */
public class StreamDescription implements Serializable {
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
     * <li><code>CREATING</code> - The stream is being created. Amazon Kinesis
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.</li>
     * <li><code>DELETING</code> - The stream is being deleted. The specified
     * stream is in the <code>DELETING</code> state until Amazon Kinesis
     * completes the deletion.</li>
     * <li><code>ACTIVE</code> - The stream exists and is ready for read and
     * write operations or deletion. You should perform read and write
     * operations only on an <code>ACTIVE</code> stream.</li>
     * <li><code>UPDATING</code> - Shards in the stream are being merged or
     * split. Read and write operations continue to work while the stream is in
     * the <code>UPDATING</code> state.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, ACTIVE, UPDATING
     */
    private String streamStatus;

    /**
     * <p>
     * The shards that comprise the stream.
     * </p>
     */
    private java.util.List<Shard> shards = new java.util.ArrayList<Shard>();

    /**
     * <p>
     * If set to <code>true</code>, more shards in the stream are available to
     * describe.
     * </p>
     */
    private Boolean hasMoreShards;

    /**
     * <p>
     * The current retention period, in hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>24 - 168<br/>
     */
    private Integer retentionPeriodHours;

    /**
     * <p>
     * Represents the current enhanced monitoring settings of the stream.
     * </p>
     */
    private java.util.List<EnhancedMetrics> enhancedMonitoring = new java.util.ArrayList<EnhancedMetrics>();

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
    public StreamDescription withStreamName(String streamName) {
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
    public StreamDescription withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * <p>
     * The current status of the stream being described. The stream status is
     * one of the following states:
     * </p>
     * <ul>
     * <li><code>CREATING</code> - The stream is being created. Amazon Kinesis
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.</li>
     * <li><code>DELETING</code> - The stream is being deleted. The specified
     * stream is in the <code>DELETING</code> state until Amazon Kinesis
     * completes the deletion.</li>
     * <li><code>ACTIVE</code> - The stream exists and is ready for read and
     * write operations or deletion. You should perform read and write
     * operations only on an <code>ACTIVE</code> stream.</li>
     * <li><code>UPDATING</code> - Shards in the stream are being merged or
     * split. Read and write operations continue to work while the stream is in
     * the <code>UPDATING</code> state.</li>
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
     *         <li><code>CREATING</code> - The stream is being created. Amazon
     *         Kinesis immediately returns and sets <code>StreamStatus</code> to
     *         <code>CREATING</code>.</li>
     *         <li><code>DELETING</code> - The stream is being deleted. The
     *         specified stream is in the <code>DELETING</code> state until
     *         Amazon Kinesis completes the deletion.</li>
     *         <li><code>ACTIVE</code> - The stream exists and is ready for read
     *         and write operations or deletion. You should perform read and
     *         write operations only on an <code>ACTIVE</code> stream.</li>
     *         <li><code>UPDATING</code> - Shards in the stream are being merged
     *         or split. Read and write operations continue to work while the
     *         stream is in the <code>UPDATING</code> state.</li>
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
     * <li><code>CREATING</code> - The stream is being created. Amazon Kinesis
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.</li>
     * <li><code>DELETING</code> - The stream is being deleted. The specified
     * stream is in the <code>DELETING</code> state until Amazon Kinesis
     * completes the deletion.</li>
     * <li><code>ACTIVE</code> - The stream exists and is ready for read and
     * write operations or deletion. You should perform read and write
     * operations only on an <code>ACTIVE</code> stream.</li>
     * <li><code>UPDATING</code> - Shards in the stream are being merged or
     * split. Read and write operations continue to work while the stream is in
     * the <code>UPDATING</code> state.</li>
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
     *            <li><code>CREATING</code> - The stream is being created.
     *            Amazon Kinesis immediately returns and sets
     *            <code>StreamStatus</code> to <code>CREATING</code>.</li>
     *            <li><code>DELETING</code> - The stream is being deleted. The
     *            specified stream is in the <code>DELETING</code> state until
     *            Amazon Kinesis completes the deletion.</li>
     *            <li><code>ACTIVE</code> - The stream exists and is ready for
     *            read and write operations or deletion. You should perform read
     *            and write operations only on an <code>ACTIVE</code> stream.</li>
     *            <li><code>UPDATING</code> - Shards in the stream are being
     *            merged or split. Read and write operations continue to work
     *            while the stream is in the <code>UPDATING</code> state.</li>
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
     * <li><code>CREATING</code> - The stream is being created. Amazon Kinesis
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.</li>
     * <li><code>DELETING</code> - The stream is being deleted. The specified
     * stream is in the <code>DELETING</code> state until Amazon Kinesis
     * completes the deletion.</li>
     * <li><code>ACTIVE</code> - The stream exists and is ready for read and
     * write operations or deletion. You should perform read and write
     * operations only on an <code>ACTIVE</code> stream.</li>
     * <li><code>UPDATING</code> - Shards in the stream are being merged or
     * split. Read and write operations continue to work while the stream is in
     * the <code>UPDATING</code> state.</li>
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
     *            <li><code>CREATING</code> - The stream is being created.
     *            Amazon Kinesis immediately returns and sets
     *            <code>StreamStatus</code> to <code>CREATING</code>.</li>
     *            <li><code>DELETING</code> - The stream is being deleted. The
     *            specified stream is in the <code>DELETING</code> state until
     *            Amazon Kinesis completes the deletion.</li>
     *            <li><code>ACTIVE</code> - The stream exists and is ready for
     *            read and write operations or deletion. You should perform read
     *            and write operations only on an <code>ACTIVE</code> stream.</li>
     *            <li><code>UPDATING</code> - Shards in the stream are being
     *            merged or split. Read and write operations continue to work
     *            while the stream is in the <code>UPDATING</code> state.</li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StreamStatus
     */
    public StreamDescription withStreamStatus(String streamStatus) {
        this.streamStatus = streamStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the stream being described. The stream status is
     * one of the following states:
     * </p>
     * <ul>
     * <li><code>CREATING</code> - The stream is being created. Amazon Kinesis
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.</li>
     * <li><code>DELETING</code> - The stream is being deleted. The specified
     * stream is in the <code>DELETING</code> state until Amazon Kinesis
     * completes the deletion.</li>
     * <li><code>ACTIVE</code> - The stream exists and is ready for read and
     * write operations or deletion. You should perform read and write
     * operations only on an <code>ACTIVE</code> stream.</li>
     * <li><code>UPDATING</code> - Shards in the stream are being merged or
     * split. Read and write operations continue to work while the stream is in
     * the <code>UPDATING</code> state.</li>
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
     *            <li><code>CREATING</code> - The stream is being created.
     *            Amazon Kinesis immediately returns and sets
     *            <code>StreamStatus</code> to <code>CREATING</code>.</li>
     *            <li><code>DELETING</code> - The stream is being deleted. The
     *            specified stream is in the <code>DELETING</code> state until
     *            Amazon Kinesis completes the deletion.</li>
     *            <li><code>ACTIVE</code> - The stream exists and is ready for
     *            read and write operations or deletion. You should perform read
     *            and write operations only on an <code>ACTIVE</code> stream.</li>
     *            <li><code>UPDATING</code> - Shards in the stream are being
     *            merged or split. Read and write operations continue to work
     *            while the stream is in the <code>UPDATING</code> state.</li>
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
     * <li><code>CREATING</code> - The stream is being created. Amazon Kinesis
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.</li>
     * <li><code>DELETING</code> - The stream is being deleted. The specified
     * stream is in the <code>DELETING</code> state until Amazon Kinesis
     * completes the deletion.</li>
     * <li><code>ACTIVE</code> - The stream exists and is ready for read and
     * write operations or deletion. You should perform read and write
     * operations only on an <code>ACTIVE</code> stream.</li>
     * <li><code>UPDATING</code> - Shards in the stream are being merged or
     * split. Read and write operations continue to work while the stream is in
     * the <code>UPDATING</code> state.</li>
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
     *            <li><code>CREATING</code> - The stream is being created.
     *            Amazon Kinesis immediately returns and sets
     *            <code>StreamStatus</code> to <code>CREATING</code>.</li>
     *            <li><code>DELETING</code> - The stream is being deleted. The
     *            specified stream is in the <code>DELETING</code> state until
     *            Amazon Kinesis completes the deletion.</li>
     *            <li><code>ACTIVE</code> - The stream exists and is ready for
     *            read and write operations or deletion. You should perform read
     *            and write operations only on an <code>ACTIVE</code> stream.</li>
     *            <li><code>UPDATING</code> - Shards in the stream are being
     *            merged or split. Read and write operations continue to work
     *            while the stream is in the <code>UPDATING</code> state.</li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StreamStatus
     */
    public StreamDescription withStreamStatus(StreamStatus streamStatus) {
        this.streamStatus = streamStatus.toString();
        return this;
    }

    /**
     * <p>
     * The shards that comprise the stream.
     * </p>
     *
     * @return <p>
     *         The shards that comprise the stream.
     *         </p>
     */
    public java.util.List<Shard> getShards() {
        return shards;
    }

    /**
     * <p>
     * The shards that comprise the stream.
     * </p>
     *
     * @param shards <p>
     *            The shards that comprise the stream.
     *            </p>
     */
    public void setShards(java.util.Collection<Shard> shards) {
        if (shards == null) {
            this.shards = null;
            return;
        }

        this.shards = new java.util.ArrayList<Shard>(shards);
    }

    /**
     * <p>
     * The shards that comprise the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shards <p>
     *            The shards that comprise the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamDescription withShards(Shard... shards) {
        if (getShards() == null) {
            this.shards = new java.util.ArrayList<Shard>(shards.length);
        }
        for (Shard value : shards) {
            this.shards.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The shards that comprise the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shards <p>
     *            The shards that comprise the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamDescription withShards(java.util.Collection<Shard> shards) {
        setShards(shards);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, more shards in the stream are available to
     * describe.
     * </p>
     *
     * @return <p>
     *         If set to <code>true</code>, more shards in the stream are
     *         available to describe.
     *         </p>
     */
    public Boolean isHasMoreShards() {
        return hasMoreShards;
    }

    /**
     * <p>
     * If set to <code>true</code>, more shards in the stream are available to
     * describe.
     * </p>
     *
     * @return <p>
     *         If set to <code>true</code>, more shards in the stream are
     *         available to describe.
     *         </p>
     */
    public Boolean getHasMoreShards() {
        return hasMoreShards;
    }

    /**
     * <p>
     * If set to <code>true</code>, more shards in the stream are available to
     * describe.
     * </p>
     *
     * @param hasMoreShards <p>
     *            If set to <code>true</code>, more shards in the stream are
     *            available to describe.
     *            </p>
     */
    public void setHasMoreShards(Boolean hasMoreShards) {
        this.hasMoreShards = hasMoreShards;
    }

    /**
     * <p>
     * If set to <code>true</code>, more shards in the stream are available to
     * describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hasMoreShards <p>
     *            If set to <code>true</code>, more shards in the stream are
     *            available to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamDescription withHasMoreShards(Boolean hasMoreShards) {
        this.hasMoreShards = hasMoreShards;
        return this;
    }

    /**
     * <p>
     * The current retention period, in hours.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>24 - 168<br/>
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
     * <b>Range: </b>24 - 168<br/>
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
     * <b>Range: </b>24 - 168<br/>
     *
     * @param retentionPeriodHours <p>
     *            The current retention period, in hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StreamDescription withRetentionPeriodHours(Integer retentionPeriodHours) {
        this.retentionPeriodHours = retentionPeriodHours;
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
    public StreamDescription withEnhancedMonitoring(EnhancedMetrics... enhancedMonitoring) {
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
    public StreamDescription withEnhancedMonitoring(
            java.util.Collection<EnhancedMetrics> enhancedMonitoring) {
        setEnhancedMonitoring(enhancedMonitoring);
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
        if (getShards() != null)
            sb.append("Shards: " + getShards() + ",");
        if (getHasMoreShards() != null)
            sb.append("HasMoreShards: " + getHasMoreShards() + ",");
        if (getRetentionPeriodHours() != null)
            sb.append("RetentionPeriodHours: " + getRetentionPeriodHours() + ",");
        if (getEnhancedMonitoring() != null)
            sb.append("EnhancedMonitoring: " + getEnhancedMonitoring());
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
        hashCode = prime * hashCode + ((getShards() == null) ? 0 : getShards().hashCode());
        hashCode = prime * hashCode
                + ((getHasMoreShards() == null) ? 0 : getHasMoreShards().hashCode());
        hashCode = prime * hashCode
                + ((getRetentionPeriodHours() == null) ? 0 : getRetentionPeriodHours().hashCode());
        hashCode = prime * hashCode
                + ((getEnhancedMonitoring() == null) ? 0 : getEnhancedMonitoring().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamDescription == false)
            return false;
        StreamDescription other = (StreamDescription) obj;

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
        if (other.getShards() == null ^ this.getShards() == null)
            return false;
        if (other.getShards() != null && other.getShards().equals(this.getShards()) == false)
            return false;
        if (other.getHasMoreShards() == null ^ this.getHasMoreShards() == null)
            return false;
        if (other.getHasMoreShards() != null
                && other.getHasMoreShards().equals(this.getHasMoreShards()) == false)
            return false;
        if (other.getRetentionPeriodHours() == null ^ this.getRetentionPeriodHours() == null)
            return false;
        if (other.getRetentionPeriodHours() != null
                && other.getRetentionPeriodHours().equals(this.getRetentionPeriodHours()) == false)
            return false;
        if (other.getEnhancedMonitoring() == null ^ this.getEnhancedMonitoring() == null)
            return false;
        if (other.getEnhancedMonitoring() != null
                && other.getEnhancedMonitoring().equals(this.getEnhancedMonitoring()) == false)
            return false;
        return true;
    }
}
