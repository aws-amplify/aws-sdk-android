/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Represents your Amazon SES daily sending quota, maximum send rate, and the
 * number of emails you have sent in the last 24 hours.
 * </p>
 */
public class GetSendQuotaResult implements Serializable {
    /**
     * <p>
     * The maximum number of emails the user is allowed to send in a 24-hour
     * interval. A value of -1 signifies an unlimited quota.
     * </p>
     */
    private Double max24HourSend;

    /**
     * <p>
     * The maximum number of emails that Amazon SES can accept from the user's
     * account per second.
     * </p>
     * <note>
     * <p>
     * The rate at which Amazon SES accepts the user's messages might be less
     * than the maximum send rate.
     * </p>
     * </note>
     */
    private Double maxSendRate;

    /**
     * <p>
     * The number of emails sent during the previous 24 hours.
     * </p>
     */
    private Double sentLast24Hours;

    /**
     * <p>
     * The maximum number of emails the user is allowed to send in a 24-hour
     * interval. A value of -1 signifies an unlimited quota.
     * </p>
     *
     * @return <p>
     *         The maximum number of emails the user is allowed to send in a
     *         24-hour interval. A value of -1 signifies an unlimited quota.
     *         </p>
     */
    public Double getMax24HourSend() {
        return max24HourSend;
    }

    /**
     * <p>
     * The maximum number of emails the user is allowed to send in a 24-hour
     * interval. A value of -1 signifies an unlimited quota.
     * </p>
     *
     * @param max24HourSend <p>
     *            The maximum number of emails the user is allowed to send in a
     *            24-hour interval. A value of -1 signifies an unlimited quota.
     *            </p>
     */
    public void setMax24HourSend(Double max24HourSend) {
        this.max24HourSend = max24HourSend;
    }

    /**
     * <p>
     * The maximum number of emails the user is allowed to send in a 24-hour
     * interval. A value of -1 signifies an unlimited quota.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param max24HourSend <p>
     *            The maximum number of emails the user is allowed to send in a
     *            24-hour interval. A value of -1 signifies an unlimited quota.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSendQuotaResult withMax24HourSend(Double max24HourSend) {
        this.max24HourSend = max24HourSend;
        return this;
    }

    /**
     * <p>
     * The maximum number of emails that Amazon SES can accept from the user's
     * account per second.
     * </p>
     * <note>
     * <p>
     * The rate at which Amazon SES accepts the user's messages might be less
     * than the maximum send rate.
     * </p>
     * </note>
     *
     * @return <p>
     *         The maximum number of emails that Amazon SES can accept from the
     *         user's account per second.
     *         </p>
     *         <note>
     *         <p>
     *         The rate at which Amazon SES accepts the user's messages might be
     *         less than the maximum send rate.
     *         </p>
     *         </note>
     */
    public Double getMaxSendRate() {
        return maxSendRate;
    }

    /**
     * <p>
     * The maximum number of emails that Amazon SES can accept from the user's
     * account per second.
     * </p>
     * <note>
     * <p>
     * The rate at which Amazon SES accepts the user's messages might be less
     * than the maximum send rate.
     * </p>
     * </note>
     *
     * @param maxSendRate <p>
     *            The maximum number of emails that Amazon SES can accept from
     *            the user's account per second.
     *            </p>
     *            <note>
     *            <p>
     *            The rate at which Amazon SES accepts the user's messages might
     *            be less than the maximum send rate.
     *            </p>
     *            </note>
     */
    public void setMaxSendRate(Double maxSendRate) {
        this.maxSendRate = maxSendRate;
    }

    /**
     * <p>
     * The maximum number of emails that Amazon SES can accept from the user's
     * account per second.
     * </p>
     * <note>
     * <p>
     * The rate at which Amazon SES accepts the user's messages might be less
     * than the maximum send rate.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxSendRate <p>
     *            The maximum number of emails that Amazon SES can accept from
     *            the user's account per second.
     *            </p>
     *            <note>
     *            <p>
     *            The rate at which Amazon SES accepts the user's messages might
     *            be less than the maximum send rate.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSendQuotaResult withMaxSendRate(Double maxSendRate) {
        this.maxSendRate = maxSendRate;
        return this;
    }

    /**
     * <p>
     * The number of emails sent during the previous 24 hours.
     * </p>
     *
     * @return <p>
     *         The number of emails sent during the previous 24 hours.
     *         </p>
     */
    public Double getSentLast24Hours() {
        return sentLast24Hours;
    }

    /**
     * <p>
     * The number of emails sent during the previous 24 hours.
     * </p>
     *
     * @param sentLast24Hours <p>
     *            The number of emails sent during the previous 24 hours.
     *            </p>
     */
    public void setSentLast24Hours(Double sentLast24Hours) {
        this.sentLast24Hours = sentLast24Hours;
    }

    /**
     * <p>
     * The number of emails sent during the previous 24 hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sentLast24Hours <p>
     *            The number of emails sent during the previous 24 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSendQuotaResult withSentLast24Hours(Double sentLast24Hours) {
        this.sentLast24Hours = sentLast24Hours;
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
        if (getMax24HourSend() != null)
            sb.append("Max24HourSend: " + getMax24HourSend() + ",");
        if (getMaxSendRate() != null)
            sb.append("MaxSendRate: " + getMaxSendRate() + ",");
        if (getSentLast24Hours() != null)
            sb.append("SentLast24Hours: " + getSentLast24Hours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMax24HourSend() == null) ? 0 : getMax24HourSend().hashCode());
        hashCode = prime * hashCode
                + ((getMaxSendRate() == null) ? 0 : getMaxSendRate().hashCode());
        hashCode = prime * hashCode
                + ((getSentLast24Hours() == null) ? 0 : getSentLast24Hours().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSendQuotaResult == false)
            return false;
        GetSendQuotaResult other = (GetSendQuotaResult) obj;

        if (other.getMax24HourSend() == null ^ this.getMax24HourSend() == null)
            return false;
        if (other.getMax24HourSend() != null
                && other.getMax24HourSend().equals(this.getMax24HourSend()) == false)
            return false;
        if (other.getMaxSendRate() == null ^ this.getMaxSendRate() == null)
            return false;
        if (other.getMaxSendRate() != null
                && other.getMaxSendRate().equals(this.getMaxSendRate()) == false)
            return false;
        if (other.getSentLast24Hours() == null ^ this.getSentLast24Hours() == null)
            return false;
        if (other.getSentLast24Hours() != null
                && other.getSentLast24Hours().equals(this.getSentLast24Hours()) == false)
            return false;
        return true;
    }
}
