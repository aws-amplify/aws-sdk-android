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
 * How long a running instance either used a reservation or was On-Demand.
 * </p>
 */
public class CoverageHours implements Serializable {
    /**
     * <p>
     * The number of instance running hours that On-Demand Instances covered.
     * </p>
     */
    private String onDemandHours;

    /**
     * <p>
     * The number of instance running hours that reservations covered.
     * </p>
     */
    private String reservedHours;

    /**
     * <p>
     * The total instance usage, in hours.
     * </p>
     */
    private String totalRunningHours;

    /**
     * <p>
     * The percentage of instance hours that a reservation covered.
     * </p>
     */
    private String coverageHoursPercentage;

    /**
     * <p>
     * The number of instance running hours that On-Demand Instances covered.
     * </p>
     *
     * @return <p>
     *         The number of instance running hours that On-Demand Instances
     *         covered.
     *         </p>
     */
    public String getOnDemandHours() {
        return onDemandHours;
    }

    /**
     * <p>
     * The number of instance running hours that On-Demand Instances covered.
     * </p>
     *
     * @param onDemandHours <p>
     *            The number of instance running hours that On-Demand Instances
     *            covered.
     *            </p>
     */
    public void setOnDemandHours(String onDemandHours) {
        this.onDemandHours = onDemandHours;
    }

    /**
     * <p>
     * The number of instance running hours that On-Demand Instances covered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onDemandHours <p>
     *            The number of instance running hours that On-Demand Instances
     *            covered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoverageHours withOnDemandHours(String onDemandHours) {
        this.onDemandHours = onDemandHours;
        return this;
    }

    /**
     * <p>
     * The number of instance running hours that reservations covered.
     * </p>
     *
     * @return <p>
     *         The number of instance running hours that reservations covered.
     *         </p>
     */
    public String getReservedHours() {
        return reservedHours;
    }

    /**
     * <p>
     * The number of instance running hours that reservations covered.
     * </p>
     *
     * @param reservedHours <p>
     *            The number of instance running hours that reservations
     *            covered.
     *            </p>
     */
    public void setReservedHours(String reservedHours) {
        this.reservedHours = reservedHours;
    }

    /**
     * <p>
     * The number of instance running hours that reservations covered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedHours <p>
     *            The number of instance running hours that reservations
     *            covered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoverageHours withReservedHours(String reservedHours) {
        this.reservedHours = reservedHours;
        return this;
    }

    /**
     * <p>
     * The total instance usage, in hours.
     * </p>
     *
     * @return <p>
     *         The total instance usage, in hours.
     *         </p>
     */
    public String getTotalRunningHours() {
        return totalRunningHours;
    }

    /**
     * <p>
     * The total instance usage, in hours.
     * </p>
     *
     * @param totalRunningHours <p>
     *            The total instance usage, in hours.
     *            </p>
     */
    public void setTotalRunningHours(String totalRunningHours) {
        this.totalRunningHours = totalRunningHours;
    }

    /**
     * <p>
     * The total instance usage, in hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalRunningHours <p>
     *            The total instance usage, in hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoverageHours withTotalRunningHours(String totalRunningHours) {
        this.totalRunningHours = totalRunningHours;
        return this;
    }

    /**
     * <p>
     * The percentage of instance hours that a reservation covered.
     * </p>
     *
     * @return <p>
     *         The percentage of instance hours that a reservation covered.
     *         </p>
     */
    public String getCoverageHoursPercentage() {
        return coverageHoursPercentage;
    }

    /**
     * <p>
     * The percentage of instance hours that a reservation covered.
     * </p>
     *
     * @param coverageHoursPercentage <p>
     *            The percentage of instance hours that a reservation covered.
     *            </p>
     */
    public void setCoverageHoursPercentage(String coverageHoursPercentage) {
        this.coverageHoursPercentage = coverageHoursPercentage;
    }

    /**
     * <p>
     * The percentage of instance hours that a reservation covered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coverageHoursPercentage <p>
     *            The percentage of instance hours that a reservation covered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoverageHours withCoverageHoursPercentage(String coverageHoursPercentage) {
        this.coverageHoursPercentage = coverageHoursPercentage;
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
        if (getOnDemandHours() != null)
            sb.append("OnDemandHours: " + getOnDemandHours() + ",");
        if (getReservedHours() != null)
            sb.append("ReservedHours: " + getReservedHours() + ",");
        if (getTotalRunningHours() != null)
            sb.append("TotalRunningHours: " + getTotalRunningHours() + ",");
        if (getCoverageHoursPercentage() != null)
            sb.append("CoverageHoursPercentage: " + getCoverageHoursPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOnDemandHours() == null) ? 0 : getOnDemandHours().hashCode());
        hashCode = prime * hashCode
                + ((getReservedHours() == null) ? 0 : getReservedHours().hashCode());
        hashCode = prime * hashCode
                + ((getTotalRunningHours() == null) ? 0 : getTotalRunningHours().hashCode());
        hashCode = prime
                * hashCode
                + ((getCoverageHoursPercentage() == null) ? 0 : getCoverageHoursPercentage()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoverageHours == false)
            return false;
        CoverageHours other = (CoverageHours) obj;

        if (other.getOnDemandHours() == null ^ this.getOnDemandHours() == null)
            return false;
        if (other.getOnDemandHours() != null
                && other.getOnDemandHours().equals(this.getOnDemandHours()) == false)
            return false;
        if (other.getReservedHours() == null ^ this.getReservedHours() == null)
            return false;
        if (other.getReservedHours() != null
                && other.getReservedHours().equals(this.getReservedHours()) == false)
            return false;
        if (other.getTotalRunningHours() == null ^ this.getTotalRunningHours() == null)
            return false;
        if (other.getTotalRunningHours() != null
                && other.getTotalRunningHours().equals(this.getTotalRunningHours()) == false)
            return false;
        if (other.getCoverageHoursPercentage() == null ^ this.getCoverageHoursPercentage() == null)
            return false;
        if (other.getCoverageHoursPercentage() != null
                && other.getCoverageHoursPercentage().equals(this.getCoverageHoursPercentage()) == false)
            return false;
        return true;
    }
}
