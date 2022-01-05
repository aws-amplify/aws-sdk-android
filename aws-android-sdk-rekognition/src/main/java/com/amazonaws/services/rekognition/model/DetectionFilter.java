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
 * A set of parameters that allow you to filter out certain results from your
 * returned results.
 * </p>
 */
public class DetectionFilter implements Serializable {
    /**
     * <p>
     * Sets the confidence of word detection. Words with detection confidence
     * below this will be excluded from the result. Values should be between 50
     * and 100 as Text in Video will not return any result below 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float minConfidence;

    /**
     * <p>
     * Sets the minimum height of the word bounding box. Words with bounding box
     * heights lesser than this value will be excluded from the result. Value is
     * relative to the video frame height.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     */
    private Float minBoundingBoxHeight;

    /**
     * <p>
     * Sets the minimum width of the word bounding box. Words with bounding
     * boxes widths lesser than this value will be excluded from the result.
     * Value is relative to the video frame width.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     */
    private Float minBoundingBoxWidth;

    /**
     * <p>
     * Sets the confidence of word detection. Words with detection confidence
     * below this will be excluded from the result. Values should be between 50
     * and 100 as Text in Video will not return any result below 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         Sets the confidence of word detection. Words with detection
     *         confidence below this will be excluded from the result. Values
     *         should be between 50 and 100 as Text in Video will not return any
     *         result below 50.
     *         </p>
     */
    public Float getMinConfidence() {
        return minConfidence;
    }

    /**
     * <p>
     * Sets the confidence of word detection. Words with detection confidence
     * below this will be excluded from the result. Values should be between 50
     * and 100 as Text in Video will not return any result below 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param minConfidence <p>
     *            Sets the confidence of word detection. Words with detection
     *            confidence below this will be excluded from the result. Values
     *            should be between 50 and 100 as Text in Video will not return
     *            any result below 50.
     *            </p>
     */
    public void setMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * <p>
     * Sets the confidence of word detection. Words with detection confidence
     * below this will be excluded from the result. Values should be between 50
     * and 100 as Text in Video will not return any result below 50.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param minConfidence <p>
     *            Sets the confidence of word detection. Words with detection
     *            confidence below this will be excluded from the result. Values
     *            should be between 50 and 100 as Text in Video will not return
     *            any result below 50.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectionFilter withMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
        return this;
    }

    /**
     * <p>
     * Sets the minimum height of the word bounding box. Words with bounding box
     * heights lesser than this value will be excluded from the result. Value is
     * relative to the video frame height.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     *
     * @return <p>
     *         Sets the minimum height of the word bounding box. Words with
     *         bounding box heights lesser than this value will be excluded from
     *         the result. Value is relative to the video frame height.
     *         </p>
     */
    public Float getMinBoundingBoxHeight() {
        return minBoundingBoxHeight;
    }

    /**
     * <p>
     * Sets the minimum height of the word bounding box. Words with bounding box
     * heights lesser than this value will be excluded from the result. Value is
     * relative to the video frame height.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     *
     * @param minBoundingBoxHeight <p>
     *            Sets the minimum height of the word bounding box. Words with
     *            bounding box heights lesser than this value will be excluded
     *            from the result. Value is relative to the video frame height.
     *            </p>
     */
    public void setMinBoundingBoxHeight(Float minBoundingBoxHeight) {
        this.minBoundingBoxHeight = minBoundingBoxHeight;
    }

    /**
     * <p>
     * Sets the minimum height of the word bounding box. Words with bounding box
     * heights lesser than this value will be excluded from the result. Value is
     * relative to the video frame height.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     *
     * @param minBoundingBoxHeight <p>
     *            Sets the minimum height of the word bounding box. Words with
     *            bounding box heights lesser than this value will be excluded
     *            from the result. Value is relative to the video frame height.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectionFilter withMinBoundingBoxHeight(Float minBoundingBoxHeight) {
        this.minBoundingBoxHeight = minBoundingBoxHeight;
        return this;
    }

    /**
     * <p>
     * Sets the minimum width of the word bounding box. Words with bounding
     * boxes widths lesser than this value will be excluded from the result.
     * Value is relative to the video frame width.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     *
     * @return <p>
     *         Sets the minimum width of the word bounding box. Words with
     *         bounding boxes widths lesser than this value will be excluded
     *         from the result. Value is relative to the video frame width.
     *         </p>
     */
    public Float getMinBoundingBoxWidth() {
        return minBoundingBoxWidth;
    }

    /**
     * <p>
     * Sets the minimum width of the word bounding box. Words with bounding
     * boxes widths lesser than this value will be excluded from the result.
     * Value is relative to the video frame width.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     *
     * @param minBoundingBoxWidth <p>
     *            Sets the minimum width of the word bounding box. Words with
     *            bounding boxes widths lesser than this value will be excluded
     *            from the result. Value is relative to the video frame width.
     *            </p>
     */
    public void setMinBoundingBoxWidth(Float minBoundingBoxWidth) {
        this.minBoundingBoxWidth = minBoundingBoxWidth;
    }

    /**
     * <p>
     * Sets the minimum width of the word bounding box. Words with bounding
     * boxes widths lesser than this value will be excluded from the result.
     * Value is relative to the video frame width.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1<br/>
     *
     * @param minBoundingBoxWidth <p>
     *            Sets the minimum width of the word bounding box. Words with
     *            bounding boxes widths lesser than this value will be excluded
     *            from the result. Value is relative to the video frame width.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectionFilter withMinBoundingBoxWidth(Float minBoundingBoxWidth) {
        this.minBoundingBoxWidth = minBoundingBoxWidth;
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
        if (getMinConfidence() != null)
            sb.append("MinConfidence: " + getMinConfidence() + ",");
        if (getMinBoundingBoxHeight() != null)
            sb.append("MinBoundingBoxHeight: " + getMinBoundingBoxHeight() + ",");
        if (getMinBoundingBoxWidth() != null)
            sb.append("MinBoundingBoxWidth: " + getMinBoundingBoxWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMinConfidence() == null) ? 0 : getMinConfidence().hashCode());
        hashCode = prime * hashCode
                + ((getMinBoundingBoxHeight() == null) ? 0 : getMinBoundingBoxHeight().hashCode());
        hashCode = prime * hashCode
                + ((getMinBoundingBoxWidth() == null) ? 0 : getMinBoundingBoxWidth().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectionFilter == false)
            return false;
        DetectionFilter other = (DetectionFilter) obj;

        if (other.getMinConfidence() == null ^ this.getMinConfidence() == null)
            return false;
        if (other.getMinConfidence() != null
                && other.getMinConfidence().equals(this.getMinConfidence()) == false)
            return false;
        if (other.getMinBoundingBoxHeight() == null ^ this.getMinBoundingBoxHeight() == null)
            return false;
        if (other.getMinBoundingBoxHeight() != null
                && other.getMinBoundingBoxHeight().equals(this.getMinBoundingBoxHeight()) == false)
            return false;
        if (other.getMinBoundingBoxWidth() == null ^ this.getMinBoundingBoxWidth() == null)
            return false;
        if (other.getMinBoundingBoxWidth() != null
                && other.getMinBoundingBoxWidth().equals(this.getMinBoundingBoxWidth()) == false)
            return false;
        return true;
    }
}
