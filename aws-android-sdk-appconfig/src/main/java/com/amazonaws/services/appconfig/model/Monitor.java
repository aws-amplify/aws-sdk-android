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

package com.amazonaws.services.appconfig.model;

import java.io.Serializable;

/**
 * <p>
 * Amazon CloudWatch alarms to monitor during the deployment process.
 * </p>
 */
public class Monitor implements Serializable {
    /**
     * <p>
     * ARN of the Amazon CloudWatch alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:(aws[a-zA-Z-]*)?:[a-z]+:([a-z]{2}((-gov)|(-iso(b?)))?-
     * [a-z]+-\d{1})?:(\d{12})?:[a-zA-Z0-9-_/:.]+<br/>
     */
    private String alarmArn;

    /**
     * <p>
     * ARN of an IAM role for AppConfig to monitor <code>AlarmArn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^((arn):(aws|aws-cn|aws-iso|aws-iso-[a-z]{1}|aws-us-gov):(
     * iam)::\d{12}:role[/].*)$<br/>
     */
    private String alarmRoleArn;

    /**
     * <p>
     * ARN of the Amazon CloudWatch alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:(aws[a-zA-Z-]*)?:[a-z]+:([a-z]{2}((-gov)|(-iso(b?)))?-
     * [a-z]+-\d{1})?:(\d{12})?:[a-zA-Z0-9-_/:.]+<br/>
     *
     * @return <p>
     *         ARN of the Amazon CloudWatch alarm.
     *         </p>
     */
    public String getAlarmArn() {
        return alarmArn;
    }

    /**
     * <p>
     * ARN of the Amazon CloudWatch alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:(aws[a-zA-Z-]*)?:[a-z]+:([a-z]{2}((-gov)|(-iso(b?)))?-
     * [a-z]+-\d{1})?:(\d{12})?:[a-zA-Z0-9-_/:.]+<br/>
     *
     * @param alarmArn <p>
     *            ARN of the Amazon CloudWatch alarm.
     *            </p>
     */
    public void setAlarmArn(String alarmArn) {
        this.alarmArn = alarmArn;
    }

    /**
     * <p>
     * ARN of the Amazon CloudWatch alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:(aws[a-zA-Z-]*)?:[a-z]+:([a-z]{2}((-gov)|(-iso(b?)))?-
     * [a-z]+-\d{1})?:(\d{12})?:[a-zA-Z0-9-_/:.]+<br/>
     *
     * @param alarmArn <p>
     *            ARN of the Amazon CloudWatch alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Monitor withAlarmArn(String alarmArn) {
        this.alarmArn = alarmArn;
        return this;
    }

    /**
     * <p>
     * ARN of an IAM role for AppConfig to monitor <code>AlarmArn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^((arn):(aws|aws-cn|aws-iso|aws-iso-[a-z]{1}|aws-us-gov):(
     * iam)::\d{12}:role[/].*)$<br/>
     *
     * @return <p>
     *         ARN of an IAM role for AppConfig to monitor <code>AlarmArn</code>
     *         .
     *         </p>
     */
    public String getAlarmRoleArn() {
        return alarmRoleArn;
    }

    /**
     * <p>
     * ARN of an IAM role for AppConfig to monitor <code>AlarmArn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^((arn):(aws|aws-cn|aws-iso|aws-iso-[a-z]{1}|aws-us-gov):(
     * iam)::\d{12}:role[/].*)$<br/>
     *
     * @param alarmRoleArn <p>
     *            ARN of an IAM role for AppConfig to monitor
     *            <code>AlarmArn</code>.
     *            </p>
     */
    public void setAlarmRoleArn(String alarmRoleArn) {
        this.alarmRoleArn = alarmRoleArn;
    }

    /**
     * <p>
     * ARN of an IAM role for AppConfig to monitor <code>AlarmArn</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^((arn):(aws|aws-cn|aws-iso|aws-iso-[a-z]{1}|aws-us-gov):(
     * iam)::\d{12}:role[/].*)$<br/>
     *
     * @param alarmRoleArn <p>
     *            ARN of an IAM role for AppConfig to monitor
     *            <code>AlarmArn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Monitor withAlarmRoleArn(String alarmRoleArn) {
        this.alarmRoleArn = alarmRoleArn;
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
        if (getAlarmArn() != null)
            sb.append("AlarmArn: " + getAlarmArn() + ",");
        if (getAlarmRoleArn() != null)
            sb.append("AlarmRoleArn: " + getAlarmRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmArn() == null) ? 0 : getAlarmArn().hashCode());
        hashCode = prime * hashCode
                + ((getAlarmRoleArn() == null) ? 0 : getAlarmRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Monitor == false)
            return false;
        Monitor other = (Monitor) obj;

        if (other.getAlarmArn() == null ^ this.getAlarmArn() == null)
            return false;
        if (other.getAlarmArn() != null && other.getAlarmArn().equals(this.getAlarmArn()) == false)
            return false;
        if (other.getAlarmRoleArn() == null ^ this.getAlarmRoleArn() == null)
            return false;
        if (other.getAlarmRoleArn() != null
                && other.getAlarmRoleArn().equals(this.getAlarmRoleArn()) == false)
            return false;
        return true;
    }
}
