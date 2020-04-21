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
 * The amortized amount of Savings Plans purchased in a specific account during
 * a specific time interval.
 * </p>
 */
public class SavingsPlansAmortizedCommitment implements Serializable {
    /**
     * <p>
     * The amortized amount of your Savings Plans commitment that was purchased
     * with either a <code>Partial</code> or a <code>NoUpfront</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String amortizedRecurringCommitment;

    /**
     * <p>
     * The amortized amount of your Savings Plans commitment that was purchased
     * with an <code>Upfront</code> or <code>PartialUpfront</code> Savings
     * Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String amortizedUpfrontCommitment;

    /**
     * <p>
     * The total amortized amount of your Savings Plans commitment, regardless
     * of your Savings Plans purchase method.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String totalAmortizedCommitment;

    /**
     * <p>
     * The amortized amount of your Savings Plans commitment that was purchased
     * with either a <code>Partial</code> or a <code>NoUpfront</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The amortized amount of your Savings Plans commitment that was
     *         purchased with either a <code>Partial</code> or a
     *         <code>NoUpfront</code>.
     *         </p>
     */
    public String getAmortizedRecurringCommitment() {
        return amortizedRecurringCommitment;
    }

    /**
     * <p>
     * The amortized amount of your Savings Plans commitment that was purchased
     * with either a <code>Partial</code> or a <code>NoUpfront</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param amortizedRecurringCommitment <p>
     *            The amortized amount of your Savings Plans commitment that was
     *            purchased with either a <code>Partial</code> or a
     *            <code>NoUpfront</code>.
     *            </p>
     */
    public void setAmortizedRecurringCommitment(String amortizedRecurringCommitment) {
        this.amortizedRecurringCommitment = amortizedRecurringCommitment;
    }

    /**
     * <p>
     * The amortized amount of your Savings Plans commitment that was purchased
     * with either a <code>Partial</code> or a <code>NoUpfront</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param amortizedRecurringCommitment <p>
     *            The amortized amount of your Savings Plans commitment that was
     *            purchased with either a <code>Partial</code> or a
     *            <code>NoUpfront</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansAmortizedCommitment withAmortizedRecurringCommitment(
            String amortizedRecurringCommitment) {
        this.amortizedRecurringCommitment = amortizedRecurringCommitment;
        return this;
    }

    /**
     * <p>
     * The amortized amount of your Savings Plans commitment that was purchased
     * with an <code>Upfront</code> or <code>PartialUpfront</code> Savings
     * Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The amortized amount of your Savings Plans commitment that was
     *         purchased with an <code>Upfront</code> or
     *         <code>PartialUpfront</code> Savings Plans.
     *         </p>
     */
    public String getAmortizedUpfrontCommitment() {
        return amortizedUpfrontCommitment;
    }

    /**
     * <p>
     * The amortized amount of your Savings Plans commitment that was purchased
     * with an <code>Upfront</code> or <code>PartialUpfront</code> Savings
     * Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param amortizedUpfrontCommitment <p>
     *            The amortized amount of your Savings Plans commitment that was
     *            purchased with an <code>Upfront</code> or
     *            <code>PartialUpfront</code> Savings Plans.
     *            </p>
     */
    public void setAmortizedUpfrontCommitment(String amortizedUpfrontCommitment) {
        this.amortizedUpfrontCommitment = amortizedUpfrontCommitment;
    }

    /**
     * <p>
     * The amortized amount of your Savings Plans commitment that was purchased
     * with an <code>Upfront</code> or <code>PartialUpfront</code> Savings
     * Plans.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param amortizedUpfrontCommitment <p>
     *            The amortized amount of your Savings Plans commitment that was
     *            purchased with an <code>Upfront</code> or
     *            <code>PartialUpfront</code> Savings Plans.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansAmortizedCommitment withAmortizedUpfrontCommitment(
            String amortizedUpfrontCommitment) {
        this.amortizedUpfrontCommitment = amortizedUpfrontCommitment;
        return this;
    }

    /**
     * <p>
     * The total amortized amount of your Savings Plans commitment, regardless
     * of your Savings Plans purchase method.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The total amortized amount of your Savings Plans commitment,
     *         regardless of your Savings Plans purchase method.
     *         </p>
     */
    public String getTotalAmortizedCommitment() {
        return totalAmortizedCommitment;
    }

    /**
     * <p>
     * The total amortized amount of your Savings Plans commitment, regardless
     * of your Savings Plans purchase method.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param totalAmortizedCommitment <p>
     *            The total amortized amount of your Savings Plans commitment,
     *            regardless of your Savings Plans purchase method.
     *            </p>
     */
    public void setTotalAmortizedCommitment(String totalAmortizedCommitment) {
        this.totalAmortizedCommitment = totalAmortizedCommitment;
    }

    /**
     * <p>
     * The total amortized amount of your Savings Plans commitment, regardless
     * of your Savings Plans purchase method.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param totalAmortizedCommitment <p>
     *            The total amortized amount of your Savings Plans commitment,
     *            regardless of your Savings Plans purchase method.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansAmortizedCommitment withTotalAmortizedCommitment(
            String totalAmortizedCommitment) {
        this.totalAmortizedCommitment = totalAmortizedCommitment;
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
        if (getAmortizedRecurringCommitment() != null)
            sb.append("AmortizedRecurringCommitment: " + getAmortizedRecurringCommitment() + ",");
        if (getAmortizedUpfrontCommitment() != null)
            sb.append("AmortizedUpfrontCommitment: " + getAmortizedUpfrontCommitment() + ",");
        if (getTotalAmortizedCommitment() != null)
            sb.append("TotalAmortizedCommitment: " + getTotalAmortizedCommitment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAmortizedRecurringCommitment() == null) ? 0
                        : getAmortizedRecurringCommitment().hashCode());
        hashCode = prime
                * hashCode
                + ((getAmortizedUpfrontCommitment() == null) ? 0 : getAmortizedUpfrontCommitment()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalAmortizedCommitment() == null) ? 0 : getTotalAmortizedCommitment()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansAmortizedCommitment == false)
            return false;
        SavingsPlansAmortizedCommitment other = (SavingsPlansAmortizedCommitment) obj;

        if (other.getAmortizedRecurringCommitment() == null
                ^ this.getAmortizedRecurringCommitment() == null)
            return false;
        if (other.getAmortizedRecurringCommitment() != null
                && other.getAmortizedRecurringCommitment().equals(
                        this.getAmortizedRecurringCommitment()) == false)
            return false;
        if (other.getAmortizedUpfrontCommitment() == null
                ^ this.getAmortizedUpfrontCommitment() == null)
            return false;
        if (other.getAmortizedUpfrontCommitment() != null
                && other.getAmortizedUpfrontCommitment().equals(
                        this.getAmortizedUpfrontCommitment()) == false)
            return false;
        if (other.getTotalAmortizedCommitment() == null
                ^ this.getTotalAmortizedCommitment() == null)
            return false;
        if (other.getTotalAmortizedCommitment() != null
                && other.getTotalAmortizedCommitment().equals(this.getTotalAmortizedCommitment()) == false)
            return false;
        return true;
    }
}
