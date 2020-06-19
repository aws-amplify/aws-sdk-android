/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>TestFailover</code> operation which test
 * automatic failover on a specified node group (called shard in the console) in
 * a replication group (called cluster in the console).
 * </p>
 * <p class="title">
 * <b>Note the following</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * A customer can use this operation to test automatic failover on up to 5
 * shards (called node groups in the ElastiCache API and AWS CLI) in any rolling
 * 24-hour period.
 * </p>
 * </li>
 * <li>
 * <p>
 * If calling this operation on shards in different clusters (called replication
 * groups in the API and CLI), the calls can be made concurrently.
 * </p>
 * <p>
 * </p></li>
 * <li>
 * <p>
 * If calling this operation multiple times on different shards in the same
 * Redis (cluster mode enabled) replication group, the first node replacement
 * must complete before a subsequent call can be made.
 * </p>
 * </li>
 * <li>
 * <p>
 * To determine whether the node replacement is complete you can check Events
 * using the Amazon ElastiCache console, the AWS CLI, or the ElastiCache API.
 * Look for the following automatic failover related events, listed here in
 * order of occurrance:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Replication group message:
 * <code>Test Failover API called for node group &lt;node-group-id&gt;</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Cache cluster message:
 * <code>Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Replication group message:
 * <code>Failover from master node &lt;primary-node-id&gt; to replica node &lt;node-id&gt; completed</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Cache cluster message: <code>Recovering cache nodes &lt;node-id&gt;</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Cache cluster message:
 * <code>Finished recovery for cache nodes &lt;node-id&gt;</code>
 * </p>
 * </li>
 * </ol>
 * <p>
 * For more information see:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/ECEvents.Viewing.html"
 * >Viewing ElastiCache Events</a> in the <i>ElastiCache User Guide</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_DescribeEvents.html"
 * >DescribeEvents</a> in the ElastiCache API Reference
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * Also see, <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html#auto-failover-test"
 * >Testing Multi-AZ with Automatic Failover</a> in the <i>ElastiCache User
 * Guide</i>.
 * </p>
 */
public class TestFailoverRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the replication group (console: cluster) whose automatic
     * failover is being tested by this operation.
     * </p>
     */
    private String replicationGroupId;

    /**
     * <p>
     * The name of the node group (called shard in the console) in this
     * replication group on which automatic failover is to be tested. You may
     * test automatic failover on up to 5 node groups in any rolling 24-hour
     * period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>\d+<br/>
     */
    private String nodeGroupId;

    /**
     * <p>
     * The name of the replication group (console: cluster) whose automatic
     * failover is being tested by this operation.
     * </p>
     *
     * @return <p>
     *         The name of the replication group (console: cluster) whose
     *         automatic failover is being tested by this operation.
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The name of the replication group (console: cluster) whose automatic
     * failover is being tested by this operation.
     * </p>
     *
     * @param replicationGroupId <p>
     *            The name of the replication group (console: cluster) whose
     *            automatic failover is being tested by this operation.
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The name of the replication group (console: cluster) whose automatic
     * failover is being tested by this operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The name of the replication group (console: cluster) whose
     *            automatic failover is being tested by this operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestFailoverRequest withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * The name of the node group (called shard in the console) in this
     * replication group on which automatic failover is to be tested. You may
     * test automatic failover on up to 5 node groups in any rolling 24-hour
     * period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @return <p>
     *         The name of the node group (called shard in the console) in this
     *         replication group on which automatic failover is to be tested.
     *         You may test automatic failover on up to 5 node groups in any
     *         rolling 24-hour period.
     *         </p>
     */
    public String getNodeGroupId() {
        return nodeGroupId;
    }

    /**
     * <p>
     * The name of the node group (called shard in the console) in this
     * replication group on which automatic failover is to be tested. You may
     * test automatic failover on up to 5 node groups in any rolling 24-hour
     * period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param nodeGroupId <p>
     *            The name of the node group (called shard in the console) in
     *            this replication group on which automatic failover is to be
     *            tested. You may test automatic failover on up to 5 node groups
     *            in any rolling 24-hour period.
     *            </p>
     */
    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    /**
     * <p>
     * The name of the node group (called shard in the console) in this
     * replication group on which automatic failover is to be tested. You may
     * test automatic failover on up to 5 node groups in any rolling 24-hour
     * period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param nodeGroupId <p>
     *            The name of the node group (called shard in the console) in
     *            this replication group on which automatic failover is to be
     *            tested. You may test automatic failover on up to 5 node groups
     *            in any rolling 24-hour period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestFailoverRequest withNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getNodeGroupId() != null)
            sb.append("NodeGroupId: " + getNodeGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getNodeGroupId() == null) ? 0 : getNodeGroupId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestFailoverRequest == false)
            return false;
        TestFailoverRequest other = (TestFailoverRequest) obj;

        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getNodeGroupId() == null ^ this.getNodeGroupId() == null)
            return false;
        if (other.getNodeGroupId() != null
                && other.getNodeGroupId().equals(this.getNodeGroupId()) == false)
            return false;
        return true;
    }
}
