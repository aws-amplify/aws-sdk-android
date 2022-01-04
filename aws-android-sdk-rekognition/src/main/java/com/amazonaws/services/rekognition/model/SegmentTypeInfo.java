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
 * Information about the type of a segment requested in a call to
 * <a>StartSegmentDetection</a>. An array of <code>SegmentTypeInfo</code>
 * objects is returned by the response from <a>GetSegmentDetection</a>.
 * </p>
 */
public class SegmentTypeInfo implements Serializable {
    /**
     * <p>
     * The type of a segment (technical cue or shot detection).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TECHNICAL_CUE, SHOT
     */
    private String type;

    /**
     * <p>
     * The version of the model used to detect segments.
     * </p>
     */
    private String modelVersion;

    /**
     * <p>
     * The type of a segment (technical cue or shot detection).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TECHNICAL_CUE, SHOT
     *
     * @return <p>
     *         The type of a segment (technical cue or shot detection).
     *         </p>
     * @see SegmentType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of a segment (technical cue or shot detection).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TECHNICAL_CUE, SHOT
     *
     * @param type <p>
     *            The type of a segment (technical cue or shot detection).
     *            </p>
     * @see SegmentType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of a segment (technical cue or shot detection).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TECHNICAL_CUE, SHOT
     *
     * @param type <p>
     *            The type of a segment (technical cue or shot detection).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SegmentType
     */
    public SegmentTypeInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of a segment (technical cue or shot detection).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TECHNICAL_CUE, SHOT
     *
     * @param type <p>
     *            The type of a segment (technical cue or shot detection).
     *            </p>
     * @see SegmentType
     */
    public void setType(SegmentType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of a segment (technical cue or shot detection).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TECHNICAL_CUE, SHOT
     *
     * @param type <p>
     *            The type of a segment (technical cue or shot detection).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SegmentType
     */
    public SegmentTypeInfo withType(SegmentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The version of the model used to detect segments.
     * </p>
     *
     * @return <p>
     *         The version of the model used to detect segments.
     *         </p>
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * <p>
     * The version of the model used to detect segments.
     * </p>
     *
     * @param modelVersion <p>
     *            The version of the model used to detect segments.
     *            </p>
     */
    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model used to detect segments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelVersion <p>
     *            The version of the model used to detect segments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SegmentTypeInfo withModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
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
        if (getModelVersion() != null)
            sb.append("ModelVersion: " + getModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentTypeInfo == false)
            return false;
        SegmentTypeInfo other = (SegmentTypeInfo) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null
                && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        return true;
    }
}
