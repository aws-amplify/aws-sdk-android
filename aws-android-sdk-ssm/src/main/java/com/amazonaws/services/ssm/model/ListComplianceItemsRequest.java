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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * For a specified resource ID, this API action returns a list of compliance
 * statuses for different resource types. Currently, you can only specify one
 * resource ID per call. List results depend on the criteria specified in the
 * filter.
 * </p>
 */
public class ListComplianceItemsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * One or more compliance filters. Use a filter to return a more specific
     * list of results.
     * </p>
     */
    private java.util.List<ComplianceStringFilter> filters;

    /**
     * <p>
     * The ID for the resources from which to get compliance information.
     * Currently, you can only specify one resource ID.
     * </p>
     */
    private java.util.List<String> resourceIds;

    /**
     * <p>
     * The type of resource from which to get compliance information. Currently,
     * the only supported resource type is <code>ManagedInstance</code>.
     * </p>
     */
    private java.util.List<String> resourceTypes;

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more compliance filters. Use a filter to return a more specific
     * list of results.
     * </p>
     *
     * @return <p>
     *         One or more compliance filters. Use a filter to return a more
     *         specific list of results.
     *         </p>
     */
    public java.util.List<ComplianceStringFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more compliance filters. Use a filter to return a more specific
     * list of results.
     * </p>
     *
     * @param filters <p>
     *            One or more compliance filters. Use a filter to return a more
     *            specific list of results.
     *            </p>
     */
    public void setFilters(java.util.Collection<ComplianceStringFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ComplianceStringFilter>(filters);
    }

    /**
     * <p>
     * One or more compliance filters. Use a filter to return a more specific
     * list of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more compliance filters. Use a filter to return a more
     *            specific list of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceItemsRequest withFilters(ComplianceStringFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<ComplianceStringFilter>(filters.length);
        }
        for (ComplianceStringFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more compliance filters. Use a filter to return a more specific
     * list of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            One or more compliance filters. Use a filter to return a more
     *            specific list of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceItemsRequest withFilters(
            java.util.Collection<ComplianceStringFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The ID for the resources from which to get compliance information.
     * Currently, you can only specify one resource ID.
     * </p>
     *
     * @return <p>
     *         The ID for the resources from which to get compliance
     *         information. Currently, you can only specify one resource ID.
     *         </p>
     */
    public java.util.List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * <p>
     * The ID for the resources from which to get compliance information.
     * Currently, you can only specify one resource ID.
     * </p>
     *
     * @param resourceIds <p>
     *            The ID for the resources from which to get compliance
     *            information. Currently, you can only specify one resource ID.
     *            </p>
     */
    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new java.util.ArrayList<String>(resourceIds);
    }

    /**
     * <p>
     * The ID for the resources from which to get compliance information.
     * Currently, you can only specify one resource ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceIds <p>
     *            The ID for the resources from which to get compliance
     *            information. Currently, you can only specify one resource ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceItemsRequest withResourceIds(String... resourceIds) {
        if (getResourceIds() == null) {
            this.resourceIds = new java.util.ArrayList<String>(resourceIds.length);
        }
        for (String value : resourceIds) {
            this.resourceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ID for the resources from which to get compliance information.
     * Currently, you can only specify one resource ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceIds <p>
     *            The ID for the resources from which to get compliance
     *            information. Currently, you can only specify one resource ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceItemsRequest withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

    /**
     * <p>
     * The type of resource from which to get compliance information. Currently,
     * the only supported resource type is <code>ManagedInstance</code>.
     * </p>
     *
     * @return <p>
     *         The type of resource from which to get compliance information.
     *         Currently, the only supported resource type is
     *         <code>ManagedInstance</code>.
     *         </p>
     */
    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * The type of resource from which to get compliance information. Currently,
     * the only supported resource type is <code>ManagedInstance</code>.
     * </p>
     *
     * @param resourceTypes <p>
     *            The type of resource from which to get compliance information.
     *            Currently, the only supported resource type is
     *            <code>ManagedInstance</code>.
     *            </p>
     */
    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * The type of resource from which to get compliance information. Currently,
     * the only supported resource type is <code>ManagedInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypes <p>
     *            The type of resource from which to get compliance information.
     *            Currently, the only supported resource type is
     *            <code>ManagedInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceItemsRequest withResourceTypes(String... resourceTypes) {
        if (getResourceTypes() == null) {
            this.resourceTypes = new java.util.ArrayList<String>(resourceTypes.length);
        }
        for (String value : resourceTypes) {
            this.resourceTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The type of resource from which to get compliance information. Currently,
     * the only supported resource type is <code>ManagedInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypes <p>
     *            The type of resource from which to get compliance information.
     *            Currently, the only supported resource type is
     *            <code>ManagedInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceItemsRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     *
     * @return <p>
     *         A token to start the list. Use this token to get the next set of
     *         results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            A token to start the list. Use this token to get the next set
     *            of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token to start the list. Use this token to get the next set
     *            of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceItemsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The maximum number of items to return for this call. The call
     *         also returns a token that you can specify in a subsequent call to
     *         get the next set of results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this call. The call
     *            also returns a token that you can specify in a subsequent call
     *            to get the next set of results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this call. The call
     *            also returns a token that you can specify in a subsequent call
     *            to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceItemsRequest withMaxResults(Integer maxResults) {
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
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: " + getResourceIds() + ",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: " + getResourceTypes() + ",");
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        hashCode = prime * hashCode
                + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
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

        if (obj instanceof ListComplianceItemsRequest == false)
            return false;
        ListComplianceItemsRequest other = (ListComplianceItemsRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null
                && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null
                && other.getResourceTypes().equals(this.getResourceTypes()) == false)
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
