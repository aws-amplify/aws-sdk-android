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
 * The amount of instance usage, in normalized units. Normalized units enable
 * you to see your EC2 usage for multiple sizes of instances in a uniform way.
 * For example, suppose you run an xlarge instance and a 2xlarge instance. If
 * you run both instances for the same amount of time, the 2xlarge instance uses
 * twice as much of your reservation as the xlarge instance, even though both
 * instances show only one instance-hour. Using normalized units instead of
 * instance-hours, the xlarge instance used 8 normalized units, and the 2xlarge
 * instance used 16 normalized units.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-modifying.html"
 * >Modifying Reserved Instances</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide for Linux Instances</i>.
 * </p>
 */
public class CoverageNormalizedUnits implements Serializable {
    /**
     * <p>
     * The number of normalized units that are covered by On-Demand Instances
     * instead of a reservation.
     * </p>
     */
    private String onDemandNormalizedUnits;

    /**
     * <p>
     * The number of normalized units that a reservation covers.
     * </p>
     */
    private String reservedNormalizedUnits;

    /**
     * <p>
     * The total number of normalized units that you used.
     * </p>
     */
    private String totalRunningNormalizedUnits;

    /**
     * <p>
     * The percentage of your used instance normalized units that a reservation
     * covers.
     * </p>
     */
    private String coverageNormalizedUnitsPercentage;

    /**
     * <p>
     * The number of normalized units that are covered by On-Demand Instances
     * instead of a reservation.
     * </p>
     *
     * @return <p>
     *         The number of normalized units that are covered by On-Demand
     *         Instances instead of a reservation.
     *         </p>
     */
    public String getOnDemandNormalizedUnits() {
        return onDemandNormalizedUnits;
    }

    /**
     * <p>
     * The number of normalized units that are covered by On-Demand Instances
     * instead of a reservation.
     * </p>
     *
     * @param onDemandNormalizedUnits <p>
     *            The number of normalized units that are covered by On-Demand
     *            Instances instead of a reservation.
     *            </p>
     */
    public void setOnDemandNormalizedUnits(String onDemandNormalizedUnits) {
        this.onDemandNormalizedUnits = onDemandNormalizedUnits;
    }

    /**
     * <p>
     * The number of normalized units that are covered by On-Demand Instances
     * instead of a reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onDemandNormalizedUnits <p>
     *            The number of normalized units that are covered by On-Demand
     *            Instances instead of a reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoverageNormalizedUnits withOnDemandNormalizedUnits(String onDemandNormalizedUnits) {
        this.onDemandNormalizedUnits = onDemandNormalizedUnits;
        return this;
    }

    /**
     * <p>
     * The number of normalized units that a reservation covers.
     * </p>
     *
     * @return <p>
     *         The number of normalized units that a reservation covers.
     *         </p>
     */
    public String getReservedNormalizedUnits() {
        return reservedNormalizedUnits;
    }

    /**
     * <p>
     * The number of normalized units that a reservation covers.
     * </p>
     *
     * @param reservedNormalizedUnits <p>
     *            The number of normalized units that a reservation covers.
     *            </p>
     */
    public void setReservedNormalizedUnits(String reservedNormalizedUnits) {
        this.reservedNormalizedUnits = reservedNormalizedUnits;
    }

    /**
     * <p>
     * The number of normalized units that a reservation covers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedNormalizedUnits <p>
     *            The number of normalized units that a reservation covers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoverageNormalizedUnits withReservedNormalizedUnits(String reservedNormalizedUnits) {
        this.reservedNormalizedUnits = reservedNormalizedUnits;
        return this;
    }

    /**
     * <p>
     * The total number of normalized units that you used.
     * </p>
     *
     * @return <p>
     *         The total number of normalized units that you used.
     *         </p>
     */
    public String getTotalRunningNormalizedUnits() {
        return totalRunningNormalizedUnits;
    }

    /**
     * <p>
     * The total number of normalized units that you used.
     * </p>
     *
     * @param totalRunningNormalizedUnits <p>
     *            The total number of normalized units that you used.
     *            </p>
     */
    public void setTotalRunningNormalizedUnits(String totalRunningNormalizedUnits) {
        this.totalRunningNormalizedUnits = totalRunningNormalizedUnits;
    }

