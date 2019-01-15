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

package com.amazonaws.services.sqs.model;

import java.io.Serializable;

/**
 * <p>
 * For each message in the batch, the response contains a
 * <a>ChangeMessageVisibilityBatchResultEntry</a> tag if the message succeeds or
 * a <a>BatchResultErrorEntry</a> tag if the message fails.
 * </p>
 */
public class ChangeMessageVisibilityBatchResult implements Serializable {
    /**
     * <p>
     * A list of <a>ChangeMessageVisibilityBatchResultEntry</a> items.
     * </p>
     */
    private java.util.List<ChangeMessageVisibilityBatchResultEntry> successful = new java.util.ArrayList<ChangeMessageVisibilityBatchResultEntry>();

    /**
     * <p>
     * A list of <a>BatchResultErrorEntry</a> items.
     * </p>
     */
    private java.util.List<BatchResultErrorEntry> failed = new java.util.ArrayList<BatchResultErrorEntry>();

    /**
     * <p>
     * A list of <a>ChangeMessageVisibilityBatchResultEntry</a> items.
     * </p>
     *
     * @return <p>
     *         A list of <a>ChangeMessageVisibilityBatchResultEntry</a> items.
     *         </p>
     */
    public java.util.List<ChangeMessageVisibilityBatchResultEntry> getSuccessful() {
        return successful;
    }

    /**
     * <p>
     * A list of <a>ChangeMessageVisibilityBatchResultEntry</a> items.
     * </p>
     *
     * @param successful <p>
     *            A list of <a>ChangeMessageVisibilityBatchResultEntry</a>
     *            items.
     *            </p>
     */
    public void setSuccessful(
            java.util.Collection<ChangeMessageVisibilityBatchResultEntry> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }

        this.successful = new java.util.ArrayList<ChangeMessageVisibilityBatchResultEntry>(
                successful);
    }

    /**
     * <p>
     * A list of <a>ChangeMessageVisibilityBatchResultEntry</a> items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successful <p>
     *            A list of <a>ChangeMessageVisibilityBatchResultEntry</a>
     *            items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeMessageVisibilityBatchResult withSuccessful(
            ChangeMessageVisibilityBatchResultEntry... successful) {
        if (getSuccessful() == null) {
            this.successful = new java.util.ArrayList<ChangeMessageVisibilityBatchResultEntry>(
                    successful.length);
        }
        for (ChangeMessageVisibilityBatchResultEntry value : successful) {
            this.successful.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>ChangeMessageVisibilityBatchResultEntry</a> items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successful <p>
     *            A list of <a>ChangeMessageVisibilityBatchResultEntry</a>
     *            items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeMessageVisibilityBatchResult withSuccessful(
            java.util.Collection<ChangeMessageVisibilityBatchResultEntry> successful) {
        setSuccessful(successful);
        return this;
    }

    /**
     * <p>
     * A list of <a>BatchResultErrorEntry</a> items.
     * </p>
     *
     * @return <p>
     *         A list of <a>BatchResultErrorEntry</a> items.
     *         </p>
     */
    public java.util.List<BatchResultErrorEntry> getFailed() {
        return failed;
    }

    /**
     * <p>
     * A list of <a>BatchResultErrorEntry</a> items.
     * </p>
     *
     * @param failed <p>
     *            A list of <a>BatchResultErrorEntry</a> items.
     *            </p>
     */
    public void setFailed(java.util.Collection<BatchResultErrorEntry> failed) {
        if (failed == null) {
            this.failed = null;
            return;
        }

        this.failed = new java.util.ArrayList<BatchResultErrorEntry>(failed);
    }

    /**
     * <p>
     * A list of <a>BatchResultErrorEntry</a> items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failed <p>
     *            A list of <a>BatchResultErrorEntry</a> items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeMessageVisibilityBatchResult withFailed(BatchResultErrorEntry... failed) {
        if (getFailed() == null) {
            this.failed = new java.util.ArrayList<BatchResultErrorEntry>(failed.length);
        }
        for (BatchResultErrorEntry value : failed) {
            this.failed.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>BatchResultErrorEntry</a> items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failed <p>
     *            A list of <a>BatchResultErrorEntry</a> items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeMessageVisibilityBatchResult withFailed(
            java.util.Collection<BatchResultErrorEntry> failed) {
        setFailed(failed);
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
        if (getSuccessful() != null)
            sb.append("Successful: " + getSuccessful() + ",");
        if (getFailed() != null)
            sb.append("Failed: " + getFailed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeMessageVisibilityBatchResult == false)
            return false;
        ChangeMessageVisibilityBatchResult other = (ChangeMessageVisibilityBatchResult) obj;

        if (other.getSuccessful() == null ^ this.getSuccessful() == null)
            return false;
        if (other.getSuccessful() != null
                && other.getSuccessful().equals(this.getSuccessful()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        return true;
    }
}
