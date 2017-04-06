/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeImportImageTasksRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeImportImageTasks(DescribeImportImageTasksRequest) DescribeImportImageTasks operation}.
 * <p>
 * Displays details about an import virtual machine or import snapshot
 * tasks that are already created.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeImportImageTasks(DescribeImportImageTasksRequest)
 */
public class DescribeImportImageTasksRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeImportImageTasksRequest> {

    /**
     * A list of import image task IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> importTaskIds;

    /**
     * A token that indicates the next page of results.
     */
    private String nextToken;

    /**
     * The maximum number of results to return in a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>NextToken</code> value.
     */
    private Integer maxResults;

    /**
     * Filter tasks using the <code>task-state</code> filter and one of the
     * following values: active, completed, deleting, deleted.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * A list of import image task IDs.
     *
     * @return A list of import image task IDs.
     */
    public java.util.List<String> getImportTaskIds() {
        if (importTaskIds == null) {
              importTaskIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              importTaskIds.setAutoConstruct(true);
        }
        return importTaskIds;
    }
    
    /**
     * A list of import image task IDs.
     *
     * @param importTaskIds A list of import image task IDs.
     */
    public void setImportTaskIds(java.util.Collection<String> importTaskIds) {
        if (importTaskIds == null) {
            this.importTaskIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> importTaskIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(importTaskIds.size());
        importTaskIdsCopy.addAll(importTaskIds);
        this.importTaskIds = importTaskIdsCopy;
    }
    
    /**
     * A list of import image task IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importTaskIds A list of import image task IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportImageTasksRequest withImportTaskIds(String... importTaskIds) {
        if (getImportTaskIds() == null) setImportTaskIds(new java.util.ArrayList<String>(importTaskIds.length));
        for (String value : importTaskIds) {
            getImportTaskIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of import image task IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importTaskIds A list of import image task IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportImageTasksRequest withImportTaskIds(java.util.Collection<String> importTaskIds) {
        if (importTaskIds == null) {
            this.importTaskIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> importTaskIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(importTaskIds.size());
            importTaskIdsCopy.addAll(importTaskIds);
            this.importTaskIds = importTaskIdsCopy;
        }

        return this;
    }

    /**
     * A token that indicates the next page of results.
     *
     * @return A token that indicates the next page of results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A token that indicates the next page of results.
     *
     * @param nextToken A token that indicates the next page of results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A token that indicates the next page of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A token that indicates the next page of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportImageTasksRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of results to return in a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>NextToken</code> value.
     *
     * @return The maximum number of results to return in a single call. To retrieve
     *         the remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results to return in a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>NextToken</code> value.
     *
     * @param maxResults The maximum number of results to return in a single call. To retrieve
     *         the remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results to return in a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>NextToken</code> value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of results to return in a single call. To retrieve
     *         the remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportImageTasksRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Filter tasks using the <code>task-state</code> filter and one of the
     * following values: active, completed, deleting, deleted.
     *
     * @return Filter tasks using the <code>task-state</code> filter and one of the
     *         following values: active, completed, deleting, deleted.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * Filter tasks using the <code>task-state</code> filter and one of the
     * following values: active, completed, deleting, deleted.
     *
     * @param filters Filter tasks using the <code>task-state</code> filter and one of the
     *         following values: active, completed, deleting, deleted.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * Filter tasks using the <code>task-state</code> filter and one of the
     * following values: active, completed, deleting, deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters Filter tasks using the <code>task-state</code> filter and one of the
     *         following values: active, completed, deleting, deleted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportImageTasksRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * Filter tasks using the <code>task-state</code> filter and one of the
     * following values: active, completed, deleting, deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters Filter tasks using the <code>task-state</code> filter and one of the
     *         following values: active, completed, deleting, deleted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportImageTasksRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeImportImageTasksRequest> getDryRunRequest() {
        Request<DescribeImportImageTasksRequest> request = new DescribeImportImageTasksRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getImportTaskIds() != null) sb.append("ImportTaskIds: " + getImportTaskIds() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImportTaskIds() == null) ? 0 : getImportTaskIds().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeImportImageTasksRequest == false) return false;
        DescribeImportImageTasksRequest other = (DescribeImportImageTasksRequest)obj;
        
        if (other.getImportTaskIds() == null ^ this.getImportTaskIds() == null) return false;
        if (other.getImportTaskIds() != null && other.getImportTaskIds().equals(this.getImportTaskIds()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    