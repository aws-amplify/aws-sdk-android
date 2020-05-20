/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Hls Group Settings
 */
public class HlsGroupSettings implements Serializable {
    /**
     * Choose one or more ad marker types to pass SCTE35 signals through to this
     * group of Apple HLS outputs.
     */
    private java.util.List<String> adMarkers;

    /**
     * A partial URI prefix that will be prepended to each output in the media
     * .m3u8 file. Can be used if base manifest is delivered from a different
     * URL than the main .m3u8 file.
     */
    private String baseUrlContent;

    /**
     * Optional. One value per output group. This field is required only if you
     * are completing Base URL content A, and the downstream system has notified
     * you that the media files for pipeline 1 of all outputs are in a location
     * different from the media files for pipeline 0.
     */
    private String baseUrlContent1;

    /**
     * A partial URI prefix that will be prepended to each output in the media
     * .m3u8 file. Can be used if base manifest is delivered from a different
     * URL than the main .m3u8 file.
     */
    private String baseUrlManifest;

    /**
     * Optional. One value per output group. Complete this field only if you are
     * completing Base URL manifest A, and the downstream system has notified
     * you that the child manifest files for pipeline 1 of all outputs are in a
     * location different from the child manifest files for pipeline 0.
     */
    private String baseUrlManifest1;

    /**
     * Mapping of up to 4 caption channels to caption languages. Is only
     * meaningful if captionLanguageSetting is set to "insert".
     */
    private java.util.List<CaptionLanguageMapping> captionLanguageMappings;

    /**
     * Applies only to 608 Embedded output captions. insert: Include
     * CLOSED-CAPTIONS lines in the manifest. Specify at least one language in
     * the CC1 Language Code field. One CLOSED-CAPTION line is added for each
     * Language Code you specify. Make sure to specify the languages in the
     * order in which they appear in the original source (if the source is
     * embedded format) or the order of the caption selectors (if the source is
     * other than embedded). Otherwise, languages in the manifest will not match
     * up properly with the output captions. none: Include CLOSED-CAPTIONS=NONE
     * line in the manifest. omit: Omit any CLOSED-CAPTIONS line from the
     * manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE, OMIT
     */
    private String captionLanguageSetting;

    /**
     * When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the
     * manifest, which prevents clients from saving media segments for later
     * replay.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String clientCache;

    /**
     * Specification to use (RFC-6381 or the default RFC-4281) during m3u8
     * playlist generation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RFC_4281, RFC_6381
     */
    private String codecSpecification;

    /**
     * For use with encryptionType. This is a 128-bit, 16-byte hex value
     * represented by a 32-character text string. If ivSource is set to
     * "explicit" then this parameter is required and is used as the IV for
     * encryption.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 32<br/>
     */
    private String constantIv;

    /**
     * A directory or HTTP destination for the HLS segments, manifest files, and
     * encryption keys (if enabled).
     */
    private OutputLocationRef destination;

    /**
     * Place segments in subdirectories.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM
     */
    private String directoryStructure;

    /**
     * Encrypts the segments with the given encryption scheme. Exclude this
     * parameter if no encryption is desired.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES128, SAMPLE_AES
     */
    private String encryptionType;

    /**
     * Parameters that control interactions with the CDN.
     */
    private HlsCdnSettings hlsCdnSettings;

    /**
     * State of HLS ID3 Segment Tagging
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String hlsId3SegmentTagging;

    /**
     * DISABLED: Do not create an I-frame-only manifest, but do create the
     * master and media manifests (according to the Output Selection field).
     * STANDARD: Create an I-frame-only manifest for each output that contains
     * video, as well as the other manifests (according to the Output Selection
     * field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY tag to
     * indicate it is I-frame only, and one or more #EXT-X-BYTERANGE entries
     * identifying the I-frame position. For example,
     * #EXT-X-BYTERANGE:160364@1461888"
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, STANDARD
     */
    private String iFrameOnlyPlaylists;

    /**
     * Applies only if Mode field is LIVE. Specifies the maximum number of
     * segments in the media manifest file. After this maximum, older segments
     * are removed from the media manifest. This number must be less than or
     * equal to the Keep Segments field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3 - <br/>
     */
    private Integer indexNSegments;

    /**
     * Parameter that control output group behavior on input loss.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     */
    private String inputLossAction;

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit
     * number used in conjunction with the key for encrypting blocks. If set to
     * "include", IV is listed in the manifest, otherwise the IV is not in the
     * manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     */
    private String ivInManifest;

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit
     * number used in conjunction with the key for encrypting blocks. If this
     * setting is "followsSegmentNumber", it will cause the IV to change every
     * segment (to match the segment number). If this is set to "explicit", you
     * must enter a constantIv value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPLICIT, FOLLOWS_SEGMENT_NUMBER
     */
    private String ivSource;

    /**
     * Applies only if Mode field is LIVE. Specifies the number of media
     * segments (.ts files) to retain in the destination directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer keepSegments;

    /**
     * The value specifies how the key is represented in the resource identified
     * by the URI. If parameter is absent, an implicit value of "identity" is
     * used. A reverse DNS string can also be given.
     */
    private String keyFormat;

    /**
     * Either a single positive integer version value or a slash delimited list
     * of version values (1/2/3).
     */
    private String keyFormatVersions;

    /**
     * The key provider settings.
     */
    private KeyProviderSettings keyProviderSettings;

    /**
     * When set to gzip, compresses HLS playlist.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GZIP, NONE
     */
    private String manifestCompression;

    /**
     * Indicates whether the output manifest should use floating point or
     * integer values for segment duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FLOATING_POINT, INTEGER
     */
    private String manifestDurationFormat;

    /**
     * When set, minimumSegmentLength is enforced by looking ahead and back
     * within the specified range for a nearby avail and extending the segment
     * size if needed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer minSegmentLength;

    /**
     * If "vod", all segments are indexed and kept permanently in the
     * destination and manifest. If "live", only the number segments specified
     * in keepSegments and indexNSegments are kept; newer segments replace older
     * segments, which may prevent players from rewinding all the way to the
     * beginning of the event. VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT
     * while the channel is running, converting it to a "VOD" type manifest on
     * completion of the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, VOD
     */
    private String mode;

    /**
     * MANIFESTS_AND_SEGMENTS: Generates manifests (master manifest, if
     * applicable, and media manifests) for this output group.
     * VARIANT_MANIFESTS_AND_SEGMENTS: Generates media manifests for this output
     * group, but not a master manifest. SEGMENTS_ONLY: Does not generate any
     * manifests for this output group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY
     */
    private String outputSelection;

    /**
     * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files.
     * The value is calculated as follows: either the program date and time are
     * initialized using the input timecode source, or the time is initialized
     * using the input timecode source and the date is initialized using the
     * timestampOffset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     */
    private String programDateTime;

    /**
     * Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3600<br/>
     */
    private Integer programDateTimePeriod;

    /**
     * ENABLED: The master manifest (.m3u8 file) for each pipeline includes
     * information about both pipelines: first its own media files, then the
     * media files of the other pipeline. This feature allows playout device
     * that support stale manifest detection to switch from one manifest to the
     * other, when the current manifest seems to be stale. There are still two
     * destinations and two master manifests, but both master manifests
     * reference the media files from both pipelines. DISABLED: The master
     * manifest (.m3u8 file) for each pipeline includes information about its
     * own pipeline only. For an HLS output group with MediaPackage as the
     * destination, the DISABLED behavior is always followed. MediaPackage
     * regenerates the manifests it serves to players so a redundant manifest
     * from MediaLive is irrelevant.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String redundantManifest;

    /**
     * Length of MPEG-2 Transport Stream segments to create (in seconds). Note
     * that segments will end on the next keyframe after this number of seconds,
     * so actual segment length may be longer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer segmentLength;

    /**
     * useInputSegmentation has been deprecated. The configured segment size is
     * always used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION
     */
    private String segmentationMode;

    /**
     * Number of segments to write to a subdirectory before starting a new one.
     * directoryStructure must be subdirectoryPerStream for this setting to have
     * an effect.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer segmentsPerSubdirectory;

    /**
     * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag
     * of variant manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     */
    private String streamInfResolution;

    /**
     * Indicates ID3 frame that has the timecode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, PRIV, TDRL
     */
    private String timedMetadataId3Frame;

    /**
     * Timed Metadata interval in seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer timedMetadataId3Period;

    /**
     * Provides an extra millisecond delta offset to fine tune the timestamps.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer timestampDeltaMilliseconds;

    /**
     * SEGMENTED_FILES: Emit the program as segments - multiple .ts media files.
     * SINGLE_FILE: Applies only if Mode field is VOD. Emit the program as a
     * single .ts media file. The media manifest includes #EXT-X-BYTERANGE tags
     * to index segments for playback. A typical use for this value is when
     * sending the output to AWS Elemental MediaConvert, which can accept only a
     * single media file. Playback while the channel is running is not
     * guaranteed due to HTTP server caching.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEGMENTED_FILES, SINGLE_FILE
     */
    private String tsFileMode;

    /**
     * Choose one or more ad marker types to pass SCTE35 signals through to this
     * group of Apple HLS outputs.
     *
     * @return Choose one or more ad marker types to pass SCTE35 signals through
     *         to this group of Apple HLS outputs.
     */
    public java.util.List<String> getAdMarkers() {
        return adMarkers;
    }

    /**
     * Choose one or more ad marker types to pass SCTE35 signals through to this
     * group of Apple HLS outputs.
     *
     * @param adMarkers Choose one or more ad marker types to pass SCTE35
     *            signals through to this group of Apple HLS outputs.
     */
    public void setAdMarkers(java.util.Collection<String> adMarkers) {
        if (adMarkers == null) {
            this.adMarkers = null;
            return;
        }

        this.adMarkers = new java.util.ArrayList<String>(adMarkers);
    }

    /**
     * Choose one or more ad marker types to pass SCTE35 signals through to this
     * group of Apple HLS outputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adMarkers Choose one or more ad marker types to pass SCTE35
     *            signals through to this group of Apple HLS outputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withAdMarkers(String... adMarkers) {
        if (getAdMarkers() == null) {
            this.adMarkers = new java.util.ArrayList<String>(adMarkers.length);
        }
        for (String value : adMarkers) {
            this.adMarkers.add(value);
        }
        return this;
    }

    /**
     * Choose one or more ad marker types to pass SCTE35 signals through to this
     * group of Apple HLS outputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adMarkers Choose one or more ad marker types to pass SCTE35
     *            signals through to this group of Apple HLS outputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withAdMarkers(java.util.Collection<String> adMarkers) {
        setAdMarkers(adMarkers);
        return this;
    }

    /**
     * A partial URI prefix that will be prepended to each output in the media
     * .m3u8 file. Can be used if base manifest is delivered from a different
     * URL than the main .m3u8 file.
     *
     * @return A partial URI prefix that will be prepended to each output in the
     *         media .m3u8 file. Can be used if base manifest is delivered from
     *         a different URL than the main .m3u8 file.
     */
    public String getBaseUrlContent() {
        return baseUrlContent;
    }

    /**
     * A partial URI prefix that will be prepended to each output in the media
     * .m3u8 file. Can be used if base manifest is delivered from a different
     * URL than the main .m3u8 file.
     *
     * @param baseUrlContent A partial URI prefix that will be prepended to each
     *            output in the media .m3u8 file. Can be used if base manifest
     *            is delivered from a different URL than the main .m3u8 file.
     */
    public void setBaseUrlContent(String baseUrlContent) {
        this.baseUrlContent = baseUrlContent;
    }

    /**
     * A partial URI prefix that will be prepended to each output in the media
     * .m3u8 file. Can be used if base manifest is delivered from a different
     * URL than the main .m3u8 file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baseUrlContent A partial URI prefix that will be prepended to each
     *            output in the media .m3u8 file. Can be used if base manifest
     *            is delivered from a different URL than the main .m3u8 file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withBaseUrlContent(String baseUrlContent) {
        this.baseUrlContent = baseUrlContent;
        return this;
    }

    /**
     * Optional. One value per output group. This field is required only if you
     * are completing Base URL content A, and the downstream system has notified
     * you that the media files for pipeline 1 of all outputs are in a location
     * different from the media files for pipeline 0.
     *
     * @return Optional. One value per output group. This field is required only
     *         if you are completing Base URL content A, and the downstream
     *         system has notified you that the media files for pipeline 1 of
     *         all outputs are in a location different from the media files for
     *         pipeline 0.
     */
    public String getBaseUrlContent1() {
        return baseUrlContent1;
    }

    /**
     * Optional. One value per output group. This field is required only if you
     * are completing Base URL content A, and the downstream system has notified
     * you that the media files for pipeline 1 of all outputs are in a location
     * different from the media files for pipeline 0.
     *
     * @param baseUrlContent1 Optional. One value per output group. This field
     *            is required only if you are completing Base URL content A, and
     *            the downstream system has notified you that the media files
     *            for pipeline 1 of all outputs are in a location different from
     *            the media files for pipeline 0.
     */
    public void setBaseUrlContent1(String baseUrlContent1) {
        this.baseUrlContent1 = baseUrlContent1;
    }

    /**
     * Optional. One value per output group. This field is required only if you
     * are completing Base URL content A, and the downstream system has notified
     * you that the media files for pipeline 1 of all outputs are in a location
     * different from the media files for pipeline 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baseUrlContent1 Optional. One value per output group. This field
     *            is required only if you are completing Base URL content A, and
     *            the downstream system has notified you that the media files
     *            for pipeline 1 of all outputs are in a location different from
     *            the media files for pipeline 0.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withBaseUrlContent1(String baseUrlContent1) {
        this.baseUrlContent1 = baseUrlContent1;
        return this;
    }

    /**
     * A partial URI prefix that will be prepended to each output in the media
     * .m3u8 file. Can be used if base manifest is delivered from a different
     * URL than the main .m3u8 file.
     *
     * @return A partial URI prefix that will be prepended to each output in the
     *         media .m3u8 file. Can be used if base manifest is delivered from
     *         a different URL than the main .m3u8 file.
     */
    public String getBaseUrlManifest() {
        return baseUrlManifest;
    }

    /**
     * A partial URI prefix that will be prepended to each output in the media
     * .m3u8 file. Can be used if base manifest is delivered from a different
     * URL than the main .m3u8 file.
     *
     * @param baseUrlManifest A partial URI prefix that will be prepended to
     *            each output in the media .m3u8 file. Can be used if base
     *            manifest is delivered from a different URL than the main .m3u8
     *            file.
     */
    public void setBaseUrlManifest(String baseUrlManifest) {
        this.baseUrlManifest = baseUrlManifest;
    }

