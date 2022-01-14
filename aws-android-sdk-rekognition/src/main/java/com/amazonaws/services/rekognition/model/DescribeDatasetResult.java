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

public class DescribeDatasetResult implements Serializable {
    /**
     * <p>
     * The description for the dataset.
     * </p>
     */
    private DatasetDescription datasetDescription;

    /**
     * <p>
     * The description for the dataset.
     * </p>
     *
     * @return <p>
     *         The description for the dataset.
     *         </p>
     */
    public DatasetDescription getDatasetDescription() {
        return datasetDescription;
    }

    /**
     * <p>
     * The description for the dataset.
     * </p>
     *
     * @param datasetDescription <p>
     *            The description for the dataset.
     *            </p>
     */
    public void setDatasetDescription(DatasetDescription datasetDescription) {
        this.datasetDescription = datasetDescription;
    }

    /**
     * <p>
     * The description for the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasetDescription <p>
     *            The description for the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDatasetResult withDatasetDescription(DatasetDescription datasetDescription) {
        this.datasetDescription = datasetDescription;
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
        if (getDatasetDescription() != null)
            sb.append("DatasetDescription: " + getDatasetDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDatasetDescription() == null) ? 0 : getDatasetDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatasetResult == false)
            return false;
        DescribeDatasetResult other = (DescribeDatasetResult) obj;

        if (other.getDatasetDescription() == null ^ this.getDatasetDescription() == null)
            return false;
        if (other.getDatasetDescription() != null
                && other.getDatasetDescription().equals(this.getDatasetDescription()) == false)
            return false;
        return true;
    }
}
