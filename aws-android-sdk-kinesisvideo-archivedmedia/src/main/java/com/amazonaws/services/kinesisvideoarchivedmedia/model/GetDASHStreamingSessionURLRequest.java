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
 * Retrieves an MPEG Dynamic Adaptive Streaming over HTTP (DASH) URL for the
 * stream. You can then open the URL in a media player to view the stream
 * contents.
 * </p>
 * <p>
 * Both the <code>StreamName</code> and the <code>StreamARN</code> parameters
 * are optional, but you must specify either the <code>StreamName</code> or the
 * <code>StreamARN</code> when invoking this API operation.
 * </p>
 * <p>
 * An Amazon Kinesis video stream has the following requirements for providing
 * data through MPEG-DASH:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The media must contain h.264 or h.265 encoded video and, optionally, AAC or
 * G.711 encoded audio. Specifically, the codec ID of track 1 should be
 * <code>V_MPEG/ISO/AVC</code> (for h.264) or V_MPEGH/ISO/HEVC (for H.265).
 * Optionally, the codec ID of track 2 should be <code>A_AAC</code> (for AAC) or
 * A_MS/ACM (for G.711).
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
 * Advanced Video Coding (AVC) for H.264 format and HEVC for H.265 format. For
 * more information, see <a
 * href="https://www.iso.org/standard/55980.html">MPEG-4 specification ISO/IEC
 * 14496-15</a>. For information about adapting stream data to a given format,
 * see <a href=
 * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/producer-reference-nal.html"
 * >NAL Adaptation Flags</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The audio track (if present) of each fragment must contain codec private data
 * in the AAC format (<a href="https://www.iso.org/standard/43345.html">AAC
 * specification ISO/IEC 13818-7</a>) or the <a
 * href="http://www-mmsp.ece.mcgill.ca/Documents/AudioFormats/WAVE/WAVE.html">MS
 * Wave format</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The following procedure shows how to use MPEG-DASH with Kinesis Video
 * Streams:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Get an endpoint using <a href=
 * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_GetDataEndpoint.html"
 * >GetDataEndpoint</a>, specifying <code>GET_DASH_STREAMING_SESSION_URL</code>
 * for the <code>APIName</code> parameter.
 * </p>
 * </li>
 * <li>
 * <p>
 * Retrieve the MPEG-DASH URL using <code>GetDASHStreamingSessionURL</code>.
 * Kinesis Video Streams creates an MPEG-DASH streaming session to be used for
 * accessing content in a stream using the MPEG-DASH protocol.
 * <code>GetDASHStreamingSessionURL</code> returns an authenticated URL (that
 * includes an encrypted session token) for the session's MPEG-DASH
 * <i>manifest</i> (the root resource needed for streaming with MPEG-DASH).
 * </p>
 * <note>
 * <p>
 * Don't share or store this token where an unauthorized entity can access it.
 * The token provides access to the content of the stream. Safeguard the token
 * with the same measures that you use with your AWS credentials.
 * </p>
 * </note>
 * <p>
 * The media that is made available through the manifest consists only of the
 * requested stream, time range, and format. No other media data (such as frames
 * outside the requested window or alternate bitrates) is made available.
 * </p>
 * </li>
 * <li>
 * <p>
 * Provide the URL (containing the encrypted session token) for the MPEG-DASH
 * manifest to a media player that supports the MPEG-DASH protocol. Kinesis
 * Video Streams makes the initialization fragment and media fragments available
 * through the manifest URL. The initialization fragment contains the codec
 * private data for the stream, and other data needed to set up the video or
 * audio decoder and renderer. The media fragments contain encoded video frames
 * or encoded audio samples.
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
 * <b>GetDASHManifest:</b> Retrieves an MPEG DASH manifest, which contains the
 * metadata for the media that you want to playback.
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
 * </ul>
 * </li>
 * </ol>
 * <note>
 * <p>
 * For restrictions that apply to MPEG-DASH sessions, see <a
 * href="http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html"
 * >Kinesis Video Streams Limits</a>.
 * </p>
 * </note>
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
public class GetDASHStreamingSessionURLRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the stream for which to retrieve the MPEG-DASH manifest URL.
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
     * MPEG-DASH manifest URL.
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
     * <b> <code>LIVE</code> </b>: For sessions of this type, the MPEG-DASH
     * manifest is continually updated with the latest fragments as they become
     * available. We recommend that the media player retrieve a new manifest on
     * a one-second interval. When this type of session is played in a media
     * player, the user interface typically displays a "live" notification, with
     * no scrubber control for choosing the position in the playback window to
     * display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in
     * an MPEG-DASH manifest, even if there is a gap between fragments (that is,
     * if a fragment is missing). A gap like this might cause a media player to
     * halt or cause a jump in playback. In this mode, fragments are not added
     * to the MPEG-DASH manifest if they are older than the newest fragment in
     * the playlist. If the missing fragment becomes available after a
     * subsequent fragment is added to the manifest, the older fragment is not
     * added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the
     * MPEG-DASH manifest is updated similarly to how it is updated for
     * <code>LIVE</code> mode except that it starts by including fragments from
     * a given start time. Instead of fragments being added as they are
     * ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds
     * long, then a new fragment is added to the manifest every two seconds.
     * This mode is useful to be able to start playback from when an event is
     * detected and continue live streaming media that has not yet been ingested
     * as of the time of the session creation. This mode is also useful to
     * stream previously archived media without being limited by the 1,000
     * fragment limit in the <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the MPEG-DASH
     * manifest contains all the fragments for the session, up to the number
     * that is specified in <code>MaxManifestFragmentResults</code>. The
     * manifest must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is
     * <code>PRODUCER_TIMESTAMP</code>, and if there are multiple fragments with
     * the same start timestamp, the fragment that has the larger fragment
     * number (that is, the newer fragment) is included in the MPEG-DASH
     * manifest. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in
     * the MPEG-DASH manifest. This can lead to unexpected behavior in the media
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
     * Per the MPEG-DASH specification, the wall-clock time of fragments in the
     * manifest file can be derived using attributes in the manifest itself.
     * However, typically, MPEG-DASH compatible media players do not properly
     * handle gaps in the media timeline. Kinesis Video Streams adjusts the
     * media timeline in the manifest file to enable playback of media with
     * discontinuities. Therefore, the wall-clock time derived from the manifest
     * file may be inaccurate. If DisplayFragmentTimestamp is set to
     * <code>ALWAYS</code>, the accurate fragment timestamp is added to each S
     * element in the manifest file with the attribute name “kvs:ts”. A custom
     * MPEG-DASH media player is necessary to leverage this custom attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>. When <a>DASHFragmentSelector</a>
     * is <code>SERVER_TIMESTAMP</code>, the timestamps will be the server start
     * timestamps. Similarly, when <a>DASHFragmentSelector</a> is
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
     * Fragments are identified in the manifest file based on their sequence
     * number in the session. If DisplayFragmentNumber is set to
     * <code>ALWAYS</code>, the Kinesis Video Streams fragment number is added
     * to each S element in the manifest file with the attribute name “kvs:fn”.
     * These fragment numbers can be used for logging or for use with other APIs
     * (e.g. <code>GetMedia</code> and <code>GetMediaForFragmentList</code>). A
     * custom MPEG-DASH media player is necessary to leverage these this custom
     * attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     */
    private String displayFragmentNumber;

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
    private DASHFragmentSelector dASHFragmentSelector;

    /**
     * <p>
     * The time in seconds until the requested session expires. This value can
     * be between 300 (5 minutes) and 43200 (12 hours).
     * </p>
     * <p>
     * When a session expires, no new calls to <code>GetDashManifest</code>,
     * <code>GetMP4InitFragment</code>, or <code>GetMP4MediaFragment</code> can
     * be made for that session.
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
     * The maximum number of fragments that are returned in the MPEG-DASH
     * manifest.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent
     * fragments are returned up to this value. When the
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments
     * are returned, up to this maximum number.
     * </p>
     * <p>
     * When there are a higher number of fragments available in a live MPEG-DASH
     * manifest, video players often buffer content before starting playback.
     * Increasing the buffer size increases the playback latency, but it
     * decreases the likelihood that rebuffering will occur during playback. We
     * recommend that a live MPEG-DASH manifest have a minimum of 3 fragments
     * and a maximum of 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is
     * <code>LIVE</code> or <code>LIVE_REPLAY</code>, and 1,000 if
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 1,000 fragments corresponds to more than 16 minutes
     * of video on streams with 1-second fragments, and more than 2 1/2 hours of
     * video on streams with 10-second fragments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5000<br/>
     */
    private Long maxManifestFragmentResults;

    /**
     * <p>
     * The name of the stream for which to retrieve the MPEG-DASH manifest URL.
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
     *         The name of the stream for which to retrieve the MPEG-DASH
     *         manifest URL.
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
     * The name of the stream for which to retrieve the MPEG-DASH manifest URL.
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
     *            The name of the stream for which to retrieve the MPEG-DASH
     *            manifest URL.
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
     * The name of the stream for which to retrieve the MPEG-DASH manifest URL.
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
     *            The name of the stream for which to retrieve the MPEG-DASH
     *            manifest URL.
     *            </p>
     *            <p>
     *            You must specify either the <code>StreamName</code> or the
     *            <code>StreamARN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDASHStreamingSessionURLRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream for which to retrieve the
     * MPEG-DASH manifest URL.
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
     *         retrieve the MPEG-DASH manifest URL.
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
     * MPEG-DASH manifest URL.
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
     *            retrieve the MPEG-DASH manifest URL.
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
     * MPEG-DASH manifest URL.
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
     *            retrieve the MPEG-DASH manifest URL.
     *            </p>
     *            <p>
     *            You must specify either the <code>StreamName</code> or the
     *            <code>StreamARN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDASHStreamingSessionURLRequest withStreamARN(String streamARN) {
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
     * <b> <code>LIVE</code> </b>: For sessions of this type, the MPEG-DASH
     * manifest is continually updated with the latest fragments as they become
     * available. We recommend that the media player retrieve a new manifest on
     * a one-second interval. When this type of session is played in a media
     * player, the user interface typically displays a "live" notification, with
     * no scrubber control for choosing the position in the playback window to
     * display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in
     * an MPEG-DASH manifest, even if there is a gap between fragments (that is,
     * if a fragment is missing). A gap like this might cause a media player to
     * halt or cause a jump in playback. In this mode, fragments are not added
     * to the MPEG-DASH manifest if they are older than the newest fragment in
     * the playlist. If the missing fragment becomes available after a
     * subsequent fragment is added to the manifest, the older fragment is not
     * added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the
     * MPEG-DASH manifest is updated similarly to how it is updated for
     * <code>LIVE</code> mode except that it starts by including fragments from
     * a given start time. Instead of fragments being added as they are
     * ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds
     * long, then a new fragment is added to the manifest every two seconds.
     * This mode is useful to be able to start playback from when an event is
     * detected and continue live streaming media that has not yet been ingested
     * as of the time of the session creation. This mode is also useful to
     * stream previously archived media without being limited by the 1,000
     * fragment limit in the <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the MPEG-DASH
     * manifest contains all the fragments for the session, up to the number
     * that is specified in <code>MaxManifestFragmentResults</code>. The
     * manifest must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is
     * <code>PRODUCER_TIMESTAMP</code>, and if there are multiple fragments with
     * the same start timestamp, the fragment that has the larger fragment
     * number (that is, the newer fragment) is included in the MPEG-DASH
     * manifest. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in
     * the MPEG-DASH manifest. This can lead to unexpected behavior in the media
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
     *         <b> <code>LIVE</code> </b>: For sessions of this type, the
     *         MPEG-DASH manifest is continually updated with the latest
     *         fragments as they become available. We recommend that the media
     *         player retrieve a new manifest on a one-second interval. When
     *         this type of session is played in a media player, the user
     *         interface typically displays a "live" notification, with no
     *         scrubber control for choosing the position in the playback window
     *         to display.
     *         </p>
     *         <note>
     *         <p>
     *         In <code>LIVE</code> mode, the newest available fragments are
     *         included in an MPEG-DASH manifest, even if there is a gap between
     *         fragments (that is, if a fragment is missing). A gap like this
     *         might cause a media player to halt or cause a jump in playback.
     *         In this mode, fragments are not added to the MPEG-DASH manifest
     *         if they are older than the newest fragment in the playlist. If
     *         the missing fragment becomes available after a subsequent
     *         fragment is added to the manifest, the older fragment is not
     *         added, and the gap is not filled.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the
     *         MPEG-DASH manifest is updated similarly to how it is updated for
     *         <code>LIVE</code> mode except that it starts by including
     *         fragments from a given start time. Instead of fragments being
     *         added as they are ingested, fragments are added as the duration
     *         of the next fragment elapses. For example, if the fragments in
     *         the session are two seconds long, then a new fragment is added to
     *         the manifest every two seconds. This mode is useful to be able to
     *         start playback from when an event is detected and continue live
     *         streaming media that has not yet been ingested as of the time of
     *         the session creation. This mode is also useful to stream
     *         previously archived media without being limited by the 1,000
     *         fragment limit in the <code>ON_DEMAND</code> mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the
     *         MPEG-DASH manifest contains all the fragments for the session, up
     *         to the number that is specified in
     *         <code>MaxManifestFragmentResults</code>. The manifest must be
     *         retrieved only once for each session. When this type of session
     *         is played in a media player, the user interface typically
     *         displays a scrubber control for choosing the position in the
     *         playback window to display.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In all playback modes, if <code>FragmentSelectorType</code> is
     *         <code>PRODUCER_TIMESTAMP</code>, and if there are multiple
     *         fragments with the same start timestamp, the fragment that has
     *         the larger fragment number (that is, the newer fragment) is
     *         included in the MPEG-DASH manifest. The other fragments are not
     *         included. Fragments that have different timestamps but have
     *         overlapping durations are still included in the MPEG-DASH
     *         manifest. This can lead to unexpected behavior in the media
     *         player.
     *         </p>
     *         <p>
     *         The default is <code>LIVE</code>.
     *         </p>
     * @see DASHPlaybackMode
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
     * <b> <code>LIVE</code> </b>: For sessions of this type, the MPEG-DASH
     * manifest is continually updated with the latest fragments as they become
     * available. We recommend that the media player retrieve a new manifest on
     * a one-second interval. When this type of session is played in a media
     * player, the user interface typically displays a "live" notification, with
     * no scrubber control for choosing the position in the playback window to
     * display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in
     * an MPEG-DASH manifest, even if there is a gap between fragments (that is,
     * if a fragment is missing). A gap like this might cause a media player to
     * halt or cause a jump in playback. In this mode, fragments are not added
     * to the MPEG-DASH manifest if they are older than the newest fragment in
     * the playlist. If the missing fragment becomes available after a
     * subsequent fragment is added to the manifest, the older fragment is not
     * added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the
     * MPEG-DASH manifest is updated similarly to how it is updated for
     * <code>LIVE</code> mode except that it starts by including fragments from
     * a given start time. Instead of fragments being added as they are
     * ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds
     * long, then a new fragment is added to the manifest every two seconds.
     * This mode is useful to be able to start playback from when an event is
     * detected and continue live streaming media that has not yet been ingested
     * as of the time of the session creation. This mode is also useful to
     * stream previously archived media without being limited by the 1,000
     * fragment limit in the <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the MPEG-DASH
     * manifest contains all the fragments for the session, up to the number
     * that is specified in <code>MaxManifestFragmentResults</code>. The
     * manifest must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is
     * <code>PRODUCER_TIMESTAMP</code>, and if there are multiple fragments with
     * the same start timestamp, the fragment that has the larger fragment
     * number (that is, the newer fragment) is included in the MPEG-DASH
     * manifest. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in
     * the MPEG-DASH manifest. This can lead to unexpected behavior in the media
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
     *            <b> <code>LIVE</code> </b>: For sessions of this type, the
     *            MPEG-DASH manifest is continually updated with the latest
     *            fragments as they become available. We recommend that the
     *            media player retrieve a new manifest on a one-second interval.
     *            When this type of session is played in a media player, the
     *            user interface typically displays a "live" notification, with
     *            no scrubber control for choosing the position in the playback
     *            window to display.
     *            </p>
     *            <note>
     *            <p>
     *            In <code>LIVE</code> mode, the newest available fragments are
     *            included in an MPEG-DASH manifest, even if there is a gap
     *            between fragments (that is, if a fragment is missing). A gap
     *            like this might cause a media player to halt or cause a jump
     *            in playback. In this mode, fragments are not added to the
     *            MPEG-DASH manifest if they are older than the newest fragment
     *            in the playlist. If the missing fragment becomes available
     *            after a subsequent fragment is added to the manifest, the
     *            older fragment is not added, and the gap is not filled.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type,
     *            the MPEG-DASH manifest is updated similarly to how it is
     *            updated for <code>LIVE</code> mode except that it starts by
     *            including fragments from a given start time. Instead of
     *            fragments being added as they are ingested, fragments are
     *            added as the duration of the next fragment elapses. For
     *            example, if the fragments in the session are two seconds long,
     *            then a new fragment is added to the manifest every two
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
     *            the MPEG-DASH manifest contains all the fragments for the
     *            session, up to the number that is specified in
     *            <code>MaxManifestFragmentResults</code>. The manifest must be
     *            retrieved only once for each session. When this type of
     *            session is played in a media player, the user interface
     *            typically displays a scrubber control for choosing the
     *            position in the playback window to display.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            In all playback modes, if <code>FragmentSelectorType</code> is
     *            <code>PRODUCER_TIMESTAMP</code>, and if there are multiple
     *            fragments with the same start timestamp, the fragment that has
     *            the larger fragment number (that is, the newer fragment) is
     *            included in the MPEG-DASH manifest. The other fragments are
     *            not included. Fragments that have different timestamps but
     *            have overlapping durations are still included in the MPEG-DASH
     *            manifest. This can lead to unexpected behavior in the media
     *            player.
     *            </p>
     *            <p>
     *            The default is <code>LIVE</code>.
     *            </p>
     * @see DASHPlaybackMode
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
     * <b> <code>LIVE</code> </b>: For sessions of this type, the MPEG-DASH
     * manifest is continually updated with the latest fragments as they become
     * available. We recommend that the media player retrieve a new manifest on
     * a one-second interval. When this type of session is played in a media
     * player, the user interface typically displays a "live" notification, with
     * no scrubber control for choosing the position in the playback window to
     * display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in
     * an MPEG-DASH manifest, even if there is a gap between fragments (that is,
     * if a fragment is missing). A gap like this might cause a media player to
     * halt or cause a jump in playback. In this mode, fragments are not added
     * to the MPEG-DASH manifest if they are older than the newest fragment in
     * the playlist. If the missing fragment becomes available after a
     * subsequent fragment is added to the manifest, the older fragment is not
     * added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the
     * MPEG-DASH manifest is updated similarly to how it is updated for
     * <code>LIVE</code> mode except that it starts by including fragments from
     * a given start time. Instead of fragments being added as they are
     * ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds
     * long, then a new fragment is added to the manifest every two seconds.
     * This mode is useful to be able to start playback from when an event is
     * detected and continue live streaming media that has not yet been ingested
     * as of the time of the session creation. This mode is also useful to
     * stream previously archived media without being limited by the 1,000
     * fragment limit in the <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the MPEG-DASH
     * manifest contains all the fragments for the session, up to the number
     * that is specified in <code>MaxManifestFragmentResults</code>. The
     * manifest must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is
     * <code>PRODUCER_TIMESTAMP</code>, and if there are multiple fragments with
     * the same start timestamp, the fragment that has the larger fragment
     * number (that is, the newer fragment) is included in the MPEG-DASH
     * manifest. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in
     * the MPEG-DASH manifest. This can lead to unexpected behavior in the media
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
     *            <b> <code>LIVE</code> </b>: For sessions of this type, the
     *            MPEG-DASH manifest is continually updated with the latest
     *            fragments as they become available. We recommend that the
     *            media player retrieve a new manifest on a one-second interval.
     *            When this type of session is played in a media player, the
     *            user interface typically displays a "live" notification, with
     *            no scrubber control for choosing the position in the playback
     *            window to display.
     *            </p>
     *            <note>
     *            <p>
     *            In <code>LIVE</code> mode, the newest available fragments are
     *            included in an MPEG-DASH manifest, even if there is a gap
     *            between fragments (that is, if a fragment is missing). A gap
     *            like this might cause a media player to halt or cause a jump
     *            in playback. In this mode, fragments are not added to the
     *            MPEG-DASH manifest if they are older than the newest fragment
     *            in the playlist. If the missing fragment becomes available
     *            after a subsequent fragment is added to the manifest, the
     *            older fragment is not added, and the gap is not filled.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type,
     *            the MPEG-DASH manifest is updated similarly to how it is
     *            updated for <code>LIVE</code> mode except that it starts by
     *            including fragments from a given start time. Instead of
     *            fragments being added as they are ingested, fragments are
     *            added as the duration of the next fragment elapses. For
     *            example, if the fragments in the session are two seconds long,
     *            then a new fragment is added to the manifest every two
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
     *            the MPEG-DASH manifest contains all the fragments for the
     *            session, up to the number that is specified in
     *            <code>MaxManifestFragmentResults</code>. The manifest must be
     *            retrieved only once for each session. When this type of
     *            session is played in a media player, the user interface
     *            typically displays a scrubber control for choosing the
     *            position in the playback window to display.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            In all playback modes, if <code>FragmentSelectorType</code> is
     *            <code>PRODUCER_TIMESTAMP</code>, and if there are multiple
     *            fragments with the same start timestamp, the fragment that has
     *            the larger fragment number (that is, the newer fragment) is
     *            included in the MPEG-DASH manifest. The other fragments are
     *            not included. Fragments that have different timestamps but
     *            have overlapping durations are still included in the MPEG-DASH
     *            manifest. This can lead to unexpected behavior in the media
     *            player.
     *            </p>
     *            <p>
     *            The default is <code>LIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DASHPlaybackMode
     */
    public GetDASHStreamingSessionURLRequest withPlaybackMode(String playbackMode) {
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
     * <b> <code>LIVE</code> </b>: For sessions of this type, the MPEG-DASH
     * manifest is continually updated with the latest fragments as they become
     * available. We recommend that the media player retrieve a new manifest on
     * a one-second interval. When this type of session is played in a media
     * player, the user interface typically displays a "live" notification, with
     * no scrubber control for choosing the position in the playback window to
     * display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in
     * an MPEG-DASH manifest, even if there is a gap between fragments (that is,
     * if a fragment is missing). A gap like this might cause a media player to
     * halt or cause a jump in playback. In this mode, fragments are not added
     * to the MPEG-DASH manifest if they are older than the newest fragment in
     * the playlist. If the missing fragment becomes available after a
     * subsequent fragment is added to the manifest, the older fragment is not
     * added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the
     * MPEG-DASH manifest is updated similarly to how it is updated for
     * <code>LIVE</code> mode except that it starts by including fragments from
     * a given start time. Instead of fragments being added as they are
     * ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds
     * long, then a new fragment is added to the manifest every two seconds.
     * This mode is useful to be able to start playback from when an event is
     * detected and continue live streaming media that has not yet been ingested
     * as of the time of the session creation. This mode is also useful to
     * stream previously archived media without being limited by the 1,000
     * fragment limit in the <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the MPEG-DASH
     * manifest contains all the fragments for the session, up to the number
     * that is specified in <code>MaxManifestFragmentResults</code>. The
     * manifest must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is
     * <code>PRODUCER_TIMESTAMP</code>, and if there are multiple fragments with
     * the same start timestamp, the fragment that has the larger fragment
     * number (that is, the newer fragment) is included in the MPEG-DASH
     * manifest. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in
     * the MPEG-DASH manifest. This can lead to unexpected behavior in the media
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
     *            <b> <code>LIVE</code> </b>: For sessions of this type, the
     *            MPEG-DASH manifest is continually updated with the latest
     *            fragments as they become available. We recommend that the
     *            media player retrieve a new manifest on a one-second interval.
     *            When this type of session is played in a media player, the
     *            user interface typically displays a "live" notification, with
     *            no scrubber control for choosing the position in the playback
     *            window to display.
     *            </p>
     *            <note>
     *            <p>
     *            In <code>LIVE</code> mode, the newest available fragments are
     *            included in an MPEG-DASH manifest, even if there is a gap
     *            between fragments (that is, if a fragment is missing). A gap
     *            like this might cause a media player to halt or cause a jump
     *            in playback. In this mode, fragments are not added to the
     *            MPEG-DASH manifest if they are older than the newest fragment
     *            in the playlist. If the missing fragment becomes available
     *            after a subsequent fragment is added to the manifest, the
     *            older fragment is not added, and the gap is not filled.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type,
     *            the MPEG-DASH manifest is updated similarly to how it is
     *            updated for <code>LIVE</code> mode except that it starts by
     *            including fragments from a given start time. Instead of
     *            fragments being added as they are ingested, fragments are
     *            added as the duration of the next fragment elapses. For
     *            example, if the fragments in the session are two seconds long,
     *            then a new fragment is added to the manifest every two
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
     *            the MPEG-DASH manifest contains all the fragments for the
     *            session, up to the number that is specified in
     *            <code>MaxManifestFragmentResults</code>. The manifest must be
     *            retrieved only once for each session. When this type of
     *            session is played in a media player, the user interface
     *            typically displays a scrubber control for choosing the
     *            position in the playback window to display.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            In all playback modes, if <code>FragmentSelectorType</code> is
     *            <code>PRODUCER_TIMESTAMP</code>, and if there are multiple
     *            fragments with the same start timestamp, the fragment that has
     *            the larger fragment number (that is, the newer fragment) is
     *            included in the MPEG-DASH manifest. The other fragments are
     *            not included. Fragments that have different timestamps but
     *            have overlapping durations are still included in the MPEG-DASH
     *            manifest. This can lead to unexpected behavior in the media
     *            player.
     *            </p>
     *            <p>
     *            The default is <code>LIVE</code>.
     *            </p>
     * @see DASHPlaybackMode
     */
    public void setPlaybackMode(DASHPlaybackMode playbackMode) {
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
     * <b> <code>LIVE</code> </b>: For sessions of this type, the MPEG-DASH
     * manifest is continually updated with the latest fragments as they become
     * available. We recommend that the media player retrieve a new manifest on
     * a one-second interval. When this type of session is played in a media
     * player, the user interface typically displays a "live" notification, with
     * no scrubber control for choosing the position in the playback window to
     * display.
     * </p>
     * <note>
     * <p>
     * In <code>LIVE</code> mode, the newest available fragments are included in
     * an MPEG-DASH manifest, even if there is a gap between fragments (that is,
     * if a fragment is missing). A gap like this might cause a media player to
     * halt or cause a jump in playback. In this mode, fragments are not added
     * to the MPEG-DASH manifest if they are older than the newest fragment in
     * the playlist. If the missing fragment becomes available after a
     * subsequent fragment is added to the manifest, the older fragment is not
     * added, and the gap is not filled.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type, the
     * MPEG-DASH manifest is updated similarly to how it is updated for
     * <code>LIVE</code> mode except that it starts by including fragments from
     * a given start time. Instead of fragments being added as they are
     * ingested, fragments are added as the duration of the next fragment
     * elapses. For example, if the fragments in the session are two seconds
     * long, then a new fragment is added to the manifest every two seconds.
     * This mode is useful to be able to start playback from when an event is
     * detected and continue live streaming media that has not yet been ingested
     * as of the time of the session creation. This mode is also useful to
     * stream previously archived media without being limited by the 1,000
     * fragment limit in the <code>ON_DEMAND</code> mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the MPEG-DASH
     * manifest contains all the fragments for the session, up to the number
     * that is specified in <code>MaxManifestFragmentResults</code>. The
     * manifest must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In all playback modes, if <code>FragmentSelectorType</code> is
     * <code>PRODUCER_TIMESTAMP</code>, and if there are multiple fragments with
     * the same start timestamp, the fragment that has the larger fragment
     * number (that is, the newer fragment) is included in the MPEG-DASH
     * manifest. The other fragments are not included. Fragments that have
     * different timestamps but have overlapping durations are still included in
     * the MPEG-DASH manifest. This can lead to unexpected behavior in the media
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
     *            <b> <code>LIVE</code> </b>: For sessions of this type, the
     *            MPEG-DASH manifest is continually updated with the latest
     *            fragments as they become available. We recommend that the
     *            media player retrieve a new manifest on a one-second interval.
     *            When this type of session is played in a media player, the
     *            user interface typically displays a "live" notification, with
     *            no scrubber control for choosing the position in the playback
     *            window to display.
     *            </p>
     *            <note>
     *            <p>
     *            In <code>LIVE</code> mode, the newest available fragments are
     *            included in an MPEG-DASH manifest, even if there is a gap
     *            between fragments (that is, if a fragment is missing). A gap
     *            like this might cause a media player to halt or cause a jump
     *            in playback. In this mode, fragments are not added to the
     *            MPEG-DASH manifest if they are older than the newest fragment
     *            in the playlist. If the missing fragment becomes available
     *            after a subsequent fragment is added to the manifest, the
     *            older fragment is not added, and the gap is not filled.
     *            </p>
     *            </note></li>
     *            <li>
     *            <p>
     *            <b> <code>LIVE_REPLAY</code> </b>: For sessions of this type,
     *            the MPEG-DASH manifest is updated similarly to how it is
     *            updated for <code>LIVE</code> mode except that it starts by
     *            including fragments from a given start time. Instead of
     *            fragments being added as they are ingested, fragments are
     *            added as the duration of the next fragment elapses. For
     *            example, if the fragments in the session are two seconds long,
     *            then a new fragment is added to the manifest every two
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
     *            the MPEG-DASH manifest contains all the fragments for the
     *            session, up to the number that is specified in
     *            <code>MaxManifestFragmentResults</code>. The manifest must be
     *            retrieved only once for each session. When this type of
     *            session is played in a media player, the user interface
     *            typically displays a scrubber control for choosing the
     *            position in the playback window to display.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            In all playback modes, if <code>FragmentSelectorType</code> is
     *            <code>PRODUCER_TIMESTAMP</code>, and if there are multiple
     *            fragments with the same start timestamp, the fragment that has
     *            the larger fragment number (that is, the newer fragment) is
     *            included in the MPEG-DASH manifest. The other fragments are
     *            not included. Fragments that have different timestamps but
     *            have overlapping durations are still included in the MPEG-DASH
     *            manifest. This can lead to unexpected behavior in the media
     *            player.
     *            </p>
     *            <p>
     *            The default is <code>LIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DASHPlaybackMode
     */
    public GetDASHStreamingSessionURLRequest withPlaybackMode(DASHPlaybackMode playbackMode) {
        this.playbackMode = playbackMode.toString();
        return this;
    }

    /**
     * <p>
     * Per the MPEG-DASH specification, the wall-clock time of fragments in the
     * manifest file can be derived using attributes in the manifest itself.
     * However, typically, MPEG-DASH compatible media players do not properly
     * handle gaps in the media timeline. Kinesis Video Streams adjusts the
     * media timeline in the manifest file to enable playback of media with
     * discontinuities. Therefore, the wall-clock time derived from the manifest
     * file may be inaccurate. If DisplayFragmentTimestamp is set to
     * <code>ALWAYS</code>, the accurate fragment timestamp is added to each S
     * element in the manifest file with the attribute name “kvs:ts”. A custom
     * MPEG-DASH media player is necessary to leverage this custom attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>. When <a>DASHFragmentSelector</a>
     * is <code>SERVER_TIMESTAMP</code>, the timestamps will be the server start
     * timestamps. Similarly, when <a>DASHFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer
     * start timestamps.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @return <p>
     *         Per the MPEG-DASH specification, the wall-clock time of fragments
     *         in the manifest file can be derived using attributes in the
     *         manifest itself. However, typically, MPEG-DASH compatible media
     *         players do not properly handle gaps in the media timeline.
     *         Kinesis Video Streams adjusts the media timeline in the manifest
     *         file to enable playback of media with discontinuities. Therefore,
     *         the wall-clock time derived from the manifest file may be
     *         inaccurate. If DisplayFragmentTimestamp is set to
     *         <code>ALWAYS</code>, the accurate fragment timestamp is added to
     *         each S element in the manifest file with the attribute name
     *         “kvs:ts”. A custom MPEG-DASH media player is necessary to
     *         leverage this custom attribute.
     *         </p>
     *         <p>
     *         The default value is <code>NEVER</code>. When
     *         <a>DASHFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>, the
     *         timestamps will be the server start timestamps. Similarly, when
     *         <a>DASHFragmentSelector</a> is <code>PRODUCER_TIMESTAMP</code>,
     *         the timestamps will be the producer start timestamps.
     *         </p>
     * @see DASHDisplayFragmentTimestamp
     */
    public String getDisplayFragmentTimestamp() {
        return displayFragmentTimestamp;
    }

    /**
     * <p>
     * Per the MPEG-DASH specification, the wall-clock time of fragments in the
     * manifest file can be derived using attributes in the manifest itself.
     * However, typically, MPEG-DASH compatible media players do not properly
     * handle gaps in the media timeline. Kinesis Video Streams adjusts the
     * media timeline in the manifest file to enable playback of media with
     * discontinuities. Therefore, the wall-clock time derived from the manifest
     * file may be inaccurate. If DisplayFragmentTimestamp is set to
     * <code>ALWAYS</code>, the accurate fragment timestamp is added to each S
     * element in the manifest file with the attribute name “kvs:ts”. A custom
     * MPEG-DASH media player is necessary to leverage this custom attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>. When <a>DASHFragmentSelector</a>
     * is <code>SERVER_TIMESTAMP</code>, the timestamps will be the server start
     * timestamps. Similarly, when <a>DASHFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer
     * start timestamps.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @param displayFragmentTimestamp <p>
     *            Per the MPEG-DASH specification, the wall-clock time of
     *            fragments in the manifest file can be derived using attributes
     *            in the manifest itself. However, typically, MPEG-DASH
     *            compatible media players do not properly handle gaps in the
     *            media timeline. Kinesis Video Streams adjusts the media
     *            timeline in the manifest file to enable playback of media with
     *            discontinuities. Therefore, the wall-clock time derived from
     *            the manifest file may be inaccurate. If
     *            DisplayFragmentTimestamp is set to <code>ALWAYS</code>, the
     *            accurate fragment timestamp is added to each S element in the
     *            manifest file with the attribute name “kvs:ts”. A custom
     *            MPEG-DASH media player is necessary to leverage this custom
     *            attribute.
     *            </p>
     *            <p>
     *            The default value is <code>NEVER</code>. When
     *            <a>DASHFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>,
     *            the timestamps will be the server start timestamps. Similarly,
     *            when <a>DASHFragmentSelector</a> is
     *            <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the
     *            producer start timestamps.
     *            </p>
     * @see DASHDisplayFragmentTimestamp
     */
    public void setDisplayFragmentTimestamp(String displayFragmentTimestamp) {
        this.displayFragmentTimestamp = displayFragmentTimestamp;
    }

    /**
     * <p>
     * Per the MPEG-DASH specification, the wall-clock time of fragments in the
     * manifest file can be derived using attributes in the manifest itself.
     * However, typically, MPEG-DASH compatible media players do not properly
     * handle gaps in the media timeline. Kinesis Video Streams adjusts the
     * media timeline in the manifest file to enable playback of media with
     * discontinuities. Therefore, the wall-clock time derived from the manifest
     * file may be inaccurate. If DisplayFragmentTimestamp is set to
     * <code>ALWAYS</code>, the accurate fragment timestamp is added to each S
     * element in the manifest file with the attribute name “kvs:ts”. A custom
     * MPEG-DASH media player is necessary to leverage this custom attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>. When <a>DASHFragmentSelector</a>
     * is <code>SERVER_TIMESTAMP</code>, the timestamps will be the server start
     * timestamps. Similarly, when <a>DASHFragmentSelector</a> is
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
     *            Per the MPEG-DASH specification, the wall-clock time of
     *            fragments in the manifest file can be derived using attributes
     *            in the manifest itself. However, typically, MPEG-DASH
     *            compatible media players do not properly handle gaps in the
     *            media timeline. Kinesis Video Streams adjusts the media
     *            timeline in the manifest file to enable playback of media with
     *            discontinuities. Therefore, the wall-clock time derived from
     *            the manifest file may be inaccurate. If
     *            DisplayFragmentTimestamp is set to <code>ALWAYS</code>, the
     *            accurate fragment timestamp is added to each S element in the
     *            manifest file with the attribute name “kvs:ts”. A custom
     *            MPEG-DASH media player is necessary to leverage this custom
     *            attribute.
     *            </p>
     *            <p>
     *            The default value is <code>NEVER</code>. When
     *            <a>DASHFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>,
     *            the timestamps will be the server start timestamps. Similarly,
     *            when <a>DASHFragmentSelector</a> is
     *            <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the
     *            producer start timestamps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DASHDisplayFragmentTimestamp
     */
    public GetDASHStreamingSessionURLRequest withDisplayFragmentTimestamp(
            String displayFragmentTimestamp) {
        this.displayFragmentTimestamp = displayFragmentTimestamp;
        return this;
    }

    /**
     * <p>
     * Per the MPEG-DASH specification, the wall-clock time of fragments in the
     * manifest file can be derived using attributes in the manifest itself.
     * However, typically, MPEG-DASH compatible media players do not properly
     * handle gaps in the media timeline. Kinesis Video Streams adjusts the
     * media timeline in the manifest file to enable playback of media with
     * discontinuities. Therefore, the wall-clock time derived from the manifest
     * file may be inaccurate. If DisplayFragmentTimestamp is set to
     * <code>ALWAYS</code>, the accurate fragment timestamp is added to each S
     * element in the manifest file with the attribute name “kvs:ts”. A custom
     * MPEG-DASH media player is necessary to leverage this custom attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>. When <a>DASHFragmentSelector</a>
     * is <code>SERVER_TIMESTAMP</code>, the timestamps will be the server start
     * timestamps. Similarly, when <a>DASHFragmentSelector</a> is
     * <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the producer
     * start timestamps.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @param displayFragmentTimestamp <p>
     *            Per the MPEG-DASH specification, the wall-clock time of
     *            fragments in the manifest file can be derived using attributes
     *            in the manifest itself. However, typically, MPEG-DASH
     *            compatible media players do not properly handle gaps in the
     *            media timeline. Kinesis Video Streams adjusts the media
     *            timeline in the manifest file to enable playback of media with
     *            discontinuities. Therefore, the wall-clock time derived from
     *            the manifest file may be inaccurate. If
     *            DisplayFragmentTimestamp is set to <code>ALWAYS</code>, the
     *            accurate fragment timestamp is added to each S element in the
     *            manifest file with the attribute name “kvs:ts”. A custom
     *            MPEG-DASH media player is necessary to leverage this custom
     *            attribute.
     *            </p>
     *            <p>
     *            The default value is <code>NEVER</code>. When
     *            <a>DASHFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>,
     *            the timestamps will be the server start timestamps. Similarly,
     *            when <a>DASHFragmentSelector</a> is
     *            <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the
     *            producer start timestamps.
     *            </p>
     * @see DASHDisplayFragmentTimestamp
     */
    public void setDisplayFragmentTimestamp(DASHDisplayFragmentTimestamp displayFragmentTimestamp) {
        this.displayFragmentTimestamp = displayFragmentTimestamp.toString();
    }

    /**
     * <p>
     * Per the MPEG-DASH specification, the wall-clock time of fragments in the
     * manifest file can be derived using attributes in the manifest itself.
     * However, typically, MPEG-DASH compatible media players do not properly
     * handle gaps in the media timeline. Kinesis Video Streams adjusts the
     * media timeline in the manifest file to enable playback of media with
     * discontinuities. Therefore, the wall-clock time derived from the manifest
     * file may be inaccurate. If DisplayFragmentTimestamp is set to
     * <code>ALWAYS</code>, the accurate fragment timestamp is added to each S
     * element in the manifest file with the attribute name “kvs:ts”. A custom
     * MPEG-DASH media player is necessary to leverage this custom attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>. When <a>DASHFragmentSelector</a>
     * is <code>SERVER_TIMESTAMP</code>, the timestamps will be the server start
     * timestamps. Similarly, when <a>DASHFragmentSelector</a> is
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
     *            Per the MPEG-DASH specification, the wall-clock time of
     *            fragments in the manifest file can be derived using attributes
     *            in the manifest itself. However, typically, MPEG-DASH
     *            compatible media players do not properly handle gaps in the
     *            media timeline. Kinesis Video Streams adjusts the media
     *            timeline in the manifest file to enable playback of media with
     *            discontinuities. Therefore, the wall-clock time derived from
     *            the manifest file may be inaccurate. If
     *            DisplayFragmentTimestamp is set to <code>ALWAYS</code>, the
     *            accurate fragment timestamp is added to each S element in the
     *            manifest file with the attribute name “kvs:ts”. A custom
     *            MPEG-DASH media player is necessary to leverage this custom
     *            attribute.
     *            </p>
     *            <p>
     *            The default value is <code>NEVER</code>. When
     *            <a>DASHFragmentSelector</a> is <code>SERVER_TIMESTAMP</code>,
     *            the timestamps will be the server start timestamps. Similarly,
     *            when <a>DASHFragmentSelector</a> is
     *            <code>PRODUCER_TIMESTAMP</code>, the timestamps will be the
     *            producer start timestamps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DASHDisplayFragmentTimestamp
     */
    public GetDASHStreamingSessionURLRequest withDisplayFragmentTimestamp(
            DASHDisplayFragmentTimestamp displayFragmentTimestamp) {
        this.displayFragmentTimestamp = displayFragmentTimestamp.toString();
        return this;
    }

    /**
     * <p>
     * Fragments are identified in the manifest file based on their sequence
     * number in the session. If DisplayFragmentNumber is set to
     * <code>ALWAYS</code>, the Kinesis Video Streams fragment number is added
     * to each S element in the manifest file with the attribute name “kvs:fn”.
     * These fragment numbers can be used for logging or for use with other APIs
     * (e.g. <code>GetMedia</code> and <code>GetMediaForFragmentList</code>). A
     * custom MPEG-DASH media player is necessary to leverage these this custom
     * attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @return <p>
     *         Fragments are identified in the manifest file based on their
     *         sequence number in the session. If DisplayFragmentNumber is set
     *         to <code>ALWAYS</code>, the Kinesis Video Streams fragment number
     *         is added to each S element in the manifest file with the
     *         attribute name “kvs:fn”. These fragment numbers can be used for
     *         logging or for use with other APIs (e.g. <code>GetMedia</code>
     *         and <code>GetMediaForFragmentList</code>). A custom MPEG-DASH
     *         media player is necessary to leverage these this custom
     *         attribute.
     *         </p>
     *         <p>
     *         The default value is <code>NEVER</code>.
     *         </p>
     * @see DASHDisplayFragmentNumber
     */
    public String getDisplayFragmentNumber() {
        return displayFragmentNumber;
    }

    /**
     * <p>
     * Fragments are identified in the manifest file based on their sequence
     * number in the session. If DisplayFragmentNumber is set to
     * <code>ALWAYS</code>, the Kinesis Video Streams fragment number is added
     * to each S element in the manifest file with the attribute name “kvs:fn”.
     * These fragment numbers can be used for logging or for use with other APIs
     * (e.g. <code>GetMedia</code> and <code>GetMediaForFragmentList</code>). A
     * custom MPEG-DASH media player is necessary to leverage these this custom
     * attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @param displayFragmentNumber <p>
     *            Fragments are identified in the manifest file based on their
     *            sequence number in the session. If DisplayFragmentNumber is
     *            set to <code>ALWAYS</code>, the Kinesis Video Streams fragment
     *            number is added to each S element in the manifest file with
     *            the attribute name “kvs:fn”. These fragment numbers can be
     *            used for logging or for use with other APIs (e.g.
     *            <code>GetMedia</code> and <code>GetMediaForFragmentList</code>
     *            ). A custom MPEG-DASH media player is necessary to leverage
     *            these this custom attribute.
     *            </p>
     *            <p>
     *            The default value is <code>NEVER</code>.
     *            </p>
     * @see DASHDisplayFragmentNumber
     */
    public void setDisplayFragmentNumber(String displayFragmentNumber) {
        this.displayFragmentNumber = displayFragmentNumber;
    }

    /**
     * <p>
     * Fragments are identified in the manifest file based on their sequence
     * number in the session. If DisplayFragmentNumber is set to
     * <code>ALWAYS</code>, the Kinesis Video Streams fragment number is added
     * to each S element in the manifest file with the attribute name “kvs:fn”.
     * These fragment numbers can be used for logging or for use with other APIs
     * (e.g. <code>GetMedia</code> and <code>GetMediaForFragmentList</code>). A
     * custom MPEG-DASH media player is necessary to leverage these this custom
     * attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @param displayFragmentNumber <p>
     *            Fragments are identified in the manifest file based on their
     *            sequence number in the session. If DisplayFragmentNumber is
     *            set to <code>ALWAYS</code>, the Kinesis Video Streams fragment
     *            number is added to each S element in the manifest file with
     *            the attribute name “kvs:fn”. These fragment numbers can be
     *            used for logging or for use with other APIs (e.g.
     *            <code>GetMedia</code> and <code>GetMediaForFragmentList</code>
     *            ). A custom MPEG-DASH media player is necessary to leverage
     *            these this custom attribute.
     *            </p>
     *            <p>
     *            The default value is <code>NEVER</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DASHDisplayFragmentNumber
     */
    public GetDASHStreamingSessionURLRequest withDisplayFragmentNumber(String displayFragmentNumber) {
        this.displayFragmentNumber = displayFragmentNumber;
        return this;
    }

    /**
     * <p>
     * Fragments are identified in the manifest file based on their sequence
     * number in the session. If DisplayFragmentNumber is set to
     * <code>ALWAYS</code>, the Kinesis Video Streams fragment number is added
     * to each S element in the manifest file with the attribute name “kvs:fn”.
     * These fragment numbers can be used for logging or for use with other APIs
     * (e.g. <code>GetMedia</code> and <code>GetMediaForFragmentList</code>). A
     * custom MPEG-DASH media player is necessary to leverage these this custom
     * attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @param displayFragmentNumber <p>
     *            Fragments are identified in the manifest file based on their
     *            sequence number in the session. If DisplayFragmentNumber is
     *            set to <code>ALWAYS</code>, the Kinesis Video Streams fragment
     *            number is added to each S element in the manifest file with
     *            the attribute name “kvs:fn”. These fragment numbers can be
     *            used for logging or for use with other APIs (e.g.
     *            <code>GetMedia</code> and <code>GetMediaForFragmentList</code>
     *            ). A custom MPEG-DASH media player is necessary to leverage
     *            these this custom attribute.
     *            </p>
     *            <p>
     *            The default value is <code>NEVER</code>.
     *            </p>
     * @see DASHDisplayFragmentNumber
     */
    public void setDisplayFragmentNumber(DASHDisplayFragmentNumber displayFragmentNumber) {
        this.displayFragmentNumber = displayFragmentNumber.toString();
    }

    /**
     * <p>
     * Fragments are identified in the manifest file based on their sequence
     * number in the session. If DisplayFragmentNumber is set to
     * <code>ALWAYS</code>, the Kinesis Video Streams fragment number is added
     * to each S element in the manifest file with the attribute name “kvs:fn”.
     * These fragment numbers can be used for logging or for use with other APIs
     * (e.g. <code>GetMedia</code> and <code>GetMediaForFragmentList</code>). A
     * custom MPEG-DASH media player is necessary to leverage these this custom
     * attribute.
     * </p>
     * <p>
     * The default value is <code>NEVER</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @param displayFragmentNumber <p>
     *            Fragments are identified in the manifest file based on their
     *            sequence number in the session. If DisplayFragmentNumber is
     *            set to <code>ALWAYS</code>, the Kinesis Video Streams fragment
     *            number is added to each S element in the manifest file with
     *            the attribute name “kvs:fn”. These fragment numbers can be
     *            used for logging or for use with other APIs (e.g.
     *            <code>GetMedia</code> and <code>GetMediaForFragmentList</code>
     *            ). A custom MPEG-DASH media player is necessary to leverage
     *            these this custom attribute.
     *            </p>
     *            <p>
     *            The default value is <code>NEVER</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DASHDisplayFragmentNumber
     */
    public GetDASHStreamingSessionURLRequest withDisplayFragmentNumber(
            DASHDisplayFragmentNumber displayFragmentNumber) {
        this.displayFragmentNumber = displayFragmentNumber.toString();
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
    public DASHFragmentSelector getDASHFragmentSelector() {
        return dASHFragmentSelector;
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
     * @param dASHFragmentSelector <p>
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
    public void setDASHFragmentSelector(DASHFragmentSelector dASHFragmentSelector) {
        this.dASHFragmentSelector = dASHFragmentSelector;
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
     * @param dASHFragmentSelector <p>
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
    public GetDASHStreamingSessionURLRequest withDASHFragmentSelector(
            DASHFragmentSelector dASHFragmentSelector) {
        this.dASHFragmentSelector = dASHFragmentSelector;
        return this;
    }

    /**
     * <p>
     * The time in seconds until the requested session expires. This value can
     * be between 300 (5 minutes) and 43200 (12 hours).
     * </p>
     * <p>
     * When a session expires, no new calls to <code>GetDashManifest</code>,
     * <code>GetMP4InitFragment</code>, or <code>GetMP4MediaFragment</code> can
     * be made for that session.
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
     *         <code>GetDashManifest</code>, <code>GetMP4InitFragment</code>, or
     *         <code>GetMP4MediaFragment</code> can be made for that session.
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
     * When a session expires, no new calls to <code>GetDashManifest</code>,
     * <code>GetMP4InitFragment</code>, or <code>GetMP4MediaFragment</code> can
     * be made for that session.
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
     *            <code>GetDashManifest</code>, <code>GetMP4InitFragment</code>,
     *            or <code>GetMP4MediaFragment</code> can be made for that
     *            session.
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
     * When a session expires, no new calls to <code>GetDashManifest</code>,
     * <code>GetMP4InitFragment</code>, or <code>GetMP4MediaFragment</code> can
     * be made for that session.
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
     *            <code>GetDashManifest</code>, <code>GetMP4InitFragment</code>,
     *            or <code>GetMP4MediaFragment</code> can be made for that
     *            session.
     *            </p>
     *            <p>
     *            The default is 300 (5 minutes).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDASHStreamingSessionURLRequest withExpires(Integer expires) {
        this.expires = expires;
        return this;
    }

    /**
     * <p>
     * The maximum number of fragments that are returned in the MPEG-DASH
     * manifest.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent
     * fragments are returned up to this value. When the
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments
     * are returned, up to this maximum number.
     * </p>
     * <p>
     * When there are a higher number of fragments available in a live MPEG-DASH
     * manifest, video players often buffer content before starting playback.
     * Increasing the buffer size increases the playback latency, but it
     * decreases the likelihood that rebuffering will occur during playback. We
     * recommend that a live MPEG-DASH manifest have a minimum of 3 fragments
     * and a maximum of 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is
     * <code>LIVE</code> or <code>LIVE_REPLAY</code>, and 1,000 if
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 1,000 fragments corresponds to more than 16 minutes
     * of video on streams with 1-second fragments, and more than 2 1/2 hours of
     * video on streams with 10-second fragments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5000<br/>
     *
     * @return <p>
     *         The maximum number of fragments that are returned in the
     *         MPEG-DASH manifest.
     *         </p>
     *         <p>
     *         When the <code>PlaybackMode</code> is <code>LIVE</code>, the most
     *         recent fragments are returned up to this value. When the
     *         <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest
     *         fragments are returned, up to this maximum number.
     *         </p>
     *         <p>
     *         When there are a higher number of fragments available in a live
     *         MPEG-DASH manifest, video players often buffer content before
     *         starting playback. Increasing the buffer size increases the
     *         playback latency, but it decreases the likelihood that
     *         rebuffering will occur during playback. We recommend that a live
     *         MPEG-DASH manifest have a minimum of 3 fragments and a maximum of
     *         10 fragments.
     *         </p>
     *         <p>
     *         The default is 5 fragments if <code>PlaybackMode</code> is
     *         <code>LIVE</code> or <code>LIVE_REPLAY</code>, and 1,000 if
     *         <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     *         </p>
     *         <p>
     *         The maximum value of 1,000 fragments corresponds to more than 16
     *         minutes of video on streams with 1-second fragments, and more
     *         than 2 1/2 hours of video on streams with 10-second fragments.
     *         </p>
     */
    public Long getMaxManifestFragmentResults() {
        return maxManifestFragmentResults;
    }

    /**
     * <p>
     * The maximum number of fragments that are returned in the MPEG-DASH
     * manifest.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent
     * fragments are returned up to this value. When the
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments
     * are returned, up to this maximum number.
     * </p>
     * <p>
     * When there are a higher number of fragments available in a live MPEG-DASH
     * manifest, video players often buffer content before starting playback.
     * Increasing the buffer size increases the playback latency, but it
     * decreases the likelihood that rebuffering will occur during playback. We
     * recommend that a live MPEG-DASH manifest have a minimum of 3 fragments
     * and a maximum of 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is
     * <code>LIVE</code> or <code>LIVE_REPLAY</code>, and 1,000 if
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 1,000 fragments corresponds to more than 16 minutes
     * of video on streams with 1-second fragments, and more than 2 1/2 hours of
     * video on streams with 10-second fragments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5000<br/>
     *
     * @param maxManifestFragmentResults <p>
     *            The maximum number of fragments that are returned in the
     *            MPEG-DASH manifest.
     *            </p>
     *            <p>
     *            When the <code>PlaybackMode</code> is <code>LIVE</code>, the
     *            most recent fragments are returned up to this value. When the
     *            <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the
     *            oldest fragments are returned, up to this maximum number.
     *            </p>
     *            <p>
     *            When there are a higher number of fragments available in a
     *            live MPEG-DASH manifest, video players often buffer content
     *            before starting playback. Increasing the buffer size increases
     *            the playback latency, but it decreases the likelihood that
     *            rebuffering will occur during playback. We recommend that a
     *            live MPEG-DASH manifest have a minimum of 3 fragments and a
     *            maximum of 10 fragments.
     *            </p>
     *            <p>
     *            The default is 5 fragments if <code>PlaybackMode</code> is
     *            <code>LIVE</code> or <code>LIVE_REPLAY</code>, and 1,000 if
     *            <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     *            </p>
     *            <p>
     *            The maximum value of 1,000 fragments corresponds to more than
     *            16 minutes of video on streams with 1-second fragments, and
     *            more than 2 1/2 hours of video on streams with 10-second
     *            fragments.
     *            </p>
     */
    public void setMaxManifestFragmentResults(Long maxManifestFragmentResults) {
        this.maxManifestFragmentResults = maxManifestFragmentResults;
    }

    /**
     * <p>
     * The maximum number of fragments that are returned in the MPEG-DASH
     * manifest.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent
     * fragments are returned up to this value. When the
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments
     * are returned, up to this maximum number.
     * </p>
     * <p>
     * When there are a higher number of fragments available in a live MPEG-DASH
     * manifest, video players often buffer content before starting playback.
     * Increasing the buffer size increases the playback latency, but it
     * decreases the likelihood that rebuffering will occur during playback. We
     * recommend that a live MPEG-DASH manifest have a minimum of 3 fragments
     * and a maximum of 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is
     * <code>LIVE</code> or <code>LIVE_REPLAY</code>, and 1,000 if
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 1,000 fragments corresponds to more than 16 minutes
     * of video on streams with 1-second fragments, and more than 2 1/2 hours of
     * video on streams with 10-second fragments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5000<br/>
     *
     * @param maxManifestFragmentResults <p>
     *            The maximum number of fragments that are returned in the
     *            MPEG-DASH manifest.
     *            </p>
     *            <p>
     *            When the <code>PlaybackMode</code> is <code>LIVE</code>, the
     *            most recent fragments are returned up to this value. When the
     *            <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the
     *            oldest fragments are returned, up to this maximum number.
     *            </p>
     *            <p>
     *            When there are a higher number of fragments available in a
     *            live MPEG-DASH manifest, video players often buffer content
     *            before starting playback. Increasing the buffer size increases
     *            the playback latency, but it decreases the likelihood that
     *            rebuffering will occur during playback. We recommend that a
     *            live MPEG-DASH manifest have a minimum of 3 fragments and a
     *            maximum of 10 fragments.
     *            </p>
     *            <p>
     *            The default is 5 fragments if <code>PlaybackMode</code> is
     *            <code>LIVE</code> or <code>LIVE_REPLAY</code>, and 1,000 if
     *            <code>PlaybackMode</code> is <code>ON_DEMAND</code>.
     *            </p>
     *            <p>
     *            The maximum value of 1,000 fragments corresponds to more than
     *            16 minutes of video on streams with 1-second fragments, and
     *            more than 2 1/2 hours of video on streams with 10-second
     *            fragments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDASHStreamingSessionURLRequest withMaxManifestFragmentResults(
            Long maxManifestFragmentResults) {
        this.maxManifestFragmentResults = maxManifestFragmentResults;
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
        if (getDisplayFragmentTimestamp() != null)
            sb.append("DisplayFragmentTimestamp: " + getDisplayFragmentTimestamp() + ",");
        if (getDisplayFragmentNumber() != null)
            sb.append("DisplayFragmentNumber: " + getDisplayFragmentNumber() + ",");
        if (getDASHFragmentSelector() != null)
            sb.append("DASHFragmentSelector: " + getDASHFragmentSelector() + ",");
        if (getExpires() != null)
            sb.append("Expires: " + getExpires() + ",");
        if (getMaxManifestFragmentResults() != null)
            sb.append("MaxManifestFragmentResults: " + getMaxManifestFragmentResults());
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
        hashCode = prime
                * hashCode
                + ((getDisplayFragmentTimestamp() == null) ? 0 : getDisplayFragmentTimestamp()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDisplayFragmentNumber() == null) ? 0 : getDisplayFragmentNumber().hashCode());
        hashCode = prime * hashCode
                + ((getDASHFragmentSelector() == null) ? 0 : getDASHFragmentSelector().hashCode());
        hashCode = prime * hashCode + ((getExpires() == null) ? 0 : getExpires().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxManifestFragmentResults() == null) ? 0 : getMaxManifestFragmentResults()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDASHStreamingSessionURLRequest == false)
            return false;
        GetDASHStreamingSessionURLRequest other = (GetDASHStreamingSessionURLRequest) obj;

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
        if (other.getDisplayFragmentTimestamp() == null
                ^ this.getDisplayFragmentTimestamp() == null)
            return false;
        if (other.getDisplayFragmentTimestamp() != null
                && other.getDisplayFragmentTimestamp().equals(this.getDisplayFragmentTimestamp()) == false)
            return false;
        if (other.getDisplayFragmentNumber() == null ^ this.getDisplayFragmentNumber() == null)
            return false;
        if (other.getDisplayFragmentNumber() != null
                && other.getDisplayFragmentNumber().equals(this.getDisplayFragmentNumber()) == false)
            return false;
        if (other.getDASHFragmentSelector() == null ^ this.getDASHFragmentSelector() == null)
            return false;
        if (other.getDASHFragmentSelector() != null
                && other.getDASHFragmentSelector().equals(this.getDASHFragmentSelector()) == false)
            return false;
        if (other.getExpires() == null ^ this.getExpires() == null)
            return false;
        if (other.getExpires() != null && other.getExpires().equals(this.getExpires()) == false)
            return false;
        if (other.getMaxManifestFragmentResults() == null
                ^ this.getMaxManifestFragmentResults() == null)
            return false;
        if (other.getMaxManifestFragmentResults() != null
                && other.getMaxManifestFragmentResults().equals(
                        this.getMaxManifestFragmentResults()) == false)
            return false;
        return true;
    }
}
