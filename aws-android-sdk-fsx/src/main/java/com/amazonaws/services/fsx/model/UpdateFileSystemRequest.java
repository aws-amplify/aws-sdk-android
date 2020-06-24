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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Use this operation to update the configuration of an existing Amazon FSx file
 * system. For an Amazon FSx for Lustre file system, you can update only the
 * WeeklyMaintenanceStartTime. For an Amazon for Windows File Server file
 * system, you can update the following properties:
 * </p>
 * <ul>
 * <li>
 * <p>
 * AutomaticBackupRetentionDays
 * </p>
 * </li>
 * <li>
 * <p>
 * DailyAutomaticBackupStartTime
 * </p>
 * </li>
 * <li>
 * <p>
 * SelfManagedActiveDirectoryConfiguration
 * </p>
 * </li>
 * <li>
 * <p>
 * StorageCapacity
 * </p>
 * </li>
 * <li>
 * <p>
 * ThroughputCapacity
 * </p>
 * </li>
 * <li>
 * <p>
 * WeeklyMaintenanceStartTime
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can update multiple properties in a single request.
 * </p>
 */
public class UpdateFileSystemRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Identifies the file system that you are updating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     */
    private String fileSystemId;

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure
     * idempotent updates. This string is automatically filled on your behalf
     * when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * Use this parameter to increase the storage capacity of an Amazon FSx for
     * Windows File Server file system. Specifies the storage capacity target
     * value, GiB, for the file system you're updating. The storage capacity
     * target value must be at least 10 percent (%) greater than the current
     * storage capacity value. In order to increase storage capacity, the file
     * system needs to have at least 16 MB/s of throughput capacity. You cannot
     * make a storage capacity increase request if there is an existing storage
     * capacity increase request in progress. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     * >Managing Storage Capacity</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer storageCapacity;

    /**
     * <p>
     * The configuration updates for an Amazon FSx for Windows File Server file
     * system.
     * </p>
     */
    private UpdateFileSystemWindowsConfiguration windowsConfiguration;

    /**
     * <p>
     * The configuration object for Amazon FSx for Lustre file systems used in
     * the <code>UpdateFileSystem</code> operation.
     * </p>
     */
    private UpdateFileSystemLustreConfiguration lustreConfiguration;

    /**
     * <p>
     * Identifies the file system that you are updating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         Identifies the file system that you are updating.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * Identifies the file system that you are updating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @param fileSystemId <p>
     *            Identifies the file system that you are updating.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * Identifies the file system that you are updating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @param fileSystemId <p>
     *            Identifies the file system that you are updating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure
     * idempotent updates. This string is automatically filled on your behalf
     * when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     *
     * @return <p>
     *         A string of up to 64 ASCII characters that Amazon FSx uses to
     *         ensure idempotent updates. This string is automatically filled on
     *         your behalf when you use the AWS Command Line Interface (AWS CLI)
     *         or an AWS SDK.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure
     * idempotent updates. This string is automatically filled on your behalf
     * when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     *
     * @param clientRequestToken <p>
     *            A string of up to 64 ASCII characters that Amazon FSx uses to
     *            ensure idempotent updates. This string is automatically filled
     *            on your behalf when you use the AWS Command Line Interface
     *            (AWS CLI) or an AWS SDK.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure
     * idempotent updates. This string is automatically filled on your behalf
     * when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     *
     * @param clientRequestToken <p>
     *            A string of up to 64 ASCII characters that Amazon FSx uses to
     *            ensure idempotent updates. This string is automatically filled
     *            on your behalf when you use the AWS Command Line Interface
     *            (AWS CLI) or an AWS SDK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * Use this parameter to increase the storage capacity of an Amazon FSx for
     * Windows File Server file system. Specifies the storage capacity target
     * value, GiB, for the file system you're updating. The storage capacity
     * target value must be at least 10 percent (%) greater than the current
     * storage capacity value. In order to increase storage capacity, the file
     * system needs to have at least 16 MB/s of throughput capacity. You cannot
     * make a storage capacity increase request if there is an existing storage
     * capacity increase request in progress. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     * >Managing Storage Capacity</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return <p>
     *         Use this parameter to increase the storage capacity of an Amazon
     *         FSx for Windows File Server file system. Specifies the storage
     *         capacity target value, GiB, for the file system you're updating.
     *         The storage capacity target value must be at least 10 percent (%)
     *         greater than the current storage capacity value. In order to
     *         increase storage capacity, the file system needs to have at least
     *         16 MB/s of throughput capacity. You cannot make a storage
     *         capacity increase request if there is an existing storage
     *         capacity increase request in progress. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     *         >Managing Storage Capacity</a>.
     *         </p>
     */
    public Integer getStorageCapacity() {
        return storageCapacity;
    }

    /**
     * <p>
     * Use this parameter to increase the storage capacity of an Amazon FSx for
     * Windows File Server file system. Specifies the storage capacity target
     * value, GiB, for the file system you're updating. The storage capacity
     * target value must be at least 10 percent (%) greater than the current
     * storage capacity value. In order to increase storage capacity, the file
     * system needs to have at least 16 MB/s of throughput capacity. You cannot
     * make a storage capacity increase request if there is an existing storage
     * capacity increase request in progress. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     * >Managing Storage Capacity</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param storageCapacity <p>
     *            Use this parameter to increase the storage capacity of an
     *            Amazon FSx for Windows File Server file system. Specifies the
     *            storage capacity target value, GiB, for the file system you're
     *            updating. The storage capacity target value must be at least
     *            10 percent (%) greater than the current storage capacity
     *            value. In order to increase storage capacity, the file system
     *            needs to have at least 16 MB/s of throughput capacity. You
     *            cannot make a storage capacity increase request if there is an
     *            existing storage capacity increase request in progress. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     *            >Managing Storage Capacity</a>.
     *            </p>
     */
    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * <p>
     * Use this parameter to increase the storage capacity of an Amazon FSx for
     * Windows File Server file system. Specifies the storage capacity target
     * value, GiB, for the file system you're updating. The storage capacity
     * target value must be at least 10 percent (%) greater than the current
     * storage capacity value. In order to increase storage capacity, the file
     * system needs to have at least 16 MB/s of throughput capacity. You cannot
     * make a storage capacity increase request if there is an existing storage
     * capacity increase request in progress. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     * >Managing Storage Capacity</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param storageCapacity <p>
     *            Use this parameter to increase the storage capacity of an
     *            Amazon FSx for Windows File Server file system. Specifies the
     *            storage capacity target value, GiB, for the file system you're
     *            updating. The storage capacity target value must be at least
     *            10 percent (%) greater than the current storage capacity
     *            value. In order to increase storage capacity, the file system
     *            needs to have at least 16 MB/s of throughput capacity. You
     *            cannot make a storage capacity increase request if there is an
     *            existing storage capacity increase request in progress. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-storage-capacity.html"
     *            >Managing Storage Capacity</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemRequest withStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
        return this;
    }

    /**
     * <p>
     * The configuration updates for an Amazon FSx for Windows File Server file
     * system.
     * </p>
     *
     * @return <p>
     *         The configuration updates for an Amazon FSx for Windows File
     *         Server file system.
     *         </p>
     */
    public UpdateFileSystemWindowsConfiguration getWindowsConfiguration() {
        return windowsConfiguration;
    }

    /**
     * <p>
     * The configuration updates for an Amazon FSx for Windows File Server file
     * system.
     * </p>
     *
     * @param windowsConfiguration <p>
     *            The configuration updates for an Amazon FSx for Windows File
     *            Server file system.
     *            </p>
     */
    public void setWindowsConfiguration(UpdateFileSystemWindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
    }

    /**
     * <p>
     * The configuration updates for an Amazon FSx for Windows File Server file
     * system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param windowsConfiguration <p>
     *            The configuration updates for an Amazon FSx for Windows File
     *            Server file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemRequest withWindowsConfiguration(
            UpdateFileSystemWindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
        return this;
    }

    /**
     * <p>
     * The configuration object for Amazon FSx for Lustre file systems used in
     * the <code>UpdateFileSystem</code> operation.
     * </p>
     *
     * @return <p>
     *         The configuration object for Amazon FSx for Lustre file systems
     *         used in the <code>UpdateFileSystem</code> operation.
     *         </p>
     */
    public UpdateFileSystemLustreConfiguration getLustreConfiguration() {
        return lustreConfiguration;
    }

    /**
     * <p>
     * The configuration object for Amazon FSx for Lustre file systems used in
     * the <code>UpdateFileSystem</code> operation.
     * </p>
     *
     * @param lustreConfiguration <p>
     *            The configuration object for Amazon FSx for Lustre file
     *            systems used in the <code>UpdateFileSystem</code> operation.
     *            </p>
     */
    public void setLustreConfiguration(UpdateFileSystemLustreConfiguration lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
    }

    /**
     * <p>
     * The configuration object for Amazon FSx for Lustre file systems used in
     * the <code>UpdateFileSystem</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lustreConfiguration <p>
     *            The configuration object for Amazon FSx for Lustre file
     *            systems used in the <code>UpdateFileSystem</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFileSystemRequest withLustreConfiguration(
            UpdateFileSystemLustreConfiguration lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getStorageCapacity() != null)
            sb.append("StorageCapacity: " + getStorageCapacity() + ",");
        if (getWindowsConfiguration() != null)
            sb.append("WindowsConfiguration: " + getWindowsConfiguration() + ",");
        if (getLustreConfiguration() != null)
            sb.append("LustreConfiguration: " + getLustreConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode
                + ((getStorageCapacity() == null) ? 0 : getStorageCapacity().hashCode());
        hashCode = prime * hashCode
                + ((getWindowsConfiguration() == null) ? 0 : getWindowsConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getLustreConfiguration() == null) ? 0 : getLustreConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileSystemRequest == false)
            return false;
        UpdateFileSystemRequest other = (UpdateFileSystemRequest) obj;

        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getStorageCapacity() == null ^ this.getStorageCapacity() == null)
            return false;
        if (other.getStorageCapacity() != null
                && other.getStorageCapacity().equals(this.getStorageCapacity()) == false)
            return false;
        if (other.getWindowsConfiguration() == null ^ this.getWindowsConfiguration() == null)
            return false;
        if (other.getWindowsConfiguration() != null
                && other.getWindowsConfiguration().equals(this.getWindowsConfiguration()) == false)
            return false;
        if (other.getLustreConfiguration() == null ^ this.getLustreConfiguration() == null)
            return false;
        if (other.getLustreConfiguration() != null
                && other.getLustreConfiguration().equals(this.getLustreConfiguration()) == false)
            return false;
        return true;
    }
}
