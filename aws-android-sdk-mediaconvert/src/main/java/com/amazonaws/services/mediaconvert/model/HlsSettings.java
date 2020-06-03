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
 * Settings for HLS output groups
 */
public class HlsSettings implements Serializable {
    /**
     * Specifies the group to which the audio Rendition belongs.
     */
    private String audioGroupId;

    /**
     * Use this setting only in audio-only outputs. Choose MPEG-2 Transport
     * Stream (M2TS) to create a file in an MPEG2-TS container. Keep the default
     * value Automatic (AUTOMATIC) to create an audio-only file in a raw
     * container. Regardless of the value that you specify here, if this output
     * has video, the service will place the output into an MPEG2-TS container.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, M2TS
     */
    private String audioOnlyContainer;

    /**
     * List all the audio groups that are used with the video output stream.
     * Input all the audio GROUP-IDs that are associated to the video, separate
     * by ','.
     */
    private String audioRenditionSets;

    /**
     * Four types of audio-only tracks are supported: Audio-Only Variant Stream
     * The client can play back this audio-only stream instead of video in
     * low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS
     * manifest. Alternate Audio, Auto Select, Default Alternate rendition that
     * the client should try to play back by default. Represented as an
     * EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     * Alternate Audio, Auto Select, Not Default Alternate rendition that the
     * client may try to play back by default. Represented as an EXT-X-MEDIA in
     * the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not
     * Auto Select Alternate rendition that the client will not try to play back
     * by default. Represented as an EXT-X-MEDIA in the HLS manifest with
     * DEFAULT=NO, AUTOSELECT=NO
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT,
     * ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_NOT_AUTO_SELECT,
     * AUDIO_ONLY_VARIANT_STREAM
     */
    private String audioTrackType;

    /**
     * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS
     * manifest
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     */
    private String iFrameOnlyManifest;

    /**
     * Use this setting to add an identifying string to the filename of each
     * segment. The service adds this string between the name modifier and
     * segment index number. You can use format identifiers in the string. For
     * more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/using
     * -variables-in-your-job-settings.html
     */
    private String segmentModifier;

    /**
     * Specifies the group to which the audio Rendition belongs.
     *
     * @return Specifies the group to which the audio Rendition belongs.
     */
    public String getAudioGroupId() {
        return audioGroupId;
    }

    /**
     * Specifies the group to which the audio Rendition belongs.
     *
     * @param audioGroupId Specifies the group to which the audio Rendition
     *            belongs.
     */
    public void setAudioGroupId(String audioGroupId) {
        this.audioGroupId = audioGroupId;
    }

    /**
     * Specifies the group to which the audio Rendition belongs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioGroupId Specifies the group to which the audio Rendition
     *            belongs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsSettings withAudioGroupId(String audioGroupId) {
        this.audioGroupId = audioGroupId;
        return this;
    }

    /**
     * Use this setting only in audio-only outputs. Choose MPEG-2 Transport
     * Stream (M2TS) to create a file in an MPEG2-TS container. Keep the default
     * value Automatic (AUTOMATIC) to create an audio-only file in a raw
     * container. Regardless of the value that you specify here, if this output
     * has video, the service will place the output into an MPEG2-TS container.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, M2TS
     *
     * @return Use this setting only in audio-only outputs. Choose MPEG-2
     *         Transport Stream (M2TS) to create a file in an MPEG2-TS
     *         container. Keep the default value Automatic (AUTOMATIC) to create
     *         an audio-only file in a raw container. Regardless of the value
     *         that you specify here, if this output has video, the service will
     *         place the output into an MPEG2-TS container.
     * @see HlsAudioOnlyContainer
     */
    public String getAudioOnlyContainer() {
        return audioOnlyContainer;
    }

