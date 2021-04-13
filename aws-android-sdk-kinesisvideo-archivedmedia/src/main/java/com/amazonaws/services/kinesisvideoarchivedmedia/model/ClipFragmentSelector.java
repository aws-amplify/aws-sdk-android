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
 * Fragments that have duplicate producer timestamps are deduplicated. This
 * means that if producers are producing a stream of fragments with producer
 * timestamps that are approximately equal to the true clock time, the clip will
 * contain all of the fragments within the requested timestamp range. If some
 * fragments are ingested within the same time range and very different points
 * in time, only the oldest ingested collection of fragments are returned.
 * </p>
 */
public class ClipFragmentSelector implements Serializable {
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
    private ClipTimestampRange timestampRange;

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
     * @see ClipFragmentSelectorType
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
     * @see ClipFragmentSelectorType
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
     * @see ClipFragmentSelectorType
     */
    public ClipFragmentSelector withFragmentSelectorType(String fragmentSelectorType) {
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
     * @see ClipFragmentSelectorType
     */
    public void setFragmentSelectorType(ClipFragmentSelectorType fragmentSelectorType) {
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
     * @see ClipFragmentSelectorType
     */
    public ClipFragmentSelector withFragmentSelectorType(
            ClipFragmentSelectorType fragmentSelectorType) {
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
    public ClipTimestampRange getTimestampRange() {
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
    public void setTimestampRange(ClipTimestampRange timestampRange) {
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
    public ClipFragmentSelector withTimestampRange(ClipTimestampRange timestampRange) {
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

        if (obj instanceof ClipFragmentSelector == false)
            return false;
        ClipFragmentSelector other = (ClipFragmentSelector) obj;

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
