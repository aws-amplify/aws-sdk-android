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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * List purchased reservations.
 */
public class ListReservationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
     */
    private String channelClass;

    /**
     * Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
     */
    private String codec;

    /**
     * Placeholder documentation for MaxResults
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
     */
    private String maximumBitrate;

    /**
     * Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
     */
    private String maximumFramerate;

    /**
     * Placeholder documentation for __string
     */
    private String nextToken;

    /**
     * Filter by resolution, 'SD', 'HD', 'FHD', or 'UHD'
     */
    private String resolution;

    /**
     * Filter by resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
     */
    private String resourceType;

    /**
     * Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
     */
    private String specialFeature;

    /**
     * Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
     */
    private String videoQuality;

    /**
     * Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
     * 
     * @return Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
     */
    public String getChannelClass() {
        return channelClass;
    }

    /**
     * Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
     * 
     * @param channelClass Filter by channel class, 'STANDARD' or
     *            'SINGLE_PIPELINE'
     */
    public void setChannelClass(String channelClass) {
        this.channelClass = channelClass;
    }

    /**
     * Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE' <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channelClass Filter by channel class, 'STANDARD' or
     *            'SINGLE_PIPELINE' @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReservationsRequest withChannelClass(String channelClass) {
        this.channelClass = channelClass;
        return this;
    }

    /**
     * Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
     *
     * @return Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
     */
    public String getCodec() {
        return codec;
    }

    /**
     * Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
     *
     * @param codec Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
     */
    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codec Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReservationsRequest withCodec(String codec) {
        this.codec = codec;
        return this;
    }

    /**
     * Placeholder documentation for MaxResults
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return Placeholder documentation for MaxResults
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Placeholder documentation for MaxResults
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults Placeholder documentation for MaxResults
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Placeholder documentation for MaxResults
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults Placeholder documentation for MaxResults
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReservationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
     * 
     * @return Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
     */
    public String getMaximumBitrate() {
        return maximumBitrate;
    }

    /**
     * Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
     * 
     * @param maximumBitrate Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or
     *            'MAX_50_MBPS'
     */
    public void setMaximumBitrate(String maximumBitrate) {
        this.maximumBitrate = maximumBitrate;
    }

    /**
     * Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS' <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximumBitrate Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or
     *            'MAX_50_MBPS' @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReservationsRequest withMaximumBitrate(String maximumBitrate) {
        this.maximumBitrate = maximumBitrate;
        return this;
    }

    /**
     * Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
     *
     * @return Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
     */
    public String getMaximumFramerate() {
        return maximumFramerate;
    }

    /**
     * Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
     *
     * @param maximumFramerate Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
     */
    public void setMaximumFramerate(String maximumFramerate) {
        this.maximumFramerate = maximumFramerate;
    }

    /**
     * Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximumFramerate Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReservationsRequest withMaximumFramerate(String maximumFramerate) {
        this.maximumFramerate = maximumFramerate;
        return this;
    }

    /**
     * Placeholder documentation for __string
     *
     * @return Placeholder documentation for __string
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Placeholder documentation for __string
     *
     * @param nextToken Placeholder documentation for __string
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Placeholder documentation for __string
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken Placeholder documentation for __string
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReservationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Filter by resolution, 'SD', 'HD', 'FHD', or 'UHD'
     *
     * @return Filter by resolution, 'SD', 'HD', 'FHD', or 'UHD'
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Filter by resolution, 'SD', 'HD', 'FHD', or 'UHD'
     *
     * @param resolution Filter by resolution, 'SD', 'HD', 'FHD', or 'UHD'
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * Filter by resolution, 'SD', 'HD', 'FHD', or 'UHD'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resolution Filter by resolution, 'SD', 'HD', 'FHD', or 'UHD'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReservationsRequest withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * Filter by resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
     *
     * @return Filter by resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or
     *         'CHANNEL'
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Filter by resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
     *
     * @param resourceType Filter by resource type, 'INPUT', 'OUTPUT',
     *            'MULTIPLEX', or 'CHANNEL'
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Filter by resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceType Filter by resource type, 'INPUT', 'OUTPUT',
     *            'MULTIPLEX', or 'CHANNEL'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReservationsRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
     * 
     * @return Filter by special feature, 'ADVANCED_AUDIO' or
     *         'AUDIO_NORMALIZATION'
     */
    public String getSpecialFeature() {
        return specialFeature;
    }

    /**
     * Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
     * 
     * @param specialFeature Filter by special feature, 'ADVANCED_AUDIO' or
     *            'AUDIO_NORMALIZATION'
     */
    public void setSpecialFeature(String specialFeature) {
        this.specialFeature = specialFeature;
    }

    /**
     * Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION' <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param specialFeature Filter by special feature, 'ADVANCED_AUDIO' or
     *            'AUDIO_NORMALIZATION' @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReservationsRequest withSpecialFeature(String specialFeature) {
        this.specialFeature = specialFeature;
        return this;
    }

    /**
     * Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
     * 
     * @return Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
     */
    public String getVideoQuality() {
        return videoQuality;
    }

    /**
     * Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
     * 
     * @param videoQuality Filter by video quality, 'STANDARD', 'ENHANCED', or
     *            'PREMIUM'
     */
    public void setVideoQuality(String videoQuality) {
        this.videoQuality = videoQuality;
    }

    /**
     * Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM' <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoQuality Filter by video quality, 'STANDARD', 'ENHANCED', or
     *            'PREMIUM' @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReservationsRequest withVideoQuality(String videoQuality) {
        this.videoQuality = videoQuality;
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
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getMaximumBitrate() != null)
            sb.append("MaximumBitrate: " + getMaximumBitrate() + ",");
        if (getMaximumFramerate() != null)
            sb.append("MaximumFramerate: " + getMaximumFramerate() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
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
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getMaximumBitrate() == null) ? 0 : getMaximumBitrate().hashCode());
        hashCode = prime * hashCode
                + ((getMaximumFramerate() == null) ? 0 : getMaximumFramerate().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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

        if (obj instanceof ListReservationsRequest == false)
            return false;
        ListReservationsRequest other = (ListReservationsRequest) obj;

        if (other.getChannelClass() == null ^ this.getChannelClass() == null)
            return false;
        if (other.getChannelClass() != null
                && other.getChannelClass().equals(this.getChannelClass()) == false)
            return false;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
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
