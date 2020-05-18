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
 * Deletes a permission for a network interface. By default, you cannot delete
 * the permission if the account for which you're removing the permission has
 * attached the network interface to an instance. However, you can force delete
 * the permission, regardless of any attachment.
 * </p>
 */
public class DeleteNetworkInterfacePermissionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the network interface permission.
     * </p>
     */
    private String networkInterfacePermissionId;

    /**
     * <p>
     * Specify <code>true</code> to remove the permission even if the network
     * interface is attached to an instance.
     * </p>
     */
    private Boolean force;

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
     * The ID of the network interface permission.
     * </p>
     *
     * @return <p>
     *         The ID of the network interface permission.
     *         </p>
     */
    public String getNetworkInterfacePermissionId() {
        return networkInterfacePermissionId;
    }

    /**
     * <p>
     * The ID of the network interface permission.
     * </p>
     *
     * @param networkInterfacePermissionId <p>
     *            The ID of the network interface permission.
     *            </p>
     */
    public void setNetworkInterfacePermissionId(String networkInterfacePermissionId) {
        this.networkInterfacePermissionId = networkInterfacePermissionId;
    }

    /**
     * <p>
     * The ID of the network interface permission.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfacePermissionId <p>
     *            The ID of the network interface permission.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteNetworkInterfacePermissionRequest withNetworkInterfacePermissionId(
            String networkInterfacePermissionId) {
        this.networkInterfacePermissionId = networkInterfacePermissionId;
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to remove the permission even if the network
     * interface is attached to an instance.
     * </p>
     *
     * @return <p>
     *         Specify <code>true</code> to remove the permission even if the
     *         network interface is attached to an instance.
     *         </p>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>
     * Specify <code>true</code> to remove the permission even if the network
     * interface is attached to an instance.
     * </p>
     *
     * @return <p>
     *         Specify <code>true</code> to remove the permission even if the
     *         network interface is attached to an instance.
     *         </p>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>
     * Specify <code>true</code> to remove the permission even if the network
     * interface is attached to an instance.
     * </p>
     *
     * @param force <p>
     *            Specify <code>true</code> to remove the permission even if the
     *            network interface is attached to an instance.
     *            </p>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Specify <code>true</code> to remove the permission even if the network
     * interface is attached to an instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param force <p>
     *            Specify <code>true</code> to remove the permission even if the
     *            network interface is attached to an instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteNetworkInterfacePermissionRequest withForce(Boolean force) {
        this.force = force;
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
    public DeleteNetworkInterfacePermissionRequest withDryRun(Boolean dryRun) {
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
        if (getNetworkInterfacePermissionId() != null)
            sb.append("NetworkInterfacePermissionId: " + getNetworkInterfacePermissionId() + ",");
        if (getForce() != null)
            sb.append("Force: " + getForce() + ",");
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
                + ((getNetworkInterfacePermissionId() == null) ? 0
                        : getNetworkInterfacePermissionId().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteNetworkInterfacePermissionRequest == false)
            return false;
        DeleteNetworkInterfacePermissionRequest other = (DeleteNetworkInterfacePermissionRequest) obj;

        if (other.getNetworkInterfacePermissionId() == null
                ^ this.getNetworkInterfacePermissionId() == null)
            return false;
        if (other.getNetworkInterfacePermissionId() != null
                && other.getNetworkInterfacePermissionId().equals(
                        this.getNetworkInterfacePermissionId()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
