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
 * <p>An aggregate of step execution statuses displayed in the AWS Console for a multi-Region and multi-account Automation execution.</p>
 */
public class ProgressCounters implements Serializable {
    /**
     * <p>The total number of steps run in all specified AWS Regions and accounts for the current Automation execution.</p>
     */
    private Integer totalSteps;

    /**
     * <p>The total number of steps that successfully completed in all specified AWS Regions and accounts for the current Automation execution.</p>
     */
    private Integer successSteps;

    /**
     * <p>The total number of steps that failed to run in all specified AWS Regions and accounts for the current Automation execution.</p>
     */
    private Integer failedSteps;

    /**
     * <p>The total number of steps that the system cancelled in all specified AWS Regions and accounts for the current Automation execution.</p>
     */
    private Integer cancelledSteps;

    /**
     * <p>The total number of steps that timed out in all specified AWS Regions and accounts for the current Automation execution.</p>
     */
    private Integer timedOutSteps;

    /**
     * <p>The total number of steps run in all specified AWS Regions and accounts for the current Automation execution.</p>
     *
     * @return <p>The total number of steps run in all specified AWS Regions and accounts for the current Automation execution.</p>
     */
    public Integer getTotalSteps() {
        return totalSteps;
    }

    /**
     * <p>The total number of steps run in all specified AWS Regions and accounts for the current Automation execution.</p>
     *
     * @param totalSteps <p>The total number of steps run in all specified AWS Regions and accounts for the current Automation execution.</p>
     */
    public void setTotalSteps(Integer totalSteps) {
        this.totalSteps = totalSteps;
    }

    /**
     * <p>The total number of steps run in all specified AWS Regions and accounts for the current Automation execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param totalSteps <p>The total number of steps run in all specified AWS Regions and accounts for the current Automation execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ProgressCounters withTotalSteps(Integer totalSteps) {
        this.totalSteps = totalSteps;
        return this;
    }

    /**
     * <p>The total number of steps that successfully completed in all specified AWS Regions and accounts for the current Automation execution.</p>
     *
     * @return <p>The total number of steps that successfully completed in all specified AWS Regions and accounts for the current Automation execution.</p>
     */
    public Integer getSuccessSteps() {
        return successSteps;
    }

    /**
     * <p>The total number of steps that successfully completed in all specified AWS Regions and accounts for the current Automation execution.</p>
     *
     * @param successSteps <p>The total number of steps that successfully completed in all specified AWS Regions and accounts for the current Automation execution.</p>
     */
    public void setSuccessSteps(Integer successSteps) {
        this.successSteps = successSteps;
    }

    /**
     * <p>The total number of steps that successfully completed in all specified AWS Regions and accounts for the current Automation execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param successSteps <p>The total number of steps that successfully completed in all specified AWS Regions and accounts for the current Automation execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ProgressCounters withSuccessSteps(Integer successSteps) {
        this.successSteps = successSteps;
        return this;
    }

    /**
     * <p>The total number of steps that failed to run in all specified AWS Regions and accounts for the current Automation execution.</p>
     *
     * @return <p>The total number of steps that failed to run in all specified AWS Regions and accounts for the current Automation execution.</p>
     */
    public Integer getFailedSteps() {
        return failedSteps;
    }

    /**
     * <p>The total number of steps that failed to run in all specified AWS Regions and accounts for the current Automation execution.</p>
     *
     * @param failedSteps <p>The total number of steps that failed to run in all specified AWS Regions and accounts for the current Automation execution.</p>
     */
    public void setFailedSteps(Integer failedSteps) {
        this.failedSteps = failedSteps;
    }

    /**
     * <p>The total number of steps that failed to run in all specified AWS Regions and accounts for the current Automation execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failedSteps <p>The total number of steps that failed to run in all specified AWS Regions and accounts for the current Automation execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ProgressCounters withFailedSteps(Integer failedSteps) {
        this.failedSteps = failedSteps;
        return this;
    }

    /**
     * <p>The total number of steps that the system cancelled in all specified AWS Regions and accounts for the current Automation execution.</p>
     *
     * @return <p>The total number of steps that the system cancelled in all specified AWS Regions and accounts for the current Automation execution.</p>
     */
    public Integer getCancelledSteps() {
        return cancelledSteps;
    }

