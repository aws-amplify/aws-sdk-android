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
 * DASH_ISO_GROUP_SETTINGS.
 */
public class DashIsoGroupSettings implements Serializable {
    /**
     * By default, the service creates one .mpd DASH manifest for each DASH ISO
     * output group in your job. This default manifest references every output
     * in the output group. To create additional DASH manifests that reference a
     * subset of the outputs in the output group, specify a list of them here.
     */
    private java.util.List<DashAdditionalManifest> additionalManifests;

    /**
     * A partial URI prefix that will be put in the manifest (.mpd) file at the
     * top level BaseURL element. Can be used if streams are delivered from a
     * different URL than the manifest file.
     */
    private String baseUrl;

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
    private DashIsoEncryptionSettings encryption;

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
     * Supports HbbTV specification as indicated
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HBBTV_1_5, NONE
     */
    private String hbbtvCompliance;

    /**
     * Minimum time of initially buffered media that is needed to ensure smooth
     * playout.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer minBufferTime;

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
     * Length of mpd segments to create (in seconds). Note that segments will
     * end on the next keyframe after this number of seconds, so actual segment
     * length may be longer. When Emit Single File is checked, the segmentation
     * is internal to a single output file and it does not cause the creation of
     * many output files as in other output types.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer segmentLength;

    /**
     * If you get an HTTP error in the 400 range when you play back your DASH
     * output, enable this setting and run your transcoding job again. When you
     * enable this setting, the service writes precise segment durations in the
     * DASH manifest. The segment duration information appears inside the
     * SegmentTimeline element, inside SegmentTemplate at the Representation
     * level. When you don't enable this setting, the service writes approximate
     * segment durations in your DASH manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String writeSegmentTimelineInRepresentation;

    /**
     * By default, the service creates one .mpd DASH manifest for each DASH ISO
     * output group in your job. This default manifest references every output
     * in the output group. To create additional DASH manifests that reference a
     * subset of the outputs in the output group, specify a list of them here.
     *
     * @return By default, the service creates one .mpd DASH manifest for each
     *         DASH ISO output group in your job. This default manifest
     *         references every output in the output group. To create additional
     *         DASH manifests that reference a subset of the outputs in the
     *         output group, specify a list of them here.
     */
    public java.util.List<DashAdditionalManifest> getAdditionalManifests() {
        return additionalManifests;
    }

    /**
     * By default, the service creates one .mpd DASH manifest for each DASH ISO
     * output group in your job. This default manifest references every output
     * in the output group. To create additional DASH manifests that reference a
     * subset of the outputs in the output group, specify a list of them here.
     *
     * @param additionalManifests By default, the service creates one .mpd DASH
     *            manifest for each DASH ISO output group in your job. This
     *            default manifest references every output in the output group.
     *            To create additional DASH manifests that reference a subset of
     *            the outputs in the output group, specify a list of them here.
     */
    public void setAdditionalManifests(
            java.util.Collection<DashAdditionalManifest> additionalManifests) {
        if (additionalManifests == null) {
            this.additionalManifests = null;
            return;
        }

        this.additionalManifests = new java.util.ArrayList<DashAdditionalManifest>(
                additionalManifests);
    }

