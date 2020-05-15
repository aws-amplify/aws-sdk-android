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

package com.amazonaws.services.api.ecr.model;

import java.io.Serializable;

public class CreateRepositoryResult implements Serializable {
    /**
     * <p>
     * The repository that was created.
     * </p>
     */
    private Repository repository;

    /**
     * <p>
     * The repository that was created.
     * </p>
     *
     * @return <p>
     *         The repository that was created.
     *         </p>
     */
    public Repository getRepository() {
        return repository;
    }

    /**
     * <p>
     * The repository that was created.
     * </p>
     *
     * @param repository <p>
     *            The repository that was created.
     *            </p>
     */
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The repository that was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repository <p>
     *            The repository that was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRepositoryResult withRepository(Repository repository) {
        this.repository = repository;
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
        if (getRepository() != null)
            sb.append("repository: " + getRepository());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRepositoryResult == false)
            return false;
        CreateRepositoryResult other = (CreateRepositoryResult) obj;

        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null
                && other.getRepository().equals(this.getRepository()) == false)
            return false;
        return true;
    }
}
