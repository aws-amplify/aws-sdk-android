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
 * Retrieves history for the specified alarm. Filter alarms by date range or
 * item type. If an alarm name is not specified, Amazon CloudWatch returns
 * histories for all of the owner's alarms.
 * </p>
 * <note> Amazon CloudWatch retains the history of an alarm for two weeks,
 * whether or not you delete the alarm. </note>
 */
public class DescribeAlarmHistoryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String alarmName;

    /**
     * <p>
     * The type of alarm histories to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationUpdate, StateUpdate, Action
     */
    private String historyItemType;

    /**
     * <p>
     * The starting date to retrieve alarm history.
     * </p>
     */
    private java.util.Date startDate;

    /**
     * <p>
     * The ending date to retrieve alarm history.
     * </p>
     */
    private java.util.Date endDate;

    /**
     * <p>
     * The maximum number of alarm history records to retrieve.
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
     * The name of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the alarm.
     *         </p>
     */
    public String getAlarmName() {
        return alarmName;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param alarmName <p>
     *            The name of the alarm.
     *            </p>
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param alarmName <p>
     *            The name of the alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlarmHistoryRequest withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * <p>
     * The type of alarm histories to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationUpdate, StateUpdate, Action
     *
     * @return <p>
     *         The type of alarm histories to retrieve.
     *         </p>
     * @see HistoryItemType
     */
    public String getHistoryItemType() {
        return historyItemType;
    }

    /**
     * <p>
     * The type of alarm histories to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationUpdate, StateUpdate, Action
     *
     * @param historyItemType <p>
     *            The type of alarm histories to retrieve.
     *            </p>
     * @see HistoryItemType
     */
    public void setHistoryItemType(String historyItemType) {
        this.historyItemType = historyItemType;
    }

    /**
     * <p>
     * The type of alarm histories to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationUpdate, StateUpdate, Action
     *
     * @param historyItemType <p>
     *            The type of alarm histories to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HistoryItemType
     */
    public DescribeAlarmHistoryRequest withHistoryItemType(String historyItemType) {
        this.historyItemType = historyItemType;
        return this;
    }

    /**
     * <p>
     * The type of alarm histories to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationUpdate, StateUpdate, Action
     *
     * @param historyItemType <p>
     *            The type of alarm histories to retrieve.
     *            </p>
     * @see HistoryItemType
     */
    public void setHistoryItemType(HistoryItemType historyItemType) {
        this.historyItemType = historyItemType.toString();
    }

    /**
     * <p>
     * The type of alarm histories to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationUpdate, StateUpdate, Action
     *
     * @param historyItemType <p>
     *            The type of alarm histories to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HistoryItemType
     */
    public DescribeAlarmHistoryRequest withHistoryItemType(HistoryItemType historyItemType) {
        this.historyItemType = historyItemType.toString();
        return this;
    }

    /**
     * <p>
     * The starting date to retrieve alarm history.
     * </p>
     *
     * @return <p>
     *         The starting date to retrieve alarm history.
     *         </p>
     */
    public java.util.Date getStartDate() {
        return startDate;
    }

    /**
     * <p>
     * The starting date to retrieve alarm history.
     * </p>
     *
     * @param startDate <p>
     *            The starting date to retrieve alarm history.
     *            </p>
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The starting date to retrieve alarm history.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startDate <p>
     *            The starting date to retrieve alarm history.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlarmHistoryRequest withStartDate(java.util.Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * <p>
     * The ending date to retrieve alarm history.
     * </p>
     *
     * @return <p>
     *         The ending date to retrieve alarm history.
     *         </p>
     */
    public java.util.Date getEndDate() {
        return endDate;
    }

    /**
     * <p>
     * The ending date to retrieve alarm history.
     * </p>
     *
     * @param endDate <p>
     *            The ending date to retrieve alarm history.
     *            </p>
     */
    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The ending date to retrieve alarm history.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endDate <p>
     *            The ending date to retrieve alarm history.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlarmHistoryRequest withEndDate(java.util.Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * <p>
     * The maximum number of alarm history records to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of alarm history records to retrieve.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of alarm history records to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxRecords <p>
     *            The maximum number of alarm history records to retrieve.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of alarm history records to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxRecords <p>
     *            The maximum number of alarm history records to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAlarmHistoryRequest withMaxRecords(Integer maxRecords) {
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
    public DescribeAlarmHistoryRequest withNextToken(String nextToken) {
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
        if (getAlarmName() != null)
            sb.append("AlarmName: " + getAlarmName() + ",");
        if (getHistoryItemType() != null)
            sb.append("HistoryItemType: " + getHistoryItemType() + ",");
        if (getStartDate() != null)
            sb.append("StartDate: " + getStartDate() + ",");
        if (getEndDate() != null)
            sb.append("EndDate: " + getEndDate() + ",");
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

        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode
                + ((getHistoryItemType() == null) ? 0 : getHistoryItemType().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
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

        if (obj instanceof DescribeAlarmHistoryRequest == false)
            return false;
        DescribeAlarmHistoryRequest other = (DescribeAlarmHistoryRequest) obj;

        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null
                && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getHistoryItemType() == null ^ this.getHistoryItemType() == null)
            return false;
        if (other.getHistoryItemType() != null
                && other.getHistoryItemType().equals(this.getHistoryItemType()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null
                && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
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
