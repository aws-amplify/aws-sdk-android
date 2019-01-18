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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a scheduled audit, including what checks are performed and how often
 * the audit takes place.
 * </p>
 */
public class UpdateScheduledAuditRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * How often the scheduled audit takes place. Can be one of "DAILY",
     * "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual start time of each audit is
     * determined by the system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, WEEKLY, BIWEEKLY, MONTHLY
     */
    private String frequency;

    /**
     * <p>
     * The day of the month on which the scheduled audit takes place. Can be "1"
     * through "31" or "LAST". This field is required if the "frequency"
     * parameter is set to "MONTHLY". If days 29-31 are specified, and the month
     * does not have that many days, the audit takes place on the "LAST" day of
     * the month.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([1-9]|[12][0-9]|3[01])$|^LAST$<br/>
     */
    private String dayOfMonth;

    /**
     * <p>
     * The day of the week on which the scheduled audit takes place. Can be one
     * of "SUN", "MON", "TUE", "WED", "THU", "FRI" or "SAT". This field is
     * required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUN, MON, TUE, WED, THU, FRI, SAT
     */
    private String dayOfWeek;

    /**
     * <p>
     * Which checks are performed during the scheduled audit. Checks must be
     * enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks including those that are enabled or
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.)
     * </p>
     */
    private java.util.List<String> targetCheckNames;

    /**
     * <p>
     * The name of the scheduled audit. (Max. 128 chars)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String scheduledAuditName;

    /**
     * <p>
     * How often the scheduled audit takes place. Can be one of "DAILY",
     * "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual start time of each audit is
     * determined by the system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, WEEKLY, BIWEEKLY, MONTHLY
     *
     * @return <p>
     *         How often the scheduled audit takes place. Can be one of "DAILY",
     *         "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual start time of each
     *         audit is determined by the system.
     *         </p>
     * @see AuditFrequency
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * <p>
     * How often the scheduled audit takes place. Can be one of "DAILY",
     * "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual start time of each audit is
     * determined by the system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, WEEKLY, BIWEEKLY, MONTHLY
     *
     * @param frequency <p>
     *            How often the scheduled audit takes place. Can be one of
     *            "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual start
     *            time of each audit is determined by the system.
     *            </p>
     * @see AuditFrequency
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * How often the scheduled audit takes place. Can be one of "DAILY",
     * "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual start time of each audit is
     * determined by the system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, WEEKLY, BIWEEKLY, MONTHLY
     *
     * @param frequency <p>
     *            How often the scheduled audit takes place. Can be one of
     *            "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual start
     *            time of each audit is determined by the system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditFrequency
     */
    public UpdateScheduledAuditRequest withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * <p>
     * How often the scheduled audit takes place. Can be one of "DAILY",
     * "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual start time of each audit is
     * determined by the system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, WEEKLY, BIWEEKLY, MONTHLY
     *
     * @param frequency <p>
     *            How often the scheduled audit takes place. Can be one of
     *            "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual start
     *            time of each audit is determined by the system.
     *            </p>
     * @see AuditFrequency
     */
    public void setFrequency(AuditFrequency frequency) {
        this.frequency = frequency.toString();
    }

    /**
     * <p>
     * How often the scheduled audit takes place. Can be one of "DAILY",
     * "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual start time of each audit is
     * determined by the system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DAILY, WEEKLY, BIWEEKLY, MONTHLY
     *
     * @param frequency <p>
     *            How often the scheduled audit takes place. Can be one of
     *            "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The actual start
     *            time of each audit is determined by the system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuditFrequency
     */
    public UpdateScheduledAuditRequest withFrequency(AuditFrequency frequency) {
        this.frequency = frequency.toString();
        return this;
    }

    /**
     * <p>
     * The day of the month on which the scheduled audit takes place. Can be "1"
     * through "31" or "LAST". This field is required if the "frequency"
     * parameter is set to "MONTHLY". If days 29-31 are specified, and the month
     * does not have that many days, the audit takes place on the "LAST" day of
     * the month.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([1-9]|[12][0-9]|3[01])$|^LAST$<br/>
     *
     * @return <p>
     *         The day of the month on which the scheduled audit takes place.
     *         Can be "1" through "31" or "LAST". This field is required if the
     *         "frequency" parameter is set to "MONTHLY". If days 29-31 are
     *         specified, and the month does not have that many days, the audit
     *         takes place on the "LAST" day of the month.
     *         </p>
     */
    public String getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * <p>
     * The day of the month on which the scheduled audit takes place. Can be "1"
     * through "31" or "LAST". This field is required if the "frequency"
     * parameter is set to "MONTHLY". If days 29-31 are specified, and the month
     * does not have that many days, the audit takes place on the "LAST" day of
     * the month.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([1-9]|[12][0-9]|3[01])$|^LAST$<br/>
     *
     * @param dayOfMonth <p>
     *            The day of the month on which the scheduled audit takes place.
     *            Can be "1" through "31" or "LAST". This field is required if
     *            the "frequency" parameter is set to "MONTHLY". If days 29-31
     *            are specified, and the month does not have that many days, the
     *            audit takes place on the "LAST" day of the month.
     *            </p>
     */
    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * <p>
     * The day of the month on which the scheduled audit takes place. Can be "1"
     * through "31" or "LAST". This field is required if the "frequency"
     * parameter is set to "MONTHLY". If days 29-31 are specified, and the month
     * does not have that many days, the audit takes place on the "LAST" day of
     * the month.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^([1-9]|[12][0-9]|3[01])$|^LAST$<br/>
     *
     * @param dayOfMonth <p>
     *            The day of the month on which the scheduled audit takes place.
     *            Can be "1" through "31" or "LAST". This field is required if
     *            the "frequency" parameter is set to "MONTHLY". If days 29-31
     *            are specified, and the month does not have that many days, the
     *            audit takes place on the "LAST" day of the month.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateScheduledAuditRequest withDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit takes place. Can be one
     * of "SUN", "MON", "TUE", "WED", "THU", "FRI" or "SAT". This field is
     * required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUN, MON, TUE, WED, THU, FRI, SAT
     *
     * @return <p>
     *         The day of the week on which the scheduled audit takes place. Can
     *         be one of "SUN", "MON", "TUE", "WED", "THU", "FRI" or "SAT". This
     *         field is required if the "frequency" parameter is set to "WEEKLY"
     *         or "BIWEEKLY".
     *         </p>
     * @see DayOfWeek
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit takes place. Can be one
     * of "SUN", "MON", "TUE", "WED", "THU", "FRI" or "SAT". This field is
     * required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUN, MON, TUE, WED, THU, FRI, SAT
     *
     * @param dayOfWeek <p>
     *            The day of the week on which the scheduled audit takes place.
     *            Can be one of "SUN", "MON", "TUE", "WED", "THU", "FRI" or
     *            "SAT". This field is required if the "frequency" parameter is
     *            set to "WEEKLY" or "BIWEEKLY".
     *            </p>
     * @see DayOfWeek
     */
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit takes place. Can be one
     * of "SUN", "MON", "TUE", "WED", "THU", "FRI" or "SAT". This field is
     * required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUN, MON, TUE, WED, THU, FRI, SAT
     *
     * @param dayOfWeek <p>
     *            The day of the week on which the scheduled audit takes place.
     *            Can be one of "SUN", "MON", "TUE", "WED", "THU", "FRI" or
     *            "SAT". This field is required if the "frequency" parameter is
     *            set to "WEEKLY" or "BIWEEKLY".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DayOfWeek
     */
    public UpdateScheduledAuditRequest withDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit takes place. Can be one
     * of "SUN", "MON", "TUE", "WED", "THU", "FRI" or "SAT". This field is
     * required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUN, MON, TUE, WED, THU, FRI, SAT
     *
     * @param dayOfWeek <p>
     *            The day of the week on which the scheduled audit takes place.
     *            Can be one of "SUN", "MON", "TUE", "WED", "THU", "FRI" or
     *            "SAT". This field is required if the "frequency" parameter is
     *            set to "WEEKLY" or "BIWEEKLY".
     *            </p>
     * @see DayOfWeek
     */
    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek.toString();
    }

    /**
     * <p>
     * The day of the week on which the scheduled audit takes place. Can be one
     * of "SUN", "MON", "TUE", "WED", "THU", "FRI" or "SAT". This field is
     * required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SUN, MON, TUE, WED, THU, FRI, SAT
     *
     * @param dayOfWeek <p>
     *            The day of the week on which the scheduled audit takes place.
     *            Can be one of "SUN", "MON", "TUE", "WED", "THU", "FRI" or
     *            "SAT". This field is required if the "frequency" parameter is
     *            set to "WEEKLY" or "BIWEEKLY".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DayOfWeek
     */
    public UpdateScheduledAuditRequest withDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek.toString();
        return this;
    }

    /**
     * <p>
     * Which checks are performed during the scheduled audit. Checks must be
     * enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks including those that are enabled or
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.)
     * </p>
     *
     * @return <p>
     *         Which checks are performed during the scheduled audit. Checks
     *         must be enabled for your account. (Use
     *         <code>DescribeAccountAuditConfiguration</code> to see the list of
     *         all checks including those that are enabled or
     *         <code>UpdateAccountAuditConfiguration</code> to select which
     *         checks are enabled.)
     *         </p>
     */
    public java.util.List<String> getTargetCheckNames() {
        return targetCheckNames;
    }

    /**
     * <p>
     * Which checks are performed during the scheduled audit. Checks must be
     * enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks including those that are enabled or
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.)
     * </p>
     *
     * @param targetCheckNames <p>
     *            Which checks are performed during the scheduled audit. Checks
     *            must be enabled for your account. (Use
     *            <code>DescribeAccountAuditConfiguration</code> to see the list
     *            of all checks including those that are enabled or
     *            <code>UpdateAccountAuditConfiguration</code> to select which
     *            checks are enabled.)
     *            </p>
     */
    public void setTargetCheckNames(java.util.Collection<String> targetCheckNames) {
        if (targetCheckNames == null) {
            this.targetCheckNames = null;
            return;
        }

        this.targetCheckNames = new java.util.ArrayList<String>(targetCheckNames);
    }

    /**
     * <p>
     * Which checks are performed during the scheduled audit. Checks must be
     * enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks including those that are enabled or
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetCheckNames <p>
     *            Which checks are performed during the scheduled audit. Checks
     *            must be enabled for your account. (Use
     *            <code>DescribeAccountAuditConfiguration</code> to see the list
     *            of all checks including those that are enabled or
     *            <code>UpdateAccountAuditConfiguration</code> to select which
     *            checks are enabled.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateScheduledAuditRequest withTargetCheckNames(String... targetCheckNames) {
        if (getTargetCheckNames() == null) {
            this.targetCheckNames = new java.util.ArrayList<String>(targetCheckNames.length);
        }
        for (String value : targetCheckNames) {
            this.targetCheckNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Which checks are performed during the scheduled audit. Checks must be
     * enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks including those that are enabled or
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetCheckNames <p>
     *            Which checks are performed during the scheduled audit. Checks
     *            must be enabled for your account. (Use
     *            <code>DescribeAccountAuditConfiguration</code> to see the list
     *            of all checks including those that are enabled or
     *            <code>UpdateAccountAuditConfiguration</code> to select which
     *            checks are enabled.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateScheduledAuditRequest withTargetCheckNames(
            java.util.Collection<String> targetCheckNames) {
        setTargetCheckNames(targetCheckNames);
        return this;
    }

    /**
     * <p>
     * The name of the scheduled audit. (Max. 128 chars)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The name of the scheduled audit. (Max. 128 chars)
     *         </p>
     */
    public String getScheduledAuditName() {
        return scheduledAuditName;
    }

    /**
     * <p>
     * The name of the scheduled audit. (Max. 128 chars)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param scheduledAuditName <p>
     *            The name of the scheduled audit. (Max. 128 chars)
     *            </p>
     */
    public void setScheduledAuditName(String scheduledAuditName) {
        this.scheduledAuditName = scheduledAuditName;
    }

    /**
     * <p>
     * The name of the scheduled audit. (Max. 128 chars)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param scheduledAuditName <p>
     *            The name of the scheduled audit. (Max. 128 chars)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateScheduledAuditRequest withScheduledAuditName(String scheduledAuditName) {
        this.scheduledAuditName = scheduledAuditName;
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
        if (getFrequency() != null)
            sb.append("frequency: " + getFrequency() + ",");
        if (getDayOfMonth() != null)
            sb.append("dayOfMonth: " + getDayOfMonth() + ",");
        if (getDayOfWeek() != null)
            sb.append("dayOfWeek: " + getDayOfWeek() + ",");
        if (getTargetCheckNames() != null)
            sb.append("targetCheckNames: " + getTargetCheckNames() + ",");
        if (getScheduledAuditName() != null)
            sb.append("scheduledAuditName: " + getScheduledAuditName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getDayOfMonth() == null) ? 0 : getDayOfMonth().hashCode());
        hashCode = prime * hashCode + ((getDayOfWeek() == null) ? 0 : getDayOfWeek().hashCode());
        hashCode = prime * hashCode
                + ((getTargetCheckNames() == null) ? 0 : getTargetCheckNames().hashCode());
        hashCode = prime * hashCode
                + ((getScheduledAuditName() == null) ? 0 : getScheduledAuditName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateScheduledAuditRequest == false)
            return false;
        UpdateScheduledAuditRequest other = (UpdateScheduledAuditRequest) obj;

        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null
                && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getDayOfMonth() == null ^ this.getDayOfMonth() == null)
            return false;
        if (other.getDayOfMonth() != null
                && other.getDayOfMonth().equals(this.getDayOfMonth()) == false)
            return false;
        if (other.getDayOfWeek() == null ^ this.getDayOfWeek() == null)
            return false;
        if (other.getDayOfWeek() != null
                && other.getDayOfWeek().equals(this.getDayOfWeek()) == false)
            return false;
        if (other.getTargetCheckNames() == null ^ this.getTargetCheckNames() == null)
            return false;
        if (other.getTargetCheckNames() != null
                && other.getTargetCheckNames().equals(this.getTargetCheckNames()) == false)
            return false;
        if (other.getScheduledAuditName() == null ^ this.getScheduledAuditName() == null)
            return false;
        if (other.getScheduledAuditName() != null
                && other.getScheduledAuditName().equals(this.getScheduledAuditName()) == false)
            return false;
        return true;
    }
}
