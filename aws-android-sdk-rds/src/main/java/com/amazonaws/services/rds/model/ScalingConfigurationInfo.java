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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Shows the scaling configuration for an Aurora DB cluster in
 * <code>serverless</code> DB engine mode.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html"
 * >Using Amazon Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
 * </p>
 */
public class ScalingConfigurationInfo implements Serializable {
    /**
     * <p>
     * The maximum capacity for the Aurora DB cluster in <code>serverless</code>
     * DB engine mode.
     * </p>
     */
    private Integer minCapacity;

    /**
     * <p>
     * The maximum capacity for an Aurora DB cluster in <code>serverless</code>
     * DB engine mode.
     * </p>
     */
    private Integer maxCapacity;

    /**
     * <p>
     * A value that indicates whether automatic pause is allowed for the Aurora
     * DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * When the value is set to false for an Aurora Serverless DB cluster, the
     * DB cluster automatically resumes.
     * </p>
     */
    private Boolean autoPause;

    /**
     * <p>
     * The remaining amount of time, in seconds, before the Aurora DB cluster in
     * <code>serverless</code> mode is paused. A DB cluster can be paused only
     * when it's idle (it has no connections).
     * </p>
     */
    private Integer secondsUntilAutoPause;

    /**
     * <p>
     * The timeout action of a call to
     * <code>ModifyCurrentDBClusterCapacity</code>, either
     * <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     */
    private String timeoutAction;

    /**
     * <p>
     * The maximum capacity for the Aurora DB cluster in <code>serverless</code>
     * DB engine mode.
     * </p>
     *
     * @return <p>
     *         The maximum capacity for the Aurora DB cluster in
     *         <code>serverless</code> DB engine mode.
     *         </p>
     */
    public Integer getMinCapacity() {
        return minCapacity;
    }

    /**
     * <p>
     * The maximum capacity for the Aurora DB cluster in <code>serverless</code>
     * DB engine mode.
     * </p>
     *
     * @param minCapacity <p>
     *            The maximum capacity for the Aurora DB cluster in
     *            <code>serverless</code> DB engine mode.
     *            </p>
     */
    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    /**
     * <p>
     * The maximum capacity for the Aurora DB cluster in <code>serverless</code>
     * DB engine mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minCapacity <p>
     *            The maximum capacity for the Aurora DB cluster in
     *            <code>serverless</code> DB engine mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingConfigurationInfo withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * <p>
     * The maximum capacity for an Aurora DB cluster in <code>serverless</code>
     * DB engine mode.
     * </p>
     *
     * @return <p>
     *         The maximum capacity for an Aurora DB cluster in
     *         <code>serverless</code> DB engine mode.
     *         </p>
     */
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * <p>
     * The maximum capacity for an Aurora DB cluster in <code>serverless</code>
     * DB engine mode.
     * </p>
     *
     * @param maxCapacity <p>
     *            The maximum capacity for an Aurora DB cluster in
     *            <code>serverless</code> DB engine mode.
     *            </p>
     */
    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The maximum capacity for an Aurora DB cluster in <code>serverless</code>
     * DB engine mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxCapacity <p>
     *            The maximum capacity for an Aurora DB cluster in
     *            <code>serverless</code> DB engine mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingConfigurationInfo withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether automatic pause is allowed for the Aurora
     * DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * When the value is set to false for an Aurora Serverless DB cluster, the
     * DB cluster automatically resumes.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether automatic pause is allowed for the
     *         Aurora DB cluster in <code>serverless</code> DB engine mode.
     *         </p>
     *         <p>
     *         When the value is set to false for an Aurora Serverless DB
     *         cluster, the DB cluster automatically resumes.
     *         </p>
     */
    public Boolean isAutoPause() {
        return autoPause;
    }

    /**
     * <p>
     * A value that indicates whether automatic pause is allowed for the Aurora
     * DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * When the value is set to false for an Aurora Serverless DB cluster, the
     * DB cluster automatically resumes.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether automatic pause is allowed for the
     *         Aurora DB cluster in <code>serverless</code> DB engine mode.
     *         </p>
     *         <p>
     *         When the value is set to false for an Aurora Serverless DB
     *         cluster, the DB cluster automatically resumes.
     *         </p>
     */
    public Boolean getAutoPause() {
        return autoPause;
    }

    /**
     * <p>
     * A value that indicates whether automatic pause is allowed for the Aurora
     * DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * When the value is set to false for an Aurora Serverless DB cluster, the
     * DB cluster automatically resumes.
     * </p>
     *
     * @param autoPause <p>
     *            A value that indicates whether automatic pause is allowed for
     *            the Aurora DB cluster in <code>serverless</code> DB engine
     *            mode.
     *            </p>
     *            <p>
     *            When the value is set to false for an Aurora Serverless DB
     *            cluster, the DB cluster automatically resumes.
     *            </p>
     */
    public void setAutoPause(Boolean autoPause) {
        this.autoPause = autoPause;
    }

