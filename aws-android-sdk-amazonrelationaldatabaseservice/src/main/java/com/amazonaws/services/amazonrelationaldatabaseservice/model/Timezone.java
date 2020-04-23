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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p>
 * A time zone associated with a <code>DBInstance</code> or a
 * <code>DBSnapshot</code>. This data type is an element in the response to the
 * <code>DescribeDBInstances</code>, the <code>DescribeDBSnapshots</code>, and
 * the <code>DescribeDBEngineVersions</code> actions.
 * </p>
 */
public class Timezone implements Serializable {
    /**
     * <p>
     * The name of the time zone.
     * </p>
     */
    private String timezoneName;

    /**
     * <p>
     * The name of the time zone.
     * </p>
     *
     * @return <p>
     *         The name of the time zone.
     *         </p>
     */
    public String getTimezoneName() {
        return timezoneName;
    }

    /**
     * <p>
     * The name of the time zone.
     * </p>
     *
     * @param timezoneName <p>
     *            The name of the time zone.
     *            </p>
     */
    public void setTimezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
    }

    /**
     * <p>
     * The name of the time zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timezoneName <p>
     *            The name of the time zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Timezone withTimezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
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
        if (getTimezoneName() != null)
            sb.append("TimezoneName: " + getTimezoneName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTimezoneName() == null) ? 0 : getTimezoneName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Timezone == false)
            return false;
        Timezone other = (Timezone) obj;

        if (other.getTimezoneName() == null ^ this.getTimezoneName() == null)
            return false;
        if (other.getTimezoneName() != null
                && other.getTimezoneName().equals(this.getTimezoneName()) == false)
            return false;
        return true;
    }
}
