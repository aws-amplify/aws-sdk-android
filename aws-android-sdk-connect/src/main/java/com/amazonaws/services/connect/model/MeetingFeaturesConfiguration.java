/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration settings of the features available to a meeting.
 * </p>
 */
public class MeetingFeaturesConfiguration implements Serializable {
    /**
     * <p>
     * The configuration settings for the audio features available to a meeting.
     * </p>
     */
    private AudioFeatures audio;

    /**
     * <p>
     * The configuration settings for the audio features available to a meeting.
     * </p>
     *
     * @return <p>
     *         The configuration settings for the audio features available to a
     *         meeting.
     *         </p>
     */
    public AudioFeatures getAudio() {
        return audio;
    }

    /**
     * <p>
     * The configuration settings for the audio features available to a meeting.
     * </p>
     *
     * @param audio <p>
     *            The configuration settings for the audio features available to
     *            a meeting.
     *            </p>
     */
    public void setAudio(AudioFeatures audio) {
        this.audio = audio;
    }

    /**
     * <p>
     * The configuration settings for the audio features available to a meeting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audio <p>
     *            The configuration settings for the audio features available to
     *            a meeting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MeetingFeaturesConfiguration withAudio(AudioFeatures audio) {
        this.audio = audio;
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
        if (getAudio() != null)
            sb.append("Audio: " + getAudio());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudio() == null) ? 0 : getAudio().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeetingFeaturesConfiguration == false)
            return false;
        MeetingFeaturesConfiguration other = (MeetingFeaturesConfiguration) obj;

        if (other.getAudio() == null ^ this.getAudio() == null)
            return false;
        if (other.getAudio() != null && other.getAudio().equals(this.getAudio()) == false)
            return false;
        return true;
    }
}
