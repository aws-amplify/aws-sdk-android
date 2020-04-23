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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a custom Availability Zone (AZ).
 * </p>
 * <p>
 * A custom AZ is an on-premises AZ that is integrated with a VMware vSphere
 * cluster.
 * </p>
 * <p>
 * For more information about RDS on VMware, see the <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
 * > <i>RDS on VMware User Guide.</i> </a>
 * </p>
 */
public class CreateCustomAvailabilityZoneRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the custom Availability Zone (AZ).
     * </p>
     */
    private String customAvailabilityZoneName;

    /**
     * <p>
     * The ID of an existing virtual private network (VPN) between the Amazon
     * RDS website and the VMware vSphere cluster.
     * </p>
     */
    private String existingVpnId;

    /**
     * <p>
     * The name of a new VPN tunnel between the Amazon RDS website and the
     * VMware vSphere cluster.
     * </p>
     * <p>
     * Specify this parameter only if <code>ExistingVpnId</code> isn't
     * specified.
     * </p>
     */
    private String newVpnTunnelName;

    /**
     * <p>
     * The IP address of network traffic from your on-premises data center. A
     * custom AZ receives the network traffic.
     * </p>
     * <p>
     * Specify this parameter only if <code>ExistingVpnId</code> isn't
     * specified.
     * </p>
     */
    private String vpnTunnelOriginatorIP;

    /**
     * <p>
     * The name of the custom Availability Zone (AZ).
     * </p>
     *
     * @return <p>
     *         The name of the custom Availability Zone (AZ).
     *         </p>
     */
    public String getCustomAvailabilityZoneName() {
        return customAvailabilityZoneName;
    }

    /**
     * <p>
     * The name of the custom Availability Zone (AZ).
     * </p>
     *
     * @param customAvailabilityZoneName <p>
     *            The name of the custom Availability Zone (AZ).
     *            </p>
     */
    public void setCustomAvailabilityZoneName(String customAvailabilityZoneName) {
        this.customAvailabilityZoneName = customAvailabilityZoneName;
    }

    /**
     * <p>
     * The name of the custom Availability Zone (AZ).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customAvailabilityZoneName <p>
     *            The name of the custom Availability Zone (AZ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomAvailabilityZoneRequest withCustomAvailabilityZoneName(
            String customAvailabilityZoneName) {
        this.customAvailabilityZoneName = customAvailabilityZoneName;
        return this;
    }

    /**
     * <p>
     * The ID of an existing virtual private network (VPN) between the Amazon
     * RDS website and the VMware vSphere cluster.
     * </p>
     *
     * @return <p>
     *         The ID of an existing virtual private network (VPN) between the
     *         Amazon RDS website and the VMware vSphere cluster.
     *         </p>
     */
    public String getExistingVpnId() {
        return existingVpnId;
    }

    /**
     * <p>
     * The ID of an existing virtual private network (VPN) between the Amazon
     * RDS website and the VMware vSphere cluster.
     * </p>
     *
     * @param existingVpnId <p>
     *            The ID of an existing virtual private network (VPN) between
     *            the Amazon RDS website and the VMware vSphere cluster.
     *            </p>
     */
    public void setExistingVpnId(String existingVpnId) {
        this.existingVpnId = existingVpnId;
    }

    /**
     * <p>
     * The ID of an existing virtual private network (VPN) between the Amazon
     * RDS website and the VMware vSphere cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param existingVpnId <p>
     *            The ID of an existing virtual private network (VPN) between
     *            the Amazon RDS website and the VMware vSphere cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomAvailabilityZoneRequest withExistingVpnId(String existingVpnId) {
        this.existingVpnId = existingVpnId;
        return this;
    }

    /**
     * <p>
     * The name of a new VPN tunnel between the Amazon RDS website and the
     * VMware vSphere cluster.
     * </p>
     * <p>
     * Specify this parameter only if <code>ExistingVpnId</code> isn't
     * specified.
     * </p>
     *
     * @return <p>
     *         The name of a new VPN tunnel between the Amazon RDS website and
     *         the VMware vSphere cluster.
     *         </p>
     *         <p>
     *         Specify this parameter only if <code>ExistingVpnId</code> isn't
     *         specified.
     *         </p>
     */
    public String getNewVpnTunnelName() {
        return newVpnTunnelName;
    }

    /**
     * <p>
     * The name of a new VPN tunnel between the Amazon RDS website and the
     * VMware vSphere cluster.
     * </p>
     * <p>
     * Specify this parameter only if <code>ExistingVpnId</code> isn't
     * specified.
     * </p>
     *
     * @param newVpnTunnelName <p>
     *            The name of a new VPN tunnel between the Amazon RDS website
     *            and the VMware vSphere cluster.
     *            </p>
     *            <p>
     *            Specify this parameter only if <code>ExistingVpnId</code>
     *            isn't specified.
     *            </p>
     */
    public void setNewVpnTunnelName(String newVpnTunnelName) {
        this.newVpnTunnelName = newVpnTunnelName;
    }

    /**
     * <p>
     * The name of a new VPN tunnel between the Amazon RDS website and the
     * VMware vSphere cluster.
     * </p>
     * <p>
     * Specify this parameter only if <code>ExistingVpnId</code> isn't
     * specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newVpnTunnelName <p>
     *            The name of a new VPN tunnel between the Amazon RDS website
     *            and the VMware vSphere cluster.
     *            </p>
     *            <p>
     *            Specify this parameter only if <code>ExistingVpnId</code>
     *            isn't specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomAvailabilityZoneRequest withNewVpnTunnelName(String newVpnTunnelName) {
        this.newVpnTunnelName = newVpnTunnelName;
        return this;
    }

    /**
     * <p>
     * The IP address of network traffic from your on-premises data center. A
     * custom AZ receives the network traffic.
     * </p>
     * <p>
     * Specify this parameter only if <code>ExistingVpnId</code> isn't
     * specified.
     * </p>
     *
     * @return <p>
     *         The IP address of network traffic from your on-premises data
     *         center. A custom AZ receives the network traffic.
     *         </p>
     *         <p>
     *         Specify this parameter only if <code>ExistingVpnId</code> isn't
     *         specified.
     *         </p>
     */
    public String getVpnTunnelOriginatorIP() {
        return vpnTunnelOriginatorIP;
    }

    /**
     * <p>
     * The IP address of network traffic from your on-premises data center. A
     * custom AZ receives the network traffic.
     * </p>
     * <p>
     * Specify this parameter only if <code>ExistingVpnId</code> isn't
     * specified.
     * </p>
     *
     * @param vpnTunnelOriginatorIP <p>
     *            The IP address of network traffic from your on-premises data
     *            center. A custom AZ receives the network traffic.
     *            </p>
     *            <p>
     *            Specify this parameter only if <code>ExistingVpnId</code>
     *            isn't specified.
     *            </p>
     */
    public void setVpnTunnelOriginatorIP(String vpnTunnelOriginatorIP) {
        this.vpnTunnelOriginatorIP = vpnTunnelOriginatorIP;
    }

    /**
     * <p>
     * The IP address of network traffic from your on-premises data center. A
     * custom AZ receives the network traffic.
     * </p>
     * <p>
     * Specify this parameter only if <code>ExistingVpnId</code> isn't
     * specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpnTunnelOriginatorIP <p>
     *            The IP address of network traffic from your on-premises data
     *            center. A custom AZ receives the network traffic.
     *            </p>
     *            <p>
     *            Specify this parameter only if <code>ExistingVpnId</code>
     *            isn't specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomAvailabilityZoneRequest withVpnTunnelOriginatorIP(
            String vpnTunnelOriginatorIP) {
        this.vpnTunnelOriginatorIP = vpnTunnelOriginatorIP;
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
        if (getCustomAvailabilityZoneName() != null)
            sb.append("CustomAvailabilityZoneName: " + getCustomAvailabilityZoneName() + ",");
        if (getExistingVpnId() != null)
            sb.append("ExistingVpnId: " + getExistingVpnId() + ",");
        if (getNewVpnTunnelName() != null)
            sb.append("NewVpnTunnelName: " + getNewVpnTunnelName() + ",");
        if (getVpnTunnelOriginatorIP() != null)
            sb.append("VpnTunnelOriginatorIP: " + getVpnTunnelOriginatorIP());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCustomAvailabilityZoneName() == null) ? 0 : getCustomAvailabilityZoneName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getExistingVpnId() == null) ? 0 : getExistingVpnId().hashCode());
        hashCode = prime * hashCode
                + ((getNewVpnTunnelName() == null) ? 0 : getNewVpnTunnelName().hashCode());
        hashCode = prime
                * hashCode
                + ((getVpnTunnelOriginatorIP() == null) ? 0 : getVpnTunnelOriginatorIP().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomAvailabilityZoneRequest == false)
            return false;
        CreateCustomAvailabilityZoneRequest other = (CreateCustomAvailabilityZoneRequest) obj;

        if (other.getCustomAvailabilityZoneName() == null
                ^ this.getCustomAvailabilityZoneName() == null)
            return false;
        if (other.getCustomAvailabilityZoneName() != null
                && other.getCustomAvailabilityZoneName().equals(
                        this.getCustomAvailabilityZoneName()) == false)
            return false;
        if (other.getExistingVpnId() == null ^ this.getExistingVpnId() == null)
            return false;
        if (other.getExistingVpnId() != null
                && other.getExistingVpnId().equals(this.getExistingVpnId()) == false)
            return false;
        if (other.getNewVpnTunnelName() == null ^ this.getNewVpnTunnelName() == null)
            return false;
        if (other.getNewVpnTunnelName() != null
                && other.getNewVpnTunnelName().equals(this.getNewVpnTunnelName()) == false)
            return false;
        if (other.getVpnTunnelOriginatorIP() == null ^ this.getVpnTunnelOriginatorIP() == null)
            return false;
        if (other.getVpnTunnelOriginatorIP() != null
                && other.getVpnTunnelOriginatorIP().equals(this.getVpnTunnelOriginatorIP()) == false)
            return false;
        return true;
    }
}