    /**
     * A partial URI prefix that will be prepended to each output in the media
     * .m3u8 file. Can be used if base manifest is delivered from a different
     * URL than the main .m3u8 file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baseUrlManifest A partial URI prefix that will be prepended to
     *            each output in the media .m3u8 file. Can be used if base
     *            manifest is delivered from a different URL than the main .m3u8
     *            file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withBaseUrlManifest(String baseUrlManifest) {
        this.baseUrlManifest = baseUrlManifest;
        return this;
    }

    /**
     * Optional. One value per output group. Complete this field only if you are
     * completing Base URL manifest A, and the downstream system has notified
     * you that the child manifest files for pipeline 1 of all outputs are in a
     * location different from the child manifest files for pipeline 0.
     *
     * @return Optional. One value per output group. Complete this field only if
     *         you are completing Base URL manifest A, and the downstream system
     *         has notified you that the child manifest files for pipeline 1 of
     *         all outputs are in a location different from the child manifest
     *         files for pipeline 0.
     */
    public String getBaseUrlManifest1() {
        return baseUrlManifest1;
    }

    /**
     * Optional. One value per output group. Complete this field only if you are
     * completing Base URL manifest A, and the downstream system has notified
     * you that the child manifest files for pipeline 1 of all outputs are in a
     * location different from the child manifest files for pipeline 0.
     *
     * @param baseUrlManifest1 Optional. One value per output group. Complete
     *            this field only if you are completing Base URL manifest A, and
     *            the downstream system has notified you that the child manifest
     *            files for pipeline 1 of all outputs are in a location
     *            different from the child manifest files for pipeline 0.
     */
    public void setBaseUrlManifest1(String baseUrlManifest1) {
        this.baseUrlManifest1 = baseUrlManifest1;
    }

    /**
     * Optional. One value per output group. Complete this field only if you are
     * completing Base URL manifest A, and the downstream system has notified
     * you that the child manifest files for pipeline 1 of all outputs are in a
     * location different from the child manifest files for pipeline 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baseUrlManifest1 Optional. One value per output group. Complete
     *            this field only if you are completing Base URL manifest A, and
     *            the downstream system has notified you that the child manifest
     *            files for pipeline 1 of all outputs are in a location
     *            different from the child manifest files for pipeline 0.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withBaseUrlManifest1(String baseUrlManifest1) {
        this.baseUrlManifest1 = baseUrlManifest1;
        return this;
    }

    /**
     * Mapping of up to 4 caption channels to caption languages. Is only
     * meaningful if captionLanguageSetting is set to "insert".
     *
     * @return Mapping of up to 4 caption channels to caption languages. Is only
     *         meaningful if captionLanguageSetting is set to "insert".
     */
    public java.util.List<CaptionLanguageMapping> getCaptionLanguageMappings() {
        return captionLanguageMappings;
    }

    /**
     * Mapping of up to 4 caption channels to caption languages. Is only
     * meaningful if captionLanguageSetting is set to "insert".
     *
     * @param captionLanguageMappings Mapping of up to 4 caption channels to
     *            caption languages. Is only meaningful if
     *            captionLanguageSetting is set to "insert".
     */
    public void setCaptionLanguageMappings(
            java.util.Collection<CaptionLanguageMapping> captionLanguageMappings) {
        if (captionLanguageMappings == null) {
            this.captionLanguageMappings = null;
            return;
        }

        this.captionLanguageMappings = new java.util.ArrayList<CaptionLanguageMapping>(
                captionLanguageMappings);
    }

    /**
     * Mapping of up to 4 caption channels to caption languages. Is only
     * meaningful if captionLanguageSetting is set to "insert".
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param captionLanguageMappings Mapping of up to 4 caption channels to
     *            caption languages. Is only meaningful if
     *            captionLanguageSetting is set to "insert".
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withCaptionLanguageMappings(
            CaptionLanguageMapping... captionLanguageMappings) {
        if (getCaptionLanguageMappings() == null) {
            this.captionLanguageMappings = new java.util.ArrayList<CaptionLanguageMapping>(
                    captionLanguageMappings.length);
        }
        for (CaptionLanguageMapping value : captionLanguageMappings) {
            this.captionLanguageMappings.add(value);
        }
        return this;
    }

    /**
     * Mapping of up to 4 caption channels to caption languages. Is only
     * meaningful if captionLanguageSetting is set to "insert".
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param captionLanguageMappings Mapping of up to 4 caption channels to
     *            caption languages. Is only meaningful if
     *            captionLanguageSetting is set to "insert".
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withCaptionLanguageMappings(
            java.util.Collection<CaptionLanguageMapping> captionLanguageMappings) {
        setCaptionLanguageMappings(captionLanguageMappings);
        return this;
    }

    /**
     * Applies only to 608 Embedded output captions. insert: Include
     * CLOSED-CAPTIONS lines in the manifest. Specify at least one language in
     * the CC1 Language Code field. One CLOSED-CAPTION line is added for each
     * Language Code you specify. Make sure to specify the languages in the
     * order in which they appear in the original source (if the source is
     * embedded format) or the order of the caption selectors (if the source is
     * other than embedded). Otherwise, languages in the manifest will not match
     * up properly with the output captions. none: Include CLOSED-CAPTIONS=NONE
     * line in the manifest. omit: Omit any CLOSED-CAPTIONS line from the
     * manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE, OMIT
     *
     * @return Applies only to 608 Embedded output captions. insert: Include
     *         CLOSED-CAPTIONS lines in the manifest. Specify at least one
     *         language in the CC1 Language Code field. One CLOSED-CAPTION line
     *         is added for each Language Code you specify. Make sure to specify
     *         the languages in the order in which they appear in the original
     *         source (if the source is embedded format) or the order of the
     *         caption selectors (if the source is other than embedded).
     *         Otherwise, languages in the manifest will not match up properly
     *         with the output captions. none: Include CLOSED-CAPTIONS=NONE line
     *         in the manifest. omit: Omit any CLOSED-CAPTIONS line from the
     *         manifest.
     * @see HlsCaptionLanguageSetting
     */
    public String getCaptionLanguageSetting() {
        return captionLanguageSetting;
    }

    /**
     * Applies only to 608 Embedded output captions. insert: Include
     * CLOSED-CAPTIONS lines in the manifest. Specify at least one language in
     * the CC1 Language Code field. One CLOSED-CAPTION line is added for each
     * Language Code you specify. Make sure to specify the languages in the
     * order in which they appear in the original source (if the source is
     * embedded format) or the order of the caption selectors (if the source is
     * other than embedded). Otherwise, languages in the manifest will not match
     * up properly with the output captions. none: Include CLOSED-CAPTIONS=NONE
     * line in the manifest. omit: Omit any CLOSED-CAPTIONS line from the
     * manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE, OMIT
     *
     * @param captionLanguageSetting Applies only to 608 Embedded output
     *            captions. insert: Include CLOSED-CAPTIONS lines in the
     *            manifest. Specify at least one language in the CC1 Language
     *            Code field. One CLOSED-CAPTION line is added for each Language
     *            Code you specify. Make sure to specify the languages in the
     *            order in which they appear in the original source (if the
     *            source is embedded format) or the order of the caption
     *            selectors (if the source is other than embedded). Otherwise,
     *            languages in the manifest will not match up properly with the
     *            output captions. none: Include CLOSED-CAPTIONS=NONE line in
     *            the manifest. omit: Omit any CLOSED-CAPTIONS line from the
     *            manifest.
     * @see HlsCaptionLanguageSetting
     */
    public void setCaptionLanguageSetting(String captionLanguageSetting) {
        this.captionLanguageSetting = captionLanguageSetting;
    }

    /**
     * Applies only to 608 Embedded output captions. insert: Include
     * CLOSED-CAPTIONS lines in the manifest. Specify at least one language in
     * the CC1 Language Code field. One CLOSED-CAPTION line is added for each
     * Language Code you specify. Make sure to specify the languages in the
     * order in which they appear in the original source (if the source is
     * embedded format) or the order of the caption selectors (if the source is
     * other than embedded). Otherwise, languages in the manifest will not match
     * up properly with the output captions. none: Include CLOSED-CAPTIONS=NONE
     * line in the manifest. omit: Omit any CLOSED-CAPTIONS line from the
     * manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE, OMIT
     *
     * @param captionLanguageSetting Applies only to 608 Embedded output
     *            captions. insert: Include CLOSED-CAPTIONS lines in the
     *            manifest. Specify at least one language in the CC1 Language
     *            Code field. One CLOSED-CAPTION line is added for each Language
     *            Code you specify. Make sure to specify the languages in the
     *            order in which they appear in the original source (if the
     *            source is embedded format) or the order of the caption
     *            selectors (if the source is other than embedded). Otherwise,
     *            languages in the manifest will not match up properly with the
     *            output captions. none: Include CLOSED-CAPTIONS=NONE line in
     *            the manifest. omit: Omit any CLOSED-CAPTIONS line from the
     *            manifest.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsCaptionLanguageSetting
     */
    public HlsGroupSettings withCaptionLanguageSetting(String captionLanguageSetting) {
        this.captionLanguageSetting = captionLanguageSetting;
        return this;
    }

    /**
     * Applies only to 608 Embedded output captions. insert: Include
     * CLOSED-CAPTIONS lines in the manifest. Specify at least one language in
     * the CC1 Language Code field. One CLOSED-CAPTION line is added for each
     * Language Code you specify. Make sure to specify the languages in the
     * order in which they appear in the original source (if the source is
     * embedded format) or the order of the caption selectors (if the source is
     * other than embedded). Otherwise, languages in the manifest will not match
     * up properly with the output captions. none: Include CLOSED-CAPTIONS=NONE
     * line in the manifest. omit: Omit any CLOSED-CAPTIONS line from the
     * manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE, OMIT
     *
     * @param captionLanguageSetting Applies only to 608 Embedded output
     *            captions. insert: Include CLOSED-CAPTIONS lines in the
     *            manifest. Specify at least one language in the CC1 Language
     *            Code field. One CLOSED-CAPTION line is added for each Language
     *            Code you specify. Make sure to specify the languages in the
     *            order in which they appear in the original source (if the
     *            source is embedded format) or the order of the caption
     *            selectors (if the source is other than embedded). Otherwise,
     *            languages in the manifest will not match up properly with the
     *            output captions. none: Include CLOSED-CAPTIONS=NONE line in
     *            the manifest. omit: Omit any CLOSED-CAPTIONS line from the
     *            manifest.
     * @see HlsCaptionLanguageSetting
     */
    public void setCaptionLanguageSetting(HlsCaptionLanguageSetting captionLanguageSetting) {
        this.captionLanguageSetting = captionLanguageSetting.toString();
    }

    /**
     * Applies only to 608 Embedded output captions. insert: Include
     * CLOSED-CAPTIONS lines in the manifest. Specify at least one language in
     * the CC1 Language Code field. One CLOSED-CAPTION line is added for each
     * Language Code you specify. Make sure to specify the languages in the
     * order in which they appear in the original source (if the source is
     * embedded format) or the order of the caption selectors (if the source is
     * other than embedded). Otherwise, languages in the manifest will not match
     * up properly with the output captions. none: Include CLOSED-CAPTIONS=NONE
     * line in the manifest. omit: Omit any CLOSED-CAPTIONS line from the
     * manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE, OMIT
     *
     * @param captionLanguageSetting Applies only to 608 Embedded output
     *            captions. insert: Include CLOSED-CAPTIONS lines in the
     *            manifest. Specify at least one language in the CC1 Language
     *            Code field. One CLOSED-CAPTION line is added for each Language
     *            Code you specify. Make sure to specify the languages in the
     *            order in which they appear in the original source (if the
     *            source is embedded format) or the order of the caption
     *            selectors (if the source is other than embedded). Otherwise,
     *            languages in the manifest will not match up properly with the
     *            output captions. none: Include CLOSED-CAPTIONS=NONE line in
     *            the manifest. omit: Omit any CLOSED-CAPTIONS line from the
     *            manifest.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsCaptionLanguageSetting
     */
    public HlsGroupSettings withCaptionLanguageSetting(
            HlsCaptionLanguageSetting captionLanguageSetting) {
        this.captionLanguageSetting = captionLanguageSetting.toString();
        return this;
    }

    /**
     * When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the
     * manifest, which prevents clients from saving media segments for later
     * replay.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the
     *         manifest, which prevents clients from saving media segments for
     *         later replay.
     * @see HlsClientCache
     */
    public String getClientCache() {
        return clientCache;
    }

    /**
     * When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the
     * manifest, which prevents clients from saving media segments for later
     * replay.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param clientCache When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no
     *            tag in the manifest, which prevents clients from saving media
     *            segments for later replay.
     * @see HlsClientCache
     */
    public void setClientCache(String clientCache) {
        this.clientCache = clientCache;
    }

    /**
     * When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the
     * manifest, which prevents clients from saving media segments for later
     * replay.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param clientCache When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no
     *            tag in the manifest, which prevents clients from saving media
     *            segments for later replay.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsClientCache
     */
    public HlsGroupSettings withClientCache(String clientCache) {
        this.clientCache = clientCache;
        return this;
    }

    /**
     * When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the
     * manifest, which prevents clients from saving media segments for later
     * replay.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param clientCache When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no
     *            tag in the manifest, which prevents clients from saving media
     *            segments for later replay.
     * @see HlsClientCache
     */
    public void setClientCache(HlsClientCache clientCache) {
        this.clientCache = clientCache.toString();
    }

    /**
     * When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no tag in the
     * manifest, which prevents clients from saving media segments for later
     * replay.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param clientCache When set to "disabled", sets the #EXT-X-ALLOW-CACHE:no
     *            tag in the manifest, which prevents clients from saving media
     *            segments for later replay.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsClientCache
     */
    public HlsGroupSettings withClientCache(HlsClientCache clientCache) {
        this.clientCache = clientCache.toString();
        return this;
    }

    /**
     * Specification to use (RFC-6381 or the default RFC-4281) during m3u8
     * playlist generation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RFC_4281, RFC_6381
     *
     * @return Specification to use (RFC-6381 or the default RFC-4281) during
     *         m3u8 playlist generation.
     * @see HlsCodecSpecification
     */
    public String getCodecSpecification() {
        return codecSpecification;
    }

    /**
     * Specification to use (RFC-6381 or the default RFC-4281) during m3u8
     * playlist generation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RFC_4281, RFC_6381
     *
     * @param codecSpecification Specification to use (RFC-6381 or the default
     *            RFC-4281) during m3u8 playlist generation.
     * @see HlsCodecSpecification
     */
    public void setCodecSpecification(String codecSpecification) {
        this.codecSpecification = codecSpecification;
    }

