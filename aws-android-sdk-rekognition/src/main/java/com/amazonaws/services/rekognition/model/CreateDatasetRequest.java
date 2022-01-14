/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new Amazon Rekognition Custom Labels dataset. You can create a
 * dataset by using an Amazon Sagemaker format manifest file or by copying an
 * existing Amazon Rekognition Custom Labels dataset.
 * </p>
 * <p>
 * To create a training dataset for a project, specify <code>train</code> for
 * the value of <code>DatasetType</code>. To create the test dataset for a
 * project, specify <code>test</code> for the value of <code>DatasetType</code>.
 * </p>
 * <p>
 * The response from <code>CreateDataset</code> is the Amazon Resource Name
 * (ARN) for the dataset. Creating a dataset takes a while to complete. Use
 * <a>DescribeDataset</a> to check the current status. The dataset created
 * successfully if the value of <code>Status</code> is
 * <code>CREATE_COMPLETE</code>.
 * </p>
 * <p>
 * To check if any non-terminal errors occurred, call <a>ListDatasetEntries</a>
 * and check for the presence of <code>errors</code> lists in the JSON Lines.
 * </p>
 * <p>
 * Dataset creation fails if a terminal error occurs (<code>Status</code> =
 * <code>CREATE_FAILED</code>). Currently, you can't access the terminal error
 * information.
 * </p>
 * <p>
 * For more information, see Creating dataset in the <i>Amazon Rekognition
 * Custom Labels Developer Guide</i>.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:CreateDataset</code> action. If you want to copy an
 * existing dataset, you also require permission to perform the
 * <code>rekognition:ListDatasetEntries</code> action.
 * </p>
 */
