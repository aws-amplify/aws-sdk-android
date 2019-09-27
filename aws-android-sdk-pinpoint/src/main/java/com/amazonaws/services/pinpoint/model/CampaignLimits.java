/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Specifies limits on the messages that a campaign can send.
 * </p>
 */
public class CampaignLimits implements Serializable {
    /**
     * <p>
     * The maximum number of messages that a campaign can send to a single
     * endpoint during a 24-hour period. The maximum value is 100.
     * </p>
     */
    private Integer daily;

    /**
     * <p>
     * The maximum amount of time, in seconds, that a campaign can attempt to
     * deliver a message after the scheduled start time for the campaign. The
     * minimum value is 60 seconds.
     * </p>
     */
    private Integer maximumDuration;

    /**
     * <p>
     * The maximum number of messages that a campaign can send each second. The
     * minimum value is 50. The maximum value is 20,000.
     * </p>
     */
    private Integer messagesPerSecond;

    /**
     * <p>
     * The maximum number of messages that a campaign can send to a single
     * endpoint during the course of the campaign. The maximum value is 100.
     * </p>
     */
    private Integer total;

    /**
     * <p>
     * The maximum number of messages that a campaign can send to a single
     * endpoint during a 24-hour period. The maximum value is 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of messages that a campaign can send to a
     *         single endpoint during a 24-hour period. The maximum value is
     *         100.
     *         </p>
     */
    public Integer getDaily() {
        return daily;
    }

    /**
     * <p>
     * The maximum number of messages that a campaign can send to a single
     * endpoint during a 24-hour period. The maximum value is 100.
     * </p>
     *
     * @param daily <p>
     *            The maximum number of messages that a campaign can send to a
     *            single endpoint during a 24-hour period. The maximum value is
     *            100.
     *            </p>
     */
    public void setDaily(Integer daily) {
        this.daily = daily;
    }

    /**
     * <p>
     * The maximum number of messages that a campaign can send to a single
     * endpoint during a 24-hour period. The maximum value is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param daily <p>
     *            The maximum number of messages that a campaign can send to a
     *            single endpoint during a 24-hour period. The maximum value is
     *            100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignLimits withDaily(Integer daily) {
        this.daily = daily;
        return this;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, that a campaign can attempt to
     * deliver a message after the scheduled start time for the campaign. The
     * minimum value is 60 seconds.
     * </p>
     *
     * @return <p>
     *         The maximum amount of time, in seconds, that a campaign can
     *         attempt to deliver a message after the scheduled start time for
     *         the campaign. The minimum value is 60 seconds.
     *         </p>
     */
    public Integer getMaximumDuration() {
        return maximumDuration;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, that a campaign can attempt to
     * deliver a message after the scheduled start time for the campaign. The
     * minimum value is 60 seconds.
     * </p>
     *
     * @param maximumDuration <p>
     *            The maximum amount of time, in seconds, that a campaign can
     *            attempt to deliver a message after the scheduled start time
     *            for the campaign. The minimum value is 60 seconds.
     *            </p>
     */
    public void setMaximumDuration(Integer maximumDuration) {
        this.maximumDuration = maximumDuration;
    }

    /**
     * <p>
     * The maximum amount of time, in seconds, that a campaign can attempt to
     * deliver a message after the scheduled start time for the campaign. The
     * minimum value is 60 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximumDuration <p>
     *            The maximum amount of time, in seconds, that a campaign can
     *            attempt to deliver a message after the scheduled start time
     *            for the campaign. The minimum value is 60 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignLimits withMaximumDuration(Integer maximumDuration) {
        this.maximumDuration = maximumDuration;
        return this;
    }

    /**
     * <p>
     * The maximum number of messages that a campaign can send each second. The
     * minimum value is 50. The maximum value is 20,000.
     * </p>
     *
     * @return <p>
     *         The maximum number of messages that a campaign can send each
     *         second. The minimum value is 50. The maximum value is 20,000.
     *         </p>
     */
    public Integer getMessagesPerSecond() {
        return messagesPerSecond;
    }

    /**
     * <p>
     * The maximum number of messages that a campaign can send each second. The
     * minimum value is 50. The maximum value is 20,000.
     * </p>
     *
     * @param messagesPerSecond <p>
     *            The maximum number of messages that a campaign can send each
     *            second. The minimum value is 50. The maximum value is 20,000.
     *            </p>
     */
    public void setMessagesPerSecond(Integer messagesPerSecond) {
        this.messagesPerSecond = messagesPerSecond;
    }

    /**
     * <p>
     * The maximum number of messages that a campaign can send each second. The
     * minimum value is 50. The maximum value is 20,000.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messagesPerSecond <p>
     *            The maximum number of messages that a campaign can send each
     *            second. The minimum value is 50. The maximum value is 20,000.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignLimits withMessagesPerSecond(Integer messagesPerSecond) {
        this.messagesPerSecond = messagesPerSecond;
        return this;
    }

    /**
     * <p>
     * The maximum number of messages that a campaign can send to a single
     * endpoint during the course of the campaign. The maximum value is 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of messages that a campaign can send to a
     *         single endpoint during the course of the campaign. The maximum
     *         value is 100.
     *         </p>
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * <p>
     * The maximum number of messages that a campaign can send to a single
     * endpoint during the course of the campaign. The maximum value is 100.
     * </p>
     *
     * @param total <p>
     *            The maximum number of messages that a campaign can send to a
     *            single endpoint during the course of the campaign. The maximum
     *            value is 100.
     *            </p>
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * <p>
     * The maximum number of messages that a campaign can send to a single
     * endpoint during the course of the campaign. The maximum value is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param total <p>
     *            The maximum number of messages that a campaign can send to a
     *            single endpoint during the course of the campaign. The maximum
     *            value is 100.
     *            </p>
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
