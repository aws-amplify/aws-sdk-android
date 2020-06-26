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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns summary information about stack instances that are associated with
 * the specified stack set. You can filter for stack instances that are
 * associated with a specific AWS account name or Region, or that have a
 * specific status.
 * </p>
 */
public class ListStackInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name or unique ID of the stack set that you want to list stack
     * instances for.
     * </p>
     */
    private String stackSetName;

    /**
     * <p>
     * If the previous request didn't return all of the remaining results, the
     * response's <code>NextToken</code> parameter value is set to a token. To
     * retrieve the next set of results, call <code>ListStackInstances</code>
     * again and assign that token to the request object's
     * <code>NextToken</code> parameter. If there are no remaining results, the
     * previous response object's <code>NextToken</code> parameter is set to
     * <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The status that stack instances are filtered by.
     * </p>
     */
    private java.util.List<StackInstanceFilter> filters;

    /**
     * <p>
     * The name of the AWS account that you want to list stack instances for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String stackInstanceAccount;

    /**
     * <p>
     * The name of the Region where you want to list stack instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]{1,128}$<br/>
     */
    private String stackInstanceRegion;

    /**
     * <p>
     * The name or unique ID of the stack set that you want to list stack
     * instances for.
     * </p>
     *
     * @return <p>
     *         The name or unique ID of the stack set that you want to list
     *         stack instances for.
     *         </p>
     */
    public String getStackSetName() {
        return stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you want to list stack
     * instances for.
     * </p>
     *
     * @param stackSetName <p>
     *            The name or unique ID of the stack set that you want to list
     *            stack instances for.
     *            </p>
     */
    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you want to list stack
     * instances for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetName <p>
     *            The name or unique ID of the stack set that you want to list
     *            stack instances for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStackInstancesRequest withStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
        return this;
    }

    /**
     * <p>
     * If the previous request didn't return all of the remaining results, the
     * response's <code>NextToken</code> parameter value is set to a token. To
     * retrieve the next set of results, call <code>ListStackInstances</code>
     * again and assign that token to the request object's
     * <code>NextToken</code> parameter. If there are no remaining results, the
     * previous response object's <code>NextToken</code> parameter is set to
     * <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         If the previous request didn't return all of the remaining
     *         results, the response's <code>NextToken</code> parameter value is
     *         set to a token. To retrieve the next set of results, call
     *         <code>ListStackInstances</code> again and assign that token to
     *         the request object's <code>NextToken</code> parameter. If there
     *         are no remaining results, the previous response object's
     *         <code>NextToken</code> parameter is set to <code>null</code>.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous request didn't return all of the remaining results, the
     * response's <code>NextToken</code> parameter value is set to a token. To
     * retrieve the next set of results, call <code>ListStackInstances</code>
     * again and assign that token to the request object's
     * <code>NextToken</code> parameter. If there are no remaining results, the
     * previous response object's <code>NextToken</code> parameter is set to
     * <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the previous request didn't return all of the remaining
     *            results, the response's <code>NextToken</code> parameter value
     *            is set to a token. To retrieve the next set of results, call
     *            <code>ListStackInstances</code> again and assign that token to
     *            the request object's <code>NextToken</code> parameter. If
     *            there are no remaining results, the previous response object's
     *            <code>NextToken</code> parameter is set to <code>null</code>.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous request didn't return all of the remaining results, the
     * response's <code>NextToken</code> parameter value is set to a token. To
     * retrieve the next set of results, call <code>ListStackInstances</code>
     * again and assign that token to the request object's
     * <code>NextToken</code> parameter. If there are no remaining results, the
     * previous response object's <code>NextToken</code> parameter is set to
     * <code>null</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the previous request didn't return all of the remaining
     *            results, the response's <code>NextToken</code> parameter value
     *            is set to a token. To retrieve the next set of results, call
     *            <code>ListStackInstances</code> again and assign that token to
     *            the request object's <code>NextToken</code> parameter. If
     *            there are no remaining results, the previous response object's
     *            <code>NextToken</code> parameter is set to <code>null</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStackInstancesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to be returned with a single call.
     *         If the number of available results exceeds this maximum, the
     *         response includes a <code>NextToken</code> value that you can
     *         assign to the <code>NextToken</code> request parameter to get the
     *         next set of results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to be returned with a single
     *            call. If the number of available results exceeds this maximum,
     *            the response includes a <code>NextToken</code> value that you
     *            can assign to the <code>NextToken</code> request parameter to
     *            get the next set of results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to be returned with a single
     *            call. If the number of available results exceeds this maximum,
     *            the response includes a <code>NextToken</code> value that you
     *            can assign to the <code>NextToken</code> request parameter to
     *            get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStackInstancesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The status that stack instances are filtered by.
     * </p>
     *
     * @return <p>
     *         The status that stack instances are filtered by.
     *         </p>
     */
    public java.util.List<StackInstanceFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The status that stack instances are filtered by.
     * </p>
     *
     * @param filters <p>
     *            The status that stack instances are filtered by.
     *            </p>
     */
    public void setFilters(java.util.Collection<StackInstanceFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<StackInstanceFilter>(filters);
    }

    /**
     * <p>
     * The status that stack instances are filtered by.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The status that stack instances are filtered by.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStackInstancesRequest withFilters(StackInstanceFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<StackInstanceFilter>(filters.length);
        }
        for (StackInstanceFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The status that stack instances are filtered by.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            The status that stack instances are filtered by.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStackInstancesRequest withFilters(java.util.Collection<StackInstanceFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The name of the AWS account that you want to list stack instances for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The name of the AWS account that you want to list stack instances
     *         for.
     *         </p>
     */
    public String getStackInstanceAccount() {
        return stackInstanceAccount;
    }

    /**
     * <p>
     * The name of the AWS account that you want to list stack instances for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param stackInstanceAccount <p>
     *            The name of the AWS account that you want to list stack
     *            instances for.
     *            </p>
     */
    public void setStackInstanceAccount(String stackInstanceAccount) {
        this.stackInstanceAccount = stackInstanceAccount;
    }

    /**
     * <p>
     * The name of the AWS account that you want to list stack instances for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param stackInstanceAccount <p>
     *            The name of the AWS account that you want to list stack
     *            instances for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStackInstancesRequest withStackInstanceAccount(String stackInstanceAccount) {
        this.stackInstanceAccount = stackInstanceAccount;
        return this;
    }

    /**
     * <p>
     * The name of the Region where you want to list stack instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]{1,128}$<br/>
     *
     * @return <p>
     *         The name of the Region where you want to list stack instances.
     *         </p>
     */
    public String getStackInstanceRegion() {
        return stackInstanceRegion;
    }

    /**
     * <p>
     * The name of the Region where you want to list stack instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]{1,128}$<br/>
     *
     * @param stackInstanceRegion <p>
     *            The name of the Region where you want to list stack instances.
     *            </p>
     */
    public void setStackInstanceRegion(String stackInstanceRegion) {
        this.stackInstanceRegion = stackInstanceRegion;
    }

    /**
     * <p>
     * The name of the Region where you want to list stack instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]{1,128}$<br/>
     *
     * @param stackInstanceRegion <p>
     *            The name of the Region where you want to list stack instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStackInstancesRequest withStackInstanceRegion(String stackInstanceRegion) {
        this.stackInstanceRegion = stackInstanceRegion;
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
        if (getStackSetName() != null)
            sb.append("StackSetName: " + getStackSetName() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getStackInstanceAccount() != null)
            sb.append("StackInstanceAccount: " + getStackInstanceAccount() + ",");
        if (getStackInstanceRegion() != null)
            sb.append("StackInstanceRegion: " + getStackInstanceRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getStackInstanceAccount() == null) ? 0 : getStackInstanceAccount().hashCode());
        hashCode = prime * hashCode
                + ((getStackInstanceRegion() == null) ? 0 : getStackInstanceRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStackInstancesRequest == false)
            return false;
        ListStackInstancesRequest other = (ListStackInstancesRequest) obj;

        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null
                && other.getStackSetName().equals(this.getStackSetName()) == false)
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
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getStackInstanceAccount() == null ^ this.getStackInstanceAccount() == null)
            return false;
        if (other.getStackInstanceAccount() != null
                && other.getStackInstanceAccount().equals(this.getStackInstanceAccount()) == false)
            return false;
        if (other.getStackInstanceRegion() == null ^ this.getStackInstanceRegion() == null)
            return false;
        if (other.getStackInstanceRegion() != null
                && other.getStackInstanceRegion().equals(this.getStackInstanceRegion()) == false)
            return false;
        return true;
    }
}
