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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a file system, permanently severing access to its contents. Upon
 * return, the file system no longer exists and you can't access any contents of
 * the deleted file system.
 * </p>
 * <p>
 * You can't delete a file system that is in use. That is, if the file system
 * has any mount targets, you must first delete them. For more information, see
 * <a>DescribeMountTargets</a> and <a>DeleteMountTarget</a>.
 * </p>
 * <note>
 * <p>
 * The <code>DeleteFileSystem</code> call returns while the file system state is
 * still <code>deleting</code>. You can check the file system deletion status by
 * calling the <a>DescribeFileSystems</a> operation, which returns a list of
 * file systems in your account. If you pass file system ID or creation token
 * for the deleted file system, the <a>DescribeFileSystems</a> returns a
 * <code>404 FileSystemNotFound</code> error.
 * </p>
 * </note>
 * <p>
 * This operation requires permissions for the
 * <code>elasticfilesystem:DeleteFileSystem</code> action.
 * </p>
 */
public class DeleteFileSystemRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the file system you want to delete.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * The ID of the file system you want to delete.
     * </p>
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
            sb.append("FileSystemId: " + getFileSystemId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
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
        return true;
    }
}
