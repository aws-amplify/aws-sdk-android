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
 * Contains the range of timestamps for the requested media, and the source of
 * the timestamps.
 * </p>
 */
public class DASHFragmentSelector implements Serializable {
    /**
     * <p>
     * The source of the timestamps for the requested media.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to
     * <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is
     * <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>, the first fragment
     * ingested with a producer timestamp within the specified
     * <a>FragmentSelector$TimestampRange</a> is included in the media playlist.
     * In addition, the fragments with producer timestamps within the
     * <code>TimestampRange</code> ingested immediately following the first
     * fragment (up to the
     * <a>GetDASHStreamingSessionURLInput$MaxManifestFragmentResults</a> value)
     * are included.
     * </p>
     * <p>
     * Fragments that have duplicate producer timestamps are deduplicated. This
     * means that if producers are producing a stream of fragments with producer
     * timestamps that are approximately equal to the true clock time, the
     * MPEG-DASH manifest will contain all of the fragments within the requested
     * timestamp range. If some fragments are ingested within the same time
     * range and very different points in time, only the oldest ingested
     * collection of fragments are returned.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to
     * <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is <code>LIVE</code>,
     * the producer timestamps are used in the MP4 fragments and for
     * deduplication. But the most recently ingested fragments based on server
     * timestamps are included in the MPEG-DASH manifest. This means that even
     * if fragments ingested in the past have producer timestamps with values
     * now, they are not included in the HLS media playlist.
     * </p>
     * <p>
     * The default is <code>SERVER_TIMESTAMP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
     */
    private String fragmentSelectorType;

    /**
     * <p>
     * The start and end of the timestamp range for the requested media.
     * </p>
     * <p>
     * This value should not be present if <code>PlaybackType</code> is
     * <code>LIVE</code>.
     * </p>
     */
    private DASHTimestampRange timestampRange;

    /**
     * <p>
     * The source of the timestamps for the requested media.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to
     * <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is
     * <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>, the first fragment
     * ingested with a producer timestamp within the specified
     * <a>FragmentSelector$TimestampRange</a> is included in the media playlist.
     * In addition, the fragments with producer timestamps within the
     * <code>TimestampRange</code> ingested immediately following the first
     * fragment (up to the
     * <a>GetDASHStreamingSessionURLInput$MaxManifestFragmentResults</a> value)
     * are included.
     * </p>
     * <p>
     * Fragments that have duplicate producer timestamps are deduplicated. This
     * means that if producers are producing a stream of fragments with producer
     * timestamps that are approximately equal to the true clock time, the
     * MPEG-DASH manifest will contain all of the fragments within the requested
     * timestamp range. If some fragments are ingested within the same time
     * range and very different points in time, only the oldest ingested
     * collection of fragments are returned.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to
     * <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is <code>LIVE</code>,
     * the producer timestamps are used in the MP4 fragments and for
     * deduplication. But the most recently ingested fragments based on server
     * timestamps are included in the MPEG-DASH manifest. This means that even
     * if fragments ingested in the past have producer timestamps with values
     * now, they are not included in the HLS media playlist.
     * </p>
     * <p>
     * The default is <code>SERVER_TIMESTAMP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
     *
     * @return <p>
     *         The source of the timestamps for the requested media.
     *         </p>
     *         <p>
     *         When <code>FragmentSelectorType</code> is set to
     *         <code>PRODUCER_TIMESTAMP</code> and
     *         <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is
     *         <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>, the first
     *         fragment ingested with a producer timestamp within the specified
     *         <a>FragmentSelector$TimestampRange</a> is included in the media
     *         playlist. In addition, the fragments with producer timestamps
     *         within the <code>TimestampRange</code> ingested immediately
     *         following the first fragment (up to the
     *         <a>GetDASHStreamingSessionURLInput$MaxManifestFragmentResults</a>
     *         value) are included.
     *         </p>
     *         <p>
     *         Fragments that have duplicate producer timestamps are
     *         deduplicated. This means that if producers are producing a stream
     *         of fragments with producer timestamps that are approximately
     *         equal to the true clock time, the MPEG-DASH manifest will contain
     *         all of the fragments within the requested timestamp range. If
     *         some fragments are ingested within the same time range and very
     *         different points in time, only the oldest ingested collection of
     *         fragments are returned.
     *         </p>
     *         <p>
     *         When <code>FragmentSelectorType</code> is set to
     *         <code>PRODUCER_TIMESTAMP</code> and
     *         <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is
     *         <code>LIVE</code>, the producer timestamps are used in the MP4
     *         fragments and for deduplication. But the most recently ingested
     *         fragments based on server timestamps are included in the
     *         MPEG-DASH manifest. This means that even if fragments ingested in
     *         the past have producer timestamps with values now, they are not
     *         included in the HLS media playlist.
     *         </p>
     *         <p>
     *         The default is <code>SERVER_TIMESTAMP</code>.
     *         </p>
     * @see DASHFragmentSelectorType
     */
    public String getFragmentSelectorType() {
        return fragmentSelectorType;
    }

