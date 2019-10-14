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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies criteria for including or excluding endpoints from a segment based
 * on how recently an endpoint was active.
 * </p>
 */
public class RecencyDimension implements Serializable {
    /**
     * <p>
     * The duration to use when determining whether an endpoint is active or
     * inactive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HR_24, DAY_7, DAY_14, DAY_30
     */
    private String duration;

    /**
     * <p>
     * The type of recency dimension to use for the segment. Valid values are:
     * ACTIVE, endpoints that were active within the specified duration are
     * included in the segment; and, INACTIVE, endpoints that weren't active
     * within the specified duration are included in the segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     */
    private String recencyType;

    /**
     * <p>
     * The duration to use when determining whether an endpoint is active or
     * inactive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HR_24, DAY_7, DAY_14, DAY_30
     *
     * @return <p>
     *         The duration to use when determining whether an endpoint is
     *         active or inactive.
     *         </p>
     * @see Duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * <p>
     * The duration to use when determining whether an endpoint is active or
     * inactive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HR_24, DAY_7, DAY_14, DAY_30
     *
     * @param duration <p>
     *            The duration to use when determining whether an endpoint is
     *            active or inactive.
     *            </p>
     * @see Duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration to use when determining whether an endpoint is active or
     * inactive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HR_24, DAY_7, DAY_14, DAY_30
     *
     * @param duration <p>
     *            The duration to use when determining whether an endpoint is
     *            active or inactive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Duration
     */
    public RecencyDimension withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The duration to use when determining whether an endpoint is active or
     * inactive.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HR_24, DAY_7, DAY_14, DAY_30
     *
     * @param duration <p>
     *            The duration to use when determining whether an endpoint is
     *            active or inactive.
     *            </p>
     * @see Duration
     */
    public void setDuration(Duration duration) {
        this.duration = duration.toString();
    }

    /**
     * <p>
     * The duration to use when determining whether an endpoint is active or
     * inactive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HR_24, DAY_7, DAY_14, DAY_30
     *
     * @param duration <p>
     *            The duration to use when determining whether an endpoint is
     *            active or inactive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Duration
     */
    public RecencyDimension withDuration(Duration duration) {
        this.duration = duration.toString();
        return this;
    }

    /**
     * <p>
     * The type of recency dimension to use for the segment. Valid values are:
     * ACTIVE, endpoints that were active within the specified duration are
     * included in the segment; and, INACTIVE, endpoints that weren't active
     * within the specified duration are included in the segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @return <p>
     *         The type of recency dimension to use for the segment. Valid
     *         values are: ACTIVE, endpoints that were active within the
     *         specified duration are included in the segment; and, INACTIVE,
     *         endpoints that weren't active within the specified duration are
     *         included in the segment.
     *         </p>
     * @see RecencyType
     */
    public String getRecencyType() {
        return recencyType;
    }

    /**
     * <p>
     * The type of recency dimension to use for the segment. Valid values are:
     * ACTIVE, endpoints that were active within the specified duration are
     * included in the segment; and, INACTIVE, endpoints that weren't active
     * within the specified duration are included in the segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param recencyType <p>
     *            The type of recency dimension to use for the segment. Valid
     *            values are: ACTIVE, endpoints that were active within the
     *            specified duration are included in the segment; and, INACTIVE,
     *            endpoints that weren't active within the specified duration
     *            are included in the segment.
     *            </p>
     * @see RecencyType
     */
    public void setRecencyType(String recencyType) {
        this.recencyType = recencyType;
    }

    /**
     * <p>
     * The type of recency dimension to use for the segment. Valid values are:
     * ACTIVE, endpoints that were active within the specified duration are
     * included in the segment; and, INACTIVE, endpoints that weren't active
     * within the specified duration are included in the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param recencyType <p>
     *            The type of recency dimension to use for the segment. Valid
     *            values are: ACTIVE, endpoints that were active within the
     *            specified duration are included in the segment; and, INACTIVE,
     *            endpoints that weren't active within the specified duration
     *            are included in the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecencyType
     */
    public RecencyDimension withRecencyType(String recencyType) {
        this.recencyType = recencyType;
        return this;
    }

    /**
     * <p>
     * The type of recency dimension to use for the segment. Valid values are:
     * ACTIVE, endpoints that were active within the specified duration are
     * included in the segment; and, INACTIVE, endpoints that weren't active
     * within the specified duration are included in the segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param recencyType <p>
     *            The type of recency dimension to use for the segment. Valid
     *            values are: ACTIVE, endpoints that were active within the
     *            specified duration are included in the segment; and, INACTIVE,
     *            endpoints that weren't active within the specified duration
     *            are included in the segment.
     *            </p>
     * @see RecencyType
     */
    public void setRecencyType(RecencyType recencyType) {
        this.recencyType = recencyType.toString();
    }

    /**
     * <p>
     * The type of recency dimension to use for the segment. Valid values are:
     * ACTIVE, endpoints that were active within the specified duration are
     * included in the segment; and, INACTIVE, endpoints that weren't active
     * within the specified duration are included in the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param recencyType <p>
     *            The type of recency dimension to use for the segment. Valid
     *            values are: ACTIVE, endpoints that were active within the
     *            specified duration are included in the segment; and, INACTIVE,
     *            endpoints that weren't active within the specified duration
     *            are included in the segment.
     *            </p>
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
