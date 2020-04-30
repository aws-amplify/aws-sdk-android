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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to
 * HLS_GROUP_SETTINGS.
 */
public class HlsGroupSettings implements Serializable {
    /**
     * Choose one or more ad marker types to decorate your Apple HLS manifest.
     * This setting does not determine whether SCTE-35 markers appear in the
     * outputs themselves.
     */
    private java.util.List<String> adMarkers;

    /**
     * By default, the service creates one top-level .m3u8 HLS manifest for each
     * HLS output group in your job. This default manifest references every
     * output in the output group. To create additional top-level manifests that
     * reference a subset of the outputs in the output group, specify a list of
     * them here.
     */
    private java.util.List<HlsAdditionalManifest> additionalManifests;

    /**
     * A partial URI prefix that will be prepended to each output in the media
     * .m3u8 file. Can be used if base manifest is delivered from a different
     * URL than the main .m3u8 file.
     */
    private String baseUrl;

    /**
     * Language to be used on Caption outputs
     */
    private java.util.List<HlsCaptionLanguageMapping> captionLanguageMappings;

    /**
     * Applies only to 608 Embedded output captions. Insert: Include
     * CLOSED-CAPTIONS lines in the manifest. Specify at least one language in
     * the CC1 Language Code field. One CLOSED-CAPTION line is added for each
     * Language Code you specify. Make sure to specify the languages in the
     * order in which they appear in the original source (if the source is
     * embedded format) or the order of the caption selectors (if the source is
     * other than embedded). Otherwise, languages in the manifest will not match
     * up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE
     * line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the
     * manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, OMIT, NONE
     */
    private String captionLanguageSetting;

    /**
     * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents
     * client from saving media segments for later replay.
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
     * <b>Allowed Values: </b>RFC_6381, RFC_4281
     */
    private String codecSpecification;

    /**
     * Use Destination (Destination) to specify the S3 output location and the
     * output filename base. Destination accepts format identifiers. If you do
     * not specify the base filename in the URI, the service will use the
     * filename of the input file. If your job has multiple inputs, the service
     * uses the filename of the first input file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^s3:\/\/<br/>
     */
    private String destination;

    /**
     * Settings associated with the destination. Will vary based on the type of
     * destination
     */
    private DestinationSettings destinationSettings;

    /**
     * Indicates whether segments should be placed in subdirectories.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM
     */
    private String directoryStructure;

    /**
     * DRM settings.
     */
    private HlsEncryptionSettings encryption;

    /**
     * When set to GZIP, compresses HLS playlist.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GZIP, NONE
     */
    private String manifestCompression;

    /**
     * Indicates whether the output manifest should use floating point values
     * for segment duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FLOATING_POINT, INTEGER
     */
    private String manifestDurationFormat;

    /**
     * Keep this setting at the default value of 0, unless you are
     * troubleshooting a problem with how devices play back the end of your
     * video asset. If you know that player devices are hanging on the final
     * segment of your video because the length of your final segment is too
     * short, use this setting to specify a minimum final segment length, in
     * seconds. Choose a value that is greater than or equal to 1 and less than
     * your segment length. When you specify a value for this setting, the
     * encoder will combine any final segment that is shorter than the length
     * that you specify with the previous segment. For example, your segment
     * length is 3 seconds and your final segment is .5 seconds without a
     * minimum final segment length; when you set the minimum final segment
     * length to 1, your final segment is 3.5 seconds.
     */
    private Double minFinalSegmentLength;

    /**
     * When set, Minimum Segment Size is enforced by looking ahead and back
     * within the specified range for a nearby avail and extending the segment
     * size if needed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer minSegmentLength;

    /**
     * Indicates whether the .m3u8 manifest file should be generated for this
     * HLS output group.
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
     * timestamp_offset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
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
     * When set to SINGLE_FILE, emits program as a single media resource (.ts)
     * file, uses #EXT-X-BYTERANGE tags to index segment for playback.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_FILE, SEGMENTED_FILES
     */
    private String segmentControl;

    /**
     * Length of MPEG-2 Transport Stream segments to create (in seconds). Note
     * that segments will end on the next keyframe after this number of seconds,
     * so actual segment length may be longer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer segmentLength;

    /**
     * Number of segments to write to a subdirectory before starting a new one.
     * directoryStructure must be SINGLE_DIRECTORY for this setting to have an
     * effect.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer segmentsPerSubdirectory;

    /**
     * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag
     * of variant manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
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
     * <b>Range: </b>-2147483648 - 2147483647<br/>
     */
    private Integer timedMetadataId3Period;

    /**
     * Provides an extra millisecond delta offset to fine tune the timestamps.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-2147483648 - 2147483647<br/>
     */
    private Integer timestampDeltaMilliseconds;

    /**
     * Choose one or more ad marker types to decorate your Apple HLS manifest.
     * This setting does not determine whether SCTE-35 markers appear in the
     * outputs themselves.
     *
     * @return Choose one or more ad marker types to decorate your Apple HLS
     *         manifest. This setting does not determine whether SCTE-35 markers
     *         appear in the outputs themselves.
     */
    public java.util.List<String> getAdMarkers() {
        return adMarkers;
    }

    /**
     * Choose one or more ad marker types to decorate your Apple HLS manifest.
     * This setting does not determine whether SCTE-35 markers appear in the
     * outputs themselves.
     *
     * @param adMarkers Choose one or more ad marker types to decorate your
     *            Apple HLS manifest. This setting does not determine whether
     *            SCTE-35 markers appear in the outputs themselves.
     */
    public void setAdMarkers(java.util.Collection<String> adMarkers) {
        if (adMarkers == null) {
            this.adMarkers = null;
            return;
        }

        this.adMarkers = new java.util.ArrayList<String>(adMarkers);
    }

