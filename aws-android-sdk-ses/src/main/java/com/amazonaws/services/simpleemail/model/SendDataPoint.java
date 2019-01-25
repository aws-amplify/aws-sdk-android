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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Represents sending statistics data. Each <code>SendDataPoint</code> contains
 * statistics for a 15-minute period of sending activity.
 * </p>
 */
public class SendDataPoint implements Serializable {
    /**
     * <p>
     * Time of the data point.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * Number of emails that have been sent.
     * </p>
     */
    private Long deliveryAttempts;

    /**
     * <p>
     * Number of emails that have bounced.
     * </p>
     */
    private Long bounces;

    /**
     * <p>
     * Number of unwanted emails that were rejected by recipients.
     * </p>
     */
    private Long complaints;

    /**
     * <p>
     * Number of emails rejected by Amazon SES.
     * </p>
     */
    private Long rejects;

    /**
     * <p>
     * Time of the data point.
     * </p>
     *
     * @return <p>
     *         Time of the data point.
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * Time of the data point.
     * </p>
     *
     * @param timestamp <p>
     *            Time of the data point.
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Time of the data point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            Time of the data point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendDataPoint withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * Number of emails that have been sent.
     * </p>
     *
     * @return <p>
     *         Number of emails that have been sent.
     *         </p>
     */
    public Long getDeliveryAttempts() {
        return deliveryAttempts;
    }

    /**
     * <p>
     * Number of emails that have been sent.
     * </p>
     *
     * @param deliveryAttempts <p>
     *            Number of emails that have been sent.
     *            </p>
     */
    public void setDeliveryAttempts(Long deliveryAttempts) {
        this.deliveryAttempts = deliveryAttempts;
    }

    /**
     * <p>
     * Number of emails that have been sent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deliveryAttempts <p>
     *            Number of emails that have been sent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendDataPoint withDeliveryAttempts(Long deliveryAttempts) {
        this.deliveryAttempts = deliveryAttempts;
        return this;
    }

    /**
     * <p>
     * Number of emails that have bounced.
     * </p>
     *
     * @return <p>
     *         Number of emails that have bounced.
     *         </p>
     */
    public Long getBounces() {
        return bounces;
    }

    /**
     * <p>
     * Number of emails that have bounced.
     * </p>
     *
     * @param bounces <p>
     *            Number of emails that have bounced.
     *            </p>
     */
    public void setBounces(Long bounces) {
        this.bounces = bounces;
    }

    /**
     * <p>
     * Number of emails that have bounced.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bounces <p>
     *            Number of emails that have bounced.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendDataPoint withBounces(Long bounces) {
        this.bounces = bounces;
        return this;
    }

    /**
     * <p>
     * Number of unwanted emails that were rejected by recipients.
     * </p>
     *
     * @return <p>
     *         Number of unwanted emails that were rejected by recipients.
     *         </p>
     */
    public Long getComplaints() {
        return complaints;
    }

    /**
     * <p>
     * Number of unwanted emails that were rejected by recipients.
     * </p>
     *
     * @param complaints <p>
     *            Number of unwanted emails that were rejected by recipients.
     *            </p>
     */
    public void setComplaints(Long complaints) {
        this.complaints = complaints;
    }

    /**
     * <p>
     * Number of unwanted emails that were rejected by recipients.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param complaints <p>
     *            Number of unwanted emails that were rejected by recipients.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendDataPoint withComplaints(Long complaints) {
        this.complaints = complaints;
        return this;
    }

    /**
     * <p>
     * Number of emails rejected by Amazon SES.
     * </p>
     *
     * @return <p>
     *         Number of emails rejected by Amazon SES.
     *         </p>
     */
    public Long getRejects() {
        return rejects;
    }

    /**
     * <p>
     * Number of emails rejected by Amazon SES.
     * </p>
     *
     * @param rejects <p>
     *            Number of emails rejected by Amazon SES.
     *            </p>
     */
    public void setRejects(Long rejects) {
        this.rejects = rejects;
    }

    /**
     * <p>
     * Number of emails rejected by Amazon SES.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rejects <p>
     *            Number of emails rejected by Amazon SES.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendDataPoint withRejects(Long rejects) {
        this.rejects = rejects;
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
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getDeliveryAttempts() != null)
            sb.append("DeliveryAttempts: " + getDeliveryAttempts() + ",");
        if (getBounces() != null)
            sb.append("Bounces: " + getBounces() + ",");
        if (getComplaints() != null)
            sb.append("Complaints: " + getComplaints() + ",");
        if (getRejects() != null)
            sb.append("Rejects: " + getRejects());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getDeliveryAttempts() == null) ? 0 : getDeliveryAttempts().hashCode());
        hashCode = prime * hashCode + ((getBounces() == null) ? 0 : getBounces().hashCode());
        hashCode = prime * hashCode + ((getComplaints() == null) ? 0 : getComplaints().hashCode());
        hashCode = prime * hashCode + ((getRejects() == null) ? 0 : getRejects().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendDataPoint == false)
            return false;
        SendDataPoint other = (SendDataPoint) obj;

        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getDeliveryAttempts() == null ^ this.getDeliveryAttempts() == null)
            return false;
        if (other.getDeliveryAttempts() != null
                && other.getDeliveryAttempts().equals(this.getDeliveryAttempts()) == false)
            return false;
        if (other.getBounces() == null ^ this.getBounces() == null)
            return false;
        if (other.getBounces() != null && other.getBounces().equals(this.getBounces()) == false)
            return false;
        if (other.getComplaints() == null ^ this.getComplaints() == null)
            return false;
        if (other.getComplaints() != null
                && other.getComplaints().equals(this.getComplaints()) == false)
            return false;
        if (other.getRejects() == null ^ this.getRejects() == null)
            return false;
        if (other.getRejects() != null && other.getRejects().equals(this.getRejects()) == false)
            return false;
        return true;
    }
}
