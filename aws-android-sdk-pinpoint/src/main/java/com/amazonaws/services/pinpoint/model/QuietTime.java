/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Quiet Time
 */
public class QuietTime implements Serializable {
    /**
     * The time at which quiet time should end. The value that you specify has
     * to be in HH:mm format, where HH is the hour in 24-hour format (with a
     * leading zero, if applicable), and mm is the minutes. For example, use
     * 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
     */
    private String end;

    /**
     * The time at which quiet time should begin. The value that you specify has
     * to be in HH:mm format, where HH is the hour in 24-hour format (with a
     * leading zero, if applicable), and mm is the minutes. For example, use
     * 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
     */
    private String start;

    /**
     * The time at which quiet time should end. The value that you specify has
     * to be in HH:mm format, where HH is the hour in 24-hour format (with a
     * leading zero, if applicable), and mm is the minutes. For example, use
     * 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
     *
     * @return The time at which quiet time should end. The value that you
     *         specify has to be in HH:mm format, where HH is the hour in
     *         24-hour format (with a leading zero, if applicable), and mm is
     *         the minutes. For example, use 02:30 to represent 2:30 AM, or
     *         14:30 to represent 2:30 PM.
     */
    public String getEnd() {
        return end;
    }

    /**
     * The time at which quiet time should end. The value that you specify has
     * to be in HH:mm format, where HH is the hour in 24-hour format (with a
     * leading zero, if applicable), and mm is the minutes. For example, use
     * 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
     *
     * @param end The time at which quiet time should end. The value that you
     *            specify has to be in HH:mm format, where HH is the hour in
     *            24-hour format (with a leading zero, if applicable), and mm is
     *            the minutes. For example, use 02:30 to represent 2:30 AM, or
     *            14:30 to represent 2:30 PM.
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * The time at which quiet time should end. The value that you specify has
     * to be in HH:mm format, where HH is the hour in 24-hour format (with a
     * leading zero, if applicable), and mm is the minutes. For example, use
     * 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param end The time at which quiet time should end. The value that you
     *            specify has to be in HH:mm format, where HH is the hour in
     *            24-hour format (with a leading zero, if applicable), and mm is
     *            the minutes. For example, use 02:30 to represent 2:30 AM, or
     *            14:30 to represent 2:30 PM.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QuietTime withEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * The time at which quiet time should begin. The value that you specify has
     * to be in HH:mm format, where HH is the hour in 24-hour format (with a
     * leading zero, if applicable), and mm is the minutes. For example, use
     * 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
     *
     * @return The time at which quiet time should begin. The value that you
     *         specify has to be in HH:mm format, where HH is the hour in
     *         24-hour format (with a leading zero, if applicable), and mm is
     *         the minutes. For example, use 02:30 to represent 2:30 AM, or
     *         14:30 to represent 2:30 PM.
     */
    public String getStart() {
        return start;
    }

    /**
     * The time at which quiet time should begin. The value that you specify has
     * to be in HH:mm format, where HH is the hour in 24-hour format (with a
     * leading zero, if applicable), and mm is the minutes. For example, use
     * 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
     *
     * @param start The time at which quiet time should begin. The value that
     *            you specify has to be in HH:mm format, where HH is the hour in
     *            24-hour format (with a leading zero, if applicable), and mm is
     *            the minutes. For example, use 02:30 to represent 2:30 AM, or
     *            14:30 to represent 2:30 PM.
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * The time at which quiet time should begin. The value that you specify has
     * to be in HH:mm format, where HH is the hour in 24-hour format (with a
     * leading zero, if applicable), and mm is the minutes. For example, use
     * 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param start The time at which quiet time should begin. The value that
     *            you specify has to be in HH:mm format, where HH is the hour in
     *            24-hour format (with a leading zero, if applicable), and mm is
     *            the minutes. For example, use 02:30 to represent 2:30 AM, or
     *            14:30 to represent 2:30 PM.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QuietTime withStart(String start) {
        this.start = start;
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
        if (getEnd() != null)
            sb.append("End: " + getEnd() + ",");
        if (getStart() != null)
            sb.append("Start: " + getStart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuietTime == false)
            return false;
        QuietTime other = (QuietTime) obj;

        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        return true;
    }
}
