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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Fmp4 Hls Settings
 */
public class Fmp4HlsSettings implements Serializable {
    /**
     * List all the audio groups that are used with the video output stream.
     * Input all the audio GROUP-IDs that are associated to the video, separate
     * by ','.
     */
    private String audioRenditionSets;

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be
     * detected in the input audio and an equivalent ID3 tag will be inserted in
     * the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     */
    private String nielsenId3Behavior;

    /**
     * When set to passthrough, timed metadata is passed through from input to
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     */
    private String timedMetadataBehavior;

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
    public Fmp4HlsSettings withAudioRenditionSets(String audioRenditionSets) {
        this.audioRenditionSets = audioRenditionSets;
        return this;
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be
     * detected in the input audio and an equivalent ID3 tag will be inserted in
     * the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @return If set to passthrough, Nielsen inaudible tones for media tracking
     *         will be detected in the input audio and an equivalent ID3 tag
     *         will be inserted in the output.
     * @see Fmp4NielsenId3Behavior
     */
    public String getNielsenId3Behavior() {
        return nielsenId3Behavior;
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be
     * detected in the input audio and an equivalent ID3 tag will be inserted in
     * the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param nielsenId3Behavior If set to passthrough, Nielsen inaudible tones
     *            for media tracking will be detected in the input audio and an
     *            equivalent ID3 tag will be inserted in the output.
     * @see Fmp4NielsenId3Behavior
     */
    public void setNielsenId3Behavior(String nielsenId3Behavior) {
        this.nielsenId3Behavior = nielsenId3Behavior;
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be
     * detected in the input audio and an equivalent ID3 tag will be inserted in
     * the output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param nielsenId3Behavior If set to passthrough, Nielsen inaudible tones
     *            for media tracking will be detected in the input audio and an
     *            equivalent ID3 tag will be inserted in the output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Fmp4NielsenId3Behavior
     */
    public Fmp4HlsSettings withNielsenId3Behavior(String nielsenId3Behavior) {
        this.nielsenId3Behavior = nielsenId3Behavior;
        return this;
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be
     * detected in the input audio and an equivalent ID3 tag will be inserted in
     * the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param nielsenId3Behavior If set to passthrough, Nielsen inaudible tones
     *            for media tracking will be detected in the input audio and an
     *            equivalent ID3 tag will be inserted in the output.
     * @see Fmp4NielsenId3Behavior
     */
    public void setNielsenId3Behavior(Fmp4NielsenId3Behavior nielsenId3Behavior) {
        this.nielsenId3Behavior = nielsenId3Behavior.toString();
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be
     * detected in the input audio and an equivalent ID3 tag will be inserted in
     * the output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param nielsenId3Behavior If set to passthrough, Nielsen inaudible tones
     *            for media tracking will be detected in the input audio and an
     *            equivalent ID3 tag will be inserted in the output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Fmp4NielsenId3Behavior
     */
    public Fmp4HlsSettings withNielsenId3Behavior(Fmp4NielsenId3Behavior nielsenId3Behavior) {
        this.nielsenId3Behavior = nielsenId3Behavior.toString();
        return this;
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @return When set to passthrough, timed metadata is passed through from
     *         input to output.
     * @see Fmp4TimedMetadataBehavior
     */
    public String getTimedMetadataBehavior() {
        return timedMetadataBehavior;
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param timedMetadataBehavior When set to passthrough, timed metadata is
     *            passed through from input to output.
     * @see Fmp4TimedMetadataBehavior
     */
    public void setTimedMetadataBehavior(String timedMetadataBehavior) {
        this.timedMetadataBehavior = timedMetadataBehavior;
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to
     * output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param timedMetadataBehavior When set to passthrough, timed metadata is
     *            passed through from input to output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Fmp4TimedMetadataBehavior
     */
    public Fmp4HlsSettings withTimedMetadataBehavior(String timedMetadataBehavior) {
        this.timedMetadataBehavior = timedMetadataBehavior;
        return this;
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param timedMetadataBehavior When set to passthrough, timed metadata is
     *            passed through from input to output.
     * @see Fmp4TimedMetadataBehavior
     */
    public void setTimedMetadataBehavior(Fmp4TimedMetadataBehavior timedMetadataBehavior) {
        this.timedMetadataBehavior = timedMetadataBehavior.toString();
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to
     * output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param timedMetadataBehavior When set to passthrough, timed metadata is
     *            passed through from input to output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Fmp4TimedMetadataBehavior
     */
    public Fmp4HlsSettings withTimedMetadataBehavior(Fmp4TimedMetadataBehavior timedMetadataBehavior) {
        this.timedMetadataBehavior = timedMetadataBehavior.toString();
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
        if (getAudioRenditionSets() != null)
            sb.append("AudioRenditionSets: " + getAudioRenditionSets() + ",");
        if (getNielsenId3Behavior() != null)
            sb.append("NielsenId3Behavior: " + getNielsenId3Behavior() + ",");
        if (getTimedMetadataBehavior() != null)
            sb.append("TimedMetadataBehavior: " + getTimedMetadataBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAudioRenditionSets() == null) ? 0 : getAudioRenditionSets().hashCode());
        hashCode = prime * hashCode
                + ((getNielsenId3Behavior() == null) ? 0 : getNielsenId3Behavior().hashCode());
        hashCode = prime
                * hashCode
                + ((getTimedMetadataBehavior() == null) ? 0 : getTimedMetadataBehavior().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Fmp4HlsSettings == false)
            return false;
        Fmp4HlsSettings other = (Fmp4HlsSettings) obj;

        if (other.getAudioRenditionSets() == null ^ this.getAudioRenditionSets() == null)
            return false;
        if (other.getAudioRenditionSets() != null
                && other.getAudioRenditionSets().equals(this.getAudioRenditionSets()) == false)
            return false;
        if (other.getNielsenId3Behavior() == null ^ this.getNielsenId3Behavior() == null)
            return false;
        if (other.getNielsenId3Behavior() != null
                && other.getNielsenId3Behavior().equals(this.getNielsenId3Behavior()) == false)
            return false;
        if (other.getTimedMetadataBehavior() == null ^ this.getTimedMetadataBehavior() == null)
            return false;
        if (other.getTimedMetadataBehavior() != null
                && other.getTimedMetadataBehavior().equals(this.getTimedMetadataBehavior()) == false)
            return false;
        return true;
    }
}
