/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

public class BatchUpdateDevicePositionResult implements Serializable {
    /**
     * <p>
     * Contains error details for each device that failed to update its
     * position.
     * </p>
     */
    private java.util.List<BatchUpdateDevicePositionError> errors;

    /**
     * <p>
     * Contains error details for each device that failed to update its
     * position.
     * </p>
     *
     * @return <p>
     *         Contains error details for each device that failed to update its
     *         position.
     *         </p>
     */
    public java.util.List<BatchUpdateDevicePositionError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Contains error details for each device that failed to update its
     * position.
     * </p>
     *
     * @param errors <p>
     *            Contains error details for each device that failed to update
     *            its position.
     *            </p>
     */
    public void setErrors(java.util.Collection<BatchUpdateDevicePositionError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchUpdateDevicePositionError>(errors);
    }

    /**
     * <p>
     * Contains error details for each device that failed to update its
     * position.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Contains error details for each device that failed to update
     *            its position.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateDevicePositionResult withErrors(BatchUpdateDevicePositionError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<BatchUpdateDevicePositionError>(errors.length);
        }
        for (BatchUpdateDevicePositionError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains error details for each device that failed to update its
     * position.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Contains error details for each device that failed to update
     *            its position.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchUpdateDevicePositionResult withErrors(
            java.util.Collection<BatchUpdateDevicePositionError> errors) {
        setErrors(errors);
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
        if (getErrors() != null)
            sb.append("Errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateDevicePositionResult == false)
            return false;
        BatchUpdateDevicePositionResult other = (BatchUpdateDevicePositionResult) obj;

        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}
