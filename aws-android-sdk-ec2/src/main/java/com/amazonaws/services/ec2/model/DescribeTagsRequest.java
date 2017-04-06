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
import com.amazonaws.services.ec2.model.transform.DescribeTagsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeTags(DescribeTagsRequest) DescribeTags operation}.
 * <p>
 * Describes one or more of the tags for your EC2 resources.
 * </p>
 * <p>
 * For more information about tags, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging Your Resources </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeTags(DescribeTagsRequest)
 */
public class DescribeTagsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeTagsRequest> {

    /**
     * One or more filters. <ul> <li> <p><code>key</code> - The tag key.
     * </li> <li> <p><code>resource-id</code> - The resource ID. </li> <li>
     * <p><code>resource-type</code> - The resource type
     * (<code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>image</code> | <code>instance</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-interface</code> | <code>reserved-instances</code> |
     * <code>route-table</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>spot-instances-request</code> |
     * <code>subnet</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>). </li> <li>
     * <p><code>value</code> - The tag value. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The maximum number of results to return in a single call. This value
     * can be between 5 and 1000. To retrieve the remaining results, make
     * another call with the returned <code>NextToken</code> value.
     */
    private Integer maxResults;

    /**
     * The token to retrieve the next page of results.
     */
    private String nextToken;

    /**
     * Default constructor for a new DescribeTagsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeTagsRequest() {}
    
    /**
     * Constructs a new DescribeTagsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param filters One or more filters. <ul> <li> <p><code>key</code> -
     * The tag key. </li> <li> <p><code>resource-id</code> - The resource ID.
     * </li> <li> <p><code>resource-type</code> - The resource type
     * (<code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>image</code> | <code>instance</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-interface</code> | <code>reserved-instances</code> |
     * <code>route-table</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>spot-instances-request</code> |
     * <code>subnet</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>). </li> <li>
     * <p><code>value</code> - The tag value. </li> </ul>
     */
    public DescribeTagsRequest(java.util.List<Filter> filters) {
        setFilters(filters);
    }

