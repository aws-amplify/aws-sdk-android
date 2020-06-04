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
 * Describes a permission for a network interface.
 * </p>
 */
public class NetworkInterfacePermission implements Serializable {
    /**
     * <p>
     * The ID of the network interface permission.
     * </p>
     */
    private String networkInterfacePermissionId;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The AWS account ID.
     * </p>
     */
    private String awsAccountId;

    /**
     * <p>
     * The AWS service.
     * </p>
     */
    private String awsService;

    /**
     * <p>
     * The type of permission.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE-ATTACH, EIP-ASSOCIATE
     */
    private String permission;

    /**
     * <p>
     * Information about the state of the permission.
     * </p>
     */
    private NetworkInterfacePermissionState permissionState;

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
    public NetworkInterfacePermission withNetworkInterfacePermissionId(
            String networkInterfacePermissionId) {
        this.networkInterfacePermissionId = networkInterfacePermissionId;
        return this;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     *
     * @return <p>
     *         The ID of the network interface.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     *
     * @param networkInterfaceId <p>
     *            The ID of the network interface.
     *            </p>
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfaceId <p>
     *            The ID of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterfacePermission withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     *
     * @return <p>
     *         The AWS account ID.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     *
     * @param awsAccountId <p>
     *            The AWS account ID.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsAccountId <p>
     *            The AWS account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterfacePermission withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The AWS service.
     * </p>
     *
     * @return <p>
     *         The AWS service.
     *         </p>
     */
    public String getAwsService() {
        return awsService;
    }

    /**
     * <p>
     * The AWS service.
     * </p>
     *
     * @param awsService <p>
     *            The AWS service.
     *            </p>
     */
    public void setAwsService(String awsService) {
        this.awsService = awsService;
    }

    /**
     * <p>
     * The AWS service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsService <p>
     *            The AWS service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterfacePermission withAwsService(String awsService) {
        this.awsService = awsService;
        return this;
    }

    /**
     * <p>
     * The type of permission.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE-ATTACH, EIP-ASSOCIATE
     *
     * @return <p>
     *         The type of permission.
     *         </p>
     * @see InterfacePermissionType
     */
    public String getPermission() {
        return permission;
    }

    /**
     * <p>
     * The type of permission.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE-ATTACH, EIP-ASSOCIATE
     *
     * @param permission <p>
     *            The type of permission.
     *            </p>
     * @see InterfacePermissionType
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * <p>
     * The type of permission.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE-ATTACH, EIP-ASSOCIATE
     *
     * @param permission <p>
     *            The type of permission.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InterfacePermissionType
     */
    public NetworkInterfacePermission withPermission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * <p>
     * The type of permission.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE-ATTACH, EIP-ASSOCIATE
     *
     * @param permission <p>
     *            The type of permission.
     *            </p>
     * @see InterfacePermissionType
     */
    public void setPermission(InterfacePermissionType permission) {
        this.permission = permission.toString();
    }

    /**
     * <p>
     * The type of permission.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSTANCE-ATTACH, EIP-ASSOCIATE
     *
     * @param permission <p>
     *            The type of permission.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InterfacePermissionType
     */
    public NetworkInterfacePermission withPermission(InterfacePermissionType permission) {
        this.permission = permission.toString();
        return this;
    }

    /**
     * <p>
     * Information about the state of the permission.
     * </p>
     *
     * @return <p>
     *         Information about the state of the permission.
     *         </p>
     */
    public NetworkInterfacePermissionState getPermissionState() {
        return permissionState;
    }

    /**
     * <p>
     * Information about the state of the permission.
     * </p>
     *
     * @param permissionState <p>
     *            Information about the state of the permission.
     *            </p>
     */
    public void setPermissionState(NetworkInterfacePermissionState permissionState) {
        this.permissionState = permissionState;
    }

    /**
     * <p>
     * Information about the state of the permission.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissionState <p>
     *            Information about the state of the permission.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInterfacePermission withPermissionState(
            NetworkInterfacePermissionState permissionState) {
        this.permissionState = permissionState;
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
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: " + getAwsAccountId() + ",");
        if (getAwsService() != null)
            sb.append("AwsService: " + getAwsService() + ",");
        if (getPermission() != null)
            sb.append("Permission: " + getPermission() + ",");
        if (getPermissionState() != null)
            sb.append("PermissionState: " + getPermissionState());
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
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsService() == null) ? 0 : getAwsService().hashCode());
        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        hashCode = prime * hashCode
                + ((getPermissionState() == null) ? 0 : getPermissionState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInterfacePermission == false)
            return false;
        NetworkInterfacePermission other = (NetworkInterfacePermission) obj;

        if (other.getNetworkInterfacePermissionId() == null
                ^ this.getNetworkInterfacePermissionId() == null)
            return false;
        if (other.getNetworkInterfacePermissionId() != null
                && other.getNetworkInterfacePermissionId().equals(
                        this.getNetworkInterfacePermissionId()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAwsService() == null ^ this.getAwsService() == null)
            return false;
        if (other.getAwsService() != null
                && other.getAwsService().equals(this.getAwsService()) == false)
            return false;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null
                && other.getPermission().equals(this.getPermission()) == false)
            return false;
        if (other.getPermissionState() == null ^ this.getPermissionState() == null)
            return false;
        if (other.getPermissionState() != null
                && other.getPermissionState().equals(this.getPermissionState()) == false)
            return false;
        return true;
    }
}
