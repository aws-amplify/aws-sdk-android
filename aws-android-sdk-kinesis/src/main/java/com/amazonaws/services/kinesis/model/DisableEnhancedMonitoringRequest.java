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

package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disables enhanced monitoring.
 * </p>
 */
public class DisableEnhancedMonitoringRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the Amazon Kinesis stream for which to disable enhanced
     * monitoring.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * List of shard-level metrics to disable.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "
     * <code>ALL</code>" disables every metric.
     * </p>
     * <ul>
     * <li> <code>IncomingBytes</code></li>
     * <li> <code>IncomingRecords</code></li>
     * <li> <code>OutgoingBytes</code></li>
     * <li> <code>OutgoingRecords</code></li>
     * <li> <code>WriteProvisionedThroughputExceeded</code></li>
     * <li> <code>ReadProvisionedThroughputExceeded</code></li>
     * <li> <code>IteratorAgeMilliseconds</code></li>
     * <li> <code>ALL</code></li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     * >Monitoring the Amazon Kinesis Streams Service with Amazon CloudWatch</a>
     * in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     */
    private java.util.List<String> shardLevelMetrics = new java.util.ArrayList<String>();

    /**
     * <p>
     * The name of the Amazon Kinesis stream for which to disable enhanced
     * monitoring.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the Amazon Kinesis stream for which to disable
     *         enhanced monitoring.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis stream for which to disable enhanced
     * monitoring.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the Amazon Kinesis stream for which to disable
     *            enhanced monitoring.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis stream for which to disable enhanced
     * monitoring.
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
     *            The name of the Amazon Kinesis stream for which to disable
     *            enhanced monitoring.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableEnhancedMonitoringRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * List of shard-level metrics to disable.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "
     * <code>ALL</code>" disables every metric.
     * </p>
     * <ul>
     * <li> <code>IncomingBytes</code></li>
     * <li> <code>IncomingRecords</code></li>
     * <li> <code>OutgoingBytes</code></li>
     * <li> <code>OutgoingRecords</code></li>
     * <li> <code>WriteProvisionedThroughputExceeded</code></li>
     * <li> <code>ReadProvisionedThroughputExceeded</code></li>
     * <li> <code>IteratorAgeMilliseconds</code></li>
     * <li> <code>ALL</code></li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     * >Monitoring the Amazon Kinesis Streams Service with Amazon CloudWatch</a>
     * in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         List of shard-level metrics to disable.
     *         </p>
     *         <p>
     *         The following are the valid shard-level metrics. The value "
     *         <code>ALL</code>" disables every metric.
     *         </p>
     *         <ul>
     *         <li> <code>IncomingBytes</code></li>
     *         <li> <code>IncomingRecords</code></li>
     *         <li> <code>OutgoingBytes</code></li>
     *         <li> <code>OutgoingRecords</code></li>
     *         <li> <code>WriteProvisionedThroughputExceeded</code></li>
     *         <li> <code>ReadProvisionedThroughputExceeded</code></li>
     *         <li> <code>IteratorAgeMilliseconds</code></li>
     *         <li> <code>ALL</code></li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     *         >Monitoring the Amazon Kinesis Streams Service with Amazon
     *         CloudWatch</a> in the <i>Amazon Kinesis Streams Developer
     *         Guide</i>.
     *         </p>
     */
    public java.util.List<String> getShardLevelMetrics() {
        return shardLevelMetrics;
    }

    /**
     * <p>
     * List of shard-level metrics to disable.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "
     * <code>ALL</code>" disables every metric.
     * </p>
     * <ul>
     * <li> <code>IncomingBytes</code></li>
     * <li> <code>IncomingRecords</code></li>
     * <li> <code>OutgoingBytes</code></li>
     * <li> <code>OutgoingRecords</code></li>
     * <li> <code>WriteProvisionedThroughputExceeded</code></li>
     * <li> <code>ReadProvisionedThroughputExceeded</code></li>
     * <li> <code>IteratorAgeMilliseconds</code></li>
     * <li> <code>ALL</code></li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     * >Monitoring the Amazon Kinesis Streams Service with Amazon CloudWatch</a>
     * in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     *
     * @param shardLevelMetrics <p>
     *            List of shard-level metrics to disable.
     *            </p>
     *            <p>
     *            The following are the valid shard-level metrics. The value "
     *            <code>ALL</code>" disables every metric.
     *            </p>
     *            <ul>
     *            <li> <code>IncomingBytes</code></li>
     *            <li> <code>IncomingRecords</code></li>
     *            <li> <code>OutgoingBytes</code></li>
     *            <li> <code>OutgoingRecords</code></li>
     *            <li> <code>WriteProvisionedThroughputExceeded</code></li>
     *            <li> <code>ReadProvisionedThroughputExceeded</code></li>
     *            <li> <code>IteratorAgeMilliseconds</code></li>
     *            <li> <code>ALL</code></li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     *            >Monitoring the Amazon Kinesis Streams Service with Amazon
     *            CloudWatch</a> in the <i>Amazon Kinesis Streams Developer
     *            Guide</i>.
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
     * List of shard-level metrics to disable.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "
     * <code>ALL</code>" disables every metric.
     * </p>
     * <ul>
     * <li> <code>IncomingBytes</code></li>
     * <li> <code>IncomingRecords</code></li>
     * <li> <code>OutgoingBytes</code></li>
     * <li> <code>OutgoingRecords</code></li>
     * <li> <code>WriteProvisionedThroughputExceeded</code></li>
     * <li> <code>ReadProvisionedThroughputExceeded</code></li>
     * <li> <code>IteratorAgeMilliseconds</code></li>
     * <li> <code>ALL</code></li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     * >Monitoring the Amazon Kinesis Streams Service with Amazon CloudWatch</a>
     * in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shardLevelMetrics <p>
     *            List of shard-level metrics to disable.
     *            </p>
     *            <p>
     *            The following are the valid shard-level metrics. The value "
     *            <code>ALL</code>" disables every metric.
     *            </p>
     *            <ul>
     *            <li> <code>IncomingBytes</code></li>
     *            <li> <code>IncomingRecords</code></li>
     *            <li> <code>OutgoingBytes</code></li>
     *            <li> <code>OutgoingRecords</code></li>
     *            <li> <code>WriteProvisionedThroughputExceeded</code></li>
     *            <li> <code>ReadProvisionedThroughputExceeded</code></li>
     *            <li> <code>IteratorAgeMilliseconds</code></li>
     *            <li> <code>ALL</code></li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     *            >Monitoring the Amazon Kinesis Streams Service with Amazon
     *            CloudWatch</a> in the <i>Amazon Kinesis Streams Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableEnhancedMonitoringRequest withShardLevelMetrics(String... shardLevelMetrics) {
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
     * List of shard-level metrics to disable.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "
     * <code>ALL</code>" disables every metric.
     * </p>
     * <ul>
     * <li> <code>IncomingBytes</code></li>
     * <li> <code>IncomingRecords</code></li>
     * <li> <code>OutgoingBytes</code></li>
     * <li> <code>OutgoingRecords</code></li>
     * <li> <code>WriteProvisionedThroughputExceeded</code></li>
     * <li> <code>ReadProvisionedThroughputExceeded</code></li>
     * <li> <code>IteratorAgeMilliseconds</code></li>
     * <li> <code>ALL</code></li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     * >Monitoring the Amazon Kinesis Streams Service with Amazon CloudWatch</a>
     * in the <i>Amazon Kinesis Streams Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shardLevelMetrics <p>
     *            List of shard-level metrics to disable.
     *            </p>
     *            <p>
     *            The following are the valid shard-level metrics. The value "
     *            <code>ALL</code>" disables every metric.
     *            </p>
     *            <ul>
     *            <li> <code>IncomingBytes</code></li>
     *            <li> <code>IncomingRecords</code></li>
     *            <li> <code>OutgoingBytes</code></li>
     *            <li> <code>OutgoingRecords</code></li>
     *            <li> <code>WriteProvisionedThroughputExceeded</code></li>
     *            <li> <code>ReadProvisionedThroughputExceeded</code></li>
     *            <li> <code>IteratorAgeMilliseconds</code></li>
     *            <li> <code>ALL</code></li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html"
     *            >Monitoring the Amazon Kinesis Streams Service with Amazon
     *            CloudWatch</a> in the <i>Amazon Kinesis Streams Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableEnhancedMonitoringRequest withShardLevelMetrics(
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

        if (obj instanceof DisableEnhancedMonitoringRequest == false)
            return false;
        DisableEnhancedMonitoringRequest other = (DisableEnhancedMonitoringRequest) obj;

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
