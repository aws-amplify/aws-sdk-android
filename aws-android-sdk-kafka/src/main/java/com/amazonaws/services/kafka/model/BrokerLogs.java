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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

public class BrokerLogs implements Serializable {
    /**
     * The new value for the cloudWatchLogs property for this object.
     */
    private CloudWatchLogs cloudWatchLogs;

    /**
     * The new value for the firehose property for this object.
     */
    private Firehose firehose;

    /**
     * The new value for the s3 property for this object.
     */
    private S3 s3;

    /**
     * Returns the value of the cloudWatchLogs property for this object.
     *
     * @return The value of the cloudWatchLogs property for this object.
     */
    public CloudWatchLogs getCloudWatchLogs() {
        return cloudWatchLogs;
    }

    /**
     * Sets the value of cloudWatchLogs
     *
     * @param cloudWatchLogs The new value for the cloudWatchLogs property for
     *            this object.
     */
    public void setCloudWatchLogs(CloudWatchLogs cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
    }

    /**
     * Sets the value of the cloudWatchLogs property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudWatchLogs The new value for the cloudWatchLogs property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerLogs withCloudWatchLogs(CloudWatchLogs cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
        return this;
    }

    /**
     * Returns the value of the firehose property for this object.
     *
     * @return The value of the firehose property for this object.
     */
    public Firehose getFirehose() {
        return firehose;
    }

    /**
     * Sets the value of firehose
     *
     * @param firehose The new value for the firehose property for this object.
     */
    public void setFirehose(Firehose firehose) {
        this.firehose = firehose;
    }

    /**
     * Sets the value of the firehose property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param firehose The new value for the firehose property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerLogs withFirehose(Firehose firehose) {
        this.firehose = firehose;
        return this;
    }

    /**
     * Returns the value of the s3 property for this object.
     *
     * @return The value of the s3 property for this object.
     */
    public S3 getS3() {
        return s3;
    }

    /**
     * Sets the value of s3
     *
     * @param s3 The new value for the s3 property for this object.
     */
    public void setS3(S3 s3) {
        this.s3 = s3;
    }

    /**
     * Sets the value of the s3 property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3 The new value for the s3 property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerLogs withS3(S3 s3) {
        this.s3 = s3;
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
        if (getCloudWatchLogs() != null)
            sb.append("CloudWatchLogs: " + getCloudWatchLogs() + ",");
        if (getFirehose() != null)
            sb.append("Firehose: " + getFirehose() + ",");
        if (getS3() != null)
            sb.append("S3: " + getS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCloudWatchLogs() == null) ? 0 : getCloudWatchLogs().hashCode());
        hashCode = prime * hashCode + ((getFirehose() == null) ? 0 : getFirehose().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BrokerLogs == false)
            return false;
        BrokerLogs other = (BrokerLogs) obj;

        if (other.getCloudWatchLogs() == null ^ this.getCloudWatchLogs() == null)
            return false;
        if (other.getCloudWatchLogs() != null
                && other.getCloudWatchLogs().equals(this.getCloudWatchLogs()) == false)
            return false;
        if (other.getFirehose() == null ^ this.getFirehose() == null)
            return false;
        if (other.getFirehose() != null && other.getFirehose().equals(this.getFirehose()) == false)
            return false;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        return true;
    }
}
