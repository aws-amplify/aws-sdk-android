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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * Status information about the aggregated associations.
 * </p>
 */
public class InstanceAggregatedAssociationOverview implements Serializable {
    /**
     * <p>
     * Detailed status information about the aggregated associations.
     * </p>
     */
    private String detailedStatus;

    /**
     * <p>
     * The number of associations for the instance(s).
     * </p>
     */
    private java.util.Map<String, Integer> instanceAssociationStatusAggregatedCount;

    /**
     * <p>
     * Detailed status information about the aggregated associations.
     * </p>
     *
     * @return <p>
     *         Detailed status information about the aggregated associations.
     *         </p>
     */
    public String getDetailedStatus() {
        return detailedStatus;
    }

    /**
     * <p>
     * Detailed status information about the aggregated associations.
     * </p>
     *
     * @param detailedStatus <p>
     *            Detailed status information about the aggregated associations.
     *            </p>
     */
    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }

    /**
     * <p>
     * Detailed status information about the aggregated associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detailedStatus <p>
     *            Detailed status information about the aggregated associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAggregatedAssociationOverview withDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
        return this;
    }

    /**
     * <p>
     * The number of associations for the instance(s).
     * </p>
     *
     * @return <p>
     *         The number of associations for the instance(s).
     *         </p>
     */
    public java.util.Map<String, Integer> getInstanceAssociationStatusAggregatedCount() {
        return instanceAssociationStatusAggregatedCount;
    }

    /**
     * <p>
     * The number of associations for the instance(s).
     * </p>
     *
     * @param instanceAssociationStatusAggregatedCount <p>
     *            The number of associations for the instance(s).
     *            </p>
     */
    public void setInstanceAssociationStatusAggregatedCount(
            java.util.Map<String, Integer> instanceAssociationStatusAggregatedCount) {
        this.instanceAssociationStatusAggregatedCount = instanceAssociationStatusAggregatedCount;
    }

    /**
     * <p>
     * The number of associations for the instance(s).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceAssociationStatusAggregatedCount <p>
     *            The number of associations for the instance(s).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAggregatedAssociationOverview withInstanceAssociationStatusAggregatedCount(
            java.util.Map<String, Integer> instanceAssociationStatusAggregatedCount) {
        this.instanceAssociationStatusAggregatedCount = instanceAssociationStatusAggregatedCount;
        return this;
    }

    /**
     * <p>
     * The number of associations for the instance(s).
     * </p>
     * <p>
     * The method adds a new key-value pair into
     * InstanceAssociationStatusAggregatedCount parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into
     *            InstanceAssociationStatusAggregatedCount.
     * @param value The corresponding value of the entry to be added into
     *            InstanceAssociationStatusAggregatedCount.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAggregatedAssociationOverview addInstanceAssociationStatusAggregatedCountEntry(
            String key, Integer value) {
        if (null == this.instanceAssociationStatusAggregatedCount) {
            this.instanceAssociationStatusAggregatedCount = new java.util.HashMap<String, Integer>();
        }
        if (this.instanceAssociationStatusAggregatedCount.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.instanceAssociationStatusAggregatedCount.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into
     * InstanceAssociationStatusAggregatedCount.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public InstanceAggregatedAssociationOverview clearInstanceAssociationStatusAggregatedCountEntries() {
        this.instanceAssociationStatusAggregatedCount = null;
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
        if (getDetailedStatus() != null)
            sb.append("DetailedStatus: " + getDetailedStatus() + ",");
        if (getInstanceAssociationStatusAggregatedCount() != null)
            sb.append("InstanceAssociationStatusAggregatedCount: "
                    + getInstanceAssociationStatusAggregatedCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDetailedStatus() == null) ? 0 : getDetailedStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceAssociationStatusAggregatedCount() == null) ? 0
                        : getInstanceAssociationStatusAggregatedCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceAggregatedAssociationOverview == false)
            return false;
        InstanceAggregatedAssociationOverview other = (InstanceAggregatedAssociationOverview) obj;

        if (other.getDetailedStatus() == null ^ this.getDetailedStatus() == null)
            return false;
        if (other.getDetailedStatus() != null
                && other.getDetailedStatus().equals(this.getDetailedStatus()) == false)
            return false;
        if (other.getInstanceAssociationStatusAggregatedCount() == null
                ^ this.getInstanceAssociationStatusAggregatedCount() == null)
            return false;
        if (other.getInstanceAssociationStatusAggregatedCount() != null
                && other.getInstanceAssociationStatusAggregatedCount().equals(
                        this.getInstanceAssociationStatusAggregatedCount()) == false)
            return false;
        return true;
    }
}
