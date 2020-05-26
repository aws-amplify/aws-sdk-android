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

public class DeleteQueuedReservedInstancesResult implements Serializable {
    /**
     * <p>
     * Information about the queued purchases that were successfully deleted.
     * </p>
     */
    private java.util.List<SuccessfulQueuedPurchaseDeletion> successfulQueuedPurchaseDeletions;

    /**
     * <p>
     * Information about the queued purchases that could not be deleted.
     * </p>
     */
    private java.util.List<FailedQueuedPurchaseDeletion> failedQueuedPurchaseDeletions;

    /**
     * <p>
     * Information about the queued purchases that were successfully deleted.
     * </p>
     *
     * @return <p>
     *         Information about the queued purchases that were successfully
     *         deleted.
     *         </p>
     */
    public java.util.List<SuccessfulQueuedPurchaseDeletion> getSuccessfulQueuedPurchaseDeletions() {
        return successfulQueuedPurchaseDeletions;
    }

    /**
     * <p>
     * Information about the queued purchases that were successfully deleted.
     * </p>
     *
     * @param successfulQueuedPurchaseDeletions <p>
     *            Information about the queued purchases that were successfully
     *            deleted.
     *            </p>
     */
    public void setSuccessfulQueuedPurchaseDeletions(
            java.util.Collection<SuccessfulQueuedPurchaseDeletion> successfulQueuedPurchaseDeletions) {
        if (successfulQueuedPurchaseDeletions == null) {
            this.successfulQueuedPurchaseDeletions = null;
            return;
        }

        this.successfulQueuedPurchaseDeletions = new java.util.ArrayList<SuccessfulQueuedPurchaseDeletion>(
                successfulQueuedPurchaseDeletions);
    }

    /**
     * <p>
     * Information about the queued purchases that were successfully deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulQueuedPurchaseDeletions <p>
     *            Information about the queued purchases that were successfully
     *            deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteQueuedReservedInstancesResult withSuccessfulQueuedPurchaseDeletions(
            SuccessfulQueuedPurchaseDeletion... successfulQueuedPurchaseDeletions) {
        if (getSuccessfulQueuedPurchaseDeletions() == null) {
            this.successfulQueuedPurchaseDeletions = new java.util.ArrayList<SuccessfulQueuedPurchaseDeletion>(
                    successfulQueuedPurchaseDeletions.length);
        }
        for (SuccessfulQueuedPurchaseDeletion value : successfulQueuedPurchaseDeletions) {
            this.successfulQueuedPurchaseDeletions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the queued purchases that were successfully deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulQueuedPurchaseDeletions <p>
     *            Information about the queued purchases that were successfully
     *            deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteQueuedReservedInstancesResult withSuccessfulQueuedPurchaseDeletions(
            java.util.Collection<SuccessfulQueuedPurchaseDeletion> successfulQueuedPurchaseDeletions) {
        setSuccessfulQueuedPurchaseDeletions(successfulQueuedPurchaseDeletions);
        return this;
    }

    /**
     * <p>
     * Information about the queued purchases that could not be deleted.
     * </p>
     *
     * @return <p>
     *         Information about the queued purchases that could not be deleted.
     *         </p>
     */
    public java.util.List<FailedQueuedPurchaseDeletion> getFailedQueuedPurchaseDeletions() {
        return failedQueuedPurchaseDeletions;
    }

    /**
     * <p>
     * Information about the queued purchases that could not be deleted.
     * </p>
     *
     * @param failedQueuedPurchaseDeletions <p>
     *            Information about the queued purchases that could not be
     *            deleted.
     *            </p>
     */
    public void setFailedQueuedPurchaseDeletions(
            java.util.Collection<FailedQueuedPurchaseDeletion> failedQueuedPurchaseDeletions) {
        if (failedQueuedPurchaseDeletions == null) {
            this.failedQueuedPurchaseDeletions = null;
            return;
        }

        this.failedQueuedPurchaseDeletions = new java.util.ArrayList<FailedQueuedPurchaseDeletion>(
                failedQueuedPurchaseDeletions);
    }

    /**
     * <p>
     * Information about the queued purchases that could not be deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedQueuedPurchaseDeletions <p>
     *            Information about the queued purchases that could not be
     *            deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteQueuedReservedInstancesResult withFailedQueuedPurchaseDeletions(
            FailedQueuedPurchaseDeletion... failedQueuedPurchaseDeletions) {
        if (getFailedQueuedPurchaseDeletions() == null) {
            this.failedQueuedPurchaseDeletions = new java.util.ArrayList<FailedQueuedPurchaseDeletion>(
                    failedQueuedPurchaseDeletions.length);
        }
        for (FailedQueuedPurchaseDeletion value : failedQueuedPurchaseDeletions) {
            this.failedQueuedPurchaseDeletions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the queued purchases that could not be deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedQueuedPurchaseDeletions <p>
     *            Information about the queued purchases that could not be
     *            deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteQueuedReservedInstancesResult withFailedQueuedPurchaseDeletions(
            java.util.Collection<FailedQueuedPurchaseDeletion> failedQueuedPurchaseDeletions) {
        setFailedQueuedPurchaseDeletions(failedQueuedPurchaseDeletions);
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
        if (getSuccessfulQueuedPurchaseDeletions() != null)
            sb.append("SuccessfulQueuedPurchaseDeletions: "
                    + getSuccessfulQueuedPurchaseDeletions() + ",");
        if (getFailedQueuedPurchaseDeletions() != null)
            sb.append("FailedQueuedPurchaseDeletions: " + getFailedQueuedPurchaseDeletions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSuccessfulQueuedPurchaseDeletions() == null) ? 0
                        : getSuccessfulQueuedPurchaseDeletions().hashCode());
        hashCode = prime
                * hashCode
                + ((getFailedQueuedPurchaseDeletions() == null) ? 0
                        : getFailedQueuedPurchaseDeletions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteQueuedReservedInstancesResult == false)
            return false;
        DeleteQueuedReservedInstancesResult other = (DeleteQueuedReservedInstancesResult) obj;

        if (other.getSuccessfulQueuedPurchaseDeletions() == null
                ^ this.getSuccessfulQueuedPurchaseDeletions() == null)
            return false;
        if (other.getSuccessfulQueuedPurchaseDeletions() != null
                && other.getSuccessfulQueuedPurchaseDeletions().equals(
                        this.getSuccessfulQueuedPurchaseDeletions()) == false)
            return false;
        if (other.getFailedQueuedPurchaseDeletions() == null
                ^ this.getFailedQueuedPurchaseDeletions() == null)
            return false;
        if (other.getFailedQueuedPurchaseDeletions() != null
                && other.getFailedQueuedPurchaseDeletions().equals(
                        this.getFailedQueuedPurchaseDeletions()) == false)
            return false;
        return true;
    }
}
