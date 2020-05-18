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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about an action that occurred for a resource and
 * produced a policy finding.
 * </p>
 */
public class FindingAction implements Serializable {
    /**
     * <p>
     * The type of action that occurred for the affected resource. This value is
     * typically AWS_API_CALL, which indicates that an entity invoked an API
     * operation for the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_API_CALL
     */
    private String actionType;

    /**
     * <p>
     * For the affected resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name of the operation that was invoked most recently and produced the
     * finding (api).
     * </p>
     * </li>
     * <li>
     * <p>
     * The first date and time when any operation was invoked and produced the
     * finding (firstSeen).
     * </p>
     * </li>
     * <li>
     * <p>
     * The most recent date and time when the specified operation was invoked
     * and produced the finding (lastSeen).
     * </p>
     * </li>
     * </ul>
     * <p>
     * All date and time values are in UTC and extended ISO 8601 format.
     * </p>
     */
    private ApiCallDetails apiCallDetails;

    /**
     * <p>
     * The type of action that occurred for the affected resource. This value is
     * typically AWS_API_CALL, which indicates that an entity invoked an API
     * operation for the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_API_CALL
     *
     * @return <p>
     *         The type of action that occurred for the affected resource. This
     *         value is typically AWS_API_CALL, which indicates that an entity
     *         invoked an API operation for the resource.
     *         </p>
     * @see FindingActionType
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * <p>
     * The type of action that occurred for the affected resource. This value is
     * typically AWS_API_CALL, which indicates that an entity invoked an API
     * operation for the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_API_CALL
     *
     * @param actionType <p>
     *            The type of action that occurred for the affected resource.
     *            This value is typically AWS_API_CALL, which indicates that an
     *            entity invoked an API operation for the resource.
     *            </p>
     * @see FindingActionType
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of action that occurred for the affected resource. This value is
     * typically AWS_API_CALL, which indicates that an entity invoked an API
     * operation for the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_API_CALL
     *
     * @param actionType <p>
     *            The type of action that occurred for the affected resource.
     *            This value is typically AWS_API_CALL, which indicates that an
     *            entity invoked an API operation for the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingActionType
     */
    public FindingAction withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * <p>
     * The type of action that occurred for the affected resource. This value is
     * typically AWS_API_CALL, which indicates that an entity invoked an API
     * operation for the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_API_CALL
     *
     * @param actionType <p>
     *            The type of action that occurred for the affected resource.
     *            This value is typically AWS_API_CALL, which indicates that an
     *            entity invoked an API operation for the resource.
     *            </p>
     * @see FindingActionType
     */
    public void setActionType(FindingActionType actionType) {
        this.actionType = actionType.toString();
    }

    /**
     * <p>
     * The type of action that occurred for the affected resource. This value is
     * typically AWS_API_CALL, which indicates that an entity invoked an API
     * operation for the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS_API_CALL
     *
     * @param actionType <p>
     *            The type of action that occurred for the affected resource.
     *            This value is typically AWS_API_CALL, which indicates that an
     *            entity invoked an API operation for the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingActionType
     */
    public FindingAction withActionType(FindingActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * For the affected resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name of the operation that was invoked most recently and produced the
     * finding (api).
     * </p>
     * </li>
     * <li>
     * <p>
     * The first date and time when any operation was invoked and produced the
     * finding (firstSeen).
     * </p>
     * </li>
     * <li>
     * <p>
     * The most recent date and time when the specified operation was invoked
     * and produced the finding (lastSeen).
     * </p>
     * </li>
     * </ul>
     * <p>
     * All date and time values are in UTC and extended ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         For the affected resource:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The name of the operation that was invoked most recently and
     *         produced the finding (api).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first date and time when any operation was invoked and
     *         produced the finding (firstSeen).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The most recent date and time when the specified operation was
     *         invoked and produced the finding (lastSeen).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         All date and time values are in UTC and extended ISO 8601 format.
     *         </p>
     */
    public ApiCallDetails getApiCallDetails() {
        return apiCallDetails;
    }

    /**
     * <p>
     * For the affected resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name of the operation that was invoked most recently and produced the
     * finding (api).
     * </p>
     * </li>
     * <li>
     * <p>
     * The first date and time when any operation was invoked and produced the
     * finding (firstSeen).
     * </p>
     * </li>
     * <li>
     * <p>
     * The most recent date and time when the specified operation was invoked
     * and produced the finding (lastSeen).
     * </p>
     * </li>
     * </ul>
     * <p>
     * All date and time values are in UTC and extended ISO 8601 format.
     * </p>
     *
     * @param apiCallDetails <p>
     *            For the affected resource:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The name of the operation that was invoked most recently and
     *            produced the finding (api).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The first date and time when any operation was invoked and
     *            produced the finding (firstSeen).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The most recent date and time when the specified operation was
     *            invoked and produced the finding (lastSeen).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            All date and time values are in UTC and extended ISO 8601
     *            format.
     *            </p>
     */
    public void setApiCallDetails(ApiCallDetails apiCallDetails) {
        this.apiCallDetails = apiCallDetails;
    }

    /**
     * <p>
     * For the affected resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name of the operation that was invoked most recently and produced the
     * finding (api).
     * </p>
     * </li>
     * <li>
     * <p>
     * The first date and time when any operation was invoked and produced the
     * finding (firstSeen).
     * </p>
     * </li>
     * <li>
     * <p>
     * The most recent date and time when the specified operation was invoked
     * and produced the finding (lastSeen).
     * </p>
     * </li>
     * </ul>
     * <p>
     * All date and time values are in UTC and extended ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param apiCallDetails <p>
     *            For the affected resource:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The name of the operation that was invoked most recently and
     *            produced the finding (api).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The first date and time when any operation was invoked and
     *            produced the finding (firstSeen).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The most recent date and time when the specified operation was
     *            invoked and produced the finding (lastSeen).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            All date and time values are in UTC and extended ISO 8601
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindingAction withApiCallDetails(ApiCallDetails apiCallDetails) {
        this.apiCallDetails = apiCallDetails;
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
        if (getActionType() != null)
            sb.append("actionType: " + getActionType() + ",");
        if (getApiCallDetails() != null)
            sb.append("apiCallDetails: " + getApiCallDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode
                + ((getApiCallDetails() == null) ? 0 : getApiCallDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingAction == false)
            return false;
        FindingAction other = (FindingAction) obj;

        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null
                && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getApiCallDetails() == null ^ this.getApiCallDetails() == null)
            return false;
        if (other.getApiCallDetails() != null
                && other.getApiCallDetails().equals(this.getApiCallDetails()) == false)
            return false;
        return true;
    }
}
