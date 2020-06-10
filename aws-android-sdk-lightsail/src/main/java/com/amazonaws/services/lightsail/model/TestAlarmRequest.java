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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Tests an alarm by displaying a banner on the Amazon Lightsail console. If a
 * notification trigger is configured for the specified alarm, the test also
 * sends a notification to the notification protocol (<code>Email</code> and/or
 * <code>SMS</code>) configured for the alarm.
 * </p>
 * <p>
 * An alarm is used to monitor a single metric for one of your resources. When a
 * metric condition is met, the alarm can notify you by email, SMS text message,
 * and a banner displayed on the Amazon Lightsail console. For more information,
 * see <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms"
 * >Alarms in Amazon Lightsail</a>.
 * </p>
 */
public class TestAlarmRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the alarm to test.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String alarmName;

    /**
     * <p>
     * The alarm state to test.
     * </p>
     * <p>
     * An alarm has the following possible states that can be tested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> - The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> - The alarm has just started, the metric
     * is not available, or not enough data is available for the metric to
     * determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> - The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     */
    private String state;

    /**
     * <p>
     * The name of the alarm to test.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the alarm to test.
     *         </p>
     */
    public String getAlarmName() {
        return alarmName;
    }

    /**
     * <p>
     * The name of the alarm to test.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param alarmName <p>
     *            The name of the alarm to test.
     *            </p>
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The name of the alarm to test.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param alarmName <p>
     *            The name of the alarm to test.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestAlarmRequest withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * <p>
     * The alarm state to test.
     * </p>
     * <p>
     * An alarm has the following possible states that can be tested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> - The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> - The alarm has just started, the metric
     * is not available, or not enough data is available for the metric to
     * determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> - The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @return <p>
     *         The alarm state to test.
     *         </p>
     *         <p>
     *         An alarm has the following possible states that can be tested:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALARM</code> - The metric is outside of the defined
     *         threshold.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INSUFFICIENT_DATA</code> - The alarm has just started, the
     *         metric is not available, or not enough data is available for the
     *         metric to determine the alarm state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OK</code> - The metric is within the defined threshold.
     *         </p>
     *         </li>
     *         </ul>
     * @see AlarmState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The alarm state to test.
     * </p>
     * <p>
     * An alarm has the following possible states that can be tested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> - The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> - The alarm has just started, the metric
     * is not available, or not enough data is available for the metric to
     * determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> - The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param state <p>
     *            The alarm state to test.
     *            </p>
     *            <p>
     *            An alarm has the following possible states that can be tested:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALARM</code> - The metric is outside of the defined
     *            threshold.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSUFFICIENT_DATA</code> - The alarm has just started,
     *            the metric is not available, or not enough data is available
     *            for the metric to determine the alarm state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OK</code> - The metric is within the defined threshold.
     *            </p>
     *            </li>
     *            </ul>
     * @see AlarmState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The alarm state to test.
     * </p>
     * <p>
     * An alarm has the following possible states that can be tested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> - The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> - The alarm has just started, the metric
     * is not available, or not enough data is available for the metric to
     * determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> - The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param state <p>
     *            The alarm state to test.
     *            </p>
     *            <p>
     *            An alarm has the following possible states that can be tested:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALARM</code> - The metric is outside of the defined
     *            threshold.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSUFFICIENT_DATA</code> - The alarm has just started,
     *            the metric is not available, or not enough data is available
     *            for the metric to determine the alarm state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OK</code> - The metric is within the defined threshold.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AlarmState
     */
    public TestAlarmRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The alarm state to test.
     * </p>
     * <p>
     * An alarm has the following possible states that can be tested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> - The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> - The alarm has just started, the metric
     * is not available, or not enough data is available for the metric to
     * determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> - The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param state <p>
     *            The alarm state to test.
     *            </p>
     *            <p>
     *            An alarm has the following possible states that can be tested:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALARM</code> - The metric is outside of the defined
     *            threshold.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSUFFICIENT_DATA</code> - The alarm has just started,
     *            the metric is not available, or not enough data is available
     *            for the metric to determine the alarm state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OK</code> - The metric is within the defined threshold.
     *            </p>
     *            </li>
     *            </ul>
     * @see AlarmState
     */
    public void setState(AlarmState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The alarm state to test.
     * </p>
     * <p>
     * An alarm has the following possible states that can be tested:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALARM</code> - The metric is outside of the defined threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSUFFICIENT_DATA</code> - The alarm has just started, the metric
     * is not available, or not enough data is available for the metric to
     * determine the alarm state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OK</code> - The metric is within the defined threshold.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param state <p>
     *            The alarm state to test.
     *            </p>
     *            <p>
     *            An alarm has the following possible states that can be tested:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALARM</code> - The metric is outside of the defined
     *            threshold.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>INSUFFICIENT_DATA</code> - The alarm has just started,
     *            the metric is not available, or not enough data is available
     *            for the metric to determine the alarm state.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OK</code> - The metric is within the defined threshold.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AlarmState
     */
    public TestAlarmRequest withState(AlarmState state) {
        this.state = state.toString();
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
        if (getAlarmName() != null)
            sb.append("alarmName: " + getAlarmName() + ",");
        if (getState() != null)
            sb.append("state: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestAlarmRequest == false)
            return false;
        TestAlarmRequest other = (TestAlarmRequest) obj;

        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null
                && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
