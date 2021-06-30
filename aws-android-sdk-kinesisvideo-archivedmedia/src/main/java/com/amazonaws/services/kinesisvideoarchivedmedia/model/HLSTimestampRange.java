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
 * The start and end of the timestamp range for the requested media.
 * </p>
 * <p>
 * This value should not be present if <code>PlaybackType</code> is
 * <code>LIVE</code>.
 * </p>
 */
public class HLSTimestampRange implements Serializable {
    /**
     * <p>
     * The start of the timestamp range for the requested media.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the
     * <code>StartTimestamp</code> value is required.
     * </p>
     * <p>
     * Only fragments that start exactly at or after <code>StartTimestamp</code>
     * are included in the session. Fragments that start before
     * <code>StartTimestamp</code> and continue past it aren't included in the
     * session. If <code>FragmentSelectorType</code> is
     * <code>SERVER_TIMESTAMP</code>, the <code>StartTimestamp</code> must be
     * later than the stream head.
     * </p>
     */
    private java.util.Date startTimestamp;

    /**
     * <p>
     * The end of the timestamp range for the requested media. This value must
     * be within 24 hours of the specified <code>StartTimestamp</code>, and it
     * must be later than the <code>StartTimestamp</code> value.
     * </p>
     * <p>
     * If <code>FragmentSelectorType</code> for the request is
     * <code>SERVER_TIMESTAMP</code>, this value must be in the past.
     * </p>
     * <p>
     * The <code>EndTimestamp</code> value is required for
     * <code>ON_DEMAND</code> mode, but optional for <code>LIVE_REPLAY</code>
     * mode. If the <code>EndTimestamp</code> is not set for
     * <code>LIVE_REPLAY</code> mode then the session will continue to include
     * newly ingested fragments until the session expires.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. The <code>EndTimestamp</code> is compared to the
     * (starting) timestamp of the fragment. Fragments that start before the
     * <code>EndTimestamp</code> value and continue past it are included in the
     * session.
     * </p>
     * </note>
     */
    private java.util.Date endTimestamp;

