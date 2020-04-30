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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Details about the pricing plan for your reserved queue. Required for reserved
 * queues and not applicable to on-demand queues.
 */
public class ReservationPlan implements Serializable {
    /**
     * The length of the term of your reserved queue pricing plan commitment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR
     */
    private String commitment;

    /**
     * The timestamp in epoch seconds for when the current pricing plan term for
     * this reserved queue expires.
     */
    private java.util.Date expiresAt;

    /**
     * The timestamp in epoch seconds for when you set up the current pricing
     * plan for this reserved queue.
     */
    private java.util.Date purchasedAt;

    /**
     * Specifies whether the term of your reserved queue pricing plan is
     * automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the
     * term.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO_RENEW, EXPIRE
     */
    private String renewalType;

    /**
     * Specifies the number of reserved transcode slots (RTS) for this queue.
     * The number of RTS determines how many jobs the queue can process in
     * parallel; each RTS can process one job at a time. When you increase this
     * number, you extend your existing commitment with a new 12-month
     * commitment for a larger number of RTS. The new commitment begins when you
     * purchase the additional capacity. You can't decrease the number of RTS in
     * your reserved queue.
     */
    private Integer reservedSlots;

    /**
     * Specifies whether the pricing plan for your reserved queue is ACTIVE or
     * EXPIRED.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, EXPIRED
     */
    private String status;

    /**
     * The length of the term of your reserved queue pricing plan commitment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR
     *
     * @return The length of the term of your reserved queue pricing plan
     *         commitment.
     * @see Commitment
     */
    public String getCommitment() {
        return commitment;
    }

    /**
     * The length of the term of your reserved queue pricing plan commitment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR
     *
     * @param commitment The length of the term of your reserved queue pricing
     *            plan commitment.
     * @see Commitment
     */
    public void setCommitment(String commitment) {
        this.commitment = commitment;
    }

    /**
     * The length of the term of your reserved queue pricing plan commitment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR
     *
     * @param commitment The length of the term of your reserved queue pricing
     *            plan commitment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Commitment
     */
    public ReservationPlan withCommitment(String commitment) {
        this.commitment = commitment;
        return this;
    }

    /**
     * The length of the term of your reserved queue pricing plan commitment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR
     *
     * @param commitment The length of the term of your reserved queue pricing
     *            plan commitment.
     * @see Commitment
     */
    public void setCommitment(Commitment commitment) {
        this.commitment = commitment.toString();
    }

    /**
     * The length of the term of your reserved queue pricing plan commitment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR
     *
     * @param commitment The length of the term of your reserved queue pricing
     *            plan commitment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Commitment
     */
    public ReservationPlan withCommitment(Commitment commitment) {
        this.commitment = commitment.toString();
        return this;
    }

    /**
     * The timestamp in epoch seconds for when the current pricing plan term for
     * this reserved queue expires.
     *
     * @return The timestamp in epoch seconds for when the current pricing plan
     *         term for this reserved queue expires.
     */
    public java.util.Date getExpiresAt() {
        return expiresAt;
    }

