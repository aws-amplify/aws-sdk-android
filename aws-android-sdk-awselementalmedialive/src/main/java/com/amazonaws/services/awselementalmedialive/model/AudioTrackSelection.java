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
 * Audio Track Selection
 */
public class AudioTrackSelection implements Serializable {
    /**
     * Selects one or more unique audio tracks from within an mp4 source.
     */
    private java.util.List<AudioTrack> tracks;

    /**
     * Selects one or more unique audio tracks from within an mp4 source.
     *
     * @return Selects one or more unique audio tracks from within an mp4
     *         source.
     */
    public java.util.List<AudioTrack> getTracks() {
        return tracks;
    }

    /**
     * Selects one or more unique audio tracks from within an mp4 source.
     *
     * @param tracks Selects one or more unique audio tracks from within an mp4
     *            source.
     */
    public void setTracks(java.util.Collection<AudioTrack> tracks) {
        if (tracks == null) {
            this.tracks = null;
            return;
        }

        this.tracks = new java.util.ArrayList<AudioTrack>(tracks);
    }

    /**
     * Selects one or more unique audio tracks from within an mp4 source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tracks Selects one or more unique audio tracks from within an mp4
     *            source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioTrackSelection withTracks(AudioTrack... tracks) {
        if (getTracks() == null) {
            this.tracks = new java.util.ArrayList<AudioTrack>(tracks.length);
        }
        for (AudioTrack value : tracks) {
            this.tracks.add(value);
        }
        return this;
    }

    /**
     * Selects one or more unique audio tracks from within an mp4 source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tracks Selects one or more unique audio tracks from within an mp4
     *            source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioTrackSelection withTracks(java.util.Collection<AudioTrack> tracks) {
        setTracks(tracks);
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
        if (getTracks() != null)
            sb.append("Tracks: " + getTracks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTracks() == null) ? 0 : getTracks().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioTrackSelection == false)
            return false;
        AudioTrackSelection other = (AudioTrackSelection) obj;

        if (other.getTracks() == null ^ this.getTracks() == null)
            return false;
        if (other.getTracks() != null && other.getTracks().equals(this.getTracks()) == false)
            return false;
        return true;
    }
}
