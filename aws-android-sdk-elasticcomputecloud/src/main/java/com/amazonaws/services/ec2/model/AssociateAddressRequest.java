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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Associates an Elastic IP address with an instance or a network interface.
 * Before you can use an Elastic IP address, you must allocate it to your
 * account.
 * </p>
 * <p>
 * An Elastic IP address is for use in either the EC2-Classic platform or in a
 * VPC. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"
 * >Elastic IP Addresses</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 * <p>
 * [EC2-Classic, VPC in an EC2-VPC-only account] If the Elastic IP address is
 * already associated with a different instance, it is disassociated from that
 * instance and associated with the specified instance. If you associate an
 * Elastic IP address with an instance that has an existing Elastic IP address,
 * the existing address is disassociated from the instance, but remains
 * allocated to your account.
 * </p>
 * <p>
 * [VPC in an EC2-Classic account] If you don't specify a private IP address,
 * the Elastic IP address is associated with the primary IP address. If the
 * Elastic IP address is already associated with a different instance or a
 * network interface, you get an error unless you allow reassociation. You
 * cannot associate an Elastic IP address with an instance or network interface
 * that has an existing Elastic IP address.
 * </p>
 * <p>
 * You cannot associate an Elastic IP address with an interface in a different
 * network border group.
 * </p>
 * <important>
 * <p>
 * This is an idempotent operation. If you perform the operation more than once,
 * Amazon EC2 doesn't return an error, and you may be charged for each time the
 * Elastic IP address is remapped to the same instance. For more information,
 * see the <i>Elastic IP Addresses</i> section of <a
 * href="http://aws.amazon.com/ec2/pricing/">Amazon EC2 Pricing</a>.
 * </p>
 * </important>
 */