    /**
     * <p>
     * The total number of normalized units that you used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalRunningNormalizedUnits <p>
     *            The total number of normalized units that you used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoverageNormalizedUnits withTotalRunningNormalizedUnits(
            String totalRunningNormalizedUnits) {
        this.totalRunningNormalizedUnits = totalRunningNormalizedUnits;
        return this;
    }

    /**
     * <p>
     * The percentage of your used instance normalized units that a reservation
     * covers.
     * </p>
     *
     * @return <p>
     *         The percentage of your used instance normalized units that a
     *         reservation covers.
     *         </p>
     */
    public String getCoverageNormalizedUnitsPercentage() {
        return coverageNormalizedUnitsPercentage;
    }

    /**
     * <p>
     * The percentage of your used instance normalized units that a reservation
     * covers.
     * </p>
     *
     * @param coverageNormalizedUnitsPercentage <p>
     *            The percentage of your used instance normalized units that a
     *            reservation covers.
     *            </p>
     */
    public void setCoverageNormalizedUnitsPercentage(String coverageNormalizedUnitsPercentage) {
        this.coverageNormalizedUnitsPercentage = coverageNormalizedUnitsPercentage;
    }

    /**
     * <p>
     * The percentage of your used instance normalized units that a reservation
     * covers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coverageNormalizedUnitsPercentage <p>
     *            The percentage of your used instance normalized units that a
     *            reservation covers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoverageNormalizedUnits withCoverageNormalizedUnitsPercentage(
            String coverageNormalizedUnitsPercentage) {
        this.coverageNormalizedUnitsPercentage = coverageNormalizedUnitsPercentage;
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
        if (getOnDemandNormalizedUnits() != null)
            sb.append("OnDemandNormalizedUnits: " + getOnDemandNormalizedUnits() + ",");
        if (getReservedNormalizedUnits() != null)
            sb.append("ReservedNormalizedUnits: " + getReservedNormalizedUnits() + ",");
        if (getTotalRunningNormalizedUnits() != null)
            sb.append("TotalRunningNormalizedUnits: " + getTotalRunningNormalizedUnits() + ",");
        if (getCoverageNormalizedUnitsPercentage() != null)
            sb.append("CoverageNormalizedUnitsPercentage: "
                    + getCoverageNormalizedUnitsPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getOnDemandNormalizedUnits() == null) ? 0 : getOnDemandNormalizedUnits()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedNormalizedUnits() == null) ? 0 : getReservedNormalizedUnits()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalRunningNormalizedUnits() == null) ? 0
                        : getTotalRunningNormalizedUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getCoverageNormalizedUnitsPercentage() == null) ? 0
                        : getCoverageNormalizedUnitsPercentage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoverageNormalizedUnits == false)
            return false;
        CoverageNormalizedUnits other = (CoverageNormalizedUnits) obj;

        if (other.getOnDemandNormalizedUnits() == null ^ this.getOnDemandNormalizedUnits() == null)
            return false;
        if (other.getOnDemandNormalizedUnits() != null
                && other.getOnDemandNormalizedUnits().equals(this.getOnDemandNormalizedUnits()) == false)
            return false;
        if (other.getReservedNormalizedUnits() == null ^ this.getReservedNormalizedUnits() == null)
            return false;
        if (other.getReservedNormalizedUnits() != null
                && other.getReservedNormalizedUnits().equals(this.getReservedNormalizedUnits()) == false)
            return false;
        if (other.getTotalRunningNormalizedUnits() == null
                ^ this.getTotalRunningNormalizedUnits() == null)
            return false;
        if (other.getTotalRunningNormalizedUnits() != null
                && other.getTotalRunningNormalizedUnits().equals(
                        this.getTotalRunningNormalizedUnits()) == false)
            return false;
        if (other.getCoverageNormalizedUnitsPercentage() == null
                ^ this.getCoverageNormalizedUnitsPercentage() == null)
            return false;
        if (other.getCoverageNormalizedUnitsPercentage() != null
                && other.getCoverageNormalizedUnitsPercentage().equals(
                        this.getCoverageNormalizedUnitsPercentage()) == false)
            return false;
        return true;
    }
}
