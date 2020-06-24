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
 * Deletes a file system, deleting its contents. After deletion, the file system
 * no longer exists, and its data is gone. Any existing automatic backups will
 * also be deleted.
 * </p>
 * <p>
 * By default, when you delete an Amazon FSx for Windows File Server file
 * system, a final backup is created upon deletion. This final backup is not
 * subject to the file system's retention policy, and must be manually deleted.
 * </p>
 * <p>
 * The <code>DeleteFileSystem</code> action returns while the file system has
 * the <code>DELETING</code> status. You can check the file system deletion
 * status by calling the <a>DescribeFileSystems</a> action, which returns a list
 * of file systems in your account. If you pass the file system ID for a deleted
 * file system, the <a>DescribeFileSystems</a> returns a
 * <code>FileSystemNotFound</code> error.
 * </p>
 * <note>
 * <p>
 * Deleting an Amazon FSx for Lustre file system will fail with a 400 BadRequest
 * if a data repository task is in a <code>PENDING</code> or
 * <code>EXECUTING</code> state.
 * </p>
 * </note> <important>
 * <p>
 * The data in a deleted file system is also deleted and can't be recovered by
 * any means.
 * </p>
 * </important>
 */
public class DeleteFileSystemRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the file system you want to delete.
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
     * idempotent deletion. This is automatically filled on your behalf when
     * using the AWS CLI or SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The configuration object for the Microsoft Windows file system used in
     * the <code>DeleteFileSystem</code> operation.
     * </p>
     */
    private DeleteFileSystemWindowsConfiguration windowsConfiguration;

    /**
     * <p>
     * The configuration object for the Amazon FSx for Lustre file system being
     * deleted in the <code>DeleteFileSystem</code> operation.
     * </p>
     */
    private DeleteFileSystemLustreConfiguration lustreConfiguration;

    /**
     * <p>
     * The ID of the file system you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         The ID of the file system you want to delete.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 21<br/>
     * <b>Pattern: </b>^(fs-[0-9a-f]{8,})$<br/>
     *
     * @param fileSystemId <p>
     *            The ID of the file system you want to delete.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system you want to delete.
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
     *            The ID of the file system you want to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileSystemRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure
     * idempotent deletion. This is automatically filled on your behalf when
     * using the AWS CLI or SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     *
     * @return <p>
     *         A string of up to 64 ASCII characters that Amazon FSx uses to
     *         ensure idempotent deletion. This is automatically filled on your
     *         behalf when using the AWS CLI or SDK.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure
     * idempotent deletion. This is automatically filled on your behalf when
     * using the AWS CLI or SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[A-za-z0-9_.-]{0,63}$<br/>
     *
     * @param clientRequestToken <p>
     *            A string of up to 64 ASCII characters that Amazon FSx uses to
     *            ensure idempotent deletion. This is automatically filled on
     *            your behalf when using the AWS CLI or SDK.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters that Amazon FSx uses to ensure
     * idempotent deletion. This is automatically filled on your behalf when
     * using the AWS CLI or SDK.
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
     *            ensure idempotent deletion. This is automatically filled on
     *            your behalf when using the AWS CLI or SDK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileSystemRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The configuration object for the Microsoft Windows file system used in
     * the <code>DeleteFileSystem</code> operation.
     * </p>
     *
     * @return <p>
     *         The configuration object for the Microsoft Windows file system
     *         used in the <code>DeleteFileSystem</code> operation.
     *         </p>
     */
    public DeleteFileSystemWindowsConfiguration getWindowsConfiguration() {
        return windowsConfiguration;
    }

    /**
     * <p>
     * The configuration object for the Microsoft Windows file system used in
     * the <code>DeleteFileSystem</code> operation.
     * </p>
     *
     * @param windowsConfiguration <p>
     *            The configuration object for the Microsoft Windows file system
     *            used in the <code>DeleteFileSystem</code> operation.
     *            </p>
     */
    public void setWindowsConfiguration(DeleteFileSystemWindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
    }

    /**
     * <p>
     * The configuration object for the Microsoft Windows file system used in
     * the <code>DeleteFileSystem</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param windowsConfiguration <p>
     *            The configuration object for the Microsoft Windows file system
     *            used in the <code>DeleteFileSystem</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileSystemRequest withWindowsConfiguration(
            DeleteFileSystemWindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
        return this;
    }

    /**
     * <p>
     * The configuration object for the Amazon FSx for Lustre file system being
     * deleted in the <code>DeleteFileSystem</code> operation.
     * </p>
     *
     * @return <p>
     *         The configuration object for the Amazon FSx for Lustre file
     *         system being deleted in the <code>DeleteFileSystem</code>
     *         operation.
     *         </p>
     */
    public DeleteFileSystemLustreConfiguration getLustreConfiguration() {
        return lustreConfiguration;
    }

    /**
     * <p>
     * The configuration object for the Amazon FSx for Lustre file system being
     * deleted in the <code>DeleteFileSystem</code> operation.
     * </p>
     *
     * @param lustreConfiguration <p>
     *            The configuration object for the Amazon FSx for Lustre file
     *            system being deleted in the <code>DeleteFileSystem</code>
     *            operation.
     *            </p>
     */
    public void setLustreConfiguration(DeleteFileSystemLustreConfiguration lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
    }

    /**
     * <p>
     * The configuration object for the Amazon FSx for Lustre file system being
     * deleted in the <code>DeleteFileSystem</code> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lustreConfiguration <p>
     *            The configuration object for the Amazon FSx for Lustre file
     *            system being deleted in the <code>DeleteFileSystem</code>
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileSystemRequest withLustreConfiguration(
            DeleteFileSystemLustreConfiguration lustreConfiguration) {
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

        if (obj instanceof DeleteFileSystemRequest == false)
            return false;
        DeleteFileSystemRequest other = (DeleteFileSystemRequest) obj;

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
