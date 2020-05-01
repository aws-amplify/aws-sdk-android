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
 * Deletes the <code>FileSystemPolicy</code> for the specified file system. The
 * default <code>FileSystemPolicy</code> goes into effect once the existing
 * policy is deleted. For more information about the default file system policy,
 * see <a href=
 * "https://docs.aws.amazon.com/efs/latest/ug/res-based-policies-efs.html">Using
 * Resource-based Policies with EFS</a>.
 * </p>
 * <p>
 * This operation requires permissions for the
 * <code>elasticfilesystem:DeleteFileSystemPolicy</code> action.
 * </p>
 */
public class DeleteFileSystemPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the EFS file system for which to delete the
     * <code>FileSystemPolicy</code>.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * Specifies the EFS file system for which to delete the
     * <code>FileSystemPolicy</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the EFS file system for which to delete the
     *         <code>FileSystemPolicy</code>.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * Specifies the EFS file system for which to delete the
     * <code>FileSystemPolicy</code>.
     * </p>
     *
     * @param fileSystemId <p>
     *            Specifies the EFS file system for which to delete the
     *            <code>FileSystemPolicy</code>.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * Specifies the EFS file system for which to delete the
     * <code>FileSystemPolicy</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            Specifies the EFS file system for which to delete the
     *            <code>FileSystemPolicy</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileSystemPolicyRequest withFileSystemId(String fileSystemId) {
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

        if (obj instanceof DeleteFileSystemPolicyRequest == false)
            return false;
        DeleteFileSystemPolicyRequest other = (DeleteFileSystemPolicyRequest) obj;

        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        return true;
    }
}
