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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Either a count, remaining count, or a version number in a delete inventory summary.</p>
 */
public class InventoryDeletionSummaryItem implements Serializable {
    /**
     * <p>The inventory type version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{1,6})(\.[0-9]{1,6})$<br/>
     */
    private String version;

    /**
     * <p>A count of the number of deleted items.</p>
     */
    private Integer count;

    /**
     * <p>The remaining number of items to delete.</p>
     */
    private Integer remainingCount;

    /**
     * <p>The inventory type version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{1,6})(\.[0-9]{1,6})$<br/>
     *
     * @return <p>The inventory type version.</p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>The inventory type version.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{1,6})(\.[0-9]{1,6})$<br/>
     *
     * @param version <p>The inventory type version.</p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>The inventory type version.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([0-9]{1,6})(\.[0-9]{1,6})$<br/>
     *
     * @param version <p>The inventory type version.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InventoryDeletionSummaryItem withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>A count of the number of deleted items.</p>
     *
     * @return <p>A count of the number of deleted items.</p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>A count of the number of deleted items.</p>
     *
     * @param count <p>A count of the number of deleted items.</p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>A count of the number of deleted items.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param count <p>A count of the number of deleted items.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InventoryDeletionSummaryItem withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * <p>The remaining number of items to delete.</p>
     *
     * @return <p>The remaining number of items to delete.</p>
     */
    public Integer getRemainingCount() {
        return remainingCount;
    }

    /**
     * <p>The remaining number of items to delete.</p>
     *
     * @param remainingCount <p>The remaining number of items to delete.</p>
     */
    public void setRemainingCount(Integer remainingCount) {
        this.remainingCount = remainingCount;
    }

    /**
     * <p>The remaining number of items to delete.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param remainingCount <p>The remaining number of items to delete.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public InventoryDeletionSummaryItem withRemainingCount(Integer remainingCount) {
        this.remainingCount = remainingCount;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVersion() != null) sb.append("Version: " + getVersion() + ",");
        if (getCount() != null) sb.append("Count: " + getCount() + ",");
        if (getRemainingCount() != null) sb.append("RemainingCount: " + getRemainingCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getRemainingCount() == null) ? 0 : getRemainingCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InventoryDeletionSummaryItem == false) return false;
        InventoryDeletionSummaryItem other = (InventoryDeletionSummaryItem)obj;

        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false;
        if (other.getCount() == null ^ this.getCount() == null) return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false) return false;
        if (other.getRemainingCount() == null ^ this.getRemainingCount() == null) return false;
        if (other.getRemainingCount() != null && other.getRemainingCount().equals(this.getRemainingCount()) == false) return false;
        return true;
    }
}
