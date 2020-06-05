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
 * Creates an empty dataset group. A dataset group contains related datasets
 * that supply data for training a model. A dataset group can contain at most
 * three datasets, one for each type of dataset:
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
 * To train a model (create a solution), a dataset group that contains an
 * <code>Interactions</code> dataset is required. Call <a>CreateDataset</a> to
 * add a dataset to the group.
 * </p>
 * <p>
 * A dataset group can be in one of the following states:
 * </p>
 * <ul>
 * <li>
 * <p>
 * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
 * </p>
 * </li>
 * <li>
 * <p>
 * DELETE PENDING
 * </p>
 * </li>
 * </ul>
 * <p>
 * To get the status of the dataset group, call <a>DescribeDatasetGroup</a>. If
 * the status shows as CREATE FAILED, the response includes a
 * <code>failureReason</code> key, which describes why the creation failed.
 * </p>
 * <note>
 * <p>
 * You must wait until the <code>status</code> of the dataset group is
 * <code>ACTIVE</code> before adding a dataset to the group.
 * </p>
 * </note>
 * <p>
 * You can specify an AWS Key Management Service (KMS) key to encrypt the
 * datasets in the group. If you specify a KMS key, you must also include an AWS
 * Identity and Access Management (IAM) role that has permission to access the
 * key.
 * </p>
 * <p class="title">
 * <b>APIs that require a dataset group ARN in the request</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateDataset</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateEventTracker</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateSolution</a>
 * </p>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Related APIs</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListDatasetGroups</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeDatasetGroup</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteDatasetGroup</a>
 * </p>
 * </li>
 * </ul>
 */
public class CreateDatasetGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name for the new dataset group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String name;

    /**
     * <p>
     * The ARN of the IAM role that has permissions to access the KMS key.
     * Supplying an IAM role is only valid when also specifying a KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     */
    private String roleArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a KMS key used to encrypt the datasets.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The name for the new dataset group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         The name for the new dataset group.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name for the new dataset group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name for the new dataset group.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the new dataset group.
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
     *            The name for the new dataset group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetGroupRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that has permissions to access the KMS key.
     * Supplying an IAM role is only valid when also specifying a KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     *
     * @return <p>
     *         The ARN of the IAM role that has permissions to access the KMS
     *         key. Supplying an IAM role is only valid when also specifying a
     *         KMS key.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that has permissions to access the KMS key.
     * Supplying an IAM role is only valid when also specifying a KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     *
     * @param roleArn <p>
     *            The ARN of the IAM role that has permissions to access the KMS
     *            key. Supplying an IAM role is only valid when also specifying
     *            a KMS key.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that has permissions to access the KMS key.
     * Supplying an IAM role is only valid when also specifying a KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+
     * <br/>
     *
     * @param roleArn <p>
     *            The ARN of the IAM role that has permissions to access the KMS
     *            key. Supplying an IAM role is only valid when also specifying
     *            a KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetGroupRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a KMS key used to encrypt the datasets.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of a KMS key used to encrypt the
     *         datasets.
     *         </p>
     */
    public String getKmsKeyArn() {
        return kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a KMS key used to encrypt the datasets.
     * </p>
     *
     * @param kmsKeyArn <p>
     *            The Amazon Resource Name (ARN) of a KMS key used to encrypt
     *            the datasets.
     *            </p>
     */
    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a KMS key used to encrypt the datasets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyArn <p>
     *            The Amazon Resource Name (ARN) of a KMS key used to encrypt
     *            the datasets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetGroupRequest withKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
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
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getKmsKeyArn() != null)
            sb.append("kmsKeyArn: " + getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatasetGroupRequest == false)
            return false;
        CreateDatasetGroupRequest other = (CreateDatasetGroupRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null
                && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }
}