    /**
     * Choose one or more ad marker types to decorate your Apple HLS manifest.
     * This setting does not determine whether SCTE-35 markers appear in the
     * outputs themselves.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adMarkers Choose one or more ad marker types to decorate your
     *            Apple HLS manifest. This setting does not determine whether
     *            SCTE-35 markers appear in the outputs themselves.
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
     * Choose one or more ad marker types to decorate your Apple HLS manifest.
     * This setting does not determine whether SCTE-35 markers appear in the
     * outputs themselves.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adMarkers Choose one or more ad marker types to decorate your
     *            Apple HLS manifest. This setting does not determine whether
     *            SCTE-35 markers appear in the outputs themselves.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withAdMarkers(java.util.Collection<String> adMarkers) {
        setAdMarkers(adMarkers);
        return this;
    }

    /**
     * By default, the service creates one top-level .m3u8 HLS manifest for each
     * HLS output group in your job. This default manifest references every
     * output in the output group. To create additional top-level manifests that
     * reference a subset of the outputs in the output group, specify a list of
     * them here.
     *
     * @return By default, the service creates one top-level .m3u8 HLS manifest
     *         for each HLS output group in your job. This default manifest
     *         references every output in the output group. To create additional
     *         top-level manifests that reference a subset of the outputs in the
     *         output group, specify a list of them here.
     */
    public java.util.List<HlsAdditionalManifest> getAdditionalManifests() {
        return additionalManifests;
    }

    /**
     * By default, the service creates one top-level .m3u8 HLS manifest for each
     * HLS output group in your job. This default manifest references every
     * output in the output group. To create additional top-level manifests that
     * reference a subset of the outputs in the output group, specify a list of
     * them here.
     *
     * @param additionalManifests By default, the service creates one top-level
     *            .m3u8 HLS manifest for each HLS output group in your job. This
     *            default manifest references every output in the output group.
     *            To create additional top-level manifests that reference a
     *            subset of the outputs in the output group, specify a list of
     *            them here.
     */
    public void setAdditionalManifests(
            java.util.Collection<HlsAdditionalManifest> additionalManifests) {
        if (additionalManifests == null) {
            this.additionalManifests = null;
            return;
        }

        this.additionalManifests = new java.util.ArrayList<HlsAdditionalManifest>(
                additionalManifests);
    }

    /**
     * By default, the service creates one top-level .m3u8 HLS manifest for each
     * HLS output group in your job. This default manifest references every
     * output in the output group. To create additional top-level manifests that
     * reference a subset of the outputs in the output group, specify a list of
     * them here.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalManifests By default, the service creates one top-level
     *            .m3u8 HLS manifest for each HLS output group in your job. This
     *            default manifest references every output in the output group.
     *            To create additional top-level manifests that reference a
     *            subset of the outputs in the output group, specify a list of
     *            them here.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withAdditionalManifests(HlsAdditionalManifest... additionalManifests) {
        if (getAdditionalManifests() == null) {
            this.additionalManifests = new java.util.ArrayList<HlsAdditionalManifest>(
                    additionalManifests.length);
        }
        for (HlsAdditionalManifest value : additionalManifests) {
            this.additionalManifests.add(value);
        }
        return this;
    }

    /**
     * By default, the service creates one top-level .m3u8 HLS manifest for each
     * HLS output group in your job. This default manifest references every
     * output in the output group. To create additional top-level manifests that
     * reference a subset of the outputs in the output group, specify a list of
     * them here.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalManifests By default, the service creates one top-level
     *            .m3u8 HLS manifest for each HLS output group in your job. This
     *            default manifest references every output in the output group.
     *            To create additional top-level manifests that reference a
     *            subset of the outputs in the output group, specify a list of
     *            them here.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withAdditionalManifests(
            java.util.Collection<HlsAdditionalManifest> additionalManifests) {
        setAdditionalManifests(additionalManifests);
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
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * A partial URI prefix that will be prepended to each output in the media
     * .m3u8 file. Can be used if base manifest is delivered from a different
     * URL than the main .m3u8 file.
     *
     * @param baseUrl A partial URI prefix that will be prepended to each output
     *            in the media .m3u8 file. Can be used if base manifest is
     *            delivered from a different URL than the main .m3u8 file.
     */
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * A partial URI prefix that will be prepended to each output in the media
     * .m3u8 file. Can be used if base manifest is delivered from a different
     * URL than the main .m3u8 file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baseUrl A partial URI prefix that will be prepended to each output
     *            in the media .m3u8 file. Can be used if base manifest is
     *            delivered from a different URL than the main .m3u8 file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    /**
     * Language to be used on Caption outputs
     *
     * @return Language to be used on Caption outputs
     */
    public java.util.List<HlsCaptionLanguageMapping> getCaptionLanguageMappings() {
        return captionLanguageMappings;
    }

    /**
     * Language to be used on Caption outputs
     *
     * @param captionLanguageMappings Language to be used on Caption outputs
     */
    public void setCaptionLanguageMappings(
            java.util.Collection<HlsCaptionLanguageMapping> captionLanguageMappings) {
        if (captionLanguageMappings == null) {
            this.captionLanguageMappings = null;
            return;
        }

        this.captionLanguageMappings = new java.util.ArrayList<HlsCaptionLanguageMapping>(
                captionLanguageMappings);
    }

