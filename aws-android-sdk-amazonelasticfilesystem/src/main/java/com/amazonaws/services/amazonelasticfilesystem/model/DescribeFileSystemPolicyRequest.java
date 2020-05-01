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
 * Returns the <code>FileSystemPolicy</code> for the specified EFS file system.
 * </p>
 * <p>
 * This operation requires permissions for the
 * <code>elasticfilesystem:DescribeFileSystemPolicy</code> action.
 * </p>
 */
public class DescribeFileSystemPolicyRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specifies which EFS file system to retrieve the
     * <code>FileSystemPolicy</code> for.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * Specifies which EFS file system to retrieve the
     * <code>FileSystemPolicy</code> for.
     * </p>
     *
     * @return <p>
     *         Specifies which EFS file system to retrieve the
     *         <code>FileSystemPolicy</code> for.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * Specifies which EFS file system to retrieve the
     * <code>FileSystemPolicy</code> for.
     * </p>
     *
     * @param fileSystemId <p>
     *            Specifies which EFS file system to retrieve the
     *            <code>FileSystemPolicy</code> for.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * Specifies which EFS file system to retrieve the
     * <code>FileSystemPolicy</code> for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            Specifies which EFS file system to retrieve the
     *            <code>FileSystemPolicy</code> for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFileSystemPolicyRequest withFileSystemId(String fileSystemId) {
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

        if (obj instanceof DescribeFileSystemPolicyRequest == false)
            return false;
        DescribeFileSystemPolicyRequest other = (DescribeFileSystemPolicyRequest) obj;

        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        return true;
    }
}
