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

public class DeleteFileResult implements Serializable {
    /**
     * <p>
     * The full commit ID of the commit that contains the change that deletes
     * the file.
     * </p>
     */
    private String commitId;

    /**
     * <p>
     * The blob ID removed from the tree as part of deleting the file.
     * </p>
     */
    private String blobId;

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that
     * contains the delete file change.
     * </p>
     */
    private String treeId;

    /**
     * <p>
     * The fully qualified path to the file to be deleted, including the full
     * name and extension of that file.
     * </p>
     */
    private String filePath;

    /**
     * <p>
     * The full commit ID of the commit that contains the change that deletes
     * the file.
     * </p>
     *
     * @return <p>
     *         The full commit ID of the commit that contains the change that
     *         deletes the file.
     *         </p>
     */
    public String getCommitId() {
        return commitId;
    }

    /**
     * <p>
     * The full commit ID of the commit that contains the change that deletes
     * the file.
     * </p>
     *
     * @param commitId <p>
     *            The full commit ID of the commit that contains the change that
     *            deletes the file.
     *            </p>
     */
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The full commit ID of the commit that contains the change that deletes
     * the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitId <p>
     *            The full commit ID of the commit that contains the change that
     *            deletes the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileResult withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * <p>
     * The blob ID removed from the tree as part of deleting the file.
     * </p>
     *
     * @return <p>
     *         The blob ID removed from the tree as part of deleting the file.
     *         </p>
     */
    public String getBlobId() {
        return blobId;
    }

    /**
     * <p>
     * The blob ID removed from the tree as part of deleting the file.
     * </p>
     *
     * @param blobId <p>
     *            The blob ID removed from the tree as part of deleting the
     *            file.
     *            </p>
     */
    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    /**
     * <p>
     * The blob ID removed from the tree as part of deleting the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blobId <p>
     *            The blob ID removed from the tree as part of deleting the
     *            file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileResult withBlobId(String blobId) {
        this.blobId = blobId;
        return this;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that
     * contains the delete file change.
     * </p>
     *
     * @return <p>
     *         The full SHA-1 pointer of the tree information for the commit
     *         that contains the delete file change.
     *         </p>
     */
    public String getTreeId() {
        return treeId;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that
     * contains the delete file change.
     * </p>
     *
     * @param treeId <p>
     *            The full SHA-1 pointer of the tree information for the commit
     *            that contains the delete file change.
     *            </p>
     */
    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that
     * contains the delete file change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param treeId <p>
     *            The full SHA-1 pointer of the tree information for the commit
     *            that contains the delete file change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileResult withTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }

    /**
     * <p>
     * The fully qualified path to the file to be deleted, including the full
     * name and extension of that file.
     * </p>
     *
     * @return <p>
     *         The fully qualified path to the file to be deleted, including the
     *         full name and extension of that file.
     *         </p>
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * <p>
     * The fully qualified path to the file to be deleted, including the full
     * name and extension of that file.
     * </p>
     *
     * @param filePath <p>
     *            The fully qualified path to the file to be deleted, including
     *            the full name and extension of that file.
     *            </p>
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The fully qualified path to the file to be deleted, including the full
     * name and extension of that file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filePath <p>
     *            The fully qualified path to the file to be deleted, including
     *            the full name and extension of that file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileResult withFilePath(String filePath) {
        this.filePath = filePath;
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
        if (getCommitId() != null)
            sb.append("commitId: " + getCommitId() + ",");
        if (getBlobId() != null)
            sb.append("blobId: " + getBlobId() + ",");
        if (getTreeId() != null)
            sb.append("treeId: " + getTreeId() + ",");
        if (getFilePath() != null)
            sb.append("filePath: " + getFilePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getBlobId() == null) ? 0 : getBlobId().hashCode());
        hashCode = prime * hashCode + ((getTreeId() == null) ? 0 : getTreeId().hashCode());
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFileResult == false)
            return false;
        DeleteFileResult other = (DeleteFileResult) obj;

        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getBlobId() == null ^ this.getBlobId() == null)
            return false;
        if (other.getBlobId() != null && other.getBlobId().equals(this.getBlobId()) == false)
            return false;
        if (other.getTreeId() == null ^ this.getTreeId() == null)
            return false;
        if (other.getTreeId() != null && other.getTreeId().equals(this.getTreeId()) == false)
            return false;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        return true;
    }
}
