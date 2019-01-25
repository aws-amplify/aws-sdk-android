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
 * Describes an action that updates a CloudWatch alarm.
 * </p>
 */
public class CloudwatchAlarmAction implements Serializable {
    /**
     * <p>
     * The IAM role that allows access to the CloudWatch alarm.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The CloudWatch alarm name.
     * </p>
     */
    private String alarmName;

    /**
     * <p>
     * The reason for the alarm change.
     * </p>
     */
    private String stateReason;

    /**
     * <p>
     * The value of the alarm state. Acceptable values are: OK, ALARM,
     * INSUFFICIENT_DATA.
     * </p>
     */
    private String stateValue;

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch alarm.
     * </p>
     *
     * @return <p>
     *         The IAM role that allows access to the CloudWatch alarm.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch alarm.
     * </p>
     *
     * @param roleArn <p>
     *            The IAM role that allows access to the CloudWatch alarm.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The IAM role that allows access to the CloudWatch alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudwatchAlarmAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The CloudWatch alarm name.
     * </p>
     *
     * @return <p>
     *         The CloudWatch alarm name.
     *         </p>
     */
    public String getAlarmName() {
        return alarmName;
    }

    /**
     * <p>
     * The CloudWatch alarm name.
     * </p>
     *
     * @param alarmName <p>
     *            The CloudWatch alarm name.
     *            </p>
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The CloudWatch alarm name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarmName <p>
     *            The CloudWatch alarm name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudwatchAlarmAction withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * <p>
     * The reason for the alarm change.
     * </p>
     *
     * @return <p>
     *         The reason for the alarm change.
     *         </p>
     */
    public String getStateReason() {
        return stateReason;
    }

    /**
     * <p>
     * The reason for the alarm change.
     * </p>
     *
     * @param stateReason <p>
     *            The reason for the alarm change.
     *            </p>
     */
    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason for the alarm change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateReason <p>
     *            The reason for the alarm change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudwatchAlarmAction withStateReason(String stateReason) {
        this.stateReason = stateReason;
        return this;
    }

    /**
     * <p>
     * The value of the alarm state. Acceptable values are: OK, ALARM,
     * INSUFFICIENT_DATA.
     * </p>
     *
     * @return <p>
     *         The value of the alarm state. Acceptable values are: OK, ALARM,
     *         INSUFFICIENT_DATA.
     *         </p>
     */
    public String getStateValue() {
        return stateValue;
    }

    /**
     * <p>
     * The value of the alarm state. Acceptable values are: OK, ALARM,
     * INSUFFICIENT_DATA.
     * </p>
     *
     * @param stateValue <p>
     *            The value of the alarm state. Acceptable values are: OK,
     *            ALARM, INSUFFICIENT_DATA.
     *            </p>
     */
    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    /**
     * <p>
     * The value of the alarm state. Acceptable values are: OK, ALARM,
     * INSUFFICIENT_DATA.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateValue <p>
     *            The value of the alarm state. Acceptable values are: OK,
     *            ALARM, INSUFFICIENT_DATA.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudwatchAlarmAction withStateValue(String stateValue) {
        this.stateValue = stateValue;
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
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getAlarmName() != null)
            sb.append("alarmName: " + getAlarmName() + ",");
        if (getStateReason() != null)
            sb.append("stateReason: " + getStateReason() + ",");
        if (getStateValue() != null)
            sb.append("stateValue: " + getStateValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode
                + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getStateValue() == null) ? 0 : getStateValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudwatchAlarmAction == false)
            return false;
        CloudwatchAlarmAction other = (CloudwatchAlarmAction) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null
                && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null
                && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getStateValue() == null ^ this.getStateValue() == null)
            return false;
        if (other.getStateValue() != null
                && other.getStateValue().equals(this.getStateValue()) == false)
            return false;
        return true;
    }
}
