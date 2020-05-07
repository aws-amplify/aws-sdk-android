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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Cancels one or more Spot Instance requests.
 * </p>
 * <important>
 * <p>
 * Canceling a Spot Instance request does not terminate running Spot Instances
 * associated with the request.
 * </p>
 * </important>
 */
public class CancelSpotInstanceRequestsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * One or more Spot Instance request IDs.
     * </p>
     */
    private java.util.List<String> spotInstanceRequestIds;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelSpotInstanceRequestsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * One or more Spot Instance request IDs.
     * </p>
     *
     * @return <p>
     *         One or more Spot Instance request IDs.
     *         </p>
     */
    public java.util.List<String> getSpotInstanceRequestIds() {
        return spotInstanceRequestIds;
    }

    /**
     * <p>
     * One or more Spot Instance request IDs.
     * </p>
     *
     * @param spotInstanceRequestIds <p>
     *            One or more Spot Instance request IDs.
     *            </p>
     */
    public void setSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
        if (spotInstanceRequestIds == null) {
            this.spotInstanceRequestIds = null;
            return;
        }

        this.spotInstanceRequestIds = new java.util.ArrayList<String>(spotInstanceRequestIds);
    }

    /**
     * <p>
     * One or more Spot Instance request IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotInstanceRequestIds <p>
     *            One or more Spot Instance request IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelSpotInstanceRequestsRequest withSpotInstanceRequestIds(
            String... spotInstanceRequestIds) {
        if (getSpotInstanceRequestIds() == null) {
            this.spotInstanceRequestIds = new java.util.ArrayList<String>(
                    spotInstanceRequestIds.length);
        }
        for (String value : spotInstanceRequestIds) {
            this.spotInstanceRequestIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more Spot Instance request IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotInstanceRequestIds <p>
     *            One or more Spot Instance request IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelSpotInstanceRequestsRequest withSpotInstanceRequestIds(
            java.util.Collection<String> spotInstanceRequestIds) {
        setSpotInstanceRequestIds(spotInstanceRequestIds);
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getSpotInstanceRequestIds() != null)
            sb.append("SpotInstanceRequestIds: " + getSpotInstanceRequestIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime
                * hashCode
                + ((getSpotInstanceRequestIds() == null) ? 0 : getSpotInstanceRequestIds()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelSpotInstanceRequestsRequest == false)
            return false;
        CancelSpotInstanceRequestsRequest other = (CancelSpotInstanceRequestsRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getSpotInstanceRequestIds() == null ^ this.getSpotInstanceRequestIds() == null)
            return false;
        if (other.getSpotInstanceRequestIds() != null
                && other.getSpotInstanceRequestIds().equals(this.getSpotInstanceRequestIds()) == false)
            return false;
        return true;
    }
}
