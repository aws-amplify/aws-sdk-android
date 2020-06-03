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
 * Group of Audio Selectors
 */
public class AudioSelectorGroup implements Serializable {
    /**
     * Name of an Audio Selector within the same input to include in the group.
     * Audio selector names are standardized, based on their order within the
     * input (e.g., "Audio Selector 1"). The audio selector name parameter can
     * be repeated to add any number of audio selectors to the group.
     */
    private java.util.List<String> audioSelectorNames;

    /**
     * Name of an Audio Selector within the same input to include in the group.
     * Audio selector names are standardized, based on their order within the
     * input (e.g., "Audio Selector 1"). The audio selector name parameter can
     * be repeated to add any number of audio selectors to the group.
     *
     * @return Name of an Audio Selector within the same input to include in the
     *         group. Audio selector names are standardized, based on their
     *         order within the input (e.g., "Audio Selector 1"). The audio
     *         selector name parameter can be repeated to add any number of
     *         audio selectors to the group.
     */
    public java.util.List<String> getAudioSelectorNames() {
        return audioSelectorNames;
    }

    /**
     * Name of an Audio Selector within the same input to include in the group.
     * Audio selector names are standardized, based on their order within the
     * input (e.g., "Audio Selector 1"). The audio selector name parameter can
     * be repeated to add any number of audio selectors to the group.
     *
     * @param audioSelectorNames Name of an Audio Selector within the same input
     *            to include in the group. Audio selector names are
     *            standardized, based on their order within the input (e.g.,
     *            "Audio Selector 1"). The audio selector name parameter can be
     *            repeated to add any number of audio selectors to the group.
     */
    public void setAudioSelectorNames(java.util.Collection<String> audioSelectorNames) {
        if (audioSelectorNames == null) {
            this.audioSelectorNames = null;
            return;
        }

        this.audioSelectorNames = new java.util.ArrayList<String>(audioSelectorNames);
    }

    /**
     * Name of an Audio Selector within the same input to include in the group.
     * Audio selector names are standardized, based on their order within the
     * input (e.g., "Audio Selector 1"). The audio selector name parameter can
     * be repeated to add any number of audio selectors to the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioSelectorNames Name of an Audio Selector within the same input
     *            to include in the group. Audio selector names are
     *            standardized, based on their order within the input (e.g.,
     *            "Audio Selector 1"). The audio selector name parameter can be
     *            repeated to add any number of audio selectors to the group.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioSelectorGroup withAudioSelectorNames(String... audioSelectorNames) {
        if (getAudioSelectorNames() == null) {
            this.audioSelectorNames = new java.util.ArrayList<String>(audioSelectorNames.length);
        }
        for (String value : audioSelectorNames) {
            this.audioSelectorNames.add(value);
        }
        return this;
    }

    /**
     * Name of an Audio Selector within the same input to include in the group.
     * Audio selector names are standardized, based on their order within the
     * input (e.g., "Audio Selector 1"). The audio selector name parameter can
     * be repeated to add any number of audio selectors to the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioSelectorNames Name of an Audio Selector within the same input
     *            to include in the group. Audio selector names are
     *            standardized, based on their order within the input (e.g.,
     *            "Audio Selector 1"). The audio selector name parameter can be
     *            repeated to add any number of audio selectors to the group.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioSelectorGroup withAudioSelectorNames(java.util.Collection<String> audioSelectorNames) {
        setAudioSelectorNames(audioSelectorNames);
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
        if (getAudioSelectorNames() != null)
            sb.append("AudioSelectorNames: " + getAudioSelectorNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAudioSelectorNames() == null) ? 0 : getAudioSelectorNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioSelectorGroup == false)
            return false;
        AudioSelectorGroup other = (AudioSelectorGroup) obj;

        if (other.getAudioSelectorNames() == null ^ this.getAudioSelectorNames() == null)
            return false;
        if (other.getAudioSelectorNames() != null
                && other.getAudioSelectorNames().equals(this.getAudioSelectorNames()) == false)
            return false;
        return true;
    }
}