    /**
     * <p>
     * The source of the timestamps for the requested media.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to
     * <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is
     * <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>, the first fragment
     * ingested with a producer timestamp within the specified
     * <a>FragmentSelector$TimestampRange</a> is included in the media playlist.
     * In addition, the fragments with producer timestamps within the
     * <code>TimestampRange</code> ingested immediately following the first
     * fragment (up to the
     * <a>GetDASHStreamingSessionURLInput$MaxManifestFragmentResults</a> value)
     * are included.
     * </p>
     * <p>
     * Fragments that have duplicate producer timestamps are deduplicated. This
     * means that if producers are producing a stream of fragments with producer
     * timestamps that are approximately equal to the true clock time, the
     * MPEG-DASH manifest will contain all of the fragments within the requested
     * timestamp range. If some fragments are ingested within the same time
     * range and very different points in time, only the oldest ingested
     * collection of fragments are returned.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to
     * <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is <code>LIVE</code>,
     * the producer timestamps are used in the MP4 fragments and for
     * deduplication. But the most recently ingested fragments based on server
     * timestamps are included in the MPEG-DASH manifest. This means that even
     * if fragments ingested in the past have producer timestamps with values
     * now, they are not included in the HLS media playlist.
     * </p>
     * <p>
     * The default is <code>SERVER_TIMESTAMP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
     *
     * @param fragmentSelectorType <p>
     *            The source of the timestamps for the requested media.
     *            </p>
     *            <p>
     *            When <code>FragmentSelectorType</code> is set to
     *            <code>PRODUCER_TIMESTAMP</code> and
     *            <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is
     *            <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>, the first
     *            fragment ingested with a producer timestamp within the
     *            specified <a>FragmentSelector$TimestampRange</a> is included
     *            in the media playlist. In addition, the fragments with
     *            producer timestamps within the <code>TimestampRange</code>
     *            ingested immediately following the first fragment (up to the
     *            <a
     *            >GetDASHStreamingSessionURLInput$MaxManifestFragmentResults</
     *            a> value) are included.
     *            </p>
     *            <p>
     *            Fragments that have duplicate producer timestamps are
     *            deduplicated. This means that if producers are producing a
     *            stream of fragments with producer timestamps that are
     *            approximately equal to the true clock time, the MPEG-DASH
     *            manifest will contain all of the fragments within the
     *            requested timestamp range. If some fragments are ingested
     *            within the same time range and very different points in time,
     *            only the oldest ingested collection of fragments are returned.
     *            </p>
     *            <p>
     *            When <code>FragmentSelectorType</code> is set to
     *            <code>PRODUCER_TIMESTAMP</code> and
     *            <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is
     *            <code>LIVE</code>, the producer timestamps are used in the MP4
     *            fragments and for deduplication. But the most recently
     *            ingested fragments based on server timestamps are included in
     *            the MPEG-DASH manifest. This means that even if fragments
     *            ingested in the past have producer timestamps with values now,
     *            they are not included in the HLS media playlist.
     *            </p>
     *            <p>
     *            The default is <code>SERVER_TIMESTAMP</code>.
     *            </p>
     * @see DASHFragmentSelectorType
     */
    public void setFragmentSelectorType(String fragmentSelectorType) {
        this.fragmentSelectorType = fragmentSelectorType;
    }

