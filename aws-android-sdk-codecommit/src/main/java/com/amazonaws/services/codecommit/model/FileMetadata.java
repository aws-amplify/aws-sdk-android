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
 * A file to be added, updated, or deleted as part of a commit.
 * </p>
 */
public class FileMetadata implements Serializable {
    /**
     * <p>
     * The full path to the file to be added or updated, including the name of
     * the file.
     * </p>
     */
    private String absolutePath;

    /**
     * <p>
     * The blob ID that contains the file information.
     * </p>
     */
    private String blobId;

    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include
     * EXECUTABLE and NORMAL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     */
    private String fileMode;

    /**
     * <p>
     * The full path to the file to be added or updated, including the name of
     * the file.
     * </p>
     *
     * @return <p>
     *         The full path to the file to be added or updated, including the
     *         name of the file.
     *         </p>
     */
    public String getAbsolutePath() {
        return absolutePath;
    }

    /**
     * <p>
     * The full path to the file to be added or updated, including the name of
     * the file.
     * </p>
     *
     * @param absolutePath <p>
     *            The full path to the file to be added or updated, including
     *            the name of the file.
     *            </p>
     */
    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    /**
     * <p>
     * The full path to the file to be added or updated, including the name of
     * the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param absolutePath <p>
     *            The full path to the file to be added or updated, including
     *            the name of the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileMetadata withAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
        return this;
    }

    /**
     * <p>
     * The blob ID that contains the file information.
     * </p>
     *
     * @return <p>
     *         The blob ID that contains the file information.
     *         </p>
     */
    public String getBlobId() {
        return blobId;
    }

    /**
     * <p>
     * The blob ID that contains the file information.
     * </p>
     *
     * @param blobId <p>
     *            The blob ID that contains the file information.
     *            </p>
     */
    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    /**
     * <p>
     * The blob ID that contains the file information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blobId <p>
     *            The blob ID that contains the file information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileMetadata withBlobId(String blobId) {
        this.blobId = blobId;
        return this;
    }

    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include
     * EXECUTABLE and NORMAL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @return <p>
     *         The extrapolated file mode permissions for the file. Valid values
     *         include EXECUTABLE and NORMAL.
     *         </p>
     * @see FileModeTypeEnum
     */
    public String getFileMode() {
        return fileMode;
    }

    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include
     * EXECUTABLE and NORMAL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The extrapolated file mode permissions for the file. Valid
     *            values include EXECUTABLE and NORMAL.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setFileMode(String fileMode) {
        this.fileMode = fileMode;
    }

    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include
     * EXECUTABLE and NORMAL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The extrapolated file mode permissions for the file. Valid
     *            values include EXECUTABLE and NORMAL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public FileMetadata withFileMode(String fileMode) {
        this.fileMode = fileMode;
        return this;
    }

    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include
     * EXECUTABLE and NORMAL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The extrapolated file mode permissions for the file. Valid
     *            values include EXECUTABLE and NORMAL.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
    }

    /**
     * <p>
     * The extrapolated file mode permissions for the file. Valid values include
     * EXECUTABLE and NORMAL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The extrapolated file mode permissions for the file. Valid
     *            values include EXECUTABLE and NORMAL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public FileMetadata withFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
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
        if (getAbsolutePath() != null)
            sb.append("absolutePath: " + getAbsolutePath() + ",");
        if (getBlobId() != null)
            sb.append("blobId: " + getBlobId() + ",");
        if (getFileMode() != null)
            sb.append("fileMode: " + getFileMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAbsolutePath() == null) ? 0 : getAbsolutePath().hashCode());
        hashCode = prime * hashCode + ((getBlobId() == null) ? 0 : getBlobId().hashCode());
        hashCode = prime * hashCode + ((getFileMode() == null) ? 0 : getFileMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileMetadata == false)
            return false;
        FileMetadata other = (FileMetadata) obj;

        if (other.getAbsolutePath() == null ^ this.getAbsolutePath() == null)
            return false;
        if (other.getAbsolutePath() != null
                && other.getAbsolutePath().equals(this.getAbsolutePath()) == false)
            return false;
        if (other.getBlobId() == null ^ this.getBlobId() == null)
            return false;
        if (other.getBlobId() != null && other.getBlobId().equals(this.getBlobId()) == false)
            return false;
        if (other.getFileMode() == null ^ this.getFileMode() == null)
            return false;
        if (other.getFileMode() != null && other.getFileMode().equals(this.getFileMode()) == false)
            return false;
        return true;
    }
}
