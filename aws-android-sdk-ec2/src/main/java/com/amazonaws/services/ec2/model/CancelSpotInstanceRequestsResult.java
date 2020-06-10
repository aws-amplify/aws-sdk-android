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
 * Contains the output of CancelSpotInstanceRequests.
 * </p>
 */
public class CancelSpotInstanceRequestsResult implements Serializable {
    /**
     * <p>
     * One or more Spot Instance requests.
     * </p>
     */
    private java.util.List<CancelledSpotInstanceRequest> cancelledSpotInstanceRequests;

    /**
     * <p>
     * One or more Spot Instance requests.
     * </p>
     *
     * @return <p>
     *         One or more Spot Instance requests.
     *         </p>
     */
    public java.util.List<CancelledSpotInstanceRequest> getCancelledSpotInstanceRequests() {
        return cancelledSpotInstanceRequests;
    }

    /**
     * <p>
     * One or more Spot Instance requests.
     * </p>
     *
     * @param cancelledSpotInstanceRequests <p>
     *            One or more Spot Instance requests.
     *            </p>
     */
    public void setCancelledSpotInstanceRequests(
            java.util.Collection<CancelledSpotInstanceRequest> cancelledSpotInstanceRequests) {
        if (cancelledSpotInstanceRequests == null) {
            this.cancelledSpotInstanceRequests = null;
            return;
        }

        this.cancelledSpotInstanceRequests = new java.util.ArrayList<CancelledSpotInstanceRequest>(
                cancelledSpotInstanceRequests);
    }

    /**
     * <p>
     * One or more Spot Instance requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cancelledSpotInstanceRequests <p>
     *            One or more Spot Instance requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelSpotInstanceRequestsResult withCancelledSpotInstanceRequests(
            CancelledSpotInstanceRequest... cancelledSpotInstanceRequests) {
        if (getCancelledSpotInstanceRequests() == null) {
            this.cancelledSpotInstanceRequests = new java.util.ArrayList<CancelledSpotInstanceRequest>(
                    cancelledSpotInstanceRequests.length);
        }
        for (CancelledSpotInstanceRequest value : cancelledSpotInstanceRequests) {
            this.cancelledSpotInstanceRequests.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more Spot Instance requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cancelledSpotInstanceRequests <p>
     *            One or more Spot Instance requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelSpotInstanceRequestsResult withCancelledSpotInstanceRequests(
            java.util.Collection<CancelledSpotInstanceRequest> cancelledSpotInstanceRequests) {
        setCancelledSpotInstanceRequests(cancelledSpotInstanceRequests);
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
        if (getCancelledSpotInstanceRequests() != null)
            sb.append("CancelledSpotInstanceRequests: " + getCancelledSpotInstanceRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCancelledSpotInstanceRequests() == null) ? 0
                        : getCancelledSpotInstanceRequests().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelSpotInstanceRequestsResult == false)
            return false;
        CancelSpotInstanceRequestsResult other = (CancelSpotInstanceRequestsResult) obj;

        if (other.getCancelledSpotInstanceRequests() == null
                ^ this.getCancelledSpotInstanceRequests() == null)
            return false;
        if (other.getCancelledSpotInstanceRequests() != null
                && other.getCancelledSpotInstanceRequests().equals(
                        this.getCancelledSpotInstanceRequests()) == false)
            return false;
        return true;
    }
}
