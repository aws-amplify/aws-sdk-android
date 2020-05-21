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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the byte range of the object to get the records from. A record is
 * processed when its first byte is contained by the range. This parameter is
 * optional, but when specified, it must not be empty. See RFC 2616, Section
 * 14.35.1 about how to specify the start and end of the range.
 * </p>
 */
public class ScanRange implements Serializable {
    /**
     * <p>
     * Specifies the start of the byte range. This parameter is optional. Valid
     * values: non-negative integers. The default value is 0. If only start is
     * supplied, it means scan from that point to the end of the file.For
     * example;
     * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code>
     * means scan from byte 50 until the end of the file.
     * </p>
     */
    private Long start;

    /**
     * <p>
     * Specifies the end of the byte range. This parameter is optional. Valid
     * values: non-negative integers. The default value is one less than the
     * size of the object being queried. If only the End parameter is supplied,
     * it is interpreted to mean scan the last N bytes of the file. For example,
     * <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code>
     * means scan the last 50 bytes.
     * </p>
     */
    private Long end;

    /**
     * <p>
     * Specifies the start of the byte range. This parameter is optional. Valid
     * values: non-negative integers. The default value is 0. If only start is
     * supplied, it means scan from that point to the end of the file.For
     * example;
     * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code>
     * means scan from byte 50 until the end of the file.
     * </p>
     *
     * @return <p>
     *         Specifies the start of the byte range. This parameter is
     *         optional. Valid values: non-negative integers. The default value
     *         is 0. If only start is supplied, it means scan from that point to
     *         the end of the file.For example;
     *         <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code>
     *         means scan from byte 50 until the end of the file.
     *         </p>
     */
    public Long getStart() {
        return start;
    }

    /**
     * <p>
     * Specifies the start of the byte range. This parameter is optional. Valid
     * values: non-negative integers. The default value is 0. If only start is
     * supplied, it means scan from that point to the end of the file.For
     * example;
     * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code>
     * means scan from byte 50 until the end of the file.
     * </p>
     *
     * @param start <p>
     *            Specifies the start of the byte range. This parameter is
     *            optional. Valid values: non-negative integers. The default
     *            value is 0. If only start is supplied, it means scan from that
     *            point to the end of the file.For example;
     *            <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code>
     *            means scan from byte 50 until the end of the file.
     *            </p>
     */
    public void setStart(Long start) {
        this.start = start;
    }

    /**
     * <p>
     * Specifies the start of the byte range. This parameter is optional. Valid
     * values: non-negative integers. The default value is 0. If only start is
     * supplied, it means scan from that point to the end of the file.For
     * example;
     * <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code>
     * means scan from byte 50 until the end of the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param start <p>
     *            Specifies the start of the byte range. This parameter is
     *            optional. Valid values: non-negative integers. The default
     *            value is 0. If only start is supplied, it means scan from that
     *            point to the end of the file.For example;
     *            <code>&lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt;</code>
     *            means scan from byte 50 until the end of the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanRange withStart(Long start) {
        this.start = start;
        return this;
    }

    /**
     * <p>
     * Specifies the end of the byte range. This parameter is optional. Valid
     * values: non-negative integers. The default value is one less than the
     * size of the object being queried. If only the End parameter is supplied,
     * it is interpreted to mean scan the last N bytes of the file. For example,
     * <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code>
     * means scan the last 50 bytes.
     * </p>
     *
     * @return <p>
     *         Specifies the end of the byte range. This parameter is optional.
     *         Valid values: non-negative integers. The default value is one
     *         less than the size of the object being queried. If only the End
     *         parameter is supplied, it is interpreted to mean scan the last N
     *         bytes of the file. For example,
     *         <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code>
     *         means scan the last 50 bytes.
     *         </p>
     */
    public Long getEnd() {
        return end;
    }

    /**
     * <p>
     * Specifies the end of the byte range. This parameter is optional. Valid
     * values: non-negative integers. The default value is one less than the
     * size of the object being queried. If only the End parameter is supplied,
     * it is interpreted to mean scan the last N bytes of the file. For example,
     * <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code>
     * means scan the last 50 bytes.
     * </p>
     *
     * @param end <p>
     *            Specifies the end of the byte range. This parameter is
     *            optional. Valid values: non-negative integers. The default
     *            value is one less than the size of the object being queried.
     *            If only the End parameter is supplied, it is interpreted to
     *            mean scan the last N bytes of the file. For example,
     *            <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code>
     *            means scan the last 50 bytes.
     *            </p>
     */
    public void setEnd(Long end) {
        this.end = end;
    }

    /**
     * <p>
     * Specifies the end of the byte range. This parameter is optional. Valid
     * values: non-negative integers. The default value is one less than the
     * size of the object being queried. If only the End parameter is supplied,
     * it is interpreted to mean scan the last N bytes of the file. For example,
     * <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code>
     * means scan the last 50 bytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param end <p>
     *            Specifies the end of the byte range. This parameter is
     *            optional. Valid values: non-negative integers. The default
     *            value is one less than the size of the object being queried.
     *            If only the End parameter is supplied, it is interpreted to
     *            mean scan the last N bytes of the file. For example,
     *            <code>&lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt;</code>
     *            means scan the last 50 bytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScanRange withEnd(Long end) {
        this.end = end;
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
        if (getStart() != null)
            sb.append("Start: " + getStart() + ",");
        if (getEnd() != null)
            sb.append("End: " + getEnd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScanRange == false)
            return false;
        ScanRange other = (ScanRange) obj;

        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        return true;
    }
}
