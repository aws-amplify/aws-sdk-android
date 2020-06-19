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
 * Standard Hls Settings
 */
public class StandardHlsSettings implements Serializable {
    /**
     * List all the audio groups that are used with the video output stream.
     * Input all the audio GROUP-IDs that are associated to the video, separate
     * by ','.
     */
    private String audioRenditionSets;

    /**
     * Settings information for the .m3u8 container
     */
    private M3u8Settings m3u8Settings;

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
    public StandardHlsSettings withAudioRenditionSets(String audioRenditionSets) {
        this.audioRenditionSets = audioRenditionSets;
        return this;
    }

    /**
     * Settings information for the .m3u8 container
     *
     * @return Settings information for the .m3u8 container
     */
    public M3u8Settings getM3u8Settings() {
        return m3u8Settings;
    }

    /**
     * Settings information for the .m3u8 container
     *
     * @param m3u8Settings Settings information for the .m3u8 container
     */
    public void setM3u8Settings(M3u8Settings m3u8Settings) {
        this.m3u8Settings = m3u8Settings;
    }

    /**
     * Settings information for the .m3u8 container
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param m3u8Settings Settings information for the .m3u8 container
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StandardHlsSettings withM3u8Settings(M3u8Settings m3u8Settings) {
        this.m3u8Settings = m3u8Settings;
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
        if (getM3u8Settings() != null)
            sb.append("M3u8Settings: " + getM3u8Settings());
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
                + ((getM3u8Settings() == null) ? 0 : getM3u8Settings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StandardHlsSettings == false)
            return false;
        StandardHlsSettings other = (StandardHlsSettings) obj;

        if (other.getAudioRenditionSets() == null ^ this.getAudioRenditionSets() == null)
            return false;
        if (other.getAudioRenditionSets() != null
                && other.getAudioRenditionSets().equals(this.getAudioRenditionSets()) == false)
            return false;
        if (other.getM3u8Settings() == null ^ this.getM3u8Settings() == null)
            return false;
        if (other.getM3u8Settings() != null
                && other.getM3u8Settings().equals(this.getM3u8Settings()) == false)
            return false;
        return true;
    }
}
