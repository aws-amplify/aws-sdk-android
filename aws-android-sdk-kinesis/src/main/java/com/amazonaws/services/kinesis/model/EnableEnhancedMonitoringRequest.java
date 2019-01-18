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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enables enhanced Kinesis data stream monitoring for shard-level metrics.
 * </p>
 */
public class EnableEnhancedMonitoringRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the stream for which to enable enhanced monitoring.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * List of shard-level metrics to enable.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "
     * <code>ALL</code>" enables every metric.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IncomingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IncomingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WriteProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IteratorAgeMilliseconds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     * >Monitoring the Amazon Kinesis Data Streams Service with Amazon
     * CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     */
    private java.util.List<String> shardLevelMetrics = new java.util.ArrayList<String>();

    /**
     * <p>
     * The name of the stream for which to enable enhanced monitoring.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream for which to enable enhanced monitoring.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream for which to enable enhanced monitoring.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream for which to enable enhanced
     *            monitoring.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream for which to enable enhanced monitoring.
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
     *            The name of the stream for which to enable enhanced
     *            monitoring.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableEnhancedMonitoringRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * List of shard-level metrics to enable.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "
     * <code>ALL</code>" enables every metric.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IncomingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IncomingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WriteProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IteratorAgeMilliseconds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     * >Monitoring the Amazon Kinesis Data Streams Service with Amazon
     * CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         List of shard-level metrics to enable.
     *         </p>
     *         <p>
     *         The following are the valid shard-level metrics. The value "
     *         <code>ALL</code>" enables every metric.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IncomingBytes</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IncomingRecords</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OutgoingBytes</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OutgoingRecords</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WriteProvisionedThroughputExceeded</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReadProvisionedThroughputExceeded</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IteratorAgeMilliseconds</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     *         >Monitoring the Amazon Kinesis Data Streams Service with Amazon
     *         CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer
     *         Guide</i>.
     *         </p>
     */
    public java.util.List<String> getShardLevelMetrics() {
        return shardLevelMetrics;
    }

    /**
     * <p>
     * List of shard-level metrics to enable.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "
     * <code>ALL</code>" enables every metric.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IncomingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IncomingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WriteProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IteratorAgeMilliseconds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     * >Monitoring the Amazon Kinesis Data Streams Service with Amazon
     * CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     *
     * @param shardLevelMetrics <p>
     *            List of shard-level metrics to enable.
     *            </p>
     *            <p>
     *            The following are the valid shard-level metrics. The value "
     *            <code>ALL</code>" enables every metric.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IncomingBytes</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IncomingRecords</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OutgoingBytes</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OutgoingRecords</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>WriteProvisionedThroughputExceeded</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadProvisionedThroughputExceeded</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IteratorAgeMilliseconds</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     *            >Monitoring the Amazon Kinesis Data Streams Service with
     *            Amazon CloudWatch</a> in the <i>Amazon Kinesis Data Streams
     *            Developer Guide</i>.
     *            </p>
     */
    public void setShardLevelMetrics(java.util.Collection<String> shardLevelMetrics) {
        if (shardLevelMetrics == null) {
            this.shardLevelMetrics = null;
            return;
        }

        this.shardLevelMetrics = new java.util.ArrayList<String>(shardLevelMetrics);
    }

    /**
     * <p>
     * List of shard-level metrics to enable.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "
     * <code>ALL</code>" enables every metric.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IncomingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IncomingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WriteProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IteratorAgeMilliseconds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     * >Monitoring the Amazon Kinesis Data Streams Service with Amazon
     * CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shardLevelMetrics <p>
     *            List of shard-level metrics to enable.
     *            </p>
     *            <p>
     *            The following are the valid shard-level metrics. The value "
     *            <code>ALL</code>" enables every metric.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IncomingBytes</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IncomingRecords</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OutgoingBytes</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OutgoingRecords</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>WriteProvisionedThroughputExceeded</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadProvisionedThroughputExceeded</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IteratorAgeMilliseconds</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     *            >Monitoring the Amazon Kinesis Data Streams Service with
     *            Amazon CloudWatch</a> in the <i>Amazon Kinesis Data Streams
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableEnhancedMonitoringRequest withShardLevelMetrics(String... shardLevelMetrics) {
        if (getShardLevelMetrics() == null) {
            this.shardLevelMetrics = new java.util.ArrayList<String>(shardLevelMetrics.length);
        }
        for (String value : shardLevelMetrics) {
            this.shardLevelMetrics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of shard-level metrics to enable.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "
     * <code>ALL</code>" enables every metric.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IncomingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IncomingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WriteProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IteratorAgeMilliseconds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     * >Monitoring the Amazon Kinesis Data Streams Service with Amazon
     * CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shardLevelMetrics <p>
     *            List of shard-level metrics to enable.
     *            </p>
     *            <p>
     *            The following are the valid shard-level metrics. The value "
     *            <code>ALL</code>" enables every metric.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IncomingBytes</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IncomingRecords</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OutgoingBytes</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OutgoingRecords</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>WriteProvisionedThroughputExceeded</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ReadProvisionedThroughputExceeded</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IteratorAgeMilliseconds</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALL</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     *            >Monitoring the Amazon Kinesis Data Streams Service with
     *            Amazon CloudWatch</a> in the <i>Amazon Kinesis Data Streams
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableEnhancedMonitoringRequest withShardLevelMetrics(
            java.util.Collection<String> shardLevelMetrics) {
        setShardLevelMetrics(shardLevelMetrics);
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
        if (getShardLevelMetrics() != null)
            sb.append("ShardLevelMetrics: " + getShardLevelMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode
                + ((getShardLevelMetrics() == null) ? 0 : getShardLevelMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableEnhancedMonitoringRequest == false)
            return false;
        EnableEnhancedMonitoringRequest other = (EnableEnhancedMonitoringRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getShardLevelMetrics() == null ^ this.getShardLevelMetrics() == null)
            return false;
        if (other.getShardLevelMetrics() != null
                && other.getShardLevelMetrics().equals(this.getShardLevelMetrics()) == false)
            return false;
        return true;
    }
}
