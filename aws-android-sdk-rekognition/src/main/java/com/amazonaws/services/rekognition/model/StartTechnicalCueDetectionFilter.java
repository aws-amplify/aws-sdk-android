/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Filters for the technical segments returned by <a>GetSegmentDetection</a>.
 * For more information, see <a>StartSegmentDetectionFilters</a>.
 * </p>
 */
public class StartTechnicalCueDetectionFilter implements Serializable {
    /**
     * <p>
     * Specifies the minimum confidence that Amazon Rekognition Video must have
     * in order to return a detected segment. Confidence represents how certain
     * Amazon Rekognition is that a segment is correctly identified. 0 is the
     * lowest confidence. 100 is the highest confidence. Amazon Rekognition
     * Video doesn't return any segments with a confidence level lower than this
     * specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinSegmentConfidence</code>,
     * <code>GetSegmentDetection</code> returns segments with confidence values
     * greater than or equal to 50 percent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 100<br/>
     */
    private Float minSegmentConfidence;

    /**
     * <p>
     * A filter that allows you to control the black frame detection by
     * specifying the black levels and pixel coverage of black pixels in a
     * frame. Videos can come from multiple sources, formats, and time periods,
     * with different standards and varying noise levels for black frames that
     * need to be accounted for.
     * </p>
     */
    private BlackFrame blackFrame;

