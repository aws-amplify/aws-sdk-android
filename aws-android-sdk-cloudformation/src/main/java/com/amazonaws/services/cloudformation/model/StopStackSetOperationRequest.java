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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Stops an in-progress operation on a stack set and its associated stack
 * instances.
 * </p>
 */
public class StopStackSetOperationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name or unique ID of the stack set that you want to stop the
     * operation for.
     * </p>
     */
    private String stackSetName;

    /**
     * <p>
     * The ID of the stack operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     */
    private String operationId;

    /**
     * <p>
     * The name or unique ID of the stack set that you want to stop the
     * operation for.
     * </p>
     *
     * @return <p>
     *         The name or unique ID of the stack set that you want to stop the
     *         operation for.
     *         </p>
     */
    public String getStackSetName() {
        return stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you want to stop the
     * operation for.
     * </p>
     *
     * @param stackSetName <p>
     *            The name or unique ID of the stack set that you want to stop
     *            the operation for.
     *            </p>
     */
    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you want to stop the
     * operation for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetName <p>
     *            The name or unique ID of the stack set that you want to stop
     *            the operation for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopStackSetOperationRequest withStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
        return this;
    }

    /**
     * <p>
     * The ID of the stack operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The ID of the stack operation.
     *         </p>
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * <p>
     * The ID of the stack operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param operationId <p>
     *            The ID of the stack operation.
     *            </p>
     */
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The ID of the stack operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param operationId <p>
     *            The ID of the stack operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopStackSetOperationRequest withOperationId(String operationId) {
        this.operationId = operationId;
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
        if (getStackSetName() != null)
            sb.append("StackSetName: " + getStackSetName() + ",");
        if (getOperationId() != null)
            sb.append("OperationId: " + getOperationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode
                + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopStackSetOperationRequest == false)
            return false;
        StopStackSetOperationRequest other = (StopStackSetOperationRequest) obj;

        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null
                && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null
                && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        return true;
    }
}
