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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

/**
 * <p>
 * Provides the task status showing a running total of the total number of files
 * to be processed, the number successfully processed, and the number of files
 * the task failed to process.
 * </p>
 */
public class DataRepositoryTaskStatus implements Serializable {
    /**
     * <p>
     * The total number of files that the task will process. While a task is
     * executing, the sum of <code>SucceededCount</code> plus
     * <code>FailedCount</code> may not equal <code>TotalCount</code>. When the
     * task is complete, <code>TotalCount</code> equals the sum of
     * <code>SucceededCount</code> plus <code>FailedCount</code>.
     * </p>
     */
    private Long totalCount;

    /**
     * <p>
     * A running total of the number of files that the task has successfully
     * processed.
     * </p>
     */
    private Long succeededCount;

    /**
     * <p>
     * A running total of the number of files that the task failed to process.
     * </p>
     */
    private Long failedCount;

    /**
     * <p>
     * The time at which the task status was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The total number of files that the task will process. While a task is
     * executing, the sum of <code>SucceededCount</code> plus
     * <code>FailedCount</code> may not equal <code>TotalCount</code>. When the
     * task is complete, <code>TotalCount</code> equals the sum of
     * <code>SucceededCount</code> plus <code>FailedCount</code>.
     * </p>
     *
     * @return <p>
     *         The total number of files that the task will process. While a
     *         task is executing, the sum of <code>SucceededCount</code> plus
     *         <code>FailedCount</code> may not equal <code>TotalCount</code>.
     *         When the task is complete, <code>TotalCount</code> equals the sum
     *         of <code>SucceededCount</code> plus <code>FailedCount</code>.
     *         </p>
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * <p>
     * The total number of files that the task will process. While a task is
     * executing, the sum of <code>SucceededCount</code> plus
     * <code>FailedCount</code> may not equal <code>TotalCount</code>. When the
     * task is complete, <code>TotalCount</code> equals the sum of
     * <code>SucceededCount</code> plus <code>FailedCount</code>.
     * </p>
     *
     * @param totalCount <p>
     *            The total number of files that the task will process. While a
     *            task is executing, the sum of <code>SucceededCount</code> plus
     *            <code>FailedCount</code> may not equal <code>TotalCount</code>
     *            . When the task is complete, <code>TotalCount</code> equals
     *            the sum of <code>SucceededCount</code> plus
     *            <code>FailedCount</code>.
     *            </p>
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of files that the task will process. While a task is
     * executing, the sum of <code>SucceededCount</code> plus
     * <code>FailedCount</code> may not equal <code>TotalCount</code>. When the
     * task is complete, <code>TotalCount</code> equals the sum of
     * <code>SucceededCount</code> plus <code>FailedCount</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalCount <p>
     *            The total number of files that the task will process. While a
     *            task is executing, the sum of <code>SucceededCount</code> plus
     *            <code>FailedCount</code> may not equal <code>TotalCount</code>
     *            . When the task is complete, <code>TotalCount</code> equals
     *            the sum of <code>SucceededCount</code> plus
     *            <code>FailedCount</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTaskStatus withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * <p>
     * A running total of the number of files that the task has successfully
     * processed.
     * </p>
     *
     * @return <p>
     *         A running total of the number of files that the task has
     *         successfully processed.
     *         </p>
     */
    public Long getSucceededCount() {
        return succeededCount;
    }

    /**
     * <p>
     * A running total of the number of files that the task has successfully
     * processed.
     * </p>
     *
     * @param succeededCount <p>
     *            A running total of the number of files that the task has
     *            successfully processed.
     *            </p>
     */
    public void setSucceededCount(Long succeededCount) {
        this.succeededCount = succeededCount;
    }

    /**
     * <p>
     * A running total of the number of files that the task has successfully
     * processed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param succeededCount <p>
     *            A running total of the number of files that the task has
     *            successfully processed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTaskStatus withSucceededCount(Long succeededCount) {
        this.succeededCount = succeededCount;
        return this;
    }

    /**
     * <p>
     * A running total of the number of files that the task failed to process.
     * </p>
     *
     * @return <p>
     *         A running total of the number of files that the task failed to
     *         process.
     *         </p>
     */
    public Long getFailedCount() {
        return failedCount;
    }

    /**
     * <p>
     * A running total of the number of files that the task failed to process.
     * </p>
     *
     * @param failedCount <p>
     *            A running total of the number of files that the task failed to
     *            process.
     *            </p>
     */
    public void setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
    }

    /**
     * <p>
     * A running total of the number of files that the task failed to process.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedCount <p>
     *            A running total of the number of files that the task failed to
     *            process.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTaskStatus withFailedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * <p>
     * The time at which the task status was last updated.
     * </p>
     *
     * @return <p>
     *         The time at which the task status was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The time at which the task status was last updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The time at which the task status was last updated.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time at which the task status was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The time at which the task status was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataRepositoryTaskStatus withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
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
        if (getSucceededCount() != null)
            sb.append("SucceededCount: " + getSucceededCount() + ",");
        if (getFailedCount() != null)
            sb.append("FailedCount: " + getFailedCount() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: " + getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        hashCode = prime * hashCode
                + ((getSucceededCount() == null) ? 0 : getSucceededCount().hashCode());
        hashCode = prime * hashCode
                + ((getFailedCount() == null) ? 0 : getFailedCount().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataRepositoryTaskStatus == false)
            return false;
        DataRepositoryTaskStatus other = (DataRepositoryTaskStatus) obj;

        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null
                && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        if (other.getSucceededCount() == null ^ this.getSucceededCount() == null)
            return false;
        if (other.getSucceededCount() != null
                && other.getSucceededCount().equals(this.getSucceededCount()) == false)
            return false;
        if (other.getFailedCount() == null ^ this.getFailedCount() == null)
            return false;
        if (other.getFailedCount() != null
                && other.getFailedCount().equals(this.getFailedCount()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }
}