    /**
     * Specification to use (RFC-6381 or the default RFC-4281) during m3u8
     * playlist generation.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RFC_4281, RFC_6381
     *
     * @param codecSpecification Specification to use (RFC-6381 or the default
     *            RFC-4281) during m3u8 playlist generation.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsCodecSpecification
     */
    public HlsGroupSettings withCodecSpecification(String codecSpecification) {
        this.codecSpecification = codecSpecification;
        return this;
    }

    /**
     * Specification to use (RFC-6381 or the default RFC-4281) during m3u8
     * playlist generation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RFC_4281, RFC_6381
     *
     * @param codecSpecification Specification to use (RFC-6381 or the default
     *            RFC-4281) during m3u8 playlist generation.
     * @see HlsCodecSpecification
     */
    public void setCodecSpecification(HlsCodecSpecification codecSpecification) {
        this.codecSpecification = codecSpecification.toString();
    }

    /**
     * Specification to use (RFC-6381 or the default RFC-4281) during m3u8
     * playlist generation.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RFC_4281, RFC_6381
     *
     * @param codecSpecification Specification to use (RFC-6381 or the default
     *            RFC-4281) during m3u8 playlist generation.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsCodecSpecification
     */
    public HlsGroupSettings withCodecSpecification(HlsCodecSpecification codecSpecification) {
        this.codecSpecification = codecSpecification.toString();
        return this;
    }

    /**
     * For use with encryptionType. This is a 128-bit, 16-byte hex value
     * represented by a 32-character text string. If ivSource is set to
     * "explicit" then this parameter is required and is used as the IV for
     * encryption.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 32<br/>
     *
     * @return For use with encryptionType. This is a 128-bit, 16-byte hex value
     *         represented by a 32-character text string. If ivSource is set to
     *         "explicit" then this parameter is required and is used as the IV
     *         for encryption.
     */
    public String getConstantIv() {
        return constantIv;
    }

    /**
     * For use with encryptionType. This is a 128-bit, 16-byte hex value
     * represented by a 32-character text string. If ivSource is set to
     * "explicit" then this parameter is required and is used as the IV for
     * encryption.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 32<br/>
     *
     * @param constantIv For use with encryptionType. This is a 128-bit, 16-byte
     *            hex value represented by a 32-character text string. If
     *            ivSource is set to "explicit" then this parameter is required
     *            and is used as the IV for encryption.
     */
    public void setConstantIv(String constantIv) {
        this.constantIv = constantIv;
    }

    /**
     * For use with encryptionType. This is a 128-bit, 16-byte hex value
     * represented by a 32-character text string. If ivSource is set to
     * "explicit" then this parameter is required and is used as the IV for
     * encryption.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 32<br/>
     *
     * @param constantIv For use with encryptionType. This is a 128-bit, 16-byte
     *            hex value represented by a 32-character text string. If
     *            ivSource is set to "explicit" then this parameter is required
     *            and is used as the IV for encryption.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withConstantIv(String constantIv) {
        this.constantIv = constantIv;
        return this;
    }

    /**
     * A directory or HTTP destination for the HLS segments, manifest files, and
     * encryption keys (if enabled).
     *
     * @return A directory or HTTP destination for the HLS segments, manifest
     *         files, and encryption keys (if enabled).
     */
    public OutputLocationRef getDestination() {
        return destination;
    }

    /**
     * A directory or HTTP destination for the HLS segments, manifest files, and
     * encryption keys (if enabled).
     *
     * @param destination A directory or HTTP destination for the HLS segments,
     *            manifest files, and encryption keys (if enabled).
     */
    public void setDestination(OutputLocationRef destination) {
        this.destination = destination;
    }

    /**
     * A directory or HTTP destination for the HLS segments, manifest files, and
     * encryption keys (if enabled).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destination A directory or HTTP destination for the HLS segments,
     *            manifest files, and encryption keys (if enabled).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withDestination(OutputLocationRef destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Place segments in subdirectories.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM
     *
     * @return Place segments in subdirectories.
     * @see HlsDirectoryStructure
     */
    public String getDirectoryStructure() {
        return directoryStructure;
    }

    /**
     * Place segments in subdirectories.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM
     *
     * @param directoryStructure Place segments in subdirectories.
     * @see HlsDirectoryStructure
     */
    public void setDirectoryStructure(String directoryStructure) {
        this.directoryStructure = directoryStructure;
    }

    /**
     * Place segments in subdirectories.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM
     *
     * @param directoryStructure Place segments in subdirectories.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsDirectoryStructure
     */
    public HlsGroupSettings withDirectoryStructure(String directoryStructure) {
        this.directoryStructure = directoryStructure;
        return this;
    }

    /**
     * Place segments in subdirectories.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM
     *
     * @param directoryStructure Place segments in subdirectories.
     * @see HlsDirectoryStructure
     */
    public void setDirectoryStructure(HlsDirectoryStructure directoryStructure) {
        this.directoryStructure = directoryStructure.toString();
    }

    /**
     * Place segments in subdirectories.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM
     *
     * @param directoryStructure Place segments in subdirectories.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsDirectoryStructure
     */
    public HlsGroupSettings withDirectoryStructure(HlsDirectoryStructure directoryStructure) {
        this.directoryStructure = directoryStructure.toString();
        return this;
    }

    /**
     * Encrypts the segments with the given encryption scheme. Exclude this
     * parameter if no encryption is desired.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES128, SAMPLE_AES
     *
     * @return Encrypts the segments with the given encryption scheme. Exclude
     *         this parameter if no encryption is desired.
     * @see HlsEncryptionType
     */
    public String getEncryptionType() {
        return encryptionType;
    }

    /**
     * Encrypts the segments with the given encryption scheme. Exclude this
     * parameter if no encryption is desired.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES128, SAMPLE_AES
     *
     * @param encryptionType Encrypts the segments with the given encryption
     *            scheme. Exclude this parameter if no encryption is desired.
     * @see HlsEncryptionType
     */
    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * Encrypts the segments with the given encryption scheme. Exclude this
     * parameter if no encryption is desired.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES128, SAMPLE_AES
     *
     * @param encryptionType Encrypts the segments with the given encryption
     *            scheme. Exclude this parameter if no encryption is desired.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsEncryptionType
     */
    public HlsGroupSettings withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * Encrypts the segments with the given encryption scheme. Exclude this
     * parameter if no encryption is desired.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES128, SAMPLE_AES
     *
     * @param encryptionType Encrypts the segments with the given encryption
     *            scheme. Exclude this parameter if no encryption is desired.
     * @see HlsEncryptionType
     */
    public void setEncryptionType(HlsEncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
    }

