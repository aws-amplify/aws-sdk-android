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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Exchanges a DC1 Reserved Node for a DC2 Reserved Node with no changes to the
 * configuration (term, payment type, or number of nodes) and no additional
 * costs.
 * </p>
 */
public class AcceptReservedNodeExchangeRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A string representing the node identifier of the DC1 Reserved Node to be
     * exchanged.
     * </p>
     */
    private String reservedNodeId;

    /**
     * <p>
     * The unique identifier of the DC2 Reserved Node offering to be used for
     * the exchange. You can obtain the value for the parameter by calling
     * <a>GetReservedNodeExchangeOfferings</a>
     * </p>
     */
    private String targetReservedNodeOfferingId;

    /**
     * <p>
     * A string representing the node identifier of the DC1 Reserved Node to be
     * exchanged.
     * </p>
     *
     * @return <p>
     *         A string representing the node identifier of the DC1 Reserved
     *         Node to be exchanged.
     *         </p>
     */
    public String getReservedNodeId() {
        return reservedNodeId;
    }

    /**
     * <p>
     * A string representing the node identifier of the DC1 Reserved Node to be
     * exchanged.
     * </p>
     *
     * @param reservedNodeId <p>
     *            A string representing the node identifier of the DC1 Reserved
     *            Node to be exchanged.
     *            </p>
     */
    public void setReservedNodeId(String reservedNodeId) {
        this.reservedNodeId = reservedNodeId;
    }

    /**
     * <p>
     * A string representing the node identifier of the DC1 Reserved Node to be
     * exchanged.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedNodeId <p>
     *            A string representing the node identifier of the DC1 Reserved
     *            Node to be exchanged.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptReservedNodeExchangeRequest withReservedNodeId(String reservedNodeId) {
        this.reservedNodeId = reservedNodeId;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the DC2 Reserved Node offering to be used for
     * the exchange. You can obtain the value for the parameter by calling
     * <a>GetReservedNodeExchangeOfferings</a>
     * </p>
     *
     * @return <p>
     *         The unique identifier of the DC2 Reserved Node offering to be
     *         used for the exchange. You can obtain the value for the parameter
     *         by calling <a>GetReservedNodeExchangeOfferings</a>
     *         </p>
     */
    public String getTargetReservedNodeOfferingId() {
        return targetReservedNodeOfferingId;
    }

    /**
     * <p>
     * The unique identifier of the DC2 Reserved Node offering to be used for
     * the exchange. You can obtain the value for the parameter by calling
     * <a>GetReservedNodeExchangeOfferings</a>
     * </p>
     *
     * @param targetReservedNodeOfferingId <p>
     *            The unique identifier of the DC2 Reserved Node offering to be
     *            used for the exchange. You can obtain the value for the
     *            parameter by calling <a>GetReservedNodeExchangeOfferings</a>
     *            </p>
     */
    public void setTargetReservedNodeOfferingId(String targetReservedNodeOfferingId) {
        this.targetReservedNodeOfferingId = targetReservedNodeOfferingId;
    }

    /**
     * <p>
     * The unique identifier of the DC2 Reserved Node offering to be used for
     * the exchange. You can obtain the value for the parameter by calling
     * <a>GetReservedNodeExchangeOfferings</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetReservedNodeOfferingId <p>
     *            The unique identifier of the DC2 Reserved Node offering to be
     *            used for the exchange. You can obtain the value for the
     *            parameter by calling <a>GetReservedNodeExchangeOfferings</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptReservedNodeExchangeRequest withTargetReservedNodeOfferingId(
            String targetReservedNodeOfferingId) {
        this.targetReservedNodeOfferingId = targetReservedNodeOfferingId;
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
        if (getReservedNodeId() != null)
            sb.append("ReservedNodeId: " + getReservedNodeId() + ",");
        if (getTargetReservedNodeOfferingId() != null)
            sb.append("TargetReservedNodeOfferingId: " + getTargetReservedNodeOfferingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReservedNodeId() == null) ? 0 : getReservedNodeId().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetReservedNodeOfferingId() == null) ? 0
                        : getTargetReservedNodeOfferingId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptReservedNodeExchangeRequest == false)
            return false;
        AcceptReservedNodeExchangeRequest other = (AcceptReservedNodeExchangeRequest) obj;

        if (other.getReservedNodeId() == null ^ this.getReservedNodeId() == null)
            return false;
        if (other.getReservedNodeId() != null
                && other.getReservedNodeId().equals(this.getReservedNodeId()) == false)
            return false;
        if (other.getTargetReservedNodeOfferingId() == null
                ^ this.getTargetReservedNodeOfferingId() == null)
            return false;
        if (other.getTargetReservedNodeOfferingId() != null
                && other.getTargetReservedNodeOfferingId().equals(
                        this.getTargetReservedNodeOfferingId()) == false)
            return false;
        return true;
    }
}
