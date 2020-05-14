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
 * Cancels the specified Spot Fleet requests.
 * </p>
 * <p>
 * After you cancel a Spot Fleet request, the Spot Fleet launches no new Spot
 * Instances. You must specify whether the Spot Fleet should also terminate its
 * Spot Instances. If you terminate the instances, the Spot Fleet request enters
 * the <code>cancelled_terminating</code> state. Otherwise, the Spot Fleet
 * request enters the <code>cancelled_running</code> state and the instances
 * continue to run until they are interrupted or you terminate them manually.
 * </p>
 */
public class CancelSpotFleetRequestsRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The IDs of the Spot Fleet requests.
     * </p>
     */
    private java.util.List<String> spotFleetRequestIds;

    /**
     * <p>
     * Indicates whether to terminate instances for a Spot Fleet request if it
     * is canceled successfully.
     * </p>
     */
    private Boolean terminateInstances;

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
    public CancelSpotFleetRequestsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The IDs of the Spot Fleet requests.
     * </p>
     *
     * @return <p>
     *         The IDs of the Spot Fleet requests.
     *         </p>
     */
    public java.util.List<String> getSpotFleetRequestIds() {
        return spotFleetRequestIds;
    }

    /**
     * <p>
     * The IDs of the Spot Fleet requests.
     * </p>
     *
     * @param spotFleetRequestIds <p>
     *            The IDs of the Spot Fleet requests.
     *            </p>
     */
    public void setSpotFleetRequestIds(java.util.Collection<String> spotFleetRequestIds) {
        if (spotFleetRequestIds == null) {
            this.spotFleetRequestIds = null;
            return;
        }

        this.spotFleetRequestIds = new java.util.ArrayList<String>(spotFleetRequestIds);
    }

    /**
     * <p>
     * The IDs of the Spot Fleet requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotFleetRequestIds <p>
     *            The IDs of the Spot Fleet requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelSpotFleetRequestsRequest withSpotFleetRequestIds(String... spotFleetRequestIds) {
        if (getSpotFleetRequestIds() == null) {
            this.spotFleetRequestIds = new java.util.ArrayList<String>(spotFleetRequestIds.length);
        }
        for (String value : spotFleetRequestIds) {
            this.spotFleetRequestIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Spot Fleet requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotFleetRequestIds <p>
     *            The IDs of the Spot Fleet requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelSpotFleetRequestsRequest withSpotFleetRequestIds(
            java.util.Collection<String> spotFleetRequestIds) {
        setSpotFleetRequestIds(spotFleetRequestIds);
        return this;
    }

    /**
     * <p>
     * Indicates whether to terminate instances for a Spot Fleet request if it
     * is canceled successfully.
     * </p>
     *
     * @return <p>
     *         Indicates whether to terminate instances for a Spot Fleet request
     *         if it is canceled successfully.
     *         </p>
     */
    public Boolean isTerminateInstances() {
        return terminateInstances;
    }

    /**
     * <p>
     * Indicates whether to terminate instances for a Spot Fleet request if it
     * is canceled successfully.
     * </p>
     *
     * @return <p>
     *         Indicates whether to terminate instances for a Spot Fleet request
     *         if it is canceled successfully.
     *         </p>
     */
    public Boolean getTerminateInstances() {
        return terminateInstances;
    }

    /**
     * <p>
     * Indicates whether to terminate instances for a Spot Fleet request if it
     * is canceled successfully.
     * </p>
     *
     * @param terminateInstances <p>
     *            Indicates whether to terminate instances for a Spot Fleet
     *            request if it is canceled successfully.
     *            </p>
     */
    public void setTerminateInstances(Boolean terminateInstances) {
        this.terminateInstances = terminateInstances;
    }

    /**
     * <p>
     * Indicates whether to terminate instances for a Spot Fleet request if it
     * is canceled successfully.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminateInstances <p>
     *            Indicates whether to terminate instances for a Spot Fleet
     *            request if it is canceled successfully.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelSpotFleetRequestsRequest withTerminateInstances(Boolean terminateInstances) {
        this.terminateInstances = terminateInstances;
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
        if (getSpotFleetRequestIds() != null)
            sb.append("SpotFleetRequestIds: " + getSpotFleetRequestIds() + ",");
        if (getTerminateInstances() != null)
            sb.append("TerminateInstances: " + getTerminateInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getSpotFleetRequestIds() == null) ? 0 : getSpotFleetRequestIds().hashCode());
        hashCode = prime * hashCode
                + ((getTerminateInstances() == null) ? 0 : getTerminateInstances().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelSpotFleetRequestsRequest == false)
            return false;
        CancelSpotFleetRequestsRequest other = (CancelSpotFleetRequestsRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getSpotFleetRequestIds() == null ^ this.getSpotFleetRequestIds() == null)
            return false;
        if (other.getSpotFleetRequestIds() != null
                && other.getSpotFleetRequestIds().equals(this.getSpotFleetRequestIds()) == false)
            return false;
        if (other.getTerminateInstances() == null ^ this.getTerminateInstances() == null)
            return false;
        if (other.getTerminateInstances() != null
                && other.getTerminateInstances().equals(this.getTerminateInstances()) == false)
            return false;
        return true;
    }
}