    /**
     * Language to be used on Caption outputs
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param captionLanguageMappings Language to be used on Caption outputs
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withCaptionLanguageMappings(
            HlsCaptionLanguageMapping... captionLanguageMappings) {
        if (getCaptionLanguageMappings() == null) {
            this.captionLanguageMappings = new java.util.ArrayList<HlsCaptionLanguageMapping>(
                    captionLanguageMappings.length);
        }
        for (HlsCaptionLanguageMapping value : captionLanguageMappings) {
            this.captionLanguageMappings.add(value);
        }
        return this;
    }

    /**
     * Language to be used on Caption outputs
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param captionLanguageMappings Language to be used on Caption outputs
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withCaptionLanguageMappings(
            java.util.Collection<HlsCaptionLanguageMapping> captionLanguageMappings) {
        setCaptionLanguageMappings(captionLanguageMappings);
        return this;
    }

    /**
     * Applies only to 608 Embedded output captions. Insert: Include
     * CLOSED-CAPTIONS lines in the manifest. Specify at least one language in
     * the CC1 Language Code field. One CLOSED-CAPTION line is added for each
     * Language Code you specify. Make sure to specify the languages in the
     * order in which they appear in the original source (if the source is
     * embedded format) or the order of the caption selectors (if the source is
     * other than embedded). Otherwise, languages in the manifest will not match
     * up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE
     * line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the
     * manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, OMIT, NONE
     *
     * @return Applies only to 608 Embedded output captions. Insert: Include
     *         CLOSED-CAPTIONS lines in the manifest. Specify at least one
     *         language in the CC1 Language Code field. One CLOSED-CAPTION line
     *         is added for each Language Code you specify. Make sure to specify
     *         the languages in the order in which they appear in the original
     *         source (if the source is embedded format) or the order of the
     *         caption selectors (if the source is other than embedded).
     *         Otherwise, languages in the manifest will not match up properly
     *         with the output captions. None: Include CLOSED-CAPTIONS=NONE line
     *         in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the
     *         manifest.
     * @see HlsCaptionLanguageSetting
     */
    public String getCaptionLanguageSetting() {
        return captionLanguageSetting;
    }

    /**
     * Applies only to 608 Embedded output captions. Insert: Include
     * CLOSED-CAPTIONS lines in the manifest. Specify at least one language in
     * the CC1 Language Code field. One CLOSED-CAPTION line is added for each
     * Language Code you specify. Make sure to specify the languages in the
     * order in which they appear in the original source (if the source is
     * embedded format) or the order of the caption selectors (if the source is
     * other than embedded). Otherwise, languages in the manifest will not match
     * up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE
     * line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the
     * manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, OMIT, NONE
     *
     * @param captionLanguageSetting Applies only to 608 Embedded output
     *            captions. Insert: Include CLOSED-CAPTIONS lines in the
     *            manifest. Specify at least one language in the CC1 Language
     *            Code field. One CLOSED-CAPTION line is added for each Language
     *            Code you specify. Make sure to specify the languages in the
     *            order in which they appear in the original source (if the
     *            source is embedded format) or the order of the caption
     *            selectors (if the source is other than embedded). Otherwise,
     *            languages in the manifest will not match up properly with the
     *            output captions. None: Include CLOSED-CAPTIONS=NONE line in
     *            the manifest. Omit: Omit any CLOSED-CAPTIONS line from the
     *            manifest.
     * @see HlsCaptionLanguageSetting
     */
    public void setCaptionLanguageSetting(String captionLanguageSetting) {
        this.captionLanguageSetting = captionLanguageSetting;
    }

    /**
     * Applies only to 608 Embedded output captions. Insert: Include
     * CLOSED-CAPTIONS lines in the manifest. Specify at least one language in
     * the CC1 Language Code field. One CLOSED-CAPTION line is added for each
     * Language Code you specify. Make sure to specify the languages in the
     * order in which they appear in the original source (if the source is
     * embedded format) or the order of the caption selectors (if the source is
     * other than embedded). Otherwise, languages in the manifest will not match
     * up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE
     * line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the
     * manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, OMIT, NONE
     *
     * @param captionLanguageSetting Applies only to 608 Embedded output
     *            captions. Insert: Include CLOSED-CAPTIONS lines in the
     *            manifest. Specify at least one language in the CC1 Language
     *            Code field. One CLOSED-CAPTION line is added for each Language
     *            Code you specify. Make sure to specify the languages in the
     *            order in which they appear in the original source (if the
     *            source is embedded format) or the order of the caption
     *            selectors (if the source is other than embedded). Otherwise,
     *            languages in the manifest will not match up properly with the
     *            output captions. None: Include CLOSED-CAPTIONS=NONE line in
     *            the manifest. Omit: Omit any CLOSED-CAPTIONS line from the
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
     * Applies only to 608 Embedded output captions. Insert: Include
     * CLOSED-CAPTIONS lines in the manifest. Specify at least one language in
     * the CC1 Language Code field. One CLOSED-CAPTION line is added for each
     * Language Code you specify. Make sure to specify the languages in the
     * order in which they appear in the original source (if the source is
     * embedded format) or the order of the caption selectors (if the source is
     * other than embedded). Otherwise, languages in the manifest will not match
     * up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE
     * line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the
     * manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, OMIT, NONE
     *
     * @param captionLanguageSetting Applies only to 608 Embedded output
     *            captions. Insert: Include CLOSED-CAPTIONS lines in the
     *            manifest. Specify at least one language in the CC1 Language
     *            Code field. One CLOSED-CAPTION line is added for each Language
     *            Code you specify. Make sure to specify the languages in the
     *            order in which they appear in the original source (if the
     *            source is embedded format) or the order of the caption
     *            selectors (if the source is other than embedded). Otherwise,
     *            languages in the manifest will not match up properly with the
     *            output captions. None: Include CLOSED-CAPTIONS=NONE line in
     *            the manifest. Omit: Omit any CLOSED-CAPTIONS line from the
     *            manifest.
     * @see HlsCaptionLanguageSetting
     */
    public void setCaptionLanguageSetting(HlsCaptionLanguageSetting captionLanguageSetting) {
        this.captionLanguageSetting = captionLanguageSetting.toString();
    }

    /**
     * Applies only to 608 Embedded output captions. Insert: Include
     * CLOSED-CAPTIONS lines in the manifest. Specify at least one language in
     * the CC1 Language Code field. One CLOSED-CAPTION line is added for each
     * Language Code you specify. Make sure to specify the languages in the
     * order in which they appear in the original source (if the source is
     * embedded format) or the order of the caption selectors (if the source is
     * other than embedded). Otherwise, languages in the manifest will not match
     * up properly with the output captions. None: Include CLOSED-CAPTIONS=NONE
     * line in the manifest. Omit: Omit any CLOSED-CAPTIONS line from the
     * manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, OMIT, NONE
     *
     * @param captionLanguageSetting Applies only to 608 Embedded output
     *            captions. Insert: Include CLOSED-CAPTIONS lines in the
     *            manifest. Specify at least one language in the CC1 Language
     *            Code field. One CLOSED-CAPTION line is added for each Language
     *            Code you specify. Make sure to specify the languages in the
     *            order in which they appear in the original source (if the
     *            source is embedded format) or the order of the caption
     *            selectors (if the source is other than embedded). Otherwise,
     *            languages in the manifest will not match up properly with the
     *            output captions. None: Include CLOSED-CAPTIONS=NONE line in
     *            the manifest. Omit: Omit any CLOSED-CAPTIONS line from the
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
     * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents
     * client from saving media segments for later replay.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which
     *         prevents client from saving media segments for later replay.
     * @see HlsClientCache
     */
    public String getClientCache() {
        return clientCache;
    }

