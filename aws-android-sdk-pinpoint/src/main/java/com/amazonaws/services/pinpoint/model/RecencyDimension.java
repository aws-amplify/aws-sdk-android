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
 * Define how a segment based on recency of use.
 */
public class RecencyDimension implements Serializable {
    /**
     * The length of time during which users have been active or inactive with
     * your app. Valid values: HR_24, DAY_7, DAY_14, DAY_30
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HR_24, DAY_7, DAY_14, DAY_30
     */
    private String duration;

    /**
     * The recency dimension type: ACTIVE - Users who have used your app within
     * the specified duration are included in the segment. INACTIVE - Users who
     * have not used your app within the specified duration are included in the
     * segment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     */
    private String recencyType;

    /**
     * The length of time during which users have been active or inactive with
     * your app. Valid values: HR_24, DAY_7, DAY_14, DAY_30
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HR_24, DAY_7, DAY_14, DAY_30
     *
     * @return The length of time during which users have been active or
     *         inactive with your app. Valid values: HR_24, DAY_7, DAY_14,
     *         DAY_30
     * @see Duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * The length of time during which users have been active or inactive with
     * your app. Valid values: HR_24, DAY_7, DAY_14, DAY_30
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HR_24, DAY_7, DAY_14, DAY_30
     *
     * @param duration The length of time during which users have been active or
     *            inactive with your app. Valid values: HR_24, DAY_7, DAY_14,
     *            DAY_30
     * @see Duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * The length of time during which users have been active or inactive with
     * your app. Valid values: HR_24, DAY_7, DAY_14, DAY_30
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HR_24, DAY_7, DAY_14, DAY_30
     *
     * @param duration The length of time during which users have been active or
     *            inactive with your app. Valid values: HR_24, DAY_7, DAY_14,
     *            DAY_30
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Duration
     */
    public RecencyDimension withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The length of time during which users have been active or inactive with
     * your app. Valid values: HR_24, DAY_7, DAY_14, DAY_30
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HR_24, DAY_7, DAY_14, DAY_30
     *
     * @param duration The length of time during which users have been active or
     *            inactive with your app. Valid values: HR_24, DAY_7, DAY_14,
     *            DAY_30
     * @see Duration
     */
    public void setDuration(Duration duration) {
        this.duration = duration.toString();
    }

    /**
     * The length of time during which users have been active or inactive with
     * your app. Valid values: HR_24, DAY_7, DAY_14, DAY_30
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HR_24, DAY_7, DAY_14, DAY_30
     *
     * @param duration The length of time during which users have been active or
     *            inactive with your app. Valid values: HR_24, DAY_7, DAY_14,
     *            DAY_30
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Duration
     */
    public RecencyDimension withDuration(Duration duration) {
        this.duration = duration.toString();
        return this;
    }

    /**
     * The recency dimension type: ACTIVE - Users who have used your app within
     * the specified duration are included in the segment. INACTIVE - Users who
     * have not used your app within the specified duration are included in the
     * segment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @return The recency dimension type: ACTIVE - Users who have used your app
     *         within the specified duration are included in the segment.
     *         INACTIVE - Users who have not used your app within the specified
     *         duration are included in the segment.
     * @see RecencyType
     */
    public String getRecencyType() {
        return recencyType;
    }

    /**
     * The recency dimension type: ACTIVE - Users who have used your app within
     * the specified duration are included in the segment. INACTIVE - Users who
     * have not used your app within the specified duration are included in the
     * segment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param recencyType The recency dimension type: ACTIVE - Users who have
     *            used your app within the specified duration are included in
     *            the segment. INACTIVE - Users who have not used your app
     *            within the specified duration are included in the segment.
     * @see RecencyType
     */
    public void setRecencyType(String recencyType) {
        this.recencyType = recencyType;
    }

    /**
     * The recency dimension type: ACTIVE - Users who have used your app within
     * the specified duration are included in the segment. INACTIVE - Users who
     * have not used your app within the specified duration are included in the
     * segment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param recencyType The recency dimension type: ACTIVE - Users who have
     *            used your app within the specified duration are included in
     *            the segment. INACTIVE - Users who have not used your app
     *            within the specified duration are included in the segment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecencyType
     */
    public RecencyDimension withRecencyType(String recencyType) {
        this.recencyType = recencyType;
        return this;
    }

    /**
     * The recency dimension type: ACTIVE - Users who have used your app within
     * the specified duration are included in the segment. INACTIVE - Users who
     * have not used your app within the specified duration are included in the
     * segment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param recencyType The recency dimension type: ACTIVE - Users who have
     *            used your app within the specified duration are included in
     *            the segment. INACTIVE - Users who have not used your app
     *            within the specified duration are included in the segment.
     * @see RecencyType
     */
    public void setRecencyType(RecencyType recencyType) {
        this.recencyType = recencyType.toString();
    }

    /**
     * The recency dimension type: ACTIVE - Users who have used your app within
     * the specified duration are included in the segment. INACTIVE - Users who
     * have not used your app within the specified duration are included in the
     * segment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param recencyType The recency dimension type: ACTIVE - Users who have
     *            used your app within the specified duration are included in
     *            the segment. INACTIVE - Users who have not used your app
     *            within the specified duration are included in the segment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecencyType
     */
    public RecencyDimension withRecencyType(RecencyType recencyType) {
        this.recencyType = recencyType.toString();
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
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getRecencyType() != null)
            sb.append("RecencyType: " + getRecencyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode
                + ((getRecencyType() == null) ? 0 : getRecencyType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecencyDimension == false)
            return false;
        RecencyDimension other = (RecencyDimension) obj;

        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getRecencyType() == null ^ this.getRecencyType() == null)
            return false;
        if (other.getRecencyType() != null
                && other.getRecencyType().equals(this.getRecencyType()) == false)
            return false;
        return true;
    }
}
