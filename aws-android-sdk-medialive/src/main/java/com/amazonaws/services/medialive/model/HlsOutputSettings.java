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
 * Hls Output Settings
 */
public class HlsOutputSettings implements Serializable {
    /**
     * Only applicable when this output is referencing an H.265 video
     * description. Specifies whether MP4 segments should be packaged as HEV1 or
     * HVC1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEV1, HVC1
     */
    private String h265PackagingType;

    /**
     * Settings regarding the underlying stream. These settings are different
     * for audio-only outputs.
     */
    private HlsSettings hlsSettings;

    /**
     * String concatenated to the end of the destination filename. Accepts
     * \"Format Identifiers\":#formatIdentifierParameters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nameModifier;

    /**
     * String concatenated to end of segment filenames.
     */
    private String segmentModifier;

    /**
     * Only applicable when this output is referencing an H.265 video
     * description. Specifies whether MP4 segments should be packaged as HEV1 or
     * HVC1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEV1, HVC1
     *
     * @return Only applicable when this output is referencing an H.265 video
     *         description. Specifies whether MP4 segments should be packaged as
     *         HEV1 or HVC1.
     * @see HlsH265PackagingType
     */
    public String getH265PackagingType() {
        return h265PackagingType;
    }

    /**
     * Only applicable when this output is referencing an H.265 video
     * description. Specifies whether MP4 segments should be packaged as HEV1 or
     * HVC1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEV1, HVC1
     *
     * @param h265PackagingType Only applicable when this output is referencing
     *            an H.265 video description. Specifies whether MP4 segments
     *            should be packaged as HEV1 or HVC1.
     * @see HlsH265PackagingType
     */
    public void setH265PackagingType(String h265PackagingType) {
        this.h265PackagingType = h265PackagingType;
    }

    /**
     * Only applicable when this output is referencing an H.265 video
     * description. Specifies whether MP4 segments should be packaged as HEV1 or
     * HVC1.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEV1, HVC1
     *
     * @param h265PackagingType Only applicable when this output is referencing
     *            an H.265 video description. Specifies whether MP4 segments
     *            should be packaged as HEV1 or HVC1.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsH265PackagingType
     */
    public HlsOutputSettings withH265PackagingType(String h265PackagingType) {
        this.h265PackagingType = h265PackagingType;
        return this;
    }

    /**
     * Only applicable when this output is referencing an H.265 video
     * description. Specifies whether MP4 segments should be packaged as HEV1 or
     * HVC1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEV1, HVC1
     *
     * @param h265PackagingType Only applicable when this output is referencing
     *            an H.265 video description. Specifies whether MP4 segments
     *            should be packaged as HEV1 or HVC1.
     * @see HlsH265PackagingType
     */
    public void setH265PackagingType(HlsH265PackagingType h265PackagingType) {
        this.h265PackagingType = h265PackagingType.toString();
    }

    /**
     * Only applicable when this output is referencing an H.265 video
     * description. Specifies whether MP4 segments should be packaged as HEV1 or
     * HVC1.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HEV1, HVC1
     *
     * @param h265PackagingType Only applicable when this output is referencing
     *            an H.265 video description. Specifies whether MP4 segments
     *            should be packaged as HEV1 or HVC1.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsH265PackagingType
     */
    public HlsOutputSettings withH265PackagingType(HlsH265PackagingType h265PackagingType) {
        this.h265PackagingType = h265PackagingType.toString();
        return this;
    }

    /**
     * Settings regarding the underlying stream. These settings are different
     * for audio-only outputs.
     *
     * @return Settings regarding the underlying stream. These settings are
     *         different for audio-only outputs.
     */
    public HlsSettings getHlsSettings() {
        return hlsSettings;
    }

