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

package com.amazonaws.services.dynamodb.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the details for the read/write capacity mode.
 * </p>
 */
public class BillingModeSummary implements Serializable {
    /**
     * <p>
     * Controls how you are charged for read and write throughput and how you
     * manage capacity. This setting can be changed later.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code> - Sets the read/write capacity mode to
     * <code>PROVISIONED</code>. We recommend using <code>PROVISIONED</code> for
     * predictable workloads.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to
     * <code>PAY_PER_REQUEST</code>. We recommend using
     * <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PAY_PER_REQUEST
     */
    private String billingMode;

    /**
     * <p>
     * Represents the time when <code>PAY_PER_REQUEST</code> was last set as the
     * read/write capacity mode.
     * </p>
     */
    private java.util.Date lastUpdateToPayPerRequestDateTime;

    /**
     * <p>
     * Controls how you are charged for read and write throughput and how you
     * manage capacity. This setting can be changed later.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code> - Sets the read/write capacity mode to
     * <code>PROVISIONED</code>. We recommend using <code>PROVISIONED</code> for
     * predictable workloads.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to
     * <code>PAY_PER_REQUEST</code>. We recommend using
     * <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PAY_PER_REQUEST
     *
     * @return <p>
     *         Controls how you are charged for read and write throughput and
     *         how you manage capacity. This setting can be changed later.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PROVISIONED</code> - Sets the read/write capacity mode to
     *         <code>PROVISIONED</code>. We recommend using
     *         <code>PROVISIONED</code> for predictable workloads.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode
     *         to <code>PAY_PER_REQUEST</code>. We recommend using
     *         <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     *         </p>
     *         </li>
     *         </ul>
     * @see BillingMode
     */
    public String getBillingMode() {
        return billingMode;
    }

    /**
     * <p>
     * Controls how you are charged for read and write throughput and how you
     * manage capacity. This setting can be changed later.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code> - Sets the read/write capacity mode to
     * <code>PROVISIONED</code>. We recommend using <code>PROVISIONED</code> for
     * predictable workloads.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to
     * <code>PAY_PER_REQUEST</code>. We recommend using
     * <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PAY_PER_REQUEST
     *
     * @param billingMode <p>
     *            Controls how you are charged for read and write throughput and
     *            how you manage capacity. This setting can be changed later.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PROVISIONED</code> - Sets the read/write capacity mode
     *            to <code>PROVISIONED</code>. We recommend using
     *            <code>PROVISIONED</code> for predictable workloads.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PAY_PER_REQUEST</code> - Sets the read/write capacity
     *            mode to <code>PAY_PER_REQUEST</code>. We recommend using
     *            <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     *            </p>
     *            </li>
     *            </ul>
     * @see BillingMode
     */
    public void setBillingMode(String billingMode) {
        this.billingMode = billingMode;
    }

