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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * A custom Availability Zone (AZ) is an on-premises AZ that is integrated with
 * a VMware vSphere cluster.
 * </p>
 * <p>
 * For more information about RDS on VMware, see the <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
 * > <i>RDS on VMware User Guide.</i> </a>
 * </p>
 */
public class CustomAvailabilityZone implements Serializable {
    /**
     * <p>
     * The identifier of the custom AZ.
     * </p>
     * <p>
     * Amazon RDS generates a unique identifier when a custom AZ is created.
     * </p>
     */
    private String customAvailabilityZoneId;

    /**
     * <p>
     * The name of the custom AZ.
     * </p>
     */
    private String customAvailabilityZoneName;

    /**
     * <p>
     * The status of the custom AZ.
     * </p>
     */
    private String customAvailabilityZoneStatus;

    /**
     * <p>
     * Information about the virtual private network (VPN) between the VMware
     * vSphere cluster and the AWS website.
     * </p>
     */
    private VpnDetails vpnDetails;

    /**
     * <p>
     * The identifier of the custom AZ.
     * </p>
     * <p>
     * Amazon RDS generates a unique identifier when a custom AZ is created.
     * </p>
     *
     * @return <p>
     *         The identifier of the custom AZ.
     *         </p>
     *         <p>
     *         Amazon RDS generates a unique identifier when a custom AZ is
     *         created.
     *         </p>
     */
    public String getCustomAvailabilityZoneId() {
        return customAvailabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the custom AZ.
     * </p>
     * <p>
     * Amazon RDS generates a unique identifier when a custom AZ is created.
     * </p>
     *
     * @param customAvailabilityZoneId <p>
     *            The identifier of the custom AZ.
     *            </p>
     *            <p>
     *            Amazon RDS generates a unique identifier when a custom AZ is
     *            created.
     *            </p>
     */
    public void setCustomAvailabilityZoneId(String customAvailabilityZoneId) {
        this.customAvailabilityZoneId = customAvailabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the custom AZ.
     * </p>
     * <p>
     * Amazon RDS generates a unique identifier when a custom AZ is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customAvailabilityZoneId <p>
     *            The identifier of the custom AZ.
     *            </p>
     *            <p>
     *            Amazon RDS generates a unique identifier when a custom AZ is
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomAvailabilityZone withCustomAvailabilityZoneId(String customAvailabilityZoneId) {
        this.customAvailabilityZoneId = customAvailabilityZoneId;
        return this;
    }

    /**
     * <p>
     * The name of the custom AZ.
     * </p>
     *
     * @return <p>
     *         The name of the custom AZ.
     *         </p>
     */
    public String getCustomAvailabilityZoneName() {
        return customAvailabilityZoneName;
    }

    /**
     * <p>
     * The name of the custom AZ.
     * </p>
     *
     * @param customAvailabilityZoneName <p>
     *            The name of the custom AZ.
     *            </p>
     */
    public void setCustomAvailabilityZoneName(String customAvailabilityZoneName) {
        this.customAvailabilityZoneName = customAvailabilityZoneName;
    }

    /**
     * <p>
     * The name of the custom AZ.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customAvailabilityZoneName <p>
     *            The name of the custom AZ.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomAvailabilityZone withCustomAvailabilityZoneName(String customAvailabilityZoneName) {
        this.customAvailabilityZoneName = customAvailabilityZoneName;
        return this;
    }

    /**
     * <p>
     * The status of the custom AZ.
     * </p>
     *
     * @return <p>
     *         The status of the custom AZ.
     *         </p>
     */
    public String getCustomAvailabilityZoneStatus() {
        return customAvailabilityZoneStatus;
    }

    /**
     * <p>
     * The status of the custom AZ.
     * </p>
     *
     * @param customAvailabilityZoneStatus <p>
     *            The status of the custom AZ.
     *            </p>
     */
    public void setCustomAvailabilityZoneStatus(String customAvailabilityZoneStatus) {
        this.customAvailabilityZoneStatus = customAvailabilityZoneStatus;
    }

    /**
     * <p>
     * The status of the custom AZ.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customAvailabilityZoneStatus <p>
     *            The status of the custom AZ.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomAvailabilityZone withCustomAvailabilityZoneStatus(
            String customAvailabilityZoneStatus) {
        this.customAvailabilityZoneStatus = customAvailabilityZoneStatus;
        return this;
    }

    /**
     * <p>
     * Information about the virtual private network (VPN) between the VMware
     * vSphere cluster and the AWS website.
     * </p>
     *
     * @return <p>
     *         Information about the virtual private network (VPN) between the
     *         VMware vSphere cluster and the AWS website.
     *         </p>
     */
    public VpnDetails getVpnDetails() {
        return vpnDetails;
    }

    /**
     * <p>
     * Information about the virtual private network (VPN) between the VMware
     * vSphere cluster and the AWS website.
     * </p>
     *
     * @param vpnDetails <p>
     *            Information about the virtual private network (VPN) between
     *            the VMware vSphere cluster and the AWS website.
     *            </p>
     */
    public void setVpnDetails(VpnDetails vpnDetails) {
        this.vpnDetails = vpnDetails;
    }

    /**
     * <p>
     * Information about the virtual private network (VPN) between the VMware
     * vSphere cluster and the AWS website.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnDetails <p>
     *            Information about the virtual private network (VPN) between
     *            the VMware vSphere cluster and the AWS website.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomAvailabilityZone withVpnDetails(VpnDetails vpnDetails) {
        this.vpnDetails = vpnDetails;
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
        if (getCustomAvailabilityZoneId() != null)
            sb.append("CustomAvailabilityZoneId: " + getCustomAvailabilityZoneId() + ",");
        if (getCustomAvailabilityZoneName() != null)
            sb.append("CustomAvailabilityZoneName: " + getCustomAvailabilityZoneName() + ",");
        if (getCustomAvailabilityZoneStatus() != null)
            sb.append("CustomAvailabilityZoneStatus: " + getCustomAvailabilityZoneStatus() + ",");
        if (getVpnDetails() != null)
            sb.append("VpnDetails: " + getVpnDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCustomAvailabilityZoneId() == null) ? 0 : getCustomAvailabilityZoneId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomAvailabilityZoneName() == null) ? 0 : getCustomAvailabilityZoneName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomAvailabilityZoneStatus() == null) ? 0
                        : getCustomAvailabilityZoneStatus().hashCode());
        hashCode = prime * hashCode + ((getVpnDetails() == null) ? 0 : getVpnDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomAvailabilityZone == false)
            return false;
        CustomAvailabilityZone other = (CustomAvailabilityZone) obj;

        if (other.getCustomAvailabilityZoneId() == null
                ^ this.getCustomAvailabilityZoneId() == null)
            return false;
        if (other.getCustomAvailabilityZoneId() != null
                && other.getCustomAvailabilityZoneId().equals(this.getCustomAvailabilityZoneId()) == false)
            return false;
        if (other.getCustomAvailabilityZoneName() == null
                ^ this.getCustomAvailabilityZoneName() == null)
            return false;
        if (other.getCustomAvailabilityZoneName() != null
                && other.getCustomAvailabilityZoneName().equals(
                        this.getCustomAvailabilityZoneName()) == false)
            return false;
        if (other.getCustomAvailabilityZoneStatus() == null
                ^ this.getCustomAvailabilityZoneStatus() == null)
            return false;
        if (other.getCustomAvailabilityZoneStatus() != null
                && other.getCustomAvailabilityZoneStatus().equals(
                        this.getCustomAvailabilityZoneStatus()) == false)
            return false;
        if (other.getVpnDetails() == null ^ this.getVpnDetails() == null)
            return false;
        if (other.getVpnDetails() != null
                && other.getVpnDetails().equals(this.getVpnDetails()) == false)
            return false;
        return true;
    }
}