    /**
     * Settings regarding the underlying stream. These settings are different
     * for audio-only outputs.
     *
     * @param hlsSettings Settings regarding the underlying stream. These
     *            settings are different for audio-only outputs.
     */
    public void setHlsSettings(HlsSettings hlsSettings) {
        this.hlsSettings = hlsSettings;
    }

    /**
     * Settings regarding the underlying stream. These settings are different
     * for audio-only outputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hlsSettings Settings regarding the underlying stream. These
     *            settings are different for audio-only outputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsOutputSettings withHlsSettings(HlsSettings hlsSettings) {
        this.hlsSettings = hlsSettings;
        return this;
    }

    /**
     * String concatenated to the end of the destination filename. Accepts
     * \"Format Identifiers\":#formatIdentifierParameters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return String concatenated to the end of the destination filename.
     *         Accepts \"Format Identifiers\":#formatIdentifierParameters.
     */
    public String getNameModifier() {
        return nameModifier;
    }

    /**
     * String concatenated to the end of the destination filename. Accepts
     * \"Format Identifiers\":#formatIdentifierParameters.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nameModifier String concatenated to the end of the destination
     *            filename. Accepts \"Format
     *            Identifiers\":#formatIdentifierParameters.
     */
    public void setNameModifier(String nameModifier) {
        this.nameModifier = nameModifier;
    }

    /**
     * String concatenated to the end of the destination filename. Accepts
     * \"Format Identifiers\":#formatIdentifierParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nameModifier String concatenated to the end of the destination
     *            filename. Accepts \"Format
     *            Identifiers\":#formatIdentifierParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsOutputSettings withNameModifier(String nameModifier) {
        this.nameModifier = nameModifier;
        return this;
    }

    /**
     * String concatenated to end of segment filenames.
     *
     * @return String concatenated to end of segment filenames.
     */
    public String getSegmentModifier() {
        return segmentModifier;
    }

    /**
     * String concatenated to end of segment filenames.
     *
     * @param segmentModifier String concatenated to end of segment filenames.
     */
    public void setSegmentModifier(String segmentModifier) {
        this.segmentModifier = segmentModifier;
    }

    /**
     * String concatenated to end of segment filenames.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentModifier String concatenated to end of segment filenames.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsOutputSettings withSegmentModifier(String segmentModifier) {
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
        if (getH265PackagingType() != null)
            sb.append("H265PackagingType: " + getH265PackagingType() + ",");
        if (getHlsSettings() != null)
            sb.append("HlsSettings: " + getHlsSettings() + ",");
        if (getNameModifier() != null)
            sb.append("NameModifier: " + getNameModifier() + ",");
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
                + ((getH265PackagingType() == null) ? 0 : getH265PackagingType().hashCode());
        hashCode = prime * hashCode
                + ((getHlsSettings() == null) ? 0 : getHlsSettings().hashCode());
        hashCode = prime * hashCode
                + ((getNameModifier() == null) ? 0 : getNameModifier().hashCode());
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

        if (obj instanceof HlsOutputSettings == false)
            return false;
        HlsOutputSettings other = (HlsOutputSettings) obj;

        if (other.getH265PackagingType() == null ^ this.getH265PackagingType() == null)
            return false;
        if (other.getH265PackagingType() != null
                && other.getH265PackagingType().equals(this.getH265PackagingType()) == false)
            return false;
        if (other.getHlsSettings() == null ^ this.getHlsSettings() == null)
            return false;
        if (other.getHlsSettings() != null
                && other.getHlsSettings().equals(this.getHlsSettings()) == false)
            return false;
        if (other.getNameModifier() == null ^ this.getNameModifier() == null)
            return false;
        if (other.getNameModifier() != null
                && other.getNameModifier().equals(this.getNameModifier()) == false)
            return false;
        if (other.getSegmentModifier() == null ^ this.getSegmentModifier() == null)
            return false;
        if (other.getSegmentModifier() != null
                && other.getSegmentModifier().equals(this.getSegmentModifier()) == false)
            return false;
        return true;
    }
}
