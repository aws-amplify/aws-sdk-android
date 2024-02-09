/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Object describing time with which the segment is associated. It can have
 * different representations of time. Currently supported: absoluteTime
 * </p>
 */
public class RealTimeContactAnalysisTimeData implements Serializable {
    /**
     * <p>
     * Time represented in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For
     * example, 2019-11-08T02:41:28.172Z.
     * </p>
     */
    private java.util.Date absoluteTime;

    /**
     * <p>
     * Time represented in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For
     * example, 2019-11-08T02:41:28.172Z.
     * </p>
     *
     * @return <p>
     *         Time represented in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ.
     *         For example, 2019-11-08T02:41:28.172Z.
     *         </p>
     */
    public java.util.Date getAbsoluteTime() {
        return absoluteTime;
    }

    /**
     * <p>
     * Time represented in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For
     * example, 2019-11-08T02:41:28.172Z.
     * </p>
     *
     * @param absoluteTime <p>
     *            Time represented in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ.
     *            For example, 2019-11-08T02:41:28.172Z.
     *            </p>
     */
    public void setAbsoluteTime(java.util.Date absoluteTime) {
        this.absoluteTime = absoluteTime;
    }

    /**
     * <p>
     * Time represented in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For
     * example, 2019-11-08T02:41:28.172Z.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param absoluteTime <p>
     *            Time represented in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ.
     *            For example, 2019-11-08T02:41:28.172Z.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisTimeData withAbsoluteTime(java.util.Date absoluteTime) {
        this.absoluteTime = absoluteTime;
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
        if (getAbsoluteTime() != null)
            sb.append("AbsoluteTime: " + getAbsoluteTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAbsoluteTime() == null) ? 0 : getAbsoluteTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeContactAnalysisTimeData == false)
            return false;
        RealTimeContactAnalysisTimeData other = (RealTimeContactAnalysisTimeData) obj;

        if (other.getAbsoluteTime() == null ^ this.getAbsoluteTime() == null)
            return false;
        if (other.getAbsoluteTime() != null
                && other.getAbsoluteTime().equals(this.getAbsoluteTime()) == false)
            return false;
        return true;
    }
}
