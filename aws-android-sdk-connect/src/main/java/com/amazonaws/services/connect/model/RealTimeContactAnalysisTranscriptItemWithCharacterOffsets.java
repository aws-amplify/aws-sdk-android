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
 * Transcript representation containing Id and list of character intervals that
 * are associated with analysis data. For example, this object within a
 * <code>RealTimeContactAnalysisPointOfInterest</code> in
 * <code>Category.MatchedDetails</code> would have character interval describing
 * part of the text that matched category.
 * </p>
 */
public class RealTimeContactAnalysisTranscriptItemWithCharacterOffsets implements Serializable {
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
     * List of character intervals within transcript content/text.
     * </p>
     */
    private RealTimeContactAnalysisCharacterInterval characterOffsets;

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
    public RealTimeContactAnalysisTranscriptItemWithCharacterOffsets withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * List of character intervals within transcript content/text.
     * </p>
     *
     * @return <p>
     *         List of character intervals within transcript content/text.
     *         </p>
     */
    public RealTimeContactAnalysisCharacterInterval getCharacterOffsets() {
        return characterOffsets;
    }

    /**
     * <p>
     * List of character intervals within transcript content/text.
     * </p>
     *
     * @param characterOffsets <p>
     *            List of character intervals within transcript content/text.
     *            </p>
     */
    public void setCharacterOffsets(RealTimeContactAnalysisCharacterInterval characterOffsets) {
        this.characterOffsets = characterOffsets;
    }

    /**
     * <p>
     * List of character intervals within transcript content/text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param characterOffsets <p>
     *            List of character intervals within transcript content/text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealTimeContactAnalysisTranscriptItemWithCharacterOffsets withCharacterOffsets(
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

        if (obj instanceof RealTimeContactAnalysisTranscriptItemWithCharacterOffsets == false)
            return false;
        RealTimeContactAnalysisTranscriptItemWithCharacterOffsets other = (RealTimeContactAnalysisTranscriptItemWithCharacterOffsets) obj;

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
