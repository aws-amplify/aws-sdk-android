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
 * Represents the output of a get commit operation.
 * </p>
 */
public class GetCommitResult implements Serializable {
    /**
     * <p>
     * A commit data type object that contains information about the specified
     * commit.
     * </p>
     */
    private Commit commit;

    /**
     * <p>
     * A commit data type object that contains information about the specified
     * commit.
     * </p>
     *
     * @return <p>
     *         A commit data type object that contains information about the
     *         specified commit.
     *         </p>
     */
    public Commit getCommit() {
        return commit;
    }

    /**
     * <p>
     * A commit data type object that contains information about the specified
     * commit.
     * </p>
     *
     * @param commit <p>
     *            A commit data type object that contains information about the
     *            specified commit.
     *            </p>
     */
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    /**
     * <p>
     * A commit data type object that contains information about the specified
     * commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commit <p>
     *            A commit data type object that contains information about the
     *            specified commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCommitResult withCommit(Commit commit) {
        this.commit = commit;
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
        if (getCommit() != null)
            sb.append("commit: " + getCommit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommit() == null) ? 0 : getCommit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCommitResult == false)
            return false;
        GetCommitResult other = (GetCommitResult) obj;

        if (other.getCommit() == null ^ this.getCommit() == null)
            return false;
        if (other.getCommit() != null && other.getCommit().equals(this.getCommit()) == false)
            return false;
        return true;
    }
}
