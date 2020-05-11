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
package com.amazonaws.services.codeguru-reviewer.model;

import java.io.Serializable;


/**
 * <p> Information about the source code type. </p>
 */
public class SourceCodeType implements Serializable {
    /**
     * <p> The commit diff for the pull request. </p>
     */
    private CommitDiffSourceCodeType commitDiff;

    /**
     * <p> The commit diff for the pull request. </p>
     *
     * @return <p> The commit diff for the pull request. </p>
     */
    public CommitDiffSourceCodeType getCommitDiff() {
        return commitDiff;
    }

    /**
     * <p> The commit diff for the pull request. </p>
     *
     * @param commitDiff <p> The commit diff for the pull request. </p>
     */
    public void setCommitDiff(CommitDiffSourceCodeType commitDiff) {
        this.commitDiff = commitDiff;
    }

    /**
     * <p> The commit diff for the pull request. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param commitDiff <p> The commit diff for the pull request. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SourceCodeType withCommitDiff(CommitDiffSourceCodeType commitDiff) {
        this.commitDiff = commitDiff;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCommitDiff() != null) sb.append("CommitDiff: " + getCommitDiff());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitDiff() == null) ? 0 : getCommitDiff().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SourceCodeType == false) return false;
        SourceCodeType other = (SourceCodeType)obj;

        if (other.getCommitDiff() == null ^ this.getCommitDiff() == null) return false;
        if (other.getCommitDiff() != null && other.getCommitDiff().equals(this.getCommitDiff()) == false) return false;
        return true;
    }
}
