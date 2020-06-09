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

package com.amazonaws.services.transfer.model;

import java.io.Serializable;

/**
 * <p>
 * The virtual private cloud (VPC) endpoint settings that are configured for
 * your file transfer protocol-enabled server. With a VPC endpoint, you can
 * restrict access to your server and resources only within your VPC. To control
 * incoming internet traffic, invoke the <code>UpdateServer</code> API and
 * attach an Elastic IP to your server's endpoint.
 * </p>
 */
public class EndpointDetails implements Serializable {
    /**
     * <p>
     * A list of address allocation IDs that are required to attach an Elastic
     * IP address to your file transfer protocol-enabled server's endpoint. This
     * is only valid in the <code>UpdateServer</code> API.
     * </p>
     * <note>
     * <p>
     * This property can only be use when <code>EndpointType</code> is set to
     * <code>VPC</code>.
     * </p>
     * </note>
     */
    private java.util.List<String> addressAllocationIds;

    /**
     * <p>
     * A list of subnet IDs that are required to host your file transfer
     * protocol-enabled server endpoint in your VPC.
     * </p>
     * <note>
     * <p>
     * This property can only be used when <code>EndpointType</code> is set to
     * <code>VPC</code>.
     * </p>
     * </note>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be used when <code>EndpointType</code> is set to
     * <code>VPC_ENDPOINT</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^vpce-[0-9a-f]{17}$<br/>
     */
    private String vpcEndpointId;

    /**
     * <p>
     * The VPC ID of the VPC in which a file transfer protocol-enabled server's
     * endpoint will be hosted.
     * </p>
     * <note>
     * <p>
     * This property can only be used when <code>EndpointType</code> is set to
     * <code>VPC</code>.
     * </p>
     * </note>
     */
    private String vpcId;

    /**
     * <p>
     * A list of address allocation IDs that are required to attach an Elastic
     * IP address to your file transfer protocol-enabled server's endpoint. This
     * is only valid in the <code>UpdateServer</code> API.
     * </p>
     * <note>
     * <p>
     * This property can only be use when <code>EndpointType</code> is set to
     * <code>VPC</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of address allocation IDs that are required to attach an
     *         Elastic IP address to your file transfer protocol-enabled
     *         server's endpoint. This is only valid in the
     *         <code>UpdateServer</code> API.
     *         </p>
     *         <note>
     *         <p>
     *         This property can only be use when <code>EndpointType</code> is
     *         set to <code>VPC</code>.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getAddressAllocationIds() {
        return addressAllocationIds;
    }

    /**
     * <p>
     * A list of address allocation IDs that are required to attach an Elastic
     * IP address to your file transfer protocol-enabled server's endpoint. This
     * is only valid in the <code>UpdateServer</code> API.
     * </p>
     * <note>
     * <p>
     * This property can only be use when <code>EndpointType</code> is set to
     * <code>VPC</code>.
     * </p>
     * </note>
     *
     * @param addressAllocationIds <p>
     *            A list of address allocation IDs that are required to attach
     *            an Elastic IP address to your file transfer protocol-enabled
     *            server's endpoint. This is only valid in the
     *            <code>UpdateServer</code> API.
     *            </p>
     *            <note>
     *            <p>
     *            This property can only be use when <code>EndpointType</code>
     *            is set to <code>VPC</code>.
     *            </p>
     *            </note>
     */
    public void setAddressAllocationIds(java.util.Collection<String> addressAllocationIds) {
        if (addressAllocationIds == null) {
            this.addressAllocationIds = null;
            return;
        }

        this.addressAllocationIds = new java.util.ArrayList<String>(addressAllocationIds);
    }