    /**
     * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents
     * client from saving media segments for later replay.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param clientCache When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag,
     *            which prevents client from saving media segments for later
     *            replay.
     * @see HlsClientCache
     */
    public void setClientCache(String clientCache) {
        this.clientCache = clientCache;
    }

    /**
     * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents
     * client from saving media segments for later replay.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param clientCache When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag,
     *            which prevents client from saving media segments for later
     *            replay.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsClientCache
     */
    public HlsGroupSettings withClientCache(String clientCache) {
        this.clientCache = clientCache;
        return this;
    }

    /**
     * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents
     * client from saving media segments for later replay.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param clientCache When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag,
     *            which prevents client from saving media segments for later
     *            replay.
     * @see HlsClientCache
     */
    public void setClientCache(HlsClientCache clientCache) {
        this.clientCache = clientCache.toString();
    }

    /**
     * When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag, which prevents
     * client from saving media segments for later replay.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param clientCache When set to ENABLED, sets #EXT-X-ALLOW-CACHE:no tag,
     *            which prevents client from saving media segments for later
     *            replay.
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
     * <b>Allowed Values: </b>RFC_6381, RFC_4281
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
     * <b>Allowed Values: </b>RFC_6381, RFC_4281
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
     * <b>Allowed Values: </b>RFC_6381, RFC_4281
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
     * <b>Allowed Values: </b>RFC_6381, RFC_4281
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
     * <b>Allowed Values: </b>RFC_6381, RFC_4281
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
     * Use Destination (Destination) to specify the S3 output location and the
     * output filename base. Destination accepts format identifiers. If you do
     * not specify the base filename in the URI, the service will use the
     * filename of the input file. If your job has multiple inputs, the service
     * uses the filename of the first input file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^s3:\/\/<br/>
     *
     * @return Use Destination (Destination) to specify the S3 output location
     *         and the output filename base. Destination accepts format
     *         identifiers. If you do not specify the base filename in the URI,
     *         the service will use the filename of the input file. If your job
     *         has multiple inputs, the service uses the filename of the first
     *         input file.
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Use Destination (Destination) to specify the S3 output location and the
     * output filename base. Destination accepts format identifiers. If you do
     * not specify the base filename in the URI, the service will use the
     * filename of the input file. If your job has multiple inputs, the service
     * uses the filename of the first input file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^s3:\/\/<br/>
     *
     * @param destination Use Destination (Destination) to specify the S3 output
     *            location and the output filename base. Destination accepts
     *            format identifiers. If you do not specify the base filename in
     *            the URI, the service will use the filename of the input file.
     *            If your job has multiple inputs, the service uses the filename
     *            of the first input file.
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Use Destination (Destination) to specify the S3 output location and the
     * output filename base. Destination accepts format identifiers. If you do
     * not specify the base filename in the URI, the service will use the
     * filename of the input file. If your job has multiple inputs, the service
     * uses the filename of the first input file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^s3:\/\/<br/>
     *
     * @param destination Use Destination (Destination) to specify the S3 output
     *            location and the output filename base. Destination accepts
     *            format identifiers. If you do not specify the base filename in
     *            the URI, the service will use the filename of the input file.
     *            If your job has multiple inputs, the service uses the filename
     *            of the first input file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Settings associated with the destination. Will vary based on the type of
     * destination
     *
     * @return Settings associated with the destination. Will vary based on the
     *         type of destination
     */
    public DestinationSettings getDestinationSettings() {
        return destinationSettings;
    }

    /**
     * Settings associated with the destination. Will vary based on the type of
     * destination
     *
     * @param destinationSettings Settings associated with the destination. Will
     *            vary based on the type of destination
     */
    public void setDestinationSettings(DestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
    }

    /**
     * Settings associated with the destination. Will vary based on the type of
     * destination
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationSettings Settings associated with the destination. Will
     *            vary based on the type of destination
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withDestinationSettings(DestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
        return this;
    }

    /**
     * Indicates whether segments should be placed in subdirectories.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM
     *
     * @return Indicates whether segments should be placed in subdirectories.
     * @see HlsDirectoryStructure
     */
    public String getDirectoryStructure() {
        return directoryStructure;
    }

    /**
     * Indicates whether segments should be placed in subdirectories.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM
     *
     * @param directoryStructure Indicates whether segments should be placed in
     *            subdirectories.
     * @see HlsDirectoryStructure
     */
    public void setDirectoryStructure(String directoryStructure) {
        this.directoryStructure = directoryStructure;
    }

    /**
     * Indicates whether segments should be placed in subdirectories.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM
     *
     * @param directoryStructure Indicates whether segments should be placed in
     *            subdirectories.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsDirectoryStructure
     */
    public HlsGroupSettings withDirectoryStructure(String directoryStructure) {
        this.directoryStructure = directoryStructure;
        return this;
    }

    /**
     * Indicates whether segments should be placed in subdirectories.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM
     *
     * @param directoryStructure Indicates whether segments should be placed in
     *            subdirectories.
     * @see HlsDirectoryStructure
     */
    public void setDirectoryStructure(HlsDirectoryStructure directoryStructure) {
        this.directoryStructure = directoryStructure.toString();
    }

    /**
     * Indicates whether segments should be placed in subdirectories.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_DIRECTORY, SUBDIRECTORY_PER_STREAM
     *
     * @param directoryStructure Indicates whether segments should be placed in
     *            subdirectories.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsDirectoryStructure
     */
    public HlsGroupSettings withDirectoryStructure(HlsDirectoryStructure directoryStructure) {
        this.directoryStructure = directoryStructure.toString();
        return this;
    }

