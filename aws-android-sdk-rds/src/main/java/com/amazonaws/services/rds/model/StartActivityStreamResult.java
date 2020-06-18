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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

public class StartActivityStreamResult implements Serializable {
    /**
     * <p>
     * The AWS KMS key identifier for encryption of messages in the database
     * activity stream.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The name of the Amazon Kinesis data stream to be used for the database
     * activity stream.
     * </p>
     */
    private String kinesisStreamName;

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stopped, starting, started, stopping
     */
    private String status;

    /**
     * <p>
     * The mode of the database activity stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     */
    private String mode;

    /**
     * <p>
     * Indicates whether or not the database activity stream will start as soon
     * as possible, regardless of the maintenance window for the database.
     * </p>
     */
    private Boolean applyImmediately;

    /**
     * <p>
     * The AWS KMS key identifier for encryption of messages in the database
     * activity stream.
     * </p>
     *
     * @return <p>
     *         The AWS KMS key identifier for encryption of messages in the
     *         database activity stream.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of messages in the database
     * activity stream.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key identifier for encryption of messages in the
     *            database activity stream.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of messages in the database
     * activity stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key identifier for encryption of messages in the
     *            database activity stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartActivityStreamResult withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream to be used for the database
     * activity stream.
     * </p>
     *
     * @return <p>
     *         The name of the Amazon Kinesis data stream to be used for the
     *         database activity stream.
     *         </p>
     */
    public String getKinesisStreamName() {
        return kinesisStreamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream to be used for the database
     * activity stream.
     * </p>
     *
     * @param kinesisStreamName <p>
     *            The name of the Amazon Kinesis data stream to be used for the
     *            database activity stream.
     *            </p>
     */
    public void setKinesisStreamName(String kinesisStreamName) {
        this.kinesisStreamName = kinesisStreamName;
    }

    /**
     * <p>
     * The name of the Amazon Kinesis data stream to be used for the database
     * activity stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kinesisStreamName <p>
     *            The name of the Amazon Kinesis data stream to be used for the
     *            database activity stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartActivityStreamResult withKinesisStreamName(String kinesisStreamName) {
        this.kinesisStreamName = kinesisStreamName;
        return this;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stopped, starting, started, stopping
     *
     * @return <p>
     *         The status of the database activity stream.
     *         </p>
     * @see ActivityStreamStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stopped, starting, started, stopping
     *
     * @param status <p>
     *            The status of the database activity stream.
     *            </p>
     * @see ActivityStreamStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stopped, starting, started, stopping
     *
     * @param status <p>
     *            The status of the database activity stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActivityStreamStatus
     */
    public StartActivityStreamResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stopped, starting, started, stopping
     *
     * @param status <p>
     *            The status of the database activity stream.
     *            </p>
     * @see ActivityStreamStatus
     */
    public void setStatus(ActivityStreamStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the database activity stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stopped, starting, started, stopping
     *
     * @param status <p>
     *            The status of the database activity stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActivityStreamStatus
     */
    public StartActivityStreamResult withStatus(ActivityStreamStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The mode of the database activity stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     *
     * @return <p>
     *         The mode of the database activity stream.
     *         </p>
     * @see ActivityStreamMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * The mode of the database activity stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     *
     * @param mode <p>
     *            The mode of the database activity stream.
     *            </p>
     * @see ActivityStreamMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The mode of the database activity stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     *
     * @param mode <p>
     *            The mode of the database activity stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActivityStreamMode
     */
    public StartActivityStreamResult withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * The mode of the database activity stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     *
     * @param mode <p>
     *            The mode of the database activity stream.
     *            </p>
     * @see ActivityStreamMode
     */
    public void setMode(ActivityStreamMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * The mode of the database activity stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>sync, async
     *
     * @param mode <p>
     *            The mode of the database activity stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActivityStreamMode
     */
    public StartActivityStreamResult withMode(ActivityStreamMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the database activity stream will start as soon
     * as possible, regardless of the maintenance window for the database.
     * </p>
     *
     * @return <p>
     *         Indicates whether or not the database activity stream will start
     *         as soon as possible, regardless of the maintenance window for the
     *         database.
     *         </p>
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * Indicates whether or not the database activity stream will start as soon
     * as possible, regardless of the maintenance window for the database.
     * </p>
     *
     * @return <p>
     *         Indicates whether or not the database activity stream will start
     *         as soon as possible, regardless of the maintenance window for the
     *         database.
     *         </p>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * Indicates whether or not the database activity stream will start as soon
     * as possible, regardless of the maintenance window for the database.
     * </p>
     *
     * @param applyImmediately <p>
     *            Indicates whether or not the database activity stream will
     *            start as soon as possible, regardless of the maintenance
     *            window for the database.
     *            </p>
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Indicates whether or not the database activity stream will start as soon
     * as possible, regardless of the maintenance window for the database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyImmediately <p>
     *            Indicates whether or not the database activity stream will
     *            start as soon as possible, regardless of the maintenance
     *            window for the database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartActivityStreamResult withApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getKinesisStreamName() != null)
            sb.append("KinesisStreamName: " + getKinesisStreamName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getMode() != null)
            sb.append("Mode: " + getMode() + ",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: " + getApplyImmediately());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getKinesisStreamName() == null) ? 0 : getKinesisStreamName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode
                + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartActivityStreamResult == false)
            return false;
        StartActivityStreamResult other = (StartActivityStreamResult) obj;

        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getKinesisStreamName() == null ^ this.getKinesisStreamName() == null)
            return false;
        if (other.getKinesisStreamName() != null
                && other.getKinesisStreamName().equals(this.getKinesisStreamName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null
                && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        return true;
    }
}
