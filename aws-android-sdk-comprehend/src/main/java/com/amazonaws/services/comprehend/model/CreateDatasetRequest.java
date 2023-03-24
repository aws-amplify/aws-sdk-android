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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a dataset to upload training or test data for a model associated with
 * a flywheel. For more information about datasets, see <a href=
 * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
 * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
 * </p>
 */
public class CreateDatasetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel of the flywheel to
     * receive the data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String flywheelArn;

    /**
     * <p>
     * Name of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String datasetName;

    /**
     * <p>
     * The dataset type. You can specify that the data in a dataset is for
     * training the model or for testing the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     */
    private String datasetType;

    /**
     * <p>
     * Description of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     */
    private String description;

    /**
     * <p>
     * Information about the input data configuration. The type of input data
     * varies based on the format of the input and whether the data is for a
     * classifier model or an entity recognition model.
     * </p>
     */
    private DatasetInputDataConfig inputDataConfig;

    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request
     * token, Amazon Comprehend generates one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * Tags for the dataset.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel of the flywheel to
     * receive the data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of the flywheel of the flywheel
     *         to receive the data.
     *         </p>
     */
    public String getFlywheelArn() {
        return flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel of the flywheel to
     * receive the data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param flywheelArn <p>
     *            The Amazon Resource Number (ARN) of the flywheel of the
     *            flywheel to receive the data.
     *            </p>
     */
    public void setFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel of the flywheel to
     * receive the data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:flywheel
     * /[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param flywheelArn <p>
     *            The Amazon Resource Number (ARN) of the flywheel of the
     *            flywheel to receive the data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetRequest withFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
        return this;
    }

    /**
     * <p>
     * Name of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         Name of the dataset.
     *         </p>
     */
    public String getDatasetName() {
        return datasetName;
    }

    /**
     * <p>
     * Name of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param datasetName <p>
     *            Name of the dataset.
     *            </p>
     */
    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * Name of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param datasetName <p>
     *            Name of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetRequest withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    /**
     * <p>
     * The dataset type. You can specify that the data in a dataset is for
     * training the model or for testing the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @return <p>
     *         The dataset type. You can specify that the data in a dataset is
     *         for training the model or for testing the model.
     *         </p>
     * @see DatasetType
     */
    public String getDatasetType() {
        return datasetType;
    }

    /**
     * <p>
     * The dataset type. You can specify that the data in a dataset is for
     * training the model or for testing the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            The dataset type. You can specify that the data in a dataset
     *            is for training the model or for testing the model.
     *            </p>
     * @see DatasetType
     */
    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The dataset type. You can specify that the data in a dataset is for
     * training the model or for testing the model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            The dataset type. You can specify that the data in a dataset
     *            is for training the model or for testing the model.
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
     * The dataset type. You can specify that the data in a dataset is for
     * training the model or for testing the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            The dataset type. You can specify that the data in a dataset
     *            is for training the model or for testing the model.
     *            </p>
     * @see DatasetType
     */
    public void setDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
    }

    /**
     * <p>
     * The dataset type. You can specify that the data in a dataset is for
     * training the model or for testing the model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param datasetType <p>
     *            The dataset type. You can specify that the data in a dataset
     *            is for training the model or for testing the model.
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
     * Description of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @return <p>
     *         Description of the dataset.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Description of the dataset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @param description <p>
     *            Description of the dataset.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$<br/>
     *
     * @param description <p>
     *            Description of the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Information about the input data configuration. The type of input data
     * varies based on the format of the input and whether the data is for a
     * classifier model or an entity recognition model.
     * </p>
     *
     * @return <p>
     *         Information about the input data configuration. The type of input
     *         data varies based on the format of the input and whether the data
     *         is for a classifier model or an entity recognition model.
     *         </p>
     */
    public DatasetInputDataConfig getInputDataConfig() {
        return inputDataConfig;
    }

    /**
     * <p>
     * Information about the input data configuration. The type of input data
     * varies based on the format of the input and whether the data is for a
     * classifier model or an entity recognition model.
     * </p>
     *
     * @param inputDataConfig <p>
     *            Information about the input data configuration. The type of
     *            input data varies based on the format of the input and whether
     *            the data is for a classifier model or an entity recognition
     *            model.
     *            </p>
     */
    public void setInputDataConfig(DatasetInputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * Information about the input data configuration. The type of input data
     * varies based on the format of the input and whether the data is for a
     * classifier model or an entity recognition model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDataConfig <p>
     *            Information about the input data configuration. The type of
     *            input data varies based on the format of the input and whether
     *            the data is for a classifier model or an entity recognition
     *            model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetRequest withInputDataConfig(DatasetInputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request
     * token, Amazon Comprehend generates one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @return <p>
     *         A unique identifier for the request. If you don't set the client
     *         request token, Amazon Comprehend generates one.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request
     * token, Amazon Comprehend generates one.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @param clientRequestToken <p>
     *            A unique identifier for the request. If you don't set the
     *            client request token, Amazon Comprehend generates one.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for the request. If you don't set the client request
     * token, Amazon Comprehend generates one.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @param clientRequestToken <p>
     *            A unique identifier for the request. If you don't set the
     *            client request token, Amazon Comprehend generates one.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * Tags for the dataset.
     * </p>
     *
     * @return <p>
     *         Tags for the dataset.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags for the dataset.
     * </p>
     *
     * @param tags <p>
     *            Tags for the dataset.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags for the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags for the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Tags for the dataset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags for the dataset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDatasetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getFlywheelArn() != null)
            sb.append("FlywheelArn: " + getFlywheelArn() + ",");
        if (getDatasetName() != null)
            sb.append("DatasetName: " + getDatasetName() + ",");
        if (getDatasetType() != null)
            sb.append("DatasetType: " + getDatasetType() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: " + getInputDataConfig() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFlywheelArn() == null) ? 0 : getFlywheelArn().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode
                + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

        if (other.getFlywheelArn() == null ^ this.getFlywheelArn() == null)
            return false;
        if (other.getFlywheelArn() != null
                && other.getFlywheelArn().equals(this.getFlywheelArn()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null
                && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null
                && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null
                && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
