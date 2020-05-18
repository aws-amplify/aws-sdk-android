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
 * Modifies the specified VPC attachment.
 * </p>
 */
public class ModifyTransitGatewayVpcAttachmentRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the attachment.
     * </p>
     */
    private String transitGatewayAttachmentId;

    /**
     * <p>
     * The IDs of one or more subnets to add. You can specify at most one subnet
     * per Availability Zone.
     * </p>
     */
    private java.util.List<String> addSubnetIds;

    /**
     * <p>
     * The IDs of one or more subnets to remove.
     * </p>
     */
    private java.util.List<String> removeSubnetIds;

    /**
     * <p>
     * The new VPC attachment options.
     * </p>
     * <note>
     * <p>
     * You cannot modify the IPv6 options.
     * </p>
     * </note>
     */
    private ModifyTransitGatewayVpcAttachmentRequestOptions options;

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
     * The ID of the attachment.
     * </p>
     *
     * @return <p>
     *         The ID of the attachment.
     *         </p>
     */
    public String getTransitGatewayAttachmentId() {
        return transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     *
     * @param transitGatewayAttachmentId <p>
     *            The ID of the attachment.
     *            </p>
     */
    public void setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayAttachmentId <p>
     *            The ID of the attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTransitGatewayVpcAttachmentRequest withTransitGatewayAttachmentId(
            String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
        return this;
    }

    /**
     * <p>
     * The IDs of one or more subnets to add. You can specify at most one subnet
     * per Availability Zone.
     * </p>
     *
     * @return <p>
     *         The IDs of one or more subnets to add. You can specify at most
     *         one subnet per Availability Zone.
     *         </p>
     */
    public java.util.List<String> getAddSubnetIds() {
        return addSubnetIds;
    }

    /**
     * <p>
     * The IDs of one or more subnets to add. You can specify at most one subnet
     * per Availability Zone.
     * </p>
     *
     * @param addSubnetIds <p>
     *            The IDs of one or more subnets to add. You can specify at most
     *            one subnet per Availability Zone.
     *            </p>
     */
    public void setAddSubnetIds(java.util.Collection<String> addSubnetIds) {
        if (addSubnetIds == null) {
            this.addSubnetIds = null;
            return;
        }

        this.addSubnetIds = new java.util.ArrayList<String>(addSubnetIds);
    }

    /**
     * <p>
     * The IDs of one or more subnets to add. You can specify at most one subnet
     * per Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addSubnetIds <p>
     *            The IDs of one or more subnets to add. You can specify at most
     *            one subnet per Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTransitGatewayVpcAttachmentRequest withAddSubnetIds(String... addSubnetIds) {
        if (getAddSubnetIds() == null) {
            this.addSubnetIds = new java.util.ArrayList<String>(addSubnetIds.length);
        }
        for (String value : addSubnetIds) {
            this.addSubnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more subnets to add. You can specify at most one subnet
     * per Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addSubnetIds <p>
     *            The IDs of one or more subnets to add. You can specify at most
     *            one subnet per Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTransitGatewayVpcAttachmentRequest withAddSubnetIds(
            java.util.Collection<String> addSubnetIds) {
        setAddSubnetIds(addSubnetIds);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more subnets to remove.
     * </p>
     *
     * @return <p>
     *         The IDs of one or more subnets to remove.
     *         </p>
     */
    public java.util.List<String> getRemoveSubnetIds() {
        return removeSubnetIds;
    }

    /**
     * <p>
     * The IDs of one or more subnets to remove.
     * </p>
     *
     * @param removeSubnetIds <p>
     *            The IDs of one or more subnets to remove.
     *            </p>
     */
    public void setRemoveSubnetIds(java.util.Collection<String> removeSubnetIds) {
        if (removeSubnetIds == null) {
            this.removeSubnetIds = null;
            return;
        }

        this.removeSubnetIds = new java.util.ArrayList<String>(removeSubnetIds);
    }

    /**
     * <p>
     * The IDs of one or more subnets to remove.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeSubnetIds <p>
     *            The IDs of one or more subnets to remove.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTransitGatewayVpcAttachmentRequest withRemoveSubnetIds(String... removeSubnetIds) {
        if (getRemoveSubnetIds() == null) {
            this.removeSubnetIds = new java.util.ArrayList<String>(removeSubnetIds.length);
        }
        for (String value : removeSubnetIds) {
            this.removeSubnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more subnets to remove.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeSubnetIds <p>
     *            The IDs of one or more subnets to remove.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTransitGatewayVpcAttachmentRequest withRemoveSubnetIds(
            java.util.Collection<String> removeSubnetIds) {
        setRemoveSubnetIds(removeSubnetIds);
        return this;
    }

    /**
     * <p>
     * The new VPC attachment options.
     * </p>
     * <note>
     * <p>
     * You cannot modify the IPv6 options.
     * </p>
     * </note>
     *
     * @return <p>
     *         The new VPC attachment options.
     *         </p>
     *         <note>
     *         <p>
     *         You cannot modify the IPv6 options.
     *         </p>
     *         </note>
     */
    public ModifyTransitGatewayVpcAttachmentRequestOptions getOptions() {
        return options;
    }

    /**
     * <p>
     * The new VPC attachment options.
     * </p>
     * <note>
     * <p>
     * You cannot modify the IPv6 options.
     * </p>
     * </note>
     *
     * @param options <p>
     *            The new VPC attachment options.
     *            </p>
     *            <note>
     *            <p>
     *            You cannot modify the IPv6 options.
     *            </p>
     *            </note>
     */
    public void setOptions(ModifyTransitGatewayVpcAttachmentRequestOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * The new VPC attachment options.
     * </p>
     * <note>
     * <p>
     * You cannot modify the IPv6 options.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param options <p>
     *            The new VPC attachment options.
     *            </p>
     *            <note>
     *            <p>
     *            You cannot modify the IPv6 options.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyTransitGatewayVpcAttachmentRequest withOptions(
            ModifyTransitGatewayVpcAttachmentRequestOptions options) {
        this.options = options;
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
    public ModifyTransitGatewayVpcAttachmentRequest withDryRun(Boolean dryRun) {
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
        if (getTransitGatewayAttachmentId() != null)
            sb.append("TransitGatewayAttachmentId: " + getTransitGatewayAttachmentId() + ",");
        if (getAddSubnetIds() != null)
            sb.append("AddSubnetIds: " + getAddSubnetIds() + ",");
        if (getRemoveSubnetIds() != null)
            sb.append("RemoveSubnetIds: " + getRemoveSubnetIds() + ",");
        if (getOptions() != null)
            sb.append("Options: " + getOptions() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTransitGatewayAttachmentId() == null) ? 0 : getTransitGatewayAttachmentId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAddSubnetIds() == null) ? 0 : getAddSubnetIds().hashCode());
        hashCode = prime * hashCode
                + ((getRemoveSubnetIds() == null) ? 0 : getRemoveSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTransitGatewayVpcAttachmentRequest == false)
            return false;
        ModifyTransitGatewayVpcAttachmentRequest other = (ModifyTransitGatewayVpcAttachmentRequest) obj;

        if (other.getTransitGatewayAttachmentId() == null
                ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null
                && other.getTransitGatewayAttachmentId().equals(
                        this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getAddSubnetIds() == null ^ this.getAddSubnetIds() == null)
            return false;
        if (other.getAddSubnetIds() != null
                && other.getAddSubnetIds().equals(this.getAddSubnetIds()) == false)
            return false;
        if (other.getRemoveSubnetIds() == null ^ this.getRemoveSubnetIds() == null)
            return false;
        if (other.getRemoveSubnetIds() != null
                && other.getRemoveSubnetIds().equals(this.getRemoveSubnetIds()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
