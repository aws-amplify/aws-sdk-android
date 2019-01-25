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
 * Describes an action to publish data to an Amazon SQS queue.
 * </p>
 */
public class SqsAction implements Serializable {
    /**
     * <p>
     * The ARN of the IAM role that grants access.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The URL of the Amazon SQS queue.
     * </p>
     */
    private String queueUrl;

    /**
     * <p>
     * Specifies whether to use Base64 encoding.
     * </p>
     */
    private Boolean useBase64;

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
    public SqsAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue.
     * </p>
     *
     * @return <p>
     *         The URL of the Amazon SQS queue.
     *         </p>
     */
    public String getQueueUrl() {
        return queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue.
     * </p>
     *
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue.
     *            </p>
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueUrl <p>
     *            The URL of the Amazon SQS queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SqsAction withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * <p>
     * Specifies whether to use Base64 encoding.
     * </p>
     *
     * @return <p>
     *         Specifies whether to use Base64 encoding.
     *         </p>
     */
    public Boolean isUseBase64() {
        return useBase64;
    }

    /**
     * <p>
     * Specifies whether to use Base64 encoding.
     * </p>
     *
     * @return <p>
     *         Specifies whether to use Base64 encoding.
     *         </p>
     */
    public Boolean getUseBase64() {
        return useBase64;
    }

    /**
     * <p>
     * Specifies whether to use Base64 encoding.
     * </p>
     *
     * @param useBase64 <p>
     *            Specifies whether to use Base64 encoding.
     *            </p>
     */
    public void setUseBase64(Boolean useBase64) {
        this.useBase64 = useBase64;
    }

    /**
     * <p>
     * Specifies whether to use Base64 encoding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useBase64 <p>
     *            Specifies whether to use Base64 encoding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SqsAction withUseBase64(Boolean useBase64) {
        this.useBase64 = useBase64;
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
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getQueueUrl() != null)
            sb.append("queueUrl: " + getQueueUrl() + ",");
        if (getUseBase64() != null)
            sb.append("useBase64: " + getUseBase64());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getUseBase64() == null) ? 0 : getUseBase64().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqsAction == false)
            return false;
        SqsAction other = (SqsAction) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getUseBase64() == null ^ this.getUseBase64() == null)
            return false;
        if (other.getUseBase64() != null
                && other.getUseBase64().equals(this.getUseBase64()) == false)
            return false;
        return true;
    }
}
