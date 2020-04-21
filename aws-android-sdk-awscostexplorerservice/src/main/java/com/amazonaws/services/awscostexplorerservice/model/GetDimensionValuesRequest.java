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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves all available filter values for a specified filter over a period of
 * time. You can search the dimension values for an arbitrary string.
 * </p>
 */
public class GetDimensionValuesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The value that you want to search the filter values for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String searchString;

    /**
     * <p>
     * The start and end dates for retrieving the dimension values. The start
     * date is inclusive, but the end date is exclusive. For example, if
     * <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from
     * <code>2017-01-01</code> up to and including <code>2017-04-30</code> but
     * not including <code>2017-05-01</code>.
     * </p>
     */
    private DateInterval timePeriod;

    /**
     * <p>
     * The name of the dimension. Each <code>Dimension</code> is available for a
     * different <code>Context</code>. For more information, see
     * <code>Context</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AZ, INSTANCE_TYPE, LINKED_ACCOUNT,
     * LINKED_ACCOUNT_NAME, OPERATION, PURCHASE_TYPE, REGION, SERVICE,
     * SERVICE_CODE, USAGE_TYPE, USAGE_TYPE_GROUP, RECORD_TYPE,
     * OPERATING_SYSTEM, TENANCY, SCOPE, PLATFORM, SUBSCRIPTION_ID,
     * LEGAL_ENTITY_NAME, DEPLOYMENT_OPTION, DATABASE_ENGINE, CACHE_ENGINE,
     * INSTANCE_TYPE_FAMILY, BILLING_ENTITY, RESERVATION_ID, RESOURCE_ID,
     * RIGHTSIZING_TYPE, SAVINGS_PLANS_TYPE, SAVINGS_PLAN_ARN, PAYMENT_OPTION
     */
    private String dimension;

    /**
     * <p>
     * The context for the call to <code>GetDimensionValues</code>. This can be
     * <code>RESERVATIONS</code> or <code>COST_AND_USAGE</code>. The default
     * value is <code>COST_AND_USAGE</code>. If the context is set to
     * <code>RESERVATIONS</code>, the resulting dimension values can be used in
     * the <code>GetReservationUtilization</code> operation. If the context is
     * set to <code>COST_AND_USAGE</code>, the resulting dimension values can be
     * used in the <code>GetCostAndUsage</code> operation.
     * </p>
     * <p>
     * If you set the context to <code>COST_AND_USAGE</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DATABASE_ENGINE - The Amazon Relational Database Service database.
     * Examples are Aurora or MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     * <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LEGAL_ENTITY_NAME - The name of the organization that sells you AWS
     * services, such as Amazon Web Services.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATION - The action performed. Examples include
     * <code>RunInstance</code> and <code>CreateBucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or
     * Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * PURCHASE_TYPE - The reservation type of the purchase to which this usage
     * is related. Examples include On-Demand Instances and Standard Reserved
     * Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE - The AWS service such as Amazon DynamoDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The
     * response for the <code>GetDimensionValues</code> operation includes a
     * unit attribute. Examples include GB and Hrs.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE_GROUP - The grouping of common usage types. An example is
     * Amazon EC2: CloudWatch – Alarms. The response for this operation includes
     * a unit attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * RECORD_TYPE - The different types of charges such as RI fees, usage
     * costs, tax refunds, and credits.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESOURCE_ID - The unique identifier of the resource. ResourceId is an
     * opt-in feature only available for last 14 days for EC2-Compute Service.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>RESERVATIONS</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are
     * Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service
     * deployments. Valid values are <code>SingleAZ</code> and
     * <code>MultiAZ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     * <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or
     * Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values
     * are regional or a single Availability Zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * TAG (Coverage only) - The tags that are associated with a Reserved
     * Instance (RI).
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY - The tenancy of a resource. Examples are shared or dedicated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>SAVINGS_PLANS</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)
     * </p>
     * </li>
     * <li>
     * <p>
     * PAYMENT_OPTION - Payment option for the given Savings Plans (for example,
     * All Upfront)
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE_FAMILY - The family of instances (For example,
     * <code>m5</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COST_AND_USAGE, RESERVATIONS, SAVINGS_PLANS
     */
    private String context;

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * The value that you want to search the filter values for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The value that you want to search the filter values for.
     *         </p>
     */
    public String getSearchString() {
        return searchString;
    }

    /**
     * <p>
     * The value that you want to search the filter values for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param searchString <p>
     *            The value that you want to search the filter values for.
     *            </p>
     */
    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    /**
     * <p>
     * The value that you want to search the filter values for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param searchString <p>
     *            The value that you want to search the filter values for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDimensionValuesRequest withSearchString(String searchString) {
        this.searchString = searchString;
        return this;
    }

    /**
     * <p>
     * The start and end dates for retrieving the dimension values. The start
     * date is inclusive, but the end date is exclusive. For example, if
     * <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from
     * <code>2017-01-01</code> up to and including <code>2017-04-30</code> but
     * not including <code>2017-05-01</code>.
     * </p>
     *
     * @return <p>
     *         The start and end dates for retrieving the dimension values. The
     *         start date is inclusive, but the end date is exclusive. For
     *         example, if <code>start</code> is <code>2017-01-01</code> and
     *         <code>end</code> is <code>2017-05-01</code>, then the cost and
     *         usage data is retrieved from <code>2017-01-01</code> up to and
     *         including <code>2017-04-30</code> but not including
     *         <code>2017-05-01</code>.
     *         </p>
     */
    public DateInterval getTimePeriod() {
        return timePeriod;
    }

    /**
     * <p>
     * The start and end dates for retrieving the dimension values. The start
     * date is inclusive, but the end date is exclusive. For example, if
     * <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from
     * <code>2017-01-01</code> up to and including <code>2017-04-30</code> but
     * not including <code>2017-05-01</code>.
     * </p>
     *
     * @param timePeriod <p>
     *            The start and end dates for retrieving the dimension values.
     *            The start date is inclusive, but the end date is exclusive.
     *            For example, if <code>start</code> is <code>2017-01-01</code>
     *            and <code>end</code> is <code>2017-05-01</code>, then the cost
     *            and usage data is retrieved from <code>2017-01-01</code> up to
     *            and including <code>2017-04-30</code> but not including
     *            <code>2017-05-01</code>.
     *            </p>
     */
    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The start and end dates for retrieving the dimension values. The start
     * date is inclusive, but the end date is exclusive. For example, if
     * <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from
     * <code>2017-01-01</code> up to and including <code>2017-04-30</code> but
     * not including <code>2017-05-01</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timePeriod <p>
     *            The start and end dates for retrieving the dimension values.
     *            The start date is inclusive, but the end date is exclusive.
     *            For example, if <code>start</code> is <code>2017-01-01</code>
     *            and <code>end</code> is <code>2017-05-01</code>, then the cost
     *            and usage data is retrieved from <code>2017-01-01</code> up to
     *            and including <code>2017-04-30</code> but not including
     *            <code>2017-05-01</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDimensionValuesRequest withTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * <p>
     * The name of the dimension. Each <code>Dimension</code> is available for a
     * different <code>Context</code>. For more information, see
     * <code>Context</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AZ, INSTANCE_TYPE, LINKED_ACCOUNT,
     * LINKED_ACCOUNT_NAME, OPERATION, PURCHASE_TYPE, REGION, SERVICE,
     * SERVICE_CODE, USAGE_TYPE, USAGE_TYPE_GROUP, RECORD_TYPE,
     * OPERATING_SYSTEM, TENANCY, SCOPE, PLATFORM, SUBSCRIPTION_ID,
     * LEGAL_ENTITY_NAME, DEPLOYMENT_OPTION, DATABASE_ENGINE, CACHE_ENGINE,
     * INSTANCE_TYPE_FAMILY, BILLING_ENTITY, RESERVATION_ID, RESOURCE_ID,
     * RIGHTSIZING_TYPE, SAVINGS_PLANS_TYPE, SAVINGS_PLAN_ARN, PAYMENT_OPTION
     *
     * @return <p>
     *         The name of the dimension. Each <code>Dimension</code> is
     *         available for a different <code>Context</code>. For more
     *         information, see <code>Context</code>.
     *         </p>
     * @see Dimension
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * <p>
     * The name of the dimension. Each <code>Dimension</code> is available for a
     * different <code>Context</code>. For more information, see
     * <code>Context</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AZ, INSTANCE_TYPE, LINKED_ACCOUNT,
     * LINKED_ACCOUNT_NAME, OPERATION, PURCHASE_TYPE, REGION, SERVICE,
     * SERVICE_CODE, USAGE_TYPE, USAGE_TYPE_GROUP, RECORD_TYPE,
     * OPERATING_SYSTEM, TENANCY, SCOPE, PLATFORM, SUBSCRIPTION_ID,
     * LEGAL_ENTITY_NAME, DEPLOYMENT_OPTION, DATABASE_ENGINE, CACHE_ENGINE,
     * INSTANCE_TYPE_FAMILY, BILLING_ENTITY, RESERVATION_ID, RESOURCE_ID,
     * RIGHTSIZING_TYPE, SAVINGS_PLANS_TYPE, SAVINGS_PLAN_ARN, PAYMENT_OPTION
     *
     * @param dimension <p>
     *            The name of the dimension. Each <code>Dimension</code> is
     *            available for a different <code>Context</code>. For more
     *            information, see <code>Context</code>.
     *            </p>
     * @see Dimension
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * <p>
     * The name of the dimension. Each <code>Dimension</code> is available for a
     * different <code>Context</code>. For more information, see
     * <code>Context</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AZ, INSTANCE_TYPE, LINKED_ACCOUNT,
     * LINKED_ACCOUNT_NAME, OPERATION, PURCHASE_TYPE, REGION, SERVICE,
     * SERVICE_CODE, USAGE_TYPE, USAGE_TYPE_GROUP, RECORD_TYPE,
     * OPERATING_SYSTEM, TENANCY, SCOPE, PLATFORM, SUBSCRIPTION_ID,
     * LEGAL_ENTITY_NAME, DEPLOYMENT_OPTION, DATABASE_ENGINE, CACHE_ENGINE,
     * INSTANCE_TYPE_FAMILY, BILLING_ENTITY, RESERVATION_ID, RESOURCE_ID,
     * RIGHTSIZING_TYPE, SAVINGS_PLANS_TYPE, SAVINGS_PLAN_ARN, PAYMENT_OPTION
     *
     * @param dimension <p>
     *            The name of the dimension. Each <code>Dimension</code> is
     *            available for a different <code>Context</code>. For more
     *            information, see <code>Context</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Dimension
     */
    public GetDimensionValuesRequest withDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * <p>
     * The name of the dimension. Each <code>Dimension</code> is available for a
     * different <code>Context</code>. For more information, see
     * <code>Context</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AZ, INSTANCE_TYPE, LINKED_ACCOUNT,
     * LINKED_ACCOUNT_NAME, OPERATION, PURCHASE_TYPE, REGION, SERVICE,
     * SERVICE_CODE, USAGE_TYPE, USAGE_TYPE_GROUP, RECORD_TYPE,
     * OPERATING_SYSTEM, TENANCY, SCOPE, PLATFORM, SUBSCRIPTION_ID,
     * LEGAL_ENTITY_NAME, DEPLOYMENT_OPTION, DATABASE_ENGINE, CACHE_ENGINE,
     * INSTANCE_TYPE_FAMILY, BILLING_ENTITY, RESERVATION_ID, RESOURCE_ID,
     * RIGHTSIZING_TYPE, SAVINGS_PLANS_TYPE, SAVINGS_PLAN_ARN, PAYMENT_OPTION
     *
     * @param dimension <p>
     *            The name of the dimension. Each <code>Dimension</code> is
     *            available for a different <code>Context</code>. For more
     *            information, see <code>Context</code>.
     *            </p>
     * @see Dimension
     */
    public void setDimension(Dimension dimension) {
        this.dimension = dimension.toString();
    }

    /**
     * <p>
     * The name of the dimension. Each <code>Dimension</code> is available for a
     * different <code>Context</code>. For more information, see
     * <code>Context</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AZ, INSTANCE_TYPE, LINKED_ACCOUNT,
     * LINKED_ACCOUNT_NAME, OPERATION, PURCHASE_TYPE, REGION, SERVICE,
     * SERVICE_CODE, USAGE_TYPE, USAGE_TYPE_GROUP, RECORD_TYPE,
     * OPERATING_SYSTEM, TENANCY, SCOPE, PLATFORM, SUBSCRIPTION_ID,
     * LEGAL_ENTITY_NAME, DEPLOYMENT_OPTION, DATABASE_ENGINE, CACHE_ENGINE,
     * INSTANCE_TYPE_FAMILY, BILLING_ENTITY, RESERVATION_ID, RESOURCE_ID,
     * RIGHTSIZING_TYPE, SAVINGS_PLANS_TYPE, SAVINGS_PLAN_ARN, PAYMENT_OPTION
     *
     * @param dimension <p>
     *            The name of the dimension. Each <code>Dimension</code> is
     *            available for a different <code>Context</code>. For more
     *            information, see <code>Context</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Dimension
     */
    public GetDimensionValuesRequest withDimension(Dimension dimension) {
        this.dimension = dimension.toString();
        return this;
    }

    /**
     * <p>
     * The context for the call to <code>GetDimensionValues</code>. This can be
     * <code>RESERVATIONS</code> or <code>COST_AND_USAGE</code>. The default
     * value is <code>COST_AND_USAGE</code>. If the context is set to
     * <code>RESERVATIONS</code>, the resulting dimension values can be used in
     * the <code>GetReservationUtilization</code> operation. If the context is
     * set to <code>COST_AND_USAGE</code>, the resulting dimension values can be
     * used in the <code>GetCostAndUsage</code> operation.
     * </p>
     * <p>
     * If you set the context to <code>COST_AND_USAGE</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DATABASE_ENGINE - The Amazon Relational Database Service database.
     * Examples are Aurora or MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     * <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LEGAL_ENTITY_NAME - The name of the organization that sells you AWS
     * services, such as Amazon Web Services.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATION - The action performed. Examples include
     * <code>RunInstance</code> and <code>CreateBucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or
     * Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * PURCHASE_TYPE - The reservation type of the purchase to which this usage
     * is related. Examples include On-Demand Instances and Standard Reserved
     * Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE - The AWS service such as Amazon DynamoDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The
     * response for the <code>GetDimensionValues</code> operation includes a
     * unit attribute. Examples include GB and Hrs.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE_GROUP - The grouping of common usage types. An example is
     * Amazon EC2: CloudWatch – Alarms. The response for this operation includes
     * a unit attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * RECORD_TYPE - The different types of charges such as RI fees, usage
     * costs, tax refunds, and credits.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESOURCE_ID - The unique identifier of the resource. ResourceId is an
     * opt-in feature only available for last 14 days for EC2-Compute Service.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>RESERVATIONS</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are
     * Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service
     * deployments. Valid values are <code>SingleAZ</code> and
     * <code>MultiAZ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     * <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or
     * Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values
     * are regional or a single Availability Zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * TAG (Coverage only) - The tags that are associated with a Reserved
     * Instance (RI).
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY - The tenancy of a resource. Examples are shared or dedicated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>SAVINGS_PLANS</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)
     * </p>
     * </li>
     * <li>
     * <p>
     * PAYMENT_OPTION - Payment option for the given Savings Plans (for example,
     * All Upfront)
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE_FAMILY - The family of instances (For example,
     * <code>m5</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COST_AND_USAGE, RESERVATIONS, SAVINGS_PLANS
     *
     * @return <p>
     *         The context for the call to <code>GetDimensionValues</code>. This
     *         can be <code>RESERVATIONS</code> or <code>COST_AND_USAGE</code>.
     *         The default value is <code>COST_AND_USAGE</code>. If the context
     *         is set to <code>RESERVATIONS</code>, the resulting dimension
     *         values can be used in the <code>GetReservationUtilization</code>
     *         operation. If the context is set to <code>COST_AND_USAGE</code>,
     *         the resulting dimension values can be used in the
     *         <code>GetCostAndUsage</code> operation.
     *         </p>
     *         <p>
     *         If you set the context to <code>COST_AND_USAGE</code>, you can
     *         use the following dimensions for searching:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AZ - The Availability Zone. An example is <code>us-east-1a</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DATABASE_ENGINE - The Amazon Relational Database Service
     *         database. Examples are Aurora or MySQL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     *         <code>m4.xlarge</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LEGAL_ENTITY_NAME - The name of the organization that sells you
     *         AWS services, such as Amazon Web Services.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LINKED_ACCOUNT - The description in the attribute map that
     *         includes the full name of the member account. The value field
     *         contains the AWS ID of the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OPERATING_SYSTEM - The operating system. Examples are Windows or
     *         Linux.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OPERATION - The action performed. Examples include
     *         <code>RunInstance</code> and <code>CreateBucket</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PLATFORM - The Amazon EC2 operating system. Examples are Windows
     *         or Linux.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PURCHASE_TYPE - The reservation type of the purchase to which
     *         this usage is related. Examples include On-Demand Instances and
     *         Standard Reserved Instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SERVICE - The AWS service such as Amazon DynamoDB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USAGE_TYPE - The type of usage. An example is
     *         DataTransfer-In-Bytes. The response for the
     *         <code>GetDimensionValues</code> operation includes a unit
     *         attribute. Examples include GB and Hrs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USAGE_TYPE_GROUP - The grouping of common usage types. An example
     *         is Amazon EC2: CloudWatch – Alarms. The response for this
     *         operation includes a unit attribute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RECORD_TYPE - The different types of charges such as RI fees,
     *         usage costs, tax refunds, and credits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RESOURCE_ID - The unique identifier of the resource. ResourceId
     *         is an opt-in feature only available for last 14 days for
     *         EC2-Compute Service.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you set the context to <code>RESERVATIONS</code>, you can use
     *         the following dimensions for searching:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AZ - The Availability Zone. An example is <code>us-east-1a</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CACHE_ENGINE - The Amazon ElastiCache operating system. Examples
     *         are Windows or Linux.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DEPLOYMENT_OPTION - The scope of Amazon Relational Database
     *         Service deployments. Valid values are <code>SingleAZ</code> and
     *         <code>MultiAZ</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     *         <code>m4.xlarge</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LINKED_ACCOUNT - The description in the attribute map that
     *         includes the full name of the member account. The value field
     *         contains the AWS ID of the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PLATFORM - The Amazon EC2 operating system. Examples are Windows
     *         or Linux.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REGION - The AWS Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SCOPE (Utilization only) - The scope of a Reserved Instance (RI).
     *         Values are regional or a single Availability Zone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TAG (Coverage only) - The tags that are associated with a
     *         Reserved Instance (RI).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TENANCY - The tenancy of a resource. Examples are shared or
     *         dedicated.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you set the context to <code>SAVINGS_PLANS</code>, you can use
     *         the following dimensions for searching:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or
     *         Compute)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PAYMENT_OPTION - Payment option for the given Savings Plans (for
     *         example, All Upfront)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REGION - The AWS Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTANCE_TYPE_FAMILY - The family of instances (For example,
     *         <code>m5</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LINKED_ACCOUNT - The description in the attribute map that
     *         includes the full name of the member account. The value field
     *         contains the AWS ID of the member account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     *         </p>
     *         </li>
     *         </ul>
     * @see Context
     */
    public String getContext() {
        return context;
    }

    /**
     * <p>
     * The context for the call to <code>GetDimensionValues</code>. This can be
     * <code>RESERVATIONS</code> or <code>COST_AND_USAGE</code>. The default
     * value is <code>COST_AND_USAGE</code>. If the context is set to
     * <code>RESERVATIONS</code>, the resulting dimension values can be used in
     * the <code>GetReservationUtilization</code> operation. If the context is
     * set to <code>COST_AND_USAGE</code>, the resulting dimension values can be
     * used in the <code>GetCostAndUsage</code> operation.
     * </p>
     * <p>
     * If you set the context to <code>COST_AND_USAGE</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DATABASE_ENGINE - The Amazon Relational Database Service database.
     * Examples are Aurora or MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     * <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LEGAL_ENTITY_NAME - The name of the organization that sells you AWS
     * services, such as Amazon Web Services.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATION - The action performed. Examples include
     * <code>RunInstance</code> and <code>CreateBucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or
     * Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * PURCHASE_TYPE - The reservation type of the purchase to which this usage
     * is related. Examples include On-Demand Instances and Standard Reserved
     * Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE - The AWS service such as Amazon DynamoDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The
     * response for the <code>GetDimensionValues</code> operation includes a
     * unit attribute. Examples include GB and Hrs.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE_GROUP - The grouping of common usage types. An example is
     * Amazon EC2: CloudWatch – Alarms. The response for this operation includes
     * a unit attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * RECORD_TYPE - The different types of charges such as RI fees, usage
     * costs, tax refunds, and credits.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESOURCE_ID - The unique identifier of the resource. ResourceId is an
     * opt-in feature only available for last 14 days for EC2-Compute Service.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>RESERVATIONS</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are
     * Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service
     * deployments. Valid values are <code>SingleAZ</code> and
     * <code>MultiAZ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     * <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or
     * Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values
     * are regional or a single Availability Zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * TAG (Coverage only) - The tags that are associated with a Reserved
     * Instance (RI).
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY - The tenancy of a resource. Examples are shared or dedicated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>SAVINGS_PLANS</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)
     * </p>
     * </li>
     * <li>
     * <p>
     * PAYMENT_OPTION - Payment option for the given Savings Plans (for example,
     * All Upfront)
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE_FAMILY - The family of instances (For example,
     * <code>m5</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COST_AND_USAGE, RESERVATIONS, SAVINGS_PLANS
     *
     * @param context <p>
     *            The context for the call to <code>GetDimensionValues</code>.
     *            This can be <code>RESERVATIONS</code> or
     *            <code>COST_AND_USAGE</code>. The default value is
     *            <code>COST_AND_USAGE</code>. If the context is set to
     *            <code>RESERVATIONS</code>, the resulting dimension values can
     *            be used in the <code>GetReservationUtilization</code>
     *            operation. If the context is set to
     *            <code>COST_AND_USAGE</code>, the resulting dimension values
     *            can be used in the <code>GetCostAndUsage</code> operation.
     *            </p>
     *            <p>
     *            If you set the context to <code>COST_AND_USAGE</code>, you can
     *            use the following dimensions for searching:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AZ - The Availability Zone. An example is
     *            <code>us-east-1a</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DATABASE_ENGINE - The Amazon Relational Database Service
     *            database. Examples are Aurora or MySQL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     *            <code>m4.xlarge</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LEGAL_ENTITY_NAME - The name of the organization that sells
     *            you AWS services, such as Amazon Web Services.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINKED_ACCOUNT - The description in the attribute map that
     *            includes the full name of the member account. The value field
     *            contains the AWS ID of the member account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OPERATING_SYSTEM - The operating system. Examples are Windows
     *            or Linux.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OPERATION - The action performed. Examples include
     *            <code>RunInstance</code> and <code>CreateBucket</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PLATFORM - The Amazon EC2 operating system. Examples are
     *            Windows or Linux.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PURCHASE_TYPE - The reservation type of the purchase to which
     *            this usage is related. Examples include On-Demand Instances
     *            and Standard Reserved Instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SERVICE - The AWS service such as Amazon DynamoDB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            USAGE_TYPE - The type of usage. An example is
     *            DataTransfer-In-Bytes. The response for the
     *            <code>GetDimensionValues</code> operation includes a unit
     *            attribute. Examples include GB and Hrs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            USAGE_TYPE_GROUP - The grouping of common usage types. An
     *            example is Amazon EC2: CloudWatch – Alarms. The response for
     *            this operation includes a unit attribute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RECORD_TYPE - The different types of charges such as RI fees,
     *            usage costs, tax refunds, and credits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RESOURCE_ID - The unique identifier of the resource.
     *            ResourceId is an opt-in feature only available for last 14
     *            days for EC2-Compute Service.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you set the context to <code>RESERVATIONS</code>, you can
     *            use the following dimensions for searching:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AZ - The Availability Zone. An example is
     *            <code>us-east-1a</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CACHE_ENGINE - The Amazon ElastiCache operating system.
     *            Examples are Windows or Linux.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DEPLOYMENT_OPTION - The scope of Amazon Relational Database
     *            Service deployments. Valid values are <code>SingleAZ</code>
     *            and <code>MultiAZ</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     *            <code>m4.xlarge</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINKED_ACCOUNT - The description in the attribute map that
     *            includes the full name of the member account. The value field
     *            contains the AWS ID of the member account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PLATFORM - The Amazon EC2 operating system. Examples are
     *            Windows or Linux.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGION - The AWS Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SCOPE (Utilization only) - The scope of a Reserved Instance
     *            (RI). Values are regional or a single Availability Zone.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TAG (Coverage only) - The tags that are associated with a
     *            Reserved Instance (RI).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TENANCY - The tenancy of a resource. Examples are shared or
     *            dedicated.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you set the context to <code>SAVINGS_PLANS</code>, you can
     *            use the following dimensions for searching:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or
     *            Compute)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PAYMENT_OPTION - Payment option for the given Savings Plans
     *            (for example, All Upfront)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGION - The AWS Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INSTANCE_TYPE_FAMILY - The family of instances (For example,
     *            <code>m5</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINKED_ACCOUNT - The description in the attribute map that
     *            includes the full name of the member account. The value field
     *            contains the AWS ID of the member account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     *            </p>
     *            </li>
     *            </ul>
     * @see Context
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * <p>
     * The context for the call to <code>GetDimensionValues</code>. This can be
     * <code>RESERVATIONS</code> or <code>COST_AND_USAGE</code>. The default
     * value is <code>COST_AND_USAGE</code>. If the context is set to
     * <code>RESERVATIONS</code>, the resulting dimension values can be used in
     * the <code>GetReservationUtilization</code> operation. If the context is
     * set to <code>COST_AND_USAGE</code>, the resulting dimension values can be
     * used in the <code>GetCostAndUsage</code> operation.
     * </p>
     * <p>
     * If you set the context to <code>COST_AND_USAGE</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DATABASE_ENGINE - The Amazon Relational Database Service database.
     * Examples are Aurora or MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     * <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LEGAL_ENTITY_NAME - The name of the organization that sells you AWS
     * services, such as Amazon Web Services.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATION - The action performed. Examples include
     * <code>RunInstance</code> and <code>CreateBucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or
     * Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * PURCHASE_TYPE - The reservation type of the purchase to which this usage
     * is related. Examples include On-Demand Instances and Standard Reserved
     * Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE - The AWS service such as Amazon DynamoDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The
     * response for the <code>GetDimensionValues</code> operation includes a
     * unit attribute. Examples include GB and Hrs.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE_GROUP - The grouping of common usage types. An example is
     * Amazon EC2: CloudWatch – Alarms. The response for this operation includes
     * a unit attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * RECORD_TYPE - The different types of charges such as RI fees, usage
     * costs, tax refunds, and credits.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESOURCE_ID - The unique identifier of the resource. ResourceId is an
     * opt-in feature only available for last 14 days for EC2-Compute Service.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>RESERVATIONS</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are
     * Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service
     * deployments. Valid values are <code>SingleAZ</code> and
     * <code>MultiAZ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     * <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or
     * Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values
     * are regional or a single Availability Zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * TAG (Coverage only) - The tags that are associated with a Reserved
     * Instance (RI).
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY - The tenancy of a resource. Examples are shared or dedicated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>SAVINGS_PLANS</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)
     * </p>
     * </li>
     * <li>
     * <p>
     * PAYMENT_OPTION - Payment option for the given Savings Plans (for example,
     * All Upfront)
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE_FAMILY - The family of instances (For example,
     * <code>m5</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COST_AND_USAGE, RESERVATIONS, SAVINGS_PLANS
     *
     * @param context <p>
     *            The context for the call to <code>GetDimensionValues</code>.
     *            This can be <code>RESERVATIONS</code> or
     *            <code>COST_AND_USAGE</code>. The default value is
     *            <code>COST_AND_USAGE</code>. If the context is set to
     *            <code>RESERVATIONS</code>, the resulting dimension values can
     *            be used in the <code>GetReservationUtilization</code>
     *            operation. If the context is set to
     *            <code>COST_AND_USAGE</code>, the resulting dimension values
     *            can be used in the <code>GetCostAndUsage</code> operation.
     *            </p>
     *            <p>
     *            If you set the context to <code>COST_AND_USAGE</code>, you can
     *            use the following dimensions for searching:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AZ - The Availability Zone. An example is
     *            <code>us-east-1a</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DATABASE_ENGINE - The Amazon Relational Database Service
     *            database. Examples are Aurora or MySQL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     *            <code>m4.xlarge</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LEGAL_ENTITY_NAME - The name of the organization that sells
     *            you AWS services, such as Amazon Web Services.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINKED_ACCOUNT - The description in the attribute map that
     *            includes the full name of the member account. The value field
     *            contains the AWS ID of the member account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OPERATING_SYSTEM - The operating system. Examples are Windows
     *            or Linux.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OPERATION - The action performed. Examples include
     *            <code>RunInstance</code> and <code>CreateBucket</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PLATFORM - The Amazon EC2 operating system. Examples are
     *            Windows or Linux.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PURCHASE_TYPE - The reservation type of the purchase to which
     *            this usage is related. Examples include On-Demand Instances
     *            and Standard Reserved Instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SERVICE - The AWS service such as Amazon DynamoDB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            USAGE_TYPE - The type of usage. An example is
     *            DataTransfer-In-Bytes. The response for the
     *            <code>GetDimensionValues</code> operation includes a unit
     *            attribute. Examples include GB and Hrs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            USAGE_TYPE_GROUP - The grouping of common usage types. An
     *            example is Amazon EC2: CloudWatch – Alarms. The response for
     *            this operation includes a unit attribute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RECORD_TYPE - The different types of charges such as RI fees,
     *            usage costs, tax refunds, and credits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RESOURCE_ID - The unique identifier of the resource.
     *            ResourceId is an opt-in feature only available for last 14
     *            days for EC2-Compute Service.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you set the context to <code>RESERVATIONS</code>, you can
     *            use the following dimensions for searching:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AZ - The Availability Zone. An example is
     *            <code>us-east-1a</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CACHE_ENGINE - The Amazon ElastiCache operating system.
     *            Examples are Windows or Linux.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DEPLOYMENT_OPTION - The scope of Amazon Relational Database
     *            Service deployments. Valid values are <code>SingleAZ</code>
     *            and <code>MultiAZ</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     *            <code>m4.xlarge</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINKED_ACCOUNT - The description in the attribute map that
     *            includes the full name of the member account. The value field
     *            contains the AWS ID of the member account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PLATFORM - The Amazon EC2 operating system. Examples are
     *            Windows or Linux.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGION - The AWS Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SCOPE (Utilization only) - The scope of a Reserved Instance
     *            (RI). Values are regional or a single Availability Zone.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TAG (Coverage only) - The tags that are associated with a
     *            Reserved Instance (RI).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TENANCY - The tenancy of a resource. Examples are shared or
     *            dedicated.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you set the context to <code>SAVINGS_PLANS</code>, you can
     *            use the following dimensions for searching:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or
     *            Compute)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PAYMENT_OPTION - Payment option for the given Savings Plans
     *            (for example, All Upfront)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGION - The AWS Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INSTANCE_TYPE_FAMILY - The family of instances (For example,
     *            <code>m5</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINKED_ACCOUNT - The description in the attribute map that
     *            includes the full name of the member account. The value field
     *            contains the AWS ID of the member account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Context
     */
    public GetDimensionValuesRequest withContext(String context) {
        this.context = context;
        return this;
    }

    /**
     * <p>
     * The context for the call to <code>GetDimensionValues</code>. This can be
     * <code>RESERVATIONS</code> or <code>COST_AND_USAGE</code>. The default
     * value is <code>COST_AND_USAGE</code>. If the context is set to
     * <code>RESERVATIONS</code>, the resulting dimension values can be used in
     * the <code>GetReservationUtilization</code> operation. If the context is
     * set to <code>COST_AND_USAGE</code>, the resulting dimension values can be
     * used in the <code>GetCostAndUsage</code> operation.
     * </p>
     * <p>
     * If you set the context to <code>COST_AND_USAGE</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DATABASE_ENGINE - The Amazon Relational Database Service database.
     * Examples are Aurora or MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     * <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LEGAL_ENTITY_NAME - The name of the organization that sells you AWS
     * services, such as Amazon Web Services.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATION - The action performed. Examples include
     * <code>RunInstance</code> and <code>CreateBucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or
     * Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * PURCHASE_TYPE - The reservation type of the purchase to which this usage
     * is related. Examples include On-Demand Instances and Standard Reserved
     * Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE - The AWS service such as Amazon DynamoDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The
     * response for the <code>GetDimensionValues</code> operation includes a
     * unit attribute. Examples include GB and Hrs.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE_GROUP - The grouping of common usage types. An example is
     * Amazon EC2: CloudWatch – Alarms. The response for this operation includes
     * a unit attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * RECORD_TYPE - The different types of charges such as RI fees, usage
     * costs, tax refunds, and credits.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESOURCE_ID - The unique identifier of the resource. ResourceId is an
     * opt-in feature only available for last 14 days for EC2-Compute Service.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>RESERVATIONS</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are
     * Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service
     * deployments. Valid values are <code>SingleAZ</code> and
     * <code>MultiAZ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     * <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or
     * Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values
     * are regional or a single Availability Zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * TAG (Coverage only) - The tags that are associated with a Reserved
     * Instance (RI).
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY - The tenancy of a resource. Examples are shared or dedicated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>SAVINGS_PLANS</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)
     * </p>
     * </li>
     * <li>
     * <p>
     * PAYMENT_OPTION - Payment option for the given Savings Plans (for example,
     * All Upfront)
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE_FAMILY - The family of instances (For example,
     * <code>m5</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COST_AND_USAGE, RESERVATIONS, SAVINGS_PLANS
     *
     * @param context <p>
     *            The context for the call to <code>GetDimensionValues</code>.
     *            This can be <code>RESERVATIONS</code> or
     *            <code>COST_AND_USAGE</code>. The default value is
     *            <code>COST_AND_USAGE</code>. If the context is set to
     *            <code>RESERVATIONS</code>, the resulting dimension values can
     *            be used in the <code>GetReservationUtilization</code>
     *            operation. If the context is set to
     *            <code>COST_AND_USAGE</code>, the resulting dimension values
     *            can be used in the <code>GetCostAndUsage</code> operation.
     *            </p>
     *            <p>
     *            If you set the context to <code>COST_AND_USAGE</code>, you can
     *            use the following dimensions for searching:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AZ - The Availability Zone. An example is
     *            <code>us-east-1a</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DATABASE_ENGINE - The Amazon Relational Database Service
     *            database. Examples are Aurora or MySQL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     *            <code>m4.xlarge</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LEGAL_ENTITY_NAME - The name of the organization that sells
     *            you AWS services, such as Amazon Web Services.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINKED_ACCOUNT - The description in the attribute map that
     *            includes the full name of the member account. The value field
     *            contains the AWS ID of the member account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OPERATING_SYSTEM - The operating system. Examples are Windows
     *            or Linux.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OPERATION - The action performed. Examples include
     *            <code>RunInstance</code> and <code>CreateBucket</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PLATFORM - The Amazon EC2 operating system. Examples are
     *            Windows or Linux.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PURCHASE_TYPE - The reservation type of the purchase to which
     *            this usage is related. Examples include On-Demand Instances
     *            and Standard Reserved Instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SERVICE - The AWS service such as Amazon DynamoDB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            USAGE_TYPE - The type of usage. An example is
     *            DataTransfer-In-Bytes. The response for the
     *            <code>GetDimensionValues</code> operation includes a unit
     *            attribute. Examples include GB and Hrs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            USAGE_TYPE_GROUP - The grouping of common usage types. An
     *            example is Amazon EC2: CloudWatch – Alarms. The response for
     *            this operation includes a unit attribute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RECORD_TYPE - The different types of charges such as RI fees,
     *            usage costs, tax refunds, and credits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RESOURCE_ID - The unique identifier of the resource.
     *            ResourceId is an opt-in feature only available for last 14
     *            days for EC2-Compute Service.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you set the context to <code>RESERVATIONS</code>, you can
     *            use the following dimensions for searching:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AZ - The Availability Zone. An example is
     *            <code>us-east-1a</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CACHE_ENGINE - The Amazon ElastiCache operating system.
     *            Examples are Windows or Linux.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DEPLOYMENT_OPTION - The scope of Amazon Relational Database
     *            Service deployments. Valid values are <code>SingleAZ</code>
     *            and <code>MultiAZ</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     *            <code>m4.xlarge</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINKED_ACCOUNT - The description in the attribute map that
     *            includes the full name of the member account. The value field
     *            contains the AWS ID of the member account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PLATFORM - The Amazon EC2 operating system. Examples are
     *            Windows or Linux.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGION - The AWS Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SCOPE (Utilization only) - The scope of a Reserved Instance
     *            (RI). Values are regional or a single Availability Zone.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TAG (Coverage only) - The tags that are associated with a
     *            Reserved Instance (RI).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TENANCY - The tenancy of a resource. Examples are shared or
     *            dedicated.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you set the context to <code>SAVINGS_PLANS</code>, you can
     *            use the following dimensions for searching:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or
     *            Compute)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PAYMENT_OPTION - Payment option for the given Savings Plans
     *            (for example, All Upfront)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGION - The AWS Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INSTANCE_TYPE_FAMILY - The family of instances (For example,
     *            <code>m5</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINKED_ACCOUNT - The description in the attribute map that
     *            includes the full name of the member account. The value field
     *            contains the AWS ID of the member account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     *            </p>
     *            </li>
     *            </ul>
     * @see Context
     */
    public void setContext(Context context) {
        this.context = context.toString();
    }

    /**
     * <p>
     * The context for the call to <code>GetDimensionValues</code>. This can be
     * <code>RESERVATIONS</code> or <code>COST_AND_USAGE</code>. The default
     * value is <code>COST_AND_USAGE</code>. If the context is set to
     * <code>RESERVATIONS</code>, the resulting dimension values can be used in
     * the <code>GetReservationUtilization</code> operation. If the context is
     * set to <code>COST_AND_USAGE</code>, the resulting dimension values can be
     * used in the <code>GetCostAndUsage</code> operation.
     * </p>
     * <p>
     * If you set the context to <code>COST_AND_USAGE</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DATABASE_ENGINE - The Amazon Relational Database Service database.
     * Examples are Aurora or MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     * <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LEGAL_ENTITY_NAME - The name of the organization that sells you AWS
     * services, such as Amazon Web Services.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPERATION - The action performed. Examples include
     * <code>RunInstance</code> and <code>CreateBucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or
     * Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * PURCHASE_TYPE - The reservation type of the purchase to which this usage
     * is related. Examples include On-Demand Instances and Standard Reserved
     * Instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * SERVICE - The AWS service such as Amazon DynamoDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The
     * response for the <code>GetDimensionValues</code> operation includes a
     * unit attribute. Examples include GB and Hrs.
     * </p>
     * </li>
     * <li>
     * <p>
     * USAGE_TYPE_GROUP - The grouping of common usage types. An example is
     * Amazon EC2: CloudWatch – Alarms. The response for this operation includes
     * a unit attribute.
     * </p>
     * </li>
     * <li>
     * <p>
     * RECORD_TYPE - The different types of charges such as RI fees, usage
     * costs, tax refunds, and credits.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESOURCE_ID - The unique identifier of the resource. ResourceId is an
     * opt-in feature only available for last 14 days for EC2-Compute Service.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>RESERVATIONS</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ - The Availability Zone. An example is <code>us-east-1a</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are
     * Windows or Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service
     * deployments. Valid values are <code>SingleAZ</code> and
     * <code>MultiAZ</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     * <code>m4.xlarge</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM - The Amazon EC2 operating system. Examples are Windows or
     * Linux.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values
     * are regional or a single Availability Zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * TAG (Coverage only) - The tags that are associated with a Reserved
     * Instance (RI).
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY - The tenancy of a resource. Examples are shared or dedicated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set the context to <code>SAVINGS_PLANS</code>, you can use the
     * following dimensions for searching:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)
     * </p>
     * </li>
     * <li>
     * <p>
     * PAYMENT_OPTION - Payment option for the given Savings Plans (for example,
     * All Upfront)
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION - The AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE_FAMILY - The family of instances (For example,
     * <code>m5</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT - The description in the attribute map that includes the
     * full name of the member account. The value field contains the AWS ID of
     * the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COST_AND_USAGE, RESERVATIONS, SAVINGS_PLANS
     *
     * @param context <p>
     *            The context for the call to <code>GetDimensionValues</code>.
     *            This can be <code>RESERVATIONS</code> or
     *            <code>COST_AND_USAGE</code>. The default value is
     *            <code>COST_AND_USAGE</code>. If the context is set to
     *            <code>RESERVATIONS</code>, the resulting dimension values can
     *            be used in the <code>GetReservationUtilization</code>
     *            operation. If the context is set to
     *            <code>COST_AND_USAGE</code>, the resulting dimension values
     *            can be used in the <code>GetCostAndUsage</code> operation.
     *            </p>
     *            <p>
     *            If you set the context to <code>COST_AND_USAGE</code>, you can
     *            use the following dimensions for searching:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AZ - The Availability Zone. An example is
     *            <code>us-east-1a</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DATABASE_ENGINE - The Amazon Relational Database Service
     *            database. Examples are Aurora or MySQL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     *            <code>m4.xlarge</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LEGAL_ENTITY_NAME - The name of the organization that sells
     *            you AWS services, such as Amazon Web Services.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINKED_ACCOUNT - The description in the attribute map that
     *            includes the full name of the member account. The value field
     *            contains the AWS ID of the member account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OPERATING_SYSTEM - The operating system. Examples are Windows
     *            or Linux.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            OPERATION - The action performed. Examples include
     *            <code>RunInstance</code> and <code>CreateBucket</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PLATFORM - The Amazon EC2 operating system. Examples are
     *            Windows or Linux.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PURCHASE_TYPE - The reservation type of the purchase to which
     *            this usage is related. Examples include On-Demand Instances
     *            and Standard Reserved Instances.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SERVICE - The AWS service such as Amazon DynamoDB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            USAGE_TYPE - The type of usage. An example is
     *            DataTransfer-In-Bytes. The response for the
     *            <code>GetDimensionValues</code> operation includes a unit
     *            attribute. Examples include GB and Hrs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            USAGE_TYPE_GROUP - The grouping of common usage types. An
     *            example is Amazon EC2: CloudWatch – Alarms. The response for
     *            this operation includes a unit attribute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RECORD_TYPE - The different types of charges such as RI fees,
     *            usage costs, tax refunds, and credits.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RESOURCE_ID - The unique identifier of the resource.
     *            ResourceId is an opt-in feature only available for last 14
     *            days for EC2-Compute Service.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you set the context to <code>RESERVATIONS</code>, you can
     *            use the following dimensions for searching:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            AZ - The Availability Zone. An example is
     *            <code>us-east-1a</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CACHE_ENGINE - The Amazon ElastiCache operating system.
     *            Examples are Windows or Linux.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DEPLOYMENT_OPTION - The scope of Amazon Relational Database
     *            Service deployments. Valid values are <code>SingleAZ</code>
     *            and <code>MultiAZ</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INSTANCE_TYPE - The type of Amazon EC2 instance. An example is
     *            <code>m4.xlarge</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINKED_ACCOUNT - The description in the attribute map that
     *            includes the full name of the member account. The value field
     *            contains the AWS ID of the member account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PLATFORM - The Amazon EC2 operating system. Examples are
     *            Windows or Linux.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGION - The AWS Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SCOPE (Utilization only) - The scope of a Reserved Instance
     *            (RI). Values are regional or a single Availability Zone.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TAG (Coverage only) - The tags that are associated with a
     *            Reserved Instance (RI).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TENANCY - The tenancy of a resource. Examples are shared or
     *            dedicated.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you set the context to <code>SAVINGS_PLANS</code>, you can
     *            use the following dimensions for searching:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or
     *            Compute)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PAYMENT_OPTION - Payment option for the given Savings Plans
     *            (for example, All Upfront)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            REGION - The AWS Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            INSTANCE_TYPE_FAMILY - The family of instances (For example,
     *            <code>m5</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            LINKED_ACCOUNT - The description in the attribute map that
     *            includes the full name of the member account. The value field
     *            contains the AWS ID of the member account.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Context
     */
    public GetDimensionValuesRequest withContext(Context context) {
        this.context = context.toString();
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The token to retrieve the next set of results. AWS provides the
     *         token when the response from a previous call has more results
     *         than the maximum page size.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The token to retrieve the next set of results. AWS provides
     *            the token when the response from a previous call has more
     *            results than the maximum page size.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The token to retrieve the next set of results. AWS provides
     *            the token when the response from a previous call has more
     *            results than the maximum page size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDimensionValuesRequest withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getSearchString() != null)
            sb.append("SearchString: " + getSearchString() + ",");
        if (getTimePeriod() != null)
            sb.append("TimePeriod: " + getTimePeriod() + ",");
        if (getDimension() != null)
            sb.append("Dimension: " + getDimension() + ",");
        if (getContext() != null)
            sb.append("Context: " + getContext() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSearchString() == null) ? 0 : getSearchString().hashCode());
        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getDimension() == null) ? 0 : getDimension().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDimensionValuesRequest == false)
            return false;
        GetDimensionValuesRequest other = (GetDimensionValuesRequest) obj;

        if (other.getSearchString() == null ^ this.getSearchString() == null)
            return false;
        if (other.getSearchString() != null
                && other.getSearchString().equals(this.getSearchString()) == false)
            return false;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null
                && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getDimension() == null ^ this.getDimension() == null)
            return false;
        if (other.getDimension() != null
                && other.getDimension().equals(this.getDimension()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
