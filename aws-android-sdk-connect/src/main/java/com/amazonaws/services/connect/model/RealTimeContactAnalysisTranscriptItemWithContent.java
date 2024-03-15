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
 * Transcript representation containing Id, Content and list of character
 * intervals that are associated with analysis data. For example, this object
 * within an issue detected would describe both content that contains identified
 * issue and intervals where that content is taken from.
 * </p>
 */
public class RealTimeContactAnalysisTranscriptItemWithContent implements Serializable {
    /**
     * <p>
     * Part of the transcript content that contains identified issue. Can be
     * redacted
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     */
    private String content;

    /**
     * <p>
     * Transcript identifier. Matches the identifier from one of the
     * TranscriptSegments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String id;

    /**
     * <p>
     * Begin and end offsets for a part of text.
     * </p>
     */
    private RealTimeContactAnalysisCharacterInterval characterOffsets;

    /**
     * <p>
     * Part of the transcript content that contains identified issue. Can be
     * redacted
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @return <p>
     *         Part of the transcript content that contains identified issue.
     *         Can be redacted
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * Part of the transcript content that contains identified issue. Can be
     * redacted
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param content <p>
     *            Part of the transcript content that contains identified issue.
     *            Can be redacted
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * Part of the transcript content that contains identified issue. Can be
     * redacted
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param content <p>
     *            Part of the transcript content that contains identified issue.
     *            Can be redacted
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisTranscriptItemWithContent withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * Transcript identifier. Matches the identifier from one of the
     * TranscriptSegments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         Transcript identifier. Matches the identifier from one of the
     *         TranscriptSegments.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * Transcript identifier. Matches the identifier from one of the
     * TranscriptSegments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param id <p>
     *            Transcript identifier. Matches the identifier from one of the
     *            TranscriptSegments.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Transcript identifier. Matches the identifier from one of the
     * TranscriptSegments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param id <p>
     *            Transcript identifier. Matches the identifier from one of the
     *            TranscriptSegments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisTranscriptItemWithContent withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Begin and end offsets for a part of text.
     * </p>
     *
     * @return <p>
     *         Begin and end offsets for a part of text.
     *         </p>
     */
    public RealTimeContactAnalysisCharacterInterval getCharacterOffsets() {
        return characterOffsets;
    }

    /**
     * <p>
     * Begin and end offsets for a part of text.
     * </p>
     *
     * @param characterOffsets <p>
     *            Begin and end offsets for a part of text.
     *            </p>
     */
    public void setCharacterOffsets(RealTimeContactAnalysisCharacterInterval characterOffsets) {
        this.characterOffsets = characterOffsets;
    }

    /**
     * <p>
     * Begin and end offsets for a part of text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param characterOffsets <p>
     *            Begin and end offsets for a part of text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisTranscriptItemWithContent withCharacterOffsets(
            RealTimeContactAnalysisCharacterInterval characterOffsets) {
        this.characterOffsets = characterOffsets;
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
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getCharacterOffsets() != null)
            sb.append("CharacterOffsets: " + getCharacterOffsets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
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

        if (obj instanceof RealTimeContactAnalysisTranscriptItemWithContent == false)
            return false;
        RealTimeContactAnalysisTranscriptItemWithContent other = (RealTimeContactAnalysisTranscriptItemWithContent) obj;

        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCharacterOffsets() == null ^ this.getCharacterOffsets() == null)
            return false;
        if (other.getCharacterOffsets() != null
                && other.getCharacterOffsets().equals(this.getCharacterOffsets()) == false)
            return false;
        return true;
    }
}
