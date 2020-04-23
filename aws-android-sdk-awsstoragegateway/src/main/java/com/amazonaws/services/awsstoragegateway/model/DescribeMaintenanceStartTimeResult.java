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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeMaintenanceStartTimeOutput$DayOfMonth</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeMaintenanceStartTimeOutput$DayOfWeek</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeMaintenanceStartTimeOutput$HourOfDay</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeMaintenanceStartTimeOutput$MinuteOfHour</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeMaintenanceStartTimeOutput$Timezone</a>
 * </p>
 * </li>
 * </ul>
 */
public class DescribeMaintenanceStartTimeResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * The hour component of the maintenance start time represented as
     * <i>hh</i>, where <i>hh</i> is the hour (0 to 23). The hour of the day is
     * in the time zone of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     */
    private Integer hourOfDay;

    /**
     * <p>
     * The minute component of the maintenance start time represented as
     * <i>mm</i>, where <i>mm</i> is the minute (0 to 59). The minute of the
     * hour is in the time zone of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     */
    private Integer minuteOfHour;

    /**
     * <p>
     * An ordinal number between 0 and 6 that represents the day of the week,
     * where 0 represents Sunday and 6 represents Saturday. The day of week is
     * in the time zone of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 6<br/>
     */
    private Integer dayOfWeek;

    /**
     * <p>
     * The day of the month component of the maintenance start time represented
     * as an ordinal number from 1 to 28, where 1 represents the first day of
     * the month and 28 represents the last day of the month.
     * </p>
     * <note>
     * <p>
     * This value is only available for tape and volume gateways.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 28<br/>
     */
    private Integer dayOfMonth;

    /**
     * <p>
     * A value that indicates the time zone that is set for the gateway. The
     * start time and day of week specified should be in the time zone of the
     * gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     */
    private String timezone;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for
     *         your account and AWS Region.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceStartTimeResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * The hour component of the maintenance start time represented as
     * <i>hh</i>, where <i>hh</i> is the hour (0 to 23). The hour of the day is
     * in the time zone of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @return <p>
     *         The hour component of the maintenance start time represented as
     *         <i>hh</i>, where <i>hh</i> is the hour (0 to 23). The hour of the
     *         day is in the time zone of the gateway.
     *         </p>
     */
    public Integer getHourOfDay() {
        return hourOfDay;
    }

    /**
     * <p>
     * The hour component of the maintenance start time represented as
     * <i>hh</i>, where <i>hh</i> is the hour (0 to 23). The hour of the day is
     * in the time zone of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param hourOfDay <p>
     *            The hour component of the maintenance start time represented
     *            as <i>hh</i>, where <i>hh</i> is the hour (0 to 23). The hour
     *            of the day is in the time zone of the gateway.
     *            </p>
     */
    public void setHourOfDay(Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    /**
     * <p>
     * The hour component of the maintenance start time represented as
     * <i>hh</i>, where <i>hh</i> is the hour (0 to 23). The hour of the day is
     * in the time zone of the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 23<br/>
     *
     * @param hourOfDay <p>
     *            The hour component of the maintenance start time represented
     *            as <i>hh</i>, where <i>hh</i> is the hour (0 to 23). The hour
     *            of the day is in the time zone of the gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceStartTimeResult withHourOfDay(Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
        return this;
    }

    /**
     * <p>
     * The minute component of the maintenance start time represented as
     * <i>mm</i>, where <i>mm</i> is the minute (0 to 59). The minute of the
     * hour is in the time zone of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     *
     * @return <p>
     *         The minute component of the maintenance start time represented as
     *         <i>mm</i>, where <i>mm</i> is the minute (0 to 59). The minute of
     *         the hour is in the time zone of the gateway.
     *         </p>
     */
    public Integer getMinuteOfHour() {
        return minuteOfHour;
    }

    /**
     * <p>
     * The minute component of the maintenance start time represented as
     * <i>mm</i>, where <i>mm</i> is the minute (0 to 59). The minute of the
     * hour is in the time zone of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     *
     * @param minuteOfHour <p>
     *            The minute component of the maintenance start time represented
     *            as <i>mm</i>, where <i>mm</i> is the minute (0 to 59). The
     *            minute of the hour is in the time zone of the gateway.
     *            </p>
     */
    public void setMinuteOfHour(Integer minuteOfHour) {
        this.minuteOfHour = minuteOfHour;
    }

    /**
     * <p>
     * The minute component of the maintenance start time represented as
     * <i>mm</i>, where <i>mm</i> is the minute (0 to 59). The minute of the
     * hour is in the time zone of the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 59<br/>
     *
     * @param minuteOfHour <p>
     *            The minute component of the maintenance start time represented
     *            as <i>mm</i>, where <i>mm</i> is the minute (0 to 59). The
     *            minute of the hour is in the time zone of the gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceStartTimeResult withMinuteOfHour(Integer minuteOfHour) {
        this.minuteOfHour = minuteOfHour;
        return this;
    }

    /**
     * <p>
     * An ordinal number between 0 and 6 that represents the day of the week,
     * where 0 represents Sunday and 6 represents Saturday. The day of week is
     * in the time zone of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 6<br/>
     *
     * @return <p>
     *         An ordinal number between 0 and 6 that represents the day of the
     *         week, where 0 represents Sunday and 6 represents Saturday. The
     *         day of week is in the time zone of the gateway.
     *         </p>
     */
    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * <p>
     * An ordinal number between 0 and 6 that represents the day of the week,
     * where 0 represents Sunday and 6 represents Saturday. The day of week is
     * in the time zone of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 6<br/>
     *
     * @param dayOfWeek <p>
     *            An ordinal number between 0 and 6 that represents the day of
     *            the week, where 0 represents Sunday and 6 represents Saturday.
     *            The day of week is in the time zone of the gateway.
     *            </p>
     */
    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * <p>
     * An ordinal number between 0 and 6 that represents the day of the week,
     * where 0 represents Sunday and 6 represents Saturday. The day of week is
     * in the time zone of the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 6<br/>
     *
     * @param dayOfWeek <p>
     *            An ordinal number between 0 and 6 that represents the day of
     *            the week, where 0 represents Sunday and 6 represents Saturday.
     *            The day of week is in the time zone of the gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceStartTimeResult withDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * <p>
     * The day of the month component of the maintenance start time represented
     * as an ordinal number from 1 to 28, where 1 represents the first day of
     * the month and 28 represents the last day of the month.
     * </p>
     * <note>
     * <p>
     * This value is only available for tape and volume gateways.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 28<br/>
     *
     * @return <p>
     *         The day of the month component of the maintenance start time
     *         represented as an ordinal number from 1 to 28, where 1 represents
     *         the first day of the month and 28 represents the last day of the
     *         month.
     *         </p>
     *         <note>
     *         <p>
     *         This value is only available for tape and volume gateways.
     *         </p>
     *         </note>
     */
    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * <p>
     * The day of the month component of the maintenance start time represented
     * as an ordinal number from 1 to 28, where 1 represents the first day of
     * the month and 28 represents the last day of the month.
     * </p>
     * <note>
     * <p>
     * This value is only available for tape and volume gateways.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 28<br/>
     *
     * @param dayOfMonth <p>
     *            The day of the month component of the maintenance start time
     *            represented as an ordinal number from 1 to 28, where 1
     *            represents the first day of the month and 28 represents the
     *            last day of the month.
     *            </p>
     *            <note>
     *            <p>
     *            This value is only available for tape and volume gateways.
     *            </p>
     *            </note>
     */
    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * <p>
     * The day of the month component of the maintenance start time represented
     * as an ordinal number from 1 to 28, where 1 represents the first day of
     * the month and 28 represents the last day of the month.
     * </p>
     * <note>
     * <p>
     * This value is only available for tape and volume gateways.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 28<br/>
     *
     * @param dayOfMonth <p>
     *            The day of the month component of the maintenance start time
     *            represented as an ordinal number from 1 to 28, where 1
     *            represents the first day of the month and 28 represents the
     *            last day of the month.
     *            </p>
     *            <note>
     *            <p>
     *            This value is only available for tape and volume gateways.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceStartTimeResult withDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }

    /**
     * <p>
     * A value that indicates the time zone that is set for the gateway. The
     * start time and day of week specified should be in the time zone of the
     * gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @return <p>
     *         A value that indicates the time zone that is set for the gateway.
     *         The start time and day of week specified should be in the time
     *         zone of the gateway.
     *         </p>
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * <p>
     * A value that indicates the time zone that is set for the gateway. The
     * start time and day of week specified should be in the time zone of the
     * gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param timezone <p>
     *            A value that indicates the time zone that is set for the
     *            gateway. The start time and day of week specified should be in
     *            the time zone of the gateway.
     *            </p>
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * A value that indicates the time zone that is set for the gateway. The
     * start time and day of week specified should be in the time zone of the
     * gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param timezone <p>
     *            A value that indicates the time zone that is set for the
     *            gateway. The start time and day of week specified should be in
     *            the time zone of the gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeMaintenanceStartTimeResult withTimezone(String timezone) {
        this.timezone = timezone;
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getHourOfDay() != null)
            sb.append("HourOfDay: " + getHourOfDay() + ",");
        if (getMinuteOfHour() != null)
            sb.append("MinuteOfHour: " + getMinuteOfHour() + ",");
        if (getDayOfWeek() != null)
            sb.append("DayOfWeek: " + getDayOfWeek() + ",");
        if (getDayOfMonth() != null)
            sb.append("DayOfMonth: " + getDayOfMonth() + ",");
        if (getTimezone() != null)
            sb.append("Timezone: " + getTimezone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getHourOfDay() == null) ? 0 : getHourOfDay().hashCode());
        hashCode = prime * hashCode
                + ((getMinuteOfHour() == null) ? 0 : getMinuteOfHour().hashCode());
        hashCode = prime * hashCode + ((getDayOfWeek() == null) ? 0 : getDayOfWeek().hashCode());
        hashCode = prime * hashCode + ((getDayOfMonth() == null) ? 0 : getDayOfMonth().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMaintenanceStartTimeResult == false)
            return false;
        DescribeMaintenanceStartTimeResult other = (DescribeMaintenanceStartTimeResult) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getHourOfDay() == null ^ this.getHourOfDay() == null)
            return false;
        if (other.getHourOfDay() != null
                && other.getHourOfDay().equals(this.getHourOfDay()) == false)
            return false;
        if (other.getMinuteOfHour() == null ^ this.getMinuteOfHour() == null)
            return false;
        if (other.getMinuteOfHour() != null
                && other.getMinuteOfHour().equals(this.getMinuteOfHour()) == false)
            return false;
        if (other.getDayOfWeek() == null ^ this.getDayOfWeek() == null)
            return false;
        if (other.getDayOfWeek() != null
                && other.getDayOfWeek().equals(this.getDayOfWeek()) == false)
            return false;
        if (other.getDayOfMonth() == null ^ this.getDayOfMonth() == null)
            return false;
        if (other.getDayOfMonth() != null
                && other.getDayOfMonth().equals(this.getDayOfMonth()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        return true;
    }
}
