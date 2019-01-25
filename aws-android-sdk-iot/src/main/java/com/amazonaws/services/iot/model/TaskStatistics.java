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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Statistics for the checks performed during the audit.
 * </p>
 */
public class TaskStatistics implements Serializable {
    /**
     * <p>
     * The number of checks in this audit.
     * </p>
     */
    private Integer totalChecks;

    /**
     * <p>
     * The number of checks in progress.
     * </p>
     */
    private Integer inProgressChecks;

    /**
     * <p>
     * The number of checks waiting for data collection.
     * </p>
     */
    private Integer waitingForDataCollectionChecks;

    /**
     * <p>
     * The number of checks that found compliant resources.
     * </p>
     */
    private Integer compliantChecks;

    /**
     * <p>
     * The number of checks that found non-compliant resources.
     * </p>
     */
    private Integer nonCompliantChecks;

    /**
     * <p>
     * The number of checks
     * </p>
     */
    private Integer failedChecks;

    /**
     * <p>
     * The number of checks that did not run because the audit was canceled.
     * </p>
     */
    private Integer canceledChecks;

    /**
     * <p>
     * The number of checks in this audit.
     * </p>
     *
     * @return <p>
     *         The number of checks in this audit.
     *         </p>
     */
    public Integer getTotalChecks() {
        return totalChecks;
    }

    /**
     * <p>
     * The number of checks in this audit.
     * </p>
     *
     * @param totalChecks <p>
     *            The number of checks in this audit.
     *            </p>
     */
    public void setTotalChecks(Integer totalChecks) {
        this.totalChecks = totalChecks;
    }

    /**
     * <p>
     * The number of checks in this audit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalChecks <p>
     *            The number of checks in this audit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskStatistics withTotalChecks(Integer totalChecks) {
        this.totalChecks = totalChecks;
        return this;
    }

    /**
     * <p>
     * The number of checks in progress.
     * </p>
     *
     * @return <p>
     *         The number of checks in progress.
     *         </p>
     */
    public Integer getInProgressChecks() {
        return inProgressChecks;
    }

    /**
     * <p>
     * The number of checks in progress.
     * </p>
     *
     * @param inProgressChecks <p>
     *            The number of checks in progress.
     *            </p>
     */
    public void setInProgressChecks(Integer inProgressChecks) {
        this.inProgressChecks = inProgressChecks;
    }

    /**
     * <p>
     * The number of checks in progress.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inProgressChecks <p>
     *            The number of checks in progress.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskStatistics withInProgressChecks(Integer inProgressChecks) {
        this.inProgressChecks = inProgressChecks;
        return this;
    }

    /**
     * <p>
     * The number of checks waiting for data collection.
     * </p>
     *
     * @return <p>
     *         The number of checks waiting for data collection.
     *         </p>
     */
    public Integer getWaitingForDataCollectionChecks() {
        return waitingForDataCollectionChecks;
    }

    /**
     * <p>
     * The number of checks waiting for data collection.
     * </p>
     *
     * @param waitingForDataCollectionChecks <p>
     *            The number of checks waiting for data collection.
     *            </p>
     */
    public void setWaitingForDataCollectionChecks(Integer waitingForDataCollectionChecks) {
        this.waitingForDataCollectionChecks = waitingForDataCollectionChecks;
    }

    /**
     * <p>
     * The number of checks waiting for data collection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param waitingForDataCollectionChecks <p>
     *            The number of checks waiting for data collection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskStatistics withWaitingForDataCollectionChecks(Integer waitingForDataCollectionChecks) {
        this.waitingForDataCollectionChecks = waitingForDataCollectionChecks;
        return this;
    }

    /**
     * <p>
     * The number of checks that found compliant resources.
     * </p>
     *
     * @return <p>
     *         The number of checks that found compliant resources.
     *         </p>
     */
    public Integer getCompliantChecks() {
        return compliantChecks;
    }

    /**
     * <p>
     * The number of checks that found compliant resources.
     * </p>
     *
     * @param compliantChecks <p>
     *            The number of checks that found compliant resources.
     *            </p>
     */
    public void setCompliantChecks(Integer compliantChecks) {
        this.compliantChecks = compliantChecks;
    }

    /**
     * <p>
     * The number of checks that found compliant resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compliantChecks <p>
     *            The number of checks that found compliant resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskStatistics withCompliantChecks(Integer compliantChecks) {
        this.compliantChecks = compliantChecks;
        return this;
    }

    /**
     * <p>
     * The number of checks that found non-compliant resources.
     * </p>
     *
     * @return <p>
     *         The number of checks that found non-compliant resources.
     *         </p>
     */
    public Integer getNonCompliantChecks() {
        return nonCompliantChecks;
    }

    /**
     * <p>
     * The number of checks that found non-compliant resources.
     * </p>
     *
     * @param nonCompliantChecks <p>
     *            The number of checks that found non-compliant resources.
     *            </p>
     */
    public void setNonCompliantChecks(Integer nonCompliantChecks) {
        this.nonCompliantChecks = nonCompliantChecks;
    }

