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

package com.amazonaws.services.awscloudmap.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that lets you select the operations that you want to list.
 * </p>
 */
public class OperationFilter implements Serializable {
    /**
     * <p>
     * Specify the operations that you want to get:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE_ID</b>: Gets operations related to specified namespaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE_ID</b>: Gets operations related to specified services.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>STATUS</b>: Gets operations based on the status of the operations:
     * <code>SUBMITTED</code>, <code>PENDING</code>, <code>SUCCEED</code>, or
     * <code>FAIL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TYPE</b>: Gets specified types of operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_DATE</b>: Gets operations that changed status during a
     * specified date/time range.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAMESPACE_ID, SERVICE_ID, STATUS, TYPE,
     * UPDATE_DATE
     */
    private String name;

    /**
     * <p>
     * Specify values that are applicable to the value that you specify for
     * <code>Name</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE_ID</b>: Specify one namespace ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE_ID</b>: Specify one service ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>STATUS</b>: Specify one or more statuses: <code>SUBMITTED</code>,
     * <code>PENDING</code>, <code>SUCCEED</code>, or <code>FAIL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TYPE</b>: Specify one or more of the following types:
     * <code>CREATE_NAMESPACE</code>, <code>DELETE_NAMESPACE</code>,
     * <code>UPDATE_SERVICE</code>, <code>REGISTER_INSTANCE</code>, or
     * <code>DEREGISTER_INSTANCE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_DATE</b>: Specify a start date and an end date in Unix
     * date/time format and Coordinated Universal Time (UTC). The start date
     * must be the first value.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The operator that you want to use to determine whether an operation
     * matches the specified value. Valid values for condition include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code> for the condition, you
     * can specify only one value. <code>EQ</code> is supported for
     * <code>NAMESPACE_ID</code>, <code>SERVICE_ID</code>, <code>STATUS</code>,
     * and <code>TYPE</code>. <code>EQ</code> is the default condition and can
     * be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code> for the condition, you
     * can specify a list of one or more values. <code>IN</code> is supported
     * for <code>STATUS</code> and <code>TYPE</code>. An operation must match
     * one of the specified values to be returned in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Specify a start date and an end date in Unix
     * date/time format and Coordinated Universal Time (UTC). The start date
     * must be the first value. <code>BETWEEN</code> is supported for
     * <code>UPDATE_DATE</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, IN, BETWEEN
     */
    private String condition;

