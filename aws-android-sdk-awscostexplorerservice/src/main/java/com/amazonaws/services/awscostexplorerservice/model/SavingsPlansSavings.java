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
 * The amount of savings you're accumulating, against the public On-Demand rate
 * of the usage accrued in an account.
 * </p>
 */
public class SavingsPlansSavings implements Serializable {
    /**
     * <p>
     * The savings amount that you are accumulating for the usage that is
     * covered by a Savings Plans, when compared to the On-Demand equivalent of
     * the same usage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String netSavings;

    /**
     * <p>
     * How much the amount that the usage would have cost if it was accrued at
     * the On-Demand rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String onDemandCostEquivalent;

    /**
     * <p>
     * The savings amount that you are accumulating for the usage that is
     * covered by a Savings Plans, when compared to the On-Demand equivalent of
     * the same usage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The savings amount that you are accumulating for the usage that
     *         is covered by a Savings Plans, when compared to the On-Demand
     *         equivalent of the same usage.
     *         </p>
     */
    public String getNetSavings() {
        return netSavings;
    }

    /**
     * <p>
     * The savings amount that you are accumulating for the usage that is
     * covered by a Savings Plans, when compared to the On-Demand equivalent of
     * the same usage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param netSavings <p>
     *            The savings amount that you are accumulating for the usage
     *            that is covered by a Savings Plans, when compared to the
     *            On-Demand equivalent of the same usage.
     *            </p>
     */
    public void setNetSavings(String netSavings) {
        this.netSavings = netSavings;
    }

    /**
     * <p>
     * The savings amount that you are accumulating for the usage that is
     * covered by a Savings Plans, when compared to the On-Demand equivalent of
     * the same usage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param netSavings <p>
     *            The savings amount that you are accumulating for the usage
     *            that is covered by a Savings Plans, when compared to the
     *            On-Demand equivalent of the same usage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansSavings withNetSavings(String netSavings) {
        this.netSavings = netSavings;
        return this;
    }

    /**
     * <p>
     * How much the amount that the usage would have cost if it was accrued at
     * the On-Demand rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         How much the amount that the usage would have cost if it was
     *         accrued at the On-Demand rate.
     *         </p>
     */
    public String getOnDemandCostEquivalent() {
        return onDemandCostEquivalent;
    }

    /**
     * <p>
     * How much the amount that the usage would have cost if it was accrued at
     * the On-Demand rate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param onDemandCostEquivalent <p>
     *            How much the amount that the usage would have cost if it was
     *            accrued at the On-Demand rate.
     *            </p>
     */
    public void setOnDemandCostEquivalent(String onDemandCostEquivalent) {
        this.onDemandCostEquivalent = onDemandCostEquivalent;
    }

    /**
     * <p>
     * How much the amount that the usage would have cost if it was accrued at
     * the On-Demand rate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param onDemandCostEquivalent <p>
     *            How much the amount that the usage would have cost if it was
     *            accrued at the On-Demand rate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansSavings withOnDemandCostEquivalent(String onDemandCostEquivalent) {
        this.onDemandCostEquivalent = onDemandCostEquivalent;
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
        if (getNetSavings() != null)
            sb.append("NetSavings: " + getNetSavings() + ",");
        if (getOnDemandCostEquivalent() != null)
            sb.append("OnDemandCostEquivalent: " + getOnDemandCostEquivalent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetSavings() == null) ? 0 : getNetSavings().hashCode());
        hashCode = prime
                * hashCode
                + ((getOnDemandCostEquivalent() == null) ? 0 : getOnDemandCostEquivalent()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansSavings == false)
            return false;
        SavingsPlansSavings other = (SavingsPlansSavings) obj;

        if (other.getNetSavings() == null ^ this.getNetSavings() == null)
            return false;
        if (other.getNetSavings() != null
                && other.getNetSavings().equals(this.getNetSavings()) == false)
            return false;
        if (other.getOnDemandCostEquivalent() == null ^ this.getOnDemandCostEquivalent() == null)
            return false;
        if (other.getOnDemandCostEquivalent() != null
                && other.getOnDemandCostEquivalent().equals(this.getOnDemandCostEquivalent()) == false)
            return false;
        return true;
    }
}
