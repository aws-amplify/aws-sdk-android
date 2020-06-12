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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Reports progress of a resource handler to CloudFormation.
 * </p>
 * <p>
 * Reserved for use by the <a href=
 * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
 * >CloudFormation CLI</a>. Do not use this API in your code.
 * </p>
 */
public class RecordHandlerProgressRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String bearerToken;

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED
     */
    private String operationStatus;

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED
     */
    private String currentOperationStatus;

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String statusMessage;

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotUpdatable, InvalidRequest, AccessDenied,
     * InvalidCredentials, AlreadyExists, NotFound, ResourceConflict,
     * Throttling, ServiceLimitExceeded, NotStabilized, GeneralServiceException,
     * ServiceInternalError, NetworkFailure, InternalFailure
     */
    private String errorCode;

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     */
    private String resourceModel;

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         Reserved for use by the <a href=
     *         "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *         >CloudFormation CLI</a>.
     *         </p>
     */
    public String getBearerToken() {
        return bearerToken;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param bearerToken <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     */
    public void setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param bearerToken <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordHandlerProgressRequest withBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED
     *
     * @return <p>
     *         Reserved for use by the <a href=
     *         "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *         >CloudFormation CLI</a>.
     *         </p>
     * @see OperationStatus
     */
    public String getOperationStatus() {
        return operationStatus;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED
     *
     * @param operationStatus <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     * @see OperationStatus
     */
    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED
     *
     * @param operationStatus <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationStatus
     */
    public RecordHandlerProgressRequest withOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED
     *
     * @param operationStatus <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     * @see OperationStatus
     */
    public void setOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus.toString();
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED
     *
     * @param operationStatus <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationStatus
     */
    public RecordHandlerProgressRequest withOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED
     *
     * @return <p>
     *         Reserved for use by the <a href=
     *         "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *         >CloudFormation CLI</a>.
     *         </p>
     * @see OperationStatus
     */
    public String getCurrentOperationStatus() {
        return currentOperationStatus;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED
     *
     * @param currentOperationStatus <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     * @see OperationStatus
     */
    public void setCurrentOperationStatus(String currentOperationStatus) {
        this.currentOperationStatus = currentOperationStatus;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED
     *
     * @param currentOperationStatus <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationStatus
     */
    public RecordHandlerProgressRequest withCurrentOperationStatus(String currentOperationStatus) {
        this.currentOperationStatus = currentOperationStatus;
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED
     *
     * @param currentOperationStatus <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     * @see OperationStatus
     */
    public void setCurrentOperationStatus(OperationStatus currentOperationStatus) {
        this.currentOperationStatus = currentOperationStatus.toString();
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, IN_PROGRESS, SUCCESS, FAILED
     *
     * @param currentOperationStatus <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperationStatus
     */
    public RecordHandlerProgressRequest withCurrentOperationStatus(
            OperationStatus currentOperationStatus) {
        this.currentOperationStatus = currentOperationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         Reserved for use by the <a href=
     *         "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *         >CloudFormation CLI</a>.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param statusMessage <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param statusMessage <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordHandlerProgressRequest withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotUpdatable, InvalidRequest, AccessDenied,
     * InvalidCredentials, AlreadyExists, NotFound, ResourceConflict,
     * Throttling, ServiceLimitExceeded, NotStabilized, GeneralServiceException,
     * ServiceInternalError, NetworkFailure, InternalFailure
     *
     * @return <p>
     *         Reserved for use by the <a href=
     *         "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *         >CloudFormation CLI</a>.
     *         </p>
     * @see HandlerErrorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotUpdatable, InvalidRequest, AccessDenied,
     * InvalidCredentials, AlreadyExists, NotFound, ResourceConflict,
     * Throttling, ServiceLimitExceeded, NotStabilized, GeneralServiceException,
     * ServiceInternalError, NetworkFailure, InternalFailure
     *
     * @param errorCode <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     * @see HandlerErrorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotUpdatable, InvalidRequest, AccessDenied,
     * InvalidCredentials, AlreadyExists, NotFound, ResourceConflict,
     * Throttling, ServiceLimitExceeded, NotStabilized, GeneralServiceException,
     * ServiceInternalError, NetworkFailure, InternalFailure
     *
     * @param errorCode <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HandlerErrorCode
     */
    public RecordHandlerProgressRequest withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotUpdatable, InvalidRequest, AccessDenied,
     * InvalidCredentials, AlreadyExists, NotFound, ResourceConflict,
     * Throttling, ServiceLimitExceeded, NotStabilized, GeneralServiceException,
     * ServiceInternalError, NetworkFailure, InternalFailure
     *
     * @param errorCode <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     * @see HandlerErrorCode
     */
    public void setErrorCode(HandlerErrorCode errorCode) {
        this.errorCode = errorCode.toString();
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NotUpdatable, InvalidRequest, AccessDenied,
     * InvalidCredentials, AlreadyExists, NotFound, ResourceConflict,
     * Throttling, ServiceLimitExceeded, NotStabilized, GeneralServiceException,
     * ServiceInternalError, NetworkFailure, InternalFailure
     *
     * @param errorCode <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HandlerErrorCode
     */
    public RecordHandlerProgressRequest withErrorCode(HandlerErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @return <p>
     *         Reserved for use by the <a href=
     *         "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *         >CloudFormation CLI</a>.
     *         </p>
     */
    public String getResourceModel() {
        return resourceModel;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param resourceModel <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     */
    public void setResourceModel(String resourceModel) {
        this.resourceModel = resourceModel;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param resourceModel <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordHandlerProgressRequest withResourceModel(String resourceModel) {
        this.resourceModel = resourceModel;
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         Reserved for use by the <a href=
     *         "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *         >CloudFormation CLI</a>.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Reserved for use by the <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            Reserved for use by the <a href=
     *            "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *            >CloudFormation CLI</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordHandlerProgressRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
        if (getBearerToken() != null)
            sb.append("BearerToken: " + getBearerToken() + ",");
        if (getOperationStatus() != null)
            sb.append("OperationStatus: " + getOperationStatus() + ",");
        if (getCurrentOperationStatus() != null)
            sb.append("CurrentOperationStatus: " + getCurrentOperationStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getResourceModel() != null)
            sb.append("ResourceModel: " + getResourceModel() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBearerToken() == null) ? 0 : getBearerToken().hashCode());
        hashCode = prime * hashCode
                + ((getOperationStatus() == null) ? 0 : getOperationStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrentOperationStatus() == null) ? 0 : getCurrentOperationStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode
                + ((getResourceModel() == null) ? 0 : getResourceModel().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordHandlerProgressRequest == false)
            return false;
        RecordHandlerProgressRequest other = (RecordHandlerProgressRequest) obj;

        if (other.getBearerToken() == null ^ this.getBearerToken() == null)
            return false;
        if (other.getBearerToken() != null
                && other.getBearerToken().equals(this.getBearerToken()) == false)
            return false;
        if (other.getOperationStatus() == null ^ this.getOperationStatus() == null)
            return false;
        if (other.getOperationStatus() != null
                && other.getOperationStatus().equals(this.getOperationStatus()) == false)
            return false;
        if (other.getCurrentOperationStatus() == null ^ this.getCurrentOperationStatus() == null)
            return false;
        if (other.getCurrentOperationStatus() != null
                && other.getCurrentOperationStatus().equals(this.getCurrentOperationStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getResourceModel() == null ^ this.getResourceModel() == null)
            return false;
        if (other.getResourceModel() != null
                && other.getResourceModel().equals(this.getResourceModel()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
