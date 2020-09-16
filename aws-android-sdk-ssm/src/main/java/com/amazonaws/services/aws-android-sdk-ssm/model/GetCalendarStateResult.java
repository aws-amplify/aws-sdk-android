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


public class GetCalendarStateResult implements Serializable {
    /**
     * <p>The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed, and a <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     */
    private String state;

    /**
     * <p>The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that you specified in your command. If you did not specify a time, <code>GetCalendarState</code> uses the current time.</p>
     */
    private String atTime;

    /**
     * <p>The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that the calendar state will change. If the current calendar state is <code>OPEN</code>, <code>NextTransitionTime</code> indicates when the calendar state changes to <code>CLOSED</code>, and vice-versa.</p>
     */
    private String nextTransitionTime;

    /**
     * <p>The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed, and a <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @return <p>The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed, and a <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.</p>
     *
     * @see CalendarState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed, and a <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param state <p>The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed, and a <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.</p>
     *
     * @see CalendarState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed, and a <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param state <p>The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed, and a <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see CalendarState
     */
    public GetCalendarStateResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed, and a <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param state <p>The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed, and a <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.</p>
     *
     * @see CalendarState
     */
    public void setState(CalendarState state) {
        this.state = state.toString();
    }

    /**
     * <p>The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed, and a <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OPEN, CLOSED
     *
     * @param state <p>The state of the calendar. An <code>OPEN</code> calendar indicates that actions are allowed to proceed, and a <code>CLOSED</code> calendar indicates that actions are not allowed to proceed.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see CalendarState
     */
    public GetCalendarStateResult withState(CalendarState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that you specified in your command. If you did not specify a time, <code>GetCalendarState</code> uses the current time.</p>
     *
     * @return <p>The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that you specified in your command. If you did not specify a time, <code>GetCalendarState</code> uses the current time.</p>
     */
    public String getAtTime() {
        return atTime;
    }

    /**
     * <p>The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that you specified in your command. If you did not specify a time, <code>GetCalendarState</code> uses the current time.</p>
     *
     * @param atTime <p>The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that you specified in your command. If you did not specify a time, <code>GetCalendarState</code> uses the current time.</p>
     */
    public void setAtTime(String atTime) {
        this.atTime = atTime;
    }

    /**
     * <p>The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that you specified in your command. If you did not specify a time, <code>GetCalendarState</code> uses the current time.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param atTime <p>The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that you specified in your command. If you did not specify a time, <code>GetCalendarState</code> uses the current time.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetCalendarStateResult withAtTime(String atTime) {
        this.atTime = atTime;
        return this;
    }

    /**
     * <p>The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that the calendar state will change. If the current calendar state is <code>OPEN</code>, <code>NextTransitionTime</code> indicates when the calendar state changes to <code>CLOSED</code>, and vice-versa.</p>
     *
     * @return <p>The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that the calendar state will change. If the current calendar state is <code>OPEN</code>, <code>NextTransitionTime</code> indicates when the calendar state changes to <code>CLOSED</code>, and vice-versa.</p>
     */
    public String getNextTransitionTime() {
        return nextTransitionTime;
    }

    /**
     * <p>The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that the calendar state will change. If the current calendar state is <code>OPEN</code>, <code>NextTransitionTime</code> indicates when the calendar state changes to <code>CLOSED</code>, and vice-versa.</p>
     *
     * @param nextTransitionTime <p>The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that the calendar state will change. If the current calendar state is <code>OPEN</code>, <code>NextTransitionTime</code> indicates when the calendar state changes to <code>CLOSED</code>, and vice-versa.</p>
     */
    public void setNextTransitionTime(String nextTransitionTime) {
        this.nextTransitionTime = nextTransitionTime;
    }

    /**
     * <p>The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that the calendar state will change. If the current calendar state is <code>OPEN</code>, <code>NextTransitionTime</code> indicates when the calendar state changes to <code>CLOSED</code>, and vice-versa.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextTransitionTime <p>The time, as an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> string, that the calendar state will change. If the current calendar state is <code>OPEN</code>, <code>NextTransitionTime</code> indicates when the calendar state changes to <code>CLOSED</code>, and vice-versa.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetCalendarStateResult withNextTransitionTime(String nextTransitionTime) {
        this.nextTransitionTime = nextTransitionTime;
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
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getAtTime() != null) sb.append("AtTime: " + getAtTime() + ",");
        if (getNextTransitionTime() != null) sb.append("NextTransitionTime: " + getNextTransitionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getAtTime() == null) ? 0 : getAtTime().hashCode());
        hashCode = prime * hashCode + ((getNextTransitionTime() == null) ? 0 : getNextTransitionTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetCalendarStateResult == false) return false;
        GetCalendarStateResult other = (GetCalendarStateResult)obj;

        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false;
        if (other.getAtTime() == null ^ this.getAtTime() == null) return false;
        if (other.getAtTime() != null && other.getAtTime().equals(this.getAtTime()) == false) return false;
        if (other.getNextTransitionTime() == null ^ this.getNextTransitionTime() == null) return false;
        if (other.getNextTransitionTime() != null && other.getNextTransitionTime().equals(this.getNextTransitionTime()) == false) return false;
        return true;
    }
}