    /**
     * Use this setting only in audio-only outputs. Choose MPEG-2 Transport
     * Stream (M2TS) to create a file in an MPEG2-TS container. Keep the default
     * value Automatic (AUTOMATIC) to create an audio-only file in a raw
     * container. Regardless of the value that you specify here, if this output
     * has video, the service will place the output into an MPEG2-TS container.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, M2TS
     *
     * @param audioOnlyContainer Use this setting only in audio-only outputs.
     *            Choose MPEG-2 Transport Stream (M2TS) to create a file in an
     *            MPEG2-TS container. Keep the default value Automatic
     *            (AUTOMATIC) to create an audio-only file in a raw container.
     *            Regardless of the value that you specify here, if this output
     *            has video, the service will place the output into an MPEG2-TS
     *            container.
     * @see HlsAudioOnlyContainer
     */
    public void setAudioOnlyContainer(String audioOnlyContainer) {
        this.audioOnlyContainer = audioOnlyContainer;
    }

    /**
     * Use this setting only in audio-only outputs. Choose MPEG-2 Transport
     * Stream (M2TS) to create a file in an MPEG2-TS container. Keep the default
     * value Automatic (AUTOMATIC) to create an audio-only file in a raw
     * container. Regardless of the value that you specify here, if this output
     * has video, the service will place the output into an MPEG2-TS container.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, M2TS
     *
     * @param audioOnlyContainer Use this setting only in audio-only outputs.
     *            Choose MPEG-2 Transport Stream (M2TS) to create a file in an
     *            MPEG2-TS container. Keep the default value Automatic
     *            (AUTOMATIC) to create an audio-only file in a raw container.
     *            Regardless of the value that you specify here, if this output
     *            has video, the service will place the output into an MPEG2-TS
     *            container.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsAudioOnlyContainer
     */
    public HlsSettings withAudioOnlyContainer(String audioOnlyContainer) {
        this.audioOnlyContainer = audioOnlyContainer;
        return this;
    }

    /**
     * Use this setting only in audio-only outputs. Choose MPEG-2 Transport
     * Stream (M2TS) to create a file in an MPEG2-TS container. Keep the default
     * value Automatic (AUTOMATIC) to create an audio-only file in a raw
     * container. Regardless of the value that you specify here, if this output
     * has video, the service will place the output into an MPEG2-TS container.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, M2TS
     *
     * @param audioOnlyContainer Use this setting only in audio-only outputs.
     *            Choose MPEG-2 Transport Stream (M2TS) to create a file in an
     *            MPEG2-TS container. Keep the default value Automatic
     *            (AUTOMATIC) to create an audio-only file in a raw container.
     *            Regardless of the value that you specify here, if this output
     *            has video, the service will place the output into an MPEG2-TS
     *            container.
     * @see HlsAudioOnlyContainer
     */
    public void setAudioOnlyContainer(HlsAudioOnlyContainer audioOnlyContainer) {
        this.audioOnlyContainer = audioOnlyContainer.toString();
    }

    /**
     * Use this setting only in audio-only outputs. Choose MPEG-2 Transport
     * Stream (M2TS) to create a file in an MPEG2-TS container. Keep the default
     * value Automatic (AUTOMATIC) to create an audio-only file in a raw
     * container. Regardless of the value that you specify here, if this output
     * has video, the service will place the output into an MPEG2-TS container.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, M2TS
     *
     * @param audioOnlyContainer Use this setting only in audio-only outputs.
     *            Choose MPEG-2 Transport Stream (M2TS) to create a file in an
     *            MPEG2-TS container. Keep the default value Automatic
     *            (AUTOMATIC) to create an audio-only file in a raw container.
     *            Regardless of the value that you specify here, if this output
     *            has video, the service will place the output into an MPEG2-TS
     *            container.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsAudioOnlyContainer
     */
    public HlsSettings withAudioOnlyContainer(HlsAudioOnlyContainer audioOnlyContainer) {
        this.audioOnlyContainer = audioOnlyContainer.toString();
        return this;
    }

    /**
     * List all the audio groups that are used with the video output stream.
     * Input all the audio GROUP-IDs that are associated to the video, separate
     * by ','.
     *
     * @return List all the audio groups that are used with the video output
     *         stream. Input all the audio GROUP-IDs that are associated to the
     *         video, separate by ','.
     */
    public String getAudioRenditionSets() {
        return audioRenditionSets;
    }

    /**
     * List all the audio groups that are used with the video output stream.
     * Input all the audio GROUP-IDs that are associated to the video, separate
     * by ','.
     *
     * @param audioRenditionSets List all the audio groups that are used with
     *            the video output stream. Input all the audio GROUP-IDs that
     *            are associated to the video, separate by ','.
     */
    public void setAudioRenditionSets(String audioRenditionSets) {
        this.audioRenditionSets = audioRenditionSets;
    }

