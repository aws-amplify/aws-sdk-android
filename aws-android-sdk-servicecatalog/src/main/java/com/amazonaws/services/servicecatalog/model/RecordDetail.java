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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a request operation.
 * </p>
 */
public class RecordDetail implements Serializable {
    /**
     * <p>
     * The identifier of the record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String recordId;

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     */
    private String provisionedProductName;

    /**
     * <p>
     * The status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The request was created but the operation has not
     * started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The requested operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under
     * change but the requested operation failed and some remediation is
     * occurring. For example, a rollback.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The requested operation has successfully
     * completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The requested operation has unsuccessfully
     * completed. Investigate using the error messages returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR,
     * SUCCEEDED, FAILED
     */
    private String status;

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The time when the record was last updated.
     * </p>
     */
    private java.util.Date updatedTime;

    /**
     * <p>
     * The type of provisioned product. The supported values are
     * <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     * </p>
     */
    private String provisionedProductType;

    /**
     * <p>
     * The record type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISION_PRODUCT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_PROVISIONED_PRODUCT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATE_PROVISIONED_PRODUCT</code>
     * </p>
     * </li>
     * </ul>
     */
    private String recordType;

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String provisionedProductId;

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String productId;

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String provisioningArtifactId;

    /**
     * <p>
     * The path identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String pathId;

    /**
     * <p>
     * The errors that occurred.
     * </p>
     */
    private java.util.List<RecordError> recordErrors;

    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.List<RecordTag> recordTags;

