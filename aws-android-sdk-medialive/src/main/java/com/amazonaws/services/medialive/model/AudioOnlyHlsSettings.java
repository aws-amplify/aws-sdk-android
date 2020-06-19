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
 * Audio Only Hls Settings
 */
public class AudioOnlyHlsSettings implements Serializable {
    /**
     * Specifies the group to which the audio Rendition belongs.
     */
    private String audioGroupId;

    /**
     * Optional. Specifies the .jpg or .png image to use as the cover art for an
     * audio-only output. We recommend a low bit-size file because the image
     * increases the output audio bandwidth. The image is attached to the audio
     * as an ID3 tag, frame type APIC, picture type 0x10, as per the
     * "ID3 tag version 2.4.0 - Native Frames" standard.
     */
    private InputLocation audioOnlyImage;

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
     * <b>Allowed Values: </b>ALTERNATE_AUDIO_AUTO_SELECT,
     * ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_NOT_AUTO_SELECT,
     * AUDIO_ONLY_VARIANT_STREAM
     */
    private String audioTrackType;

    /**
     * Specifies the segment type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AAC, FMP4
     */
    private String segmentType;

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
    public AudioOnlyHlsSettings withAudioGroupId(String audioGroupId) {
        this.audioGroupId = audioGroupId;
        return this;
    }

    /**
     * Optional. Specifies the .jpg or .png image to use as the cover art for an
     * audio-only output. We recommend a low bit-size file because the image
     * increases the output audio bandwidth. The image is attached to the audio
     * as an ID3 tag, frame type APIC, picture type 0x10, as per the
     * "ID3 tag version 2.4.0 - Native Frames" standard.
     *
     * @return Optional. Specifies the .jpg or .png image to use as the cover
     *         art for an audio-only output. We recommend a low bit-size file
     *         because the image increases the output audio bandwidth. The image
     *         is attached to the audio as an ID3 tag, frame type APIC, picture
     *         type 0x10, as per the "ID3 tag version 2.4.0 - Native Frames"
     *         standard.
     */
    public InputLocation getAudioOnlyImage() {
        return audioOnlyImage;
    }

    /**
     * Optional. Specifies the .jpg or .png image to use as the cover art for an
     * audio-only output. We recommend a low bit-size file because the image
     * increases the output audio bandwidth. The image is attached to the audio
     * as an ID3 tag, frame type APIC, picture type 0x10, as per the
     * "ID3 tag version 2.4.0 - Native Frames" standard.
     *
     * @param audioOnlyImage Optional. Specifies the .jpg or .png image to use
     *            as the cover art for an audio-only output. We recommend a low
     *            bit-size file because the image increases the output audio
     *            bandwidth. The image is attached to the audio as an ID3 tag,
     *            frame type APIC, picture type 0x10, as per the
     *            "ID3 tag version 2.4.0 - Native Frames" standard.
     */
    public void setAudioOnlyImage(InputLocation audioOnlyImage) {
        this.audioOnlyImage = audioOnlyImage;
    }