    /**
     * One or more filters. <ul> <li> <p><code>key</code> - The tag key.
     * </li> <li> <p><code>resource-id</code> - The resource ID. </li> <li>
     * <p><code>resource-type</code> - The resource type
     * (<code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>image</code> | <code>instance</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-interface</code> | <code>reserved-instances</code> |
     * <code>route-table</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>spot-instances-request</code> |
     * <code>subnet</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>). </li> <li>
     * <p><code>value</code> - The tag value. </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>key</code> - The tag key.
     *         </li> <li> <p><code>resource-id</code> - The resource ID. </li> <li>
     *         <p><code>resource-type</code> - The resource type
     *         (<code>customer-gateway</code> | <code>dhcp-options</code> |
     *         <code>image</code> | <code>instance</code> |
     *         <code>internet-gateway</code> | <code>network-acl</code> |
     *         <code>network-interface</code> | <code>reserved-instances</code> |
     *         <code>route-table</code> | <code>security-group</code> |
     *         <code>snapshot</code> | <code>spot-instances-request</code> |
     *         <code>subnet</code> | <code>volume</code> | <code>vpc</code> |
     *         <code>vpn-connection</code> | <code>vpn-gateway</code>). </li> <li>
     *         <p><code>value</code> - The tag value. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>key</code> - The tag key.
     * </li> <li> <p><code>resource-id</code> - The resource ID. </li> <li>
     * <p><code>resource-type</code> - The resource type
     * (<code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>image</code> | <code>instance</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-interface</code> | <code>reserved-instances</code> |
     * <code>route-table</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>spot-instances-request</code> |
     * <code>subnet</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>). </li> <li>
     * <p><code>value</code> - The tag value. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>key</code> - The tag key.
     *         </li> <li> <p><code>resource-id</code> - The resource ID. </li> <li>
     *         <p><code>resource-type</code> - The resource type
     *         (<code>customer-gateway</code> | <code>dhcp-options</code> |
     *         <code>image</code> | <code>instance</code> |
     *         <code>internet-gateway</code> | <code>network-acl</code> |
     *         <code>network-interface</code> | <code>reserved-instances</code> |
     *         <code>route-table</code> | <code>security-group</code> |
     *         <code>snapshot</code> | <code>spot-instances-request</code> |
     *         <code>subnet</code> | <code>volume</code> | <code>vpc</code> |
     *         <code>vpn-connection</code> | <code>vpn-gateway</code>). </li> <li>
     *         <p><code>value</code> - The tag value. </li> </ul>
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
     * One or more filters. <ul> <li> <p><code>key</code> - The tag key.
     * </li> <li> <p><code>resource-id</code> - The resource ID. </li> <li>
     * <p><code>resource-type</code> - The resource type
     * (<code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>image</code> | <code>instance</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-interface</code> | <code>reserved-instances</code> |
     * <code>route-table</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>spot-instances-request</code> |
     * <code>subnet</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>). </li> <li>
     * <p><code>value</code> - The tag value. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>key</code> - The tag key.
     *         </li> <li> <p><code>resource-id</code> - The resource ID. </li> <li>
     *         <p><code>resource-type</code> - The resource type
     *         (<code>customer-gateway</code> | <code>dhcp-options</code> |
     *         <code>image</code> | <code>instance</code> |
     *         <code>internet-gateway</code> | <code>network-acl</code> |
     *         <code>network-interface</code> | <code>reserved-instances</code> |
     *         <code>route-table</code> | <code>security-group</code> |
     *         <code>snapshot</code> | <code>spot-instances-request</code> |
     *         <code>subnet</code> | <code>volume</code> | <code>vpc</code> |
     *         <code>vpn-connection</code> | <code>vpn-gateway</code>). </li> <li>
     *         <p><code>value</code> - The tag value. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>key</code> - The tag key.
     * </li> <li> <p><code>resource-id</code> - The resource ID. </li> <li>
     * <p><code>resource-type</code> - The resource type
     * (<code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>image</code> | <code>instance</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-interface</code> | <code>reserved-instances</code> |
     * <code>route-table</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>spot-instances-request</code> |
     * <code>subnet</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>). </li> <li>
     * <p><code>value</code> - The tag value. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>key</code> - The tag key.
     *         </li> <li> <p><code>resource-id</code> - The resource ID. </li> <li>
     *         <p><code>resource-type</code> - The resource type
     *         (<code>customer-gateway</code> | <code>dhcp-options</code> |
     *         <code>image</code> | <code>instance</code> |
     *         <code>internet-gateway</code> | <code>network-acl</code> |
     *         <code>network-interface</code> | <code>reserved-instances</code> |
     *         <code>route-table</code> | <code>security-group</code> |
     *         <code>snapshot</code> | <code>spot-instances-request</code> |
     *         <code>subnet</code> | <code>volume</code> | <code>vpc</code> |
     *         <code>vpn-connection</code> | <code>vpn-gateway</code>). </li> <li>
     *         <p><code>value</code> - The tag value. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsRequest withFilters(java.util.Collection<Filter> filters) {
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
     * The maximum number of results to return in a single call. This value
     * can be between 5 and 1000. To retrieve the remaining results, make
     * another call with the returned <code>NextToken</code> value.
     *
     * @return The maximum number of results to return in a single call. This value
     *         can be between 5 and 1000. To retrieve the remaining results, make
     *         another call with the returned <code>NextToken</code> value.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results to return in a single call. This value
     * can be between 5 and 1000. To retrieve the remaining results, make
     * another call with the returned <code>NextToken</code> value.
     *
     * @param maxResults The maximum number of results to return in a single call. This value
     *         can be between 5 and 1000. To retrieve the remaining results, make
     *         another call with the returned <code>NextToken</code> value.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results to return in a single call. This value
     * can be between 5 and 1000. To retrieve the remaining results, make
     * another call with the returned <code>NextToken</code> value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of results to return in a single call. This value
     *         can be between 5 and 1000. To retrieve the remaining results, make
     *         another call with the returned <code>NextToken</code> value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * The token to retrieve the next page of results.
     *
     * @return The token to retrieve the next page of results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to retrieve the next page of results.
     *
     * @param nextToken The token to retrieve the next page of results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to retrieve the next page of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to retrieve the next page of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeTagsRequest> getDryRunRequest() {
        Request<DescribeTagsRequest> request = new DescribeTagsRequestMarshaller().marshall(this);
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
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTagsRequest == false) return false;
        DescribeTagsRequest other = (DescribeTagsRequest)obj;
        
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    