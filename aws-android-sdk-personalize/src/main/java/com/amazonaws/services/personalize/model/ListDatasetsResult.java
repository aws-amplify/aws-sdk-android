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

public class ListDatasetsResult implements Serializable {
    /**
     * <p>
     * An array of <code>Dataset</code> objects. Each object provides metadata
     * information.
     * </p>
     */
    private java.util.List<DatasetSummary> datasets;

    /**
     * <p>
     * A token for getting the next set of datasets (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>Dataset</code> objects. Each object provides metadata
     * information.
     * </p>
     *
     * @return <p>
     *         An array of <code>Dataset</code> objects. Each object provides
     *         metadata information.
     *         </p>
     */
    public java.util.List<DatasetSummary> getDatasets() {
        return datasets;
    }

    /**
     * <p>
     * An array of <code>Dataset</code> objects. Each object provides metadata
     * information.
     * </p>
     *
     * @param datasets <p>
     *            An array of <code>Dataset</code> objects. Each object provides
     *            metadata information.
     *            </p>
     */
    public void setDatasets(java.util.Collection<DatasetSummary> datasets) {
        if (datasets == null) {
            this.datasets = null;
            return;
        }

        this.datasets = new java.util.ArrayList<DatasetSummary>(datasets);
    }

    /**
     * <p>
     * An array of <code>Dataset</code> objects. Each object provides metadata
     * information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasets <p>
     *            An array of <code>Dataset</code> objects. Each object provides
     *            metadata information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetsResult withDatasets(DatasetSummary... datasets) {
        if (getDatasets() == null) {
            this.datasets = new java.util.ArrayList<DatasetSummary>(datasets.length);
        }
        for (DatasetSummary value : datasets) {
            this.datasets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Dataset</code> objects. Each object provides metadata
     * information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasets <p>
     *            An array of <code>Dataset</code> objects. Each object provides
     *            metadata information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetsResult withDatasets(java.util.Collection<DatasetSummary> datasets) {
        setDatasets(datasets);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of datasets (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @return <p>
     *         A token for getting the next set of datasets (if they exist).
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of datasets (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of datasets (if they exist).
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of datasets (if they exist).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of datasets (if they exist).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
            sb.append("datasets: " + getDatasets() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasets() == null) ? 0 : getDatasets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDatasetsResult == false)
            return false;
        ListDatasetsResult other = (ListDatasetsResult) obj;

        if (other.getDatasets() == null ^ this.getDatasets() == null)
            return false;
        if (other.getDatasets() != null && other.getDatasets().equals(this.getDatasets()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
