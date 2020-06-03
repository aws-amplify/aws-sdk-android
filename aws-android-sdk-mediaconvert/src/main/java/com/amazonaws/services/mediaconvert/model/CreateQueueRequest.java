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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Create a new transcoding queue. For information about queues, see Working
 * With Queues in the User Guide at
 * https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html
 */
public class CreateQueueRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Optional. A description of the queue that you are creating.
     */
    private String description;

    /**
     * The name of the queue that you are creating.
     */
    private String name;

    /**
     * Specifies whether the pricing plan for the queue is on-demand or
     * reserved. For on-demand, you pay per minute, billed in increments of .01
     * minute. For reserved, you pay for the transcoding capacity of the entire
     * queue, regardless of how much or how little you use it. Reserved pricing
     * requires a 12-month commitment. When you use the API to create a queue,
     * the default is on-demand.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, RESERVED
     */
    private String pricingPlan;

    /**
     * Details about the pricing plan for your reserved queue. Required for
     * reserved queues and not applicable to on-demand queues.
     */
    private ReservationPlanSettings reservationPlanSettings;

    /**
     * Initial state of the queue. If you create a paused queue, then jobs in
     * that queue won't begin.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, PAUSED
     */
    private String status;

    /**
     * The tags that you want to add to the resource. You can tag resources with
     * a key-value pair or with only a key.
     */
    private java.util.Map<String, String> tags;

    /**
     * Optional. A description of the queue that you are creating.
     *
     * @return Optional. A description of the queue that you are creating.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Optional. A description of the queue that you are creating.
     *
     * @param description Optional. A description of the queue that you are
     *            creating.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Optional. A description of the queue that you are creating.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description Optional. A description of the queue that you are
     *            creating.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The name of the queue that you are creating.
     *
     * @return The name of the queue that you are creating.
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the queue that you are creating.
     *
     * @param name The name of the queue that you are creating.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the queue that you are creating.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name The name of the queue that you are creating.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Specifies whether the pricing plan for the queue is on-demand or
     * reserved. For on-demand, you pay per minute, billed in increments of .01
     * minute. For reserved, you pay for the transcoding capacity of the entire
     * queue, regardless of how much or how little you use it. Reserved pricing
     * requires a 12-month commitment. When you use the API to create a queue,
     * the default is on-demand.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, RESERVED
     *
     * @return Specifies whether the pricing plan for the queue is on-demand or
     *         reserved. For on-demand, you pay per minute, billed in increments
     *         of .01 minute. For reserved, you pay for the transcoding capacity
     *         of the entire queue, regardless of how much or how little you use
     *         it. Reserved pricing requires a 12-month commitment. When you use
     *         the API to create a queue, the default is on-demand.
     * @see PricingPlan
     */
    public String getPricingPlan() {
        return pricingPlan;
    }

    /**
     * Specifies whether the pricing plan for the queue is on-demand or
     * reserved. For on-demand, you pay per minute, billed in increments of .01
     * minute. For reserved, you pay for the transcoding capacity of the entire
     * queue, regardless of how much or how little you use it. Reserved pricing
     * requires a 12-month commitment. When you use the API to create a queue,
     * the default is on-demand.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, RESERVED
     *
     * @param pricingPlan Specifies whether the pricing plan for the queue is
     *            on-demand or reserved. For on-demand, you pay per minute,
     *            billed in increments of .01 minute. For reserved, you pay for
     *            the transcoding capacity of the entire queue, regardless of
     *            how much or how little you use it. Reserved pricing requires a
     *            12-month commitment. When you use the API to create a queue,
     *            the default is on-demand.
     * @see PricingPlan
     */
    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * Specifies whether the pricing plan for the queue is on-demand or
     * reserved. For on-demand, you pay per minute, billed in increments of .01
     * minute. For reserved, you pay for the transcoding capacity of the entire
     * queue, regardless of how much or how little you use it. Reserved pricing
     * requires a 12-month commitment. When you use the API to create a queue,
     * the default is on-demand.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, RESERVED
     *
     * @param pricingPlan Specifies whether the pricing plan for the queue is
     *            on-demand or reserved. For on-demand, you pay per minute,
     *            billed in increments of .01 minute. For reserved, you pay for
     *            the transcoding capacity of the entire queue, regardless of
     *            how much or how little you use it. Reserved pricing requires a
     *            12-month commitment. When you use the API to create a queue,
     *            the default is on-demand.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PricingPlan
     */
    public CreateQueueRequest withPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
        return this;
    }

    /**
     * Specifies whether the pricing plan for the queue is on-demand or
     * reserved. For on-demand, you pay per minute, billed in increments of .01
     * minute. For reserved, you pay for the transcoding capacity of the entire
     * queue, regardless of how much or how little you use it. Reserved pricing
     * requires a 12-month commitment. When you use the API to create a queue,
     * the default is on-demand.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, RESERVED
     *
     * @param pricingPlan Specifies whether the pricing plan for the queue is
     *            on-demand or reserved. For on-demand, you pay per minute,
     *            billed in increments of .01 minute. For reserved, you pay for
     *            the transcoding capacity of the entire queue, regardless of
     *            how much or how little you use it. Reserved pricing requires a
     *            12-month commitment. When you use the API to create a queue,
     *            the default is on-demand.
     * @see PricingPlan
     */
    public void setPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
    }

    /**
     * Specifies whether the pricing plan for the queue is on-demand or
     * reserved. For on-demand, you pay per minute, billed in increments of .01
     * minute. For reserved, you pay for the transcoding capacity of the entire
     * queue, regardless of how much or how little you use it. Reserved pricing
     * requires a 12-month commitment. When you use the API to create a queue,
     * the default is on-demand.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ON_DEMAND, RESERVED
     *
     * @param pricingPlan Specifies whether the pricing plan for the queue is
     *            on-demand or reserved. For on-demand, you pay per minute,
     *            billed in increments of .01 minute. For reserved, you pay for
     *            the transcoding capacity of the entire queue, regardless of
     *            how much or how little you use it. Reserved pricing requires a
     *            12-month commitment. When you use the API to create a queue,
     *            the default is on-demand.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PricingPlan
     */
    public CreateQueueRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * Details about the pricing plan for your reserved queue. Required for
     * reserved queues and not applicable to on-demand queues.
     *
     * @return Details about the pricing plan for your reserved queue. Required
     *         for reserved queues and not applicable to on-demand queues.
     */
    public ReservationPlanSettings getReservationPlanSettings() {
        return reservationPlanSettings;
    }

    /**
     * Details about the pricing plan for your reserved queue. Required for
     * reserved queues and not applicable to on-demand queues.
     *
     * @param reservationPlanSettings Details about the pricing plan for your
     *            reserved queue. Required for reserved queues and not
     *            applicable to on-demand queues.
     */
    public void setReservationPlanSettings(ReservationPlanSettings reservationPlanSettings) {
        this.reservationPlanSettings = reservationPlanSettings;
    }

    /**
     * Details about the pricing plan for your reserved queue. Required for
     * reserved queues and not applicable to on-demand queues.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservationPlanSettings Details about the pricing plan for your
     *            reserved queue. Required for reserved queues and not
     *            applicable to on-demand queues.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest withReservationPlanSettings(
            ReservationPlanSettings reservationPlanSettings) {
        this.reservationPlanSettings = reservationPlanSettings;
        return this;
    }

    /**
     * Initial state of the queue. If you create a paused queue, then jobs in
     * that queue won't begin.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, PAUSED
     *
     * @return Initial state of the queue. If you create a paused queue, then
     *         jobs in that queue won't begin.
     * @see QueueStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * Initial state of the queue. If you create a paused queue, then jobs in
     * that queue won't begin.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, PAUSED
     *
     * @param status Initial state of the queue. If you create a paused queue,
     *            then jobs in that queue won't begin.
     * @see QueueStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Initial state of the queue. If you create a paused queue, then jobs in
     * that queue won't begin.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, PAUSED
     *
     * @param status Initial state of the queue. If you create a paused queue,
     *            then jobs in that queue won't begin.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueueStatus
     */
    public CreateQueueRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Initial state of the queue. If you create a paused queue, then jobs in
     * that queue won't begin.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, PAUSED
     *
     * @param status Initial state of the queue. If you create a paused queue,
     *            then jobs in that queue won't begin.
     * @see QueueStatus
     */
    public void setStatus(QueueStatus status) {
        this.status = status.toString();
    }

    /**
     * Initial state of the queue. If you create a paused queue, then jobs in
     * that queue won't begin.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, PAUSED
     *
     * @param status Initial state of the queue. If you create a paused queue,
     *            then jobs in that queue won't begin.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueueStatus
     */
    public CreateQueueRequest withStatus(QueueStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with
     * a key-value pair or with only a key.
     *
     * @return The tags that you want to add to the resource. You can tag
     *         resources with a key-value pair or with only a key.
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with
     * a key-value pair or with only a key.
     *
     * @param tags The tags that you want to add to the resource. You can tag
     *            resources with a key-value pair or with only a key.
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with
     * a key-value pair or with only a key.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags The tags that you want to add to the resource. You can tag
     *            resources with a key-value pair or with only a key.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with
     * a key-value pair or with only a key.
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateQueueRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateQueueRequest clearTagsEntries() {
        this.tags = null;
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: " + getPricingPlan() + ",");
        if (getReservationPlanSettings() != null)
            sb.append("ReservationPlanSettings: " + getReservationPlanSettings() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservationPlanSettings() == null) ? 0 : getReservationPlanSettings()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateQueueRequest == false)
            return false;
        CreateQueueRequest other = (CreateQueueRequest) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null
                && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        if (other.getReservationPlanSettings() == null ^ this.getReservationPlanSettings() == null)
            return false;
        if (other.getReservationPlanSettings() != null
                && other.getReservationPlanSettings().equals(this.getReservationPlanSettings()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
