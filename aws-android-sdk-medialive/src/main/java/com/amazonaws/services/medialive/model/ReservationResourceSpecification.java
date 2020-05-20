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
 * Resource configuration (codec, resolution, bitrate, ...)
 */
public class ReservationResourceSpecification implements Serializable {
    /**
     * Channel class, e.g. 'STANDARD'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     */
    private String channelClass;

    /**
     * Codec, e.g. 'AVC'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, AVC, HEVC, AUDIO
     */
    private String codec;

    /**
     * Maximum bitrate, e.g. 'MAX_20_MBPS'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS
     */
    private String maximumBitrate;

    /**
     * Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_30_FPS, MAX_60_FPS
     */
    private String maximumFramerate;

    /**
     * Resolution, e.g. 'HD'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SD, HD, FHD, UHD
     */
    private String resolution;

    /**
     * Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPUT, OUTPUT, MULTIPLEX, CHANNEL
     */
    private String resourceType;

    /**
     * Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADVANCED_AUDIO, AUDIO_NORMALIZATION
     */
    private String specialFeature;

    /**
     * Video quality, e.g. 'STANDARD' (Outputs only)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, ENHANCED, PREMIUM
     */
    private String videoQuality;

    /**
     * Channel class, e.g. 'STANDARD'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @return Channel class, e.g. 'STANDARD'
     * @see ChannelClass
     */
    public String getChannelClass() {
        return channelClass;
    }

    /**
     * Channel class, e.g. 'STANDARD'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @param channelClass Channel class, e.g. 'STANDARD'
     * @see ChannelClass
     */
    public void setChannelClass(String channelClass) {
        this.channelClass = channelClass;
    }

    /**
     * Channel class, e.g. 'STANDARD'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @param channelClass Channel class, e.g. 'STANDARD'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelClass
     */
    public ReservationResourceSpecification withChannelClass(String channelClass) {
        this.channelClass = channelClass;
        return this;
    }

    /**
     * Channel class, e.g. 'STANDARD'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @param channelClass Channel class, e.g. 'STANDARD'
     * @see ChannelClass
     */
    public void setChannelClass(ChannelClass channelClass) {
        this.channelClass = channelClass.toString();
    }

    /**
     * Channel class, e.g. 'STANDARD'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, SINGLE_PIPELINE
     *
     * @param channelClass Channel class, e.g. 'STANDARD'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelClass
     */
    public ReservationResourceSpecification withChannelClass(ChannelClass channelClass) {
        this.channelClass = channelClass.toString();
        return this;
    }

    /**
     * Codec, e.g. 'AVC'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, AVC, HEVC, AUDIO
     *
     * @return Codec, e.g. 'AVC'
     * @see ReservationCodec
     */
    public String getCodec() {
        return codec;
    }

    /**
     * Codec, e.g. 'AVC'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, AVC, HEVC, AUDIO
     *
     * @param codec Codec, e.g. 'AVC'
     * @see ReservationCodec
     */
    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * Codec, e.g. 'AVC'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, AVC, HEVC, AUDIO
     *
     * @param codec Codec, e.g. 'AVC'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationCodec
     */
    public ReservationResourceSpecification withCodec(String codec) {
        this.codec = codec;
        return this;
    }

    /**
     * Codec, e.g. 'AVC'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, AVC, HEVC, AUDIO
     *
     * @param codec Codec, e.g. 'AVC'
     * @see ReservationCodec
     */
    public void setCodec(ReservationCodec codec) {
        this.codec = codec.toString();
    }

    /**
     * Codec, e.g. 'AVC'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MPEG2, AVC, HEVC, AUDIO
     *
     * @param codec Codec, e.g. 'AVC'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationCodec
     */
    public ReservationResourceSpecification withCodec(ReservationCodec codec) {
        this.codec = codec.toString();
        return this;
    }

    /**
     * Maximum bitrate, e.g. 'MAX_20_MBPS'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS
     *
     * @return Maximum bitrate, e.g. 'MAX_20_MBPS'
     * @see ReservationMaximumBitrate
     */
    public String getMaximumBitrate() {
        return maximumBitrate;
    }

