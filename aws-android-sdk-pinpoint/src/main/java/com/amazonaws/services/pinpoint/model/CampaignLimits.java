/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Campaign Limits are used to limit the number of messages that can be sent to
 * a single endpoint.
 */
public class CampaignLimits implements Serializable {
    /**
     * The maximum number of messages that each campaign can send to a single
     * endpoint in a 24-hour period.
     */
    private Integer daily;

    /**
     * The length of time (in seconds) that the campaign can run before it ends
     * and message deliveries stop. This duration begins at the scheduled start
     * time for the campaign. The minimum value is 60.
     */
    private Integer maximumDuration;

    /**
     * The number of messages that the campaign can send per second. The minimum
     * value is 50, and the maximum is 20000.
     */
    private Integer messagesPerSecond;

    /**
     * The maximum number of messages that an individual campaign can send to a
     * single endpoint over the course of the campaign.
     */
    private Integer total;

    /**
     * The maximum number of messages that each campaign can send to a single
     * endpoint in a 24-hour period.
     *
     * @return The maximum number of messages that each campaign can send to a
     *         single endpoint in a 24-hour period.
     */
    public Integer getDaily() {
        return daily;
    }

    /**
     * The maximum number of messages that each campaign can send to a single
     * endpoint in a 24-hour period.
     *
     * @param daily The maximum number of messages that each campaign can send
     *            to a single endpoint in a 24-hour period.
     */
    public void setDaily(Integer daily) {
        this.daily = daily;
    }

    /**
     * The maximum number of messages that each campaign can send to a single
     * endpoint in a 24-hour period.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param daily The maximum number of messages that each campaign can send
     *            to a single endpoint in a 24-hour period.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignLimits withDaily(Integer daily) {
        this.daily = daily;
        return this;
    }

    /**
     * The length of time (in seconds) that the campaign can run before it ends
     * and message deliveries stop. This duration begins at the scheduled start
     * time for the campaign. The minimum value is 60.
     *
     * @return The length of time (in seconds) that the campaign can run before
     *         it ends and message deliveries stop. This duration begins at the
     *         scheduled start time for the campaign. The minimum value is 60.
     */
    public Integer getMaximumDuration() {
        return maximumDuration;
    }

    /**
     * The length of time (in seconds) that the campaign can run before it ends
     * and message deliveries stop. This duration begins at the scheduled start
     * time for the campaign. The minimum value is 60.
     *
     * @param maximumDuration The length of time (in seconds) that the campaign
     *            can run before it ends and message deliveries stop. This
     *            duration begins at the scheduled start time for the campaign.
     *            The minimum value is 60.
     */
    public void setMaximumDuration(Integer maximumDuration) {
        this.maximumDuration = maximumDuration;
    }

    /**
     * The length of time (in seconds) that the campaign can run before it ends
     * and message deliveries stop. This duration begins at the scheduled start
     * time for the campaign. The minimum value is 60.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximumDuration The length of time (in seconds) that the campaign
     *            can run before it ends and message deliveries stop. This
     *            duration begins at the scheduled start time for the campaign.
     *            The minimum value is 60.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignLimits withMaximumDuration(Integer maximumDuration) {
        this.maximumDuration = maximumDuration;
        return this;
    }

    /**
     * The number of messages that the campaign can send per second. The minimum
     * value is 50, and the maximum is 20000.
     *
     * @return The number of messages that the campaign can send per second. The
     *         minimum value is 50, and the maximum is 20000.
     */
    public Integer getMessagesPerSecond() {
        return messagesPerSecond;
    }

    /**
     * The number of messages that the campaign can send per second. The minimum
     * value is 50, and the maximum is 20000.
     *
     * @param messagesPerSecond The number of messages that the campaign can
     *            send per second. The minimum value is 50, and the maximum is
     *            20000.
     */
    public void setMessagesPerSecond(Integer messagesPerSecond) {
        this.messagesPerSecond = messagesPerSecond;
    }

    /**
     * The number of messages that the campaign can send per second. The minimum
     * value is 50, and the maximum is 20000.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messagesPerSecond The number of messages that the campaign can
     *            send per second. The minimum value is 50, and the maximum is
     *            20000.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignLimits withMessagesPerSecond(Integer messagesPerSecond) {
        this.messagesPerSecond = messagesPerSecond;
        return this;
    }

    /**
     * The maximum number of messages that an individual campaign can send to a
     * single endpoint over the course of the campaign.
     *
     * @return The maximum number of messages that an individual campaign can
     *         send to a single endpoint over the course of the campaign.
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * The maximum number of messages that an individual campaign can send to a
     * single endpoint over the course of the campaign.
     *
     * @param total The maximum number of messages that an individual campaign
     *            can send to a single endpoint over the course of the campaign.
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * The maximum number of messages that an individual campaign can send to a
     * single endpoint over the course of the campaign.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param total The maximum number of messages that an individual campaign
     *            can send to a single endpoint over the course of the campaign.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignLimits withTotal(Integer total) {
        this.total = total;
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
        if (getDaily() != null)
            sb.append("Daily: " + getDaily() + ",");
        if (getMaximumDuration() != null)
            sb.append("MaximumDuration: " + getMaximumDuration() + ",");
        if (getMessagesPerSecond() != null)
            sb.append("MessagesPerSecond: " + getMessagesPerSecond() + ",");
        if (getTotal() != null)
            sb.append("Total: " + getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDaily() == null) ? 0 : getDaily().hashCode());
        hashCode = prime * hashCode
                + ((getMaximumDuration() == null) ? 0 : getMaximumDuration().hashCode());
        hashCode = prime * hashCode
                + ((getMessagesPerSecond() == null) ? 0 : getMessagesPerSecond().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignLimits == false)
            return false;
        CampaignLimits other = (CampaignLimits) obj;

        if (other.getDaily() == null ^ this.getDaily() == null)
            return false;
        if (other.getDaily() != null && other.getDaily().equals(this.getDaily()) == false)
            return false;
        if (other.getMaximumDuration() == null ^ this.getMaximumDuration() == null)
            return false;
        if (other.getMaximumDuration() != null
                && other.getMaximumDuration().equals(this.getMaximumDuration()) == false)
            return false;
        if (other.getMessagesPerSecond() == null ^ this.getMessagesPerSecond() == null)
            return false;
        if (other.getMessagesPerSecond() != null
                && other.getMessagesPerSecond().equals(this.getMessagesPerSecond()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }
}
