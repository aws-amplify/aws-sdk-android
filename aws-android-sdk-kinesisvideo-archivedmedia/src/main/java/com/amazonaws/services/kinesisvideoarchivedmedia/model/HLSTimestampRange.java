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

package com.amazonaws.services.kinesisvideoarchivedmedia.model;

import java.io.Serializable;

/**
 * <p>
 * The start and end of the time stamp range for the requested media.
 * </p>
 * <p>
 * This value should not be present if <code>PlaybackType</code> is
 * <code>LIVE</code>.
 * </p>
 * <note>
 * <p>
 * The values in the <code>HLSTimestampRange</code> are inclusive. Fragments
 * that begin before the start time but continue past it, or fragments that
 * begin before the end time but continue past it, are included in the session.
 * </p>
 * </note>
 */
public class HLSTimestampRange implements Serializable {
    /**
     * <p>
     * The start of the time stamp range for the requested media.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the
     * <code>StartTimestamp</code> value is required.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. Fragments that start before the
     * <code>StartingTimestamp</code> and continue past it are included in the
     * session.
     * </p>
     * </note>
     */
    private java.util.Date startTimestamp;

    /**
     * <p>
     * The end of the time stamp range for the requested media. This value must
     * be within three hours of the specified <code>StartTimestamp</code>, and
     * it must be later than the <code>StartTimestamp</code> value.
     * </p>
     * <p>
     * If <code>FragmentSelectorType</code> for the request is
     * <code>SERVER_TIMESTAMP</code>, this value must be in the past.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the
     * <code>EndTimestamp</code> value is required.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. The <code>EndTimestamp</code> is compared to the
     * (starting) time stamp of the fragment. Fragments that start before the
     * <code>EndTimestamp</code> value and continue past it are included in the
     * session.
     * </p>
     * </note>
     */
    private java.util.Date endTimestamp;

    /**
     * <p>
     * The start of the time stamp range for the requested media.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the
     * <code>StartTimestamp</code> value is required.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. Fragments that start before the
     * <code>StartingTimestamp</code> and continue past it are included in the
     * session.
     * </p>
     * </note>
     *
     * @return <p>
     *         The start of the time stamp range for the requested media.
     *         </p>
     *         <p>
     *         If the <code>HLSTimestampRange</code> value is specified, the
     *         <code>StartTimestamp</code> value is required.
     *         </p>
     *         <note>
     *         <p>
     *         This value is inclusive. Fragments that start before the
     *         <code>StartingTimestamp</code> and continue past it are included
     *         in the session.
     *         </p>
     *         </note>
     */
    public java.util.Date getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * <p>
     * The start of the time stamp range for the requested media.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the
     * <code>StartTimestamp</code> value is required.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. Fragments that start before the
     * <code>StartingTimestamp</code> and continue past it are included in the
     * session.
     * </p>
     * </note>
     *
     * @param startTimestamp <p>
     *            The start of the time stamp range for the requested media.
     *            </p>
     *            <p>
     *            If the <code>HLSTimestampRange</code> value is specified, the
     *            <code>StartTimestamp</code> value is required.
     *            </p>
     *            <note>
     *            <p>
     *            This value is inclusive. Fragments that start before the
     *            <code>StartingTimestamp</code> and continue past it are
     *            included in the session.
     *            </p>
     *            </note>
     */
    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * The start of the time stamp range for the requested media.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the
     * <code>StartTimestamp</code> value is required.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. Fragments that start before the
     * <code>StartingTimestamp</code> and continue past it are included in the
     * session.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTimestamp <p>
     *            The start of the time stamp range for the requested media.
     *            </p>
     *            <p>
     *            If the <code>HLSTimestampRange</code> value is specified, the
     *            <code>StartTimestamp</code> value is required.
     *            </p>
     *            <note>
     *            <p>
     *            This value is inclusive. Fragments that start before the
     *            <code>StartingTimestamp</code> and continue past it are
     *            included in the session.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HLSTimestampRange withStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    /**
     * <p>
     * The end of the time stamp range for the requested media. This value must
     * be within three hours of the specified <code>StartTimestamp</code>, and
     * it must be later than the <code>StartTimestamp</code> value.
     * </p>
     * <p>
     * If <code>FragmentSelectorType</code> for the request is
     * <code>SERVER_TIMESTAMP</code>, this value must be in the past.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the
     * <code>EndTimestamp</code> value is required.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. The <code>EndTimestamp</code> is compared to the
     * (starting) time stamp of the fragment. Fragments that start before the
     * <code>EndTimestamp</code> value and continue past it are included in the
     * session.
     * </p>
     * </note>
     *
     * @return <p>
     *         The end of the time stamp range for the requested media. This
     *         value must be within three hours of the specified
     *         <code>StartTimestamp</code>, and it must be later than the
     *         <code>StartTimestamp</code> value.
     *         </p>
     *         <p>
     *         If <code>FragmentSelectorType</code> for the request is
     *         <code>SERVER_TIMESTAMP</code>, this value must be in the past.
     *         </p>
     *         <p>
     *         If the <code>HLSTimestampRange</code> value is specified, the
     *         <code>EndTimestamp</code> value is required.
     *         </p>
     *         <note>
     *         <p>
     *         This value is inclusive. The <code>EndTimestamp</code> is
     *         compared to the (starting) time stamp of the fragment. Fragments
     *         that start before the <code>EndTimestamp</code> value and
     *         continue past it are included in the session.
     *         </p>
     *         </note>
     */
    public java.util.Date getEndTimestamp() {
        return endTimestamp;
    }

