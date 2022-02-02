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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies information about the specified endpoint.
 * </p>
 */
public class EndpointProperties implements Serializable {
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * -endpoint|entity-recognizer-endpoint)/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointArn;

    /**
     * <p>
     * Specifies the status of the endpoint. Because the endpoint updates and
     * creation are asynchronous, so customers will need to wait for the
     * endpoint to be <code>Ready</code> status before making inference
     * requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, IN_SERVICE, UPDATING
     */
    private String status;

    /**
     * <p>
     * Specifies a reason for failure in cases of <code>Failed</code> status.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint is
     * attached.
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
    private String modelArn;

    /**
     * <p>
     * ARN of the new model to use for updating an existing endpoint. This ARN
     * is going to be different from the model ARN when the update is in
     * progress
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
    private String desiredModelArn;

    /**
     * <p>
     * The desired number of inference units to be used by the model using this
     * endpoint. Each inference unit represents of a throughput of 100
     * characters per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer desiredInferenceUnits;

    /**
     * <p>
     * The number of inference units currently used by the model using this
     * endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer currentInferenceUnits;

    /**
     * <p>
     * The creation date and time of the endpoint.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The date and time that the endpoint was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to trained custom
     * models encrypted with a customer managed key (ModelKmsKeyId).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * Data access role ARN to use in case the new model is encrypted with a
     * customer KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     */
    private String desiredDataAccessRoleArn;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * -endpoint|entity-recognizer-endpoint)/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of the endpoint.
     *         </p>
     */
    public String getEndpointArn() {
        return endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:(document
     * -classifier
     * -endpoint|entity-recognizer-endpoint)/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointArn <p>
     *            The Amazon Resource Number (ARN) of the endpoint.
     *            </p>
     */
    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the endpoint.
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
     * -endpoint|entity-recognizer-endpoint)/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointArn <p>
     *            The Amazon Resource Number (ARN) of the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointProperties withEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
        return this;
    }

    /**
     * <p>
     * Specifies the status of the endpoint. Because the endpoint updates and
     * creation are asynchronous, so customers will need to wait for the
     * endpoint to be <code>Ready</code> status before making inference
     * requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, IN_SERVICE, UPDATING
     *
     * @return <p>
     *         Specifies the status of the endpoint. Because the endpoint
     *         updates and creation are asynchronous, so customers will need to
     *         wait for the endpoint to be <code>Ready</code> status before
     *         making inference requests.
     *         </p>
     * @see EndpointStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies the status of the endpoint. Because the endpoint updates and
     * creation are asynchronous, so customers will need to wait for the
     * endpoint to be <code>Ready</code> status before making inference
     * requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, IN_SERVICE, UPDATING
     *
     * @param status <p>
     *            Specifies the status of the endpoint. Because the endpoint
     *            updates and creation are asynchronous, so customers will need
     *            to wait for the endpoint to be <code>Ready</code> status
     *            before making inference requests.
     *            </p>
     * @see EndpointStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of the endpoint. Because the endpoint updates and
     * creation are asynchronous, so customers will need to wait for the
     * endpoint to be <code>Ready</code> status before making inference
     * requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, IN_SERVICE, UPDATING
     *
     * @param status <p>
     *            Specifies the status of the endpoint. Because the endpoint
     *            updates and creation are asynchronous, so customers will need
     *            to wait for the endpoint to be <code>Ready</code> status
     *            before making inference requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndpointStatus
     */
    public EndpointProperties withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Specifies the status of the endpoint. Because the endpoint updates and
     * creation are asynchronous, so customers will need to wait for the
     * endpoint to be <code>Ready</code> status before making inference
     * requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, IN_SERVICE, UPDATING
     *
     * @param status <p>
     *            Specifies the status of the endpoint. Because the endpoint
     *            updates and creation are asynchronous, so customers will need
     *            to wait for the endpoint to be <code>Ready</code> status
     *            before making inference requests.
     *            </p>
     * @see EndpointStatus
     */
    public void setStatus(EndpointStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Specifies the status of the endpoint. Because the endpoint updates and
     * creation are asynchronous, so customers will need to wait for the
     * endpoint to be <code>Ready</code> status before making inference
     * requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETING, FAILED, IN_SERVICE, UPDATING
     *
     * @param status <p>
     *            Specifies the status of the endpoint. Because the endpoint
     *            updates and creation are asynchronous, so customers will need
     *            to wait for the endpoint to be <code>Ready</code> status
     *            before making inference requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EndpointStatus
     */
    public EndpointProperties withStatus(EndpointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a reason for failure in cases of <code>Failed</code> status.
     * </p>
     *
     * @return <p>
     *         Specifies a reason for failure in cases of <code>Failed</code>
     *         status.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * Specifies a reason for failure in cases of <code>Failed</code> status.
     * </p>
     *
     * @param message <p>
     *            Specifies a reason for failure in cases of <code>Failed</code>
     *            status.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Specifies a reason for failure in cases of <code>Failed</code> status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            Specifies a reason for failure in cases of <code>Failed</code>
     *            status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointProperties withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint is
     * attached.
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
     *         The Amazon Resource Number (ARN) of the model to which the
     *         endpoint is attached.
     *         </p>
     */
    public String getModelArn() {
        return modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint is
     * attached.
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
     * @param modelArn <p>
     *            The Amazon Resource Number (ARN) of the model to which the
     *            endpoint is attached.
     *            </p>
     */
    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint is
     * attached.
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
     * @param modelArn <p>
     *            The Amazon Resource Number (ARN) of the model to which the
     *            endpoint is attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointProperties withModelArn(String modelArn) {
        this.modelArn = modelArn;
        return this;
    }

    /**
     * <p>
     * ARN of the new model to use for updating an existing endpoint. This ARN
     * is going to be different from the model ARN when the update is in
     * progress
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
     *         ARN of the new model to use for updating an existing endpoint.
     *         This ARN is going to be different from the model ARN when the
     *         update is in progress
     *         </p>
     */
    public String getDesiredModelArn() {
        return desiredModelArn;
    }

    /**
     * <p>
     * ARN of the new model to use for updating an existing endpoint. This ARN
     * is going to be different from the model ARN when the update is in
     * progress
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
     * @param desiredModelArn <p>
     *            ARN of the new model to use for updating an existing endpoint.
     *            This ARN is going to be different from the model ARN when the
     *            update is in progress
     *            </p>
     */
    public void setDesiredModelArn(String desiredModelArn) {
        this.desiredModelArn = desiredModelArn;
    }

    /**
     * <p>
     * ARN of the new model to use for updating an existing endpoint. This ARN
     * is going to be different from the model ARN when the update is in
     * progress
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
     * @param desiredModelArn <p>
     *            ARN of the new model to use for updating an existing endpoint.
     *            This ARN is going to be different from the model ARN when the
     *            update is in progress
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointProperties withDesiredModelArn(String desiredModelArn) {
        this.desiredModelArn = desiredModelArn;
        return this;
    }

    /**
     * <p>
     * The desired number of inference units to be used by the model using this
     * endpoint. Each inference unit represents of a throughput of 100
     * characters per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The desired number of inference units to be used by the model
     *         using this endpoint. Each inference unit represents of a
     *         throughput of 100 characters per second.
     *         </p>
     */
    public Integer getDesiredInferenceUnits() {
        return desiredInferenceUnits;
    }

    /**
     * <p>
     * The desired number of inference units to be used by the model using this
     * endpoint. Each inference unit represents of a throughput of 100
     * characters per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param desiredInferenceUnits <p>
     *            The desired number of inference units to be used by the model
     *            using this endpoint. Each inference unit represents of a
     *            throughput of 100 characters per second.
     *            </p>
     */
    public void setDesiredInferenceUnits(Integer desiredInferenceUnits) {
        this.desiredInferenceUnits = desiredInferenceUnits;
    }

    /**
     * <p>
     * The desired number of inference units to be used by the model using this
     * endpoint. Each inference unit represents of a throughput of 100
     * characters per second.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param desiredInferenceUnits <p>
     *            The desired number of inference units to be used by the model
     *            using this endpoint. Each inference unit represents of a
     *            throughput of 100 characters per second.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointProperties withDesiredInferenceUnits(Integer desiredInferenceUnits) {
        this.desiredInferenceUnits = desiredInferenceUnits;
        return this;
    }

    /**
     * <p>
     * The number of inference units currently used by the model using this
     * endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The number of inference units currently used by the model using
     *         this endpoint.
     *         </p>
     */
    public Integer getCurrentInferenceUnits() {
        return currentInferenceUnits;
    }

    /**
     * <p>
     * The number of inference units currently used by the model using this
     * endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param currentInferenceUnits <p>
     *            The number of inference units currently used by the model
     *            using this endpoint.
     *            </p>
     */
    public void setCurrentInferenceUnits(Integer currentInferenceUnits) {
        this.currentInferenceUnits = currentInferenceUnits;
    }

    /**
     * <p>
     * The number of inference units currently used by the model using this
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param currentInferenceUnits <p>
     *            The number of inference units currently used by the model
     *            using this endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointProperties withCurrentInferenceUnits(Integer currentInferenceUnits) {
        this.currentInferenceUnits = currentInferenceUnits;
        return this;
    }

    /**
     * <p>
     * The creation date and time of the endpoint.
     * </p>
     *
     * @return <p>
     *         The creation date and time of the endpoint.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The creation date and time of the endpoint.
     * </p>
     *
     * @param creationTime <p>
     *            The creation date and time of the endpoint.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation date and time of the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The creation date and time of the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointProperties withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The date and time that the endpoint was last modified.
     * </p>
     *
     * @return <p>
     *         The date and time that the endpoint was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the endpoint was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The date and time that the endpoint was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the endpoint was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The date and time that the endpoint was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointProperties withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to trained custom
     * models encrypted with a customer managed key (ModelKmsKeyId).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS identity and Access
     *         Management (IAM) role that grants Amazon Comprehend read access
     *         to trained custom models encrypted with a customer managed key
     *         (ModelKmsKeyId).
     *         </p>
     */
    public String getDataAccessRoleArn() {
        return dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to trained custom
     * models encrypted with a customer managed key (ModelKmsKeyId).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param dataAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) of the AWS identity and Access
     *            Management (IAM) role that grants Amazon Comprehend read
     *            access to trained custom models encrypted with a customer
     *            managed key (ModelKmsKeyId).
     *            </p>
     */
    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS identity and Access Management
     * (IAM) role that grants Amazon Comprehend read access to trained custom
     * models encrypted with a customer managed key (ModelKmsKeyId).
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
     *            The Amazon Resource Name (ARN) of the AWS identity and Access
     *            Management (IAM) role that grants Amazon Comprehend read
     *            access to trained custom models encrypted with a customer
     *            managed key (ModelKmsKeyId).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointProperties withDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * Data access role ARN to use in case the new model is encrypted with a
     * customer KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @return <p>
     *         Data access role ARN to use in case the new model is encrypted
     *         with a customer KMS key.
     *         </p>
     */
    public String getDesiredDataAccessRoleArn() {
        return desiredDataAccessRoleArn;
    }

    /**
     * <p>
     * Data access role ARN to use in case the new model is encrypted with a
     * customer KMS key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param desiredDataAccessRoleArn <p>
     *            Data access role ARN to use in case the new model is encrypted
     *            with a customer KMS key.
     *            </p>
     */
    public void setDesiredDataAccessRoleArn(String desiredDataAccessRoleArn) {
        this.desiredDataAccessRoleArn = desiredDataAccessRoleArn;
    }

    /**
     * <p>
     * Data access role ARN to use in case the new model is encrypted with a
     * customer KMS key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>arn:aws(-[^:]+)?:iam::[0-9]{12}:role/.+<br/>
     *
     * @param desiredDataAccessRoleArn <p>
     *            Data access role ARN to use in case the new model is encrypted
     *            with a customer KMS key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointProperties withDesiredDataAccessRoleArn(String desiredDataAccessRoleArn) {
        this.desiredDataAccessRoleArn = desiredDataAccessRoleArn;
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
        if (getEndpointArn() != null)
            sb.append("EndpointArn: " + getEndpointArn() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getModelArn() != null)
            sb.append("ModelArn: " + getModelArn() + ",");
        if (getDesiredModelArn() != null)
            sb.append("DesiredModelArn: " + getDesiredModelArn() + ",");
        if (getDesiredInferenceUnits() != null)
            sb.append("DesiredInferenceUnits: " + getDesiredInferenceUnits() + ",");
        if (getCurrentInferenceUnits() != null)
            sb.append("CurrentInferenceUnits: " + getCurrentInferenceUnits() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: " + getDataAccessRoleArn() + ",");
        if (getDesiredDataAccessRoleArn() != null)
            sb.append("DesiredDataAccessRoleArn: " + getDesiredDataAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode
                + ((getDesiredModelArn() == null) ? 0 : getDesiredModelArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getDesiredInferenceUnits() == null) ? 0 : getDesiredInferenceUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrentInferenceUnits() == null) ? 0 : getCurrentInferenceUnits().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getDesiredDataAccessRoleArn() == null) ? 0 : getDesiredDataAccessRoleArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointProperties == false)
            return false;
        EndpointProperties other = (EndpointProperties) obj;

        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null
                && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getDesiredModelArn() == null ^ this.getDesiredModelArn() == null)
            return false;
        if (other.getDesiredModelArn() != null
                && other.getDesiredModelArn().equals(this.getDesiredModelArn()) == false)
            return false;
        if (other.getDesiredInferenceUnits() == null ^ this.getDesiredInferenceUnits() == null)
            return false;
        if (other.getDesiredInferenceUnits() != null
                && other.getDesiredInferenceUnits().equals(this.getDesiredInferenceUnits()) == false)
            return false;
        if (other.getCurrentInferenceUnits() == null ^ this.getCurrentInferenceUnits() == null)
            return false;
        if (other.getCurrentInferenceUnits() != null
                && other.getCurrentInferenceUnits().equals(this.getCurrentInferenceUnits()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null
                && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getDesiredDataAccessRoleArn() == null
                ^ this.getDesiredDataAccessRoleArn() == null)
            return false;
        if (other.getDesiredDataAccessRoleArn() != null
                && other.getDesiredDataAccessRoleArn().equals(this.getDesiredDataAccessRoleArn()) == false)
            return false;
        return true;
    }
}
