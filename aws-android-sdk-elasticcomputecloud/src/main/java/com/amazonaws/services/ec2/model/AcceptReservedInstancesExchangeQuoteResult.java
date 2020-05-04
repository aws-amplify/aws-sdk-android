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
 * The result of the exchange and whether it was <code>successful</code>.
 * </p>
 */
public class AcceptReservedInstancesExchangeQuoteResult implements Serializable {
    /**
     * <p>
     * The ID of the successful exchange.
     * </p>
     */
    private String exchangeId;

    /**
     * <p>
     * The ID of the successful exchange.
     * </p>
     *
     * @return <p>
     *         The ID of the successful exchange.
     *         </p>
     */
    public String getExchangeId() {
        return exchangeId;
    }

    /**
     * <p>
     * The ID of the successful exchange.
     * </p>
     *
     * @param exchangeId <p>
     *            The ID of the successful exchange.
     *            </p>
     */
    public void setExchangeId(String exchangeId) {
        this.exchangeId = exchangeId;
    }

    /**
     * <p>
     * The ID of the successful exchange.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exchangeId <p>
     *            The ID of the successful exchange.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptReservedInstancesExchangeQuoteResult withExchangeId(String exchangeId) {
        this.exchangeId = exchangeId;
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
        if (getExchangeId() != null)
            sb.append("ExchangeId: " + getExchangeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExchangeId() == null) ? 0 : getExchangeId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptReservedInstancesExchangeQuoteResult == false)
            return false;
        AcceptReservedInstancesExchangeQuoteResult other = (AcceptReservedInstancesExchangeQuoteResult) obj;

        if (other.getExchangeId() == null ^ this.getExchangeId() == null)
            return false;
        if (other.getExchangeId() != null
                && other.getExchangeId().equals(this.getExchangeId()) == false)
            return false;
        return true;
    }
}
