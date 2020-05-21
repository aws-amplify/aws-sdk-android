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
 * Describes a target network that is associated with a Client VPN endpoint. A
 * target network is a subnet in a VPC.
 * </p>
 */
public class AssociatedTargetNetwork implements Serializable {
    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String networkId;

    /**
     * <p>
     * The target network type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc
     */
    private String networkType;

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     *
     * @return <p>
     *         The ID of the subnet.
     *         </p>
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     *
     * @param networkId <p>
     *            The ID of the subnet.
     *            </p>
     */
    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkId <p>
     *            The ID of the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatedTargetNetwork withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * <p>
     * The target network type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc
     *
     * @return <p>
     *         The target network type.
     *         </p>
     * @see AssociatedNetworkType
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * <p>
     * The target network type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc
     *
     * @param networkType <p>
     *            The target network type.
     *            </p>
     * @see AssociatedNetworkType
     */
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    /**
     * <p>
     * The target network type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc
     *
     * @param networkType <p>
     *            The target network type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssociatedNetworkType
     */
    public AssociatedTargetNetwork withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * <p>
     * The target network type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc
     *
     * @param networkType <p>
     *            The target network type.
     *            </p>
     * @see AssociatedNetworkType
     */
    public void setNetworkType(AssociatedNetworkType networkType) {
        this.networkType = networkType.toString();
    }

    /**
     * <p>
     * The target network type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>vpc
     *
     * @param networkType <p>
     *            The target network type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssociatedNetworkType
     */
    public AssociatedTargetNetwork withNetworkType(AssociatedNetworkType networkType) {
        this.networkType = networkType.toString();
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
        if (getNetworkId() != null)
            sb.append("NetworkId: " + getNetworkId() + ",");
        if (getNetworkType() != null)
            sb.append("NetworkType: " + getNetworkType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkId() == null) ? 0 : getNetworkId().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkType() == null) ? 0 : getNetworkType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociatedTargetNetwork == false)
            return false;
        AssociatedTargetNetwork other = (AssociatedTargetNetwork) obj;

        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null
                && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getNetworkType() == null ^ this.getNetworkType() == null)
            return false;
        if (other.getNetworkType() != null
                && other.getNetworkType().equals(this.getNetworkType()) == false)
            return false;
        return true;
    }
}
