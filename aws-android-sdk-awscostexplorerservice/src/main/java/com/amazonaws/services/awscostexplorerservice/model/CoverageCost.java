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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * How much it costs to run an instance.
 * </p>
 */
public class CoverageCost implements Serializable {
    /**
     * <p>
     * How much an On-Demand Instance costs.
     * </p>
     */
    private String onDemandCost;

    /**
     * <p>
     * How much an On-Demand Instance costs.
     * </p>
     *
     * @return <p>
     *         How much an On-Demand Instance costs.
     *         </p>
     */
    public String getOnDemandCost() {
        return onDemandCost;
    }

    /**
     * <p>
     * How much an On-Demand Instance costs.
     * </p>
     *
     * @param onDemandCost <p>
     *            How much an On-Demand Instance costs.
     *            </p>
     */
    public void setOnDemandCost(String onDemandCost) {
        this.onDemandCost = onDemandCost;
    }

    /**
     * <p>
     * How much an On-Demand Instance costs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onDemandCost <p>
     *            How much an On-Demand Instance costs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoverageCost withOnDemandCost(String onDemandCost) {
        this.onDemandCost = onDemandCost;
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
        if (getOnDemandCost() != null)
            sb.append("OnDemandCost: " + getOnDemandCost());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOnDemandCost() == null) ? 0 : getOnDemandCost().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoverageCost == false)
            return false;
        CoverageCost other = (CoverageCost) obj;

        if (other.getOnDemandCost() == null ^ this.getOnDemandCost() == null)
            return false;
        if (other.getOnDemandCost() != null
                && other.getOnDemandCost().equals(this.getOnDemandCost()) == false)
            return false;
        return true;
    }
}
