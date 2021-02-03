/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides summary counts of how many tasks for findings are in a particular
 * state. This information is included in the response from
 * DescribeAuditMitigationActionsTask.
 * </p>
 */
public class TaskStatisticsForAuditCheck implements Serializable {
    /**
     * <p>
     * The total number of findings to which a task is being applied.
     * </p>
     */
    private Long totalFindingsCount;

    /**
     * <p>
     * The number of findings for which at least one of the actions failed when
     * applied.
     * </p>
     */
    private Long failedFindingsCount;

    /**
     * <p>
     * The number of findings for which all mitigation actions succeeded when
     * applied.
     * </p>
     */
    private Long succeededFindingsCount;

    /**
     * <p>
     * The number of findings skipped because of filter conditions provided in
     * the parameters to the command.
     * </p>
     */
    private Long skippedFindingsCount;

    /**
     * <p>
     * The number of findings to which the mitigation action task was canceled
     * when applied.
     * </p>
     */
    private Long canceledFindingsCount;

    /**
     * <p>
     * The total number of findings to which a task is being applied.
     * </p>
     *
     * @return <p>
     *         The total number of findings to which a task is being applied.
     *         </p>
     */
    public Long getTotalFindingsCount() {
        return totalFindingsCount;
    }

    /**
     * <p>
     * The total number of findings to which a task is being applied.
     * </p>
     *
     * @param totalFindingsCount <p>
     *            The total number of findings to which a task is being applied.
     *            </p>
     */
    public void setTotalFindingsCount(Long totalFindingsCount) {
        this.totalFindingsCount = totalFindingsCount;
    }

    /**
     * <p>
     * The total number of findings to which a task is being applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalFindingsCount <p>
     *            The total number of findings to which a task is being applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskStatisticsForAuditCheck withTotalFindingsCount(Long totalFindingsCount) {
        this.totalFindingsCount = totalFindingsCount;
        return this;
    }

    /**
     * <p>
     * The number of findings for which at least one of the actions failed when
     * applied.
     * </p>
     *
     * @return <p>
     *         The number of findings for which at least one of the actions
     *         failed when applied.
     *         </p>
     */
    public Long getFailedFindingsCount() {
        return failedFindingsCount;
    }

    /**
     * <p>
     * The number of findings for which at least one of the actions failed when
     * applied.
     * </p>
     *
     * @param failedFindingsCount <p>
     *            The number of findings for which at least one of the actions
     *            failed when applied.
     *            </p>
     */
    public void setFailedFindingsCount(Long failedFindingsCount) {
        this.failedFindingsCount = failedFindingsCount;
    }

    /**
     * <p>
     * The number of findings for which at least one of the actions failed when
     * applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedFindingsCount <p>
     *            The number of findings for which at least one of the actions
     *            failed when applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskStatisticsForAuditCheck withFailedFindingsCount(Long failedFindingsCount) {
        this.failedFindingsCount = failedFindingsCount;
        return this;
    }

    /**
     * <p>
     * The number of findings for which all mitigation actions succeeded when
     * applied.
     * </p>
     *
     * @return <p>
     *         The number of findings for which all mitigation actions succeeded
     *         when applied.
     *         </p>
     */
    public Long getSucceededFindingsCount() {
        return succeededFindingsCount;
    }

    /**
     * <p>
     * The number of findings for which all mitigation actions succeeded when
     * applied.
     * </p>
     *
     * @param succeededFindingsCount <p>
     *            The number of findings for which all mitigation actions
     *            succeeded when applied.
     *            </p>
     */
    public void setSucceededFindingsCount(Long succeededFindingsCount) {
        this.succeededFindingsCount = succeededFindingsCount;
    }

    /**
     * <p>
     * The number of findings for which all mitigation actions succeeded when
     * applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param succeededFindingsCount <p>
     *            The number of findings for which all mitigation actions
     *            succeeded when applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskStatisticsForAuditCheck withSucceededFindingsCount(Long succeededFindingsCount) {
        this.succeededFindingsCount = succeededFindingsCount;
        return this;
    }

    /**
     * <p>
     * The number of findings skipped because of filter conditions provided in
     * the parameters to the command.
     * </p>
     *
     * @return <p>
     *         The number of findings skipped because of filter conditions
     *         provided in the parameters to the command.
     *         </p>
     */
    public Long getSkippedFindingsCount() {
        return skippedFindingsCount;
    }