public class AssociateAddressRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     * </p>
     */
    private String allocationId;

    /**
     * <p>
     * The ID of the instance. This is required for EC2-Classic. For EC2-VPC,
     * you can specify either the instance ID or the network interface ID, but
     * not both. The operation fails if you specify an instance ID unless
     * exactly one network interface is attached.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The Elastic IP address to associate with the instance. This is required
     * for EC2-Classic.
     * </p>
     */
    private String publicIp;

    /**
     * <p>
     * [EC2-VPC] For a VPC in an EC2-Classic account, specify true to allow an
     * Elastic IP address that is already associated with an instance or network
     * interface to be reassociated with the specified instance or network
     * interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only
     * account, reassociation is automatic, therefore you can specify false to
     * ensure the operation fails if the Elastic IP address is already
     * associated with another resource.
     * </p>
     */
    private Boolean allowReassociation;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * [EC2-VPC] The ID of the network interface. If the instance has more than
     * one network interface, you must specify a network interface ID.
     * </p>
     * <p>
     * For EC2-VPC, you can specify either the instance ID or the network
     * interface ID, but not both.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * [EC2-VPC] The primary or secondary private IP address to associate with
     * the Elastic IP address. If no private IP address is specified, the
     * Elastic IP address is associated with the primary private IP address.
     * </p>
     */
    private String privateIpAddress;

    /**
     * <p>
     * [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     *         </p>
     */
    public String getAllocationId() {
        return allocationId;
    }

    /**
     * <p>
     * [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     * </p>
     *
     * @param allocationId <p>
     *            [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     *            </p>
     */
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocationId <p>
     *            [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateAddressRequest withAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * <p>
     * The ID of the instance. This is required for EC2-Classic. For EC2-VPC,
     * you can specify either the instance ID or the network interface ID, but
     * not both. The operation fails if you specify an instance ID unless
     * exactly one network interface is attached.
     * </p>
     *
     * @return <p>
     *         The ID of the instance. This is required for EC2-Classic. For
     *         EC2-VPC, you can specify either the instance ID or the network
     *         interface ID, but not both. The operation fails if you specify an
     *         instance ID unless exactly one network interface is attached.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance. This is required for EC2-Classic. For EC2-VPC,
     * you can specify either the instance ID or the network interface ID, but
     * not both. The operation fails if you specify an instance ID unless
     * exactly one network interface is attached.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance. This is required for EC2-Classic. For
     *            EC2-VPC, you can specify either the instance ID or the network
     *            interface ID, but not both. The operation fails if you specify
     *            an instance ID unless exactly one network interface is
     *            attached.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance. This is required for EC2-Classic. For EC2-VPC,
     * you can specify either the instance ID or the network interface ID, but
     * not both. The operation fails if you specify an instance ID unless
     * exactly one network interface is attached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance. This is required for EC2-Classic. For
     *            EC2-VPC, you can specify either the instance ID or the network
     *            interface ID, but not both. The operation fails if you specify
     *            an instance ID unless exactly one network interface is
     *            attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateAddressRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The Elastic IP address to associate with the instance. This is required
     * for EC2-Classic.
     * </p>
     *
     * @return <p>
     *         The Elastic IP address to associate with the instance. This is
     *         required for EC2-Classic.
     *         </p>
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * <p>
     * The Elastic IP address to associate with the instance. This is required
     * for EC2-Classic.
     * </p>
     *
     * @param publicIp <p>
     *            The Elastic IP address to associate with the instance. This is
     *            required for EC2-Classic.
     *            </p>
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The Elastic IP address to associate with the instance. This is required
     * for EC2-Classic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicIp <p>
     *            The Elastic IP address to associate with the instance. This is
     *            required for EC2-Classic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateAddressRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] For a VPC in an EC2-Classic account, specify true to allow an
     * Elastic IP address that is already associated with an instance or network
     * interface to be reassociated with the specified instance or network
     * interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only
     * account, reassociation is automatic, therefore you can specify false to
     * ensure the operation fails if the Elastic IP address is already
     * associated with another resource.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] For a VPC in an EC2-Classic account, specify true to
     *         allow an Elastic IP address that is already associated with an
     *         instance or network interface to be reassociated with the
     *         specified instance or network interface. Otherwise, the operation
     *         fails. In a VPC in an EC2-VPC-only account, reassociation is
     *         automatic, therefore you can specify false to ensure the
     *         operation fails if the Elastic IP address is already associated
     *         with another resource.
     *         </p>
     */
    public Boolean isAllowReassociation() {
        return allowReassociation;
    }

    /**
     * <p>
     * [EC2-VPC] For a VPC in an EC2-Classic account, specify true to allow an
     * Elastic IP address that is already associated with an instance or network
     * interface to be reassociated with the specified instance or network
     * interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only
     * account, reassociation is automatic, therefore you can specify false to
     * ensure the operation fails if the Elastic IP address is already
     * associated with another resource.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] For a VPC in an EC2-Classic account, specify true to
     *         allow an Elastic IP address that is already associated with an
     *         instance or network interface to be reassociated with the
     *         specified instance or network interface. Otherwise, the operation
     *         fails. In a VPC in an EC2-VPC-only account, reassociation is
     *         automatic, therefore you can specify false to ensure the
     *         operation fails if the Elastic IP address is already associated
     *         with another resource.
     *         </p>
     */
    public Boolean getAllowReassociation() {
        return allowReassociation;
    }

    /**
     * <p>
     * [EC2-VPC] For a VPC in an EC2-Classic account, specify true to allow an
     * Elastic IP address that is already associated with an instance or network
     * interface to be reassociated with the specified instance or network
     * interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only
     * account, reassociation is automatic, therefore you can specify false to
     * ensure the operation fails if the Elastic IP address is already
     * associated with another resource.
     * </p>
     *
     * @param allowReassociation <p>
     *            [EC2-VPC] For a VPC in an EC2-Classic account, specify true to
     *            allow an Elastic IP address that is already associated with an
     *            instance or network interface to be reassociated with the
     *            specified instance or network interface. Otherwise, the
     *            operation fails. In a VPC in an EC2-VPC-only account,
     *            reassociation is automatic, therefore you can specify false to
     *            ensure the operation fails if the Elastic IP address is
     *            already associated with another resource.
     *            </p>
     */
    public void setAllowReassociation(Boolean allowReassociation) {
        this.allowReassociation = allowReassociation;
    }

    /**
     * <p>
     * [EC2-VPC] For a VPC in an EC2-Classic account, specify true to allow an
     * Elastic IP address that is already associated with an instance or network
     * interface to be reassociated with the specified instance or network
     * interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only
     * account, reassociation is automatic, therefore you can specify false to
     * ensure the operation fails if the Elastic IP address is already
     * associated with another resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowReassociation <p>
     *            [EC2-VPC] For a VPC in an EC2-Classic account, specify true to
     *            allow an Elastic IP address that is already associated with an
     *            instance or network interface to be reassociated with the
     *            specified instance or network interface. Otherwise, the
     *            operation fails. In a VPC in an EC2-VPC-only account,
     *            reassociation is automatic, therefore you can specify false to
     *            ensure the operation fails if the Elastic IP address is
     *            already associated with another resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateAddressRequest withAllowReassociation(Boolean allowReassociation) {
        this.allowReassociation = allowReassociation;
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateAddressRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the network interface. If the instance has more than
     * one network interface, you must specify a network interface ID.
     * </p>
     * <p>
     * For EC2-VPC, you can specify either the instance ID or the network
     * interface ID, but not both.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] The ID of the network interface. If the instance has
     *         more than one network interface, you must specify a network
     *         interface ID.
     *         </p>
     *         <p>
     *         For EC2-VPC, you can specify either the instance ID or the
     *         network interface ID, but not both.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the network interface. If the instance has more than
     * one network interface, you must specify a network interface ID.
     * </p>
     * <p>
     * For EC2-VPC, you can specify either the instance ID or the network
     * interface ID, but not both.
     * </p>
     *
     * @param networkInterfaceId <p>
     *            [EC2-VPC] The ID of the network interface. If the instance has
     *            more than one network interface, you must specify a network
     *            interface ID.
     *            </p>
     *            <p>
     *            For EC2-VPC, you can specify either the instance ID or the
     *            network interface ID, but not both.
     *            </p>
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the network interface. If the instance has more than
     * one network interface, you must specify a network interface ID.
     * </p>
     * <p>
     * For EC2-VPC, you can specify either the instance ID or the network
     * interface ID, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceId <p>
     *            [EC2-VPC] The ID of the network interface. If the instance has
     *            more than one network interface, you must specify a network
     *            interface ID.
     *            </p>
     *            <p>
     *            For EC2-VPC, you can specify either the instance ID or the
     *            network interface ID, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateAddressRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The primary or secondary private IP address to associate with
     * the Elastic IP address. If no private IP address is specified, the
     * Elastic IP address is associated with the primary private IP address.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] The primary or secondary private IP address to
     *         associate with the Elastic IP address. If no private IP address
     *         is specified, the Elastic IP address is associated with the
     *         primary private IP address.
     *         </p>
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * <p>
     * [EC2-VPC] The primary or secondary private IP address to associate with
     * the Elastic IP address. If no private IP address is specified, the
     * Elastic IP address is associated with the primary private IP address.
     * </p>
     *
     * @param privateIpAddress <p>
     *            [EC2-VPC] The primary or secondary private IP address to
     *            associate with the Elastic IP address. If no private IP
     *            address is specified, the Elastic IP address is associated
     *            with the primary private IP address.
     *            </p>
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * [EC2-VPC] The primary or secondary private IP address to associate with
     * the Elastic IP address. If no private IP address is specified, the
     * Elastic IP address is associated with the primary private IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddress <p>
     *            [EC2-VPC] The primary or secondary private IP address to
     *            associate with the Elastic IP address. If no private IP
     *            address is specified, the Elastic IP address is associated
     *            with the primary private IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateAddressRequest withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
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
        if (getAllocationId() != null)
            sb.append("AllocationId: " + getAllocationId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getPublicIp() != null)
            sb.append("PublicIp: " + getPublicIp() + ",");
        if (getAllowReassociation() != null)
            sb.append("AllowReassociation: " + getAllowReassociation() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode
                + ((getAllowReassociation() == null) ? 0 : getAllowReassociation().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateAddressRequest == false)
            return false;
        AssociateAddressRequest other = (AssociateAddressRequest) obj;

        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null
                && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getAllowReassociation() == null ^ this.getAllowReassociation() == null)
            return false;
        if (other.getAllowReassociation() != null
                && other.getAllowReassociation().equals(this.getAllowReassociation()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null
                && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        return true;
    }
}
