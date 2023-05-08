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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class DescribeDatasetResult implements Serializable {
    /**
     * <p>
     * The dataset properties.
     * </p>
     */
    private DatasetProperties datasetProperties;

    /**
     * <p>
     * The dataset properties.
     * </p>
     *
     * @return <p>
     *         The dataset properties.
     *         </p>
     */
    public DatasetProperties getDatasetProperties() {
        return datasetProperties;
    }

    /**
     * <p>
     * The dataset properties.
     * </p>
     *
     * @param datasetProperties <p>
     *            The dataset properties.
     *            </p>
     */
    public void setDatasetProperties(DatasetProperties datasetProperties) {
        this.datasetProperties = datasetProperties;
    }

    /**
     * <p>
     * The dataset properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasetProperties <p>
     *            The dataset properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDatasetResult withDatasetProperties(DatasetProperties datasetProperties) {
        this.datasetProperties = datasetProperties;
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
        if (getDatasetProperties() != null)
            sb.append("DatasetProperties: " + getDatasetProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDatasetProperties() == null) ? 0 : getDatasetProperties().hashCode());
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

        if (other.getDatasetProperties() == null ^ this.getDatasetProperties() == null)
            return false;
        if (other.getDatasetProperties() != null
                && other.getDatasetProperties().equals(this.getDatasetProperties()) == false)
            return false;
        return true;
    }
}
