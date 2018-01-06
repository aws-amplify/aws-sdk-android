/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeReservedInstancesOfferingsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeReservedInstancesOfferings(DescribeReservedInstancesOfferingsRequest) DescribeReservedInstancesOfferings operation}.
 * <p>
 * Describes Reserved Instance offerings that are available for purchase.
 * With Reserved Instances, you purchase the right to launch instances
 * for a period of time. During that time period, you do not receive
 * insufficient capacity errors, and you pay a lower usage rate than the
 * rate charged for On-Demand instances for the actual time used.
 * </p>
 * <p>
 * If you have listed your own Reserved Instances for sale in the
 * Reserved Instance Marketplace, they will be excluded from these
 * results. This is to ensure that you do not purchase your own Reserved
 * Instances.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeReservedInstancesOfferings(DescribeReservedInstancesOfferingsRequest)
 */
public class DescribeReservedInstancesOfferingsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeReservedInstancesOfferingsRequest> {

    /**
     * One or more Reserved Instances offering IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesOfferingIds;

    /**
     * The instance type that the reservation will cover (for example,
     * <code>m1.small</code>). For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, x1.4xlarge, x1.8xlarge, x1.16xlarge, x1.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge, cg1.4xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     */
    private String instanceType;

    /**
     * The Availability Zone in which the Reserved Instance can be used.
     */
    private String availabilityZone;

