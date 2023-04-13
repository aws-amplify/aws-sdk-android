/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An instance of a label returned by Amazon Rekognition Image
 * (<a>DetectLabels</a>) or by Amazon Rekognition Video
 * (<a>GetLabelDetection</a>).
 * </p>
 */
public class Instance implements Serializable {
    /**
     * <p>
     * The position of the label instance on the image.
     * </p>
     */
    private BoundingBox boundingBox;

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the accuracy of the
     * bounding box.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     */
    private Float confidence;

    /**
     * <p>
     * The dominant colors found in an individual instance of a label.
     * </p>
     */
    private java.util.List<DominantColor> dominantColors;

    /**
     * <p>
     * The position of the label instance on the image.
     * </p>
     *
     * @return <p>
     *         The position of the label instance on the image.
     *         </p>
     */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * <p>
     * The position of the label instance on the image.
     * </p>
     *
     * @param boundingBox <p>
     *            The position of the label instance on the image.
     *            </p>
     */
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * The position of the label instance on the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param boundingBox <p>
     *            The position of the label instance on the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the accuracy of the
     * bounding box.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         The confidence that Amazon Rekognition has in the accuracy of the
     *         bounding box.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the accuracy of the
     * bounding box.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param confidence <p>
     *            The confidence that Amazon Rekognition has in the accuracy of
     *            the bounding box.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the accuracy of the
     * bounding box.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param confidence <p>
     *            The confidence that Amazon Rekognition has in the accuracy of
     *            the bounding box.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * <p>
     * The dominant colors found in an individual instance of a label.
     * </p>
     *
     * @return <p>
     *         The dominant colors found in an individual instance of a label.
     *         </p>
     */
    public java.util.List<DominantColor> getDominantColors() {
        return dominantColors;
    }

    /**
     * <p>
     * The dominant colors found in an individual instance of a label.
     * </p>
     *
     * @param dominantColors <p>
     *            The dominant colors found in an individual instance of a
     *            label.
     *            </p>
     */
    public void setDominantColors(java.util.Collection<DominantColor> dominantColors) {
        if (dominantColors == null) {
            this.dominantColors = null;
            return;
        }

        this.dominantColors = new java.util.ArrayList<DominantColor>(dominantColors);
    }

    /**
     * <p>
     * The dominant colors found in an individual instance of a label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dominantColors <p>
     *            The dominant colors found in an individual instance of a
     *            label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withDominantColors(DominantColor... dominantColors) {
        if (getDominantColors() == null) {
            this.dominantColors = new java.util.ArrayList<DominantColor>(dominantColors.length);
        }
        for (DominantColor value : dominantColors) {
            this.dominantColors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The dominant colors found in an individual instance of a label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dominantColors <p>
     *            The dominant colors found in an individual instance of a
     *            label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Instance withDominantColors(java.util.Collection<DominantColor> dominantColors) {
        setDominantColors(dominantColors);
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
        if (getBoundingBox() != null)
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence() + ",");
        if (getDominantColors() != null)
            sb.append("DominantColors: " + getDominantColors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode
                + ((getDominantColors() == null) ? 0 : getDominantColors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Instance == false)
            return false;
        Instance other = (Instance) obj;

        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null
                && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getDominantColors() == null ^ this.getDominantColors() == null)
            return false;
        if (other.getDominantColors() != null
                && other.getDominantColors().equals(this.getDominantColors()) == false)
            return false;
        return true;
    }
}