    /**
     * <p>
     * The end of the time stamp range for the requested media. This value must
     * be within three hours of the specified <code>StartTimestamp</code>, and
     * it must be later than the <code>StartTimestamp</code> value.
     * </p>
     * <p>
     * If <code>FragmentSelectorType</code> for the request is
     * <code>SERVER_TIMESTAMP</code>, this value must be in the past.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the
     * <code>EndTimestamp</code> value is required.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. The <code>EndTimestamp</code> is compared to the
     * (starting) time stamp of the fragment. Fragments that start before the
     * <code>EndTimestamp</code> value and continue past it are included in the
     * session.
     * </p>
     * </note>
     *
     * @param endTimestamp <p>
     *            The end of the time stamp range for the requested media. This
     *            value must be within three hours of the specified
     *            <code>StartTimestamp</code>, and it must be later than the
     *            <code>StartTimestamp</code> value.
     *            </p>
     *            <p>
     *            If <code>FragmentSelectorType</code> for the request is
     *            <code>SERVER_TIMESTAMP</code>, this value must be in the past.
     *            </p>
     *            <p>
     *            If the <code>HLSTimestampRange</code> value is specified, the
     *            <code>EndTimestamp</code> value is required.
     *            </p>
     *            <note>
     *            <p>
     *            This value is inclusive. The <code>EndTimestamp</code> is
     *            compared to the (starting) time stamp of the fragment.
     *            Fragments that start before the <code>EndTimestamp</code>
     *            value and continue past it are included in the session.
     *            </p>
     *            </note>
     */
    public void setEndTimestamp(java.util.Date endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * <p>
     * The end of the time stamp range for the requested media. This value must
     * be within three hours of the specified <code>StartTimestamp</code>, and
     * it must be later than the <code>StartTimestamp</code> value.
     * </p>
     * <p>
     * If <code>FragmentSelectorType</code> for the request is
     * <code>SERVER_TIMESTAMP</code>, this value must be in the past.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the
     * <code>EndTimestamp</code> value is required.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. The <code>EndTimestamp</code> is compared to the
     * (starting) time stamp of the fragment. Fragments that start before the
     * <code>EndTimestamp</code> value and continue past it are included in the
     * session.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTimestamp <p>
     *            The end of the time stamp range for the requested media. This
     *            value must be within three hours of the specified
     *            <code>StartTimestamp</code>, and it must be later than the
     *            <code>StartTimestamp</code> value.
     *            </p>
     *            <p>
     *            If <code>FragmentSelectorType</code> for the request is
     *            <code>SERVER_TIMESTAMP</code>, this value must be in the past.
     *            </p>
     *            <p>
     *            If the <code>HLSTimestampRange</code> value is specified, the
     *            <code>EndTimestamp</code> value is required.
     *            </p>
     *            <note>
     *            <p>
     *            This value is inclusive. The <code>EndTimestamp</code> is
     *            compared to the (starting) time stamp of the fragment.
     *            Fragments that start before the <code>EndTimestamp</code>
     *            value and continue past it are included in the session.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HLSTimestampRange withEndTimestamp(java.util.Date endTimestamp) {
        this.endTimestamp = endTimestamp;
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
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: " + getStartTimestamp() + ",");
        if (getEndTimestamp() != null)
            sb.append("EndTimestamp: " + getEndTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getEndTimestamp() == null) ? 0 : getEndTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HLSTimestampRange == false)
            return false;
        HLSTimestampRange other = (HLSTimestampRange) obj;

        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null
                && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getEndTimestamp() == null ^ this.getEndTimestamp() == null)
            return false;
        if (other.getEndTimestamp() != null
                && other.getEndTimestamp().equals(this.getEndTimestamp()) == false)
            return false;
        return true;
    }
}