public class CreateDatasetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The source files for the dataset. You can specify the ARN of an existing
     * dataset or specify the Amazon S3 bucket location of an Amazon Sagemaker
     * format manifest file. If you don't specify <code>datasetSource</code>, an
     * empty dataset is created. To add labeled images to the dataset, You can
     * use the console or call <a>UpdateDatasetEntries</a>.
     * </p>
     */
    private DatasetSource datasetSource;

    /**
     * <p>
     * The type of the dataset. Specify <code>train</code> to create a training
     * dataset. Specify <code>test</code> to create a test dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     */
    private String datasetType;

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project to which you want
     * to asssign the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     */
    private String projectArn;

    /**
     * <p>
     * The source files for the dataset. You can specify the ARN of an existing
     * dataset or specify the Amazon S3 bucket location of an Amazon Sagemaker
     * format manifest file. If you don't specify <code>datasetSource</code>, an
     * empty dataset is created. To add labeled images to the dataset, You can
     * use the console or call <a>UpdateDatasetEntries</a>.
     * </p>
     *
     * @return <p>
     *         The source files for the dataset. You can specify the ARN of an
     *         existing dataset or specify the Amazon S3 bucket location of an
     *         Amazon Sagemaker format manifest file. If you don't specify
     *         <code>datasetSource</code>, an empty dataset is created. To add
     *         labeled images to the dataset, You can use the console or call
     *         <a>UpdateDatasetEntries</a>.
     *         </p>
     */
    public DatasetSource getDatasetSource() {
        return datasetSource;
    }

    /**
     * <p>
     * The source files for the dataset. You can specify the ARN of an existing
     * dataset or specify the Amazon S3 bucket location of an Amazon Sagemaker
     * format manifest file. If you don't specify <code>datasetSource</code>, an
     * empty dataset is created. To add labeled images to the dataset, You can
     * use the console or call <a>UpdateDatasetEntries</a>.
     * </p>
     *
     * @param datasetSource <p>
     *            The source files for the dataset. You can specify the ARN of
     *            an existing dataset or specify the Amazon S3 bucket location
     *            of an Amazon Sagemaker format manifest file. If you don't
     *            specify <code>datasetSource</code>, an empty dataset is
     *            created. To add labeled images to the dataset, You can use the
     *            console or call <a>UpdateDatasetEntries</a>.
     *            </p>
     */
    public void setDatasetSource(DatasetSource datasetSource) {
        this.datasetSource = datasetSource;
    }

    /**
     * <p>
     * The source files for the dataset. You can specify the ARN of an existing
     * dataset or specify the Amazon S3 bucket location of an Amazon Sagemaker
     * format manifest file. If you don't specify <code>datasetSource</code>, an
     * empty dataset is created. To add labeled images to the dataset, You can
     * use the console or call <a>UpdateDatasetEntries</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param datasetSource <p>
     *            The source files for the dataset. You can specify the ARN of
     *            an existing dataset or specify the Amazon S3 bucket location
     *            of an Amazon Sagemaker format manifest file. If you don't
     *            specify <code>datasetSource</code>, an empty dataset is
     *            created. To add labeled images to the dataset, You can use the
     *            console or call <a>UpdateDatasetEntries</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetRequest withDatasetSource(DatasetSource datasetSource) {
        this.datasetSource = datasetSource;
        return this;
    }

    /**
     * <p>
     * The type of the dataset. Specify <code>train</code> to create a training
     * dataset. Specify <code>test</code> to create a test dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @return <p>
     *         The type of the dataset. Specify <code>train</code> to create a
     *         training dataset. Specify <code>test</code> to create a test
     *         dataset.
     *         </p>
     * @see DatasetType
     */
    public String getDatasetType() {
        return datasetType;
    }

    /**
     * <p>
     * The type of the dataset. Specify <code>train</code> to create a training
     * dataset. Specify <code>test</code> to create a test dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            The type of the dataset. Specify <code>train</code> to create
     *            a training dataset. Specify <code>test</code> to create a test
     *            dataset.
     *            </p>
     * @see DatasetType
     */
    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The type of the dataset. Specify <code>train</code> to create a training
     * dataset. Specify <code>test</code> to create a test dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            The type of the dataset. Specify <code>train</code> to create
     *            a training dataset. Specify <code>test</code> to create a test
     *            dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetType
     */
    public CreateDatasetRequest withDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }

    /**
     * <p>
     * The type of the dataset. Specify <code>train</code> to create a training
     * dataset. Specify <code>test</code> to create a test dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            The type of the dataset. Specify <code>train</code> to create
     *            a training dataset. Specify <code>test</code> to create a test
     *            dataset.
     *            </p>
     * @see DatasetType
     */
    public void setDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
    }

    /**
     * <p>
     * The type of the dataset. Specify <code>train</code> to create a training
     * dataset. Specify <code>test</code> to create a test dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            The type of the dataset. Specify <code>train</code> to create
     *            a training dataset. Specify <code>test</code> to create a test
     *            dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetType
     */
    public CreateDatasetRequest withDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project to which you want
     * to asssign the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @return <p>
     *         The ARN of the Amazon Rekognition Custom Labels project to which
     *         you want to asssign the dataset.
     *         </p>
     */
    public String getProjectArn() {
        return projectArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project to which you want
     * to asssign the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectArn <p>
     *            The ARN of the Amazon Rekognition Custom Labels project to
     *            which you want to asssign the dataset.
     *            </p>
     */
    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project to which you want
     * to asssign the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:project\/[a-zA
     * -Z0-9_.\-]{1,255}\/[0-9]+$)<br/>
     *
     * @param projectArn <p>
     *            The ARN of the Amazon Rekognition Custom Labels project to
     *            which you want to asssign the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetRequest withProjectArn(String projectArn) {
        this.projectArn = projectArn;
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
        if (getDatasetSource() != null)
            sb.append("DatasetSource: " + getDatasetSource() + ",");
        if (getDatasetType() != null)
            sb.append("DatasetType: " + getDatasetType() + ",");
        if (getProjectArn() != null)
            sb.append("ProjectArn: " + getProjectArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDatasetSource() == null) ? 0 : getDatasetSource().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
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

        if (other.getDatasetSource() == null ^ this.getDatasetSource() == null)
            return false;
        if (other.getDatasetSource() != null
                && other.getDatasetSource().equals(this.getDatasetSource()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null
                && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null
                && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        return true;
    }
}
