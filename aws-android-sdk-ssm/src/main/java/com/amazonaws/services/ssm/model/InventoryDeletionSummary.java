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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the delete operation.
 * </p>
 */
public class InventoryDeletionSummary implements Serializable {
    /**
     * <p>
     * The total number of items to delete. This count does not change during
     * the delete operation.
     * </p>
     */
    private Integer totalCount;

    /**
     * <p>
     * Remaining number of items to delete.
     * </p>
     */
    private Integer remainingCount;

    /**
     * <p>
     * A list of counts and versions for deleted items.
     * </p>
     */
    private java.util.List<InventoryDeletionSummaryItem> summaryItems;

    /**
     * <p>
     * The total number of items to delete. This count does not change during
     * the delete operation.
     * </p>
     *
     * @return <p>
     *         The total number of items to delete. This count does not change
     *         during the delete operation.
     *         </p>
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * <p>
     * The total number of items to delete. This count does not change during
     * the delete operation.
     * </p>
     *
     * @param totalCount <p>
     *            The total number of items to delete. This count does not
     *            change during the delete operation.
     *            </p>
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of items to delete. This count does not change during
     * the delete operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalCount <p>
     *            The total number of items to delete. This count does not
     *            change during the delete operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryDeletionSummary withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * <p>
     * Remaining number of items to delete.
     * </p>
     *
     * @return <p>
     *         Remaining number of items to delete.
     *         </p>
     */
    public Integer getRemainingCount() {
        return remainingCount;
    }

    /**
     * <p>
     * Remaining number of items to delete.
     * </p>
     *
     * @param remainingCount <p>
     *            Remaining number of items to delete.
     *            </p>
     */
    public void setRemainingCount(Integer remainingCount) {
        this.remainingCount = remainingCount;
    }

    /**
     * <p>
     * Remaining number of items to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param remainingCount <p>
     *            Remaining number of items to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryDeletionSummary withRemainingCount(Integer remainingCount) {
        this.remainingCount = remainingCount;
        return this;
    }

    /**
     * <p>
     * A list of counts and versions for deleted items.
     * </p>
     *
     * @return <p>
     *         A list of counts and versions for deleted items.
     *         </p>
     */
    public java.util.List<InventoryDeletionSummaryItem> getSummaryItems() {
        return summaryItems;
    }

    /**
     * <p>
     * A list of counts and versions for deleted items.
     * </p>
     *
     * @param summaryItems <p>
     *            A list of counts and versions for deleted items.
     *            </p>
     */
    public void setSummaryItems(java.util.Collection<InventoryDeletionSummaryItem> summaryItems) {
        if (summaryItems == null) {
            this.summaryItems = null;
            return;
        }

        this.summaryItems = new java.util.ArrayList<InventoryDeletionSummaryItem>(summaryItems);
    }

    /**
     * <p>
     * A list of counts and versions for deleted items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summaryItems <p>
     *            A list of counts and versions for deleted items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryDeletionSummary withSummaryItems(InventoryDeletionSummaryItem... summaryItems) {
        if (getSummaryItems() == null) {
            this.summaryItems = new java.util.ArrayList<InventoryDeletionSummaryItem>(
                    summaryItems.length);
        }
        for (InventoryDeletionSummaryItem value : summaryItems) {
            this.summaryItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of counts and versions for deleted items.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summaryItems <p>
     *            A list of counts and versions for deleted items.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InventoryDeletionSummary withSummaryItems(
            java.util.Collection<InventoryDeletionSummaryItem> summaryItems) {
        setSummaryItems(summaryItems);
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
        if (getTotalCount() != null)
            sb.append("TotalCount: " + getTotalCount() + ",");
        if (getRemainingCount() != null)
            sb.append("RemainingCount: " + getRemainingCount() + ",");
        if (getSummaryItems() != null)
            sb.append("SummaryItems: " + getSummaryItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        hashCode = prime * hashCode
                + ((getRemainingCount() == null) ? 0 : getRemainingCount().hashCode());
        hashCode = prime * hashCode
                + ((getSummaryItems() == null) ? 0 : getSummaryItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryDeletionSummary == false)
            return false;
        InventoryDeletionSummary other = (InventoryDeletionSummary) obj;

        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null
                && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        if (other.getRemainingCount() == null ^ this.getRemainingCount() == null)
            return false;
        if (other.getRemainingCount() != null
                && other.getRemainingCount().equals(this.getRemainingCount()) == false)
            return false;
        if (other.getSummaryItems() == null ^ this.getSummaryItems() == null)
            return false;
        if (other.getSummaryItems() != null
                && other.getSummaryItems().equals(this.getSummaryItems()) == false)
            return false;
        return true;
    }
}
