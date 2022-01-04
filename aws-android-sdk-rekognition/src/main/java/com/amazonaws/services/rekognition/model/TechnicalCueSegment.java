/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a technical cue segment. For more information, see
 * <a>SegmentDetection</a>.
 * </p>
 */
public class TechnicalCueSegment implements Serializable {
    /**
     * <p>
     * The type of the technical cue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ColorBars, EndCredits, BlackFrames,
     * OpeningCredits, StudioLogo, Slate, Content
     */
    private String type;

    /**
     * <p>
     * The confidence that Amazon Rekognition Video has in the accuracy of the
     * detected segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * The type of the technical cue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ColorBars, EndCredits, BlackFrames,
     * OpeningCredits, StudioLogo, Slate, Content
     *
     * @return <p>
     *         The type of the technical cue.
     *         </p>
     * @see TechnicalCueType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the technical cue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ColorBars, EndCredits, BlackFrames,
     * OpeningCredits, StudioLogo, Slate, Content
     *
     * @param type <p>
     *            The type of the technical cue.
     *            </p>
     * @see TechnicalCueType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the technical cue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ColorBars, EndCredits, BlackFrames,
     * OpeningCredits, StudioLogo, Slate, Content
     *
     * @param type <p>
     *            The type of the technical cue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TechnicalCueType
     */
    public TechnicalCueSegment withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the technical cue.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ColorBars, EndCredits, BlackFrames,
     * OpeningCredits, StudioLogo, Slate, Content
     *
     * @param type <p>
     *            The type of the technical cue.
     *            </p>
     * @see TechnicalCueType
     */
    public void setType(TechnicalCueType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the technical cue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ColorBars, EndCredits, BlackFrames,
     * OpeningCredits, StudioLogo, Slate, Content
     *
     * @param type <p>
     *            The type of the technical cue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TechnicalCueType
     */
    public TechnicalCueSegment withType(TechnicalCueType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition Video has in the accuracy of the
     * detected segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 100<br/>
     *
     * @return <p>
     *         The confidence that Amazon Rekognition Video has in the accuracy
     *         of the detected segment.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition Video has in the accuracy of the
     * detected segment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence that Amazon Rekognition Video has in the
     *            accuracy of the detected segment.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition Video has in the accuracy of the
     * detected segment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence that Amazon Rekognition Video has in the
     *            accuracy of the detected segment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TechnicalCueSegment withConfidence(Float confidence) {
        this.confidence = confidence;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TechnicalCueSegment == false)
            return false;
        TechnicalCueSegment other = (TechnicalCueSegment) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }
}
