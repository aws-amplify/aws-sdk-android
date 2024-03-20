/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * The distribution of traffic between the instance and its replicas.
 * </p>
 */
public class TelephonyConfig implements Serializable {
    /**
     * <p>
     * Information about traffic distributions.
     * </p>
     */
    private java.util.List<Distribution> distributions;

    /**
     * <p>
     * Information about traffic distributions.
     * </p>
     *
     * @return <p>
     *         Information about traffic distributions.
     *         </p>
     */
    public java.util.List<Distribution> getDistributions() {
        return distributions;
    }

    /**
     * <p>
     * Information about traffic distributions.
     * </p>
     *
     * @param distributions <p>
     *            Information about traffic distributions.
     *            </p>
     */
    public void setDistributions(java.util.Collection<Distribution> distributions) {
        if (distributions == null) {
            this.distributions = null;
            return;
        }

        this.distributions = new java.util.ArrayList<Distribution>(distributions);
    }

    /**
     * <p>
     * Information about traffic distributions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param distributions <p>
     *            Information about traffic distributions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TelephonyConfig withDistributions(Distribution... distributions) {
        if (getDistributions() == null) {
            this.distributions = new java.util.ArrayList<Distribution>(distributions.length);
        }
        for (Distribution value : distributions) {
            this.distributions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about traffic distributions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param distributions <p>
     *            Information about traffic distributions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TelephonyConfig withDistributions(java.util.Collection<Distribution> distributions) {
        setDistributions(distributions);
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
        if (getDistributions() != null)
            sb.append("Distributions: " + getDistributions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDistributions() == null) ? 0 : getDistributions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TelephonyConfig == false)
            return false;
        TelephonyConfig other = (TelephonyConfig) obj;

        if (other.getDistributions() == null ^ this.getDistributions() == null)
            return false;
        if (other.getDistributions() != null
                && other.getDistributions().equals(this.getDistributions()) == false)
            return false;
        return true;
    }
}
