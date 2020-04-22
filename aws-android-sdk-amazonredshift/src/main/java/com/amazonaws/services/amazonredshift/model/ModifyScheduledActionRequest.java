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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies a scheduled action.
 * </p>
 */
public class ModifyScheduledActionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the scheduled action to modify.
     * </p>
     */
    private String scheduledActionName;

    /**
     * <p>
     * A modified JSON format of the scheduled action. For more information
     * about this parameter, see <a>ScheduledAction</a>.
     * </p>
     */
    private ScheduledActionType targetAction;

    /**
     * <p>
     * A modified schedule in either <code>at( )</code> or <code>cron( )</code>
     * format. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     */
    private String schedule;

    /**
     * <p>
     * A different IAM role to assume to run the target action. For more
     * information about this parameter, see <a>ScheduledAction</a>.
     * </p>
     */
    private String iamRole;

    /**
     * <p>
     * A modified description of the scheduled action.
     * </p>
     */
    private String scheduledActionDescription;

    /**
     * <p>
     * A modified start time of the scheduled action. For more information about
     * this parameter, see <a>ScheduledAction</a>.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * A modified end time of the scheduled action. For more information about
     * this parameter, see <a>ScheduledAction</a>.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * A modified enable flag of the scheduled action. If true, the scheduled
     * action is active. If false, the scheduled action is disabled.
     * </p>
     */
    private Boolean enable;

    /**
     * <p>
     * The name of the scheduled action to modify.
     * </p>
     *
     * @return <p>
     *         The name of the scheduled action to modify.
     *         </p>
     */
    public String getScheduledActionName() {
        return scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action to modify.
     * </p>
     *
     * @param scheduledActionName <p>
     *            The name of the scheduled action to modify.
     *            </p>
     */
    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledActionName <p>
     *            The name of the scheduled action to modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionRequest withScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
        return this;
    }

    /**
     * <p>
     * A modified JSON format of the scheduled action. For more information
     * about this parameter, see <a>ScheduledAction</a>.
     * </p>
     *
     * @return <p>
     *         A modified JSON format of the scheduled action. For more
     *         information about this parameter, see <a>ScheduledAction</a>.
     *         </p>
     */
    public ScheduledActionType getTargetAction() {
        return targetAction;
    }

    /**
     * <p>
     * A modified JSON format of the scheduled action. For more information
     * about this parameter, see <a>ScheduledAction</a>.
     * </p>
     *
     * @param targetAction <p>
     *            A modified JSON format of the scheduled action. For more
     *            information about this parameter, see <a>ScheduledAction</a>.
     *            </p>
     */
    public void setTargetAction(ScheduledActionType targetAction) {
        this.targetAction = targetAction;
    }

    /**
     * <p>
     * A modified JSON format of the scheduled action. For more information
     * about this parameter, see <a>ScheduledAction</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetAction <p>
     *            A modified JSON format of the scheduled action. For more
     *            information about this parameter, see <a>ScheduledAction</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionRequest withTargetAction(ScheduledActionType targetAction) {
        this.targetAction = targetAction;
        return this;
    }

    /**
     * <p>
     * A modified schedule in either <code>at( )</code> or <code>cron( )</code>
     * format. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     *
     * @return <p>
     *         A modified schedule in either <code>at( )</code> or
     *         <code>cron( )</code> format. For more information about this
     *         parameter, see <a>ScheduledAction</a>.
     *         </p>
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * <p>
     * A modified schedule in either <code>at( )</code> or <code>cron( )</code>
     * format. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     *
     * @param schedule <p>
     *            A modified schedule in either <code>at( )</code> or
     *            <code>cron( )</code> format. For more information about this
     *            parameter, see <a>ScheduledAction</a>.
     *            </p>
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * A modified schedule in either <code>at( )</code> or <code>cron( )</code>
     * format. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schedule <p>
     *            A modified schedule in either <code>at( )</code> or
     *            <code>cron( )</code> format. For more information about this
     *            parameter, see <a>ScheduledAction</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionRequest withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * <p>
     * A different IAM role to assume to run the target action. For more
     * information about this parameter, see <a>ScheduledAction</a>.
     * </p>
     *
     * @return <p>
     *         A different IAM role to assume to run the target action. For more
     *         information about this parameter, see <a>ScheduledAction</a>.
     *         </p>
     */
    public String getIamRole() {
        return iamRole;
    }

    /**
     * <p>
     * A different IAM role to assume to run the target action. For more
     * information about this parameter, see <a>ScheduledAction</a>.
     * </p>
     *
     * @param iamRole <p>
     *            A different IAM role to assume to run the target action. For
     *            more information about this parameter, see
     *            <a>ScheduledAction</a>.
     *            </p>
     */
    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * A different IAM role to assume to run the target action. For more
     * information about this parameter, see <a>ScheduledAction</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamRole <p>
     *            A different IAM role to assume to run the target action. For
     *            more information about this parameter, see
     *            <a>ScheduledAction</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionRequest withIamRole(String iamRole) {
        this.iamRole = iamRole;
        return this;
    }

    /**
     * <p>
     * A modified description of the scheduled action.
     * </p>
     *
     * @return <p>
     *         A modified description of the scheduled action.
     *         </p>
     */
    public String getScheduledActionDescription() {
        return scheduledActionDescription;
    }

    /**
     * <p>
     * A modified description of the scheduled action.
     * </p>
     *
     * @param scheduledActionDescription <p>
     *            A modified description of the scheduled action.
     *            </p>
     */
    public void setScheduledActionDescription(String scheduledActionDescription) {
        this.scheduledActionDescription = scheduledActionDescription;
    }

    /**
     * <p>
     * A modified description of the scheduled action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledActionDescription <p>
     *            A modified description of the scheduled action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionRequest withScheduledActionDescription(
            String scheduledActionDescription) {
        this.scheduledActionDescription = scheduledActionDescription;
        return this;
    }

    /**
     * <p>
     * A modified start time of the scheduled action. For more information about
     * this parameter, see <a>ScheduledAction</a>.
     * </p>
     *
     * @return <p>
     *         A modified start time of the scheduled action. For more
     *         information about this parameter, see <a>ScheduledAction</a>.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * A modified start time of the scheduled action. For more information about
     * this parameter, see <a>ScheduledAction</a>.
     * </p>
     *
     * @param startTime <p>
     *            A modified start time of the scheduled action. For more
     *            information about this parameter, see <a>ScheduledAction</a>.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A modified start time of the scheduled action. For more information about
     * this parameter, see <a>ScheduledAction</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            A modified start time of the scheduled action. For more
     *            information about this parameter, see <a>ScheduledAction</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * A modified end time of the scheduled action. For more information about
     * this parameter, see <a>ScheduledAction</a>.
     * </p>
     *
     * @return <p>
     *         A modified end time of the scheduled action. For more information
     *         about this parameter, see <a>ScheduledAction</a>.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * A modified end time of the scheduled action. For more information about
     * this parameter, see <a>ScheduledAction</a>.
     * </p>
     *
     * @param endTime <p>
     *            A modified end time of the scheduled action. For more
     *            information about this parameter, see <a>ScheduledAction</a>.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * A modified end time of the scheduled action. For more information about
     * this parameter, see <a>ScheduledAction</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            A modified end time of the scheduled action. For more
     *            information about this parameter, see <a>ScheduledAction</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * A modified enable flag of the scheduled action. If true, the scheduled
     * action is active. If false, the scheduled action is disabled.
     * </p>
     *
     * @return <p>
     *         A modified enable flag of the scheduled action. If true, the
     *         scheduled action is active. If false, the scheduled action is
     *         disabled.
     *         </p>
     */
    public Boolean isEnable() {
        return enable;
    }

    /**
     * <p>
     * A modified enable flag of the scheduled action. If true, the scheduled
     * action is active. If false, the scheduled action is disabled.
     * </p>
     *
     * @return <p>
     *         A modified enable flag of the scheduled action. If true, the
     *         scheduled action is active. If false, the scheduled action is
     *         disabled.
     *         </p>
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * <p>
     * A modified enable flag of the scheduled action. If true, the scheduled
     * action is active. If false, the scheduled action is disabled.
     * </p>
     *
     * @param enable <p>
     *            A modified enable flag of the scheduled action. If true, the
     *            scheduled action is active. If false, the scheduled action is
     *            disabled.
     *            </p>
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * <p>
     * A modified enable flag of the scheduled action. If true, the scheduled
     * action is active. If false, the scheduled action is disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enable <p>
     *            A modified enable flag of the scheduled action. If true, the
     *            scheduled action is active. If false, the scheduled action is
     *            disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyScheduledActionRequest withEnable(Boolean enable) {
        this.enable = enable;
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
        if (getScheduledActionName() != null)
            sb.append("ScheduledActionName: " + getScheduledActionName() + ",");
        if (getTargetAction() != null)
            sb.append("TargetAction: " + getTargetAction() + ",");
        if (getSchedule() != null)
            sb.append("Schedule: " + getSchedule() + ",");
        if (getIamRole() != null)
            sb.append("IamRole: " + getIamRole() + ",");
        if (getScheduledActionDescription() != null)
            sb.append("ScheduledActionDescription: " + getScheduledActionDescription() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getEnable() != null)
            sb.append("Enable: " + getEnable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getScheduledActionName() == null) ? 0 : getScheduledActionName().hashCode());
        hashCode = prime * hashCode
                + ((getTargetAction() == null) ? 0 : getTargetAction().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime
                * hashCode
                + ((getScheduledActionDescription() == null) ? 0 : getScheduledActionDescription()
                        .hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getEnable() == null) ? 0 : getEnable().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyScheduledActionRequest == false)
            return false;
        ModifyScheduledActionRequest other = (ModifyScheduledActionRequest) obj;

        if (other.getScheduledActionName() == null ^ this.getScheduledActionName() == null)
            return false;
        if (other.getScheduledActionName() != null
                && other.getScheduledActionName().equals(this.getScheduledActionName()) == false)
            return false;
        if (other.getTargetAction() == null ^ this.getTargetAction() == null)
            return false;
        if (other.getTargetAction() != null
                && other.getTargetAction().equals(this.getTargetAction()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
            return false;
        if (other.getScheduledActionDescription() == null
                ^ this.getScheduledActionDescription() == null)
            return false;
        if (other.getScheduledActionDescription() != null
                && other.getScheduledActionDescription().equals(
                        this.getScheduledActionDescription()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getEnable() == null ^ this.getEnable() == null)
            return false;
        if (other.getEnable() != null && other.getEnable().equals(this.getEnable()) == false)
            return false;
        return true;
    }
}
