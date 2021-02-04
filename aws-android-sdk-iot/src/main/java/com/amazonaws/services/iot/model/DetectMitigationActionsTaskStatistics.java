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
 * The statistics of a mitigation action task.
 * </p>
 */
public class DetectMitigationActionsTaskStatistics implements Serializable {
    /**
     * <p>
     * The actions that were performed.
     * </p>
     */
    private Long actionsExecuted;

    /**
     * <p>
     * The actions that were skipped.
     * </p>
     */
    private Long actionsSkipped;

    /**
     * <p>
     * The actions that failed.
     * </p>
     */
    private Long actionsFailed;

    /**
     * <p>
     * The actions that were performed.
     * </p>
     *
     * @return <p>
     *         The actions that were performed.
     *         </p>
     */
    public Long getActionsExecuted() {
        return actionsExecuted;
    }

    /**
     * <p>
     * The actions that were performed.
     * </p>
     *
     * @param actionsExecuted <p>
     *            The actions that were performed.
     *            </p>
     */
    public void setActionsExecuted(Long actionsExecuted) {
        this.actionsExecuted = actionsExecuted;
    }

    /**
     * <p>
     * The actions that were performed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionsExecuted <p>
     *            The actions that were performed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionsTaskStatistics withActionsExecuted(Long actionsExecuted) {
        this.actionsExecuted = actionsExecuted;
        return this;
    }

    /**
     * <p>
     * The actions that were skipped.
     * </p>
     *
     * @return <p>
     *         The actions that were skipped.
     *         </p>
     */
    public Long getActionsSkipped() {
        return actionsSkipped;
    }

    /**
     * <p>
     * The actions that were skipped.
     * </p>
     *
     * @param actionsSkipped <p>
     *            The actions that were skipped.
     *            </p>
     */
    public void setActionsSkipped(Long actionsSkipped) {
        this.actionsSkipped = actionsSkipped;
    }

    /**
     * <p>
     * The actions that were skipped.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionsSkipped <p>
     *            The actions that were skipped.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionsTaskStatistics withActionsSkipped(Long actionsSkipped) {
        this.actionsSkipped = actionsSkipped;
        return this;
    }

    /**
     * <p>
     * The actions that failed.
     * </p>
     *
     * @return <p>
     *         The actions that failed.
     *         </p>
     */
    public Long getActionsFailed() {
        return actionsFailed;
    }

    /**
     * <p>
     * The actions that failed.
     * </p>
     *
     * @param actionsFailed <p>
     *            The actions that failed.
     *            </p>
     */
    public void setActionsFailed(Long actionsFailed) {
        this.actionsFailed = actionsFailed;
    }

    /**
     * <p>
     * The actions that failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionsFailed <p>
     *            The actions that failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectMitigationActionsTaskStatistics withActionsFailed(Long actionsFailed) {
        this.actionsFailed = actionsFailed;
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
        if (getActionsExecuted() != null)
            sb.append("actionsExecuted: " + getActionsExecuted() + ",");
        if (getActionsSkipped() != null)
            sb.append("actionsSkipped: " + getActionsSkipped() + ",");
        if (getActionsFailed() != null)
            sb.append("actionsFailed: " + getActionsFailed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActionsExecuted() == null) ? 0 : getActionsExecuted().hashCode());
        hashCode = prime * hashCode
                + ((getActionsSkipped() == null) ? 0 : getActionsSkipped().hashCode());
        hashCode = prime * hashCode
                + ((getActionsFailed() == null) ? 0 : getActionsFailed().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectMitigationActionsTaskStatistics == false)
            return false;
        DetectMitigationActionsTaskStatistics other = (DetectMitigationActionsTaskStatistics) obj;

        if (other.getActionsExecuted() == null ^ this.getActionsExecuted() == null)
            return false;
        if (other.getActionsExecuted() != null
                && other.getActionsExecuted().equals(this.getActionsExecuted()) == false)
            return false;
        if (other.getActionsSkipped() == null ^ this.getActionsSkipped() == null)
            return false;
        if (other.getActionsSkipped() != null
                && other.getActionsSkipped().equals(this.getActionsSkipped()) == false)
            return false;
        if (other.getActionsFailed() == null ^ this.getActionsFailed() == null)
            return false;
        if (other.getActionsFailed() != null
                && other.getActionsFailed().equals(this.getActionsFailed()) == false)
            return false;
        return true;
    }
}
