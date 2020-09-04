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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>View a summary of OpsItems based on specified filters and aggregators.</p>
 */
public class GetOpsSummaryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>Specify the name of a resource data sync to get.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String syncName;

    /**
     * <p>Optional filters used to scope down the returned OpsItems. </p>
     */
    private java.util.List<OpsFilter> filters;

    /**
     * <p>Optional aggregators that return counts of OpsItems based on one or more expressions.</p>
     */
    private java.util.List<OpsAggregator> aggregators;

    /**
     * <p>The OpsItem data type to return.</p>
     */
    private java.util.List<OpsResultAttribute> resultAttributes;

    /**
     * <p>A token to start the list. Use this token to get the next set of results. </p>
     */
    private String nextToken;

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>Specify the name of a resource data sync to get.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>Specify the name of a resource data sync to get.</p>
     */
    public String getSyncName() {
        return syncName;
    }

    /**
     * <p>Specify the name of a resource data sync to get.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncName <p>Specify the name of a resource data sync to get.</p>
     */
    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }

    /**
     * <p>Specify the name of a resource data sync to get.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param syncName <p>Specify the name of a resource data sync to get.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetOpsSummaryRequest withSyncName(String syncName) {
        this.syncName = syncName;
        return this;
    }

    /**
     * <p>Optional filters used to scope down the returned OpsItems. </p>
     *
     * @return <p>Optional filters used to scope down the returned OpsItems. </p>
     */
    public java.util.List<OpsFilter> getFilters() {
        return filters;
    }

    /**
     * <p>Optional filters used to scope down the returned OpsItems. </p>
     *
     * @param filters <p>Optional filters used to scope down the returned OpsItems. </p>
     */
    public void setFilters(java.util.Collection<OpsFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<OpsFilter>(filters);
    }

    /**
     * <p>Optional filters used to scope down the returned OpsItems. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>Optional filters used to scope down the returned OpsItems. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetOpsSummaryRequest withFilters(OpsFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<OpsFilter>(filters.length);
        }
        for (OpsFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>Optional filters used to scope down the returned OpsItems. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>Optional filters used to scope down the returned OpsItems. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetOpsSummaryRequest withFilters(java.util.Collection<OpsFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>Optional aggregators that return counts of OpsItems based on one or more expressions.</p>
     *
     * @return <p>Optional aggregators that return counts of OpsItems based on one or more expressions.</p>
     */
    public java.util.List<OpsAggregator> getAggregators() {
        return aggregators;
    }

    /**
     * <p>Optional aggregators that return counts of OpsItems based on one or more expressions.</p>
     *
     * @param aggregators <p>Optional aggregators that return counts of OpsItems based on one or more expressions.</p>
     */
    public void setAggregators(java.util.Collection<OpsAggregator> aggregators) {
        if (aggregators == null) {
            this.aggregators = null;
            return;
        }

        this.aggregators = new java.util.ArrayList<OpsAggregator>(aggregators);
    }

    /**
     * <p>Optional aggregators that return counts of OpsItems based on one or more expressions.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aggregators <p>Optional aggregators that return counts of OpsItems based on one or more expressions.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetOpsSummaryRequest withAggregators(OpsAggregator... aggregators) {
        if (getAggregators() == null) {
            this.aggregators = new java.util.ArrayList<OpsAggregator>(aggregators.length);
        }
        for (OpsAggregator value : aggregators) {
            this.aggregators.add(value);
        }
        return this;
    }

    /**
     * <p>Optional aggregators that return counts of OpsItems based on one or more expressions.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aggregators <p>Optional aggregators that return counts of OpsItems based on one or more expressions.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetOpsSummaryRequest withAggregators(java.util.Collection<OpsAggregator> aggregators) {
        setAggregators(aggregators);
        return this;
    }

    /**
     * <p>The OpsItem data type to return.</p>
     *
     * @return <p>The OpsItem data type to return.</p>
     */
    public java.util.List<OpsResultAttribute> getResultAttributes() {
        return resultAttributes;
    }

    /**
     * <p>The OpsItem data type to return.</p>
     *
     * @param resultAttributes <p>The OpsItem data type to return.</p>
     */
    public void setResultAttributes(java.util.Collection<OpsResultAttribute> resultAttributes) {
        if (resultAttributes == null) {
            this.resultAttributes = null;
            return;
        }

        this.resultAttributes = new java.util.ArrayList<OpsResultAttribute>(resultAttributes);
    }

    /**
     * <p>The OpsItem data type to return.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resultAttributes <p>The OpsItem data type to return.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetOpsSummaryRequest withResultAttributes(OpsResultAttribute... resultAttributes) {
        if (getResultAttributes() == null) {
            this.resultAttributes = new java.util.ArrayList<OpsResultAttribute>(resultAttributes.length);
        }
        for (OpsResultAttribute value : resultAttributes) {
            this.resultAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>The OpsItem data type to return.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resultAttributes <p>The OpsItem data type to return.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetOpsSummaryRequest withResultAttributes(java.util.Collection<OpsResultAttribute> resultAttributes) {
        setResultAttributes(resultAttributes);
        return this;
    }

    /**
     * <p>A token to start the list. Use this token to get the next set of results. </p>
     *
     * @return <p>A token to start the list. Use this token to get the next set of results. </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>A token to start the list. Use this token to get the next set of results. </p>
     *
     * @param nextToken <p>A token to start the list. Use this token to get the next set of results. </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>A token to start the list. Use this token to get the next set of results. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>A token to start the list. Use this token to get the next set of results. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetOpsSummaryRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetOpsSummaryRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSyncName() != null) sb.append("SyncName: " + getSyncName() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getAggregators() != null) sb.append("Aggregators: " + getAggregators() + ",");
        if (getResultAttributes() != null) sb.append("ResultAttributes: " + getResultAttributes() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSyncName() == null) ? 0 : getSyncName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getAggregators() == null) ? 0 : getAggregators().hashCode());
        hashCode = prime * hashCode + ((getResultAttributes() == null) ? 0 : getResultAttributes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetOpsSummaryRequest == false) return false;
        GetOpsSummaryRequest other = (GetOpsSummaryRequest)obj;

        if (other.getSyncName() == null ^ this.getSyncName() == null) return false;
        if (other.getSyncName() != null && other.getSyncName().equals(this.getSyncName()) == false) return false;
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false;
        if (other.getAggregators() == null ^ this.getAggregators() == null) return false;
        if (other.getAggregators() != null && other.getAggregators().equals(this.getAggregators()) == false) return false;
        if (other.getResultAttributes() == null ^ this.getResultAttributes() == null) return false;
        if (other.getResultAttributes() != null && other.getResultAttributes().equals(this.getResultAttributes()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        return true;
    }
}
