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
 * Audio Track
 */
public class AudioTrack implements Serializable {
    /**
     * 1-based integer value that maps to a specific audio track
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer track;

    /**
     * 1-based integer value that maps to a specific audio track
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return 1-based integer value that maps to a specific audio track
     */
    public Integer getTrack() {
        return track;
    }

    /**
     * 1-based integer value that maps to a specific audio track
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param track 1-based integer value that maps to a specific audio track
     */
    public void setTrack(Integer track) {
        this.track = track;
    }

    /**
     * 1-based integer value that maps to a specific audio track
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param track 1-based integer value that maps to a specific audio track
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioTrack withTrack(Integer track) {
        this.track = track;
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
        if (getTrack() != null)
            sb.append("Track: " + getTrack());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrack() == null) ? 0 : getTrack().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioTrack == false)
            return false;
        AudioTrack other = (AudioTrack) obj;

        if (other.getTrack() == null ^ this.getTrack() == null)
            return false;
        if (other.getTrack() != null && other.getTrack().equals(this.getTrack()) == false)
            return false;
        return true;
    }
}
