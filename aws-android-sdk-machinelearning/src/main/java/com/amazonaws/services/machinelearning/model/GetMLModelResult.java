/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a <code>GetMLModel</code> operation, and provides
 * detailed information about a <code>MLModel</code>.
 * </p>
 */
public class GetMLModelResult implements Serializable {
    /**
     * <p>
     * The MLModel ID<?oxy_insert_start author="annbech"
     * timestamp="20160328T151251-0700">,<?oxy_insert_end> which is same as the
     * <code>MLModelId</code> in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String mLModelId;

    /**
     * <p>
     * The ID of the training <code>DataSource</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String trainingDataSourceId;

    /**
     * <p>
     * The AWS user account from which the <code>MLModel</code> was created. The
     * account type can be either an AWS root account or an AWS Identity and
     * Access Management (IAM) user account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     */
    private String createdByIamUser;

    /**
     * <p>
     * The time that the <code>MLModel</code> was created. The time is expressed
     * in epoch time.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The time of the most recent edit to the <code>MLModel</code>. The time is
     * expressed in epoch time.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * A user-supplied name or description of the <code>MLModel</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String name;

    /**
     * <p>
     * The current status of the <code>MLModel</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted
     * a request to describe a <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The request is processing.</li>
     * <li> <code>FAILED</code> - The request did not run to completion. The ML
     * model isn't usable.</li>
     * <li> <code>COMPLETED</code> - The request completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted.
     * It isn't usable.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     */
    private String status;

    /**
     * <p>
     * Long integer type that is a 64-bit signed number.
     * </p>
     */
    private Long sizeInBytes;

    /**
     * <p>
     * The current endpoint of the <code>MLModel</code>
     * </p>
     */
    private RealtimeEndpointInfo endpointInfo;

    /**
     * <p>
     * A list of the training parameters in the <code>MLModel</code>. The list
     * is implemented as a map of key-value pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the
     * model. Depending on the input data, the size of the model might affect
     * its performance.
     * </p>
     * <p>
     * The value is an integer that ranges from <code>100000</code> to
     * <code>2147483648</code>. The default value is <code>33554432</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - The number of times that the training
     * process traverses the observations to build the <code>MLModel</code>. The
     * value is an integer that ranges from <code>1</code> to <code>10000</code>
     * . The default value is <code>10</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training
     * data. Shuffling data improves a model's ability to find the optimal
     * solution for a variety of data types. The valid values are
     * <code>auto</code> and <code>none</code>. The default value is
     * <code>none</code>. We strongly recommend that you shuffle your data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - The coefficient regularization
     * L1 norm. It controls overfitting the data by penalizing large
     * coefficients. This tends to drive coefficients to zero, resulting in a
     * sparse feature set. If you use this parameter, start by specifying a
     * small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to
     * <code>MAX_DOUBLE</code>. The default is to not use L1 normalization. This
     * parameter can't be used when <code>L2</code> is specified. Use this
     * parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - The coefficient regularization
     * L2 norm. It controls overfitting the data by penalizing large
     * coefficients. This tends to drive coefficients to small, nonzero values.
     * If you use this parameter, start by specifying a small value, such as
     * <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to
     * <code>MAX_DOUBLE</code>. The default is to not use L2 normalization. This
     * parameter can't be used when <code>L1</code> is specified. Use this
     * parameter sparingly.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> trainingParameters = new java.util.HashMap<String, String>();

    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     */
    private String inputDataLocationS3;

    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the
     * available types:
     * </p>
     * <ul>
     * <li>REGRESSION -- Produces a numeric result. For example,
     * "What price should a house be listed at?"</li>
     * <li>BINARY -- Produces one of two possible results. For example,
     * "Is this an e-commerce website?"</li>
     * <li>MULTICLASS -- Produces one of several possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     */
    private String mLModelType;

    /**
     * <p>
     * The scoring threshold is used in binary classification
     * <code>MLModel</code><?oxy_insert_start author="laurama"
     * timestamp="20160329T114851-0700"> <?oxy_insert_end>models. It marks the
     * boundary between a positive prediction and a negative prediction.
     * </p>
     * <p>
     * Output values greater than or equal to the threshold receive a positive
     * result from the MLModel, such as <code>true</code>. Output values less
     * than the threshold receive a negative response from the MLModel, such as
     * <code>false</code>.
     * </p>
     */
    private Float scoreThreshold;

    /**
     * <p>
     * The time of the most recent edit to the <code>ScoreThreshold</code>. The
     * time is expressed in epoch time.
     * </p>
     */
    private java.util.Date scoreThresholdLastUpdatedAt;

    /**
     * <p>
     * A link to the file that contains logs of the <code>CreateMLModel</code>
     * operation.
     * </p>
     */
    private String logUri;

    /**
     * <p>
     * A description of the most recent details about accessing the
     * <code>MLModel</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     */
    private String message;

    /**
     * <p>
     * The approximate CPU time in milliseconds that Amazon Machine Learning
     * spent processing the <code>MLModel</code>, normalized and scaled on
     * computation resources. <code>ComputeTime</code> is only available if the
     * <code>MLModel</code> is in the <code>COMPLETED</code> state.
     * </p>
     */
    private Long computeTime;

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the
     * <code>MLModel</code> as <code>COMPLETED</code> or <code>FAILED</code>.
     * <code>FinishedAt</code> is only available when the <code>MLModel</code>
     * is in the <code>COMPLETED</code> or <code>FAILED</code> state.
     * </p>
     */
    private java.util.Date finishedAt;

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the
     * <code>MLModel</code> as <code>INPROGRESS</code>. <code>StartedAt</code>
     * isn't available if the <code>MLModel</code> is in the
     * <code>PENDING</code> state.
     * </p>
     */
    private java.util.Date startedAt;

    /**
     * <p>
     * The recipe to use when training the <code>MLModel</code>. The
     * <code>Recipe</code> provides detailed information about the observation
     * data to use during training, and manipulations to perform on the
     * observation data during training.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 131071<br/>
     */
    private String recipe;

    /**
     * <p>
     * The schema used by all of the data files referenced by the
     * <code>DataSource</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 131071<br/>
     */
    private String schema;

    /**
     * <p>
     * The MLModel ID<?oxy_insert_start author="annbech"
     * timestamp="20160328T151251-0700">,<?oxy_insert_end> which is same as the
     * <code>MLModelId</code> in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The MLModel ID<?oxy_insert_start author="annbech"
     *         timestamp="20160328T151251-0700">,<?oxy_insert_end> which is same
     *         as the <code>MLModelId</code> in the request.
     *         </p>
     */
    public String getMLModelId() {
        return mLModelId;
    }