    /**
     * The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the description are for use with
     * Amazon VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     */
    private String productDescription;

    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone where the Reserved Instance can be used. </li> <li>
     * <p><code>duration</code> - The duration of the Reserved Instance (for
     * example, one year or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>). </li> <li> <p><code>fixed-price</code> - The
     * purchase price of the Reserved Instance (for example, 9800.0). </li>
     * <li> <p><code>instance-type</code> - The instance type that is covered
     * by the reservation. </li> <li> <p><code>marketplace</code> - Set to
     * <code>true</code> to show only Reserved Instance Marketplace
     * offerings. When this filter is not used, which is the default
     * behavior, all offerings from both AWS and the Reserved Instance
     * Marketplace are listed. </li> <li> <p><code>product-description</code>
     * - The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the product platform description
     * will only be displayed to EC2-Classic account holders and are for use
     * with Amazon VPC. (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     * VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon
     * VPC)</code> | <code>Red Hat Enterprise Linux</code> | <code>Red Hat
     * Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> |
     * <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server
     * Standard</code> | <code>Windows with SQL Server Standard (Amazon
     * VPC)</code> | <code>Windows with SQL Server Web</code> | <code>
     * Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with
     * SQL Server Enterprise</code> | <code>Windows with SQL Server
     * Enterprise (Amazon VPC)</code>) </li> <li>
     * <p><code>reserved-instances-offering-id</code> - The Reserved
     * Instances offering ID. </li> <li> <p><code>usage-price</code> - The
     * usage price of the Reserved Instance, per hour (for example, 0.84).
     * </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The tenancy of the instances covered by the reservation. A Reserved
     * Instance with a tenancy of <code>dedicated</code> is applied to
     * instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     * Instances). <p>Default: <code>default</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     */
    private String instanceTenancy;

    /**
     * The Reserved Instance offering type. If you are using tools that
     * predate the 2011-11-01 API version, you only have access to the
     * <code>Medium Utilization</code> Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization, No Upfront, Partial Upfront, All Upfront
     */
    private String offeringType;

    /**
     * The token to retrieve the next page of results.
     */
    private String nextToken;

    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code>
     * value. The maximum is 100. <p>Default: 100
     */
    private Integer maxResults;

    /**
     * Include Reserved Instance Marketplace offerings in the response.
     */
    private Boolean includeMarketplace;

    /**
     * The minimum duration (in seconds) to filter when searching for
     * offerings. <p>Default: 2592000 (1 month)
     */
    private Long minDuration;

    /**
     * The maximum duration (in seconds) to filter when searching for
     * offerings. <p>Default: 94608000 (3 years)
     */
    private Long maxDuration;

    /**
     * The maximum number of instances to filter when searching for
     * offerings. <p>Default: 20
     */
    private Integer maxInstanceCount;

    /**
     * One or more Reserved Instances offering IDs.
     *
     * @return One or more Reserved Instances offering IDs.
     */
    public java.util.List<String> getReservedInstancesOfferingIds() {
        if (reservedInstancesOfferingIds == null) {
              reservedInstancesOfferingIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              reservedInstancesOfferingIds.setAutoConstruct(true);
        }
        return reservedInstancesOfferingIds;
    }
    
    /**
     * One or more Reserved Instances offering IDs.
     *
     * @param reservedInstancesOfferingIds One or more Reserved Instances offering IDs.
     */
    public void setReservedInstancesOfferingIds(java.util.Collection<String> reservedInstancesOfferingIds) {
        if (reservedInstancesOfferingIds == null) {
            this.reservedInstancesOfferingIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesOfferingIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(reservedInstancesOfferingIds.size());
        reservedInstancesOfferingIdsCopy.addAll(reservedInstancesOfferingIds);
        this.reservedInstancesOfferingIds = reservedInstancesOfferingIdsCopy;
    }
    
    /**
     * One or more Reserved Instances offering IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesOfferingIds One or more Reserved Instances offering IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withReservedInstancesOfferingIds(String... reservedInstancesOfferingIds) {
        if (getReservedInstancesOfferingIds() == null) setReservedInstancesOfferingIds(new java.util.ArrayList<String>(reservedInstancesOfferingIds.length));
        for (String value : reservedInstancesOfferingIds) {
            getReservedInstancesOfferingIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more Reserved Instances offering IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesOfferingIds One or more Reserved Instances offering IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withReservedInstancesOfferingIds(java.util.Collection<String> reservedInstancesOfferingIds) {
        if (reservedInstancesOfferingIds == null) {
            this.reservedInstancesOfferingIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> reservedInstancesOfferingIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(reservedInstancesOfferingIds.size());
            reservedInstancesOfferingIdsCopy.addAll(reservedInstancesOfferingIds);
            this.reservedInstancesOfferingIds = reservedInstancesOfferingIdsCopy;
        }

        return this;
    }

    /**
     * The instance type that the reservation will cover (for example,
     * <code>m1.small</code>). For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, x1.4xlarge, x1.8xlarge, x1.16xlarge, x1.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge, cg1.4xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @return The instance type that the reservation will cover (for example,
     *         <code>m1.small</code>). For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type that the reservation will cover (for example,
     * <code>m1.small</code>). For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, x1.4xlarge, x1.8xlarge, x1.16xlarge, x1.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge, cg1.4xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type that the reservation will cover (for example,
     *         <code>m1.small</code>). For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type that the reservation will cover (for example,
     * <code>m1.small</code>). For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, x1.4xlarge, x1.8xlarge, x1.16xlarge, x1.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge, cg1.4xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type that the reservation will cover (for example,
     *         <code>m1.small</code>). For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InstanceType
     */
    public DescribeReservedInstancesOfferingsRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * The instance type that the reservation will cover (for example,
     * <code>m1.small</code>). For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, x1.4xlarge, x1.8xlarge, x1.16xlarge, x1.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge, cg1.4xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type that the reservation will cover (for example,
     *         <code>m1.small</code>). For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }
    
    /**
     * The instance type that the reservation will cover (for example,
     * <code>m1.small</code>). For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, x1.4xlarge, x1.8xlarge, x1.16xlarge, x1.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge, cg1.4xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type that the reservation will cover (for example,
     *         <code>m1.small</code>). For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InstanceType
     */
    public DescribeReservedInstancesOfferingsRequest withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * The Availability Zone in which the Reserved Instance can be used.
     *
     * @return The Availability Zone in which the Reserved Instance can be used.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone in which the Reserved Instance can be used.
     *
     * @param availabilityZone The Availability Zone in which the Reserved Instance can be used.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone in which the Reserved Instance can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone in which the Reserved Instance can be used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the description are for use with
     * Amazon VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @return The Reserved Instance product platform description. Instances that
     *         include <code>(Amazon VPC)</code> in the description are for use with
     *         Amazon VPC.
     *
     * @see RIProductDescription
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the description are for use with
     * Amazon VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The Reserved Instance product platform description. Instances that
     *         include <code>(Amazon VPC)</code> in the description are for use with
     *         Amazon VPC.
     *
     * @see RIProductDescription
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the description are for use with
     * Amazon VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The Reserved Instance product platform description. Instances that
     *         include <code>(Amazon VPC)</code> in the description are for use with
     *         Amazon VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RIProductDescription
     */
    public DescribeReservedInstancesOfferingsRequest withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the description are for use with
     * Amazon VPC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The Reserved Instance product platform description. Instances that
     *         include <code>(Amazon VPC)</code> in the description are for use with
     *         Amazon VPC.
     *
     * @see RIProductDescription
     */
    public void setProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
    }
    
    /**
     * The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the description are for use with
     * Amazon VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The Reserved Instance product platform description. Instances that
     *         include <code>(Amazon VPC)</code> in the description are for use with
     *         Amazon VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RIProductDescription
     */
    public DescribeReservedInstancesOfferingsRequest withProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone where the Reserved Instance can be used. </li> <li>
     * <p><code>duration</code> - The duration of the Reserved Instance (for
     * example, one year or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>). </li> <li> <p><code>fixed-price</code> - The
     * purchase price of the Reserved Instance (for example, 9800.0). </li>
     * <li> <p><code>instance-type</code> - The instance type that is covered
     * by the reservation. </li> <li> <p><code>marketplace</code> - Set to
     * <code>true</code> to show only Reserved Instance Marketplace
     * offerings. When this filter is not used, which is the default
     * behavior, all offerings from both AWS and the Reserved Instance
     * Marketplace are listed. </li> <li> <p><code>product-description</code>
     * - The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the product platform description
     * will only be displayed to EC2-Classic account holders and are for use
     * with Amazon VPC. (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     * VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon
     * VPC)</code> | <code>Red Hat Enterprise Linux</code> | <code>Red Hat
     * Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> |
     * <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server
     * Standard</code> | <code>Windows with SQL Server Standard (Amazon
     * VPC)</code> | <code>Windows with SQL Server Web</code> | <code>
     * Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with
     * SQL Server Enterprise</code> | <code>Windows with SQL Server
     * Enterprise (Amazon VPC)</code>) </li> <li>
     * <p><code>reserved-instances-offering-id</code> - The Reserved
     * Instances offering ID. </li> <li> <p><code>usage-price</code> - The
     * usage price of the Reserved Instance, per hour (for example, 0.84).
     * </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone where the Reserved Instance can be used. </li> <li>
     *         <p><code>duration</code> - The duration of the Reserved Instance (for
     *         example, one year or three years), in seconds (<code>31536000</code> |
     *         <code>94608000</code>). </li> <li> <p><code>fixed-price</code> - The
     *         purchase price of the Reserved Instance (for example, 9800.0). </li>
     *         <li> <p><code>instance-type</code> - The instance type that is covered
     *         by the reservation. </li> <li> <p><code>marketplace</code> - Set to
     *         <code>true</code> to show only Reserved Instance Marketplace
     *         offerings. When this filter is not used, which is the default
     *         behavior, all offerings from both AWS and the Reserved Instance
     *         Marketplace are listed. </li> <li> <p><code>product-description</code>
     *         - The Reserved Instance product platform description. Instances that
     *         include <code>(Amazon VPC)</code> in the product platform description
     *         will only be displayed to EC2-Classic account holders and are for use
     *         with Amazon VPC. (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     *         VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon
     *         VPC)</code> | <code>Red Hat Enterprise Linux</code> | <code>Red Hat
     *         Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> |
     *         <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server
     *         Standard</code> | <code>Windows with SQL Server Standard (Amazon
     *         VPC)</code> | <code>Windows with SQL Server Web</code> | <code>
     *         Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with
     *         SQL Server Enterprise</code> | <code>Windows with SQL Server
     *         Enterprise (Amazon VPC)</code>) </li> <li>
     *         <p><code>reserved-instances-offering-id</code> - The Reserved
     *         Instances offering ID. </li> <li> <p><code>usage-price</code> - The
     *         usage price of the Reserved Instance, per hour (for example, 0.84).
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
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone where the Reserved Instance can be used. </li> <li>
     * <p><code>duration</code> - The duration of the Reserved Instance (for
     * example, one year or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>). </li> <li> <p><code>fixed-price</code> - The
     * purchase price of the Reserved Instance (for example, 9800.0). </li>
     * <li> <p><code>instance-type</code> - The instance type that is covered
     * by the reservation. </li> <li> <p><code>marketplace</code> - Set to
     * <code>true</code> to show only Reserved Instance Marketplace
     * offerings. When this filter is not used, which is the default
     * behavior, all offerings from both AWS and the Reserved Instance
     * Marketplace are listed. </li> <li> <p><code>product-description</code>
     * - The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the product platform description
     * will only be displayed to EC2-Classic account holders and are for use
     * with Amazon VPC. (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     * VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon
     * VPC)</code> | <code>Red Hat Enterprise Linux</code> | <code>Red Hat
     * Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> |
     * <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server
     * Standard</code> | <code>Windows with SQL Server Standard (Amazon
     * VPC)</code> | <code>Windows with SQL Server Web</code> | <code>
     * Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with
     * SQL Server Enterprise</code> | <code>Windows with SQL Server
     * Enterprise (Amazon VPC)</code>) </li> <li>
     * <p><code>reserved-instances-offering-id</code> - The Reserved
     * Instances offering ID. </li> <li> <p><code>usage-price</code> - The
     * usage price of the Reserved Instance, per hour (for example, 0.84).
     * </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone where the Reserved Instance can be used. </li> <li>
     *         <p><code>duration</code> - The duration of the Reserved Instance (for
     *         example, one year or three years), in seconds (<code>31536000</code> |
     *         <code>94608000</code>). </li> <li> <p><code>fixed-price</code> - The
     *         purchase price of the Reserved Instance (for example, 9800.0). </li>
     *         <li> <p><code>instance-type</code> - The instance type that is covered
     *         by the reservation. </li> <li> <p><code>marketplace</code> - Set to
     *         <code>true</code> to show only Reserved Instance Marketplace
     *         offerings. When this filter is not used, which is the default
     *         behavior, all offerings from both AWS and the Reserved Instance
     *         Marketplace are listed. </li> <li> <p><code>product-description</code>
     *         - The Reserved Instance product platform description. Instances that
     *         include <code>(Amazon VPC)</code> in the product platform description
     *         will only be displayed to EC2-Classic account holders and are for use
     *         with Amazon VPC. (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     *         VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon
     *         VPC)</code> | <code>Red Hat Enterprise Linux</code> | <code>Red Hat
     *         Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> |
     *         <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server
     *         Standard</code> | <code>Windows with SQL Server Standard (Amazon
     *         VPC)</code> | <code>Windows with SQL Server Web</code> | <code>
     *         Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with
     *         SQL Server Enterprise</code> | <code>Windows with SQL Server
     *         Enterprise (Amazon VPC)</code>) </li> <li>
     *         <p><code>reserved-instances-offering-id</code> - The Reserved
     *         Instances offering ID. </li> <li> <p><code>usage-price</code> - The
     *         usage price of the Reserved Instance, per hour (for example, 0.84).
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
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone where the Reserved Instance can be used. </li> <li>
     * <p><code>duration</code> - The duration of the Reserved Instance (for
     * example, one year or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>). </li> <li> <p><code>fixed-price</code> - The
     * purchase price of the Reserved Instance (for example, 9800.0). </li>
     * <li> <p><code>instance-type</code> - The instance type that is covered
     * by the reservation. </li> <li> <p><code>marketplace</code> - Set to
     * <code>true</code> to show only Reserved Instance Marketplace
     * offerings. When this filter is not used, which is the default
     * behavior, all offerings from both AWS and the Reserved Instance
     * Marketplace are listed. </li> <li> <p><code>product-description</code>
     * - The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the product platform description
     * will only be displayed to EC2-Classic account holders and are for use
     * with Amazon VPC. (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     * VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon
     * VPC)</code> | <code>Red Hat Enterprise Linux</code> | <code>Red Hat
     * Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> |
     * <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server
     * Standard</code> | <code>Windows with SQL Server Standard (Amazon
     * VPC)</code> | <code>Windows with SQL Server Web</code> | <code>
     * Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with
     * SQL Server Enterprise</code> | <code>Windows with SQL Server
     * Enterprise (Amazon VPC)</code>) </li> <li>
     * <p><code>reserved-instances-offering-id</code> - The Reserved
     * Instances offering ID. </li> <li> <p><code>usage-price</code> - The
     * usage price of the Reserved Instance, per hour (for example, 0.84).
     * </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone where the Reserved Instance can be used. </li> <li>
     *         <p><code>duration</code> - The duration of the Reserved Instance (for
     *         example, one year or three years), in seconds (<code>31536000</code> |
     *         <code>94608000</code>). </li> <li> <p><code>fixed-price</code> - The
     *         purchase price of the Reserved Instance (for example, 9800.0). </li>
     *         <li> <p><code>instance-type</code> - The instance type that is covered
     *         by the reservation. </li> <li> <p><code>marketplace</code> - Set to
     *         <code>true</code> to show only Reserved Instance Marketplace
     *         offerings. When this filter is not used, which is the default
     *         behavior, all offerings from both AWS and the Reserved Instance
     *         Marketplace are listed. </li> <li> <p><code>product-description</code>
     *         - The Reserved Instance product platform description. Instances that
     *         include <code>(Amazon VPC)</code> in the product platform description
     *         will only be displayed to EC2-Classic account holders and are for use
     *         with Amazon VPC. (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     *         VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon
     *         VPC)</code> | <code>Red Hat Enterprise Linux</code> | <code>Red Hat
     *         Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> |
     *         <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server
     *         Standard</code> | <code>Windows with SQL Server Standard (Amazon
     *         VPC)</code> | <code>Windows with SQL Server Web</code> | <code>
     *         Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with
     *         SQL Server Enterprise</code> | <code>Windows with SQL Server
     *         Enterprise (Amazon VPC)</code>) </li> <li>
     *         <p><code>reserved-instances-offering-id</code> - The Reserved
     *         Instances offering ID. </li> <li> <p><code>usage-price</code> - The
     *         usage price of the Reserved Instance, per hour (for example, 0.84).
     *         </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     * Availability Zone where the Reserved Instance can be used. </li> <li>
     * <p><code>duration</code> - The duration of the Reserved Instance (for
     * example, one year or three years), in seconds (<code>31536000</code> |
     * <code>94608000</code>). </li> <li> <p><code>fixed-price</code> - The
     * purchase price of the Reserved Instance (for example, 9800.0). </li>
     * <li> <p><code>instance-type</code> - The instance type that is covered
     * by the reservation. </li> <li> <p><code>marketplace</code> - Set to
     * <code>true</code> to show only Reserved Instance Marketplace
     * offerings. When this filter is not used, which is the default
     * behavior, all offerings from both AWS and the Reserved Instance
     * Marketplace are listed. </li> <li> <p><code>product-description</code>
     * - The Reserved Instance product platform description. Instances that
     * include <code>(Amazon VPC)</code> in the product platform description
     * will only be displayed to EC2-Classic account holders and are for use
     * with Amazon VPC. (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     * VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon
     * VPC)</code> | <code>Red Hat Enterprise Linux</code> | <code>Red Hat
     * Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> |
     * <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server
     * Standard</code> | <code>Windows with SQL Server Standard (Amazon
     * VPC)</code> | <code>Windows with SQL Server Web</code> | <code>
     * Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with
     * SQL Server Enterprise</code> | <code>Windows with SQL Server
     * Enterprise (Amazon VPC)</code>) </li> <li>
     * <p><code>reserved-instances-offering-id</code> - The Reserved
     * Instances offering ID. </li> <li> <p><code>usage-price</code> - The
     * usage price of the Reserved Instance, per hour (for example, 0.84).
     * </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone</code> - The
     *         Availability Zone where the Reserved Instance can be used. </li> <li>
     *         <p><code>duration</code> - The duration of the Reserved Instance (for
     *         example, one year or three years), in seconds (<code>31536000</code> |
     *         <code>94608000</code>). </li> <li> <p><code>fixed-price</code> - The
     *         purchase price of the Reserved Instance (for example, 9800.0). </li>
     *         <li> <p><code>instance-type</code> - The instance type that is covered
     *         by the reservation. </li> <li> <p><code>marketplace</code> - Set to
     *         <code>true</code> to show only Reserved Instance Marketplace
     *         offerings. When this filter is not used, which is the default
     *         behavior, all offerings from both AWS and the Reserved Instance
     *         Marketplace are listed. </li> <li> <p><code>product-description</code>
     *         - The Reserved Instance product platform description. Instances that
     *         include <code>(Amazon VPC)</code> in the product platform description
     *         will only be displayed to EC2-Classic account holders and are for use
     *         with Amazon VPC. (<code>Linux/UNIX</code> | <code>Linux/UNIX (Amazon
     *         VPC)</code> | <code>SUSE Linux</code> | <code>SUSE Linux (Amazon
     *         VPC)</code> | <code>Red Hat Enterprise Linux</code> | <code>Red Hat
     *         Enterprise Linux (Amazon VPC)</code> | <code>Windows</code> |
     *         <code>Windows (Amazon VPC)</code> | <code>Windows with SQL Server
     *         Standard</code> | <code>Windows with SQL Server Standard (Amazon
     *         VPC)</code> | <code>Windows with SQL Server Web</code> | <code>
     *         Windows with SQL Server Web (Amazon VPC)</code> | <code>Windows with
     *         SQL Server Enterprise</code> | <code>Windows with SQL Server
     *         Enterprise (Amazon VPC)</code>) </li> <li>
     *         <p><code>reserved-instances-offering-id</code> - The Reserved
     *         Instances offering ID. </li> <li> <p><code>usage-price</code> - The
     *         usage price of the Reserved Instance, per hour (for example, 0.84).
     *         </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withFilters(java.util.Collection<Filter> filters) {
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
     * The tenancy of the instances covered by the reservation. A Reserved
     * Instance with a tenancy of <code>dedicated</code> is applied to
     * instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     * Instances). <p>Default: <code>default</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @return The tenancy of the instances covered by the reservation. A Reserved
     *         Instance with a tenancy of <code>dedicated</code> is applied to
     *         instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     *         Instances). <p>Default: <code>default</code>
     *
     * @see Tenancy
     */
    public String getInstanceTenancy() {
        return instanceTenancy;
    }
    
    /**
     * The tenancy of the instances covered by the reservation. A Reserved
     * Instance with a tenancy of <code>dedicated</code> is applied to
     * instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     * Instances). <p>Default: <code>default</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy The tenancy of the instances covered by the reservation. A Reserved
     *         Instance with a tenancy of <code>dedicated</code> is applied to
     *         instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     *         Instances). <p>Default: <code>default</code>
     *
     * @see Tenancy
     */
    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }
    
    /**
     * The tenancy of the instances covered by the reservation. A Reserved
     * Instance with a tenancy of <code>dedicated</code> is applied to
     * instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     * Instances). <p>Default: <code>default</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy The tenancy of the instances covered by the reservation. A Reserved
     *         Instance with a tenancy of <code>dedicated</code> is applied to
     *         instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     *         Instances). <p>Default: <code>default</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Tenancy
     */
    public DescribeReservedInstancesOfferingsRequest withInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
        return this;
    }

    /**
     * The tenancy of the instances covered by the reservation. A Reserved
     * Instance with a tenancy of <code>dedicated</code> is applied to
     * instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     * Instances). <p>Default: <code>default</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy The tenancy of the instances covered by the reservation. A Reserved
     *         Instance with a tenancy of <code>dedicated</code> is applied to
     *         instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     *         Instances). <p>Default: <code>default</code>
     *
     * @see Tenancy
     */
    public void setInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
    }
    
    /**
     * The tenancy of the instances covered by the reservation. A Reserved
     * Instance with a tenancy of <code>dedicated</code> is applied to
     * instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     * Instances). <p>Default: <code>default</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy The tenancy of the instances covered by the reservation. A Reserved
     *         Instance with a tenancy of <code>dedicated</code> is applied to
     *         instances that run in a VPC on single-tenant hardware (i.e., Dedicated
     *         Instances). <p>Default: <code>default</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Tenancy
     */
    public DescribeReservedInstancesOfferingsRequest withInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
        return this;
    }

    /**
     * The Reserved Instance offering type. If you are using tools that
     * predate the 2011-11-01 API version, you only have access to the
     * <code>Medium Utilization</code> Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @return The Reserved Instance offering type. If you are using tools that
     *         predate the 2011-11-01 API version, you only have access to the
     *         <code>Medium Utilization</code> Reserved Instance offering type.
     *
     * @see OfferingTypeValues
     */
    public String getOfferingType() {
        return offeringType;
    }
    
    /**
     * The Reserved Instance offering type. If you are using tools that
     * predate the 2011-11-01 API version, you only have access to the
     * <code>Medium Utilization</code> Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @param offeringType The Reserved Instance offering type. If you are using tools that
     *         predate the 2011-11-01 API version, you only have access to the
     *         <code>Medium Utilization</code> Reserved Instance offering type.
     *
     * @see OfferingTypeValues
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }
    
    /**
     * The Reserved Instance offering type. If you are using tools that
     * predate the 2011-11-01 API version, you only have access to the
     * <code>Medium Utilization</code> Reserved Instance offering type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @param offeringType The Reserved Instance offering type. If you are using tools that
     *         predate the 2011-11-01 API version, you only have access to the
     *         <code>Medium Utilization</code> Reserved Instance offering type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see OfferingTypeValues
     */
    public DescribeReservedInstancesOfferingsRequest withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * The Reserved Instance offering type. If you are using tools that
     * predate the 2011-11-01 API version, you only have access to the
     * <code>Medium Utilization</code> Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @param offeringType The Reserved Instance offering type. If you are using tools that
     *         predate the 2011-11-01 API version, you only have access to the
     *         <code>Medium Utilization</code> Reserved Instance offering type.
     *
     * @see OfferingTypeValues
     */
    public void setOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
    }
    
    /**
     * The Reserved Instance offering type. If you are using tools that
     * predate the 2011-11-01 API version, you only have access to the
     * <code>Medium Utilization</code> Reserved Instance offering type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @param offeringType The Reserved Instance offering type. If you are using tools that
     *         predate the 2011-11-01 API version, you only have access to the
     *         <code>Medium Utilization</code> Reserved Instance offering type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see OfferingTypeValues
     */
    public DescribeReservedInstancesOfferingsRequest withOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
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
    public DescribeReservedInstancesOfferingsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code>
     * value. The maximum is 100. <p>Default: 100
     *
     * @return The maximum number of results to return for the request in a single
     *         page. The remaining results of the initial request can be seen by
     *         sending another request with the returned <code>NextToken</code>
     *         value. The maximum is 100. <p>Default: 100
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code>
     * value. The maximum is 100. <p>Default: 100
     *
     * @param maxResults The maximum number of results to return for the request in a single
     *         page. The remaining results of the initial request can be seen by
     *         sending another request with the returned <code>NextToken</code>
     *         value. The maximum is 100. <p>Default: 100
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code>
     * value. The maximum is 100. <p>Default: 100
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of results to return for the request in a single
     *         page. The remaining results of the initial request can be seen by
     *         sending another request with the returned <code>NextToken</code>
     *         value. The maximum is 100. <p>Default: 100
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Include Reserved Instance Marketplace offerings in the response.
     *
     * @return Include Reserved Instance Marketplace offerings in the response.
     */
    public Boolean isIncludeMarketplace() {
        return includeMarketplace;
    }
    
    /**
     * Include Reserved Instance Marketplace offerings in the response.
     *
     * @param includeMarketplace Include Reserved Instance Marketplace offerings in the response.
     */
    public void setIncludeMarketplace(Boolean includeMarketplace) {
        this.includeMarketplace = includeMarketplace;
    }
    
    /**
     * Include Reserved Instance Marketplace offerings in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeMarketplace Include Reserved Instance Marketplace offerings in the response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withIncludeMarketplace(Boolean includeMarketplace) {
        this.includeMarketplace = includeMarketplace;
        return this;
    }

    /**
     * Include Reserved Instance Marketplace offerings in the response.
     *
     * @return Include Reserved Instance Marketplace offerings in the response.
     */
    public Boolean getIncludeMarketplace() {
        return includeMarketplace;
    }

    /**
     * The minimum duration (in seconds) to filter when searching for
     * offerings. <p>Default: 2592000 (1 month)
     *
     * @return The minimum duration (in seconds) to filter when searching for
     *         offerings. <p>Default: 2592000 (1 month)
     */
    public Long getMinDuration() {
        return minDuration;
    }
    
    /**
     * The minimum duration (in seconds) to filter when searching for
     * offerings. <p>Default: 2592000 (1 month)
     *
     * @param minDuration The minimum duration (in seconds) to filter when searching for
     *         offerings. <p>Default: 2592000 (1 month)
     */
    public void setMinDuration(Long minDuration) {
        this.minDuration = minDuration;
    }
    
    /**
     * The minimum duration (in seconds) to filter when searching for
     * offerings. <p>Default: 2592000 (1 month)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minDuration The minimum duration (in seconds) to filter when searching for
     *         offerings. <p>Default: 2592000 (1 month)
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withMinDuration(Long minDuration) {
        this.minDuration = minDuration;
        return this;
    }

    /**
     * The maximum duration (in seconds) to filter when searching for
     * offerings. <p>Default: 94608000 (3 years)
     *
     * @return The maximum duration (in seconds) to filter when searching for
     *         offerings. <p>Default: 94608000 (3 years)
     */
    public Long getMaxDuration() {
        return maxDuration;
    }
    
    /**
     * The maximum duration (in seconds) to filter when searching for
     * offerings. <p>Default: 94608000 (3 years)
     *
     * @param maxDuration The maximum duration (in seconds) to filter when searching for
     *         offerings. <p>Default: 94608000 (3 years)
     */
    public void setMaxDuration(Long maxDuration) {
        this.maxDuration = maxDuration;
    }
    
    /**
     * The maximum duration (in seconds) to filter when searching for
     * offerings. <p>Default: 94608000 (3 years)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxDuration The maximum duration (in seconds) to filter when searching for
     *         offerings. <p>Default: 94608000 (3 years)
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withMaxDuration(Long maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    /**
     * The maximum number of instances to filter when searching for
     * offerings. <p>Default: 20
     *
     * @return The maximum number of instances to filter when searching for
     *         offerings. <p>Default: 20
     */
    public Integer getMaxInstanceCount() {
        return maxInstanceCount;
    }
    
    /**
     * The maximum number of instances to filter when searching for
     * offerings. <p>Default: 20
     *
     * @param maxInstanceCount The maximum number of instances to filter when searching for
     *         offerings. <p>Default: 20
     */
    public void setMaxInstanceCount(Integer maxInstanceCount) {
        this.maxInstanceCount = maxInstanceCount;
    }
    
    /**
     * The maximum number of instances to filter when searching for
     * offerings. <p>Default: 20
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxInstanceCount The maximum number of instances to filter when searching for
     *         offerings. <p>Default: 20
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeReservedInstancesOfferingsRequest withMaxInstanceCount(Integer maxInstanceCount) {
        this.maxInstanceCount = maxInstanceCount;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeReservedInstancesOfferingsRequest> getDryRunRequest() {
        Request<DescribeReservedInstancesOfferingsRequest> request = new DescribeReservedInstancesOfferingsRequestMarshaller().marshall(this);
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
        if (getReservedInstancesOfferingIds() != null) sb.append("ReservedInstancesOfferingIds: " + getReservedInstancesOfferingIds() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getProductDescription() != null) sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getInstanceTenancy() != null) sb.append("InstanceTenancy: " + getInstanceTenancy() + ",");
        if (getOfferingType() != null) sb.append("OfferingType: " + getOfferingType() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (isIncludeMarketplace() != null) sb.append("IncludeMarketplace: " + isIncludeMarketplace() + ",");
        if (getMinDuration() != null) sb.append("MinDuration: " + getMinDuration() + ",");
        if (getMaxDuration() != null) sb.append("MaxDuration: " + getMaxDuration() + ",");
        if (getMaxInstanceCount() != null) sb.append("MaxInstanceCount: " + getMaxInstanceCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesOfferingIds() == null) ? 0 : getReservedInstancesOfferingIds().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy().hashCode()); 
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((isIncludeMarketplace() == null) ? 0 : isIncludeMarketplace().hashCode()); 
        hashCode = prime * hashCode + ((getMinDuration() == null) ? 0 : getMinDuration().hashCode()); 
        hashCode = prime * hashCode + ((getMaxDuration() == null) ? 0 : getMaxDuration().hashCode()); 
        hashCode = prime * hashCode + ((getMaxInstanceCount() == null) ? 0 : getMaxInstanceCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedInstancesOfferingsRequest == false) return false;
        DescribeReservedInstancesOfferingsRequest other = (DescribeReservedInstancesOfferingsRequest)obj;
        
        if (other.getReservedInstancesOfferingIds() == null ^ this.getReservedInstancesOfferingIds() == null) return false;
        if (other.getReservedInstancesOfferingIds() != null && other.getReservedInstancesOfferingIds().equals(this.getReservedInstancesOfferingIds()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getProductDescription() == null ^ this.getProductDescription() == null) return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getInstanceTenancy() == null ^ this.getInstanceTenancy() == null) return false;
        if (other.getInstanceTenancy() != null && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false) return false; 
        if (other.getOfferingType() == null ^ this.getOfferingType() == null) return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.isIncludeMarketplace() == null ^ this.isIncludeMarketplace() == null) return false;
        if (other.isIncludeMarketplace() != null && other.isIncludeMarketplace().equals(this.isIncludeMarketplace()) == false) return false; 
        if (other.getMinDuration() == null ^ this.getMinDuration() == null) return false;
        if (other.getMinDuration() != null && other.getMinDuration().equals(this.getMinDuration()) == false) return false; 
        if (other.getMaxDuration() == null ^ this.getMaxDuration() == null) return false;
        if (other.getMaxDuration() != null && other.getMaxDuration().equals(this.getMaxDuration()) == false) return false; 
        if (other.getMaxInstanceCount() == null ^ this.getMaxInstanceCount() == null) return false;
        if (other.getMaxInstanceCount() != null && other.getMaxInstanceCount().equals(this.getMaxInstanceCount()) == false) return false; 
        return true;
    }
    
}
    