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

public class AcceptReservedNodeExchangeResult implements Serializable {
    /**
     * <p/>
     */
    private ReservedNode exchangedReservedNode;

    /**
     * <p/>
     *
     * @return <p/>
     */
    public ReservedNode getExchangedReservedNode() {
        return exchangedReservedNode;
    }

    /**
     * <p/>
     *
     * @param exchangedReservedNode <p/>
     */
    public void setExchangedReservedNode(ReservedNode exchangedReservedNode) {
        this.exchangedReservedNode = exchangedReservedNode;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exchangedReservedNode <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptReservedNodeExchangeResult withExchangedReservedNode(
            ReservedNode exchangedReservedNode) {
        this.exchangedReservedNode = exchangedReservedNode;
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
        if (getExchangedReservedNode() != null)
            sb.append("ExchangedReservedNode: " + getExchangedReservedNode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getExchangedReservedNode() == null) ? 0 : getExchangedReservedNode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptReservedNodeExchangeResult == false)
            return false;
        AcceptReservedNodeExchangeResult other = (AcceptReservedNodeExchangeResult) obj;

        if (other.getExchangedReservedNode() == null ^ this.getExchangedReservedNode() == null)
            return false;
        if (other.getExchangedReservedNode() != null
                && other.getExchangedReservedNode().equals(this.getExchangedReservedNode()) == false)
            return false;
        return true;
    }
}
