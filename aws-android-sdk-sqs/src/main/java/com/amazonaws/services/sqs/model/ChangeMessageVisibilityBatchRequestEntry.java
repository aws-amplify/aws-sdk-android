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

package com.amazonaws.services.sqs.model;

import java.io.Serializable;

/**
 * <p>
 * Encloses a receipt handle and an entry id for each message in
 * <code> <a>ChangeMessageVisibilityBatch</a>.</code>
 * </p>
 * <important>
 * <p>
 * All of the following list parameters must be prefixed with
 * <code>ChangeMessageVisibilityBatchRequestEntry.n</code>, where <code>n</code>
 * is an integer value starting with <code>1</code>. For example, a parameter
 * list for this action might look like this:
 * </p>
 * </important>
 * <p>
 * <code>&amp;ChangeMessageVisibilityBatchRequestEntry.1.Id=change_visibility_msg_2</code>
 * </p>
 * <p>
 * <code>&amp;ChangeMessageVisibilityBatchRequestEntry.1.ReceiptHandle=your_receipt_handle</code>
 * </p>
 * <p>
 * <code>&amp;ChangeMessageVisibilityBatchRequestEntry.1.VisibilityTimeout=45</code>
 * </p>
 */
public class ChangeMessageVisibilityBatchRequestEntry implements Serializable {
    /**
     * <p>
     * An identifier for this particular receipt handle used to communicate the
     * result.
     * </p>
     * <note>
     * <p>
     * The <code>Id</code>s of a batch request need to be unique within a
     * request.
     * </p>
     * <p>
     * This identifier can have up to 80 characters. The following characters
     * are accepted: alphanumeric characters, hyphens(-), and underscores (_).
     * </p>
     * </note>
     */
    private String id;

    /**
     * <p>
     * A receipt handle.
     * </p>
     */
    private String receiptHandle;

    /**
     * <p>
     * The new value (in seconds) for the message's visibility timeout.
     * </p>
     */
    private Integer visibilityTimeout;

    /**
     * <p>
     * An identifier for this particular receipt handle used to communicate the
     * result.
     * </p>
     * <note>
     * <p>
     * The <code>Id</code>s of a batch request need to be unique within a
     * request.
     * </p>
     * <p>
     * This identifier can have up to 80 characters. The following characters
     * are accepted: alphanumeric characters, hyphens(-), and underscores (_).
     * </p>
     * </note>
     *
     * @return <p>
     *         An identifier for this particular receipt handle used to
     *         communicate the result.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>Id</code>s of a batch request need to be unique within
     *         a request.
     *         </p>
     *         <p>
     *         This identifier can have up to 80 characters. The following
     *         characters are accepted: alphanumeric characters, hyphens(-), and
     *         underscores (_).
     *         </p>
     *         </note>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * An identifier for this particular receipt handle used to communicate the
     * result.
     * </p>
     * <note>
     * <p>
     * The <code>Id</code>s of a batch request need to be unique within a
     * request.
     * </p>
     * <p>
     * This identifier can have up to 80 characters. The following characters
     * are accepted: alphanumeric characters, hyphens(-), and underscores (_).
     * </p>
     * </note>
     *
     * @param id <p>
     *            An identifier for this particular receipt handle used to
     *            communicate the result.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Id</code>s of a batch request need to be unique
     *            within a request.
     *            </p>
     *            <p>
     *            This identifier can have up to 80 characters. The following
     *            characters are accepted: alphanumeric characters, hyphens(-),
     *            and underscores (_).
     *            </p>
     *            </note>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * An identifier for this particular receipt handle used to communicate the
     * result.
     * </p>
     * <note>
     * <p>
     * The <code>Id</code>s of a batch request need to be unique within a
     * request.
     * </p>
     * <p>
     * This identifier can have up to 80 characters. The following characters
     * are accepted: alphanumeric characters, hyphens(-), and underscores (_).
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            An identifier for this particular receipt handle used to
     *            communicate the result.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>Id</code>s of a batch request need to be unique
     *            within a request.
     *            </p>
     *            <p>
     *            This identifier can have up to 80 characters. The following
     *            characters are accepted: alphanumeric characters, hyphens(-),
     *            and underscores (_).
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeMessageVisibilityBatchRequestEntry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * A receipt handle.
     * </p>
     *
     * @return <p>
     *         A receipt handle.
     *         </p>
     */
    public String getReceiptHandle() {
        return receiptHandle;
    }

    /**
     * <p>
     * A receipt handle.
     * </p>
     *
     * @param receiptHandle <p>
     *            A receipt handle.
     *            </p>
     */
    public void setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
    }

    /**
     * <p>
     * A receipt handle.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param receiptHandle <p>
     *            A receipt handle.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeMessageVisibilityBatchRequestEntry withReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
        return this;
    }

    /**
     * <p>
     * The new value (in seconds) for the message's visibility timeout.
     * </p>
     *
     * @return <p>
     *         The new value (in seconds) for the message's visibility timeout.
     *         </p>
     */
    public Integer getVisibilityTimeout() {
        return visibilityTimeout;
    }

    /**
     * <p>
     * The new value (in seconds) for the message's visibility timeout.
     * </p>
     *
     * @param visibilityTimeout <p>
     *            The new value (in seconds) for the message's visibility
     *            timeout.
     *            </p>
     */
    public void setVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
    }

    /**
     * <p>
     * The new value (in seconds) for the message's visibility timeout.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param visibilityTimeout <p>
     *            The new value (in seconds) for the message's visibility
     *            timeout.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeMessageVisibilityBatchRequestEntry withVisibilityTimeout(Integer visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getReceiptHandle() != null)
            sb.append("ReceiptHandle: " + getReceiptHandle() + ",");
        if (getVisibilityTimeout() != null)
            sb.append("VisibilityTimeout: " + getVisibilityTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getReceiptHandle() == null) ? 0 : getReceiptHandle().hashCode());
        hashCode = prime * hashCode
                + ((getVisibilityTimeout() == null) ? 0 : getVisibilityTimeout().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeMessageVisibilityBatchRequestEntry == false)
            return false;
        ChangeMessageVisibilityBatchRequestEntry other = (ChangeMessageVisibilityBatchRequestEntry) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getReceiptHandle() == null ^ this.getReceiptHandle() == null)
            return false;
        if (other.getReceiptHandle() != null
                && other.getReceiptHandle().equals(this.getReceiptHandle()) == false)
            return false;
        if (other.getVisibilityTimeout() == null ^ this.getVisibilityTimeout() == null)
            return false;
        if (other.getVisibilityTimeout() != null
                && other.getVisibilityTimeout().equals(this.getVisibilityTimeout()) == false)
            return false;
        return true;
    }
}
