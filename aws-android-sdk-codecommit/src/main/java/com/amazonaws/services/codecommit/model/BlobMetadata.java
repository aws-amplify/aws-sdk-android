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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Returns information about a specific Git blob object.
 * </p>
 */
public class BlobMetadata implements Serializable {
    /**
     * <p>
     * The full ID of the blob.
     * </p>
     */
    private String blobId;

    /**
     * <p>
     * The path to the blob and associated file name, if any.
     * </p>
     */
    private String path;

    /**
     * <p>
     * The file mode permissions of the blob. File mode permission codes
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>100644</code> indicates read/write
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>100755</code> indicates read/write/execute
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>160000</code> indicates a submodule
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>120000</code> indicates a symlink
     * </p>
     * </li>
     * </ul>
     */
    private String mode;

    /**
     * <p>
     * The full ID of the blob.
     * </p>
     *
     * @return <p>
     *         The full ID of the blob.
     *         </p>
     */
    public String getBlobId() {
        return blobId;
    }

    /**
     * <p>
     * The full ID of the blob.
     * </p>
     *
     * @param blobId <p>
     *            The full ID of the blob.
     *            </p>
     */
    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    /**
     * <p>
     * The full ID of the blob.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blobId <p>
     *            The full ID of the blob.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlobMetadata withBlobId(String blobId) {
        this.blobId = blobId;
        return this;
    }

    /**
     * <p>
     * The path to the blob and associated file name, if any.
     * </p>
     *
     * @return <p>
     *         The path to the blob and associated file name, if any.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The path to the blob and associated file name, if any.
     * </p>
     *
     * @param path <p>
     *            The path to the blob and associated file name, if any.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the blob and associated file name, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param path <p>
     *            The path to the blob and associated file name, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlobMetadata withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The file mode permissions of the blob. File mode permission codes
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>100644</code> indicates read/write
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>100755</code> indicates read/write/execute
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>160000</code> indicates a submodule
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>120000</code> indicates a symlink
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The file mode permissions of the blob. File mode permission codes
     *         include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>100644</code> indicates read/write
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>100755</code> indicates read/write/execute
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>160000</code> indicates a submodule
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>120000</code> indicates a symlink
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * The file mode permissions of the blob. File mode permission codes
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>100644</code> indicates read/write
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>100755</code> indicates read/write/execute
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>160000</code> indicates a submodule
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>120000</code> indicates a symlink
     * </p>
     * </li>
     * </ul>
     *
     * @param mode <p>
     *            The file mode permissions of the blob. File mode permission
     *            codes include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>100644</code> indicates read/write
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>100755</code> indicates read/write/execute
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>160000</code> indicates a submodule
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>120000</code> indicates a symlink
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The file mode permissions of the blob. File mode permission codes
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>100644</code> indicates read/write
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>100755</code> indicates read/write/execute
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>160000</code> indicates a submodule
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>120000</code> indicates a symlink
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mode <p>
     *            The file mode permissions of the blob. File mode permission
     *            codes include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>100644</code> indicates read/write
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>100755</code> indicates read/write/execute
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>160000</code> indicates a submodule
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>120000</code> indicates a symlink
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlobMetadata withMode(String mode) {
        this.mode = mode;
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
        if (getBlobId() != null)
            sb.append("blobId: " + getBlobId() + ",");
        if (getPath() != null)
            sb.append("path: " + getPath() + ",");
        if (getMode() != null)
            sb.append("mode: " + getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlobId() == null) ? 0 : getBlobId().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlobMetadata == false)
            return false;
        BlobMetadata other = (BlobMetadata) obj;

        if (other.getBlobId() == null ^ this.getBlobId() == null)
            return false;
        if (other.getBlobId() != null && other.getBlobId().equals(this.getBlobId()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }
}
