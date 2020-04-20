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
 * Creates recommendations that helps you save cost by identifying idle and
 * underutilized Amazon EC2 instances.
 * </p>
 * <p>
 * Recommendations are generated to either downsize or terminate instances,
 * along with providing savings detail and metrics. For details on calculation
 * and function, see <a href=
 * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/ce-what-is.html"
 * >Optimizing Your Cost with Rightsizing Recommendations</a>.
 * </p>
 */
public class GetRightsizingRecommendationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Use <code>Expression</code> to filter by cost or by usage. There are two
     * patterns:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Simple dimension values - You can set the dimension name and values for
     * the filters that you plan to use. For example, you can filter for
     * <code>REGION==us-east-1 OR REGION==us-west-1</code>. The
     * <code>Expression</code> for that looks like this:
     * </p>
     * <p>
     * <code>{ "Dimensions": { "Key": "REGION", "Values": [ "us-east-1", “us-west-1” ] } }</code>
     * </p>
     * <p>
     * The list of dimension values are OR'd together to retrieve cost or usage
     * data. You can create <code>Expression</code> and
     * <code>DimensionValues</code> objects using either <code>with*</code>
     * methods or <code>set*</code> methods in multiple lines.
     * </p>
     * </li>
     * <li>
     * <p>
     * Compound dimension values with logical operations - You can use multiple
     * <code>Expression</code> types and the logical operators
     * <code>AND/OR/NOT</code> to create a list of one or more
     * <code>Expression</code> objects. This allows you to filter on more
     * advanced options. For example, you can filter on
     * <code>((REGION == us-east-1 OR REGION == us-west-1) OR (TAG.Type == Type1)) AND (USAGE_TYPE != DataTransfer)</code>
     * . The <code>Expression</code> for that looks like this:
     * </p>
     * <p>
     * <code>{ "And": [ {"Or": [ {"Dimensions": { "Key": "REGION", "Values": [ "us-east-1", "us-west-1" ] }}, {"Tags": { "Key": "TagName", "Values": ["Value1"] } } ]}, {"Not": {"Dimensions": { "Key": "USAGE_TYPE", "Values": ["DataTransfer"] }}} ] } </code>
     * </p>
     * <note>
     * <p>
     * Because each <code>Expression</code> can have only one operator, the
     * service returns an error if more than one is specified. The following
     * example shows an <code>Expression</code> object that creates an error.
     * </p>
     * </note>
     * <p>
     * <code> { "And": [ ... ], "DimensionValues": { "Dimension": "USAGE_TYPE", "Values": [ "DataTransfer" ] } } </code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * For <code>GetRightsizingRecommendation</code> action, a combination of OR
     * and NOT is not supported. OR is not supported between different
     * dimensions, or dimensions and tags. NOT operators aren't supported.
     * Dimensions are also limited to <code>LINKED_ACCOUNT</code>,
     * <code>REGION</code>, or <code>RIGHTSIZING_TYPE</code>.
     * </p>
     * </note>
     */
    private Expression filter;

    /**
     * <p>
     * The specific service that you want recommendations for. The only valid
     * value for <code>GetRightsizingRecommendation</code> is "
     * <code>AmazonEC2</code>".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String service;

    /**
     * <p>
     * The number of recommendations that you want returned in a single response
     * object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer pageSize;

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want
     * to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * Use <code>Expression</code> to filter by cost or by usage. There are two
     * patterns:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Simple dimension values - You can set the dimension name and values for
     * the filters that you plan to use. For example, you can filter for
     * <code>REGION==us-east-1 OR REGION==us-west-1</code>. The
     * <code>Expression</code> for that looks like this:
     * </p>
     * <p>
     * <code>{ "Dimensions": { "Key": "REGION", "Values": [ "us-east-1", “us-west-1” ] } }</code>
     * </p>
     * <p>
     * The list of dimension values are OR'd together to retrieve cost or usage
     * data. You can create <code>Expression</code> and
     * <code>DimensionValues</code> objects using either <code>with*</code>
     * methods or <code>set*</code> methods in multiple lines.
     * </p>
     * </li>
     * <li>
     * <p>
     * Compound dimension values with logical operations - You can use multiple
     * <code>Expression</code> types and the logical operators
     * <code>AND/OR/NOT</code> to create a list of one or more
     * <code>Expression</code> objects. This allows you to filter on more
     * advanced options. For example, you can filter on
     * <code>((REGION == us-east-1 OR REGION == us-west-1) OR (TAG.Type == Type1)) AND (USAGE_TYPE != DataTransfer)</code>
     * . The <code>Expression</code> for that looks like this:
     * </p>
     * <p>
     * <code>{ "And": [ {"Or": [ {"Dimensions": { "Key": "REGION", "Values": [ "us-east-1", "us-west-1" ] }}, {"Tags": { "Key": "TagName", "Values": ["Value1"] } } ]}, {"Not": {"Dimensions": { "Key": "USAGE_TYPE", "Values": ["DataTransfer"] }}} ] } </code>
     * </p>
     * <note>
     * <p>
     * Because each <code>Expression</code> can have only one operator, the
     * service returns an error if more than one is specified. The following
     * example shows an <code>Expression</code> object that creates an error.
     * </p>
     * </note>
     * <p>
     * <code> { "And": [ ... ], "DimensionValues": { "Dimension": "USAGE_TYPE", "Values": [ "DataTransfer" ] } } </code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * For <code>GetRightsizingRecommendation</code> action, a combination of OR
     * and NOT is not supported. OR is not supported between different
     * dimensions, or dimensions and tags. NOT operators aren't supported.
     * Dimensions are also limited to <code>LINKED_ACCOUNT</code>,
     * <code>REGION</code>, or <code>RIGHTSIZING_TYPE</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         Use <code>Expression</code> to filter by cost or by usage. There
     *         are two patterns:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Simple dimension values - You can set the dimension name and
     *         values for the filters that you plan to use. For example, you can
     *         filter for <code>REGION==us-east-1 OR REGION==us-west-1</code>.
     *         The <code>Expression</code> for that looks like this:
     *         </p>
     *         <p>
     *         <code>{ "Dimensions": { "Key": "REGION", "Values": [ "us-east-1", “us-west-1” ] } }</code>
     *         </p>
     *         <p>
     *         The list of dimension values are OR'd together to retrieve cost
     *         or usage data. You can create <code>Expression</code> and
     *         <code>DimensionValues</code> objects using either
     *         <code>with*</code> methods or <code>set*</code> methods in
     *         multiple lines.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Compound dimension values with logical operations - You can use
     *         multiple <code>Expression</code> types and the logical operators
     *         <code>AND/OR/NOT</code> to create a list of one or more
     *         <code>Expression</code> objects. This allows you to filter on
     *         more advanced options. For example, you can filter on
     *         <code>((REGION == us-east-1 OR REGION == us-west-1) OR (TAG.Type == Type1)) AND (USAGE_TYPE != DataTransfer)</code>
     *         . The <code>Expression</code> for that looks like this:
     *         </p>
     *         <p>
     *         <code>{ "And": [ {"Or": [ {"Dimensions": { "Key": "REGION", "Values": [ "us-east-1", "us-west-1" ] }}, {"Tags": { "Key": "TagName", "Values": ["Value1"] } } ]}, {"Not": {"Dimensions": { "Key": "USAGE_TYPE", "Values": ["DataTransfer"] }}} ] } </code>
     *         </p>
     *         <note>
     *         <p>
     *         Because each <code>Expression</code> can have only one operator,
     *         the service returns an error if more than one is specified. The
     *         following example shows an <code>Expression</code> object that
     *         creates an error.
     *         </p>
     *         </note>
     *         <p>
     *         <code> { "And": [ ... ], "DimensionValues": { "Dimension": "USAGE_TYPE", "Values": [ "DataTransfer" ] } } </code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         For <code>GetRightsizingRecommendation</code> action, a
     *         combination of OR and NOT is not supported. OR is not supported
     *         between different dimensions, or dimensions and tags. NOT
     *         operators aren't supported. Dimensions are also limited to
     *         <code>LINKED_ACCOUNT</code>, <code>REGION</code>, or
     *         <code>RIGHTSIZING_TYPE</code>.
     *         </p>
     *         </note>
     */
    public Expression getFilter() {
        return filter;
    }

    /**
     * <p>
     * Use <code>Expression</code> to filter by cost or by usage. There are two
     * patterns:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Simple dimension values - You can set the dimension name and values for
     * the filters that you plan to use. For example, you can filter for
     * <code>REGION==us-east-1 OR REGION==us-west-1</code>. The
     * <code>Expression</code> for that looks like this:
     * </p>
     * <p>
     * <code>{ "Dimensions": { "Key": "REGION", "Values": [ "us-east-1", “us-west-1” ] } }</code>
     * </p>
     * <p>
     * The list of dimension values are OR'd together to retrieve cost or usage
     * data. You can create <code>Expression</code> and
     * <code>DimensionValues</code> objects using either <code>with*</code>
     * methods or <code>set*</code> methods in multiple lines.
     * </p>
     * </li>
     * <li>
     * <p>
     * Compound dimension values with logical operations - You can use multiple
     * <code>Expression</code> types and the logical operators
     * <code>AND/OR/NOT</code> to create a list of one or more
     * <code>Expression</code> objects. This allows you to filter on more
     * advanced options. For example, you can filter on
     * <code>((REGION == us-east-1 OR REGION == us-west-1) OR (TAG.Type == Type1)) AND (USAGE_TYPE != DataTransfer)</code>
     * . The <code>Expression</code> for that looks like this:
     * </p>
     * <p>
     * <code>{ "And": [ {"Or": [ {"Dimensions": { "Key": "REGION", "Values": [ "us-east-1", "us-west-1" ] }}, {"Tags": { "Key": "TagName", "Values": ["Value1"] } } ]}, {"Not": {"Dimensions": { "Key": "USAGE_TYPE", "Values": ["DataTransfer"] }}} ] } </code>
     * </p>
     * <note>
     * <p>
     * Because each <code>Expression</code> can have only one operator, the
     * service returns an error if more than one is specified. The following
     * example shows an <code>Expression</code> object that creates an error.
     * </p>
     * </note>
     * <p>
     * <code> { "And": [ ... ], "DimensionValues": { "Dimension": "USAGE_TYPE", "Values": [ "DataTransfer" ] } } </code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * For <code>GetRightsizingRecommendation</code> action, a combination of OR
     * and NOT is not supported. OR is not supported between different
     * dimensions, or dimensions and tags. NOT operators aren't supported.
     * Dimensions are also limited to <code>LINKED_ACCOUNT</code>,
     * <code>REGION</code>, or <code>RIGHTSIZING_TYPE</code>.
     * </p>
     * </note>
     *
     * @param filter <p>
     *            Use <code>Expression</code> to filter by cost or by usage.
     *            There are two patterns:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Simple dimension values - You can set the dimension name and
     *            values for the filters that you plan to use. For example, you
     *            can filter for
     *            <code>REGION==us-east-1 OR REGION==us-west-1</code>. The
     *            <code>Expression</code> for that looks like this:
     *            </p>
     *            <p>
     *            <code>{ "Dimensions": { "Key": "REGION", "Values": [ "us-east-1", “us-west-1” ] } }</code>
     *            </p>
     *            <p>
     *            The list of dimension values are OR'd together to retrieve
     *            cost or usage data. You can create <code>Expression</code> and
     *            <code>DimensionValues</code> objects using either
     *            <code>with*</code> methods or <code>set*</code> methods in
     *            multiple lines.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Compound dimension values with logical operations - You can
     *            use multiple <code>Expression</code> types and the logical
     *            operators <code>AND/OR/NOT</code> to create a list of one or
     *            more <code>Expression</code> objects. This allows you to
     *            filter on more advanced options. For example, you can filter
     *            on
     *            <code>((REGION == us-east-1 OR REGION == us-west-1) OR (TAG.Type == Type1)) AND (USAGE_TYPE != DataTransfer)</code>
     *            . The <code>Expression</code> for that looks like this:
     *            </p>
     *            <p>
     *            <code>{ "And": [ {"Or": [ {"Dimensions": { "Key": "REGION", "Values": [ "us-east-1", "us-west-1" ] }}, {"Tags": { "Key": "TagName", "Values": ["Value1"] } } ]}, {"Not": {"Dimensions": { "Key": "USAGE_TYPE", "Values": ["DataTransfer"] }}} ] } </code>
     *            </p>
     *            <note>
     *            <p>
     *            Because each <code>Expression</code> can have only one
     *            operator, the service returns an error if more than one is
     *            specified. The following example shows an
     *            <code>Expression</code> object that creates an error.
     *            </p>
     *            </note>
     *            <p>
     *            <code> { "And": [ ... ], "DimensionValues": { "Dimension": "USAGE_TYPE", "Values": [ "DataTransfer" ] } } </code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            For <code>GetRightsizingRecommendation</code> action, a
     *            combination of OR and NOT is not supported. OR is not
     *            supported between different dimensions, or dimensions and
     *            tags. NOT operators aren't supported. Dimensions are also
     *            limited to <code>LINKED_ACCOUNT</code>, <code>REGION</code>,
     *            or <code>RIGHTSIZING_TYPE</code>.
     *            </p>
     *            </note>
     */
    public void setFilter(Expression filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Use <code>Expression</code> to filter by cost or by usage. There are two
     * patterns:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Simple dimension values - You can set the dimension name and values for
     * the filters that you plan to use. For example, you can filter for
     * <code>REGION==us-east-1 OR REGION==us-west-1</code>. The
     * <code>Expression</code> for that looks like this:
     * </p>
     * <p>
     * <code>{ "Dimensions": { "Key": "REGION", "Values": [ "us-east-1", “us-west-1” ] } }</code>
     * </p>
     * <p>
     * The list of dimension values are OR'd together to retrieve cost or usage
     * data. You can create <code>Expression</code> and
     * <code>DimensionValues</code> objects using either <code>with*</code>
     * methods or <code>set*</code> methods in multiple lines.
     * </p>
     * </li>
     * <li>
     * <p>
     * Compound dimension values with logical operations - You can use multiple
     * <code>Expression</code> types and the logical operators
     * <code>AND/OR/NOT</code> to create a list of one or more
     * <code>Expression</code> objects. This allows you to filter on more
     * advanced options. For example, you can filter on
     * <code>((REGION == us-east-1 OR REGION == us-west-1) OR (TAG.Type == Type1)) AND (USAGE_TYPE != DataTransfer)</code>
     * . The <code>Expression</code> for that looks like this:
     * </p>
     * <p>
     * <code>{ "And": [ {"Or": [ {"Dimensions": { "Key": "REGION", "Values": [ "us-east-1", "us-west-1" ] }}, {"Tags": { "Key": "TagName", "Values": ["Value1"] } } ]}, {"Not": {"Dimensions": { "Key": "USAGE_TYPE", "Values": ["DataTransfer"] }}} ] } </code>
     * </p>
     * <note>
     * <p>
     * Because each <code>Expression</code> can have only one operator, the
     * service returns an error if more than one is specified. The following
     * example shows an <code>Expression</code> object that creates an error.
     * </p>
     * </note>
     * <p>
     * <code> { "And": [ ... ], "DimensionValues": { "Dimension": "USAGE_TYPE", "Values": [ "DataTransfer" ] } } </code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * For <code>GetRightsizingRecommendation</code> action, a combination of OR
     * and NOT is not supported. OR is not supported between different
     * dimensions, or dimensions and tags. NOT operators aren't supported.
     * Dimensions are also limited to <code>LINKED_ACCOUNT</code>,
     * <code>REGION</code>, or <code>RIGHTSIZING_TYPE</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            Use <code>Expression</code> to filter by cost or by usage.
     *            There are two patterns:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Simple dimension values - You can set the dimension name and
     *            values for the filters that you plan to use. For example, you
     *            can filter for
     *            <code>REGION==us-east-1 OR REGION==us-west-1</code>. The
     *            <code>Expression</code> for that looks like this:
     *            </p>
     *            <p>
     *            <code>{ "Dimensions": { "Key": "REGION", "Values": [ "us-east-1", “us-west-1” ] } }</code>
     *            </p>
     *            <p>
     *            The list of dimension values are OR'd together to retrieve
     *            cost or usage data. You can create <code>Expression</code> and
     *            <code>DimensionValues</code> objects using either
     *            <code>with*</code> methods or <code>set*</code> methods in
     *            multiple lines.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Compound dimension values with logical operations - You can
     *            use multiple <code>Expression</code> types and the logical
     *            operators <code>AND/OR/NOT</code> to create a list of one or
     *            more <code>Expression</code> objects. This allows you to
     *            filter on more advanced options. For example, you can filter
     *            on
     *            <code>((REGION == us-east-1 OR REGION == us-west-1) OR (TAG.Type == Type1)) AND (USAGE_TYPE != DataTransfer)</code>
     *            . The <code>Expression</code> for that looks like this:
     *            </p>
     *            <p>
     *            <code>{ "And": [ {"Or": [ {"Dimensions": { "Key": "REGION", "Values": [ "us-east-1", "us-west-1" ] }}, {"Tags": { "Key": "TagName", "Values": ["Value1"] } } ]}, {"Not": {"Dimensions": { "Key": "USAGE_TYPE", "Values": ["DataTransfer"] }}} ] } </code>
     *            </p>
     *            <note>
     *            <p>
     *            Because each <code>Expression</code> can have only one
     *            operator, the service returns an error if more than one is
     *            specified. The following example shows an
     *            <code>Expression</code> object that creates an error.
     *            </p>
     *            </note>
     *            <p>
     *            <code> { "And": [ ... ], "DimensionValues": { "Dimension": "USAGE_TYPE", "Values": [ "DataTransfer" ] } } </code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            For <code>GetRightsizingRecommendation</code> action, a
     *            combination of OR and NOT is not supported. OR is not
     *            supported between different dimensions, or dimensions and
     *            tags. NOT operators aren't supported. Dimensions are also
     *            limited to <code>LINKED_ACCOUNT</code>, <code>REGION</code>,
     *            or <code>RIGHTSIZING_TYPE</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRightsizingRecommendationRequest withFilter(Expression filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * The specific service that you want recommendations for. The only valid
     * value for <code>GetRightsizingRecommendation</code> is "
     * <code>AmazonEC2</code>".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The specific service that you want recommendations for. The only
     *         valid value for <code>GetRightsizingRecommendation</code> is "
     *         <code>AmazonEC2</code>".
     *         </p>
     */
    public String getService() {
        return service;
    }

    /**
     * <p>
     * The specific service that you want recommendations for. The only valid
     * value for <code>GetRightsizingRecommendation</code> is "
     * <code>AmazonEC2</code>".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param service <p>
     *            The specific service that you want recommendations for. The
     *            only valid value for <code>GetRightsizingRecommendation</code>
     *            is "<code>AmazonEC2</code>".
     *            </p>
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The specific service that you want recommendations for. The only valid
     * value for <code>GetRightsizingRecommendation</code> is "
     * <code>AmazonEC2</code>".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param service <p>
     *            The specific service that you want recommendations for. The
     *            only valid value for <code>GetRightsizingRecommendation</code>
     *            is "<code>AmazonEC2</code>".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRightsizingRecommendationRequest withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * <p>
     * The number of recommendations that you want returned in a single response
     * object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of recommendations that you want returned in a single
     *         response object.
     *         </p>
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * <p>
     * The number of recommendations that you want returned in a single response
     * object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param pageSize <p>
     *            The number of recommendations that you want returned in a
     *            single response object.
     *            </p>
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The number of recommendations that you want returned in a single response
     * object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param pageSize <p>
     *            The number of recommendations that you want returned in a
     *            single response object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRightsizingRecommendationRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want
     * to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The pagination token that indicates the next set of results that
     *         you want to retrieve.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want
     * to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The pagination token that indicates the next set of results
     *            that you want to retrieve.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want
     * to retrieve.
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
     *            The pagination token that indicates the next set of results
     *            that you want to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRightsizingRecommendationRequest withNextPageToken(String nextPageToken) {
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
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getService() != null)
            sb.append("Service: " + getService() + ",");
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
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

        if (obj instanceof GetRightsizingRecommendationRequest == false)
            return false;
        GetRightsizingRecommendationRequest other = (GetRightsizingRecommendationRequest) obj;

        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
