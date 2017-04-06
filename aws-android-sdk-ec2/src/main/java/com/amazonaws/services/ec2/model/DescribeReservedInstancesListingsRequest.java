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

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeReservedInstancesListings(DescribeReservedInstancesListingsRequest) DescribeReservedInstancesListings operation}.
 * <p>
 * Describes your account's Reserved Instance listings in the Reserved
 * Instance Marketplace.
 * </p>
 * <p>
 * The Reserved Instance Marketplace matches sellers who want to resell
 * Reserved Instance capacity that they no longer need with buyers who
 * want to purchase additional capacity. Reserved Instances bought and
 * sold through the Reserved Instance Marketplace work like any other
 * Reserved Instances.
 * </p>
 * <p>
 * As a seller, you choose to list some or all of your Reserved
 * Instances, and you specify the upfront price to receive for them. Your
 * Reserved Instances are then listed in the Reserved Instance
 * Marketplace and are available for purchase.
 * </p>
 * <p>
 * As a buyer, you specify the configuration of the Reserved Instance to
 * purchase, and the Marketplace matches what you're searching for with
 * what's available. The Marketplace first sells the lowest priced
 * Reserved Instances to you, and continues to sell available Reserved
 * Instance listings to you until your demand is met. You are charged
 * based on the total price of all of the listings that you purchase.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeReservedInstancesListings(DescribeReservedInstancesListingsRequest)
 */
public class DescribeReservedInstancesListingsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * One or more Reserved Instance IDs.
     */
    private String reservedInstancesId;

    /**
     * One or more Reserved Instance listing IDs.
     */
    private String reservedInstancesListingId;

    /**
     * One or more filters. <ul> <li> <p><code>reserved-instances-id</code> -
     * The ID of the Reserved Instances. </li> <li>
     * <p><code>reserved-instances-listing-id</code> - The ID of the Reserved
     * Instances listing. </li> <li> <p><code>status</code> - The status of
     * the Reserved Instance listing (<code>pending</code> |
     * <code>active</code> | <code>cancelled</code> | <code>closed</code>).
     * </li> <li> <p><code>status-message</code> - The reason for the status.
     * </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more Reserved Instance IDs.
     *
     * @return One or more Reserved Instance IDs.
     */
    public String getReservedInstancesId() {
        return reservedInstancesId;
    }
    
    /**
     * One or more Reserved Instance IDs.
     *
     * @param reservedInstancesId One or more Reserved Instance IDs.
     */
    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }
    
    /**
     * One or more Reserved Instance IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesId One or more Reserved Instance IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReservedInstancesListingsRequest withReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
        return this;
    }

    /**
     * One or more Reserved Instance listing IDs.
     *
     * @return One or more Reserved Instance listing IDs.
     */
    public String getReservedInstancesListingId() {
        return reservedInstancesListingId;
    }
    
    /**
     * One or more Reserved Instance listing IDs.
     *
     * @param reservedInstancesListingId One or more Reserved Instance listing IDs.
     */
    public void setReservedInstancesListingId(String reservedInstancesListingId) {
        this.reservedInstancesListingId = reservedInstancesListingId;
    }
    
    /**
     * One or more Reserved Instance listing IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesListingId One or more Reserved Instance listing IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReservedInstancesListingsRequest withReservedInstancesListingId(String reservedInstancesListingId) {
        this.reservedInstancesListingId = reservedInstancesListingId;
        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>reserved-instances-id</code> -
     * The ID of the Reserved Instances. </li> <li>
     * <p><code>reserved-instances-listing-id</code> - The ID of the Reserved
     * Instances listing. </li> <li> <p><code>status</code> - The status of
     * the Reserved Instance listing (<code>pending</code> |
     * <code>active</code> | <code>cancelled</code> | <code>closed</code>).
     * </li> <li> <p><code>status-message</code> - The reason for the status.
     * </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>reserved-instances-id</code> -
     *         The ID of the Reserved Instances. </li> <li>
     *         <p><code>reserved-instances-listing-id</code> - The ID of the Reserved
     *         Instances listing. </li> <li> <p><code>status</code> - The status of
     *         the Reserved Instance listing (<code>pending</code> |
     *         <code>active</code> | <code>cancelled</code> | <code>closed</code>).
     *         </li> <li> <p><code>status-message</code> - The reason for the status.
     *         </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>reserved-instances-id</code> -
     * The ID of the Reserved Instances. </li> <li>
     * <p><code>reserved-instances-listing-id</code> - The ID of the Reserved
     * Instances listing. </li> <li> <p><code>status</code> - The status of
     * the Reserved Instance listing (<code>pending</code> |
     * <code>active</code> | <code>cancelled</code> | <code>closed</code>).
     * </li> <li> <p><code>status-message</code> - The reason for the status.
     * </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>reserved-instances-id</code> -
     *         The ID of the Reserved Instances. </li> <li>
     *         <p><code>reserved-instances-listing-id</code> - The ID of the Reserved
     *         Instances listing. </li> <li> <p><code>status</code> - The status of
     *         the Reserved Instance listing (<code>pending</code> |
     *         <code>active</code> | <code>cancelled</code> | <code>closed</code>).
     *         </li> <li> <p><code>status-message</code> - The reason for the status.
     *         </li> </ul>
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
     * One or more filters. <ul> <li> <p><code>reserved-instances-id</code> -
     * The ID of the Reserved Instances. </li> <li>
     * <p><code>reserved-instances-listing-id</code> - The ID of the Reserved
     * Instances listing. </li> <li> <p><code>status</code> - The status of
     * the Reserved Instance listing (<code>pending</code> |
     * <code>active</code> | <code>cancelled</code> | <code>closed</code>).
     * </li> <li> <p><code>status-message</code> - The reason for the status.
     * </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>reserved-instances-id</code> -
     *         The ID of the Reserved Instances. </li> <li>
     *         <p><code>reserved-instances-listing-id</code> - The ID of the Reserved
     *         Instances listing. </li> <li> <p><code>status</code> - The status of
     *         the Reserved Instance listing (<code>pending</code> |
     *         <code>active</code> | <code>cancelled</code> | <code>closed</code>).
     *         </li> <li> <p><code>status-message</code> - The reason for the status.
     *         </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReservedInstancesListingsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>reserved-instances-id</code> -
     * The ID of the Reserved Instances. </li> <li>
     * <p><code>reserved-instances-listing-id</code> - The ID of the Reserved
     * Instances listing. </li> <li> <p><code>status</code> - The status of
     * the Reserved Instance listing (<code>pending</code> |
     * <code>active</code> | <code>cancelled</code> | <code>closed</code>).
     * </li> <li> <p><code>status-message</code> - The reason for the status.
     * </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>reserved-instances-id</code> -
     *         The ID of the Reserved Instances. </li> <li>
     *         <p><code>reserved-instances-listing-id</code> - The ID of the Reserved
     *         Instances listing. </li> <li> <p><code>status</code> - The status of
     *         the Reserved Instance listing (<code>pending</code> |
     *         <code>active</code> | <code>cancelled</code> | <code>closed</code>).
     *         </li> <li> <p><code>status-message</code> - The reason for the status.
     *         </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReservedInstancesListingsRequest withFilters(java.util.Collection<Filter> filters) {
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
        if (getReservedInstancesId() != null) sb.append("ReservedInstancesId: " + getReservedInstancesId() + ",");
        if (getReservedInstancesListingId() != null) sb.append("ReservedInstancesListingId: " + getReservedInstancesListingId() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode()); 
        hashCode = prime * hashCode + ((getReservedInstancesListingId() == null) ? 0 : getReservedInstancesListingId().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedInstancesListingsRequest == false) return false;
        DescribeReservedInstancesListingsRequest other = (DescribeReservedInstancesListingsRequest)obj;
        
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null) return false;
        if (other.getReservedInstancesId() != null && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false) return false; 
        if (other.getReservedInstancesListingId() == null ^ this.getReservedInstancesListingId() == null) return false;
        if (other.getReservedInstancesListingId() != null && other.getReservedInstancesListingId().equals(this.getReservedInstancesListingId()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    