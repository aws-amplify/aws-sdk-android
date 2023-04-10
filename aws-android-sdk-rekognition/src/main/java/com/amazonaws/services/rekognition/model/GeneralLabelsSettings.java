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
 * Contains filters for the object labels returned by DetectLabels. Filters can
 * be inclusive, exclusive, or a combination of both and can be applied to
 * individual labels or entire label categories. To see a list of label
 * categories, see <a
 * href="https://docs.aws.amazon.com/rekognition/latest/dg/labels.html"
 * >Detecting Labels</a>.
 * </p>
 */
public class GeneralLabelsSettings implements Serializable {
    /**
     * <p>
     * The labels that should be included in the return from DetectLabels.
     * </p>
     */
    private java.util.List<String> labelInclusionFilters;

    /**
     * <p>
     * The labels that should be excluded from the return from DetectLabels.
     * </p>
     */
    private java.util.List<String> labelExclusionFilters;

    /**
     * <p>
     * The label categories that should be included in the return from
     * DetectLabels.
     * </p>
     */
    private java.util.List<String> labelCategoryInclusionFilters;

    /**
     * <p>
     * The label categories that should be excluded from the return from
     * DetectLabels.
     * </p>
     */
    private java.util.List<String> labelCategoryExclusionFilters;

    /**
     * <p>
     * The labels that should be included in the return from DetectLabels.
     * </p>
     *
     * @return <p>
     *         The labels that should be included in the return from
     *         DetectLabels.
     *         </p>
     */
    public java.util.List<String> getLabelInclusionFilters() {
        return labelInclusionFilters;
    }

    /**
     * <p>
     * The labels that should be included in the return from DetectLabels.
     * </p>
     *
     * @param labelInclusionFilters <p>
     *            The labels that should be included in the return from
     *            DetectLabels.
     *            </p>
     */
    public void setLabelInclusionFilters(java.util.Collection<String> labelInclusionFilters) {
        if (labelInclusionFilters == null) {
            this.labelInclusionFilters = null;
            return;
        }

        this.labelInclusionFilters = new java.util.ArrayList<String>(labelInclusionFilters);
    }

    /**
     * <p>
     * The labels that should be included in the return from DetectLabels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelInclusionFilters <p>
     *            The labels that should be included in the return from
     *            DetectLabels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeneralLabelsSettings withLabelInclusionFilters(String... labelInclusionFilters) {
        if (getLabelInclusionFilters() == null) {
            this.labelInclusionFilters = new java.util.ArrayList<String>(
                    labelInclusionFilters.length);
        }
        for (String value : labelInclusionFilters) {
            this.labelInclusionFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The labels that should be included in the return from DetectLabels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelInclusionFilters <p>
     *            The labels that should be included in the return from
     *            DetectLabels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeneralLabelsSettings withLabelInclusionFilters(
            java.util.Collection<String> labelInclusionFilters) {
        setLabelInclusionFilters(labelInclusionFilters);
        return this;
    }

    /**
     * <p>
     * The labels that should be excluded from the return from DetectLabels.
     * </p>
     *
     * @return <p>
     *         The labels that should be excluded from the return from
     *         DetectLabels.
     *         </p>
     */
    public java.util.List<String> getLabelExclusionFilters() {
        return labelExclusionFilters;
    }

    /**
     * <p>
     * The labels that should be excluded from the return from DetectLabels.
     * </p>
     *
     * @param labelExclusionFilters <p>
     *            The labels that should be excluded from the return from
     *            DetectLabels.
     *            </p>
     */
    public void setLabelExclusionFilters(java.util.Collection<String> labelExclusionFilters) {
        if (labelExclusionFilters == null) {
            this.labelExclusionFilters = null;
            return;
        }

        this.labelExclusionFilters = new java.util.ArrayList<String>(labelExclusionFilters);
    }

    /**
     * <p>
     * The labels that should be excluded from the return from DetectLabels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelExclusionFilters <p>
     *            The labels that should be excluded from the return from
     *            DetectLabels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeneralLabelsSettings withLabelExclusionFilters(String... labelExclusionFilters) {
        if (getLabelExclusionFilters() == null) {
            this.labelExclusionFilters = new java.util.ArrayList<String>(
                    labelExclusionFilters.length);
        }
        for (String value : labelExclusionFilters) {
            this.labelExclusionFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The labels that should be excluded from the return from DetectLabels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelExclusionFilters <p>
     *            The labels that should be excluded from the return from
     *            DetectLabels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeneralLabelsSettings withLabelExclusionFilters(
            java.util.Collection<String> labelExclusionFilters) {
        setLabelExclusionFilters(labelExclusionFilters);
        return this;
    }

    /**
     * <p>
     * The label categories that should be included in the return from
     * DetectLabels.
     * </p>
     *
     * @return <p>
     *         The label categories that should be included in the return from
     *         DetectLabels.
     *         </p>
     */
    public java.util.List<String> getLabelCategoryInclusionFilters() {
        return labelCategoryInclusionFilters;
    }

    /**
     * <p>
     * The label categories that should be included in the return from
     * DetectLabels.
     * </p>
     *
     * @param labelCategoryInclusionFilters <p>
     *            The label categories that should be included in the return
     *            from DetectLabels.
     *            </p>
     */
    public void setLabelCategoryInclusionFilters(
            java.util.Collection<String> labelCategoryInclusionFilters) {
        if (labelCategoryInclusionFilters == null) {
            this.labelCategoryInclusionFilters = null;
            return;
        }

        this.labelCategoryInclusionFilters = new java.util.ArrayList<String>(
                labelCategoryInclusionFilters);
    }

