/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Searches users in an Amazon Connect instance, with optional filtering.
 * </p>
 * <note>
 * <p>
 * <code>AfterContactWorkTimeLimit</code> is returned in milliseconds.
 * </p>
 * </note>
 */
public class SearchUsersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Filters to be applied to search results.
     * </p>
     */
    private UserSearchFilter searchFilter;

    /**
     * <p>
     * The search criteria to be used to return users.
     * </p>
     * <note>
     * <p>
     * The <code>name</code> and <code>description</code> fields support
     * "contains" queries with a minimum of 2 characters and a maximum of 25
     * characters. Any queries with character lengths outside of this range will
     * throw invalid results.
     * </p>
     * </note>
     */
    private UserSearchCriteria searchCriteria;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *         >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *         the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     *
     * @return <p>
     *         The token for the next set of results. Use the value returned in
     *         the previous response in the next request to retrieve the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2500<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to return per page.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per page.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * Filters to be applied to search results.
     * </p>
     *
     * @return <p>
     *         Filters to be applied to search results.
     *         </p>
     */
    public UserSearchFilter getSearchFilter() {
        return searchFilter;
    }

    /**
     * <p>
     * Filters to be applied to search results.
     * </p>
     *
     * @param searchFilter <p>
     *            Filters to be applied to search results.
     *            </p>
     */
    public void setSearchFilter(UserSearchFilter searchFilter) {
        this.searchFilter = searchFilter;
    }

    /**
     * <p>
     * Filters to be applied to search results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param searchFilter <p>
     *            Filters to be applied to search results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersRequest withSearchFilter(UserSearchFilter searchFilter) {
        this.searchFilter = searchFilter;
        return this;
    }

    /**
     * <p>
     * The search criteria to be used to return users.
     * </p>
     * <note>
     * <p>
     * The <code>name</code> and <code>description</code> fields support
     * "contains" queries with a minimum of 2 characters and a maximum of 25
     * characters. Any queries with character lengths outside of this range will
     * throw invalid results.
     * </p>
     * </note>
     *
     * @return <p>
     *         The search criteria to be used to return users.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>name</code> and <code>description</code> fields support
     *         "contains" queries with a minimum of 2 characters and a maximum
     *         of 25 characters. Any queries with character lengths outside of
     *         this range will throw invalid results.
     *         </p>
     *         </note>
     */
    public UserSearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * <p>
     * The search criteria to be used to return users.
     * </p>
     * <note>
     * <p>
     * The <code>name</code> and <code>description</code> fields support
     * "contains" queries with a minimum of 2 characters and a maximum of 25
     * characters. Any queries with character lengths outside of this range will
     * throw invalid results.
     * </p>
     * </note>
     *
     * @param searchCriteria <p>
     *            The search criteria to be used to return users.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>name</code> and <code>description</code> fields
     *            support "contains" queries with a minimum of 2 characters and
     *            a maximum of 25 characters. Any queries with character lengths
     *            outside of this range will throw invalid results.
     *            </p>
     *            </note>
     */
    public void setSearchCriteria(UserSearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    /**
     * <p>
     * The search criteria to be used to return users.
     * </p>
     * <note>
     * <p>
     * The <code>name</code> and <code>description</code> fields support
     * "contains" queries with a minimum of 2 characters and a maximum of 25
     * characters. Any queries with character lengths outside of this range will
     * throw invalid results.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param searchCriteria <p>
     *            The search criteria to be used to return users.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>name</code> and <code>description</code> fields
     *            support "contains" queries with a minimum of 2 characters and
     *            a maximum of 25 characters. Any queries with character lengths
     *            outside of this range will throw invalid results.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchUsersRequest withSearchCriteria(UserSearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getSearchFilter() != null)
            sb.append("SearchFilter: " + getSearchFilter() + ",");
        if (getSearchCriteria() != null)
            sb.append("SearchCriteria: " + getSearchCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getSearchFilter() == null) ? 0 : getSearchFilter().hashCode());
        hashCode = prime * hashCode
                + ((getSearchCriteria() == null) ? 0 : getSearchCriteria().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchUsersRequest == false)
            return false;
        SearchUsersRequest other = (SearchUsersRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
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
        if (other.getSearchFilter() == null ^ this.getSearchFilter() == null)
            return false;
        if (other.getSearchFilter() != null
                && other.getSearchFilter().equals(this.getSearchFilter()) == false)
            return false;
        if (other.getSearchCriteria() == null ^ this.getSearchCriteria() == null)
            return false;
        if (other.getSearchCriteria() != null
                && other.getSearchCriteria().equals(this.getSearchCriteria()) == false)
            return false;
        return true;
    }
}