    /**
     * <p>
     * The source of the timestamps for the requested media.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to
     * <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is
     * <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>, the first fragment
     * ingested with a producer timestamp within the specified
     * <a>FragmentSelector$TimestampRange</a> is included in the media playlist.
     * In addition, the fragments with producer timestamps within the
     * <code>TimestampRange</code> ingested immediately following the first
     * fragment (up to the
     * <a>GetDASHStreamingSessionURLInput$MaxManifestFragmentResults</a> value)
     * are included.
     * </p>
     * <p>
     * Fragments that have duplicate producer timestamps are deduplicated. This
     * means that if producers are producing a stream of fragments with producer
     * timestamps that are approximately equal to the true clock time, the
     * MPEG-DASH manifest will contain all of the fragments within the requested
     * timestamp range. If some fragments are ingested within the same time
     * range and very different points in time, only the oldest ingested
     * collection of fragments are returned.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to
     * <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is <code>LIVE</code>,
     * the producer timestamps are used in the MP4 fragments and for
     * deduplication. But the most recently ingested fragments based on server
     * timestamps are included in the MPEG-DASH manifest. This means that even
     * if fragments ingested in the past have producer timestamps with values
     * now, they are not included in the HLS media playlist.
     * </p>
     * <p>
     * The default is <code>SERVER_TIMESTAMP</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
     *
     * @param fragmentSelectorType <p>
     *            The source of the timestamps for the requested media.
     *            </p>
     *            <p>
     *            When <code>FragmentSelectorType</code> is set to
     *            <code>PRODUCER_TIMESTAMP</code> and
     *            <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is
     *            <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>, the first
     *            fragment ingested with a producer timestamp within the
     *            specified <a>FragmentSelector$TimestampRange</a> is included
     *            in the media playlist. In addition, the fragments with
     *            producer timestamps within the <code>TimestampRange</code>
     *            ingested immediately following the first fragment (up to the
     *            <a
     *            >GetDASHStreamingSessionURLInput$MaxManifestFragmentResults</
     *            a> value) are included.
     *            </p>
     *            <p>
     *            Fragments that have duplicate producer timestamps are
     *            deduplicated. This means that if producers are producing a
     *            stream of fragments with producer timestamps that are
     *            approximately equal to the true clock time, the MPEG-DASH
     *            manifest will contain all of the fragments within the
     *            requested timestamp range. If some fragments are ingested
     *            within the same time range and very different points in time,
     *            only the oldest ingested collection of fragments are returned.
     *            </p>
     *            <p>
     *            When <code>FragmentSelectorType</code> is set to
     *            <code>PRODUCER_TIMESTAMP</code> and
     *            <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is
     *            <code>LIVE</code>, the producer timestamps are used in the MP4
     *            fragments and for deduplication. But the most recently
     *            ingested fragments based on server timestamps are included in
     *            the MPEG-DASH manifest. This means that even if fragments
     *            ingested in the past have producer timestamps with values now,
     *            they are not included in the HLS media playlist.
     *            </p>
     *            <p>
     *            The default is <code>SERVER_TIMESTAMP</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DASHFragmentSelectorType
     */
    public DASHFragmentSelector withFragmentSelectorType(String fragmentSelectorType) {
        this.fragmentSelectorType = fragmentSelectorType;
        return this;
    }

