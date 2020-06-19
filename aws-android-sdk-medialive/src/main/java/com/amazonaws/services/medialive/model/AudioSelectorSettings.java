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
 * Audio Selector Settings
 */
public class AudioSelectorSettings implements Serializable {
    /**
     * Audio Language Selection
     */
    private AudioLanguageSelection audioLanguageSelection;

    /**
     * Audio Pid Selection
     */
    private AudioPidSelection audioPidSelection;

    /**
     * Audio Track Selection
     */
    private AudioTrackSelection audioTrackSelection;

    /**
     * Audio Language Selection
     *
     * @return Audio Language Selection
     */
    public AudioLanguageSelection getAudioLanguageSelection() {
        return audioLanguageSelection;
    }

    /**
     * Audio Language Selection
     *
     * @param audioLanguageSelection Audio Language Selection
     */
    public void setAudioLanguageSelection(AudioLanguageSelection audioLanguageSelection) {
        this.audioLanguageSelection = audioLanguageSelection;
    }

    /**
     * Audio Language Selection
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioLanguageSelection Audio Language Selection
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioSelectorSettings withAudioLanguageSelection(
            AudioLanguageSelection audioLanguageSelection) {
        this.audioLanguageSelection = audioLanguageSelection;
        return this;
    }

    /**
     * Audio Pid Selection
     *
     * @return Audio Pid Selection
     */
    public AudioPidSelection getAudioPidSelection() {
        return audioPidSelection;
    }

    /**
     * Audio Pid Selection
     *
     * @param audioPidSelection Audio Pid Selection
     */
    public void setAudioPidSelection(AudioPidSelection audioPidSelection) {
        this.audioPidSelection = audioPidSelection;
    }

    /**
     * Audio Pid Selection
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioPidSelection Audio Pid Selection
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioSelectorSettings withAudioPidSelection(AudioPidSelection audioPidSelection) {
        this.audioPidSelection = audioPidSelection;
        return this;
    }

    /**
     * Audio Track Selection
     *
     * @return Audio Track Selection
     */
    public AudioTrackSelection getAudioTrackSelection() {
        return audioTrackSelection;
    }

    /**
     * Audio Track Selection
     *
     * @param audioTrackSelection Audio Track Selection
     */
    public void setAudioTrackSelection(AudioTrackSelection audioTrackSelection) {
        this.audioTrackSelection = audioTrackSelection;
    }

    /**
     * Audio Track Selection
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioTrackSelection Audio Track Selection
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioSelectorSettings withAudioTrackSelection(AudioTrackSelection audioTrackSelection) {
        this.audioTrackSelection = audioTrackSelection;
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
        if (getAudioLanguageSelection() != null)
            sb.append("AudioLanguageSelection: " + getAudioLanguageSelection() + ",");
        if (getAudioPidSelection() != null)
            sb.append("AudioPidSelection: " + getAudioPidSelection() + ",");
        if (getAudioTrackSelection() != null)
            sb.append("AudioTrackSelection: " + getAudioTrackSelection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAudioLanguageSelection() == null) ? 0 : getAudioLanguageSelection()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAudioPidSelection() == null) ? 0 : getAudioPidSelection().hashCode());
        hashCode = prime * hashCode
                + ((getAudioTrackSelection() == null) ? 0 : getAudioTrackSelection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioSelectorSettings == false)
            return false;
        AudioSelectorSettings other = (AudioSelectorSettings) obj;

        if (other.getAudioLanguageSelection() == null ^ this.getAudioLanguageSelection() == null)
            return false;
        if (other.getAudioLanguageSelection() != null
                && other.getAudioLanguageSelection().equals(this.getAudioLanguageSelection()) == false)
            return false;
        if (other.getAudioPidSelection() == null ^ this.getAudioPidSelection() == null)
            return false;
        if (other.getAudioPidSelection() != null
                && other.getAudioPidSelection().equals(this.getAudioPidSelection()) == false)
            return false;
        if (other.getAudioTrackSelection() == null ^ this.getAudioTrackSelection() == null)
            return false;
        if (other.getAudioTrackSelection() != null
                && other.getAudioTrackSelection().equals(this.getAudioTrackSelection()) == false)
            return false;
        return true;
    }
}
