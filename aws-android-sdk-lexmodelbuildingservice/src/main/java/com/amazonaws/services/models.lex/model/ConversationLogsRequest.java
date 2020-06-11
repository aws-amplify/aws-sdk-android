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
 * Provides the settings needed for conversation logs.
 * </p>
 */
public class ConversationLogsRequest implements Serializable {
    /**
     * <p>
     * The settings for your conversation logs. You can log the conversation
     * text, conversation audio, or both.
     * </p>
     */
    private java.util.List<LogSettingsRequest> logSettings;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to write to
     * your CloudWatch Logs for text logs and your S3 bucket for audio logs. If
     * audio encryption is enabled, this role also provides access permission
     * for the AWS KMS key used for encrypting audio logs. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/conversation-logs-role-and-policy.html"
     * >Creating an IAM Role and Policy for Conversation Logs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>^arn:[\w\-]+:iam::[\d]{12}:role/.+$<br/>
     */
    private String iamRoleArn;

    /**
     * <p>
     * The settings for your conversation logs. You can log the conversation
     * text, conversation audio, or both.
     * </p>
     *
     * @return <p>
     *         The settings for your conversation logs. You can log the
     *         conversation text, conversation audio, or both.
     *         </p>
     */
    public java.util.List<LogSettingsRequest> getLogSettings() {
        return logSettings;
    }

    /**
     * <p>
     * The settings for your conversation logs. You can log the conversation
     * text, conversation audio, or both.
     * </p>
     *
     * @param logSettings <p>
     *            The settings for your conversation logs. You can log the
     *            conversation text, conversation audio, or both.
     *            </p>
     */
    public void setLogSettings(java.util.Collection<LogSettingsRequest> logSettings) {
        if (logSettings == null) {
            this.logSettings = null;
            return;
        }

        this.logSettings = new java.util.ArrayList<LogSettingsRequest>(logSettings);
    }

    /**
     * <p>
     * The settings for your conversation logs. You can log the conversation
     * text, conversation audio, or both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logSettings <p>
     *            The settings for your conversation logs. You can log the
     *            conversation text, conversation audio, or both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConversationLogsRequest withLogSettings(LogSettingsRequest... logSettings) {
        if (getLogSettings() == null) {
            this.logSettings = new java.util.ArrayList<LogSettingsRequest>(logSettings.length);
        }
        for (LogSettingsRequest value : logSettings) {
            this.logSettings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The settings for your conversation logs. You can log the conversation
     * text, conversation audio, or both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logSettings <p>
     *            The settings for your conversation logs. You can log the
     *            conversation text, conversation audio, or both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConversationLogsRequest withLogSettings(
            java.util.Collection<LogSettingsRequest> logSettings) {
        setLogSettings(logSettings);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to write to
     * your CloudWatch Logs for text logs and your S3 bucket for audio logs. If
     * audio encryption is enabled, this role also provides access permission
     * for the AWS KMS key used for encrypting audio logs. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/conversation-logs-role-and-policy.html"
     * >Creating an IAM Role and Policy for Conversation Logs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>^arn:[\w\-]+:iam::[\d]{12}:role/.+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an IAM role with permission to
     *         write to your CloudWatch Logs for text logs and your S3 bucket
     *         for audio logs. If audio encryption is enabled, this role also
     *         provides access permission for the AWS KMS key used for
     *         encrypting audio logs. For more information, see <a href=
     *         "https://docs.aws.amazon.com/lex/latest/dg/conversation-logs-role-and-policy.html"
     *         >Creating an IAM Role and Policy for Conversation Logs</a>.
     *         </p>
     */
    public String getIamRoleArn() {
        return iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to write to
     * your CloudWatch Logs for text logs and your S3 bucket for audio logs. If
     * audio encryption is enabled, this role also provides access permission
     * for the AWS KMS key used for encrypting audio logs. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/conversation-logs-role-and-policy.html"
     * >Creating an IAM Role and Policy for Conversation Logs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>^arn:[\w\-]+:iam::[\d]{12}:role/.+$<br/>
     *
     * @param iamRoleArn <p>
     *            The Amazon Resource Name (ARN) of an IAM role with permission
     *            to write to your CloudWatch Logs for text logs and your S3
     *            bucket for audio logs. If audio encryption is enabled, this
     *            role also provides access permission for the AWS KMS key used
     *            for encrypting audio logs. For more information, see <a href=
     *            "https://docs.aws.amazon.com/lex/latest/dg/conversation-logs-role-and-policy.html"
     *            >Creating an IAM Role and Policy for Conversation Logs</a>.
     *            </p>
     */
    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to write to
     * your CloudWatch Logs for text logs and your S3 bucket for audio logs. If
     * audio encryption is enabled, this role also provides access permission
     * for the AWS KMS key used for encrypting audio logs. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/lex/latest/dg/conversation-logs-role-and-policy.html"
     * >Creating an IAM Role and Policy for Conversation Logs</a>.
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
     *            The Amazon Resource Name (ARN) of an IAM role with permission
     *            to write to your CloudWatch Logs for text logs and your S3
     *            bucket for audio logs. If audio encryption is enabled, this
     *            role also provides access permission for the AWS KMS key used
     *            for encrypting audio logs. For more information, see <a href=
     *            "https://docs.aws.amazon.com/lex/latest/dg/conversation-logs-role-and-policy.html"
     *            >Creating an IAM Role and Policy for Conversation Logs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConversationLogsRequest withIamRoleArn(String iamRoleArn) {
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

        if (obj instanceof ConversationLogsRequest == false)
            return false;
        ConversationLogsRequest other = (ConversationLogsRequest) obj;

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
