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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a video that Amazon Rekognition analyzed.
 * <code>Videometadata</code> is returned in every page of paginated responses
 * from a Amazon Rekognition video operation.
 * </p>
 */
public class VideoMetadata implements Serializable {
    /**
     * <p>
     * Type of compression used in the analyzed video.
     * </p>
     */
    private String codec;

    /**
     * <p>
     * Length of the video in milliseconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long durationMillis;

    /**
     * <p>
     * Format of the analyzed video. Possible values are MP4, MOV and AVI.
     * </p>
     */
    private String format;

    /**
     * <p>
     * Number of frames per second in the video.
     * </p>
     */
    private Float frameRate;

    /**
     * <p>
     * Vertical pixel dimension of the video.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long frameHeight;

    /**
     * <p>
     * Horizontal pixel dimension of the video.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long frameWidth;

    /**
     * The new value for the rotation property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer rotation;

    /**
     * <p>
     * Type of compression used in the analyzed video.
     * </p>
     *
     * @return <p>
     *         Type of compression used in the analyzed video.
     *         </p>
     */
    public String getCodec() {
        return codec;
    }

    /**
     * <p>
     * Type of compression used in the analyzed video.
     * </p>
     *
     * @param codec <p>
     *            Type of compression used in the analyzed video.
     *            </p>
     */
    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * <p>
     * Type of compression used in the analyzed video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codec <p>
     *            Type of compression used in the analyzed video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoMetadata withCodec(String codec) {
        this.codec = codec;
        return this;
    }

    /**
     * <p>
     * Length of the video in milliseconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Length of the video in milliseconds.
     *         </p>
     */
    public Long getDurationMillis() {
        return durationMillis;
    }

    /**
     * <p>
     * Length of the video in milliseconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationMillis <p>
     *            Length of the video in milliseconds.
     *            </p>
     */
    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }

    /**
     * <p>
     * Length of the video in milliseconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationMillis <p>
     *            Length of the video in milliseconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoMetadata withDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
        return this;
    }

    /**
     * <p>
     * Format of the analyzed video. Possible values are MP4, MOV and AVI.
     * </p>
     *
     * @return <p>
     *         Format of the analyzed video. Possible values are MP4, MOV and
     *         AVI.
     *         </p>
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * Format of the analyzed video. Possible values are MP4, MOV and AVI.
     * </p>
     *
     * @param format <p>
     *            Format of the analyzed video. Possible values are MP4, MOV and
     *            AVI.
     *            </p>
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * Format of the analyzed video. Possible values are MP4, MOV and AVI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param format <p>
     *            Format of the analyzed video. Possible values are MP4, MOV and
     *            AVI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoMetadata withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * Number of frames per second in the video.
     * </p>
     *
     * @return <p>
     *         Number of frames per second in the video.
     *         </p>
     */
    public Float getFrameRate() {
        return frameRate;
    }

    /**
     * <p>
     * Number of frames per second in the video.
     * </p>
     *
     * @param frameRate <p>
     *            Number of frames per second in the video.
     *            </p>
     */
    public void setFrameRate(Float frameRate) {
        this.frameRate = frameRate;
    }

    /**
     * <p>
     * Number of frames per second in the video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param frameRate <p>
     *            Number of frames per second in the video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoMetadata withFrameRate(Float frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * <p>
     * Vertical pixel dimension of the video.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Vertical pixel dimension of the video.
     *         </p>
     */
    public Long getFrameHeight() {
        return frameHeight;
    }

    /**
     * <p>
     * Vertical pixel dimension of the video.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param frameHeight <p>
     *            Vertical pixel dimension of the video.
     *            </p>
     */
    public void setFrameHeight(Long frameHeight) {
        this.frameHeight = frameHeight;
    }

    /**
     * <p>
     * Vertical pixel dimension of the video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param frameHeight <p>
     *            Vertical pixel dimension of the video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoMetadata withFrameHeight(Long frameHeight) {
        this.frameHeight = frameHeight;
        return this;
    }

    /**
     * <p>
     * Horizontal pixel dimension of the video.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Horizontal pixel dimension of the video.
     *         </p>
     */
    public Long getFrameWidth() {
        return frameWidth;
    }

    /**
     * <p>
     * Horizontal pixel dimension of the video.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param frameWidth <p>
     *            Horizontal pixel dimension of the video.
     *            </p>
     */
    public void setFrameWidth(Long frameWidth) {
        this.frameWidth = frameWidth;
    }

    /**
     * <p>
     * Horizontal pixel dimension of the video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param frameWidth <p>
     *            Horizontal pixel dimension of the video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoMetadata withFrameWidth(Long frameWidth) {
        this.frameWidth = frameWidth;
        return this;
    }

    /**
     * Returns the value of the rotation property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The value of the rotation property for this object.
     */
    public Integer getRotation() {
        return rotation;
    }

    /**
     * Sets the value of rotation
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param rotation The new value for the rotation property for this object.
     */
    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    /**
     * Sets the value of the rotation property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param rotation The new value for the rotation property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoMetadata withRotation(Integer rotation) {
        this.rotation = rotation;
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
        if (getCodec() != null)
            sb.append("Codec: " + getCodec() + ",");
        if (getDurationMillis() != null)
            sb.append("DurationMillis: " + getDurationMillis() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat() + ",");
        if (getFrameRate() != null)
            sb.append("FrameRate: " + getFrameRate() + ",");
        if (getFrameHeight() != null)
            sb.append("FrameHeight: " + getFrameHeight() + ",");
        if (getFrameWidth() != null)
            sb.append("FrameWidth: " + getFrameWidth() + ",");
        if (getRotation() != null)
            sb.append("Rotation: " + getRotation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode
                + ((getDurationMillis() == null) ? 0 : getDurationMillis().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getFrameRate() == null) ? 0 : getFrameRate().hashCode());
        hashCode = prime * hashCode
                + ((getFrameHeight() == null) ? 0 : getFrameHeight().hashCode());
        hashCode = prime * hashCode + ((getFrameWidth() == null) ? 0 : getFrameWidth().hashCode());
        hashCode = prime * hashCode + ((getRotation() == null) ? 0 : getRotation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoMetadata == false)
            return false;
        VideoMetadata other = (VideoMetadata) obj;

        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getDurationMillis() == null ^ this.getDurationMillis() == null)
            return false;
        if (other.getDurationMillis() != null
                && other.getDurationMillis().equals(this.getDurationMillis()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getFrameRate() == null ^ this.getFrameRate() == null)
            return false;
        if (other.getFrameRate() != null
                && other.getFrameRate().equals(this.getFrameRate()) == false)
            return false;
        if (other.getFrameHeight() == null ^ this.getFrameHeight() == null)
            return false;
        if (other.getFrameHeight() != null
                && other.getFrameHeight().equals(this.getFrameHeight()) == false)
            return false;
        if (other.getFrameWidth() == null ^ this.getFrameWidth() == null)
            return false;
        if (other.getFrameWidth() != null
                && other.getFrameWidth().equals(this.getFrameWidth()) == false)
            return false;
        if (other.getRotation() == null ^ this.getRotation() == null)
            return false;
        if (other.getRotation() != null && other.getRotation().equals(this.getRotation()) == false)
            return false;
        return true;
    }
}
