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

package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;

public class ListRepositoriesResult implements Serializable {
    /**
     * <p>
     * The returned list of <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * > <code>RepositorySummary</code> </a> objects.
     * </p>
     */
    private java.util.List<RepositorySummary> repositories;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>\S+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The returned list of <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * > <code>RepositorySummary</code> </a> objects.
     * </p>
     *
     * @return <p>
     *         The returned list of <a href=
     *         "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     *         > <code>RepositorySummary</code> </a> objects.
     *         </p>
     */
    public java.util.List<RepositorySummary> getRepositories() {
        return repositories;
    }

    /**
     * <p>
     * The returned list of <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * > <code>RepositorySummary</code> </a> objects.
     * </p>
     *
     * @param repositories <p>
     *            The returned list of <a href=
     *            "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     *            > <code>RepositorySummary</code> </a> objects.
     *            </p>
     */
    public void setRepositories(java.util.Collection<RepositorySummary> repositories) {
        if (repositories == null) {
            this.repositories = null;
            return;
        }

        this.repositories = new java.util.ArrayList<RepositorySummary>(repositories);
    }

    /**
     * <p>
     * The returned list of <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * > <code>RepositorySummary</code> </a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositories <p>
     *            The returned list of <a href=
     *            "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     *            > <code>RepositorySummary</code> </a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRepositoriesResult withRepositories(RepositorySummary... repositories) {
        if (getRepositories() == null) {
            this.repositories = new java.util.ArrayList<RepositorySummary>(repositories.length);
        }
        for (RepositorySummary value : repositories) {
            this.repositories.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The returned list of <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     * > <code>RepositorySummary</code> </a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositories <p>
     *            The returned list of <a href=
     *            "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_RepositorySummary.html"
     *            > <code>RepositorySummary</code> </a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRepositoriesResult withRepositories(
            java.util.Collection<RepositorySummary> repositories) {
        setRepositories(repositories);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRepositoriesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRepositories() == null) ? 0 : getRepositories().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRepositoriesResult == false)
            return false;
        ListRepositoriesResult other = (ListRepositoriesResult) obj;

        if (other.getRepositories() == null ^ this.getRepositories() == null)
            return false;
        if (other.getRepositories() != null
                && other.getRepositories().equals(this.getRepositories()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