    /**
     * <p>
     * Controls how you are charged for read and write throughput and how you
     * manage capacity. This setting can be changed later.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code> - Sets the read/write capacity mode to
     * <code>PROVISIONED</code>. We recommend using <code>PROVISIONED</code> for
     * predictable workloads.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to
     * <code>PAY_PER_REQUEST</code>. We recommend using
     * <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PAY_PER_REQUEST
     *
     * @param billingMode <p>
     *            Controls how you are charged for read and write throughput and
     *            how you manage capacity. This setting can be changed later.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PROVISIONED</code> - Sets the read/write capacity mode
     *            to <code>PROVISIONED</code>. We recommend using
     *            <code>PROVISIONED</code> for predictable workloads.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PAY_PER_REQUEST</code> - Sets the read/write capacity
     *            mode to <code>PAY_PER_REQUEST</code>. We recommend using
     *            <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BillingMode
     */
    public BillingModeSummary withBillingMode(String billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    /**
     * <p>
     * Controls how you are charged for read and write throughput and how you
     * manage capacity. This setting can be changed later.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code> - Sets the read/write capacity mode to
     * <code>PROVISIONED</code>. We recommend using <code>PROVISIONED</code> for
     * predictable workloads.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to
     * <code>PAY_PER_REQUEST</code>. We recommend using
     * <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PAY_PER_REQUEST
     *
     * @param billingMode <p>
     *            Controls how you are charged for read and write throughput and
     *            how you manage capacity. This setting can be changed later.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PROVISIONED</code> - Sets the read/write capacity mode
     *            to <code>PROVISIONED</code>. We recommend using
     *            <code>PROVISIONED</code> for predictable workloads.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PAY_PER_REQUEST</code> - Sets the read/write capacity
     *            mode to <code>PAY_PER_REQUEST</code>. We recommend using
     *            <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     *            </p>
     *            </li>
     *            </ul>
     * @see BillingMode
     */
    public void setBillingMode(BillingMode billingMode) {
        this.billingMode = billingMode.toString();
    }

    /**
     * <p>
     * Controls how you are charged for read and write throughput and how you
     * manage capacity. This setting can be changed later.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code> - Sets the read/write capacity mode to
     * <code>PROVISIONED</code>. We recommend using <code>PROVISIONED</code> for
     * predictable workloads.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to
     * <code>PAY_PER_REQUEST</code>. We recommend using
     * <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PAY_PER_REQUEST
     *
     * @param billingMode <p>
     *            Controls how you are charged for read and write throughput and
     *            how you manage capacity. This setting can be changed later.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PROVISIONED</code> - Sets the read/write capacity mode
     *            to <code>PROVISIONED</code>. We recommend using
     *            <code>PROVISIONED</code> for predictable workloads.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PAY_PER_REQUEST</code> - Sets the read/write capacity
     *            mode to <code>PAY_PER_REQUEST</code>. We recommend using
     *            <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BillingMode
     */
    public BillingModeSummary withBillingMode(BillingMode billingMode) {
        this.billingMode = billingMode.toString();
        return this;
    }

    /**
     * <p>
     * Represents the time when <code>PAY_PER_REQUEST</code> was last set as the
     * read/write capacity mode.
     * </p>
     *
     * @return <p>
     *         Represents the time when <code>PAY_PER_REQUEST</code> was last
     *         set as the read/write capacity mode.
     *         </p>
     */
    public java.util.Date getLastUpdateToPayPerRequestDateTime() {
        return lastUpdateToPayPerRequestDateTime;
    }

    /**
     * <p>
     * Represents the time when <code>PAY_PER_REQUEST</code> was last set as the
     * read/write capacity mode.
     * </p>
     *
     * @param lastUpdateToPayPerRequestDateTime <p>
     *            Represents the time when <code>PAY_PER_REQUEST</code> was last
     *            set as the read/write capacity mode.
     *            </p>
     */
    public void setLastUpdateToPayPerRequestDateTime(
            java.util.Date lastUpdateToPayPerRequestDateTime) {
        this.lastUpdateToPayPerRequestDateTime = lastUpdateToPayPerRequestDateTime;
    }

    /**
     * <p>
     * Represents the time when <code>PAY_PER_REQUEST</code> was last set as the
     * read/write capacity mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdateToPayPerRequestDateTime <p>
     *            Represents the time when <code>PAY_PER_REQUEST</code> was last
     *            set as the read/write capacity mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BillingModeSummary withLastUpdateToPayPerRequestDateTime(
            java.util.Date lastUpdateToPayPerRequestDateTime) {
        this.lastUpdateToPayPerRequestDateTime = lastUpdateToPayPerRequestDateTime;
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
        if (getBillingMode() != null)
            sb.append("BillingMode: " + getBillingMode() + ",");
        if (getLastUpdateToPayPerRequestDateTime() != null)
            sb.append("LastUpdateToPayPerRequestDateTime: "
                    + getLastUpdateToPayPerRequestDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBillingMode() == null) ? 0 : getBillingMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastUpdateToPayPerRequestDateTime() == null) ? 0
                        : getLastUpdateToPayPerRequestDateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BillingModeSummary == false)
            return false;
        BillingModeSummary other = (BillingModeSummary) obj;

        if (other.getBillingMode() == null ^ this.getBillingMode() == null)
            return false;
        if (other.getBillingMode() != null
                && other.getBillingMode().equals(this.getBillingMode()) == false)
            return false;
        if (other.getLastUpdateToPayPerRequestDateTime() == null
                ^ this.getLastUpdateToPayPerRequestDateTime() == null)
            return false;
        if (other.getLastUpdateToPayPerRequestDateTime() != null
                && other.getLastUpdateToPayPerRequestDateTime().equals(
                        this.getLastUpdateToPayPerRequestDateTime()) == false)
            return false;
        return true;
    }
}
