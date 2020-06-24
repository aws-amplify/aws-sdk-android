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

public class CreateCommitResult implements Serializable {
    /**
     * <p>
     * The full commit ID of the commit that contains your committed file
     * changes.
     * </p>
     */
    private String commitId;

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that
     * contains the commited file changes.
     * </p>
     */
    private String treeId;

    /**
     * <p>
     * The files added as part of the committed file changes.
     * </p>
     */
    private java.util.List<FileMetadata> filesAdded;

    /**
     * <p>
     * The files updated as part of the commited file changes.
     * </p>
     */
    private java.util.List<FileMetadata> filesUpdated;

    /**
     * <p>
     * The files deleted as part of the committed file changes.
     * </p>
     */
    private java.util.List<FileMetadata> filesDeleted;

    /**
     * <p>
     * The full commit ID of the commit that contains your committed file
     * changes.
     * </p>
     *
     * @return <p>
     *         The full commit ID of the commit that contains your committed
     *         file changes.
     *         </p>
     */
    public String getCommitId() {
        return commitId;
    }

    /**
     * <p>
     * The full commit ID of the commit that contains your committed file
     * changes.
     * </p>
     *
     * @param commitId <p>
     *            The full commit ID of the commit that contains your committed
     *            file changes.
     *            </p>
     */
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The full commit ID of the commit that contains your committed file
     * changes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitId <p>
     *            The full commit ID of the commit that contains your committed
     *            file changes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitResult withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that
     * contains the commited file changes.
     * </p>
     *
     * @return <p>
     *         The full SHA-1 pointer of the tree information for the commit
     *         that contains the commited file changes.
     *         </p>
     */
    public String getTreeId() {
        return treeId;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that
     * contains the commited file changes.
     * </p>
     *
     * @param treeId <p>
     *            The full SHA-1 pointer of the tree information for the commit
     *            that contains the commited file changes.
     *            </p>
     */
    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that
     * contains the commited file changes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param treeId <p>
     *            The full SHA-1 pointer of the tree information for the commit
     *            that contains the commited file changes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitResult withTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }

    /**
     * <p>
     * The files added as part of the committed file changes.
     * </p>
     *
     * @return <p>
     *         The files added as part of the committed file changes.
     *         </p>
     */
    public java.util.List<FileMetadata> getFilesAdded() {
        return filesAdded;
    }

    /**
     * <p>
     * The files added as part of the committed file changes.
     * </p>
     *
     * @param filesAdded <p>
     *            The files added as part of the committed file changes.
     *            </p>
     */
    public void setFilesAdded(java.util.Collection<FileMetadata> filesAdded) {
        if (filesAdded == null) {
            this.filesAdded = null;
            return;
        }

        this.filesAdded = new java.util.ArrayList<FileMetadata>(filesAdded);
    }

    /**
     * <p>
     * The files added as part of the committed file changes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filesAdded <p>
     *            The files added as part of the committed file changes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitResult withFilesAdded(FileMetadata... filesAdded) {
        if (getFilesAdded() == null) {
            this.filesAdded = new java.util.ArrayList<FileMetadata>(filesAdded.length);
        }
        for (FileMetadata value : filesAdded) {
            this.filesAdded.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The files added as part of the committed file changes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filesAdded <p>
     *            The files added as part of the committed file changes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitResult withFilesAdded(java.util.Collection<FileMetadata> filesAdded) {
        setFilesAdded(filesAdded);
        return this;
    }

    /**
     * <p>
     * The files updated as part of the commited file changes.
     * </p>
     *
     * @return <p>
     *         The files updated as part of the commited file changes.
     *         </p>
     */
    public java.util.List<FileMetadata> getFilesUpdated() {
        return filesUpdated;
    }

    /**
     * <p>
     * The files updated as part of the commited file changes.
     * </p>
     *
     * @param filesUpdated <p>
     *            The files updated as part of the commited file changes.
     *            </p>
     */
    public void setFilesUpdated(java.util.Collection<FileMetadata> filesUpdated) {
        if (filesUpdated == null) {
            this.filesUpdated = null;
            return;
        }

        this.filesUpdated = new java.util.ArrayList<FileMetadata>(filesUpdated);
    }