    /**
     * <p>
     * The identifier of the record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the record.
     *         </p>
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * <p>
     * The identifier of the record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param recordId <p>
     *            The identifier of the record.
     *            </p>
     */
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    /**
     * <p>
     * The identifier of the record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param recordId <p>
     *            The identifier of the record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordDetail withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     *
     * @return <p>
     *         The user-friendly name of the provisioned product.
     *         </p>
     */
    public String getProvisionedProductName() {
        return provisionedProductName;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     *
     * @param provisionedProductName <p>
     *            The user-friendly name of the provisioned product.
     *            </p>
     */
    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9._-]*<br/>
     *
     * @param provisionedProductName <p>
     *            The user-friendly name of the provisioned product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordDetail withProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
        return this;
    }

    /**
     * <p>
     * The status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The request was created but the operation has not
     * started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The requested operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under
     * change but the requested operation failed and some remediation is
     * occurring. For example, a rollback.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The requested operation has successfully
     * completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The requested operation has unsuccessfully
     * completed. Investigate using the error messages returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR,
     * SUCCEEDED, FAILED
     *
     * @return <p>
     *         The status of the provisioned product.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATED</code> - The request was created but the operation
     *         has not started.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> - The requested operation is in
     *         progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is
     *         under change but the requested operation failed and some
     *         remediation is occurring. For example, a rollback.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code> - The requested operation has successfully
     *         completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - The requested operation has unsuccessfully
     *         completed. Investigate using the error messages returned.
     *         </p>
     *         </li>
     *         </ul>
     * @see RecordStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The request was created but the operation has not
     * started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The requested operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under
     * change but the requested operation failed and some remediation is
     * occurring. For example, a rollback.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The requested operation has successfully
     * completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The requested operation has unsuccessfully
     * completed. Investigate using the error messages returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR,
     * SUCCEEDED, FAILED
     *
     * @param status <p>
     *            The status of the provisioned product.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATED</code> - The request was created but the
     *            operation has not started.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> - The requested operation is in
     *            progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is
     *            under change but the requested operation failed and some
     *            remediation is occurring. For example, a rollback.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code> - The requested operation has
     *            successfully completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - The requested operation has
     *            unsuccessfully completed. Investigate using the error messages
     *            returned.
     *            </p>
     *            </li>
     *            </ul>
     * @see RecordStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The request was created but the operation has not
     * started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The requested operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under
     * change but the requested operation failed and some remediation is
     * occurring. For example, a rollback.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The requested operation has successfully
     * completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The requested operation has unsuccessfully
     * completed. Investigate using the error messages returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR,
     * SUCCEEDED, FAILED
     *
     * @param status <p>
     *            The status of the provisioned product.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATED</code> - The request was created but the
     *            operation has not started.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> - The requested operation is in
     *            progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is
     *            under change but the requested operation failed and some
     *            remediation is occurring. For example, a rollback.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code> - The requested operation has
     *            successfully completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - The requested operation has
     *            unsuccessfully completed. Investigate using the error messages
     *            returned.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecordStatus
     */
    public RecordDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The request was created but the operation has not
     * started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The requested operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under
     * change but the requested operation failed and some remediation is
     * occurring. For example, a rollback.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The requested operation has successfully
     * completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The requested operation has unsuccessfully
     * completed. Investigate using the error messages returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR,
     * SUCCEEDED, FAILED
     *
     * @param status <p>
     *            The status of the provisioned product.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATED</code> - The request was created but the
     *            operation has not started.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> - The requested operation is in
     *            progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is
     *            under change but the requested operation failed and some
     *            remediation is occurring. For example, a rollback.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code> - The requested operation has
     *            successfully completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - The requested operation has
     *            unsuccessfully completed. Investigate using the error messages
     *            returned.
     *            </p>
     *            </li>
     *            </ul>
     * @see RecordStatus
     */
    public void setStatus(RecordStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The request was created but the operation has not
     * started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The requested operation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is under
     * change but the requested operation failed and some remediation is
     * occurring. For example, a rollback.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - The requested operation has successfully
     * completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The requested operation has unsuccessfully
     * completed. Investigate using the error messages returned.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR,
     * SUCCEEDED, FAILED
     *
     * @param status <p>
     *            The status of the provisioned product.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CREATED</code> - The request was created but the
     *            operation has not started.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS</code> - The requested operation is in
     *            progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_PROGRESS_IN_ERROR</code> - The provisioned product is
     *            under change but the requested operation failed and some
     *            remediation is occurring. For example, a rollback.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code> - The requested operation has
     *            successfully completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - The requested operation has
     *            unsuccessfully completed. Investigate using the error messages
     *            returned.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecordStatus
     */
    public RecordDetail withStatus(RecordStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     *
     * @return <p>
     *         The UTC time stamp of the creation time.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     *
     * @param createdTime <p>
     *            The UTC time stamp of the creation time.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The UTC time stamp of the creation time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordDetail withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The time when the record was last updated.
     * </p>
     *
     * @return <p>
     *         The time when the record was last updated.
     *         </p>
     */
    public java.util.Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * <p>
     * The time when the record was last updated.
     * </p>
     *
     * @param updatedTime <p>
     *            The time when the record was last updated.
     *            </p>
     */
    public void setUpdatedTime(java.util.Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * <p>
     * The time when the record was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedTime <p>
     *            The time when the record was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordDetail withUpdatedTime(java.util.Date updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * <p>
     * The type of provisioned product. The supported values are
     * <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     * </p>
     *
     * @return <p>
     *         The type of provisioned product. The supported values are
     *         <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     *         </p>
     */
    public String getProvisionedProductType() {
        return provisionedProductType;
    }

    /**
     * <p>
     * The type of provisioned product. The supported values are
     * <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     * </p>
     *
     * @param provisionedProductType <p>
     *            The type of provisioned product. The supported values are
     *            <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     *            </p>
     */
    public void setProvisionedProductType(String provisionedProductType) {
        this.provisionedProductType = provisionedProductType;
    }

    /**
     * <p>
     * The type of provisioned product. The supported values are
     * <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedProductType <p>
     *            The type of provisioned product. The supported values are
     *            <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordDetail withProvisionedProductType(String provisionedProductType) {
        this.provisionedProductType = provisionedProductType;
        return this;
    }

    /**
     * <p>
     * The record type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISION_PRODUCT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_PROVISIONED_PRODUCT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATE_PROVISIONED_PRODUCT</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The record type.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PROVISION_PRODUCT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_PROVISIONED_PRODUCT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TERMINATE_PROVISIONED_PRODUCT</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getRecordType() {
        return recordType;
    }

    /**
     * <p>
     * The record type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISION_PRODUCT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_PROVISIONED_PRODUCT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATE_PROVISIONED_PRODUCT</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param recordType <p>
     *            The record type.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PROVISION_PRODUCT</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATE_PROVISIONED_PRODUCT</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TERMINATE_PROVISIONED_PRODUCT</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    /**
     * <p>
     * The record type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISION_PRODUCT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_PROVISIONED_PRODUCT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATE_PROVISIONED_PRODUCT</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recordType <p>
     *            The record type.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PROVISION_PRODUCT</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UPDATE_PROVISIONED_PRODUCT</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TERMINATE_PROVISIONED_PRODUCT</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordDetail withRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the provisioned product.
     *         </p>
     */
    public String getProvisionedProductId() {
        return provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisionedProductId <p>
     *            The identifier of the provisioned product.
     *            </p>
     */
    public void setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisionedProductId <p>
     *            The identifier of the provisioned product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordDetail withProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The product identifier.
     *         </p>
     */
    public String getProductId() {
        return productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param productId <p>
     *            The product identifier.
     *            </p>
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param productId <p>
     *            The product identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordDetail withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the provisioning artifact.
     *         </p>
     */
    public String getProvisioningArtifactId() {
        return provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisioningArtifactId <p>
     *            The identifier of the provisioning artifact.
     *            </p>
     */
    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisioningArtifactId <p>
     *            The identifier of the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordDetail withProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
        return this;
    }

    /**
     * <p>
     * The path identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The path identifier.
     *         </p>
     */
    public String getPathId() {
        return pathId;
    }

    /**
     * <p>
     * The path identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param pathId <p>
     *            The path identifier.
     *            </p>
     */
    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    /**
     * <p>
     * The path identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param pathId <p>
     *            The path identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordDetail withPathId(String pathId) {
        this.pathId = pathId;
        return this;
    }

    /**
     * <p>
     * The errors that occurred.
     * </p>
     *
     * @return <p>
     *         The errors that occurred.
     *         </p>
     */
    public java.util.List<RecordError> getRecordErrors() {
        return recordErrors;
    }

    /**
     * <p>
     * The errors that occurred.
     * </p>
     *
     * @param recordErrors <p>
     *            The errors that occurred.
     *            </p>
     */
    public void setRecordErrors(java.util.Collection<RecordError> recordErrors) {
        if (recordErrors == null) {
            this.recordErrors = null;
            return;
        }

        this.recordErrors = new java.util.ArrayList<RecordError>(recordErrors);
    }

    /**
     * <p>
     * The errors that occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recordErrors <p>
     *            The errors that occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordDetail withRecordErrors(RecordError... recordErrors) {
        if (getRecordErrors() == null) {
            this.recordErrors = new java.util.ArrayList<RecordError>(recordErrors.length);
        }
        for (RecordError value : recordErrors) {
            this.recordErrors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The errors that occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recordErrors <p>
     *            The errors that occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordDetail withRecordErrors(java.util.Collection<RecordError> recordErrors) {
        setRecordErrors(recordErrors);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @return <p>
     *         One or more tags.
     *         </p>
     */
    public java.util.List<RecordTag> getRecordTags() {
        return recordTags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @param recordTags <p>
     *            One or more tags.
     *            </p>
     */
    public void setRecordTags(java.util.Collection<RecordTag> recordTags) {
        if (recordTags == null) {
            this.recordTags = null;
            return;
        }

        this.recordTags = new java.util.ArrayList<RecordTag>(recordTags);
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recordTags <p>
     *            One or more tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordDetail withRecordTags(RecordTag... recordTags) {
        if (getRecordTags() == null) {
            this.recordTags = new java.util.ArrayList<RecordTag>(recordTags.length);
        }
        for (RecordTag value : recordTags) {
            this.recordTags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recordTags <p>
     *            One or more tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RecordDetail withRecordTags(java.util.Collection<RecordTag> recordTags) {
        setRecordTags(recordTags);
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
        if (getRecordId() != null)
            sb.append("RecordId: " + getRecordId() + ",");
        if (getProvisionedProductName() != null)
            sb.append("ProvisionedProductName: " + getProvisionedProductName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getUpdatedTime() != null)
            sb.append("UpdatedTime: " + getUpdatedTime() + ",");
        if (getProvisionedProductType() != null)
            sb.append("ProvisionedProductType: " + getProvisionedProductType() + ",");
        if (getRecordType() != null)
            sb.append("RecordType: " + getRecordType() + ",");
        if (getProvisionedProductId() != null)
            sb.append("ProvisionedProductId: " + getProvisionedProductId() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: " + getProvisioningArtifactId() + ",");
        if (getPathId() != null)
            sb.append("PathId: " + getPathId() + ",");
        if (getRecordErrors() != null)
            sb.append("RecordErrors: " + getRecordErrors() + ",");
        if (getRecordTags() != null)
            sb.append("RecordTags: " + getRecordTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedProductName() == null) ? 0 : getProvisionedProductName()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedProductType() == null) ? 0 : getProvisionedProductType()
                        .hashCode());
        hashCode = prime * hashCode + ((getRecordType() == null) ? 0 : getRecordType().hashCode());
        hashCode = prime * hashCode
                + ((getProvisionedProductId() == null) ? 0 : getProvisionedProductId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId()
                        .hashCode());
        hashCode = prime * hashCode + ((getPathId() == null) ? 0 : getPathId().hashCode());
        hashCode = prime * hashCode
                + ((getRecordErrors() == null) ? 0 : getRecordErrors().hashCode());
        hashCode = prime * hashCode + ((getRecordTags() == null) ? 0 : getRecordTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordDetail == false)
            return false;
        RecordDetail other = (RecordDetail) obj;

        if (other.getRecordId() == null ^ this.getRecordId() == null)
            return false;
        if (other.getRecordId() != null && other.getRecordId().equals(this.getRecordId()) == false)
            return false;
        if (other.getProvisionedProductName() == null ^ this.getProvisionedProductName() == null)
            return false;
        if (other.getProvisionedProductName() != null
                && other.getProvisionedProductName().equals(this.getProvisionedProductName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getUpdatedTime() == null ^ this.getUpdatedTime() == null)
            return false;
        if (other.getUpdatedTime() != null
                && other.getUpdatedTime().equals(this.getUpdatedTime()) == false)
            return false;
        if (other.getProvisionedProductType() == null ^ this.getProvisionedProductType() == null)
            return false;
        if (other.getProvisionedProductType() != null
                && other.getProvisionedProductType().equals(this.getProvisionedProductType()) == false)
            return false;
        if (other.getRecordType() == null ^ this.getRecordType() == null)
            return false;
        if (other.getRecordType() != null
                && other.getRecordType().equals(this.getRecordType()) == false)
            return false;
        if (other.getProvisionedProductId() == null ^ this.getProvisionedProductId() == null)
            return false;
        if (other.getProvisionedProductId() != null
                && other.getProvisionedProductId().equals(this.getProvisionedProductId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null
                && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null
                && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getPathId() == null ^ this.getPathId() == null)
            return false;
        if (other.getPathId() != null && other.getPathId().equals(this.getPathId()) == false)
            return false;
        if (other.getRecordErrors() == null ^ this.getRecordErrors() == null)
            return false;
        if (other.getRecordErrors() != null
                && other.getRecordErrors().equals(this.getRecordErrors()) == false)
            return false;
        if (other.getRecordTags() == null ^ this.getRecordTags() == null)
            return false;
        if (other.getRecordTags() != null
                && other.getRecordTags().equals(this.getRecordTags()) == false)
            return false;
        return true;
    }
}
