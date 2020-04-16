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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * Information needed to set the timer.
 * </p>
 */
public class SetTimerAction implements Serializable {
    /**
     * <p>
     * The name of the timer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String timerName;

    /**
     * <p>
     * The number of seconds until the timer expires. The minimum value is 60
     * seconds to ensure accuracy. The maximum value is 31622400 seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31622400<br/>
     */
    private Integer seconds;

    /**
     * <p>
     * The duration of the timer, in seconds. You can use a string expression
     * that includes numbers, variables (
     * <code>$variable.&lt;variable-name&gt;</code>), and input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the
     * duration. The range of the duration is 1-31622400 seconds. To ensure
     * accuracy, the minimum duration is 60 seconds. The evaluated result of the
     * duration is rounded down to the nearest whole number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String durationExpression;

    /**
     * <p>
     * The name of the timer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The name of the timer.
     *         </p>
     */
    public String getTimerName() {
        return timerName;
    }

    /**
     * <p>
     * The name of the timer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param timerName <p>
     *            The name of the timer.
     *            </p>
     */
    public void setTimerName(String timerName) {
        this.timerName = timerName;
    }

    /**
     * <p>
     * The name of the timer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param timerName <p>
     *            The name of the timer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetTimerAction withTimerName(String timerName) {
        this.timerName = timerName;
        return this;
    }

    /**
     * <p>
     * The number of seconds until the timer expires. The minimum value is 60
     * seconds to ensure accuracy. The maximum value is 31622400 seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31622400<br/>
     *
     * @return <p>
     *         The number of seconds until the timer expires. The minimum value
     *         is 60 seconds to ensure accuracy. The maximum value is 31622400
     *         seconds.
     *         </p>
     */
    public Integer getSeconds() {
        return seconds;
    }

    /**
     * <p>
     * The number of seconds until the timer expires. The minimum value is 60
     * seconds to ensure accuracy. The maximum value is 31622400 seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31622400<br/>
     *
     * @param seconds <p>
     *            The number of seconds until the timer expires. The minimum
     *            value is 60 seconds to ensure accuracy. The maximum value is
     *            31622400 seconds.
     *            </p>
     */
    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    /**
     * <p>
     * The number of seconds until the timer expires. The minimum value is 60
     * seconds to ensure accuracy. The maximum value is 31622400 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 31622400<br/>
     *
     * @param seconds <p>
     *            The number of seconds until the timer expires. The minimum
     *            value is 60 seconds to ensure accuracy. The maximum value is
     *            31622400 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetTimerAction withSeconds(Integer seconds) {
        this.seconds = seconds;
        return this;
    }

    /**
     * <p>
     * The duration of the timer, in seconds. You can use a string expression
     * that includes numbers, variables (
     * <code>$variable.&lt;variable-name&gt;</code>), and input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the
     * duration. The range of the duration is 1-31622400 seconds. To ensure
     * accuracy, the minimum duration is 60 seconds. The evaluated result of the
     * duration is rounded down to the nearest whole number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The duration of the timer, in seconds. You can use a string
     *         expression that includes numbers, variables (
     *         <code>$variable.&lt;variable-name&gt;</code>), and input values (
     *         <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as
     *         the duration. The range of the duration is 1-31622400 seconds. To
     *         ensure accuracy, the minimum duration is 60 seconds. The
     *         evaluated result of the duration is rounded down to the nearest
     *         whole number.
     *         </p>
     */
    public String getDurationExpression() {
        return durationExpression;
    }

    /**
     * <p>
     * The duration of the timer, in seconds. You can use a string expression
     * that includes numbers, variables (
     * <code>$variable.&lt;variable-name&gt;</code>), and input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the
     * duration. The range of the duration is 1-31622400 seconds. To ensure
     * accuracy, the minimum duration is 60 seconds. The evaluated result of the
     * duration is rounded down to the nearest whole number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param durationExpression <p>
     *            The duration of the timer, in seconds. You can use a string
     *            expression that includes numbers, variables (
     *            <code>$variable.&lt;variable-name&gt;</code>), and input
     *            values (
     *            <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>)
     *            as the duration. The range of the duration is 1-31622400
     *            seconds. To ensure accuracy, the minimum duration is 60
     *            seconds. The evaluated result of the duration is rounded down
     *            to the nearest whole number.
     *            </p>
     */
    public void setDurationExpression(String durationExpression) {
        this.durationExpression = durationExpression;
    }

    /**
     * <p>
     * The duration of the timer, in seconds. You can use a string expression
     * that includes numbers, variables (
     * <code>$variable.&lt;variable-name&gt;</code>), and input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>) as the
     * duration. The range of the duration is 1-31622400 seconds. To ensure
     * accuracy, the minimum duration is 60 seconds. The evaluated result of the
     * duration is rounded down to the nearest whole number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param durationExpression <p>
     *            The duration of the timer, in seconds. You can use a string
     *            expression that includes numbers, variables (
     *            <code>$variable.&lt;variable-name&gt;</code>), and input
     *            values (
     *            <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>)
     *            as the duration. The range of the duration is 1-31622400
     *            seconds. To ensure accuracy, the minimum duration is 60
     *            seconds. The evaluated result of the duration is rounded down
     *            to the nearest whole number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetTimerAction withDurationExpression(String durationExpression) {
        this.durationExpression = durationExpression;
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
        if (getTimerName() != null)
            sb.append("timerName: " + getTimerName() + ",");
        if (getSeconds() != null)
            sb.append("seconds: " + getSeconds() + ",");
        if (getDurationExpression() != null)
            sb.append("durationExpression: " + getDurationExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimerName() == null) ? 0 : getTimerName().hashCode());
        hashCode = prime * hashCode + ((getSeconds() == null) ? 0 : getSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getDurationExpression() == null) ? 0 : getDurationExpression().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetTimerAction == false)
            return false;
        SetTimerAction other = (SetTimerAction) obj;

        if (other.getTimerName() == null ^ this.getTimerName() == null)
            return false;
        if (other.getTimerName() != null
                && other.getTimerName().equals(this.getTimerName()) == false)
            return false;
        if (other.getSeconds() == null ^ this.getSeconds() == null)
            return false;
        if (other.getSeconds() != null && other.getSeconds().equals(this.getSeconds()) == false)
            return false;
        if (other.getDurationExpression() == null ^ this.getDurationExpression() == null)
            return false;
        if (other.getDurationExpression() != null
                && other.getDurationExpression().equals(this.getDurationExpression()) == false)
            return false;
        return true;
    }
}