    /**
     * DRM settings.
     *
     * @return DRM settings.
     */
    public HlsEncryptionSettings getEncryption() {
        return encryption;
    }

    /**
     * DRM settings.
     *
     * @param encryption DRM settings.
     */
    public void setEncryption(HlsEncryptionSettings encryption) {
        this.encryption = encryption;
    }

    /**
     * DRM settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryption DRM settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withEncryption(HlsEncryptionSettings encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * When set to GZIP, compresses HLS playlist.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GZIP, NONE
     *
     * @return When set to GZIP, compresses HLS playlist.
     * @see HlsManifestCompression
     */
    public String getManifestCompression() {
        return manifestCompression;
    }

    /**
     * When set to GZIP, compresses HLS playlist.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GZIP, NONE
     *
     * @param manifestCompression When set to GZIP, compresses HLS playlist.
     * @see HlsManifestCompression
     */
    public void setManifestCompression(String manifestCompression) {
        this.manifestCompression = manifestCompression;
    }

    /**
     * When set to GZIP, compresses HLS playlist.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GZIP, NONE
     *
     * @param manifestCompression When set to GZIP, compresses HLS playlist.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsManifestCompression
     */
    public HlsGroupSettings withManifestCompression(String manifestCompression) {
        this.manifestCompression = manifestCompression;
        return this;
    }

    /**
     * When set to GZIP, compresses HLS playlist.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GZIP, NONE
     *
     * @param manifestCompression When set to GZIP, compresses HLS playlist.
     * @see HlsManifestCompression
     */
    public void setManifestCompression(HlsManifestCompression manifestCompression) {
        this.manifestCompression = manifestCompression.toString();
    }

    /**
     * When set to GZIP, compresses HLS playlist.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GZIP, NONE
     *
     * @param manifestCompression When set to GZIP, compresses HLS playlist.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsManifestCompression
     */
    public HlsGroupSettings withManifestCompression(HlsManifestCompression manifestCompression) {
        this.manifestCompression = manifestCompression.toString();
        return this;
    }

    /**
     * Indicates whether the output manifest should use floating point values
     * for segment duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FLOATING_POINT, INTEGER
     *
     * @return Indicates whether the output manifest should use floating point
     *         values for segment duration.
     * @see HlsManifestDurationFormat
     */
    public String getManifestDurationFormat() {
        return manifestDurationFormat;
    }

    /**
     * Indicates whether the output manifest should use floating point values
     * for segment duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FLOATING_POINT, INTEGER
     *
     * @param manifestDurationFormat Indicates whether the output manifest
     *            should use floating point values for segment duration.
     * @see HlsManifestDurationFormat
     */
    public void setManifestDurationFormat(String manifestDurationFormat) {
        this.manifestDurationFormat = manifestDurationFormat;
    }

    /**
     * Indicates whether the output manifest should use floating point values
     * for segment duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FLOATING_POINT, INTEGER
     *
     * @param manifestDurationFormat Indicates whether the output manifest
     *            should use floating point values for segment duration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsManifestDurationFormat
     */
    public HlsGroupSettings withManifestDurationFormat(String manifestDurationFormat) {
        this.manifestDurationFormat = manifestDurationFormat;
        return this;
    }

    /**
     * Indicates whether the output manifest should use floating point values
     * for segment duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FLOATING_POINT, INTEGER
     *
     * @param manifestDurationFormat Indicates whether the output manifest
     *            should use floating point values for segment duration.
     * @see HlsManifestDurationFormat
     */
    public void setManifestDurationFormat(HlsManifestDurationFormat manifestDurationFormat) {
        this.manifestDurationFormat = manifestDurationFormat.toString();
    }

    /**
     * Indicates whether the output manifest should use floating point values
     * for segment duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FLOATING_POINT, INTEGER
     *
     * @param manifestDurationFormat Indicates whether the output manifest
     *            should use floating point values for segment duration.
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
     * Keep this setting at the default value of 0, unless you are
     * troubleshooting a problem with how devices play back the end of your
     * video asset. If you know that player devices are hanging on the final
     * segment of your video because the length of your final segment is too
     * short, use this setting to specify a minimum final segment length, in
     * seconds. Choose a value that is greater than or equal to 1 and less than
     * your segment length. When you specify a value for this setting, the
     * encoder will combine any final segment that is shorter than the length
     * that you specify with the previous segment. For example, your segment
     * length is 3 seconds and your final segment is .5 seconds without a
     * minimum final segment length; when you set the minimum final segment
     * length to 1, your final segment is 3.5 seconds.
     *
     * @return Keep this setting at the default value of 0, unless you are
     *         troubleshooting a problem with how devices play back the end of
     *         your video asset. If you know that player devices are hanging on
     *         the final segment of your video because the length of your final
     *         segment is too short, use this setting to specify a minimum final
     *         segment length, in seconds. Choose a value that is greater than
     *         or equal to 1 and less than your segment length. When you specify
     *         a value for this setting, the encoder will combine any final
     *         segment that is shorter than the length that you specify with the
     *         previous segment. For example, your segment length is 3 seconds
     *         and your final segment is .5 seconds without a minimum final
     *         segment length; when you set the minimum final segment length to
     *         1, your final segment is 3.5 seconds.
     */
    public Double getMinFinalSegmentLength() {
        return minFinalSegmentLength;
    }

