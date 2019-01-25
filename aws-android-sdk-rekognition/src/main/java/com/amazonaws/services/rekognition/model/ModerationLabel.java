/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information about a single type of moderated content found in an
 * image or video. Each type of moderated content has a label within a
 * hierarchical taxonomy. For more information, see Detecting Unsafe Content in
 * the Amazon Rekognition Developer Guide.
 * </p>
 */
public class ModerationLabel implements Serializable {
    /**
     * <p>
     * Specifies the confidence that Amazon Rekognition has that the label has
     * been correctly identified.
     * </p>
     * <p>
     * If you don't specify the <code>MinConfidence</code> parameter in the call
     * to <code>DetectModerationLabels</code>, the operation returns labels with
     * a confidence value greater than or equal to 50 percent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float confidence;

    /**
     * <p>
     * The label name for the type of content detected in the image.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The name for the parent label. Labels at the top-level of the hierarchy
     * have the parent label <code>""</code>.
     * </p>
     */
    private String parentName;

    /**
     * <p>
     * Specifies the confidence that Amazon Rekognition has that the label has
     * been correctly identified.
     * </p>
     * <p>
     * If you don't specify the <code>MinConfidence</code> parameter in the call
     * to <code>DetectModerationLabels</code>, the operation returns labels with
     * a confidence value greater than or equal to 50 percent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         Specifies the confidence that Amazon Rekognition has that the
     *         label has been correctly identified.
     *         </p>
     *         <p>
     *         If you don't specify the <code>MinConfidence</code> parameter in
     *         the call to <code>DetectModerationLabels</code>, the operation
     *         returns labels with a confidence value greater than or equal to
     *         50 percent.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * Specifies the confidence that Amazon Rekognition has that the label has
     * been correctly identified.
     * </p>
     * <p>
     * If you don't specify the <code>MinConfidence</code> parameter in the call
     * to <code>DetectModerationLabels</code>, the operation returns labels with
     * a confidence value greater than or equal to 50 percent.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            Specifies the confidence that Amazon Rekognition has that the
     *            label has been correctly identified.
     *            </p>
     *            <p>
     *            If you don't specify the <code>MinConfidence</code> parameter
     *            in the call to <code>DetectModerationLabels</code>, the
     *            operation returns labels with a confidence value greater than
     *            or equal to 50 percent.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Specifies the confidence that Amazon Rekognition has that the label has
     * been correctly identified.
     * </p>
     * <p>
     * If you don't specify the <code>MinConfidence</code> parameter in the call
     * to <code>DetectModerationLabels</code>, the operation returns labels with
     * a confidence value greater than or equal to 50 percent.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param confidence <p>
     *            Specifies the confidence that Amazon Rekognition has that the
     *            label has been correctly identified.
     *            </p>
     *            <p>
     *            If you don't specify the <code>MinConfidence</code> parameter
     *            in the call to <code>DetectModerationLabels</code>, the
     *            operation returns labels with a confidence value greater than
     *            or equal to 50 percent.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModerationLabel withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * <p>
     * The label name for the type of content detected in the image.
     * </p>
     *
     * @return <p>
     *         The label name for the type of content detected in the image.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The label name for the type of content detected in the image.
     * </p>
     *
     * @param name <p>
     *            The label name for the type of content detected in the image.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The label name for the type of content detected in the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The label name for the type of content detected in the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModerationLabel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The name for the parent label. Labels at the top-level of the hierarchy
     * have the parent label <code>""</code>.
     * </p>
     *
     * @return <p>
     *         The name for the parent label. Labels at the top-level of the
     *         hierarchy have the parent label <code>""</code>.
     *         </p>
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * <p>
     * The name for the parent label. Labels at the top-level of the hierarchy
     * have the parent label <code>""</code>.
     * </p>
     *
     * @param parentName <p>
     *            The name for the parent label. Labels at the top-level of the
     *            hierarchy have the parent label <code>""</code>.
     *            </p>
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    /**
     * <p>
     * The name for the parent label. Labels at the top-level of the hierarchy
     * have the parent label <code>""</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parentName <p>
     *            The name for the parent label. Labels at the top-level of the
     *            hierarchy have the parent label <code>""</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModerationLabel withParentName(String parentName) {
        this.parentName = parentName;
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
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getParentName() != null)
            sb.append("ParentName: " + getParentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getParentName() == null) ? 0 : getParentName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModerationLabel == false)
            return false;
        ModerationLabel other = (ModerationLabel) obj;

        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getParentName() == null ^ this.getParentName() == null)
            return false;
        if (other.getParentName() != null
                && other.getParentName().equals(this.getParentName()) == false)
            return false;
        return true;
    }
}
