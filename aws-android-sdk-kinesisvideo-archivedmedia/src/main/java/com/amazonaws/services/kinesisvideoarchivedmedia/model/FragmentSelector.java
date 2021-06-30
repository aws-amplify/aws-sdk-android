/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideoarchivedmedia.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the timestamp range and timestamp origin of a range of fragments.
 * </p>
 * <p>
 * Only fragments with a start timestamp greater than or equal to the given
 * start time and less than or equal to the end time are returned. For example,
 * if a stream contains fragments with the following start timestamps:
 * </p>
 * <ul>
 * <li>
 * <p>
 * 00:00:00
 * </p>
 * </li>
 * <li>
 * <p>
 * 00:00:02
 * </p>
 * </li>
 * <li>
 * <p>
 * 00:00:04
 * </p>
 * </li>
 * <li>
 * <p>
 * 00:00:06
 * </p>
 * </li>
 * </ul>
 * <p>
 * A fragment selector range with a start time of 00:00:01 and end time of
 * 00:00:04 would return the fragments with start times of 00:00:02 and
 * 00:00:04.
 * </p>
 */
public class FragmentSelector implements Serializable {
    /**
     * <p>
     * The origin of the timestamps to use (Server or Producer).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
     */
    private String fragmentSelectorType;

    /**
     * <p>
     * The range of timestamps to return.
     * </p>
     */
    private TimestampRange timestampRange;

    /**
     * <p>
     * The origin of the timestamps to use (Server or Producer).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
     *
     * @return <p>
     *         The origin of the timestamps to use (Server or Producer).
     *         </p>
     * @see FragmentSelectorType
     */
    public String getFragmentSelectorType() {
        return fragmentSelectorType;
    }

    /**
     * <p>
     * The origin of the timestamps to use (Server or Producer).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
     *
     * @param fragmentSelectorType <p>
     *            The origin of the timestamps to use (Server or Producer).
     *            </p>
     * @see FragmentSelectorType
     */
    public void setFragmentSelectorType(String fragmentSelectorType) {
        this.fragmentSelectorType = fragmentSelectorType;
    }

    /**
     * <p>
     * The origin of the timestamps to use (Server or Producer).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
     *
     * @param fragmentSelectorType <p>
     *            The origin of the timestamps to use (Server or Producer).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FragmentSelectorType
     */
    public FragmentSelector withFragmentSelectorType(String fragmentSelectorType) {
        this.fragmentSelectorType = fragmentSelectorType;
        return this;
    }

    /**
     * <p>
     * The origin of the timestamps to use (Server or Producer).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
     *
     * @param fragmentSelectorType <p>
     *            The origin of the timestamps to use (Server or Producer).
     *            </p>
     * @see FragmentSelectorType
     */
    public void setFragmentSelectorType(FragmentSelectorType fragmentSelectorType) {
        this.fragmentSelectorType = fragmentSelectorType.toString();
    }

    /**
     * <p>
     * The origin of the timestamps to use (Server or Producer).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
     *
     * @param fragmentSelectorType <p>
     *            The origin of the timestamps to use (Server or Producer).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FragmentSelectorType
     */
    public FragmentSelector withFragmentSelectorType(FragmentSelectorType fragmentSelectorType) {
        this.fragmentSelectorType = fragmentSelectorType.toString();
        return this;
    }

    /**
     * <p>
     * The range of timestamps to return.
     * </p>
     *
     * @return <p>
     *         The range of timestamps to return.
     *         </p>
     */
    public TimestampRange getTimestampRange() {
        return timestampRange;
    }

    /**
     * <p>
     * The range of timestamps to return.
     * </p>
     *
     * @param timestampRange <p>
     *            The range of timestamps to return.
     *            </p>
     */
    public void setTimestampRange(TimestampRange timestampRange) {
        this.timestampRange = timestampRange;
    }

    /**
     * <p>
     * The range of timestamps to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestampRange <p>
     *            The range of timestamps to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FragmentSelector withTimestampRange(TimestampRange timestampRange) {
        this.timestampRange = timestampRange;
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
        if (getFragmentSelectorType() != null)
            sb.append("FragmentSelectorType: " + getFragmentSelectorType() + ",");
        if (getTimestampRange() != null)
            sb.append("TimestampRange: " + getTimestampRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFragmentSelectorType() == null) ? 0 : getFragmentSelectorType().hashCode());
        hashCode = prime * hashCode
                + ((getTimestampRange() == null) ? 0 : getTimestampRange().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FragmentSelector == false)
            return false;
        FragmentSelector other = (FragmentSelector) obj;

        if (other.getFragmentSelectorType() == null ^ this.getFragmentSelectorType() == null)
            return false;
        if (other.getFragmentSelectorType() != null
                && other.getFragmentSelectorType().equals(this.getFragmentSelectorType()) == false)
            return false;
        if (other.getTimestampRange() == null ^ this.getTimestampRange() == null)
            return false;
        if (other.getTimestampRange() != null
                && other.getTimestampRange().equals(this.getTimestampRange()) == false)
            return false;
        return true;
    }
}