    /**
     * List all the audio groups that are used with the video output stream.
     * Input all the audio GROUP-IDs that are associated to the video, separate
     * by ','.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioRenditionSets List all the audio groups that are used with
     *            the video output stream. Input all the audio GROUP-IDs that
     *            are associated to the video, separate by ','.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsSettings withAudioRenditionSets(String audioRenditionSets) {
        this.audioRenditionSets = audioRenditionSets;
        return this;
    }

    /**
     * Four types of audio-only tracks are supported: Audio-Only Variant Stream
     * The client can play back this audio-only stream instead of video in
     * low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS
     * manifest. Alternate Audio, Auto Select, Default Alternate rendition that
     * the client should try to play back by default. Represented as an
     * EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     * Alternate Audio, Auto Select, Not Default Alternate rendition that the
     * client may try to play back by default. Represented as an EXT-X-MEDIA in
     * the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not
     * Auto Select Alternate rendition that the client will not try to play back
     * by default. Represented as an EXT-X-MEDIA in the HLS manifest with
     * DEFAULT=NO, AUTOSELECT=NO
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT,
     * ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_NOT_AUTO_SELECT,
     * AUDIO_ONLY_VARIANT_STREAM
     *
     * @return Four types of audio-only tracks are supported: Audio-Only Variant
     *         Stream The client can play back this audio-only stream instead of
     *         video in low-bandwidth scenarios. Represented as an
     *         EXT-X-STREAM-INF in the HLS manifest. Alternate Audio, Auto
     *         Select, Default Alternate rendition that the client should try to
     *         play back by default. Represented as an EXT-X-MEDIA in the HLS
     *         manifest with DEFAULT=YES, AUTOSELECT=YES Alternate Audio, Auto
     *         Select, Not Default Alternate rendition that the client may try
     *         to play back by default. Represented as an EXT-X-MEDIA in the HLS
     *         manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not
     *         Auto Select Alternate rendition that the client will not try to
     *         play back by default. Represented as an EXT-X-MEDIA in the HLS
     *         manifest with DEFAULT=NO, AUTOSELECT=NO
     * @see HlsAudioTrackType
     */
    public String getAudioTrackType() {
        return audioTrackType;
    }

    /**
     * Four types of audio-only tracks are supported: Audio-Only Variant Stream
     * The client can play back this audio-only stream instead of video in
     * low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS
     * manifest. Alternate Audio, Auto Select, Default Alternate rendition that
     * the client should try to play back by default. Represented as an
     * EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     * Alternate Audio, Auto Select, Not Default Alternate rendition that the
     * client may try to play back by default. Represented as an EXT-X-MEDIA in
     * the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not
     * Auto Select Alternate rendition that the client will not try to play back
     * by default. Represented as an EXT-X-MEDIA in the HLS manifest with
     * DEFAULT=NO, AUTOSELECT=NO
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT,
     * ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_NOT_AUTO_SELECT,
     * AUDIO_ONLY_VARIANT_STREAM
     *
     * @param audioTrackType Four types of audio-only tracks are supported:
     *            Audio-Only Variant Stream The client can play back this
     *            audio-only stream instead of video in low-bandwidth scenarios.
     *            Represented as an EXT-X-STREAM-INF in the HLS manifest.
     *            Alternate Audio, Auto Select, Default Alternate rendition that
     *            the client should try to play back by default. Represented as
     *            an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES,
     *            AUTOSELECT=YES Alternate Audio, Auto Select, Not Default
     *            Alternate rendition that the client may try to play back by
     *            default. Represented as an EXT-X-MEDIA in the HLS manifest
     *            with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto
     *            Select Alternate rendition that the client will not try to
     *            play back by default. Represented as an EXT-X-MEDIA in the HLS
     *            manifest with DEFAULT=NO, AUTOSELECT=NO
     * @see HlsAudioTrackType
     */
    public void setAudioTrackType(String audioTrackType) {
        this.audioTrackType = audioTrackType;
    }

