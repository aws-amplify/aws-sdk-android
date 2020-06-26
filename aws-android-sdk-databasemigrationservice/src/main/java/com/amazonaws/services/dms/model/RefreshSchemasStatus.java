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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information that describes status of a schema at an endpoint
 * specified by the <code>DescribeRefreshSchemaStatus</code> operation.
 * </p>
 */
public class RefreshSchemasStatus implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     */
    private String endpointArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     */
    private String replicationInstanceArn;

    /**
     * <p>
     * The status of the schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>successful, failed, refreshing
     */
    private String status;

    /**
     * <p>
     * The date the schema was last refreshed.
     * </p>
     */
    private java.util.Date lastRefreshDate;

    /**
     * <p>
     * The last failure message for the schema.
     * </p>
     */
    private String lastFailureMessage;

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) string that uniquely identifies
     *         the endpoint.
     *         </p>
     */
    public String getEndpointArn() {
        return endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     *
     * @param endpointArn <p>
     *            The Amazon Resource Name (ARN) string that uniquely identifies
     *            the endpoint.
     *            </p>
     */
    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointArn <p>
     *            The Amazon Resource Name (ARN) string that uniquely identifies
     *            the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RefreshSchemasStatus withEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the replication instance.
     *         </p>
     */
    public String getReplicationInstanceArn() {
        return replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     *
     * @param replicationInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the replication instance.
     *            </p>
     */
    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RefreshSchemasStatus withReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
        return this;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>successful, failed, refreshing
     *
     * @return <p>
     *         The status of the schema.
     *         </p>
     * @see RefreshSchemasStatusTypeValue
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>successful, failed, refreshing
     *
     * @param status <p>
     *            The status of the schema.
     *            </p>
     * @see RefreshSchemasStatusTypeValue
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>successful, failed, refreshing
     *
     * @param status <p>
     *            The status of the schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RefreshSchemasStatusTypeValue
     */
    public RefreshSchemasStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>successful, failed, refreshing
     *
     * @param status <p>
     *            The status of the schema.
     *            </p>
     * @see RefreshSchemasStatusTypeValue
     */
    public void setStatus(RefreshSchemasStatusTypeValue status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>successful, failed, refreshing
     *
     * @param status <p>
     *            The status of the schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RefreshSchemasStatusTypeValue
     */
    public RefreshSchemasStatus withStatus(RefreshSchemasStatusTypeValue status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date the schema was last refreshed.
     * </p>
     *
     * @return <p>
     *         The date the schema was last refreshed.
     *         </p>
     */
    public java.util.Date getLastRefreshDate() {
        return lastRefreshDate;
    }

    /**
     * <p>
     * The date the schema was last refreshed.
     * </p>
     *
     * @param lastRefreshDate <p>
     *            The date the schema was last refreshed.
     *            </p>
     */
    public void setLastRefreshDate(java.util.Date lastRefreshDate) {
        this.lastRefreshDate = lastRefreshDate;
    }

    /**
     * <p>
     * The date the schema was last refreshed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastRefreshDate <p>
     *            The date the schema was last refreshed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RefreshSchemasStatus withLastRefreshDate(java.util.Date lastRefreshDate) {
        this.lastRefreshDate = lastRefreshDate;
        return this;
    }

    /**
     * <p>
     * The last failure message for the schema.
     * </p>
     *
     * @return <p>
     *         The last failure message for the schema.
     *         </p>
     */
    public String getLastFailureMessage() {
        return lastFailureMessage;
    }

    /**
     * <p>
     * The last failure message for the schema.
     * </p>
     *
     * @param lastFailureMessage <p>
     *            The last failure message for the schema.
     *            </p>
     */
    public void setLastFailureMessage(String lastFailureMessage) {
        this.lastFailureMessage = lastFailureMessage;
    }

    /**
     * <p>
     * The last failure message for the schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastFailureMessage <p>
     *            The last failure message for the schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RefreshSchemasStatus withLastFailureMessage(String lastFailureMessage) {
        this.lastFailureMessage = lastFailureMessage;
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
        if (getEndpointArn() != null)
            sb.append("EndpointArn: " + getEndpointArn() + ",");
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: " + getReplicationInstanceArn() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLastRefreshDate() != null)
            sb.append("LastRefreshDate: " + getLastRefreshDate() + ",");
        if (getLastFailureMessage() != null)
            sb.append("LastFailureMessage: " + getLastFailureMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLastRefreshDate() == null) ? 0 : getLastRefreshDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastFailureMessage() == null) ? 0 : getLastFailureMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RefreshSchemasStatus == false)
            return false;
        RefreshSchemasStatus other = (RefreshSchemasStatus) obj;

        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null
                && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null
                && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastRefreshDate() == null ^ this.getLastRefreshDate() == null)
            return false;
        if (other.getLastRefreshDate() != null
                && other.getLastRefreshDate().equals(this.getLastRefreshDate()) == false)
            return false;
        if (other.getLastFailureMessage() == null ^ this.getLastFailureMessage() == null)
            return false;
        if (other.getLastFailureMessage() != null
                && other.getLastFailureMessage().equals(this.getLastFailureMessage()) == false)
            return false;
        return true;
    }
}
