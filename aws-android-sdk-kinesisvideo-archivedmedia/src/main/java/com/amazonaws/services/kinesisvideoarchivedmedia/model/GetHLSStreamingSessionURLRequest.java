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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves an HTTP Live Streaming (HLS) URL for the stream. The URL can then
 * be opened in a browser or media player to view the stream contents.
 * </p>
 * <p>
 * You must specify either the <code>StreamName</code> or the
 * <code>StreamARN</code>.
 * </p>
 * <p>
 * An Amazon Kinesis video stream has the following requirements for providing
 * data through HLS:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The media type must be <code>video/h264</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Data retention must be greater than 0.
 * </p>
 * </li>
 * <li>
 * <p>
 * The fragments must contain codec private data in the AVC (Advanced Video
 * Coding) for H.264 format (<a
 * href="https://www.iso.org/standard/55980.html">MPEG-4 specification ISO/IEC
 * 14496-15</a>). For information about adapting stream data to a given format,
 * see <a href=
 * "http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/latest/dg/producer-reference-nal.html"
 * >NAL Adaptation Flags</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Kinesis Video Streams HLS sessions contain fragments in the fragmented MPEG-4
 * form (also called fMP4 or CMAF), rather than the MPEG-2 form (also called TS
 * chunks, which the HLS specification also supports). For more information
 * about HLS fragment types, see the <a
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
 * outside the requested window or alternate bit rates) is made available.
 * </p>
 * </li>
 * <li>
 * <p>
 * Provide the URL (containing the encrypted session token) for the HLS master
 * playlist to a media player that supports the HLS protocol. Kinesis Video
 * Streams makes the HLS media playlist, initialization fragment, and media
 * fragments available through the master playlist URL. The initialization
 * fragment contains the codec private data for the stream, and other data
 * needed to set up the video decoder and renderer. The media fragments contain
 * H.264-encoded video frames and time stamps.
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
 * a URL for the <code>GetHLSMediaPlaylist</code> action, and additional
 * metadata for the media player, including estimated bit rate and resolution.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>GetHLSMediaPlaylist:</b> Retrieves an HLS media playlist, which contains a
 * URL to access the MP4 intitialization fragment with the
 * <code>GetMP4InitFragment</code> action, and URLs to access the MP4 media
 * fragments with the <code>GetMP4MediaFragment</code> actions. The HLS media
 * playlist also contains metadata about the stream that the player needs to
 * play it, such as whether the <code>PlaybackMode</code> is <code>LIVE</code>
 * or <code>ON_DEMAND</code>. The HLS media playlist is typically static for
 * sessions with a <code>PlaybackType</code> of <code>ON_DEMAND</code>. The HLS
 * media playlist is continually updated with new fragments for sessions with a
 * <code>PlaybackType</code> of <code>LIVE</code>.
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
 * video stream. It contains only the codec private data for the stream, which
 * the media player needs to decode video frames.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>GetMP4MediaFragment:</b> Retrieves MP4 media fragments. These fragments
 * contain the "<code>moof</code>" and "<code>mdat</code>" MP4 atoms and their
 * child atoms, containing the encoded fragment's video frames and their time
 * stamps.
 * </p>
 * <note>
 * <p>
 * After the first media fragment is made available in a streaming session, any
 * fragments that don't contain the same codec private data are excluded in the
 * HLS media playlist. Therefore, the codec private data does not change between
 * fragments in a session.
 * </p>
 * </note></li>
 * </ul>
 * </li>
 * </ol>
 * <note>
 * <p>
 * The following restrictions apply to HLS sessions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A streaming session URL should not be shared between players. The service
 * might throttle a session if multiple media players are sharing it. For
 * connection limits, see <a
 * href="http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html"
 * >Kinesis Video Streams Limits</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * A Kinesis video stream can have a maximum of five active HLS streaming
 * sessions. If a new session is created when the maximum number of sessions is
 * already active, the oldest (earliest created) session is closed. The number
 * of active <code>GetMedia</code> connections on a Kinesis video stream does
 * not count against this limit, and the number of active HLS sessions does not
 * count against the active <code>GetMedia</code> connection limit.
 * </p>
 * </li>
 * </ul>
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
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     */
    private String streamARN;

    /**
     * <p>
     * Whether to retrieve live or archived, on-demand data.
     * </p>
     * <p>
     * Features of the two types of session include the following:
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
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media
     * playlist contains all the fragments for the session, up to the number
     * that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The
     * playlist must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * <note>
     * <p>
     * The duration of the fragments in the HLS media playlists is typically
     * reported as short by one frame (for example, 33 milliseconds for a 30 FPS
     * fragment). This might cause the media player to report a shorter total
     * duration until the media player decodes the fragments.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * In both playback modes, if there are multiple fragments with the same
     * start time stamp, the fragment that has the larger fragment number (that
     * is, the newer fragment) is included in the HLS media playlist. The other
     * fragments are not included. Fragments that have different time stamps but
     * have overlapping durations are still included in the HLS media playlist.
     * This can lead to unexpected behavior in the media player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, ON_DEMAND
     */
    private String playbackMode;

    /**
     * <p>
     * The time range of the requested fragment, and the source of the time
     * stamp.
     * </p>
     * <p>
     * This parameter is required if <code>PlaybackMode</code> is
     * <code>ON_DEMAND</code>. This parameter is optional if
     * <code>PlaybackMode</code> is <code>LIVE</code>. If
     * <code>PlaybackMode</code> is <code>LIVE</code>, the
     * <code>FragmentSelectorType</code> can be set, but the
     * <code>TimestampRange</code> should not be set.
     * </p>
     */
    private HLSFragmentSelector hLSFragmentSelector;

    /**
     * The new value for the discontinuityMode property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     */
    private String discontinuityMode;

    /**
     * <p>
     * The time in seconds until the requested session expires. This value can
     * be between 300 (5 minutes) and 43200 (12 hours).
     * </p>
     * <p>
     * When a session expires, no new calls to <code>GetHLSMasterPlaylist</code>, <code>GetHLSMediaPlaylist</code>, <code>GetMP4InitFragment</code>, or
     * <code>GetMP4MediaFragment</code> can be made for that session.
     * </p>
     * <p>
     * The default is 3600 (one hour).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>300 - 43200<br/>
     */
    private Integer expires;

    /**
     * <p>
     * The maximum number of fragments that Kinesis Video Streams will return.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent
     * fragments are returned up to this value. When the
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments
     * are returned, up to this maximum number.
     * </p>
     * <p>
     * When there are more fragments available in a live HLS media playlist,
     * video players often buffer content before starting playback. Increasing
     * the buffer size increases the playback latency, but it decreases the
     * likelihood that rebuffering will occur during playback. We recommend that
     * a live HLS media playlist have a minimum of 3 fragments and a maximum of
     * 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is
     * <code>LIVE</code>, and 1000 if <code>PlaybackMode</code> is
     * <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 1000 fragments corresponds to more than 16 minutes
     * of video on streams with one-second fragments, and more than 2 1/2 hours
     * of video on streams with ten-second fragments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
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
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
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
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
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
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
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
     * Whether to retrieve live or archived, on-demand data.
     * </p>
     * <p>
     * Features of the two types of session include the following:
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
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media
     * playlist contains all the fragments for the session, up to the number
     * that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The
     * playlist must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * <note>
     * <p>
     * The duration of the fragments in the HLS media playlists is typically
     * reported as short by one frame (for example, 33 milliseconds for a 30 FPS
     * fragment). This might cause the media player to report a shorter total
     * duration until the media player decodes the fragments.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * In both playback modes, if there are multiple fragments with the same
     * start time stamp, the fragment that has the larger fragment number (that
     * is, the newer fragment) is included in the HLS media playlist. The other
     * fragments are not included. Fragments that have different time stamps but
     * have overlapping durations are still included in the HLS media playlist.
     * This can lead to unexpected behavior in the media player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, ON_DEMAND
     *
     * @return <p>
     *         Whether to retrieve live or archived, on-demand data.
     *         </p>
     *         <p>
     *         Features of the two types of session include the following:
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
     *         <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the
     *         HLS media playlist contains all the fragments for the session, up
     *         to the number that is specified in
     *         <code>MaxMediaPlaylistFragmentResults</code>. The playlist must
     *         be retrieved only once for each session. When this type of
     *         session is played in a media player, the user interface typically
     *         displays a scrubber control for choosing the position in the
     *         playback window to display.
     *         </p>
     *         <note>
     *         <p>
     *         The duration of the fragments in the HLS media playlists is
     *         typically reported as short by one frame (for example, 33
     *         milliseconds for a 30 FPS fragment). This might cause the media
     *         player to report a shorter total duration until the media player
     *         decodes the fragments.
     *         </p>
     *         </note></li>
     *         </ul>
     *         <p>
     *         In both playback modes, if there are multiple fragments with the
     *         same start time stamp, the fragment that has the larger fragment
     *         number (that is, the newer fragment) is included in the HLS media
     *         playlist. The other fragments are not included. Fragments that
     *         have different time stamps but have overlapping durations are
     *         still included in the HLS media playlist. This can lead to
     *         unexpected behavior in the media player.
     *         </p>
     *         <p>
     *         The default is <code>LIVE</code>.
     *         </p>
     * @see PlaybackMode
     */
    public String getPlaybackMode() {
        return playbackMode;
    }

    /**
     * <p>
     * Whether to retrieve live or archived, on-demand data.
     * </p>
     * <p>
     * Features of the two types of session include the following:
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
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media
     * playlist contains all the fragments for the session, up to the number
     * that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The
     * playlist must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * <note>
     * <p>
     * The duration of the fragments in the HLS media playlists is typically
     * reported as short by one frame (for example, 33 milliseconds for a 30 FPS
     * fragment). This might cause the media player to report a shorter total
     * duration until the media player decodes the fragments.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * In both playback modes, if there are multiple fragments with the same
     * start time stamp, the fragment that has the larger fragment number (that
     * is, the newer fragment) is included in the HLS media playlist. The other
     * fragments are not included. Fragments that have different time stamps but
     * have overlapping durations are still included in the HLS media playlist.
     * This can lead to unexpected behavior in the media player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, ON_DEMAND
     *
     * @param playbackMode <p>
     *            Whether to retrieve live or archived, on-demand data.
     *            </p>
     *            <p>
     *            Features of the two types of session include the following:
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
     *            <b> <code>ON_DEMAND</code> </b>: For sessions of this type,
     *            the HLS media playlist contains all the fragments for the
     *            session, up to the number that is specified in
     *            <code>MaxMediaPlaylistFragmentResults</code>. The playlist
     *            must be retrieved only once for each session. When this type
     *            of session is played in a media player, the user interface
     *            typically displays a scrubber control for choosing the
     *            position in the playback window to display.
     *            </p>
     *            <note>
     *            <p>
     *            The duration of the fragments in the HLS media playlists is
     *            typically reported as short by one frame (for example, 33
     *            milliseconds for a 30 FPS fragment). This might cause the
     *            media player to report a shorter total duration until the
     *            media player decodes the fragments.
     *            </p>
     *            </note></li>
     *            </ul>
     *            <p>
     *            In both playback modes, if there are multiple fragments with
     *            the same start time stamp, the fragment that has the larger
     *            fragment number (that is, the newer fragment) is included in
     *            the HLS media playlist. The other fragments are not included.
     *            Fragments that have different time stamps but have overlapping
     *            durations are still included in the HLS media playlist. This
     *            can lead to unexpected behavior in the media player.
     *            </p>
     *            <p>
     *            The default is <code>LIVE</code>.
     *            </p>
     * @see PlaybackMode
     */
    public void setPlaybackMode(String playbackMode) {
        this.playbackMode = playbackMode;
    }

    /**
     * <p>
     * Whether to retrieve live or archived, on-demand data.
     * </p>
     * <p>
     * Features of the two types of session include the following:
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
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media
     * playlist contains all the fragments for the session, up to the number
     * that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The
     * playlist must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * <note>
     * <p>
     * The duration of the fragments in the HLS media playlists is typically
     * reported as short by one frame (for example, 33 milliseconds for a 30 FPS
     * fragment). This might cause the media player to report a shorter total
     * duration until the media player decodes the fragments.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * In both playback modes, if there are multiple fragments with the same
     * start time stamp, the fragment that has the larger fragment number (that
     * is, the newer fragment) is included in the HLS media playlist. The other
     * fragments are not included. Fragments that have different time stamps but
     * have overlapping durations are still included in the HLS media playlist.
     * This can lead to unexpected behavior in the media player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, ON_DEMAND
     *
     * @param playbackMode <p>
     *            Whether to retrieve live or archived, on-demand data.
     *            </p>
     *            <p>
     *            Features of the two types of session include the following:
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
     *            <b> <code>ON_DEMAND</code> </b>: For sessions of this type,
     *            the HLS media playlist contains all the fragments for the
     *            session, up to the number that is specified in
     *            <code>MaxMediaPlaylistFragmentResults</code>. The playlist
     *            must be retrieved only once for each session. When this type
     *            of session is played in a media player, the user interface
     *            typically displays a scrubber control for choosing the
     *            position in the playback window to display.
     *            </p>
     *            <note>
     *            <p>
     *            The duration of the fragments in the HLS media playlists is
     *            typically reported as short by one frame (for example, 33
     *            milliseconds for a 30 FPS fragment). This might cause the
     *            media player to report a shorter total duration until the
     *            media player decodes the fragments.
     *            </p>
     *            </note></li>
     *            </ul>
     *            <p>
     *            In both playback modes, if there are multiple fragments with
     *            the same start time stamp, the fragment that has the larger
     *            fragment number (that is, the newer fragment) is included in
     *            the HLS media playlist. The other fragments are not included.
     *            Fragments that have different time stamps but have overlapping
     *            durations are still included in the HLS media playlist. This
     *            can lead to unexpected behavior in the media player.
     *            </p>
     *            <p>
     *            The default is <code>LIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlaybackMode
     */
    public GetHLSStreamingSessionURLRequest withPlaybackMode(String playbackMode) {
        this.playbackMode = playbackMode;
        return this;
    }

    /**
     * <p>
     * Whether to retrieve live or archived, on-demand data.
     * </p>
     * <p>
     * Features of the two types of session include the following:
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
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media
     * playlist contains all the fragments for the session, up to the number
     * that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The
     * playlist must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * <note>
     * <p>
     * The duration of the fragments in the HLS media playlists is typically
     * reported as short by one frame (for example, 33 milliseconds for a 30 FPS
     * fragment). This might cause the media player to report a shorter total
     * duration until the media player decodes the fragments.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * In both playback modes, if there are multiple fragments with the same
     * start time stamp, the fragment that has the larger fragment number (that
     * is, the newer fragment) is included in the HLS media playlist. The other
     * fragments are not included. Fragments that have different time stamps but
     * have overlapping durations are still included in the HLS media playlist.
     * This can lead to unexpected behavior in the media player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, ON_DEMAND
     *
     * @param playbackMode <p>
     *            Whether to retrieve live or archived, on-demand data.
     *            </p>
     *            <p>
     *            Features of the two types of session include the following:
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
     *            <b> <code>ON_DEMAND</code> </b>: For sessions of this type,
     *            the HLS media playlist contains all the fragments for the
     *            session, up to the number that is specified in
     *            <code>MaxMediaPlaylistFragmentResults</code>. The playlist
     *            must be retrieved only once for each session. When this type
     *            of session is played in a media player, the user interface
     *            typically displays a scrubber control for choosing the
     *            position in the playback window to display.
     *            </p>
     *            <note>
     *            <p>
     *            The duration of the fragments in the HLS media playlists is
     *            typically reported as short by one frame (for example, 33
     *            milliseconds for a 30 FPS fragment). This might cause the
     *            media player to report a shorter total duration until the
     *            media player decodes the fragments.
     *            </p>
     *            </note></li>
     *            </ul>
     *            <p>
     *            In both playback modes, if there are multiple fragments with
     *            the same start time stamp, the fragment that has the larger
     *            fragment number (that is, the newer fragment) is included in
     *            the HLS media playlist. The other fragments are not included.
     *            Fragments that have different time stamps but have overlapping
     *            durations are still included in the HLS media playlist. This
     *            can lead to unexpected behavior in the media player.
     *            </p>
     *            <p>
     *            The default is <code>LIVE</code>.
     *            </p>
     * @see PlaybackMode
     */
    public void setPlaybackMode(PlaybackMode playbackMode) {
        this.playbackMode = playbackMode.toString();
    }

    /**
     * <p>
     * Whether to retrieve live or archived, on-demand data.
     * </p>
     * <p>
     * Features of the two types of session include the following:
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
     * <b> <code>ON_DEMAND</code> </b>: For sessions of this type, the HLS media
     * playlist contains all the fragments for the session, up to the number
     * that is specified in <code>MaxMediaPlaylistFragmentResults</code>. The
     * playlist must be retrieved only once for each session. When this type of
     * session is played in a media player, the user interface typically
     * displays a scrubber control for choosing the position in the playback
     * window to display.
     * </p>
     * <note>
     * <p>
     * The duration of the fragments in the HLS media playlists is typically
     * reported as short by one frame (for example, 33 milliseconds for a 30 FPS
     * fragment). This might cause the media player to report a shorter total
     * duration until the media player decodes the fragments.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * In both playback modes, if there are multiple fragments with the same
     * start time stamp, the fragment that has the larger fragment number (that
     * is, the newer fragment) is included in the HLS media playlist. The other
     * fragments are not included. Fragments that have different time stamps but
     * have overlapping durations are still included in the HLS media playlist.
     * This can lead to unexpected behavior in the media player.
     * </p>
     * <p>
     * The default is <code>LIVE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, ON_DEMAND
     *
     * @param playbackMode <p>
     *            Whether to retrieve live or archived, on-demand data.
     *            </p>
     *            <p>
     *            Features of the two types of session include the following:
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
     *            <b> <code>ON_DEMAND</code> </b>: For sessions of this type,
     *            the HLS media playlist contains all the fragments for the
     *            session, up to the number that is specified in
     *            <code>MaxMediaPlaylistFragmentResults</code>. The playlist
     *            must be retrieved only once for each session. When this type
     *            of session is played in a media player, the user interface
     *            typically displays a scrubber control for choosing the
     *            position in the playback window to display.
     *            </p>
     *            <note>
     *            <p>
     *            The duration of the fragments in the HLS media playlists is
     *            typically reported as short by one frame (for example, 33
     *            milliseconds for a 30 FPS fragment). This might cause the
     *            media player to report a shorter total duration until the
     *            media player decodes the fragments.
     *            </p>
     *            </note></li>
     *            </ul>
     *            <p>
     *            In both playback modes, if there are multiple fragments with
     *            the same start time stamp, the fragment that has the larger
     *            fragment number (that is, the newer fragment) is included in
     *            the HLS media playlist. The other fragments are not included.
     *            Fragments that have different time stamps but have overlapping
     *            durations are still included in the HLS media playlist. This
     *            can lead to unexpected behavior in the media player.
     *            </p>
     *            <p>
     *            The default is <code>LIVE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PlaybackMode
     */
    public GetHLSStreamingSessionURLRequest withPlaybackMode(PlaybackMode playbackMode) {
        this.playbackMode = playbackMode.toString();
        return this;
    }

    /**
     * <p>
     * The time range of the requested fragment, and the source of the time
     * stamp.
     * </p>
     * <p>
     * This parameter is required if <code>PlaybackMode</code> is
     * <code>ON_DEMAND</code>. This parameter is optional if
     * <code>PlaybackMode</code> is <code>LIVE</code>. If
     * <code>PlaybackMode</code> is <code>LIVE</code>, the
     * <code>FragmentSelectorType</code> can be set, but the
     * <code>TimestampRange</code> should not be set.
     * </p>
     *
     * @return <p>
     *         The time range of the requested fragment, and the source of the
     *         time stamp.
     *         </p>
     *         <p>
     *         This parameter is required if <code>PlaybackMode</code> is
     *         <code>ON_DEMAND</code>. This parameter is optional if
     *         <code>PlaybackMode</code> is <code>LIVE</code>. If
     *         <code>PlaybackMode</code> is <code>LIVE</code>, the
     *         <code>FragmentSelectorType</code> can be set, but the
     *         <code>TimestampRange</code> should not be set.
     *         </p>
     */
    public HLSFragmentSelector getHLSFragmentSelector() {
        return hLSFragmentSelector;
    }

    /**
     * <p>
     * The time range of the requested fragment, and the source of the time
     * stamp.
     * </p>
     * <p>
     * This parameter is required if <code>PlaybackMode</code> is
     * <code>ON_DEMAND</code>. This parameter is optional if
     * <code>PlaybackMode</code> is <code>LIVE</code>. If
     * <code>PlaybackMode</code> is <code>LIVE</code>, the
     * <code>FragmentSelectorType</code> can be set, but the
     * <code>TimestampRange</code> should not be set.
     * </p>
     *
     * @param hLSFragmentSelector <p>
     *            The time range of the requested fragment, and the source of
     *            the time stamp.
     *            </p>
     *            <p>
     *            This parameter is required if <code>PlaybackMode</code> is
     *            <code>ON_DEMAND</code>. This parameter is optional if
     *            <code>PlaybackMode</code> is <code>LIVE</code>. If
     *            <code>PlaybackMode</code> is <code>LIVE</code>, the
     *            <code>FragmentSelectorType</code> can be set, but the
     *            <code>TimestampRange</code> should not be set.
     *            </p>
     */
    public void setHLSFragmentSelector(HLSFragmentSelector hLSFragmentSelector) {
        this.hLSFragmentSelector = hLSFragmentSelector;
    }

    /**
     * <p>
     * The time range of the requested fragment, and the source of the time
     * stamp.
     * </p>
     * <p>
     * This parameter is required if <code>PlaybackMode</code> is
     * <code>ON_DEMAND</code>. This parameter is optional if
     * <code>PlaybackMode</code> is <code>LIVE</code>. If
     * <code>PlaybackMode</code> is <code>LIVE</code>, the
     * <code>FragmentSelectorType</code> can be set, but the
     * <code>TimestampRange</code> should not be set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hLSFragmentSelector <p>
     *            The time range of the requested fragment, and the source of
     *            the time stamp.
     *            </p>
     *            <p>
     *            This parameter is required if <code>PlaybackMode</code> is
     *            <code>ON_DEMAND</code>. This parameter is optional if
     *            <code>PlaybackMode</code> is <code>LIVE</code>. If
     *            <code>PlaybackMode</code> is <code>LIVE</code>, the
     *            <code>FragmentSelectorType</code> can be set, but the
     *            <code>TimestampRange</code> should not be set.
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
     * Returns the value of the discontinuityMode property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @return The value of the discontinuityMode property for this object.
     * @see DiscontinuityMode
     */
    public String getDiscontinuityMode() {
        return discontinuityMode;
    }

    /**
     * Sets the value of discontinuityMode
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @param discontinuityMode The new value for the discontinuityMode property
     *            for this object.
     * @see DiscontinuityMode
     */
    public void setDiscontinuityMode(String discontinuityMode) {
        this.discontinuityMode = discontinuityMode;
    }

    /**
     * Sets the value of the discontinuityMode property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @param discontinuityMode The new value for the discontinuityMode property
     *            for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DiscontinuityMode
     */
    public GetHLSStreamingSessionURLRequest withDiscontinuityMode(String discontinuityMode) {
        this.discontinuityMode = discontinuityMode;
        return this;
    }

    /**
     * Sets the value of discontinuityMode
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @param discontinuityMode The new value for the discontinuityMode property
     *            for this object.
     * @see DiscontinuityMode
     */
    public void setDiscontinuityMode(DiscontinuityMode discontinuityMode) {
        this.discontinuityMode = discontinuityMode.toString();
    }

    /**
     * Sets the value of the discontinuityMode property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALWAYS, NEVER
     *
     * @param discontinuityMode The new value for the discontinuityMode property
     *            for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DiscontinuityMode
     */
    public GetHLSStreamingSessionURLRequest withDiscontinuityMode(
            DiscontinuityMode discontinuityMode) {
        this.discontinuityMode = discontinuityMode.toString();
        return this;
    }

    /**
     * <p>
     * The time in seconds until the requested session expires. This value can
     * be between 300 (5 minutes) and 43200 (12 hours).
     * </p>
     * <p>
     * When a session expires, no new calls to <code>GetHLSMasterPlaylist</code>, <code>GetHLSMediaPlaylist</code>, <code>GetMP4InitFragment</code>, or
     * <code>GetMP4MediaFragment</code> can be made for that session.
     * </p>
     * <p>
     * The default is 3600 (one hour).
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
     *         <code>GetHLSMediaPlaylist</code>, <code>GetMP4InitFragment</code>
     *         , or <code>GetMP4MediaFragment</code> can be made for that
     *         session.
     *         </p>
     *         <p>
     *         The default is 3600 (one hour).
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
     * When a session expires, no new calls to <code>GetHLSMasterPlaylist</code>, <code>GetHLSMediaPlaylist</code>, <code>GetMP4InitFragment</code>, or
     * <code>GetMP4MediaFragment</code> can be made for that session.
     * </p>
     * <p>
     * The default is 3600 (one hour).
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
     *            <code>GetMP4InitFragment</code>, or
     *            <code>GetMP4MediaFragment</code> can be made for that session.
     *            </p>
     *            <p>
     *            The default is 3600 (one hour).
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
     * When a session expires, no new calls to <code>GetHLSMasterPlaylist</code>, <code>GetHLSMediaPlaylist</code>, <code>GetMP4InitFragment</code>, or
     * <code>GetMP4MediaFragment</code> can be made for that session.
     * </p>
     * <p>
     * The default is 3600 (one hour).
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
     *            <code>GetMP4InitFragment</code>, or
     *            <code>GetMP4MediaFragment</code> can be made for that session.
     *            </p>
     *            <p>
     *            The default is 3600 (one hour).
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
     * The maximum number of fragments that Kinesis Video Streams will return.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent
     * fragments are returned up to this value. When the
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments
     * are returned, up to this maximum number.
     * </p>
     * <p>
     * When there are more fragments available in a live HLS media playlist,
     * video players often buffer content before starting playback. Increasing
     * the buffer size increases the playback latency, but it decreases the
     * likelihood that rebuffering will occur during playback. We recommend that
     * a live HLS media playlist have a minimum of 3 fragments and a maximum of
     * 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is
     * <code>LIVE</code>, and 1000 if <code>PlaybackMode</code> is
     * <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 1000 fragments corresponds to more than 16 minutes
     * of video on streams with one-second fragments, and more than 2 1/2 hours
     * of video on streams with ten-second fragments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of fragments that Kinesis Video Streams will
     *         return.
     *         </p>
     *         <p>
     *         When the <code>PlaybackMode</code> is <code>LIVE</code>, the most
     *         recent fragments are returned up to this value. When the
     *         <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest
     *         fragments are returned, up to this maximum number.
     *         </p>
     *         <p>
     *         When there are more fragments available in a live HLS media
     *         playlist, video players often buffer content before starting
     *         playback. Increasing the buffer size increases the playback
     *         latency, but it decreases the likelihood that rebuffering will
     *         occur during playback. We recommend that a live HLS media
     *         playlist have a minimum of 3 fragments and a maximum of 10
     *         fragments.
     *         </p>
     *         <p>
     *         The default is 5 fragments if <code>PlaybackMode</code> is
     *         <code>LIVE</code>, and 1000 if <code>PlaybackMode</code> is
     *         <code>ON_DEMAND</code>.
     *         </p>
     *         <p>
     *         The maximum value of 1000 fragments corresponds to more than 16
     *         minutes of video on streams with one-second fragments, and more
     *         than 2 1/2 hours of video on streams with ten-second fragments.
     *         </p>
     */
    public Long getMaxMediaPlaylistFragmentResults() {
        return maxMediaPlaylistFragmentResults;
    }

    /**
     * <p>
     * The maximum number of fragments that Kinesis Video Streams will return.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent
     * fragments are returned up to this value. When the
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments
     * are returned, up to this maximum number.
     * </p>
     * <p>
     * When there are more fragments available in a live HLS media playlist,
     * video players often buffer content before starting playback. Increasing
     * the buffer size increases the playback latency, but it decreases the
     * likelihood that rebuffering will occur during playback. We recommend that
     * a live HLS media playlist have a minimum of 3 fragments and a maximum of
     * 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is
     * <code>LIVE</code>, and 1000 if <code>PlaybackMode</code> is
     * <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 1000 fragments corresponds to more than 16 minutes
     * of video on streams with one-second fragments, and more than 2 1/2 hours
     * of video on streams with ten-second fragments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxMediaPlaylistFragmentResults <p>
     *            The maximum number of fragments that Kinesis Video Streams
     *            will return.
     *            </p>
     *            <p>
     *            When the <code>PlaybackMode</code> is <code>LIVE</code>, the
     *            most recent fragments are returned up to this value. When the
     *            <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the
     *            oldest fragments are returned, up to this maximum number.
     *            </p>
     *            <p>
     *            When there are more fragments available in a live HLS media
     *            playlist, video players often buffer content before starting
     *            playback. Increasing the buffer size increases the playback
     *            latency, but it decreases the likelihood that rebuffering will
     *            occur during playback. We recommend that a live HLS media
     *            playlist have a minimum of 3 fragments and a maximum of 10
     *            fragments.
     *            </p>
     *            <p>
     *            The default is 5 fragments if <code>PlaybackMode</code> is
     *            <code>LIVE</code>, and 1000 if <code>PlaybackMode</code> is
     *            <code>ON_DEMAND</code>.
     *            </p>
     *            <p>
     *            The maximum value of 1000 fragments corresponds to more than
     *            16 minutes of video on streams with one-second fragments, and
     *            more than 2 1/2 hours of video on streams with ten-second
     *            fragments.
     *            </p>
     */
    public void setMaxMediaPlaylistFragmentResults(Long maxMediaPlaylistFragmentResults) {
        this.maxMediaPlaylistFragmentResults = maxMediaPlaylistFragmentResults;
    }

    /**
     * <p>
     * The maximum number of fragments that Kinesis Video Streams will return.
     * </p>
     * <p>
     * When the <code>PlaybackMode</code> is <code>LIVE</code>, the most recent
     * fragments are returned up to this value. When the
     * <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the oldest fragments
     * are returned, up to this maximum number.
     * </p>
     * <p>
     * When there are more fragments available in a live HLS media playlist,
     * video players often buffer content before starting playback. Increasing
     * the buffer size increases the playback latency, but it decreases the
     * likelihood that rebuffering will occur during playback. We recommend that
     * a live HLS media playlist have a minimum of 3 fragments and a maximum of
     * 10 fragments.
     * </p>
     * <p>
     * The default is 5 fragments if <code>PlaybackMode</code> is
     * <code>LIVE</code>, and 1000 if <code>PlaybackMode</code> is
     * <code>ON_DEMAND</code>.
     * </p>
     * <p>
     * The maximum value of 1000 fragments corresponds to more than 16 minutes
     * of video on streams with one-second fragments, and more than 2 1/2 hours
     * of video on streams with ten-second fragments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxMediaPlaylistFragmentResults <p>
     *            The maximum number of fragments that Kinesis Video Streams
     *            will return.
     *            </p>
     *            <p>
     *            When the <code>PlaybackMode</code> is <code>LIVE</code>, the
     *            most recent fragments are returned up to this value. When the
     *            <code>PlaybackMode</code> is <code>ON_DEMAND</code>, the
     *            oldest fragments are returned, up to this maximum number.
     *            </p>
     *            <p>
     *            When there are more fragments available in a live HLS media
     *            playlist, video players often buffer content before starting
     *            playback. Increasing the buffer size increases the playback
     *            latency, but it decreases the likelihood that rebuffering will
     *            occur during playback. We recommend that a live HLS media
     *            playlist have a minimum of 3 fragments and a maximum of 10
     *            fragments.
     *            </p>
     *            <p>
     *            The default is 5 fragments if <code>PlaybackMode</code> is
     *            <code>LIVE</code>, and 1000 if <code>PlaybackMode</code> is
     *            <code>ON_DEMAND</code>.
     *            </p>
     *            <p>
     *            The maximum value of 1000 fragments corresponds to more than
     *            16 minutes of video on streams with one-second fragments, and
     *            more than 2 1/2 hours of video on streams with ten-second
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
        if (getDiscontinuityMode() != null)
            sb.append("DiscontinuityMode: " + getDiscontinuityMode() + ",");
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
                + ((getDiscontinuityMode() == null) ? 0 : getDiscontinuityMode().hashCode());
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
        if (other.getDiscontinuityMode() == null ^ this.getDiscontinuityMode() == null)
            return false;
        if (other.getDiscontinuityMode() != null
                && other.getDiscontinuityMode().equals(this.getDiscontinuityMode()) == false)
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