    /**
     * Four types of audio-only tracks are supported: Audio-Only Variant Stream
     * The client can play back this audio-only stream instead of video in
     * low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS
     * manifest. Alternate Audio, Auto Select, Default Alternate rendition that
     * the client should try to play back by default. Represented as an
     * EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     * Alternate Audio, Auto Select, Not Default Alternate rendition that the
     * client may try to play back by default. Represented as an EXT-X-MEDIA in
     * the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not
     * Auto Select Alternate rendition that the client will not try to play back
     * by default. Represented as an EXT-X-MEDIA in the HLS manifest with
     * DEFAULT=NO, AUTOSELECT=NO
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT,
     * ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_NOT_AUTO_SELECT,
     * AUDIO_ONLY_VARIANT_STREAM
     *
     * @param audioTrackType Four types of audio-only tracks are supported:
     *            Audio-Only Variant Stream The client can play back this
     *            audio-only stream instead of video in low-bandwidth scenarios.
     *            Represented as an EXT-X-STREAM-INF in the HLS manifest.
     *            Alternate Audio, Auto Select, Default Alternate rendition that
     *            the client should try to play back by default. Represented as
     *            an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES,
     *            AUTOSELECT=YES Alternate Audio, Auto Select, Not Default
     *            Alternate rendition that the client may try to play back by
     *            default. Represented as an EXT-X-MEDIA in the HLS manifest
     *            with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto
     *            Select Alternate rendition that the client will not try to
     *            play back by default. Represented as an EXT-X-MEDIA in the HLS
     *            manifest with DEFAULT=NO, AUTOSELECT=NO
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsAudioTrackType
     */
    public HlsSettings withAudioTrackType(String audioTrackType) {
        this.audioTrackType = audioTrackType;
        return this;
    }

    /**
     * Four types of audio-only tracks are supported: Audio-Only Variant Stream
     * The client can play back this audio-only stream instead of video in
     * low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS
     * manifest. Alternate Audio, Auto Select, Default Alternate rendition that
     * the client should try to play back by default. Represented as an
     * EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     * Alternate Audio, Auto Select, Not Default Alternate rendition that the
     * client may try to play back by default. Represented as an EXT-X-MEDIA in
     * the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not
     * Auto Select Alternate rendition that the client will not try to play back
     * by default. Represented as an EXT-X-MEDIA in the HLS manifest with
     * DEFAULT=NO, AUTOSELECT=NO
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT,
     * ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_NOT_AUTO_SELECT,
     * AUDIO_ONLY_VARIANT_STREAM
     *
     * @param audioTrackType Four types of audio-only tracks are supported:
     *            Audio-Only Variant Stream The client can play back this
     *            audio-only stream instead of video in low-bandwidth scenarios.
     *            Represented as an EXT-X-STREAM-INF in the HLS manifest.
     *            Alternate Audio, Auto Select, Default Alternate rendition that
     *            the client should try to play back by default. Represented as
     *            an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES,
     *            AUTOSELECT=YES Alternate Audio, Auto Select, Not Default
     *            Alternate rendition that the client may try to play back by
     *            default. Represented as an EXT-X-MEDIA in the HLS manifest
     *            with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto
     *            Select Alternate rendition that the client will not try to
     *            play back by default. Represented as an EXT-X-MEDIA in the HLS
     *            manifest with DEFAULT=NO, AUTOSELECT=NO
     * @see HlsAudioTrackType
     */
    public void setAudioTrackType(HlsAudioTrackType audioTrackType) {
        this.audioTrackType = audioTrackType.toString();
    }

