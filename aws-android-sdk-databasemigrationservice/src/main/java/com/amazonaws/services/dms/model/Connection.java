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
 * Status of the connection between an endpoint and a replication instance,
 * including Amazon Resource Names (ARNs) and the last error message issued.
 * </p>
 */
public class Connection implements Serializable {
    /**
     * <p>
     * The ARN of the replication instance.
     * </p>
     */
    private String replicationInstanceArn;

    /**
     * <p>
     * The ARN string that uniquely identifies the endpoint.
     * </p>
     */
    private String endpointArn;

    /**
     * <p>
     * The connection status. This parameter can return one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"successful"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"testing"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleting"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The error message when the connection last failed.
     * </p>
     */
    private String lastFailureMessage;

    /**
     * <p>
     * The identifier of the endpoint. Identifiers must begin with a letter and
     * must contain only ASCII letters, digits, and hyphens. They can't end with
     * a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String endpointIdentifier;

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     */
    private String replicationInstanceIdentifier;

    /**
     * <p>
     * The ARN of the replication instance.
     * </p>
     *
     * @return <p>
     *         The ARN of the replication instance.
     *         </p>
     */
    public String getReplicationInstanceArn() {
        return replicationInstanceArn;
    }

    /**
     * <p>
     * The ARN of the replication instance.
     * </p>
     *
     * @param replicationInstanceArn <p>
     *            The ARN of the replication instance.
     *            </p>
     */
    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The ARN of the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceArn <p>
     *            The ARN of the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Connection withReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
        return this;
    }

    /**
     * <p>
     * The ARN string that uniquely identifies the endpoint.
     * </p>
     *
     * @return <p>
     *         The ARN string that uniquely identifies the endpoint.
     *         </p>
     */
    public String getEndpointArn() {
        return endpointArn;
    }

    /**
     * <p>
     * The ARN string that uniquely identifies the endpoint.
     * </p>
     *
     * @param endpointArn <p>
     *            The ARN string that uniquely identifies the endpoint.
     *            </p>
     */
    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The ARN string that uniquely identifies the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointArn <p>
     *            The ARN string that uniquely identifies the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Connection withEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
        return this;
    }

    /**
     * <p>
     * The connection status. This parameter can return one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"successful"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"testing"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleting"</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The connection status. This parameter can return one of the
     *         following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"successful"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"testing"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"failed"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"deleting"</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The connection status. This parameter can return one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"successful"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"testing"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleting"</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param status <p>
     *            The connection status. This parameter can return one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>"successful"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"testing"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"failed"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"deleting"</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The connection status. This parameter can return one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"successful"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"testing"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"failed"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"deleting"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The connection status. This parameter can return one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>"successful"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"testing"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"failed"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"deleting"</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Connection withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The error message when the connection last failed.
     * </p>
     *
     * @return <p>
     *         The error message when the connection last failed.
     *         </p>
     */
    public String getLastFailureMessage() {
        return lastFailureMessage;
    }

    /**
     * <p>
     * The error message when the connection last failed.
     * </p>
     *
     * @param lastFailureMessage <p>
     *            The error message when the connection last failed.
     *            </p>
     */
    public void setLastFailureMessage(String lastFailureMessage) {
        this.lastFailureMessage = lastFailureMessage;
    }

    /**
     * <p>
     * The error message when the connection last failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastFailureMessage <p>
     *            The error message when the connection last failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Connection withLastFailureMessage(String lastFailureMessage) {
        this.lastFailureMessage = lastFailureMessage;
        return this;
    }

    /**
     * <p>
     * The identifier of the endpoint. Identifiers must begin with a letter and
     * must contain only ASCII letters, digits, and hyphens. They can't end with
     * a hyphen or contain two consecutive hyphens.
     * </p>
     *
     * @return <p>
     *         The identifier of the endpoint. Identifiers must begin with a
     *         letter and must contain only ASCII letters, digits, and hyphens.
     *         They can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     */
    public String getEndpointIdentifier() {
        return endpointIdentifier;
    }

    /**
     * <p>
     * The identifier of the endpoint. Identifiers must begin with a letter and
     * must contain only ASCII letters, digits, and hyphens. They can't end with
     * a hyphen or contain two consecutive hyphens.
     * </p>
     *
     * @param endpointIdentifier <p>
     *            The identifier of the endpoint. Identifiers must begin with a
     *            letter and must contain only ASCII letters, digits, and
     *            hyphens. They can't end with a hyphen or contain two
     *            consecutive hyphens.
     *            </p>
     */
    public void setEndpointIdentifier(String endpointIdentifier) {
        this.endpointIdentifier = endpointIdentifier;
    }

    /**
     * <p>
     * The identifier of the endpoint. Identifiers must begin with a letter and
     * must contain only ASCII letters, digits, and hyphens. They can't end with
     * a hyphen or contain two consecutive hyphens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointIdentifier <p>
     *            The identifier of the endpoint. Identifiers must begin with a
     *            letter and must contain only ASCII letters, digits, and
     *            hyphens. They can't end with a hyphen or contain two
     *            consecutive hyphens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Connection withEndpointIdentifier(String endpointIdentifier) {
        this.endpointIdentifier = endpointIdentifier;
        return this;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     *
     * @return <p>
     *         The replication instance identifier. This parameter is stored as
     *         a lowercase string.
     *         </p>
     */
    public String getReplicationInstanceIdentifier() {
        return replicationInstanceIdentifier;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     *
     * @param replicationInstanceIdentifier <p>
     *            The replication instance identifier. This parameter is stored
     *            as a lowercase string.
     *            </p>
     */
    public void setReplicationInstanceIdentifier(String replicationInstanceIdentifier) {
        this.replicationInstanceIdentifier = replicationInstanceIdentifier;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceIdentifier <p>
     *            The replication instance identifier. This parameter is stored
     *            as a lowercase string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Connection withReplicationInstanceIdentifier(String replicationInstanceIdentifier) {
        this.replicationInstanceIdentifier = replicationInstanceIdentifier;
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
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: " + getReplicationInstanceArn() + ",");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: " + getEndpointArn() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLastFailureMessage() != null)
            sb.append("LastFailureMessage: " + getLastFailureMessage() + ",");
        if (getEndpointIdentifier() != null)
            sb.append("EndpointIdentifier: " + getEndpointIdentifier() + ",");
        if (getReplicationInstanceIdentifier() != null)
            sb.append("ReplicationInstanceIdentifier: " + getReplicationInstanceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLastFailureMessage() == null) ? 0 : getLastFailureMessage().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointIdentifier() == null) ? 0 : getEndpointIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceIdentifier() == null) ? 0
                        : getReplicationInstanceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Connection == false)
            return false;
        Connection other = (Connection) obj;

        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null
                && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null
                && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastFailureMessage() == null ^ this.getLastFailureMessage() == null)
            return false;
        if (other.getLastFailureMessage() != null
                && other.getLastFailureMessage().equals(this.getLastFailureMessage()) == false)
            return false;
        if (other.getEndpointIdentifier() == null ^ this.getEndpointIdentifier() == null)
            return false;
        if (other.getEndpointIdentifier() != null
                && other.getEndpointIdentifier().equals(this.getEndpointIdentifier()) == false)
            return false;
        if (other.getReplicationInstanceIdentifier() == null
                ^ this.getReplicationInstanceIdentifier() == null)
            return false;
        if (other.getReplicationInstanceIdentifier() != null
                && other.getReplicationInstanceIdentifier().equals(
                        this.getReplicationInstanceIdentifier()) == false)
            return false;
        return true;
    }
}
