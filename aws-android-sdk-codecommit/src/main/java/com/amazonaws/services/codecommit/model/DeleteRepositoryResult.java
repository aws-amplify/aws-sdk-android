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
 * Represents the output of a delete repository operation.
 * </p>
 */
public class DeleteRepositoryResult implements Serializable {
    /**
     * <p>
     * The ID of the repository that was deleted.
     * </p>
     */
    private String repositoryId;

    /**
     * <p>
     * The ID of the repository that was deleted.
     * </p>
     *
     * @return <p>
     *         The ID of the repository that was deleted.
     *         </p>
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    /**
     * <p>
     * The ID of the repository that was deleted.
     * </p>
     *
     * @param repositoryId <p>
     *            The ID of the repository that was deleted.
     *            </p>
     */
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    /**
     * <p>
     * The ID of the repository that was deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositoryId <p>
     *            The ID of the repository that was deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteRepositoryResult withRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
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
        if (getRepositoryId() != null)
            sb.append("repositoryId: " + getRepositoryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRepositoryId() == null) ? 0 : getRepositoryId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRepositoryResult == false)
            return false;
        DeleteRepositoryResult other = (DeleteRepositoryResult) obj;

        if (other.getRepositoryId() == null ^ this.getRepositoryId() == null)
            return false;
        if (other.getRepositoryId() != null
                && other.getRepositoryId().equals(this.getRepositoryId()) == false)
            return false;
        return true;
    }
}
