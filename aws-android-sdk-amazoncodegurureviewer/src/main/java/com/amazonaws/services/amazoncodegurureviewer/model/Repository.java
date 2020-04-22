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

package com.amazonaws.services.amazoncodegurureviewer.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a repository.
 * </p>
 */
public class Repository implements Serializable {
    /**
     * <p>
     * Information about an AWS CodeCommit repository.
     * </p>
     */
    private CodeCommitRepository codeCommit;

    /**
     * <p>
     * Information about an AWS CodeCommit repository.
     * </p>
     *
     * @return <p>
     *         Information about an AWS CodeCommit repository.
     *         </p>
     */
    public CodeCommitRepository getCodeCommit() {
        return codeCommit;
    }

    /**
     * <p>
     * Information about an AWS CodeCommit repository.
     * </p>
     *
     * @param codeCommit <p>
     *            Information about an AWS CodeCommit repository.
     *            </p>
     */
    public void setCodeCommit(CodeCommitRepository codeCommit) {
        this.codeCommit = codeCommit;
    }

    /**
     * <p>
     * Information about an AWS CodeCommit repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codeCommit <p>
     *            Information about an AWS CodeCommit repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Repository withCodeCommit(CodeCommitRepository codeCommit) {
        this.codeCommit = codeCommit;
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
        if (getCodeCommit() != null)
            sb.append("CodeCommit: " + getCodeCommit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeCommit() == null) ? 0 : getCodeCommit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Repository == false)
            return false;
        Repository other = (Repository) obj;

        if (other.getCodeCommit() == null ^ this.getCodeCommit() == null)
            return false;
        if (other.getCodeCommit() != null
                && other.getCodeCommit().equals(this.getCodeCommit()) == false)
            return false;
        return true;
    }
}
