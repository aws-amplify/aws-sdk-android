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
import com.amazonaws.services.ec2.model.transform.DescribeSpotPriceHistoryRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSpotPriceHistory(DescribeSpotPriceHistoryRequest) DescribeSpotPriceHistory operation}.
 * <p>
 * Describes the Spot price history. The prices returned are listed in
 * chronological order, from the oldest to the most recent, for up to the
 * past 90 days. For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-history.html"> Spot Instance Pricing History </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 * <p>
 * When you specify a start and end time, this operation returns the
 * prices of the instance types within the time range that you specified
 * and the time when the price changed. The price is valid within the
 * time period that you specified; the response merely indicates the last
 * time that the price changed.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSpotPriceHistory(DescribeSpotPriceHistoryRequest)
 */
public class DescribeSpotPriceHistoryRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeSpotPriceHistoryRequest> {

    /**
     * The date and time, up to the past 90 days, from which to start
     * retrieving the price history data, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    private java.util.Date startTime;

    /**
     * The date and time, up to the current date, from which to stop
     * retrieving the price history data, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    private java.util.Date endTime;

    /**
     * Filters the results by the specified instance types.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceTypes;

    /**
     * Filters the results by the specified basic product descriptions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> productDescriptions;

    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone for which prices should be returned. </li> <li>
     * <p><code>instance-type</code> - The type of instance (for example,
     * <code>m3.medium</code>). </li> <li>
     * <p><code>product-description</code> - The product description for the
     * Spot price (<code>Linux/UNIX</code> | <code>SUSE Linux</code> |
     * <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon
     * VPC)</code>). </li> <li> <p><code>spot-price</code> - The Spot price.
     * The value must match exactly (or use wildcards; greater than or less
     * than comparison is not supported). </li> <li>
     * <p><code>timestamp</code> - The timestamp of the Spot price history,
     * in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You
     * can use wildcards (* and ?). Greater than or less than comparison is
     * not supported. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * Filters the results by the specified Availability Zone.
     */
    private String availabilityZone;

    /**
     * The maximum number of results to return in a single call. Specify a
     * value between 1 and 1000. The default value is 1000. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     */
    private Integer maxResults;

    /**
     * The token for the next set of results.
     */
    private String nextToken;

    /**
     * The date and time, up to the past 90 days, from which to start
     * retrieving the price history data, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @return The date and time, up to the past 90 days, from which to start
     *         retrieving the price history data, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The date and time, up to the past 90 days, from which to start
     * retrieving the price history data, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @param startTime The date and time, up to the past 90 days, from which to start
     *         retrieving the price history data, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The date and time, up to the past 90 days, from which to start
     * retrieving the price history data, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The date and time, up to the past 90 days, from which to start
     *         retrieving the price history data, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The date and time, up to the current date, from which to stop
     * retrieving the price history data, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @return The date and time, up to the current date, from which to stop
     *         retrieving the price history data, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * The date and time, up to the current date, from which to stop
     * retrieving the price history data, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @param endTime The date and time, up to the current date, from which to stop
     *         retrieving the price history data, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * The date and time, up to the current date, from which to stop
     * retrieving the price history data, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime The date and time, up to the current date, from which to stop
     *         retrieving the price history data, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Filters the results by the specified instance types.
     *
     * @return Filters the results by the specified instance types.
     */
    public java.util.List<String> getInstanceTypes() {
        if (instanceTypes == null) {
              instanceTypes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceTypes.setAutoConstruct(true);
        }
        return instanceTypes;
    }
    
