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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the status of logging for a cluster.
 * </p>
 */
public class DisableLoggingResult implements Serializable {
    /**
     * <p>
     * <code>true</code> if logging is on, <code>false</code> if logging is off.
     * </p>
     */
    private Boolean loggingEnabled;

    /**
     * <p>
     * The name of the S3 bucket where the log files are stored.
     * </p>
     */
    private String bucketName;

    /**
     * <p>
     * The prefix applied to the log file names.
     * </p>
     */
    private String s3KeyPrefix;

    /**
     * <p>
     * The last time that logs were delivered.
     * </p>
     */
    private java.util.Date lastSuccessfulDeliveryTime;

    /**
     * <p>
     * The last time when logs failed to be delivered.
     * </p>
     */
    private java.util.Date lastFailureTime;

    /**
     * <p>
     * The message indicating that logs failed to be delivered.
     * </p>
     */
    private String lastFailureMessage;

    /**
     * <p>
     * <code>true</code> if logging is on, <code>false</code> if logging is off.
     * </p>
     *
     * @return <p>
     *         <code>true</code> if logging is on, <code>false</code> if logging
     *         is off.
     *         </p>
     */
    public Boolean isLoggingEnabled() {
        return loggingEnabled;
    }

    /**
     * <p>
     * <code>true</code> if logging is on, <code>false</code> if logging is off.
     * </p>
     *
     * @return <p>
     *         <code>true</code> if logging is on, <code>false</code> if logging
     *         is off.
     *         </p>
     */
    public Boolean getLoggingEnabled() {
        return loggingEnabled;
    }

    /**
     * <p>
     * <code>true</code> if logging is on, <code>false</code> if logging is off.
     * </p>
     *
     * @param loggingEnabled <p>
     *            <code>true</code> if logging is on, <code>false</code> if
     *            logging is off.
     *            </p>
     */
    public void setLoggingEnabled(Boolean loggingEnabled) {
        this.loggingEnabled = loggingEnabled;
    }

    /**
     * <p>
     * <code>true</code> if logging is on, <code>false</code> if logging is off.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loggingEnabled <p>
     *            <code>true</code> if logging is on, <code>false</code> if
     *            logging is off.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableLoggingResult withLoggingEnabled(Boolean loggingEnabled) {
        this.loggingEnabled = loggingEnabled;
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket where the log files are stored.
     * </p>
     *
     * @return <p>
     *         The name of the S3 bucket where the log files are stored.
     *         </p>
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket where the log files are stored.
     * </p>
     *
     * @param bucketName <p>
     *            The name of the S3 bucket where the log files are stored.
     *            </p>
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket where the log files are stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucketName <p>
     *            The name of the S3 bucket where the log files are stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableLoggingResult withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * <p>
     * The prefix applied to the log file names.
     * </p>
     *
     * @return <p>
     *         The prefix applied to the log file names.
     *         </p>
     */
    public String getS3KeyPrefix() {
        return s3KeyPrefix;
    }

