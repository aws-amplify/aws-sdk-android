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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the PORT_PROBE action described in the finding.
 * </p>
 */
public class PortProbeAction implements Serializable {
    /**
     * <p>
     * Indicates whether EC2 blocked the port probe to the instance, such as
     * with an ACL.
     * </p>
     */
    private Boolean blocked;

    /**
     * <p>
     * A list of objects related to port probe details.
     * </p>
     */
    private java.util.List<PortProbeDetail> portProbeDetails;

    /**
     * <p>
     * Indicates whether EC2 blocked the port probe to the instance, such as
     * with an ACL.
     * </p>
     *
     * @return <p>
     *         Indicates whether EC2 blocked the port probe to the instance,
     *         such as with an ACL.
     *         </p>
     */
    public Boolean isBlocked() {
        return blocked;
    }

    /**
     * <p>
     * Indicates whether EC2 blocked the port probe to the instance, such as
     * with an ACL.
     * </p>
     *
     * @return <p>
     *         Indicates whether EC2 blocked the port probe to the instance,
     *         such as with an ACL.
     *         </p>
     */
    public Boolean getBlocked() {
        return blocked;
    }

    /**
     * <p>
     * Indicates whether EC2 blocked the port probe to the instance, such as
     * with an ACL.
     * </p>
     *
     * @param blocked <p>
     *            Indicates whether EC2 blocked the port probe to the instance,
     *            such as with an ACL.
     *            </p>
     */
    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    /**
     * <p>
     * Indicates whether EC2 blocked the port probe to the instance, such as
     * with an ACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blocked <p>
     *            Indicates whether EC2 blocked the port probe to the instance,
     *            such as with an ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortProbeAction withBlocked(Boolean blocked) {
        this.blocked = blocked;
        return this;
    }

    /**
     * <p>
     * A list of objects related to port probe details.
     * </p>
     *
     * @return <p>
     *         A list of objects related to port probe details.
     *         </p>
     */
    public java.util.List<PortProbeDetail> getPortProbeDetails() {
        return portProbeDetails;
    }

    /**
     * <p>
     * A list of objects related to port probe details.
     * </p>
     *
     * @param portProbeDetails <p>
     *            A list of objects related to port probe details.
     *            </p>
     */
    public void setPortProbeDetails(java.util.Collection<PortProbeDetail> portProbeDetails) {
        if (portProbeDetails == null) {
            this.portProbeDetails = null;
            return;
        }

        this.portProbeDetails = new java.util.ArrayList<PortProbeDetail>(portProbeDetails);
    }

    /**
     * <p>
     * A list of objects related to port probe details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portProbeDetails <p>
     *            A list of objects related to port probe details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortProbeAction withPortProbeDetails(PortProbeDetail... portProbeDetails) {
        if (getPortProbeDetails() == null) {
            this.portProbeDetails = new java.util.ArrayList<PortProbeDetail>(
                    portProbeDetails.length);
        }
        for (PortProbeDetail value : portProbeDetails) {
            this.portProbeDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects related to port probe details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portProbeDetails <p>
     *            A list of objects related to port probe details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PortProbeAction withPortProbeDetails(
            java.util.Collection<PortProbeDetail> portProbeDetails) {
        setPortProbeDetails(portProbeDetails);
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
        if (getBlocked() != null)
            sb.append("Blocked: " + getBlocked() + ",");
        if (getPortProbeDetails() != null)
            sb.append("PortProbeDetails: " + getPortProbeDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlocked() == null) ? 0 : getBlocked().hashCode());
        hashCode = prime * hashCode
                + ((getPortProbeDetails() == null) ? 0 : getPortProbeDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortProbeAction == false)
            return false;
        PortProbeAction other = (PortProbeAction) obj;

        if (other.getBlocked() == null ^ this.getBlocked() == null)
            return false;
        if (other.getBlocked() != null && other.getBlocked().equals(this.getBlocked()) == false)
            return false;
        if (other.getPortProbeDetails() == null ^ this.getPortProbeDetails() == null)
            return false;
        if (other.getPortProbeDetails() != null
                && other.getPortProbeDetails().equals(this.getPortProbeDetails()) == false)
            return false;
        return true;
    }
}
