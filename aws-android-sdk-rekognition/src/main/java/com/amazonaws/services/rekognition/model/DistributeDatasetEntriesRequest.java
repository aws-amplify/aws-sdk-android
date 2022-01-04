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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Distributes the entries (images) in a training dataset across the training
 * dataset and the test dataset for a project.
 * <code>DistributeDatasetEntries</code> moves 20% of the training dataset
 * images to the test dataset. An entry is a JSON Line that describes an image.
 * </p>
 * <p>
 * You supply the Amazon Resource Names (ARN) of a project's training dataset
 * and test dataset. The training dataset must contain the images that you want
 * to split. The test dataset must be empty. The datasets must belong to the
 * same project. To create training and test datasets for a project, call
 * <a>CreateDataset</a>.
 * </p>
 * <p>
 * Distributing a dataset takes a while to complete. To check the status call
 * <code>DescribeDataset</code>. The operation is complete when the
 * <code>Status</code> field for the training dataset and the test dataset is
 * <code>UPDATE_COMPLETE</code>. If the dataset split fails, the value of
 * <code>Status</code> is <code>UPDATE_FAILED</code>.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:DistributeDatasetEntries</code> action.
 * </p>
 */
public class DistributeDatasetEntriesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARNS for the training dataset and test dataset that you want to use.
     * The datasets must belong to the same project. The test dataset must be
     * empty.
     * </p>
     */
    private java.util.List<DistributeDataset> datasets;

    /**
     * <p>
     * The ARNS for the training dataset and test dataset that you want to use.
     * The datasets must belong to the same project. The test dataset must be
     * empty.
     * </p>
     *
     * @return <p>
     *         The ARNS for the training dataset and test dataset that you want
     *         to use. The datasets must belong to the same project. The test
     *         dataset must be empty.
     *         </p>
     */
    public java.util.List<DistributeDataset> getDatasets() {
        return datasets;
    }

    /**
     * <p>
     * The ARNS for the training dataset and test dataset that you want to use.
     * The datasets must belong to the same project. The test dataset must be
     * empty.
     * </p>
     *
     * @param datasets <p>
     *            The ARNS for the training dataset and test dataset that you
     *            want to use. The datasets must belong to the same project. The
     *            test dataset must be empty.
     *            </p>
     */
    public void setDatasets(java.util.Collection<DistributeDataset> datasets) {
        if (datasets == null) {
            this.datasets = null;
            return;
        }

        this.datasets = new java.util.ArrayList<DistributeDataset>(datasets);
    }

    /**
     * <p>
     * The ARNS for the training dataset and test dataset that you want to use.
     * The datasets must belong to the same project. The test dataset must be
     * empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasets <p>
     *            The ARNS for the training dataset and test dataset that you
     *            want to use. The datasets must belong to the same project. The
     *            test dataset must be empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributeDatasetEntriesRequest withDatasets(DistributeDataset... datasets) {
        if (getDatasets() == null) {
            this.datasets = new java.util.ArrayList<DistributeDataset>(datasets.length);
        }
        for (DistributeDataset value : datasets) {
            this.datasets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ARNS for the training dataset and test dataset that you want to use.
     * The datasets must belong to the same project. The test dataset must be
     * empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasets <p>
     *            The ARNS for the training dataset and test dataset that you
     *            want to use. The datasets must belong to the same project. The
     *            test dataset must be empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DistributeDatasetEntriesRequest withDatasets(
            java.util.Collection<DistributeDataset> datasets) {
        setDatasets(datasets);
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
        if (getDatasets() != null)
            sb.append("Datasets: " + getDatasets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasets() == null) ? 0 : getDatasets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DistributeDatasetEntriesRequest == false)
            return false;
        DistributeDatasetEntriesRequest other = (DistributeDatasetEntriesRequest) obj;

        if (other.getDatasets() == null ^ this.getDatasets() == null)
            return false;
        if (other.getDatasets() != null && other.getDatasets().equals(this.getDatasets()) == false)
            return false;
        return true;
    }
}
