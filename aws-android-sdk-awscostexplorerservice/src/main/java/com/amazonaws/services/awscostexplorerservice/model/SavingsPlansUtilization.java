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
 * The measurement of how well you are using your existing Savings Plans.
 * </p>
 */
public class SavingsPlansUtilization implements Serializable {
    /**
     * <p>
     * The total amount of Savings Plans commitment that's been purchased in an
     * account (or set of accounts).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String totalCommitment;

    /**
     * <p>
     * The amount of your Savings Plans commitment that was consumed from
     * Savings Plans eligible usage in a specific period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String usedCommitment;

    /**
     * <p>
     * The amount of your Savings Plans commitment that was not consumed from
     * Savings Plans eligible usage in a specific period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String unusedCommitment;

    /**
     * <p>
     * The amount of <code>UsedCommitment</code> divided by the
     * <code>TotalCommitment</code> for your Savings Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String utilizationPercentage;

    /**
     * <p>
     * The total amount of Savings Plans commitment that's been purchased in an
     * account (or set of accounts).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The total amount of Savings Plans commitment that's been
     *         purchased in an account (or set of accounts).
     *         </p>
     */
    public String getTotalCommitment() {
        return totalCommitment;
    }

    /**
     * <p>
     * The total amount of Savings Plans commitment that's been purchased in an
     * account (or set of accounts).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param totalCommitment <p>
     *            The total amount of Savings Plans commitment that's been
     *            purchased in an account (or set of accounts).
     *            </p>
     */
    public void setTotalCommitment(String totalCommitment) {
        this.totalCommitment = totalCommitment;
    }

    /**
     * <p>
     * The total amount of Savings Plans commitment that's been purchased in an
     * account (or set of accounts).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param totalCommitment <p>
     *            The total amount of Savings Plans commitment that's been
     *            purchased in an account (or set of accounts).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansUtilization withTotalCommitment(String totalCommitment) {
        this.totalCommitment = totalCommitment;
        return this;
    }

    /**
     * <p>
     * The amount of your Savings Plans commitment that was consumed from
     * Savings Plans eligible usage in a specific period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The amount of your Savings Plans commitment that was consumed
     *         from Savings Plans eligible usage in a specific period.
     *         </p>
     */
    public String getUsedCommitment() {
        return usedCommitment;
    }

    /**
     * <p>
     * The amount of your Savings Plans commitment that was consumed from
     * Savings Plans eligible usage in a specific period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param usedCommitment <p>
     *            The amount of your Savings Plans commitment that was consumed
     *            from Savings Plans eligible usage in a specific period.
     *            </p>
     */
    public void setUsedCommitment(String usedCommitment) {
        this.usedCommitment = usedCommitment;
    }

    /**
     * <p>
     * The amount of your Savings Plans commitment that was consumed from
     * Savings Plans eligible usage in a specific period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param usedCommitment <p>
     *            The amount of your Savings Plans commitment that was consumed
     *            from Savings Plans eligible usage in a specific period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansUtilization withUsedCommitment(String usedCommitment) {
        this.usedCommitment = usedCommitment;
        return this;
    }

    /**
     * <p>
     * The amount of your Savings Plans commitment that was not consumed from
     * Savings Plans eligible usage in a specific period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The amount of your Savings Plans commitment that was not consumed
     *         from Savings Plans eligible usage in a specific period.
     *         </p>
     */
    public String getUnusedCommitment() {
        return unusedCommitment;
    }

    /**
     * <p>
     * The amount of your Savings Plans commitment that was not consumed from
     * Savings Plans eligible usage in a specific period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param unusedCommitment <p>
     *            The amount of your Savings Plans commitment that was not
     *            consumed from Savings Plans eligible usage in a specific
     *            period.
     *            </p>
     */
    public void setUnusedCommitment(String unusedCommitment) {
        this.unusedCommitment = unusedCommitment;
    }

    /**
     * <p>
     * The amount of your Savings Plans commitment that was not consumed from
     * Savings Plans eligible usage in a specific period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param unusedCommitment <p>
     *            The amount of your Savings Plans commitment that was not
     *            consumed from Savings Plans eligible usage in a specific
     *            period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansUtilization withUnusedCommitment(String unusedCommitment) {
        this.unusedCommitment = unusedCommitment;
        return this;
    }

    /**
     * <p>
     * The amount of <code>UsedCommitment</code> divided by the
     * <code>TotalCommitment</code> for your Savings Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The amount of <code>UsedCommitment</code> divided by the
     *         <code>TotalCommitment</code> for your Savings Plans.
     *         </p>
     */
    public String getUtilizationPercentage() {
        return utilizationPercentage;
    }

    /**
     * <p>
     * The amount of <code>UsedCommitment</code> divided by the
     * <code>TotalCommitment</code> for your Savings Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param utilizationPercentage <p>
     *            The amount of <code>UsedCommitment</code> divided by the
     *            <code>TotalCommitment</code> for your Savings Plans.
     *            </p>
     */
    public void setUtilizationPercentage(String utilizationPercentage) {
        this.utilizationPercentage = utilizationPercentage;
    }

    /**
     * <p>
     * The amount of <code>UsedCommitment</code> divided by the
     * <code>TotalCommitment</code> for your Savings Plans.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param utilizationPercentage <p>
     *            The amount of <code>UsedCommitment</code> divided by the
     *            <code>TotalCommitment</code> for your Savings Plans.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansUtilization withUtilizationPercentage(String utilizationPercentage) {
        this.utilizationPercentage = utilizationPercentage;
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
        if (getTotalCommitment() != null)
            sb.append("TotalCommitment: " + getTotalCommitment() + ",");
        if (getUsedCommitment() != null)
            sb.append("UsedCommitment: " + getUsedCommitment() + ",");
        if (getUnusedCommitment() != null)
            sb.append("UnusedCommitment: " + getUnusedCommitment() + ",");
        if (getUtilizationPercentage() != null)
            sb.append("UtilizationPercentage: " + getUtilizationPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTotalCommitment() == null) ? 0 : getTotalCommitment().hashCode());
        hashCode = prime * hashCode
                + ((getUsedCommitment() == null) ? 0 : getUsedCommitment().hashCode());
        hashCode = prime * hashCode
                + ((getUnusedCommitment() == null) ? 0 : getUnusedCommitment().hashCode());
        hashCode = prime
                * hashCode
                + ((getUtilizationPercentage() == null) ? 0 : getUtilizationPercentage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansUtilization == false)
            return false;
        SavingsPlansUtilization other = (SavingsPlansUtilization) obj;

        if (other.getTotalCommitment() == null ^ this.getTotalCommitment() == null)
            return false;
        if (other.getTotalCommitment() != null
                && other.getTotalCommitment().equals(this.getTotalCommitment()) == false)
            return false;
        if (other.getUsedCommitment() == null ^ this.getUsedCommitment() == null)
            return false;
        if (other.getUsedCommitment() != null
                && other.getUsedCommitment().equals(this.getUsedCommitment()) == false)
            return false;
        if (other.getUnusedCommitment() == null ^ this.getUnusedCommitment() == null)
            return false;
        if (other.getUnusedCommitment() != null
                && other.getUnusedCommitment().equals(this.getUnusedCommitment()) == false)
            return false;
        if (other.getUtilizationPercentage() == null ^ this.getUtilizationPercentage() == null)
            return false;
        if (other.getUtilizationPercentage() != null
                && other.getUtilizationPercentage().equals(this.getUtilizationPercentage()) == false)
            return false;
        return true;
    }
}