    /**
     * <p>
     * Specifies the minimum confidence that Amazon Rekognition Video must have
     * in order to return a detected segment. Confidence represents how certain
     * Amazon Rekognition is that a segment is correctly identified. 0 is the
     * lowest confidence. 100 is the highest confidence. Amazon Rekognition
     * Video doesn't return any segments with a confidence level lower than this
     * specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinSegmentConfidence</code>,
     * <code>GetSegmentDetection</code> returns segments with confidence values
     * greater than or equal to 50 percent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 100<br/>
     *
     * @return <p>
     *         Specifies the minimum confidence that Amazon Rekognition Video
     *         must have in order to return a detected segment. Confidence
     *         represents how certain Amazon Rekognition is that a segment is
     *         correctly identified. 0 is the lowest confidence. 100 is the
     *         highest confidence. Amazon Rekognition Video doesn't return any
     *         segments with a confidence level lower than this specified value.
     *         </p>
     *         <p>
     *         If you don't specify <code>MinSegmentConfidence</code>,
     *         <code>GetSegmentDetection</code> returns segments with confidence
     *         values greater than or equal to 50 percent.
     *         </p>
     */
    public Float getMinSegmentConfidence() {
        return minSegmentConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence that Amazon Rekognition Video must have
     * in order to return a detected segment. Confidence represents how certain
     * Amazon Rekognition is that a segment is correctly identified. 0 is the
     * lowest confidence. 100 is the highest confidence. Amazon Rekognition
     * Video doesn't return any segments with a confidence level lower than this
     * specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinSegmentConfidence</code>,
     * <code>GetSegmentDetection</code> returns segments with confidence values
     * greater than or equal to 50 percent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 100<br/>
     *
     * @param minSegmentConfidence <p>
     *            Specifies the minimum confidence that Amazon Rekognition Video
     *            must have in order to return a detected segment. Confidence
     *            represents how certain Amazon Rekognition is that a segment is
     *            correctly identified. 0 is the lowest confidence. 100 is the
     *            highest confidence. Amazon Rekognition Video doesn't return
     *            any segments with a confidence level lower than this specified
     *            value.
     *            </p>
     *            <p>
     *            If you don't specify <code>MinSegmentConfidence</code>,
     *            <code>GetSegmentDetection</code> returns segments with
     *            confidence values greater than or equal to 50 percent.
     *            </p>
     */
    public void setMinSegmentConfidence(Float minSegmentConfidence) {
        this.minSegmentConfidence = minSegmentConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence that Amazon Rekognition Video must have
     * in order to return a detected segment. Confidence represents how certain
     * Amazon Rekognition is that a segment is correctly identified. 0 is the
     * lowest confidence. 100 is the highest confidence. Amazon Rekognition
     * Video doesn't return any segments with a confidence level lower than this
     * specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinSegmentConfidence</code>,
     * <code>GetSegmentDetection</code> returns segments with confidence values
     * greater than or equal to 50 percent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 100<br/>
     *
     * @param minSegmentConfidence <p>
     *            Specifies the minimum confidence that Amazon Rekognition Video
     *            must have in order to return a detected segment. Confidence
     *            represents how certain Amazon Rekognition is that a segment is
     *            correctly identified. 0 is the lowest confidence. 100 is the
     *            highest confidence. Amazon Rekognition Video doesn't return
     *            any segments with a confidence level lower than this specified
     *            value.
     *            </p>
     *            <p>
     *            If you don't specify <code>MinSegmentConfidence</code>,
     *            <code>GetSegmentDetection</code> returns segments with
     *            confidence values greater than or equal to 50 percent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTechnicalCueDetectionFilter withMinSegmentConfidence(Float minSegmentConfidence) {
        this.minSegmentConfidence = minSegmentConfidence;
        return this;
    }

    /**
     * <p>
     * A filter that allows you to control the black frame detection by
     * specifying the black levels and pixel coverage of black pixels in a
     * frame. Videos can come from multiple sources, formats, and time periods,
     * with different standards and varying noise levels for black frames that
     * need to be accounted for.
     * </p>
     *
     * @return <p>
     *         A filter that allows you to control the black frame detection by
     *         specifying the black levels and pixel coverage of black pixels in
     *         a frame. Videos can come from multiple sources, formats, and time
     *         periods, with different standards and varying noise levels for
     *         black frames that need to be accounted for.
     *         </p>
     */
    public BlackFrame getBlackFrame() {
        return blackFrame;
    }

    /**
     * <p>
     * A filter that allows you to control the black frame detection by
     * specifying the black levels and pixel coverage of black pixels in a
     * frame. Videos can come from multiple sources, formats, and time periods,
     * with different standards and varying noise levels for black frames that
     * need to be accounted for.
     * </p>
     *
     * @param blackFrame <p>
     *            A filter that allows you to control the black frame detection
     *            by specifying the black levels and pixel coverage of black
     *            pixels in a frame. Videos can come from multiple sources,
     *            formats, and time periods, with different standards and
     *            varying noise levels for black frames that need to be
     *            accounted for.
     *            </p>
     */
    public void setBlackFrame(BlackFrame blackFrame) {
        this.blackFrame = blackFrame;
    }

    /**
     * <p>
     * A filter that allows you to control the black frame detection by
     * specifying the black levels and pixel coverage of black pixels in a
     * frame. Videos can come from multiple sources, formats, and time periods,
     * with different standards and varying noise levels for black frames that
     * need to be accounted for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blackFrame <p>
     *            A filter that allows you to control the black frame detection
     *            by specifying the black levels and pixel coverage of black
     *            pixels in a frame. Videos can come from multiple sources,
     *            formats, and time periods, with different standards and
     *            varying noise levels for black frames that need to be
     *            accounted for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTechnicalCueDetectionFilter withBlackFrame(BlackFrame blackFrame) {
        this.blackFrame = blackFrame;
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
        if (getMinSegmentConfidence() != null)
            sb.append("MinSegmentConfidence: " + getMinSegmentConfidence() + ",");
        if (getBlackFrame() != null)
            sb.append("BlackFrame: " + getBlackFrame());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMinSegmentConfidence() == null) ? 0 : getMinSegmentConfidence().hashCode());
        hashCode = prime * hashCode + ((getBlackFrame() == null) ? 0 : getBlackFrame().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTechnicalCueDetectionFilter == false)
            return false;
        StartTechnicalCueDetectionFilter other = (StartTechnicalCueDetectionFilter) obj;

        if (other.getMinSegmentConfidence() == null ^ this.getMinSegmentConfidence() == null)
            return false;
        if (other.getMinSegmentConfidence() != null
                && other.getMinSegmentConfidence().equals(this.getMinSegmentConfidence()) == false)
            return false;
        if (other.getBlackFrame() == null ^ this.getBlackFrame() == null)
            return false;
        if (other.getBlackFrame() != null
                && other.getBlackFrame().equals(this.getBlackFrame()) == false)
            return false;
        return true;
    }
}
