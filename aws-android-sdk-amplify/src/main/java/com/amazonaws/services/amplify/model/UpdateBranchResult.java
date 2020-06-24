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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * The result structure for the update branch request.
 * </p>
 */
public class UpdateBranchResult implements Serializable {
    /**
     * <p>
     * The branch for an Amplify app, which maps to a third-party repository
     * branch.
     * </p>
     */
    private Branch branch;

    /**
     * <p>
     * The branch for an Amplify app, which maps to a third-party repository
     * branch.
     * </p>
     *
     * @return <p>
     *         The branch for an Amplify app, which maps to a third-party
     *         repository branch.
     *         </p>
     */
    public Branch getBranch() {
        return branch;
    }

    /**
     * <p>
     * The branch for an Amplify app, which maps to a third-party repository
     * branch.
     * </p>
     *
     * @param branch <p>
     *            The branch for an Amplify app, which maps to a third-party
     *            repository branch.
     *            </p>
     */
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    /**
     * <p>
     * The branch for an Amplify app, which maps to a third-party repository
     * branch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param branch <p>
     *            The branch for an Amplify app, which maps to a third-party
     *            repository branch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBranchResult withBranch(Branch branch) {
        this.branch = branch;
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
        if (getBranch() != null)
            sb.append("branch: " + getBranch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranch() == null) ? 0 : getBranch().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBranchResult == false)
            return false;
        UpdateBranchResult other = (UpdateBranchResult) obj;

        if (other.getBranch() == null ^ this.getBranch() == null)
            return false;
        if (other.getBranch() != null && other.getBranch().equals(this.getBranch()) == false)
            return false;
        return true;
    }
}
