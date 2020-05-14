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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a terminated Client VPN endpoint client connection.
 * </p>
 */
public class TerminateConnectionStatus implements Serializable {
    /**
     * <p>
     * The ID of the client connection.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * The state of the client connection.
     * </p>
     */
    private ClientVpnConnectionStatus previousStatus;

    /**
     * <p>
     * A message about the status of the client connection, if applicable.
     * </p>
     */
    private ClientVpnConnectionStatus currentStatus;

    /**
     * <p>
     * The ID of the client connection.
     * </p>
     *
     * @return <p>
     *         The ID of the client connection.
     *         </p>
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * <p>
     * The ID of the client connection.
     * </p>
     *
     * @param connectionId <p>
     *            The ID of the client connection.
     *            </p>
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the client connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionId <p>
     *            The ID of the client connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateConnectionStatus withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * <p>
     * The state of the client connection.
     * </p>
     *
     * @return <p>
     *         The state of the client connection.
     *         </p>
     */
    public ClientVpnConnectionStatus getPreviousStatus() {
        return previousStatus;
    }

    /**
     * <p>
     * The state of the client connection.
     * </p>
     *
     * @param previousStatus <p>
     *            The state of the client connection.
     *            </p>
     */
    public void setPreviousStatus(ClientVpnConnectionStatus previousStatus) {
        this.previousStatus = previousStatus;
    }

    /**
     * <p>
     * The state of the client connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param previousStatus <p>
     *            The state of the client connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateConnectionStatus withPreviousStatus(ClientVpnConnectionStatus previousStatus) {
        this.previousStatus = previousStatus;
        return this;
    }

    /**
     * <p>
     * A message about the status of the client connection, if applicable.
     * </p>
     *
     * @return <p>
     *         A message about the status of the client connection, if
     *         applicable.
     *         </p>
     */
    public ClientVpnConnectionStatus getCurrentStatus() {
        return currentStatus;
    }

    /**
     * <p>
     * A message about the status of the client connection, if applicable.
     * </p>
     *
     * @param currentStatus <p>
     *            A message about the status of the client connection, if
     *            applicable.
     *            </p>
     */
    public void setCurrentStatus(ClientVpnConnectionStatus currentStatus) {
        this.currentStatus = currentStatus;
    }

    /**
     * <p>
     * A message about the status of the client connection, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentStatus <p>
     *            A message about the status of the client connection, if
     *            applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminateConnectionStatus withCurrentStatus(ClientVpnConnectionStatus currentStatus) {
        this.currentStatus = currentStatus;
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
            sb.append("ConnectionId: " + getConnectionId() + ",");
        if (getPreviousStatus() != null)
            sb.append("PreviousStatus: " + getPreviousStatus() + ",");
        if (getCurrentStatus() != null)
            sb.append("CurrentStatus: " + getCurrentStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode
                + ((getPreviousStatus() == null) ? 0 : getPreviousStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentStatus() == null) ? 0 : getCurrentStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateConnectionStatus == false)
            return false;
        TerminateConnectionStatus other = (TerminateConnectionStatus) obj;

        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null
                && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getPreviousStatus() == null ^ this.getPreviousStatus() == null)
            return false;
        if (other.getPreviousStatus() != null
                && other.getPreviousStatus().equals(this.getPreviousStatus()) == false)
            return false;
        if (other.getCurrentStatus() == null ^ this.getCurrentStatus() == null)
            return false;
        if (other.getCurrentStatus() != null
                && other.getCurrentStatus().equals(this.getCurrentStatus()) == false)
            return false;
        return true;
    }
}