    /**
     * Keep this setting at the default value of 0, unless you are
     * troubleshooting a problem with how devices play back the end of your
     * video asset. If you know that player devices are hanging on the final
     * segment of your video because the length of your final segment is too
     * short, use this setting to specify a minimum final segment length, in
     * seconds. Choose a value that is greater than or equal to 1 and less than
     * your segment length. When you specify a value for this setting, the
     * encoder will combine any final segment that is shorter than the length
     * that you specify with the previous segment. For example, your segment
     * length is 3 seconds and your final segment is .5 seconds without a
     * minimum final segment length; when you set the minimum final segment
     * length to 1, your final segment is 3.5 seconds.
     *
     * @param minFinalSegmentLength Keep this setting at the default value of 0,
     *            unless you are troubleshooting a problem with how devices play
     *            back the end of your video asset. If you know that player
     *            devices are hanging on the final segment of your video because
     *            the length of your final segment is too short, use this
     *            setting to specify a minimum final segment length, in seconds.
     *            Choose a value that is greater than or equal to 1 and less
     *            than your segment length. When you specify a value for this
     *            setting, the encoder will combine any final segment that is
     *            shorter than the length that you specify with the previous
     *            segment. For example, your segment length is 3 seconds and
     *            your final segment is .5 seconds without a minimum final
     *            segment length; when you set the minimum final segment length
     *            to 1, your final segment is 3.5 seconds.
     */
    public void setMinFinalSegmentLength(Double minFinalSegmentLength) {
        this.minFinalSegmentLength = minFinalSegmentLength;
    }

    /**
     * Keep this setting at the default value of 0, unless you are
     * troubleshooting a problem with how devices play back the end of your
     * video asset. If you know that player devices are hanging on the final
     * segment of your video because the length of your final segment is too
     * short, use this setting to specify a minimum final segment length, in
     * seconds. Choose a value that is greater than or equal to 1 and less than
     * your segment length. When you specify a value for this setting, the
     * encoder will combine any final segment that is shorter than the length
     * that you specify with the previous segment. For example, your segment
     * length is 3 seconds and your final segment is .5 seconds without a
     * minimum final segment length; when you set the minimum final segment
     * length to 1, your final segment is 3.5 seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minFinalSegmentLength Keep this setting at the default value of 0,
     *            unless you are troubleshooting a problem with how devices play
     *            back the end of your video asset. If you know that player
     *            devices are hanging on the final segment of your video because
     *            the length of your final segment is too short, use this
     *            setting to specify a minimum final segment length, in seconds.
     *            Choose a value that is greater than or equal to 1 and less
     *            than your segment length. When you specify a value for this
     *            setting, the encoder will combine any final segment that is
     *            shorter than the length that you specify with the previous
     *            segment. For example, your segment length is 3 seconds and
     *            your final segment is .5 seconds without a minimum final
     *            segment length; when you set the minimum final segment length
     *            to 1, your final segment is 3.5 seconds.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsGroupSettings withMinFinalSegmentLength(Double minFinalSegmentLength) {
        this.minFinalSegmentLength = minFinalSegmentLength;
        return this;
    }

    /**
     * When set, Minimum Segment Size is enforced by looking ahead and back
     * within the specified range for a nearby avail and extending the segment
     * size if needed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return When set, Minimum Segment Size is enforced by looking ahead and
     *         back within the specified range for a nearby avail and extending
     *         the segment size if needed.
     */
    public Integer getMinSegmentLength() {
        return minSegmentLength;
    }

    /**
     * When set, Minimum Segment Size is enforced by looking ahead and back
     * within the specified range for a nearby avail and extending the segment
     * size if needed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param minSegmentLength When set, Minimum Segment Size is enforced by
     *            looking ahead and back within the specified range for a nearby
     *            avail and extending the segment size if needed.
     */
    public void setMinSegmentLength(Integer minSegmentLength) {
        this.minSegmentLength = minSegmentLength;
    }

    /**
     * When set, Minimum Segment Size is enforced by looking ahead and back
     * within the specified range for a nearby avail and extending the segment
     * size if needed.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param minSegmentLength When set, Minimum Segment Size is enforced by
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
     * Indicates whether the .m3u8 manifest file should be generated for this
     * HLS output group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY
     *
     * @return Indicates whether the .m3u8 manifest file should be generated for
     *         this HLS output group.
     * @see HlsOutputSelection
     */
    public String getOutputSelection() {
        return outputSelection;
    }

    /**
     * Indicates whether the .m3u8 manifest file should be generated for this
     * HLS output group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY
     *
     * @param outputSelection Indicates whether the .m3u8 manifest file should
     *            be generated for this HLS output group.
     * @see HlsOutputSelection
     */
    public void setOutputSelection(String outputSelection) {
        this.outputSelection = outputSelection;
    }

    /**
     * Indicates whether the .m3u8 manifest file should be generated for this
     * HLS output group.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY
     *
     * @param outputSelection Indicates whether the .m3u8 manifest file should
     *            be generated for this HLS output group.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsOutputSelection
     */
    public HlsGroupSettings withOutputSelection(String outputSelection) {
        this.outputSelection = outputSelection;
        return this;
    }

    /**
     * Indicates whether the .m3u8 manifest file should be generated for this
     * HLS output group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY
     *
     * @param outputSelection Indicates whether the .m3u8 manifest file should
     *            be generated for this HLS output group.
     * @see HlsOutputSelection
     */
    public void setOutputSelection(HlsOutputSelection outputSelection) {
        this.outputSelection = outputSelection.toString();
    }