    /**
     * Maximum bitrate, e.g. 'MAX_20_MBPS'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS
     *
     * @param maximumBitrate Maximum bitrate, e.g. 'MAX_20_MBPS'
     * @see ReservationMaximumBitrate
     */
    public void setMaximumBitrate(String maximumBitrate) {
        this.maximumBitrate = maximumBitrate;
    }

    /**
     * Maximum bitrate, e.g. 'MAX_20_MBPS'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS
     *
     * @param maximumBitrate Maximum bitrate, e.g. 'MAX_20_MBPS'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationMaximumBitrate
     */
    public ReservationResourceSpecification withMaximumBitrate(String maximumBitrate) {
        this.maximumBitrate = maximumBitrate;
        return this;
    }

    /**
     * Maximum bitrate, e.g. 'MAX_20_MBPS'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS
     *
     * @param maximumBitrate Maximum bitrate, e.g. 'MAX_20_MBPS'
     * @see ReservationMaximumBitrate
     */
    public void setMaximumBitrate(ReservationMaximumBitrate maximumBitrate) {
        this.maximumBitrate = maximumBitrate.toString();
    }

    /**
     * Maximum bitrate, e.g. 'MAX_20_MBPS'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_10_MBPS, MAX_20_MBPS, MAX_50_MBPS
     *
     * @param maximumBitrate Maximum bitrate, e.g. 'MAX_20_MBPS'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationMaximumBitrate
     */
    public ReservationResourceSpecification withMaximumBitrate(
            ReservationMaximumBitrate maximumBitrate) {
        this.maximumBitrate = maximumBitrate.toString();
        return this;
    }

    /**
     * Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_30_FPS, MAX_60_FPS
     *
     * @return Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
     * @see ReservationMaximumFramerate
     */
    public String getMaximumFramerate() {
        return maximumFramerate;
    }

    /**
     * Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_30_FPS, MAX_60_FPS
     *
     * @param maximumFramerate Maximum framerate, e.g. 'MAX_30_FPS' (Outputs
     *            only)
     * @see ReservationMaximumFramerate
     */
    public void setMaximumFramerate(String maximumFramerate) {
        this.maximumFramerate = maximumFramerate;
    }

    /**
     * Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_30_FPS, MAX_60_FPS
     *
     * @param maximumFramerate Maximum framerate, e.g. 'MAX_30_FPS' (Outputs
     *            only)
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationMaximumFramerate
     */
    public ReservationResourceSpecification withMaximumFramerate(String maximumFramerate) {
        this.maximumFramerate = maximumFramerate;
        return this;
    }

    /**
     * Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_30_FPS, MAX_60_FPS
     *
     * @param maximumFramerate Maximum framerate, e.g. 'MAX_30_FPS' (Outputs
     *            only)
     * @see ReservationMaximumFramerate
     */
    public void setMaximumFramerate(ReservationMaximumFramerate maximumFramerate) {
        this.maximumFramerate = maximumFramerate.toString();
    }

    /**
     * Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAX_30_FPS, MAX_60_FPS
     *
     * @param maximumFramerate Maximum framerate, e.g. 'MAX_30_FPS' (Outputs
     *            only)
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationMaximumFramerate
     */
    public ReservationResourceSpecification withMaximumFramerate(
            ReservationMaximumFramerate maximumFramerate) {
        this.maximumFramerate = maximumFramerate.toString();
        return this;
    }

    /**
     * Resolution, e.g. 'HD'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SD, HD, FHD, UHD
     *
     * @return Resolution, e.g. 'HD'
     * @see ReservationResolution
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Resolution, e.g. 'HD'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SD, HD, FHD, UHD
     *
     * @param resolution Resolution, e.g. 'HD'
     * @see ReservationResolution
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * Resolution, e.g. 'HD'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SD, HD, FHD, UHD
     *
     * @param resolution Resolution, e.g. 'HD'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationResolution
     */
    public ReservationResourceSpecification withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * Resolution, e.g. 'HD'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SD, HD, FHD, UHD
     *
     * @param resolution Resolution, e.g. 'HD'
     * @see ReservationResolution
     */
    public void setResolution(ReservationResolution resolution) {
        this.resolution = resolution.toString();
    }

