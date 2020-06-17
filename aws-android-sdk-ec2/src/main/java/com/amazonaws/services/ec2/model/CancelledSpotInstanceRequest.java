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
 * Describes a request to cancel a Spot Instance.
 * </p>
 */
public class CancelledSpotInstanceRequest implements Serializable {
    /**
     * <p>
     * The ID of the Spot Instance request.
     * </p>
     */
    private String spotInstanceRequestId;

    /**
     * <p>
     * The state of the Spot Instance request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, open, closed, cancelled, completed
     */
    private String state;

    /**
     * <p>
     * The ID of the Spot Instance request.
     * </p>
     *
     * @return <p>
     *         The ID of the Spot Instance request.
     *         </p>
     */
    public String getSpotInstanceRequestId() {
        return spotInstanceRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Instance request.
     * </p>
     *
     * @param spotInstanceRequestId <p>
     *            The ID of the Spot Instance request.
     *            </p>
     */
    public void setSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Instance request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotInstanceRequestId <p>
     *            The ID of the Spot Instance request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelledSpotInstanceRequest withSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
        return this;
    }

    /**
     * <p>
     * The state of the Spot Instance request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, open, closed, cancelled, completed
     *
     * @return <p>
     *         The state of the Spot Instance request.
     *         </p>
     * @see CancelSpotInstanceRequestState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the Spot Instance request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, open, closed, cancelled, completed
     *
     * @param state <p>
     *            The state of the Spot Instance request.
     *            </p>
     * @see CancelSpotInstanceRequestState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the Spot Instance request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, open, closed, cancelled, completed
     *
     * @param state <p>
     *            The state of the Spot Instance request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CancelSpotInstanceRequestState
     */
    public CancelledSpotInstanceRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the Spot Instance request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, open, closed, cancelled, completed
     *
     * @param state <p>
     *            The state of the Spot Instance request.
     *            </p>
     * @see CancelSpotInstanceRequestState
     */
    public void setState(CancelSpotInstanceRequestState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the Spot Instance request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, open, closed, cancelled, completed
     *
     * @param state <p>
     *            The state of the Spot Instance request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CancelSpotInstanceRequestState
     */
    public CancelledSpotInstanceRequest withState(CancelSpotInstanceRequestState state) {
        this.state = state.toString();
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
        if (getSpotInstanceRequestId() != null)
            sb.append("SpotInstanceRequestId: " + getSpotInstanceRequestId() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSpotInstanceRequestId() == null) ? 0 : getSpotInstanceRequestId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelledSpotInstanceRequest == false)
            return false;
        CancelledSpotInstanceRequest other = (CancelledSpotInstanceRequest) obj;

        if (other.getSpotInstanceRequestId() == null ^ this.getSpotInstanceRequestId() == null)
            return false;
        if (other.getSpotInstanceRequestId() != null
                && other.getSpotInstanceRequestId().equals(this.getSpotInstanceRequestId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
