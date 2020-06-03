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
 * Modify one of your existing queues.
 */
public class UpdateQueueRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new description for the queue, if you are changing it.
     */
    private String description;

    /**
     * The name of the queue that you are modifying.
     */
    private String name;

    /**
     * The new details of your pricing plan for your reserved queue. When you
     * set up a new pricing plan to replace an expired one, you enter into
     * another 12-month commitment. When you add capacity to your queue by
     * increasing the number of RTS, you extend the term of your commitment to
     * 12 months from when you add capacity. After you make these commitments,
     * you can't cancel them.
     */
    private ReservationPlanSettings reservationPlanSettings;

    /**
     * Pause or activate a queue by changing its status between ACTIVE and
     * PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that
     * are running when you pause the queue continue to run until they finish or
     * result in an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, PAUSED
     */
    private String status;

    /**
     * The new description for the queue, if you are changing it.
     *
     * @return The new description for the queue, if you are changing it.
     */
    public String getDescription() {
        return description;
    }

    /**
     * The new description for the queue, if you are changing it.
     *
     * @param description The new description for the queue, if you are changing
     *            it.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The new description for the queue, if you are changing it.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description The new description for the queue, if you are changing
     *            it.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateQueueRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The name of the queue that you are modifying.
     *
     * @return The name of the queue that you are modifying.
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the queue that you are modifying.
     *
     * @param name The name of the queue that you are modifying.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the queue that you are modifying.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name The name of the queue that you are modifying.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateQueueRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The new details of your pricing plan for your reserved queue. When you
     * set up a new pricing plan to replace an expired one, you enter into
     * another 12-month commitment. When you add capacity to your queue by
     * increasing the number of RTS, you extend the term of your commitment to
     * 12 months from when you add capacity. After you make these commitments,
     * you can't cancel them.
     *
     * @return The new details of your pricing plan for your reserved queue.
     *         When you set up a new pricing plan to replace an expired one, you
     *         enter into another 12-month commitment. When you add capacity to
     *         your queue by increasing the number of RTS, you extend the term
     *         of your commitment to 12 months from when you add capacity. After
     *         you make these commitments, you can't cancel them.
     */
    public ReservationPlanSettings getReservationPlanSettings() {
        return reservationPlanSettings;
    }

    /**
     * The new details of your pricing plan for your reserved queue. When you
     * set up a new pricing plan to replace an expired one, you enter into
     * another 12-month commitment. When you add capacity to your queue by
     * increasing the number of RTS, you extend the term of your commitment to
     * 12 months from when you add capacity. After you make these commitments,
     * you can't cancel them.
     *
     * @param reservationPlanSettings The new details of your pricing plan for
     *            your reserved queue. When you set up a new pricing plan to
     *            replace an expired one, you enter into another 12-month
     *            commitment. When you add capacity to your queue by increasing
     *            the number of RTS, you extend the term of your commitment to
     *            12 months from when you add capacity. After you make these
     *            commitments, you can't cancel them.
     */
    public void setReservationPlanSettings(ReservationPlanSettings reservationPlanSettings) {
        this.reservationPlanSettings = reservationPlanSettings;
    }

    /**
     * The new details of your pricing plan for your reserved queue. When you
     * set up a new pricing plan to replace an expired one, you enter into
     * another 12-month commitment. When you add capacity to your queue by
     * increasing the number of RTS, you extend the term of your commitment to
     * 12 months from when you add capacity. After you make these commitments,
     * you can't cancel them.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservationPlanSettings The new details of your pricing plan for
     *            your reserved queue. When you set up a new pricing plan to
     *            replace an expired one, you enter into another 12-month
     *            commitment. When you add capacity to your queue by increasing
     *            the number of RTS, you extend the term of your commitment to
     *            12 months from when you add capacity. After you make these
     *            commitments, you can't cancel them.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateQueueRequest withReservationPlanSettings(
            ReservationPlanSettings reservationPlanSettings) {
        this.reservationPlanSettings = reservationPlanSettings;
        return this;
    }

    /**
     * Pause or activate a queue by changing its status between ACTIVE and
     * PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that
     * are running when you pause the queue continue to run until they finish or
     * result in an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, PAUSED
     *
     * @return Pause or activate a queue by changing its status between ACTIVE
     *         and PAUSED. If you pause a queue, jobs in that queue won't begin.
     *         Jobs that are running when you pause the queue continue to run
     *         until they finish or result in an error.
     * @see QueueStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * Pause or activate a queue by changing its status between ACTIVE and
     * PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that
     * are running when you pause the queue continue to run until they finish or
     * result in an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, PAUSED
     *
     * @param status Pause or activate a queue by changing its status between
     *            ACTIVE and PAUSED. If you pause a queue, jobs in that queue
     *            won't begin. Jobs that are running when you pause the queue
     *            continue to run until they finish or result in an error.
     * @see QueueStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Pause or activate a queue by changing its status between ACTIVE and
     * PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that
     * are running when you pause the queue continue to run until they finish or
     * result in an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, PAUSED
     *
     * @param status Pause or activate a queue by changing its status between
     *            ACTIVE and PAUSED. If you pause a queue, jobs in that queue
     *            won't begin. Jobs that are running when you pause the queue
     *            continue to run until they finish or result in an error.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueueStatus
     */
    public UpdateQueueRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Pause or activate a queue by changing its status between ACTIVE and
     * PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that
     * are running when you pause the queue continue to run until they finish or
     * result in an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, PAUSED
     *
     * @param status Pause or activate a queue by changing its status between
     *            ACTIVE and PAUSED. If you pause a queue, jobs in that queue
     *            won't begin. Jobs that are running when you pause the queue
     *            continue to run until they finish or result in an error.
     * @see QueueStatus
     */
    public void setStatus(QueueStatus status) {
        this.status = status.toString();
    }

    /**
     * Pause or activate a queue by changing its status between ACTIVE and
     * PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that
     * are running when you pause the queue continue to run until they finish or
     * result in an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, PAUSED
     *
     * @param status Pause or activate a queue by changing its status between
     *            ACTIVE and PAUSED. If you pause a queue, jobs in that queue
     *            won't begin. Jobs that are running when you pause the queue
     *            continue to run until they finish or result in an error.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see QueueStatus
     */
    public UpdateQueueRequest withStatus(QueueStatus status) {
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getReservationPlanSettings() != null)
            sb.append("ReservationPlanSettings: " + getReservationPlanSettings() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
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
        hashCode = prime
                * hashCode
                + ((getReservationPlanSettings() == null) ? 0 : getReservationPlanSettings()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateQueueRequest == false)
            return false;
        UpdateQueueRequest other = (UpdateQueueRequest) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        return true;
    }
}
