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

/**
 * <p>
 * Provides a summary of the properties of a dataset. For a complete listing,
 * call the <a>DescribeDataset</a> API.
 * </p>
 */
public class DatasetSummary implements Serializable {
    /**
     * <p>
     * The name of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String datasetArn;

    /**
     * <p>
     * The dataset type. One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Items
     * </p>
     * </li>
     * <li>
     * <p>
     * Users
     * </p>
     * </li>
     * <li>
     * <p>
     * Event-Interactions
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String datasetType;

    /**
     * <p>
     * The status of the dataset.
     * </p>
     * <p>
     * A dataset can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String status;

    /**
     * <p>
     * The date and time (in Unix time) that the dataset was created.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The date and time (in Unix time) that the dataset was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         The name of the dataset.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name of the dataset.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the dataset.
     *         </p>
     */
    public String getDatasetArn() {
        return datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetArn <p>
     *            The Amazon Resource Name (ARN) of the dataset.
     *            </p>
     */
    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetArn <p>
     *            The Amazon Resource Name (ARN) of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetSummary withDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
        return this;
    }

    /**
     * <p>
     * The dataset type. One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Items
     * </p>
     * </li>
     * <li>
     * <p>
     * Users
     * </p>
     * </li>
     * <li>
     * <p>
     * Event-Interactions
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The dataset type. One of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Interactions
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Items
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Users
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Event-Interactions
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDatasetType() {
        return datasetType;
    }

    /**
     * <p>
     * The dataset type. One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Items
     * </p>
     * </li>
     * <li>
     * <p>
     * Users
     * </p>
     * </li>
     * <li>
     * <p>
     * Event-Interactions
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param datasetType <p>
     *            The dataset type. One of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Interactions
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Items
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Users
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Event-Interactions
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The dataset type. One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Items
     * </p>
     * </li>
     * <li>
     * <p>
     * Users
     * </p>
     * </li>
     * <li>
     * <p>
     * Event-Interactions
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param datasetType <p>
     *            The dataset type. One of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Interactions
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Items
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Users
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Event-Interactions
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetSummary withDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }

    /**
     * <p>
     * The status of the dataset.
     * </p>
     * <p>
     * A dataset can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The status of the dataset.
     *         </p>
     *         <p>
     *         A dataset can be in one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE
     *         FAILED
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE PENDING &gt; DELETE IN_PROGRESS
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the dataset.
     * </p>
     * <p>
     * A dataset can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param status <p>
     *            The status of the dataset.
     *            </p>
     *            <p>
     *            A dataset can be in one of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE
     *            FAILED
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DELETE PENDING &gt; DELETE IN_PROGRESS
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the dataset.
     * </p>
     * <p>
     * A dataset can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param status <p>
     *            The status of the dataset.
     *            </p>
     *            <p>
     *            A dataset can be in one of the following states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE
     *            FAILED
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DELETE PENDING &gt; DELETE IN_PROGRESS
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the dataset was created.
     * </p>
     *
     * @return <p>
     *         The date and time (in Unix time) that the dataset was created.
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the dataset was created.
     * </p>
     *
     * @param creationDateTime <p>
     *            The date and time (in Unix time) that the dataset was created.
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the dataset was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The date and time (in Unix time) that the dataset was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetSummary withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the dataset was last updated.
     * </p>
     *
     * @return <p>
     *         The date and time (in Unix time) that the dataset was last
     *         updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the dataset was last updated.
     * </p>
     *
     * @param lastUpdatedDateTime <p>
     *            The date and time (in Unix time) that the dataset was last
     *            updated.
     *            </p>
     */
    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the dataset was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedDateTime <p>
     *            The date and time (in Unix time) that the dataset was last
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDatasetArn() != null)
            sb.append("datasetArn: " + getDatasetArn() + ",");
        if (getDatasetType() != null)
            sb.append("datasetType: " + getDatasetType() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getCreationDateTime() != null)
            sb.append("creationDateTime: " + getCreationDateTime() + ",");
        if (getLastUpdatedDateTime() != null)
            sb.append("lastUpdatedDateTime: " + getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetSummary == false)
            return false;
        DatasetSummary other = (DatasetSummary) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null
                && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null
                && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null
                && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null
                && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }
}