    /**
     * <p>
     * The start of the timestamp range for the requested media.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the
     * <code>StartTimestamp</code> value is required.
     * </p>
     * <p>
     * Only fragments that start exactly at or after <code>StartTimestamp</code>
     * are included in the session. Fragments that start before
     * <code>StartTimestamp</code> and continue past it aren't included in the
     * session. If <code>FragmentSelectorType</code> is
     * <code>SERVER_TIMESTAMP</code>, the <code>StartTimestamp</code> must be
     * later than the stream head.
     * </p>
     *
     * @return <p>
     *         The start of the timestamp range for the requested media.
     *         </p>
     *         <p>
     *         If the <code>HLSTimestampRange</code> value is specified, the
     *         <code>StartTimestamp</code> value is required.
     *         </p>
     *         <p>
     *         Only fragments that start exactly at or after
     *         <code>StartTimestamp</code> are included in the session.
     *         Fragments that start before <code>StartTimestamp</code> and
     *         continue past it aren't included in the session. If
     *         <code>FragmentSelectorType</code> is
     *         <code>SERVER_TIMESTAMP</code>, the <code>StartTimestamp</code>
     *         must be later than the stream head.
     *         </p>
     */
    public java.util.Date getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * <p>
     * The start of the timestamp range for the requested media.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the
     * <code>StartTimestamp</code> value is required.
     * </p>
     * <p>
     * Only fragments that start exactly at or after <code>StartTimestamp</code>
     * are included in the session. Fragments that start before
     * <code>StartTimestamp</code> and continue past it aren't included in the
     * session. If <code>FragmentSelectorType</code> is
     * <code>SERVER_TIMESTAMP</code>, the <code>StartTimestamp</code> must be
     * later than the stream head.
     * </p>
     *
     * @param startTimestamp <p>
     *            The start of the timestamp range for the requested media.
     *            </p>
     *            <p>
     *            If the <code>HLSTimestampRange</code> value is specified, the
     *            <code>StartTimestamp</code> value is required.
     *            </p>
     *            <p>
     *            Only fragments that start exactly at or after
     *            <code>StartTimestamp</code> are included in the session.
     *            Fragments that start before <code>StartTimestamp</code> and
     *            continue past it aren't included in the session. If
     *            <code>FragmentSelectorType</code> is
     *            <code>SERVER_TIMESTAMP</code>, the <code>StartTimestamp</code>
     *            must be later than the stream head.
     *            </p>
     */
    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * The start of the timestamp range for the requested media.
     * </p>
     * <p>
     * If the <code>HLSTimestampRange</code> value is specified, the
     * <code>StartTimestamp</code> value is required.
     * </p>
     * <p>
     * Only fragments that start exactly at or after <code>StartTimestamp</code>
     * are included in the session. Fragments that start before
     * <code>StartTimestamp</code> and continue past it aren't included in the
     * session. If <code>FragmentSelectorType</code> is
     * <code>SERVER_TIMESTAMP</code>, the <code>StartTimestamp</code> must be
     * later than the stream head.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTimestamp <p>
     *            The start of the timestamp range for the requested media.
     *            </p>
     *            <p>
     *            If the <code>HLSTimestampRange</code> value is specified, the
     *            <code>StartTimestamp</code> value is required.
     *            </p>
     *            <p>
     *            Only fragments that start exactly at or after
     *            <code>StartTimestamp</code> are included in the session.
     *            Fragments that start before <code>StartTimestamp</code> and
     *            continue past it aren't included in the session. If
     *            <code>FragmentSelectorType</code> is
     *            <code>SERVER_TIMESTAMP</code>, the <code>StartTimestamp</code>
     *            must be later than the stream head.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HLSTimestampRange withStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    /**
     * <p>
     * The end of the timestamp range for the requested media. This value must
     * be within 24 hours of the specified <code>StartTimestamp</code>, and it
     * must be later than the <code>StartTimestamp</code> value.
     * </p>
     * <p>
     * If <code>FragmentSelectorType</code> for the request is
     * <code>SERVER_TIMESTAMP</code>, this value must be in the past.
     * </p>
     * <p>
     * The <code>EndTimestamp</code> value is required for
     * <code>ON_DEMAND</code> mode, but optional for <code>LIVE_REPLAY</code>
     * mode. If the <code>EndTimestamp</code> is not set for
     * <code>LIVE_REPLAY</code> mode then the session will continue to include
     * newly ingested fragments until the session expires.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. The <code>EndTimestamp</code> is compared to the
     * (starting) timestamp of the fragment. Fragments that start before the
     * <code>EndTimestamp</code> value and continue past it are included in the
     * session.
     * </p>
     * </note>
     *
     * @return <p>
     *         The end of the timestamp range for the requested media. This
     *         value must be within 24 hours of the specified
     *         <code>StartTimestamp</code>, and it must be later than the
     *         <code>StartTimestamp</code> value.
     *         </p>
     *         <p>
     *         If <code>FragmentSelectorType</code> for the request is
     *         <code>SERVER_TIMESTAMP</code>, this value must be in the past.
     *         </p>
     *         <p>
     *         The <code>EndTimestamp</code> value is required for
     *         <code>ON_DEMAND</code> mode, but optional for
     *         <code>LIVE_REPLAY</code> mode. If the <code>EndTimestamp</code>
     *         is not set for <code>LIVE_REPLAY</code> mode then the session
     *         will continue to include newly ingested fragments until the
     *         session expires.
     *         </p>
     *         <note>
     *         <p>
     *         This value is inclusive. The <code>EndTimestamp</code> is
     *         compared to the (starting) timestamp of the fragment. Fragments
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
     * The end of the timestamp range for the requested media. This value must
     * be within 24 hours of the specified <code>StartTimestamp</code>, and it
     * must be later than the <code>StartTimestamp</code> value.
     * </p>
     * <p>
     * If <code>FragmentSelectorType</code> for the request is
     * <code>SERVER_TIMESTAMP</code>, this value must be in the past.
     * </p>
     * <p>
     * The <code>EndTimestamp</code> value is required for
     * <code>ON_DEMAND</code> mode, but optional for <code>LIVE_REPLAY</code>
     * mode. If the <code>EndTimestamp</code> is not set for
     * <code>LIVE_REPLAY</code> mode then the session will continue to include
     * newly ingested fragments until the session expires.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. The <code>EndTimestamp</code> is compared to the
     * (starting) timestamp of the fragment. Fragments that start before the
     * <code>EndTimestamp</code> value and continue past it are included in the
     * session.
     * </p>
     * </note>
     *
     * @param endTimestamp <p>
     *            The end of the timestamp range for the requested media. This
     *            value must be within 24 hours of the specified
     *            <code>StartTimestamp</code>, and it must be later than the
     *            <code>StartTimestamp</code> value.
     *            </p>
     *            <p>
     *            If <code>FragmentSelectorType</code> for the request is
     *            <code>SERVER_TIMESTAMP</code>, this value must be in the past.
     *            </p>
     *            <p>
     *            The <code>EndTimestamp</code> value is required for
     *            <code>ON_DEMAND</code> mode, but optional for
     *            <code>LIVE_REPLAY</code> mode. If the
     *            <code>EndTimestamp</code> is not set for
     *            <code>LIVE_REPLAY</code> mode then the session will continue
     *            to include newly ingested fragments until the session expires.
     *            </p>
     *            <note>
     *            <p>
     *            This value is inclusive. The <code>EndTimestamp</code> is
     *            compared to the (starting) timestamp of the fragment.
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
     * The end of the timestamp range for the requested media. This value must
     * be within 24 hours of the specified <code>StartTimestamp</code>, and it
     * must be later than the <code>StartTimestamp</code> value.
     * </p>
     * <p>
     * If <code>FragmentSelectorType</code> for the request is
     * <code>SERVER_TIMESTAMP</code>, this value must be in the past.
     * </p>
     * <p>
     * The <code>EndTimestamp</code> value is required for
     * <code>ON_DEMAND</code> mode, but optional for <code>LIVE_REPLAY</code>
     * mode. If the <code>EndTimestamp</code> is not set for
     * <code>LIVE_REPLAY</code> mode then the session will continue to include
     * newly ingested fragments until the session expires.
     * </p>
     * <note>
     * <p>
     * This value is inclusive. The <code>EndTimestamp</code> is compared to the
     * (starting) timestamp of the fragment. Fragments that start before the
     * <code>EndTimestamp</code> value and continue past it are included in the
     * session.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTimestamp <p>
     *            The end of the timestamp range for the requested media. This
     *            value must be within 24 hours of the specified
     *            <code>StartTimestamp</code>, and it must be later than the
     *            <code>StartTimestamp</code> value.
     *            </p>
     *            <p>
     *            If <code>FragmentSelectorType</code> for the request is
     *            <code>SERVER_TIMESTAMP</code>, this value must be in the past.
     *            </p>
     *            <p>
     *            The <code>EndTimestamp</code> value is required for
     *            <code>ON_DEMAND</code> mode, but optional for
     *            <code>LIVE_REPLAY</code> mode. If the
     *            <code>EndTimestamp</code> is not set for
     *            <code>LIVE_REPLAY</code> mode then the session will continue
     *            to include newly ingested fragments until the session expires.
     *            </p>
     *            <note>
     *            <p>
     *            This value is inclusive. The <code>EndTimestamp</code> is
     *            compared to the (starting) timestamp of the fragment.
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
