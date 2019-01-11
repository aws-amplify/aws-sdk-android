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

package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves alarms with the specified names. If no name is specified, all
 * alarms for the user are returned. Alarms can be retrieved by using only a
 * prefix for the alarm name, the alarm state, or a prefix for any action.
 * </p>
 */
public class DescribeAlarmsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of alarm names to retrieve information for.
     * </p>
     */
    private java.util.List<String> alarmNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The alarm name prefix. <code>AlarmNames</code> cannot be specified if
     * this parameter is specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String alarmNamePrefix;

    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     */
    private String stateValue;

    /**
     * <p>
     * The action name prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String actionPrefix;

    /**
     * <p>
     * The maximum number of alarm descriptions to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data
     * available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of alarm names to retrieve information for.
     * </p>
     *
     * @return <p>
     *         A list of alarm names to retrieve information for.
     *         </p>
     */
    public java.util.List<String> getAlarmNames() {
        return alarmNames;
    }

    /**
     * <p>
     * A list of alarm names to retrieve information for.
     * </p>
     *
     * @param alarmNames <p>
     *            A list of alarm names to retrieve information for.
     *            </p>
     */
    public void setAlarmNames(java.util.Collection<String> alarmNames) {
        if (alarmNames == null) {
            this.alarmNames = null;
            return;
        }

        this.alarmNames = new java.util.ArrayList<String>(alarmNames);
    }

    /**
     * <p>
     * A list of alarm names to retrieve information for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarmNames <p>
     *            A list of alarm names to retrieve information for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlarmsRequest withAlarmNames(String... alarmNames) {
        if (getAlarmNames() == null) {
            this.alarmNames = new java.util.ArrayList<String>(alarmNames.length);
        }
        for (String value : alarmNames) {
            this.alarmNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of alarm names to retrieve information for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarmNames <p>
     *            A list of alarm names to retrieve information for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlarmsRequest withAlarmNames(java.util.Collection<String> alarmNames) {
        setAlarmNames(alarmNames);
        return this;
    }

    /**
     * <p>
     * The alarm name prefix. <code>AlarmNames</code> cannot be specified if
     * this parameter is specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The alarm name prefix. <code>AlarmNames</code> cannot be
     *         specified if this parameter is specified.
     *         </p>
     */
    public String getAlarmNamePrefix() {
        return alarmNamePrefix;
    }

    /**
     * <p>
     * The alarm name prefix. <code>AlarmNames</code> cannot be specified if
     * this parameter is specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param alarmNamePrefix <p>
     *            The alarm name prefix. <code>AlarmNames</code> cannot be
     *            specified if this parameter is specified.
     *            </p>
     */
    public void setAlarmNamePrefix(String alarmNamePrefix) {
        this.alarmNamePrefix = alarmNamePrefix;
    }

    /**
     * <p>
     * The alarm name prefix. <code>AlarmNames</code> cannot be specified if
     * this parameter is specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param alarmNamePrefix <p>
     *            The alarm name prefix. <code>AlarmNames</code> cannot be
     *            specified if this parameter is specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlarmsRequest withAlarmNamePrefix(String alarmNamePrefix) {
        this.alarmNamePrefix = alarmNamePrefix;
        return this;
    }

    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @return <p>
     *         The state value to be used in matching alarms.
     *         </p>
     * @see StateValue
     */
    public String getStateValue() {
        return stateValue;
    }

    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param stateValue <p>
     *            The state value to be used in matching alarms.
     *            </p>
     * @see StateValue
     */
    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param stateValue <p>
     *            The state value to be used in matching alarms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StateValue
     */
    public DescribeAlarmsRequest withStateValue(String stateValue) {
        this.stateValue = stateValue;
        return this;
    }

    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param stateValue <p>
     *            The state value to be used in matching alarms.
     *            </p>
     * @see StateValue
     */
    public void setStateValue(StateValue stateValue) {
        this.stateValue = stateValue.toString();
    }

    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OK, ALARM, INSUFFICIENT_DATA
     *
     * @param stateValue <p>
     *            The state value to be used in matching alarms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StateValue
     */
    public DescribeAlarmsRequest withStateValue(StateValue stateValue) {
        this.stateValue = stateValue.toString();
        return this;
    }

    /**
     * <p>
     * The action name prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The action name prefix.
     *         </p>
     */
    public String getActionPrefix() {
        return actionPrefix;
    }

    /**
     * <p>
     * The action name prefix.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param actionPrefix <p>
     *            The action name prefix.
     *            </p>
     */
    public void setActionPrefix(String actionPrefix) {
        this.actionPrefix = actionPrefix;
    }

    /**
     * <p>
     * The action name prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param actionPrefix <p>
     *            The action name prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlarmsRequest withActionPrefix(String actionPrefix) {
        this.actionPrefix = actionPrefix;
        return this;
    }

    /**
     * <p>
     * The maximum number of alarm descriptions to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of alarm descriptions to retrieve.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of alarm descriptions to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxRecords <p>
     *            The maximum number of alarm descriptions to retrieve.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of alarm descriptions to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxRecords <p>
     *            The maximum number of alarm descriptions to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlarmsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data
     * available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         The token returned by a previous call to indicate that there is
     *         more data available.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data
     * available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param nextToken <p>
     *            The token returned by a previous call to indicate that there
     *            is more data available.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data
     * available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param nextToken <p>
     *            The token returned by a previous call to indicate that there
     *            is more data available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlarmsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getAlarmNames() != null)
            sb.append("AlarmNames: " + getAlarmNames() + ",");
        if (getAlarmNamePrefix() != null)
            sb.append("AlarmNamePrefix: " + getAlarmNamePrefix() + ",");
        if (getStateValue() != null)
            sb.append("StateValue: " + getStateValue() + ",");
        if (getActionPrefix() != null)
            sb.append("ActionPrefix: " + getActionPrefix() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmNames() == null) ? 0 : getAlarmNames().hashCode());
        hashCode = prime * hashCode
                + ((getAlarmNamePrefix() == null) ? 0 : getAlarmNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getStateValue() == null) ? 0 : getStateValue().hashCode());
        hashCode = prime * hashCode
                + ((getActionPrefix() == null) ? 0 : getActionPrefix().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAlarmsRequest == false)
            return false;
        DescribeAlarmsRequest other = (DescribeAlarmsRequest) obj;

        if (other.getAlarmNames() == null ^ this.getAlarmNames() == null)
            return false;
        if (other.getAlarmNames() != null
                && other.getAlarmNames().equals(this.getAlarmNames()) == false)
            return false;
        if (other.getAlarmNamePrefix() == null ^ this.getAlarmNamePrefix() == null)
            return false;
        if (other.getAlarmNamePrefix() != null
                && other.getAlarmNamePrefix().equals(this.getAlarmNamePrefix()) == false)
            return false;
        if (other.getStateValue() == null ^ this.getStateValue() == null)
            return false;
        if (other.getStateValue() != null
                && other.getStateValue().equals(this.getStateValue()) == false)
            return false;
        if (other.getActionPrefix() == null ^ this.getActionPrefix() == null)
            return false;
        if (other.getActionPrefix() != null
                && other.getActionPrefix().equals(this.getActionPrefix()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
