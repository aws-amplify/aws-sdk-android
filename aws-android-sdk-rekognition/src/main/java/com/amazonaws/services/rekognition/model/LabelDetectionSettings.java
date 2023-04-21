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
 * Contains the specified filters that should be applied to a list of returned
 * GENERAL_LABELS.
 * </p>
 */
public class LabelDetectionSettings implements Serializable {
    /**
     * <p>
     * Contains filters for the object labels returned by DetectLabels. Filters
     * can be inclusive, exclusive, or a combination of both and can be applied
     * to individual labels or entire label categories. To see a list of label
     * categories, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/labels.html"
     * >Detecting Labels</a>.
     * </p>
     */
    private GeneralLabelsSettings generalLabels;

    /**
     * <p>
     * Contains filters for the object labels returned by DetectLabels. Filters
     * can be inclusive, exclusive, or a combination of both and can be applied
     * to individual labels or entire label categories. To see a list of label
     * categories, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/labels.html"
     * >Detecting Labels</a>.
     * </p>
     *
     * @return <p>
     *         Contains filters for the object labels returned by DetectLabels.
     *         Filters can be inclusive, exclusive, or a combination of both and
     *         can be applied to individual labels or entire label categories.
     *         To see a list of label categories, see <a href=
     *         "https://docs.aws.amazon.com/rekognition/latest/dg/labels.html"
     *         >Detecting Labels</a>.
     *         </p>
     */
    public GeneralLabelsSettings getGeneralLabels() {
        return generalLabels;
    }

    /**
     * <p>
     * Contains filters for the object labels returned by DetectLabels. Filters
     * can be inclusive, exclusive, or a combination of both and can be applied
     * to individual labels or entire label categories. To see a list of label
     * categories, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/labels.html"
     * >Detecting Labels</a>.
     * </p>
     *
     * @param generalLabels <p>
     *            Contains filters for the object labels returned by
     *            DetectLabels. Filters can be inclusive, exclusive, or a
     *            combination of both and can be applied to individual labels or
     *            entire label categories. To see a list of label categories,
     *            see <a href=
     *            "https://docs.aws.amazon.com/rekognition/latest/dg/labels.html"
     *            >Detecting Labels</a>.
     *            </p>
     */
    public void setGeneralLabels(GeneralLabelsSettings generalLabels) {
        this.generalLabels = generalLabels;
    }

    /**
     * <p>
     * Contains filters for the object labels returned by DetectLabels. Filters
     * can be inclusive, exclusive, or a combination of both and can be applied
     * to individual labels or entire label categories. To see a list of label
     * categories, see <a
     * href="https://docs.aws.amazon.com/rekognition/latest/dg/labels.html"
     * >Detecting Labels</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param generalLabels <p>
     *            Contains filters for the object labels returned by
     *            DetectLabels. Filters can be inclusive, exclusive, or a
     *            combination of both and can be applied to individual labels or
     *            entire label categories. To see a list of label categories,
     *            see <a href=
     *            "https://docs.aws.amazon.com/rekognition/latest/dg/labels.html"
     *            >Detecting Labels</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelDetectionSettings withGeneralLabels(GeneralLabelsSettings generalLabels) {
        this.generalLabels = generalLabels;
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
        if (getGeneralLabels() != null)
            sb.append("GeneralLabels: " + getGeneralLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGeneralLabels() == null) ? 0 : getGeneralLabels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelDetectionSettings == false)
            return false;
        LabelDetectionSettings other = (LabelDetectionSettings) obj;

        if (other.getGeneralLabels() == null ^ this.getGeneralLabels() == null)
            return false;
        if (other.getGeneralLabels() != null
                && other.getGeneralLabels().equals(this.getGeneralLabels()) == false)
            return false;
        return true;
    }
}
