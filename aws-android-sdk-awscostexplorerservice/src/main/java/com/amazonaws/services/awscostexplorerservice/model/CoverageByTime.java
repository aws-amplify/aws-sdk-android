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
 * Reservation coverage for a specified period, in hours.
 * </p>
 */
public class CoverageByTime implements Serializable {
    /**
     * <p>
     * The period that this coverage was used over.
     * </p>
     */
    private DateInterval timePeriod;

    /**
     * <p>
     * The groups of instances that the reservation covered.
     * </p>
     */
    private java.util.List<ReservationCoverageGroup> groups;

    /**
     * <p>
     * The total reservation coverage, in hours.
     * </p>
     */
    private Coverage total;

    /**
     * <p>
     * The period that this coverage was used over.
     * </p>
     *
     * @return <p>
     *         The period that this coverage was used over.
     *         </p>
     */
    public DateInterval getTimePeriod() {
        return timePeriod;
    }

    /**
     * <p>
     * The period that this coverage was used over.
     * </p>
     *
     * @param timePeriod <p>
     *            The period that this coverage was used over.
     *            </p>
     */
    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The period that this coverage was used over.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timePeriod <p>
     *            The period that this coverage was used over.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoverageByTime withTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * <p>
     * The groups of instances that the reservation covered.
     * </p>
     *
     * @return <p>
     *         The groups of instances that the reservation covered.
     *         </p>
     */
    public java.util.List<ReservationCoverageGroup> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The groups of instances that the reservation covered.
     * </p>
     *
     * @param groups <p>
     *            The groups of instances that the reservation covered.
     *            </p>
     */
    public void setGroups(java.util.Collection<ReservationCoverageGroup> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<ReservationCoverageGroup>(groups);
    }

    /**
     * <p>
     * The groups of instances that the reservation covered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            The groups of instances that the reservation covered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoverageByTime withGroups(ReservationCoverageGroup... groups) {
        if (getGroups() == null) {
            this.groups = new java.util.ArrayList<ReservationCoverageGroup>(groups.length);
        }
        for (ReservationCoverageGroup value : groups) {
            this.groups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The groups of instances that the reservation covered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            The groups of instances that the reservation covered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoverageByTime withGroups(java.util.Collection<ReservationCoverageGroup> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The total reservation coverage, in hours.
     * </p>
     *
     * @return <p>
     *         The total reservation coverage, in hours.
     *         </p>
     */
    public Coverage getTotal() {
        return total;
    }

    /**
     * <p>
     * The total reservation coverage, in hours.
     * </p>
     *
     * @param total <p>
     *            The total reservation coverage, in hours.
     *            </p>
     */
    public void setTotal(Coverage total) {
        this.total = total;
    }

    /**
     * <p>
     * The total reservation coverage, in hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param total <p>
     *            The total reservation coverage, in hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoverageByTime withTotal(Coverage total) {
        this.total = total;
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
        if (getTimePeriod() != null)
            sb.append("TimePeriod: " + getTimePeriod() + ",");
        if (getGroups() != null)
            sb.append("Groups: " + getGroups() + ",");
        if (getTotal() != null)
            sb.append("Total: " + getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoverageByTime == false)
            return false;
        CoverageByTime other = (CoverageByTime) obj;

        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null
                && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }
}
