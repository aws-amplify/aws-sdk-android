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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an empty dataset and adds it to the specified dataset group. Use
 * <a>CreateDatasetImportJob</a> to import your training data to a dataset.
 * </p>
 * <p>
 * There are three types of datasets:
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
 * </ul>
 * <p>
 * Each dataset type has an associated schema with required field types. Only
 * the <code>Interactions</code> dataset is required in order to train a model
 * (also referred to as creating a solution).
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
 * To get the status of the dataset, call <a>DescribeDataset</a>.
 * </p>
 * <p class="title">
 * <b>Related APIs</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateDatasetGroup</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListDatasets</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeDataset</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteDataset</a>
 * </p>
 * </li>
 * </ul>
 */
public class CreateDatasetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String name;

    /**
     * <p>
     * The ARN of the schema to associate with the dataset. The schema defines
     * the dataset fields.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String schemaArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group to add the dataset
     * to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String datasetGroupArn;

    /**
     * <p>
     * The type of dataset.
     * </p>
     * <p>
     * One of the following (case insensitive) values:
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
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String datasetType;

    /**
     * <p>
     * The name for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         The name for the dataset.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name for the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name for the dataset.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the dataset.
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
     *            The name for the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ARN of the schema to associate with the dataset. The schema defines
     * the dataset fields.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the schema to associate with the dataset. The schema
     *         defines the dataset fields.
     *         </p>
     */
    public String getSchemaArn() {
        return schemaArn;
    }

    /**
     * <p>
     * The ARN of the schema to associate with the dataset. The schema defines
     * the dataset fields.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param schemaArn <p>
     *            The ARN of the schema to associate with the dataset. The
     *            schema defines the dataset fields.
     *            </p>
     */
    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The ARN of the schema to associate with the dataset. The schema defines
     * the dataset fields.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param schemaArn <p>
     *            The ARN of the schema to associate with the dataset. The
     *            schema defines the dataset fields.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetRequest withSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group to add the dataset
     * to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the dataset group to add the
     *         dataset to.
     *         </p>
     */
    public String getDatasetGroupArn() {
        return datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group to add the dataset
     * to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetGroupArn <p>
     *            The Amazon Resource Name (ARN) of the dataset group to add the
     *            dataset to.
     *            </p>
     */
    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group to add the dataset
     * to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param datasetGroupArn <p>
     *            The Amazon Resource Name (ARN) of the dataset group to add the
     *            dataset to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetRequest withDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
        return this;
    }

    /**
     * <p>
     * The type of dataset.
     * </p>
     * <p>
     * One of the following (case insensitive) values:
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
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The type of dataset.
     *         </p>
     *         <p>
     *         One of the following (case insensitive) values:
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
     *         </ul>
     */
    public String getDatasetType() {
        return datasetType;
    }

    /**
     * <p>
     * The type of dataset.
     * </p>
     * <p>
     * One of the following (case insensitive) values:
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
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param datasetType <p>
     *            The type of dataset.
     *            </p>
     *            <p>
     *            One of the following (case insensitive) values:
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
     *            </ul>
     */
    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The type of dataset.
     * </p>
     * <p>
     * One of the following (case insensitive) values:
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
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param datasetType <p>
     *            The type of dataset.
     *            </p>
     *            <p>
     *            One of the following (case insensitive) values:
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
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetRequest withDatasetType(String datasetType) {
        this.datasetType = datasetType;
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
        if (getSchemaArn() != null)
            sb.append("schemaArn: " + getSchemaArn() + ",");
        if (getDatasetGroupArn() != null)
            sb.append("datasetGroupArn: " + getDatasetGroupArn() + ",");
        if (getDatasetType() != null)
            sb.append("datasetType: " + getDatasetType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatasetRequest == false)
            return false;
        CreateDatasetRequest other = (CreateDatasetRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null
                && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null
                && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null
                && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        return true;
    }
}