    /**
     * Indicates whether the .m3u8 manifest file should be generated for this
     * HLS output group.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MANIFESTS_AND_SEGMENTS, SEGMENTS_ONLY
     *
     * @param outputSelection Indicates whether the .m3u8 manifest file should
     *            be generated for this HLS output group.
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
     * timestamp_offset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @return Includes or excludes EXT-X-PROGRAM-DATE-TIME tag in .m3u8
     *         manifest files. The value is calculated as follows: either the
     *         program date and time are initialized using the input timecode
     *         source, or the time is initialized using the input timecode
     *         source and the date is initialized using the timestamp_offset.
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
     * timestamp_offset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param programDateTime Includes or excludes EXT-X-PROGRAM-DATE-TIME tag
     *            in .m3u8 manifest files. The value is calculated as follows:
     *            either the program date and time are initialized using the
     *            input timecode source, or the time is initialized using the
     *            input timecode source and the date is initialized using the
     *            timestamp_offset.
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
     * timestamp_offset.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param programDateTime Includes or excludes EXT-X-PROGRAM-DATE-TIME tag
     *            in .m3u8 manifest files. The value is calculated as follows:
     *            either the program date and time are initialized using the
     *            input timecode source, or the time is initialized using the
     *            input timecode source and the date is initialized using the
     *            timestamp_offset.
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
     * timestamp_offset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param programDateTime Includes or excludes EXT-X-PROGRAM-DATE-TIME tag
     *            in .m3u8 manifest files. The value is calculated as follows:
     *            either the program date and time are initialized using the
     *            input timecode source, or the time is initialized using the
     *            input timecode source and the date is initialized using the
     *            timestamp_offset.
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
     * timestamp_offset.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param programDateTime Includes or excludes EXT-X-PROGRAM-DATE-TIME tag
     *            in .m3u8 manifest files. The value is calculated as follows:
     *            either the program date and time are initialized using the
     *            input timecode source, or the time is initialized using the
     *            input timecode source and the date is initialized using the
     *            timestamp_offset.
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
     * When set to SINGLE_FILE, emits program as a single media resource (.ts)
     * file, uses #EXT-X-BYTERANGE tags to index segment for playback.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_FILE, SEGMENTED_FILES
     *
     * @return When set to SINGLE_FILE, emits program as a single media resource
     *         (.ts) file, uses #EXT-X-BYTERANGE tags to index segment for
     *         playback.
     * @see HlsSegmentControl
     */
    public String getSegmentControl() {
        return segmentControl;
    }

    /**
     * When set to SINGLE_FILE, emits program as a single media resource (.ts)
     * file, uses #EXT-X-BYTERANGE tags to index segment for playback.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_FILE, SEGMENTED_FILES
     *
     * @param segmentControl When set to SINGLE_FILE, emits program as a single
     *            media resource (.ts) file, uses #EXT-X-BYTERANGE tags to index
     *            segment for playback.
     * @see HlsSegmentControl
     */
    public void setSegmentControl(String segmentControl) {
        this.segmentControl = segmentControl;
    }

    /**
     * When set to SINGLE_FILE, emits program as a single media resource (.ts)
     * file, uses #EXT-X-BYTERANGE tags to index segment for playback.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_FILE, SEGMENTED_FILES
     *
     * @param segmentControl When set to SINGLE_FILE, emits program as a single
     *            media resource (.ts) file, uses #EXT-X-BYTERANGE tags to index
     *            segment for playback.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsSegmentControl
     */
    public HlsGroupSettings withSegmentControl(String segmentControl) {
        this.segmentControl = segmentControl;
        return this;
    }

    /**
     * When set to SINGLE_FILE, emits program as a single media resource (.ts)
     * file, uses #EXT-X-BYTERANGE tags to index segment for playback.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_FILE, SEGMENTED_FILES
     *
     * @param segmentControl When set to SINGLE_FILE, emits program as a single
     *            media resource (.ts) file, uses #EXT-X-BYTERANGE tags to index
     *            segment for playback.
     * @see HlsSegmentControl
     */
    public void setSegmentControl(HlsSegmentControl segmentControl) {
        this.segmentControl = segmentControl.toString();
    }

    /**
     * When set to SINGLE_FILE, emits program as a single media resource (.ts)
     * file, uses #EXT-X-BYTERANGE tags to index segment for playback.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_FILE, SEGMENTED_FILES
     *
     * @param segmentControl When set to SINGLE_FILE, emits program as a single
     *            media resource (.ts) file, uses #EXT-X-BYTERANGE tags to index
     *            segment for playback.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsSegmentControl
     */
    public HlsGroupSettings withSegmentControl(HlsSegmentControl segmentControl) {
        this.segmentControl = segmentControl.toString();
        return this;
    }

    /**
     * Length of MPEG-2 Transport Stream segments to create (in seconds). Note
     * that segments will end on the next keyframe after this number of seconds,
     * so actual segment length may be longer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
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
     * <b>Range: </b>1 - 2147483647<br/>
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
     * <b>Range: </b>1 - 2147483647<br/>
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
     * Number of segments to write to a subdirectory before starting a new one.
     * directoryStructure must be SINGLE_DIRECTORY for this setting to have an
     * effect.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return Number of segments to write to a subdirectory before starting a
     *         new one. directoryStructure must be SINGLE_DIRECTORY for this
     *         setting to have an effect.
     */
    public Integer getSegmentsPerSubdirectory() {
        return segmentsPerSubdirectory;
    }

    /**
     * Number of segments to write to a subdirectory before starting a new one.
     * directoryStructure must be SINGLE_DIRECTORY for this setting to have an
     * effect.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param segmentsPerSubdirectory Number of segments to write to a
     *            subdirectory before starting a new one. directoryStructure
     *            must be SINGLE_DIRECTORY for this setting to have an effect.
     */
    public void setSegmentsPerSubdirectory(Integer segmentsPerSubdirectory) {
        this.segmentsPerSubdirectory = segmentsPerSubdirectory;
    }