    /**
     * <p>
     * The number of findings skipped because of filter conditions provided in
     * the parameters to the command.
     * </p>
     *
     * @param skippedFindingsCount <p>
     *            The number of findings skipped because of filter conditions
     *            provided in the parameters to the command.
     *            </p>
     */
    public void setSkippedFindingsCount(Long skippedFindingsCount) {
        this.skippedFindingsCount = skippedFindingsCount;
    }

    /**
     * <p>
     * The number of findings skipped because of filter conditions provided in
     * the parameters to the command.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param skippedFindingsCount <p>
     *            The number of findings skipped because of filter conditions
     *            provided in the parameters to the command.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskStatisticsForAuditCheck withSkippedFindingsCount(Long skippedFindingsCount) {
        this.skippedFindingsCount = skippedFindingsCount;
        return this;
    }

    /**
     * <p>
     * The number of findings to which the mitigation action task was canceled
     * when applied.
     * </p>
     *
     * @return <p>
     *         The number of findings to which the mitigation action task was
     *         canceled when applied.
     *         </p>
     */
    public Long getCanceledFindingsCount() {
        return canceledFindingsCount;
    }

    /**
     * <p>
     * The number of findings to which the mitigation action task was canceled
     * when applied.
     * </p>
     *
     * @param canceledFindingsCount <p>
     *            The number of findings to which the mitigation action task was
     *            canceled when applied.
     *            </p>
     */
    public void setCanceledFindingsCount(Long canceledFindingsCount) {
        this.canceledFindingsCount = canceledFindingsCount;
    }

    /**
     * <p>
     * The number of findings to which the mitigation action task was canceled
     * when applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param canceledFindingsCount <p>
     *            The number of findings to which the mitigation action task was
     *            canceled when applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskStatisticsForAuditCheck withCanceledFindingsCount(Long canceledFindingsCount) {
        this.canceledFindingsCount = canceledFindingsCount;
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
        if (getTotalFindingsCount() != null)
            sb.append("totalFindingsCount: " + getTotalFindingsCount() + ",");
        if (getFailedFindingsCount() != null)
            sb.append("failedFindingsCount: " + getFailedFindingsCount() + ",");
        if (getSucceededFindingsCount() != null)
            sb.append("succeededFindingsCount: " + getSucceededFindingsCount() + ",");
        if (getSkippedFindingsCount() != null)
            sb.append("skippedFindingsCount: " + getSkippedFindingsCount() + ",");
        if (getCanceledFindingsCount() != null)
            sb.append("canceledFindingsCount: " + getCanceledFindingsCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTotalFindingsCount() == null) ? 0 : getTotalFindingsCount().hashCode());
        hashCode = prime * hashCode
                + ((getFailedFindingsCount() == null) ? 0 : getFailedFindingsCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getSucceededFindingsCount() == null) ? 0 : getSucceededFindingsCount()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSkippedFindingsCount() == null) ? 0 : getSkippedFindingsCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getCanceledFindingsCount() == null) ? 0 : getCanceledFindingsCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskStatisticsForAuditCheck == false)
            return false;
        TaskStatisticsForAuditCheck other = (TaskStatisticsForAuditCheck) obj;

        if (other.getTotalFindingsCount() == null ^ this.getTotalFindingsCount() == null)
            return false;
        if (other.getTotalFindingsCount() != null
                && other.getTotalFindingsCount().equals(this.getTotalFindingsCount()) == false)
            return false;
        if (other.getFailedFindingsCount() == null ^ this.getFailedFindingsCount() == null)
            return false;
        if (other.getFailedFindingsCount() != null
                && other.getFailedFindingsCount().equals(this.getFailedFindingsCount()) == false)
            return false;
        if (other.getSucceededFindingsCount() == null ^ this.getSucceededFindingsCount() == null)
            return false;
        if (other.getSucceededFindingsCount() != null
                && other.getSucceededFindingsCount().equals(this.getSucceededFindingsCount()) == false)
            return false;
        if (other.getSkippedFindingsCount() == null ^ this.getSkippedFindingsCount() == null)
            return false;
        if (other.getSkippedFindingsCount() != null
                && other.getSkippedFindingsCount().equals(this.getSkippedFindingsCount()) == false)
            return false;
        if (other.getCanceledFindingsCount() == null ^ this.getCanceledFindingsCount() == null)
            return false;
        if (other.getCanceledFindingsCount() != null
                && other.getCanceledFindingsCount().equals(this.getCanceledFindingsCount()) == false)
            return false;
        return true;
    }
}
