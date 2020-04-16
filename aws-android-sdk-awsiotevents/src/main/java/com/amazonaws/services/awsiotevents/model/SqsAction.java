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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * Sends information about the detector model instance and the event that
 * triggered the action to an Amazon SQS queue.
 * </p>
 */
public class SqsAction implements Serializable {
    /**
     * <p>
     * The URL of the SQS queue where the data is written.
     * </p>
     */
    private String queueUrl;

    /**
     * <p>
     * Set this to TRUE if you want the data to be base-64 encoded before it is
     * written to the queue. Otherwise, set this to FALSE.
     * </p>
     */
    private Boolean useBase64;

    /**
     * <p>
     * You can configure the action payload when you send a message to an Amazon
     * SQS queue.
     * </p>
     */
    private Payload payload;

    /**
     * <p>
     * The URL of the SQS queue where the data is written.
     * </p>
     *
     * @return <p>
     *         The URL of the SQS queue where the data is written.
     *         </p>
     */
    public String getQueueUrl() {
        return queueUrl;
    }

    /**
     * <p>
     * The URL of the SQS queue where the data is written.
     * </p>
     *
     * @param queueUrl <p>
     *            The URL of the SQS queue where the data is written.
     *            </p>
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the SQS queue where the data is written.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueUrl <p>
     *            The URL of the SQS queue where the data is written.
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
     * Set this to TRUE if you want the data to be base-64 encoded before it is
     * written to the queue. Otherwise, set this to FALSE.
     * </p>
     *
     * @return <p>
     *         Set this to TRUE if you want the data to be base-64 encoded
     *         before it is written to the queue. Otherwise, set this to FALSE.
     *         </p>
     */
    public Boolean isUseBase64() {
        return useBase64;
    }

    /**
     * <p>
     * Set this to TRUE if you want the data to be base-64 encoded before it is
     * written to the queue. Otherwise, set this to FALSE.
     * </p>
     *
     * @return <p>
     *         Set this to TRUE if you want the data to be base-64 encoded
     *         before it is written to the queue. Otherwise, set this to FALSE.
     *         </p>
     */
    public Boolean getUseBase64() {
        return useBase64;
    }

    /**
     * <p>
     * Set this to TRUE if you want the data to be base-64 encoded before it is
     * written to the queue. Otherwise, set this to FALSE.
     * </p>
     *
     * @param useBase64 <p>
     *            Set this to TRUE if you want the data to be base-64 encoded
     *            before it is written to the queue. Otherwise, set this to
     *            FALSE.
     *            </p>
     */
    public void setUseBase64(Boolean useBase64) {
        this.useBase64 = useBase64;
    }

    /**
     * <p>
     * Set this to TRUE if you want the data to be base-64 encoded before it is
     * written to the queue. Otherwise, set this to FALSE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useBase64 <p>
     *            Set this to TRUE if you want the data to be base-64 encoded
     *            before it is written to the queue. Otherwise, set this to
     *            FALSE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SqsAction withUseBase64(Boolean useBase64) {
        this.useBase64 = useBase64;
        return this;
    }

    /**
     * <p>
     * You can configure the action payload when you send a message to an Amazon
     * SQS queue.
     * </p>
     *
     * @return <p>
     *         You can configure the action payload when you send a message to
     *         an Amazon SQS queue.
     *         </p>
     */
    public Payload getPayload() {
        return payload;
    }

    /**
     * <p>
     * You can configure the action payload when you send a message to an Amazon
     * SQS queue.
     * </p>
     *
     * @param payload <p>
     *            You can configure the action payload when you send a message
     *            to an Amazon SQS queue.
     *            </p>
     */
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * You can configure the action payload when you send a message to an Amazon
     * SQS queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            You can configure the action payload when you send a message
     *            to an Amazon SQS queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SqsAction withPayload(Payload payload) {
        this.payload = payload;
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
        if (getQueueUrl() != null)
            sb.append("queueUrl: " + getQueueUrl() + ",");
        if (getUseBase64() != null)
            sb.append("useBase64: " + getUseBase64() + ",");
        if (getPayload() != null)
            sb.append("payload: " + getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getUseBase64() == null) ? 0 : getUseBase64().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
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

        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getUseBase64() == null ^ this.getUseBase64() == null)
            return false;
        if (other.getUseBase64() != null
                && other.getUseBase64().equals(this.getUseBase64()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }
}
