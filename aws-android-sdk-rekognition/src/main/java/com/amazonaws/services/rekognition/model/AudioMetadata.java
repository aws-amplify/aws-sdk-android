/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Metadata information about an audio stream. An array of
 * <code>AudioMetadata</code> objects for the audio streams found in a stored
 * video is returned by <a>GetSegmentDetection</a>.
 * </p>
 */
public class AudioMetadata implements Serializable {
    /**
     * <p>
     * The audio codec used to encode or decode the audio stream.
     * </p>
     */
    private String codec;

    /**
     * <p>
     * The duration of the audio stream in milliseconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long durationMillis;

    /**
     * <p>
     * The sample rate for the audio stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long sampleRate;

    /**
     * <p>
     * The number of audio channels in the segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long numberOfChannels;

    /**
     * <p>
     * The audio codec used to encode or decode the audio stream.
     * </p>
     *
     * @return <p>
     *         The audio codec used to encode or decode the audio stream.
     *         </p>
     */
    public String getCodec() {
        return codec;
    }

    /**
     * <p>
     * The audio codec used to encode or decode the audio stream.
     * </p>
     *
     * @param codec <p>
     *            The audio codec used to encode or decode the audio stream.
     *            </p>
     */
    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * <p>
     * The audio codec used to encode or decode the audio stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codec <p>
     *            The audio codec used to encode or decode the audio stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioMetadata withCodec(String codec) {
        this.codec = codec;
        return this;
    }

    /**
     * <p>
     * The duration of the audio stream in milliseconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The duration of the audio stream in milliseconds.
     *         </p>
     */
    public Long getDurationMillis() {
        return durationMillis;
    }

    /**
     * <p>
     * The duration of the audio stream in milliseconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationMillis <p>
     *            The duration of the audio stream in milliseconds.
     *            </p>
     */
    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }

    /**
     * <p>
     * The duration of the audio stream in milliseconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param durationMillis <p>
     *            The duration of the audio stream in milliseconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioMetadata withDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
        return this;
    }

    /**
     * <p>
     * The sample rate for the audio stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The sample rate for the audio stream.
     *         </p>
     */
    public Long getSampleRate() {
        return sampleRate;
    }

    /**
     * <p>
     * The sample rate for the audio stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param sampleRate <p>
     *            The sample rate for the audio stream.
     *            </p>
     */
    public void setSampleRate(Long sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * <p>
     * The sample rate for the audio stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param sampleRate <p>
     *            The sample rate for the audio stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioMetadata withSampleRate(Long sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    /**
     * <p>
     * The number of audio channels in the segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of audio channels in the segment.
     *         </p>
     */
    public Long getNumberOfChannels() {
        return numberOfChannels;
    }

    /**
     * <p>
     * The number of audio channels in the segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfChannels <p>
     *            The number of audio channels in the segment.
     *            </p>
     */
    public void setNumberOfChannels(Long numberOfChannels) {
        this.numberOfChannels = numberOfChannels;
    }

    /**
     * <p>
     * The number of audio channels in the segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param numberOfChannels <p>
     *            The number of audio channels in the segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioMetadata withNumberOfChannels(Long numberOfChannels) {
        this.numberOfChannels = numberOfChannels;
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
        if (getSampleRate() != null)
            sb.append("SampleRate: " + getSampleRate() + ",");
        if (getNumberOfChannels() != null)
            sb.append("NumberOfChannels: " + getNumberOfChannels());
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
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfChannels() == null) ? 0 : getNumberOfChannels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioMetadata == false)
            return false;
        AudioMetadata other = (AudioMetadata) obj;

        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getDurationMillis() == null ^ this.getDurationMillis() == null)
            return false;
        if (other.getDurationMillis() != null
                && other.getDurationMillis().equals(this.getDurationMillis()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null
                && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getNumberOfChannels() == null ^ this.getNumberOfChannels() == null)
            return false;
        if (other.getNumberOfChannels() != null
                && other.getNumberOfChannels().equals(this.getNumberOfChannels()) == false)
            return false;
        return true;
    }
}
