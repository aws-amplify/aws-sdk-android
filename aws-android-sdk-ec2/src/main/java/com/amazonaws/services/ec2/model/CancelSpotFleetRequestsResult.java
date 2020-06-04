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
 * Contains the output of CancelSpotFleetRequests.
 * </p>
 */
public class CancelSpotFleetRequestsResult implements Serializable {
    /**
     * <p>
     * Information about the Spot Fleet requests that are successfully canceled.
     * </p>
     */
    private java.util.List<CancelSpotFleetRequestsSuccessItem> successfulFleetRequests;

    /**
     * <p>
     * Information about the Spot Fleet requests that are not successfully
     * canceled.
     * </p>
     */
    private java.util.List<CancelSpotFleetRequestsErrorItem> unsuccessfulFleetRequests;

    /**
     * <p>
     * Information about the Spot Fleet requests that are successfully canceled.
     * </p>
     *
     * @return <p>
     *         Information about the Spot Fleet requests that are successfully
     *         canceled.
     *         </p>
     */
    public java.util.List<CancelSpotFleetRequestsSuccessItem> getSuccessfulFleetRequests() {
        return successfulFleetRequests;
    }

    /**
     * <p>
     * Information about the Spot Fleet requests that are successfully canceled.
     * </p>
     *
     * @param successfulFleetRequests <p>
     *            Information about the Spot Fleet requests that are
     *            successfully canceled.
     *            </p>
     */
    public void setSuccessfulFleetRequests(
            java.util.Collection<CancelSpotFleetRequestsSuccessItem> successfulFleetRequests) {
        if (successfulFleetRequests == null) {
            this.successfulFleetRequests = null;
            return;
        }

        this.successfulFleetRequests = new java.util.ArrayList<CancelSpotFleetRequestsSuccessItem>(
                successfulFleetRequests);
    }

    /**
     * <p>
     * Information about the Spot Fleet requests that are successfully canceled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulFleetRequests <p>
     *            Information about the Spot Fleet requests that are
     *            successfully canceled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelSpotFleetRequestsResult withSuccessfulFleetRequests(
            CancelSpotFleetRequestsSuccessItem... successfulFleetRequests) {
        if (getSuccessfulFleetRequests() == null) {
            this.successfulFleetRequests = new java.util.ArrayList<CancelSpotFleetRequestsSuccessItem>(
                    successfulFleetRequests.length);
        }
        for (CancelSpotFleetRequestsSuccessItem value : successfulFleetRequests) {
            this.successfulFleetRequests.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Spot Fleet requests that are successfully canceled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulFleetRequests <p>
     *            Information about the Spot Fleet requests that are
     *            successfully canceled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelSpotFleetRequestsResult withSuccessfulFleetRequests(
            java.util.Collection<CancelSpotFleetRequestsSuccessItem> successfulFleetRequests) {
        setSuccessfulFleetRequests(successfulFleetRequests);
        return this;
    }

    /**
     * <p>
     * Information about the Spot Fleet requests that are not successfully
     * canceled.
     * </p>
     *
     * @return <p>
     *         Information about the Spot Fleet requests that are not
     *         successfully canceled.
     *         </p>
     */
    public java.util.List<CancelSpotFleetRequestsErrorItem> getUnsuccessfulFleetRequests() {
        return unsuccessfulFleetRequests;
    }

    /**
     * <p>
     * Information about the Spot Fleet requests that are not successfully
     * canceled.
     * </p>
     *
     * @param unsuccessfulFleetRequests <p>
     *            Information about the Spot Fleet requests that are not
     *            successfully canceled.
     *            </p>
     */
    public void setUnsuccessfulFleetRequests(
            java.util.Collection<CancelSpotFleetRequestsErrorItem> unsuccessfulFleetRequests) {
        if (unsuccessfulFleetRequests == null) {
            this.unsuccessfulFleetRequests = null;
            return;
        }

        this.unsuccessfulFleetRequests = new java.util.ArrayList<CancelSpotFleetRequestsErrorItem>(
                unsuccessfulFleetRequests);
    }

    /**
     * <p>
     * Information about the Spot Fleet requests that are not successfully
     * canceled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessfulFleetRequests <p>
     *            Information about the Spot Fleet requests that are not
     *            successfully canceled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelSpotFleetRequestsResult withUnsuccessfulFleetRequests(
            CancelSpotFleetRequestsErrorItem... unsuccessfulFleetRequests) {
        if (getUnsuccessfulFleetRequests() == null) {
            this.unsuccessfulFleetRequests = new java.util.ArrayList<CancelSpotFleetRequestsErrorItem>(
                    unsuccessfulFleetRequests.length);
        }
        for (CancelSpotFleetRequestsErrorItem value : unsuccessfulFleetRequests) {
            this.unsuccessfulFleetRequests.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Spot Fleet requests that are not successfully
     * canceled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessfulFleetRequests <p>
     *            Information about the Spot Fleet requests that are not
     *            successfully canceled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelSpotFleetRequestsResult withUnsuccessfulFleetRequests(
            java.util.Collection<CancelSpotFleetRequestsErrorItem> unsuccessfulFleetRequests) {
        setUnsuccessfulFleetRequests(unsuccessfulFleetRequests);
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
        if (getSuccessfulFleetRequests() != null)
            sb.append("SuccessfulFleetRequests: " + getSuccessfulFleetRequests() + ",");
        if (getUnsuccessfulFleetRequests() != null)
            sb.append("UnsuccessfulFleetRequests: " + getUnsuccessfulFleetRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSuccessfulFleetRequests() == null) ? 0 : getSuccessfulFleetRequests()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getUnsuccessfulFleetRequests() == null) ? 0 : getUnsuccessfulFleetRequests()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelSpotFleetRequestsResult == false)
            return false;
        CancelSpotFleetRequestsResult other = (CancelSpotFleetRequestsResult) obj;

        if (other.getSuccessfulFleetRequests() == null ^ this.getSuccessfulFleetRequests() == null)
            return false;
        if (other.getSuccessfulFleetRequests() != null
                && other.getSuccessfulFleetRequests().equals(this.getSuccessfulFleetRequests()) == false)
            return false;
        if (other.getUnsuccessfulFleetRequests() == null
                ^ this.getUnsuccessfulFleetRequests() == null)
            return false;
        if (other.getUnsuccessfulFleetRequests() != null
                && other.getUnsuccessfulFleetRequests().equals(this.getUnsuccessfulFleetRequests()) == false)
            return false;
        return true;
    }
}
