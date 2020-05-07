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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about a specific operation. Operations include events
 * such as when you create an instance, allocate a static IP, attach a static
 * IP, and so on.
 * </p>
 */
public class GetOperationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A GUID used to identify the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String operationId;

    /**
     * <p>
     * A GUID used to identify the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A GUID used to identify the operation.
     *         </p>
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * <p>
     * A GUID used to identify the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param operationId <p>
     *            A GUID used to identify the operation.
     *            </p>
     */
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * A GUID used to identify the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param operationId <p>
     *            A GUID used to identify the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetOperationRequest withOperationId(String operationId) {
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
        if (getOperationId() != null)
            sb.append("operationId: " + getOperationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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

        if (obj instanceof GetOperationRequest == false)
            return false;
        GetOperationRequest other = (GetOperationRequest) obj;

        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null
                && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        return true;
    }
}
