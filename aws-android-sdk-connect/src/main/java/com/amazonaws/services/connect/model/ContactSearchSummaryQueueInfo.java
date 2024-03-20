/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * If this contact was queued, this contains information about the queue.
 * </p>
 */
public class ContactSearchSummaryQueueInfo implements Serializable {
    /**
     * <p>
     * The unique identifier for the queue.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The timestamp when the contact was added to the queue.
     * </p>
     */
    private java.util.Date enqueueTimestamp;

    /**
     * <p>
     * The unique identifier for the queue.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the queue.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the queue.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the queue.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactSearchSummaryQueueInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The timestamp when the contact was added to the queue.
     * </p>
     *
     * @return <p>
     *         The timestamp when the contact was added to the queue.
     *         </p>
     */
    public java.util.Date getEnqueueTimestamp() {
        return enqueueTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was added to the queue.
     * </p>
     *
     * @param enqueueTimestamp <p>
     *            The timestamp when the contact was added to the queue.
     *            </p>
     */
    public void setEnqueueTimestamp(java.util.Date enqueueTimestamp) {
        this.enqueueTimestamp = enqueueTimestamp;
    }

    /**
     * <p>
     * The timestamp when the contact was added to the queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enqueueTimestamp <p>
     *            The timestamp when the contact was added to the queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContactSearchSummaryQueueInfo withEnqueueTimestamp(java.util.Date enqueueTimestamp) {
        this.enqueueTimestamp = enqueueTimestamp;
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
        if (getEnqueueTimestamp() != null)
            sb.append("EnqueueTimestamp: " + getEnqueueTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getEnqueueTimestamp() == null) ? 0 : getEnqueueTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactSearchSummaryQueueInfo == false)
            return false;
        ContactSearchSummaryQueueInfo other = (ContactSearchSummaryQueueInfo) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getEnqueueTimestamp() == null ^ this.getEnqueueTimestamp() == null)
            return false;
        if (other.getEnqueueTimestamp() != null
                && other.getEnqueueTimestamp().equals(this.getEnqueueTimestamp()) == false)
            return false;
        return true;
    }
}