    /**
     * Four types of audio-only tracks are supported: Audio-Only Variant Stream
     * The client can play back this audio-only stream instead of video in
     * low-bandwidth scenarios. Represented as an EXT-X-STREAM-INF in the HLS
     * manifest. Alternate Audio, Auto Select, Default Alternate rendition that
     * the client should try to play back by default. Represented as an
     * EXT-X-MEDIA in the HLS manifest with DEFAULT=YES, AUTOSELECT=YES
     * Alternate Audio, Auto Select, Not Default Alternate rendition that the
     * client may try to play back by default. Represented as an EXT-X-MEDIA in
     * the HLS manifest with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not
     * Auto Select Alternate rendition that the client will not try to play back
     * by default. Represented as an EXT-X-MEDIA in the HLS manifest with
     * DEFAULT=NO, AUTOSELECT=NO
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT,
     * ALTERNATE_AUDIO_AUTO_SELECT, ALTERNATE_AUDIO_NOT_AUTO_SELECT,
     * AUDIO_ONLY_VARIANT_STREAM
     *
     * @param audioTrackType Four types of audio-only tracks are supported:
     *            Audio-Only Variant Stream The client can play back this
     *            audio-only stream instead of video in low-bandwidth scenarios.
     *            Represented as an EXT-X-STREAM-INF in the HLS manifest.
     *            Alternate Audio, Auto Select, Default Alternate rendition that
     *            the client should try to play back by default. Represented as
     *            an EXT-X-MEDIA in the HLS manifest with DEFAULT=YES,
     *            AUTOSELECT=YES Alternate Audio, Auto Select, Not Default
     *            Alternate rendition that the client may try to play back by
     *            default. Represented as an EXT-X-MEDIA in the HLS manifest
     *            with DEFAULT=NO, AUTOSELECT=YES Alternate Audio, not Auto
     *            Select Alternate rendition that the client will not try to
     *            play back by default. Represented as an EXT-X-MEDIA in the HLS
     *            manifest with DEFAULT=NO, AUTOSELECT=NO
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsAudioTrackType
     */
    public HlsSettings withAudioTrackType(HlsAudioTrackType audioTrackType) {
        this.audioTrackType = audioTrackType.toString();
        return this;
    }

    /**
     * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS
     * manifest
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @return When set to INCLUDE, writes I-Frame Only Manifest in addition to
     *         the HLS manifest
     * @see HlsIFrameOnlyManifest
     */
    public String getIFrameOnlyManifest() {
        return iFrameOnlyManifest;
    }

    /**
     * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS
     * manifest
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param iFrameOnlyManifest When set to INCLUDE, writes I-Frame Only
     *            Manifest in addition to the HLS manifest
     * @see HlsIFrameOnlyManifest
     */
    public void setIFrameOnlyManifest(String iFrameOnlyManifest) {
        this.iFrameOnlyManifest = iFrameOnlyManifest;
    }

    /**
     * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS
     * manifest
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param iFrameOnlyManifest When set to INCLUDE, writes I-Frame Only
     *            Manifest in addition to the HLS manifest
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsIFrameOnlyManifest
     */
    public HlsSettings withIFrameOnlyManifest(String iFrameOnlyManifest) {
        this.iFrameOnlyManifest = iFrameOnlyManifest;
        return this;
    }

    /**
     * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS
     * manifest
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param iFrameOnlyManifest When set to INCLUDE, writes I-Frame Only
     *            Manifest in addition to the HLS manifest
     * @see HlsIFrameOnlyManifest
     */
    public void setIFrameOnlyManifest(HlsIFrameOnlyManifest iFrameOnlyManifest) {
        this.iFrameOnlyManifest = iFrameOnlyManifest.toString();
    }

    /**
     * When set to INCLUDE, writes I-Frame Only Manifest in addition to the HLS
     * manifest
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param iFrameOnlyManifest When set to INCLUDE, writes I-Frame Only
     *            Manifest in addition to the HLS manifest
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsIFrameOnlyManifest
     */
    public HlsSettings withIFrameOnlyManifest(HlsIFrameOnlyManifest iFrameOnlyManifest) {
        this.iFrameOnlyManifest = iFrameOnlyManifest.toString();
        return this;
    }

    /**
     * Use this setting to add an identifying string to the filename of each
     * segment. The service adds this string between the name modifier and
     * segment index number. You can use format identifiers in the string. For
     * more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/using
     * -variables-in-your-job-settings.html
     *
     * @return Use this setting to add an identifying string to the filename of
     *         each segment. The service adds this string between the name
     *         modifier and segment index number. You can use format identifiers
     *         in the string. For more information, see
     *         https://docs.aws.amazon.com
     *         /mediaconvert/latest/ug/using-variables-in-your-job-settings.html
     */
    public String getSegmentModifier() {
        return segmentModifier;
    }

