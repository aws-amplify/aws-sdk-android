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
 * Provides a wrapper for the audio chunks that you are sending.
 * </p>
 */
public class AudioEvent implements Serializable {
    /**
     * <p>
     * An audio blob that contains the next part of the audio that you want to
     * transcribe.
     * </p>
     */
    private java.nio.ByteBuffer audioChunk;

    /**
     * <p>
     * An audio blob that contains the next part of the audio that you want to
     * transcribe.
     * </p>
     *
     * @return <p>
     *         An audio blob that contains the next part of the audio that you
     *         want to transcribe.
     *         </p>
     */
    public java.nio.ByteBuffer getAudioChunk() {
        return audioChunk;
    }

    /**
     * <p>
     * An audio blob that contains the next part of the audio that you want to
     * transcribe.
     * </p>
     *
     * @param audioChunk <p>
     *            An audio blob that contains the next part of the audio that
     *            you want to transcribe.
     *            </p>
     */
    public void setAudioChunk(java.nio.ByteBuffer audioChunk) {
        this.audioChunk = audioChunk;
    }

    /**
     * <p>
     * An audio blob that contains the next part of the audio that you want to
     * transcribe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioChunk <p>
     *            An audio blob that contains the next part of the audio that
     *            you want to transcribe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioEvent withAudioChunk(java.nio.ByteBuffer audioChunk) {
        this.audioChunk = audioChunk;
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
        if (getAudioChunk() != null)
            sb.append("AudioChunk: " + getAudioChunk());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioChunk() == null) ? 0 : getAudioChunk().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioEvent == false)
            return false;
        AudioEvent other = (AudioEvent) obj;

        if (other.getAudioChunk() == null ^ this.getAudioChunk() == null)
            return false;
        if (other.getAudioChunk() != null
                && other.getAudioChunk().equals(this.getAudioChunk()) == false)
            return false;
        return true;
    }
}
