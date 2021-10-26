/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

/**
 * <p>
 * A read-only field that represents the state of an
 * <code>AppInstanceUserEndpoint</code>. Supported values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is active and
 * able to receive messages. When <code>ACTIVE</code>, the
 * <code>EndpointStatusReason</code> remains empty.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>INACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is inactive
 * and can't receive message. When INACTIVE, the corresponding reason will be
 * conveyed through EndpointStatusReason.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>INVALID_DEVICE_TOKEN</code> indicates that an
 * <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code> due to invalid
 * device token
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>INVALID_PINPOINT_ARN</code> indicates that an
 * <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code> due to an
 * invalid pinpoint ARN that was input through the <code>ResourceArn</code>
 * field.
 * </p>
 * </li>
 * </ul>
 */
public class EndpointState implements Serializable {
    /**
     * <p>
     * Enum that indicates the Status of an <code>AppInstanceUserEndpoint</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     */
    private String status;

    /**
     * <p>
     * The reason for the <code>EndpointStatus</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_DEVICE_TOKEN, INVALID_PINPOINT_ARN
     */
    private String statusReason;

    /**
     * <p>
     * Enum that indicates the Status of an <code>AppInstanceUserEndpoint</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @return <p>
     *         Enum that indicates the Status of an
     *         <code>AppInstanceUserEndpoint</code>.
     *         </p>
     * @see EndpointStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Enum that indicates the Status of an <code>AppInstanceUserEndpoint</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            Enum that indicates the Status of an
     *            <code>AppInstanceUserEndpoint</code>.
     *            </p>
     * @see EndpointStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Enum that indicates the Status of an <code>AppInstanceUserEndpoint</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            Enum that indicates the Status of an
     *            <code>AppInstanceUserEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndpointStatus
     */
    public EndpointState withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Enum that indicates the Status of an <code>AppInstanceUserEndpoint</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            Enum that indicates the Status of an
     *            <code>AppInstanceUserEndpoint</code>.
     *            </p>
     * @see EndpointStatus
     */
    public void setStatus(EndpointStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Enum that indicates the Status of an <code>AppInstanceUserEndpoint</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            Enum that indicates the Status of an
     *            <code>AppInstanceUserEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndpointStatus
     */
    public EndpointState withStatus(EndpointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the <code>EndpointStatus</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_DEVICE_TOKEN, INVALID_PINPOINT_ARN
     *
     * @return <p>
     *         The reason for the <code>EndpointStatus</code>.
     *         </p>
     * @see EndpointStatusReason
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * <p>
     * The reason for the <code>EndpointStatus</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_DEVICE_TOKEN, INVALID_PINPOINT_ARN
     *
     * @param statusReason <p>
     *            The reason for the <code>EndpointStatus</code>.
     *            </p>
     * @see EndpointStatusReason
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the <code>EndpointStatus</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_DEVICE_TOKEN, INVALID_PINPOINT_ARN
     *
     * @param statusReason <p>
     *            The reason for the <code>EndpointStatus</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndpointStatusReason
     */
    public EndpointState withStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * <p>
     * The reason for the <code>EndpointStatus</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_DEVICE_TOKEN, INVALID_PINPOINT_ARN
     *
     * @param statusReason <p>
     *            The reason for the <code>EndpointStatus</code>.
     *            </p>
     * @see EndpointStatusReason
     */
    public void setStatusReason(EndpointStatusReason statusReason) {
        this.statusReason = statusReason.toString();
    }

    /**
     * <p>
     * The reason for the <code>EndpointStatus</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INVALID_DEVICE_TOKEN, INVALID_PINPOINT_ARN
     *
     * @param statusReason <p>
     *            The reason for the <code>EndpointStatus</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndpointStatusReason
     */
    public EndpointState withStatusReason(EndpointStatusReason statusReason) {
        this.statusReason = statusReason.toString();
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusReason() != null)
            sb.append("StatusReason: " + getStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointState == false)
            return false;
        EndpointState other = (EndpointState) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null
                && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        return true;
    }
}