    /**
     * Use this setting to add an identifying string to the filename of each
     * segment. The service adds this string between the name modifier and
     * segment index number. You can use format identifiers in the string. For
     * more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/using
     * -variables-in-your-job-settings.html
     *
     * @param segmentModifier Use this setting to add an identifying string to
     *            the filename of each segment. The service adds this string
     *            between the name modifier and segment index number. You can
     *            use format identifiers in the string. For more information,
     *            see https://docs.aws.amazon.com/mediaconvert/latest/ug/using-
     *            variables-in-your-job-settings.html
     */
    public void setSegmentModifier(String segmentModifier) {
        this.segmentModifier = segmentModifier;
    }

    /**
     * Use this setting to add an identifying string to the filename of each
     * segment. The service adds this string between the name modifier and
     * segment index number. You can use format identifiers in the string. For
     * more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/using
     * -variables-in-your-job-settings.html
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentModifier Use this setting to add an identifying string to
     *            the filename of each segment. The service adds this string
     *            between the name modifier and segment index number. You can
     *            use format identifiers in the string. For more information,
     *            see https://docs.aws.amazon.com/mediaconvert/latest/ug/using-
     *            variables-in-your-job-settings.html
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsSettings withSegmentModifier(String segmentModifier) {
        this.segmentModifier = segmentModifier;
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
        if (getAudioGroupId() != null)
            sb.append("AudioGroupId: " + getAudioGroupId() + ",");
        if (getAudioOnlyContainer() != null)
            sb.append("AudioOnlyContainer: " + getAudioOnlyContainer() + ",");
        if (getAudioRenditionSets() != null)
            sb.append("AudioRenditionSets: " + getAudioRenditionSets() + ",");
        if (getAudioTrackType() != null)
            sb.append("AudioTrackType: " + getAudioTrackType() + ",");
        if (getIFrameOnlyManifest() != null)
            sb.append("IFrameOnlyManifest: " + getIFrameOnlyManifest() + ",");
        if (getSegmentModifier() != null)
            sb.append("SegmentModifier: " + getSegmentModifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAudioGroupId() == null) ? 0 : getAudioGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getAudioOnlyContainer() == null) ? 0 : getAudioOnlyContainer().hashCode());
        hashCode = prime * hashCode
                + ((getAudioRenditionSets() == null) ? 0 : getAudioRenditionSets().hashCode());
        hashCode = prime * hashCode
                + ((getAudioTrackType() == null) ? 0 : getAudioTrackType().hashCode());
        hashCode = prime * hashCode
                + ((getIFrameOnlyManifest() == null) ? 0 : getIFrameOnlyManifest().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentModifier() == null) ? 0 : getSegmentModifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsSettings == false)
            return false;
        HlsSettings other = (HlsSettings) obj;

        if (other.getAudioGroupId() == null ^ this.getAudioGroupId() == null)
            return false;
        if (other.getAudioGroupId() != null
                && other.getAudioGroupId().equals(this.getAudioGroupId()) == false)
            return false;
        if (other.getAudioOnlyContainer() == null ^ this.getAudioOnlyContainer() == null)
            return false;
        if (other.getAudioOnlyContainer() != null
                && other.getAudioOnlyContainer().equals(this.getAudioOnlyContainer()) == false)
            return false;
        if (other.getAudioRenditionSets() == null ^ this.getAudioRenditionSets() == null)
            return false;
        if (other.getAudioRenditionSets() != null
                && other.getAudioRenditionSets().equals(this.getAudioRenditionSets()) == false)
            return false;
        if (other.getAudioTrackType() == null ^ this.getAudioTrackType() == null)
            return false;
        if (other.getAudioTrackType() != null
                && other.getAudioTrackType().equals(this.getAudioTrackType()) == false)
            return false;
        if (other.getIFrameOnlyManifest() == null ^ this.getIFrameOnlyManifest() == null)
            return false;
        if (other.getIFrameOnlyManifest() != null
                && other.getIFrameOnlyManifest().equals(this.getIFrameOnlyManifest()) == false)
            return false;
        if (other.getSegmentModifier() == null ^ this.getSegmentModifier() == null)
            return false;
        if (other.getSegmentModifier() != null
                && other.getSegmentModifier().equals(this.getSegmentModifier()) == false)
            return false;
        return true;
    }
}
