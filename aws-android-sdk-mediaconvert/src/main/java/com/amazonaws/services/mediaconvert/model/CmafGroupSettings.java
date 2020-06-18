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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Required when you set (Type) under (OutputGroups)>(OutputGroupSettings) to
 * CMAF_GROUP_SETTINGS. Each output in a CMAF Output Group may only contain a
 * single video, audio, or caption output.
 */
public class CmafGroupSettings implements Serializable {
    /**
     * By default, the service creates one top-level .m3u8 HLS manifest and one
     * top -level .mpd DASH manifest for each CMAF output group in your job.
     * These default manifests reference every output in the output group. To
     * create additional top-level manifests that reference a subset of the
     * outputs in the output group, specify a list of them here. For each
     * additional manifest that you specify, the service creates one HLS
     * manifest and one DASH manifest.
     */
    private java.util.List<CmafAdditionalManifest> additionalManifests;

    /**
     * A partial URI prefix that will be put in the manifest file at the top
     * level BaseURL element. Can be used if streams are delivered from a
     * different URL than the manifest file.
     */
    private String baseUrl;

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
     * DRM settings.
     */
    private CmafEncryptionSettings encryption;

    /**
     * Length of fragments to generate (in seconds). Fragment length must be
     * compatible with GOP size and Framerate. Note that fragments will end on
     * the next keyframe after this number of seconds, so actual fragment length
     * may be longer. When Emit Single File is checked, the fragmentation is
     * internal to a single output file and it does not cause the creation of
     * many output files as in other output types.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer fragmentLength;

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
     * Minimum time of initially buffered media that is needed to ensure smooth
     * playout.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer minBufferTime;

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
     * Specify whether your DASH profile is on-demand or main. When you choose
     * Main profile (MAIN_PROFILE), the service signals
     * urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When
     * you choose On-demand (ON_DEMAND_PROFILE), the service signals
     * urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose
     * On-demand, you must also set the output group setting Segment control
     * (SegmentControl) to Single file (SINGLE_FILE).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN_PROFILE, ON_DEMAND_PROFILE
     */
    private String mpdProfile;

    /**
     * When set to SINGLE_FILE, a single output file is generated, which is
     * internally segmented using the Fragment Length and Segment Length. When
     * set to SEGMENTED_FILES, separate segment files will be created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_FILE, SEGMENTED_FILES
     */
    private String segmentControl;

    /**
     * Use this setting to specify the length, in seconds, of each individual
     * CMAF segment. This value applies to the whole package; that is, to every
     * output in the output group. Note that segments end on the first keyframe
     * after this number of seconds, so the actual segment length might be
     * slightly longer. If you set Segment control (CmafSegmentControl) to
     * single file, the service puts the content of each output in a single file
     * that has metadata that marks these segments. If you set it to segmented
     * files, the service creates multiple files for each output, each with the
     * content of one segment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer segmentLength;

    /**
     * Include or exclude RESOLUTION attribute for video in EXT-X-STREAM-INF tag
     * of variant manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     */
    private String streamInfResolution;

    /**
     * When set to ENABLED, a DASH MPD manifest will be generated for this
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String writeDashManifest;

    /**
     * When set to ENABLED, an Apple HLS manifest will be generated for this
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String writeHlsManifest;

    /**
     * When you enable Precise segment duration in DASH manifests
     * (writeSegmentTimelineInRepresentation), your DASH manifest shows precise
     * segment durations. The segment duration information appears inside the
     * SegmentTimeline element, inside SegmentTemplate at the Representation
     * level. When this feature isn't enabled, the segment durations in your
     * DASH manifest are approximate. The segment duration information appears
     * in the duration attribute of the SegmentTemplate element.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String writeSegmentTimelineInRepresentation;

    /**
     * By default, the service creates one top-level .m3u8 HLS manifest and one
     * top -level .mpd DASH manifest for each CMAF output group in your job.
     * These default manifests reference every output in the output group. To
     * create additional top-level manifests that reference a subset of the
     * outputs in the output group, specify a list of them here. For each
     * additional manifest that you specify, the service creates one HLS
     * manifest and one DASH manifest.
     *
     * @return By default, the service creates one top-level .m3u8 HLS manifest
     *         and one top -level .mpd DASH manifest for each CMAF output group
     *         in your job. These default manifests reference every output in
     *         the output group. To create additional top-level manifests that
     *         reference a subset of the outputs in the output group, specify a
     *         list of them here. For each additional manifest that you specify,
     *         the service creates one HLS manifest and one DASH manifest.
     */
    public java.util.List<CmafAdditionalManifest> getAdditionalManifests() {
        return additionalManifests;
    }

    /**
     * By default, the service creates one top-level .m3u8 HLS manifest and one
     * top -level .mpd DASH manifest for each CMAF output group in your job.
     * These default manifests reference every output in the output group. To
     * create additional top-level manifests that reference a subset of the
     * outputs in the output group, specify a list of them here. For each
     * additional manifest that you specify, the service creates one HLS
     * manifest and one DASH manifest.
     *
     * @param additionalManifests By default, the service creates one top-level
     *            .m3u8 HLS manifest and one top -level .mpd DASH manifest for
     *            each CMAF output group in your job. These default manifests
     *            reference every output in the output group. To create
     *            additional top-level manifests that reference a subset of the
     *            outputs in the output group, specify a list of them here. For
     *            each additional manifest that you specify, the service creates
     *            one HLS manifest and one DASH manifest.
     */
    public void setAdditionalManifests(
            java.util.Collection<CmafAdditionalManifest> additionalManifests) {
        if (additionalManifests == null) {
            this.additionalManifests = null;
            return;
        }

        this.additionalManifests = new java.util.ArrayList<CmafAdditionalManifest>(
                additionalManifests);
    }

