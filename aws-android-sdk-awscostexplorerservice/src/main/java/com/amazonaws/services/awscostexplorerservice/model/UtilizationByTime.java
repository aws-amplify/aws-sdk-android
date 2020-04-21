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
 * The amount of utilization, in hours.
 * </p>
 */
public class UtilizationByTime implements Serializable {
    /**
     * <p>
     * The period of time that this utilization was used for.
     * </p>
     */
    private DateInterval timePeriod;

    /**
     * <p>
     * The groups that this utilization result uses.
     * </p>
     */
    private java.util.List<ReservationUtilizationGroup> groups;

    /**
     * <p>
     * The total number of reservation hours that were used.
     * </p>
     */
    private ReservationAggregates total;

    /**
     * <p>
     * The period of time that this utilization was used for.
     * </p>
     *
     * @return <p>
     *         The period of time that this utilization was used for.
     *         </p>
     */
    public DateInterval getTimePeriod() {
        return timePeriod;
    }

    /**
     * <p>
     * The period of time that this utilization was used for.
     * </p>
     *
     * @param timePeriod <p>
     *            The period of time that this utilization was used for.
     *            </p>
     */
    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The period of time that this utilization was used for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timePeriod <p>
     *            The period of time that this utilization was used for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UtilizationByTime withTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * <p>
     * The groups that this utilization result uses.
     * </p>
     *
     * @return <p>
     *         The groups that this utilization result uses.
     *         </p>
     */
    public java.util.List<ReservationUtilizationGroup> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The groups that this utilization result uses.
     * </p>
     *
     * @param groups <p>
     *            The groups that this utilization result uses.
     *            </p>
     */
    public void setGroups(java.util.Collection<ReservationUtilizationGroup> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<ReservationUtilizationGroup>(groups);
    }

    /**
     * <p>
     * The groups that this utilization result uses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            The groups that this utilization result uses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UtilizationByTime withGroups(ReservationUtilizationGroup... groups) {
        if (getGroups() == null) {
            this.groups = new java.util.ArrayList<ReservationUtilizationGroup>(groups.length);
        }
        for (ReservationUtilizationGroup value : groups) {
            this.groups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The groups that this utilization result uses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groups <p>
     *            The groups that this utilization result uses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UtilizationByTime withGroups(java.util.Collection<ReservationUtilizationGroup> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The total number of reservation hours that were used.
     * </p>
     *
     * @return <p>
     *         The total number of reservation hours that were used.
     *         </p>
     */
    public ReservationAggregates getTotal() {
        return total;
    }

    /**
     * <p>
     * The total number of reservation hours that were used.
     * </p>
     *
     * @param total <p>
     *            The total number of reservation hours that were used.
     *            </p>
     */
    public void setTotal(ReservationAggregates total) {
        this.total = total;
    }

    /**
     * <p>
     * The total number of reservation hours that were used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param total <p>
     *            The total number of reservation hours that were used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UtilizationByTime withTotal(ReservationAggregates total) {
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

        if (obj instanceof UtilizationByTime == false)
            return false;
        UtilizationByTime other = (UtilizationByTime) obj;

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
