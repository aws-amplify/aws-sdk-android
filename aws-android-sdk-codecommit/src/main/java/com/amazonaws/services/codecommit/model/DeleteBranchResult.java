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
 * Represents the output of a delete branch operation.
 * </p>
 */
public class DeleteBranchResult implements Serializable {
    /**
     * <p>
     * Information about the branch deleted by the operation, including the
     * branch name and the commit ID that was the tip of the branch.
     * </p>
     */
    private BranchInfo deletedBranch;

    /**
     * <p>
     * Information about the branch deleted by the operation, including the
     * branch name and the commit ID that was the tip of the branch.
     * </p>
     *
     * @return <p>
     *         Information about the branch deleted by the operation, including
     *         the branch name and the commit ID that was the tip of the branch.
     *         </p>
     */
    public BranchInfo getDeletedBranch() {
        return deletedBranch;
    }

    /**
     * <p>
     * Information about the branch deleted by the operation, including the
     * branch name and the commit ID that was the tip of the branch.
     * </p>
     *
     * @param deletedBranch <p>
     *            Information about the branch deleted by the operation,
     *            including the branch name and the commit ID that was the tip
     *            of the branch.
     *            </p>
     */
    public void setDeletedBranch(BranchInfo deletedBranch) {
        this.deletedBranch = deletedBranch;
    }

    /**
     * <p>
     * Information about the branch deleted by the operation, including the
     * branch name and the commit ID that was the tip of the branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletedBranch <p>
     *            Information about the branch deleted by the operation,
     *            including the branch name and the commit ID that was the tip
     *            of the branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteBranchResult withDeletedBranch(BranchInfo deletedBranch) {
        this.deletedBranch = deletedBranch;
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
        if (getDeletedBranch() != null)
            sb.append("deletedBranch: " + getDeletedBranch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeletedBranch() == null) ? 0 : getDeletedBranch().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBranchResult == false)
            return false;
        DeleteBranchResult other = (DeleteBranchResult) obj;

        if (other.getDeletedBranch() == null ^ this.getDeletedBranch() == null)
            return false;
        if (other.getDeletedBranch() != null
                && other.getDeletedBranch().equals(this.getDeletedBranch()) == false)
            return false;
        return true;
    }
}
