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
 * Provides statistics about a dataset. For more information, see
 * <a>DescribeDataset</a>.
 * </p>
 */
public class DatasetStats implements Serializable {
    /**
     * <p>
     * The total number of images in the dataset that have labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer labeledEntries;

    /**
     * <p>
     * The total number of images in the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer totalEntries;

    /**
     * <p>
     * The total number of labels declared in the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer totalLabels;

    /**
     * <p>
     * The total number of entries that contain at least one error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer errorEntries;

    /**
     * <p>
     * The total number of images in the dataset that have labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total number of images in the dataset that have labels.
     *         </p>
     */
    public Integer getLabeledEntries() {
        return labeledEntries;
    }

    /**
     * <p>
     * The total number of images in the dataset that have labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param labeledEntries <p>
     *            The total number of images in the dataset that have labels.
     *            </p>
     */
    public void setLabeledEntries(Integer labeledEntries) {
        this.labeledEntries = labeledEntries;
    }

    /**
     * <p>
     * The total number of images in the dataset that have labels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param labeledEntries <p>
     *            The total number of images in the dataset that have labels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetStats withLabeledEntries(Integer labeledEntries) {
        this.labeledEntries = labeledEntries;
        return this;
    }

    /**
     * <p>
     * The total number of images in the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total number of images in the dataset.
     *         </p>
     */
    public Integer getTotalEntries() {
        return totalEntries;
    }

    /**
     * <p>
     * The total number of images in the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param totalEntries <p>
     *            The total number of images in the dataset.
     *            </p>
     */
    public void setTotalEntries(Integer totalEntries) {
        this.totalEntries = totalEntries;
    }

    /**
     * <p>
     * The total number of images in the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param totalEntries <p>
     *            The total number of images in the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetStats withTotalEntries(Integer totalEntries) {
        this.totalEntries = totalEntries;
        return this;
    }

    /**
     * <p>
     * The total number of labels declared in the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total number of labels declared in the dataset.
     *         </p>
     */
    public Integer getTotalLabels() {
        return totalLabels;
    }

    /**
     * <p>
     * The total number of labels declared in the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param totalLabels <p>
     *            The total number of labels declared in the dataset.
     *            </p>
     */
    public void setTotalLabels(Integer totalLabels) {
        this.totalLabels = totalLabels;
    }

    /**
     * <p>
     * The total number of labels declared in the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param totalLabels <p>
     *            The total number of labels declared in the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetStats withTotalLabels(Integer totalLabels) {
        this.totalLabels = totalLabels;
        return this;
    }

    /**
     * <p>
     * The total number of entries that contain at least one error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The total number of entries that contain at least one error.
     *         </p>
     */
    public Integer getErrorEntries() {
        return errorEntries;
    }

    /**
     * <p>
     * The total number of entries that contain at least one error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param errorEntries <p>
     *            The total number of entries that contain at least one error.
     *            </p>
     */
    public void setErrorEntries(Integer errorEntries) {
        this.errorEntries = errorEntries;
    }

    /**
     * <p>
     * The total number of entries that contain at least one error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param errorEntries <p>
     *            The total number of entries that contain at least one error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetStats withErrorEntries(Integer errorEntries) {
        this.errorEntries = errorEntries;
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
        if (getLabeledEntries() != null)
            sb.append("LabeledEntries: " + getLabeledEntries() + ",");
        if (getTotalEntries() != null)
            sb.append("TotalEntries: " + getTotalEntries() + ",");
        if (getTotalLabels() != null)
            sb.append("TotalLabels: " + getTotalLabels() + ",");
        if (getErrorEntries() != null)
            sb.append("ErrorEntries: " + getErrorEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLabeledEntries() == null) ? 0 : getLabeledEntries().hashCode());
        hashCode = prime * hashCode
                + ((getTotalEntries() == null) ? 0 : getTotalEntries().hashCode());
        hashCode = prime * hashCode
                + ((getTotalLabels() == null) ? 0 : getTotalLabels().hashCode());
        hashCode = prime * hashCode
                + ((getErrorEntries() == null) ? 0 : getErrorEntries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetStats == false)
            return false;
        DatasetStats other = (DatasetStats) obj;

        if (other.getLabeledEntries() == null ^ this.getLabeledEntries() == null)
            return false;
        if (other.getLabeledEntries() != null
                && other.getLabeledEntries().equals(this.getLabeledEntries()) == false)
            return false;
        if (other.getTotalEntries() == null ^ this.getTotalEntries() == null)
            return false;
        if (other.getTotalEntries() != null
                && other.getTotalEntries().equals(this.getTotalEntries()) == false)
            return false;
        if (other.getTotalLabels() == null ^ this.getTotalLabels() == null)
            return false;
        if (other.getTotalLabels() != null
                && other.getTotalLabels().equals(this.getTotalLabels()) == false)
            return false;
        if (other.getErrorEntries() == null ^ this.getErrorEntries() == null)
            return false;
        if (other.getErrorEntries() != null
                && other.getErrorEntries().equals(this.getErrorEntries()) == false)
            return false;
        return true;
    }
}
