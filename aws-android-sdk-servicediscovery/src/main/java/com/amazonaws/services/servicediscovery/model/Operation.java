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

package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains information about a specified operation.
 * </p>
 */
public class Operation implements Serializable {
    /**
     * <p>
     * The ID of the operation that you want to get information about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String id;

    /**
     * <p>
     * The name of the operation that is associated with the specified ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_NAMESPACE, DELETE_NAMESPACE,
     * UPDATE_SERVICE, REGISTER_INSTANCE, DEREGISTER_INSTANCE
     */
    private String type;

    /**
     * <p>
     * The status of the operation. Values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SUBMITTED</b>: This is the initial state immediately after you submit
     * a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b>: AWS Cloud Map is performing the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAIL</b>: The operation failed. For the failure reason, see
     * <code>ErrorMessage</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PENDING, SUCCESS, FAIL
     */
    private String status;

    /**
     * <p>
     * If the value of <code>Status</code> is <code>FAIL</code>, the reason that
     * the operation failed.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The code associated with <code>ErrorMessage</code>. Values for
     * <code>ErrorCode</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANNOT_CREATE_HOSTED_ZONE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED_TOKEN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOSTED_ZONE_NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_FAILURE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CHANGE_BATCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THROTTLED_REQUEST</code>
     * </p>
     * </li>
     * </ul>
     */
    private String errorCode;