    /**
     * <p>
     * The MLModel ID<?oxy_insert_start author="annbech"
     * timestamp="20160328T151251-0700">,<?oxy_insert_end> which is same as the
     * <code>MLModelId</code> in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId <p>
     *            The MLModel ID<?oxy_insert_start author="annbech"
     *            timestamp="20160328T151251-0700">,<?oxy_insert_end> which is
     *            same as the <code>MLModelId</code> in the request.
     *            </p>
     */
    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }

    /**
     * <p>
     * The MLModel ID<?oxy_insert_start author="annbech"
     * timestamp="20160328T151251-0700">,<?oxy_insert_end> which is same as the
     * <code>MLModelId</code> in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param mLModelId <p>
     *            The MLModel ID<?oxy_insert_start author="annbech"
     *            timestamp="20160328T151251-0700">,<?oxy_insert_end> which is
     *            same as the <code>MLModelId</code> in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
        return this;
    }

    /**
     * <p>
     * The ID of the training <code>DataSource</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The ID of the training <code>DataSource</code>.
     *         </p>
     */
    public String getTrainingDataSourceId() {
        return trainingDataSourceId;
    }

    /**
     * <p>
     * The ID of the training <code>DataSource</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param trainingDataSourceId <p>
     *            The ID of the training <code>DataSource</code>.
     *            </p>
     */
    public void setTrainingDataSourceId(String trainingDataSourceId) {
        this.trainingDataSourceId = trainingDataSourceId;
    }

    /**
     * <p>
     * The ID of the training <code>DataSource</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param trainingDataSourceId <p>
     *            The ID of the training <code>DataSource</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withTrainingDataSourceId(String trainingDataSourceId) {
        this.trainingDataSourceId = trainingDataSourceId;
        return this;
    }

    /**
     * <p>
     * The AWS user account from which the <code>MLModel</code> was created. The
     * account type can be either an AWS root account or an AWS Identity and
     * Access Management (IAM) user account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     *
     * @return <p>
     *         The AWS user account from which the <code>MLModel</code> was
     *         created. The account type can be either an AWS root account or an
     *         AWS Identity and Access Management (IAM) user account.
     *         </p>
     */
    public String getCreatedByIamUser() {
        return createdByIamUser;
    }

    /**
     * <p>
     * The AWS user account from which the <code>MLModel</code> was created. The
     * account type can be either an AWS root account or an AWS Identity and
     * Access Management (IAM) user account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     *
     * @param createdByIamUser <p>
     *            The AWS user account from which the <code>MLModel</code> was
     *            created. The account type can be either an AWS root account or
     *            an AWS Identity and Access Management (IAM) user account.
     *            </p>
     */
    public void setCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
    }

    /**
     * <p>
     * The AWS user account from which the <code>MLModel</code> was created. The
     * account type can be either an AWS root account or an AWS Identity and
     * Access Management (IAM) user account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::[0-9]+:((user/.+)|(root))<br/>
     *
     * @param createdByIamUser <p>
     *            The AWS user account from which the <code>MLModel</code> was
     *            created. The account type can be either an AWS root account or
     *            an AWS Identity and Access Management (IAM) user account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withCreatedByIamUser(String createdByIamUser) {
        this.createdByIamUser = createdByIamUser;
        return this;
    }

    /**
     * <p>
     * The time that the <code>MLModel</code> was created. The time is expressed
     * in epoch time.
     * </p>
     *
     * @return <p>
     *         The time that the <code>MLModel</code> was created. The time is
     *         expressed in epoch time.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The time that the <code>MLModel</code> was created. The time is expressed
     * in epoch time.
     * </p>
     *
     * @param createdAt <p>
     *            The time that the <code>MLModel</code> was created. The time
     *            is expressed in epoch time.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time that the <code>MLModel</code> was created. The time is expressed
     * in epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The time that the <code>MLModel</code> was created. The time
     *            is expressed in epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>MLModel</code>. The time is
     * expressed in epoch time.
     * </p>
     *
     * @return <p>
     *         The time of the most recent edit to the <code>MLModel</code>. The
     *         time is expressed in epoch time.
     *         </p>
     */
    public java.util.Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>MLModel</code>. The time is
     * expressed in epoch time.
     * </p>
     *
     * @param lastUpdatedAt <p>
     *            The time of the most recent edit to the <code>MLModel</code>.
     *            The time is expressed in epoch time.
     *            </p>
     */
    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>MLModel</code>. The time is
     * expressed in epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedAt <p>
     *            The time of the most recent edit to the <code>MLModel</code>.
     *            The time is expressed in epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>MLModel</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         A user-supplied name or description of the <code>MLModel</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>MLModel</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param name <p>
     *            A user-supplied name or description of the
     *            <code>MLModel</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>MLModel</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param name <p>
     *            A user-supplied name or description of the
     *            <code>MLModel</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The current status of the <code>MLModel</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted
     * a request to describe a <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The request is processing.</li>
     * <li> <code>FAILED</code> - The request did not run to completion. The ML
     * model isn't usable.</li>
     * <li> <code>COMPLETED</code> - The request completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted.
     * It isn't usable.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @return <p>
     *         The current status of the <code>MLModel</code>. This element can
     *         have one of the following values:
     *         </p>
     *         <ul>
     *         <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML)
     *         submitted a request to describe a <code>MLModel</code>.</li>
     *         <li> <code>INPROGRESS</code> - The request is processing.</li>
     *         <li> <code>FAILED</code> - The request did not run to completion.
     *         The ML model isn't usable.</li>
     *         <li> <code>COMPLETED</code> - The request completed successfully.</li>
     *         <li> <code>DELETED</code> - The <code>MLModel</code> is marked as
     *         deleted. It isn't usable.</li>
     *         </ul>
     * @see EntityStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the <code>MLModel</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted
     * a request to describe a <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The request is processing.</li>
     * <li> <code>FAILED</code> - The request did not run to completion. The ML
     * model isn't usable.</li>
     * <li> <code>COMPLETED</code> - The request completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted.
     * It isn't usable.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status <p>
     *            The current status of the <code>MLModel</code>. This element
     *            can have one of the following values:
     *            </p>
     *            <ul>
     *            <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML)
     *            submitted a request to describe a <code>MLModel</code>.</li>
     *            <li> <code>INPROGRESS</code> - The request is processing.</li>
     *            <li> <code>FAILED</code> - The request did not run to
     *            completion. The ML model isn't usable.</li>
     *            <li> <code>COMPLETED</code> - The request completed
     *            successfully.</li>
     *            <li> <code>DELETED</code> - The <code>MLModel</code> is marked
     *            as deleted. It isn't usable.</li>
     *            </ul>
     * @see EntityStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the <code>MLModel</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted
     * a request to describe a <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The request is processing.</li>
     * <li> <code>FAILED</code> - The request did not run to completion. The ML
     * model isn't usable.</li>
     * <li> <code>COMPLETED</code> - The request completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted.
     * It isn't usable.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status <p>
     *            The current status of the <code>MLModel</code>. This element
     *            can have one of the following values:
     *            </p>
     *            <ul>
     *            <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML)
     *            submitted a request to describe a <code>MLModel</code>.</li>
     *            <li> <code>INPROGRESS</code> - The request is processing.</li>
     *            <li> <code>FAILED</code> - The request did not run to
     *            completion. The ML model isn't usable.</li>
     *            <li> <code>COMPLETED</code> - The request completed
     *            successfully.</li>
     *            <li> <code>DELETED</code> - The <code>MLModel</code> is marked
     *            as deleted. It isn't usable.</li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityStatus
     */
    public GetMLModelResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the <code>MLModel</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted
     * a request to describe a <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The request is processing.</li>
     * <li> <code>FAILED</code> - The request did not run to completion. The ML
     * model isn't usable.</li>
     * <li> <code>COMPLETED</code> - The request completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted.
     * It isn't usable.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status <p>
     *            The current status of the <code>MLModel</code>. This element
     *            can have one of the following values:
     *            </p>
     *            <ul>
     *            <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML)
     *            submitted a request to describe a <code>MLModel</code>.</li>
     *            <li> <code>INPROGRESS</code> - The request is processing.</li>
     *            <li> <code>FAILED</code> - The request did not run to
     *            completion. The ML model isn't usable.</li>
     *            <li> <code>COMPLETED</code> - The request completed
     *            successfully.</li>
     *            <li> <code>DELETED</code> - The <code>MLModel</code> is marked
     *            as deleted. It isn't usable.</li>
     *            </ul>
     * @see EntityStatus
     */
    public void setStatus(EntityStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the <code>MLModel</code>. This element can have one
     * of the following values:
     * </p>
     * <ul>
     * <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML) submitted
     * a request to describe a <code>MLModel</code>.</li>
     * <li> <code>INPROGRESS</code> - The request is processing.</li>
     * <li> <code>FAILED</code> - The request did not run to completion. The ML
     * model isn't usable.</li>
     * <li> <code>COMPLETED</code> - The request completed successfully.</li>
     * <li> <code>DELETED</code> - The <code>MLModel</code> is marked as deleted.
     * It isn't usable.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, INPROGRESS, FAILED, COMPLETED, DELETED
     *
     * @param status <p>
     *            The current status of the <code>MLModel</code>. This element
     *            can have one of the following values:
     *            </p>
     *            <ul>
     *            <li> <code>PENDING</code> - Amazon Machine Learning (Amazon ML)
     *            submitted a request to describe a <code>MLModel</code>.</li>
     *            <li> <code>INPROGRESS</code> - The request is processing.</li>
     *            <li> <code>FAILED</code> - The request did not run to
     *            completion. The ML model isn't usable.</li>
     *            <li> <code>COMPLETED</code> - The request completed
     *            successfully.</li>
     *            <li> <code>DELETED</code> - The <code>MLModel</code> is marked
     *            as deleted. It isn't usable.</li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EntityStatus
     */
    public GetMLModelResult withStatus(EntityStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Long integer type that is a 64-bit signed number.
     * </p>
     *
     * @return <p>
     *         Long integer type that is a 64-bit signed number.
     *         </p>
     */
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     * <p>
     * Long integer type that is a 64-bit signed number.
     * </p>
     *
     * @param sizeInBytes <p>
     *            Long integer type that is a 64-bit signed number.
     *            </p>
     */
    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /**
     * <p>
     * Long integer type that is a 64-bit signed number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sizeInBytes <p>
     *            Long integer type that is a 64-bit signed number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    /**
     * <p>
     * The current endpoint of the <code>MLModel</code>
     * </p>
     *
     * @return <p>
     *         The current endpoint of the <code>MLModel</code>
     *         </p>
     */
    public RealtimeEndpointInfo getEndpointInfo() {
        return endpointInfo;
    }

    /**
     * <p>
     * The current endpoint of the <code>MLModel</code>
     * </p>
     *
     * @param endpointInfo <p>
     *            The current endpoint of the <code>MLModel</code>
     *            </p>
     */
    public void setEndpointInfo(RealtimeEndpointInfo endpointInfo) {
        this.endpointInfo = endpointInfo;
    }

    /**
     * <p>
     * The current endpoint of the <code>MLModel</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointInfo <p>
     *            The current endpoint of the <code>MLModel</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withEndpointInfo(RealtimeEndpointInfo endpointInfo) {
        this.endpointInfo = endpointInfo;
        return this;
    }

    /**
     * <p>
     * A list of the training parameters in the <code>MLModel</code>. The list
     * is implemented as a map of key-value pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the
     * model. Depending on the input data, the size of the model might affect
     * its performance.
     * </p>
     * <p>
     * The value is an integer that ranges from <code>100000</code> to
     * <code>2147483648</code>. The default value is <code>33554432</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - The number of times that the training
     * process traverses the observations to build the <code>MLModel</code>. The
     * value is an integer that ranges from <code>1</code> to <code>10000</code>
     * . The default value is <code>10</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training
     * data. Shuffling data improves a model's ability to find the optimal
     * solution for a variety of data types. The valid values are
     * <code>auto</code> and <code>none</code>. The default value is
     * <code>none</code>. We strongly recommend that you shuffle your data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - The coefficient regularization
     * L1 norm. It controls overfitting the data by penalizing large
     * coefficients. This tends to drive coefficients to zero, resulting in a
     * sparse feature set. If you use this parameter, start by specifying a
     * small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to
     * <code>MAX_DOUBLE</code>. The default is to not use L1 normalization. This
     * parameter can't be used when <code>L2</code> is specified. Use this
     * parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - The coefficient regularization
     * L2 norm. It controls overfitting the data by penalizing large
     * coefficients. This tends to drive coefficients to small, nonzero values.
     * If you use this parameter, start by specifying a small value, such as
     * <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to
     * <code>MAX_DOUBLE</code>. The default is to not use L2 normalization. This
     * parameter can't be used when <code>L1</code> is specified. Use this
     * parameter sparingly.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A list of the training parameters in the <code>MLModel</code>.
     *         The list is implemented as a map of key-value pairs.
     *         </p>
     *         <p>
     *         The following is the current set of training parameters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size
     *         of the model. Depending on the input data, the size of the model
     *         might affect its performance.
     *         </p>
     *         <p>
     *         The value is an integer that ranges from <code>100000</code> to
     *         <code>2147483648</code>. The default value is
     *         <code>33554432</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sgd.maxPasses</code> - The number of times that the
     *         training process traverses the observations to build the
     *         <code>MLModel</code>. The value is an integer that ranges from
     *         <code>1</code> to <code>10000</code>. The default value is
     *         <code>10</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the
     *         training data. Shuffling data improves a model's ability to find
     *         the optimal solution for a variety of data types. The valid
     *         values are <code>auto</code> and <code>none</code>. The default
     *         value is <code>none</code>. We strongly recommend that you
     *         shuffle your data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sgd.l1RegularizationAmount</code> - The coefficient
     *         regularization L1 norm. It controls overfitting the data by
     *         penalizing large coefficients. This tends to drive coefficients
     *         to zero, resulting in a sparse feature set. If you use this
     *         parameter, start by specifying a small value, such as
     *         <code>1.0E-08</code>.
     *         </p>
     *         <p>
     *         The value is a double that ranges from <code>0</code> to
     *         <code>MAX_DOUBLE</code>. The default is to not use L1
     *         normalization. This parameter can't be used when <code>L2</code>
     *         is specified. Use this parameter sparingly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sgd.l2RegularizationAmount</code> - The coefficient
     *         regularization L2 norm. It controls overfitting the data by
     *         penalizing large coefficients. This tends to drive coefficients
     *         to small, nonzero values. If you use this parameter, start by
     *         specifying a small value, such as <code>1.0E-08</code>.
     *         </p>
     *         <p>
     *         The value is a double that ranges from <code>0</code> to
     *         <code>MAX_DOUBLE</code>. The default is to not use L2
     *         normalization. This parameter can't be used when <code>L1</code>
     *         is specified. Use this parameter sparingly.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, String> getTrainingParameters() {
        return trainingParameters;
    }

    /**
     * <p>
     * A list of the training parameters in the <code>MLModel</code>. The list
     * is implemented as a map of key-value pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the
     * model. Depending on the input data, the size of the model might affect
     * its performance.
     * </p>
     * <p>
     * The value is an integer that ranges from <code>100000</code> to
     * <code>2147483648</code>. The default value is <code>33554432</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - The number of times that the training
     * process traverses the observations to build the <code>MLModel</code>. The
     * value is an integer that ranges from <code>1</code> to <code>10000</code>
     * . The default value is <code>10</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training
     * data. Shuffling data improves a model's ability to find the optimal
     * solution for a variety of data types. The valid values are
     * <code>auto</code> and <code>none</code>. The default value is
     * <code>none</code>. We strongly recommend that you shuffle your data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - The coefficient regularization
     * L1 norm. It controls overfitting the data by penalizing large
     * coefficients. This tends to drive coefficients to zero, resulting in a
     * sparse feature set. If you use this parameter, start by specifying a
     * small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to
     * <code>MAX_DOUBLE</code>. The default is to not use L1 normalization. This
     * parameter can't be used when <code>L2</code> is specified. Use this
     * parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - The coefficient regularization
     * L2 norm. It controls overfitting the data by penalizing large
     * coefficients. This tends to drive coefficients to small, nonzero values.
     * If you use this parameter, start by specifying a small value, such as
     * <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to
     * <code>MAX_DOUBLE</code>. The default is to not use L2 normalization. This
     * parameter can't be used when <code>L1</code> is specified. Use this
     * parameter sparingly.
     * </p>
     * </li>
     * </ul>
     *
     * @param trainingParameters <p>
     *            A list of the training parameters in the <code>MLModel</code>.
     *            The list is implemented as a map of key-value pairs.
     *            </p>
     *            <p>
     *            The following is the current set of training parameters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed
     *            size of the model. Depending on the input data, the size of
     *            the model might affect its performance.
     *            </p>
     *            <p>
     *            The value is an integer that ranges from <code>100000</code>
     *            to <code>2147483648</code>. The default value is
     *            <code>33554432</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sgd.maxPasses</code> - The number of times that the
     *            training process traverses the observations to build the
     *            <code>MLModel</code>. The value is an integer that ranges from
     *            <code>1</code> to <code>10000</code>. The default value is
     *            <code>10</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the
     *            training data. Shuffling data improves a model's ability to
     *            find the optimal solution for a variety of data types. The
     *            valid values are <code>auto</code> and <code>none</code>. The
     *            default value is <code>none</code>. We strongly recommend that
     *            you shuffle your data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sgd.l1RegularizationAmount</code> - The coefficient
     *            regularization L1 norm. It controls overfitting the data by
     *            penalizing large coefficients. This tends to drive
     *            coefficients to zero, resulting in a sparse feature set. If
     *            you use this parameter, start by specifying a small value,
     *            such as <code>1.0E-08</code>.
     *            </p>
     *            <p>
     *            The value is a double that ranges from <code>0</code> to
     *            <code>MAX_DOUBLE</code>. The default is to not use L1
     *            normalization. This parameter can't be used when
     *            <code>L2</code> is specified. Use this parameter sparingly.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sgd.l2RegularizationAmount</code> - The coefficient
     *            regularization L2 norm. It controls overfitting the data by
     *            penalizing large coefficients. This tends to drive
     *            coefficients to small, nonzero values. If you use this
     *            parameter, start by specifying a small value, such as
     *            <code>1.0E-08</code>.
     *            </p>
     *            <p>
     *            The value is a double that ranges from <code>0</code> to
     *            <code>MAX_DOUBLE</code>. The default is to not use L2
     *            normalization. This parameter can't be used when
     *            <code>L1</code> is specified. Use this parameter sparingly.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTrainingParameters(java.util.Map<String, String> trainingParameters) {
        this.trainingParameters = trainingParameters;
    }

    /**
     * <p>
     * A list of the training parameters in the <code>MLModel</code>. The list
     * is implemented as a map of key-value pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the
     * model. Depending on the input data, the size of the model might affect
     * its performance.
     * </p>
     * <p>
     * The value is an integer that ranges from <code>100000</code> to
     * <code>2147483648</code>. The default value is <code>33554432</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - The number of times that the training
     * process traverses the observations to build the <code>MLModel</code>. The
     * value is an integer that ranges from <code>1</code> to <code>10000</code>
     * . The default value is <code>10</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training
     * data. Shuffling data improves a model's ability to find the optimal
     * solution for a variety of data types. The valid values are
     * <code>auto</code> and <code>none</code>. The default value is
     * <code>none</code>. We strongly recommend that you shuffle your data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - The coefficient regularization
     * L1 norm. It controls overfitting the data by penalizing large
     * coefficients. This tends to drive coefficients to zero, resulting in a
     * sparse feature set. If you use this parameter, start by specifying a
     * small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to
     * <code>MAX_DOUBLE</code>. The default is to not use L1 normalization. This
     * parameter can't be used when <code>L2</code> is specified. Use this
     * parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - The coefficient regularization
     * L2 norm. It controls overfitting the data by penalizing large
     * coefficients. This tends to drive coefficients to small, nonzero values.
     * If you use this parameter, start by specifying a small value, such as
     * <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to
     * <code>MAX_DOUBLE</code>. The default is to not use L2 normalization. This
     * parameter can't be used when <code>L1</code> is specified. Use this
     * parameter sparingly.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingParameters <p>
     *            A list of the training parameters in the <code>MLModel</code>.
     *            The list is implemented as a map of key-value pairs.
     *            </p>
     *            <p>
     *            The following is the current set of training parameters:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed
     *            size of the model. Depending on the input data, the size of
     *            the model might affect its performance.
     *            </p>
     *            <p>
     *            The value is an integer that ranges from <code>100000</code>
     *            to <code>2147483648</code>. The default value is
     *            <code>33554432</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sgd.maxPasses</code> - The number of times that the
     *            training process traverses the observations to build the
     *            <code>MLModel</code>. The value is an integer that ranges from
     *            <code>1</code> to <code>10000</code>. The default value is
     *            <code>10</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the
     *            training data. Shuffling data improves a model's ability to
     *            find the optimal solution for a variety of data types. The
     *            valid values are <code>auto</code> and <code>none</code>. The
     *            default value is <code>none</code>. We strongly recommend that
     *            you shuffle your data.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sgd.l1RegularizationAmount</code> - The coefficient
     *            regularization L1 norm. It controls overfitting the data by
     *            penalizing large coefficients. This tends to drive
     *            coefficients to zero, resulting in a sparse feature set. If
     *            you use this parameter, start by specifying a small value,
     *            such as <code>1.0E-08</code>.
     *            </p>
     *            <p>
     *            The value is a double that ranges from <code>0</code> to
     *            <code>MAX_DOUBLE</code>. The default is to not use L1
     *            normalization. This parameter can't be used when
     *            <code>L2</code> is specified. Use this parameter sparingly.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sgd.l2RegularizationAmount</code> - The coefficient
     *            regularization L2 norm. It controls overfitting the data by
     *            penalizing large coefficients. This tends to drive
     *            coefficients to small, nonzero values. If you use this
     *            parameter, start by specifying a small value, such as
     *            <code>1.0E-08</code>.
     *            </p>
     *            <p>
     *            The value is a double that ranges from <code>0</code> to
     *            <code>MAX_DOUBLE</code>. The default is to not use L2
     *            normalization. This parameter can't be used when
     *            <code>L1</code> is specified. Use this parameter sparingly.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withTrainingParameters(java.util.Map<String, String> trainingParameters) {
        this.trainingParameters = trainingParameters;
        return this;
    }

    /**
     * <p>
     * A list of the training parameters in the <code>MLModel</code>. The list
     * is implemented as a map of key-value pairs.
     * </p>
     * <p>
     * The following is the current set of training parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>sgd.maxMLModelSizeInBytes</code> - The maximum allowed size of the
     * model. Depending on the input data, the size of the model might affect
     * its performance.
     * </p>
     * <p>
     * The value is an integer that ranges from <code>100000</code> to
     * <code>2147483648</code>. The default value is <code>33554432</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.maxPasses</code> - The number of times that the training
     * process traverses the observations to build the <code>MLModel</code>. The
     * value is an integer that ranges from <code>1</code> to <code>10000</code>
     * . The default value is <code>10</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.shuffleType</code> - Whether Amazon ML shuffles the training
     * data. Shuffling data improves a model's ability to find the optimal
     * solution for a variety of data types. The valid values are
     * <code>auto</code> and <code>none</code>. The default value is
     * <code>none</code>. We strongly recommend that you shuffle your data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l1RegularizationAmount</code> - The coefficient regularization
     * L1 norm. It controls overfitting the data by penalizing large
     * coefficients. This tends to drive coefficients to zero, resulting in a
     * sparse feature set. If you use this parameter, start by specifying a
     * small value, such as <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to
     * <code>MAX_DOUBLE</code>. The default is to not use L1 normalization. This
     * parameter can't be used when <code>L2</code> is specified. Use this
     * parameter sparingly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sgd.l2RegularizationAmount</code> - The coefficient regularization
     * L2 norm. It controls overfitting the data by penalizing large
     * coefficients. This tends to drive coefficients to small, nonzero values.
     * If you use this parameter, start by specifying a small value, such as
     * <code>1.0E-08</code>.
     * </p>
     * <p>
     * The value is a double that ranges from <code>0</code> to
     * <code>MAX_DOUBLE</code>. The default is to not use L2 normalization. This
     * parameter can't be used when <code>L1</code> is specified. Use this
     * parameter sparingly.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The method adds a new key-value pair into TrainingParameters parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into TrainingParameters.
     * @param value The corresponding value of the entry to be added into
     *            TrainingParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult addTrainingParametersEntry(String key, String value) {
        if (null == this.trainingParameters) {
            this.trainingParameters = new java.util.HashMap<String, String>();
        }
        if (this.trainingParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.trainingParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TrainingParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public GetMLModelResult clearTrainingParametersEntries() {
        this.trainingParameters = null;
        return this;
    }

    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @return <p>
     *         The location of the data file or directory in Amazon Simple
     *         Storage Service (Amazon S3).
     *         </p>
     */
    public String getInputDataLocationS3() {
        return inputDataLocationS3;
    }

    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param inputDataLocationS3 <p>
     *            The location of the data file or directory in Amazon Simple
     *            Storage Service (Amazon S3).
     *            </p>
     */
    public void setInputDataLocationS3(String inputDataLocationS3) {
        this.inputDataLocationS3 = inputDataLocationS3;
    }

    /**
     * <p>
     * The location of the data file or directory in Amazon Simple Storage
     * Service (Amazon S3).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>s3://([^/]+)(/.*)?<br/>
     *
     * @param inputDataLocationS3 <p>
     *            The location of the data file or directory in Amazon Simple
     *            Storage Service (Amazon S3).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withInputDataLocationS3(String inputDataLocationS3) {
        this.inputDataLocationS3 = inputDataLocationS3;
        return this;
    }

    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the
     * available types:
     * </p>
     * <ul>
     * <li>REGRESSION -- Produces a numeric result. For example,
     * "What price should a house be listed at?"</li>
     * <li>BINARY -- Produces one of two possible results. For example,
     * "Is this an e-commerce website?"</li>
     * <li>MULTICLASS -- Produces one of several possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     *
     * @return <p>
     *         Identifies the <code>MLModel</code> category. The following are
     *         the available types:
     *         </p>
     *         <ul>
     *         <li>REGRESSION -- Produces a numeric result. For example,
     *         "What price should a house be listed at?"</li>
     *         <li>BINARY -- Produces one of two possible results. For example,
     *         "Is this an e-commerce website?"</li>
     *         <li>MULTICLASS -- Produces one of several possible results. For
     *         example, "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     *         </ul>
     * @see MLModelType
     */
    public String getMLModelType() {
        return mLModelType;
    }

    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the
     * available types:
     * </p>
     * <ul>
     * <li>REGRESSION -- Produces a numeric result. For example,
     * "What price should a house be listed at?"</li>
     * <li>BINARY -- Produces one of two possible results. For example,
     * "Is this an e-commerce website?"</li>
     * <li>MULTICLASS -- Produces one of several possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     *
     * @param mLModelType <p>
     *            Identifies the <code>MLModel</code> category. The following
     *            are the available types:
     *            </p>
     *            <ul>
     *            <li>REGRESSION -- Produces a numeric result. For example,
     *            "What price should a house be listed at?"</li>
     *            <li>BINARY -- Produces one of two possible results. For
     *            example, "Is this an e-commerce website?"</li>
     *            <li>MULTICLASS -- Produces one of several possible results.
     *            For example, "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     *            </ul>
     * @see MLModelType
     */
    public void setMLModelType(String mLModelType) {
        this.mLModelType = mLModelType;
    }

    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the
     * available types:
     * </p>
     * <ul>
     * <li>REGRESSION -- Produces a numeric result. For example,
     * "What price should a house be listed at?"</li>
     * <li>BINARY -- Produces one of two possible results. For example,
     * "Is this an e-commerce website?"</li>
     * <li>MULTICLASS -- Produces one of several possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     *
     * @param mLModelType <p>
     *            Identifies the <code>MLModel</code> category. The following
     *            are the available types:
     *            </p>
     *            <ul>
     *            <li>REGRESSION -- Produces a numeric result. For example,
     *            "What price should a house be listed at?"</li>
     *            <li>BINARY -- Produces one of two possible results. For
     *            example, "Is this an e-commerce website?"</li>
     *            <li>MULTICLASS -- Produces one of several possible results.
     *            For example, "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MLModelType
     */
    public GetMLModelResult withMLModelType(String mLModelType) {
        this.mLModelType = mLModelType;
        return this;
    }

    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the
     * available types:
     * </p>
     * <ul>
     * <li>REGRESSION -- Produces a numeric result. For example,
     * "What price should a house be listed at?"</li>
     * <li>BINARY -- Produces one of two possible results. For example,
     * "Is this an e-commerce website?"</li>
     * <li>MULTICLASS -- Produces one of several possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     *
     * @param mLModelType <p>
     *            Identifies the <code>MLModel</code> category. The following
     *            are the available types:
     *            </p>
     *            <ul>
     *            <li>REGRESSION -- Produces a numeric result. For example,
     *            "What price should a house be listed at?"</li>
     *            <li>BINARY -- Produces one of two possible results. For
     *            example, "Is this an e-commerce website?"</li>
     *            <li>MULTICLASS -- Produces one of several possible results.
     *            For example, "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     *            </ul>
     * @see MLModelType
     */
    public void setMLModelType(MLModelType mLModelType) {
        this.mLModelType = mLModelType.toString();
    }

    /**
     * <p>
     * Identifies the <code>MLModel</code> category. The following are the
     * available types:
     * </p>
     * <ul>
     * <li>REGRESSION -- Produces a numeric result. For example,
     * "What price should a house be listed at?"</li>
     * <li>BINARY -- Produces one of two possible results. For example,
     * "Is this an e-commerce website?"</li>
     * <li>MULTICLASS -- Produces one of several possible results. For example,
     * "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGRESSION, BINARY, MULTICLASS
     *
     * @param mLModelType <p>
     *            Identifies the <code>MLModel</code> category. The following
     *            are the available types:
     *            </p>
     *            <ul>
     *            <li>REGRESSION -- Produces a numeric result. For example,
     *            "What price should a house be listed at?"</li>
     *            <li>BINARY -- Produces one of two possible results. For
     *            example, "Is this an e-commerce website?"</li>
     *            <li>MULTICLASS -- Produces one of several possible results.
     *            For example, "Is this a HIGH, LOW or MEDIUM risk trade?"</li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MLModelType
     */
    public GetMLModelResult withMLModelType(MLModelType mLModelType) {
        this.mLModelType = mLModelType.toString();
        return this;
    }

    /**
     * <p>
     * The scoring threshold is used in binary classification
     * <code>MLModel</code><?oxy_insert_start author="laurama"
     * timestamp="20160329T114851-0700"> <?oxy_insert_end>models. It marks the
     * boundary between a positive prediction and a negative prediction.
     * </p>
     * <p>
     * Output values greater than or equal to the threshold receive a positive
     * result from the MLModel, such as <code>true</code>. Output values less
     * than the threshold receive a negative response from the MLModel, such as
     * <code>false</code>.
     * </p>
     *
     * @return <p>
     *         The scoring threshold is used in binary classification
     *         <code>MLModel</code><?oxy_insert_start author="laurama"
     *         timestamp="20160329T114851-0700"> <?oxy_insert_end>models. It
     *         marks the boundary between a positive prediction and a negative
     *         prediction.
     *         </p>
     *         <p>
     *         Output values greater than or equal to the threshold receive a
     *         positive result from the MLModel, such as <code>true</code>.
     *         Output values less than the threshold receive a negative response
     *         from the MLModel, such as <code>false</code>.
     *         </p>
     */
    public Float getScoreThreshold() {
        return scoreThreshold;
    }

    /**
     * <p>
     * The scoring threshold is used in binary classification
     * <code>MLModel</code><?oxy_insert_start author="laurama"
     * timestamp="20160329T114851-0700"> <?oxy_insert_end>models. It marks the
     * boundary between a positive prediction and a negative prediction.
     * </p>
     * <p>
     * Output values greater than or equal to the threshold receive a positive
     * result from the MLModel, such as <code>true</code>. Output values less
     * than the threshold receive a negative response from the MLModel, such as
     * <code>false</code>.
     * </p>
     *
     * @param scoreThreshold <p>
     *            The scoring threshold is used in binary classification
     *            <code>MLModel</code><?oxy_insert_start author="laurama"
     *            timestamp="20160329T114851-0700"> <?oxy_insert_end>models. It
     *            marks the boundary between a positive prediction and a
     *            negative prediction.
     *            </p>
     *            <p>
     *            Output values greater than or equal to the threshold receive a
     *            positive result from the MLModel, such as <code>true</code>.
     *            Output values less than the threshold receive a negative
     *            response from the MLModel, such as <code>false</code>.
     *            </p>
     */
    public void setScoreThreshold(Float scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
    }

    /**
     * <p>
     * The scoring threshold is used in binary classification
     * <code>MLModel</code><?oxy_insert_start author="laurama"
     * timestamp="20160329T114851-0700"> <?oxy_insert_end>models. It marks the
     * boundary between a positive prediction and a negative prediction.
     * </p>
     * <p>
     * Output values greater than or equal to the threshold receive a positive
     * result from the MLModel, such as <code>true</code>. Output values less
     * than the threshold receive a negative response from the MLModel, such as
     * <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scoreThreshold <p>
     *            The scoring threshold is used in binary classification
     *            <code>MLModel</code><?oxy_insert_start author="laurama"
     *            timestamp="20160329T114851-0700"> <?oxy_insert_end>models. It
     *            marks the boundary between a positive prediction and a
     *            negative prediction.
     *            </p>
     *            <p>
     *            Output values greater than or equal to the threshold receive a
     *            positive result from the MLModel, such as <code>true</code>.
     *            Output values less than the threshold receive a negative
     *            response from the MLModel, such as <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withScoreThreshold(Float scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
        return this;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>ScoreThreshold</code>. The
     * time is expressed in epoch time.
     * </p>
     *
     * @return <p>
     *         The time of the most recent edit to the
     *         <code>ScoreThreshold</code>. The time is expressed in epoch time.
     *         </p>
     */
    public java.util.Date getScoreThresholdLastUpdatedAt() {
        return scoreThresholdLastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>ScoreThreshold</code>. The
     * time is expressed in epoch time.
     * </p>
     *
     * @param scoreThresholdLastUpdatedAt <p>
     *            The time of the most recent edit to the
     *            <code>ScoreThreshold</code>. The time is expressed in epoch
     *            time.
     *            </p>
     */
    public void setScoreThresholdLastUpdatedAt(java.util.Date scoreThresholdLastUpdatedAt) {
        this.scoreThresholdLastUpdatedAt = scoreThresholdLastUpdatedAt;
    }

    /**
     * <p>
     * The time of the most recent edit to the <code>ScoreThreshold</code>. The
     * time is expressed in epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scoreThresholdLastUpdatedAt <p>
     *            The time of the most recent edit to the
     *            <code>ScoreThreshold</code>. The time is expressed in epoch
     *            time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withScoreThresholdLastUpdatedAt(
            java.util.Date scoreThresholdLastUpdatedAt) {
        this.scoreThresholdLastUpdatedAt = scoreThresholdLastUpdatedAt;
        return this;
    }

    /**
     * <p>
     * A link to the file that contains logs of the <code>CreateMLModel</code>
     * operation.
     * </p>
     *
     * @return <p>
     *         A link to the file that contains logs of the
     *         <code>CreateMLModel</code> operation.
     *         </p>
     */
    public String getLogUri() {
        return logUri;
    }

    /**
     * <p>
     * A link to the file that contains logs of the <code>CreateMLModel</code>
     * operation.
     * </p>
     *
     * @param logUri <p>
     *            A link to the file that contains logs of the
     *            <code>CreateMLModel</code> operation.
     *            </p>
     */
    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    /**
     * <p>
     * A link to the file that contains logs of the <code>CreateMLModel</code>
     * operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logUri <p>
     *            A link to the file that contains logs of the
     *            <code>CreateMLModel</code> operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }

    /**
     * <p>
     * A description of the most recent details about accessing the
     * <code>MLModel</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     *
     * @return <p>
     *         A description of the most recent details about accessing the
     *         <code>MLModel</code>.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A description of the most recent details about accessing the
     * <code>MLModel</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     *
     * @param message <p>
     *            A description of the most recent details about accessing the
     *            <code>MLModel</code>.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the most recent details about accessing the
     * <code>MLModel</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10240<br/>
     *
     * @param message <p>
     *            A description of the most recent details about accessing the
     *            <code>MLModel</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The approximate CPU time in milliseconds that Amazon Machine Learning
     * spent processing the <code>MLModel</code>, normalized and scaled on
     * computation resources. <code>ComputeTime</code> is only available if the
     * <code>MLModel</code> is in the <code>COMPLETED</code> state.
     * </p>
     *
     * @return <p>
     *         The approximate CPU time in milliseconds that Amazon Machine
     *         Learning spent processing the <code>MLModel</code>, normalized
     *         and scaled on computation resources. <code>ComputeTime</code> is
     *         only available if the <code>MLModel</code> is in the
     *         <code>COMPLETED</code> state.
     *         </p>
     */
    public Long getComputeTime() {
        return computeTime;
    }

    /**
     * <p>
     * The approximate CPU time in milliseconds that Amazon Machine Learning
     * spent processing the <code>MLModel</code>, normalized and scaled on
     * computation resources. <code>ComputeTime</code> is only available if the
     * <code>MLModel</code> is in the <code>COMPLETED</code> state.
     * </p>
     *
     * @param computeTime <p>
     *            The approximate CPU time in milliseconds that Amazon Machine
     *            Learning spent processing the <code>MLModel</code>, normalized
     *            and scaled on computation resources. <code>ComputeTime</code>
     *            is only available if the <code>MLModel</code> is in the
     *            <code>COMPLETED</code> state.
     *            </p>
     */
    public void setComputeTime(Long computeTime) {
        this.computeTime = computeTime;
    }

    /**
     * <p>
     * The approximate CPU time in milliseconds that Amazon Machine Learning
     * spent processing the <code>MLModel</code>, normalized and scaled on
     * computation resources. <code>ComputeTime</code> is only available if the
     * <code>MLModel</code> is in the <code>COMPLETED</code> state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param computeTime <p>
     *            The approximate CPU time in milliseconds that Amazon Machine
     *            Learning spent processing the <code>MLModel</code>, normalized
     *            and scaled on computation resources. <code>ComputeTime</code>
     *            is only available if the <code>MLModel</code> is in the
     *            <code>COMPLETED</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withComputeTime(Long computeTime) {
        this.computeTime = computeTime;
        return this;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the
     * <code>MLModel</code> as <code>COMPLETED</code> or <code>FAILED</code>.
     * <code>FinishedAt</code> is only available when the <code>MLModel</code>
     * is in the <code>COMPLETED</code> or <code>FAILED</code> state.
     * </p>
     *
     * @return <p>
     *         The epoch time when Amazon Machine Learning marked the
     *         <code>MLModel</code> as <code>COMPLETED</code> or
     *         <code>FAILED</code>. <code>FinishedAt</code> is only available
     *         when the <code>MLModel</code> is in the <code>COMPLETED</code> or
     *         <code>FAILED</code> state.
     *         </p>
     */
    public java.util.Date getFinishedAt() {
        return finishedAt;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the
     * <code>MLModel</code> as <code>COMPLETED</code> or <code>FAILED</code>.
     * <code>FinishedAt</code> is only available when the <code>MLModel</code>
     * is in the <code>COMPLETED</code> or <code>FAILED</code> state.
     * </p>
     *
     * @param finishedAt <p>
     *            The epoch time when Amazon Machine Learning marked the
     *            <code>MLModel</code> as <code>COMPLETED</code> or
     *            <code>FAILED</code>. <code>FinishedAt</code> is only available
     *            when the <code>MLModel</code> is in the <code>COMPLETED</code>
     *            or <code>FAILED</code> state.
     *            </p>
     */
    public void setFinishedAt(java.util.Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the
     * <code>MLModel</code> as <code>COMPLETED</code> or <code>FAILED</code>.
     * <code>FinishedAt</code> is only available when the <code>MLModel</code>
     * is in the <code>COMPLETED</code> or <code>FAILED</code> state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finishedAt <p>
     *            The epoch time when Amazon Machine Learning marked the
     *            <code>MLModel</code> as <code>COMPLETED</code> or
     *            <code>FAILED</code>. <code>FinishedAt</code> is only available
     *            when the <code>MLModel</code> is in the <code>COMPLETED</code>
     *            or <code>FAILED</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withFinishedAt(java.util.Date finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the
     * <code>MLModel</code> as <code>INPROGRESS</code>. <code>StartedAt</code>
     * isn't available if the <code>MLModel</code> is in the
     * <code>PENDING</code> state.
     * </p>
     *
     * @return <p>
     *         The epoch time when Amazon Machine Learning marked the
     *         <code>MLModel</code> as <code>INPROGRESS</code>.
     *         <code>StartedAt</code> isn't available if the
     *         <code>MLModel</code> is in the <code>PENDING</code> state.
     *         </p>
     */
    public java.util.Date getStartedAt() {
        return startedAt;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the
     * <code>MLModel</code> as <code>INPROGRESS</code>. <code>StartedAt</code>
     * isn't available if the <code>MLModel</code> is in the
     * <code>PENDING</code> state.
     * </p>
     *
     * @param startedAt <p>
     *            The epoch time when Amazon Machine Learning marked the
     *            <code>MLModel</code> as <code>INPROGRESS</code>.
     *            <code>StartedAt</code> isn't available if the
     *            <code>MLModel</code> is in the <code>PENDING</code> state.
     *            </p>
     */
    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The epoch time when Amazon Machine Learning marked the
     * <code>MLModel</code> as <code>INPROGRESS</code>. <code>StartedAt</code>
     * isn't available if the <code>MLModel</code> is in the
     * <code>PENDING</code> state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startedAt <p>
     *            The epoch time when Amazon Machine Learning marked the
     *            <code>MLModel</code> as <code>INPROGRESS</code>.
     *            <code>StartedAt</code> isn't available if the
     *            <code>MLModel</code> is in the <code>PENDING</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * <p>
     * The recipe to use when training the <code>MLModel</code>. The
     * <code>Recipe</code> provides detailed information about the observation
     * data to use during training, and manipulations to perform on the
     * observation data during training.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 131071<br/>
     *
     * @return <p>
     *         The recipe to use when training the <code>MLModel</code>. The
     *         <code>Recipe</code> provides detailed information about the
     *         observation data to use during training, and manipulations to
     *         perform on the observation data during training.
     *         </p>
     *         <note><title>Note</title>
     *         <p>
     *         This parameter is provided as part of the verbose format.
     *         </p>
     *         </note>
     */
    public String getRecipe() {
        return recipe;
    }

    /**
     * <p>
     * The recipe to use when training the <code>MLModel</code>. The
     * <code>Recipe</code> provides detailed information about the observation
     * data to use during training, and manipulations to perform on the
     * observation data during training.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 131071<br/>
     *
     * @param recipe <p>
     *            The recipe to use when training the <code>MLModel</code>. The
     *            <code>Recipe</code> provides detailed information about the
     *            observation data to use during training, and manipulations to
     *            perform on the observation data during training.
     *            </p>
     *            <note><title>Note</title>
     *            <p>
     *            This parameter is provided as part of the verbose format.
     *            </p>
     *            </note>
     */
    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    /**
     * <p>
     * The recipe to use when training the <code>MLModel</code>. The
     * <code>Recipe</code> provides detailed information about the observation
     * data to use during training, and manipulations to perform on the
     * observation data during training.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 131071<br/>
     *
     * @param recipe <p>
     *            The recipe to use when training the <code>MLModel</code>. The
     *            <code>Recipe</code> provides detailed information about the
     *            observation data to use during training, and manipulations to
     *            perform on the observation data during training.
     *            </p>
     *            <note><title>Note</title>
     *            <p>
     *            This parameter is provided as part of the verbose format.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withRecipe(String recipe) {
        this.recipe = recipe;
        return this;
    }

    /**
     * <p>
     * The schema used by all of the data files referenced by the
     * <code>DataSource</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 131071<br/>
     *
     * @return <p>
     *         The schema used by all of the data files referenced by the
     *         <code>DataSource</code>.
     *         </p>
     *         <note><title>Note</title>
     *         <p>
     *         This parameter is provided as part of the verbose format.
     *         </p>
     *         </note>
     */
    public String getSchema() {
        return schema;
    }

    /**
     * <p>
     * The schema used by all of the data files referenced by the
     * <code>DataSource</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 131071<br/>
     *
     * @param schema <p>
     *            The schema used by all of the data files referenced by the
     *            <code>DataSource</code>.
     *            </p>
     *            <note><title>Note</title>
     *            <p>
     *            This parameter is provided as part of the verbose format.
     *            </p>
     *            </note>
     */
    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema used by all of the data files referenced by the
     * <code>DataSource</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * This parameter is provided as part of the verbose format.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 131071<br/>
     *
     * @param schema <p>
     *            The schema used by all of the data files referenced by the
     *            <code>DataSource</code>.
     *            </p>
     *            <note><title>Note</title>
     *            <p>
     *            This parameter is provided as part of the verbose format.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMLModelResult withSchema(String schema) {
        this.schema = schema;
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
        if (getMLModelId() != null)
            sb.append("MLModelId: " + getMLModelId() + ",");
        if (getTrainingDataSourceId() != null)
            sb.append("TrainingDataSourceId: " + getTrainingDataSourceId() + ",");
        if (getCreatedByIamUser() != null)
            sb.append("CreatedByIamUser: " + getCreatedByIamUser() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: " + getLastUpdatedAt() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getSizeInBytes() != null)
            sb.append("SizeInBytes: " + getSizeInBytes() + ",");
        if (getEndpointInfo() != null)
            sb.append("EndpointInfo: " + getEndpointInfo() + ",");
        if (getTrainingParameters() != null)
            sb.append("TrainingParameters: " + getTrainingParameters() + ",");
        if (getInputDataLocationS3() != null)
            sb.append("InputDataLocationS3: " + getInputDataLocationS3() + ",");
        if (getMLModelType() != null)
            sb.append("MLModelType: " + getMLModelType() + ",");
        if (getScoreThreshold() != null)
            sb.append("ScoreThreshold: " + getScoreThreshold() + ",");
        if (getScoreThresholdLastUpdatedAt() != null)
            sb.append("ScoreThresholdLastUpdatedAt: " + getScoreThresholdLastUpdatedAt() + ",");
        if (getLogUri() != null)
            sb.append("LogUri: " + getLogUri() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getComputeTime() != null)
            sb.append("ComputeTime: " + getComputeTime() + ",");
        if (getFinishedAt() != null)
            sb.append("FinishedAt: " + getFinishedAt() + ",");
        if (getStartedAt() != null)
            sb.append("StartedAt: " + getStartedAt() + ",");
        if (getRecipe() != null)
            sb.append("Recipe: " + getRecipe() + ",");
        if (getSchema() != null)
            sb.append("Schema: " + getSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingDataSourceId() == null) ? 0 : getTrainingDataSourceId().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedByIamUser() == null) ? 0 : getCreatedByIamUser().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSizeInBytes() == null) ? 0 : getSizeInBytes().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointInfo() == null) ? 0 : getEndpointInfo().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingParameters() == null) ? 0 : getTrainingParameters().hashCode());
        hashCode = prime * hashCode
                + ((getInputDataLocationS3() == null) ? 0 : getInputDataLocationS3().hashCode());
        hashCode = prime * hashCode
                + ((getMLModelType() == null) ? 0 : getMLModelType().hashCode());
        hashCode = prime * hashCode
                + ((getScoreThreshold() == null) ? 0 : getScoreThreshold().hashCode());
        hashCode = prime
                * hashCode
                + ((getScoreThresholdLastUpdatedAt() == null) ? 0
                        : getScoreThresholdLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getComputeTime() == null) ? 0 : getComputeTime().hashCode());
        hashCode = prime * hashCode + ((getFinishedAt() == null) ? 0 : getFinishedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getRecipe() == null) ? 0 : getRecipe().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLModelResult == false)
            return false;
        GetMLModelResult other = (GetMLModelResult) obj;

        if (other.getMLModelId() == null ^ this.getMLModelId() == null)
            return false;
        if (other.getMLModelId() != null
                && other.getMLModelId().equals(this.getMLModelId()) == false)
            return false;
        if (other.getTrainingDataSourceId() == null ^ this.getTrainingDataSourceId() == null)
            return false;
        if (other.getTrainingDataSourceId() != null
                && other.getTrainingDataSourceId().equals(this.getTrainingDataSourceId()) == false)
            return false;
        if (other.getCreatedByIamUser() == null ^ this.getCreatedByIamUser() == null)
            return false;
        if (other.getCreatedByIamUser() != null
                && other.getCreatedByIamUser().equals(this.getCreatedByIamUser()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null
                && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSizeInBytes() == null ^ this.getSizeInBytes() == null)
            return false;
        if (other.getSizeInBytes() != null
                && other.getSizeInBytes().equals(this.getSizeInBytes()) == false)
            return false;
        if (other.getEndpointInfo() == null ^ this.getEndpointInfo() == null)
            return false;
        if (other.getEndpointInfo() != null
                && other.getEndpointInfo().equals(this.getEndpointInfo()) == false)
            return false;
        if (other.getTrainingParameters() == null ^ this.getTrainingParameters() == null)
            return false;
        if (other.getTrainingParameters() != null
                && other.getTrainingParameters().equals(this.getTrainingParameters()) == false)
            return false;
        if (other.getInputDataLocationS3() == null ^ this.getInputDataLocationS3() == null)
            return false;
        if (other.getInputDataLocationS3() != null
                && other.getInputDataLocationS3().equals(this.getInputDataLocationS3()) == false)
            return false;
        if (other.getMLModelType() == null ^ this.getMLModelType() == null)
            return false;
        if (other.getMLModelType() != null
                && other.getMLModelType().equals(this.getMLModelType()) == false)
            return false;
        if (other.getScoreThreshold() == null ^ this.getScoreThreshold() == null)
            return false;
        if (other.getScoreThreshold() != null
                && other.getScoreThreshold().equals(this.getScoreThreshold()) == false)
            return false;
        if (other.getScoreThresholdLastUpdatedAt() == null
                ^ this.getScoreThresholdLastUpdatedAt() == null)
            return false;
        if (other.getScoreThresholdLastUpdatedAt() != null
                && other.getScoreThresholdLastUpdatedAt().equals(
                        this.getScoreThresholdLastUpdatedAt()) == false)
            return false;
        if (other.getLogUri() == null ^ this.getLogUri() == null)
            return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getComputeTime() == null ^ this.getComputeTime() == null)
            return false;
        if (other.getComputeTime() != null
                && other.getComputeTime().equals(this.getComputeTime()) == false)
            return false;
        if (other.getFinishedAt() == null ^ this.getFinishedAt() == null)
            return false;
        if (other.getFinishedAt() != null
                && other.getFinishedAt().equals(this.getFinishedAt()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null
                && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getRecipe() == null ^ this.getRecipe() == null)
            return false;
        if (other.getRecipe() != null && other.getRecipe().equals(this.getRecipe()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        return true;
    }
}
