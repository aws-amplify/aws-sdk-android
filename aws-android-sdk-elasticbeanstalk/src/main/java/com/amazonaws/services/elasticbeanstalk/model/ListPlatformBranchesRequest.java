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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the platform branches available for your account in an AWS Region.
 * Provides summary information about each platform branch.
 * </p>
 * <p>
 * For definitions of platform branch and other platform-related terms, see <a
 * href=
 * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/platforms-glossary.html"
 * >AWS Elastic Beanstalk Platforms Glossary</a>.
 * </p>
 */
public class ListPlatformBranchesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Criteria for restricting the resulting list of platform branches. The
     * filter is evaluated as a logical conjunction (AND) of the separate
     * <code>SearchFilter</code> terms.
     * </p>
     * <p>
     * The following list shows valid attribute values for each of the
     * <code>SearchFilter</code> terms. Most operators take a single value. The
     * <code>in</code> and <code>not_in</code> operators can take multiple
     * values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Attribute = BranchName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> |
     * <code>begins_with</code> | <code>ends_with</code> | <code>contains</code>
     * | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = LifecycleState</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>in</code>
     * | <code>not_in</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>beta</code> | <code>supported</code> |
     * <code>deprecated</code> | <code>retired</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = PlatformName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> |
     * <code>begins_with</code> | <code>ends_with</code> | <code>contains</code>
     * | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = TierType</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>WebServer/Standard</code> |
     * <code>Worker/SQS/HTTP</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Array size: limited to 10 <code>SearchFilter</code> objects.
     * </p>
     * <p>
     * Within each <code>SearchFilter</code> item, the <code>Values</code> array
     * is limited to 10 items.
     * </p>
     */
    private java.util.List<SearchFilter> filters;

    /**
     * <p>
     * The maximum number of platform branch values returned in one call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxRecords;

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to
     * retrieve the next response page. All other parameter values must be
     * identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Criteria for restricting the resulting list of platform branches. The
     * filter is evaluated as a logical conjunction (AND) of the separate
     * <code>SearchFilter</code> terms.
     * </p>
     * <p>
     * The following list shows valid attribute values for each of the
     * <code>SearchFilter</code> terms. Most operators take a single value. The
     * <code>in</code> and <code>not_in</code> operators can take multiple
     * values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Attribute = BranchName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> |
     * <code>begins_with</code> | <code>ends_with</code> | <code>contains</code>
     * | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = LifecycleState</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>in</code>
     * | <code>not_in</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>beta</code> | <code>supported</code> |
     * <code>deprecated</code> | <code>retired</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = PlatformName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> |
     * <code>begins_with</code> | <code>ends_with</code> | <code>contains</code>
     * | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = TierType</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>WebServer/Standard</code> |
     * <code>Worker/SQS/HTTP</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Array size: limited to 10 <code>SearchFilter</code> objects.
     * </p>
     * <p>
     * Within each <code>SearchFilter</code> item, the <code>Values</code> array
     * is limited to 10 items.
     * </p>
     *
     * @return <p>
     *         Criteria for restricting the resulting list of platform branches.
     *         The filter is evaluated as a logical conjunction (AND) of the
     *         separate <code>SearchFilter</code> terms.
     *         </p>
     *         <p>
     *         The following list shows valid attribute values for each of the
     *         <code>SearchFilter</code> terms. Most operators take a single
     *         value. The <code>in</code> and <code>not_in</code> operators can
     *         take multiple values.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Attribute = BranchName</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Operator</code>: <code>=</code> | <code>!=</code> |
     *         <code>begins_with</code> | <code>ends_with</code> |
     *         <code>contains</code> | <code>in</code> | <code>not_in</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Attribute = LifecycleState</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Operator</code>: <code>=</code> | <code>!=</code> |
     *         <code>in</code> | <code>not_in</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Values</code>: <code>beta</code> | <code>supported</code> |
     *         <code>deprecated</code> | <code>retired</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Attribute = PlatformName</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Operator</code>: <code>=</code> | <code>!=</code> |
     *         <code>begins_with</code> | <code>ends_with</code> |
     *         <code>contains</code> | <code>in</code> | <code>not_in</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Attribute = TierType</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Operator</code>: <code>=</code> | <code>!=</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Values</code>: <code>WebServer/Standard</code> |
     *         <code>Worker/SQS/HTTP</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         Array size: limited to 10 <code>SearchFilter</code> objects.
     *         </p>
     *         <p>
     *         Within each <code>SearchFilter</code> item, the
     *         <code>Values</code> array is limited to 10 items.
     *         </p>
     */
    public java.util.List<SearchFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Criteria for restricting the resulting list of platform branches. The
     * filter is evaluated as a logical conjunction (AND) of the separate
     * <code>SearchFilter</code> terms.
     * </p>
     * <p>
     * The following list shows valid attribute values for each of the
     * <code>SearchFilter</code> terms. Most operators take a single value. The
     * <code>in</code> and <code>not_in</code> operators can take multiple
     * values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Attribute = BranchName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> |
     * <code>begins_with</code> | <code>ends_with</code> | <code>contains</code>
     * | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = LifecycleState</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>in</code>
     * | <code>not_in</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>beta</code> | <code>supported</code> |
     * <code>deprecated</code> | <code>retired</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = PlatformName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> |
     * <code>begins_with</code> | <code>ends_with</code> | <code>contains</code>
     * | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = TierType</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>WebServer/Standard</code> |
     * <code>Worker/SQS/HTTP</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Array size: limited to 10 <code>SearchFilter</code> objects.
     * </p>
     * <p>
     * Within each <code>SearchFilter</code> item, the <code>Values</code> array
     * is limited to 10 items.
     * </p>
     *
     * @param filters <p>
     *            Criteria for restricting the resulting list of platform
     *            branches. The filter is evaluated as a logical conjunction
     *            (AND) of the separate <code>SearchFilter</code> terms.
     *            </p>
     *            <p>
     *            The following list shows valid attribute values for each of
     *            the <code>SearchFilter</code> terms. Most operators take a
     *            single value. The <code>in</code> and <code>not_in</code>
     *            operators can take multiple values.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Attribute = BranchName</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Operator</code>: <code>=</code> | <code>!=</code> |
     *            <code>begins_with</code> | <code>ends_with</code> |
     *            <code>contains</code> | <code>in</code> | <code>not_in</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Attribute = LifecycleState</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Operator</code>: <code>=</code> | <code>!=</code> |
     *            <code>in</code> | <code>not_in</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Values</code>: <code>beta</code> |
     *            <code>supported</code> | <code>deprecated</code> |
     *            <code>retired</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Attribute = PlatformName</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Operator</code>: <code>=</code> | <code>!=</code> |
     *            <code>begins_with</code> | <code>ends_with</code> |
     *            <code>contains</code> | <code>in</code> | <code>not_in</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Attribute = TierType</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Operator</code>: <code>=</code> | <code>!=</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Values</code>: <code>WebServer/Standard</code> |
     *            <code>Worker/SQS/HTTP</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <p>
     *            Array size: limited to 10 <code>SearchFilter</code> objects.
     *            </p>
     *            <p>
     *            Within each <code>SearchFilter</code> item, the
     *            <code>Values</code> array is limited to 10 items.
     *            </p>
     */
    public void setFilters(java.util.Collection<SearchFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<SearchFilter>(filters);
    }

    /**
     * <p>
     * Criteria for restricting the resulting list of platform branches. The
     * filter is evaluated as a logical conjunction (AND) of the separate
     * <code>SearchFilter</code> terms.
     * </p>
     * <p>
     * The following list shows valid attribute values for each of the
     * <code>SearchFilter</code> terms. Most operators take a single value. The
     * <code>in</code> and <code>not_in</code> operators can take multiple
     * values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Attribute = BranchName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> |
     * <code>begins_with</code> | <code>ends_with</code> | <code>contains</code>
     * | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = LifecycleState</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>in</code>
     * | <code>not_in</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>beta</code> | <code>supported</code> |
     * <code>deprecated</code> | <code>retired</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = PlatformName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> |
     * <code>begins_with</code> | <code>ends_with</code> | <code>contains</code>
     * | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = TierType</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>WebServer/Standard</code> |
     * <code>Worker/SQS/HTTP</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Array size: limited to 10 <code>SearchFilter</code> objects.
     * </p>
     * <p>
     * Within each <code>SearchFilter</code> item, the <code>Values</code> array
     * is limited to 10 items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Criteria for restricting the resulting list of platform
     *            branches. The filter is evaluated as a logical conjunction
     *            (AND) of the separate <code>SearchFilter</code> terms.
     *            </p>
     *            <p>
     *            The following list shows valid attribute values for each of
     *            the <code>SearchFilter</code> terms. Most operators take a
     *            single value. The <code>in</code> and <code>not_in</code>
     *            operators can take multiple values.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Attribute = BranchName</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Operator</code>: <code>=</code> | <code>!=</code> |
     *            <code>begins_with</code> | <code>ends_with</code> |
     *            <code>contains</code> | <code>in</code> | <code>not_in</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Attribute = LifecycleState</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Operator</code>: <code>=</code> | <code>!=</code> |
     *            <code>in</code> | <code>not_in</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Values</code>: <code>beta</code> |
     *            <code>supported</code> | <code>deprecated</code> |
     *            <code>retired</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Attribute = PlatformName</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Operator</code>: <code>=</code> | <code>!=</code> |
     *            <code>begins_with</code> | <code>ends_with</code> |
     *            <code>contains</code> | <code>in</code> | <code>not_in</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Attribute = TierType</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Operator</code>: <code>=</code> | <code>!=</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Values</code>: <code>WebServer/Standard</code> |
     *            <code>Worker/SQS/HTTP</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <p>
     *            Array size: limited to 10 <code>SearchFilter</code> objects.
     *            </p>
     *            <p>
     *            Within each <code>SearchFilter</code> item, the
     *            <code>Values</code> array is limited to 10 items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlatformBranchesRequest withFilters(SearchFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<SearchFilter>(filters.length);
        }
        for (SearchFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Criteria for restricting the resulting list of platform branches. The
     * filter is evaluated as a logical conjunction (AND) of the separate
     * <code>SearchFilter</code> terms.
     * </p>
     * <p>
     * The following list shows valid attribute values for each of the
     * <code>SearchFilter</code> terms. Most operators take a single value. The
     * <code>in</code> and <code>not_in</code> operators can take multiple
     * values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Attribute = BranchName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> |
     * <code>begins_with</code> | <code>ends_with</code> | <code>contains</code>
     * | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = LifecycleState</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>in</code>
     * | <code>not_in</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>beta</code> | <code>supported</code> |
     * <code>deprecated</code> | <code>retired</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = PlatformName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> |
     * <code>begins_with</code> | <code>ends_with</code> | <code>contains</code>
     * | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = TierType</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>WebServer/Standard</code> |
     * <code>Worker/SQS/HTTP</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Array size: limited to 10 <code>SearchFilter</code> objects.
     * </p>
     * <p>
     * Within each <code>SearchFilter</code> item, the <code>Values</code> array
     * is limited to 10 items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Criteria for restricting the resulting list of platform
     *            branches. The filter is evaluated as a logical conjunction
     *            (AND) of the separate <code>SearchFilter</code> terms.
     *            </p>
     *            <p>
     *            The following list shows valid attribute values for each of
     *            the <code>SearchFilter</code> terms. Most operators take a
     *            single value. The <code>in</code> and <code>not_in</code>
     *            operators can take multiple values.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Attribute = BranchName</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Operator</code>: <code>=</code> | <code>!=</code> |
     *            <code>begins_with</code> | <code>ends_with</code> |
     *            <code>contains</code> | <code>in</code> | <code>not_in</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Attribute = LifecycleState</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Operator</code>: <code>=</code> | <code>!=</code> |
     *            <code>in</code> | <code>not_in</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Values</code>: <code>beta</code> |
     *            <code>supported</code> | <code>deprecated</code> |
     *            <code>retired</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Attribute = PlatformName</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Operator</code>: <code>=</code> | <code>!=</code> |
     *            <code>begins_with</code> | <code>ends_with</code> |
     *            <code>contains</code> | <code>in</code> | <code>not_in</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Attribute = TierType</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Operator</code>: <code>=</code> | <code>!=</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Values</code>: <code>WebServer/Standard</code> |
     *            <code>Worker/SQS/HTTP</code>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            <p>
     *            Array size: limited to 10 <code>SearchFilter</code> objects.
     *            </p>
     *            <p>
     *            Within each <code>SearchFilter</code> item, the
     *            <code>Values</code> array is limited to 10 items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlatformBranchesRequest withFilters(java.util.Collection<SearchFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of platform branch values returned in one call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of platform branch values returned in one
     *         call.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of platform branch values returned in one call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxRecords <p>
     *            The maximum number of platform branch values returned in one
     *            call.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of platform branch values returned in one call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxRecords <p>
     *            The maximum number of platform branch values returned in one
     *            call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlatformBranchesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to
     * retrieve the next response page. All other parameter values must be
     * identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     *
     * @return <p>
     *         For a paginated request. Specify a token from a previous response
     *         page to retrieve the next response page. All other parameter
     *         values must be identical to the ones specified in the initial
     *         request.
     *         </p>
     *         <p>
     *         If no <code>NextToken</code> is specified, the first page is
     *         retrieved.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to
     * retrieve the next response page. All other parameter values must be
     * identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     *
     * @param nextToken <p>
     *            For a paginated request. Specify a token from a previous
     *            response page to retrieve the next response page. All other
     *            parameter values must be identical to the ones specified in
     *            the initial request.
     *            </p>
     *            <p>
     *            If no <code>NextToken</code> is specified, the first page is
     *            retrieved.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to
     * retrieve the next response page. All other parameter values must be
     * identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            For a paginated request. Specify a token from a previous
     *            response page to retrieve the next response page. All other
     *            parameter values must be identical to the ones specified in
     *            the initial request.
     *            </p>
     *            <p>
     *            If no <code>NextToken</code> is specified, the first page is
     *            retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPlatformBranchesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPlatformBranchesRequest == false)
            return false;
        ListPlatformBranchesRequest other = (ListPlatformBranchesRequest) obj;

        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
