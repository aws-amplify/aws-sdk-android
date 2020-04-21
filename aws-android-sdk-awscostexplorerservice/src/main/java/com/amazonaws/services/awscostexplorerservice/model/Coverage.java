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
 * The amount of instance usage that a reservation covered.
 * </p>
 */
public class Coverage implements Serializable {
    /**
     * <p>
     * The amount of instance usage that the reservation covered, in hours.
     * </p>
     */
    private CoverageHours coverageHours;

    /**
     * <p>
     * The amount of instance usage that the reservation covered, in normalized
     * units.
     * </p>
     */
    private CoverageNormalizedUnits coverageNormalizedUnits;

    /**
     * <p>
     * The amount of cost that the reservation covered.
     * </p>
     */
    private CoverageCost coverageCost;

    /**
     * <p>
     * The amount of instance usage that the reservation covered, in hours.
     * </p>
     *
     * @return <p>
     *         The amount of instance usage that the reservation covered, in
     *         hours.
     *         </p>
     */
    public CoverageHours getCoverageHours() {
        return coverageHours;
    }

    /**
     * <p>
     * The amount of instance usage that the reservation covered, in hours.
     * </p>
     *
     * @param coverageHours <p>
     *            The amount of instance usage that the reservation covered, in
     *            hours.
     *            </p>
     */
    public void setCoverageHours(CoverageHours coverageHours) {
        this.coverageHours = coverageHours;
    }

    /**
     * <p>
     * The amount of instance usage that the reservation covered, in hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coverageHours <p>
     *            The amount of instance usage that the reservation covered, in
     *            hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Coverage withCoverageHours(CoverageHours coverageHours) {
        this.coverageHours = coverageHours;
        return this;
    }

    /**
     * <p>
     * The amount of instance usage that the reservation covered, in normalized
     * units.
     * </p>
     *
     * @return <p>
     *         The amount of instance usage that the reservation covered, in
     *         normalized units.
     *         </p>
     */
    public CoverageNormalizedUnits getCoverageNormalizedUnits() {
        return coverageNormalizedUnits;
    }

    /**
     * <p>
     * The amount of instance usage that the reservation covered, in normalized
     * units.
     * </p>
     *
     * @param coverageNormalizedUnits <p>
     *            The amount of instance usage that the reservation covered, in
     *            normalized units.
     *            </p>
     */
    public void setCoverageNormalizedUnits(CoverageNormalizedUnits coverageNormalizedUnits) {
        this.coverageNormalizedUnits = coverageNormalizedUnits;
    }

    /**
     * <p>
     * The amount of instance usage that the reservation covered, in normalized
     * units.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coverageNormalizedUnits <p>
     *            The amount of instance usage that the reservation covered, in
     *            normalized units.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Coverage withCoverageNormalizedUnits(CoverageNormalizedUnits coverageNormalizedUnits) {
        this.coverageNormalizedUnits = coverageNormalizedUnits;
        return this;
    }

    /**
     * <p>
     * The amount of cost that the reservation covered.
     * </p>
     *
     * @return <p>
     *         The amount of cost that the reservation covered.
     *         </p>
     */
    public CoverageCost getCoverageCost() {
        return coverageCost;
    }

    /**
     * <p>
     * The amount of cost that the reservation covered.
     * </p>
     *
     * @param coverageCost <p>
     *            The amount of cost that the reservation covered.
     *            </p>
     */
    public void setCoverageCost(CoverageCost coverageCost) {
        this.coverageCost = coverageCost;
    }

    /**
     * <p>
     * The amount of cost that the reservation covered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coverageCost <p>
     *            The amount of cost that the reservation covered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Coverage withCoverageCost(CoverageCost coverageCost) {
        this.coverageCost = coverageCost;
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
        if (getCoverageHours() != null)
            sb.append("CoverageHours: " + getCoverageHours() + ",");
        if (getCoverageNormalizedUnits() != null)
            sb.append("CoverageNormalizedUnits: " + getCoverageNormalizedUnits() + ",");
        if (getCoverageCost() != null)
            sb.append("CoverageCost: " + getCoverageCost());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCoverageHours() == null) ? 0 : getCoverageHours().hashCode());
        hashCode = prime
                * hashCode
                + ((getCoverageNormalizedUnits() == null) ? 0 : getCoverageNormalizedUnits()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCoverageCost() == null) ? 0 : getCoverageCost().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Coverage == false)
            return false;
        Coverage other = (Coverage) obj;

        if (other.getCoverageHours() == null ^ this.getCoverageHours() == null)
            return false;
        if (other.getCoverageHours() != null
                && other.getCoverageHours().equals(this.getCoverageHours()) == false)
            return false;
        if (other.getCoverageNormalizedUnits() == null ^ this.getCoverageNormalizedUnits() == null)
            return false;
        if (other.getCoverageNormalizedUnits() != null
                && other.getCoverageNormalizedUnits().equals(this.getCoverageNormalizedUnits()) == false)
            return false;
        if (other.getCoverageCost() == null ^ this.getCoverageCost() == null)
            return false;
        if (other.getCoverageCost() != null
                && other.getCoverageCost().equals(this.getCoverageCost()) == false)
            return false;
        return true;
    }
}
