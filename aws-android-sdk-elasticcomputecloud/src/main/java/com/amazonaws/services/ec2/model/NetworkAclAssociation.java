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
 * Describes an association between a network ACL and a subnet.
 * </p>
 */
public class NetworkAclAssociation implements Serializable {
    /**
     * <p>
     * The ID of the association between a network ACL and a subnet.
     * </p>
     */
    private String networkAclAssociationId;

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     */
    private String networkAclId;

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The ID of the association between a network ACL and a subnet.
     * </p>
     *
     * @return <p>
     *         The ID of the association between a network ACL and a subnet.
     *         </p>
     */
    public String getNetworkAclAssociationId() {
        return networkAclAssociationId;
    }

    /**
     * <p>
     * The ID of the association between a network ACL and a subnet.
     * </p>
     *
     * @param networkAclAssociationId <p>
     *            The ID of the association between a network ACL and a subnet.
     *            </p>
     */
    public void setNetworkAclAssociationId(String networkAclAssociationId) {
        this.networkAclAssociationId = networkAclAssociationId;
    }

    /**
     * <p>
     * The ID of the association between a network ACL and a subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkAclAssociationId <p>
     *            The ID of the association between a network ACL and a subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAclAssociation withNetworkAclAssociationId(String networkAclAssociationId) {
        this.networkAclAssociationId = networkAclAssociationId;
        return this;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     *
     * @return <p>
     *         The ID of the network ACL.
     *         </p>
     */
    public String getNetworkAclId() {
        return networkAclId;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     *
     * @param networkAclId <p>
     *            The ID of the network ACL.
     *            </p>
     */
    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkAclId <p>
     *            The ID of the network ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAclAssociation withNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     *
     * @return <p>
     *         The ID of the subnet.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     *
     * @param subnetId <p>
     *            The ID of the subnet.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            The ID of the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkAclAssociation withSubnetId(String subnetId) {
        this.subnetId = subnetId;
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
        if (getNetworkAclAssociationId() != null)
            sb.append("NetworkAclAssociationId: " + getNetworkAclAssociationId() + ",");
        if (getNetworkAclId() != null)
            sb.append("NetworkAclId: " + getNetworkAclId() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getNetworkAclAssociationId() == null) ? 0 : getNetworkAclAssociationId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNetworkAclId() == null) ? 0 : getNetworkAclId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkAclAssociation == false)
            return false;
        NetworkAclAssociation other = (NetworkAclAssociation) obj;

        if (other.getNetworkAclAssociationId() == null ^ this.getNetworkAclAssociationId() == null)
            return false;
        if (other.getNetworkAclAssociationId() != null
                && other.getNetworkAclAssociationId().equals(this.getNetworkAclAssociationId()) == false)
            return false;
        if (other.getNetworkAclId() == null ^ this.getNetworkAclId() == null)
            return false;
        if (other.getNetworkAclId() != null
                && other.getNetworkAclId().equals(this.getNetworkAclId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        return true;
    }
}