    /**
     * Resolution, e.g. 'HD'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SD, HD, FHD, UHD
     *
     * @param resolution Resolution, e.g. 'HD'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationResolution
     */
    public ReservationResourceSpecification withResolution(ReservationResolution resolution) {
        this.resolution = resolution.toString();
        return this;
    }

    /**
     * Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPUT, OUTPUT, MULTIPLEX, CHANNEL
     *
     * @return Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
     * @see ReservationResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPUT, OUTPUT, MULTIPLEX, CHANNEL
     *
     * @param resourceType Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or
     *            'CHANNEL'
     * @see ReservationResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPUT, OUTPUT, MULTIPLEX, CHANNEL
     *
     * @param resourceType Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or
     *            'CHANNEL'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationResourceType
     */
    public ReservationResourceSpecification withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPUT, OUTPUT, MULTIPLEX, CHANNEL
     *
     * @param resourceType Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or
     *            'CHANNEL'
     * @see ReservationResourceType
     */
    public void setResourceType(ReservationResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPUT, OUTPUT, MULTIPLEX, CHANNEL
     *
     * @param resourceType Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or
     *            'CHANNEL'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationResourceType
     */
    public ReservationResourceSpecification withResourceType(ReservationResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADVANCED_AUDIO, AUDIO_NORMALIZATION
     *
     * @return Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
     * @see ReservationSpecialFeature
     */
    public String getSpecialFeature() {
        return specialFeature;
    }

    /**
     * Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADVANCED_AUDIO, AUDIO_NORMALIZATION
     *
     * @param specialFeature Special feature, e.g. 'AUDIO_NORMALIZATION'
     *            (Channels only)
     * @see ReservationSpecialFeature
     */
    public void setSpecialFeature(String specialFeature) {
        this.specialFeature = specialFeature;
    }

    /**
     * Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADVANCED_AUDIO, AUDIO_NORMALIZATION
     *
     * @param specialFeature Special feature, e.g. 'AUDIO_NORMALIZATION'
     *            (Channels only)
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationSpecialFeature
     */
    public ReservationResourceSpecification withSpecialFeature(String specialFeature) {
        this.specialFeature = specialFeature;
        return this;
    }

    /**
     * Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADVANCED_AUDIO, AUDIO_NORMALIZATION
     *
     * @param specialFeature Special feature, e.g. 'AUDIO_NORMALIZATION'
     *            (Channels only)
     * @see ReservationSpecialFeature
     */
    public void setSpecialFeature(ReservationSpecialFeature specialFeature) {
        this.specialFeature = specialFeature.toString();
    }

    /**
     * Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADVANCED_AUDIO, AUDIO_NORMALIZATION
     *
     * @param specialFeature Special feature, e.g. 'AUDIO_NORMALIZATION'
     *            (Channels only)
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationSpecialFeature
     */
    public ReservationResourceSpecification withSpecialFeature(
            ReservationSpecialFeature specialFeature) {
        this.specialFeature = specialFeature.toString();
        return this;
    }

    /**
     * Video quality, e.g. 'STANDARD' (Outputs only)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, ENHANCED, PREMIUM
     *
     * @return Video quality, e.g. 'STANDARD' (Outputs only)
     * @see ReservationVideoQuality
     */
    public String getVideoQuality() {
        return videoQuality;
    }

    /**
     * Video quality, e.g. 'STANDARD' (Outputs only)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, ENHANCED, PREMIUM
     *
     * @param videoQuality Video quality, e.g. 'STANDARD' (Outputs only)
     * @see ReservationVideoQuality
     */
    public void setVideoQuality(String videoQuality) {
        this.videoQuality = videoQuality;
    }

    /**
     * Video quality, e.g. 'STANDARD' (Outputs only)
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, ENHANCED, PREMIUM
     *
     * @param videoQuality Video quality, e.g. 'STANDARD' (Outputs only)
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationVideoQuality
     */
    public ReservationResourceSpecification withVideoQuality(String videoQuality) {
        this.videoQuality = videoQuality;
        return this;
    }

    /**
     * Video quality, e.g. 'STANDARD' (Outputs only)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, ENHANCED, PREMIUM
     *
     * @param videoQuality Video quality, e.g. 'STANDARD' (Outputs only)
     * @see ReservationVideoQuality
     */
    public void setVideoQuality(ReservationVideoQuality videoQuality) {
        this.videoQuality = videoQuality.toString();
    }

    /**
     * Video quality, e.g. 'STANDARD' (Outputs only)
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, ENHANCED, PREMIUM
     *
     * @param videoQuality Video quality, e.g. 'STANDARD' (Outputs only)
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationVideoQuality
     */
    public ReservationResourceSpecification withVideoQuality(ReservationVideoQuality videoQuality) {
        this.videoQuality = videoQuality.toString();
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
        if (getChannelClass() != null)
            sb.append("ChannelClass: " + getChannelClass() + ",");
        if (getCodec() != null)
            sb.append("Codec: " + getCodec() + ",");
        if (getMaximumBitrate() != null)
            sb.append("MaximumBitrate: " + getMaximumBitrate() + ",");
        if (getMaximumFramerate() != null)
            sb.append("MaximumFramerate: " + getMaximumFramerate() + ",");
        if (getResolution() != null)
            sb.append("Resolution: " + getResolution() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getSpecialFeature() != null)
            sb.append("SpecialFeature: " + getSpecialFeature() + ",");
        if (getVideoQuality() != null)
            sb.append("VideoQuality: " + getVideoQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChannelClass() == null) ? 0 : getChannelClass().hashCode());
        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode
                + ((getMaximumBitrate() == null) ? 0 : getMaximumBitrate().hashCode());
        hashCode = prime * hashCode
                + ((getMaximumFramerate() == null) ? 0 : getMaximumFramerate().hashCode());
        hashCode = prime * hashCode + ((getResolution() == null) ? 0 : getResolution().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getSpecialFeature() == null) ? 0 : getSpecialFeature().hashCode());
        hashCode = prime * hashCode
                + ((getVideoQuality() == null) ? 0 : getVideoQuality().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationResourceSpecification == false)
            return false;
        ReservationResourceSpecification other = (ReservationResourceSpecification) obj;

        if (other.getChannelClass() == null ^ this.getChannelClass() == null)
            return false;
        if (other.getChannelClass() != null
                && other.getChannelClass().equals(this.getChannelClass()) == false)
            return false;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getMaximumBitrate() == null ^ this.getMaximumBitrate() == null)
            return false;
        if (other.getMaximumBitrate() != null
                && other.getMaximumBitrate().equals(this.getMaximumBitrate()) == false)
            return false;
        if (other.getMaximumFramerate() == null ^ this.getMaximumFramerate() == null)
            return false;
        if (other.getMaximumFramerate() != null
                && other.getMaximumFramerate().equals(this.getMaximumFramerate()) == false)
            return false;
        if (other.getResolution() == null ^ this.getResolution() == null)
            return false;
        if (other.getResolution() != null
                && other.getResolution().equals(this.getResolution()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSpecialFeature() == null ^ this.getSpecialFeature() == null)
            return false;
        if (other.getSpecialFeature() != null
                && other.getSpecialFeature().equals(this.getSpecialFeature()) == false)
            return false;
        if (other.getVideoQuality() == null ^ this.getVideoQuality() == null)
            return false;
        if (other.getVideoQuality() != null
                && other.getVideoQuality().equals(this.getVideoQuality()) == false)
            return false;
        return true;
    }
}
