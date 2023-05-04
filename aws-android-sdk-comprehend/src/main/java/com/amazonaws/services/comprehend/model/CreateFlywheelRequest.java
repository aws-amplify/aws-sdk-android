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
 * A flywheel is an Amazon Web Services resource that orchestrates the ongoing
 * training of a model for custom classification or custom entity recognition.
 * You can create a flywheel to start with an existing trained model, or
 * Comprehend can create and train a new model.
 * </p>
 * <p>
 * When you create the flywheel, Comprehend creates a data lake in your account.
 * The data lake holds the training data and test data for all versions of the
 * model.
 * </p>
 * <p>
 * To use a flywheel with an existing trained model, you specify the active
 * model version. Comprehend copies the model's training data and test data into
 * the flywheel's data lake.
 * </p>
 * <p>
 * To use the flywheel with a new model, you need to provide a dataset for
 * training data (and optional test data) when you create the flywheel.
 * </p>
 * <p>
 * For more information about flywheels, see <a href=
 * "https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html">
 * Flywheel overview</a> in the <i>Amazon Comprehend Developer Guide</i>.
 * </p>
 */
public class CreateFlywheelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Name for the flywheel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String flywheelName;

    /**
     * <p>
     * To associate an existing model with the flywheel, specify the Amazon
     * Resource Number (ARN) of the model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     */
    private String activeModelArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     * Comprehend the permissions required to access the flywheel data in the
     * data lake.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * Configuration about the custom classifier associated with the flywheel.
     * </p>
     */
    private TaskConfig taskConfig;

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_CLASSIFIER, ENTITY_RECOGNIZER
     */
    private String modelType;

    /**
     * <p>
     * Enter the S3 location for the data lake. You can specify a new S3 bucket
     * or a new folder of an existing S3 bucket. The flywheel creates the data
     * lake at this location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     */
    private String dataLakeS3Uri;

    /**
     * <p>
     * Data security configurations.
     * </p>
     */
    private DataSecurityConfig dataSecurityConfig;

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
     * The tags to associate with this flywheel.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Name for the flywheel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         Name for the flywheel.
     *         </p>
     */
    public String getFlywheelName() {
        return flywheelName;
    }

    /**
     * <p>
     * Name for the flywheel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param flywheelName <p>
     *            Name for the flywheel.
     *            </p>
     */
    public void setFlywheelName(String flywheelName) {
        this.flywheelName = flywheelName;
    }

    /**
     * <p>
     * Name for the flywheel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param flywheelName <p>
     *            Name for the flywheel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlywheelRequest withFlywheelName(String flywheelName) {
        this.flywheelName = flywheelName;
        return this;
    }

    /**
     * <p>
     * To associate an existing model with the flywheel, specify the Amazon
     * Resource Number (ARN) of the model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @return <p>
     *         To associate an existing model with the flywheel, specify the
     *         Amazon Resource Number (ARN) of the model version.
     *         </p>
     */
    public String getActiveModelArn() {
        return activeModelArn;
    }

    /**
     * <p>
     * To associate an existing model with the flywheel, specify the Amazon
     * Resource Number (ARN) of the model version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @param activeModelArn <p>
     *            To associate an existing model with the flywheel, specify the
     *            Amazon Resource Number (ARN) of the model version.
     *            </p>
     */
    public void setActiveModelArn(String activeModelArn) {
        this.activeModelArn = activeModelArn;
    }

    /**
     * <p>
     * To associate an existing model with the flywheel, specify the Amazon
     * Resource Number (ARN) of the model version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * |entity-recognizer)/[a-zA-Z0-9](-*[a-zA-Z0-9])*(/version/[a-zA-
     * Z0-9](-*[a-zA-Z0-9])*)?<br/>
     *
     * @param activeModelArn <p>
     *            To associate an existing model with the flywheel, specify the
     *            Amazon Resource Number (ARN) of the model version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlywheelRequest withActiveModelArn(String activeModelArn) {
        this.activeModelArn = activeModelArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     * Comprehend the permissions required to access the flywheel data in the
     * data lake.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     *         Comprehend the permissions required to access the flywheel data
     *         in the data lake.
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     * Comprehend the permissions required to access the flywheel data in the
     * data lake.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that grants
     *            Amazon Comprehend the permissions required to access the
     *            flywheel data in the data lake.
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     * Comprehend the permissions required to access the flywheel data in the
     * data lake.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of the IAM role that grants
     *            Amazon Comprehend the permissions required to access the
     *            flywheel data in the data lake.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlywheelRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * Configuration about the custom classifier associated with the flywheel.
     * </p>
     *
     * @return <p>
     *         Configuration about the custom classifier associated with the
     *         flywheel.
     *         </p>
     */
    public TaskConfig getTaskConfig() {
        return taskConfig;
    }

    /**
     * <p>
     * Configuration about the custom classifier associated with the flywheel.
     * </p>
     *
     * @param taskConfig <p>
     *            Configuration about the custom classifier associated with the
     *            flywheel.
     *            </p>
     */
    public void setTaskConfig(TaskConfig taskConfig) {
        this.taskConfig = taskConfig;
    }

    /**
     * <p>
     * Configuration about the custom classifier associated with the flywheel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskConfig <p>
     *            Configuration about the custom classifier associated with the
     *            flywheel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlywheelRequest withTaskConfig(TaskConfig taskConfig) {
        this.taskConfig = taskConfig;
        return this;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_CLASSIFIER, ENTITY_RECOGNIZER
     *
     * @return <p>
     *         The model type.
     *         </p>
     * @see ModelType
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_CLASSIFIER, ENTITY_RECOGNIZER
     *
     * @param modelType <p>
     *            The model type.
     *            </p>
     * @see ModelType
     */
    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_CLASSIFIER, ENTITY_RECOGNIZER
     *
     * @param modelType <p>
     *            The model type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelType
     */
    public CreateFlywheelRequest withModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_CLASSIFIER, ENTITY_RECOGNIZER
     *
     * @param modelType <p>
     *            The model type.
     *            </p>
     * @see ModelType
     */
    public void setModelType(ModelType modelType) {
        this.modelType = modelType.toString();
    }

    /**
     * <p>
     * The model type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DOCUMENT_CLASSIFIER, ENTITY_RECOGNIZER
     *
     * @param modelType <p>
     *            The model type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelType
     */
    public CreateFlywheelRequest withModelType(ModelType modelType) {
        this.modelType = modelType.toString();
        return this;
    }

    /**
     * <p>
     * Enter the S3 location for the data lake. You can specify a new S3 bucket
     * or a new folder of an existing S3 bucket. The flywheel creates the data
     * lake at this location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @return <p>
     *         Enter the S3 location for the data lake. You can specify a new S3
     *         bucket or a new folder of an existing S3 bucket. The flywheel
     *         creates the data lake at this location.
     *         </p>
     */
    public String getDataLakeS3Uri() {
        return dataLakeS3Uri;
    }

    /**
     * <p>
     * Enter the S3 location for the data lake. You can specify a new S3 bucket
     * or a new folder of an existing S3 bucket. The flywheel creates the data
     * lake at this location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param dataLakeS3Uri <p>
     *            Enter the S3 location for the data lake. You can specify a new
     *            S3 bucket or a new folder of an existing S3 bucket. The
     *            flywheel creates the data lake at this location.
     *            </p>
     */
    public void setDataLakeS3Uri(String dataLakeS3Uri) {
        this.dataLakeS3Uri = dataLakeS3Uri;
    }

    /**
     * <p>
     * Enter the S3 location for the data lake. You can specify a new S3 bucket
     * or a new folder of an existing S3 bucket. The flywheel creates the data
     * lake at this location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param dataLakeS3Uri <p>
     *            Enter the S3 location for the data lake. You can specify a new
     *            S3 bucket or a new folder of an existing S3 bucket. The
     *            flywheel creates the data lake at this location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlywheelRequest withDataLakeS3Uri(String dataLakeS3Uri) {
        this.dataLakeS3Uri = dataLakeS3Uri;
        return this;
    }

    /**
     * <p>
     * Data security configurations.
     * </p>
     *
     * @return <p>
     *         Data security configurations.
     *         </p>
     */
    public DataSecurityConfig getDataSecurityConfig() {
        return dataSecurityConfig;
    }

    /**
     * <p>
     * Data security configurations.
     * </p>
     *
     * @param dataSecurityConfig <p>
     *            Data security configurations.
     *            </p>
     */
    public void setDataSecurityConfig(DataSecurityConfig dataSecurityConfig) {
        this.dataSecurityConfig = dataSecurityConfig;
    }

    /**
     * <p>
     * Data security configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSecurityConfig <p>
     *            Data security configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlywheelRequest withDataSecurityConfig(DataSecurityConfig dataSecurityConfig) {
        this.dataSecurityConfig = dataSecurityConfig;
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
    public CreateFlywheelRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The tags to associate with this flywheel.
     * </p>
     *
     * @return <p>
     *         The tags to associate with this flywheel.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to associate with this flywheel.
     * </p>
     *
     * @param tags <p>
     *            The tags to associate with this flywheel.
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
     * The tags to associate with this flywheel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to associate with this flywheel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlywheelRequest withTags(Tag... tags) {
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
     * The tags to associate with this flywheel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to associate with this flywheel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFlywheelRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getFlywheelName() != null)
            sb.append("FlywheelName: " + getFlywheelName() + ",");
        if (getActiveModelArn() != null)
            sb.append("ActiveModelArn: " + getActiveModelArn() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn() + ",");
        if (getTaskConfig() != null)
            sb.append("TaskConfig: " + getTaskConfig() + ",");
        if (getModelType() != null)
            sb.append("ModelType: " + getModelType() + ",");
        if (getDataLakeS3Uri() != null)
            sb.append("DataLakeS3Uri: " + getDataLakeS3Uri() + ",");
        if (getDataSecurityConfig() != null)
            sb.append("DataSecurityConfig: " + getDataSecurityConfig() + ",");
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
                + ((getFlywheelName() == null) ? 0 : getFlywheelName().hashCode());
        hashCode = prime * hashCode
                + ((getActiveModelArn() == null) ? 0 : getActiveModelArn().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTaskConfig() == null) ? 0 : getTaskConfig().hashCode());
        hashCode = prime * hashCode + ((getModelType() == null) ? 0 : getModelType().hashCode());
        hashCode = prime * hashCode
                + ((getDataLakeS3Uri() == null) ? 0 : getDataLakeS3Uri().hashCode());
        hashCode = prime * hashCode
                + ((getDataSecurityConfig() == null) ? 0 : getDataSecurityConfig().hashCode());
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

        if (obj instanceof CreateFlywheelRequest == false)
            return false;
        CreateFlywheelRequest other = (CreateFlywheelRequest) obj;

        if (other.getFlywheelName() == null ^ this.getFlywheelName() == null)
            return false;
        if (other.getFlywheelName() != null
                && other.getFlywheelName().equals(this.getFlywheelName()) == false)
            return false;
        if (other.getActiveModelArn() == null ^ this.getActiveModelArn() == null)
            return false;
        if (other.getActiveModelArn() != null
                && other.getActiveModelArn().equals(this.getActiveModelArn()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getTaskConfig() == null ^ this.getTaskConfig() == null)
            return false;
        if (other.getTaskConfig() != null
                && other.getTaskConfig().equals(this.getTaskConfig()) == false)
            return false;
        if (other.getModelType() == null ^ this.getModelType() == null)
            return false;
        if (other.getModelType() != null
                && other.getModelType().equals(this.getModelType()) == false)
            return false;
        if (other.getDataLakeS3Uri() == null ^ this.getDataLakeS3Uri() == null)
            return false;
        if (other.getDataLakeS3Uri() != null
                && other.getDataLakeS3Uri().equals(this.getDataLakeS3Uri()) == false)
            return false;
        if (other.getDataSecurityConfig() == null ^ this.getDataSecurityConfig() == null)
            return false;
        if (other.getDataSecurityConfig() != null
                && other.getDataSecurityConfig().equals(this.getDataSecurityConfig()) == false)
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