    /**
     * <p>
     * The source of the timestamps for the requested media.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to
     * <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is
     * <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>, the first fragment
     * ingested with a producer timestamp within the specified
     * <a>FragmentSelector$TimestampRange</a> is included in the media playlist.
     * In addition, the fragments with producer timestamps within the
     * <code>TimestampRange</code> ingested immediately following the first
     * fragment (up to the
     * <a>GetDASHStreamingSessionURLInput$MaxManifestFragmentResults</a> value)
     * are included.
     * </p>
     * <p>
     * Fragments that have duplicate producer timestamps are deduplicated. This
     * means that if producers are producing a stream of fragments with producer
     * timestamps that are approximately equal to the true clock time, the
     * MPEG-DASH manifest will contain all of the fragments within the requested
     * timestamp range. If some fragments are ingested within the same time
     * range and very different points in time, only the oldest ingested
     * collection of fragments are returned.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to
     * <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is <code>LIVE</code>,
     * the producer timestamps are used in the MP4 fragments and for
     * deduplication. But the most recently ingested fragments based on server
     * timestamps are included in the MPEG-DASH manifest. This means that even
     * if fragments ingested in the past have producer timestamps with values
     * now, they are not included in the HLS media playlist.
     * </p>
     * <p>
     * The default is <code>SERVER_TIMESTAMP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
     *
     * @param fragmentSelectorType <p>
     *            The source of the timestamps for the requested media.
     *            </p>
     *            <p>
     *            When <code>FragmentSelectorType</code> is set to
     *            <code>PRODUCER_TIMESTAMP</code> and
     *            <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is
     *            <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>, the first
     *            fragment ingested with a producer timestamp within the
     *            specified <a>FragmentSelector$TimestampRange</a> is included
     *            in the media playlist. In addition, the fragments with
     *            producer timestamps within the <code>TimestampRange</code>
     *            ingested immediately following the first fragment (up to the
     *            <a
     *            >GetDASHStreamingSessionURLInput$MaxManifestFragmentResults</
     *            a> value) are included.
     *            </p>
     *            <p>
     *            Fragments that have duplicate producer timestamps are
     *            deduplicated. This means that if producers are producing a
     *            stream of fragments with producer timestamps that are
     *            approximately equal to the true clock time, the MPEG-DASH
     *            manifest will contain all of the fragments within the
     *            requested timestamp range. If some fragments are ingested
     *            within the same time range and very different points in time,
     *            only the oldest ingested collection of fragments are returned.
     *            </p>
     *            <p>
     *            When <code>FragmentSelectorType</code> is set to
     *            <code>PRODUCER_TIMESTAMP</code> and
     *            <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is
     *            <code>LIVE</code>, the producer timestamps are used in the MP4
     *            fragments and for deduplication. But the most recently
     *            ingested fragments based on server timestamps are included in
     *            the MPEG-DASH manifest. This means that even if fragments
     *            ingested in the past have producer timestamps with values now,
     *            they are not included in the HLS media playlist.
     *            </p>
     *            <p>
     *            The default is <code>SERVER_TIMESTAMP</code>.
     *            </p>
     * @see DASHFragmentSelectorType
     */
    public void setFragmentSelectorType(DASHFragmentSelectorType fragmentSelectorType) {
        this.fragmentSelectorType = fragmentSelectorType.toString();
    }

