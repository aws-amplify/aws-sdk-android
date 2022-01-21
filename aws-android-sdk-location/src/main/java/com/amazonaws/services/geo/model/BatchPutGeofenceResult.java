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

public class BatchPutGeofenceResult implements Serializable {
    /**
     * <p>
     * Contains additional error details for each geofence that failed to be
     * stored in a geofence collection.
     * </p>
     */
    private java.util.List<BatchPutGeofenceError> errors;

    /**
     * <p>
     * Contains each geofence that was successfully stored in a geofence
     * collection.
     * </p>
     */
    private java.util.List<BatchPutGeofenceSuccess> successes;

    /**
     * <p>
     * Contains additional error details for each geofence that failed to be
     * stored in a geofence collection.
     * </p>
     *
     * @return <p>
     *         Contains additional error details for each geofence that failed
     *         to be stored in a geofence collection.
     *         </p>
     */
    public java.util.List<BatchPutGeofenceError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Contains additional error details for each geofence that failed to be
     * stored in a geofence collection.
     * </p>
     *
     * @param errors <p>
     *            Contains additional error details for each geofence that
     *            failed to be stored in a geofence collection.
     *            </p>
     */
    public void setErrors(java.util.Collection<BatchPutGeofenceError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchPutGeofenceError>(errors);
    }

    /**
     * <p>
     * Contains additional error details for each geofence that failed to be
     * stored in a geofence collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Contains additional error details for each geofence that
     *            failed to be stored in a geofence collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutGeofenceResult withErrors(BatchPutGeofenceError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<BatchPutGeofenceError>(errors.length);
        }
        for (BatchPutGeofenceError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains additional error details for each geofence that failed to be
     * stored in a geofence collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Contains additional error details for each geofence that
     *            failed to be stored in a geofence collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutGeofenceResult withErrors(java.util.Collection<BatchPutGeofenceError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * Contains each geofence that was successfully stored in a geofence
     * collection.
     * </p>
     *
     * @return <p>
     *         Contains each geofence that was successfully stored in a geofence
     *         collection.
     *         </p>
     */
    public java.util.List<BatchPutGeofenceSuccess> getSuccesses() {
        return successes;
    }

    /**
     * <p>
     * Contains each geofence that was successfully stored in a geofence
     * collection.
     * </p>
     *
     * @param successes <p>
     *            Contains each geofence that was successfully stored in a
     *            geofence collection.
     *            </p>
     */
    public void setSuccesses(java.util.Collection<BatchPutGeofenceSuccess> successes) {
        if (successes == null) {
            this.successes = null;
            return;
        }

        this.successes = new java.util.ArrayList<BatchPutGeofenceSuccess>(successes);
    }

    /**
     * <p>
     * Contains each geofence that was successfully stored in a geofence
     * collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successes <p>
     *            Contains each geofence that was successfully stored in a
     *            geofence collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutGeofenceResult withSuccesses(BatchPutGeofenceSuccess... successes) {
        if (getSuccesses() == null) {
            this.successes = new java.util.ArrayList<BatchPutGeofenceSuccess>(successes.length);
        }
        for (BatchPutGeofenceSuccess value : successes) {
            this.successes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains each geofence that was successfully stored in a geofence
     * collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successes <p>
     *            Contains each geofence that was successfully stored in a
     *            geofence collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutGeofenceResult withSuccesses(
            java.util.Collection<BatchPutGeofenceSuccess> successes) {
        setSuccesses(successes);
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
            sb.append("Errors: " + getErrors() + ",");
        if (getSuccesses() != null)
            sb.append("Successes: " + getSuccesses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getSuccesses() == null) ? 0 : getSuccesses().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutGeofenceResult == false)
            return false;
        BatchPutGeofenceResult other = (BatchPutGeofenceResult) obj;

        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getSuccesses() == null ^ this.getSuccesses() == null)
            return false;
        if (other.getSuccesses() != null
                && other.getSuccesses().equals(this.getSuccesses()) == false)
            return false;
        return true;
    }
}