    /**
     * <p>
     * A value that indicates whether automatic pause is allowed for the Aurora
     * DB cluster in <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * When the value is set to false for an Aurora Serverless DB cluster, the
     * DB cluster automatically resumes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoPause <p>
     *            A value that indicates whether automatic pause is allowed for
     *            the Aurora DB cluster in <code>serverless</code> DB engine
     *            mode.
     *            </p>
     *            <p>
     *            When the value is set to false for an Aurora Serverless DB
     *            cluster, the DB cluster automatically resumes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingConfigurationInfo withAutoPause(Boolean autoPause) {
        this.autoPause = autoPause;
        return this;
    }

    /**
     * <p>
     * The remaining amount of time, in seconds, before the Aurora DB cluster in
     * <code>serverless</code> mode is paused. A DB cluster can be paused only
     * when it's idle (it has no connections).
     * </p>
     *
     * @return <p>
     *         The remaining amount of time, in seconds, before the Aurora DB
     *         cluster in <code>serverless</code> mode is paused. A DB cluster
     *         can be paused only when it's idle (it has no connections).
     *         </p>
     */
    public Integer getSecondsUntilAutoPause() {
        return secondsUntilAutoPause;
    }

    /**
     * <p>
     * The remaining amount of time, in seconds, before the Aurora DB cluster in
     * <code>serverless</code> mode is paused. A DB cluster can be paused only
     * when it's idle (it has no connections).
     * </p>
     *
     * @param secondsUntilAutoPause <p>
     *            The remaining amount of time, in seconds, before the Aurora DB
     *            cluster in <code>serverless</code> mode is paused. A DB
     *            cluster can be paused only when it's idle (it has no
     *            connections).
     *            </p>
     */
    public void setSecondsUntilAutoPause(Integer secondsUntilAutoPause) {
        this.secondsUntilAutoPause = secondsUntilAutoPause;
    }

    /**
     * <p>
     * The remaining amount of time, in seconds, before the Aurora DB cluster in
     * <code>serverless</code> mode is paused. A DB cluster can be paused only
     * when it's idle (it has no connections).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secondsUntilAutoPause <p>
     *            The remaining amount of time, in seconds, before the Aurora DB
     *            cluster in <code>serverless</code> mode is paused. A DB
     *            cluster can be paused only when it's idle (it has no
     *            connections).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingConfigurationInfo withSecondsUntilAutoPause(Integer secondsUntilAutoPause) {
        this.secondsUntilAutoPause = secondsUntilAutoPause;
        return this;
    }

    /**
     * <p>
     * The timeout action of a call to
     * <code>ModifyCurrentDBClusterCapacity</code>, either
     * <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     *
     * @return <p>
     *         The timeout action of a call to
     *         <code>ModifyCurrentDBClusterCapacity</code>, either
     *         <code>ForceApplyCapacityChange</code> or
     *         <code>RollbackCapacityChange</code>.
     *         </p>
     */
    public String getTimeoutAction() {
        return timeoutAction;
    }

    /**
     * <p>
     * The timeout action of a call to
     * <code>ModifyCurrentDBClusterCapacity</code>, either
     * <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     *
     * @param timeoutAction <p>
     *            The timeout action of a call to
     *            <code>ModifyCurrentDBClusterCapacity</code>, either
     *            <code>ForceApplyCapacityChange</code> or
     *            <code>RollbackCapacityChange</code>.
     *            </p>
     */
    public void setTimeoutAction(String timeoutAction) {
        this.timeoutAction = timeoutAction;
    }

    /**
     * <p>
     * The timeout action of a call to
     * <code>ModifyCurrentDBClusterCapacity</code>, either
     * <code>ForceApplyCapacityChange</code> or
     * <code>RollbackCapacityChange</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeoutAction <p>
     *            The timeout action of a call to
     *            <code>ModifyCurrentDBClusterCapacity</code>, either
     *            <code>ForceApplyCapacityChange</code> or
     *            <code>RollbackCapacityChange</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingConfigurationInfo withTimeoutAction(String timeoutAction) {
        this.timeoutAction = timeoutAction;
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
        if (getMinCapacity() != null)
            sb.append("MinCapacity: " + getMinCapacity() + ",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: " + getMaxCapacity() + ",");
        if (getAutoPause() != null)
            sb.append("AutoPause: " + getAutoPause() + ",");
        if (getSecondsUntilAutoPause() != null)
            sb.append("SecondsUntilAutoPause: " + getSecondsUntilAutoPause() + ",");
        if (getTimeoutAction() != null)
            sb.append("TimeoutAction: " + getTimeoutAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMinCapacity() == null) ? 0 : getMinCapacity().hashCode());
        hashCode = prime * hashCode
                + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getAutoPause() == null) ? 0 : getAutoPause().hashCode());
        hashCode = prime
                * hashCode
                + ((getSecondsUntilAutoPause() == null) ? 0 : getSecondsUntilAutoPause().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutAction() == null) ? 0 : getTimeoutAction().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingConfigurationInfo == false)
            return false;
        ScalingConfigurationInfo other = (ScalingConfigurationInfo) obj;

        if (other.getMinCapacity() == null ^ this.getMinCapacity() == null)
            return false;
        if (other.getMinCapacity() != null
                && other.getMinCapacity().equals(this.getMinCapacity()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null
                && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getAutoPause() == null ^ this.getAutoPause() == null)
            return false;
        if (other.getAutoPause() != null
                && other.getAutoPause().equals(this.getAutoPause()) == false)
            return false;
        if (other.getSecondsUntilAutoPause() == null ^ this.getSecondsUntilAutoPause() == null)
            return false;
        if (other.getSecondsUntilAutoPause() != null
                && other.getSecondsUntilAutoPause().equals(this.getSecondsUntilAutoPause()) == false)
            return false;
        if (other.getTimeoutAction() == null ^ this.getTimeoutAction() == null)
            return false;
        if (other.getTimeoutAction() != null
                && other.getTimeoutAction().equals(this.getTimeoutAction()) == false)
            return false;
        return true;
    }
}
