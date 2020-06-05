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

public class ListDatasetGroupsResult implements Serializable {
    /**
     * <p>
     * The list of your dataset groups.
     * </p>
     */
    private java.util.List<DatasetGroupSummary> datasetGroups;

    /**
     * <p>
     * A token for getting the next set of dataset groups (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The list of your dataset groups.
     * </p>
     *
     * @return <p>
     *         The list of your dataset groups.
     *         </p>
     */
    public java.util.List<DatasetGroupSummary> getDatasetGroups() {
        return datasetGroups;
    }

    /**
     * <p>
     * The list of your dataset groups.
     * </p>
     *
     * @param datasetGroups <p>
     *            The list of your dataset groups.
     *            </p>
     */
    public void setDatasetGroups(java.util.Collection<DatasetGroupSummary> datasetGroups) {
        if (datasetGroups == null) {
            this.datasetGroups = null;
            return;
        }

        this.datasetGroups = new java.util.ArrayList<DatasetGroupSummary>(datasetGroups);
    }

    /**
     * <p>
     * The list of your dataset groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasetGroups <p>
     *            The list of your dataset groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetGroupsResult withDatasetGroups(DatasetGroupSummary... datasetGroups) {
        if (getDatasetGroups() == null) {
            this.datasetGroups = new java.util.ArrayList<DatasetGroupSummary>(datasetGroups.length);
        }
        for (DatasetGroupSummary value : datasetGroups) {
            this.datasetGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of your dataset groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasetGroups <p>
     *            The list of your dataset groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetGroupsResult withDatasetGroups(
            java.util.Collection<DatasetGroupSummary> datasetGroups) {
        setDatasetGroups(datasetGroups);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of dataset groups (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @return <p>
     *         A token for getting the next set of dataset groups (if they
     *         exist).
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of dataset groups (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of dataset groups (if they
     *            exist).
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of dataset groups (if they exist).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of dataset groups (if they
     *            exist).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetGroupsResult withNextToken(String nextToken) {
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
        if (getDatasetGroups() != null)
            sb.append("datasetGroups: " + getDatasetGroups() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDatasetGroups() == null) ? 0 : getDatasetGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDatasetGroupsResult == false)
            return false;
        ListDatasetGroupsResult other = (ListDatasetGroupsResult) obj;

        if (other.getDatasetGroups() == null ^ this.getDatasetGroups() == null)
            return false;
        if (other.getDatasetGroups() != null
                && other.getDatasetGroups().equals(this.getDatasetGroups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
