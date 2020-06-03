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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Associates an existing connection with a link aggregation group (LAG). The
 * connection is interrupted and re-established as a member of the LAG
 * (connectivity to AWS is interrupted). The connection must be hosted on the
 * same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the
 * bandwidth for the LAG. You can re-associate a connection that's currently
 * associated with a different LAG; however, if removing the connection would
 * cause the original LAG to fall below its setting for minimum number of
 * operational connections, the request fails.
 * </p>
 * <p>
 * Any virtual interfaces that are directly associated with the connection are
 * automatically re-associated with the LAG. If the connection was originally
 * associated with a different LAG, the virtual interfaces remain associated
 * with the original LAG.
 * </p>
 * <p>
 * For interconnects, any hosted connections are automatically re-associated
 * with the LAG. If the interconnect was originally associated with a different
 * LAG, the hosted connections remain associated with the original LAG.
 * </p>
 */
public class AssociateConnectionWithLagRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the connection.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * The ID of the LAG with which to associate the connection.
     * </p>
     */
    private String lagId;

    /**
     * <p>
     * The ID of the connection.
     * </p>
     *
     * @return <p>
     *         The ID of the connection.
     *         </p>
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     *
     * @param connectionId <p>
     *            The ID of the connection.
     *            </p>
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionId <p>
     *            The ID of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateConnectionWithLagRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * <p>
     * The ID of the LAG with which to associate the connection.
     * </p>
     *
     * @return <p>
     *         The ID of the LAG with which to associate the connection.
     *         </p>
     */
    public String getLagId() {
        return lagId;
    }

    /**
     * <p>
     * The ID of the LAG with which to associate the connection.
     * </p>
     *
     * @param lagId <p>
     *            The ID of the LAG with which to associate the connection.
     *            </p>
     */
    public void setLagId(String lagId) {
        this.lagId = lagId;
    }

    /**
     * <p>
     * The ID of the LAG with which to associate the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lagId <p>
     *            The ID of the LAG with which to associate the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateConnectionWithLagRequest withLagId(String lagId) {
        this.lagId = lagId;
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
        if (getConnectionId() != null)
            sb.append("connectionId: " + getConnectionId() + ",");
        if (getLagId() != null)
            sb.append("lagId: " + getLagId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getLagId() == null) ? 0 : getLagId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateConnectionWithLagRequest == false)
            return false;
        AssociateConnectionWithLagRequest other = (AssociateConnectionWithLagRequest) obj;

        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null
                && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getLagId() == null ^ this.getLagId() == null)
            return false;
        if (other.getLagId() != null && other.getLagId().equals(this.getLagId()) == false)
            return false;
        return true;
    }
}
