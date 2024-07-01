/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Searches contacts in an Amazon Connect instance.
 * </p>
 */
public class SearchContactsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of Amazon Connect instance. You can find the instance ID
     * in the Amazon Resource Name (ARN) of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * Time range that you want to search results.
     * </p>
     */
    private SearchContactsTimeRange timeRange;

    /**
     * <p>
     * The search criteria to be used to return contacts.
     * </p>
     */
    private SearchCriteria searchCriteria;

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
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies a field to sort by and a sort order.
     * </p>
     */
    private Sort sort;

    /**
     * <p>
     * The identifier of Amazon Connect instance. You can find the instance ID
     * in the Amazon Resource Name (ARN) of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of Amazon Connect instance. You can find the
     *         instance ID in the Amazon Resource Name (ARN) of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of Amazon Connect instance. You can find the instance ID
     * in the Amazon Resource Name (ARN) of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of Amazon Connect instance. You can find the
     *            instance ID in the Amazon Resource Name (ARN) of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of Amazon Connect instance. You can find the instance ID
     * in the Amazon Resource Name (ARN) of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of Amazon Connect instance. You can find the
     *            instance ID in the Amazon Resource Name (ARN) of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchContactsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * Time range that you want to search results.
     * </p>
     *
     * @return <p>
     *         Time range that you want to search results.
     *         </p>
     */
    public SearchContactsTimeRange getTimeRange() {
        return timeRange;
    }

    /**
     * <p>
     * Time range that you want to search results.
     * </p>
     *
     * @param timeRange <p>
     *            Time range that you want to search results.
     *            </p>
     */
    public void setTimeRange(SearchContactsTimeRange timeRange) {
        this.timeRange = timeRange;
    }

    /**
     * <p>
     * Time range that you want to search results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeRange <p>
     *            Time range that you want to search results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchContactsRequest withTimeRange(SearchContactsTimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    /**
     * <p>
     * The search criteria to be used to return contacts.
     * </p>
     *
     * @return <p>
     *         The search criteria to be used to return contacts.
     *         </p>
     */
    public SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * <p>
     * The search criteria to be used to return contacts.
     * </p>
     *
     * @param searchCriteria <p>
     *            The search criteria to be used to return contacts.
     *            </p>
     */
    public void setSearchCriteria(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    /**
     * <p>
     * The search criteria to be used to return contacts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param searchCriteria <p>
     *            The search criteria to be used to return contacts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchContactsRequest withSearchCriteria(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
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
    public SearchContactsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
     * <b>Length: </b>1 - 100000<br/>
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
     * <b>Length: </b>1 - 100000<br/>
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
     * <b>Length: </b>1 - 100000<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchContactsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Specifies a field to sort by and a sort order.
     * </p>
     *
     * @return <p>
     *         Specifies a field to sort by and a sort order.
     *         </p>
     */
    public Sort getSort() {
        return sort;
    }

    /**
     * <p>
     * Specifies a field to sort by and a sort order.
     * </p>
     *
     * @param sort <p>
     *            Specifies a field to sort by and a sort order.
     *            </p>
     */
    public void setSort(Sort sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * Specifies a field to sort by and a sort order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sort <p>
     *            Specifies a field to sort by and a sort order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchContactsRequest withSort(Sort sort) {
        this.sort = sort;
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
        if (getTimeRange() != null)
            sb.append("TimeRange: " + getTimeRange() + ",");
        if (getSearchCriteria() != null)
            sb.append("SearchCriteria: " + getSearchCriteria() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getSort() != null)
            sb.append("Sort: " + getSort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getTimeRange() == null) ? 0 : getTimeRange().hashCode());
        hashCode = prime * hashCode
                + ((getSearchCriteria() == null) ? 0 : getSearchCriteria().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchContactsRequest == false)
            return false;
        SearchContactsRequest other = (SearchContactsRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getTimeRange() == null ^ this.getTimeRange() == null)
            return false;
        if (other.getTimeRange() != null
                && other.getTimeRange().equals(this.getTimeRange()) == false)
            return false;
        if (other.getSearchCriteria() == null ^ this.getSearchCriteria() == null)
            return false;
        if (other.getSearchCriteria() != null
                && other.getSearchCriteria().equals(this.getSearchCriteria()) == false)
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
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        return true;
    }
}