    /**
     * Encrypts the segments with the given encryption scheme. Exclude this
     * parameter if no encryption is desired.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES128, SAMPLE_AES
     *
     * @param encryptionType Encrypts the segments with the given encryption
     *            scheme. Exclude this parameter if no encryption is desired.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsEncryptionType
     */
    public HlsGroupSettings withEncryptionType(HlsEncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * Parameters that control interactions with the CDN.
     *
     * @return Parameters that control interactions with the CDN.
     */
    public HlsCdnSettings getHlsCdnSettings() {
        return hlsCdnSettings;
    }

    /**
     * Parameters that control interactions with the CDN.
     *
     * @param hlsCdnSettings Parameters that control interactions with the CDN.
     */
    public void setHlsCdnSettings(HlsCdnSettings hlsCdnSettings) {
        this.hlsCdnSettings = hlsCdnSettings;
    }

    /**
     * Parameters that control interactions with the CDN.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hlsCdnSettings Parameters that control interactions with the CDN.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withHlsCdnSettings(HlsCdnSettings hlsCdnSettings) {
        this.hlsCdnSettings = hlsCdnSettings;
        return this;
    }

    /**
     * State of HLS ID3 Segment Tagging
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return State of HLS ID3 Segment Tagging
     * @see HlsId3SegmentTaggingState
     */
    public String getHlsId3SegmentTagging() {
        return hlsId3SegmentTagging;
    }

    /**
     * State of HLS ID3 Segment Tagging
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param hlsId3SegmentTagging State of HLS ID3 Segment Tagging
     * @see HlsId3SegmentTaggingState
     */
    public void setHlsId3SegmentTagging(String hlsId3SegmentTagging) {
        this.hlsId3SegmentTagging = hlsId3SegmentTagging;
    }

    /**
     * State of HLS ID3 Segment Tagging
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param hlsId3SegmentTagging State of HLS ID3 Segment Tagging
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsId3SegmentTaggingState
     */
    public HlsGroupSettings withHlsId3SegmentTagging(String hlsId3SegmentTagging) {
        this.hlsId3SegmentTagging = hlsId3SegmentTagging;
        return this;
    }

    /**
     * State of HLS ID3 Segment Tagging
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param hlsId3SegmentTagging State of HLS ID3 Segment Tagging
     * @see HlsId3SegmentTaggingState
     */
    public void setHlsId3SegmentTagging(HlsId3SegmentTaggingState hlsId3SegmentTagging) {
        this.hlsId3SegmentTagging = hlsId3SegmentTagging.toString();
    }

    /**
     * State of HLS ID3 Segment Tagging
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param hlsId3SegmentTagging State of HLS ID3 Segment Tagging
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsId3SegmentTaggingState
     */
    public HlsGroupSettings withHlsId3SegmentTagging(HlsId3SegmentTaggingState hlsId3SegmentTagging) {
        this.hlsId3SegmentTagging = hlsId3SegmentTagging.toString();
        return this;
    }

    /**
     * DISABLED: Do not create an I-frame-only manifest, but do create the
     * master and media manifests (according to the Output Selection field).
     * STANDARD: Create an I-frame-only manifest for each output that contains
     * video, as well as the other manifests (according to the Output Selection
     * field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY tag to
     * indicate it is I-frame only, and one or more #EXT-X-BYTERANGE entries
     * identifying the I-frame position. For example,
     * #EXT-X-BYTERANGE:160364@1461888"
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, STANDARD
     *
     * @return DISABLED: Do not create an I-frame-only manifest, but do create
     *         the master and media manifests (according to the Output Selection
     *         field). STANDARD: Create an I-frame-only manifest for each output
     *         that contains video, as well as the other manifests (according to
     *         the Output Selection field). The I-frame manifest contains a
     *         #EXT-X-I-FRAMES-ONLY tag to indicate it is I-frame only, and one
     *         or more #EXT-X-BYTERANGE entries identifying the I-frame
     *         position. For example, #EXT-X-BYTERANGE:160364@1461888"
     * @see IFrameOnlyPlaylistType
     */
    public String getIFrameOnlyPlaylists() {
        return iFrameOnlyPlaylists;
    }

    /**
     * DISABLED: Do not create an I-frame-only manifest, but do create the
     * master and media manifests (according to the Output Selection field).
     * STANDARD: Create an I-frame-only manifest for each output that contains
     * video, as well as the other manifests (according to the Output Selection
     * field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY tag to
     * indicate it is I-frame only, and one or more #EXT-X-BYTERANGE entries
     * identifying the I-frame position. For example,
     * #EXT-X-BYTERANGE:160364@1461888"
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, STANDARD
     *
     * @param iFrameOnlyPlaylists DISABLED: Do not create an I-frame-only
     *            manifest, but do create the master and media manifests
     *            (according to the Output Selection field). STANDARD: Create an
     *            I-frame-only manifest for each output that contains video, as
     *            well as the other manifests (according to the Output Selection
     *            field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY
     *            tag to indicate it is I-frame only, and one or more
     *            #EXT-X-BYTERANGE entries identifying the I-frame position. For
     *            example, #EXT-X-BYTERANGE:160364@1461888"
     * @see IFrameOnlyPlaylistType
     */
    public void setIFrameOnlyPlaylists(String iFrameOnlyPlaylists) {
        this.iFrameOnlyPlaylists = iFrameOnlyPlaylists;
    }

    /**
     * DISABLED: Do not create an I-frame-only manifest, but do create the
     * master and media manifests (according to the Output Selection field).
     * STANDARD: Create an I-frame-only manifest for each output that contains
     * video, as well as the other manifests (according to the Output Selection
     * field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY tag to
     * indicate it is I-frame only, and one or more #EXT-X-BYTERANGE entries
     * identifying the I-frame position. For example,
     * #EXT-X-BYTERANGE:160364@1461888"
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, STANDARD
     *
     * @param iFrameOnlyPlaylists DISABLED: Do not create an I-frame-only
     *            manifest, but do create the master and media manifests
     *            (according to the Output Selection field). STANDARD: Create an
     *            I-frame-only manifest for each output that contains video, as
     *            well as the other manifests (according to the Output Selection
     *            field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY
     *            tag to indicate it is I-frame only, and one or more
     *            #EXT-X-BYTERANGE entries identifying the I-frame position. For
     *            example, #EXT-X-BYTERANGE:160364@1461888"
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IFrameOnlyPlaylistType
     */
    public HlsGroupSettings withIFrameOnlyPlaylists(String iFrameOnlyPlaylists) {
        this.iFrameOnlyPlaylists = iFrameOnlyPlaylists;
        return this;
    }

    /**
     * DISABLED: Do not create an I-frame-only manifest, but do create the
     * master and media manifests (according to the Output Selection field).
     * STANDARD: Create an I-frame-only manifest for each output that contains
     * video, as well as the other manifests (according to the Output Selection
     * field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY tag to
     * indicate it is I-frame only, and one or more #EXT-X-BYTERANGE entries
     * identifying the I-frame position. For example,
     * #EXT-X-BYTERANGE:160364@1461888"
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, STANDARD
     *
     * @param iFrameOnlyPlaylists DISABLED: Do not create an I-frame-only
     *            manifest, but do create the master and media manifests
     *            (according to the Output Selection field). STANDARD: Create an
     *            I-frame-only manifest for each output that contains video, as
     *            well as the other manifests (according to the Output Selection
     *            field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY
     *            tag to indicate it is I-frame only, and one or more
     *            #EXT-X-BYTERANGE entries identifying the I-frame position. For
     *            example, #EXT-X-BYTERANGE:160364@1461888"
     * @see IFrameOnlyPlaylistType
     */
    public void setIFrameOnlyPlaylists(IFrameOnlyPlaylistType iFrameOnlyPlaylists) {
        this.iFrameOnlyPlaylists = iFrameOnlyPlaylists.toString();
    }

    /**
     * DISABLED: Do not create an I-frame-only manifest, but do create the
     * master and media manifests (according to the Output Selection field).
     * STANDARD: Create an I-frame-only manifest for each output that contains
     * video, as well as the other manifests (according to the Output Selection
     * field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY tag to
     * indicate it is I-frame only, and one or more #EXT-X-BYTERANGE entries
     * identifying the I-frame position. For example,
     * #EXT-X-BYTERANGE:160364@1461888"
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, STANDARD
     *
     * @param iFrameOnlyPlaylists DISABLED: Do not create an I-frame-only
     *            manifest, but do create the master and media manifests
     *            (according to the Output Selection field). STANDARD: Create an
     *            I-frame-only manifest for each output that contains video, as
     *            well as the other manifests (according to the Output Selection
     *            field). The I-frame manifest contains a #EXT-X-I-FRAMES-ONLY
     *            tag to indicate it is I-frame only, and one or more
     *            #EXT-X-BYTERANGE entries identifying the I-frame position. For
     *            example, #EXT-X-BYTERANGE:160364@1461888"
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IFrameOnlyPlaylistType
     */
    public HlsGroupSettings withIFrameOnlyPlaylists(IFrameOnlyPlaylistType iFrameOnlyPlaylists) {
        this.iFrameOnlyPlaylists = iFrameOnlyPlaylists.toString();
        return this;
    }

    /**
     * Applies only if Mode field is LIVE. Specifies the maximum number of
     * segments in the media manifest file. After this maximum, older segments
     * are removed from the media manifest. This number must be less than or
     * equal to the Keep Segments field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3 - <br/>
     *
     * @return Applies only if Mode field is LIVE. Specifies the maximum number
     *         of segments in the media manifest file. After this maximum, older
     *         segments are removed from the media manifest. This number must be
     *         less than or equal to the Keep Segments field.
     */
    public Integer getIndexNSegments() {
        return indexNSegments;
    }

    /**
     * Applies only if Mode field is LIVE. Specifies the maximum number of
     * segments in the media manifest file. After this maximum, older segments
     * are removed from the media manifest. This number must be less than or
     * equal to the Keep Segments field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3 - <br/>
     *
     * @param indexNSegments Applies only if Mode field is LIVE. Specifies the
     *            maximum number of segments in the media manifest file. After
     *            this maximum, older segments are removed from the media
     *            manifest. This number must be less than or equal to the Keep
     *            Segments field.
     */
    public void setIndexNSegments(Integer indexNSegments) {
        this.indexNSegments = indexNSegments;
    }

    /**
     * Applies only if Mode field is LIVE. Specifies the maximum number of
     * segments in the media manifest file. After this maximum, older segments
     * are removed from the media manifest. This number must be less than or
     * equal to the Keep Segments field.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3 - <br/>
     *
     * @param indexNSegments Applies only if Mode field is LIVE. Specifies the
     *            maximum number of segments in the media manifest file. After
     *            this maximum, older segments are removed from the media
     *            manifest. This number must be less than or equal to the Keep
     *            Segments field.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withIndexNSegments(Integer indexNSegments) {
        this.indexNSegments = indexNSegments;
        return this;
    }

    /**
     * Parameter that control output group behavior on input loss.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     *
     * @return Parameter that control output group behavior on input loss.
     * @see InputLossActionForHlsOut
     */
    public String getInputLossAction() {
        return inputLossAction;
    }

    /**
     * Parameter that control output group behavior on input loss.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     *
     * @param inputLossAction Parameter that control output group behavior on
     *            input loss.
     * @see InputLossActionForHlsOut
     */
    public void setInputLossAction(String inputLossAction) {
        this.inputLossAction = inputLossAction;
    }

    /**
     * Parameter that control output group behavior on input loss.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     *
     * @param inputLossAction Parameter that control output group behavior on
     *            input loss.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputLossActionForHlsOut
     */
    public HlsGroupSettings withInputLossAction(String inputLossAction) {
        this.inputLossAction = inputLossAction;
        return this;
    }

    /**
     * Parameter that control output group behavior on input loss.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     *
     * @param inputLossAction Parameter that control output group behavior on
     *            input loss.
     * @see InputLossActionForHlsOut
     */
    public void setInputLossAction(InputLossActionForHlsOut inputLossAction) {
        this.inputLossAction = inputLossAction.toString();
    }

    /**
     * Parameter that control output group behavior on input loss.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMIT_OUTPUT, PAUSE_OUTPUT
     *
     * @param inputLossAction Parameter that control output group behavior on
     *            input loss.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputLossActionForHlsOut
     */
    public HlsGroupSettings withInputLossAction(InputLossActionForHlsOut inputLossAction) {
        this.inputLossAction = inputLossAction.toString();
        return this;
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit
     * number used in conjunction with the key for encrypting blocks. If set to
     * "include", IV is listed in the manifest, otherwise the IV is not in the
     * manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     *
     * @return For use with encryptionType. The IV (Initialization Vector) is a
     *         128-bit number used in conjunction with the key for encrypting
     *         blocks. If set to "include", IV is listed in the manifest,
     *         otherwise the IV is not in the manifest.
     * @see HlsIvInManifest
     */
    public String getIvInManifest() {
        return ivInManifest;
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit
     * number used in conjunction with the key for encrypting blocks. If set to
     * "include", IV is listed in the manifest, otherwise the IV is not in the
     * manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     *
     * @param ivInManifest For use with encryptionType. The IV (Initialization
     *            Vector) is a 128-bit number used in conjunction with the key
     *            for encrypting blocks. If set to "include", IV is listed in
     *            the manifest, otherwise the IV is not in the manifest.
     * @see HlsIvInManifest
     */
    public void setIvInManifest(String ivInManifest) {
        this.ivInManifest = ivInManifest;
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit
     * number used in conjunction with the key for encrypting blocks. If set to
     * "include", IV is listed in the manifest, otherwise the IV is not in the
     * manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     *
     * @param ivInManifest For use with encryptionType. The IV (Initialization
     *            Vector) is a 128-bit number used in conjunction with the key
     *            for encrypting blocks. If set to "include", IV is listed in
     *            the manifest, otherwise the IV is not in the manifest.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsIvInManifest
     */
    public HlsGroupSettings withIvInManifest(String ivInManifest) {
        this.ivInManifest = ivInManifest;
        return this;
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit
     * number used in conjunction with the key for encrypting blocks. If set to
     * "include", IV is listed in the manifest, otherwise the IV is not in the
     * manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     *
     * @param ivInManifest For use with encryptionType. The IV (Initialization
     *            Vector) is a 128-bit number used in conjunction with the key
     *            for encrypting blocks. If set to "include", IV is listed in
     *            the manifest, otherwise the IV is not in the manifest.
     * @see HlsIvInManifest
     */
    public void setIvInManifest(HlsIvInManifest ivInManifest) {
        this.ivInManifest = ivInManifest.toString();
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit
     * number used in conjunction with the key for encrypting blocks. If set to
     * "include", IV is listed in the manifest, otherwise the IV is not in the
     * manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     *
     * @param ivInManifest For use with encryptionType. The IV (Initialization
     *            Vector) is a 128-bit number used in conjunction with the key
     *            for encrypting blocks. If set to "include", IV is listed in
     *            the manifest, otherwise the IV is not in the manifest.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsIvInManifest
     */
    public HlsGroupSettings withIvInManifest(HlsIvInManifest ivInManifest) {
        this.ivInManifest = ivInManifest.toString();
        return this;
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit
     * number used in conjunction with the key for encrypting blocks. If this
     * setting is "followsSegmentNumber", it will cause the IV to change every
     * segment (to match the segment number). If this is set to "explicit", you
     * must enter a constantIv value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPLICIT, FOLLOWS_SEGMENT_NUMBER
     *
     * @return For use with encryptionType. The IV (Initialization Vector) is a
     *         128-bit number used in conjunction with the key for encrypting
     *         blocks. If this setting is "followsSegmentNumber", it will cause
     *         the IV to change every segment (to match the segment number). If
     *         this is set to "explicit", you must enter a constantIv value.
     * @see HlsIvSource
     */
    public String getIvSource() {
        return ivSource;
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit
     * number used in conjunction with the key for encrypting blocks. If this
     * setting is "followsSegmentNumber", it will cause the IV to change every
     * segment (to match the segment number). If this is set to "explicit", you
     * must enter a constantIv value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPLICIT, FOLLOWS_SEGMENT_NUMBER
     *
     * @param ivSource For use with encryptionType. The IV (Initialization
     *            Vector) is a 128-bit number used in conjunction with the key
     *            for encrypting blocks. If this setting is
     *            "followsSegmentNumber", it will cause the IV to change every
     *            segment (to match the segment number). If this is set to
     *            "explicit", you must enter a constantIv value.
     * @see HlsIvSource
     */
    public void setIvSource(String ivSource) {
        this.ivSource = ivSource;
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit
     * number used in conjunction with the key for encrypting blocks. If this
     * setting is "followsSegmentNumber", it will cause the IV to change every
     * segment (to match the segment number). If this is set to "explicit", you
     * must enter a constantIv value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPLICIT, FOLLOWS_SEGMENT_NUMBER
     *
     * @param ivSource For use with encryptionType. The IV (Initialization
     *            Vector) is a 128-bit number used in conjunction with the key
     *            for encrypting blocks. If this setting is
     *            "followsSegmentNumber", it will cause the IV to change every
     *            segment (to match the segment number). If this is set to
     *            "explicit", you must enter a constantIv value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsIvSource
     */
    public HlsGroupSettings withIvSource(String ivSource) {
        this.ivSource = ivSource;
        return this;
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit
     * number used in conjunction with the key for encrypting blocks. If this
     * setting is "followsSegmentNumber", it will cause the IV to change every
     * segment (to match the segment number). If this is set to "explicit", you
     * must enter a constantIv value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPLICIT, FOLLOWS_SEGMENT_NUMBER
     *
     * @param ivSource For use with encryptionType. The IV (Initialization
     *            Vector) is a 128-bit number used in conjunction with the key
     *            for encrypting blocks. If this setting is
     *            "followsSegmentNumber", it will cause the IV to change every
     *            segment (to match the segment number). If this is set to
     *            "explicit", you must enter a constantIv value.
     * @see HlsIvSource
     */
    public void setIvSource(HlsIvSource ivSource) {
        this.ivSource = ivSource.toString();
    }

    /**
     * For use with encryptionType. The IV (Initialization Vector) is a 128-bit
     * number used in conjunction with the key for encrypting blocks. If this
     * setting is "followsSegmentNumber", it will cause the IV to change every
     * segment (to match the segment number). If this is set to "explicit", you
     * must enter a constantIv value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXPLICIT, FOLLOWS_SEGMENT_NUMBER
     *
     * @param ivSource For use with encryptionType. The IV (Initialization
     *            Vector) is a 128-bit number used in conjunction with the key
     *            for encrypting blocks. If this setting is
     *            "followsSegmentNumber", it will cause the IV to change every
     *            segment (to match the segment number). If this is set to
     *            "explicit", you must enter a constantIv value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsIvSource
     */
    public HlsGroupSettings withIvSource(HlsIvSource ivSource) {
        this.ivSource = ivSource.toString();
        return this;
    }

    /**
     * Applies only if Mode field is LIVE. Specifies the number of media
     * segments (.ts files) to retain in the destination directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return Applies only if Mode field is LIVE. Specifies the number of media
     *         segments (.ts files) to retain in the destination directory.
     */
    public Integer getKeepSegments() {
        return keepSegments;
    }

    /**
     * Applies only if Mode field is LIVE. Specifies the number of media
     * segments (.ts files) to retain in the destination directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param keepSegments Applies only if Mode field is LIVE. Specifies the
     *            number of media segments (.ts files) to retain in the
     *            destination directory.
     */
    public void setKeepSegments(Integer keepSegments) {
        this.keepSegments = keepSegments;
    }

    /**
     * Applies only if Mode field is LIVE. Specifies the number of media
     * segments (.ts files) to retain in the destination directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param keepSegments Applies only if Mode field is LIVE. Specifies the
     *            number of media segments (.ts files) to retain in the
     *            destination directory.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withKeepSegments(Integer keepSegments) {
        this.keepSegments = keepSegments;
        return this;
    }

    /**
     * The value specifies how the key is represented in the resource identified
     * by the URI. If parameter is absent, an implicit value of "identity" is
     * used. A reverse DNS string can also be given.
     *
     * @return The value specifies how the key is represented in the resource
     *         identified by the URI. If parameter is absent, an implicit value
     *         of "identity" is used. A reverse DNS string can also be given.
     */
    public String getKeyFormat() {
        return keyFormat;
    }

    /**
     * The value specifies how the key is represented in the resource identified
     * by the URI. If parameter is absent, an implicit value of "identity" is
     * used. A reverse DNS string can also be given.
     *
     * @param keyFormat The value specifies how the key is represented in the
     *            resource identified by the URI. If parameter is absent, an
     *            implicit value of "identity" is used. A reverse DNS string can
     *            also be given.
     */
    public void setKeyFormat(String keyFormat) {
        this.keyFormat = keyFormat;
    }

    /**
     * The value specifies how the key is represented in the resource identified
     * by the URI. If parameter is absent, an implicit value of "identity" is
     * used. A reverse DNS string can also be given.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyFormat The value specifies how the key is represented in the
     *            resource identified by the URI. If parameter is absent, an
     *            implicit value of "identity" is used. A reverse DNS string can
     *            also be given.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withKeyFormat(String keyFormat) {
        this.keyFormat = keyFormat;
        return this;
    }

    /**
     * Either a single positive integer version value or a slash delimited list
     * of version values (1/2/3).
     *
     * @return Either a single positive integer version value or a slash
     *         delimited list of version values (1/2/3).
     */
    public String getKeyFormatVersions() {
        return keyFormatVersions;
    }

    /**
     * Either a single positive integer version value or a slash delimited list
     * of version values (1/2/3).
     *
     * @param keyFormatVersions Either a single positive integer version value
     *            or a slash delimited list of version values (1/2/3).
     */
    public void setKeyFormatVersions(String keyFormatVersions) {
        this.keyFormatVersions = keyFormatVersions;
    }

    /**
     * Either a single positive integer version value or a slash delimited list
     * of version values (1/2/3).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyFormatVersions Either a single positive integer version value
     *            or a slash delimited list of version values (1/2/3).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withKeyFormatVersions(String keyFormatVersions) {
        this.keyFormatVersions = keyFormatVersions;
        return this;
    }

    /**
     * The key provider settings.
     *
     * @return The key provider settings.
     */
    public KeyProviderSettings getKeyProviderSettings() {
        return keyProviderSettings;
    }

    /**
     * The key provider settings.
     *
     * @param keyProviderSettings The key provider settings.
     */
    public void setKeyProviderSettings(KeyProviderSettings keyProviderSettings) {
        this.keyProviderSettings = keyProviderSettings;
    }

    /**
     * The key provider settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyProviderSettings The key provider settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withKeyProviderSettings(KeyProviderSettings keyProviderSettings) {
        this.keyProviderSettings = keyProviderSettings;
        return this;
    }

    /**
     * When set to gzip, compresses HLS playlist.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GZIP, NONE
     *
     * @return When set to gzip, compresses HLS playlist.
     * @see HlsManifestCompression
     */
    public String getManifestCompression() {
        return manifestCompression;
    }

    /**
     * When set to gzip, compresses HLS playlist.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GZIP, NONE
     *
     * @param manifestCompression When set to gzip, compresses HLS playlist.
     * @see HlsManifestCompression
     */
    public void setManifestCompression(String manifestCompression) {
        this.manifestCompression = manifestCompression;
    }

    /**
     * When set to gzip, compresses HLS playlist.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GZIP, NONE
     *
     * @param manifestCompression When set to gzip, compresses HLS playlist.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsManifestCompression
     */
    public HlsGroupSettings withManifestCompression(String manifestCompression) {
        this.manifestCompression = manifestCompression;
        return this;
    }

    /**
     * When set to gzip, compresses HLS playlist.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GZIP, NONE
     *
     * @param manifestCompression When set to gzip, compresses HLS playlist.
     * @see HlsManifestCompression
     */
    public void setManifestCompression(HlsManifestCompression manifestCompression) {
        this.manifestCompression = manifestCompression.toString();
    }

    /**
     * When set to gzip, compresses HLS playlist.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GZIP, NONE
     *
     * @param manifestCompression When set to gzip, compresses HLS playlist.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsManifestCompression
     */
    public HlsGroupSettings withManifestCompression(HlsManifestCompression manifestCompression) {
        this.manifestCompression = manifestCompression.toString();
        return this;
    }

    /**
     * Indicates whether the output manifest should use floating point or
     * integer values for segment duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FLOATING_POINT, INTEGER
     *
     * @return Indicates whether the output manifest should use floating point
     *         or integer values for segment duration.
     * @see HlsManifestDurationFormat
     */
    public String getManifestDurationFormat() {
        return manifestDurationFormat;
    }

    /**
     * Indicates whether the output manifest should use floating point or
     * integer values for segment duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FLOATING_POINT, INTEGER
     *
     * @param manifestDurationFormat Indicates whether the output manifest
     *            should use floating point or integer values for segment
     *            duration.
     * @see HlsManifestDurationFormat
     */
    public void setManifestDurationFormat(String manifestDurationFormat) {
        this.manifestDurationFormat = manifestDurationFormat;
    }

    /**
     * Indicates whether the output manifest should use floating point or
     * integer values for segment duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FLOATING_POINT, INTEGER
     *
     * @param manifestDurationFormat Indicates whether the output manifest
     *            should use floating point or integer values for segment
     *            duration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsManifestDurationFormat
     */
    public HlsGroupSettings withManifestDurationFormat(String manifestDurationFormat) {
        this.manifestDurationFormat = manifestDurationFormat;
        return this;
    }

    /**
     * Indicates whether the output manifest should use floating point or
     * integer values for segment duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FLOATING_POINT, INTEGER
     *
     * @param manifestDurationFormat Indicates whether the output manifest
     *            should use floating point or integer values for segment
     *            duration.
     * @see HlsManifestDurationFormat
     */
    public void setManifestDurationFormat(HlsManifestDurationFormat manifestDurationFormat) {
        this.manifestDurationFormat = manifestDurationFormat.toString();
    }

    /**
     * Indicates whether the output manifest should use floating point or
     * integer values for segment duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FLOATING_POINT, INTEGER
     *
     * @param manifestDurationFormat Indicates whether the output manifest
     *            should use floating point or integer values for segment
     *            duration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsManifestDurationFormat
     */
    public HlsGroupSettings withManifestDurationFormat(
            HlsManifestDurationFormat manifestDurationFormat) {
        this.manifestDurationFormat = manifestDurationFormat.toString();
        return this;
    }

    /**
     * When set, minimumSegmentLength is enforced by looking ahead and back
     * within the specified range for a nearby avail and extending the segment
     * size if needed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return When set, minimumSegmentLength is enforced by looking ahead and
     *         back within the specified range for a nearby avail and extending
     *         the segment size if needed.
     */
    public Integer getMinSegmentLength() {
        return minSegmentLength;
    }

    /**
     * When set, minimumSegmentLength is enforced by looking ahead and back
     * within the specified range for a nearby avail and extending the segment
     * size if needed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param minSegmentLength When set, minimumSegmentLength is enforced by
     *            looking ahead and back within the specified range for a nearby
     *            avail and extending the segment size if needed.
     */
    public void setMinSegmentLength(Integer minSegmentLength) {
        this.minSegmentLength = minSegmentLength;
    }

    /**
     * When set, minimumSegmentLength is enforced by looking ahead and back
     * within the specified range for a nearby avail and extending the segment
     * size if needed.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param minSegmentLength When set, minimumSegmentLength is enforced by
     *            looking ahead and back within the specified range for a nearby
     *            avail and extending the segment size if needed.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withMinSegmentLength(Integer minSegmentLength) {
        this.minSegmentLength = minSegmentLength;
        return this;
    }

    /**
     * If "vod", all segments are indexed and kept permanently in the
     * destination and manifest. If "live", only the number segments specified
     * in keepSegments and indexNSegments are kept; newer segments replace older
     * segments, which may prevent players from rewinding all the way to the
     * beginning of the event. VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT
     * while the channel is running, converting it to a "VOD" type manifest on
     * completion of the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, VOD
     *
     * @return If "vod", all segments are indexed and kept permanently in the
     *         destination and manifest. If "live", only the number segments
     *         specified in keepSegments and indexNSegments are kept; newer
     *         segments replace older segments, which may prevent players from
     *         rewinding all the way to the beginning of the event. VOD mode
     *         uses HLS EXT-X-PLAYLIST-TYPE of EVENT while the channel is
     *         running, converting it to a "VOD" type manifest on completion of
     *         the stream.
     * @see HlsMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * If "vod", all segments are indexed and kept permanently in the
     * destination and manifest. If "live", only the number segments specified
     * in keepSegments and indexNSegments are kept; newer segments replace older
     * segments, which may prevent players from rewinding all the way to the
     * beginning of the event. VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT
     * while the channel is running, converting it to a "VOD" type manifest on
     * completion of the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, VOD
     *
     * @param mode If "vod", all segments are indexed and kept permanently in
     *            the destination and manifest. If "live", only the number
     *            segments specified in keepSegments and indexNSegments are
     *            kept; newer segments replace older segments, which may prevent
     *            players from rewinding all the way to the beginning of the
     *            event. VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while
     *            the channel is running, converting it to a "VOD" type manifest
     *            on completion of the stream.
     * @see HlsMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * If "vod", all segments are indexed and kept permanently in the
     * destination and manifest. If "live", only the number segments specified
     * in keepSegments and indexNSegments are kept; newer segments replace older
     * segments, which may prevent players from rewinding all the way to the
     * beginning of the event. VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT
     * while the channel is running, converting it to a "VOD" type manifest on
     * completion of the stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, VOD
     *
     * @param mode If "vod", all segments are indexed and kept permanently in
     *            the destination and manifest. If "live", only the number
     *            segments specified in keepSegments and indexNSegments are
     *            kept; newer segments replace older segments, which may prevent
     *            players from rewinding all the way to the beginning of the
     *            event. VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while
     *            the channel is running, converting it to a "VOD" type manifest
     *            on completion of the stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsMode
     */
    public HlsGroupSettings withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * If "vod", all segments are indexed and kept permanently in the
     * destination and manifest. If "live", only the number segments specified
     * in keepSegments and indexNSegments are kept; newer segments replace older
     * segments, which may prevent players from rewinding all the way to the
     * beginning of the event. VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT
     * while the channel is running, converting it to a "VOD" type manifest on
     * completion of the stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, VOD
     *
     * @param mode If "vod", all segments are indexed and kept permanently in
     *            the destination and manifest. If "live", only the number
     *            segments specified in keepSegments and indexNSegments are
     *            kept; newer segments replace older segments, which may prevent
     *            players from rewinding all the way to the beginning of the
     *            event. VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while
     *            the channel is running, converting it to a "VOD" type manifest
     *            on completion of the stream.
     * @see HlsMode
     */
    public void setMode(HlsMode mode) {
        this.mode = mode.toString();
    }

    /**
     * If "vod", all segments are indexed and kept permanently in the
     * destination and manifest. If "live", only the number segments specified
     * in keepSegments and indexNSegments are kept; newer segments replace older
     * segments, which may prevent players from rewinding all the way to the
     * beginning of the event. VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT
     * while the channel is running, converting it to a "VOD" type manifest on
     * completion of the stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LIVE, VOD
     *
     * @param mode If "vod", all segments are indexed and kept permanently in
     *            the destination and manifest. If "live", only the number
     *            segments specified in keepSegments and indexNSegments are
     *            kept; newer segments replace older segments, which may prevent
     *            players from rewinding all the way to the beginning of the
     *            event. VOD mode uses HLS EXT-X-PLAYLIST-TYPE of EVENT while
     *            the channel is running, converting it to a "VOD" type manifest
     *            on completion of the stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsMode
     */
    public HlsGroupSettings withMode(HlsMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * MANIFESTS_AND_SEGMENTS: Generates manifests (master manifest, if
     * applicable, and media manifests) for this output group.
     * VARIANT_MANIFESTS_AND_SEGMENTS: Generates media manifests for this output
     * group, but not a master manifest. SEGMENTS_ONLY: Does not generate any
     * manifests for this output group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY
     *
     * @return MANIFESTS_AND_SEGMENTS: Generates manifests (master manifest, if
     *         applicable, and media manifests) for this output group.
     *         VARIANT_MANIFESTS_AND_SEGMENTS: Generates media manifests for
     *         this output group, but not a master manifest. SEGMENTS_ONLY: Does
     *         not generate any manifests for this output group.
     * @see HlsOutputSelection
     */
    public String getOutputSelection() {
        return outputSelection;
    }

    /**
     * MANIFESTS_AND_SEGMENTS: Generates manifests (master manifest, if
     * applicable, and media manifests) for this output group.
     * VARIANT_MANIFESTS_AND_SEGMENTS: Generates media manifests for this output
     * group, but not a master manifest. SEGMENTS_ONLY: Does not generate any
     * manifests for this output group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY
     *
     * @param outputSelection MANIFESTS_AND_SEGMENTS: Generates manifests
     *            (master manifest, if applicable, and media manifests) for this
     *            output group. VARIANT_MANIFESTS_AND_SEGMENTS: Generates media
     *            manifests for this output group, but not a master manifest.
     *            SEGMENTS_ONLY: Does not generate any manifests for this output
     *            group.
     * @see HlsOutputSelection
     */
    public void setOutputSelection(String outputSelection) {
        this.outputSelection = outputSelection;
    }

    /**
     * MANIFESTS_AND_SEGMENTS: Generates manifests (master manifest, if
     * applicable, and media manifests) for this output group.
     * VARIANT_MANIFESTS_AND_SEGMENTS: Generates media manifests for this output
     * group, but not a master manifest. SEGMENTS_ONLY: Does not generate any
     * manifests for this output group.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY
     *
     * @param outputSelection MANIFESTS_AND_SEGMENTS: Generates manifests
     *            (master manifest, if applicable, and media manifests) for this
     *            output group. VARIANT_MANIFESTS_AND_SEGMENTS: Generates media
     *            manifests for this output group, but not a master manifest.
     *            SEGMENTS_ONLY: Does not generate any manifests for this output
     *            group.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsOutputSelection
     */
    public HlsGroupSettings withOutputSelection(String outputSelection) {
        this.outputSelection = outputSelection;
        return this;
    }

    /**
     * MANIFESTS_AND_SEGMENTS: Generates manifests (master manifest, if
     * applicable, and media manifests) for this output group.
     * VARIANT_MANIFESTS_AND_SEGMENTS: Generates media manifests for this output
     * group, but not a master manifest. SEGMENTS_ONLY: Does not generate any
     * manifests for this output group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY
     *
     * @param outputSelection MANIFESTS_AND_SEGMENTS: Generates manifests
     *            (master manifest, if applicable, and media manifests) for this
     *            output group. VARIANT_MANIFESTS_AND_SEGMENTS: Generates media
     *            manifests for this output group, but not a master manifest.
     *            SEGMENTS_ONLY: Does not generate any manifests for this output
     *            group.
     * @see HlsOutputSelection
     */
    public void setOutputSelection(HlsOutputSelection outputSelection) {
        this.outputSelection = outputSelection.toString();
    }

    /**
     * MANIFESTS_AND_SEGMENTS: Generates manifests (master manifest, if
     * applicable, and media manifests) for this output group.
     * VARIANT_MANIFESTS_AND_SEGMENTS: Generates media manifests for this output
     * group, but not a master manifest. SEGMENTS_ONLY: Does not generate any
     * manifests for this output group.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY
     *
     * @param outputSelection MANIFESTS_AND_SEGMENTS: Generates manifests
     *            (master manifest, if applicable, and media manifests) for this
     *            output group. VARIANT_MANIFESTS_AND_SEGMENTS: Generates media
     *            manifests for this output group, but not a master manifest.
     *            SEGMENTS_ONLY: Does not generate any manifests for this output
     *            group.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsOutputSelection
     */
    public HlsGroupSettings withOutputSelection(HlsOutputSelection outputSelection) {
        this.outputSelection = outputSelection.toString();
        return this;
    }

    /**
     * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files.
     * The value is calculated as follows: either the program date and time are
     * initialized using the input timecode source, or the time is initialized
     * using the input timecode source and the date is initialized using the
     * timestampOffset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     *
     * @return Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8
     *         manifest files. The value is calculated as follows: either the
     *         program date and time are initialized using the input timecode
     *         source, or the time is initialized using the input timecode
     *         source and the date is initialized using the timestampOffset.
     * @see HlsProgramDateTime
     */
    public String getProgramDateTime() {
        return programDateTime;
    }

    /**
     * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files.
     * The value is calculated as follows: either the program date and time are
     * initialized using the input timecode source, or the time is initialized
     * using the input timecode source and the date is initialized using the
     * timestampOffset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     *
     * @param programDateTime Includes or excludes EXT-X-PROGRAM-DATE-TIME tag
     *            in .m3u8 manifest files. The value is calculated as follows:
     *            either the program date and time are initialized using the
     *            input timecode source, or the time is initialized using the
     *            input timecode source and the date is initialized using the
     *            timestampOffset.
     * @see HlsProgramDateTime
     */
    public void setProgramDateTime(String programDateTime) {
        this.programDateTime = programDateTime;
    }

    /**
     * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files.
     * The value is calculated as follows: either the program date and time are
     * initialized using the input timecode source, or the time is initialized
     * using the input timecode source and the date is initialized using the
     * timestampOffset.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     *
     * @param programDateTime Includes or excludes EXT-X-PROGRAM-DATE-TIME tag
     *            in .m3u8 manifest files. The value is calculated as follows:
     *            either the program date and time are initialized using the
     *            input timecode source, or the time is initialized using the
     *            input timecode source and the date is initialized using the
     *            timestampOffset.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsProgramDateTime
     */
    public HlsGroupSettings withProgramDateTime(String programDateTime) {
        this.programDateTime = programDateTime;
        return this;
    }

    /**
     * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files.
     * The value is calculated as follows: either the program date and time are
     * initialized using the input timecode source, or the time is initialized
     * using the input timecode source and the date is initialized using the
     * timestampOffset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     *
     * @param programDateTime Includes or excludes EXT-X-PROGRAM-DATE-TIME tag
     *            in .m3u8 manifest files. The value is calculated as follows:
     *            either the program date and time are initialized using the
     *            input timecode source, or the time is initialized using the
     *            input timecode source and the date is initialized using the
     *            timestampOffset.
     * @see HlsProgramDateTime
     */
    public void setProgramDateTime(HlsProgramDateTime programDateTime) {
        this.programDateTime = programDateTime.toString();
    }

    /**
     * Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8 manifest files.
     * The value is calculated as follows: either the program date and time are
     * initialized using the input timecode source, or the time is initialized
     * using the input timecode source and the date is initialized using the
     * timestampOffset.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     *
     * @param programDateTime Includes or excludes EXT-X-PROGRAM-DATE-TIME tag
     *            in .m3u8 manifest files. The value is calculated as follows:
     *            either the program date and time are initialized using the
     *            input timecode source, or the time is initialized using the
     *            input timecode source and the date is initialized using the
     *            timestampOffset.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsProgramDateTime
     */
    public HlsGroupSettings withProgramDateTime(HlsProgramDateTime programDateTime) {
        this.programDateTime = programDateTime.toString();
        return this;
    }

    /**
     * Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3600<br/>
     *
     * @return Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
     */
    public Integer getProgramDateTimePeriod() {
        return programDateTimePeriod;
    }

    /**
     * Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3600<br/>
     *
     * @param programDateTimePeriod Period of insertion of
     *            EXT-X-PROGRAM-DATE-TIME entry, in seconds.
     */
    public void setProgramDateTimePeriod(Integer programDateTimePeriod) {
        this.programDateTimePeriod = programDateTimePeriod;
    }

    /**
     * Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3600<br/>
     *
     * @param programDateTimePeriod Period of insertion of
     *            EXT-X-PROGRAM-DATE-TIME entry, in seconds.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withProgramDateTimePeriod(Integer programDateTimePeriod) {
        this.programDateTimePeriod = programDateTimePeriod;
        return this;
    }

    /**
     * ENABLED: The master manifest (.m3u8 file) for each pipeline includes
     * information about both pipelines: first its own media files, then the
     * media files of the other pipeline. This feature allows playout device
     * that support stale manifest detection to switch from one manifest to the
     * other, when the current manifest seems to be stale. There are still two
     * destinations and two master manifests, but both master manifests
     * reference the media files from both pipelines. DISABLED: The master
     * manifest (.m3u8 file) for each pipeline includes information about its
     * own pipeline only. For an HLS output group with MediaPackage as the
     * destination, the DISABLED behavior is always followed. MediaPackage
     * regenerates the manifests it serves to players so a redundant manifest
     * from MediaLive is irrelevant.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return ENABLED: The master manifest (.m3u8 file) for each pipeline
     *         includes information about both pipelines: first its own media
     *         files, then the media files of the other pipeline. This feature
     *         allows playout device that support stale manifest detection to
     *         switch from one manifest to the other, when the current manifest
     *         seems to be stale. There are still two destinations and two
     *         master manifests, but both master manifests reference the media
     *         files from both pipelines. DISABLED: The master manifest (.m3u8
     *         file) for each pipeline includes information about its own
     *         pipeline only. For an HLS output group with MediaPackage as the
     *         destination, the DISABLED behavior is always followed.
     *         MediaPackage regenerates the manifests it serves to players so a
     *         redundant manifest from MediaLive is irrelevant.
     * @see HlsRedundantManifest
     */
    public String getRedundantManifest() {
        return redundantManifest;
    }

    /**
     * ENABLED: The master manifest (.m3u8 file) for each pipeline includes
     * information about both pipelines: first its own media files, then the
     * media files of the other pipeline. This feature allows playout device
     * that support stale manifest detection to switch from one manifest to the
     * other, when the current manifest seems to be stale. There are still two
     * destinations and two master manifests, but both master manifests
     * reference the media files from both pipelines. DISABLED: The master
     * manifest (.m3u8 file) for each pipeline includes information about its
     * own pipeline only. For an HLS output group with MediaPackage as the
     * destination, the DISABLED behavior is always followed. MediaPackage
     * regenerates the manifests it serves to players so a redundant manifest
     * from MediaLive is irrelevant.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param redundantManifest ENABLED: The master manifest (.m3u8 file) for
     *            each pipeline includes information about both pipelines: first
     *            its own media files, then the media files of the other
     *            pipeline. This feature allows playout device that support
     *            stale manifest detection to switch from one manifest to the
     *            other, when the current manifest seems to be stale. There are
     *            still two destinations and two master manifests, but both
     *            master manifests reference the media files from both
     *            pipelines. DISABLED: The master manifest (.m3u8 file) for each
     *            pipeline includes information about its own pipeline only. For
     *            an HLS output group with MediaPackage as the destination, the
     *            DISABLED behavior is always followed. MediaPackage regenerates
     *            the manifests it serves to players so a redundant manifest
     *            from MediaLive is irrelevant.
     * @see HlsRedundantManifest
     */
    public void setRedundantManifest(String redundantManifest) {
        this.redundantManifest = redundantManifest;
    }

    /**
     * ENABLED: The master manifest (.m3u8 file) for each pipeline includes
     * information about both pipelines: first its own media files, then the
     * media files of the other pipeline. This feature allows playout device
     * that support stale manifest detection to switch from one manifest to the
     * other, when the current manifest seems to be stale. There are still two
     * destinations and two master manifests, but both master manifests
     * reference the media files from both pipelines. DISABLED: The master
     * manifest (.m3u8 file) for each pipeline includes information about its
     * own pipeline only. For an HLS output group with MediaPackage as the
     * destination, the DISABLED behavior is always followed. MediaPackage
     * regenerates the manifests it serves to players so a redundant manifest
     * from MediaLive is irrelevant.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param redundantManifest ENABLED: The master manifest (.m3u8 file) for
     *            each pipeline includes information about both pipelines: first
     *            its own media files, then the media files of the other
     *            pipeline. This feature allows playout device that support
     *            stale manifest detection to switch from one manifest to the
     *            other, when the current manifest seems to be stale. There are
     *            still two destinations and two master manifests, but both
     *            master manifests reference the media files from both
     *            pipelines. DISABLED: The master manifest (.m3u8 file) for each
     *            pipeline includes information about its own pipeline only. For
     *            an HLS output group with MediaPackage as the destination, the
     *            DISABLED behavior is always followed. MediaPackage regenerates
     *            the manifests it serves to players so a redundant manifest
     *            from MediaLive is irrelevant.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsRedundantManifest
     */
    public HlsGroupSettings withRedundantManifest(String redundantManifest) {
        this.redundantManifest = redundantManifest;
        return this;
    }

    /**
     * ENABLED: The master manifest (.m3u8 file) for each pipeline includes
     * information about both pipelines: first its own media files, then the
     * media files of the other pipeline. This feature allows playout device
     * that support stale manifest detection to switch from one manifest to the
     * other, when the current manifest seems to be stale. There are still two
     * destinations and two master manifests, but both master manifests
     * reference the media files from both pipelines. DISABLED: The master
     * manifest (.m3u8 file) for each pipeline includes information about its
     * own pipeline only. For an HLS output group with MediaPackage as the
     * destination, the DISABLED behavior is always followed. MediaPackage
     * regenerates the manifests it serves to players so a redundant manifest
     * from MediaLive is irrelevant.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param redundantManifest ENABLED: The master manifest (.m3u8 file) for
     *            each pipeline includes information about both pipelines: first
     *            its own media files, then the media files of the other
     *            pipeline. This feature allows playout device that support
     *            stale manifest detection to switch from one manifest to the
     *            other, when the current manifest seems to be stale. There are
     *            still two destinations and two master manifests, but both
     *            master manifests reference the media files from both
     *            pipelines. DISABLED: The master manifest (.m3u8 file) for each
     *            pipeline includes information about its own pipeline only. For
     *            an HLS output group with MediaPackage as the destination, the
     *            DISABLED behavior is always followed. MediaPackage regenerates
     *            the manifests it serves to players so a redundant manifest
     *            from MediaLive is irrelevant.
     * @see HlsRedundantManifest
     */
    public void setRedundantManifest(HlsRedundantManifest redundantManifest) {
        this.redundantManifest = redundantManifest.toString();
    }

    /**
     * ENABLED: The master manifest (.m3u8 file) for each pipeline includes
     * information about both pipelines: first its own media files, then the
     * media files of the other pipeline. This feature allows playout device
     * that support stale manifest detection to switch from one manifest to the
     * other, when the current manifest seems to be stale. There are still two
     * destinations and two master manifests, but both master manifests
     * reference the media files from both pipelines. DISABLED: The master
     * manifest (.m3u8 file) for each pipeline includes information about its
     * own pipeline only. For an HLS output group with MediaPackage as the
     * destination, the DISABLED behavior is always followed. MediaPackage
     * regenerates the manifests it serves to players so a redundant manifest
     * from MediaLive is irrelevant.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param redundantManifest ENABLED: The master manifest (.m3u8 file) for
     *            each pipeline includes information about both pipelines: first
     *            its own media files, then the media files of the other
     *            pipeline. This feature allows playout device that support
     *            stale manifest detection to switch from one manifest to the
     *            other, when the current manifest seems to be stale. There are
     *            still two destinations and two master manifests, but both
     *            master manifests reference the media files from both
     *            pipelines. DISABLED: The master manifest (.m3u8 file) for each
     *            pipeline includes information about its own pipeline only. For
     *            an HLS output group with MediaPackage as the destination, the
     *            DISABLED behavior is always followed. MediaPackage regenerates
     *            the manifests it serves to players so a redundant manifest
     *            from MediaLive is irrelevant.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsRedundantManifest
     */
    public HlsGroupSettings withRedundantManifest(HlsRedundantManifest redundantManifest) {
        this.redundantManifest = redundantManifest.toString();
        return this;
    }

    /**
     * Length of MPEG-2 Transport Stream segments to create (in seconds). Note
     * that segments will end on the next keyframe after this number of seconds,
     * so actual segment length may be longer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return Length of MPEG-2 Transport Stream segments to create (in
     *         seconds). Note that segments will end on the next keyframe after
     *         this number of seconds, so actual segment length may be longer.
     */
    public Integer getSegmentLength() {
        return segmentLength;
    }

    /**
     * Length of MPEG-2 Transport Stream segments to create (in seconds). Note
     * that segments will end on the next keyframe after this number of seconds,
     * so actual segment length may be longer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param segmentLength Length of MPEG-2 Transport Stream segments to create
     *            (in seconds). Note that segments will end on the next keyframe
     *            after this number of seconds, so actual segment length may be
     *            longer.
     */
    public void setSegmentLength(Integer segmentLength) {
        this.segmentLength = segmentLength;
    }

    /**
     * Length of MPEG-2 Transport Stream segments to create (in seconds). Note
     * that segments will end on the next keyframe after this number of seconds,
     * so actual segment length may be longer.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param segmentLength Length of MPEG-2 Transport Stream segments to create
     *            (in seconds). Note that segments will end on the next keyframe
     *            after this number of seconds, so actual segment length may be
     *            longer.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withSegmentLength(Integer segmentLength) {
        this.segmentLength = segmentLength;
        return this;
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is
     * always used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION
     *
     * @return useInputSegmentation has been deprecated. The configured segment
     *         size is always used.
     * @see HlsSegmentationMode
     */
    public String getSegmentationMode() {
        return segmentationMode;
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is
     * always used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION
     *
     * @param segmentationMode useInputSegmentation has been deprecated. The
     *            configured segment size is always used.
     * @see HlsSegmentationMode
     */
    public void setSegmentationMode(String segmentationMode) {
        this.segmentationMode = segmentationMode;
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is
     * always used.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION
     *
     * @param segmentationMode useInputSegmentation has been deprecated. The
     *            configured segment size is always used.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsSegmentationMode
     */
    public HlsGroupSettings withSegmentationMode(String segmentationMode) {
        this.segmentationMode = segmentationMode;
        return this;
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is
     * always used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION
     *
     * @param segmentationMode useInputSegmentation has been deprecated. The
     *            configured segment size is always used.
     * @see HlsSegmentationMode
     */
    public void setSegmentationMode(HlsSegmentationMode segmentationMode) {
        this.segmentationMode = segmentationMode.toString();
    }

    /**
     * useInputSegmentation has been deprecated. The configured segment size is
     * always used.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USE_INPUT_SEGMENTATION, USE_SEGMENT_DURATION
     *
     * @param segmentationMode useInputSegmentation has been deprecated. The
     *            configured segment size is always used.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsSegmentationMode
     */
    public HlsGroupSettings withSegmentationMode(HlsSegmentationMode segmentationMode) {
        this.segmentationMode = segmentationMode.toString();
        return this;
    }

    /**
     * Number of segments to write to a subdirectory before starting a new one.
     * directoryStructure must be subdirectoryPerStream for this setting to have
     * an effect.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return Number of segments to write to a subdirectory before starting a
     *         new one. directoryStructure must be subdirectoryPerStream for
     *         this setting to have an effect.
     */
    public Integer getSegmentsPerSubdirectory() {
        return segmentsPerSubdirectory;
    }

    /**
     * Number of segments to write to a subdirectory before starting a new one.
     * directoryStructure must be subdirectoryPerStream for this setting to have
     * an effect.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param segmentsPerSubdirectory Number of segments to write to a
     *            subdirectory before starting a new one. directoryStructure
     *            must be subdirectoryPerStream for this setting to have an
     *            effect.
     */
    public void setSegmentsPerSubdirectory(Integer segmentsPerSubdirectory) {
        this.segmentsPerSubdirectory = segmentsPerSubdirectory;
    }

    /**
     * Number of segments to write to a subdirectory before starting a new one.
     * directoryStructure must be subdirectoryPerStream for this setting to have
     * an effect.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param segmentsPerSubdirectory Number of segments to write to a
     *            subdirectory before starting a new one. directoryStructure
     *            must be subdirectoryPerStream for this setting to have an
     *            effect.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withSegmentsPerSubdirectory(Integer segmentsPerSubdirectory) {
        this.segmentsPerSubdirectory = segmentsPerSubdirectory;
        return this;
    }

    /**
     * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag
     * of variant manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     *
     * @return Include or exclude RESOLUTION attribute for video in
     *         EXT-X-STREAM-INF tag of variant manifest.
     * @see HlsStreamInfResolution
     */
    public String getStreamInfResolution() {
        return streamInfResolution;
    }

    /**
     * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag
     * of variant manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     *
     * @param streamInfResolution Include or exclude RESOLUTION attribute for
     *            video in EXT-X-STREAM-INF tag of variant manifest.
     * @see HlsStreamInfResolution
     */
    public void setStreamInfResolution(String streamInfResolution) {
        this.streamInfResolution = streamInfResolution;
    }

    /**
     * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag
     * of variant manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     *
     * @param streamInfResolution Include or exclude RESOLUTION attribute for
     *            video in EXT-X-STREAM-INF tag of variant manifest.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsStreamInfResolution
     */
    public HlsGroupSettings withStreamInfResolution(String streamInfResolution) {
        this.streamInfResolution = streamInfResolution;
        return this;
    }

    /**
     * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag
     * of variant manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     *
     * @param streamInfResolution Include or exclude RESOLUTION attribute for
     *            video in EXT-X-STREAM-INF tag of variant manifest.
     * @see HlsStreamInfResolution
     */
    public void setStreamInfResolution(HlsStreamInfResolution streamInfResolution) {
        this.streamInfResolution = streamInfResolution.toString();
    }

    /**
     * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag
     * of variant manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE, INCLUDE
     *
     * @param streamInfResolution Include or exclude RESOLUTION attribute for
     *            video in EXT-X-STREAM-INF tag of variant manifest.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsStreamInfResolution
     */
    public HlsGroupSettings withStreamInfResolution(HlsStreamInfResolution streamInfResolution) {
        this.streamInfResolution = streamInfResolution.toString();
        return this;
    }

    /**
     * Indicates ID3 frame that has the timecode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, PRIV, TDRL
     *
     * @return Indicates ID3 frame that has the timecode.
     * @see HlsTimedMetadataId3Frame
     */
    public String getTimedMetadataId3Frame() {
        return timedMetadataId3Frame;
    }

    /**
     * Indicates ID3 frame that has the timecode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, PRIV, TDRL
     *
     * @param timedMetadataId3Frame Indicates ID3 frame that has the timecode.
     * @see HlsTimedMetadataId3Frame
     */
    public void setTimedMetadataId3Frame(String timedMetadataId3Frame) {
        this.timedMetadataId3Frame = timedMetadataId3Frame;
    }

    /**
     * Indicates ID3 frame that has the timecode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, PRIV, TDRL
     *
     * @param timedMetadataId3Frame Indicates ID3 frame that has the timecode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsTimedMetadataId3Frame
     */
    public HlsGroupSettings withTimedMetadataId3Frame(String timedMetadataId3Frame) {
        this.timedMetadataId3Frame = timedMetadataId3Frame;
        return this;
    }

    /**
     * Indicates ID3 frame that has the timecode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, PRIV, TDRL
     *
     * @param timedMetadataId3Frame Indicates ID3 frame that has the timecode.
     * @see HlsTimedMetadataId3Frame
     */
    public void setTimedMetadataId3Frame(HlsTimedMetadataId3Frame timedMetadataId3Frame) {
        this.timedMetadataId3Frame = timedMetadataId3Frame.toString();
    }

    /**
     * Indicates ID3 frame that has the timecode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, PRIV, TDRL
     *
     * @param timedMetadataId3Frame Indicates ID3 frame that has the timecode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsTimedMetadataId3Frame
     */
    public HlsGroupSettings withTimedMetadataId3Frame(HlsTimedMetadataId3Frame timedMetadataId3Frame) {
        this.timedMetadataId3Frame = timedMetadataId3Frame.toString();
        return this;
    }

    /**
     * Timed Metadata interval in seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return Timed Metadata interval in seconds.
     */
    public Integer getTimedMetadataId3Period() {
        return timedMetadataId3Period;
    }

    /**
     * Timed Metadata interval in seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param timedMetadataId3Period Timed Metadata interval in seconds.
     */
    public void setTimedMetadataId3Period(Integer timedMetadataId3Period) {
        this.timedMetadataId3Period = timedMetadataId3Period;
    }

    /**
     * Timed Metadata interval in seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param timedMetadataId3Period Timed Metadata interval in seconds.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withTimedMetadataId3Period(Integer timedMetadataId3Period) {
        this.timedMetadataId3Period = timedMetadataId3Period;
        return this;
    }

    /**
     * Provides an extra millisecond delta offset to fine tune the timestamps.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return Provides an extra millisecond delta offset to fine tune the
     *         timestamps.
     */
    public Integer getTimestampDeltaMilliseconds() {
        return timestampDeltaMilliseconds;
    }

    /**
     * Provides an extra millisecond delta offset to fine tune the timestamps.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param timestampDeltaMilliseconds Provides an extra millisecond delta
     *            offset to fine tune the timestamps.
     */
    public void setTimestampDeltaMilliseconds(Integer timestampDeltaMilliseconds) {
        this.timestampDeltaMilliseconds = timestampDeltaMilliseconds;
    }

    /**
     * Provides an extra millisecond delta offset to fine tune the timestamps.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param timestampDeltaMilliseconds Provides an extra millisecond delta
     *            offset to fine tune the timestamps.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withTimestampDeltaMilliseconds(Integer timestampDeltaMilliseconds) {
        this.timestampDeltaMilliseconds = timestampDeltaMilliseconds;
        return this;
    }

    /**
     * SEGMENTED_FILES: Emit the program as segments - multiple .ts media files.
     * SINGLE_FILE: Applies only if Mode field is VOD. Emit the program as a
     * single .ts media file. The media manifest includes #EXT-X-BYTERANGE tags
     * to index segments for playback. A typical use for this value is when
     * sending the output to AWS Elemental MediaConvert, which can accept only a
     * single media file. Playback while the channel is running is not
     * guaranteed due to HTTP server caching.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEGMENTED_FILES, SINGLE_FILE
     *
     * @return SEGMENTED_FILES: Emit the program as segments - multiple .ts
     *         media files. SINGLE_FILE: Applies only if Mode field is VOD. Emit
     *         the program as a single .ts media file. The media manifest
     *         includes #EXT-X-BYTERANGE tags to index segments for playback. A
     *         typical use for this value is when sending the output to AWS
     *         Elemental MediaConvert, which can accept only a single media
     *         file. Playback while the channel is running is not guaranteed due
     *         to HTTP server caching.
     * @see HlsTsFileMode
     */
    public String getTsFileMode() {
        return tsFileMode;
    }

    /**
     * SEGMENTED_FILES: Emit the program as segments - multiple .ts media files.
     * SINGLE_FILE: Applies only if Mode field is VOD. Emit the program as a
     * single .ts media file. The media manifest includes #EXT-X-BYTERANGE tags
     * to index segments for playback. A typical use for this value is when
     * sending the output to AWS Elemental MediaConvert, which can accept only a
     * single media file. Playback while the channel is running is not
     * guaranteed due to HTTP server caching.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEGMENTED_FILES, SINGLE_FILE
     *
     * @param tsFileMode SEGMENTED_FILES: Emit the program as segments -
     *            multiple .ts media files. SINGLE_FILE: Applies only if Mode
     *            field is VOD. Emit the program as a single .ts media file. The
     *            media manifest includes #EXT-X-BYTERANGE tags to index
     *            segments for playback. A typical use for this value is when
     *            sending the output to AWS Elemental MediaConvert, which can
     *            accept only a single media file. Playback while the channel is
     *            running is not guaranteed due to HTTP server caching.
     * @see HlsTsFileMode
     */
    public void setTsFileMode(String tsFileMode) {
        this.tsFileMode = tsFileMode;
    }

    /**
     * SEGMENTED_FILES: Emit the program as segments - multiple .ts media files.
     * SINGLE_FILE: Applies only if Mode field is VOD. Emit the program as a
     * single .ts media file. The media manifest includes #EXT-X-BYTERANGE tags
     * to index segments for playback. A typical use for this value is when
     * sending the output to AWS Elemental MediaConvert, which can accept only a
     * single media file. Playback while the channel is running is not
     * guaranteed due to HTTP server caching.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEGMENTED_FILES, SINGLE_FILE
     *
     * @param tsFileMode SEGMENTED_FILES: Emit the program as segments -
     *            multiple .ts media files. SINGLE_FILE: Applies only if Mode
     *            field is VOD. Emit the program as a single .ts media file. The
     *            media manifest includes #EXT-X-BYTERANGE tags to index
     *            segments for playback. A typical use for this value is when
     *            sending the output to AWS Elemental MediaConvert, which can
     *            accept only a single media file. Playback while the channel is
     *            running is not guaranteed due to HTTP server caching.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsTsFileMode
     */
    public HlsGroupSettings withTsFileMode(String tsFileMode) {
        this.tsFileMode = tsFileMode;
        return this;
    }

    /**
     * SEGMENTED_FILES: Emit the program as segments - multiple .ts media files.
     * SINGLE_FILE: Applies only if Mode field is VOD. Emit the program as a
     * single .ts media file. The media manifest includes #EXT-X-BYTERANGE tags
     * to index segments for playback. A typical use for this value is when
     * sending the output to AWS Elemental MediaConvert, which can accept only a
     * single media file. Playback while the channel is running is not
     * guaranteed due to HTTP server caching.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEGMENTED_FILES, SINGLE_FILE
     *
     * @param tsFileMode SEGMENTED_FILES: Emit the program as segments -
     *            multiple .ts media files. SINGLE_FILE: Applies only if Mode
     *            field is VOD. Emit the program as a single .ts media file. The
     *            media manifest includes #EXT-X-BYTERANGE tags to index
     *            segments for playback. A typical use for this value is when
     *            sending the output to AWS Elemental MediaConvert, which can
     *            accept only a single media file. Playback while the channel is
     *            running is not guaranteed due to HTTP server caching.
     * @see HlsTsFileMode
     */
    public void setTsFileMode(HlsTsFileMode tsFileMode) {
        this.tsFileMode = tsFileMode.toString();
    }

    /**
     * SEGMENTED_FILES: Emit the program as segments - multiple .ts media files.
     * SINGLE_FILE: Applies only if Mode field is VOD. Emit the program as a
     * single .ts media file. The media manifest includes #EXT-X-BYTERANGE tags
     * to index segments for playback. A typical use for this value is when
     * sending the output to AWS Elemental MediaConvert, which can accept only a
     * single media file. Playback while the channel is running is not
     * guaranteed due to HTTP server caching.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEGMENTED_FILES, SINGLE_FILE
     *
     * @param tsFileMode SEGMENTED_FILES: Emit the program as segments -
     *            multiple .ts media files. SINGLE_FILE: Applies only if Mode
     *            field is VOD. Emit the program as a single .ts media file. The
     *            media manifest includes #EXT-X-BYTERANGE tags to index
     *            segments for playback. A typical use for this value is when
     *            sending the output to AWS Elemental MediaConvert, which can
     *            accept only a single media file. Playback while the channel is
     *            running is not guaranteed due to HTTP server caching.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsTsFileMode
     */
    public HlsGroupSettings withTsFileMode(HlsTsFileMode tsFileMode) {
        this.tsFileMode = tsFileMode.toString();
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
        if (getAdMarkers() != null)
            sb.append("AdMarkers: " + getAdMarkers() + ",");
        if (getBaseUrlContent() != null)
            sb.append("BaseUrlContent: " + getBaseUrlContent() + ",");
        if (getBaseUrlContent1() != null)
            sb.append("BaseUrlContent1: " + getBaseUrlContent1() + ",");
        if (getBaseUrlManifest() != null)
            sb.append("BaseUrlManifest: " + getBaseUrlManifest() + ",");
        if (getBaseUrlManifest1() != null)
            sb.append("BaseUrlManifest1: " + getBaseUrlManifest1() + ",");
        if (getCaptionLanguageMappings() != null)
            sb.append("CaptionLanguageMappings: " + getCaptionLanguageMappings() + ",");
        if (getCaptionLanguageSetting() != null)
            sb.append("CaptionLanguageSetting: " + getCaptionLanguageSetting() + ",");
        if (getClientCache() != null)
            sb.append("ClientCache: " + getClientCache() + ",");
        if (getCodecSpecification() != null)
            sb.append("CodecSpecification: " + getCodecSpecification() + ",");
        if (getConstantIv() != null)
            sb.append("ConstantIv: " + getConstantIv() + ",");
        if (getDestination() != null)
            sb.append("Destination: " + getDestination() + ",");
        if (getDirectoryStructure() != null)
            sb.append("DirectoryStructure: " + getDirectoryStructure() + ",");
        if (getEncryptionType() != null)
            sb.append("EncryptionType: " + getEncryptionType() + ",");
        if (getHlsCdnSettings() != null)
            sb.append("HlsCdnSettings: " + getHlsCdnSettings() + ",");
        if (getHlsId3SegmentTagging() != null)
            sb.append("HlsId3SegmentTagging: " + getHlsId3SegmentTagging() + ",");
        if (getIFrameOnlyPlaylists() != null)
            sb.append("IFrameOnlyPlaylists: " + getIFrameOnlyPlaylists() + ",");
        if (getIndexNSegments() != null)
            sb.append("IndexNSegments: " + getIndexNSegments() + ",");
        if (getInputLossAction() != null)
            sb.append("InputLossAction: " + getInputLossAction() + ",");
        if (getIvInManifest() != null)
            sb.append("IvInManifest: " + getIvInManifest() + ",");
        if (getIvSource() != null)
            sb.append("IvSource: " + getIvSource() + ",");
        if (getKeepSegments() != null)
            sb.append("KeepSegments: " + getKeepSegments() + ",");
        if (getKeyFormat() != null)
            sb.append("KeyFormat: " + getKeyFormat() + ",");
        if (getKeyFormatVersions() != null)
            sb.append("KeyFormatVersions: " + getKeyFormatVersions() + ",");
        if (getKeyProviderSettings() != null)
            sb.append("KeyProviderSettings: " + getKeyProviderSettings() + ",");
        if (getManifestCompression() != null)
            sb.append("ManifestCompression: " + getManifestCompression() + ",");
        if (getManifestDurationFormat() != null)
            sb.append("ManifestDurationFormat: " + getManifestDurationFormat() + ",");
        if (getMinSegmentLength() != null)
            sb.append("MinSegmentLength: " + getMinSegmentLength() + ",");
        if (getMode() != null)
            sb.append("Mode: " + getMode() + ",");
        if (getOutputSelection() != null)
            sb.append("OutputSelection: " + getOutputSelection() + ",");
        if (getProgramDateTime() != null)
            sb.append("ProgramDateTime: " + getProgramDateTime() + ",");
        if (getProgramDateTimePeriod() != null)
            sb.append("ProgramDateTimePeriod: " + getProgramDateTimePeriod() + ",");
        if (getRedundantManifest() != null)
            sb.append("RedundantManifest: " + getRedundantManifest() + ",");
        if (getSegmentLength() != null)
            sb.append("SegmentLength: " + getSegmentLength() + ",");
        if (getSegmentationMode() != null)
            sb.append("SegmentationMode: " + getSegmentationMode() + ",");
        if (getSegmentsPerSubdirectory() != null)
            sb.append("SegmentsPerSubdirectory: " + getSegmentsPerSubdirectory() + ",");
        if (getStreamInfResolution() != null)
            sb.append("StreamInfResolution: " + getStreamInfResolution() + ",");
        if (getTimedMetadataId3Frame() != null)
            sb.append("TimedMetadataId3Frame: " + getTimedMetadataId3Frame() + ",");
        if (getTimedMetadataId3Period() != null)
            sb.append("TimedMetadataId3Period: " + getTimedMetadataId3Period() + ",");
        if (getTimestampDeltaMilliseconds() != null)
            sb.append("TimestampDeltaMilliseconds: " + getTimestampDeltaMilliseconds() + ",");
        if (getTsFileMode() != null)
            sb.append("TsFileMode: " + getTsFileMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdMarkers() == null) ? 0 : getAdMarkers().hashCode());
        hashCode = prime * hashCode
                + ((getBaseUrlContent() == null) ? 0 : getBaseUrlContent().hashCode());
        hashCode = prime * hashCode
                + ((getBaseUrlContent1() == null) ? 0 : getBaseUrlContent1().hashCode());
        hashCode = prime * hashCode
                + ((getBaseUrlManifest() == null) ? 0 : getBaseUrlManifest().hashCode());
        hashCode = prime * hashCode
                + ((getBaseUrlManifest1() == null) ? 0 : getBaseUrlManifest1().hashCode());
        hashCode = prime
                * hashCode
                + ((getCaptionLanguageMappings() == null) ? 0 : getCaptionLanguageMappings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCaptionLanguageSetting() == null) ? 0 : getCaptionLanguageSetting()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getClientCache() == null) ? 0 : getClientCache().hashCode());
        hashCode = prime * hashCode
                + ((getCodecSpecification() == null) ? 0 : getCodecSpecification().hashCode());
        hashCode = prime * hashCode + ((getConstantIv() == null) ? 0 : getConstantIv().hashCode());
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode
                + ((getDirectoryStructure() == null) ? 0 : getDirectoryStructure().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode
                + ((getHlsCdnSettings() == null) ? 0 : getHlsCdnSettings().hashCode());
        hashCode = prime * hashCode
                + ((getHlsId3SegmentTagging() == null) ? 0 : getHlsId3SegmentTagging().hashCode());
        hashCode = prime * hashCode
                + ((getIFrameOnlyPlaylists() == null) ? 0 : getIFrameOnlyPlaylists().hashCode());
        hashCode = prime * hashCode
                + ((getIndexNSegments() == null) ? 0 : getIndexNSegments().hashCode());
        hashCode = prime * hashCode
                + ((getInputLossAction() == null) ? 0 : getInputLossAction().hashCode());
        hashCode = prime * hashCode
                + ((getIvInManifest() == null) ? 0 : getIvInManifest().hashCode());
        hashCode = prime * hashCode + ((getIvSource() == null) ? 0 : getIvSource().hashCode());
        hashCode = prime * hashCode
                + ((getKeepSegments() == null) ? 0 : getKeepSegments().hashCode());
        hashCode = prime * hashCode + ((getKeyFormat() == null) ? 0 : getKeyFormat().hashCode());
        hashCode = prime * hashCode
                + ((getKeyFormatVersions() == null) ? 0 : getKeyFormatVersions().hashCode());
        hashCode = prime * hashCode
                + ((getKeyProviderSettings() == null) ? 0 : getKeyProviderSettings().hashCode());
        hashCode = prime * hashCode
                + ((getManifestCompression() == null) ? 0 : getManifestCompression().hashCode());
        hashCode = prime
                * hashCode
                + ((getManifestDurationFormat() == null) ? 0 : getManifestDurationFormat()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMinSegmentLength() == null) ? 0 : getMinSegmentLength().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode
                + ((getOutputSelection() == null) ? 0 : getOutputSelection().hashCode());
        hashCode = prime * hashCode
                + ((getProgramDateTime() == null) ? 0 : getProgramDateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getProgramDateTimePeriod() == null) ? 0 : getProgramDateTimePeriod().hashCode());
        hashCode = prime * hashCode
                + ((getRedundantManifest() == null) ? 0 : getRedundantManifest().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentLength() == null) ? 0 : getSegmentLength().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentationMode() == null) ? 0 : getSegmentationMode().hashCode());
        hashCode = prime
                * hashCode
                + ((getSegmentsPerSubdirectory() == null) ? 0 : getSegmentsPerSubdirectory()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStreamInfResolution() == null) ? 0 : getStreamInfResolution().hashCode());
        hashCode = prime
                * hashCode
                + ((getTimedMetadataId3Frame() == null) ? 0 : getTimedMetadataId3Frame().hashCode());
        hashCode = prime
                * hashCode
                + ((getTimedMetadataId3Period() == null) ? 0 : getTimedMetadataId3Period()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTimestampDeltaMilliseconds() == null) ? 0 : getTimestampDeltaMilliseconds()
                        .hashCode());
        hashCode = prime * hashCode + ((getTsFileMode() == null) ? 0 : getTsFileMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsGroupSettings == false)
            return false;
        HlsGroupSettings other = (HlsGroupSettings) obj;

        if (other.getAdMarkers() == null ^ this.getAdMarkers() == null)
            return false;
        if (other.getAdMarkers() != null
                && other.getAdMarkers().equals(this.getAdMarkers()) == false)
            return false;
        if (other.getBaseUrlContent() == null ^ this.getBaseUrlContent() == null)
            return false;
        if (other.getBaseUrlContent() != null
                && other.getBaseUrlContent().equals(this.getBaseUrlContent()) == false)
            return false;
        if (other.getBaseUrlContent1() == null ^ this.getBaseUrlContent1() == null)
            return false;
        if (other.getBaseUrlContent1() != null
                && other.getBaseUrlContent1().equals(this.getBaseUrlContent1()) == false)
            return false;
        if (other.getBaseUrlManifest() == null ^ this.getBaseUrlManifest() == null)
            return false;
        if (other.getBaseUrlManifest() != null
                && other.getBaseUrlManifest().equals(this.getBaseUrlManifest()) == false)
            return false;
        if (other.getBaseUrlManifest1() == null ^ this.getBaseUrlManifest1() == null)
            return false;
        if (other.getBaseUrlManifest1() != null
                && other.getBaseUrlManifest1().equals(this.getBaseUrlManifest1()) == false)
            return false;
        if (other.getCaptionLanguageMappings() == null ^ this.getCaptionLanguageMappings() == null)
            return false;
        if (other.getCaptionLanguageMappings() != null
                && other.getCaptionLanguageMappings().equals(this.getCaptionLanguageMappings()) == false)
            return false;
        if (other.getCaptionLanguageSetting() == null ^ this.getCaptionLanguageSetting() == null)
            return false;
        if (other.getCaptionLanguageSetting() != null
                && other.getCaptionLanguageSetting().equals(this.getCaptionLanguageSetting()) == false)
            return false;
        if (other.getClientCache() == null ^ this.getClientCache() == null)
            return false;
        if (other.getClientCache() != null
                && other.getClientCache().equals(this.getClientCache()) == false)
            return false;
        if (other.getCodecSpecification() == null ^ this.getCodecSpecification() == null)
            return false;
        if (other.getCodecSpecification() != null
                && other.getCodecSpecification().equals(this.getCodecSpecification()) == false)
            return false;
        if (other.getConstantIv() == null ^ this.getConstantIv() == null)
            return false;
        if (other.getConstantIv() != null
                && other.getConstantIv().equals(this.getConstantIv()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDirectoryStructure() == null ^ this.getDirectoryStructure() == null)
            return false;
        if (other.getDirectoryStructure() != null
                && other.getDirectoryStructure().equals(this.getDirectoryStructure()) == false)
            return false;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null
                && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getHlsCdnSettings() == null ^ this.getHlsCdnSettings() == null)
            return false;
        if (other.getHlsCdnSettings() != null
                && other.getHlsCdnSettings().equals(this.getHlsCdnSettings()) == false)
            return false;
        if (other.getHlsId3SegmentTagging() == null ^ this.getHlsId3SegmentTagging() == null)
            return false;
        if (other.getHlsId3SegmentTagging() != null
                && other.getHlsId3SegmentTagging().equals(this.getHlsId3SegmentTagging()) == false)
            return false;
        if (other.getIFrameOnlyPlaylists() == null ^ this.getIFrameOnlyPlaylists() == null)
            return false;
        if (other.getIFrameOnlyPlaylists() != null
                && other.getIFrameOnlyPlaylists().equals(this.getIFrameOnlyPlaylists()) == false)
            return false;
        if (other.getIndexNSegments() == null ^ this.getIndexNSegments() == null)
            return false;
        if (other.getIndexNSegments() != null
                && other.getIndexNSegments().equals(this.getIndexNSegments()) == false)
            return false;
        if (other.getInputLossAction() == null ^ this.getInputLossAction() == null)
            return false;
        if (other.getInputLossAction() != null
                && other.getInputLossAction().equals(this.getInputLossAction()) == false)
            return false;
        if (other.getIvInManifest() == null ^ this.getIvInManifest() == null)
            return false;
        if (other.getIvInManifest() != null
                && other.getIvInManifest().equals(this.getIvInManifest()) == false)
            return false;
        if (other.getIvSource() == null ^ this.getIvSource() == null)
            return false;
        if (other.getIvSource() != null && other.getIvSource().equals(this.getIvSource()) == false)
            return false;
        if (other.getKeepSegments() == null ^ this.getKeepSegments() == null)
            return false;
        if (other.getKeepSegments() != null
                && other.getKeepSegments().equals(this.getKeepSegments()) == false)
            return false;
        if (other.getKeyFormat() == null ^ this.getKeyFormat() == null)
            return false;
        if (other.getKeyFormat() != null
                && other.getKeyFormat().equals(this.getKeyFormat()) == false)
            return false;
        if (other.getKeyFormatVersions() == null ^ this.getKeyFormatVersions() == null)
            return false;
        if (other.getKeyFormatVersions() != null
                && other.getKeyFormatVersions().equals(this.getKeyFormatVersions()) == false)
            return false;
        if (other.getKeyProviderSettings() == null ^ this.getKeyProviderSettings() == null)
            return false;
        if (other.getKeyProviderSettings() != null
                && other.getKeyProviderSettings().equals(this.getKeyProviderSettings()) == false)
            return false;
        if (other.getManifestCompression() == null ^ this.getManifestCompression() == null)
            return false;
        if (other.getManifestCompression() != null
                && other.getManifestCompression().equals(this.getManifestCompression()) == false)
            return false;
        if (other.getManifestDurationFormat() == null ^ this.getManifestDurationFormat() == null)
            return false;
        if (other.getManifestDurationFormat() != null
                && other.getManifestDurationFormat().equals(this.getManifestDurationFormat()) == false)
            return false;
        if (other.getMinSegmentLength() == null ^ this.getMinSegmentLength() == null)
            return false;
        if (other.getMinSegmentLength() != null
                && other.getMinSegmentLength().equals(this.getMinSegmentLength()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getOutputSelection() == null ^ this.getOutputSelection() == null)
            return false;
        if (other.getOutputSelection() != null
                && other.getOutputSelection().equals(this.getOutputSelection()) == false)
            return false;
        if (other.getProgramDateTime() == null ^ this.getProgramDateTime() == null)
            return false;
        if (other.getProgramDateTime() != null
                && other.getProgramDateTime().equals(this.getProgramDateTime()) == false)
            return false;
        if (other.getProgramDateTimePeriod() == null ^ this.getProgramDateTimePeriod() == null)
            return false;
        if (other.getProgramDateTimePeriod() != null
                && other.getProgramDateTimePeriod().equals(this.getProgramDateTimePeriod()) == false)
            return false;
        if (other.getRedundantManifest() == null ^ this.getRedundantManifest() == null)
            return false;
        if (other.getRedundantManifest() != null
                && other.getRedundantManifest().equals(this.getRedundantManifest()) == false)
            return false;
        if (other.getSegmentLength() == null ^ this.getSegmentLength() == null)
            return false;
        if (other.getSegmentLength() != null
                && other.getSegmentLength().equals(this.getSegmentLength()) == false)
            return false;
        if (other.getSegmentationMode() == null ^ this.getSegmentationMode() == null)
            return false;
        if (other.getSegmentationMode() != null
                && other.getSegmentationMode().equals(this.getSegmentationMode()) == false)
            return false;
        if (other.getSegmentsPerSubdirectory() == null ^ this.getSegmentsPerSubdirectory() == null)
            return false;
        if (other.getSegmentsPerSubdirectory() != null
                && other.getSegmentsPerSubdirectory().equals(this.getSegmentsPerSubdirectory()) == false)
            return false;
        if (other.getStreamInfResolution() == null ^ this.getStreamInfResolution() == null)
            return false;
        if (other.getStreamInfResolution() != null
                && other.getStreamInfResolution().equals(this.getStreamInfResolution()) == false)
            return false;
        if (other.getTimedMetadataId3Frame() == null ^ this.getTimedMetadataId3Frame() == null)
            return false;
        if (other.getTimedMetadataId3Frame() != null
                && other.getTimedMetadataId3Frame().equals(this.getTimedMetadataId3Frame()) == false)
            return false;
        if (other.getTimedMetadataId3Period() == null ^ this.getTimedMetadataId3Period() == null)
            return false;
        if (other.getTimedMetadataId3Period() != null
                && other.getTimedMetadataId3Period().equals(this.getTimedMetadataId3Period()) == false)
            return false;
        if (other.getTimestampDeltaMilliseconds() == null
                ^ this.getTimestampDeltaMilliseconds() == null)
            return false;
        if (other.getTimestampDeltaMilliseconds() != null
                && other.getTimestampDeltaMilliseconds().equals(
                        this.getTimestampDeltaMilliseconds()) == false)
            return false;
        if (other.getTsFileMode() == null ^ this.getTsFileMode() == null)
            return false;
        if (other.getTsFileMode() != null
                && other.getTsFileMode().equals(this.getTsFileMode()) == false)
            return false;
        return true;
    }
}
