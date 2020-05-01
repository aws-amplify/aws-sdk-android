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
 * Returns the current <code>LifecycleConfiguration</code> object for the
 * specified Amazon EFS file system. EFS lifecycle management uses the
 * <code>LifecycleConfiguration</code> object to identify which files to move to
 * the EFS Infrequent Access (IA) storage class. For a file system without a
 * <code>LifecycleConfiguration</code> object, the call returns an empty array
 * in the response.
 * </p>
 * <p>
 * This operation requires permissions for the
 * <code>elasticfilesystem:DescribeLifecycleConfiguration</code> operation.
 * </p>
 */
public class DescribeLifecycleConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the file system whose <code>LifecycleConfiguration</code>
     * object you want to retrieve (String).
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * The ID of the file system whose <code>LifecycleConfiguration</code>
     * object you want to retrieve (String).
     * </p>
     *
     * @return <p>
     *         The ID of the file system whose
     *         <code>LifecycleConfiguration</code> object you want to retrieve
     *         (String).
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system whose <code>LifecycleConfiguration</code>
     * object you want to retrieve (String).
     * </p>
     *
     * @param fileSystemId <p>
     *            The ID of the file system whose
     *            <code>LifecycleConfiguration</code> object you want to
     *            retrieve (String).
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system whose <code>LifecycleConfiguration</code>
     * object you want to retrieve (String).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            The ID of the file system whose
     *            <code>LifecycleConfiguration</code> object you want to
     *            retrieve (String).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLifecycleConfigurationRequest withFileSystemId(String fileSystemId) {
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

        if (obj instanceof DescribeLifecycleConfigurationRequest == false)
            return false;
        DescribeLifecycleConfigurationRequest other = (DescribeLifecycleConfigurationRequest) obj;

        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        return true;
    }
}