    /**
     * <p>
     * The source of the timestamps for the requested media.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to
     * <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is
     * <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>, the first fragment
     * ingested with a producer timestamp within the specified
     * <a>FragmentSelector$TimestampRange</a> is included in the media playlist.
     * In addition, the fragments with producer timestamps within the
     * <code>TimestampRange</code> ingested immediately following the first
     * fragment (up to the
     * <a>GetDASHStreamingSessionURLInput$MaxManifestFragmentResults</a> value)
     * are included.
     * </p>
     * <p>
     * Fragments that have duplicate producer timestamps are deduplicated. This
     * means that if producers are producing a stream of fragments with producer
     * timestamps that are approximately equal to the true clock time, the
     * MPEG-DASH manifest will contain all of the fragments within the requested
     * timestamp range. If some fragments are ingested within the same time
     * range and very different points in time, only the oldest ingested
     * collection of fragments are returned.
     * </p>
     * <p>
     * When <code>FragmentSelectorType</code> is set to
     * <code>PRODUCER_TIMESTAMP</code> and
     * <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is <code>LIVE</code>,
     * the producer timestamps are used in the MP4 fragments and for
     * deduplication. But the most recently ingested fragments based on server
     * timestamps are included in the MPEG-DASH manifest. This means that even
     * if fragments ingested in the past have producer timestamps with values
     * now, they are not included in the HLS media playlist.
     * </p>
     * <p>
     * The default is <code>SERVER_TIMESTAMP</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCER_TIMESTAMP, SERVER_TIMESTAMP
     *
     * @param fragmentSelectorType <p>
     *            The source of the timestamps for the requested media.
     *            </p>
     *            <p>
     *            When <code>FragmentSelectorType</code> is set to
     *            <code>PRODUCER_TIMESTAMP</code> and
     *            <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is
     *            <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>, the first
     *            fragment ingested with a producer timestamp within the
     *            specified <a>FragmentSelector$TimestampRange</a> is included
     *            in the media playlist. In addition, the fragments with
     *            producer timestamps within the <code>TimestampRange</code>
     *            ingested immediately following the first fragment (up to the
     *            <a
     *            >GetDASHStreamingSessionURLInput$MaxManifestFragmentResults</
     *            a> value) are included.
     *            </p>
     *            <p>
     *            Fragments that have duplicate producer timestamps are
     *            deduplicated. This means that if producers are producing a
     *            stream of fragments with producer timestamps that are
     *            approximately equal to the true clock time, the MPEG-DASH
     *            manifest will contain all of the fragments within the
     *            requested timestamp range. If some fragments are ingested
     *            within the same time range and very different points in time,
     *            only the oldest ingested collection of fragments are returned.
     *            </p>
     *            <p>
     *            When <code>FragmentSelectorType</code> is set to
     *            <code>PRODUCER_TIMESTAMP</code> and
     *            <a>GetDASHStreamingSessionURLInput$PlaybackMode</a> is
     *            <code>LIVE</code>, the producer timestamps are used in the MP4
     *            fragments and for deduplication. But the most recently
     *            ingested fragments based on server timestamps are included in
     *            the MPEG-DASH manifest. This means that even if fragments
     *            ingested in the past have producer timestamps with values now,
     *            they are not included in the HLS media playlist.
     *            </p>
     *            <p>
     *            The default is <code>SERVER_TIMESTAMP</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DASHFragmentSelectorType
     */
    public DASHFragmentSelector withFragmentSelectorType(
            DASHFragmentSelectorType fragmentSelectorType) {
        this.fragmentSelectorType = fragmentSelectorType.toString();
        return this;
    }

    /**
     * <p>
     * The start and end of the timestamp range for the requested media.
     * </p>
     * <p>
     * This value should not be present if <code>PlaybackType</code> is
     * <code>LIVE</code>.
     * </p>
     *
     * @return <p>
     *         The start and end of the timestamp range for the requested media.
     *         </p>
     *         <p>
     *         This value should not be present if <code>PlaybackType</code> is
     *         <code>LIVE</code>.
     *         </p>
     */
    public DASHTimestampRange getTimestampRange() {
        return timestampRange;
    }

    /**
     * <p>
     * The start and end of the timestamp range for the requested media.
     * </p>
     * <p>
     * This value should not be present if <code>PlaybackType</code> is
     * <code>LIVE</code>.
     * </p>
     *
     * @param timestampRange <p>
     *            The start and end of the timestamp range for the requested
     *            media.
     *            </p>
     *            <p>
     *            This value should not be present if <code>PlaybackType</code>
     *            is <code>LIVE</code>.
     *            </p>
     */
    public void setTimestampRange(DASHTimestampRange timestampRange) {
        this.timestampRange = timestampRange;
    }

    /**
     * <p>
     * The start and end of the timestamp range for the requested media.
     * </p>
     * <p>
     * This value should not be present if <code>PlaybackType</code> is
     * <code>LIVE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestampRange <p>
     *            The start and end of the timestamp range for the requested
     *            media.
     *            </p>
     *            <p>
     *            This value should not be present if <code>PlaybackType</code>
     *            is <code>LIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DASHFragmentSelector withTimestampRange(DASHTimestampRange timestampRange) {
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

        if (obj instanceof DASHFragmentSelector == false)
            return false;
        DASHFragmentSelector other = (DASHFragmentSelector) obj;

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
