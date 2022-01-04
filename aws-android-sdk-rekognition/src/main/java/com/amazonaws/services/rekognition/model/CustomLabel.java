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
 * A custom label detected in an image by a call to <a>DetectCustomLabels</a>.
 * </p>
 */
public class CustomLabel implements Serializable {
    /**
     * <p>
     * The name of the custom label.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The confidence that the model has in the detection of the custom label.
     * The range is 0-100. A higher value indicates a higher confidence.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * The location of the detected object on the image that corresponds to the
     * custom label. Includes an axis aligned coarse bounding box surrounding
     * the object and a finer grain polygon for more accurate spatial
     * information.
     * </p>
     */
    private Geometry geometry;

    /**
     * <p>
     * The name of the custom label.
     * </p>
     *
     * @return <p>
     *         The name of the custom label.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the custom label.
     * </p>
     *
     * @param name <p>
     *            The name of the custom label.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the custom label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomLabel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The confidence that the model has in the detection of the custom label.
     * The range is 0-100. A higher value indicates a higher confidence.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         The confidence that the model has in the detection of the custom
     *         label. The range is 0-100. A higher value indicates a higher
     *         confidence.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The confidence that the model has in the detection of the custom label.
     * The range is 0-100. A higher value indicates a higher confidence.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence that the model has in the detection of the
     *            custom label. The range is 0-100. A higher value indicates a
     *            higher confidence.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that the model has in the detection of the custom label.
     * The range is 0-100. A higher value indicates a higher confidence.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            The confidence that the model has in the detection of the
     *            custom label. The range is 0-100. A higher value indicates a
     *            higher confidence.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomLabel withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * <p>
     * The location of the detected object on the image that corresponds to the
     * custom label. Includes an axis aligned coarse bounding box surrounding
     * the object and a finer grain polygon for more accurate spatial
     * information.
     * </p>
     *
     * @return <p>
     *         The location of the detected object on the image that corresponds
     *         to the custom label. Includes an axis aligned coarse bounding box
     *         surrounding the object and a finer grain polygon for more
     *         accurate spatial information.
     *         </p>
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * <p>
     * The location of the detected object on the image that corresponds to the
     * custom label. Includes an axis aligned coarse bounding box surrounding
     * the object and a finer grain polygon for more accurate spatial
     * information.
     * </p>
     *
     * @param geometry <p>
     *            The location of the detected object on the image that
     *            corresponds to the custom label. Includes an axis aligned
     *            coarse bounding box surrounding the object and a finer grain
     *            polygon for more accurate spatial information.
     *            </p>
     */
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p>
     * The location of the detected object on the image that corresponds to the
     * custom label. Includes an axis aligned coarse bounding box surrounding
     * the object and a finer grain polygon for more accurate spatial
     * information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geometry <p>
     *            The location of the detected object on the image that
     *            corresponds to the custom label. Includes an axis aligned
     *            coarse bounding box surrounding the object and a finer grain
     *            polygon for more accurate spatial information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomLabel withGeometry(Geometry geometry) {
        this.geometry = geometry;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence() + ",");
        if (getGeometry() != null)
            sb.append("Geometry: " + getGeometry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomLabel == false)
            return false;
        CustomLabel other = (CustomLabel) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        return true;
    }
}
