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
 * Describes an EC2 Fleet that was successfully deleted.
 * </p>
 */
public class DeleteFleetSuccessItem implements Serializable {
    /**
     * <p>
     * The current state of the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     */
    private String currentFleetState;

    /**
     * <p>
     * The previous state of the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     */
    private String previousFleetState;

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     */
    private String fleetId;

    /**
     * <p>
     * The current state of the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     *
     * @return <p>
     *         The current state of the EC2 Fleet.
     *         </p>
     * @see FleetStateCode
     */
    public String getCurrentFleetState() {
        return currentFleetState;
    }

    /**
     * <p>
     * The current state of the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     *
     * @param currentFleetState <p>
     *            The current state of the EC2 Fleet.
     *            </p>
     * @see FleetStateCode
     */
    public void setCurrentFleetState(String currentFleetState) {
        this.currentFleetState = currentFleetState;
    }

    /**
     * <p>
     * The current state of the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     *
     * @param currentFleetState <p>
     *            The current state of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetStateCode
     */
    public DeleteFleetSuccessItem withCurrentFleetState(String currentFleetState) {
        this.currentFleetState = currentFleetState;
        return this;
    }

    /**
     * <p>
     * The current state of the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     *
     * @param currentFleetState <p>
     *            The current state of the EC2 Fleet.
     *            </p>
     * @see FleetStateCode
     */
    public void setCurrentFleetState(FleetStateCode currentFleetState) {
        this.currentFleetState = currentFleetState.toString();
    }

    /**
     * <p>
     * The current state of the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     *
     * @param currentFleetState <p>
     *            The current state of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetStateCode
     */
    public DeleteFleetSuccessItem withCurrentFleetState(FleetStateCode currentFleetState) {
        this.currentFleetState = currentFleetState.toString();
        return this;
    }

    /**
     * <p>
     * The previous state of the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     *
     * @return <p>
     *         The previous state of the EC2 Fleet.
     *         </p>
     * @see FleetStateCode
     */
    public String getPreviousFleetState() {
        return previousFleetState;
    }

    /**
     * <p>
     * The previous state of the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     *
     * @param previousFleetState <p>
     *            The previous state of the EC2 Fleet.
     *            </p>
     * @see FleetStateCode
     */
    public void setPreviousFleetState(String previousFleetState) {
        this.previousFleetState = previousFleetState;
    }

    /**
     * <p>
     * The previous state of the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     *
     * @param previousFleetState <p>
     *            The previous state of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetStateCode
     */
    public DeleteFleetSuccessItem withPreviousFleetState(String previousFleetState) {
        this.previousFleetState = previousFleetState;
        return this;
    }

    /**
     * <p>
     * The previous state of the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     *
     * @param previousFleetState <p>
     *            The previous state of the EC2 Fleet.
     *            </p>
     * @see FleetStateCode
     */
    public void setPreviousFleetState(FleetStateCode previousFleetState) {
        this.previousFleetState = previousFleetState.toString();
    }

    /**
     * <p>
     * The previous state of the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, deleted, failed,
     * deleted_running, deleted_terminating, modifying
     *
     * @param previousFleetState <p>
     *            The previous state of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetStateCode
     */
    public DeleteFleetSuccessItem withPreviousFleetState(FleetStateCode previousFleetState) {
        this.previousFleetState = previousFleetState.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     *
     * @return <p>
     *         The ID of the EC2 Fleet.
     *         </p>
     */
    public String getFleetId() {
        return fleetId;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     *
     * @param fleetId <p>
     *            The ID of the EC2 Fleet.
     *            </p>
     */
    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fleetId <p>
     *            The ID of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFleetSuccessItem withFleetId(String fleetId) {
        this.fleetId = fleetId;
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
        if (getCurrentFleetState() != null)
            sb.append("CurrentFleetState: " + getCurrentFleetState() + ",");
        if (getPreviousFleetState() != null)
            sb.append("PreviousFleetState: " + getPreviousFleetState() + ",");
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCurrentFleetState() == null) ? 0 : getCurrentFleetState().hashCode());
        hashCode = prime * hashCode
                + ((getPreviousFleetState() == null) ? 0 : getPreviousFleetState().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFleetSuccessItem == false)
            return false;
        DeleteFleetSuccessItem other = (DeleteFleetSuccessItem) obj;

        if (other.getCurrentFleetState() == null ^ this.getCurrentFleetState() == null)
            return false;
        if (other.getCurrentFleetState() != null
                && other.getCurrentFleetState().equals(this.getCurrentFleetState()) == false)
            return false;
        if (other.getPreviousFleetState() == null ^ this.getPreviousFleetState() == null)
            return false;
        if (other.getPreviousFleetState() != null
                && other.getPreviousFleetState().equals(this.getPreviousFleetState()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        return true;
    }
}
