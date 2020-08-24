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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Gets the state of the AWS Systems Manager Change Calendar at an optional, specified time. If you specify a time, <code>GetCalendarState</code> returns the state of the calendar at a specific time, and returns the next time that the Change Calendar state will transition. If you do not specify a time, <code>GetCalendarState</code> assumes the current time. Change Calendar entries have two possible states: <code>OPEN</code> or <code>CLOSED</code>.</p> <p>If you specify more than one calendar in a request, the command returns the status of <code>OPEN</code> only if all calendars in the request are open. If one or more calendars in the request are closed, the status returned is <code>CLOSED</code>.</p> <p>For more information about Systems Manager Change Calendar, see <a href="https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar.html">AWS Systems Manager Change Calendar</a> in the <i>AWS Systems Manager User Guide</i>.</p>
 */
public class GetCalendarStateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries for which you want to get the state.</p>
     */
    private java.util.List<String> calendarNames;

    /**
     * <p>(Optional) The specific time for which you want to get calendar state information, in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> format. If you do not add <code>AtTime</code>, the current time is assumed.</p>
     */
    private String atTime;

    /**
     * <p>The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries for which you want to get the state.</p>
     *
     * @return <p>The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries for which you want to get the state.</p>
     */
    public java.util.List<String> getCalendarNames() {
        return calendarNames;
    }

    /**
     * <p>The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries for which you want to get the state.</p>
     *
     * @param calendarNames <p>The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries for which you want to get the state.</p>
     */
    public void setCalendarNames(java.util.Collection<String> calendarNames) {
        if (calendarNames == null) {
            this.calendarNames = null;
            return;
        }

        this.calendarNames = new java.util.ArrayList<String>(calendarNames);
    }

    /**
     * <p>The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries for which you want to get the state.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param calendarNames <p>The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries for which you want to get the state.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetCalendarStateRequest withCalendarNames(String... calendarNames) {
        if (getCalendarNames() == null) {
            this.calendarNames = new java.util.ArrayList<String>(calendarNames.length);
        }
        for (String value : calendarNames) {
            this.calendarNames.add(value);
        }
        return this;
    }

    /**
     * <p>The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries for which you want to get the state.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param calendarNames <p>The names or Amazon Resource Names (ARNs) of the Systems Manager documents that represent the calendar entries for which you want to get the state.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetCalendarStateRequest withCalendarNames(java.util.Collection<String> calendarNames) {
        setCalendarNames(calendarNames);
        return this;
    }

    /**
     * <p>(Optional) The specific time for which you want to get calendar state information, in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> format. If you do not add <code>AtTime</code>, the current time is assumed.</p>
     *
     * @return <p>(Optional) The specific time for which you want to get calendar state information, in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> format. If you do not add <code>AtTime</code>, the current time is assumed.</p>
     */
    public String getAtTime() {
        return atTime;
    }

    /**
     * <p>(Optional) The specific time for which you want to get calendar state information, in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> format. If you do not add <code>AtTime</code>, the current time is assumed.</p>
     *
     * @param atTime <p>(Optional) The specific time for which you want to get calendar state information, in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> format. If you do not add <code>AtTime</code>, the current time is assumed.</p>
     */
    public void setAtTime(String atTime) {
        this.atTime = atTime;
    }

    /**
     * <p>(Optional) The specific time for which you want to get calendar state information, in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> format. If you do not add <code>AtTime</code>, the current time is assumed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param atTime <p>(Optional) The specific time for which you want to get calendar state information, in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> format. If you do not add <code>AtTime</code>, the current time is assumed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetCalendarStateRequest withAtTime(String atTime) {
        this.atTime = atTime;
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
        if (getCalendarNames() != null) sb.append("CalendarNames: " + getCalendarNames() + ",");
        if (getAtTime() != null) sb.append("AtTime: " + getAtTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCalendarNames() == null) ? 0 : getCalendarNames().hashCode());
        hashCode = prime * hashCode + ((getAtTime() == null) ? 0 : getAtTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetCalendarStateRequest == false) return false;
        GetCalendarStateRequest other = (GetCalendarStateRequest)obj;

        if (other.getCalendarNames() == null ^ this.getCalendarNames() == null) return false;
        if (other.getCalendarNames() != null && other.getCalendarNames().equals(this.getCalendarNames()) == false) return false;
        if (other.getAtTime() == null ^ this.getAtTime() == null) return false;
        if (other.getAtTime() != null && other.getAtTime().equals(this.getAtTime()) == false) return false;
        return true;
    }
}
