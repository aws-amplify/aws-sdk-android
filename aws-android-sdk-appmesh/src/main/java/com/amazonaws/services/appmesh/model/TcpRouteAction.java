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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents the action to take if a match is determined.
 * </p>
 */
public class TcpRouteAction implements Serializable {
    /**
     * <p>
     * An object that represents the targets that traffic is routed to when a
     * request matches the route.
     * </p>
     */
    private java.util.List<WeightedTarget> weightedTargets;

    /**
     * <p>
     * An object that represents the targets that traffic is routed to when a
     * request matches the route.
     * </p>
     *
     * @return <p>
     *         An object that represents the targets that traffic is routed to
     *         when a request matches the route.
     *         </p>
     */
    public java.util.List<WeightedTarget> getWeightedTargets() {
        return weightedTargets;
    }

    /**
     * <p>
     * An object that represents the targets that traffic is routed to when a
     * request matches the route.
     * </p>
     *
     * @param weightedTargets <p>
     *            An object that represents the targets that traffic is routed
     *            to when a request matches the route.
     *            </p>
     */
    public void setWeightedTargets(java.util.Collection<WeightedTarget> weightedTargets) {
        if (weightedTargets == null) {
            this.weightedTargets = null;
            return;
        }

        this.weightedTargets = new java.util.ArrayList<WeightedTarget>(weightedTargets);
    }

    /**
     * <p>
     * An object that represents the targets that traffic is routed to when a
     * request matches the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param weightedTargets <p>
     *            An object that represents the targets that traffic is routed
     *            to when a request matches the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TcpRouteAction withWeightedTargets(WeightedTarget... weightedTargets) {
        if (getWeightedTargets() == null) {
            this.weightedTargets = new java.util.ArrayList<WeightedTarget>(weightedTargets.length);
        }
        for (WeightedTarget value : weightedTargets) {
            this.weightedTargets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object that represents the targets that traffic is routed to when a
     * request matches the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param weightedTargets <p>
     *            An object that represents the targets that traffic is routed
     *            to when a request matches the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TcpRouteAction withWeightedTargets(java.util.Collection<WeightedTarget> weightedTargets) {
        setWeightedTargets(weightedTargets);
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
        if (getWeightedTargets() != null)
            sb.append("weightedTargets: " + getWeightedTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWeightedTargets() == null) ? 0 : getWeightedTargets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TcpRouteAction == false)
            return false;
        TcpRouteAction other = (TcpRouteAction) obj;

        if (other.getWeightedTargets() == null ^ this.getWeightedTargets() == null)
            return false;
        if (other.getWeightedTargets() != null
                && other.getWeightedTargets().equals(this.getWeightedTargets()) == false)
            return false;
        return true;
    }
}
