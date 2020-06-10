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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a Reserved Instance whose queued purchase was not deleted.
 * </p>
 */
public class FailedQueuedPurchaseDeletion implements Serializable {
    /**
     * <p>
     * The error.
     * </p>
     */
    private DeleteQueuedReservedInstancesError error;

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     */
    private String reservedInstancesId;

    /**
     * <p>
     * The error.
     * </p>
     *
     * @return <p>
     *         The error.
     *         </p>
     */
    public DeleteQueuedReservedInstancesError getError() {
        return error;
    }

    /**
     * <p>
     * The error.
     * </p>
     *
     * @param error <p>
     *            The error.
     *            </p>
     */
    public void setError(DeleteQueuedReservedInstancesError error) {
        this.error = error;
    }

    /**
     * <p>
     * The error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param error <p>
     *            The error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailedQueuedPurchaseDeletion withError(DeleteQueuedReservedInstancesError error) {
        this.error = error;
        return this;
    }

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     *
     * @return <p>
     *         The ID of the Reserved Instance.
     *         </p>
     */
    public String getReservedInstancesId() {
        return reservedInstancesId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     *
     * @param reservedInstancesId <p>
     *            The ID of the Reserved Instance.
     *            </p>
     */
    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesId <p>
     *            The ID of the Reserved Instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailedQueuedPurchaseDeletion withReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
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
        if (getError() != null)
            sb.append("Error: " + getError() + ",");
        if (getReservedInstancesId() != null)
            sb.append("ReservedInstancesId: " + getReservedInstancesId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode
                + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedQueuedPurchaseDeletion == false)
            return false;
        FailedQueuedPurchaseDeletion other = (FailedQueuedPurchaseDeletion) obj;

        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null)
            return false;
        if (other.getReservedInstancesId() != null
                && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false)
            return false;
        return true;
    }
}
