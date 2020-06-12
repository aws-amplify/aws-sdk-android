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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

/**
 * <p>
 * Settings used to configure delivery mode and destination for conversation
 * logs.
 * </p>
 */
public class LogSettingsRequest implements Serializable {
    /**
     * <p>
     * The type of logging to enable. Text logs are delivered to a CloudWatch
     * Logs log group. Audio logs are delivered to an S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUDIO, TEXT
     */
    private String logType;

    /**
     * <p>
     * Where the logs will be delivered. Text logs are delivered to a CloudWatch
     * Logs log group. Audio logs are delivered to an S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUDWATCH_LOGS, S3
     */
    private String destination;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer managed key for
     * encrypting audio logs delivered to an S3 bucket. The key does not apply
     * to CloudWatch Logs and is optional for S3 buckets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:[\w\-]+:kms:[\w\-]+:[\d]{12}:(?:key\/[\w\-]+|alias\/[
     * a-zA-Z0-9:\/_\-]{1,256})$<br/>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3
     * bucket where the logs should be delivered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:[\w\-]+:(?:logs:[\w\-]+:[\d]{12}:log-group:[\.\-_/#A-
     * Za-z0-9]{1,512}(?::\*)?|s3:::[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9])$<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * The type of logging to enable. Text logs are delivered to a CloudWatch
     * Logs log group. Audio logs are delivered to an S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUDIO, TEXT
     *
     * @return <p>
     *         The type of logging to enable. Text logs are delivered to a
     *         CloudWatch Logs log group. Audio logs are delivered to an S3
     *         bucket.
     *         </p>
     * @see LogType
     */
    public String getLogType() {
        return logType;
    }

    /**
     * <p>
     * The type of logging to enable. Text logs are delivered to a CloudWatch
     * Logs log group. Audio logs are delivered to an S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUDIO, TEXT
     *
     * @param logType <p>
     *            The type of logging to enable. Text logs are delivered to a
     *            CloudWatch Logs log group. Audio logs are delivered to an S3
     *            bucket.
     *            </p>
     * @see LogType
     */
    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * <p>
     * The type of logging to enable. Text logs are delivered to a CloudWatch
     * Logs log group. Audio logs are delivered to an S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUDIO, TEXT
     *
     * @param logType <p>
     *            The type of logging to enable. Text logs are delivered to a
     *            CloudWatch Logs log group. Audio logs are delivered to an S3
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogType
     */
    public LogSettingsRequest withLogType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * <p>
     * The type of logging to enable. Text logs are delivered to a CloudWatch
     * Logs log group. Audio logs are delivered to an S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUDIO, TEXT
     *
     * @param logType <p>
     *            The type of logging to enable. Text logs are delivered to a
     *            CloudWatch Logs log group. Audio logs are delivered to an S3
     *            bucket.
     *            </p>
     * @see LogType
     */
    public void setLogType(LogType logType) {
        this.logType = logType.toString();
    }

    /**
     * <p>
     * The type of logging to enable. Text logs are delivered to a CloudWatch
     * Logs log group. Audio logs are delivered to an S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUDIO, TEXT
     *
     * @param logType <p>
     *            The type of logging to enable. Text logs are delivered to a
     *            CloudWatch Logs log group. Audio logs are delivered to an S3
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LogType
     */
    public LogSettingsRequest withLogType(LogType logType) {
        this.logType = logType.toString();
        return this;
    }

    /**
     * <p>
     * Where the logs will be delivered. Text logs are delivered to a CloudWatch
     * Logs log group. Audio logs are delivered to an S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUDWATCH_LOGS, S3
     *
     * @return <p>
     *         Where the logs will be delivered. Text logs are delivered to a
     *         CloudWatch Logs log group. Audio logs are delivered to an S3
     *         bucket.
     *         </p>
     * @see Destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * <p>
     * Where the logs will be delivered. Text logs are delivered to a CloudWatch
     * Logs log group. Audio logs are delivered to an S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUDWATCH_LOGS, S3
     *
     * @param destination <p>
     *            Where the logs will be delivered. Text logs are delivered to a
     *            CloudWatch Logs log group. Audio logs are delivered to an S3
     *            bucket.
     *            </p>
     * @see Destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * Where the logs will be delivered. Text logs are delivered to a CloudWatch
     * Logs log group. Audio logs are delivered to an S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUDWATCH_LOGS, S3
     *
     * @param destination <p>
     *            Where the logs will be delivered. Text logs are delivered to a
     *            CloudWatch Logs log group. Audio logs are delivered to an S3
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Destination
     */
    public LogSettingsRequest withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * <p>
     * Where the logs will be delivered. Text logs are delivered to a CloudWatch
     * Logs log group. Audio logs are delivered to an S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUDWATCH_LOGS, S3
     *
     * @param destination <p>
     *            Where the logs will be delivered. Text logs are delivered to a
     *            CloudWatch Logs log group. Audio logs are delivered to an S3
     *            bucket.
     *            </p>
     * @see Destination
     */
    public void setDestination(Destination destination) {
        this.destination = destination.toString();
    }