    /**
     * Filters the results by the specified instance types.
     *
     * @param instanceTypes Filters the results by the specified instance types.
     */
    public void setInstanceTypes(java.util.Collection<String> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceTypes.size());
        instanceTypesCopy.addAll(instanceTypes);
        this.instanceTypes = instanceTypesCopy;
    }
    
    /**
     * Filters the results by the specified instance types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceTypes Filters the results by the specified instance types.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withInstanceTypes(String... instanceTypes) {
        if (getInstanceTypes() == null) setInstanceTypes(new java.util.ArrayList<String>(instanceTypes.length));
        for (String value : instanceTypes) {
            getInstanceTypes().add(value);
        }
        return this;
    }
    
    /**
     * Filters the results by the specified instance types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceTypes Filters the results by the specified instance types.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withInstanceTypes(java.util.Collection<String> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceTypes.size());
            instanceTypesCopy.addAll(instanceTypes);
            this.instanceTypes = instanceTypesCopy;
        }

        return this;
    }

    /**
     * Filters the results by the specified instance types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceTypes Filters the results by the specified instance types.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withInstanceTypes(InstanceType... instanceTypes) {
        java.util.ArrayList<String> instanceTypesCopy = new java.util.ArrayList<String>(instanceTypes.length);
        for (InstanceType member : instanceTypes) {
            instanceTypesCopy.add(member.toString());
        }
        if (getInstanceTypes() == null) {
            setInstanceTypes(instanceTypesCopy);
        } else {
            getInstanceTypes().addAll(instanceTypesCopy);
        }
        return this;
    }

    /**
     * Filters the results by the specified basic product descriptions.
     *
     * @return Filters the results by the specified basic product descriptions.
     */
    public java.util.List<String> getProductDescriptions() {
        if (productDescriptions == null) {
              productDescriptions = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              productDescriptions.setAutoConstruct(true);
        }
        return productDescriptions;
    }
    
    /**
     * Filters the results by the specified basic product descriptions.
     *
     * @param productDescriptions Filters the results by the specified basic product descriptions.
     */
    public void setProductDescriptions(java.util.Collection<String> productDescriptions) {
        if (productDescriptions == null) {
            this.productDescriptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> productDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(productDescriptions.size());
        productDescriptionsCopy.addAll(productDescriptions);
        this.productDescriptions = productDescriptionsCopy;
    }
    
    /**
     * Filters the results by the specified basic product descriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescriptions Filters the results by the specified basic product descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withProductDescriptions(String... productDescriptions) {
        if (getProductDescriptions() == null) setProductDescriptions(new java.util.ArrayList<String>(productDescriptions.length));
        for (String value : productDescriptions) {
            getProductDescriptions().add(value);
        }
        return this;
    }
    
    /**
     * Filters the results by the specified basic product descriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescriptions Filters the results by the specified basic product descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withProductDescriptions(java.util.Collection<String> productDescriptions) {
        if (productDescriptions == null) {
            this.productDescriptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> productDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(productDescriptions.size());
            productDescriptionsCopy.addAll(productDescriptions);
            this.productDescriptions = productDescriptionsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone for which prices should be returned. </li> <li>
     * <p><code>instance-type</code> - The type of instance (for example,
     * <code>m3.medium</code>). </li> <li>
     * <p><code>product-description</code> - The product description for the
     * Spot price (<code>Linux/UNIX</code> | <code>SUSE Linux</code> |
     * <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon
     * VPC)</code>). </li> <li> <p><code>spot-price</code> - The Spot price.
     * The value must match exactly (or use wildcards; greater than or less
     * than comparison is not supported). </li> <li>
     * <p><code>timestamp</code> - The timestamp of the Spot price history,
     * in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You
     * can use wildcards (* and ?). Greater than or less than comparison is
     * not supported. </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone for which prices should be returned. </li> <li>
     *         <p><code>instance-type</code> - The type of instance (for example,
     *         <code>m3.medium</code>). </li> <li>
     *         <p><code>product-description</code> - The product description for the
     *         Spot price (<code>Linux/UNIX</code> | <code>SUSE Linux</code> |
     *         <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     *         <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon
     *         VPC)</code>). </li> <li> <p><code>spot-price</code> - The Spot price.
     *         The value must match exactly (or use wildcards; greater than or less
     *         than comparison is not supported). </li> <li>
     *         <p><code>timestamp</code> - The timestamp of the Spot price history,
     *         in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You
     *         can use wildcards (* and ?). Greater than or less than comparison is
     *         not supported. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone for which prices should be returned. </li> <li>
     * <p><code>instance-type</code> - The type of instance (for example,
     * <code>m3.medium</code>). </li> <li>
     * <p><code>product-description</code> - The product description for the
     * Spot price (<code>Linux/UNIX</code> | <code>SUSE Linux</code> |
     * <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon
     * VPC)</code>). </li> <li> <p><code>spot-price</code> - The Spot price.
     * The value must match exactly (or use wildcards; greater than or less
     * than comparison is not supported). </li> <li>
     * <p><code>timestamp</code> - The timestamp of the Spot price history,
     * in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You
     * can use wildcards (* and ?). Greater than or less than comparison is
     * not supported. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone for which prices should be returned. </li> <li>
     *         <p><code>instance-type</code> - The type of instance (for example,
     *         <code>m3.medium</code>). </li> <li>
     *         <p><code>product-description</code> - The product description for the
     *         Spot price (<code>Linux/UNIX</code> | <code>SUSE Linux</code> |
     *         <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     *         <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon
     *         VPC)</code>). </li> <li> <p><code>spot-price</code> - The Spot price.
     *         The value must match exactly (or use wildcards; greater than or less
     *         than comparison is not supported). </li> <li>
     *         <p><code>timestamp</code> - The timestamp of the Spot price history,
     *         in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You
     *         can use wildcards (* and ?). Greater than or less than comparison is
     *         not supported. </li> </ul>
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
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone for which prices should be returned. </li> <li>
     * <p><code>instance-type</code> - The type of instance (for example,
     * <code>m3.medium</code>). </li> <li>
     * <p><code>product-description</code> - The product description for the
     * Spot price (<code>Linux/UNIX</code> | <code>SUSE Linux</code> |
     * <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon
     * VPC)</code>). </li> <li> <p><code>spot-price</code> - The Spot price.
     * The value must match exactly (or use wildcards; greater than or less
     * than comparison is not supported). </li> <li>
     * <p><code>timestamp</code> - The timestamp of the Spot price history,
     * in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You
     * can use wildcards (* and ?). Greater than or less than comparison is
     * not supported. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone for which prices should be returned. </li> <li>
     *         <p><code>instance-type</code> - The type of instance (for example,
     *         <code>m3.medium</code>). </li> <li>
     *         <p><code>product-description</code> - The product description for the
     *         Spot price (<code>Linux/UNIX</code> | <code>SUSE Linux</code> |
     *         <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     *         <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon
     *         VPC)</code>). </li> <li> <p><code>spot-price</code> - The Spot price.
     *         The value must match exactly (or use wildcards; greater than or less
     *         than comparison is not supported). </li> <li>
     *         <p><code>timestamp</code> - The timestamp of the Spot price history,
     *         in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You
     *         can use wildcards (* and ?). Greater than or less than comparison is
     *         not supported. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone for which prices should be returned. </li> <li>
     * <p><code>instance-type</code> - The type of instance (for example,
     * <code>m3.medium</code>). </li> <li>
     * <p><code>product-description</code> - The product description for the
     * Spot price (<code>Linux/UNIX</code> | <code>SUSE Linux</code> |
     * <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     * <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon
     * VPC)</code>). </li> <li> <p><code>spot-price</code> - The Spot price.
     * The value must match exactly (or use wildcards; greater than or less
     * than comparison is not supported). </li> <li>
     * <p><code>timestamp</code> - The timestamp of the Spot price history,
     * in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You
     * can use wildcards (* and ?). Greater than or less than comparison is
     * not supported. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone for which prices should be returned. </li> <li>
     *         <p><code>instance-type</code> - The type of instance (for example,
     *         <code>m3.medium</code>). </li> <li>
     *         <p><code>product-description</code> - The product description for the
     *         Spot price (<code>Linux/UNIX</code> | <code>SUSE Linux</code> |
     *         <code>Windows</code> | <code>Linux/UNIX (Amazon VPC)</code> |
     *         <code>SUSE Linux (Amazon VPC)</code> | <code>Windows (Amazon
     *         VPC)</code>). </li> <li> <p><code>spot-price</code> - The Spot price.
     *         The value must match exactly (or use wildcards; greater than or less
     *         than comparison is not supported). </li> <li>
     *         <p><code>timestamp</code> - The timestamp of the Spot price history,
     *         in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). You
     *         can use wildcards (* and ?). Greater than or less than comparison is
     *         not supported. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withFilters(java.util.Collection<Filter> filters) {
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
     * Filters the results by the specified Availability Zone.
     *
     * @return Filters the results by the specified Availability Zone.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * Filters the results by the specified Availability Zone.
     *
     * @param availabilityZone Filters the results by the specified Availability Zone.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * Filters the results by the specified Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone Filters the results by the specified Availability Zone.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The maximum number of results to return in a single call. Specify a
     * value between 1 and 1000. The default value is 1000. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     *
     * @return The maximum number of results to return in a single call. Specify a
     *         value between 1 and 1000. The default value is 1000. To retrieve the
     *         remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results to return in a single call. Specify a
     * value between 1 and 1000. The default value is 1000. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     *
     * @param maxResults The maximum number of results to return in a single call. Specify a
     *         value between 1 and 1000. The default value is 1000. To retrieve the
     *         remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results to return in a single call. Specify a
     * value between 1 and 1000. The default value is 1000. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of results to return in a single call. Specify a
     *         value between 1 and 1000. The default value is 1000. To retrieve the
     *         remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * The token for the next set of results.
     *
     * @return The token for the next set of results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token for the next set of results.
     *
     * @param nextToken The token for the next set of results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token for the next set of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token for the next set of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeSpotPriceHistoryRequest> getDryRunRequest() {
        Request<DescribeSpotPriceHistoryRequest> request = new DescribeSpotPriceHistoryRequestMarshaller().marshall(this);
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
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getInstanceTypes() != null) sb.append("InstanceTypes: " + getInstanceTypes() + ",");
        if (getProductDescriptions() != null) sb.append("ProductDescriptions: " + getProductDescriptions() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode()); 
        hashCode = prime * hashCode + ((getProductDescriptions() == null) ? 0 : getProductDescriptions().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSpotPriceHistoryRequest == false) return false;
        DescribeSpotPriceHistoryRequest other = (DescribeSpotPriceHistoryRequest)obj;
        
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null) return false;
        if (other.getInstanceTypes() != null && other.getInstanceTypes().equals(this.getInstanceTypes()) == false) return false; 
        if (other.getProductDescriptions() == null ^ this.getProductDescriptions() == null) return false;
        if (other.getProductDescriptions() != null && other.getProductDescriptions().equals(this.getProductDescriptions()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    