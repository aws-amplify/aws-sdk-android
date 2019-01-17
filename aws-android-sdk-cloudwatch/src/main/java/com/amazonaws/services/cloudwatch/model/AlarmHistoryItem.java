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

/**
 * <p>
 * The <code>AlarmHistoryItem</code> data type contains descriptive information
 * about the history of a specific alarm. If you call
 * <a>DescribeAlarmHistory</a>, Amazon CloudWatch returns this data type as part
 * of the DescribeAlarmHistoryResult data type.
 * </p>
 */
public class AlarmHistoryItem implements Serializable {
    /**
     * <p>
     * The descriptive name for the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String alarmName;

    /**
     * <p>
     * The time stamp for the alarm history item.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The type of alarm history item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationUpdate, StateUpdate, Action
     */
    private String historyItemType;

    /**
     * <p>
     * A human-readable summary of the alarm history.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String historySummary;

    /**
     * <p>
     * Machine-readable data about the alarm in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4095<br/>
     */
    private String historyData;

    /**
     * <p>
     * The descriptive name for the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The descriptive name for the alarm.
     *         </p>
     */
    public String getAlarmName() {
        return alarmName;
    }

    /**
     * <p>
     * The descriptive name for the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param alarmName <p>
     *            The descriptive name for the alarm.
     *            </p>
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The descriptive name for the alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param alarmName <p>
     *            The descriptive name for the alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlarmHistoryItem withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * <p>
     * The time stamp for the alarm history item.
     * </p>
     *
     * @return <p>
     *         The time stamp for the alarm history item.
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * The time stamp for the alarm history item.
     * </p>
     *
     * @param timestamp <p>
     *            The time stamp for the alarm history item.
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time stamp for the alarm history item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            The time stamp for the alarm history item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlarmHistoryItem withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * <p>
     * The type of alarm history item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationUpdate, StateUpdate, Action
     *
     * @return <p>
     *         The type of alarm history item.
     *         </p>
     * @see HistoryItemType
     */
    public String getHistoryItemType() {
        return historyItemType;
    }

    /**
     * <p>
     * The type of alarm history item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationUpdate, StateUpdate, Action
     *
     * @param historyItemType <p>
     *            The type of alarm history item.
     *            </p>
     * @see HistoryItemType
     */
    public void setHistoryItemType(String historyItemType) {
        this.historyItemType = historyItemType;
    }

    /**
     * <p>
     * The type of alarm history item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationUpdate, StateUpdate, Action
     *
     * @param historyItemType <p>
     *            The type of alarm history item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HistoryItemType
     */
    public AlarmHistoryItem withHistoryItemType(String historyItemType) {
        this.historyItemType = historyItemType;
        return this;
    }

    /**
     * <p>
     * The type of alarm history item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationUpdate, StateUpdate, Action
     *
     * @param historyItemType <p>
     *            The type of alarm history item.
     *            </p>
     * @see HistoryItemType
     */
    public void setHistoryItemType(HistoryItemType historyItemType) {
        this.historyItemType = historyItemType.toString();
    }

    /**
     * <p>
     * The type of alarm history item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationUpdate, StateUpdate, Action
     *
     * @param historyItemType <p>
     *            The type of alarm history item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HistoryItemType
     */
    public AlarmHistoryItem withHistoryItemType(HistoryItemType historyItemType) {
        this.historyItemType = historyItemType.toString();
        return this;
    }

    /**
     * <p>
     * A human-readable summary of the alarm history.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         A human-readable summary of the alarm history.
     *         </p>
     */
    public String getHistorySummary() {
        return historySummary;
    }

    /**
     * <p>
     * A human-readable summary of the alarm history.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param historySummary <p>
     *            A human-readable summary of the alarm history.
     *            </p>
     */
    public void setHistorySummary(String historySummary) {
        this.historySummary = historySummary;
    }

    /**
     * <p>
     * A human-readable summary of the alarm history.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param historySummary <p>
     *            A human-readable summary of the alarm history.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlarmHistoryItem withHistorySummary(String historySummary) {
        this.historySummary = historySummary;
        return this;
    }

    /**
     * <p>
     * Machine-readable data about the alarm in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4095<br/>
     *
     * @return <p>
     *         Machine-readable data about the alarm in JSON format.
     *         </p>
     */
    public String getHistoryData() {
        return historyData;
    }

    /**
     * <p>
     * Machine-readable data about the alarm in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4095<br/>
     *
     * @param historyData <p>
     *            Machine-readable data about the alarm in JSON format.
     *            </p>
     */
    public void setHistoryData(String historyData) {
        this.historyData = historyData;
    }

    /**
     * <p>
     * Machine-readable data about the alarm in JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4095<br/>
     *
     * @param historyData <p>
     *            Machine-readable data about the alarm in JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AlarmHistoryItem withHistoryData(String historyData) {
        this.historyData = historyData;
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
            sb.append("AlarmName: " + getAlarmName() + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getHistoryItemType() != null)
            sb.append("HistoryItemType: " + getHistoryItemType() + ",");
        if (getHistorySummary() != null)
            sb.append("HistorySummary: " + getHistorySummary() + ",");
        if (getHistoryData() != null)
            sb.append("HistoryData: " + getHistoryData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getHistoryItemType() == null) ? 0 : getHistoryItemType().hashCode());
        hashCode = prime * hashCode
                + ((getHistorySummary() == null) ? 0 : getHistorySummary().hashCode());
        hashCode = prime * hashCode
                + ((getHistoryData() == null) ? 0 : getHistoryData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmHistoryItem == false)
            return false;
        AlarmHistoryItem other = (AlarmHistoryItem) obj;

        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null
                && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getHistoryItemType() == null ^ this.getHistoryItemType() == null)
            return false;
        if (other.getHistoryItemType() != null
                && other.getHistoryItemType().equals(this.getHistoryItemType()) == false)
            return false;
        if (other.getHistorySummary() == null ^ this.getHistorySummary() == null)
            return false;
        if (other.getHistorySummary() != null
                && other.getHistorySummary().equals(this.getHistorySummary()) == false)
            return false;
        if (other.getHistoryData() == null ^ this.getHistoryData() == null)
            return false;
        if (other.getHistoryData() != null
                && other.getHistoryData().equals(this.getHistoryData()) == false)
            return false;
        return true;
    }
}
