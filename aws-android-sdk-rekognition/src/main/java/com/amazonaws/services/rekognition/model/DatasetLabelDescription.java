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
 * Describes a dataset label. For more information, see
 * <a>ListDatasetLabels</a>.
 * </p>
 */
public class DatasetLabelDescription implements Serializable {
    /**
     * <p>
     * The name of the label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.{1,}<br/>
     */
    private String labelName;

    /**
     * <p>
     * Statistics about the label.
     * </p>
     */
    private DatasetLabelStats labelStats;

    /**
     * <p>
     * The name of the label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.{1,}<br/>
     *
     * @return <p>
     *         The name of the label.
     *         </p>
     */
    public String getLabelName() {
        return labelName;
    }

    /**
     * <p>
     * The name of the label.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.{1,}<br/>
     *
     * @param labelName <p>
     *            The name of the label.
     *            </p>
     */
    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    /**
     * <p>
     * The name of the label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.{1,}<br/>
     *
     * @param labelName <p>
     *            The name of the label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetLabelDescription withLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }

    /**
     * <p>
     * Statistics about the label.
     * </p>
     *
     * @return <p>
     *         Statistics about the label.
     *         </p>
     */
    public DatasetLabelStats getLabelStats() {
        return labelStats;
    }

    /**
     * <p>
     * Statistics about the label.
     * </p>
     *
     * @param labelStats <p>
     *            Statistics about the label.
     *            </p>
     */
    public void setLabelStats(DatasetLabelStats labelStats) {
        this.labelStats = labelStats;
    }

    /**
     * <p>
     * Statistics about the label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelStats <p>
     *            Statistics about the label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetLabelDescription withLabelStats(DatasetLabelStats labelStats) {
        this.labelStats = labelStats;
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
        if (getLabelName() != null)
            sb.append("LabelName: " + getLabelName() + ",");
        if (getLabelStats() != null)
            sb.append("LabelStats: " + getLabelStats());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelName() == null) ? 0 : getLabelName().hashCode());
        hashCode = prime * hashCode + ((getLabelStats() == null) ? 0 : getLabelStats().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetLabelDescription == false)
            return false;
        DatasetLabelDescription other = (DatasetLabelDescription) obj;

        if (other.getLabelName() == null ^ this.getLabelName() == null)
            return false;
        if (other.getLabelName() != null
                && other.getLabelName().equals(this.getLabelName()) == false)
            return false;
        if (other.getLabelStats() == null ^ this.getLabelStats() == null)
            return false;
        if (other.getLabelStats() != null
                && other.getLabelStats().equals(this.getLabelStats()) == false)
            return false;
        return true;
    }
}