    /**
     * By default, the service creates one .mpd DASH manifest for each DASH ISO
     * output group in your job. This default manifest references every output
     * in the output group. To create additional DASH manifests that reference a
     * subset of the outputs in the output group, specify a list of them here.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalManifests By default, the service creates one .mpd DASH
     *            manifest for each DASH ISO output group in your job. This
     *            default manifest references every output in the output group.
     *            To create additional DASH manifests that reference a subset of
     *            the outputs in the output group, specify a list of them here.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashIsoGroupSettings withAdditionalManifests(
            DashAdditionalManifest... additionalManifests) {
        if (getAdditionalManifests() == null) {
            this.additionalManifests = new java.util.ArrayList<DashAdditionalManifest>(
                    additionalManifests.length);
        }
        for (DashAdditionalManifest value : additionalManifests) {
            this.additionalManifests.add(value);
        }
        return this;
    }

    /**
     * By default, the service creates one .mpd DASH manifest for each DASH ISO
     * output group in your job. This default manifest references every output
     * in the output group. To create additional DASH manifests that reference a
     * subset of the outputs in the output group, specify a list of them here.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalManifests By default, the service creates one .mpd DASH
     *            manifest for each DASH ISO output group in your job. This
     *            default manifest references every output in the output group.
     *            To create additional DASH manifests that reference a subset of
     *            the outputs in the output group, specify a list of them here.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashIsoGroupSettings withAdditionalManifests(
            java.util.Collection<DashAdditionalManifest> additionalManifests) {
        setAdditionalManifests(additionalManifests);
        return this;
    }

    /**
     * A partial URI prefix that will be put in the manifest (.mpd) file at the
     * top level BaseURL element. Can be used if streams are delivered from a
     * different URL than the manifest file.
     *
     * @return A partial URI prefix that will be put in the manifest (.mpd) file
     *         at the top level BaseURL element. Can be used if streams are
     *         delivered from a different URL than the manifest file.
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * A partial URI prefix that will be put in the manifest (.mpd) file at the
     * top level BaseURL element. Can be used if streams are delivered from a
     * different URL than the manifest file.
     *
     * @param baseUrl A partial URI prefix that will be put in the manifest
     *            (.mpd) file at the top level BaseURL element. Can be used if
     *            streams are delivered from a different URL than the manifest
     *            file.
     */
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * A partial URI prefix that will be put in the manifest (.mpd) file at the
     * top level BaseURL element. Can be used if streams are delivered from a
     * different URL than the manifest file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baseUrl A partial URI prefix that will be put in the manifest
     *            (.mpd) file at the top level BaseURL element. Can be used if
     *            streams are delivered from a different URL than the manifest
     *            file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashIsoGroupSettings withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
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
    public DashIsoGroupSettings withDestination(String destination) {
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
    public DashIsoGroupSettings withDestinationSettings(DestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
        return this;
    }

    /**
     * DRM settings.
     *
     * @return DRM settings.
     */
    public DashIsoEncryptionSettings getEncryption() {
        return encryption;
    }

    /**
     * DRM settings.
     *
     * @param encryption DRM settings.
     */
    public void setEncryption(DashIsoEncryptionSettings encryption) {
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
    public DashIsoGroupSettings withEncryption(DashIsoEncryptionSettings encryption) {
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
    public DashIsoGroupSettings withFragmentLength(Integer fragmentLength) {
        this.fragmentLength = fragmentLength;
        return this;
    }

    /**
     * Supports HbbTV specification as indicated
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HBBTV_1_5, NONE
     *
     * @return Supports HbbTV specification as indicated
     * @see DashIsoHbbtvCompliance
     */
    public String getHbbtvCompliance() {
        return hbbtvCompliance;
    }

    /**
     * Supports HbbTV specification as indicated
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HBBTV_1_5, NONE
     *
     * @param hbbtvCompliance Supports HbbTV specification as indicated
     * @see DashIsoHbbtvCompliance
     */
    public void setHbbtvCompliance(String hbbtvCompliance) {
        this.hbbtvCompliance = hbbtvCompliance;
    }

    /**
     * Supports HbbTV specification as indicated
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HBBTV_1_5, NONE
     *
     * @param hbbtvCompliance Supports HbbTV specification as indicated
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DashIsoHbbtvCompliance
     */
    public DashIsoGroupSettings withHbbtvCompliance(String hbbtvCompliance) {
        this.hbbtvCompliance = hbbtvCompliance;
        return this;
    }

    /**
     * Supports HbbTV specification as indicated
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HBBTV_1_5, NONE
     *
     * @param hbbtvCompliance Supports HbbTV specification as indicated
     * @see DashIsoHbbtvCompliance
     */
    public void setHbbtvCompliance(DashIsoHbbtvCompliance hbbtvCompliance) {
        this.hbbtvCompliance = hbbtvCompliance.toString();
    }

    /**
     * Supports HbbTV specification as indicated
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HBBTV_1_5, NONE
     *
     * @param hbbtvCompliance Supports HbbTV specification as indicated
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DashIsoHbbtvCompliance
     */
    public DashIsoGroupSettings withHbbtvCompliance(DashIsoHbbtvCompliance hbbtvCompliance) {
        this.hbbtvCompliance = hbbtvCompliance.toString();
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
    public DashIsoGroupSettings withMinBufferTime(Integer minBufferTime) {
        this.minBufferTime = minBufferTime;
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
     * @see DashIsoMpdProfile
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
     * @see DashIsoMpdProfile
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
     * @see DashIsoMpdProfile
     */
    public DashIsoGroupSettings withMpdProfile(String mpdProfile) {
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
     * @see DashIsoMpdProfile
     */
    public void setMpdProfile(DashIsoMpdProfile mpdProfile) {
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
     * @see DashIsoMpdProfile
     */
    public DashIsoGroupSettings withMpdProfile(DashIsoMpdProfile mpdProfile) {
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
     * @see DashIsoSegmentControl
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
     * @see DashIsoSegmentControl
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
     * @see DashIsoSegmentControl
     */
    public DashIsoGroupSettings withSegmentControl(String segmentControl) {
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
     * @see DashIsoSegmentControl
     */
    public void setSegmentControl(DashIsoSegmentControl segmentControl) {
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
     * @see DashIsoSegmentControl
     */
    public DashIsoGroupSettings withSegmentControl(DashIsoSegmentControl segmentControl) {
        this.segmentControl = segmentControl.toString();
        return this;
    }

    /**
     * Length of mpd segments to create (in seconds). Note that segments will
     * end on the next keyframe after this number of seconds, so actual segment
     * length may be longer. When Emit Single File is checked, the segmentation
     * is internal to a single output file and it does not cause the creation of
     * many output files as in other output types.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return Length of mpd segments to create (in seconds). Note that segments
     *         will end on the next keyframe after this number of seconds, so
     *         actual segment length may be longer. When Emit Single File is
     *         checked, the segmentation is internal to a single output file and
     *         it does not cause the creation of many output files as in other
     *         output types.
     */
    public Integer getSegmentLength() {
        return segmentLength;
    }

    /**
     * Length of mpd segments to create (in seconds). Note that segments will
     * end on the next keyframe after this number of seconds, so actual segment
     * length may be longer. When Emit Single File is checked, the segmentation
     * is internal to a single output file and it does not cause the creation of
     * many output files as in other output types.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param segmentLength Length of mpd segments to create (in seconds). Note
     *            that segments will end on the next keyframe after this number
     *            of seconds, so actual segment length may be longer. When Emit
     *            Single File is checked, the segmentation is internal to a
     *            single output file and it does not cause the creation of many
     *            output files as in other output types.
     */
    public void setSegmentLength(Integer segmentLength) {
        this.segmentLength = segmentLength;
    }

    /**
     * Length of mpd segments to create (in seconds). Note that segments will
     * end on the next keyframe after this number of seconds, so actual segment
     * length may be longer. When Emit Single File is checked, the segmentation
     * is internal to a single output file and it does not cause the creation of
     * many output files as in other output types.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param segmentLength Length of mpd segments to create (in seconds). Note
     *            that segments will end on the next keyframe after this number
     *            of seconds, so actual segment length may be longer. When Emit
     *            Single File is checked, the segmentation is internal to a
     *            single output file and it does not cause the creation of many
     *            output files as in other output types.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashIsoGroupSettings withSegmentLength(Integer segmentLength) {
        this.segmentLength = segmentLength;
        return this;
    }

    /**
     * If you get an HTTP error in the 400 range when you play back your DASH
     * output, enable this setting and run your transcoding job again. When you
     * enable this setting, the service writes precise segment durations in the
     * DASH manifest. The segment duration information appears inside the
     * SegmentTimeline element, inside SegmentTemplate at the Representation
     * level. When you don't enable this setting, the service writes approximate
     * segment durations in your DASH manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return If you get an HTTP error in the 400 range when you play back your
     *         DASH output, enable this setting and run your transcoding job
     *         again. When you enable this setting, the service writes precise
     *         segment durations in the DASH manifest. The segment duration
     *         information appears inside the SegmentTimeline element, inside
     *         SegmentTemplate at the Representation level. When you don't
     *         enable this setting, the service writes approximate segment
     *         durations in your DASH manifest.
     * @see DashIsoWriteSegmentTimelineInRepresentation
     */
    public String getWriteSegmentTimelineInRepresentation() {
        return writeSegmentTimelineInRepresentation;
    }

    /**
     * If you get an HTTP error in the 400 range when you play back your DASH
     * output, enable this setting and run your transcoding job again. When you
     * enable this setting, the service writes precise segment durations in the
     * DASH manifest. The segment duration information appears inside the
     * SegmentTimeline element, inside SegmentTemplate at the Representation
     * level. When you don't enable this setting, the service writes approximate
     * segment durations in your DASH manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param writeSegmentTimelineInRepresentation If you get an HTTP error in
     *            the 400 range when you play back your DASH output, enable this
     *            setting and run your transcoding job again. When you enable
     *            this setting, the service writes precise segment durations in
     *            the DASH manifest. The segment duration information appears
     *            inside the SegmentTimeline element, inside SegmentTemplate at
     *            the Representation level. When you don't enable this setting,
     *            the service writes approximate segment durations in your DASH
     *            manifest.
     * @see DashIsoWriteSegmentTimelineInRepresentation
     */
    public void setWriteSegmentTimelineInRepresentation(String writeSegmentTimelineInRepresentation) {
        this.writeSegmentTimelineInRepresentation = writeSegmentTimelineInRepresentation;
    }

    /**
     * If you get an HTTP error in the 400 range when you play back your DASH
     * output, enable this setting and run your transcoding job again. When you
     * enable this setting, the service writes precise segment durations in the
     * DASH manifest. The segment duration information appears inside the
     * SegmentTimeline element, inside SegmentTemplate at the Representation
     * level. When you don't enable this setting, the service writes approximate
     * segment durations in your DASH manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param writeSegmentTimelineInRepresentation If you get an HTTP error in
     *            the 400 range when you play back your DASH output, enable this
     *            setting and run your transcoding job again. When you enable
     *            this setting, the service writes precise segment durations in
     *            the DASH manifest. The segment duration information appears
     *            inside the SegmentTimeline element, inside SegmentTemplate at
     *            the Representation level. When you don't enable this setting,
     *            the service writes approximate segment durations in your DASH
     *            manifest.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DashIsoWriteSegmentTimelineInRepresentation
     */
    public DashIsoGroupSettings withWriteSegmentTimelineInRepresentation(
            String writeSegmentTimelineInRepresentation) {
        this.writeSegmentTimelineInRepresentation = writeSegmentTimelineInRepresentation;
        return this;
    }

    /**
     * If you get an HTTP error in the 400 range when you play back your DASH
     * output, enable this setting and run your transcoding job again. When you
     * enable this setting, the service writes precise segment durations in the
     * DASH manifest. The segment duration information appears inside the
     * SegmentTimeline element, inside SegmentTemplate at the Representation
     * level. When you don't enable this setting, the service writes approximate
     * segment durations in your DASH manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param writeSegmentTimelineInRepresentation If you get an HTTP error in
     *            the 400 range when you play back your DASH output, enable this
     *            setting and run your transcoding job again. When you enable
     *            this setting, the service writes precise segment durations in
     *            the DASH manifest. The segment duration information appears
     *            inside the SegmentTimeline element, inside SegmentTemplate at
     *            the Representation level. When you don't enable this setting,
     *            the service writes approximate segment durations in your DASH
     *            manifest.
     * @see DashIsoWriteSegmentTimelineInRepresentation
     */
    public void setWriteSegmentTimelineInRepresentation(
            DashIsoWriteSegmentTimelineInRepresentation writeSegmentTimelineInRepresentation) {
        this.writeSegmentTimelineInRepresentation = writeSegmentTimelineInRepresentation.toString();
    }

    /**
     * If you get an HTTP error in the 400 range when you play back your DASH
     * output, enable this setting and run your transcoding job again. When you
     * enable this setting, the service writes precise segment durations in the
     * DASH manifest. The segment duration information appears inside the
     * SegmentTimeline element, inside SegmentTemplate at the Representation
     * level. When you don't enable this setting, the service writes approximate
     * segment durations in your DASH manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param writeSegmentTimelineInRepresentation If you get an HTTP error in
     *            the 400 range when you play back your DASH output, enable this
     *            setting and run your transcoding job again. When you enable
     *            this setting, the service writes precise segment durations in
     *            the DASH manifest. The segment duration information appears
     *            inside the SegmentTimeline element, inside SegmentTemplate at
     *            the Representation level. When you don't enable this setting,
     *            the service writes approximate segment durations in your DASH
     *            manifest.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DashIsoWriteSegmentTimelineInRepresentation
     */
    public DashIsoGroupSettings withWriteSegmentTimelineInRepresentation(
            DashIsoWriteSegmentTimelineInRepresentation writeSegmentTimelineInRepresentation) {
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
        if (getDestination() != null)
            sb.append("Destination: " + getDestination() + ",");
        if (getDestinationSettings() != null)
            sb.append("DestinationSettings: " + getDestinationSettings() + ",");
        if (getEncryption() != null)
            sb.append("Encryption: " + getEncryption() + ",");
        if (getFragmentLength() != null)
            sb.append("FragmentLength: " + getFragmentLength() + ",");
        if (getHbbtvCompliance() != null)
            sb.append("HbbtvCompliance: " + getHbbtvCompliance() + ",");
        if (getMinBufferTime() != null)
            sb.append("MinBufferTime: " + getMinBufferTime() + ",");
        if (getMpdProfile() != null)
            sb.append("MpdProfile: " + getMpdProfile() + ",");
        if (getSegmentControl() != null)
            sb.append("SegmentControl: " + getSegmentControl() + ",");
        if (getSegmentLength() != null)
            sb.append("SegmentLength: " + getSegmentLength() + ",");
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
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationSettings() == null) ? 0 : getDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode
                + ((getFragmentLength() == null) ? 0 : getFragmentLength().hashCode());
        hashCode = prime * hashCode
                + ((getHbbtvCompliance() == null) ? 0 : getHbbtvCompliance().hashCode());
        hashCode = prime * hashCode
                + ((getMinBufferTime() == null) ? 0 : getMinBufferTime().hashCode());
        hashCode = prime * hashCode + ((getMpdProfile() == null) ? 0 : getMpdProfile().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentControl() == null) ? 0 : getSegmentControl().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentLength() == null) ? 0 : getSegmentLength().hashCode());
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

        if (obj instanceof DashIsoGroupSettings == false)
            return false;
        DashIsoGroupSettings other = (DashIsoGroupSettings) obj;

        if (other.getAdditionalManifests() == null ^ this.getAdditionalManifests() == null)
            return false;
        if (other.getAdditionalManifests() != null
                && other.getAdditionalManifests().equals(this.getAdditionalManifests()) == false)
            return false;
        if (other.getBaseUrl() == null ^ this.getBaseUrl() == null)
            return false;
        if (other.getBaseUrl() != null && other.getBaseUrl().equals(this.getBaseUrl()) == false)
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
        if (other.getHbbtvCompliance() == null ^ this.getHbbtvCompliance() == null)
            return false;
        if (other.getHbbtvCompliance() != null
                && other.getHbbtvCompliance().equals(this.getHbbtvCompliance()) == false)
            return false;
        if (other.getMinBufferTime() == null ^ this.getMinBufferTime() == null)
            return false;
        if (other.getMinBufferTime() != null
                && other.getMinBufferTime().equals(this.getMinBufferTime()) == false)
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