    /**
     * <p>
     * The files updated as part of the commited file changes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filesUpdated <p>
     *            The files updated as part of the commited file changes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitResult withFilesUpdated(FileMetadata... filesUpdated) {
        if (getFilesUpdated() == null) {
            this.filesUpdated = new java.util.ArrayList<FileMetadata>(filesUpdated.length);
        }
        for (FileMetadata value : filesUpdated) {
            this.filesUpdated.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The files updated as part of the commited file changes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filesUpdated <p>
     *            The files updated as part of the commited file changes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitResult withFilesUpdated(java.util.Collection<FileMetadata> filesUpdated) {
        setFilesUpdated(filesUpdated);
        return this;
    }

    /**
     * <p>
     * The files deleted as part of the committed file changes.
     * </p>
     *
     * @return <p>
     *         The files deleted as part of the committed file changes.
     *         </p>
     */
    public java.util.List<FileMetadata> getFilesDeleted() {
        return filesDeleted;
    }

    /**
     * <p>
     * The files deleted as part of the committed file changes.
     * </p>
     *
     * @param filesDeleted <p>
     *            The files deleted as part of the committed file changes.
     *            </p>
     */
    public void setFilesDeleted(java.util.Collection<FileMetadata> filesDeleted) {
        if (filesDeleted == null) {
            this.filesDeleted = null;
            return;
        }

        this.filesDeleted = new java.util.ArrayList<FileMetadata>(filesDeleted);
    }

    /**
     * <p>
     * The files deleted as part of the committed file changes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filesDeleted <p>
     *            The files deleted as part of the committed file changes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitResult withFilesDeleted(FileMetadata... filesDeleted) {
        if (getFilesDeleted() == null) {
            this.filesDeleted = new java.util.ArrayList<FileMetadata>(filesDeleted.length);
        }
        for (FileMetadata value : filesDeleted) {
            this.filesDeleted.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The files deleted as part of the committed file changes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filesDeleted <p>
     *            The files deleted as part of the committed file changes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitResult withFilesDeleted(java.util.Collection<FileMetadata> filesDeleted) {
        setFilesDeleted(filesDeleted);
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
        if (getTreeId() != null)
            sb.append("treeId: " + getTreeId() + ",");
        if (getFilesAdded() != null)
            sb.append("filesAdded: " + getFilesAdded() + ",");
        if (getFilesUpdated() != null)
            sb.append("filesUpdated: " + getFilesUpdated() + ",");
        if (getFilesDeleted() != null)
            sb.append("filesDeleted: " + getFilesDeleted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getTreeId() == null) ? 0 : getTreeId().hashCode());
        hashCode = prime * hashCode + ((getFilesAdded() == null) ? 0 : getFilesAdded().hashCode());
        hashCode = prime * hashCode
                + ((getFilesUpdated() == null) ? 0 : getFilesUpdated().hashCode());
        hashCode = prime * hashCode
                + ((getFilesDeleted() == null) ? 0 : getFilesDeleted().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCommitResult == false)
            return false;
        CreateCommitResult other = (CreateCommitResult) obj;

        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getTreeId() == null ^ this.getTreeId() == null)
            return false;
        if (other.getTreeId() != null && other.getTreeId().equals(this.getTreeId()) == false)
            return false;
        if (other.getFilesAdded() == null ^ this.getFilesAdded() == null)
            return false;
        if (other.getFilesAdded() != null
                && other.getFilesAdded().equals(this.getFilesAdded()) == false)
            return false;
        if (other.getFilesUpdated() == null ^ this.getFilesUpdated() == null)
            return false;
        if (other.getFilesUpdated() != null
                && other.getFilesUpdated().equals(this.getFilesUpdated()) == false)
            return false;
        if (other.getFilesDeleted() == null ^ this.getFilesDeleted() == null)
            return false;
        if (other.getFilesDeleted() != null
                && other.getFilesDeleted().equals(this.getFilesDeleted()) == false)
            return false;
        return true;
    }
}
