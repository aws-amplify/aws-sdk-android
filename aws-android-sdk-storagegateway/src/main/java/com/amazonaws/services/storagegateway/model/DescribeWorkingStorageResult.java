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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 */
public class DescribeWorkingStorageResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * An array of the gateway's local disk IDs that are configured as working
     * storage. Each local disk ID is specified as a string (minimum length of 1
     * and maximum length of 300). If no local disks are configured as working
     * storage, then the DiskIds array is empty.
     * </p>
     */
    private java.util.List<String> diskIds;

    /**
     * <p>
     * The total working storage in bytes in use by the gateway. If no working
     * storage is configured for the gateway, this field returns 0.
     * </p>
     */
    private Long workingStorageUsedInBytes;

    /**
     * <p>
     * The total working storage in bytes allocated for the gateway. If no
     * working storage is configured for the gateway, this field returns 0.
     * </p>
     */
    private Long workingStorageAllocatedInBytes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for
     *         your account and AWS Region.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeWorkingStorageResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * An array of the gateway's local disk IDs that are configured as working
     * storage. Each local disk ID is specified as a string (minimum length of 1
     * and maximum length of 300). If no local disks are configured as working
     * storage, then the DiskIds array is empty.
     * </p>
     *
     * @return <p>
     *         An array of the gateway's local disk IDs that are configured as
     *         working storage. Each local disk ID is specified as a string
     *         (minimum length of 1 and maximum length of 300). If no local
     *         disks are configured as working storage, then the DiskIds array
     *         is empty.
     *         </p>
     */
    public java.util.List<String> getDiskIds() {
        return diskIds;
    }

    /**
     * <p>
     * An array of the gateway's local disk IDs that are configured as working
     * storage. Each local disk ID is specified as a string (minimum length of 1
     * and maximum length of 300). If no local disks are configured as working
     * storage, then the DiskIds array is empty.
     * </p>
     *
     * @param diskIds <p>
     *            An array of the gateway's local disk IDs that are configured
     *            as working storage. Each local disk ID is specified as a
     *            string (minimum length of 1 and maximum length of 300). If no
     *            local disks are configured as working storage, then the
     *            DiskIds array is empty.
     *            </p>
     */
    public void setDiskIds(java.util.Collection<String> diskIds) {
        if (diskIds == null) {
            this.diskIds = null;
            return;
        }

        this.diskIds = new java.util.ArrayList<String>(diskIds);
    }

    /**
     * <p>
     * An array of the gateway's local disk IDs that are configured as working
     * storage. Each local disk ID is specified as a string (minimum length of 1
     * and maximum length of 300). If no local disks are configured as working
     * storage, then the DiskIds array is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskIds <p>
     *            An array of the gateway's local disk IDs that are configured
     *            as working storage. Each local disk ID is specified as a
     *            string (minimum length of 1 and maximum length of 300). If no
     *            local disks are configured as working storage, then the
     *            DiskIds array is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeWorkingStorageResult withDiskIds(String... diskIds) {
        if (getDiskIds() == null) {
            this.diskIds = new java.util.ArrayList<String>(diskIds.length);
        }
        for (String value : diskIds) {
            this.diskIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of the gateway's local disk IDs that are configured as working
     * storage. Each local disk ID is specified as a string (minimum length of 1
     * and maximum length of 300). If no local disks are configured as working
     * storage, then the DiskIds array is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param diskIds <p>
     *            An array of the gateway's local disk IDs that are configured
     *            as working storage. Each local disk ID is specified as a
     *            string (minimum length of 1 and maximum length of 300). If no
     *            local disks are configured as working storage, then the
     *            DiskIds array is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeWorkingStorageResult withDiskIds(java.util.Collection<String> diskIds) {
        setDiskIds(diskIds);
        return this;
    }

    /**
     * <p>
     * The total working storage in bytes in use by the gateway. If no working
     * storage is configured for the gateway, this field returns 0.
     * </p>
     *
     * @return <p>
     *         The total working storage in bytes in use by the gateway. If no
     *         working storage is configured for the gateway, this field returns
     *         0.
     *         </p>
     */
    public Long getWorkingStorageUsedInBytes() {
        return workingStorageUsedInBytes;
    }

    /**
     * <p>
     * The total working storage in bytes in use by the gateway. If no working
     * storage is configured for the gateway, this field returns 0.
     * </p>
     *
     * @param workingStorageUsedInBytes <p>
     *            The total working storage in bytes in use by the gateway. If
     *            no working storage is configured for the gateway, this field
     *            returns 0.
     *            </p>
     */
    public void setWorkingStorageUsedInBytes(Long workingStorageUsedInBytes) {
        this.workingStorageUsedInBytes = workingStorageUsedInBytes;
    }

    /**
     * <p>
     * The total working storage in bytes in use by the gateway. If no working
     * storage is configured for the gateway, this field returns 0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param workingStorageUsedInBytes <p>
     *            The total working storage in bytes in use by the gateway. If
     *            no working storage is configured for the gateway, this field
     *            returns 0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeWorkingStorageResult withWorkingStorageUsedInBytes(Long workingStorageUsedInBytes) {
        this.workingStorageUsedInBytes = workingStorageUsedInBytes;
        return this;
    }

    /**
     * <p>
     * The total working storage in bytes allocated for the gateway. If no
     * working storage is configured for the gateway, this field returns 0.
     * </p>
     *
     * @return <p>
     *         The total working storage in bytes allocated for the gateway. If
     *         no working storage is configured for the gateway, this field
     *         returns 0.
     *         </p>
     */
    public Long getWorkingStorageAllocatedInBytes() {
        return workingStorageAllocatedInBytes;
    }

    /**
     * <p>
     * The total working storage in bytes allocated for the gateway. If no
     * working storage is configured for the gateway, this field returns 0.
     * </p>
     *
     * @param workingStorageAllocatedInBytes <p>
     *            The total working storage in bytes allocated for the gateway.
     *            If no working storage is configured for the gateway, this
     *            field returns 0.
     *            </p>
     */
    public void setWorkingStorageAllocatedInBytes(Long workingStorageAllocatedInBytes) {
        this.workingStorageAllocatedInBytes = workingStorageAllocatedInBytes;
    }

    /**
     * <p>
     * The total working storage in bytes allocated for the gateway. If no
     * working storage is configured for the gateway, this field returns 0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param workingStorageAllocatedInBytes <p>
     *            The total working storage in bytes allocated for the gateway.
     *            If no working storage is configured for the gateway, this
     *            field returns 0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeWorkingStorageResult withWorkingStorageAllocatedInBytes(
            Long workingStorageAllocatedInBytes) {
        this.workingStorageAllocatedInBytes = workingStorageAllocatedInBytes;
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getDiskIds() != null)
            sb.append("DiskIds: " + getDiskIds() + ",");
        if (getWorkingStorageUsedInBytes() != null)
            sb.append("WorkingStorageUsedInBytes: " + getWorkingStorageUsedInBytes() + ",");
        if (getWorkingStorageAllocatedInBytes() != null)
            sb.append("WorkingStorageAllocatedInBytes: " + getWorkingStorageAllocatedInBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getDiskIds() == null) ? 0 : getDiskIds().hashCode());
        hashCode = prime
                * hashCode
                + ((getWorkingStorageUsedInBytes() == null) ? 0 : getWorkingStorageUsedInBytes()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getWorkingStorageAllocatedInBytes() == null) ? 0
                        : getWorkingStorageAllocatedInBytes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorkingStorageResult == false)
            return false;
        DescribeWorkingStorageResult other = (DescribeWorkingStorageResult) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getDiskIds() == null ^ this.getDiskIds() == null)
            return false;
        if (other.getDiskIds() != null && other.getDiskIds().equals(this.getDiskIds()) == false)
            return false;
        if (other.getWorkingStorageUsedInBytes() == null
                ^ this.getWorkingStorageUsedInBytes() == null)
            return false;
        if (other.getWorkingStorageUsedInBytes() != null
                && other.getWorkingStorageUsedInBytes().equals(this.getWorkingStorageUsedInBytes()) == false)
            return false;
        if (other.getWorkingStorageAllocatedInBytes() == null
                ^ this.getWorkingStorageAllocatedInBytes() == null)
            return false;
        if (other.getWorkingStorageAllocatedInBytes() != null
                && other.getWorkingStorageAllocatedInBytes().equals(
                        this.getWorkingStorageAllocatedInBytes()) == false)
            return false;
        return true;
    }
}