    /**
     * Number of segments to write to a subdirectory before starting a new one.
     * directoryStructure must be SINGLE_DIRECTORY for this setting to have an
     * effect.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param segmentsPerSubdirectory Number of segments to write to a
     *            subdirectory before starting a new one. directoryStructure
     *            must be SINGLE_DIRECTORY for this setting to have an effect.
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
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
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
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
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
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
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
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
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
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
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
     * <b>Range: </b>-2147483648 - 2147483647<br/>
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
     * <b>Range: </b>-2147483648 - 2147483647<br/>
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
     * <b>Range: </b>-2147483648 - 2147483647<br/>
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
     * <b>Range: </b>-2147483648 - 2147483647<br/>
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
     * <b>Range: </b>-2147483648 - 2147483647<br/>
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
     * <b>Range: </b>-2147483648 - 2147483647<br/>
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
        if (getAdditionalManifests() != null)
            sb.append("AdditionalManifests: " + getAdditionalManifests() + ",");
        if (getBaseUrl() != null)
            sb.append("BaseUrl: " + getBaseUrl() + ",");
        if (getCaptionLanguageMappings() != null)
            sb.append("CaptionLanguageMappings: " + getCaptionLanguageMappings() + ",");
        if (getCaptionLanguageSetting() != null)
            sb.append("CaptionLanguageSetting: " + getCaptionLanguageSetting() + ",");
        if (getClientCache() != null)
            sb.append("ClientCache: " + getClientCache() + ",");
        if (getCodecSpecification() != null)
            sb.append("CodecSpecification: " + getCodecSpecification() + ",");
        if (getDestination() != null)
            sb.append("Destination: " + getDestination() + ",");
        if (getDestinationSettings() != null)
            sb.append("DestinationSettings: " + getDestinationSettings() + ",");
        if (getDirectoryStructure() != null)
            sb.append("DirectoryStructure: " + getDirectoryStructure() + ",");
        if (getEncryption() != null)
            sb.append("Encryption: " + getEncryption() + ",");
        if (getManifestCompression() != null)
            sb.append("ManifestCompression: " + getManifestCompression() + ",");
        if (getManifestDurationFormat() != null)
            sb.append("ManifestDurationFormat: " + getManifestDurationFormat() + ",");
        if (getMinFinalSegmentLength() != null)
            sb.append("MinFinalSegmentLength: " + getMinFinalSegmentLength() + ",");
        if (getMinSegmentLength() != null)
            sb.append("MinSegmentLength: " + getMinSegmentLength() + ",");
        if (getOutputSelection() != null)
            sb.append("OutputSelection: " + getOutputSelection() + ",");
        if (getProgramDateTime() != null)
            sb.append("ProgramDateTime: " + getProgramDateTime() + ",");
        if (getProgramDateTimePeriod() != null)
            sb.append("ProgramDateTimePeriod: " + getProgramDateTimePeriod() + ",");
        if (getSegmentControl() != null)
            sb.append("SegmentControl: " + getSegmentControl() + ",");
        if (getSegmentLength() != null)
            sb.append("SegmentLength: " + getSegmentLength() + ",");
        if (getSegmentsPerSubdirectory() != null)
            sb.append("SegmentsPerSubdirectory: " + getSegmentsPerSubdirectory() + ",");
        if (getStreamInfResolution() != null)
            sb.append("StreamInfResolution: " + getStreamInfResolution() + ",");
        if (getTimedMetadataId3Frame() != null)
            sb.append("TimedMetadataId3Frame: " + getTimedMetadataId3Frame() + ",");
        if (getTimedMetadataId3Period() != null)
            sb.append("TimedMetadataId3Period: " + getTimedMetadataId3Period() + ",");
        if (getTimestampDeltaMilliseconds() != null)
            sb.append("TimestampDeltaMilliseconds: " + getTimestampDeltaMilliseconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdMarkers() == null) ? 0 : getAdMarkers().hashCode());
        hashCode = prime * hashCode
                + ((getAdditionalManifests() == null) ? 0 : getAdditionalManifests().hashCode());
        hashCode = prime * hashCode + ((getBaseUrl() == null) ? 0 : getBaseUrl().hashCode());
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
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationSettings() == null) ? 0 : getDestinationSettings().hashCode());
        hashCode = prime * hashCode
                + ((getDirectoryStructure() == null) ? 0 : getDirectoryStructure().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode
                + ((getManifestCompression() == null) ? 0 : getManifestCompression().hashCode());
        hashCode = prime
                * hashCode
                + ((getManifestDurationFormat() == null) ? 0 : getManifestDurationFormat()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMinFinalSegmentLength() == null) ? 0 : getMinFinalSegmentLength().hashCode());
        hashCode = prime * hashCode
                + ((getMinSegmentLength() == null) ? 0 : getMinSegmentLength().hashCode());
        hashCode = prime * hashCode
                + ((getOutputSelection() == null) ? 0 : getOutputSelection().hashCode());
        hashCode = prime * hashCode
                + ((getProgramDateTime() == null) ? 0 : getProgramDateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getProgramDateTimePeriod() == null) ? 0 : getProgramDateTimePeriod().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentControl() == null) ? 0 : getSegmentControl().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentLength() == null) ? 0 : getSegmentLength().hashCode());
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
        if (other.getAdditionalManifests() == null ^ this.getAdditionalManifests() == null)
            return false;
        if (other.getAdditionalManifests() != null
                && other.getAdditionalManifests().equals(this.getAdditionalManifests()) == false)
            return false;
        if (other.getBaseUrl() == null ^ this.getBaseUrl() == null)
            return false;
        if (other.getBaseUrl() != null && other.getBaseUrl().equals(this.getBaseUrl()) == false)
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
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDestinationSettings() == null ^ this.getDestinationSettings() == null)
            return false;
        if (other.getDestinationSettings() != null
                && other.getDestinationSettings().equals(this.getDestinationSettings()) == false)
            return false;
        if (other.getDirectoryStructure() == null ^ this.getDirectoryStructure() == null)
            return false;
        if (other.getDirectoryStructure() != null
                && other.getDirectoryStructure().equals(this.getDirectoryStructure()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null
                && other.getEncryption().equals(this.getEncryption()) == false)
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
        if (other.getMinFinalSegmentLength() == null ^ this.getMinFinalSegmentLength() == null)
            return false;
        if (other.getMinFinalSegmentLength() != null
                && other.getMinFinalSegmentLength().equals(this.getMinFinalSegmentLength()) == false)
            return false;
        if (other.getMinSegmentLength() == null ^ this.getMinSegmentLength() == null)
            return false;
        if (other.getMinSegmentLength() != null
                && other.getMinSegmentLength().equals(this.getMinSegmentLength()) == false)
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
        if (other.getSegmentControl() == null ^ this.getSegmentControl() == null)
            return false;
        if (other.getSegmentControl() != null
                && other.getSegmentControl().equals(this.getSegmentControl()) == false)
            return false;
        if (other.getSegmentLength() == null ^ this.getSegmentLength() == null)
            return false;
        if (other.getSegmentLength() != null
                && other.getSegmentLength().equals(this.getSegmentLength()) == false)
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
        return true;
    }
}
