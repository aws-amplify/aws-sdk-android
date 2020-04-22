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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists repository associations. You can optionally filter on one or more of
 * the following recommendation properties: provider types, states, names, and
 * owners.
 * </p>
 */
public class ListRepositoryAssociationsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * List of provider types to use as a filter.
     * </p>
     */
    private java.util.List<String> providerTypes;

    /**
     * <p>
     * List of states to use as a filter.
     * </p>
     */
    private java.util.List<String> states;

    /**
     * <p>
     * List of repository names to use as a filter.
     * </p>
     */
    private java.util.List<String> names;

    /**
     * <p>
     * List of owners to use as a filter. For GitHub, this is name of the GitHub
     * account that was used to associate the repository. For AWS CodeCommit, it
     * is the name of the CodeCommit account that was used to associate the
     * repository.
     * </p>
     */
    private java.util.List<String> owners;

    /**
     * <p>
     * The maximum number of repository association results returned by
     * <code>ListRepositoryAssociations</code> in paginated output. When this
     * parameter is used, <code>ListRepositoryAssociations</code> only returns
     * <code>maxResults</code> results in a single page with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListRepositoryAssociations</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 25. If this
     * parameter is not used, <code>ListRepositoryAssociations</code> returns up
     * to 25 results and a <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListRepositoryAssociations</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of
     * that parameter. Pagination continues from the end of the previous results
     * that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * Treat this token as an opaque identifier that is only used to retrieve
     * the next items in a list and not for other programmatic purposes.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String nextToken;

    /**
     * <p>
     * List of provider types to use as a filter.
     * </p>
     *
     * @return <p>
     *         List of provider types to use as a filter.
     *         </p>
     */
    public java.util.List<String> getProviderTypes() {
        return providerTypes;
    }

    /**
     * <p>
     * List of provider types to use as a filter.
     * </p>
     *
     * @param providerTypes <p>
     *            List of provider types to use as a filter.
     *            </p>
     */
    public void setProviderTypes(java.util.Collection<String> providerTypes) {
        if (providerTypes == null) {
            this.providerTypes = null;
            return;
        }

        this.providerTypes = new java.util.ArrayList<String>(providerTypes);
    }

    /**
     * <p>
     * List of provider types to use as a filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerTypes <p>
     *            List of provider types to use as a filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRepositoryAssociationsRequest withProviderTypes(String... providerTypes) {
        if (getProviderTypes() == null) {
            this.providerTypes = new java.util.ArrayList<String>(providerTypes.length);
        }
        for (String value : providerTypes) {
            this.providerTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of provider types to use as a filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerTypes <p>
     *            List of provider types to use as a filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRepositoryAssociationsRequest withProviderTypes(
            java.util.Collection<String> providerTypes) {
        setProviderTypes(providerTypes);
        return this;
    }

    /**
     * <p>
     * List of states to use as a filter.
     * </p>
     *
     * @return <p>
     *         List of states to use as a filter.
     *         </p>
     */
    public java.util.List<String> getStates() {
        return states;
    }

    /**
     * <p>
     * List of states to use as a filter.
     * </p>
     *
     * @param states <p>
     *            List of states to use as a filter.
     *            </p>
     */
    public void setStates(java.util.Collection<String> states) {
        if (states == null) {
            this.states = null;
            return;
        }

        this.states = new java.util.ArrayList<String>(states);
    }

    /**
     * <p>
     * List of states to use as a filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param states <p>
     *            List of states to use as a filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRepositoryAssociationsRequest withStates(String... states) {
        if (getStates() == null) {
            this.states = new java.util.ArrayList<String>(states.length);
        }
        for (String value : states) {
            this.states.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of states to use as a filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param states <p>
     *            List of states to use as a filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRepositoryAssociationsRequest withStates(java.util.Collection<String> states) {
        setStates(states);
        return this;
    }

    /**
     * <p>
     * List of repository names to use as a filter.
     * </p>
     *
     * @return <p>
     *         List of repository names to use as a filter.
     *         </p>
     */
    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * List of repository names to use as a filter.
     * </p>
     *
     * @param names <p>
     *            List of repository names to use as a filter.
     *            </p>
     */
    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * List of repository names to use as a filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param names <p>
     *            List of repository names to use as a filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRepositoryAssociationsRequest withNames(String... names) {
        if (getNames() == null) {
            this.names = new java.util.ArrayList<String>(names.length);
        }
        for (String value : names) {
            this.names.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of repository names to use as a filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param names <p>
     *            List of repository names to use as a filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRepositoryAssociationsRequest withNames(java.util.Collection<String> names) {
        setNames(names);
        return this;
    }

    /**
     * <p>
     * List of owners to use as a filter. For GitHub, this is name of the GitHub
     * account that was used to associate the repository. For AWS CodeCommit, it
     * is the name of the CodeCommit account that was used to associate the
     * repository.
     * </p>
     *
     * @return <p>
     *         List of owners to use as a filter. For GitHub, this is name of
     *         the GitHub account that was used to associate the repository. For
     *         AWS CodeCommit, it is the name of the CodeCommit account that was
     *         used to associate the repository.
     *         </p>
     */
    public java.util.List<String> getOwners() {
        return owners;
    }

    /**
     * <p>
     * List of owners to use as a filter. For GitHub, this is name of the GitHub
     * account that was used to associate the repository. For AWS CodeCommit, it
     * is the name of the CodeCommit account that was used to associate the
     * repository.
     * </p>
     *
     * @param owners <p>
     *            List of owners to use as a filter. For GitHub, this is name of
     *            the GitHub account that was used to associate the repository.
     *            For AWS CodeCommit, it is the name of the CodeCommit account
     *            that was used to associate the repository.
     *            </p>
     */
    public void setOwners(java.util.Collection<String> owners) {
        if (owners == null) {
            this.owners = null;
            return;
        }

        this.owners = new java.util.ArrayList<String>(owners);
    }

    /**
     * <p>
     * List of owners to use as a filter. For GitHub, this is name of the GitHub
     * account that was used to associate the repository. For AWS CodeCommit, it
     * is the name of the CodeCommit account that was used to associate the
     * repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owners <p>
     *            List of owners to use as a filter. For GitHub, this is name of
     *            the GitHub account that was used to associate the repository.
     *            For AWS CodeCommit, it is the name of the CodeCommit account
     *            that was used to associate the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRepositoryAssociationsRequest withOwners(String... owners) {
        if (getOwners() == null) {
            this.owners = new java.util.ArrayList<String>(owners.length);
        }
        for (String value : owners) {
            this.owners.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of owners to use as a filter. For GitHub, this is name of the GitHub
     * account that was used to associate the repository. For AWS CodeCommit, it
     * is the name of the CodeCommit account that was used to associate the
     * repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owners <p>
     *            List of owners to use as a filter. For GitHub, this is name of
     *            the GitHub account that was used to associate the repository.
     *            For AWS CodeCommit, it is the name of the CodeCommit account
     *            that was used to associate the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRepositoryAssociationsRequest withOwners(java.util.Collection<String> owners) {
        setOwners(owners);
        return this;
    }

    /**
     * <p>
     * The maximum number of repository association results returned by
     * <code>ListRepositoryAssociations</code> in paginated output. When this
     * parameter is used, <code>ListRepositoryAssociations</code> only returns
     * <code>maxResults</code> results in a single page with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListRepositoryAssociations</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 25. If this
     * parameter is not used, <code>ListRepositoryAssociations</code> returns up
     * to 25 results and a <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of repository association results returned by
     *         <code>ListRepositoryAssociations</code> in paginated output. When
     *         this parameter is used, <code>ListRepositoryAssociations</code>
     *         only returns <code>maxResults</code> results in a single page
     *         with a <code>nextToken</code> response element. The remaining
     *         results of the initial request can be seen by sending another
     *         <code>ListRepositoryAssociations</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 25.
     *         If this parameter is not used,
     *         <code>ListRepositoryAssociations</code> returns up to 25 results
     *         and a <code>nextToken</code> value if applicable.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of repository association results returned by
     * <code>ListRepositoryAssociations</code> in paginated output. When this
     * parameter is used, <code>ListRepositoryAssociations</code> only returns
     * <code>maxResults</code> results in a single page with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListRepositoryAssociations</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 25. If this
     * parameter is not used, <code>ListRepositoryAssociations</code> returns up
     * to 25 results and a <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of repository association results returned
     *            by <code>ListRepositoryAssociations</code> in paginated
     *            output. When this parameter is used,
     *            <code>ListRepositoryAssociations</code> only returns
     *            <code>maxResults</code> results in a single page with a
     *            <code>nextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another
     *            <code>ListRepositoryAssociations</code> request with the
     *            returned <code>nextToken</code> value. This value can be
     *            between 1 and 25. If this parameter is not used,
     *            <code>ListRepositoryAssociations</code> returns up to 25
     *            results and a <code>nextToken</code> value if applicable.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of repository association results returned by
     * <code>ListRepositoryAssociations</code> in paginated output. When this
     * parameter is used, <code>ListRepositoryAssociations</code> only returns
     * <code>maxResults</code> results in a single page with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListRepositoryAssociations</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 25. If this
     * parameter is not used, <code>ListRepositoryAssociations</code> returns up
     * to 25 results and a <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of repository association results returned
     *            by <code>ListRepositoryAssociations</code> in paginated
     *            output. When this parameter is used,
     *            <code>ListRepositoryAssociations</code> only returns
     *            <code>maxResults</code> results in a single page with a
     *            <code>nextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another
     *            <code>ListRepositoryAssociations</code> request with the
     *            returned <code>nextToken</code> value. This value can be
     *            between 1 and 25. If this parameter is not used,
     *            <code>ListRepositoryAssociations</code> returns up to 25
     *            results and a <code>nextToken</code> value if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRepositoryAssociationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListRepositoryAssociations</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of
     * that parameter. Pagination continues from the end of the previous results
     * that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * Treat this token as an opaque identifier that is only used to retrieve
     * the next items in a list and not for other programmatic purposes.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The <code>nextToken</code> value returned from a previous
     *         paginated <code>ListRepositoryAssociations</code> request where
     *         <code>maxResults</code> was used and the results exceeded the
     *         value of that parameter. Pagination continues from the end of the
     *         previous results that returned the <code>nextToken</code> value.
     *         </p>
     *         <note>
     *         <p>
     *         Treat this token as an opaque identifier that is only used to
     *         retrieve the next items in a list and not for other programmatic
     *         purposes.
     *         </p>
     *         </note>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListRepositoryAssociations</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of
     * that parameter. Pagination continues from the end of the previous results
     * that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * Treat this token as an opaque identifier that is only used to retrieve
     * the next items in a list and not for other programmatic purposes.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a previous
     *            paginated <code>ListRepositoryAssociations</code> request
     *            where <code>maxResults</code> was used and the results
     *            exceeded the value of that parameter. Pagination continues
     *            from the end of the previous results that returned the
     *            <code>nextToken</code> value.
     *            </p>
     *            <note>
     *            <p>
     *            Treat this token as an opaque identifier that is only used to
     *            retrieve the next items in a list and not for other
     *            programmatic purposes.
     *            </p>
     *            </note>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListRepositoryAssociations</code> request where
     * <code>maxResults</code> was used and the results exceeded the value of
     * that parameter. Pagination continues from the end of the previous results
     * that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * Treat this token as an opaque identifier that is only used to retrieve
     * the next items in a list and not for other programmatic purposes.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a previous
     *            paginated <code>ListRepositoryAssociations</code> request
     *            where <code>maxResults</code> was used and the results
     *            exceeded the value of that parameter. Pagination continues
     *            from the end of the previous results that returned the
     *            <code>nextToken</code> value.
     *            </p>
     *            <note>
     *            <p>
     *            Treat this token as an opaque identifier that is only used to
     *            retrieve the next items in a list and not for other
     *            programmatic purposes.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRepositoryAssociationsRequest withNextToken(String nextToken) {
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
        if (getProviderTypes() != null)
            sb.append("ProviderTypes: " + getProviderTypes() + ",");
        if (getStates() != null)
            sb.append("States: " + getStates() + ",");
        if (getNames() != null)
            sb.append("Names: " + getNames() + ",");
        if (getOwners() != null)
            sb.append("Owners: " + getOwners() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProviderTypes() == null) ? 0 : getProviderTypes().hashCode());
        hashCode = prime * hashCode + ((getStates() == null) ? 0 : getStates().hashCode());
        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode + ((getOwners() == null) ? 0 : getOwners().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRepositoryAssociationsRequest == false)
            return false;
        ListRepositoryAssociationsRequest other = (ListRepositoryAssociationsRequest) obj;

        if (other.getProviderTypes() == null ^ this.getProviderTypes() == null)
            return false;
        if (other.getProviderTypes() != null
                && other.getProviderTypes().equals(this.getProviderTypes()) == false)
            return false;
        if (other.getStates() == null ^ this.getStates() == null)
            return false;
        if (other.getStates() != null && other.getStates().equals(this.getStates()) == false)
            return false;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        if (other.getOwners() == null ^ this.getOwners() == null)
            return false;
        if (other.getOwners() != null && other.getOwners().equals(this.getOwners()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
