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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an action to publish to an Amazon SNS topic.
 * </p>
 */
public class SnsAction implements Serializable {
    /**
     * <p>
     * The ARN of the SNS topic.
     * </p>
     */
    private String targetArn;

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * (Optional) The message format of the message to publish. Accepted values
     * are "JSON" and "RAW". The default value of the attribute is "RAW". SNS
     * uses this setting to determine if the payload should be parsed and
     * relevant platform-specific bits of the payload should be extracted. To
     * read more about SNS message formats, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"
     * >http://docs.aws.amazon.com/sns/latest/dg/json-formats.html</a> refer to
     * their official documentation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, JSON
     */
    private String messageFormat;

    /**
     * <p>
     * The ARN of the SNS topic.
     * </p>
     *
     * @return <p>
     *         The ARN of the SNS topic.
     *         </p>
     */
    public String getTargetArn() {
        return targetArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic.
     * </p>
     *
     * @param targetArn <p>
     *            The ARN of the SNS topic.
     *            </p>
     */
    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetArn <p>
     *            The ARN of the SNS topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnsAction withTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     *
     * @return <p>
     *         The ARN of the IAM role that grants access.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     *
     * @param roleArn <p>
     *            The ARN of the IAM role that grants access.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The ARN of the IAM role that grants access.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SnsAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * (Optional) The message format of the message to publish. Accepted values
     * are "JSON" and "RAW". The default value of the attribute is "RAW". SNS
     * uses this setting to determine if the payload should be parsed and
     * relevant platform-specific bits of the payload should be extracted. To
     * read more about SNS message formats, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"
     * >http://docs.aws.amazon.com/sns/latest/dg/json-formats.html</a> refer to
     * their official documentation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, JSON
     *
     * @return <p>
     *         (Optional) The message format of the message to publish. Accepted
     *         values are "JSON" and "RAW". The default value of the attribute
     *         is "RAW". SNS uses this setting to determine if the payload
     *         should be parsed and relevant platform-specific bits of the
     *         payload should be extracted. To read more about SNS message
     *         formats, see <a href=
     *         "http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"
     *         >http://docs.aws.amazon.com/sns/latest/dg/json-formats.html</a>
     *         refer to their official documentation.
     *         </p>
     * @see MessageFormat
     */
    public String getMessageFormat() {
        return messageFormat;
    }

    /**
     * <p>
     * (Optional) The message format of the message to publish. Accepted values
     * are "JSON" and "RAW". The default value of the attribute is "RAW". SNS
     * uses this setting to determine if the payload should be parsed and
     * relevant platform-specific bits of the payload should be extracted. To
     * read more about SNS message formats, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"
     * >http://docs.aws.amazon.com/sns/latest/dg/json-formats.html</a> refer to
     * their official documentation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, JSON
     *
     * @param messageFormat <p>
     *            (Optional) The message format of the message to publish.
     *            Accepted values are "JSON" and "RAW". The default value of the
     *            attribute is "RAW". SNS uses this setting to determine if the
     *            payload should be parsed and relevant platform-specific bits
     *            of the payload should be extracted. To read more about SNS
     *            message formats, see <a href=
     *            "http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"
     *            >http
     *            ://docs.aws.amazon.com/sns/latest/dg/json-formats.html</a>
     *            refer to their official documentation.
     *            </p>
     * @see MessageFormat
     */
    public void setMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
    }

    /**
     * <p>
     * (Optional) The message format of the message to publish. Accepted values
     * are "JSON" and "RAW". The default value of the attribute is "RAW". SNS
     * uses this setting to determine if the payload should be parsed and
     * relevant platform-specific bits of the payload should be extracted. To
     * read more about SNS message formats, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"
     * >http://docs.aws.amazon.com/sns/latest/dg/json-formats.html</a> refer to
     * their official documentation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, JSON
     *
     * @param messageFormat <p>
     *            (Optional) The message format of the message to publish.
     *            Accepted values are "JSON" and "RAW". The default value of the
     *            attribute is "RAW". SNS uses this setting to determine if the
     *            payload should be parsed and relevant platform-specific bits
     *            of the payload should be extracted. To read more about SNS
     *            message formats, see <a href=
     *            "http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"
     *            >http
     *            ://docs.aws.amazon.com/sns/latest/dg/json-formats.html</a>
     *            refer to their official documentation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageFormat
     */
    public SnsAction withMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
        return this;
    }

    /**
     * <p>
     * (Optional) The message format of the message to publish. Accepted values
     * are "JSON" and "RAW". The default value of the attribute is "RAW". SNS
     * uses this setting to determine if the payload should be parsed and
     * relevant platform-specific bits of the payload should be extracted. To
     * read more about SNS message formats, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"
     * >http://docs.aws.amazon.com/sns/latest/dg/json-formats.html</a> refer to
     * their official documentation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, JSON
     *
     * @param messageFormat <p>
     *            (Optional) The message format of the message to publish.
     *            Accepted values are "JSON" and "RAW". The default value of the
     *            attribute is "RAW". SNS uses this setting to determine if the
     *            payload should be parsed and relevant platform-specific bits
     *            of the payload should be extracted. To read more about SNS
     *            message formats, see <a href=
     *            "http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"
     *            >http
     *            ://docs.aws.amazon.com/sns/latest/dg/json-formats.html</a>
     *            refer to their official documentation.
     *            </p>
     * @see MessageFormat
     */
    public void setMessageFormat(MessageFormat messageFormat) {
        this.messageFormat = messageFormat.toString();
    }

    /**
     * <p>
     * (Optional) The message format of the message to publish. Accepted values
     * are "JSON" and "RAW". The default value of the attribute is "RAW". SNS
     * uses this setting to determine if the payload should be parsed and
     * relevant platform-specific bits of the payload should be extracted. To
     * read more about SNS message formats, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"
     * >http://docs.aws.amazon.com/sns/latest/dg/json-formats.html</a> refer to
     * their official documentation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RAW, JSON
     *
     * @param messageFormat <p>
     *            (Optional) The message format of the message to publish.
     *            Accepted values are "JSON" and "RAW". The default value of the
     *            attribute is "RAW". SNS uses this setting to determine if the
     *            payload should be parsed and relevant platform-specific bits
     *            of the payload should be extracted. To read more about SNS
     *            message formats, see <a href=
     *            "http://docs.aws.amazon.com/sns/latest/dg/json-formats.html"
     *            >http
     *            ://docs.aws.amazon.com/sns/latest/dg/json-formats.html</a>
     *            refer to their official documentation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageFormat
     */
    public SnsAction withMessageFormat(MessageFormat messageFormat) {
        this.messageFormat = messageFormat.toString();
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
        if (getTargetArn() != null)
            sb.append("targetArn: " + getTargetArn() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getMessageFormat() != null)
            sb.append("messageFormat: " + getMessageFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getMessageFormat() == null) ? 0 : getMessageFormat().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnsAction == false)
            return false;
        SnsAction other = (SnsAction) obj;

        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null
                && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getMessageFormat() == null ^ this.getMessageFormat() == null)
            return false;
        if (other.getMessageFormat() != null
                && other.getMessageFormat().equals(this.getMessageFormat()) == false)
            return false;
        return true;
    }
}
