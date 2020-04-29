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
 * A complex type that contains information about an operation that matches the
 * criteria that you specified in a <a href=
 * "https://docs.aws.amazon.com/cloud-map/latest/api/API_ListOperations.html"
 * >ListOperations</a> request.
 * </p>
 */
public class OperationSummary implements Serializable {
    /**
     * <p>
     * The ID for an operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String id;

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
     * The ID for an operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The ID for an operation.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID for an operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param id <p>
     *            The ID for an operation.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for an operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param id <p>
     *            The ID for an operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OperationSummary withId(String id) {
        this.id = id;
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
    public OperationSummary withStatus(String status) {
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
    public OperationSummary withStatus(OperationStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OperationSummary == false)
            return false;
        OperationSummary other = (OperationSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
