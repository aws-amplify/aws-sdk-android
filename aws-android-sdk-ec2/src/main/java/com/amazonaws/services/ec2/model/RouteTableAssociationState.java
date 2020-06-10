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
 * Describes the state of an association between a route table and a subnet or
 * gateway.
 * </p>
 */
public class RouteTableAssociationState implements Serializable {
    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated, failed
     */
    private String state;

    /**
     * <p>
     * The status message, if applicable.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated, failed
     *
     * @return <p>
     *         The state of the association.
     *         </p>
     * @see RouteTableAssociationStateCode
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated, failed
     *
     * @param state <p>
     *            The state of the association.
     *            </p>
     * @see RouteTableAssociationStateCode
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated, failed
     *
     * @param state <p>
     *            The state of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RouteTableAssociationStateCode
     */
    public RouteTableAssociationState withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated, failed
     *
     * @param state <p>
     *            The state of the association.
     *            </p>
     * @see RouteTableAssociationStateCode
     */
    public void setState(RouteTableAssociationStateCode state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated, failed
     *
     * @param state <p>
     *            The state of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RouteTableAssociationStateCode
     */
    public RouteTableAssociationState withState(RouteTableAssociationStateCode state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The status message, if applicable.
     * </p>
     *
     * @return <p>
     *         The status message, if applicable.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * The status message, if applicable.
     * </p>
     *
     * @param statusMessage <p>
     *            The status message, if applicable.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            The status message, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteTableAssociationState withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
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
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteTableAssociationState == false)
            return false;
        RouteTableAssociationState other = (RouteTableAssociationState) obj;

        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }
}
