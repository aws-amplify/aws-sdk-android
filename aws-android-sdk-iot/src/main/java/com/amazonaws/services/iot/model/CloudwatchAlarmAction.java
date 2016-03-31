/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The IAM role that allows access to the CloudWatch alarm.
     */
    private String roleArn;

    /**
     * The CloudWatch alarm name.
     */
    private String alarmName;

    /**
     * The reason for the alarm change.
     */
    private String stateReason;

    /**
     * The value of the alarm state. Acceptable values are: OK, ALARM,
     * INSUFFICIENT_DATA.
     */
    private String stateValue;

    /**
     * The IAM role that allows access to the CloudWatch alarm.
     *
     * @return The IAM role that allows access to the CloudWatch alarm.
     */
    public String getRoleArn() {
        return roleArn;
    }
    
    /**
     * The IAM role that allows access to the CloudWatch alarm.
     *
     * @param roleArn The IAM role that allows access to the CloudWatch alarm.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }
    
    /**
     * The IAM role that allows access to the CloudWatch alarm.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param roleArn The IAM role that allows access to the CloudWatch alarm.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CloudwatchAlarmAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * The CloudWatch alarm name.
     *
     * @return The CloudWatch alarm name.
     */
    public String getAlarmName() {
        return alarmName;
    }
    
    /**
     * The CloudWatch alarm name.
     *
     * @param alarmName The CloudWatch alarm name.
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }
    
    /**
     * The CloudWatch alarm name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param alarmName The CloudWatch alarm name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CloudwatchAlarmAction withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * The reason for the alarm change.
     *
     * @return The reason for the alarm change.
     */
    public String getStateReason() {
        return stateReason;
    }
    
    /**
     * The reason for the alarm change.
     *
     * @param stateReason The reason for the alarm change.
     */
    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }
    
    /**
     * The reason for the alarm change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stateReason The reason for the alarm change.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CloudwatchAlarmAction withStateReason(String stateReason) {
        this.stateReason = stateReason;
        return this;
    }

    /**
     * The value of the alarm state. Acceptable values are: OK, ALARM,
     * INSUFFICIENT_DATA.
     *
     * @return The value of the alarm state. Acceptable values are: OK, ALARM,
     *         INSUFFICIENT_DATA.
     */
    public String getStateValue() {
        return stateValue;
    }
    
    /**
     * The value of the alarm state. Acceptable values are: OK, ALARM,
     * INSUFFICIENT_DATA.
     *
     * @param stateValue The value of the alarm state. Acceptable values are: OK, ALARM,
     *         INSUFFICIENT_DATA.
     */
    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }
    
    /**
     * The value of the alarm state. Acceptable values are: OK, ALARM,
     * INSUFFICIENT_DATA.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stateValue The value of the alarm state. Acceptable values are: OK, ALARM,
     *         INSUFFICIENT_DATA.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
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
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() + ",");
        if (getAlarmName() != null) sb.append("AlarmName: " + getAlarmName() + ",");
        if (getStateReason() != null) sb.append("StateReason: " + getStateReason() + ",");
        if (getStateValue() != null) sb.append("StateValue: " + getStateValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode()); 
        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode()); 
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode()); 
        hashCode = prime * hashCode + ((getStateValue() == null) ? 0 : getStateValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CloudwatchAlarmAction == false) return false;
        CloudwatchAlarmAction other = (CloudwatchAlarmAction)obj;
        
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        if (other.getAlarmName() == null ^ this.getAlarmName() == null) return false;
        if (other.getAlarmName() != null && other.getAlarmName().equals(this.getAlarmName()) == false) return false; 
        if (other.getStateReason() == null ^ this.getStateReason() == null) return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false) return false; 
        if (other.getStateValue() == null ^ this.getStateValue() == null) return false;
        if (other.getStateValue() != null && other.getStateValue().equals(this.getStateValue()) == false) return false; 
        return true;
    }
    
}
    