    /**
     * <p>
     * A list of address allocation IDs that are required to attach an Elastic
     * IP address to your file transfer protocol-enabled server's endpoint. This
     * is only valid in the <code>UpdateServer</code> API.
     * </p>
     * <note>
     * <p>
     * This property can only be use when <code>EndpointType</code> is set to
     * <code>VPC</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addressAllocationIds <p>
     *            A list of address allocation IDs that are required to attach
     *            an Elastic IP address to your file transfer protocol-enabled
     *            server's endpoint. This is only valid in the
     *            <code>UpdateServer</code> API.
     *            </p>
     *            <note>
     *            <p>
     *            This property can only be use when <code>EndpointType</code>
     *            is set to <code>VPC</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDetails withAddressAllocationIds(String... addressAllocationIds) {
        if (getAddressAllocationIds() == null) {
            this.addressAllocationIds = new java.util.ArrayList<String>(addressAllocationIds.length);
        }
        for (String value : addressAllocationIds) {
            this.addressAllocationIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of address allocation IDs that are required to attach an Elastic
     * IP address to your file transfer protocol-enabled server's endpoint. This
     * is only valid in the <code>UpdateServer</code> API.
     * </p>
     * <note>
     * <p>
     * This property can only be use when <code>EndpointType</code> is set to
     * <code>VPC</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addressAllocationIds <p>
     *            A list of address allocation IDs that are required to attach
     *            an Elastic IP address to your file transfer protocol-enabled
     *            server's endpoint. This is only valid in the
     *            <code>UpdateServer</code> API.
     *            </p>
     *            <note>
     *            <p>
     *            This property can only be use when <code>EndpointType</code>
     *            is set to <code>VPC</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDetails withAddressAllocationIds(
            java.util.Collection<String> addressAllocationIds) {
        setAddressAllocationIds(addressAllocationIds);
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs that are required to host your file transfer
     * protocol-enabled server endpoint in your VPC.
     * </p>
     * <note>
     * <p>
     * This property can only be used when <code>EndpointType</code> is set to
     * <code>VPC</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of subnet IDs that are required to host your file transfer
     *         protocol-enabled server endpoint in your VPC.
     *         </p>
     *         <note>
     *         <p>
     *         This property can only be used when <code>EndpointType</code> is
     *         set to <code>VPC</code>.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * A list of subnet IDs that are required to host your file transfer
     * protocol-enabled server endpoint in your VPC.
     * </p>
     * <note>
     * <p>
     * This property can only be used when <code>EndpointType</code> is set to
     * <code>VPC</code>.
     * </p>
     * </note>
     *
     * @param subnetIds <p>
     *            A list of subnet IDs that are required to host your file
     *            transfer protocol-enabled server endpoint in your VPC.
     *            </p>
     *            <note>
     *            <p>
     *            This property can only be used when <code>EndpointType</code>
     *            is set to <code>VPC</code>.
     *            </p>
     *            </note>
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * A list of subnet IDs that are required to host your file transfer
     * protocol-enabled server endpoint in your VPC.
     * </p>
     * <note>
     * <p>
     * This property can only be used when <code>EndpointType</code> is set to
     * <code>VPC</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            A list of subnet IDs that are required to host your file
     *            transfer protocol-enabled server endpoint in your VPC.
     *            </p>
     *            <note>
     *            <p>
     *            This property can only be used when <code>EndpointType</code>
     *            is set to <code>VPC</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDetails withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) {
            this.subnetIds = new java.util.ArrayList<String>(subnetIds.length);
        }
        for (String value : subnetIds) {
            this.subnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs that are required to host your file transfer
     * protocol-enabled server endpoint in your VPC.
     * </p>
     * <note>
     * <p>
     * This property can only be used when <code>EndpointType</code> is set to
     * <code>VPC</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            A list of subnet IDs that are required to host your file
     *            transfer protocol-enabled server endpoint in your VPC.
     *            </p>
     *            <note>
     *            <p>
     *            This property can only be used when <code>EndpointType</code>
     *            is set to <code>VPC</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDetails withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be used when <code>EndpointType</code> is set to
     * <code>VPC_ENDPOINT</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^vpce-[0-9a-f]{17}$<br/>
     *
     * @return <p>
     *         The ID of the VPC endpoint.
     *         </p>
     *         <note>
     *         <p>
     *         This property can only be used when <code>EndpointType</code> is
     *         set to <code>VPC_ENDPOINT</code>.
     *         </p>
     *         </note>
     */
    public String getVpcEndpointId() {
        return vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be used when <code>EndpointType</code> is set to
     * <code>VPC_ENDPOINT</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^vpce-[0-9a-f]{17}$<br/>
     *
     * @param vpcEndpointId <p>
     *            The ID of the VPC endpoint.
     *            </p>
     *            <note>
     *            <p>
     *            This property can only be used when <code>EndpointType</code>
     *            is set to <code>VPC_ENDPOINT</code>.
     *            </p>
     *            </note>
     */
    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint.
     * </p>
     * <note>
     * <p>
     * This property can only be used when <code>EndpointType</code> is set to
     * <code>VPC_ENDPOINT</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^vpce-[0-9a-f]{17}$<br/>
     *
     * @param vpcEndpointId <p>
     *            The ID of the VPC endpoint.
     *            </p>
     *            <note>
     *            <p>
     *            This property can only be used when <code>EndpointType</code>
     *            is set to <code>VPC_ENDPOINT</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDetails withVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
        return this;
    }

    /**
     * <p>
     * The VPC ID of the VPC in which a file transfer protocol-enabled server's
     * endpoint will be hosted.
     * </p>
     * <note>
     * <p>
     * This property can only be used when <code>EndpointType</code> is set to
     * <code>VPC</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The VPC ID of the VPC in which a file transfer protocol-enabled
     *         server's endpoint will be hosted.
     *         </p>
     *         <note>
     *         <p>
     *         This property can only be used when <code>EndpointType</code> is
     *         set to <code>VPC</code>.
     *         </p>
     *         </note>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The VPC ID of the VPC in which a file transfer protocol-enabled server's
     * endpoint will be hosted.
     * </p>
     * <note>
     * <p>
     * This property can only be used when <code>EndpointType</code> is set to
     * <code>VPC</code>.
     * </p>
     * </note>
     *
     * @param vpcId <p>
     *            The VPC ID of the VPC in which a file transfer
     *            protocol-enabled server's endpoint will be hosted.
     *            </p>
     *            <note>
     *            <p>
     *            This property can only be used when <code>EndpointType</code>
     *            is set to <code>VPC</code>.
     *            </p>
     *            </note>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID of the VPC in which a file transfer protocol-enabled server's
     * endpoint will be hosted.
     * </p>
     * <note>
     * <p>
     * This property can only be used when <code>EndpointType</code> is set to
     * <code>VPC</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The VPC ID of the VPC in which a file transfer
     *            protocol-enabled server's endpoint will be hosted.
     *            </p>
     *            <note>
     *            <p>
     *            This property can only be used when <code>EndpointType</code>
     *            is set to <code>VPC</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointDetails withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
        if (getAddressAllocationIds() != null)
            sb.append("AddressAllocationIds: " + getAddressAllocationIds() + ",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: " + getVpcEndpointId() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAddressAllocationIds() == null) ? 0 : getAddressAllocationIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode
                + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointDetails == false)
            return false;
        EndpointDetails other = (EndpointDetails) obj;

        if (other.getAddressAllocationIds() == null ^ this.getAddressAllocationIds() == null)
            return false;
        if (other.getAddressAllocationIds() != null
                && other.getAddressAllocationIds().equals(this.getAddressAllocationIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null
                && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null
                && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }
}
