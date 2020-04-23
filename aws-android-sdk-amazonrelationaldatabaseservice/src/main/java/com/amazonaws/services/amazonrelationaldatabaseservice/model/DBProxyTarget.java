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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <note>
 * <p>
 * This is prerelease documentation for the RDS Database Proxy feature in
 * preview release. It is subject to change.
 * </p>
 * </note>
 * <p>
 * Contains the details for an RDS Proxy target. It represents an RDS DB
 * instance or Aurora DB cluster that the proxy can connect to. One or more
 * targets are associated with an RDS Proxy target group.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <code>DescribeDBProxyTargets</code> action.
 * </p>
 */
public class DBProxyTarget implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the RDS DB instance or Aurora DB
     * cluster.
     * </p>
     */
    private String targetArn;

    /**
     * <p>
     * The writer endpoint for the RDS DB instance or Aurora DB cluster.
     * </p>
     */
    private String endpoint;

    /**
     * <p>
     * The DB cluster identifier when the target represents an Aurora DB
     * cluster. This field is blank when the target represents an RDS DB
     * instance.
     * </p>
     */
    private String trackedClusterId;

    /**
     * <p>
     * The identifier representing the target. It can be the instance identifier
     * for an RDS DB instance, or the cluster identifier for an Aurora DB
     * cluster.
     * </p>
     */
    private String rdsResourceId;

    /**
     * <p>
     * The port that the RDS Proxy uses to connect to the target RDS DB instance
     * or Aurora DB cluster.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * Specifies the kind of database, such as an RDS DB instance or an Aurora
     * DB cluster, that the target represents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RDS_INSTANCE, RDS_SERVERLESS_ENDPOINT,
     * TRACKED_CLUSTER
     */
    private String type;

    /**
     * <p>
     * Information about the connection health of the RDS Proxy target.
     * </p>
     */
    private TargetHealth targetHealth;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the RDS DB instance or Aurora DB
     * cluster.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the RDS DB instance or Aurora
     *         DB cluster.
     *         </p>
     */
    public String getTargetArn() {
        return targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the RDS DB instance or Aurora DB
     * cluster.
     * </p>
     *
     * @param targetArn <p>
     *            The Amazon Resource Name (ARN) for the RDS DB instance or
     *            Aurora DB cluster.
     *            </p>
     */
    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the RDS DB instance or Aurora DB
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetArn <p>
     *            The Amazon Resource Name (ARN) for the RDS DB instance or
     *            Aurora DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxyTarget withTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    /**
     * <p>
     * The writer endpoint for the RDS DB instance or Aurora DB cluster.
     * </p>
     *
     * @return <p>
     *         The writer endpoint for the RDS DB instance or Aurora DB cluster.
     *         </p>
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * The writer endpoint for the RDS DB instance or Aurora DB cluster.
     * </p>
     *
     * @param endpoint <p>
     *            The writer endpoint for the RDS DB instance or Aurora DB
     *            cluster.
     *            </p>
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The writer endpoint for the RDS DB instance or Aurora DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoint <p>
     *            The writer endpoint for the RDS DB instance or Aurora DB
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxyTarget withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * <p>
     * The DB cluster identifier when the target represents an Aurora DB
     * cluster. This field is blank when the target represents an RDS DB
     * instance.
     * </p>
     *
     * @return <p>
     *         The DB cluster identifier when the target represents an Aurora DB
     *         cluster. This field is blank when the target represents an RDS DB
     *         instance.
     *         </p>
     */
    public String getTrackedClusterId() {
        return trackedClusterId;
    }

    /**
     * <p>
     * The DB cluster identifier when the target represents an Aurora DB
     * cluster. This field is blank when the target represents an RDS DB
     * instance.
     * </p>
     *
     * @param trackedClusterId <p>
     *            The DB cluster identifier when the target represents an Aurora
     *            DB cluster. This field is blank when the target represents an
     *            RDS DB instance.
     *            </p>
     */
    public void setTrackedClusterId(String trackedClusterId) {
        this.trackedClusterId = trackedClusterId;
    }

    /**
     * <p>
     * The DB cluster identifier when the target represents an Aurora DB
     * cluster. This field is blank when the target represents an RDS DB
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trackedClusterId <p>
     *            The DB cluster identifier when the target represents an Aurora
     *            DB cluster. This field is blank when the target represents an
     *            RDS DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxyTarget withTrackedClusterId(String trackedClusterId) {
        this.trackedClusterId = trackedClusterId;
        return this;
    }

    /**
     * <p>
     * The identifier representing the target. It can be the instance identifier
     * for an RDS DB instance, or the cluster identifier for an Aurora DB
     * cluster.
     * </p>
     *
     * @return <p>
     *         The identifier representing the target. It can be the instance
     *         identifier for an RDS DB instance, or the cluster identifier for
     *         an Aurora DB cluster.
     *         </p>
     */
    public String getRdsResourceId() {
        return rdsResourceId;
    }

    /**
     * <p>
     * The identifier representing the target. It can be the instance identifier
     * for an RDS DB instance, or the cluster identifier for an Aurora DB
     * cluster.
     * </p>
     *
     * @param rdsResourceId <p>
     *            The identifier representing the target. It can be the instance
     *            identifier for an RDS DB instance, or the cluster identifier
     *            for an Aurora DB cluster.
     *            </p>
     */
    public void setRdsResourceId(String rdsResourceId) {
        this.rdsResourceId = rdsResourceId;
    }

    /**
     * <p>
     * The identifier representing the target. It can be the instance identifier
     * for an RDS DB instance, or the cluster identifier for an Aurora DB
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rdsResourceId <p>
     *            The identifier representing the target. It can be the instance
     *            identifier for an RDS DB instance, or the cluster identifier
     *            for an Aurora DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxyTarget withRdsResourceId(String rdsResourceId) {
        this.rdsResourceId = rdsResourceId;
        return this;
    }

    /**
     * <p>
     * The port that the RDS Proxy uses to connect to the target RDS DB instance
     * or Aurora DB cluster.
     * </p>
     *
     * @return <p>
     *         The port that the RDS Proxy uses to connect to the target RDS DB
     *         instance or Aurora DB cluster.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port that the RDS Proxy uses to connect to the target RDS DB instance
     * or Aurora DB cluster.
     * </p>
     *
     * @param port <p>
     *            The port that the RDS Proxy uses to connect to the target RDS
     *            DB instance or Aurora DB cluster.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port that the RDS Proxy uses to connect to the target RDS DB instance
     * or Aurora DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port that the RDS Proxy uses to connect to the target RDS
     *            DB instance or Aurora DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxyTarget withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * Specifies the kind of database, such as an RDS DB instance or an Aurora
     * DB cluster, that the target represents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RDS_INSTANCE, RDS_SERVERLESS_ENDPOINT,
     * TRACKED_CLUSTER
     *
     * @return <p>
     *         Specifies the kind of database, such as an RDS DB instance or an
     *         Aurora DB cluster, that the target represents.
     *         </p>
     * @see TargetType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Specifies the kind of database, such as an RDS DB instance or an Aurora
     * DB cluster, that the target represents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RDS_INSTANCE, RDS_SERVERLESS_ENDPOINT,
     * TRACKED_CLUSTER
     *
     * @param type <p>
     *            Specifies the kind of database, such as an RDS DB instance or
     *            an Aurora DB cluster, that the target represents.
     *            </p>
     * @see TargetType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the kind of database, such as an RDS DB instance or an Aurora
     * DB cluster, that the target represents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RDS_INSTANCE, RDS_SERVERLESS_ENDPOINT,
     * TRACKED_CLUSTER
     *
     * @param type <p>
     *            Specifies the kind of database, such as an RDS DB instance or
     *            an Aurora DB cluster, that the target represents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetType
     */
    public DBProxyTarget withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * Specifies the kind of database, such as an RDS DB instance or an Aurora
     * DB cluster, that the target represents.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RDS_INSTANCE, RDS_SERVERLESS_ENDPOINT,
     * TRACKED_CLUSTER
     *
     * @param type <p>
     *            Specifies the kind of database, such as an RDS DB instance or
     *            an Aurora DB cluster, that the target represents.
     *            </p>
     * @see TargetType
     */
    public void setType(TargetType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Specifies the kind of database, such as an RDS DB instance or an Aurora
     * DB cluster, that the target represents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RDS_INSTANCE, RDS_SERVERLESS_ENDPOINT,
     * TRACKED_CLUSTER
     *
     * @param type <p>
     *            Specifies the kind of database, such as an RDS DB instance or
     *            an Aurora DB cluster, that the target represents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetType
     */
    public DBProxyTarget withType(TargetType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the connection health of the RDS Proxy target.
     * </p>
     *
     * @return <p>
     *         Information about the connection health of the RDS Proxy target.
     *         </p>
     */
    public TargetHealth getTargetHealth() {
        return targetHealth;
    }

    /**
     * <p>
     * Information about the connection health of the RDS Proxy target.
     * </p>
     *
     * @param targetHealth <p>
     *            Information about the connection health of the RDS Proxy
     *            target.
     *            </p>
     */
    public void setTargetHealth(TargetHealth targetHealth) {
        this.targetHealth = targetHealth;
    }

    /**
     * <p>
     * Information about the connection health of the RDS Proxy target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetHealth <p>
     *            Information about the connection health of the RDS Proxy
     *            target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxyTarget withTargetHealth(TargetHealth targetHealth) {
        this.targetHealth = targetHealth;
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
        if (getTargetArn() != null)
            sb.append("TargetArn: " + getTargetArn() + ",");
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getTrackedClusterId() != null)
            sb.append("TrackedClusterId: " + getTrackedClusterId() + ",");
        if (getRdsResourceId() != null)
            sb.append("RdsResourceId: " + getRdsResourceId() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getTargetHealth() != null)
            sb.append("TargetHealth: " + getTargetHealth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getTrackedClusterId() == null) ? 0 : getTrackedClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getRdsResourceId() == null) ? 0 : getRdsResourceId().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getTargetHealth() == null) ? 0 : getTargetHealth().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBProxyTarget == false)
            return false;
        DBProxyTarget other = (DBProxyTarget) obj;

        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null
                && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getTrackedClusterId() == null ^ this.getTrackedClusterId() == null)
            return false;
        if (other.getTrackedClusterId() != null
                && other.getTrackedClusterId().equals(this.getTrackedClusterId()) == false)
            return false;
        if (other.getRdsResourceId() == null ^ this.getRdsResourceId() == null)
            return false;
        if (other.getRdsResourceId() != null
                && other.getRdsResourceId().equals(this.getRdsResourceId()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTargetHealth() == null ^ this.getTargetHealth() == null)
            return false;
        if (other.getTargetHealth() != null
                && other.getTargetHealth().equals(this.getTargetHealth()) == false)
            return false;
        return true;
    }
}
