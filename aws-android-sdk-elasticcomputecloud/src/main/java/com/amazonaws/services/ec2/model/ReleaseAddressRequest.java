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
 * Releases the specified Elastic IP address.
 * </p>
 * <p>
 * [EC2-Classic, default VPC] Releasing an Elastic IP address automatically
 * disassociates it from any instance that it's associated with. To disassociate
 * an Elastic IP address without releasing it, use <a>DisassociateAddress</a>.
 * </p>
 * <p>
 * [Nondefault VPC] You must use <a>DisassociateAddress</a> to disassociate the
 * Elastic IP address before you can release it. Otherwise, Amazon EC2 returns
 * an error (<code>InvalidIPAddress.InUse</code>).
 * </p>
 * <p>
 * After releasing an Elastic IP address, it is released to the IP address pool.
 * Be sure to update your DNS records and any servers or devices that
 * communicate with the address. If you attempt to release an Elastic IP address
 * that you already released, you'll get an <code>AuthFailure</code> error if
 * the address is already allocated to another AWS account.
 * </p>
 * <p>
 * [EC2-VPC] After you release an Elastic IP address for use in a VPC, you might
 * be able to recover it. For more information, see <a>AllocateAddress</a>.
 * </p>
 */
public class ReleaseAddressRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [EC2-VPC] The allocation ID. Required for EC2-VPC.
     * </p>
     */
    private String allocationId;

    /**
     * <p>
     * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     * </p>
     */
    private String publicIp;

    /**
     * <p>
     * The location that the IP address is released from.
     * </p>
     * <p>
     * If you provide an incorrect network border group, you will receive an
     * <code>InvalidAddress.NotFound</code> error. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     * >Error Codes</a>.
     * </p>
     * <note>
     * <p>
     * You cannot use a network border group with EC2 Classic. If you attempt
     * this operation on EC2 classic, you will receive an
     * <code>InvalidParameterCombination</code> error. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     * >Error Codes</a>.
     * </p>
     * </note>
     */
    private String networkBorderGroup;

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
     * [EC2-VPC] The allocation ID. Required for EC2-VPC.
     * </p>
     *
     * @return <p>
     *         [EC2-VPC] The allocation ID. Required for EC2-VPC.
     *         </p>
     */
    public String getAllocationId() {
        return allocationId;
    }

    /**
     * <p>
     * [EC2-VPC] The allocation ID. Required for EC2-VPC.
     * </p>
     *
     * @param allocationId <p>
     *            [EC2-VPC] The allocation ID. Required for EC2-VPC.
     *            </p>
     */
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * [EC2-VPC] The allocation ID. Required for EC2-VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocationId <p>
     *            [EC2-VPC] The allocation ID. Required for EC2-VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReleaseAddressRequest withAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * <p>
     * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     * </p>
     *
     * @return <p>
     *         [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     *         </p>
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * <p>
     * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     * </p>
     *
     * @param publicIp <p>
     *            [EC2-Classic] The Elastic IP address. Required for
     *            EC2-Classic.
     *            </p>
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicIp <p>
     *            [EC2-Classic] The Elastic IP address. Required for
     *            EC2-Classic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReleaseAddressRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * <p>
     * The location that the IP address is released from.
     * </p>
     * <p>
     * If you provide an incorrect network border group, you will receive an
     * <code>InvalidAddress.NotFound</code> error. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     * >Error Codes</a>.
     * </p>
     * <note>
     * <p>
     * You cannot use a network border group with EC2 Classic. If you attempt
     * this operation on EC2 classic, you will receive an
     * <code>InvalidParameterCombination</code> error. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     * >Error Codes</a>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The location that the IP address is released from.
     *         </p>
     *         <p>
     *         If you provide an incorrect network border group, you will
     *         receive an <code>InvalidAddress.NotFound</code> error. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     *         >Error Codes</a>.
     *         </p>
     *         <note>
     *         <p>
     *         You cannot use a network border group with EC2 Classic. If you
     *         attempt this operation on EC2 classic, you will receive an
     *         <code>InvalidParameterCombination</code> error. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     *         >Error Codes</a>.
     *         </p>
     *         </note>
     */
    public String getNetworkBorderGroup() {
        return networkBorderGroup;
    }

    /**
     * <p>
     * The location that the IP address is released from.
     * </p>
     * <p>
     * If you provide an incorrect network border group, you will receive an
     * <code>InvalidAddress.NotFound</code> error. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     * >Error Codes</a>.
     * </p>
     * <note>
     * <p>
     * You cannot use a network border group with EC2 Classic. If you attempt
     * this operation on EC2 classic, you will receive an
     * <code>InvalidParameterCombination</code> error. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     * >Error Codes</a>.
     * </p>
     * </note>
     *
     * @param networkBorderGroup <p>
     *            The location that the IP address is released from.
     *            </p>
     *            <p>
     *            If you provide an incorrect network border group, you will
     *            receive an <code>InvalidAddress.NotFound</code> error. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     *            >Error Codes</a>.
     *            </p>
     *            <note>
     *            <p>
     *            You cannot use a network border group with EC2 Classic. If you
     *            attempt this operation on EC2 classic, you will receive an
     *            <code>InvalidParameterCombination</code> error. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     *            >Error Codes</a>.
     *            </p>
     *            </note>
     */
    public void setNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
    }

    /**
     * <p>
     * The location that the IP address is released from.
     * </p>
     * <p>
     * If you provide an incorrect network border group, you will receive an
     * <code>InvalidAddress.NotFound</code> error. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     * >Error Codes</a>.
     * </p>
     * <note>
     * <p>
     * You cannot use a network border group with EC2 Classic. If you attempt
     * this operation on EC2 classic, you will receive an
     * <code>InvalidParameterCombination</code> error. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     * >Error Codes</a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkBorderGroup <p>
     *            The location that the IP address is released from.
     *            </p>
     *            <p>
     *            If you provide an incorrect network border group, you will
     *            receive an <code>InvalidAddress.NotFound</code> error. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     *            >Error Codes</a>.
     *            </p>
     *            <note>
     *            <p>
     *            You cannot use a network border group with EC2 Classic. If you
     *            attempt this operation on EC2 classic, you will receive an
     *            <code>InvalidParameterCombination</code> error. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
     *            >Error Codes</a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReleaseAddressRequest withNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
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
    public ReleaseAddressRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getPublicIp() != null)
            sb.append("PublicIp: " + getPublicIp() + ",");
        if (getNetworkBorderGroup() != null)
            sb.append("NetworkBorderGroup: " + getNetworkBorderGroup() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkBorderGroup() == null) ? 0 : getNetworkBorderGroup().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReleaseAddressRequest == false)
            return false;
        ReleaseAddressRequest other = (ReleaseAddressRequest) obj;

        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null
                && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getNetworkBorderGroup() == null ^ this.getNetworkBorderGroup() == null)
            return false;
        if (other.getNetworkBorderGroup() != null
                && other.getNetworkBorderGroup().equals(this.getNetworkBorderGroup()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
