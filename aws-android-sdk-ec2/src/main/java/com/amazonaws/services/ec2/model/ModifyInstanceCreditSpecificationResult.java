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

public class ModifyInstanceCreditSpecificationResult implements Serializable {
    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was
     * successfully modified.
     * </p>
     */
    private java.util.List<SuccessfulInstanceCreditSpecificationItem> successfulInstanceCreditSpecifications;

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was not
     * modified.
     * </p>
     */
    private java.util.List<UnsuccessfulInstanceCreditSpecificationItem> unsuccessfulInstanceCreditSpecifications;

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was
     * successfully modified.
     * </p>
     *
     * @return <p>
     *         Information about the instances whose credit option for CPU usage
     *         was successfully modified.
     *         </p>
     */
    public java.util.List<SuccessfulInstanceCreditSpecificationItem> getSuccessfulInstanceCreditSpecifications() {
        return successfulInstanceCreditSpecifications;
    }

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was
     * successfully modified.
     * </p>
     *
     * @param successfulInstanceCreditSpecifications <p>
     *            Information about the instances whose credit option for CPU
     *            usage was successfully modified.
     *            </p>
     */
    public void setSuccessfulInstanceCreditSpecifications(
            java.util.Collection<SuccessfulInstanceCreditSpecificationItem> successfulInstanceCreditSpecifications) {
        if (successfulInstanceCreditSpecifications == null) {
            this.successfulInstanceCreditSpecifications = null;
            return;
        }

        this.successfulInstanceCreditSpecifications = new java.util.ArrayList<SuccessfulInstanceCreditSpecificationItem>(
                successfulInstanceCreditSpecifications);
    }

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was
     * successfully modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulInstanceCreditSpecifications <p>
     *            Information about the instances whose credit option for CPU
     *            usage was successfully modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceCreditSpecificationResult withSuccessfulInstanceCreditSpecifications(
            SuccessfulInstanceCreditSpecificationItem... successfulInstanceCreditSpecifications) {
        if (getSuccessfulInstanceCreditSpecifications() == null) {
            this.successfulInstanceCreditSpecifications = new java.util.ArrayList<SuccessfulInstanceCreditSpecificationItem>(
                    successfulInstanceCreditSpecifications.length);
        }
        for (SuccessfulInstanceCreditSpecificationItem value : successfulInstanceCreditSpecifications) {
            this.successfulInstanceCreditSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was
     * successfully modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulInstanceCreditSpecifications <p>
     *            Information about the instances whose credit option for CPU
     *            usage was successfully modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceCreditSpecificationResult withSuccessfulInstanceCreditSpecifications(
            java.util.Collection<SuccessfulInstanceCreditSpecificationItem> successfulInstanceCreditSpecifications) {
        setSuccessfulInstanceCreditSpecifications(successfulInstanceCreditSpecifications);
        return this;
    }

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was not
     * modified.
     * </p>
     *
     * @return <p>
     *         Information about the instances whose credit option for CPU usage
     *         was not modified.
     *         </p>
     */
    public java.util.List<UnsuccessfulInstanceCreditSpecificationItem> getUnsuccessfulInstanceCreditSpecifications() {
        return unsuccessfulInstanceCreditSpecifications;
    }

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was not
     * modified.
     * </p>
     *
     * @param unsuccessfulInstanceCreditSpecifications <p>
     *            Information about the instances whose credit option for CPU
     *            usage was not modified.
     *            </p>
     */
    public void setUnsuccessfulInstanceCreditSpecifications(
            java.util.Collection<UnsuccessfulInstanceCreditSpecificationItem> unsuccessfulInstanceCreditSpecifications) {
        if (unsuccessfulInstanceCreditSpecifications == null) {
            this.unsuccessfulInstanceCreditSpecifications = null;
            return;
        }

        this.unsuccessfulInstanceCreditSpecifications = new java.util.ArrayList<UnsuccessfulInstanceCreditSpecificationItem>(
                unsuccessfulInstanceCreditSpecifications);
    }

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was not
     * modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessfulInstanceCreditSpecifications <p>
     *            Information about the instances whose credit option for CPU
     *            usage was not modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceCreditSpecificationResult withUnsuccessfulInstanceCreditSpecifications(
            UnsuccessfulInstanceCreditSpecificationItem... unsuccessfulInstanceCreditSpecifications) {
        if (getUnsuccessfulInstanceCreditSpecifications() == null) {
            this.unsuccessfulInstanceCreditSpecifications = new java.util.ArrayList<UnsuccessfulInstanceCreditSpecificationItem>(
                    unsuccessfulInstanceCreditSpecifications.length);
        }
        for (UnsuccessfulInstanceCreditSpecificationItem value : unsuccessfulInstanceCreditSpecifications) {
            this.unsuccessfulInstanceCreditSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the instances whose credit option for CPU usage was not
     * modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessfulInstanceCreditSpecifications <p>
     *            Information about the instances whose credit option for CPU
     *            usage was not modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstanceCreditSpecificationResult withUnsuccessfulInstanceCreditSpecifications(
            java.util.Collection<UnsuccessfulInstanceCreditSpecificationItem> unsuccessfulInstanceCreditSpecifications) {
        setUnsuccessfulInstanceCreditSpecifications(unsuccessfulInstanceCreditSpecifications);
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
        if (getSuccessfulInstanceCreditSpecifications() != null)
            sb.append("SuccessfulInstanceCreditSpecifications: "
                    + getSuccessfulInstanceCreditSpecifications() + ",");
        if (getUnsuccessfulInstanceCreditSpecifications() != null)
            sb.append("UnsuccessfulInstanceCreditSpecifications: "
                    + getUnsuccessfulInstanceCreditSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSuccessfulInstanceCreditSpecifications() == null) ? 0
                        : getSuccessfulInstanceCreditSpecifications().hashCode());
        hashCode = prime
                * hashCode
                + ((getUnsuccessfulInstanceCreditSpecifications() == null) ? 0
                        : getUnsuccessfulInstanceCreditSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstanceCreditSpecificationResult == false)
            return false;
        ModifyInstanceCreditSpecificationResult other = (ModifyInstanceCreditSpecificationResult) obj;

        if (other.getSuccessfulInstanceCreditSpecifications() == null
                ^ this.getSuccessfulInstanceCreditSpecifications() == null)
            return false;
        if (other.getSuccessfulInstanceCreditSpecifications() != null
                && other.getSuccessfulInstanceCreditSpecifications().equals(
                        this.getSuccessfulInstanceCreditSpecifications()) == false)
            return false;
        if (other.getUnsuccessfulInstanceCreditSpecifications() == null
                ^ this.getUnsuccessfulInstanceCreditSpecifications() == null)
            return false;
        if (other.getUnsuccessfulInstanceCreditSpecifications() != null
                && other.getUnsuccessfulInstanceCreditSpecifications().equals(
                        this.getUnsuccessfulInstanceCreditSpecifications()) == false)
            return false;
        return true;
    }
}
