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
 * Filters for the shot detection segments returned by
 * <code>GetSegmentDetection</code>. For more information, see
 * <a>StartSegmentDetectionFilters</a>.
 * </p>
 */
public class StartShotDetectionFilter implements Serializable {
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
     * If you don't specify <code>MinSegmentConfidence</code>, the
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
     * Specifies the minimum confidence that Amazon Rekognition Video must have
     * in order to return a detected segment. Confidence represents how certain
     * Amazon Rekognition is that a segment is correctly identified. 0 is the
     * lowest confidence. 100 is the highest confidence. Amazon Rekognition
     * Video doesn't return any segments with a confidence level lower than this
     * specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinSegmentConfidence</code>, the
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
     *         If you don't specify <code>MinSegmentConfidence</code>, the
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
     * If you don't specify <code>MinSegmentConfidence</code>, the
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
     *            If you don't specify <code>MinSegmentConfidence</code>, the
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
     * If you don't specify <code>MinSegmentConfidence</code>, the
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
     *            If you don't specify <code>MinSegmentConfidence</code>, the
     *            <code>GetSegmentDetection</code> returns segments with
     *            confidence values greater than or equal to 50 percent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartShotDetectionFilter withMinSegmentConfidence(Float minSegmentConfidence) {
        this.minSegmentConfidence = minSegmentConfidence;
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
            sb.append("MinSegmentConfidence: " + getMinSegmentConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMinSegmentConfidence() == null) ? 0 : getMinSegmentConfidence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartShotDetectionFilter == false)
            return false;
        StartShotDetectionFilter other = (StartShotDetectionFilter) obj;

        if (other.getMinSegmentConfidence() == null ^ this.getMinSegmentConfidence() == null)
            return false;
        if (other.getMinSegmentConfidence() != null
                && other.getMinSegmentConfidence().equals(this.getMinSegmentConfidence()) == false)
            return false;
        return true;
    }
}