    /**
     * <p>
     * Specify the operations that you want to get:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE_ID</b>: Gets operations related to specified namespaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE_ID</b>: Gets operations related to specified services.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>STATUS</b>: Gets operations based on the status of the operations:
     * <code>SUBMITTED</code>, <code>PENDING</code>, <code>SUCCEED</code>, or
     * <code>FAIL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TYPE</b>: Gets specified types of operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_DATE</b>: Gets operations that changed status during a
     * specified date/time range.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAMESPACE_ID, SERVICE_ID, STATUS, TYPE,
     * UPDATE_DATE
     *
     * @return <p>
     *         Specify the operations that you want to get:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>NAMESPACE_ID</b>: Gets operations related to specified
     *         namespaces.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SERVICE_ID</b>: Gets operations related to specified services.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>STATUS</b>: Gets operations based on the status of the
     *         operations: <code>SUBMITTED</code>, <code>PENDING</code>,
     *         <code>SUCCEED</code>, or <code>FAIL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>TYPE</b>: Gets specified types of operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UPDATE_DATE</b>: Gets operations that changed status during a
     *         specified date/time range.
     *         </p>
     *         </li>
     *         </ul>
     * @see OperationFilterName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Specify the operations that you want to get:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE_ID</b>: Gets operations related to specified namespaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE_ID</b>: Gets operations related to specified services.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>STATUS</b>: Gets operations based on the status of the operations:
     * <code>SUBMITTED</code>, <code>PENDING</code>, <code>SUCCEED</code>, or
     * <code>FAIL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TYPE</b>: Gets specified types of operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_DATE</b>: Gets operations that changed status during a
     * specified date/time range.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAMESPACE_ID, SERVICE_ID, STATUS, TYPE,
     * UPDATE_DATE
     *
     * @param name <p>
     *            Specify the operations that you want to get:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>NAMESPACE_ID</b>: Gets operations related to specified
     *            namespaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>SERVICE_ID</b>: Gets operations related to specified
     *            services.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>STATUS</b>: Gets operations based on the status of the
     *            operations: <code>SUBMITTED</code>, <code>PENDING</code>,
     *            <code>SUCCEED</code>, or <code>FAIL</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>TYPE</b>: Gets specified types of operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>UPDATE_DATE</b>: Gets operations that changed status during
     *            a specified date/time range.
     *            </p>
     *            </li>
     *            </ul>
     * @see OperationFilterName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specify the operations that you want to get:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE_ID</b>: Gets operations related to specified namespaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE_ID</b>: Gets operations related to specified services.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>STATUS</b>: Gets operations based on the status of the operations:
     * <code>SUBMITTED</code>, <code>PENDING</code>, <code>SUCCEED</code>, or
     * <code>FAIL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TYPE</b>: Gets specified types of operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_DATE</b>: Gets operations that changed status during a
     * specified date/time range.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAMESPACE_ID, SERVICE_ID, STATUS, TYPE,
     * UPDATE_DATE
     *
     * @param name <p>
     *            Specify the operations that you want to get:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>NAMESPACE_ID</b>: Gets operations related to specified
     *            namespaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>SERVICE_ID</b>: Gets operations related to specified
     *            services.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>STATUS</b>: Gets operations based on the status of the
     *            operations: <code>SUBMITTED</code>, <code>PENDING</code>,
     *            <code>SUCCEED</code>, or <code>FAIL</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>TYPE</b>: Gets specified types of operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>UPDATE_DATE</b>: Gets operations that changed status during
     *            a specified date/time range.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationFilterName
     */
    public OperationFilter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Specify the operations that you want to get:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE_ID</b>: Gets operations related to specified namespaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE_ID</b>: Gets operations related to specified services.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>STATUS</b>: Gets operations based on the status of the operations:
     * <code>SUBMITTED</code>, <code>PENDING</code>, <code>SUCCEED</code>, or
     * <code>FAIL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TYPE</b>: Gets specified types of operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_DATE</b>: Gets operations that changed status during a
     * specified date/time range.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAMESPACE_ID, SERVICE_ID, STATUS, TYPE,
     * UPDATE_DATE
     *
     * @param name <p>
     *            Specify the operations that you want to get:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>NAMESPACE_ID</b>: Gets operations related to specified
     *            namespaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>SERVICE_ID</b>: Gets operations related to specified
     *            services.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>STATUS</b>: Gets operations based on the status of the
     *            operations: <code>SUBMITTED</code>, <code>PENDING</code>,
     *            <code>SUCCEED</code>, or <code>FAIL</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>TYPE</b>: Gets specified types of operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>UPDATE_DATE</b>: Gets operations that changed status during
     *            a specified date/time range.
     *            </p>
     *            </li>
     *            </ul>
     * @see OperationFilterName
     */
    public void setName(OperationFilterName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * Specify the operations that you want to get:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE_ID</b>: Gets operations related to specified namespaces.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE_ID</b>: Gets operations related to specified services.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>STATUS</b>: Gets operations based on the status of the operations:
     * <code>SUBMITTED</code>, <code>PENDING</code>, <code>SUCCEED</code>, or
     * <code>FAIL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TYPE</b>: Gets specified types of operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_DATE</b>: Gets operations that changed status during a
     * specified date/time range.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAMESPACE_ID, SERVICE_ID, STATUS, TYPE,
     * UPDATE_DATE
     *
     * @param name <p>
     *            Specify the operations that you want to get:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>NAMESPACE_ID</b>: Gets operations related to specified
     *            namespaces.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>SERVICE_ID</b>: Gets operations related to specified
     *            services.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>STATUS</b>: Gets operations based on the status of the
     *            operations: <code>SUBMITTED</code>, <code>PENDING</code>,
     *            <code>SUCCEED</code>, or <code>FAIL</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>TYPE</b>: Gets specified types of operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>UPDATE_DATE</b>: Gets operations that changed status during
     *            a specified date/time range.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationFilterName
     */
    public OperationFilter withName(OperationFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * Specify values that are applicable to the value that you specify for
     * <code>Name</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE_ID</b>: Specify one namespace ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE_ID</b>: Specify one service ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>STATUS</b>: Specify one or more statuses: <code>SUBMITTED</code>,
     * <code>PENDING</code>, <code>SUCCEED</code>, or <code>FAIL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TYPE</b>: Specify one or more of the following types:
     * <code>CREATE_NAMESPACE</code>, <code>DELETE_NAMESPACE</code>,
     * <code>UPDATE_SERVICE</code>, <code>REGISTER_INSTANCE</code>, or
     * <code>DEREGISTER_INSTANCE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_DATE</b>: Specify a start date and an end date in Unix
     * date/time format and Coordinated Universal Time (UTC). The start date
     * must be the first value.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specify values that are applicable to the value that you specify
     *         for <code>Name</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>NAMESPACE_ID</b>: Specify one namespace ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SERVICE_ID</b>: Specify one service ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>STATUS</b>: Specify one or more statuses:
     *         <code>SUBMITTED</code>, <code>PENDING</code>,
     *         <code>SUCCEED</code>, or <code>FAIL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>TYPE</b>: Specify one or more of the following types:
     *         <code>CREATE_NAMESPACE</code>, <code>DELETE_NAMESPACE</code>,
     *         <code>UPDATE_SERVICE</code>, <code>REGISTER_INSTANCE</code>, or
     *         <code>DEREGISTER_INSTANCE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UPDATE_DATE</b>: Specify a start date and an end date in Unix
     *         date/time format and Coordinated Universal Time (UTC). The start
     *         date must be the first value.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * Specify values that are applicable to the value that you specify for
     * <code>Name</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE_ID</b>: Specify one namespace ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE_ID</b>: Specify one service ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>STATUS</b>: Specify one or more statuses: <code>SUBMITTED</code>,
     * <code>PENDING</code>, <code>SUCCEED</code>, or <code>FAIL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TYPE</b>: Specify one or more of the following types:
     * <code>CREATE_NAMESPACE</code>, <code>DELETE_NAMESPACE</code>,
     * <code>UPDATE_SERVICE</code>, <code>REGISTER_INSTANCE</code>, or
     * <code>DEREGISTER_INSTANCE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_DATE</b>: Specify a start date and an end date in Unix
     * date/time format and Coordinated Universal Time (UTC). The start date
     * must be the first value.
     * </p>
     * </li>
     * </ul>
     *
     * @param values <p>
     *            Specify values that are applicable to the value that you
     *            specify for <code>Name</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>NAMESPACE_ID</b>: Specify one namespace ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>SERVICE_ID</b>: Specify one service ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>STATUS</b>: Specify one or more statuses:
     *            <code>SUBMITTED</code>, <code>PENDING</code>,
     *            <code>SUCCEED</code>, or <code>FAIL</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>TYPE</b>: Specify one or more of the following types:
     *            <code>CREATE_NAMESPACE</code>, <code>DELETE_NAMESPACE</code>,
     *            <code>UPDATE_SERVICE</code>, <code>REGISTER_INSTANCE</code>,
     *            or <code>DEREGISTER_INSTANCE</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>UPDATE_DATE</b>: Specify a start date and an end date in
     *            Unix date/time format and Coordinated Universal Time (UTC).
     *            The start date must be the first value.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * Specify values that are applicable to the value that you specify for
     * <code>Name</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE_ID</b>: Specify one namespace ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE_ID</b>: Specify one service ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>STATUS</b>: Specify one or more statuses: <code>SUBMITTED</code>,
     * <code>PENDING</code>, <code>SUCCEED</code>, or <code>FAIL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TYPE</b>: Specify one or more of the following types:
     * <code>CREATE_NAMESPACE</code>, <code>DELETE_NAMESPACE</code>,
     * <code>UPDATE_SERVICE</code>, <code>REGISTER_INSTANCE</code>, or
     * <code>DEREGISTER_INSTANCE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_DATE</b>: Specify a start date and an end date in Unix
     * date/time format and Coordinated Universal Time (UTC). The start date
     * must be the first value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            Specify values that are applicable to the value that you
     *            specify for <code>Name</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>NAMESPACE_ID</b>: Specify one namespace ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>SERVICE_ID</b>: Specify one service ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>STATUS</b>: Specify one or more statuses:
     *            <code>SUBMITTED</code>, <code>PENDING</code>,
     *            <code>SUCCEED</code>, or <code>FAIL</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>TYPE</b>: Specify one or more of the following types:
     *            <code>CREATE_NAMESPACE</code>, <code>DELETE_NAMESPACE</code>,
     *            <code>UPDATE_SERVICE</code>, <code>REGISTER_INSTANCE</code>,
     *            or <code>DEREGISTER_INSTANCE</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>UPDATE_DATE</b>: Specify a start date and an end date in
     *            Unix date/time format and Coordinated Universal Time (UTC).
     *            The start date must be the first value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OperationFilter withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specify values that are applicable to the value that you specify for
     * <code>Name</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE_ID</b>: Specify one namespace ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE_ID</b>: Specify one service ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>STATUS</b>: Specify one or more statuses: <code>SUBMITTED</code>,
     * <code>PENDING</code>, <code>SUCCEED</code>, or <code>FAIL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TYPE</b>: Specify one or more of the following types:
     * <code>CREATE_NAMESPACE</code>, <code>DELETE_NAMESPACE</code>,
     * <code>UPDATE_SERVICE</code>, <code>REGISTER_INSTANCE</code>, or
     * <code>DEREGISTER_INSTANCE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATE_DATE</b>: Specify a start date and an end date in Unix
     * date/time format and Coordinated Universal Time (UTC). The start date
     * must be the first value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            Specify values that are applicable to the value that you
     *            specify for <code>Name</code>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>NAMESPACE_ID</b>: Specify one namespace ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>SERVICE_ID</b>: Specify one service ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>STATUS</b>: Specify one or more statuses:
     *            <code>SUBMITTED</code>, <code>PENDING</code>,
     *            <code>SUCCEED</code>, or <code>FAIL</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>TYPE</b>: Specify one or more of the following types:
     *            <code>CREATE_NAMESPACE</code>, <code>DELETE_NAMESPACE</code>,
     *            <code>UPDATE_SERVICE</code>, <code>REGISTER_INSTANCE</code>,
     *            or <code>DEREGISTER_INSTANCE</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>UPDATE_DATE</b>: Specify a start date and an end date in
     *            Unix date/time format and Coordinated Universal Time (UTC).
     *            The start date must be the first value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OperationFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The operator that you want to use to determine whether an operation
     * matches the specified value. Valid values for condition include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code> for the condition, you
     * can specify only one value. <code>EQ</code> is supported for
     * <code>NAMESPACE_ID</code>, <code>SERVICE_ID</code>, <code>STATUS</code>,
     * and <code>TYPE</code>. <code>EQ</code> is the default condition and can
     * be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code> for the condition, you
     * can specify a list of one or more values. <code>IN</code> is supported
     * for <code>STATUS</code> and <code>TYPE</code>. An operation must match
     * one of the specified values to be returned in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Specify a start date and an end date in Unix
     * date/time format and Coordinated Universal Time (UTC). The start date
     * must be the first value. <code>BETWEEN</code> is supported for
     * <code>UPDATE_DATE</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, IN, BETWEEN
     *
     * @return <p>
     *         The operator that you want to use to determine whether an
     *         operation matches the specified value. Valid values for condition
     *         include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>EQ</code>: When you specify <code>EQ</code> for the
     *         condition, you can specify only one value. <code>EQ</code> is
     *         supported for <code>NAMESPACE_ID</code>, <code>SERVICE_ID</code>,
     *         <code>STATUS</code>, and <code>TYPE</code>. <code>EQ</code> is
     *         the default condition and can be omitted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN</code>: When you specify <code>IN</code> for the
     *         condition, you can specify a list of one or more values.
     *         <code>IN</code> is supported for <code>STATUS</code> and
     *         <code>TYPE</code>. An operation must match one of the specified
     *         values to be returned in the response.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BETWEEN</code>: Specify a start date and an end date in
     *         Unix date/time format and Coordinated Universal Time (UTC). The
     *         start date must be the first value. <code>BETWEEN</code> is
     *         supported for <code>UPDATE_DATE</code>.
     *         </p>
     *         </li>
     *         </ul>
     * @see FilterCondition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * <p>
     * The operator that you want to use to determine whether an operation
     * matches the specified value. Valid values for condition include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code> for the condition, you
     * can specify only one value. <code>EQ</code> is supported for
     * <code>NAMESPACE_ID</code>, <code>SERVICE_ID</code>, <code>STATUS</code>,
     * and <code>TYPE</code>. <code>EQ</code> is the default condition and can
     * be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code> for the condition, you
     * can specify a list of one or more values. <code>IN</code> is supported
     * for <code>STATUS</code> and <code>TYPE</code>. An operation must match
     * one of the specified values to be returned in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Specify a start date and an end date in Unix
     * date/time format and Coordinated Universal Time (UTC). The start date
     * must be the first value. <code>BETWEEN</code> is supported for
     * <code>UPDATE_DATE</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, IN, BETWEEN
     *
     * @param condition <p>
     *            The operator that you want to use to determine whether an
     *            operation matches the specified value. Valid values for
     *            condition include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>EQ</code>: When you specify <code>EQ</code> for the
     *            condition, you can specify only one value. <code>EQ</code> is
     *            supported for <code>NAMESPACE_ID</code>,
     *            <code>SERVICE_ID</code>, <code>STATUS</code>, and
     *            <code>TYPE</code>. <code>EQ</code> is the default condition
     *            and can be omitted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN</code>: When you specify <code>IN</code> for the
     *            condition, you can specify a list of one or more values.
     *            <code>IN</code> is supported for <code>STATUS</code> and
     *            <code>TYPE</code>. An operation must match one of the
     *            specified values to be returned in the response.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BETWEEN</code>: Specify a start date and an end date in
     *            Unix date/time format and Coordinated Universal Time (UTC).
     *            The start date must be the first value. <code>BETWEEN</code>
     *            is supported for <code>UPDATE_DATE</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see FilterCondition
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The operator that you want to use to determine whether an operation
     * matches the specified value. Valid values for condition include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code> for the condition, you
     * can specify only one value. <code>EQ</code> is supported for
     * <code>NAMESPACE_ID</code>, <code>SERVICE_ID</code>, <code>STATUS</code>,
     * and <code>TYPE</code>. <code>EQ</code> is the default condition and can
     * be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code> for the condition, you
     * can specify a list of one or more values. <code>IN</code> is supported
     * for <code>STATUS</code> and <code>TYPE</code>. An operation must match
     * one of the specified values to be returned in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Specify a start date and an end date in Unix
     * date/time format and Coordinated Universal Time (UTC). The start date
     * must be the first value. <code>BETWEEN</code> is supported for
     * <code>UPDATE_DATE</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, IN, BETWEEN
     *
     * @param condition <p>
     *            The operator that you want to use to determine whether an
     *            operation matches the specified value. Valid values for
     *            condition include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>EQ</code>: When you specify <code>EQ</code> for the
     *            condition, you can specify only one value. <code>EQ</code> is
     *            supported for <code>NAMESPACE_ID</code>,
     *            <code>SERVICE_ID</code>, <code>STATUS</code>, and
     *            <code>TYPE</code>. <code>EQ</code> is the default condition
     *            and can be omitted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN</code>: When you specify <code>IN</code> for the
     *            condition, you can specify a list of one or more values.
     *            <code>IN</code> is supported for <code>STATUS</code> and
     *            <code>TYPE</code>. An operation must match one of the
     *            specified values to be returned in the response.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BETWEEN</code>: Specify a start date and an end date in
     *            Unix date/time format and Coordinated Universal Time (UTC).
     *            The start date must be the first value. <code>BETWEEN</code>
     *            is supported for <code>UPDATE_DATE</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FilterCondition
     */
    public OperationFilter withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * <p>
     * The operator that you want to use to determine whether an operation
     * matches the specified value. Valid values for condition include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code> for the condition, you
     * can specify only one value. <code>EQ</code> is supported for
     * <code>NAMESPACE_ID</code>, <code>SERVICE_ID</code>, <code>STATUS</code>,
     * and <code>TYPE</code>. <code>EQ</code> is the default condition and can
     * be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code> for the condition, you
     * can specify a list of one or more values. <code>IN</code> is supported
     * for <code>STATUS</code> and <code>TYPE</code>. An operation must match
     * one of the specified values to be returned in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Specify a start date and an end date in Unix
     * date/time format and Coordinated Universal Time (UTC). The start date
     * must be the first value. <code>BETWEEN</code> is supported for
     * <code>UPDATE_DATE</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, IN, BETWEEN
     *
     * @param condition <p>
     *            The operator that you want to use to determine whether an
     *            operation matches the specified value. Valid values for
     *            condition include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>EQ</code>: When you specify <code>EQ</code> for the
     *            condition, you can specify only one value. <code>EQ</code> is
     *            supported for <code>NAMESPACE_ID</code>,
     *            <code>SERVICE_ID</code>, <code>STATUS</code>, and
     *            <code>TYPE</code>. <code>EQ</code> is the default condition
     *            and can be omitted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN</code>: When you specify <code>IN</code> for the
     *            condition, you can specify a list of one or more values.
     *            <code>IN</code> is supported for <code>STATUS</code> and
     *            <code>TYPE</code>. An operation must match one of the
     *            specified values to be returned in the response.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BETWEEN</code>: Specify a start date and an end date in
     *            Unix date/time format and Coordinated Universal Time (UTC).
     *            The start date must be the first value. <code>BETWEEN</code>
     *            is supported for <code>UPDATE_DATE</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see FilterCondition
     */
    public void setCondition(FilterCondition condition) {
        this.condition = condition.toString();
    }

    /**
     * <p>
     * The operator that you want to use to determine whether an operation
     * matches the specified value. Valid values for condition include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code> for the condition, you
     * can specify only one value. <code>EQ</code> is supported for
     * <code>NAMESPACE_ID</code>, <code>SERVICE_ID</code>, <code>STATUS</code>,
     * and <code>TYPE</code>. <code>EQ</code> is the default condition and can
     * be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code> for the condition, you
     * can specify a list of one or more values. <code>IN</code> is supported
     * for <code>STATUS</code> and <code>TYPE</code>. An operation must match
     * one of the specified values to be returned in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Specify a start date and an end date in Unix
     * date/time format and Coordinated Universal Time (UTC). The start date
     * must be the first value. <code>BETWEEN</code> is supported for
     * <code>UPDATE_DATE</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, IN, BETWEEN
     *
     * @param condition <p>
     *            The operator that you want to use to determine whether an
     *            operation matches the specified value. Valid values for
     *            condition include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>EQ</code>: When you specify <code>EQ</code> for the
     *            condition, you can specify only one value. <code>EQ</code> is
     *            supported for <code>NAMESPACE_ID</code>,
     *            <code>SERVICE_ID</code>, <code>STATUS</code>, and
     *            <code>TYPE</code>. <code>EQ</code> is the default condition
     *            and can be omitted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN</code>: When you specify <code>IN</code> for the
     *            condition, you can specify a list of one or more values.
     *            <code>IN</code> is supported for <code>STATUS</code> and
     *            <code>TYPE</code>. An operation must match one of the
     *            specified values to be returned in the response.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>BETWEEN</code>: Specify a start date and an end date in
     *            Unix date/time format and Coordinated Universal Time (UTC).
     *            The start date must be the first value. <code>BETWEEN</code>
     *            is supported for <code>UPDATE_DATE</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FilterCondition
     */
    public OperationFilter withCondition(FilterCondition condition) {
        this.condition = condition.toString();
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getValues() != null)
            sb.append("Values: " + getValues() + ",");
        if (getCondition() != null)
            sb.append("Condition: " + getCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OperationFilter == false)
            return false;
        OperationFilter other = (OperationFilter) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null
                && other.getCondition().equals(this.getCondition()) == false)
            return false;
        return true;
    }
}
