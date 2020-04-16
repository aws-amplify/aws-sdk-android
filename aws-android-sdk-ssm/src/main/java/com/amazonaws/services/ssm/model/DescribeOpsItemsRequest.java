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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Query a set of OpsItems. You must have permission in AWS Identity and Access
 * Management (IAM) to query a list of OpsItems. For more information, see <a
 * href=
 * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html"
 * >Getting Started with OpsCenter</a> in the <i>AWS Systems Manager User
 * Guide</i>.
 * </p>
 * <p>
 * Operations engineers and IT professionals use OpsCenter to view, investigate,
 * and remediate operational issues impacting the performance and health of
 * their AWS resources. For more information, see <a href=
 * "http://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html"
 * >AWS Systems Manager OpsCenter</a> in the <i>AWS Systems Manager User
 * Guide</i>.
 * </p>
 */
public class DescribeOpsItemsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * One or more filters to limit the reponse.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key: CreatedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedBy
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Priority
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Source
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Status
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Title
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalData*
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataKey
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataValue
     * </p>
     * <p>
     * Operations: Equals, Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OpsItemId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: ResourceId
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: AutomationId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * </ul>
     * <p>
     * *If you filter the response by using the OperationalData operator,
     * specify a key-value pair by using the following JSON format:
     * {"key":"key_name","value":"a_value"}
     * </p>
     */
    private java.util.List<OpsItemFilter> opsItemFilters;

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more filters to limit the reponse.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key: CreatedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedBy
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Priority
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Source
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Status
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Title
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalData*
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataKey
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataValue
     * </p>
     * <p>
     * Operations: Equals, Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OpsItemId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: ResourceId
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: AutomationId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * </ul>
     * <p>
     * *If you filter the response by using the OperationalData operator,
     * specify a key-value pair by using the following JSON format:
     * {"key":"key_name","value":"a_value"}
     * </p>
     *
     * @return <p>
     *         One or more filters to limit the reponse.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key: CreatedTime
     *         </p>
     *         <p>
     *         Operations: GreaterThan, LessThan
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: LastModifiedBy
     *         </p>
     *         <p>
     *         Operations: Contains, Equals
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: LastModifiedTime
     *         </p>
     *         <p>
     *         Operations: GreaterThan, LessThan
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: Priority
     *         </p>
     *         <p>
     *         Operations: Equals
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: Source
     *         </p>
     *         <p>
     *         Operations: Contains, Equals
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: Status
     *         </p>
     *         <p>
     *         Operations: Equals
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: Title
     *         </p>
     *         <p>
     *         Operations: Contains
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: OperationalData*
     *         </p>
     *         <p>
     *         Operations: Equals
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: OperationalDataKey
     *         </p>
     *         <p>
     *         Operations: Equals
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: OperationalDataValue
     *         </p>
     *         <p>
     *         Operations: Equals, Contains
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: OpsItemId
     *         </p>
     *         <p>
     *         Operations: Equals
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: ResourceId
     *         </p>
     *         <p>
     *         Operations: Contains
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key: AutomationId
     *         </p>
     *         <p>
     *         Operations: Equals
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         *If you filter the response by using the OperationalData
     *         operator, specify a key-value pair by using the following JSON
     *         format: {"key":"key_name","value":"a_value"}
     *         </p>
     */
    public java.util.List<OpsItemFilter> getOpsItemFilters() {
        return opsItemFilters;
    }

    /**
     * <p>
     * One or more filters to limit the reponse.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key: CreatedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedBy
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Priority
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Source
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Status
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Title
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalData*
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataKey
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataValue
     * </p>
     * <p>
     * Operations: Equals, Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OpsItemId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: ResourceId
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: AutomationId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * </ul>
     * <p>
     * *If you filter the response by using the OperationalData operator,
     * specify a key-value pair by using the following JSON format:
     * {"key":"key_name","value":"a_value"}
     * </p>
     *
     * @param opsItemFilters <p>
     *            One or more filters to limit the reponse.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key: CreatedTime
     *            </p>
     *            <p>
     *            Operations: GreaterThan, LessThan
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: LastModifiedBy
     *            </p>
     *            <p>
     *            Operations: Contains, Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: LastModifiedTime
     *            </p>
     *            <p>
     *            Operations: GreaterThan, LessThan
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: Priority
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: Source
     *            </p>
     *            <p>
     *            Operations: Contains, Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: Status
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: Title
     *            </p>
     *            <p>
     *            Operations: Contains
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: OperationalData*
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: OperationalDataKey
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: OperationalDataValue
     *            </p>
     *            <p>
     *            Operations: Equals, Contains
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: OpsItemId
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: ResourceId
     *            </p>
     *            <p>
     *            Operations: Contains
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: AutomationId
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            *If you filter the response by using the OperationalData
     *            operator, specify a key-value pair by using the following JSON
     *            format: {"key":"key_name","value":"a_value"}
     *            </p>
     */
    public void setOpsItemFilters(java.util.Collection<OpsItemFilter> opsItemFilters) {
        if (opsItemFilters == null) {
            this.opsItemFilters = null;
            return;
        }

        this.opsItemFilters = new java.util.ArrayList<OpsItemFilter>(opsItemFilters);
    }

    /**
     * <p>
     * One or more filters to limit the reponse.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key: CreatedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedBy
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Priority
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Source
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Status
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Title
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalData*
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataKey
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataValue
     * </p>
     * <p>
     * Operations: Equals, Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OpsItemId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: ResourceId
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: AutomationId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * </ul>
     * <p>
     * *If you filter the response by using the OperationalData operator,
     * specify a key-value pair by using the following JSON format:
     * {"key":"key_name","value":"a_value"}
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param opsItemFilters <p>
     *            One or more filters to limit the reponse.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key: CreatedTime
     *            </p>
     *            <p>
     *            Operations: GreaterThan, LessThan
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: LastModifiedBy
     *            </p>
     *            <p>
     *            Operations: Contains, Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: LastModifiedTime
     *            </p>
     *            <p>
     *            Operations: GreaterThan, LessThan
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: Priority
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: Source
     *            </p>
     *            <p>
     *            Operations: Contains, Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: Status
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: Title
     *            </p>
     *            <p>
     *            Operations: Contains
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: OperationalData*
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: OperationalDataKey
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: OperationalDataValue
     *            </p>
     *            <p>
     *            Operations: Equals, Contains
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: OpsItemId
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: ResourceId
     *            </p>
     *            <p>
     *            Operations: Contains
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: AutomationId
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            *If you filter the response by using the OperationalData
     *            operator, specify a key-value pair by using the following JSON
     *            format: {"key":"key_name","value":"a_value"}
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOpsItemsRequest withOpsItemFilters(OpsItemFilter... opsItemFilters) {
        if (getOpsItemFilters() == null) {
            this.opsItemFilters = new java.util.ArrayList<OpsItemFilter>(opsItemFilters.length);
        }
        for (OpsItemFilter value : opsItemFilters) {
            this.opsItemFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters to limit the reponse.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key: CreatedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedBy
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: LastModifiedTime
     * </p>
     * <p>
     * Operations: GreaterThan, LessThan
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Priority
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Source
     * </p>
     * <p>
     * Operations: Contains, Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Status
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: Title
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalData*
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataKey
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OperationalDataValue
     * </p>
     * <p>
     * Operations: Equals, Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: OpsItemId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: ResourceId
     * </p>
     * <p>
     * Operations: Contains
     * </p>
     * </li>
     * <li>
     * <p>
     * Key: AutomationId
     * </p>
     * <p>
     * Operations: Equals
     * </p>
     * </li>
     * </ul>
     * <p>
     * *If you filter the response by using the OperationalData operator,
     * specify a key-value pair by using the following JSON format:
     * {"key":"key_name","value":"a_value"}
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param opsItemFilters <p>
     *            One or more filters to limit the reponse.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Key: CreatedTime
     *            </p>
     *            <p>
     *            Operations: GreaterThan, LessThan
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: LastModifiedBy
     *            </p>
     *            <p>
     *            Operations: Contains, Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: LastModifiedTime
     *            </p>
     *            <p>
     *            Operations: GreaterThan, LessThan
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: Priority
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: Source
     *            </p>
     *            <p>
     *            Operations: Contains, Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: Status
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: Title
     *            </p>
     *            <p>
     *            Operations: Contains
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: OperationalData*
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: OperationalDataKey
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: OperationalDataValue
     *            </p>
     *            <p>
     *            Operations: Equals, Contains
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: OpsItemId
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: ResourceId
     *            </p>
     *            <p>
     *            Operations: Contains
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Key: AutomationId
     *            </p>
     *            <p>
     *            Operations: Equals
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            *If you filter the response by using the OperationalData
     *            operator, specify a key-value pair by using the following JSON
     *            format: {"key":"key_name","value":"a_value"}
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOpsItemsRequest withOpsItemFilters(
            java.util.Collection<OpsItemFilter> opsItemFilters) {
        setOpsItemFilters(opsItemFilters);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The maximum number of items to return for this call. The call
     *         also returns a token that you can specify in a subsequent call to
     *         get the next set of results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this call. The call
     *            also returns a token that you can specify in a subsequent call
     *            to get the next set of results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return for this call. The call
     *            also returns a token that you can specify in a subsequent call
     *            to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOpsItemsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     *
     * @return <p>
     *         A token to start the list. Use this token to get the next set of
     *         results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            A token to start the list. Use this token to get the next set
     *            of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token to start the list. Use this token to get the next set
     *            of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOpsItemsRequest withNextToken(String nextToken) {
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
        if (getOpsItemFilters() != null)
            sb.append("OpsItemFilters: " + getOpsItemFilters() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOpsItemFilters() == null) ? 0 : getOpsItemFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOpsItemsRequest == false)
            return false;
        DescribeOpsItemsRequest other = (DescribeOpsItemsRequest) obj;

        if (other.getOpsItemFilters() == null ^ this.getOpsItemFilters() == null)
            return false;
        if (other.getOpsItemFilters() != null
                && other.getOpsItemFilters().equals(this.getOpsItemFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
