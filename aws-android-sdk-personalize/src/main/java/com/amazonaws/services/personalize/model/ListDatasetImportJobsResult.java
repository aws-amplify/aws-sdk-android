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

public class ListDatasetImportJobsResult implements Serializable {
    /**
     * <p>
     * The list of dataset import jobs.
     * </p>
     */
    private java.util.List<DatasetImportJobSummary> datasetImportJobs;

    /**
     * <p>
     * A token for getting the next set of dataset import jobs (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The list of dataset import jobs.
     * </p>
     *
     * @return <p>
     *         The list of dataset import jobs.
     *         </p>
     */
    public java.util.List<DatasetImportJobSummary> getDatasetImportJobs() {
        return datasetImportJobs;
    }

    /**
     * <p>
     * The list of dataset import jobs.
     * </p>
     *
     * @param datasetImportJobs <p>
     *            The list of dataset import jobs.
     *            </p>
     */
    public void setDatasetImportJobs(java.util.Collection<DatasetImportJobSummary> datasetImportJobs) {
        if (datasetImportJobs == null) {
            this.datasetImportJobs = null;
            return;
        }

        this.datasetImportJobs = new java.util.ArrayList<DatasetImportJobSummary>(datasetImportJobs);
    }

    /**
     * <p>
     * The list of dataset import jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasetImportJobs <p>
     *            The list of dataset import jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetImportJobsResult withDatasetImportJobs(
            DatasetImportJobSummary... datasetImportJobs) {
        if (getDatasetImportJobs() == null) {
            this.datasetImportJobs = new java.util.ArrayList<DatasetImportJobSummary>(
                    datasetImportJobs.length);
        }
        for (DatasetImportJobSummary value : datasetImportJobs) {
            this.datasetImportJobs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of dataset import jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasetImportJobs <p>
     *            The list of dataset import jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetImportJobsResult withDatasetImportJobs(
            java.util.Collection<DatasetImportJobSummary> datasetImportJobs) {
        setDatasetImportJobs(datasetImportJobs);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of dataset import jobs (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @return <p>
     *         A token for getting the next set of dataset import jobs (if they
     *         exist).
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of dataset import jobs (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of dataset import jobs (if
     *            they exist).
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of dataset import jobs (if they exist).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of dataset import jobs (if
     *            they exist).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDatasetImportJobsResult withNextToken(String nextToken) {
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
        if (getDatasetImportJobs() != null)
            sb.append("datasetImportJobs: " + getDatasetImportJobs() + ",");
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
                + ((getDatasetImportJobs() == null) ? 0 : getDatasetImportJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDatasetImportJobsResult == false)
            return false;
        ListDatasetImportJobsResult other = (ListDatasetImportJobsResult) obj;

        if (other.getDatasetImportJobs() == null ^ this.getDatasetImportJobs() == null)
            return false;
        if (other.getDatasetImportJobs() != null
                && other.getDatasetImportJobs().equals(this.getDatasetImportJobs()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