    /**
     * The timestamp in epoch seconds for when the current pricing plan term for
     * this reserved queue expires.
     *
     * @param expiresAt The timestamp in epoch seconds for when the current
     *            pricing plan term for this reserved queue expires.
     */
    public void setExpiresAt(java.util.Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * The timestamp in epoch seconds for when the current pricing plan term for
     * this reserved queue expires.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiresAt The timestamp in epoch seconds for when the current
     *            pricing plan term for this reserved queue expires.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPlan withExpiresAt(java.util.Date expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * The timestamp in epoch seconds for when you set up the current pricing
     * plan for this reserved queue.
     *
     * @return The timestamp in epoch seconds for when you set up the current
     *         pricing plan for this reserved queue.
     */
    public java.util.Date getPurchasedAt() {
        return purchasedAt;
    }

    /**
     * The timestamp in epoch seconds for when you set up the current pricing
     * plan for this reserved queue.
     *
     * @param purchasedAt The timestamp in epoch seconds for when you set up the
     *            current pricing plan for this reserved queue.
     */
    public void setPurchasedAt(java.util.Date purchasedAt) {
        this.purchasedAt = purchasedAt;
    }

    /**
     * The timestamp in epoch seconds for when you set up the current pricing
     * plan for this reserved queue.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param purchasedAt The timestamp in epoch seconds for when you set up the
     *            current pricing plan for this reserved queue.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPlan withPurchasedAt(java.util.Date purchasedAt) {
        this.purchasedAt = purchasedAt;
        return this;
    }

    /**
     * Specifies whether the term of your reserved queue pricing plan is
     * automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the
     * term.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO_RENEW, EXPIRE
     *
     * @return Specifies whether the term of your reserved queue pricing plan is
     *         automatically extended (AUTO_RENEW) or expires (EXPIRE) at the
     *         end of the term.
     * @see RenewalType
     */
    public String getRenewalType() {
        return renewalType;
    }

    /**
     * Specifies whether the term of your reserved queue pricing plan is
     * automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the
     * term.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO_RENEW, EXPIRE
     *
     * @param renewalType Specifies whether the term of your reserved queue
     *            pricing plan is automatically extended (AUTO_RENEW) or expires
     *            (EXPIRE) at the end of the term.
     * @see RenewalType
     */
    public void setRenewalType(String renewalType) {
        this.renewalType = renewalType;
    }

    /**
     * Specifies whether the term of your reserved queue pricing plan is
     * automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the
     * term.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO_RENEW, EXPIRE
     *
     * @param renewalType Specifies whether the term of your reserved queue
     *            pricing plan is automatically extended (AUTO_RENEW) or expires
     *            (EXPIRE) at the end of the term.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RenewalType
     */
    public ReservationPlan withRenewalType(String renewalType) {
        this.renewalType = renewalType;
        return this;
    }

    /**
     * Specifies whether the term of your reserved queue pricing plan is
     * automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the
     * term.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO_RENEW, EXPIRE
     *
     * @param renewalType Specifies whether the term of your reserved queue
     *            pricing plan is automatically extended (AUTO_RENEW) or expires
     *            (EXPIRE) at the end of the term.
     * @see RenewalType
     */
    public void setRenewalType(RenewalType renewalType) {
        this.renewalType = renewalType.toString();
    }

    /**
     * Specifies whether the term of your reserved queue pricing plan is
     * automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the
     * term.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO_RENEW, EXPIRE
     *
     * @param renewalType Specifies whether the term of your reserved queue
     *            pricing plan is automatically extended (AUTO_RENEW) or expires
     *            (EXPIRE) at the end of the term.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RenewalType
     */
    public ReservationPlan withRenewalType(RenewalType renewalType) {
        this.renewalType = renewalType.toString();
        return this;
    }

    /**
     * Specifies the number of reserved transcode slots (RTS) for this queue.
     * The number of RTS determines how many jobs the queue can process in
     * parallel; each RTS can process one job at a time. When you increase this
     * number, you extend your existing commitment with a new 12-month
     * commitment for a larger number of RTS. The new commitment begins when you
     * purchase the additional capacity. You can't decrease the number of RTS in
     * your reserved queue.
     *
     * @return Specifies the number of reserved transcode slots (RTS) for this
     *         queue. The number of RTS determines how many jobs the queue can
     *         process in parallel; each RTS can process one job at a time. When
     *         you increase this number, you extend your existing commitment
     *         with a new 12-month commitment for a larger number of RTS. The
     *         new commitment begins when you purchase the additional capacity.
     *         You can't decrease the number of RTS in your reserved queue.
     */
    public Integer getReservedSlots() {
        return reservedSlots;
    }

    /**
     * Specifies the number of reserved transcode slots (RTS) for this queue.
     * The number of RTS determines how many jobs the queue can process in
     * parallel; each RTS can process one job at a time. When you increase this
     * number, you extend your existing commitment with a new 12-month
     * commitment for a larger number of RTS. The new commitment begins when you
     * purchase the additional capacity. You can't decrease the number of RTS in
     * your reserved queue.
     *
     * @param reservedSlots Specifies the number of reserved transcode slots
     *            (RTS) for this queue. The number of RTS determines how many
     *            jobs the queue can process in parallel; each RTS can process
     *            one job at a time. When you increase this number, you extend
     *            your existing commitment with a new 12-month commitment for a
     *            larger number of RTS. The new commitment begins when you
     *            purchase the additional capacity. You can't decrease the
     *            number of RTS in your reserved queue.
     */
    public void setReservedSlots(Integer reservedSlots) {
        this.reservedSlots = reservedSlots;
    }

    /**
     * Specifies the number of reserved transcode slots (RTS) for this queue.
     * The number of RTS determines how many jobs the queue can process in
     * parallel; each RTS can process one job at a time. When you increase this
     * number, you extend your existing commitment with a new 12-month
     * commitment for a larger number of RTS. The new commitment begins when you
     * purchase the additional capacity. You can't decrease the number of RTS in
     * your reserved queue.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedSlots Specifies the number of reserved transcode slots
     *            (RTS) for this queue. The number of RTS determines how many
     *            jobs the queue can process in parallel; each RTS can process
     *            one job at a time. When you increase this number, you extend
     *            your existing commitment with a new 12-month commitment for a
     *            larger number of RTS. The new commitment begins when you
     *            purchase the additional capacity. You can't decrease the
     *            number of RTS in your reserved queue.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPlan withReservedSlots(Integer reservedSlots) {
        this.reservedSlots = reservedSlots;
        return this;
    }

    /**
     * Specifies whether the pricing plan for your reserved queue is ACTIVE or
     * EXPIRED.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, EXPIRED
     *
     * @return Specifies whether the pricing plan for your reserved queue is
     *         ACTIVE or EXPIRED.
     * @see ReservationPlanStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * Specifies whether the pricing plan for your reserved queue is ACTIVE or
     * EXPIRED.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, EXPIRED
     *
     * @param status Specifies whether the pricing plan for your reserved queue
     *            is ACTIVE or EXPIRED.
     * @see ReservationPlanStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Specifies whether the pricing plan for your reserved queue is ACTIVE or
     * EXPIRED.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, EXPIRED
     *
     * @param status Specifies whether the pricing plan for your reserved queue
     *            is ACTIVE or EXPIRED.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationPlanStatus
     */
    public ReservationPlan withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies whether the pricing plan for your reserved queue is ACTIVE or
     * EXPIRED.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, EXPIRED
     *
     * @param status Specifies whether the pricing plan for your reserved queue
     *            is ACTIVE or EXPIRED.
     * @see ReservationPlanStatus
     */
    public void setStatus(ReservationPlanStatus status) {
        this.status = status.toString();
    }

    /**
     * Specifies whether the pricing plan for your reserved queue is ACTIVE or
     * EXPIRED.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, EXPIRED
     *
     * @param status Specifies whether the pricing plan for your reserved queue
     *            is ACTIVE or EXPIRED.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationPlanStatus
     */
    public ReservationPlan withStatus(ReservationPlanStatus status) {
        this.status = status.toString();
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
        if (getCommitment() != null)
            sb.append("Commitment: " + getCommitment() + ",");
        if (getExpiresAt() != null)
            sb.append("ExpiresAt: " + getExpiresAt() + ",");
        if (getPurchasedAt() != null)
            sb.append("PurchasedAt: " + getPurchasedAt() + ",");
        if (getRenewalType() != null)
            sb.append("RenewalType: " + getRenewalType() + ",");
        if (getReservedSlots() != null)
            sb.append("ReservedSlots: " + getReservedSlots() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitment() == null) ? 0 : getCommitment().hashCode());
        hashCode = prime * hashCode + ((getExpiresAt() == null) ? 0 : getExpiresAt().hashCode());
        hashCode = prime * hashCode
                + ((getPurchasedAt() == null) ? 0 : getPurchasedAt().hashCode());
        hashCode = prime * hashCode
                + ((getRenewalType() == null) ? 0 : getRenewalType().hashCode());
        hashCode = prime * hashCode
                + ((getReservedSlots() == null) ? 0 : getReservedSlots().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationPlan == false)
            return false;
        ReservationPlan other = (ReservationPlan) obj;

        if (other.getCommitment() == null ^ this.getCommitment() == null)
            return false;
        if (other.getCommitment() != null
                && other.getCommitment().equals(this.getCommitment()) == false)
            return false;
        if (other.getExpiresAt() == null ^ this.getExpiresAt() == null)
            return false;
        if (other.getExpiresAt() != null
                && other.getExpiresAt().equals(this.getExpiresAt()) == false)
            return false;
        if (other.getPurchasedAt() == null ^ this.getPurchasedAt() == null)
            return false;
        if (other.getPurchasedAt() != null
                && other.getPurchasedAt().equals(this.getPurchasedAt()) == false)
            return false;
        if (other.getRenewalType() == null ^ this.getRenewalType() == null)
            return false;
        if (other.getRenewalType() != null
                && other.getRenewalType().equals(this.getRenewalType()) == false)
            return false;
        if (other.getReservedSlots() == null ^ this.getReservedSlots() == null)
            return false;
        if (other.getReservedSlots() != null
                && other.getReservedSlots().equals(this.getReservedSlots()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
