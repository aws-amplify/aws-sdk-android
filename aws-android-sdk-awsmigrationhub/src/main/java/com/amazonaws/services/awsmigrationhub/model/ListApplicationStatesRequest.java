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

package com.amazonaws.services.awsmigrationhub.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists all the migration statuses for your applications. If you use the
 * optional <code>ApplicationIds</code> parameter, only the migration statuses
 * for those applications will be returned.
 * </p>
 */
public class ListApplicationStatesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The configurationIds from the Application Discovery Service that uniquely
     * identifies your applications.
     * </p>
     */
    private java.util.List<String> applicationIds;

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are
     * more results available. To retrieve the next page of results, make the
     * call again using the returned token in <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Maximum number of results to be returned per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The configurationIds from the Application Discovery Service that uniquely
     * identifies your applications.
     * </p>
     *
     * @return <p>
     *         The configurationIds from the Application Discovery Service that
     *         uniquely identifies your applications.
     *         </p>
     */
    public java.util.List<String> getApplicationIds() {
        return applicationIds;
    }

    /**
     * <p>
     * The configurationIds from the Application Discovery Service that uniquely
     * identifies your applications.
     * </p>
     *
     * @param applicationIds <p>
     *            The configurationIds from the Application Discovery Service
     *            that uniquely identifies your applications.
     *            </p>
     */
    public void setApplicationIds(java.util.Collection<String> applicationIds) {
        if (applicationIds == null) {
            this.applicationIds = null;
            return;
        }

        this.applicationIds = new java.util.ArrayList<String>(applicationIds);
    }

    /**
     * <p>
     * The configurationIds from the Application Discovery Service that uniquely
     * identifies your applications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationIds <p>
     *            The configurationIds from the Application Discovery Service
     *            that uniquely identifies your applications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListApplicationStatesRequest withApplicationIds(String... applicationIds) {
        if (getApplicationIds() == null) {
            this.applicationIds = new java.util.ArrayList<String>(applicationIds.length);
        }
        for (String value : applicationIds) {
            this.applicationIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The configurationIds from the Application Discovery Service that uniquely
     * identifies your applications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationIds <p>
     *            The configurationIds from the Application Discovery Service
     *            that uniquely identifies your applications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListApplicationStatesRequest withApplicationIds(
            java.util.Collection<String> applicationIds) {
        setApplicationIds(applicationIds);
        return this;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are
     * more results available. To retrieve the next page of results, make the
     * call again using the returned token in <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @return <p>
     *         If a <code>NextToken</code> was returned by a previous call,
     *         there are more results available. To retrieve the next page of
     *         results, make the call again using the returned token in
     *         <code>NextToken</code>.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are
     * more results available. To retrieve the next page of results, make the
     * call again using the returned token in <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @param nextToken <p>
     *            If a <code>NextToken</code> was returned by a previous call,
     *            there are more results available. To retrieve the next page of
     *            results, make the call again using the returned token in
     *            <code>NextToken</code>.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are
     * more results available. To retrieve the next page of results, make the
     * call again using the returned token in <code>NextToken</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @param nextToken <p>
     *            If a <code>NextToken</code> was returned by a previous call,
     *            there are more results available. To retrieve the next page of
     *            results, make the call again using the returned token in
     *            <code>NextToken</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListApplicationStatesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Maximum number of results to be returned per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         Maximum number of results to be returned per page.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Maximum number of results to be returned per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            Maximum number of results to be returned per page.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to be returned per page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            Maximum number of results to be returned per page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListApplicationStatesRequest withMaxResults(Integer maxResults) {
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
        if (getApplicationIds() != null)
            sb.append("ApplicationIds: " + getApplicationIds() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationIds() == null) ? 0 : getApplicationIds().hashCode());
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

        if (obj instanceof ListApplicationStatesRequest == false)
            return false;
        ListApplicationStatesRequest other = (ListApplicationStatesRequest) obj;

        if (other.getApplicationIds() == null ^ this.getApplicationIds() == null)
            return false;
        if (other.getApplicationIds() != null
                && other.getApplicationIds().equals(this.getApplicationIds()) == false)
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
