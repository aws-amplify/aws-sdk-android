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
 * Deletes the specified EC2 Fleet.
 * </p>
 * <p>
 * After you delete an EC2 Fleet, it launches no new instances. You must specify
 * whether an EC2 Fleet should also terminate its instances. If you terminate
 * the instances, the EC2 Fleet enters the <code>deleted_terminating</code>
 * state. Otherwise, the EC2 Fleet enters the <code>deleted_running</code>
 * state, and the instances continue to run until they are interrupted or you
 * terminate them manually.
 * </p>
 */
public class DeleteFleetsRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The IDs of the EC2 Fleets.
     * </p>
     */
    private java.util.List<String> fleetIds;

    /**
     * <p>
     * Indicates whether to terminate instances for an EC2 Fleet if it is
     * deleted successfully.
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
    public DeleteFleetsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The IDs of the EC2 Fleets.
     * </p>
     *
     * @return <p>
     *         The IDs of the EC2 Fleets.
     *         </p>
     */
    public java.util.List<String> getFleetIds() {
        return fleetIds;
    }

    /**
     * <p>
     * The IDs of the EC2 Fleets.
     * </p>
     *
     * @param fleetIds <p>
     *            The IDs of the EC2 Fleets.
     *            </p>
     */
    public void setFleetIds(java.util.Collection<String> fleetIds) {
        if (fleetIds == null) {
            this.fleetIds = null;
            return;
        }

        this.fleetIds = new java.util.ArrayList<String>(fleetIds);
    }

    /**
     * <p>
     * The IDs of the EC2 Fleets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fleetIds <p>
     *            The IDs of the EC2 Fleets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFleetsRequest withFleetIds(String... fleetIds) {
        if (getFleetIds() == null) {
            this.fleetIds = new java.util.ArrayList<String>(fleetIds.length);
        }
        for (String value : fleetIds) {
            this.fleetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the EC2 Fleets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fleetIds <p>
     *            The IDs of the EC2 Fleets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFleetsRequest withFleetIds(java.util.Collection<String> fleetIds) {
        setFleetIds(fleetIds);
        return this;
    }

    /**
     * <p>
     * Indicates whether to terminate instances for an EC2 Fleet if it is
     * deleted successfully.
     * </p>
     *
     * @return <p>
     *         Indicates whether to terminate instances for an EC2 Fleet if it
     *         is deleted successfully.
     *         </p>
     */
    public Boolean isTerminateInstances() {
        return terminateInstances;
    }

    /**
     * <p>
     * Indicates whether to terminate instances for an EC2 Fleet if it is
     * deleted successfully.
     * </p>
     *
     * @return <p>
     *         Indicates whether to terminate instances for an EC2 Fleet if it
     *         is deleted successfully.
     *         </p>
     */
    public Boolean getTerminateInstances() {
        return terminateInstances;
    }

    /**
     * <p>
     * Indicates whether to terminate instances for an EC2 Fleet if it is
     * deleted successfully.
     * </p>
     *
     * @param terminateInstances <p>
     *            Indicates whether to terminate instances for an EC2 Fleet if
     *            it is deleted successfully.
     *            </p>
     */
    public void setTerminateInstances(Boolean terminateInstances) {
        this.terminateInstances = terminateInstances;
    }

    /**
     * <p>
     * Indicates whether to terminate instances for an EC2 Fleet if it is
     * deleted successfully.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminateInstances <p>
     *            Indicates whether to terminate instances for an EC2 Fleet if
     *            it is deleted successfully.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFleetsRequest withTerminateInstances(Boolean terminateInstances) {
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
        if (getFleetIds() != null)
            sb.append("FleetIds: " + getFleetIds() + ",");
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
        hashCode = prime * hashCode + ((getFleetIds() == null) ? 0 : getFleetIds().hashCode());
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

        if (obj instanceof DeleteFleetsRequest == false)
            return false;
        DeleteFleetsRequest other = (DeleteFleetsRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getFleetIds() == null ^ this.getFleetIds() == null)
            return false;
        if (other.getFleetIds() != null && other.getFleetIds().equals(this.getFleetIds()) == false)
            return false;
        if (other.getTerminateInstances() == null ^ this.getTerminateInstances() == null)
            return false;
        if (other.getTerminateInstances() != null
                && other.getTerminateInstances().equals(this.getTerminateInstances()) == false)
            return false;
        return true;
    }
}