    /**
     * Optional. Specifies the .jpg or .png image to use as the cover art for an
     * audio-only output. We recommend a low bit-size file because the image
     * increases the output audio bandwidth. The image is attached to the audio
     * as an ID3 tag, frame type APIC, picture type 0x10, as per the
     * "ID3 tag version 2.4.0 - Native Frames" standard.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioOnlyImage Optional. Specifies the .jpg or .png image to use
     *            as the cover art for an audio-only output. We recommend a low
     *            bit-size file because the image increases the output audio
     *            bandwidth. The image is attached to the audio as an ID3 tag,
     *            frame type APIC, picture type 0x10, as per the
     *            "ID3 tag version 2.4.0 - Native Frames" standard.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioOnlyHlsSettings withAudioOnlyImage(InputLocation audioOnlyImage) {
        this.audioOnlyImage = audioOnlyImage;
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
     * <b>Allowed Values: </b>ALTERNATE_AUDIO_AUTO_SELECT,
     * ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_NOT_AUTO_SELECT,
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
     * @see AudioOnlyHlsTrackType
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
     * <b>Allowed Values: </b>ALTERNATE_AUDIO_AUTO_SELECT,
     * ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_NOT_AUTO_SELECT,
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
     * @see AudioOnlyHlsTrackType
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
     * <b>Allowed Values: </b>ALTERNATE_AUDIO_AUTO_SELECT,
     * ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_NOT_AUTO_SELECT,
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
     * @see AudioOnlyHlsTrackType
     */
    public AudioOnlyHlsSettings withAudioTrackType(String audioTrackType) {
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
     * <b>Allowed Values: </b>ALTERNATE_AUDIO_AUTO_SELECT,
     * ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_NOT_AUTO_SELECT,
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
     * @see AudioOnlyHlsTrackType
     */
    public void setAudioTrackType(AudioOnlyHlsTrackType audioTrackType) {
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
     * <b>Allowed Values: </b>ALTERNATE_AUDIO_AUTO_SELECT,
     * ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT, ALTERNATE_AUDIO_NOT_AUTO_SELECT,
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
     * @see AudioOnlyHlsTrackType
     */
    public AudioOnlyHlsSettings withAudioTrackType(AudioOnlyHlsTrackType audioTrackType) {
        this.audioTrackType = audioTrackType.toString();
        return this;
    }

    /**
     * Specifies the segment type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AAC, FMP4
     *
     * @return Specifies the segment type.
     * @see AudioOnlyHlsSegmentType
     */
    public String getSegmentType() {
        return segmentType;
    }

    /**
     * Specifies the segment type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AAC, FMP4
     *
     * @param segmentType Specifies the segment type.
     * @see AudioOnlyHlsSegmentType
     */
    public void setSegmentType(String segmentType) {
        this.segmentType = segmentType;
    }

    /**
     * Specifies the segment type.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AAC, FMP4
     *
     * @param segmentType Specifies the segment type.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioOnlyHlsSegmentType
     */
    public AudioOnlyHlsSettings withSegmentType(String segmentType) {
        this.segmentType = segmentType;
        return this;
    }

    /**
     * Specifies the segment type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AAC, FMP4
     *
     * @param segmentType Specifies the segment type.
     * @see AudioOnlyHlsSegmentType
     */
    public void setSegmentType(AudioOnlyHlsSegmentType segmentType) {
        this.segmentType = segmentType.toString();
    }

    /**
     * Specifies the segment type.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AAC, FMP4
     *
     * @param segmentType Specifies the segment type.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioOnlyHlsSegmentType
     */
    public AudioOnlyHlsSettings withSegmentType(AudioOnlyHlsSegmentType segmentType) {
        this.segmentType = segmentType.toString();
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
        if (getAudioOnlyImage() != null)
            sb.append("AudioOnlyImage: " + getAudioOnlyImage() + ",");
        if (getAudioTrackType() != null)
            sb.append("AudioTrackType: " + getAudioTrackType() + ",");
        if (getSegmentType() != null)
            sb.append("SegmentType: " + getSegmentType());
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
                + ((getAudioOnlyImage() == null) ? 0 : getAudioOnlyImage().hashCode());
        hashCode = prime * hashCode
                + ((getAudioTrackType() == null) ? 0 : getAudioTrackType().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentType() == null) ? 0 : getSegmentType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioOnlyHlsSettings == false)
            return false;
        AudioOnlyHlsSettings other = (AudioOnlyHlsSettings) obj;

        if (other.getAudioGroupId() == null ^ this.getAudioGroupId() == null)
            return false;
        if (other.getAudioGroupId() != null
                && other.getAudioGroupId().equals(this.getAudioGroupId()) == false)
            return false;
        if (other.getAudioOnlyImage() == null ^ this.getAudioOnlyImage() == null)
            return false;
        if (other.getAudioOnlyImage() != null
                && other.getAudioOnlyImage().equals(this.getAudioOnlyImage()) == false)
            return false;
        if (other.getAudioTrackType() == null ^ this.getAudioTrackType() == null)
            return false;
        if (other.getAudioTrackType() != null
                && other.getAudioTrackType().equals(this.getAudioTrackType()) == false)
            return false;
        if (other.getSegmentType() == null ^ this.getSegmentType() == null)
            return false;
        if (other.getSegmentType() != null
                && other.getSegmentType().equals(this.getSegmentType()) == false)
            return false;
        return true;
    }
}
