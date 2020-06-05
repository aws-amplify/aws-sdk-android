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

public class DescribeDatasetGroupResult implements Serializable {
    /**
     * <p>
     * A listing of the dataset group's properties.
     * </p>
     */
    private DatasetGroup datasetGroup;

    /**
     * <p>
     * A listing of the dataset group's properties.
     * </p>
     *
     * @return <p>
     *         A listing of the dataset group's properties.
     *         </p>
     */
    public DatasetGroup getDatasetGroup() {
        return datasetGroup;
    }

    /**
     * <p>
     * A listing of the dataset group's properties.
     * </p>
     *
     * @param datasetGroup <p>
     *            A listing of the dataset group's properties.
     *            </p>
     */
    public void setDatasetGroup(DatasetGroup datasetGroup) {
        this.datasetGroup = datasetGroup;
    }

    /**
     * <p>
     * A listing of the dataset group's properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasetGroup <p>
     *            A listing of the dataset group's properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDatasetGroupResult withDatasetGroup(DatasetGroup datasetGroup) {
        this.datasetGroup = datasetGroup;
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
        if (getDatasetGroup() != null)
            sb.append("datasetGroup: " + getDatasetGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDatasetGroup() == null) ? 0 : getDatasetGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatasetGroupResult == false)
            return false;
        DescribeDatasetGroupResult other = (DescribeDatasetGroupResult) obj;

        if (other.getDatasetGroup() == null ^ this.getDatasetGroup() == null)
            return false;
        if (other.getDatasetGroup() != null
                && other.getDatasetGroup().equals(this.getDatasetGroup()) == false)
            return false;
        return true;
    }
}
