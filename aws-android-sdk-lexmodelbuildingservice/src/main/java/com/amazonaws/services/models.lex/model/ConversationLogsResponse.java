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
 * Contains information about conversation log settings.
 * </p>
 */
public class ConversationLogsResponse implements Serializable {
    /**
     * <p>
     * The settings for your conversation logs. You can log text, audio, or
     * both.
     * </p>
     */
    private java.util.List<LogSettingsResponse> logSettings;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to write your logs to
     * CloudWatch Logs or an S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>^arn:[\w\-]+:iam::[\d]{12}:role/.+$<br/>
     */
    private String iamRoleArn;

    /**
     * <p>
     * The settings for your conversation logs. You can log text, audio, or
     * both.
     * </p>
     *
     * @return <p>
     *         The settings for your conversation logs. You can log text, audio,
     *         or both.
     *         </p>
     */
    public java.util.List<LogSettingsResponse> getLogSettings() {
        return logSettings;
    }

    /**
     * <p>
     * The settings for your conversation logs. You can log text, audio, or
     * both.
     * </p>
     *
     * @param logSettings <p>
     *            The settings for your conversation logs. You can log text,
     *            audio, or both.
     *            </p>
     */
    public void setLogSettings(java.util.Collection<LogSettingsResponse> logSettings) {
        if (logSettings == null) {
            this.logSettings = null;
            return;
        }

        this.logSettings = new java.util.ArrayList<LogSettingsResponse>(logSettings);
    }

    /**
     * <p>
     * The settings for your conversation logs. You can log text, audio, or
     * both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logSettings <p>
     *            The settings for your conversation logs. You can log text,
     *            audio, or both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConversationLogsResponse withLogSettings(LogSettingsResponse... logSettings) {
        if (getLogSettings() == null) {
            this.logSettings = new java.util.ArrayList<LogSettingsResponse>(logSettings.length);
        }
        for (LogSettingsResponse value : logSettings) {
            this.logSettings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The settings for your conversation logs. You can log text, audio, or
     * both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logSettings <p>
     *            The settings for your conversation logs. You can log text,
     *            audio, or both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConversationLogsResponse withLogSettings(
            java.util.Collection<LogSettingsResponse> logSettings) {
        setLogSettings(logSettings);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to write your logs to
     * CloudWatch Logs or an S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>^arn:[\w\-]+:iam::[\d]{12}:role/.+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role used to write your
     *         logs to CloudWatch Logs or an S3 bucket.
     *         </p>
     */
    public String getIamRoleArn() {
        return iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to write your logs to
     * CloudWatch Logs or an S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>^arn:[\w\-]+:iam::[\d]{12}:role/.+$<br/>
     *
     * @param iamRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role used to write
     *            your logs to CloudWatch Logs or an S3 bucket.
     *            </p>
     */
    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to write your logs to
     * CloudWatch Logs or an S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>^arn:[\w\-]+:iam::[\d]{12}:role/.+$<br/>
     *
     * @param iamRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role used to write
     *            your logs to CloudWatch Logs or an S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConversationLogsResponse withIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
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
        if (getLogSettings() != null)
            sb.append("logSettings: " + getLogSettings() + ",");
        if (getIamRoleArn() != null)
            sb.append("iamRoleArn: " + getIamRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLogSettings() == null) ? 0 : getLogSettings().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConversationLogsResponse == false)
            return false;
        ConversationLogsResponse other = (ConversationLogsResponse) obj;

        if (other.getLogSettings() == null ^ this.getLogSettings() == null)
            return false;
        if (other.getLogSettings() != null
                && other.getLogSettings().equals(this.getLogSettings()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null
                && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        return true;
    }
}
