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

public class BatchDeleteGeofenceResult implements Serializable {
    /**
     * <p>
     * Contains error details for each geofence that failed to delete.
     * </p>
     */
    private java.util.List<BatchDeleteGeofenceError> errors;

    /**
     * <p>
     * Contains error details for each geofence that failed to delete.
     * </p>
     *
     * @return <p>
     *         Contains error details for each geofence that failed to delete.
     *         </p>
     */
    public java.util.List<BatchDeleteGeofenceError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Contains error details for each geofence that failed to delete.
     * </p>
     *
     * @param errors <p>
     *            Contains error details for each geofence that failed to
     *            delete.
     *            </p>
     */
    public void setErrors(java.util.Collection<BatchDeleteGeofenceError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchDeleteGeofenceError>(errors);
    }

    /**
     * <p>
     * Contains error details for each geofence that failed to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Contains error details for each geofence that failed to
     *            delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteGeofenceResult withErrors(BatchDeleteGeofenceError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<BatchDeleteGeofenceError>(errors.length);
        }
        for (BatchDeleteGeofenceError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains error details for each geofence that failed to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Contains error details for each geofence that failed to
     *            delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDeleteGeofenceResult withErrors(
            java.util.Collection<BatchDeleteGeofenceError> errors) {
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

        if (obj instanceof BatchDeleteGeofenceResult == false)
            return false;
        BatchDeleteGeofenceResult other = (BatchDeleteGeofenceResult) obj;

        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}
