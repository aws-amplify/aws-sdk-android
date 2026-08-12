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
 * Object describing redaction applied to the segment.
 * </p>
 */
public class RealTimeContactAnalysisTranscriptItemRedaction implements Serializable {
    /**
     * <p>
     * List of character intervals each describing a part of the text that was
     * redacted. For <code>OutputType.Raw</code>, part of the original text that
     * contains data that can be redacted. For <code> OutputType.Redacted</code>
     * , part of the string with redaction tag.
     * </p>
     */
    private java.util.List<RealTimeContactAnalysisCharacterInterval> characterOffsets;

    /**
     * <p>
     * List of character intervals each describing a part of the text that was
     * redacted. For <code>OutputType.Raw</code>, part of the original text that
     * contains data that can be redacted. For <code> OutputType.Redacted</code>
     * , part of the string with redaction tag.
     * </p>
     *
     * @return <p>
     *         List of character intervals each describing a part of the text
     *         that was redacted. For <code>OutputType.Raw</code>, part of the
     *         original text that contains data that can be redacted. For
     *         <code> OutputType.Redacted</code>, part of the string with
     *         redaction tag.
     *         </p>
     */
    public java.util.List<RealTimeContactAnalysisCharacterInterval> getCharacterOffsets() {
        return characterOffsets;
    }

    /**
     * <p>
     * List of character intervals each describing a part of the text that was
     * redacted. For <code>OutputType.Raw</code>, part of the original text that
     * contains data that can be redacted. For <code> OutputType.Redacted</code>
     * , part of the string with redaction tag.
     * </p>
     *
     * @param characterOffsets <p>
     *            List of character intervals each describing a part of the text
     *            that was redacted. For <code>OutputType.Raw</code>, part of
     *            the original text that contains data that can be redacted. For
     *            <code> OutputType.Redacted</code>, part of the string with
     *            redaction tag.
     *            </p>
     */
    public void setCharacterOffsets(
            java.util.Collection<RealTimeContactAnalysisCharacterInterval> characterOffsets) {
        if (characterOffsets == null) {
            this.characterOffsets = null;
            return;
        }

        this.characterOffsets = new java.util.ArrayList<RealTimeContactAnalysisCharacterInterval>(
                characterOffsets);
    }

    /**
     * <p>
     * List of character intervals each describing a part of the text that was
     * redacted. For <code>OutputType.Raw</code>, part of the original text that
     * contains data that can be redacted. For <code> OutputType.Redacted</code>
     * , part of the string with redaction tag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param characterOffsets <p>
     *            List of character intervals each describing a part of the text
     *            that was redacted. For <code>OutputType.Raw</code>, part of
     *            the original text that contains data that can be redacted. For
     *            <code> OutputType.Redacted</code>, part of the string with
     *            redaction tag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisTranscriptItemRedaction withCharacterOffsets(
            RealTimeContactAnalysisCharacterInterval... characterOffsets) {
        if (getCharacterOffsets() == null) {
            this.characterOffsets = new java.util.ArrayList<RealTimeContactAnalysisCharacterInterval>(
                    characterOffsets.length);
        }
        for (RealTimeContactAnalysisCharacterInterval value : characterOffsets) {
            this.characterOffsets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of character intervals each describing a part of the text that was
     * redacted. For <code>OutputType.Raw</code>, part of the original text that
     * contains data that can be redacted. For <code> OutputType.Redacted</code>
     * , part of the string with redaction tag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param characterOffsets <p>
     *            List of character intervals each describing a part of the text
     *            that was redacted. For <code>OutputType.Raw</code>, part of
     *            the original text that contains data that can be redacted. For
     *            <code> OutputType.Redacted</code>, part of the string with
     *            redaction tag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisTranscriptItemRedaction withCharacterOffsets(
            java.util.Collection<RealTimeContactAnalysisCharacterInterval> characterOffsets) {
        setCharacterOffsets(characterOffsets);
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
        if (getCharacterOffsets() != null)
            sb.append("CharacterOffsets: " + getCharacterOffsets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCharacterOffsets() == null) ? 0 : getCharacterOffsets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeContactAnalysisTranscriptItemRedaction == false)
            return false;
        RealTimeContactAnalysisTranscriptItemRedaction other = (RealTimeContactAnalysisTranscriptItemRedaction) obj;

        if (other.getCharacterOffsets() == null ^ this.getCharacterOffsets() == null)
            return false;
        if (other.getCharacterOffsets() != null
                && other.getCharacterOffsets().equals(this.getCharacterOffsets()) == false)
            return false;
        return true;
    }
}