    /**
     * <p>
     * The number of checks that found non-compliant resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nonCompliantChecks <p>
     *            The number of checks that found non-compliant resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskStatistics withNonCompliantChecks(Integer nonCompliantChecks) {
        this.nonCompliantChecks = nonCompliantChecks;
        return this;
    }

    /**
     * <p>
     * The number of checks
     * </p>
     *
     * @return <p>
     *         The number of checks
     *         </p>
     */
    public Integer getFailedChecks() {
        return failedChecks;
    }

    /**
     * <p>
     * The number of checks
     * </p>
     *
     * @param failedChecks <p>
     *            The number of checks
     *            </p>
     */
    public void setFailedChecks(Integer failedChecks) {
        this.failedChecks = failedChecks;
    }

    /**
     * <p>
     * The number of checks
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedChecks <p>
     *            The number of checks
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskStatistics withFailedChecks(Integer failedChecks) {
        this.failedChecks = failedChecks;
        return this;
    }

    /**
     * <p>
     * The number of checks that did not run because the audit was canceled.
     * </p>
     *
     * @return <p>
     *         The number of checks that did not run because the audit was
     *         canceled.
     *         </p>
     */
    public Integer getCanceledChecks() {
        return canceledChecks;
    }

    /**
     * <p>
     * The number of checks that did not run because the audit was canceled.
     * </p>
     *
     * @param canceledChecks <p>
     *            The number of checks that did not run because the audit was
     *            canceled.
     *            </p>
     */
    public void setCanceledChecks(Integer canceledChecks) {
        this.canceledChecks = canceledChecks;
    }

    /**
     * <p>
     * The number of checks that did not run because the audit was canceled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param canceledChecks <p>
     *            The number of checks that did not run because the audit was
     *            canceled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskStatistics withCanceledChecks(Integer canceledChecks) {
        this.canceledChecks = canceledChecks;
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
        if (getTotalChecks() != null)
            sb.append("totalChecks: " + getTotalChecks() + ",");
        if (getInProgressChecks() != null)
            sb.append("inProgressChecks: " + getInProgressChecks() + ",");
        if (getWaitingForDataCollectionChecks() != null)
            sb.append("waitingForDataCollectionChecks: " + getWaitingForDataCollectionChecks()
                    + ",");
        if (getCompliantChecks() != null)
            sb.append("compliantChecks: " + getCompliantChecks() + ",");
        if (getNonCompliantChecks() != null)
            sb.append("nonCompliantChecks: " + getNonCompliantChecks() + ",");
        if (getFailedChecks() != null)
            sb.append("failedChecks: " + getFailedChecks() + ",");
        if (getCanceledChecks() != null)
            sb.append("canceledChecks: " + getCanceledChecks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTotalChecks() == null) ? 0 : getTotalChecks().hashCode());
        hashCode = prime * hashCode
                + ((getInProgressChecks() == null) ? 0 : getInProgressChecks().hashCode());
        hashCode = prime
                * hashCode
                + ((getWaitingForDataCollectionChecks() == null) ? 0
                        : getWaitingForDataCollectionChecks().hashCode());
        hashCode = prime * hashCode
                + ((getCompliantChecks() == null) ? 0 : getCompliantChecks().hashCode());
        hashCode = prime * hashCode
                + ((getNonCompliantChecks() == null) ? 0 : getNonCompliantChecks().hashCode());
        hashCode = prime * hashCode
                + ((getFailedChecks() == null) ? 0 : getFailedChecks().hashCode());
        hashCode = prime * hashCode
                + ((getCanceledChecks() == null) ? 0 : getCanceledChecks().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskStatistics == false)
            return false;
        TaskStatistics other = (TaskStatistics) obj;

        if (other.getTotalChecks() == null ^ this.getTotalChecks() == null)
            return false;
        if (other.getTotalChecks() != null
                && other.getTotalChecks().equals(this.getTotalChecks()) == false)
            return false;
        if (other.getInProgressChecks() == null ^ this.getInProgressChecks() == null)
            return false;
        if (other.getInProgressChecks() != null
                && other.getInProgressChecks().equals(this.getInProgressChecks()) == false)
            return false;
        if (other.getWaitingForDataCollectionChecks() == null
                ^ this.getWaitingForDataCollectionChecks() == null)
            return false;
        if (other.getWaitingForDataCollectionChecks() != null
                && other.getWaitingForDataCollectionChecks().equals(
                        this.getWaitingForDataCollectionChecks()) == false)
            return false;
        if (other.getCompliantChecks() == null ^ this.getCompliantChecks() == null)
            return false;
        if (other.getCompliantChecks() != null
                && other.getCompliantChecks().equals(this.getCompliantChecks()) == false)
            return false;
        if (other.getNonCompliantChecks() == null ^ this.getNonCompliantChecks() == null)
            return false;
        if (other.getNonCompliantChecks() != null
                && other.getNonCompliantChecks().equals(this.getNonCompliantChecks()) == false)
            return false;
        if (other.getFailedChecks() == null ^ this.getFailedChecks() == null)
            return false;
        if (other.getFailedChecks() != null
                && other.getFailedChecks().equals(this.getFailedChecks()) == false)
            return false;
        if (other.getCanceledChecks() == null ^ this.getCanceledChecks() == null)
            return false;
        if (other.getCanceledChecks() != null
                && other.getCanceledChecks().equals(this.getCanceledChecks()) == false)
            return false;
        return true;
    }
}