    /**
     * <p>The total number of steps that the system cancelled in all specified AWS Regions and accounts for the current Automation execution.</p>
     *
     * @param cancelledSteps <p>The total number of steps that the system cancelled in all specified AWS Regions and accounts for the current Automation execution.</p>
     */
    public void setCancelledSteps(Integer cancelledSteps) {
        this.cancelledSteps = cancelledSteps;
    }

    /**
     * <p>The total number of steps that the system cancelled in all specified AWS Regions and accounts for the current Automation execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cancelledSteps <p>The total number of steps that the system cancelled in all specified AWS Regions and accounts for the current Automation execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ProgressCounters withCancelledSteps(Integer cancelledSteps) {
        this.cancelledSteps = cancelledSteps;
        return this;
    }

    /**
     * <p>The total number of steps that timed out in all specified AWS Regions and accounts for the current Automation execution.</p>
     *
     * @return <p>The total number of steps that timed out in all specified AWS Regions and accounts for the current Automation execution.</p>
     */
    public Integer getTimedOutSteps() {
        return timedOutSteps;
    }

    /**
     * <p>The total number of steps that timed out in all specified AWS Regions and accounts for the current Automation execution.</p>
     *
     * @param timedOutSteps <p>The total number of steps that timed out in all specified AWS Regions and accounts for the current Automation execution.</p>
     */
    public void setTimedOutSteps(Integer timedOutSteps) {
        this.timedOutSteps = timedOutSteps;
    }

    /**
     * <p>The total number of steps that timed out in all specified AWS Regions and accounts for the current Automation execution.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timedOutSteps <p>The total number of steps that timed out in all specified AWS Regions and accounts for the current Automation execution.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ProgressCounters withTimedOutSteps(Integer timedOutSteps) {
        this.timedOutSteps = timedOutSteps;
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
        if (getTotalSteps() != null) sb.append("TotalSteps: " + getTotalSteps() + ",");
        if (getSuccessSteps() != null) sb.append("SuccessSteps: " + getSuccessSteps() + ",");
        if (getFailedSteps() != null) sb.append("FailedSteps: " + getFailedSteps() + ",");
        if (getCancelledSteps() != null) sb.append("CancelledSteps: " + getCancelledSteps() + ",");
        if (getTimedOutSteps() != null) sb.append("TimedOutSteps: " + getTimedOutSteps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalSteps() == null) ? 0 : getTotalSteps().hashCode());
        hashCode = prime * hashCode + ((getSuccessSteps() == null) ? 0 : getSuccessSteps().hashCode());
        hashCode = prime * hashCode + ((getFailedSteps() == null) ? 0 : getFailedSteps().hashCode());
        hashCode = prime * hashCode + ((getCancelledSteps() == null) ? 0 : getCancelledSteps().hashCode());
        hashCode = prime * hashCode + ((getTimedOutSteps() == null) ? 0 : getTimedOutSteps().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ProgressCounters == false) return false;
        ProgressCounters other = (ProgressCounters)obj;

        if (other.getTotalSteps() == null ^ this.getTotalSteps() == null) return false;
        if (other.getTotalSteps() != null && other.getTotalSteps().equals(this.getTotalSteps()) == false) return false;
        if (other.getSuccessSteps() == null ^ this.getSuccessSteps() == null) return false;
        if (other.getSuccessSteps() != null && other.getSuccessSteps().equals(this.getSuccessSteps()) == false) return false;
        if (other.getFailedSteps() == null ^ this.getFailedSteps() == null) return false;
        if (other.getFailedSteps() != null && other.getFailedSteps().equals(this.getFailedSteps()) == false) return false;
        if (other.getCancelledSteps() == null ^ this.getCancelledSteps() == null) return false;
        if (other.getCancelledSteps() != null && other.getCancelledSteps().equals(this.getCancelledSteps()) == false) return false;
        if (other.getTimedOutSteps() == null ^ this.getTimedOutSteps() == null) return false;
        if (other.getTimedOutSteps() != null && other.getTimedOutSteps().equals(this.getTimedOutSteps()) == false) return false;
        return true;
    }
}