    /**
     * <p>
     * The label categories that should be included in the return from
     * DetectLabels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelCategoryInclusionFilters <p>
     *            The label categories that should be included in the return
     *            from DetectLabels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeneralLabelsSettings withLabelCategoryInclusionFilters(
            String... labelCategoryInclusionFilters) {
        if (getLabelCategoryInclusionFilters() == null) {
            this.labelCategoryInclusionFilters = new java.util.ArrayList<String>(
                    labelCategoryInclusionFilters.length);
        }
        for (String value : labelCategoryInclusionFilters) {
            this.labelCategoryInclusionFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The label categories that should be included in the return from
     * DetectLabels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelCategoryInclusionFilters <p>
     *            The label categories that should be included in the return
     *            from DetectLabels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeneralLabelsSettings withLabelCategoryInclusionFilters(
            java.util.Collection<String> labelCategoryInclusionFilters) {
        setLabelCategoryInclusionFilters(labelCategoryInclusionFilters);
        return this;
    }

    /**
     * <p>
     * The label categories that should be excluded from the return from
     * DetectLabels.
     * </p>
     *
     * @return <p>
     *         The label categories that should be excluded from the return from
     *         DetectLabels.
     *         </p>
     */
    public java.util.List<String> getLabelCategoryExclusionFilters() {
        return labelCategoryExclusionFilters;
    }

    /**
     * <p>
     * The label categories that should be excluded from the return from
     * DetectLabels.
     * </p>
     *
     * @param labelCategoryExclusionFilters <p>
     *            The label categories that should be excluded from the return
     *            from DetectLabels.
     *            </p>
     */
    public void setLabelCategoryExclusionFilters(
            java.util.Collection<String> labelCategoryExclusionFilters) {
        if (labelCategoryExclusionFilters == null) {
            this.labelCategoryExclusionFilters = null;
            return;
        }

        this.labelCategoryExclusionFilters = new java.util.ArrayList<String>(
                labelCategoryExclusionFilters);
    }

    /**
     * <p>
     * The label categories that should be excluded from the return from
     * DetectLabels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelCategoryExclusionFilters <p>
     *            The label categories that should be excluded from the return
     *            from DetectLabels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeneralLabelsSettings withLabelCategoryExclusionFilters(
            String... labelCategoryExclusionFilters) {
        if (getLabelCategoryExclusionFilters() == null) {
            this.labelCategoryExclusionFilters = new java.util.ArrayList<String>(
                    labelCategoryExclusionFilters.length);
        }
        for (String value : labelCategoryExclusionFilters) {
            this.labelCategoryExclusionFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The label categories that should be excluded from the return from
     * DetectLabels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelCategoryExclusionFilters <p>
     *            The label categories that should be excluded from the return
     *            from DetectLabels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GeneralLabelsSettings withLabelCategoryExclusionFilters(
            java.util.Collection<String> labelCategoryExclusionFilters) {
        setLabelCategoryExclusionFilters(labelCategoryExclusionFilters);
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
        if (getLabelInclusionFilters() != null)
            sb.append("LabelInclusionFilters: " + getLabelInclusionFilters() + ",");
        if (getLabelExclusionFilters() != null)
            sb.append("LabelExclusionFilters: " + getLabelExclusionFilters() + ",");
        if (getLabelCategoryInclusionFilters() != null)
            sb.append("LabelCategoryInclusionFilters: " + getLabelCategoryInclusionFilters() + ",");
        if (getLabelCategoryExclusionFilters() != null)
            sb.append("LabelCategoryExclusionFilters: " + getLabelCategoryExclusionFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLabelInclusionFilters() == null) ? 0 : getLabelInclusionFilters().hashCode());
        hashCode = prime
                * hashCode
                + ((getLabelExclusionFilters() == null) ? 0 : getLabelExclusionFilters().hashCode());
        hashCode = prime
                * hashCode
                + ((getLabelCategoryInclusionFilters() == null) ? 0
                        : getLabelCategoryInclusionFilters().hashCode());
        hashCode = prime
                * hashCode
                + ((getLabelCategoryExclusionFilters() == null) ? 0
                        : getLabelCategoryExclusionFilters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeneralLabelsSettings == false)
            return false;
        GeneralLabelsSettings other = (GeneralLabelsSettings) obj;

        if (other.getLabelInclusionFilters() == null ^ this.getLabelInclusionFilters() == null)
            return false;
        if (other.getLabelInclusionFilters() != null
                && other.getLabelInclusionFilters().equals(this.getLabelInclusionFilters()) == false)
            return false;
        if (other.getLabelExclusionFilters() == null ^ this.getLabelExclusionFilters() == null)
            return false;
        if (other.getLabelExclusionFilters() != null
                && other.getLabelExclusionFilters().equals(this.getLabelExclusionFilters()) == false)
            return false;
        if (other.getLabelCategoryInclusionFilters() == null
                ^ this.getLabelCategoryInclusionFilters() == null)
            return false;
        if (other.getLabelCategoryInclusionFilters() != null
                && other.getLabelCategoryInclusionFilters().equals(
                        this.getLabelCategoryInclusionFilters()) == false)
            return false;
        if (other.getLabelCategoryExclusionFilters() == null
                ^ this.getLabelCategoryExclusionFilters() == null)
            return false;
        if (other.getLabelCategoryExclusionFilters() != null
                && other.getLabelCategoryExclusionFilters().equals(
                        this.getLabelCategoryExclusionFilters()) == false)
            return false;
        return true;
    }
}