    /**
     * <p>
     * The date and time that the request was submitted, in Unix date/time
     * format and Coordinated Universal Time (UTC). The value of
     * <code>CreateDate</code> is accurate to milliseconds. For example, the
     * value <code>1516925490.087</code> represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The date and time that the value of <code>Status</code> changed to the
     * current value, in Unix date/time format and Coordinated Universal Time
     * (UTC). The value of <code>UpdateDate</code> is accurate to milliseconds.
     * For example, the value <code>1516925490.087</code> represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date updateDate;

    /**
     * <p>
     * The name of the target entity that is associated with the operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE</b>: The namespace ID is returned in the
     * <code>ResourceId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE</b>: The service ID is returned in the <code>ResourceId</code>
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INSTANCE</b>: The instance ID is returned in the
     * <code>ResourceId</code> property.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> targets;

    /**
     * <p>
     * The ID of the operation that you want to get information about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The ID of the operation that you want to get information about.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the operation that you want to get information about.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param id <p>
     *            The ID of the operation that you want to get information
     *            about.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the operation that you want to get information about.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param id <p>
     *            The ID of the operation that you want to get information
     *            about.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Operation withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the operation that is associated with the specified ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_NAMESPACE, DELETE_NAMESPACE,
     * UPDATE_SERVICE, REGISTER_INSTANCE, DEREGISTER_INSTANCE
     *
     * @return <p>
     *         The name of the operation that is associated with the specified
     *         ID.
     *         </p>
     * @see OperationType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The name of the operation that is associated with the specified ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_NAMESPACE, DELETE_NAMESPACE,
     * UPDATE_SERVICE, REGISTER_INSTANCE, DEREGISTER_INSTANCE
     *
     * @param type <p>
     *            The name of the operation that is associated with the
     *            specified ID.
     *            </p>
     * @see OperationType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The name of the operation that is associated with the specified ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_NAMESPACE, DELETE_NAMESPACE,
     * UPDATE_SERVICE, REGISTER_INSTANCE, DEREGISTER_INSTANCE
     *
     * @param type <p>
     *            The name of the operation that is associated with the
     *            specified ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationType
     */
    public Operation withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The name of the operation that is associated with the specified ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_NAMESPACE, DELETE_NAMESPACE,
     * UPDATE_SERVICE, REGISTER_INSTANCE, DEREGISTER_INSTANCE
     *
     * @param type <p>
     *            The name of the operation that is associated with the
     *            specified ID.
     *            </p>
     * @see OperationType
     */
    public void setType(OperationType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The name of the operation that is associated with the specified ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_NAMESPACE, DELETE_NAMESPACE,
     * UPDATE_SERVICE, REGISTER_INSTANCE, DEREGISTER_INSTANCE
     *
     * @param type <p>
     *            The name of the operation that is associated with the
     *            specified ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationType
     */
    public Operation withType(OperationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The status of the operation. Values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SUBMITTED</b>: This is the initial state immediately after you submit
     * a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b>: AWS Cloud Map is performing the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAIL</b>: The operation failed. For the failure reason, see
     * <code>ErrorMessage</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PENDING, SUCCESS, FAIL
     *
     * @return <p>
     *         The status of the operation. Values include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>SUBMITTED</b>: This is the initial state immediately after you
     *         submit a request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PENDING</b>: AWS Cloud Map is performing the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SUCCESS</b>: The operation succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FAIL</b>: The operation failed. For the failure reason, see
     *         <code>ErrorMessage</code>.
     *         </p>
     *         </li>
     *         </ul>
     * @see OperationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the operation. Values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SUBMITTED</b>: This is the initial state immediately after you submit
     * a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b>: AWS Cloud Map is performing the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAIL</b>: The operation failed. For the failure reason, see
     * <code>ErrorMessage</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PENDING, SUCCESS, FAIL
     *
     * @param status <p>
     *            The status of the operation. Values include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>SUBMITTED</b>: This is the initial state immediately after
     *            you submit a request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>PENDING</b>: AWS Cloud Map is performing the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>SUCCESS</b>: The operation succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>FAIL</b>: The operation failed. For the failure reason, see
     *            <code>ErrorMessage</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see OperationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the operation. Values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SUBMITTED</b>: This is the initial state immediately after you submit
     * a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b>: AWS Cloud Map is performing the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAIL</b>: The operation failed. For the failure reason, see
     * <code>ErrorMessage</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PENDING, SUCCESS, FAIL
     *
     * @param status <p>
     *            The status of the operation. Values include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>SUBMITTED</b>: This is the initial state immediately after
     *            you submit a request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>PENDING</b>: AWS Cloud Map is performing the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>SUCCESS</b>: The operation succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>FAIL</b>: The operation failed. For the failure reason, see
     *            <code>ErrorMessage</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationStatus
     */
    public Operation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the operation. Values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SUBMITTED</b>: This is the initial state immediately after you submit
     * a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b>: AWS Cloud Map is performing the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAIL</b>: The operation failed. For the failure reason, see
     * <code>ErrorMessage</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PENDING, SUCCESS, FAIL
     *
     * @param status <p>
     *            The status of the operation. Values include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>SUBMITTED</b>: This is the initial state immediately after
     *            you submit a request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>PENDING</b>: AWS Cloud Map is performing the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>SUCCESS</b>: The operation succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>FAIL</b>: The operation failed. For the failure reason, see
     *            <code>ErrorMessage</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see OperationStatus
     */
    public void setStatus(OperationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the operation. Values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SUBMITTED</b>: This is the initial state immediately after you submit
     * a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b>: AWS Cloud Map is performing the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAIL</b>: The operation failed. For the failure reason, see
     * <code>ErrorMessage</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUBMITTED, PENDING, SUCCESS, FAIL
     *
     * @param status <p>
     *            The status of the operation. Values include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>SUBMITTED</b>: This is the initial state immediately after
     *            you submit a request.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>PENDING</b>: AWS Cloud Map is performing the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>SUCCESS</b>: The operation succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>FAIL</b>: The operation failed. For the failure reason, see
     *            <code>ErrorMessage</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationStatus
     */
    public Operation withStatus(OperationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If the value of <code>Status</code> is <code>FAIL</code>, the reason that
     * the operation failed.
     * </p>
     *
     * @return <p>
     *         If the value of <code>Status</code> is <code>FAIL</code>, the
     *         reason that the operation failed.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * If the value of <code>Status</code> is <code>FAIL</code>, the reason that
     * the operation failed.
     * </p>
     *
     * @param errorMessage <p>
     *            If the value of <code>Status</code> is <code>FAIL</code>, the
     *            reason that the operation failed.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * If the value of <code>Status</code> is <code>FAIL</code>, the reason that
     * the operation failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage <p>
     *            If the value of <code>Status</code> is <code>FAIL</code>, the
     *            reason that the operation failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Operation withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * <p>
     * The code associated with <code>ErrorMessage</code>. Values for
     * <code>ErrorCode</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANNOT_CREATE_HOSTED_ZONE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED_TOKEN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOSTED_ZONE_NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_FAILURE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CHANGE_BATCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THROTTLED_REQUEST</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The code associated with <code>ErrorMessage</code>. Values for
     *         <code>ErrorCode</code> include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACCESS_DENIED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANNOT_CREATE_HOSTED_ZONE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EXPIRED_TOKEN</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HOSTED_ZONE_NOT_FOUND</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INTERNAL_FAILURE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INVALID_CHANGE_BATCH</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>THROTTLED_REQUEST</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The code associated with <code>ErrorMessage</code>. Values for
     * <code>ErrorCode</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANNOT_CREATE_HOSTED_ZONE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED_TOKEN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOSTED_ZONE_NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_FAILURE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CHANGE_BATCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THROTTLED_REQUEST</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param errorCode <p>
     *            The code associated with <code>ErrorMessage</code>. Values for
     *            <code>ErrorCode</code> include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACCESS_DENIED</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANNOT_CREATE_HOSTED_ZONE</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EXPIRED_TOKEN</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HOSTED_ZONE_NOT_FOUND</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INTERNAL_FAILURE</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INVALID_CHANGE_BATCH</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>THROTTLED_REQUEST</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The code associated with <code>ErrorMessage</code>. Values for
     * <code>ErrorCode</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANNOT_CREATE_HOSTED_ZONE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED_TOKEN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOSTED_ZONE_NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_FAILURE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CHANGE_BATCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THROTTLED_REQUEST</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorCode <p>
     *            The code associated with <code>ErrorMessage</code>. Values for
     *            <code>ErrorCode</code> include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACCESS_DENIED</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CANNOT_CREATE_HOSTED_ZONE</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EXPIRED_TOKEN</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>HOSTED_ZONE_NOT_FOUND</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INTERNAL_FAILURE</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INVALID_CHANGE_BATCH</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>THROTTLED_REQUEST</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Operation withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * The date and time that the request was submitted, in Unix date/time
     * format and Coordinated Universal Time (UTC). The value of
     * <code>CreateDate</code> is accurate to milliseconds. For example, the
     * value <code>1516925490.087</code> represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The date and time that the request was submitted, in Unix
     *         date/time format and Coordinated Universal Time (UTC). The value
     *         of <code>CreateDate</code> is accurate to milliseconds. For
     *         example, the value <code>1516925490.087</code> represents Friday,
     *         January 26, 2018 12:11:30.087 AM.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date and time that the request was submitted, in Unix date/time
     * format and Coordinated Universal Time (UTC). The value of
     * <code>CreateDate</code> is accurate to milliseconds. For example, the
     * value <code>1516925490.087</code> represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     *
     * @param createDate <p>
     *            The date and time that the request was submitted, in Unix
     *            date/time format and Coordinated Universal Time (UTC). The
     *            value of <code>CreateDate</code> is accurate to milliseconds.
     *            For example, the value <code>1516925490.087</code> represents
     *            Friday, January 26, 2018 12:11:30.087 AM.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time that the request was submitted, in Unix date/time
     * format and Coordinated Universal Time (UTC). The value of
     * <code>CreateDate</code> is accurate to milliseconds. For example, the
     * value <code>1516925490.087</code> represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The date and time that the request was submitted, in Unix
     *            date/time format and Coordinated Universal Time (UTC). The
     *            value of <code>CreateDate</code> is accurate to milliseconds.
     *            For example, the value <code>1516925490.087</code> represents
     *            Friday, January 26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Operation withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * <p>
     * The date and time that the value of <code>Status</code> changed to the
     * current value, in Unix date/time format and Coordinated Universal Time
     * (UTC). The value of <code>UpdateDate</code> is accurate to milliseconds.
     * For example, the value <code>1516925490.087</code> represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The date and time that the value of <code>Status</code> changed
     *         to the current value, in Unix date/time format and Coordinated
     *         Universal Time (UTC). The value of <code>UpdateDate</code> is
     *         accurate to milliseconds. For example, the value
     *         <code>1516925490.087</code> represents Friday, January 26, 2018
     *         12:11:30.087 AM.
     *         </p>
     */
    public java.util.Date getUpdateDate() {
        return updateDate;
    }

    /**
     * <p>
     * The date and time that the value of <code>Status</code> changed to the
     * current value, in Unix date/time format and Coordinated Universal Time
     * (UTC). The value of <code>UpdateDate</code> is accurate to milliseconds.
     * For example, the value <code>1516925490.087</code> represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @param updateDate <p>
     *            The date and time that the value of <code>Status</code>
     *            changed to the current value, in Unix date/time format and
     *            Coordinated Universal Time (UTC). The value of
     *            <code>UpdateDate</code> is accurate to milliseconds. For
     *            example, the value <code>1516925490.087</code> represents
     *            Friday, January 26, 2018 12:11:30.087 AM.
     *            </p>
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * <p>
     * The date and time that the value of <code>Status</code> changed to the
     * current value, in Unix date/time format and Coordinated Universal Time
     * (UTC). The value of <code>UpdateDate</code> is accurate to milliseconds.
     * For example, the value <code>1516925490.087</code> represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateDate <p>
     *            The date and time that the value of <code>Status</code>
     *            changed to the current value, in Unix date/time format and
     *            Coordinated Universal Time (UTC). The value of
     *            <code>UpdateDate</code> is accurate to milliseconds. For
     *            example, the value <code>1516925490.087</code> represents
     *            Friday, January 26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Operation withUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    /**
     * <p>
     * The name of the target entity that is associated with the operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE</b>: The namespace ID is returned in the
     * <code>ResourceId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE</b>: The service ID is returned in the <code>ResourceId</code>
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INSTANCE</b>: The instance ID is returned in the
     * <code>ResourceId</code> property.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the target entity that is associated with the
     *         operation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>NAMESPACE</b>: The namespace ID is returned in the
     *         <code>ResourceId</code> property.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SERVICE</b>: The service ID is returned in the
     *         <code>ResourceId</code> property.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>INSTANCE</b>: The instance ID is returned in the
     *         <code>ResourceId</code> property.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The name of the target entity that is associated with the operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE</b>: The namespace ID is returned in the
     * <code>ResourceId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE</b>: The service ID is returned in the <code>ResourceId</code>
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INSTANCE</b>: The instance ID is returned in the
     * <code>ResourceId</code> property.
     * </p>
     * </li>
     * </ul>
     *
     * @param targets <p>
     *            The name of the target entity that is associated with the
     *            operation:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>NAMESPACE</b>: The namespace ID is returned in the
     *            <code>ResourceId</code> property.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>SERVICE</b>: The service ID is returned in the
     *            <code>ResourceId</code> property.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>INSTANCE</b>: The instance ID is returned in the
     *            <code>ResourceId</code> property.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTargets(java.util.Map<String, String> targets) {
        this.targets = targets;
    }

    /**
     * <p>
     * The name of the target entity that is associated with the operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE</b>: The namespace ID is returned in the
     * <code>ResourceId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE</b>: The service ID is returned in the <code>ResourceId</code>
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INSTANCE</b>: The instance ID is returned in the
     * <code>ResourceId</code> property.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The name of the target entity that is associated with the
     *            operation:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>NAMESPACE</b>: The namespace ID is returned in the
     *            <code>ResourceId</code> property.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>SERVICE</b>: The service ID is returned in the
     *            <code>ResourceId</code> property.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>INSTANCE</b>: The instance ID is returned in the
     *            <code>ResourceId</code> property.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Operation withTargets(java.util.Map<String, String> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * <p>
     * The name of the target entity that is associated with the operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE</b>: The namespace ID is returned in the
     * <code>ResourceId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE</b>: The service ID is returned in the <code>ResourceId</code>
     * property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INSTANCE</b>: The instance ID is returned in the
     * <code>ResourceId</code> property.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The method adds a new key-value pair into Targets parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Targets.
     * @param value The corresponding value of the entry to be added into
     *            Targets.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Operation addTargetsEntry(String key, String value) {
        if (null == this.targets) {
            this.targets = new java.util.HashMap<String, String>();
        }
        if (this.targets.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.targets.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Targets.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Operation clearTargetsEntries() {
        this.targets = null;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage() + ",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate() + ",");
        if (getUpdateDate() != null)
            sb.append("UpdateDate: " + getUpdateDate() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Operation == false)
            return false;
        Operation other = (Operation) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null
                && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null)
            return false;
        if (other.getUpdateDate() != null
                && other.getUpdateDate().equals(this.getUpdateDate()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        return true;
    }
}
