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
 * Audio Language Selection
 */
public class AudioLanguageSelection implements Serializable {
    /**
     * Selects a specific three-letter language code from within an audio
     * source.
     */
    private String languageCode;

    /**
     * When set to "strict", the transport stream demux strictly identifies
     * audio streams by their language descriptor. If a PMT update occurs such
     * that an audio stream matching the initially selected language is no
     * longer present then mute will be encoded until the language returns. If
     * "loose", then on a PMT update the demux will choose another audio stream
     * in the program with the same stream type if it can't find one with the
     * same language.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOOSE, STRICT
     */
    private String languageSelectionPolicy;

    /**
     * Selects a specific three-letter language code from within an audio
     * source.
     *
     * @return Selects a specific three-letter language code from within an
     *         audio source.
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Selects a specific three-letter language code from within an audio
     * source.
     *
     * @param languageCode Selects a specific three-letter language code from
     *            within an audio source.
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Selects a specific three-letter language code from within an audio
     * source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageCode Selects a specific three-letter language code from
     *            within an audio source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AudioLanguageSelection withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * When set to "strict", the transport stream demux strictly identifies
     * audio streams by their language descriptor. If a PMT update occurs such
     * that an audio stream matching the initially selected language is no
     * longer present then mute will be encoded until the language returns. If
     * "loose", then on a PMT update the demux will choose another audio stream
     * in the program with the same stream type if it can't find one with the
     * same language.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOOSE, STRICT
     *
     * @return When set to "strict", the transport stream demux strictly
     *         identifies audio streams by their language descriptor. If a PMT
     *         update occurs such that an audio stream matching the initially
     *         selected language is no longer present then mute will be encoded
     *         until the language returns. If "loose", then on a PMT update the
     *         demux will choose another audio stream in the program with the
     *         same stream type if it can't find one with the same language.
     * @see AudioLanguageSelectionPolicy
     */
    public String getLanguageSelectionPolicy() {
        return languageSelectionPolicy;
    }

    /**
     * When set to "strict", the transport stream demux strictly identifies
     * audio streams by their language descriptor. If a PMT update occurs such
     * that an audio stream matching the initially selected language is no
     * longer present then mute will be encoded until the language returns. If
     * "loose", then on a PMT update the demux will choose another audio stream
     * in the program with the same stream type if it can't find one with the
     * same language.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOOSE, STRICT
     *
     * @param languageSelectionPolicy When set to "strict", the transport stream
     *            demux strictly identifies audio streams by their language
     *            descriptor. If a PMT update occurs such that an audio stream
     *            matching the initially selected language is no longer present
     *            then mute will be encoded until the language returns. If
     *            "loose", then on a PMT update the demux will choose another
     *            audio stream in the program with the same stream type if it
     *            can't find one with the same language.
     * @see AudioLanguageSelectionPolicy
     */
    public void setLanguageSelectionPolicy(String languageSelectionPolicy) {
        this.languageSelectionPolicy = languageSelectionPolicy;
    }

    /**
     * When set to "strict", the transport stream demux strictly identifies
     * audio streams by their language descriptor. If a PMT update occurs such
     * that an audio stream matching the initially selected language is no
     * longer present then mute will be encoded until the language returns. If
     * "loose", then on a PMT update the demux will choose another audio stream
     * in the program with the same stream type if it can't find one with the
     * same language.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOOSE, STRICT
     *
     * @param languageSelectionPolicy When set to "strict", the transport stream
     *            demux strictly identifies audio streams by their language
     *            descriptor. If a PMT update occurs such that an audio stream
     *            matching the initially selected language is no longer present
     *            then mute will be encoded until the language returns. If
     *            "loose", then on a PMT update the demux will choose another
     *            audio stream in the program with the same stream type if it
     *            can't find one with the same language.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioLanguageSelectionPolicy
     */
    public AudioLanguageSelection withLanguageSelectionPolicy(String languageSelectionPolicy) {
        this.languageSelectionPolicy = languageSelectionPolicy;
        return this;
    }

    /**
     * When set to "strict", the transport stream demux strictly identifies
     * audio streams by their language descriptor. If a PMT update occurs such
     * that an audio stream matching the initially selected language is no
     * longer present then mute will be encoded until the language returns. If
     * "loose", then on a PMT update the demux will choose another audio stream
     * in the program with the same stream type if it can't find one with the
     * same language.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOOSE, STRICT
     *
     * @param languageSelectionPolicy When set to "strict", the transport stream
     *            demux strictly identifies audio streams by their language
     *            descriptor. If a PMT update occurs such that an audio stream
     *            matching the initially selected language is no longer present
     *            then mute will be encoded until the language returns. If
     *            "loose", then on a PMT update the demux will choose another
     *            audio stream in the program with the same stream type if it
     *            can't find one with the same language.
     * @see AudioLanguageSelectionPolicy
     */
    public void setLanguageSelectionPolicy(AudioLanguageSelectionPolicy languageSelectionPolicy) {
        this.languageSelectionPolicy = languageSelectionPolicy.toString();
    }

    /**
     * When set to "strict", the transport stream demux strictly identifies
     * audio streams by their language descriptor. If a PMT update occurs such
     * that an audio stream matching the initially selected language is no
     * longer present then mute will be encoded until the language returns. If
     * "loose", then on a PMT update the demux will choose another audio stream
     * in the program with the same stream type if it can't find one with the
     * same language.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LOOSE, STRICT
     *
     * @param languageSelectionPolicy When set to "strict", the transport stream
     *            demux strictly identifies audio streams by their language
     *            descriptor. If a PMT update occurs such that an audio stream
     *            matching the initially selected language is no longer present
     *            then mute will be encoded until the language returns. If
     *            "loose", then on a PMT update the demux will choose another
     *            audio stream in the program with the same stream type if it
     *            can't find one with the same language.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AudioLanguageSelectionPolicy
     */
    public AudioLanguageSelection withLanguageSelectionPolicy(
            AudioLanguageSelectionPolicy languageSelectionPolicy) {
        this.languageSelectionPolicy = languageSelectionPolicy.toString();
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getLanguageSelectionPolicy() != null)
            sb.append("LanguageSelectionPolicy: " + getLanguageSelectionPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getLanguageSelectionPolicy() == null) ? 0 : getLanguageSelectionPolicy()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioLanguageSelection == false)
            return false;
        AudioLanguageSelection other = (AudioLanguageSelection) obj;

        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLanguageSelectionPolicy() == null ^ this.getLanguageSelectionPolicy() == null)
            return false;
        if (other.getLanguageSelectionPolicy() != null
                && other.getLanguageSelectionPolicy().equals(this.getLanguageSelectionPolicy()) == false)
            return false;
        return true;
    }
}
