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
 * Returns information about a symbolic link in a repository folder.
 * </p>
 */
public class SymbolicLink implements Serializable {
    /**
     * <p>
     * The blob ID that contains the information about the symbolic link.
     * </p>
     */
    private String blobId;

    /**
     * <p>
     * The fully qualified path to the folder that contains the symbolic link.
     * </p>
     */
    private String absolutePath;

    /**
     * <p>
     * The relative path of the symbolic link from the folder where the query
     * originated.
     * </p>
     */
    private String relativePath;

    /**
     * <p>
     * The file mode permissions of the blob that cotains information about the
     * symbolic link.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     */
    private String fileMode;

    /**
     * <p>
     * The blob ID that contains the information about the symbolic link.
     * </p>
     *
     * @return <p>
     *         The blob ID that contains the information about the symbolic
     *         link.
     *         </p>
     */
    public String getBlobId() {
        return blobId;
    }

    /**
     * <p>
     * The blob ID that contains the information about the symbolic link.
     * </p>
     *
     * @param blobId <p>
     *            The blob ID that contains the information about the symbolic
     *            link.
     *            </p>
     */
    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    /**
     * <p>
     * The blob ID that contains the information about the symbolic link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blobId <p>
     *            The blob ID that contains the information about the symbolic
     *            link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SymbolicLink withBlobId(String blobId) {
        this.blobId = blobId;
        return this;
    }

    /**
     * <p>
     * The fully qualified path to the folder that contains the symbolic link.
     * </p>
     *
     * @return <p>
     *         The fully qualified path to the folder that contains the symbolic
     *         link.
     *         </p>
     */
    public String getAbsolutePath() {
        return absolutePath;
    }

    /**
     * <p>
     * The fully qualified path to the folder that contains the symbolic link.
     * </p>
     *
     * @param absolutePath <p>
     *            The fully qualified path to the folder that contains the
     *            symbolic link.
     *            </p>
     */
    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    /**
     * <p>
     * The fully qualified path to the folder that contains the symbolic link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param absolutePath <p>
     *            The fully qualified path to the folder that contains the
     *            symbolic link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SymbolicLink withAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
        return this;
    }

    /**
     * <p>
     * The relative path of the symbolic link from the folder where the query
     * originated.
     * </p>
     *
     * @return <p>
     *         The relative path of the symbolic link from the folder where the
     *         query originated.
     *         </p>
     */
    public String getRelativePath() {
        return relativePath;
    }

    /**
     * <p>
     * The relative path of the symbolic link from the folder where the query
     * originated.
     * </p>
     *
     * @param relativePath <p>
     *            The relative path of the symbolic link from the folder where
     *            the query originated.
     *            </p>
     */
    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    /**
     * <p>
     * The relative path of the symbolic link from the folder where the query
     * originated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relativePath <p>
     *            The relative path of the symbolic link from the folder where
     *            the query originated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SymbolicLink withRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }

    /**
     * <p>
     * The file mode permissions of the blob that cotains information about the
     * symbolic link.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @return <p>
     *         The file mode permissions of the blob that cotains information
     *         about the symbolic link.
     *         </p>
     * @see FileModeTypeEnum
     */
    public String getFileMode() {
        return fileMode;
    }

    /**
     * <p>
     * The file mode permissions of the blob that cotains information about the
     * symbolic link.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The file mode permissions of the blob that cotains information
     *            about the symbolic link.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setFileMode(String fileMode) {
        this.fileMode = fileMode;
    }

    /**
     * <p>
     * The file mode permissions of the blob that cotains information about the
     * symbolic link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The file mode permissions of the blob that cotains information
     *            about the symbolic link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public SymbolicLink withFileMode(String fileMode) {
        this.fileMode = fileMode;
        return this;
    }

    /**
     * <p>
     * The file mode permissions of the blob that cotains information about the
     * symbolic link.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The file mode permissions of the blob that cotains information
     *            about the symbolic link.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
    }

    /**
     * <p>
     * The file mode permissions of the blob that cotains information about the
     * symbolic link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The file mode permissions of the blob that cotains information
     *            about the symbolic link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public SymbolicLink withFileMode(FileModeTypeEnum fileMode) {
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
        if (getBlobId() != null)
            sb.append("blobId: " + getBlobId() + ",");
        if (getAbsolutePath() != null)
            sb.append("absolutePath: " + getAbsolutePath() + ",");
        if (getRelativePath() != null)
            sb.append("relativePath: " + getRelativePath() + ",");
        if (getFileMode() != null)
            sb.append("fileMode: " + getFileMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlobId() == null) ? 0 : getBlobId().hashCode());
        hashCode = prime * hashCode
                + ((getAbsolutePath() == null) ? 0 : getAbsolutePath().hashCode());
        hashCode = prime * hashCode
                + ((getRelativePath() == null) ? 0 : getRelativePath().hashCode());
        hashCode = prime * hashCode + ((getFileMode() == null) ? 0 : getFileMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SymbolicLink == false)
            return false;
        SymbolicLink other = (SymbolicLink) obj;

        if (other.getBlobId() == null ^ this.getBlobId() == null)
            return false;
        if (other.getBlobId() != null && other.getBlobId().equals(this.getBlobId()) == false)
            return false;
        if (other.getAbsolutePath() == null ^ this.getAbsolutePath() == null)
            return false;
        if (other.getAbsolutePath() != null
                && other.getAbsolutePath().equals(this.getAbsolutePath()) == false)
            return false;
        if (other.getRelativePath() == null ^ this.getRelativePath() == null)
            return false;
        if (other.getRelativePath() != null
                && other.getRelativePath().equals(this.getRelativePath()) == false)
            return false;
        if (other.getFileMode() == null ^ this.getFileMode() == null)
            return false;
        if (other.getFileMode() != null && other.getFileMode().equals(this.getFileMode()) == false)
            return false;
        return true;
    }
}
