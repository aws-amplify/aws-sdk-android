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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the operations that are allowed on a maintenance track.
 * </p>
 */
public class SupportedOperation implements Serializable {
    /**
     * <p>
     * A list of the supported operations.
     * </p>
     */
    private String operationName;

    /**
     * <p>
     * A list of the supported operations.
     * </p>
     *
     * @return <p>
     *         A list of the supported operations.
     *         </p>
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * <p>
     * A list of the supported operations.
     * </p>
     *
     * @param operationName <p>
     *            A list of the supported operations.
     *            </p>
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * <p>
     * A list of the supported operations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationName <p>
     *            A list of the supported operations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SupportedOperation withOperationName(String operationName) {
        this.operationName = operationName;
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
        if (getOperationName() != null)
            sb.append("OperationName: " + getOperationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOperationName() == null) ? 0 : getOperationName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SupportedOperation == false)
            return false;
        SupportedOperation other = (SupportedOperation) obj;

        if (other.getOperationName() == null ^ this.getOperationName() == null)
            return false;
        if (other.getOperationName() != null
                && other.getOperationName().equals(this.getOperationName()) == false)
            return false;
        return true;
    }
}
