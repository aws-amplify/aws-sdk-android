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
 * Describes a Spot Fleet request that was successfully canceled.
 * </p>
 */
public class CancelSpotFleetRequestsSuccessItem implements Serializable {
    /**
     * <p>
     * The current state of the Spot Fleet request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     */
    private String currentSpotFleetRequestState;

    /**
     * <p>
     * The previous state of the Spot Fleet request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     */
    private String previousSpotFleetRequestState;

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     */
    private String spotFleetRequestId;

    /**
     * <p>
     * The current state of the Spot Fleet request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     *
     * @return <p>
     *         The current state of the Spot Fleet request.
     *         </p>
     * @see BatchState
     */
    public String getCurrentSpotFleetRequestState() {
        return currentSpotFleetRequestState;
    }

    /**
     * <p>
     * The current state of the Spot Fleet request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     *
     * @param currentSpotFleetRequestState <p>
     *            The current state of the Spot Fleet request.
     *            </p>
     * @see BatchState
     */
    public void setCurrentSpotFleetRequestState(String currentSpotFleetRequestState) {
        this.currentSpotFleetRequestState = currentSpotFleetRequestState;
    }

    /**
     * <p>
     * The current state of the Spot Fleet request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     *
     * @param currentSpotFleetRequestState <p>
     *            The current state of the Spot Fleet request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BatchState
     */
    public CancelSpotFleetRequestsSuccessItem withCurrentSpotFleetRequestState(
            String currentSpotFleetRequestState) {
        this.currentSpotFleetRequestState = currentSpotFleetRequestState;
        return this;
    }

    /**
     * <p>
     * The current state of the Spot Fleet request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     *
     * @param currentSpotFleetRequestState <p>
     *            The current state of the Spot Fleet request.
     *            </p>
     * @see BatchState
     */
    public void setCurrentSpotFleetRequestState(BatchState currentSpotFleetRequestState) {
        this.currentSpotFleetRequestState = currentSpotFleetRequestState.toString();
    }

    /**
     * <p>
     * The current state of the Spot Fleet request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     *
     * @param currentSpotFleetRequestState <p>
     *            The current state of the Spot Fleet request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BatchState
     */
    public CancelSpotFleetRequestsSuccessItem withCurrentSpotFleetRequestState(
            BatchState currentSpotFleetRequestState) {
        this.currentSpotFleetRequestState = currentSpotFleetRequestState.toString();
        return this;
    }

    /**
     * <p>
     * The previous state of the Spot Fleet request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     *
     * @return <p>
     *         The previous state of the Spot Fleet request.
     *         </p>
     * @see BatchState
     */
    public String getPreviousSpotFleetRequestState() {
        return previousSpotFleetRequestState;
    }

    /**
     * <p>
     * The previous state of the Spot Fleet request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     *
     * @param previousSpotFleetRequestState <p>
     *            The previous state of the Spot Fleet request.
     *            </p>
     * @see BatchState
     */
    public void setPreviousSpotFleetRequestState(String previousSpotFleetRequestState) {
        this.previousSpotFleetRequestState = previousSpotFleetRequestState;
    }

    /**
     * <p>
     * The previous state of the Spot Fleet request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     *
     * @param previousSpotFleetRequestState <p>
     *            The previous state of the Spot Fleet request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BatchState
     */
    public CancelSpotFleetRequestsSuccessItem withPreviousSpotFleetRequestState(
            String previousSpotFleetRequestState) {
        this.previousSpotFleetRequestState = previousSpotFleetRequestState;
        return this;
    }

    /**
     * <p>
     * The previous state of the Spot Fleet request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     *
     * @param previousSpotFleetRequestState <p>
     *            The previous state of the Spot Fleet request.
     *            </p>
     * @see BatchState
     */
    public void setPreviousSpotFleetRequestState(BatchState previousSpotFleetRequestState) {
        this.previousSpotFleetRequestState = previousSpotFleetRequestState.toString();
    }

    /**
     * <p>
     * The previous state of the Spot Fleet request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     *
     * @param previousSpotFleetRequestState <p>
     *            The previous state of the Spot Fleet request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BatchState
     */
    public CancelSpotFleetRequestsSuccessItem withPreviousSpotFleetRequestState(
            BatchState previousSpotFleetRequestState) {
        this.previousSpotFleetRequestState = previousSpotFleetRequestState.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     *
     * @return <p>
     *         The ID of the Spot Fleet request.
     *         </p>
     */
    public String getSpotFleetRequestId() {
        return spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     *
     * @param spotFleetRequestId <p>
     *            The ID of the Spot Fleet request.
     *            </p>
     */
    public void setSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotFleetRequestId <p>
     *            The ID of the Spot Fleet request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelSpotFleetRequestsSuccessItem withSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
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
        if (getCurrentSpotFleetRequestState() != null)
            sb.append("CurrentSpotFleetRequestState: " + getCurrentSpotFleetRequestState() + ",");
        if (getPreviousSpotFleetRequestState() != null)
            sb.append("PreviousSpotFleetRequestState: " + getPreviousSpotFleetRequestState() + ",");
        if (getSpotFleetRequestId() != null)
            sb.append("SpotFleetRequestId: " + getSpotFleetRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCurrentSpotFleetRequestState() == null) ? 0
                        : getCurrentSpotFleetRequestState().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreviousSpotFleetRequestState() == null) ? 0
                        : getPreviousSpotFleetRequestState().hashCode());
        hashCode = prime * hashCode
                + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelSpotFleetRequestsSuccessItem == false)
            return false;
        CancelSpotFleetRequestsSuccessItem other = (CancelSpotFleetRequestsSuccessItem) obj;

        if (other.getCurrentSpotFleetRequestState() == null
                ^ this.getCurrentSpotFleetRequestState() == null)
            return false;
        if (other.getCurrentSpotFleetRequestState() != null
                && other.getCurrentSpotFleetRequestState().equals(
                        this.getCurrentSpotFleetRequestState()) == false)
            return false;
        if (other.getPreviousSpotFleetRequestState() == null
                ^ this.getPreviousSpotFleetRequestState() == null)
            return false;
        if (other.getPreviousSpotFleetRequestState() != null
                && other.getPreviousSpotFleetRequestState().equals(
                        this.getPreviousSpotFleetRequestState()) == false)
            return false;
        if (other.getSpotFleetRequestId() == null ^ this.getSpotFleetRequestId() == null)
            return false;
        if (other.getSpotFleetRequestId() != null
                && other.getSpotFleetRequestId().equals(this.getSpotFleetRequestId()) == false)
            return false;
        return true;
    }
}
