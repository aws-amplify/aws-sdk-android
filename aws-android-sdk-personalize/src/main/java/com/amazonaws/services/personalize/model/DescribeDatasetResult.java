/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

public class DescribeDatasetResult implements Serializable {
    /**
     * <p>
     * A listing of the dataset's properties.
     * </p>
     */
    private Dataset dataset;

    /**
     * <p>
     * A listing of the dataset's properties.
     * </p>
     *
     * @return <p>
     *         A listing of the dataset's properties.
     *         </p>
     */
    public Dataset getDataset() {
        return dataset;
    }

    /**
     * <p>
     * A listing of the dataset's properties.
     * </p>
     *
     * @param dataset <p>
     *            A listing of the dataset's properties.
     *            </p>
     */
    public void setDataset(Dataset dataset) {
        this.dataset = dataset;
    }

    /**
     * <p>
     * A listing of the dataset's properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataset <p>
     *            A listing of the dataset's properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDatasetResult withDataset(Dataset dataset) {
        this.dataset = dataset;
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
        if (getDataset() != null)
            sb.append("dataset: " + getDataset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataset() == null) ? 0 : getDataset().hashCode());
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

        if (other.getDataset() == null ^ this.getDataset() == null)
            return false;
        if (other.getDataset() != null && other.getDataset().equals(this.getDataset()) == false)
            return false;
        return true;
    }
}
