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

public class DescribeDatasetImportJobResult implements Serializable {
    /**
     * <p>
     * Information about the dataset import job, including the status.
     * </p>
     * <p>
     * The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     */
    private DatasetImportJob datasetImportJob;

    /**
     * <p>
     * Information about the dataset import job, including the status.
     * </p>
     * <p>
     * The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Information about the dataset import job, including the status.
     *         </p>
     *         <p>
     *         The status is one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE IN_PROGRESS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE FAILED
     *         </p>
     *         </li>
     *         </ul>
     */
    public DatasetImportJob getDatasetImportJob() {
        return datasetImportJob;
    }

    /**
     * <p>
     * Information about the dataset import job, including the status.
     * </p>
     * <p>
     * The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     *
     * @param datasetImportJob <p>
     *            Information about the dataset import job, including the
     *            status.
     *            </p>
     *            <p>
     *            The status is one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CREATE PENDING
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CREATE IN_PROGRESS
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ACTIVE
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CREATE FAILED
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDatasetImportJob(DatasetImportJob datasetImportJob) {
        this.datasetImportJob = datasetImportJob;
    }

    /**
     * <p>
     * Information about the dataset import job, including the status.
     * </p>
     * <p>
     * The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasetImportJob <p>
     *            Information about the dataset import job, including the
     *            status.
     *            </p>
     *            <p>
     *            The status is one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CREATE PENDING
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CREATE IN_PROGRESS
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ACTIVE
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CREATE FAILED
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDatasetImportJobResult withDatasetImportJob(DatasetImportJob datasetImportJob) {
        this.datasetImportJob = datasetImportJob;
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
        if (getDatasetImportJob() != null)
            sb.append("datasetImportJob: " + getDatasetImportJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDatasetImportJob() == null) ? 0 : getDatasetImportJob().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatasetImportJobResult == false)
            return false;
        DescribeDatasetImportJobResult other = (DescribeDatasetImportJobResult) obj;

        if (other.getDatasetImportJob() == null ^ this.getDatasetImportJob() == null)
            return false;
        if (other.getDatasetImportJob() != null
                && other.getDatasetImportJob().equals(this.getDatasetImportJob()) == false)
            return false;
        return true;
    }
}
