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
 * Lists all the code reviews that the customer has created in the past 90 days.
 * </p>
 */
public class ListCodeReviewsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * List of provider types for filtering that needs to be applied before
     * displaying the result. For example, "providerTypes=[GitHub]" will list
     * code reviews from GitHub.
     * </p>
     */
    private java.util.List<String> providerTypes;

    /**
     * <p>
     * List of states for filtering that needs to be applied before displaying
     * the result. For example, "states=[Pending]" will list code reviews in the
     * Pending state.
     * </p>
     */
    private java.util.List<String> states;

    /**
     * <p>
     * List of repository names for filtering that needs to be applied before
     * displaying the result.
     * </p>
     */
    private java.util.List<String> repositoryNames;

    /**
     * <p>
     * The type of code reviews to list in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PullRequest
     */
    private String type;

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is
     * 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of
     * nextToken is a unique pagination token for each page. Make the call again
     * using the returned token to retrieve the next page. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String nextToken;

    /**
     * <p>
     * List of provider types for filtering that needs to be applied before
     * displaying the result. For example, "providerTypes=[GitHub]" will list
     * code reviews from GitHub.
     * </p>
     *
     * @return <p>
     *         List of provider types for filtering that needs to be applied
     *         before displaying the result. For example,
     *         "providerTypes=[GitHub]" will list code reviews from GitHub.
     *         </p>
     */
    public java.util.List<String> getProviderTypes() {
        return providerTypes;
    }

    /**
     * <p>
     * List of provider types for filtering that needs to be applied before
     * displaying the result. For example, "providerTypes=[GitHub]" will list
     * code reviews from GitHub.
     * </p>
     *
     * @param providerTypes <p>
     *            List of provider types for filtering that needs to be applied
     *            before displaying the result. For example,
     *            "providerTypes=[GitHub]" will list code reviews from GitHub.
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
     * List of provider types for filtering that needs to be applied before
     * displaying the result. For example, "providerTypes=[GitHub]" will list
     * code reviews from GitHub.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerTypes <p>
     *            List of provider types for filtering that needs to be applied
     *            before displaying the result. For example,
     *            "providerTypes=[GitHub]" will list code reviews from GitHub.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCodeReviewsRequest withProviderTypes(String... providerTypes) {
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
     * List of provider types for filtering that needs to be applied before
     * displaying the result. For example, "providerTypes=[GitHub]" will list
     * code reviews from GitHub.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerTypes <p>
     *            List of provider types for filtering that needs to be applied
     *            before displaying the result. For example,
     *            "providerTypes=[GitHub]" will list code reviews from GitHub.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCodeReviewsRequest withProviderTypes(java.util.Collection<String> providerTypes) {
        setProviderTypes(providerTypes);
        return this;
    }

    /**
     * <p>
     * List of states for filtering that needs to be applied before displaying
     * the result. For example, "states=[Pending]" will list code reviews in the
     * Pending state.
     * </p>
     *
     * @return <p>
     *         List of states for filtering that needs to be applied before
     *         displaying the result. For example, "states=[Pending]" will list
     *         code reviews in the Pending state.
     *         </p>
     */
    public java.util.List<String> getStates() {
        return states;
    }

    /**
     * <p>
     * List of states for filtering that needs to be applied before displaying
     * the result. For example, "states=[Pending]" will list code reviews in the
     * Pending state.
     * </p>
     *
     * @param states <p>
     *            List of states for filtering that needs to be applied before
     *            displaying the result. For example, "states=[Pending]" will
     *            list code reviews in the Pending state.
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
     * List of states for filtering that needs to be applied before displaying
     * the result. For example, "states=[Pending]" will list code reviews in the
     * Pending state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param states <p>
     *            List of states for filtering that needs to be applied before
     *            displaying the result. For example, "states=[Pending]" will
     *            list code reviews in the Pending state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCodeReviewsRequest withStates(String... states) {
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
     * List of states for filtering that needs to be applied before displaying
     * the result. For example, "states=[Pending]" will list code reviews in the
     * Pending state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param states <p>
     *            List of states for filtering that needs to be applied before
     *            displaying the result. For example, "states=[Pending]" will
     *            list code reviews in the Pending state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCodeReviewsRequest withStates(java.util.Collection<String> states) {
        setStates(states);
        return this;
    }

    /**
     * <p>
     * List of repository names for filtering that needs to be applied before
     * displaying the result.
     * </p>
     *
     * @return <p>
     *         List of repository names for filtering that needs to be applied
     *         before displaying the result.
     *         </p>
     */
    public java.util.List<String> getRepositoryNames() {
        return repositoryNames;
    }

    /**
     * <p>
     * List of repository names for filtering that needs to be applied before
     * displaying the result.
     * </p>
     *
     * @param repositoryNames <p>
     *            List of repository names for filtering that needs to be
     *            applied before displaying the result.
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
     * List of repository names for filtering that needs to be applied before
     * displaying the result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositoryNames <p>
     *            List of repository names for filtering that needs to be
     *            applied before displaying the result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCodeReviewsRequest withRepositoryNames(String... repositoryNames) {
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
     * List of repository names for filtering that needs to be applied before
     * displaying the result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositoryNames <p>
     *            List of repository names for filtering that needs to be
     *            applied before displaying the result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCodeReviewsRequest withRepositoryNames(java.util.Collection<String> repositoryNames) {
        setRepositoryNames(repositoryNames);
        return this;
    }

    /**
     * <p>
     * The type of code reviews to list in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PullRequest
     *
     * @return <p>
     *         The type of code reviews to list in the response.
     *         </p>
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of code reviews to list in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PullRequest
     *
     * @param type <p>
     *            The type of code reviews to list in the response.
     *            </p>
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of code reviews to list in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PullRequest
     *
     * @param type <p>
     *            The type of code reviews to list in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public ListCodeReviewsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of code reviews to list in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PullRequest
     *
     * @param type <p>
     *            The type of code reviews to list in the response.
     *            </p>
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of code reviews to list in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PullRequest
     *
     * @param type <p>
     *            The type of code reviews to list in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public ListCodeReviewsRequest withType(Type type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is
     * 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results that are returned per call. The
     *         default is 100.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is
     * 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results that are returned per call. The
     *            default is 100.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is
     * 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results that are returned per call. The
     *            default is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCodeReviewsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of
     * nextToken is a unique pagination token for each page. Make the call again
     * using the returned token to retrieve the next page. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         If nextToken is returned, there are more results available. The
     *         value of nextToken is a unique pagination token for each page.
     *         Make the call again using the returned token to retrieve the next
     *         page. Keep all other arguments unchanged.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of
     * nextToken is a unique pagination token for each page. Make the call again
     * using the returned token to retrieve the next page. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param nextToken <p>
     *            If nextToken is returned, there are more results available.
     *            The value of nextToken is a unique pagination token for each
     *            page. Make the call again using the returned token to retrieve
     *            the next page. Keep all other arguments unchanged.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of
     * nextToken is a unique pagination token for each page. Make the call again
     * using the returned token to retrieve the next page. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param nextToken <p>
     *            If nextToken is returned, there are more results available.
     *            The value of nextToken is a unique pagination token for each
     *            page. Make the call again using the returned token to retrieve
     *            the next page. Keep all other arguments unchanged.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCodeReviewsRequest withNextToken(String nextToken) {
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
        if (getRepositoryNames() != null)
            sb.append("RepositoryNames: " + getRepositoryNames() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
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
        hashCode = prime * hashCode
                + ((getRepositoryNames() == null) ? 0 : getRepositoryNames().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
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

        if (obj instanceof ListCodeReviewsRequest == false)
            return false;
        ListCodeReviewsRequest other = (ListCodeReviewsRequest) obj;

        if (other.getProviderTypes() == null ^ this.getProviderTypes() == null)
            return false;
        if (other.getProviderTypes() != null
                && other.getProviderTypes().equals(this.getProviderTypes()) == false)
            return false;
        if (other.getStates() == null ^ this.getStates() == null)
            return false;
        if (other.getStates() != null && other.getStates().equals(this.getStates()) == false)
            return false;
        if (other.getRepositoryNames() == null ^ this.getRepositoryNames() == null)
            return false;
        if (other.getRepositoryNames() != null
                && other.getRepositoryNames().equals(this.getRepositoryNames()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
