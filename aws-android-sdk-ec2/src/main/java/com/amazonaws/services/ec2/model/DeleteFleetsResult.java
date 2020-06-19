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

public class DeleteFleetsResult implements Serializable {
    /**
     * <p>
     * Information about the EC2 Fleets that are successfully deleted.
     * </p>
     */
    private java.util.List<DeleteFleetSuccessItem> successfulFleetDeletions;

    /**
     * <p>
     * Information about the EC2 Fleets that are not successfully deleted.
     * </p>
     */
    private java.util.List<DeleteFleetErrorItem> unsuccessfulFleetDeletions;

    /**
     * <p>
     * Information about the EC2 Fleets that are successfully deleted.
     * </p>
     *
     * @return <p>
     *         Information about the EC2 Fleets that are successfully deleted.
     *         </p>
     */
    public java.util.List<DeleteFleetSuccessItem> getSuccessfulFleetDeletions() {
        return successfulFleetDeletions;
    }

    /**
     * <p>
     * Information about the EC2 Fleets that are successfully deleted.
     * </p>
     *
     * @param successfulFleetDeletions <p>
     *            Information about the EC2 Fleets that are successfully
     *            deleted.
     *            </p>
     */
    public void setSuccessfulFleetDeletions(
            java.util.Collection<DeleteFleetSuccessItem> successfulFleetDeletions) {
        if (successfulFleetDeletions == null) {
            this.successfulFleetDeletions = null;
            return;
        }

        this.successfulFleetDeletions = new java.util.ArrayList<DeleteFleetSuccessItem>(
                successfulFleetDeletions);
    }

    /**
     * <p>
     * Information about the EC2 Fleets that are successfully deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulFleetDeletions <p>
     *            Information about the EC2 Fleets that are successfully
     *            deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFleetsResult withSuccessfulFleetDeletions(
            DeleteFleetSuccessItem... successfulFleetDeletions) {
        if (getSuccessfulFleetDeletions() == null) {
            this.successfulFleetDeletions = new java.util.ArrayList<DeleteFleetSuccessItem>(
                    successfulFleetDeletions.length);
        }
        for (DeleteFleetSuccessItem value : successfulFleetDeletions) {
            this.successfulFleetDeletions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the EC2 Fleets that are successfully deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulFleetDeletions <p>
     *            Information about the EC2 Fleets that are successfully
     *            deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFleetsResult withSuccessfulFleetDeletions(
            java.util.Collection<DeleteFleetSuccessItem> successfulFleetDeletions) {
        setSuccessfulFleetDeletions(successfulFleetDeletions);
        return this;
    }

    /**
     * <p>
     * Information about the EC2 Fleets that are not successfully deleted.
     * </p>
     *
     * @return <p>
     *         Information about the EC2 Fleets that are not successfully
     *         deleted.
     *         </p>
     */
    public java.util.List<DeleteFleetErrorItem> getUnsuccessfulFleetDeletions() {
        return unsuccessfulFleetDeletions;
    }

    /**
     * <p>
     * Information about the EC2 Fleets that are not successfully deleted.
     * </p>
     *
     * @param unsuccessfulFleetDeletions <p>
     *            Information about the EC2 Fleets that are not successfully
     *            deleted.
     *            </p>
     */
    public void setUnsuccessfulFleetDeletions(
            java.util.Collection<DeleteFleetErrorItem> unsuccessfulFleetDeletions) {
        if (unsuccessfulFleetDeletions == null) {
            this.unsuccessfulFleetDeletions = null;
            return;
        }

        this.unsuccessfulFleetDeletions = new java.util.ArrayList<DeleteFleetErrorItem>(
                unsuccessfulFleetDeletions);
    }

    /**
     * <p>
     * Information about the EC2 Fleets that are not successfully deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessfulFleetDeletions <p>
     *            Information about the EC2 Fleets that are not successfully
     *            deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFleetsResult withUnsuccessfulFleetDeletions(
            DeleteFleetErrorItem... unsuccessfulFleetDeletions) {
        if (getUnsuccessfulFleetDeletions() == null) {
            this.unsuccessfulFleetDeletions = new java.util.ArrayList<DeleteFleetErrorItem>(
                    unsuccessfulFleetDeletions.length);
        }
        for (DeleteFleetErrorItem value : unsuccessfulFleetDeletions) {
            this.unsuccessfulFleetDeletions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the EC2 Fleets that are not successfully deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessfulFleetDeletions <p>
     *            Information about the EC2 Fleets that are not successfully
     *            deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFleetsResult withUnsuccessfulFleetDeletions(
            java.util.Collection<DeleteFleetErrorItem> unsuccessfulFleetDeletions) {
        setUnsuccessfulFleetDeletions(unsuccessfulFleetDeletions);
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
        if (getSuccessfulFleetDeletions() != null)
            sb.append("SuccessfulFleetDeletions: " + getSuccessfulFleetDeletions() + ",");
        if (getUnsuccessfulFleetDeletions() != null)
            sb.append("UnsuccessfulFleetDeletions: " + getUnsuccessfulFleetDeletions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSuccessfulFleetDeletions() == null) ? 0 : getSuccessfulFleetDeletions()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getUnsuccessfulFleetDeletions() == null) ? 0 : getUnsuccessfulFleetDeletions()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFleetsResult == false)
            return false;
        DeleteFleetsResult other = (DeleteFleetsResult) obj;

        if (other.getSuccessfulFleetDeletions() == null
                ^ this.getSuccessfulFleetDeletions() == null)
            return false;
        if (other.getSuccessfulFleetDeletions() != null
                && other.getSuccessfulFleetDeletions().equals(this.getSuccessfulFleetDeletions()) == false)
            return false;
        if (other.getUnsuccessfulFleetDeletions() == null
                ^ this.getUnsuccessfulFleetDeletions() == null)
            return false;
        if (other.getUnsuccessfulFleetDeletions() != null
                && other.getUnsuccessfulFleetDeletions().equals(
                        this.getUnsuccessfulFleetDeletions()) == false)
            return false;
        return true;
    }
}
