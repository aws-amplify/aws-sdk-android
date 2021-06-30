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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves an HTTP Live Streaming (HLS) URL for the stream. You can then open
 * the URL in a browser or media player to view the stream contents.
 * </p>
 * <p>
 * Both the <code>StreamName</code> and the <code>StreamARN</code> parameters
 * are optional, but you must specify either the <code>StreamName</code> or the
 * <code>StreamARN</code> when invoking this API operation.
 * </p>
 * <p>
 * An Amazon Kinesis video stream has the following requirements for providing
 * data through HLS:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The media must contain h.264 or h.265 encoded video and, optionally, AAC
 * encoded audio. Specifically, the codec ID of track 1 should be
 * <code>V_MPEG/ISO/AVC</code> (for h.264) or <code>V_MPEG/ISO/HEVC</code> (for
 * h.265). Optionally, the codec ID of track 2 should be <code>A_AAC</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Data retention must be greater than 0.
 * </p>
 * </li>
 * <li>
 * <p>
 * The video track of each fragment must contain codec private data in the
 * Advanced Video Coding (AVC) for H.264 format or HEVC for H.265 format (<a
 * href="https://www.iso.org/standard/55980.html">MPEG-4 specification ISO/IEC
 * 14496-15</a>). For information about adapting stream data to a given format,
 * see <a href=
 * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/producer-reference-nal.html"
 * >NAL Adaptation Flags</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The audio track (if present) of each fragment must contain codec private data
 * in the AAC format (<a href="https://www.iso.org/standard/43345.html">AAC
 * specification ISO/IEC 13818-7</a>).
 * </p>
 * </li>
 * </ul>
 * <p>
 * Kinesis Video Streams HLS sessions contain fragments in the fragmented MPEG-4
 * form (also called fMP4 or CMAF) or the MPEG-2 form (also called TS chunks,
 * which the HLS specification also supports). For more information about HLS
 * fragment types, see the <a
 * href="https://tools.ietf.org/html/draft-pantos-http-live-streaming-23">HLS
 * specification</a>.
 * </p>
 * <p>
 * The following procedure shows how to use HLS with Kinesis Video Streams:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Get an endpoint using <a href=
 * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_GetDataEndpoint.html"
 * >GetDataEndpoint</a>, specifying <code>GET_HLS_STREAMING_SESSION_URL</code>
 * for the <code>APIName</code> parameter.
 * </p>
 * </li>
 * <li>
 * <p>
 * Retrieve the HLS URL using <code>GetHLSStreamingSessionURL</code>. Kinesis
 * Video Streams creates an HLS streaming session to be used for accessing
 * content in a stream using the HLS protocol.
 * <code>GetHLSStreamingSessionURL</code> returns an authenticated URL (that
 * includes an encrypted session token) for the session's HLS <i>master
 * playlist</i> (the root resource needed for streaming with HLS).
 * </p>
 * <note>
 * <p>
 * Don't share or store this token where an unauthorized entity could access it.
 * The token provides access to the content of the stream. Safeguard the token
 * with the same measures that you would use with your AWS credentials.
 * </p>
 * </note>
 * <p>
 * The media that is made available through the playlist consists only of the
 * requested stream, time range, and format. No other media data (such as frames
 * outside the requested window or alternate bitrates) is made available.
 * </p>
 * </li>
 * <li>
 * <p>
 * Provide the URL (containing the encrypted session token) for the HLS master
 * playlist to a media player that supports the HLS protocol. Kinesis Video
 * Streams makes the HLS media playlist, initialization fragment, and media
 * fragments available through the master playlist URL. The initialization
 * fragment contains the codec private data for the stream, and other data
 * needed to set up the video or audio decoder and renderer. The media fragments
 * contain H.264-encoded video frames or AAC-encoded audio samples.
 * </p>
 * </li>
 * <li>
 * <p>
 * The media player receives the authenticated URL and requests stream metadata
 * and media data normally. When the media player requests data, it calls the
 * following actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>GetHLSMasterPlaylist:</b> Retrieves an HLS master playlist, which contains
 * a URL for the <code>GetHLSMediaPlaylist</code> action for each track, and
 * additional metadata for the media player, including estimated bitrate and
 * resolution.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>GetHLSMediaPlaylist:</b> Retrieves an HLS media playlist, which contains a
 * URL to access the MP4 initialization fragment with the
 * <code>GetMP4InitFragment</code> action, and URLs to access the MP4 media
 * fragments with the <code>GetMP4MediaFragment</code> actions. The HLS media
 * playlist also contains metadata about the stream that the player needs to
 * play it, such as whether the <code>PlaybackMode</code> is <code>LIVE</code>
 * or <code>ON_DEMAND</code>. The HLS media playlist is typically static for
 * sessions with a <code>PlaybackType</code> of <code>ON_DEMAND</code>. The HLS
 * media playlist is continually updated with new fragments for sessions with a
 * <code>PlaybackType</code> of <code>LIVE</code>. There is a distinct HLS media
 * playlist for the video track and the audio track (if applicable) that
 * contains MP4 media URLs for the specific track.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>GetMP4InitFragment:</b> Retrieves the MP4 initialization fragment. The
 * media player typically loads the initialization fragment before loading any
 * media fragments. This fragment contains the "<code>fytp</code>" and "
 * <code>moov</code>" MP4 atoms, and the child atoms that are needed to
 * initialize the media player decoder.
 * </p>
 * <p>
 * The initialization fragment does not correspond to a fragment in a Kinesis
 * video stream. It contains only the codec private data for the stream and
 * respective track, which the media player needs to decode the media frames.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>GetMP4MediaFragment:</b> Retrieves MP4 media fragments. These fragments
 * contain the "<code>moof</code>" and "<code>mdat</code>" MP4 atoms and their
 * child atoms, containing the encoded fragment's media frames and their
 * timestamps.
 * </p>
 * <note>
 * <p>
 * After the first media fragment is made available in a streaming session, any
 * fragments that don't contain the same codec private data cause an error to be
 * returned when those different media fragments are loaded. Therefore, the
 * codec private data should not change between fragments in a session. This
 * also means that the session fails if the fragments in a stream change from
 * having only video to having both audio and video.
 * </p>
 * </note>
 * <p>
 * Data retrieved with this action is billable. See <a
 * href="https://aws.amazon.com/kinesis/video-streams/pricing/">Pricing</a> for
 * details.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>GetTSFragment:</b> Retrieves MPEG TS fragments containing both
 * initialization and media data for all tracks in the stream.
 * </p>
 * <note>
 * <p>
 * If the <code>ContainerFormat</code> is <code>MPEG_TS</code>, this API is used
 * instead of <code>GetMP4InitFragment</code> and
 * <code>GetMP4MediaFragment</code> to retrieve stream media.
 * </p>
 * </note>
 * <p>
 * Data retrieved with this action is billable. For more information, see <a
 * href="https://aws.amazon.com/kinesis/video-streams/pricing/">Kinesis Video
 * Streams pricing</a>.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ol>
 * <p>
 * A streaming session URL must not be shared between players. The service might
 * throttle a session if multiple media players are sharing it. For connection
 * limits, see <a
 * href="http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html"
 * >Kinesis Video Streams Limits</a>.
 * </p>
 * <p>
 * You can monitor the amount of data that the media player consumes by
 * monitoring the <code>GetMP4MediaFragment.OutgoingBytes</code> Amazon
 * CloudWatch metric. For information about using CloudWatch to monitor Kinesis
 * Video Streams, see <a href=
 * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/monitoring.html"
 * >Monitoring Kinesis Video Streams</a>. For pricing information, see <a
 * href="https://aws.amazon.com/kinesis/video-streams/pricing/">Amazon Kinesis
 * Video Streams Pricing</a> and <a href="https://aws.amazon.com/pricing/">AWS
 * Pricing</a>. Charges for both HLS sessions and outgoing AWS data apply.
 * </p>
 * <p>
 * For more information about HLS, see <a
 * href="https://developer.apple.com/streaming/">HTTP Live Streaming</a> on the
 * <a href="https://developer.apple.com">Apple Developer site</a>.
 * </p>
 * <important>
 * <p>
 * If an error is thrown after invoking a Kinesis Video Streams archived media
 * API, in addition to the HTTP status code and the response body, it includes
 * the following pieces of information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>x-amz-ErrorType</code> HTTP header – contains a more specific error
 * type in addition to what the HTTP status code provides.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>x-amz-RequestId</code> HTTP header – if you want to report an issue to
 * AWS, the support team can better diagnose the problem if given the Request
 * Id.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Both the HTTP status code and the ErrorType header can be utilized to make
 * programmatic decisions about whether errors are retry-able and under what
 * conditions, as well as provide information on what actions the client
 * programmer might need to take in order to successfully try again.
 * </p>
 * <p>
 * For more information, see the <b>Errors</b> section at the bottom of this
 * topic, as well as <a href=
 * "https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/CommonErrors.html"
 * >Common Errors</a>.
 * </p>
 * </important>
 */
public class GetHLSStreamingSessionURLRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the stream for which to retrieve the HLS master playlist URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the
     * HLS master playlist URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     */
    private String streamARN;

    /**
     * <p>
     * Whether to retrieve live, live replay, or archived, on-demand data.
     * </p>
     * <p>
     * Features of the three types of sessions include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>LIVE</code> </b>: For sessions of this type, the HLS media
     * playlist is continually updated with the latest fragments as they become
     * available. We recommend that the media player retrieve a new playlist on
     * a one-second interval. When this type of session is played in a media
     * player, the user interface typically displays a "live" notification, with
     * no scrubber control for choosing the position in the playback window to
     * display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in
     * an HLS media playlist, even if there is a gap between fragments (that is,
     * if a fragment is missing). A gap like this might cause a media player to
     * halt or cause a jump in playback. In this mode, fragments are not added
     * to the HLS media playlist if they are older than the newest fragment in
     * the playlist. If the missing fragment becomes available after a
     * subsequent fragment is added to the playlist, the older fragment is not
     * added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the HLS
     * media playlist is updated similarly to how it is updated for
     * <code>LIVE</code> mode except that it starts by including fragments from
     * a given start time. Instead of fragments being added as they are
     * ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds
     * long, then a new fragment is added to the media playlist every two
     * seconds. This mode is useful to be able to start playback from when an
     * event is detected and continue live streaming media that has not yet been
     * ingested as of the time of the session creation. This mode is also useful
     * to stream previously archived media without being limited by the 1,000
     * fragment limit in the <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media
     * playlist contains all the fragments for the session, up to the number
     * that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The
     * playlist must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is
     * <code>PRODUCER_TIMESTAMP</code>, and if there are multiple fragments with
     * the same start timestamp, the fragment that has the largest fragment
     * number (that is, the newest fragment) is included in the HLS media
     * playlist. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in
     * the HLS media playlist. This can lead to unexpected behavior in the media
     * player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, LIVE_REPLAY, ON_DEMAND
     */
    private String playbackMode;

    /**
     * <p>
     * The time range of the requested fragment and the source of the
     * timestamps.
     * </p>
     * <p>
     * This parameter is required if <code>PlaybackMode</code> is
     * <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>. This parameter is
     * optional if PlaybackMode is<code/> <code>LIVE</code>. If
     * <code>PlaybackMode</code> is <code>LIVE</code>, the
     * <code>FragmentSelectorType</code> can be set, but the
     * <code>TimestampRange</code> should not be set. If
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code> or
     * <code>LIVE_REPLAY</code>, both <code>FragmentSelectorType</code> and
     * <code>TimestampRange</code> must be set.
     * </p>
     */
    private HLSFragmentSelector hLSFragmentSelector;

    /**
     * <p>
     * Specifies which format should be used for packaging the media. Specifying
     * the <code>FRAGMENTED_MP4</code> container format packages the media into
     * MP4 fragments (fMP4 or CMAF). This is the recommended packaging because
     * there is minimal packaging overhead. The other container format option is
     * <code>MPEG_TS</code>. HLS has supported MPEG TS chunks since it was
     * released and is sometimes the only supported packaging on older HLS
     * players. MPEG TS typically has a 5-25 percent packaging overhead. This
     * means MPEG TS typically requires 5-25 percent more bandwidth and cost
     * than fMP4.
     * </p>
     * <p>
     * The default is <code>FRAGMENTED_MP4</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAGMENTED_MP4, MPEG_TS
     */
    private String containerFormat;

    /**
     * <p>
     * Specifies when flags marking discontinuities between fragments are added
     * to the media playlists.
     * </p>
     * <p>
     * Media players typically build a timeline of media content to play, based
     * on the timestamps of each fragment. This means that if there is any
     * overlap or gap between fragments (as is typical if
     * <a>HLSFragmentSelector</a> is set to <code>SERVER_TIMESTAMP</code>), the
     * media player timeline will also have small gaps between fragments in some
     * places, and will overwrite frames in other places. Gaps in the media
     * player timeline can cause playback to stall and overlaps can cause
     * playback to be jittery. When there are discontinuity flags between
     * fragments, the media player is expected to reset the timeline, resulting
     * in the next fragment being played immediately after the previous
     * fragment.
     * </p>
     * <p>
     * The following modes are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code>: a discontinuity marker is placed between every
     * fragment in the HLS media playlist. It is recommended to use a value of
     * <code>ALWAYS</code> if the fragment timestamps are not accurate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEVER</code>: no discontinuity markers are placed anywhere. It is
     * recommended to use a value of <code>NEVER</code> to ensure the media
     * player timeline most accurately maps to the producer timestamps.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON_DISCONTINUITY</code>: a discontinuity marker is placed between
     * fragments that have a gap or overlap of more than 50 milliseconds. For
     * most playback scenarios, it is recommended to use a value of
     * <code>ON_DISCONTINUITY</code> so that the media player timeline is only
     * reset when there is a significant issue with the media timeline (e.g. a
     * missing fragment).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>ALWAYS</code> when <a>HLSFragmentSelector</a> is set
     * to <code>SERVER_TIMESTAMP</code>, and <code>NEVER</code> when it is set
     * to <code>PRODUCER_TIMESTAMP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER, ON_DISCONTINUITY
     */
    private String discontinuityMode;

    /**
     * <p>
     * Specifies when the fragment start timestamps should be included in the
     * HLS media playlist. Typically, media players report the playhead position
     * as a time relative to the start of the first fragment in the playback
     * session. However, when the start timestamps are included in the HLS media
     * playlist, some media players might report the current playhead as an
     * absolute time based on the fragment timestamps. This can be useful for
     * creating a playback experience that shows viewers the wall-clock time of
     * the media.
     * </p>
     * <p>
     * The default is <code>NEVER</code>. When <a>HLSFragmentSelector</a> is
     * <code>SERVER_TIMESTAMP</code>, the timestamps will be the server start
     * timestamps. Similarly, when <a>HLSFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer
     * start timestamps.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     */
    private String displayFragmentTimestamp;

    /**
     * <p>
     * The time in seconds until the requested session expires. This value can
     * be between 300 (5 minutes) and 43200 (12 hours).
     * </p>
     * <p>
     * When a session expires, no new calls to <code>GetHLSMasterPlaylist</code>, <code>GetHLSMediaPlaylist</code>, <code>GetMP4InitFragment</code>,
     * <code>GetMP4MediaFragment</code>, or <code>GetTSFragment</code> can be
     * made for that session.
     * </p>
     * <p>
     * The default is 300 (5 minutes).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>300 - 43200<br/>
     */
    private Integer expires;

    /**
     * <p>
     * The maximum number of fragments that are returned in the HLS media
     * playlists.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent
     * fragments are returned up to this value. When the
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments
     * are returned, up to this maximum number.
     * </p>
     * <p>
     * When there are a higher number of fragments available in a live HLS media
     * playlist, video players often buffer content before starting playback.
     * Increasing the buffer size increases the playback latency, but it
     * decreases the likelihood that rebuffering will occur during playback. We
     * recommend that a live HLS media playlist have a minimum of 3 fragments
     * and a maximum of 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is
     * <code>LIVE</code> or <code>LIVE_REPLAY</code>, and 1,000 if
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 5,000 fragments corresponds to more than 80 minutes
     * of video on streams with 1-second fragments, and more than 13 hours of
     * video on streams with 10-second fragments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5000<br/>
     */
    private Long maxMediaPlaylistFragmentResults;

    /**
     * <p>
     * The name of the stream for which to retrieve the HLS master playlist URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream for which to retrieve the HLS master
     *         playlist URL.
     *         </p>
     *         <p>
     *         You must specify either the <code>StreamName</code> or the
     *         <code>StreamARN</code>.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream for which to retrieve the HLS master playlist URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream for which to retrieve the HLS master
     *            playlist URL.
     *            </p>
     *            <p>
     *            You must specify either the <code>StreamName</code> or the
     *            <code>StreamARN</code>.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream for which to retrieve the HLS master playlist URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream for which to retrieve the HLS master
     *            playlist URL.
     *            </p>
     *            <p>
     *            You must specify either the <code>StreamName</code> or the
     *            <code>StreamARN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHLSStreamingSessionURLRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the
     * HLS master playlist URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the stream for which to
     *         retrieve the HLS master playlist URL.
     *         </p>
     *         <p>
     *         You must specify either the <code>StreamName</code> or the
     *         <code>StreamARN</code>.
     *         </p>
     */
    public String getStreamARN() {
        return streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the
     * HLS master playlist URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream for which to
     *            retrieve the HLS master playlist URL.
     *            </p>
     *            <p>
     *            You must specify either the <code>StreamName</code> or the
     *            <code>StreamARN</code>.
     *            </p>
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the
     * HLS master playlist URL.
     * </p>
     * <p>
     * You must specify either the <code>StreamName</code> or the
     * <code>StreamARN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream for which to
     *            retrieve the HLS master playlist URL.
     *            </p>
     *            <p>
     *            You must specify either the <code>StreamName</code> or the
     *            <code>StreamARN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHLSStreamingSessionURLRequest withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * <p>
     * Whether to retrieve live, live replay, or archived, on-demand data.
     * </p>
     * <p>
     * Features of the three types of sessions include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>LIVE</code> </b>: For sessions of this type, the HLS media
     * playlist is continually updated with the latest fragments as they become
     * available. We recommend that the media player retrieve a new playlist on
     * a one-second interval. When this type of session is played in a media
     * player, the user interface typically displays a "live" notification, with
     * no scrubber control for choosing the position in the playback window to
     * display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in
     * an HLS media playlist, even if there is a gap between fragments (that is,
     * if a fragment is missing). A gap like this might cause a media player to
     * halt or cause a jump in playback. In this mode, fragments are not added
     * to the HLS media playlist if they are older than the newest fragment in
     * the playlist. If the missing fragment becomes available after a
     * subsequent fragment is added to the playlist, the older fragment is not
     * added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the HLS
     * media playlist is updated similarly to how it is updated for
     * <code>LIVE</code> mode except that it starts by including fragments from
     * a given start time. Instead of fragments being added as they are
     * ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds
     * long, then a new fragment is added to the media playlist every two
     * seconds. This mode is useful to be able to start playback from when an
     * event is detected and continue live streaming media that has not yet been
     * ingested as of the time of the session creation. This mode is also useful
     * to stream previously archived media without being limited by the 1,000
     * fragment limit in the <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media
     * playlist contains all the fragments for the session, up to the number
     * that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The
     * playlist must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is
     * <code>PRODUCER_TIMESTAMP</code>, and if there are multiple fragments with
     * the same start timestamp, the fragment that has the largest fragment
     * number (that is, the newest fragment) is included in the HLS media
     * playlist. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in
     * the HLS media playlist. This can lead to unexpected behavior in the media
     * player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, LIVE_REPLAY, ON_DEMAND
     *
     * @return <p>
     *         Whether to retrieve live, live replay, or archived, on-demand
     *         data.
     *         </p>
     *         <p>
     *         Features of the three types of sessions include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>LIVE</code> </b>: For sessions of this type, the HLS
     *         media playlist is continually updated with the latest fragments
     *         as they become available. We recommend that the media player
     *         retrieve a new playlist on a one-second interval. When this type
     *         of session is played in a media player, the user interface
     *         typically displays a "live" notification, with no scrubber
     *         control for choosing the position in the playback window to
     *         display.
     *         </p>
     *         <note>
     *         <p>
     *         In <code>LIVE</code> mode, the newest available fragments are
     *         included in an HLS media playlist, even if there is a gap between
     *         fragments (that is, if a fragment is missing). A gap like this
     *         might cause a media player to halt or cause a jump in playback.
     *         In this mode, fragments are not added to the HLS media playlist
     *         if they are older than the newest fragment in the playlist. If
     *         the missing fragment becomes available after a subsequent
     *         fragment is added to the playlist, the older fragment is not
     *         added, and the gap is not filled.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the
     *         HLS media playlist is updated similarly to how it is updated for
     *         <code>LIVE</code> mode except that it starts by including
     *         fragments from a given start time. Instead of fragments being
     *         added as they are ingested, fragments are added as the duration
     *         of the next fragment elapses. For example, if the fragments in
     *         the session are two seconds long, then a new fragment is added to
     *         the media playlist every two seconds. This mode is useful to be
     *         able to start playback from when an event is detected and
     *         continue live streaming media that has not yet been ingested as
     *         of the time of the session creation. This mode is also useful to
     *         stream previously archived media without being limited by the
     *         1,000 fragment limit in the <code>ON_DEMAND</code> mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the
     *         HLS media playlist contains all the fragments for the session, up
     *         to the number that is specified in
     *         <code>MaxMediaPlaylistFragmentResults</code>. The playlist must
     *         be retrieved only once for each session. When this type of
     *         session is played in a media player, the user interface typically
     *         displays a scrubber control for choosing the position in the
     *         playback window to display.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In all playback modes, if <code>FragmentSelectorType</code> is
     *         <code>PRODUCER_TIMESTAMP</code>, and if there are multiple
     *         fragments with the same start timestamp, the fragment that has
     *         the largest fragment number (that is, the newest fragment) is
     *         included in the HLS media playlist. The other fragments are not
     *         included. Fragments that have different timestamps but have
     *         overlapping durations are still included in the HLS media
     *         playlist. This can lead to unexpected behavior in the media
     *         player.
     *         </p>
     *         <p>
     *         The default is <code>LIVE</code>.
     *         </p>
     * @see HLSPlaybackMode
     */
    public String getPlaybackMode() {
        return playbackMode;
    }

    /**
     * <p>
     * Whether to retrieve live, live replay, or archived, on-demand data.
     * </p>
     * <p>
     * Features of the three types of sessions include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>LIVE</code> </b>: For sessions of this type, the HLS media
     * playlist is continually updated with the latest fragments as they become
     * available. We recommend that the media player retrieve a new playlist on
     * a one-second interval. When this type of session is played in a media
     * player, the user interface typically displays a "live" notification, with
     * no scrubber control for choosing the position in the playback window to
     * display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in
     * an HLS media playlist, even if there is a gap between fragments (that is,
     * if a fragment is missing). A gap like this might cause a media player to
     * halt or cause a jump in playback. In this mode, fragments are not added
     * to the HLS media playlist if they are older than the newest fragment in
     * the playlist. If the missing fragment becomes available after a
     * subsequent fragment is added to the playlist, the older fragment is not
     * added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the HLS
     * media playlist is updated similarly to how it is updated for
     * <code>LIVE</code> mode except that it starts by including fragments from
     * a given start time. Instead of fragments being added as they are
     * ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds
     * long, then a new fragment is added to the media playlist every two
     * seconds. This mode is useful to be able to start playback from when an
     * event is detected and continue live streaming media that has not yet been
     * ingested as of the time of the session creation. This mode is also useful
     * to stream previously archived media without being limited by the 1,000
     * fragment limit in the <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media
     * playlist contains all the fragments for the session, up to the number
     * that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The
     * playlist must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is
     * <code>PRODUCER_TIMESTAMP</code>, and if there are multiple fragments with
     * the same start timestamp, the fragment that has the largest fragment
     * number (that is, the newest fragment) is included in the HLS media
     * playlist. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in
     * the HLS media playlist. This can lead to unexpected behavior in the media
     * player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, LIVE_REPLAY, ON_DEMAND
     *
     * @param playbackMode <p>
     *            Whether to retrieve live, live replay, or archived, on-demand
     *            data.
     *            </p>
     *            <p>
     *            Features of the three types of sessions include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>LIVE</code> </b>: For sessions of this type, the HLS
     *            media playlist is continually updated with the latest
     *            fragments as they become available. We recommend that the
     *            media player retrieve a new playlist on a one-second interval.
     *            When this type of session is played in a media player, the
     *            user interface typically displays a "live" notification, with
     *            no scrubber control for choosing the position in the playback
     *            window to display.
     *            </p>
     *            <note>
     *            <p>
     *            In <code>LIVE</code> mode, the newest available fragments are
     *            included in an HLS media playlist, even if there is a gap
     *            between fragments (that is, if a fragment is missing). A gap
     *            like this might cause a media player to halt or cause a jump
     *            in playback. In this mode, fragments are not added to the HLS
     *            media playlist if they are older than the newest fragment in
     *            the playlist. If the missing fragment becomes available after
     *            a subsequent fragment is added to the playlist, the older
     *            fragment is not added, and the gap is not filled.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type,
     *            the HLS media playlist is updated similarly to how it is
     *            updated for <code>LIVE</code> mode except that it starts by
     *            including fragments from a given start time. Instead of
     *            fragments being added as they are ingested, fragments are
     *            added as the duration of the next fragment elapses. For
     *            example, if the fragments in the session are two seconds long,
     *            then a new fragment is added to the media playlist every two
     *            seconds. This mode is useful to be able to start playback from
     *            when an event is detected and continue live streaming media
     *            that has not yet been ingested as of the time of the session
     *            creation. This mode is also useful to stream previously
     *            archived media without being limited by the 1,000 fragment
     *            limit in the <code>ON_DEMAND</code> mode.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>ON_DEMAND</code> </b>: For sessions of this type,
     *            the HLS media playlist contains all the fragments for the
     *            session, up to the number that is specified in
     *            <code>MaxMediaPlaylistFragmentResults</code>. The playlist
     *            must be retrieved only once for each session. When this type
     *            of session is played in a media player, the user interface
     *            typically displays a scrubber control for choosing the
     *            position in the playback window to display.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            In all playback modes, if <code>FragmentSelectorType</code> is
     *            <code>PRODUCER_TIMESTAMP</code>, and if there are multiple
     *            fragments with the same start timestamp, the fragment that has
     *            the largest fragment number (that is, the newest fragment) is
     *            included in the HLS media playlist. The other fragments are
     *            not included. Fragments that have different timestamps but
     *            have overlapping durations are still included in the HLS media
     *            playlist. This can lead to unexpected behavior in the media
     *            player.
     *            </p>
     *            <p>
     *            The default is <code>LIVE</code>.
     *            </p>
     * @see HLSPlaybackMode
     */
    public void setPlaybackMode(String playbackMode) {
        this.playbackMode = playbackMode;
    }

    /**
     * <p>
     * Whether to retrieve live, live replay, or archived, on-demand data.
     * </p>
     * <p>
     * Features of the three types of sessions include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>LIVE</code> </b>: For sessions of this type, the HLS media
     * playlist is continually updated with the latest fragments as they become
     * available. We recommend that the media player retrieve a new playlist on
     * a one-second interval. When this type of session is played in a media
     * player, the user interface typically displays a "live" notification, with
     * no scrubber control for choosing the position in the playback window to
     * display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in
     * an HLS media playlist, even if there is a gap between fragments (that is,
     * if a fragment is missing). A gap like this might cause a media player to
     * halt or cause a jump in playback. In this mode, fragments are not added
     * to the HLS media playlist if they are older than the newest fragment in
     * the playlist. If the missing fragment becomes available after a
     * subsequent fragment is added to the playlist, the older fragment is not
     * added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the HLS
     * media playlist is updated similarly to how it is updated for
     * <code>LIVE</code> mode except that it starts by including fragments from
     * a given start time. Instead of fragments being added as they are
     * ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds
     * long, then a new fragment is added to the media playlist every two
     * seconds. This mode is useful to be able to start playback from when an
     * event is detected and continue live streaming media that has not yet been
     * ingested as of the time of the session creation. This mode is also useful
     * to stream previously archived media without being limited by the 1,000
     * fragment limit in the <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media
     * playlist contains all the fragments for the session, up to the number
     * that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The
     * playlist must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is
     * <code>PRODUCER_TIMESTAMP</code>, and if there are multiple fragments with
     * the same start timestamp, the fragment that has the largest fragment
     * number (that is, the newest fragment) is included in the HLS media
     * playlist. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in
     * the HLS media playlist. This can lead to unexpected behavior in the media
     * player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, LIVE_REPLAY, ON_DEMAND
     *
     * @param playbackMode <p>
     *            Whether to retrieve live, live replay, or archived, on-demand
     *            data.
     *            </p>
     *            <p>
     *            Features of the three types of sessions include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>LIVE</code> </b>: For sessions of this type, the HLS
     *            media playlist is continually updated with the latest
     *            fragments as they become available. We recommend that the
     *            media player retrieve a new playlist on a one-second interval.
     *            When this type of session is played in a media player, the
     *            user interface typically displays a "live" notification, with
     *            no scrubber control for choosing the position in the playback
     *            window to display.
     *            </p>
     *            <note>
     *            <p>
     *            In <code>LIVE</code> mode, the newest available fragments are
     *            included in an HLS media playlist, even if there is a gap
     *            between fragments (that is, if a fragment is missing). A gap
     *            like this might cause a media player to halt or cause a jump
     *            in playback. In this mode, fragments are not added to the HLS
     *            media playlist if they are older than the newest fragment in
     *            the playlist. If the missing fragment becomes available after
     *            a subsequent fragment is added to the playlist, the older
     *            fragment is not added, and the gap is not filled.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type,
     *            the HLS media playlist is updated similarly to how it is
     *            updated for <code>LIVE</code> mode except that it starts by
     *            including fragments from a given start time. Instead of
     *            fragments being added as they are ingested, fragments are
     *            added as the duration of the next fragment elapses. For
     *            example, if the fragments in the session are two seconds long,
     *            then a new fragment is added to the media playlist every two
     *            seconds. This mode is useful to be able to start playback from
     *            when an event is detected and continue live streaming media
     *            that has not yet been ingested as of the time of the session
     *            creation. This mode is also useful to stream previously
     *            archived media without being limited by the 1,000 fragment
     *            limit in the <code>ON_DEMAND</code> mode.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>ON_DEMAND</code> </b>: For sessions of this type,
     *            the HLS media playlist contains all the fragments for the
     *            session, up to the number that is specified in
     *            <code>MaxMediaPlaylistFragmentResults</code>. The playlist
     *            must be retrieved only once for each session. When this type
     *            of session is played in a media player, the user interface
     *            typically displays a scrubber control for choosing the
     *            position in the playback window to display.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            In all playback modes, if <code>FragmentSelectorType</code> is
     *            <code>PRODUCER_TIMESTAMP</code>, and if there are multiple
     *            fragments with the same start timestamp, the fragment that has
     *            the largest fragment number (that is, the newest fragment) is
     *            included in the HLS media playlist. The other fragments are
     *            not included. Fragments that have different timestamps but
     *            have overlapping durations are still included in the HLS media
     *            playlist. This can lead to unexpected behavior in the media
     *            player.
     *            </p>
     *            <p>
     *            The default is <code>LIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HLSPlaybackMode
     */
    public GetHLSStreamingSessionURLRequest withPlaybackMode(String playbackMode) {
        this.playbackMode = playbackMode;
        return this;
    }

    /**
     * <p>
     * Whether to retrieve live, live replay, or archived, on-demand data.
     * </p>
     * <p>
     * Features of the three types of sessions include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>LIVE</code> </b>: For sessions of this type, the HLS media
     * playlist is continually updated with the latest fragments as they become
     * available. We recommend that the media player retrieve a new playlist on
     * a one-second interval. When this type of session is played in a media
     * player, the user interface typically displays a "live" notification, with
     * no scrubber control for choosing the position in the playback window to
     * display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in
     * an HLS media playlist, even if there is a gap between fragments (that is,
     * if a fragment is missing). A gap like this might cause a media player to
     * halt or cause a jump in playback. In this mode, fragments are not added
     * to the HLS media playlist if they are older than the newest fragment in
     * the playlist. If the missing fragment becomes available after a
     * subsequent fragment is added to the playlist, the older fragment is not
     * added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the HLS
     * media playlist is updated similarly to how it is updated for
     * <code>LIVE</code> mode except that it starts by including fragments from
     * a given start time. Instead of fragments being added as they are
     * ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds
     * long, then a new fragment is added to the media playlist every two
     * seconds. This mode is useful to be able to start playback from when an
     * event is detected and continue live streaming media that has not yet been
     * ingested as of the time of the session creation. This mode is also useful
     * to stream previously archived media without being limited by the 1,000
     * fragment limit in the <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media
     * playlist contains all the fragments for the session, up to the number
     * that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The
     * playlist must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is
     * <code>PRODUCER_TIMESTAMP</code>, and if there are multiple fragments with
     * the same start timestamp, the fragment that has the largest fragment
     * number (that is, the newest fragment) is included in the HLS media
     * playlist. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in
     * the HLS media playlist. This can lead to unexpected behavior in the media
     * player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, LIVE_REPLAY, ON_DEMAND
     *
     * @param playbackMode <p>
     *            Whether to retrieve live, live replay, or archived, on-demand
     *            data.
     *            </p>
     *            <p>
     *            Features of the three types of sessions include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>LIVE</code> </b>: For sessions of this type, the HLS
     *            media playlist is continually updated with the latest
     *            fragments as they become available. We recommend that the
     *            media player retrieve a new playlist on a one-second interval.
     *            When this type of session is played in a media player, the
     *            user interface typically displays a "live" notification, with
     *            no scrubber control for choosing the position in the playback
     *            window to display.
     *            </p>
     *            <note>
     *            <p>
     *            In <code>LIVE</code> mode, the newest available fragments are
     *            included in an HLS media playlist, even if there is a gap
     *            between fragments (that is, if a fragment is missing). A gap
     *            like this might cause a media player to halt or cause a jump
     *            in playback. In this mode, fragments are not added to the HLS
     *            media playlist if they are older than the newest fragment in
     *            the playlist. If the missing fragment becomes available after
     *            a subsequent fragment is added to the playlist, the older
     *            fragment is not added, and the gap is not filled.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type,
     *            the HLS media playlist is updated similarly to how it is
     *            updated for <code>LIVE</code> mode except that it starts by
     *            including fragments from a given start time. Instead of
     *            fragments being added as they are ingested, fragments are
     *            added as the duration of the next fragment elapses. For
     *            example, if the fragments in the session are two seconds long,
     *            then a new fragment is added to the media playlist every two
     *            seconds. This mode is useful to be able to start playback from
     *            when an event is detected and continue live streaming media
     *            that has not yet been ingested as of the time of the session
     *            creation. This mode is also useful to stream previously
     *            archived media without being limited by the 1,000 fragment
     *            limit in the <code>ON_DEMAND</code> mode.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>ON_DEMAND</code> </b>: For sessions of this type,
     *            the HLS media playlist contains all the fragments for the
     *            session, up to the number that is specified in
     *            <code>MaxMediaPlaylistFragmentResults</code>. The playlist
     *            must be retrieved only once for each session. When this type
     *            of session is played in a media player, the user interface
     *            typically displays a scrubber control for choosing the
     *            position in the playback window to display.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            In all playback modes, if <code>FragmentSelectorType</code> is
     *            <code>PRODUCER_TIMESTAMP</code>, and if there are multiple
     *            fragments with the same start timestamp, the fragment that has
     *            the largest fragment number (that is, the newest fragment) is
     *            included in the HLS media playlist. The other fragments are
     *            not included. Fragments that have different timestamps but
     *            have overlapping durations are still included in the HLS media
     *            playlist. This can lead to unexpected behavior in the media
     *            player.
     *            </p>
     *            <p>
     *            The default is <code>LIVE</code>.
     *            </p>
     * @see HLSPlaybackMode
     */
    public void setPlaybackMode(HLSPlaybackMode playbackMode) {
        this.playbackMode = playbackMode.toString();
    }

    /**
     * <p>
     * Whether to retrieve live, live replay, or archived, on-demand data.
     * </p>
     * <p>
     * Features of the three types of sessions include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>LIVE</code> </b>: For sessions of this type, the HLS media
     * playlist is continually updated with the latest fragments as they become
     * available. We recommend that the media player retrieve a new playlist on
     * a one-second interval. When this type of session is played in a media
     * player, the user interface typically displays a "live" notification, with
     * no scrubber control for choosing the position in the playback window to
     * display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in
     * an HLS media playlist, even if there is a gap between fragments (that is,
     * if a fragment is missing). A gap like this might cause a media player to
     * halt or cause a jump in playback. In this mode, fragments are not added
     * to the HLS media playlist if they are older than the newest fragment in
     * the playlist. If the missing fragment becomes available after a
     * subsequent fragment is added to the playlist, the older fragment is not
     * added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the HLS
     * media playlist is updated similarly to how it is updated for
     * <code>LIVE</code> mode except that it starts by including fragments from
     * a given start time. Instead of fragments being added as they are
     * ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds
     * long, then a new fragment is added to the media playlist every two
     * seconds. This mode is useful to be able to start playback from when an
     * event is detected and continue live streaming media that has not yet been
     * ingested as of the time of the session creation. This mode is also useful
     * to stream previously archived media without being limited by the 1,000
     * fragment limit in the <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media
     * playlist contains all the fragments for the session, up to the number
     * that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The
     * playlist must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is
     * <code>PRODUCER_TIMESTAMP</code>, and if there are multiple fragments with
     * the same start timestamp, the fragment that has the largest fragment
     * number (that is, the newest fragment) is included in the HLS media
     * playlist. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in
     * the HLS media playlist. This can lead to unexpected behavior in the media
     * player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, LIVE_REPLAY, ON_DEMAND
     *
     * @param playbackMode <p>
     *            Whether to retrieve live, live replay, or archived, on-demand
     *            data.
     *            </p>
     *            <p>
     *            Features of the three types of sessions include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b> <code>LIVE</code> </b>: For sessions of this type, the HLS
     *            media playlist is continually updated with the latest
     *            fragments as they become available. We recommend that the
     *            media player retrieve a new playlist on a one-second interval.
     *            When this type of session is played in a media player, the
     *            user interface typically displays a "live" notification, with
     *            no scrubber control for choosing the position in the playback
     *            window to display.
     *            </p>
     *            <note>
     *            <p>
     *            In <code>LIVE</code> mode, the newest available fragments are
     *            included in an HLS media playlist, even if there is a gap
     *            between fragments (that is, if a fragment is missing). A gap
     *            like this might cause a media player to halt or cause a jump
     *            in playback. In this mode, fragments are not added to the HLS
     *            media playlist if they are older than the newest fragment in
     *            the playlist. If the missing fragment becomes available after
     *            a subsequent fragment is added to the playlist, the older
     *            fragment is not added, and the gap is not filled.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type,
     *            the HLS media playlist is updated similarly to how it is
     *            updated for <code>LIVE</code> mode except that it starts by
     *            including fragments from a given start time. Instead of
     *            fragments being added as they are ingested, fragments are
     *            added as the duration of the next fragment elapses. For
     *            example, if the fragments in the session are two seconds long,
     *            then a new fragment is added to the media playlist every two
     *            seconds. This mode is useful to be able to start playback from
     *            when an event is detected and continue live streaming media
     *            that has not yet been ingested as of the time of the session
     *            creation. This mode is also useful to stream previously
     *            archived media without being limited by the 1,000 fragment
     *            limit in the <code>ON_DEMAND</code> mode.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b> <code>ON_DEMAND</code> </b>: For sessions of this type,
     *            the HLS media playlist contains all the fragments for the
     *            session, up to the number that is specified in
     *            <code>MaxMediaPlaylistFragmentResults</code>. The playlist
     *            must be retrieved only once for each session. When this type
     *            of session is played in a media player, the user interface
     *            typically displays a scrubber control for choosing the
     *            position in the playback window to display.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            In all playback modes, if <code>FragmentSelectorType</code> is
     *            <code>PRODUCER_TIMESTAMP</code>, and if there are multiple
     *            fragments with the same start timestamp, the fragment that has
     *            the largest fragment number (that is, the newest fragment) is
     *            included in the HLS media playlist. The other fragments are
     *            not included. Fragments that have different timestamps but
     *            have overlapping durations are still included in the HLS media
     *            playlist. This can lead to unexpected behavior in the media
     *            player.
     *            </p>
     *            <p>
     *            The default is <code>LIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HLSPlaybackMode
     */
    public GetHLSStreamingSessionURLRequest withPlaybackMode(HLSPlaybackMode playbackMode) {
        this.playbackMode = playbackMode.toString();
        return this;
    }

    /**
     * <p>
     * The time range of the requested fragment and the source of the
     * timestamps.
     * </p>
     * <p>
     * This parameter is required if <code>PlaybackMode</code> is
     * <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>. This parameter is
     * optional if PlaybackMode is<code/> <code>LIVE</code>. If
     * <code>PlaybackMode</code> is <code>LIVE</code>, the
     * <code>FragmentSelectorType</code> can be set, but the
     * <code>TimestampRange</code> should not be set. If
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code> or
     * <code>LIVE_REPLAY</code>, both <code>FragmentSelectorType</code> and
     * <code>TimestampRange</code> must be set.
     * </p>
     *
     * @return <p>
     *         The time range of the requested fragment and the source of the
     *         timestamps.
     *         </p>
     *         <p>
     *         This parameter is required if <code>PlaybackMode</code> is
     *         <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>. This
     *         parameter is optional if PlaybackMode is<code/> <code>LIVE</code>
     *         . If <code>PlaybackMode</code> is <code>LIVE</code>, the
     *         <code>FragmentSelectorType</code> can be set, but the
     *         <code>TimestampRange</code> should not be set. If
     *         <code>PlaybackMode</code> is <code>ON_DEMAND</code> or
     *         <code>LIVE_REPLAY</code>, both <code>FragmentSelectorType</code>
     *         and <code>TimestampRange</code> must be set.
     *         </p>
     */
    public HLSFragmentSelector getHLSFragmentSelector() {
        return hLSFragmentSelector;
    }

    /**
     * <p>
     * The time range of the requested fragment and the source of the
     * timestamps.
     * </p>
     * <p>
     * This parameter is required if <code>PlaybackMode</code> is
     * <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>. This parameter is
     * optional if PlaybackMode is<code/> <code>LIVE</code>. If
     * <code>PlaybackMode</code> is <code>LIVE</code>, the
     * <code>FragmentSelectorType</code> can be set, but the
     * <code>TimestampRange</code> should not be set. If
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code> or
     * <code>LIVE_REPLAY</code>, both <code>FragmentSelectorType</code> and
     * <code>TimestampRange</code> must be set.
     * </p>
     *
     * @param hLSFragmentSelector <p>
     *            The time range of the requested fragment and the source of the
     *            timestamps.
     *            </p>
     *            <p>
     *            This parameter is required if <code>PlaybackMode</code> is
     *            <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>. This
     *            parameter is optional if PlaybackMode is
     *            <code/> <code>LIVE</code>. If <code>PlaybackMode</code> is
     *            <code>LIVE</code>, the <code>FragmentSelectorType</code> can
     *            be set, but the <code>TimestampRange</code> should not be set.
     *            If <code>PlaybackMode</code> is <code>ON_DEMAND</code> or
     *            <code>LIVE_REPLAY</code>, both
     *            <code>FragmentSelectorType</code> and
     *            <code>TimestampRange</code> must be set.
     *            </p>
     */
    public void setHLSFragmentSelector(HLSFragmentSelector hLSFragmentSelector) {
        this.hLSFragmentSelector = hLSFragmentSelector;
    }

    /**
     * <p>
     * The time range of the requested fragment and the source of the
     * timestamps.
     * </p>
     * <p>
     * This parameter is required if <code>PlaybackMode</code> is
     * <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>. This parameter is
     * optional if PlaybackMode is<code/> <code>LIVE</code>. If
     * <code>PlaybackMode</code> is <code>LIVE</code>, the
     * <code>FragmentSelectorType</code> can be set, but the
     * <code>TimestampRange</code> should not be set. If
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code> or
     * <code>LIVE_REPLAY</code>, both <code>FragmentSelectorType</code> and
     * <code>TimestampRange</code> must be set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hLSFragmentSelector <p>
     *            The time range of the requested fragment and the source of the
     *            timestamps.
     *            </p>
     *            <p>
     *            This parameter is required if <code>PlaybackMode</code> is
     *            <code>ON_DEMAND</code> or <code>LIVE_REPLAY</code>. This
     *            parameter is optional if PlaybackMode is
     *            <code/> <code>LIVE</code>. If <code>PlaybackMode</code> is
     *            <code>LIVE</code>, the <code>FragmentSelectorType</code> can
     *            be set, but the <code>TimestampRange</code> should not be set.
     *            If <code>PlaybackMode</code> is <code>ON_DEMAND</code> or
     *            <code>LIVE_REPLAY</code>, both
     *            <code>FragmentSelectorType</code> and
     *            <code>TimestampRange</code> must be set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHLSStreamingSessionURLRequest withHLSFragmentSelector(
            HLSFragmentSelector hLSFragmentSelector) {
        this.hLSFragmentSelector = hLSFragmentSelector;
        return this;
    }

    /**
     * <p>
     * Specifies which format should be used for packaging the media. Specifying
     * the <code>FRAGMENTED_MP4</code> container format packages the media into
     * MP4 fragments (fMP4 or CMAF). This is the recommended packaging because
     * there is minimal packaging overhead. The other container format option is
     * <code>MPEG_TS</code>. HLS has supported MPEG TS chunks since it was
     * released and is sometimes the only supported packaging on older HLS
     * players. MPEG TS typically has a 5-25 percent packaging overhead. This
     * means MPEG TS typically requires 5-25 percent more bandwidth and cost
     * than fMP4.
     * </p>
     * <p>
     * The default is <code>FRAGMENTED_MP4</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAGMENTED_MP4, MPEG_TS
     *
     * @return <p>
     *         Specifies which format should be used for packaging the media.
     *         Specifying the <code>FRAGMENTED_MP4</code> container format
     *         packages the media into MP4 fragments (fMP4 or CMAF). This is the
     *         recommended packaging because there is minimal packaging
     *         overhead. The other container format option is
     *         <code>MPEG_TS</code>. HLS has supported MPEG TS chunks since it
     *         was released and is sometimes the only supported packaging on
     *         older HLS players. MPEG TS typically has a 5-25 percent packaging
     *         overhead. This means MPEG TS typically requires 5-25 percent more
     *         bandwidth and cost than fMP4.
     *         </p>
     *         <p>
     *         The default is <code>FRAGMENTED_MP4</code>.
     *         </p>
     * @see ContainerFormat
     */
    public String getContainerFormat() {
        return containerFormat;
    }

    /**
     * <p>
     * Specifies which format should be used for packaging the media. Specifying
     * the <code>FRAGMENTED_MP4</code> container format packages the media into
     * MP4 fragments (fMP4 or CMAF). This is the recommended packaging because
     * there is minimal packaging overhead. The other container format option is
     * <code>MPEG_TS</code>. HLS has supported MPEG TS chunks since it was
     * released and is sometimes the only supported packaging on older HLS
     * players. MPEG TS typically has a 5-25 percent packaging overhead. This
     * means MPEG TS typically requires 5-25 percent more bandwidth and cost
     * than fMP4.
     * </p>
     * <p>
     * The default is <code>FRAGMENTED_MP4</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAGMENTED_MP4, MPEG_TS
     *
     * @param containerFormat <p>
     *            Specifies which format should be used for packaging the media.
     *            Specifying the <code>FRAGMENTED_MP4</code> container format
     *            packages the media into MP4 fragments (fMP4 or CMAF). This is
     *            the recommended packaging because there is minimal packaging
     *            overhead. The other container format option is
     *            <code>MPEG_TS</code>. HLS has supported MPEG TS chunks since
     *            it was released and is sometimes the only supported packaging
     *            on older HLS players. MPEG TS typically has a 5-25 percent
     *            packaging overhead. This means MPEG TS typically requires 5-25
     *            percent more bandwidth and cost than fMP4.
     *            </p>
     *            <p>
     *            The default is <code>FRAGMENTED_MP4</code>.
     *            </p>
     * @see ContainerFormat
     */
    public void setContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
    }

    /**
     * <p>
     * Specifies which format should be used for packaging the media. Specifying
     * the <code>FRAGMENTED_MP4</code> container format packages the media into
     * MP4 fragments (fMP4 or CMAF). This is the recommended packaging because
     * there is minimal packaging overhead. The other container format option is
     * <code>MPEG_TS</code>. HLS has supported MPEG TS chunks since it was
     * released and is sometimes the only supported packaging on older HLS
     * players. MPEG TS typically has a 5-25 percent packaging overhead. This
     * means MPEG TS typically requires 5-25 percent more bandwidth and cost
     * than fMP4.
     * </p>
     * <p>
     * The default is <code>FRAGMENTED_MP4</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAGMENTED_MP4, MPEG_TS
     *
     * @param containerFormat <p>
     *            Specifies which format should be used for packaging the media.
     *            Specifying the <code>FRAGMENTED_MP4</code> container format
     *            packages the media into MP4 fragments (fMP4 or CMAF). This is
     *            the recommended packaging because there is minimal packaging
     *            overhead. The other container format option is
     *            <code>MPEG_TS</code>. HLS has supported MPEG TS chunks since
     *            it was released and is sometimes the only supported packaging
     *            on older HLS players. MPEG TS typically has a 5-25 percent
     *            packaging overhead. This means MPEG TS typically requires 5-25
     *            percent more bandwidth and cost than fMP4.
     *            </p>
     *            <p>
     *            The default is <code>FRAGMENTED_MP4</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContainerFormat
     */
    public GetHLSStreamingSessionURLRequest withContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
        return this;
    }

    /**
     * <p>
     * Specifies which format should be used for packaging the media. Specifying
     * the <code>FRAGMENTED_MP4</code> container format packages the media into
     * MP4 fragments (fMP4 or CMAF). This is the recommended packaging because
     * there is minimal packaging overhead. The other container format option is
     * <code>MPEG_TS</code>. HLS has supported MPEG TS chunks since it was
     * released and is sometimes the only supported packaging on older HLS
     * players. MPEG TS typically has a 5-25 percent packaging overhead. This
     * means MPEG TS typically requires 5-25 percent more bandwidth and cost
     * than fMP4.
     * </p>
     * <p>
     * The default is <code>FRAGMENTED_MP4</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAGMENTED_MP4, MPEG_TS
     *
     * @param containerFormat <p>
     *            Specifies which format should be used for packaging the media.
     *            Specifying the <code>FRAGMENTED_MP4</code> container format
     *            packages the media into MP4 fragments (fMP4 or CMAF). This is
     *            the recommended packaging because there is minimal packaging
     *            overhead. The other container format option is
     *            <code>MPEG_TS</code>. HLS has supported MPEG TS chunks since
     *            it was released and is sometimes the only supported packaging
     *            on older HLS players. MPEG TS typically has a 5-25 percent
     *            packaging overhead. This means MPEG TS typically requires 5-25
     *            percent more bandwidth and cost than fMP4.
     *            </p>
     *            <p>
     *            The default is <code>FRAGMENTED_MP4</code>.
     *            </p>
     * @see ContainerFormat
     */
    public void setContainerFormat(ContainerFormat containerFormat) {
        this.containerFormat = containerFormat.toString();
    }

    /**
     * <p>
     * Specifies which format should be used for packaging the media. Specifying
     * the <code>FRAGMENTED_MP4</code> container format packages the media into
     * MP4 fragments (fMP4 or CMAF). This is the recommended packaging because
     * there is minimal packaging overhead. The other container format option is
     * <code>MPEG_TS</code>. HLS has supported MPEG TS chunks since it was
     * released and is sometimes the only supported packaging on older HLS
     * players. MPEG TS typically has a 5-25 percent packaging overhead. This
     * means MPEG TS typically requires 5-25 percent more bandwidth and cost
     * than fMP4.
     * </p>
     * <p>
     * The default is <code>FRAGMENTED_MP4</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAGMENTED_MP4, MPEG_TS
     *
     * @param containerFormat <p>
     *            Specifies which format should be used for packaging the media.
     *            Specifying the <code>FRAGMENTED_MP4</code> container format
     *            packages the media into MP4 fragments (fMP4 or CMAF). This is
     *            the recommended packaging because there is minimal packaging
     *            overhead. The other container format option is
     *            <code>MPEG_TS</code>. HLS has supported MPEG TS chunks since
     *            it was released and is sometimes the only supported packaging
     *            on older HLS players. MPEG TS typically has a 5-25 percent
     *            packaging overhead. This means MPEG TS typically requires 5-25
     *            percent more bandwidth and cost than fMP4.
     *            </p>
     *            <p>
     *            The default is <code>FRAGMENTED_MP4</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContainerFormat
     */
    public GetHLSStreamingSessionURLRequest withContainerFormat(ContainerFormat containerFormat) {
        this.containerFormat = containerFormat.toString();
        return this;
    }

    /**
     * <p>
     * Specifies when flags marking discontinuities between fragments are added
     * to the media playlists.
     * </p>
     * <p>
     * Media players typically build a timeline of media content to play, based
     * on the timestamps of each fragment. This means that if there is any
     * overlap or gap between fragments (as is typical if
     * <a>HLSFragmentSelector</a> is set to <code>SERVER_TIMESTAMP</code>), the
     * media player timeline will also have small gaps between fragments in some
     * places, and will overwrite frames in other places. Gaps in the media
     * player timeline can cause playback to stall and overlaps can cause
     * playback to be jittery. When there are discontinuity flags between
     * fragments, the media player is expected to reset the timeline, resulting
     * in the next fragment being played immediately after the previous
     * fragment.
     * </p>
     * <p>
     * The following modes are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code>: a discontinuity marker is placed between every
     * fragment in the HLS media playlist. It is recommended to use a value of
     * <code>ALWAYS</code> if the fragment timestamps are not accurate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEVER</code>: no discontinuity markers are placed anywhere. It is
     * recommended to use a value of <code>NEVER</code> to ensure the media
     * player timeline most accurately maps to the producer timestamps.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON_DISCONTINUITY</code>: a discontinuity marker is placed between
     * fragments that have a gap or overlap of more than 50 milliseconds. For
     * most playback scenarios, it is recommended to use a value of
     * <code>ON_DISCONTINUITY</code> so that the media player timeline is only
     * reset when there is a significant issue with the media timeline (e.g. a
     * missing fragment).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>ALWAYS</code> when <a>HLSFragmentSelector</a> is set
     * to <code>SERVER_TIMESTAMP</code>, and <code>NEVER</code> when it is set
     * to <code>PRODUCER_TIMESTAMP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER, ON_DISCONTINUITY
     *
     * @return <p>
     *         Specifies when flags marking discontinuities between fragments
     *         are added to the media playlists.
     *         </p>
     *         <p>
     *         Media players typically build a timeline of media content to
     *         play, based on the timestamps of each fragment. This means that
     *         if there is any overlap or gap between fragments (as is typical
     *         if <a>HLSFragmentSelector</a> is set to
     *         <code>SERVER_TIMESTAMP</code>), the media player timeline will
     *         also have small gaps between fragments in some places, and will
     *         overwrite frames in other places. Gaps in the media player
     *         timeline can cause playback to stall and overlaps can cause
     *         playback to be jittery. When there are discontinuity flags
     *         between fragments, the media player is expected to reset the
     *         timeline, resulting in the next fragment being played immediately
     *         after the previous fragment.
     *         </p>
     *         <p>
     *         The following modes are supported:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALWAYS</code>: a discontinuity marker is placed between
     *         every fragment in the HLS media playlist. It is recommended to
     *         use a value of <code>ALWAYS</code> if the fragment timestamps are
     *         not accurate.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEVER</code>: no discontinuity markers are placed anywhere.
     *         It is recommended to use a value of <code>NEVER</code> to ensure
     *         the media player timeline most accurately maps to the producer
     *         timestamps.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ON_DISCONTINUITY</code>: a discontinuity marker is placed
     *         between fragments that have a gap or overlap of more than 50
     *         milliseconds. For most playback scenarios, it is recommended to
     *         use a value of <code>ON_DISCONTINUITY</code> so that the media
     *         player timeline is only reset when there is a significant issue
     *         with the media timeline (e.g. a missing fragment).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default is <code>ALWAYS</code> when
     *         <a>HLSFragmentSelector</a> is set to
     *         <code>SERVER_TIMESTAMP</code>, and <code>NEVER</code> when it is
     *         set to <code>PRODUCER_TIMESTAMP</code>.
     *         </p>
     * @see HLSDiscontinuityMode
     */
    public String getDiscontinuityMode() {
        return discontinuityMode;
    }

    /**
     * <p>
     * Specifies when flags marking discontinuities between fragments are added
     * to the media playlists.
     * </p>
     * <p>
     * Media players typically build a timeline of media content to play, based
     * on the timestamps of each fragment. This means that if there is any
     * overlap or gap between fragments (as is typical if
     * <a>HLSFragmentSelector</a> is set to <code>SERVER_TIMESTAMP</code>), the
     * media player timeline will also have small gaps between fragments in some
     * places, and will overwrite frames in other places. Gaps in the media
     * player timeline can cause playback to stall and overlaps can cause
     * playback to be jittery. When there are discontinuity flags between
     * fragments, the media player is expected to reset the timeline, resulting
     * in the next fragment being played immediately after the previous
     * fragment.
     * </p>
     * <p>
     * The following modes are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code>: a discontinuity marker is placed between every
     * fragment in the HLS media playlist. It is recommended to use a value of
     * <code>ALWAYS</code> if the fragment timestamps are not accurate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEVER</code>: no discontinuity markers are placed anywhere. It is
     * recommended to use a value of <code>NEVER</code> to ensure the media
     * player timeline most accurately maps to the producer timestamps.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON_DISCONTINUITY</code>: a discontinuity marker is placed between
     * fragments that have a gap or overlap of more than 50 milliseconds. For
     * most playback scenarios, it is recommended to use a value of
     * <code>ON_DISCONTINUITY</code> so that the media player timeline is only
     * reset when there is a significant issue with the media timeline (e.g. a
     * missing fragment).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>ALWAYS</code> when <a>HLSFragmentSelector</a> is set
     * to <code>SERVER_TIMESTAMP</code>, and <code>NEVER</code> when it is set
     * to <code>PRODUCER_TIMESTAMP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER, ON_DISCONTINUITY
     *
     * @param discontinuityMode <p>
     *            Specifies when flags marking discontinuities between fragments
     *            are added to the media playlists.
     *            </p>
     *            <p>
     *            Media players typically build a timeline of media content to
     *            play, based on the timestamps of each fragment. This means
     *            that if there is any overlap or gap between fragments (as is
     *            typical if <a>HLSFragmentSelector</a> is set to
     *            <code>SERVER_TIMESTAMP</code>), the media player timeline will
     *            also have small gaps between fragments in some places, and
     *            will overwrite frames in other places. Gaps in the media
     *            player timeline can cause playback to stall and overlaps can
     *            cause playback to be jittery. When there are discontinuity
     *            flags between fragments, the media player is expected to reset
     *            the timeline, resulting in the next fragment being played
     *            immediately after the previous fragment.
     *            </p>
     *            <p>
     *            The following modes are supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALWAYS</code>: a discontinuity marker is placed between
     *            every fragment in the HLS media playlist. It is recommended to
     *            use a value of <code>ALWAYS</code> if the fragment timestamps
     *            are not accurate.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NEVER</code>: no discontinuity markers are placed
     *            anywhere. It is recommended to use a value of
     *            <code>NEVER</code> to ensure the media player timeline most
     *            accurately maps to the producer timestamps.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ON_DISCONTINUITY</code>: a discontinuity marker is
     *            placed between fragments that have a gap or overlap of more
     *            than 50 milliseconds. For most playback scenarios, it is
     *            recommended to use a value of <code>ON_DISCONTINUITY</code> so
     *            that the media player timeline is only reset when there is a
     *            significant issue with the media timeline (e.g. a missing
     *            fragment).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The default is <code>ALWAYS</code> when
     *            <a>HLSFragmentSelector</a> is set to
     *            <code>SERVER_TIMESTAMP</code>, and <code>NEVER</code> when it
     *            is set to <code>PRODUCER_TIMESTAMP</code>.
     *            </p>
     * @see HLSDiscontinuityMode
     */
    public void setDiscontinuityMode(String discontinuityMode) {
        this.discontinuityMode = discontinuityMode;
    }

    /**
     * <p>
     * Specifies when flags marking discontinuities between fragments are added
     * to the media playlists.
     * </p>
     * <p>
     * Media players typically build a timeline of media content to play, based
     * on the timestamps of each fragment. This means that if there is any
     * overlap or gap between fragments (as is typical if
     * <a>HLSFragmentSelector</a> is set to <code>SERVER_TIMESTAMP</code>), the
     * media player timeline will also have small gaps between fragments in some
     * places, and will overwrite frames in other places. Gaps in the media
     * player timeline can cause playback to stall and overlaps can cause
     * playback to be jittery. When there are discontinuity flags between
     * fragments, the media player is expected to reset the timeline, resulting
     * in the next fragment being played immediately after the previous
     * fragment.
     * </p>
     * <p>
     * The following modes are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code>: a discontinuity marker is placed between every
     * fragment in the HLS media playlist. It is recommended to use a value of
     * <code>ALWAYS</code> if the fragment timestamps are not accurate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEVER</code>: no discontinuity markers are placed anywhere. It is
     * recommended to use a value of <code>NEVER</code> to ensure the media
     * player timeline most accurately maps to the producer timestamps.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON_DISCONTINUITY</code>: a discontinuity marker is placed between
     * fragments that have a gap or overlap of more than 50 milliseconds. For
     * most playback scenarios, it is recommended to use a value of
     * <code>ON_DISCONTINUITY</code> so that the media player timeline is only
     * reset when there is a significant issue with the media timeline (e.g. a
     * missing fragment).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>ALWAYS</code> when <a>HLSFragmentSelector</a> is set
     * to <code>SERVER_TIMESTAMP</code>, and <code>NEVER</code> when it is set
     * to <code>PRODUCER_TIMESTAMP</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER, ON_DISCONTINUITY
     *
     * @param discontinuityMode <p>
     *            Specifies when flags marking discontinuities between fragments
     *            are added to the media playlists.
     *            </p>
     *            <p>
     *            Media players typically build a timeline of media content to
     *            play, based on the timestamps of each fragment. This means
     *            that if there is any overlap or gap between fragments (as is
     *            typical if <a>HLSFragmentSelector</a> is set to
     *            <code>SERVER_TIMESTAMP</code>), the media player timeline will
     *            also have small gaps between fragments in some places, and
     *            will overwrite frames in other places. Gaps in the media
     *            player timeline can cause playback to stall and overlaps can
     *            cause playback to be jittery. When there are discontinuity
     *            flags between fragments, the media player is expected to reset
     *            the timeline, resulting in the next fragment being played
     *            immediately after the previous fragment.
     *            </p>
     *            <p>
     *            The following modes are supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALWAYS</code>: a discontinuity marker is placed between
     *            every fragment in the HLS media playlist. It is recommended to
     *            use a value of <code>ALWAYS</code> if the fragment timestamps
     *            are not accurate.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NEVER</code>: no discontinuity markers are placed
     *            anywhere. It is recommended to use a value of
     *            <code>NEVER</code> to ensure the media player timeline most
     *            accurately maps to the producer timestamps.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ON_DISCONTINUITY</code>: a discontinuity marker is
     *            placed between fragments that have a gap or overlap of more
     *            than 50 milliseconds. For most playback scenarios, it is
     *            recommended to use a value of <code>ON_DISCONTINUITY</code> so
     *            that the media player timeline is only reset when there is a
     *            significant issue with the media timeline (e.g. a missing
     *            fragment).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The default is <code>ALWAYS</code> when
     *            <a>HLSFragmentSelector</a> is set to
     *            <code>SERVER_TIMESTAMP</code>, and <code>NEVER</code> when it
     *            is set to <code>PRODUCER_TIMESTAMP</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HLSDiscontinuityMode
     */
    public GetHLSStreamingSessionURLRequest withDiscontinuityMode(String discontinuityMode) {
        this.discontinuityMode = discontinuityMode;
        return this;
    }

    /**
     * <p>
     * Specifies when flags marking discontinuities between fragments are added
     * to the media playlists.
     * </p>
     * <p>
     * Media players typically build a timeline of media content to play, based
     * on the timestamps of each fragment. This means that if there is any
     * overlap or gap between fragments (as is typical if
     * <a>HLSFragmentSelector</a> is set to <code>SERVER_TIMESTAMP</code>), the
     * media player timeline will also have small gaps between fragments in some
     * places, and will overwrite frames in other places. Gaps in the media
     * player timeline can cause playback to stall and overlaps can cause
     * playback to be jittery. When there are discontinuity flags between
     * fragments, the media player is expected to reset the timeline, resulting
     * in the next fragment being played immediately after the previous
     * fragment.
     * </p>
     * <p>
     * The following modes are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code>: a discontinuity marker is placed between every
     * fragment in the HLS media playlist. It is recommended to use a value of
     * <code>ALWAYS</code> if the fragment timestamps are not accurate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEVER</code>: no discontinuity markers are placed anywhere. It is
     * recommended to use a value of <code>NEVER</code> to ensure the media
     * player timeline most accurately maps to the producer timestamps.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON_DISCONTINUITY</code>: a discontinuity marker is placed between
     * fragments that have a gap or overlap of more than 50 milliseconds. For
     * most playback scenarios, it is recommended to use a value of
     * <code>ON_DISCONTINUITY</code> so that the media player timeline is only
     * reset when there is a significant issue with the media timeline (e.g. a
     * missing fragment).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>ALWAYS</code> when <a>HLSFragmentSelector</a> is set
     * to <code>SERVER_TIMESTAMP</code>, and <code>NEVER</code> when it is set
     * to <code>PRODUCER_TIMESTAMP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER, ON_DISCONTINUITY
     *
     * @param discontinuityMode <p>
     *            Specifies when flags marking discontinuities between fragments
     *            are added to the media playlists.
     *            </p>
     *            <p>
     *            Media players typically build a timeline of media content to
     *            play, based on the timestamps of each fragment. This means
     *            that if there is any overlap or gap between fragments (as is
     *            typical if <a>HLSFragmentSelector</a> is set to
     *            <code>SERVER_TIMESTAMP</code>), the media player timeline will
     *            also have small gaps between fragments in some places, and
     *            will overwrite frames in other places. Gaps in the media
     *            player timeline can cause playback to stall and overlaps can
     *            cause playback to be jittery. When there are discontinuity
     *            flags between fragments, the media player is expected to reset
     *            the timeline, resulting in the next fragment being played
     *            immediately after the previous fragment.
     *            </p>
     *            <p>
     *            The following modes are supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALWAYS</code>: a discontinuity marker is placed between
     *            every fragment in the HLS media playlist. It is recommended to
     *            use a value of <code>ALWAYS</code> if the fragment timestamps
     *            are not accurate.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NEVER</code>: no discontinuity markers are placed
     *            anywhere. It is recommended to use a value of
     *            <code>NEVER</code> to ensure the media player timeline most
     *            accurately maps to the producer timestamps.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ON_DISCONTINUITY</code>: a discontinuity marker is
     *            placed between fragments that have a gap or overlap of more
     *            than 50 milliseconds. For most playback scenarios, it is
     *            recommended to use a value of <code>ON_DISCONTINUITY</code> so
     *            that the media player timeline is only reset when there is a
     *            significant issue with the media timeline (e.g. a missing
     *            fragment).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The default is <code>ALWAYS</code> when
     *            <a>HLSFragmentSelector</a> is set to
     *            <code>SERVER_TIMESTAMP</code>, and <code>NEVER</code> when it
     *            is set to <code>PRODUCER_TIMESTAMP</code>.
     *            </p>
     * @see HLSDiscontinuityMode
     */
    public void setDiscontinuityMode(HLSDiscontinuityMode discontinuityMode) {
        this.discontinuityMode = discontinuityMode.toString();
    }

    /**
     * <p>
     * Specifies when flags marking discontinuities between fragments are added
     * to the media playlists.
     * </p>
     * <p>
     * Media players typically build a timeline of media content to play, based
     * on the timestamps of each fragment. This means that if there is any
     * overlap or gap between fragments (as is typical if
     * <a>HLSFragmentSelector</a> is set to <code>SERVER_TIMESTAMP</code>), the
     * media player timeline will also have small gaps between fragments in some
     * places, and will overwrite frames in other places. Gaps in the media
     * player timeline can cause playback to stall and overlaps can cause
     * playback to be jittery. When there are discontinuity flags between
     * fragments, the media player is expected to reset the timeline, resulting
     * in the next fragment being played immediately after the previous
     * fragment.
     * </p>
     * <p>
     * The following modes are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALWAYS</code>: a discontinuity marker is placed between every
     * fragment in the HLS media playlist. It is recommended to use a value of
     * <code>ALWAYS</code> if the fragment timestamps are not accurate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEVER</code>: no discontinuity markers are placed anywhere. It is
     * recommended to use a value of <code>NEVER</code> to ensure the media
     * player timeline most accurately maps to the producer timestamps.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON_DISCONTINUITY</code>: a discontinuity marker is placed between
     * fragments that have a gap or overlap of more than 50 milliseconds. For
     * most playback scenarios, it is recommended to use a value of
     * <code>ON_DISCONTINUITY</code> so that the media player timeline is only
     * reset when there is a significant issue with the media timeline (e.g. a
     * missing fragment).
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>ALWAYS</code> when <a>HLSFragmentSelector</a> is set
     * to <code>SERVER_TIMESTAMP</code>, and <code>NEVER</code> when it is set
     * to <code>PRODUCER_TIMESTAMP</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER, ON_DISCONTINUITY
     *
     * @param discontinuityMode <p>
     *            Specifies when flags marking discontinuities between fragments
     *            are added to the media playlists.
     *            </p>
     *            <p>
     *            Media players typically build a timeline of media content to
     *            play, based on the timestamps of each fragment. This means
     *            that if there is any overlap or gap between fragments (as is
     *            typical if <a>HLSFragmentSelector</a> is set to
     *            <code>SERVER_TIMESTAMP</code>), the media player timeline will
     *            also have small gaps between fragments in some places, and
     *            will overwrite frames in other places. Gaps in the media
     *            player timeline can cause playback to stall and overlaps can
     *            cause playback to be jittery. When there are discontinuity
     *            flags between fragments, the media player is expected to reset
     *            the timeline, resulting in the next fragment being played
     *            immediately after the previous fragment.
     *            </p>
     *            <p>
     *            The following modes are supported:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALWAYS</code>: a discontinuity marker is placed between
     *            every fragment in the HLS media playlist. It is recommended to
     *            use a value of <code>ALWAYS</code> if the fragment timestamps
     *            are not accurate.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NEVER</code>: no discontinuity markers are placed
     *            anywhere. It is recommended to use a value of
     *            <code>NEVER</code> to ensure the media player timeline most
     *            accurately maps to the producer timestamps.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ON_DISCONTINUITY</code>: a discontinuity marker is
     *            placed between fragments that have a gap or overlap of more
     *            than 50 milliseconds. For most playback scenarios, it is
     *            recommended to use a value of <code>ON_DISCONTINUITY</code> so
     *            that the media player timeline is only reset when there is a
     *            significant issue with the media timeline (e.g. a missing
     *            fragment).
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            The default is <code>ALWAYS</code> when
     *            <a>HLSFragmentSelector</a> is set to
     *            <code>SERVER_TIMESTAMP</code>, and <code>NEVER</code> when it
     *            is set to <code>PRODUCER_TIMESTAMP</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HLSDiscontinuityMode
     */
    public GetHLSStreamingSessionURLRequest withDiscontinuityMode(
            HLSDiscontinuityMode discontinuityMode) {
        this.discontinuityMode = discontinuityMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies when the fragment start timestamps should be included in the
     * HLS media playlist. Typically, media players report the playhead position
     * as a time relative to the start of the first fragment in the playback
     * session. However, when the start timestamps are included in the HLS media
     * playlist, some media players might report the current playhead as an
     * absolute time based on the fragment timestamps. This can be useful for
     * creating a playback experience that shows viewers the wall-clock time of
     * the media.
     * </p>
     * <p>
     * The default is <code>NEVER</code>. When <a>HLSFragmentSelector</a> is
     * <code>SERVER_TIMESTAMP</code>, the timestamps will be the server start
     * timestamps. Similarly, when <a>HLSFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer
     * start timestamps.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @return <p>
     *         Specifies when the fragment start timestamps should be included
     *         in the HLS media playlist. Typically, media players report the
     *         playhead position as a time relative to the start of the first
     *         fragment in the playback session. However, when the start
     *         timestamps are included in the HLS media playlist, some media
     *         players might report the current playhead as an absolute time
     *         based on the fragment timestamps. This can be useful for creating
     *         a playback experience that shows viewers the wall-clock time of
     *         the media.
     *         </p>
     *         <p>
     *         The default is <code>NEVER</code>. When
     *         <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, the
     *         timestamps will be the server start timestamps. Similarly, when
     *         <a>HLSFragmentSelector</a> is <code>PRODUCER_TIMESTAMP</code>,
     *         the timestamps will be the producer start timestamps.
     *         </p>
     * @see HLSDisplayFragmentTimestamp
     */
    public String getDisplayFragmentTimestamp() {
        return displayFragmentTimestamp;
    }

    /**
     * <p>
     * Specifies when the fragment start timestamps should be included in the
     * HLS media playlist. Typically, media players report the playhead position
     * as a time relative to the start of the first fragment in the playback
     * session. However, when the start timestamps are included in the HLS media
     * playlist, some media players might report the current playhead as an
     * absolute time based on the fragment timestamps. This can be useful for
     * creating a playback experience that shows viewers the wall-clock time of
     * the media.
     * </p>
     * <p>
     * The default is <code>NEVER</code>. When <a>HLSFragmentSelector</a> is
     * <code>SERVER_TIMESTAMP</code>, the timestamps will be the server start
     * timestamps. Similarly, when <a>HLSFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer
     * start timestamps.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @param displayFragmentTimestamp <p>
     *            Specifies when the fragment start timestamps should be
     *            included in the HLS media playlist. Typically, media players
     *            report the playhead position as a time relative to the start
     *            of the first fragment in the playback session. However, when
     *            the start timestamps are included in the HLS media playlist,
     *            some media players might report the current playhead as an
     *            absolute time based on the fragment timestamps. This can be
     *            useful for creating a playback experience that shows viewers
     *            the wall-clock time of the media.
     *            </p>
     *            <p>
     *            The default is <code>NEVER</code>. When
     *            <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>,
     *            the timestamps will be the server start timestamps. Similarly,
     *            when <a>HLSFragmentSelector</a> is
     *            <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the
     *            producer start timestamps.
     *            </p>
     * @see HLSDisplayFragmentTimestamp
     */
    public void setDisplayFragmentTimestamp(String displayFragmentTimestamp) {
        this.displayFragmentTimestamp = displayFragmentTimestamp;
    }

    /**
     * <p>
     * Specifies when the fragment start timestamps should be included in the
     * HLS media playlist. Typically, media players report the playhead position
     * as a time relative to the start of the first fragment in the playback
     * session. However, when the start timestamps are included in the HLS media
     * playlist, some media players might report the current playhead as an
     * absolute time based on the fragment timestamps. This can be useful for
     * creating a playback experience that shows viewers the wall-clock time of
     * the media.
     * </p>
     * <p>
     * The default is <code>NEVER</code>. When <a>HLSFragmentSelector</a> is
     * <code>SERVER_TIMESTAMP</code>, the timestamps will be the server start
     * timestamps. Similarly, when <a>HLSFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer
     * start timestamps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @param displayFragmentTimestamp <p>
     *            Specifies when the fragment start timestamps should be
     *            included in the HLS media playlist. Typically, media players
     *            report the playhead position as a time relative to the start
     *            of the first fragment in the playback session. However, when
     *            the start timestamps are included in the HLS media playlist,
     *            some media players might report the current playhead as an
     *            absolute time based on the fragment timestamps. This can be
     *            useful for creating a playback experience that shows viewers
     *            the wall-clock time of the media.
     *            </p>
     *            <p>
     *            The default is <code>NEVER</code>. When
     *            <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>,
     *            the timestamps will be the server start timestamps. Similarly,
     *            when <a>HLSFragmentSelector</a> is
     *            <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the
     *            producer start timestamps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HLSDisplayFragmentTimestamp
     */
    public GetHLSStreamingSessionURLRequest withDisplayFragmentTimestamp(
            String displayFragmentTimestamp) {
        this.displayFragmentTimestamp = displayFragmentTimestamp;
        return this;
    }

    /**
     * <p>
     * Specifies when the fragment start timestamps should be included in the
     * HLS media playlist. Typically, media players report the playhead position
     * as a time relative to the start of the first fragment in the playback
     * session. However, when the start timestamps are included in the HLS media
     * playlist, some media players might report the current playhead as an
     * absolute time based on the fragment timestamps. This can be useful for
     * creating a playback experience that shows viewers the wall-clock time of
     * the media.
     * </p>
     * <p>
     * The default is <code>NEVER</code>. When <a>HLSFragmentSelector</a> is
     * <code>SERVER_TIMESTAMP</code>, the timestamps will be the server start
     * timestamps. Similarly, when <a>HLSFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer
     * start timestamps.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @param displayFragmentTimestamp <p>
     *            Specifies when the fragment start timestamps should be
     *            included in the HLS media playlist. Typically, media players
     *            report the playhead position as a time relative to the start
     *            of the first fragment in the playback session. However, when
     *            the start timestamps are included in the HLS media playlist,
     *            some media players might report the current playhead as an
     *            absolute time based on the fragment timestamps. This can be
     *            useful for creating a playback experience that shows viewers
     *            the wall-clock time of the media.
     *            </p>
     *            <p>
     *            The default is <code>NEVER</code>. When
     *            <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>,
     *            the timestamps will be the server start timestamps. Similarly,
     *            when <a>HLSFragmentSelector</a> is
     *            <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the
     *            producer start timestamps.
     *            </p>
     * @see HLSDisplayFragmentTimestamp
     */
    public void setDisplayFragmentTimestamp(HLSDisplayFragmentTimestamp displayFragmentTimestamp) {
        this.displayFragmentTimestamp = displayFragmentTimestamp.toString();
    }

    /**
     * <p>
     * Specifies when the fragment start timestamps should be included in the
     * HLS media playlist. Typically, media players report the playhead position
     * as a time relative to the start of the first fragment in the playback
     * session. However, when the start timestamps are included in the HLS media
     * playlist, some media players might report the current playhead as an
     * absolute time based on the fragment timestamps. This can be useful for
     * creating a playback experience that shows viewers the wall-clock time of
     * the media.
     * </p>
     * <p>
     * The default is <code>NEVER</code>. When <a>HLSFragmentSelector</a> is
     * <code>SERVER_TIMESTAMP</code>, the timestamps will be the server start
     * timestamps. Similarly, when <a>HLSFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer
     * start timestamps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @param displayFragmentTimestamp <p>
     *            Specifies when the fragment start timestamps should be
     *            included in the HLS media playlist. Typically, media players
     *            report the playhead position as a time relative to the start
     *            of the first fragment in the playback session. However, when
     *            the start timestamps are included in the HLS media playlist,
     *            some media players might report the current playhead as an
     *            absolute time based on the fragment timestamps. This can be
     *            useful for creating a playback experience that shows viewers
     *            the wall-clock time of the media.
     *            </p>
     *            <p>
     *            The default is <code>NEVER</code>. When
     *            <a>HLSFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>,
     *            the timestamps will be the server start timestamps. Similarly,
     *            when <a>HLSFragmentSelector</a> is
     *            <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the
     *            producer start timestamps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HLSDisplayFragmentTimestamp
     */
    public GetHLSStreamingSessionURLRequest withDisplayFragmentTimestamp(
            HLSDisplayFragmentTimestamp displayFragmentTimestamp) {
        this.displayFragmentTimestamp = displayFragmentTimestamp.toString();
        return this;
    }

    /**
     * <p>
     * The time in seconds until the requested session expires. This value can
     * be between 300 (5 minutes) and 43200 (12 hours).
     * </p>
     * <p>
     * When a session expires, no new calls to <code>GetHLSMasterPlaylist</code>, <code>GetHLSMediaPlaylist</code>, <code>GetMP4InitFragment</code>,
     * <code>GetMP4MediaFragment</code>, or <code>GetTSFragment</code> can be
     * made for that session.
     * </p>
     * <p>
     * The default is 300 (5 minutes).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>300 - 43200<br/>
     *
     * @return <p>
     *         The time in seconds until the requested session expires. This
     *         value can be between 300 (5 minutes) and 43200 (12 hours).
     *         </p>
     *         <p>
     *         When a session expires, no new calls to
     *         <code>GetHLSMasterPlaylist</code>,
     *         <code>GetHLSMediaPlaylist</code>, <code>GetMP4InitFragment</code>, <code>GetMP4MediaFragment</code>, or <code>GetTSFragment</code>
     *         can be made for that session.
     *         </p>
     *         <p>
     *         The default is 300 (5 minutes).
     *         </p>
     */
    public Integer getExpires() {
        return expires;
    }

    /**
     * <p>
     * The time in seconds until the requested session expires. This value can
     * be between 300 (5 minutes) and 43200 (12 hours).
     * </p>
     * <p>
     * When a session expires, no new calls to <code>GetHLSMasterPlaylist</code>, <code>GetHLSMediaPlaylist</code>, <code>GetMP4InitFragment</code>,
     * <code>GetMP4MediaFragment</code>, or <code>GetTSFragment</code> can be
     * made for that session.
     * </p>
     * <p>
     * The default is 300 (5 minutes).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>300 - 43200<br/>
     *
     * @param expires <p>
     *            The time in seconds until the requested session expires. This
     *            value can be between 300 (5 minutes) and 43200 (12 hours).
     *            </p>
     *            <p>
     *            When a session expires, no new calls to
     *            <code>GetHLSMasterPlaylist</code>,
     *            <code>GetHLSMediaPlaylist</code>,
     *            <code>GetMP4InitFragment</code>,
     *            <code>GetMP4MediaFragment</code>, or
     *            <code>GetTSFragment</code> can be made for that session.
     *            </p>
     *            <p>
     *            The default is 300 (5 minutes).
     *            </p>
     */
    public void setExpires(Integer expires) {
        this.expires = expires;
    }

    /**
     * <p>
     * The time in seconds until the requested session expires. This value can
     * be between 300 (5 minutes) and 43200 (12 hours).
     * </p>
     * <p>
     * When a session expires, no new calls to <code>GetHLSMasterPlaylist</code>, <code>GetHLSMediaPlaylist</code>, <code>GetMP4InitFragment</code>,
     * <code>GetMP4MediaFragment</code>, or <code>GetTSFragment</code> can be
     * made for that session.
     * </p>
     * <p>
     * The default is 300 (5 minutes).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>300 - 43200<br/>
     *
     * @param expires <p>
     *            The time in seconds until the requested session expires. This
     *            value can be between 300 (5 minutes) and 43200 (12 hours).
     *            </p>
     *            <p>
     *            When a session expires, no new calls to
     *            <code>GetHLSMasterPlaylist</code>,
     *            <code>GetHLSMediaPlaylist</code>,
     *            <code>GetMP4InitFragment</code>,
     *            <code>GetMP4MediaFragment</code>, or
     *            <code>GetTSFragment</code> can be made for that session.
     *            </p>
     *            <p>
     *            The default is 300 (5 minutes).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHLSStreamingSessionURLRequest withExpires(Integer expires) {
        this.expires = expires;
        return this;
    }

    /**
     * <p>
     * The maximum number of fragments that are returned in the HLS media
     * playlists.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent
     * fragments are returned up to this value. When the
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments
     * are returned, up to this maximum number.
     * </p>
     * <p>
     * When there are a higher number of fragments available in a live HLS media
     * playlist, video players often buffer content before starting playback.
     * Increasing the buffer size increases the playback latency, but it
     * decreases the likelihood that rebuffering will occur during playback. We
     * recommend that a live HLS media playlist have a minimum of 3 fragments
     * and a maximum of 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is
     * <code>LIVE</code> or <code>LIVE_REPLAY</code>, and 1,000 if
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 5,000 fragments corresponds to more than 80 minutes
     * of video on streams with 1-second fragments, and more than 13 hours of
     * video on streams with 10-second fragments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5000<br/>
     *
     * @return <p>
     *         The maximum number of fragments that are returned in the HLS
     *         media playlists.
     *         </p>
     *         <p>
     *         When the <code>PlaybackMode</code> is <code>LIVE</code>, the most
     *         recent fragments are returned up to this value. When the
     *         <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest
     *         fragments are returned, up to this maximum number.
     *         </p>
     *         <p>
     *         When there are a higher number of fragments available in a live
     *         HLS media playlist, video players often buffer content before
     *         starting playback. Increasing the buffer size increases the
     *         playback latency, but it decreases the likelihood that
     *         rebuffering will occur during playback. We recommend that a live
     *         HLS media playlist have a minimum of 3 fragments and a maximum of
     *         10 fragments.
     *         </p>
     *         <p>
     *         The default is 5 fragments if <code>PlaybackMode</code> is
     *         <code>LIVE</code> or <code>LIVE_REPLAY</code>, and 1,000 if
     *         <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     *         </p>
     *         <p>
     *         The maximum value of 5,000 fragments corresponds to more than 80
     *         minutes of video on streams with 1-second fragments, and more
     *         than 13 hours of video on streams with 10-second fragments.
     *         </p>
     */
    public Long getMaxMediaPlaylistFragmentResults() {
        return maxMediaPlaylistFragmentResults;
    }

    /**
     * <p>
     * The maximum number of fragments that are returned in the HLS media
     * playlists.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent
     * fragments are returned up to this value. When the
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments
     * are returned, up to this maximum number.
     * </p>
     * <p>
     * When there are a higher number of fragments available in a live HLS media
     * playlist, video players often buffer content before starting playback.
     * Increasing the buffer size increases the playback latency, but it
     * decreases the likelihood that rebuffering will occur during playback. We
     * recommend that a live HLS media playlist have a minimum of 3 fragments
     * and a maximum of 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is
     * <code>LIVE</code> or <code>LIVE_REPLAY</code>, and 1,000 if
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 5,000 fragments corresponds to more than 80 minutes
     * of video on streams with 1-second fragments, and more than 13 hours of
     * video on streams with 10-second fragments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5000<br/>
     *
     * @param maxMediaPlaylistFragmentResults <p>
     *            The maximum number of fragments that are returned in the HLS
     *            media playlists.
     *            </p>
     *            <p>
     *            When the <code>PlaybackMode</code> is <code>LIVE</code>, the
     *            most recent fragments are returned up to this value. When the
     *            <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the
     *            oldest fragments are returned, up to this maximum number.
     *            </p>
     *            <p>
     *            When there are a higher number of fragments available in a
     *            live HLS media playlist, video players often buffer content
     *            before starting playback. Increasing the buffer size increases
     *            the playback latency, but it decreases the likelihood that
     *            rebuffering will occur during playback. We recommend that a
     *            live HLS media playlist have a minimum of 3 fragments and a
     *            maximum of 10 fragments.
     *            </p>
     *            <p>
     *            The default is 5 fragments if <code>PlaybackMode</code> is
     *            <code>LIVE</code> or <code>LIVE_REPLAY</code>, and 1,000 if
     *            <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     *            </p>
     *            <p>
     *            The maximum value of 5,000 fragments corresponds to more than
     *            80 minutes of video on streams with 1-second fragments, and
     *            more than 13 hours of video on streams with 10-second
     *            fragments.
     *            </p>
     */
    public void setMaxMediaPlaylistFragmentResults(Long maxMediaPlaylistFragmentResults) {
        this.maxMediaPlaylistFragmentResults = maxMediaPlaylistFragmentResults;
    }

    /**
     * <p>
     * The maximum number of fragments that are returned in the HLS media
     * playlists.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent
     * fragments are returned up to this value. When the
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments
     * are returned, up to this maximum number.
     * </p>
     * <p>
     * When there are a higher number of fragments available in a live HLS media
     * playlist, video players often buffer content before starting playback.
     * Increasing the buffer size increases the playback latency, but it
     * decreases the likelihood that rebuffering will occur during playback. We
     * recommend that a live HLS media playlist have a minimum of 3 fragments
     * and a maximum of 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is
     * <code>LIVE</code> or <code>LIVE_REPLAY</code>, and 1,000 if
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 5,000 fragments corresponds to more than 80 minutes
     * of video on streams with 1-second fragments, and more than 13 hours of
     * video on streams with 10-second fragments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5000<br/>
     *
     * @param maxMediaPlaylistFragmentResults <p>
     *            The maximum number of fragments that are returned in the HLS
     *            media playlists.
     *            </p>
     *            <p>
     *            When the <code>PlaybackMode</code> is <code>LIVE</code>, the
     *            most recent fragments are returned up to this value. When the
     *            <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the
     *            oldest fragments are returned, up to this maximum number.
     *            </p>
     *            <p>
     *            When there are a higher number of fragments available in a
     *            live HLS media playlist, video players often buffer content
     *            before starting playback. Increasing the buffer size increases
     *            the playback latency, but it decreases the likelihood that
     *            rebuffering will occur during playback. We recommend that a
     *            live HLS media playlist have a minimum of 3 fragments and a
     *            maximum of 10 fragments.
     *            </p>
     *            <p>
     *            The default is 5 fragments if <code>PlaybackMode</code> is
     *            <code>LIVE</code> or <code>LIVE_REPLAY</code>, and 1,000 if
     *            <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     *            </p>
     *            <p>
     *            The maximum value of 5,000 fragments corresponds to more than
     *            80 minutes of video on streams with 1-second fragments, and
     *            more than 13 hours of video on streams with 10-second
     *            fragments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHLSStreamingSessionURLRequest withMaxMediaPlaylistFragmentResults(
            Long maxMediaPlaylistFragmentResults) {
        this.maxMediaPlaylistFragmentResults = maxMediaPlaylistFragmentResults;
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
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getStreamARN() != null)
            sb.append("StreamARN: " + getStreamARN() + ",");
        if (getPlaybackMode() != null)
            sb.append("PlaybackMode: " + getPlaybackMode() + ",");
        if (getHLSFragmentSelector() != null)
            sb.append("HLSFragmentSelector: " + getHLSFragmentSelector() + ",");
        if (getContainerFormat() != null)
            sb.append("ContainerFormat: " + getContainerFormat() + ",");
        if (getDiscontinuityMode() != null)
            sb.append("DiscontinuityMode: " + getDiscontinuityMode() + ",");
        if (getDisplayFragmentTimestamp() != null)
            sb.append("DisplayFragmentTimestamp: " + getDisplayFragmentTimestamp() + ",");
        if (getExpires() != null)
            sb.append("Expires: " + getExpires() + ",");
        if (getMaxMediaPlaylistFragmentResults() != null)
            sb.append("MaxMediaPlaylistFragmentResults: " + getMaxMediaPlaylistFragmentResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode
                + ((getPlaybackMode() == null) ? 0 : getPlaybackMode().hashCode());
        hashCode = prime * hashCode
                + ((getHLSFragmentSelector() == null) ? 0 : getHLSFragmentSelector().hashCode());
        hashCode = prime * hashCode
                + ((getContainerFormat() == null) ? 0 : getContainerFormat().hashCode());
        hashCode = prime * hashCode
                + ((getDiscontinuityMode() == null) ? 0 : getDiscontinuityMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getDisplayFragmentTimestamp() == null) ? 0 : getDisplayFragmentTimestamp()
                        .hashCode());
        hashCode = prime * hashCode + ((getExpires() == null) ? 0 : getExpires().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxMediaPlaylistFragmentResults() == null) ? 0
                        : getMaxMediaPlaylistFragmentResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHLSStreamingSessionURLRequest == false)
            return false;
        GetHLSStreamingSessionURLRequest other = (GetHLSStreamingSessionURLRequest) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null
                && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getPlaybackMode() == null ^ this.getPlaybackMode() == null)
            return false;
        if (other.getPlaybackMode() != null
                && other.getPlaybackMode().equals(this.getPlaybackMode()) == false)
            return false;
        if (other.getHLSFragmentSelector() == null ^ this.getHLSFragmentSelector() == null)
            return false;
        if (other.getHLSFragmentSelector() != null
                && other.getHLSFragmentSelector().equals(this.getHLSFragmentSelector()) == false)
            return false;
        if (other.getContainerFormat() == null ^ this.getContainerFormat() == null)
            return false;
        if (other.getContainerFormat() != null
                && other.getContainerFormat().equals(this.getContainerFormat()) == false)
            return false;
        if (other.getDiscontinuityMode() == null ^ this.getDiscontinuityMode() == null)
            return false;
        if (other.getDiscontinuityMode() != null
                && other.getDiscontinuityMode().equals(this.getDiscontinuityMode()) == false)
            return false;
        if (other.getDisplayFragmentTimestamp() == null
                ^ this.getDisplayFragmentTimestamp() == null)
            return false;
        if (other.getDisplayFragmentTimestamp() != null
                && other.getDisplayFragmentTimestamp().equals(this.getDisplayFragmentTimestamp()) == false)
            return false;
        if (other.getExpires() == null ^ this.getExpires() == null)
            return false;
        if (other.getExpires() != null && other.getExpires().equals(this.getExpires()) == false)
            return false;
        if (other.getMaxMediaPlaylistFragmentResults() == null
                ^ this.getMaxMediaPlaylistFragmentResults() == null)
            return false;
        if (other.getMaxMediaPlaylistFragmentResults() != null
                && other.getMaxMediaPlaylistFragmentResults().equals(
                        this.getMaxMediaPlaylistFragmentResults()) == false)
            return false;
        return true;
    }
}