    /**
     * <p>
     * The prefix applied to the log file names.
     * </p>
     *
     * @param s3KeyPrefix <p>
     *            The prefix applied to the log file names.
     *            </p>
     */
    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * The prefix applied to the log file names.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3KeyPrefix <p>
     *            The prefix applied to the log file names.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableLoggingResult withS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
        return this;
    }

    /**
     * <p>
     * The last time that logs were delivered.
     * </p>
     *
     * @return <p>
     *         The last time that logs were delivered.
     *         </p>
     */
    public java.util.Date getLastSuccessfulDeliveryTime() {
        return lastSuccessfulDeliveryTime;
    }

    /**
     * <p>
     * The last time that logs were delivered.
     * </p>
     *
     * @param lastSuccessfulDeliveryTime <p>
     *            The last time that logs were delivered.
     *            </p>
     */
    public void setLastSuccessfulDeliveryTime(java.util.Date lastSuccessfulDeliveryTime) {
        this.lastSuccessfulDeliveryTime = lastSuccessfulDeliveryTime;
    }

    /**
     * <p>
     * The last time that logs were delivered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastSuccessfulDeliveryTime <p>
     *            The last time that logs were delivered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableLoggingResult withLastSuccessfulDeliveryTime(
            java.util.Date lastSuccessfulDeliveryTime) {
        this.lastSuccessfulDeliveryTime = lastSuccessfulDeliveryTime;
        return this;
    }

    /**
     * <p>
     * The last time when logs failed to be delivered.
     * </p>
     *
     * @return <p>
     *         The last time when logs failed to be delivered.
     *         </p>
     */
    public java.util.Date getLastFailureTime() {
        return lastFailureTime;
    }

    /**
     * <p>
     * The last time when logs failed to be delivered.
     * </p>
     *
     * @param lastFailureTime <p>
     *            The last time when logs failed to be delivered.
     *            </p>
     */
    public void setLastFailureTime(java.util.Date lastFailureTime) {
        this.lastFailureTime = lastFailureTime;
    }

    /**
     * <p>
     * The last time when logs failed to be delivered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastFailureTime <p>
     *            The last time when logs failed to be delivered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableLoggingResult withLastFailureTime(java.util.Date lastFailureTime) {
        this.lastFailureTime = lastFailureTime;
        return this;
    }

    /**
     * <p>
     * The message indicating that logs failed to be delivered.
     * </p>
     *
     * @return <p>
     *         The message indicating that logs failed to be delivered.
     *         </p>
     */
    public String getLastFailureMessage() {
        return lastFailureMessage;
    }

    /**
     * <p>
     * The message indicating that logs failed to be delivered.
     * </p>
     *
     * @param lastFailureMessage <p>
     *            The message indicating that logs failed to be delivered.
     *            </p>
     */
    public void setLastFailureMessage(String lastFailureMessage) {
        this.lastFailureMessage = lastFailureMessage;
    }

    /**
     * <p>
     * The message indicating that logs failed to be delivered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastFailureMessage <p>
     *            The message indicating that logs failed to be delivered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableLoggingResult withLastFailureMessage(String lastFailureMessage) {
        this.lastFailureMessage = lastFailureMessage;
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
        if (getLoggingEnabled() != null)
            sb.append("LoggingEnabled: " + getLoggingEnabled() + ",");
        if (getBucketName() != null)
            sb.append("BucketName: " + getBucketName() + ",");
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: " + getS3KeyPrefix() + ",");
        if (getLastSuccessfulDeliveryTime() != null)
            sb.append("LastSuccessfulDeliveryTime: " + getLastSuccessfulDeliveryTime() + ",");
        if (getLastFailureTime() != null)
            sb.append("LastFailureTime: " + getLastFailureTime() + ",");
        if (getLastFailureMessage() != null)
            sb.append("LastFailureMessage: " + getLastFailureMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoggingEnabled() == null) ? 0 : getLoggingEnabled().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode
                + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastSuccessfulDeliveryTime() == null) ? 0 : getLastSuccessfulDeliveryTime()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLastFailureTime() == null) ? 0 : getLastFailureTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastFailureMessage() == null) ? 0 : getLastFailureMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableLoggingResult == false)
            return false;
        DisableLoggingResult other = (DisableLoggingResult) obj;

        if (other.getLoggingEnabled() == null ^ this.getLoggingEnabled() == null)
            return false;
        if (other.getLoggingEnabled() != null
                && other.getLoggingEnabled().equals(this.getLoggingEnabled()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null
                && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null
                && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        if (other.getLastSuccessfulDeliveryTime() == null
                ^ this.getLastSuccessfulDeliveryTime() == null)
            return false;
        if (other.getLastSuccessfulDeliveryTime() != null
                && other.getLastSuccessfulDeliveryTime().equals(
                        this.getLastSuccessfulDeliveryTime()) == false)
            return false;
        if (other.getLastFailureTime() == null ^ this.getLastFailureTime() == null)
            return false;
        if (other.getLastFailureTime() != null
                && other.getLastFailureTime().equals(this.getLastFailureTime()) == false)
            return false;
        if (other.getLastFailureMessage() == null ^ this.getLastFailureMessage() == null)
            return false;
        if (other.getLastFailureMessage() != null
                && other.getLastFailureMessage().equals(this.getLastFailureMessage()) == false)
            return false;
        return true;
    }
}
