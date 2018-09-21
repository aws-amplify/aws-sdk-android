/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Use to submit events to Pinpoint into multiple regions.
 */
public class PutEventsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the applicationId property for this object.
     */
    private String applicationId;

    /**
     * Batch events to submit
     */
    private java.util.Map<String, EventsBatch> batchItem;

    /**
     * Returns the value of the applicationId property for this object.
     *
     * @return The value of the applicationId property for this object.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of applicationId
     *
     * @param applicationId The new value for the applicationId property for
     *            this object.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets the value of the applicationId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The new value for the applicationId property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutEventsRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Batch events to submit
     *
     * @return Batch events to submit
     */
    public java.util.Map<String, EventsBatch> getBatchItem() {
        return batchItem;
    }

    /**
     * Batch events to submit
     *
     * @param batchItem Batch events to submit
     */
    public void setBatchItem(java.util.Map<String, EventsBatch> batchItem) {
        this.batchItem = batchItem;
    }

    /**
     * Batch events to submit
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param batchItem Batch events to submit
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutEventsRequest withBatchItem(java.util.Map<String, EventsBatch> batchItem) {
        this.batchItem = batchItem;
        return this;
    }

    /**
     * Batch events to submit
     * <p>
     * The method adds a new key-value pair into BatchItem parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into BatchItem.
     * @param value The corresponding value of the entry to be added into
     *            BatchItem.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutEventsRequest addBatchItemEntry(String key, EventsBatch value) {
        if (null == this.batchItem) {
            this.batchItem = new java.util.HashMap<String, EventsBatch>();
        }
        if (this.batchItem.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.batchItem.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BatchItem.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public PutEventsRequest clearBatchItemEntries() {
        this.batchItem = null;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getBatchItem() != null)
            sb.append("BatchItem: " + getBatchItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getBatchItem() == null) ? 0 : getBatchItem().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEventsRequest == false)
            return false;
        PutEventsRequest other = (PutEventsRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getBatchItem() == null ^ this.getBatchItem() == null)
            return false;
        if (other.getBatchItem() != null
                && other.getBatchItem().equals(this.getBatchItem()) == false)
            return false;
        return true;
    }
}
