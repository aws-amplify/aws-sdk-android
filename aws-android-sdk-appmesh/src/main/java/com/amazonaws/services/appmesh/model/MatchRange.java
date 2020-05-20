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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents the range of values to match on. The first
 * character of the range is included in the range, though the last character is
 * not. For example, if the range specified were 1-100, only values 1-99 would
 * be matched.
 * </p>
 */
public class MatchRange implements Serializable {
    /**
     * <p>
     * The end of the range.
     * </p>
     */
    private Long end;

    /**
     * <p>
     * The start of the range.
     * </p>
     */
    private Long start;

    /**
     * <p>
     * The end of the range.
     * </p>
     *
     * @return <p>
     *         The end of the range.
     *         </p>
     */
    public Long getEnd() {
        return end;
    }

    /**
     * <p>
     * The end of the range.
     * </p>
     *
     * @param end <p>
     *            The end of the range.
     *            </p>
     */
    public void setEnd(Long end) {
        this.end = end;
    }

    /**
     * <p>
     * The end of the range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param end <p>
     *            The end of the range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MatchRange withEnd(Long end) {
        this.end = end;
        return this;
    }

    /**
     * <p>
     * The start of the range.
     * </p>
     *
     * @return <p>
     *         The start of the range.
     *         </p>
     */
    public Long getStart() {
        return start;
    }

    /**
     * <p>
     * The start of the range.
     * </p>
     *
     * @param start <p>
     *            The start of the range.
     *            </p>
     */
    public void setStart(Long start) {
        this.start = start;
    }

    /**
     * <p>
     * The start of the range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param start <p>
     *            The start of the range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MatchRange withStart(Long start) {
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
            sb.append("end: " + getEnd() + ",");
        if (getStart() != null)
            sb.append("start: " + getStart());
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

        if (obj instanceof MatchRange == false)
            return false;
        MatchRange other = (MatchRange) obj;

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