    /**
     * By default, the service creates one top-level .m3u8 HLS manifest and one
     * top -level .mpd DASH manifest for each CMAF output group in your job.
     * These default manifests reference every output in the output group. To
     * create additional top-level manifests that reference a subset of the
     * outputs in the output group, specify a list of them here. For each
     * additional manifest that you specify, the service creates one HLS
     * manifest and one DASH manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalManifests By default, the service creates one top-level
     *            .m3u8 HLS manifest and one top -level .mpd DASH manifest for
     *            each CMAF output group in your job. These default manifests
     *            reference every output in the output group. To create
     *            additional top-level manifests that reference a subset of the
     *            outputs in the output group, specify a list of them here. For
     *            each additional manifest that you specify, the service creates
     *            one HLS manifest and one DASH manifest.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CmafGroupSettings withAdditionalManifests(CmafAdditionalManifest... additionalManifests) {
        if (getAdditionalManifests() == null) {
            this.additionalManifests = new java.util.ArrayList<CmafAdditionalManifest>(
                    additionalManifests.length);
        }
        for (CmafAdditionalManifest value : additionalManifests) {
            this.additionalManifests.add(value);
        }
        return this;
    }

    /**
     * By default, the service creates one top-level .m3u8 HLS manifest and one
     * top -level .mpd DASH manifest for each CMAF output group in your job.
     * These default manifests reference every output in the output group. To
     * create additional top-level manifests that reference a subset of the
     * outputs in the output group, specify a list of them here. For each
     * additional manifest that you specify, the service creates one HLS
     * manifest and one DASH manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalManifests By default, the service creates one top-level
     *            .m3u8 HLS manifest and one top -level .mpd DASH manifest for
     *            each CMAF output group in your job. These default manifests
     *            reference every output in the output group. To create
     *            additional top-level manifests that reference a subset of the
     *            outputs in the output group, specify a list of them here. For
     *            each additional manifest that you specify, the service creates
     *            one HLS manifest and one DASH manifest.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CmafGroupSettings withAdditionalManifests(
            java.util.Collection<CmafAdditionalManifest> additionalManifests) {
        setAdditionalManifests(additionalManifests);
        return this;
    }

    /**
     * A partial URI prefix that will be put in the manifest file at the top
     * level BaseURL element. Can be used if streams are delivered from a
     * different URL than the manifest file.
     *
     * @return A partial URI prefix that will be put in the manifest file at the
     *         top level BaseURL element. Can be used if streams are delivered
     *         from a different URL than the manifest file.
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * A partial URI prefix that will be put in the manifest file at the top
     * level BaseURL element. Can be used if streams are delivered from a
     * different URL than the manifest file.
     *
     * @param baseUrl A partial URI prefix that will be put in the manifest file
     *            at the top level BaseURL element. Can be used if streams are
     *            delivered from a different URL than the manifest file.
     */
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * A partial URI prefix that will be put in the manifest file at the top
     * level BaseURL element. Can be used if streams are delivered from a
     * different URL than the manifest file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baseUrl A partial URI prefix that will be put in the manifest file
     *            at the top level BaseURL element. Can be used if streams are
     *            delivered from a different URL than the manifest file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CmafGroupSettings withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
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
     * @see CmafClientCache
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
     * @see CmafClientCache
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
     * @see CmafClientCache
     */
    public CmafGroupSettings withClientCache(String clientCache) {
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
     * @see CmafClientCache
     */
    public void setClientCache(CmafClientCache clientCache) {
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
     * @see CmafClientCache
     */
    public CmafGroupSettings withClientCache(CmafClientCache clientCache) {
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
     * @see CmafCodecSpecification
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
     * @see CmafCodecSpecification
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
     * @see CmafCodecSpecification
     */
    public CmafGroupSettings withCodecSpecification(String codecSpecification) {
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
     * @see CmafCodecSpecification
     */
    public void setCodecSpecification(CmafCodecSpecification codecSpecification) {
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
     * @see CmafCodecSpecification
     */
    public CmafGroupSettings withCodecSpecification(CmafCodecSpecification codecSpecification) {
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
    public CmafGroupSettings withDestination(String destination) {
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
    public CmafGroupSettings withDestinationSettings(DestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
        return this;
    }

    /**
     * DRM settings.
     *
     * @return DRM settings.
     */
    public CmafEncryptionSettings getEncryption() {
        return encryption;
    }

    /**
     * DRM settings.
     *
     * @param encryption DRM settings.
     */
    public void setEncryption(CmafEncryptionSettings encryption) {
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
    public CmafGroupSettings withEncryption(CmafEncryptionSettings encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Length of fragments to generate (in seconds). Fragment length must be
     * compatible with GOP size and Framerate. Note that fragments will end on
     * the next keyframe after this number of seconds, so actual fragment length
     * may be longer. When Emit Single File is checked, the fragmentation is
     * internal to a single output file and it does not cause the creation of
     * many output files as in other output types.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return Length of fragments to generate (in seconds). Fragment length
     *         must be compatible with GOP size and Framerate. Note that
     *         fragments will end on the next keyframe after this number of
     *         seconds, so actual fragment length may be longer. When Emit
     *         Single File is checked, the fragmentation is internal to a single
     *         output file and it does not cause the creation of many output
     *         files as in other output types.
     */
    public Integer getFragmentLength() {
        return fragmentLength;
    }

    /**
     * Length of fragments to generate (in seconds). Fragment length must be
     * compatible with GOP size and Framerate. Note that fragments will end on
     * the next keyframe after this number of seconds, so actual fragment length
     * may be longer. When Emit Single File is checked, the fragmentation is
     * internal to a single output file and it does not cause the creation of
     * many output files as in other output types.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param fragmentLength Length of fragments to generate (in seconds).
     *            Fragment length must be compatible with GOP size and
     *            Framerate. Note that fragments will end on the next keyframe
     *            after this number of seconds, so actual fragment length may be
     *            longer. When Emit Single File is checked, the fragmentation is
     *            internal to a single output file and it does not cause the
     *            creation of many output files as in other output types.
     */
    public void setFragmentLength(Integer fragmentLength) {
        this.fragmentLength = fragmentLength;
    }

    /**
     * Length of fragments to generate (in seconds). Fragment length must be
     * compatible with GOP size and Framerate. Note that fragments will end on
     * the next keyframe after this number of seconds, so actual fragment length
     * may be longer. When Emit Single File is checked, the fragmentation is
     * internal to a single output file and it does not cause the creation of
     * many output files as in other output types.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param fragmentLength Length of fragments to generate (in seconds).
     *            Fragment length must be compatible with GOP size and
     *            Framerate. Note that fragments will end on the next keyframe
     *            after this number of seconds, so actual fragment length may be
     *            longer. When Emit Single File is checked, the fragmentation is
     *            internal to a single output file and it does not cause the
     *            creation of many output files as in other output types.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CmafGroupSettings withFragmentLength(Integer fragmentLength) {
        this.fragmentLength = fragmentLength;
        return this;
    }

    /**
     * When set to GZIP, compresses HLS playlist.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GZIP, NONE
     *
     * @return When set to GZIP, compresses HLS playlist.
     * @see CmafManifestCompression
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
     * @see CmafManifestCompression
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
     * @see CmafManifestCompression
     */
    public CmafGroupSettings withManifestCompression(String manifestCompression) {
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
     * @see CmafManifestCompression
     */
    public void setManifestCompression(CmafManifestCompression manifestCompression) {
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
     * @see CmafManifestCompression
     */
    public CmafGroupSettings withManifestCompression(CmafManifestCompression manifestCompression) {
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
     * @see CmafManifestDurationFormat
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
     * @see CmafManifestDurationFormat
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
     * @see CmafManifestDurationFormat
     */
    public CmafGroupSettings withManifestDurationFormat(String manifestDurationFormat) {
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
     * @see CmafManifestDurationFormat
     */
    public void setManifestDurationFormat(CmafManifestDurationFormat manifestDurationFormat) {
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
     * @see CmafManifestDurationFormat
     */
    public CmafGroupSettings withManifestDurationFormat(
            CmafManifestDurationFormat manifestDurationFormat) {
        this.manifestDurationFormat = manifestDurationFormat.toString();
        return this;
    }

    /**
     * Minimum time of initially buffered media that is needed to ensure smooth
     * playout.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return Minimum time of initially buffered media that is needed to ensure
     *         smooth playout.
     */
    public Integer getMinBufferTime() {
        return minBufferTime;
    }

    /**
     * Minimum time of initially buffered media that is needed to ensure smooth
     * playout.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param minBufferTime Minimum time of initially buffered media that is
     *            needed to ensure smooth playout.
     */
    public void setMinBufferTime(Integer minBufferTime) {
        this.minBufferTime = minBufferTime;
    }

    /**
     * Minimum time of initially buffered media that is needed to ensure smooth
     * playout.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param minBufferTime Minimum time of initially buffered media that is
     *            needed to ensure smooth playout.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CmafGroupSettings withMinBufferTime(Integer minBufferTime) {
        this.minBufferTime = minBufferTime;
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
    public CmafGroupSettings withMinFinalSegmentLength(Double minFinalSegmentLength) {
        this.minFinalSegmentLength = minFinalSegmentLength;
        return this;
    }

    /**
     * Specify whether your DASH profile is on-demand or main. When you choose
     * Main profile (MAIN_PROFILE), the service signals
     * urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When
     * you choose On-demand (ON_DEMAND_PROFILE), the service signals
     * urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose
     * On-demand, you must also set the output group setting Segment control
     * (SegmentControl) to Single file (SINGLE_FILE).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN_PROFILE, ON_DEMAND_PROFILE
     *
     * @return Specify whether your DASH profile is on-demand or main. When you
     *         choose Main profile (MAIN_PROFILE), the service signals
     *         urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest.
     *         When you choose On-demand (ON_DEMAND_PROFILE), the service
     *         signals urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd.
     *         When you choose On-demand, you must also set the output group
     *         setting Segment control (SegmentControl) to Single file
     *         (SINGLE_FILE).
     * @see CmafMpdProfile
     */
    public String getMpdProfile() {
        return mpdProfile;
    }

    /**
     * Specify whether your DASH profile is on-demand or main. When you choose
     * Main profile (MAIN_PROFILE), the service signals
     * urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When
     * you choose On-demand (ON_DEMAND_PROFILE), the service signals
     * urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose
     * On-demand, you must also set the output group setting Segment control
     * (SegmentControl) to Single file (SINGLE_FILE).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN_PROFILE, ON_DEMAND_PROFILE
     *
     * @param mpdProfile Specify whether your DASH profile is on-demand or main.
     *            When you choose Main profile (MAIN_PROFILE), the service
     *            signals urn:mpeg:dash:profile:isoff-main:2011 in your .mpd
     *            DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE),
     *            the service signals urn:mpeg:dash:profile:isoff-on-demand:2011
     *            in your .mpd. When you choose On-demand, you must also set the
     *            output group setting Segment control (SegmentControl) to
     *            Single file (SINGLE_FILE).
     * @see CmafMpdProfile
     */
    public void setMpdProfile(String mpdProfile) {
        this.mpdProfile = mpdProfile;
    }

    /**
     * Specify whether your DASH profile is on-demand or main. When you choose
     * Main profile (MAIN_PROFILE), the service signals
     * urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When
     * you choose On-demand (ON_DEMAND_PROFILE), the service signals
     * urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose
     * On-demand, you must also set the output group setting Segment control
     * (SegmentControl) to Single file (SINGLE_FILE).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN_PROFILE, ON_DEMAND_PROFILE
     *
     * @param mpdProfile Specify whether your DASH profile is on-demand or main.
     *            When you choose Main profile (MAIN_PROFILE), the service
     *            signals urn:mpeg:dash:profile:isoff-main:2011 in your .mpd
     *            DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE),
     *            the service signals urn:mpeg:dash:profile:isoff-on-demand:2011
     *            in your .mpd. When you choose On-demand, you must also set the
     *            output group setting Segment control (SegmentControl) to
     *            Single file (SINGLE_FILE).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CmafMpdProfile
     */
    public CmafGroupSettings withMpdProfile(String mpdProfile) {
        this.mpdProfile = mpdProfile;
        return this;
    }

    /**
     * Specify whether your DASH profile is on-demand or main. When you choose
     * Main profile (MAIN_PROFILE), the service signals
     * urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When
     * you choose On-demand (ON_DEMAND_PROFILE), the service signals
     * urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose
     * On-demand, you must also set the output group setting Segment control
     * (SegmentControl) to Single file (SINGLE_FILE).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN_PROFILE, ON_DEMAND_PROFILE
     *
     * @param mpdProfile Specify whether your DASH profile is on-demand or main.
     *            When you choose Main profile (MAIN_PROFILE), the service
     *            signals urn:mpeg:dash:profile:isoff-main:2011 in your .mpd
     *            DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE),
     *            the service signals urn:mpeg:dash:profile:isoff-on-demand:2011
     *            in your .mpd. When you choose On-demand, you must also set the
     *            output group setting Segment control (SegmentControl) to
     *            Single file (SINGLE_FILE).
     * @see CmafMpdProfile
     */
    public void setMpdProfile(CmafMpdProfile mpdProfile) {
        this.mpdProfile = mpdProfile.toString();
    }

    /**
     * Specify whether your DASH profile is on-demand or main. When you choose
     * Main profile (MAIN_PROFILE), the service signals
     * urn:mpeg:dash:profile:isoff-main:2011 in your .mpd DASH manifest. When
     * you choose On-demand (ON_DEMAND_PROFILE), the service signals
     * urn:mpeg:dash:profile:isoff-on-demand:2011 in your .mpd. When you choose
     * On-demand, you must also set the output group setting Segment control
     * (SegmentControl) to Single file (SINGLE_FILE).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN_PROFILE, ON_DEMAND_PROFILE
     *
     * @param mpdProfile Specify whether your DASH profile is on-demand or main.
     *            When you choose Main profile (MAIN_PROFILE), the service
     *            signals urn:mpeg:dash:profile:isoff-main:2011 in your .mpd
     *            DASH manifest. When you choose On-demand (ON_DEMAND_PROFILE),
     *            the service signals urn:mpeg:dash:profile:isoff-on-demand:2011
     *            in your .mpd. When you choose On-demand, you must also set the
     *            output group setting Segment control (SegmentControl) to
     *            Single file (SINGLE_FILE).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CmafMpdProfile
     */
    public CmafGroupSettings withMpdProfile(CmafMpdProfile mpdProfile) {
        this.mpdProfile = mpdProfile.toString();
        return this;
    }

    /**
     * When set to SINGLE_FILE, a single output file is generated, which is
     * internally segmented using the Fragment Length and Segment Length. When
     * set to SEGMENTED_FILES, separate segment files will be created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_FILE, SEGMENTED_FILES
     *
     * @return When set to SINGLE_FILE, a single output file is generated, which
     *         is internally segmented using the Fragment Length and Segment
     *         Length. When set to SEGMENTED_FILES, separate segment files will
     *         be created.
     * @see CmafSegmentControl
     */
    public String getSegmentControl() {
        return segmentControl;
    }

    /**
     * When set to SINGLE_FILE, a single output file is generated, which is
     * internally segmented using the Fragment Length and Segment Length. When
     * set to SEGMENTED_FILES, separate segment files will be created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_FILE, SEGMENTED_FILES
     *
     * @param segmentControl When set to SINGLE_FILE, a single output file is
     *            generated, which is internally segmented using the Fragment
     *            Length and Segment Length. When set to SEGMENTED_FILES,
     *            separate segment files will be created.
     * @see CmafSegmentControl
     */
    public void setSegmentControl(String segmentControl) {
        this.segmentControl = segmentControl;
    }

    /**
     * When set to SINGLE_FILE, a single output file is generated, which is
     * internally segmented using the Fragment Length and Segment Length. When
     * set to SEGMENTED_FILES, separate segment files will be created.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_FILE, SEGMENTED_FILES
     *
     * @param segmentControl When set to SINGLE_FILE, a single output file is
     *            generated, which is internally segmented using the Fragment
     *            Length and Segment Length. When set to SEGMENTED_FILES,
     *            separate segment files will be created.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CmafSegmentControl
     */
    public CmafGroupSettings withSegmentControl(String segmentControl) {
        this.segmentControl = segmentControl;
        return this;
    }

    /**
     * When set to SINGLE_FILE, a single output file is generated, which is
     * internally segmented using the Fragment Length and Segment Length. When
     * set to SEGMENTED_FILES, separate segment files will be created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_FILE, SEGMENTED_FILES
     *
     * @param segmentControl When set to SINGLE_FILE, a single output file is
     *            generated, which is internally segmented using the Fragment
     *            Length and Segment Length. When set to SEGMENTED_FILES,
     *            separate segment files will be created.
     * @see CmafSegmentControl
     */
    public void setSegmentControl(CmafSegmentControl segmentControl) {
        this.segmentControl = segmentControl.toString();
    }

    /**
     * When set to SINGLE_FILE, a single output file is generated, which is
     * internally segmented using the Fragment Length and Segment Length. When
     * set to SEGMENTED_FILES, separate segment files will be created.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_FILE, SEGMENTED_FILES
     *
     * @param segmentControl When set to SINGLE_FILE, a single output file is
     *            generated, which is internally segmented using the Fragment
     *            Length and Segment Length. When set to SEGMENTED_FILES,
     *            separate segment files will be created.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CmafSegmentControl
     */
    public CmafGroupSettings withSegmentControl(CmafSegmentControl segmentControl) {
        this.segmentControl = segmentControl.toString();
        return this;
    }

    /**
     * Use this setting to specify the length, in seconds, of each individual
     * CMAF segment. This value applies to the whole package; that is, to every
     * output in the output group. Note that segments end on the first keyframe
     * after this number of seconds, so the actual segment length might be
     * slightly longer. If you set Segment control (CmafSegmentControl) to
     * single file, the service puts the content of each output in a single file
     * that has metadata that marks these segments. If you set it to segmented
     * files, the service creates multiple files for each output, each with the
     * content of one segment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return Use this setting to specify the length, in seconds, of each
     *         individual CMAF segment. This value applies to the whole package;
     *         that is, to every output in the output group. Note that segments
     *         end on the first keyframe after this number of seconds, so the
     *         actual segment length might be slightly longer. If you set
     *         Segment control (CmafSegmentControl) to single file, the service
     *         puts the content of each output in a single file that has
     *         metadata that marks these segments. If you set it to segmented
     *         files, the service creates multiple files for each output, each
     *         with the content of one segment.
     */
    public Integer getSegmentLength() {
        return segmentLength;
    }

    /**
     * Use this setting to specify the length, in seconds, of each individual
     * CMAF segment. This value applies to the whole package; that is, to every
     * output in the output group. Note that segments end on the first keyframe
     * after this number of seconds, so the actual segment length might be
     * slightly longer. If you set Segment control (CmafSegmentControl) to
     * single file, the service puts the content of each output in a single file
     * that has metadata that marks these segments. If you set it to segmented
     * files, the service creates multiple files for each output, each with the
     * content of one segment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param segmentLength Use this setting to specify the length, in seconds,
     *            of each individual CMAF segment. This value applies to the
     *            whole package; that is, to every output in the output group.
     *            Note that segments end on the first keyframe after this number
     *            of seconds, so the actual segment length might be slightly
     *            longer. If you set Segment control (CmafSegmentControl) to
     *            single file, the service puts the content of each output in a
     *            single file that has metadata that marks these segments. If
     *            you set it to segmented files, the service creates multiple
     *            files for each output, each with the content of one segment.
     */
    public void setSegmentLength(Integer segmentLength) {
        this.segmentLength = segmentLength;
    }

    /**
     * Use this setting to specify the length, in seconds, of each individual
     * CMAF segment. This value applies to the whole package; that is, to every
     * output in the output group. Note that segments end on the first keyframe
     * after this number of seconds, so the actual segment length might be
     * slightly longer. If you set Segment control (CmafSegmentControl) to
     * single file, the service puts the content of each output in a single file
     * that has metadata that marks these segments. If you set it to segmented
     * files, the service creates multiple files for each output, each with the
     * content of one segment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param segmentLength Use this setting to specify the length, in seconds,
     *            of each individual CMAF segment. This value applies to the
     *            whole package; that is, to every output in the output group.
     *            Note that segments end on the first keyframe after this number
     *            of seconds, so the actual segment length might be slightly
     *            longer. If you set Segment control (CmafSegmentControl) to
     *            single file, the service puts the content of each output in a
     *            single file that has metadata that marks these segments. If
     *            you set it to segmented files, the service creates multiple
     *            files for each output, each with the content of one segment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CmafGroupSettings withSegmentLength(Integer segmentLength) {
        this.segmentLength = segmentLength;
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
     * @see CmafStreamInfResolution
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
     * @see CmafStreamInfResolution
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
     * @see CmafStreamInfResolution
     */
    public CmafGroupSettings withStreamInfResolution(String streamInfResolution) {
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
     * @see CmafStreamInfResolution
     */
    public void setStreamInfResolution(CmafStreamInfResolution streamInfResolution) {
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
     * @see CmafStreamInfResolution
     */
    public CmafGroupSettings withStreamInfResolution(CmafStreamInfResolution streamInfResolution) {
        this.streamInfResolution = streamInfResolution.toString();
        return this;
    }

    /**
     * When set to ENABLED, a DASH MPD manifest will be generated for this
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return When set to ENABLED, a DASH MPD manifest will be generated for
     *         this output.
     * @see CmafWriteDASHManifest
     */
    public String getWriteDashManifest() {
        return writeDashManifest;
    }

    /**
     * When set to ENABLED, a DASH MPD manifest will be generated for this
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param writeDashManifest When set to ENABLED, a DASH MPD manifest will be
     *            generated for this output.
     * @see CmafWriteDASHManifest
     */
    public void setWriteDashManifest(String writeDashManifest) {
        this.writeDashManifest = writeDashManifest;
    }

    /**
     * When set to ENABLED, a DASH MPD manifest will be generated for this
     * output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param writeDashManifest When set to ENABLED, a DASH MPD manifest will be
     *            generated for this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CmafWriteDASHManifest
     */
    public CmafGroupSettings withWriteDashManifest(String writeDashManifest) {
        this.writeDashManifest = writeDashManifest;
        return this;
    }

    /**
     * When set to ENABLED, a DASH MPD manifest will be generated for this
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param writeDashManifest When set to ENABLED, a DASH MPD manifest will be
     *            generated for this output.
     * @see CmafWriteDASHManifest
     */
    public void setWriteDashManifest(CmafWriteDASHManifest writeDashManifest) {
        this.writeDashManifest = writeDashManifest.toString();
    }

    /**
     * When set to ENABLED, a DASH MPD manifest will be generated for this
     * output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param writeDashManifest When set to ENABLED, a DASH MPD manifest will be
     *            generated for this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CmafWriteDASHManifest
     */
    public CmafGroupSettings withWriteDashManifest(CmafWriteDASHManifest writeDashManifest) {
        this.writeDashManifest = writeDashManifest.toString();
        return this;
    }

    /**
     * When set to ENABLED, an Apple HLS manifest will be generated for this
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return When set to ENABLED, an Apple HLS manifest will be generated for
     *         this output.
     * @see CmafWriteHLSManifest
     */
    public String getWriteHlsManifest() {
        return writeHlsManifest;
    }

    /**
     * When set to ENABLED, an Apple HLS manifest will be generated for this
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param writeHlsManifest When set to ENABLED, an Apple HLS manifest will
     *            be generated for this output.
     * @see CmafWriteHLSManifest
     */
    public void setWriteHlsManifest(String writeHlsManifest) {
        this.writeHlsManifest = writeHlsManifest;
    }

    /**
     * When set to ENABLED, an Apple HLS manifest will be generated for this
     * output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param writeHlsManifest When set to ENABLED, an Apple HLS manifest will
     *            be generated for this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CmafWriteHLSManifest
     */
    public CmafGroupSettings withWriteHlsManifest(String writeHlsManifest) {
        this.writeHlsManifest = writeHlsManifest;
        return this;
    }

    /**
     * When set to ENABLED, an Apple HLS manifest will be generated for this
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param writeHlsManifest When set to ENABLED, an Apple HLS manifest will
     *            be generated for this output.
     * @see CmafWriteHLSManifest
     */
    public void setWriteHlsManifest(CmafWriteHLSManifest writeHlsManifest) {
        this.writeHlsManifest = writeHlsManifest.toString();
    }

    /**
     * When set to ENABLED, an Apple HLS manifest will be generated for this
     * output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param writeHlsManifest When set to ENABLED, an Apple HLS manifest will
     *            be generated for this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CmafWriteHLSManifest
     */
    public CmafGroupSettings withWriteHlsManifest(CmafWriteHLSManifest writeHlsManifest) {
        this.writeHlsManifest = writeHlsManifest.toString();
        return this;
    }

    /**
     * When you enable Precise segment duration in DASH manifests
     * (writeSegmentTimelineInRepresentation), your DASH manifest shows precise
     * segment durations. The segment duration information appears inside the
     * SegmentTimeline element, inside SegmentTemplate at the Representation
     * level. When this feature isn't enabled, the segment durations in your
     * DASH manifest are approximate. The segment duration information appears
     * in the duration attribute of the SegmentTemplate element.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return When you enable Precise segment duration in DASH manifests
     *         (writeSegmentTimelineInRepresentation), your DASH manifest shows
     *         precise segment durations. The segment duration information
     *         appears inside the SegmentTimeline element, inside
     *         SegmentTemplate at the Representation level. When this feature
     *         isn't enabled, the segment durations in your DASH manifest are
     *         approximate. The segment duration information appears in the
     *         duration attribute of the SegmentTemplate element.
     * @see CmafWriteSegmentTimelineInRepresentation
     */
    public String getWriteSegmentTimelineInRepresentation() {
        return writeSegmentTimelineInRepresentation;
    }

    /**
     * When you enable Precise segment duration in DASH manifests
     * (writeSegmentTimelineInRepresentation), your DASH manifest shows precise
     * segment durations. The segment duration information appears inside the
     * SegmentTimeline element, inside SegmentTemplate at the Representation
     * level. When this feature isn't enabled, the segment durations in your
     * DASH manifest are approximate. The segment duration information appears
     * in the duration attribute of the SegmentTemplate element.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param writeSegmentTimelineInRepresentation When you enable Precise
     *            segment duration in DASH manifests
     *            (writeSegmentTimelineInRepresentation), your DASH manifest
     *            shows precise segment durations. The segment duration
     *            information appears inside the SegmentTimeline element, inside
     *            SegmentTemplate at the Representation level. When this feature
     *            isn't enabled, the segment durations in your DASH manifest are
     *            approximate. The segment duration information appears in the
     *            duration attribute of the SegmentTemplate element.
     * @see CmafWriteSegmentTimelineInRepresentation
     */
    public void setWriteSegmentTimelineInRepresentation(String writeSegmentTimelineInRepresentation) {
        this.writeSegmentTimelineInRepresentation = writeSegmentTimelineInRepresentation;
    }

    /**
     * When you enable Precise segment duration in DASH manifests
     * (writeSegmentTimelineInRepresentation), your DASH manifest shows precise
     * segment durations. The segment duration information appears inside the
     * SegmentTimeline element, inside SegmentTemplate at the Representation
     * level. When this feature isn't enabled, the segment durations in your
     * DASH manifest are approximate. The segment duration information appears
     * in the duration attribute of the SegmentTemplate element.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param writeSegmentTimelineInRepresentation When you enable Precise
     *            segment duration in DASH manifests
     *            (writeSegmentTimelineInRepresentation), your DASH manifest
     *            shows precise segment durations. The segment duration
     *            information appears inside the SegmentTimeline element, inside
     *            SegmentTemplate at the Representation level. When this feature
     *            isn't enabled, the segment durations in your DASH manifest are
     *            approximate. The segment duration information appears in the
     *            duration attribute of the SegmentTemplate element.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CmafWriteSegmentTimelineInRepresentation
     */
    public CmafGroupSettings withWriteSegmentTimelineInRepresentation(
            String writeSegmentTimelineInRepresentation) {
        this.writeSegmentTimelineInRepresentation = writeSegmentTimelineInRepresentation;
        return this;
    }

    /**
     * When you enable Precise segment duration in DASH manifests
     * (writeSegmentTimelineInRepresentation), your DASH manifest shows precise
     * segment durations. The segment duration information appears inside the
     * SegmentTimeline element, inside SegmentTemplate at the Representation
     * level. When this feature isn't enabled, the segment durations in your
     * DASH manifest are approximate. The segment duration information appears
     * in the duration attribute of the SegmentTemplate element.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param writeSegmentTimelineInRepresentation When you enable Precise
     *            segment duration in DASH manifests
     *            (writeSegmentTimelineInRepresentation), your DASH manifest
     *            shows precise segment durations. The segment duration
     *            information appears inside the SegmentTimeline element, inside
     *            SegmentTemplate at the Representation level. When this feature
     *            isn't enabled, the segment durations in your DASH manifest are
     *            approximate. The segment duration information appears in the
     *            duration attribute of the SegmentTemplate element.
     * @see CmafWriteSegmentTimelineInRepresentation
     */
    public void setWriteSegmentTimelineInRepresentation(
            CmafWriteSegmentTimelineInRepresentation writeSegmentTimelineInRepresentation) {
        this.writeSegmentTimelineInRepresentation = writeSegmentTimelineInRepresentation.toString();
    }

    /**
     * When you enable Precise segment duration in DASH manifests
     * (writeSegmentTimelineInRepresentation), your DASH manifest shows precise
     * segment durations. The segment duration information appears inside the
     * SegmentTimeline element, inside SegmentTemplate at the Representation
     * level. When this feature isn't enabled, the segment durations in your
     * DASH manifest are approximate. The segment duration information appears
     * in the duration attribute of the SegmentTemplate element.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param writeSegmentTimelineInRepresentation When you enable Precise
     *            segment duration in DASH manifests
     *            (writeSegmentTimelineInRepresentation), your DASH manifest
     *            shows precise segment durations. The segment duration
     *            information appears inside the SegmentTimeline element, inside
     *            SegmentTemplate at the Representation level. When this feature
     *            isn't enabled, the segment durations in your DASH manifest are
     *            approximate. The segment duration information appears in the
     *            duration attribute of the SegmentTemplate element.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CmafWriteSegmentTimelineInRepresentation
     */
    public CmafGroupSettings withWriteSegmentTimelineInRepresentation(
            CmafWriteSegmentTimelineInRepresentation writeSegmentTimelineInRepresentation) {
        this.writeSegmentTimelineInRepresentation = writeSegmentTimelineInRepresentation.toString();
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
        if (getAdditionalManifests() != null)
            sb.append("AdditionalManifests: " + getAdditionalManifests() + ",");
        if (getBaseUrl() != null)
            sb.append("BaseUrl: " + getBaseUrl() + ",");
        if (getClientCache() != null)
            sb.append("ClientCache: " + getClientCache() + ",");
        if (getCodecSpecification() != null)
            sb.append("CodecSpecification: " + getCodecSpecification() + ",");
        if (getDestination() != null)
            sb.append("Destination: " + getDestination() + ",");
        if (getDestinationSettings() != null)
            sb.append("DestinationSettings: " + getDestinationSettings() + ",");
        if (getEncryption() != null)
            sb.append("Encryption: " + getEncryption() + ",");
        if (getFragmentLength() != null)
            sb.append("FragmentLength: " + getFragmentLength() + ",");
        if (getManifestCompression() != null)
            sb.append("ManifestCompression: " + getManifestCompression() + ",");
        if (getManifestDurationFormat() != null)
            sb.append("ManifestDurationFormat: " + getManifestDurationFormat() + ",");
        if (getMinBufferTime() != null)
            sb.append("MinBufferTime: " + getMinBufferTime() + ",");
        if (getMinFinalSegmentLength() != null)
            sb.append("MinFinalSegmentLength: " + getMinFinalSegmentLength() + ",");
        if (getMpdProfile() != null)
            sb.append("MpdProfile: " + getMpdProfile() + ",");
        if (getSegmentControl() != null)
            sb.append("SegmentControl: " + getSegmentControl() + ",");
        if (getSegmentLength() != null)
            sb.append("SegmentLength: " + getSegmentLength() + ",");
        if (getStreamInfResolution() != null)
            sb.append("StreamInfResolution: " + getStreamInfResolution() + ",");
        if (getWriteDashManifest() != null)
            sb.append("WriteDashManifest: " + getWriteDashManifest() + ",");
        if (getWriteHlsManifest() != null)
            sb.append("WriteHlsManifest: " + getWriteHlsManifest() + ",");
        if (getWriteSegmentTimelineInRepresentation() != null)
            sb.append("WriteSegmentTimelineInRepresentation: "
                    + getWriteSegmentTimelineInRepresentation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdditionalManifests() == null) ? 0 : getAdditionalManifests().hashCode());
        hashCode = prime * hashCode + ((getBaseUrl() == null) ? 0 : getBaseUrl().hashCode());
        hashCode = prime * hashCode
                + ((getClientCache() == null) ? 0 : getClientCache().hashCode());
        hashCode = prime * hashCode
                + ((getCodecSpecification() == null) ? 0 : getCodecSpecification().hashCode());
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationSettings() == null) ? 0 : getDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode
                + ((getFragmentLength() == null) ? 0 : getFragmentLength().hashCode());
        hashCode = prime * hashCode
                + ((getManifestCompression() == null) ? 0 : getManifestCompression().hashCode());
        hashCode = prime
                * hashCode
                + ((getManifestDurationFormat() == null) ? 0 : getManifestDurationFormat()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMinBufferTime() == null) ? 0 : getMinBufferTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getMinFinalSegmentLength() == null) ? 0 : getMinFinalSegmentLength().hashCode());
        hashCode = prime * hashCode + ((getMpdProfile() == null) ? 0 : getMpdProfile().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentControl() == null) ? 0 : getSegmentControl().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentLength() == null) ? 0 : getSegmentLength().hashCode());
        hashCode = prime * hashCode
                + ((getStreamInfResolution() == null) ? 0 : getStreamInfResolution().hashCode());
        hashCode = prime * hashCode
                + ((getWriteDashManifest() == null) ? 0 : getWriteDashManifest().hashCode());
        hashCode = prime * hashCode
                + ((getWriteHlsManifest() == null) ? 0 : getWriteHlsManifest().hashCode());
        hashCode = prime
                * hashCode
                + ((getWriteSegmentTimelineInRepresentation() == null) ? 0
                        : getWriteSegmentTimelineInRepresentation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CmafGroupSettings == false)
            return false;
        CmafGroupSettings other = (CmafGroupSettings) obj;

        if (other.getAdditionalManifests() == null ^ this.getAdditionalManifests() == null)
            return false;
        if (other.getAdditionalManifests() != null
                && other.getAdditionalManifests().equals(this.getAdditionalManifests()) == false)
            return false;
        if (other.getBaseUrl() == null ^ this.getBaseUrl() == null)
            return false;
        if (other.getBaseUrl() != null && other.getBaseUrl().equals(this.getBaseUrl()) == false)
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
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null
                && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getFragmentLength() == null ^ this.getFragmentLength() == null)
            return false;
        if (other.getFragmentLength() != null
                && other.getFragmentLength().equals(this.getFragmentLength()) == false)
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
        if (other.getMinBufferTime() == null ^ this.getMinBufferTime() == null)
            return false;
        if (other.getMinBufferTime() != null
                && other.getMinBufferTime().equals(this.getMinBufferTime()) == false)
            return false;
        if (other.getMinFinalSegmentLength() == null ^ this.getMinFinalSegmentLength() == null)
            return false;
        if (other.getMinFinalSegmentLength() != null
                && other.getMinFinalSegmentLength().equals(this.getMinFinalSegmentLength()) == false)
            return false;
        if (other.getMpdProfile() == null ^ this.getMpdProfile() == null)
            return false;
        if (other.getMpdProfile() != null
                && other.getMpdProfile().equals(this.getMpdProfile()) == false)
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
        if (other.getStreamInfResolution() == null ^ this.getStreamInfResolution() == null)
            return false;
        if (other.getStreamInfResolution() != null
                && other.getStreamInfResolution().equals(this.getStreamInfResolution()) == false)
            return false;
        if (other.getWriteDashManifest() == null ^ this.getWriteDashManifest() == null)
            return false;
        if (other.getWriteDashManifest() != null
                && other.getWriteDashManifest().equals(this.getWriteDashManifest()) == false)
            return false;
        if (other.getWriteHlsManifest() == null ^ this.getWriteHlsManifest() == null)
            return false;
        if (other.getWriteHlsManifest() != null
                && other.getWriteHlsManifest().equals(this.getWriteHlsManifest()) == false)
            return false;
        if (other.getWriteSegmentTimelineInRepresentation() == null
                ^ this.getWriteSegmentTimelineInRepresentation() == null)
            return false;
        if (other.getWriteSegmentTimelineInRepresentation() != null
                && other.getWriteSegmentTimelineInRepresentation().equals(
                        this.getWriteSegmentTimelineInRepresentation()) == false)
            return false;
        return true;
    }
}
