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

package com.amazonaws.services.amazontranscribestreamingservice.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the audio stream from your application to Amazon Transcribe.
 * </p>
 */
public class AudioStream implements Serializable {
    /**
     * <p>
     * A blob of audio from your application. You audio stream consists of one
     * or more audio events.
     * </p>
     */
    private AudioEvent audioEvent;

    /**
     * <p>
     * A blob of audio from your application. You audio stream consists of one
     * or more audio events.
     * </p>
     *
     * @return <p>
     *         A blob of audio from your application. You audio stream consists
     *         of one or more audio events.
     *         </p>
     */
    public AudioEvent getAudioEvent() {
        return audioEvent;
    }

    /**
     * <p>
     * A blob of audio from your application. You audio stream consists of one
     * or more audio events.
     * </p>
     *
     * @param audioEvent <p>
     *            A blob of audio from your application. You audio stream
     *            consists of one or more audio events.
     *            </p>
     */
    public void setAudioEvent(AudioEvent audioEvent) {
        this.audioEvent = audioEvent;
    }

    /**
     * <p>
     * A blob of audio from your application. You audio stream consists of one
     * or more audio events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioEvent <p>
     *            A blob of audio from your application. You audio stream
     *            consists of one or more audio events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioStream withAudioEvent(AudioEvent audioEvent) {
        this.audioEvent = audioEvent;
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
        if (getAudioEvent() != null)
            sb.append("AudioEvent: " + getAudioEvent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioEvent() == null) ? 0 : getAudioEvent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioStream == false)
            return false;
        AudioStream other = (AudioStream) obj;

        if (other.getAudioEvent() == null ^ this.getAudioEvent() == null)
            return false;
        if (other.getAudioEvent() != null
                && other.getAudioEvent().equals(this.getAudioEvent()) == false)
            return false;
        return true;
    }
}