    /**
     * <p>
     * Where the logs will be delivered. Text logs are delivered to a CloudWatch
     * Logs log group. Audio logs are delivered to an S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CLOUDWATCH_LOGS, S3
     *
     * @param destination <p>
     *            Where the logs will be delivered. Text logs are delivered to a
     *            CloudWatch Logs log group. Audio logs are delivered to an S3
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Destination
     */
    public LogSettingsRequest withDestination(Destination destination) {
        this.destination = destination.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer managed key for
     * encrypting audio logs delivered to an S3 bucket. The key does not apply
     * to CloudWatch Logs and is optional for S3 buckets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:[\w\-]+:kms:[\w\-]+:[\d]{12}:(?:key\/[\w\-]+|alias\/[
     * a-zA-Z0-9:\/_\-]{1,256})$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS KMS customer managed
     *         key for encrypting audio logs delivered to an S3 bucket. The key
     *         does not apply to CloudWatch Logs and is optional for S3 buckets.
     *         </p>
     */
    public String getKmsKeyArn() {
        return kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer managed key for
     * encrypting audio logs delivered to an S3 bucket. The key does not apply
     * to CloudWatch Logs and is optional for S3 buckets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:[\w\-]+:kms:[\w\-]+:[\d]{12}:(?:key\/[\w\-]+|alias\/[
     * a-zA-Z0-9:\/_\-]{1,256})$<br/>
     *
     * @param kmsKeyArn <p>
     *            The Amazon Resource Name (ARN) of the AWS KMS customer managed
     *            key for encrypting audio logs delivered to an S3 bucket. The
     *            key does not apply to CloudWatch Logs and is optional for S3
     *            buckets.
     *            </p>
     */
    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer managed key for
     * encrypting audio logs delivered to an S3 bucket. The key does not apply
     * to CloudWatch Logs and is optional for S3 buckets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:[\w\-]+:kms:[\w\-]+:[\d]{12}:(?:key\/[\w\-]+|alias\/[
     * a-zA-Z0-9:\/_\-]{1,256})$<br/>
     *
     * @param kmsKeyArn <p>
     *            The Amazon Resource Name (ARN) of the AWS KMS customer managed
     *            key for encrypting audio logs delivered to an S3 bucket. The
     *            key does not apply to CloudWatch Logs and is optional for S3
     *            buckets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogSettingsRequest withKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3
     * bucket where the logs should be delivered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:[\w\-]+:(?:logs:[\w\-]+:[\d]{12}:log-group:[\.\-_/#A-
     * Za-z0-9]{1,512}(?::\*)?|s3:::[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9])$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the CloudWatch Logs log group
     *         or S3 bucket where the logs should be delivered.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3
     * bucket where the logs should be delivered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:[\w\-]+:(?:logs:[\w\-]+:[\d]{12}:log-group:[\.\-_/#A-
     * Za-z0-9]{1,512}(?::\*)?|s3:::[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9])$<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the CloudWatch Logs log
     *            group or S3 bucket where the logs should be delivered.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or S3
     * bucket where the logs should be delivered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:[\w\-]+:(?:logs:[\w\-]+:[\d]{12}:log-group:[\.\-_/#A-
     * Za-z0-9]{1,512}(?::\*)?|s3:::[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9])$<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the CloudWatch Logs log
     *            group or S3 bucket where the logs should be delivered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogSettingsRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
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
        if (getLogType() != null)
            sb.append("logType: " + getLogType() + ",");
        if (getDestination() != null)
            sb.append("destination: " + getDestination() + ",");
        if (getKmsKeyArn() != null)
            sb.append("kmsKeyArn: " + getKmsKeyArn() + ",");
        if (getResourceArn() != null)
            sb.append("resourceArn: " + getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogType() == null) ? 0 : getLogType().hashCode());
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogSettingsRequest == false)
            return false;
        LogSettingsRequest other = (LogSettingsRequest) obj;

        if (other.getLogType() == null ^ this.getLogType() == null)
            return false;
        if (other.getLogType() != null && other.getLogType().equals(this.getLogType()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null
                && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }
}
