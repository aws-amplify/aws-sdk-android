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
 * An object containing information about the error, along with identifying
 * information about the self-service action and its associations.
 * </p>
 */
public class FailedServiceActionAssociation implements Serializable {
    /**
     * <p>
     * The self-service action identifier. For example,
     * <code>act-fs7abcd89wxyz</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String serviceActionId;

    /**
     * <p>
     * The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String productId;

    /**
     * <p>
     * The identifier of the provisioning artifact. For example,
     * <code>pa-4abcdjnxjj6ne</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String provisioningArtifactId;

    /**
     * <p>
     * The error code. Valid values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_RESOURCE, INTERNAL_FAILURE,
     * LIMIT_EXCEEDED, RESOURCE_NOT_FOUND, THROTTLING
     */
    private String errorCode;

    /**
     * <p>
     * A text description of the error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String errorMessage;

    /**
     * <p>
     * The self-service action identifier. For example,
     * <code>act-fs7abcd89wxyz</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The self-service action identifier. For example,
     *         <code>act-fs7abcd89wxyz</code>.
     *         </p>
     */
    public String getServiceActionId() {
        return serviceActionId;
    }

    /**
     * <p>
     * The self-service action identifier. For example,
     * <code>act-fs7abcd89wxyz</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param serviceActionId <p>
     *            The self-service action identifier. For example,
     *            <code>act-fs7abcd89wxyz</code>.
     *            </p>
     */
    public void setServiceActionId(String serviceActionId) {
        this.serviceActionId = serviceActionId;
    }

    /**
     * <p>
     * The self-service action identifier. For example,
     * <code>act-fs7abcd89wxyz</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param serviceActionId <p>
     *            The self-service action identifier. For example,
     *            <code>act-fs7abcd89wxyz</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailedServiceActionAssociation withServiceActionId(String serviceActionId) {
        this.serviceActionId = serviceActionId;
        return this;
    }

    /**
     * <p>
     * The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The product identifier. For example,
     *         <code>prod-abcdzk7xy33qa</code>.
     *         </p>
     */
    public String getProductId() {
        return productId;
    }

    /**
     * <p>
     * The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param productId <p>
     *            The product identifier. For example,
     *            <code>prod-abcdzk7xy33qa</code>.
     *            </p>
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
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
     *            The product identifier. For example,
     *            <code>prod-abcdzk7xy33qa</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailedServiceActionAssociation withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. For example,
     * <code>pa-4abcdjnxjj6ne</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the provisioning artifact. For example,
     *         <code>pa-4abcdjnxjj6ne</code>.
     *         </p>
     */
    public String getProvisioningArtifactId() {
        return provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. For example,
     * <code>pa-4abcdjnxjj6ne</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisioningArtifactId <p>
     *            The identifier of the provisioning artifact. For example,
     *            <code>pa-4abcdjnxjj6ne</code>.
     *            </p>
     */
    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. For example,
     * <code>pa-4abcdjnxjj6ne</code>.
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
     *            The identifier of the provisioning artifact. For example,
     *            <code>pa-4abcdjnxjj6ne</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailedServiceActionAssociation withProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
        return this;
    }

    /**
     * <p>
     * The error code. Valid values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_RESOURCE, INTERNAL_FAILURE,
     * LIMIT_EXCEEDED, RESOURCE_NOT_FOUND, THROTTLING
     *
     * @return <p>
     *         The error code. Valid values are listed below.
     *         </p>
     * @see ServiceActionAssociationErrorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The error code. Valid values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_RESOURCE, INTERNAL_FAILURE,
     * LIMIT_EXCEEDED, RESOURCE_NOT_FOUND, THROTTLING
     *
     * @param errorCode <p>
     *            The error code. Valid values are listed below.
     *            </p>
     * @see ServiceActionAssociationErrorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code. Valid values are listed below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_RESOURCE, INTERNAL_FAILURE,
     * LIMIT_EXCEEDED, RESOURCE_NOT_FOUND, THROTTLING
     *
     * @param errorCode <p>
     *            The error code. Valid values are listed below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceActionAssociationErrorCode
     */
    public FailedServiceActionAssociation withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * The error code. Valid values are listed below.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_RESOURCE, INTERNAL_FAILURE,
     * LIMIT_EXCEEDED, RESOURCE_NOT_FOUND, THROTTLING
     *
     * @param errorCode <p>
     *            The error code. Valid values are listed below.
     *            </p>
     * @see ServiceActionAssociationErrorCode
     */
    public void setErrorCode(ServiceActionAssociationErrorCode errorCode) {
        this.errorCode = errorCode.toString();
    }

    /**
     * <p>
     * The error code. Valid values are listed below.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_RESOURCE, INTERNAL_FAILURE,
     * LIMIT_EXCEEDED, RESOURCE_NOT_FOUND, THROTTLING
     *
     * @param errorCode <p>
     *            The error code. Valid values are listed below.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceActionAssociationErrorCode
     */
    public FailedServiceActionAssociation withErrorCode(ServiceActionAssociationErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * A text description of the error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A text description of the error.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * A text description of the error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param errorMessage <p>
     *            A text description of the error.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * A text description of the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param errorMessage <p>
     *            A text description of the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailedServiceActionAssociation withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        if (getServiceActionId() != null)
            sb.append("ServiceActionId: " + getServiceActionId() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: " + getProvisioningArtifactId() + ",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServiceActionId() == null) ? 0 : getServiceActionId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId()
                        .hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedServiceActionAssociation == false)
            return false;
        FailedServiceActionAssociation other = (FailedServiceActionAssociation) obj;

        if (other.getServiceActionId() == null ^ this.getServiceActionId() == null)
            return false;
        if (other.getServiceActionId() != null
                && other.getServiceActionId().equals(this.getServiceActionId()) == false)
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
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }
}
