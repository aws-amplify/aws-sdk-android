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
 * Describes association information for an Elastic IP address (IPv4).
 * </p>
 */
public class InstanceNetworkInterfaceAssociation implements Serializable {
    /**
     * <p>
     * The ID of the owner of the Elastic IP address.
     * </p>
     */
    private String ipOwnerId;

    /**
     * <p>
     * The public DNS name.
     * </p>
     */
    private String publicDnsName;

    /**
     * <p>
     * The public IP address or Elastic IP address bound to the network
     * interface.
     * </p>
     */
    private String publicIp;

    /**
     * <p>
     * The ID of the owner of the Elastic IP address.
     * </p>
     *
     * @return <p>
     *         The ID of the owner of the Elastic IP address.
     *         </p>
     */
    public String getIpOwnerId() {
        return ipOwnerId;
    }

    /**
     * <p>
     * The ID of the owner of the Elastic IP address.
     * </p>
     *
     * @param ipOwnerId <p>
     *            The ID of the owner of the Elastic IP address.
     *            </p>
     */
    public void setIpOwnerId(String ipOwnerId) {
        this.ipOwnerId = ipOwnerId;
    }

    /**
     * <p>
     * The ID of the owner of the Elastic IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipOwnerId <p>
     *            The ID of the owner of the Elastic IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceAssociation withIpOwnerId(String ipOwnerId) {
        this.ipOwnerId = ipOwnerId;
        return this;
    }

    /**
     * <p>
     * The public DNS name.
     * </p>
     *
     * @return <p>
     *         The public DNS name.
     *         </p>
     */
    public String getPublicDnsName() {
        return publicDnsName;
    }

    /**
     * <p>
     * The public DNS name.
     * </p>
     *
     * @param publicDnsName <p>
     *            The public DNS name.
     *            </p>
     */
    public void setPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
    }

    /**
     * <p>
     * The public DNS name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicDnsName <p>
     *            The public DNS name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceAssociation withPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
        return this;
    }

    /**
     * <p>
     * The public IP address or Elastic IP address bound to the network
     * interface.
     * </p>
     *
     * @return <p>
     *         The public IP address or Elastic IP address bound to the network
     *         interface.
     *         </p>
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * <p>
     * The public IP address or Elastic IP address bound to the network
     * interface.
     * </p>
     *
     * @param publicIp <p>
     *            The public IP address or Elastic IP address bound to the
     *            network interface.
     *            </p>
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The public IP address or Elastic IP address bound to the network
     * interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicIp <p>
     *            The public IP address or Elastic IP address bound to the
     *            network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceNetworkInterfaceAssociation withPublicIp(String publicIp) {
        this.publicIp = publicIp;
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
        if (getIpOwnerId() != null)
            sb.append("IpOwnerId: " + getIpOwnerId() + ",");
        if (getPublicDnsName() != null)
            sb.append("PublicDnsName: " + getPublicDnsName() + ",");
        if (getPublicIp() != null)
            sb.append("PublicIp: " + getPublicIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpOwnerId() == null) ? 0 : getIpOwnerId().hashCode());
        hashCode = prime * hashCode
                + ((getPublicDnsName() == null) ? 0 : getPublicDnsName().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceNetworkInterfaceAssociation == false)
            return false;
        InstanceNetworkInterfaceAssociation other = (InstanceNetworkInterfaceAssociation) obj;

        if (other.getIpOwnerId() == null ^ this.getIpOwnerId() == null)
            return false;
        if (other.getIpOwnerId() != null
                && other.getIpOwnerId().equals(this.getIpOwnerId()) == false)
            return false;
        if (other.getPublicDnsName() == null ^ this.getPublicDnsName() == null)
            return false;
        if (other.getPublicDnsName() != null
                && other.getPublicDnsName().equals(this.getPublicDnsName()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        return true;
    }
}
