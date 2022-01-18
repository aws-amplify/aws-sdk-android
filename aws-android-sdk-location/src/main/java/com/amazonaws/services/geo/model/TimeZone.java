/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a time zone. Includes the name of the time zone and the
 * offset from UTC in seconds.
 * </p>
 */
public class TimeZone implements Serializable {
    /**
     * <p>
     * The name of the time zone, following the <a
     * href="https://www.iana.org/time-zones"> IANA time zone standard</a>. For
     * example, <code>America/Los_Angeles</code>.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The time zone's offset, in seconds, from UTC.
     * </p>
     */
    private Integer offset;

    /**
     * <p>
     * The name of the time zone, following the <a
     * href="https://www.iana.org/time-zones"> IANA time zone standard</a>. For
     * example, <code>America/Los_Angeles</code>.
     * </p>
     *
     * @return <p>
     *         The name of the time zone, following the <a
     *         href="https://www.iana.org/time-zones"> IANA time zone
     *         standard</a>. For example, <code>America/Los_Angeles</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the time zone, following the <a
     * href="https://www.iana.org/time-zones"> IANA time zone standard</a>. For
     * example, <code>America/Los_Angeles</code>.
     * </p>
     *
     * @param name <p>
     *            The name of the time zone, following the <a
     *            href="https://www.iana.org/time-zones"> IANA time zone
     *            standard</a>. For example, <code>America/Los_Angeles</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the time zone, following the <a
     * href="https://www.iana.org/time-zones"> IANA time zone standard</a>. For
     * example, <code>America/Los_Angeles</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the time zone, following the <a
     *            href="https://www.iana.org/time-zones"> IANA time zone
     *            standard</a>. For example, <code>America/Los_Angeles</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimeZone withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The time zone's offset, in seconds, from UTC.
     * </p>
     *
     * @return <p>
     *         The time zone's offset, in seconds, from UTC.
     *         </p>
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * <p>
     * The time zone's offset, in seconds, from UTC.
     * </p>
     *
     * @param offset <p>
     *            The time zone's offset, in seconds, from UTC.
     *            </p>
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * <p>
     * The time zone's offset, in seconds, from UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offset <p>
     *            The time zone's offset, in seconds, from UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimeZone withOffset(Integer offset) {
        this.offset = offset;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getOffset() != null)
            sb.append("Offset: " + getOffset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeZone == false)
            return false;
        TimeZone other = (TimeZone) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOffset() == null ^ this.getOffset() == null)
            return false;
        if (other.getOffset() != null && other.getOffset().equals(this.getOffset()) == false)
            return false;
        return true;
    }
}
