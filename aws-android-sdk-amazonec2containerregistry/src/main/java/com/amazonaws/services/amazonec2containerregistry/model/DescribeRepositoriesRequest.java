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

package com.amazonaws.services.amazonec2containerregistry.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes image repositories in a registry.
 * </p>
 */
public class DescribeRepositoriesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The AWS account ID associated with the registry that contains the
     * repositories to be described. If you do not specify a registry, the
     * default registry is assumed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String registryId;

    /**
     * <p>
     * A list of repositories to describe. If this parameter is omitted, then
     * all repositories in a registry are described.
     * </p>
     */
    private java.util.List<String> repositoryNames;

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>DescribeRepositories</code> request where <code>maxResults</code>
     * was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>nextToken</code> value. This value is <code>null</code> when there
     * are no more results to return. This option cannot be used when you
     * specify repositories with <code>repositoryNames</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of repository results returned by
     * <code>DescribeRepositories</code> in paginated output. When this
     * parameter is used, <code>DescribeRepositories</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>DescribeRepositories</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 1000. If
     * this parameter is not used, then <code>DescribeRepositories</code>
     * returns up to 100 results and a <code>nextToken</code> value, if
     * applicable. This option cannot be used when you specify repositories with
     * <code>repositoryNames</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the
     * repositories to be described. If you do not specify a registry, the
     * default registry is assumed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>
     *         The AWS account ID associated with the registry that contains the
     *         repositories to be described. If you do not specify a registry,
     *         the default registry is assumed.
     *         </p>
     */
    public String getRegistryId() {
        return registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the
     * repositories to be described. If you do not specify a registry, the
     * default registry is assumed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>
     *            The AWS account ID associated with the registry that contains
     *            the repositories to be described. If you do not specify a
     *            registry, the default registry is assumed.
     *            </p>
     */
    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the registry that contains the
     * repositories to be described. If you do not specify a registry, the
     * default registry is assumed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param registryId <p>
     *            The AWS account ID associated with the registry that contains
     *            the repositories to be described. If you do not specify a
     *            registry, the default registry is assumed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRepositoriesRequest withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * <p>
     * A list of repositories to describe. If this parameter is omitted, then
     * all repositories in a registry are described.
     * </p>
     *
     * @return <p>
     *         A list of repositories to describe. If this parameter is omitted,
     *         then all repositories in a registry are described.
     *         </p>
     */
    public java.util.List<String> getRepositoryNames() {
        return repositoryNames;
    }

    /**
     * <p>
     * A list of repositories to describe. If this parameter is omitted, then
     * all repositories in a registry are described.
     * </p>
     *
     * @param repositoryNames <p>
     *            A list of repositories to describe. If this parameter is
     *            omitted, then all repositories in a registry are described.
     *            </p>
     */
    public void setRepositoryNames(java.util.Collection<String> repositoryNames) {
        if (repositoryNames == null) {
            this.repositoryNames = null;
            return;
        }

        this.repositoryNames = new java.util.ArrayList<String>(repositoryNames);
    }

    /**
     * <p>
     * A list of repositories to describe. If this parameter is omitted, then
     * all repositories in a registry are described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositoryNames <p>
     *            A list of repositories to describe. If this parameter is
     *            omitted, then all repositories in a registry are described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRepositoriesRequest withRepositoryNames(String... repositoryNames) {
        if (getRepositoryNames() == null) {
            this.repositoryNames = new java.util.ArrayList<String>(repositoryNames.length);
        }
        for (String value : repositoryNames) {
            this.repositoryNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of repositories to describe. If this parameter is omitted, then
     * all repositories in a registry are described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositoryNames <p>
     *            A list of repositories to describe. If this parameter is
     *            omitted, then all repositories in a registry are described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRepositoriesRequest withRepositoryNames(
            java.util.Collection<String> repositoryNames) {
        setRepositoryNames(repositoryNames);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>DescribeRepositories</code> request where <code>maxResults</code>
     * was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>nextToken</code> value. This value is <code>null</code> when there
     * are no more results to return. This option cannot be used when you
     * specify repositories with <code>repositoryNames</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     *
     * @return <p>
     *         The <code>nextToken</code> value returned from a previous
     *         paginated <code>DescribeRepositories</code> request where
     *         <code>maxResults</code> was used and the results exceeded the
     *         value of that parameter. Pagination continues from the end of the
     *         previous results that returned the <code>nextToken</code> value.
     *         This value is <code>null</code> when there are no more results to
     *         return. This option cannot be used when you specify repositories
     *         with <code>repositoryNames</code>.
     *         </p>
     *         <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only
     *         used to retrieve the next items in a list and not for other
     *         programmatic purposes.
     *         </p>
     *         </note>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>DescribeRepositories</code> request where <code>maxResults</code>
     * was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>nextToken</code> value. This value is <code>null</code> when there
     * are no more results to return. This option cannot be used when you
     * specify repositories with <code>repositoryNames</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a previous
     *            paginated <code>DescribeRepositories</code> request where
     *            <code>maxResults</code> was used and the results exceeded the
     *            value of that parameter. Pagination continues from the end of
     *            the previous results that returned the <code>nextToken</code>
     *            value. This value is <code>null</code> when there are no more
     *            results to return. This option cannot be used when you specify
     *            repositories with <code>repositoryNames</code>.
     *            </p>
     *            <note>
     *            <p>
     *            This token should be treated as an opaque identifier that is
     *            only used to retrieve the next items in a list and not for
     *            other programmatic purposes.
     *            </p>
     *            </note>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>DescribeRepositories</code> request where <code>maxResults</code>
     * was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>nextToken</code> value. This value is <code>null</code> when there
     * are no more results to return. This option cannot be used when you
     * specify repositories with <code>repositoryNames</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a previous
     *            paginated <code>DescribeRepositories</code> request where
     *            <code>maxResults</code> was used and the results exceeded the
     *            value of that parameter. Pagination continues from the end of
     *            the previous results that returned the <code>nextToken</code>
     *            value. This value is <code>null</code> when there are no more
     *            results to return. This option cannot be used when you specify
     *            repositories with <code>repositoryNames</code>.
     *            </p>
     *            <note>
     *            <p>
     *            This token should be treated as an opaque identifier that is
     *            only used to retrieve the next items in a list and not for
     *            other programmatic purposes.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRepositoriesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of repository results returned by
     * <code>DescribeRepositories</code> in paginated output. When this
     * parameter is used, <code>DescribeRepositories</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>DescribeRepositories</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 1000. If
     * this parameter is not used, then <code>DescribeRepositories</code>
     * returns up to 100 results and a <code>nextToken</code> value, if
     * applicable. This option cannot be used when you specify repositories with
     * <code>repositoryNames</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of repository results returned by
     *         <code>DescribeRepositories</code> in paginated output. When this
     *         parameter is used, <code>DescribeRepositories</code> only returns
     *         <code>maxResults</code> results in a single page along with a
     *         <code>nextToken</code> response element. The remaining results of
     *         the initial request can be seen by sending another
     *         <code>DescribeRepositories</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and
     *         1000. If this parameter is not used, then
     *         <code>DescribeRepositories</code> returns up to 100 results and a
     *         <code>nextToken</code> value, if applicable. This option cannot
     *         be used when you specify repositories with
     *         <code>repositoryNames</code>.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of repository results returned by
     * <code>DescribeRepositories</code> in paginated output. When this
     * parameter is used, <code>DescribeRepositories</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>DescribeRepositories</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 1000. If
     * this parameter is not used, then <code>DescribeRepositories</code>
     * returns up to 100 results and a <code>nextToken</code> value, if
     * applicable. This option cannot be used when you specify repositories with
     * <code>repositoryNames</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of repository results returned by
     *            <code>DescribeRepositories</code> in paginated output. When
     *            this parameter is used, <code>DescribeRepositories</code> only
     *            returns <code>maxResults</code> results in a single page along
     *            with a <code>nextToken</code> response element. The remaining
     *            results of the initial request can be seen by sending another
     *            <code>DescribeRepositories</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            1000. If this parameter is not used, then
     *            <code>DescribeRepositories</code> returns up to 100 results
     *            and a <code>nextToken</code> value, if applicable. This option
     *            cannot be used when you specify repositories with
     *            <code>repositoryNames</code>.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of repository results returned by
     * <code>DescribeRepositories</code> in paginated output. When this
     * parameter is used, <code>DescribeRepositories</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>DescribeRepositories</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 1000. If
     * this parameter is not used, then <code>DescribeRepositories</code>
     * returns up to 100 results and a <code>nextToken</code> value, if
     * applicable. This option cannot be used when you specify repositories with
     * <code>repositoryNames</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of repository results returned by
     *            <code>DescribeRepositories</code> in paginated output. When
     *            this parameter is used, <code>DescribeRepositories</code> only
     *            returns <code>maxResults</code> results in a single page along
     *            with a <code>nextToken</code> response element. The remaining
     *            results of the initial request can be seen by sending another
     *            <code>DescribeRepositories</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            1000. If this parameter is not used, then
     *            <code>DescribeRepositories</code> returns up to 100 results
     *            and a <code>nextToken</code> value, if applicable. This option
     *            cannot be used when you specify repositories with
     *            <code>repositoryNames</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRepositoriesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getRegistryId() != null)
            sb.append("registryId: " + getRegistryId() + ",");
        if (getRepositoryNames() != null)
            sb.append("repositoryNames: " + getRepositoryNames() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode
                + ((getRepositoryNames() == null) ? 0 : getRepositoryNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRepositoriesRequest == false)
            return false;
        DescribeRepositoriesRequest other = (DescribeRepositoriesRequest) obj;

        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null
                && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryNames() == null ^ this.getRepositoryNames() == null)
            return false;
        if (other.getRepositoryNames() != null
                && other.getRepositoryNames().equals(this.getRepositoryNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
