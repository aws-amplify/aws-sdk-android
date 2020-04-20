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
 * Details on the modification recommendation.
 * </p>
 */
public class ModifyRecommendationDetail implements Serializable {
    /**
     * <p>
     * Identifies whether this instance type is the Amazon Web Services default
     * recommendation.
     * </p>
     */
    private java.util.List<TargetInstance> targetInstances;

    /**
     * <p>
     * Identifies whether this instance type is the Amazon Web Services default
     * recommendation.
     * </p>
     *
     * @return <p>
     *         Identifies whether this instance type is the Amazon Web Services
     *         default recommendation.
     *         </p>
     */
    public java.util.List<TargetInstance> getTargetInstances() {
        return targetInstances;
    }

    /**
     * <p>
     * Identifies whether this instance type is the Amazon Web Services default
     * recommendation.
     * </p>
     *
     * @param targetInstances <p>
     *            Identifies whether this instance type is the Amazon Web
     *            Services default recommendation.
     *            </p>
     */
    public void setTargetInstances(java.util.Collection<TargetInstance> targetInstances) {
        if (targetInstances == null) {
            this.targetInstances = null;
            return;
        }

        this.targetInstances = new java.util.ArrayList<TargetInstance>(targetInstances);
    }

    /**
     * <p>
     * Identifies whether this instance type is the Amazon Web Services default
     * recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetInstances <p>
     *            Identifies whether this instance type is the Amazon Web
     *            Services default recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyRecommendationDetail withTargetInstances(TargetInstance... targetInstances) {
        if (getTargetInstances() == null) {
            this.targetInstances = new java.util.ArrayList<TargetInstance>(targetInstances.length);
        }
        for (TargetInstance value : targetInstances) {
            this.targetInstances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Identifies whether this instance type is the Amazon Web Services default
     * recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetInstances <p>
     *            Identifies whether this instance type is the Amazon Web
     *            Services default recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyRecommendationDetail withTargetInstances(
            java.util.Collection<TargetInstance> targetInstances) {
        setTargetInstances(targetInstances);
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
        if (getTargetInstances() != null)
            sb.append("TargetInstances: " + getTargetInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTargetInstances() == null) ? 0 : getTargetInstances().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyRecommendationDetail == false)
            return false;
        ModifyRecommendationDetail other = (ModifyRecommendationDetail) obj;

        if (other.getTargetInstances() == null ^ this.getTargetInstances() == null)
            return false;
        if (other.getTargetInstances() != null
                && other.getTargetInstances().equals(this.getTargetInstances()) == false)
            return false;
        return true;
    }
}
