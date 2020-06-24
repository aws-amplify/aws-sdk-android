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
 * Represents the output of a batch get repositories operation.
 * </p>
 */
public class BatchGetRepositoriesResult implements Serializable {
    /**
     * <p>
     * A list of repositories returned by the batch get repositories operation.
     * </p>
     */
    private java.util.List<RepositoryMetadata> repositories;

    /**
     * <p>
     * Returns a list of repository names for which information could not be
     * found.
     * </p>
     */
    private java.util.List<String> repositoriesNotFound;

    /**
     * <p>
     * A list of repositories returned by the batch get repositories operation.
     * </p>
     *
     * @return <p>
     *         A list of repositories returned by the batch get repositories
     *         operation.
     *         </p>
     */
    public java.util.List<RepositoryMetadata> getRepositories() {
        return repositories;
    }

    /**
     * <p>
     * A list of repositories returned by the batch get repositories operation.
     * </p>
     *
     * @param repositories <p>
     *            A list of repositories returned by the batch get repositories
     *            operation.
     *            </p>
     */
    public void setRepositories(java.util.Collection<RepositoryMetadata> repositories) {
        if (repositories == null) {
            this.repositories = null;
            return;
        }

        this.repositories = new java.util.ArrayList<RepositoryMetadata>(repositories);
    }

    /**
     * <p>
     * A list of repositories returned by the batch get repositories operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositories <p>
     *            A list of repositories returned by the batch get repositories
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetRepositoriesResult withRepositories(RepositoryMetadata... repositories) {
        if (getRepositories() == null) {
            this.repositories = new java.util.ArrayList<RepositoryMetadata>(repositories.length);
        }
        for (RepositoryMetadata value : repositories) {
            this.repositories.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of repositories returned by the batch get repositories operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositories <p>
     *            A list of repositories returned by the batch get repositories
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetRepositoriesResult withRepositories(
            java.util.Collection<RepositoryMetadata> repositories) {
        setRepositories(repositories);
        return this;
    }

    /**
     * <p>
     * Returns a list of repository names for which information could not be
     * found.
     * </p>
     *
     * @return <p>
     *         Returns a list of repository names for which information could
     *         not be found.
     *         </p>
     */
    public java.util.List<String> getRepositoriesNotFound() {
        return repositoriesNotFound;
    }

    /**
     * <p>
     * Returns a list of repository names for which information could not be
     * found.
     * </p>
     *
     * @param repositoriesNotFound <p>
     *            Returns a list of repository names for which information could
     *            not be found.
     *            </p>
     */
    public void setRepositoriesNotFound(java.util.Collection<String> repositoriesNotFound) {
        if (repositoriesNotFound == null) {
            this.repositoriesNotFound = null;
            return;
        }

        this.repositoriesNotFound = new java.util.ArrayList<String>(repositoriesNotFound);
    }

    /**
     * <p>
     * Returns a list of repository names for which information could not be
     * found.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositoriesNotFound <p>
     *            Returns a list of repository names for which information could
     *            not be found.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetRepositoriesResult withRepositoriesNotFound(String... repositoriesNotFound) {
        if (getRepositoriesNotFound() == null) {
            this.repositoriesNotFound = new java.util.ArrayList<String>(repositoriesNotFound.length);
        }
        for (String value : repositoriesNotFound) {
            this.repositoriesNotFound.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of repository names for which information could not be
     * found.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositoriesNotFound <p>
     *            Returns a list of repository names for which information could
     *            not be found.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetRepositoriesResult withRepositoriesNotFound(
            java.util.Collection<String> repositoriesNotFound) {
        setRepositoriesNotFound(repositoriesNotFound);
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
        if (getRepositories() != null)
            sb.append("repositories: " + getRepositories() + ",");
        if (getRepositoriesNotFound() != null)
            sb.append("repositoriesNotFound: " + getRepositoriesNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRepositories() == null) ? 0 : getRepositories().hashCode());
        hashCode = prime * hashCode
                + ((getRepositoriesNotFound() == null) ? 0 : getRepositoriesNotFound().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetRepositoriesResult == false)
            return false;
        BatchGetRepositoriesResult other = (BatchGetRepositoriesResult) obj;

        if (other.getRepositories() == null ^ this.getRepositories() == null)
            return false;
        if (other.getRepositories() != null
                && other.getRepositories().equals(this.getRepositories()) == false)
            return false;
        if (other.getRepositoriesNotFound() == null ^ this.getRepositoriesNotFound() == null)
            return false;
        if (other.getRepositoriesNotFound() != null
                && other.getRepositoriesNotFound().equals(this.getRepositoriesNotFound()) == false)
            return false;
        return true;
    }
}
