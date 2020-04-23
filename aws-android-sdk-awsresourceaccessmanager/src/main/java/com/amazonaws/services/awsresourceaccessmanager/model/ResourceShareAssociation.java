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

package com.amazonaws.services.awsresourceaccessmanager.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an association with a resource share.
 * </p>
 */
public class ResourceShareAssociation implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     */
    private String resourceShareArn;

    /**
     * <p>
     * The name of the resource share.
     * </p>
     */
    private String resourceShareName;

    /**
     * <p>
     * The associated entity. For resource associations, this is the ARN of the
     * resource. For principal associations, this is the ID of an AWS account or
     * the ARN of an OU or organization from AWS Organizations.
     * </p>
     */
    private String associatedEntity;

    /**
     * <p>
     * The association type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRINCIPAL, RESOURCE
     */
    private String associationType;

    /**
     * <p>
     * The status of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING,
     * DISASSOCIATED
     */
    private String status;

    /**
     * <p>
     * A message about the status of the association.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The time when the association was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The time when the association was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * Indicates whether the principal belongs to the same AWS organization as
     * the AWS account that owns the resource share.
     * </p>
     */
    private Boolean external;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource share.
     *         </p>
     */
    public String getResourceShareArn() {
        return resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     *
     * @param resourceShareArn <p>
     *            The Amazon Resource Name (ARN) of the resource share.
     *            </p>
     */
    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareArn <p>
     *            The Amazon Resource Name (ARN) of the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShareAssociation withResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
        return this;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     *
     * @return <p>
     *         The name of the resource share.
     *         </p>
     */
    public String getResourceShareName() {
        return resourceShareName;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     *
     * @param resourceShareName <p>
     *            The name of the resource share.
     *            </p>
     */
    public void setResourceShareName(String resourceShareName) {
        this.resourceShareName = resourceShareName;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareName <p>
     *            The name of the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShareAssociation withResourceShareName(String resourceShareName) {
        this.resourceShareName = resourceShareName;
        return this;
    }

    /**
     * <p>
     * The associated entity. For resource associations, this is the ARN of the
     * resource. For principal associations, this is the ID of an AWS account or
     * the ARN of an OU or organization from AWS Organizations.
     * </p>
     *
     * @return <p>
     *         The associated entity. For resource associations, this is the ARN
     *         of the resource. For principal associations, this is the ID of an
     *         AWS account or the ARN of an OU or organization from AWS
     *         Organizations.
     *         </p>
     */
    public String getAssociatedEntity() {
        return associatedEntity;
    }

    /**
     * <p>
     * The associated entity. For resource associations, this is the ARN of the
     * resource. For principal associations, this is the ID of an AWS account or
     * the ARN of an OU or organization from AWS Organizations.
     * </p>
     *
     * @param associatedEntity <p>
     *            The associated entity. For resource associations, this is the
     *            ARN of the resource. For principal associations, this is the
     *            ID of an AWS account or the ARN of an OU or organization from
     *            AWS Organizations.
     *            </p>
     */
    public void setAssociatedEntity(String associatedEntity) {
        this.associatedEntity = associatedEntity;
    }

    /**
     * <p>
     * The associated entity. For resource associations, this is the ARN of the
     * resource. For principal associations, this is the ID of an AWS account or
     * the ARN of an OU or organization from AWS Organizations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedEntity <p>
     *            The associated entity. For resource associations, this is the
     *            ARN of the resource. For principal associations, this is the
     *            ID of an AWS account or the ARN of an OU or organization from
     *            AWS Organizations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShareAssociation withAssociatedEntity(String associatedEntity) {
        this.associatedEntity = associatedEntity;
        return this;
    }

    /**
     * <p>
     * The association type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRINCIPAL, RESOURCE
     *
     * @return <p>
     *         The association type.
     *         </p>
     * @see ResourceShareAssociationType
     */
    public String getAssociationType() {
        return associationType;
    }

    /**
     * <p>
     * The association type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRINCIPAL, RESOURCE
     *
     * @param associationType <p>
     *            The association type.
     *            </p>
     * @see ResourceShareAssociationType
     */
    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * The association type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRINCIPAL, RESOURCE
     *
     * @param associationType <p>
     *            The association type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceShareAssociationType
     */
    public ResourceShareAssociation withAssociationType(String associationType) {
        this.associationType = associationType;
        return this;
    }

    /**
     * <p>
     * The association type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRINCIPAL, RESOURCE
     *
     * @param associationType <p>
     *            The association type.
     *            </p>
     * @see ResourceShareAssociationType
     */
    public void setAssociationType(ResourceShareAssociationType associationType) {
        this.associationType = associationType.toString();
    }

    /**
     * <p>
     * The association type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRINCIPAL, RESOURCE
     *
     * @param associationType <p>
     *            The association type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceShareAssociationType
     */
    public ResourceShareAssociation withAssociationType(ResourceShareAssociationType associationType) {
        this.associationType = associationType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING,
     * DISASSOCIATED
     *
     * @return <p>
     *         The status of the association.
     *         </p>
     * @see ResourceShareAssociationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING,
     * DISASSOCIATED
     *
     * @param status <p>
     *            The status of the association.
     *            </p>
     * @see ResourceShareAssociationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING,
     * DISASSOCIATED
     *
     * @param status <p>
     *            The status of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceShareAssociationStatus
     */
    public ResourceShareAssociation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING,
     * DISASSOCIATED
     *
     * @param status <p>
     *            The status of the association.
     *            </p>
     * @see ResourceShareAssociationStatus
     */
    public void setStatus(ResourceShareAssociationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATED, FAILED, DISASSOCIATING,
     * DISASSOCIATED
     *
     * @param status <p>
     *            The status of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceShareAssociationStatus
     */
    public ResourceShareAssociation withStatus(ResourceShareAssociationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message about the status of the association.
     * </p>
     *
     * @return <p>
     *         A message about the status of the association.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * A message about the status of the association.
     * </p>
     *
     * @param statusMessage <p>
     *            A message about the status of the association.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message about the status of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            A message about the status of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShareAssociation withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The time when the association was created.
     * </p>
     *
     * @return <p>
     *         The time when the association was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time when the association was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time when the association was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the association was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time when the association was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShareAssociation withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The time when the association was last updated.
     * </p>
     *
     * @return <p>
     *         The time when the association was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the association was last updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The time when the association was last updated.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the association was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The time when the association was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShareAssociation withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * Indicates whether the principal belongs to the same AWS organization as
     * the AWS account that owns the resource share.
     * </p>
     *
     * @return <p>
     *         Indicates whether the principal belongs to the same AWS
     *         organization as the AWS account that owns the resource share.
     *         </p>
     */
    public Boolean isExternal() {
        return external;
    }

    /**
     * <p>
     * Indicates whether the principal belongs to the same AWS organization as
     * the AWS account that owns the resource share.
     * </p>
     *
     * @return <p>
     *         Indicates whether the principal belongs to the same AWS
     *         organization as the AWS account that owns the resource share.
     *         </p>
     */
    public Boolean getExternal() {
        return external;
    }

    /**
     * <p>
     * Indicates whether the principal belongs to the same AWS organization as
     * the AWS account that owns the resource share.
     * </p>
     *
     * @param external <p>
     *            Indicates whether the principal belongs to the same AWS
     *            organization as the AWS account that owns the resource share.
     *            </p>
     */
    public void setExternal(Boolean external) {
        this.external = external;
    }

    /**
     * <p>
     * Indicates whether the principal belongs to the same AWS organization as
     * the AWS account that owns the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param external <p>
     *            Indicates whether the principal belongs to the same AWS
     *            organization as the AWS account that owns the resource share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceShareAssociation withExternal(Boolean external) {
        this.external = external;
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
        if (getResourceShareArn() != null)
            sb.append("resourceShareArn: " + getResourceShareArn() + ",");
        if (getResourceShareName() != null)
            sb.append("resourceShareName: " + getResourceShareName() + ",");
        if (getAssociatedEntity() != null)
            sb.append("associatedEntity: " + getAssociatedEntity() + ",");
        if (getAssociationType() != null)
            sb.append("associationType: " + getAssociationType() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("statusMessage: " + getStatusMessage() + ",");
        if (getCreationTime() != null)
            sb.append("creationTime: " + getCreationTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("lastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getExternal() != null)
            sb.append("external: " + getExternal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        hashCode = prime * hashCode
                + ((getResourceShareName() == null) ? 0 : getResourceShareName().hashCode());
        hashCode = prime * hashCode
                + ((getAssociatedEntity() == null) ? 0 : getAssociatedEntity().hashCode());
        hashCode = prime * hashCode
                + ((getAssociationType() == null) ? 0 : getAssociationType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getExternal() == null) ? 0 : getExternal().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceShareAssociation == false)
            return false;
        ResourceShareAssociation other = (ResourceShareAssociation) obj;

        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null
                && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getResourceShareName() == null ^ this.getResourceShareName() == null)
            return false;
        if (other.getResourceShareName() != null
                && other.getResourceShareName().equals(this.getResourceShareName()) == false)
            return false;
        if (other.getAssociatedEntity() == null ^ this.getAssociatedEntity() == null)
            return false;
        if (other.getAssociatedEntity() != null
                && other.getAssociatedEntity().equals(this.getAssociatedEntity()) == false)
            return false;
        if (other.getAssociationType() == null ^ this.getAssociationType() == null)
            return false;
        if (other.getAssociationType() != null
                && other.getAssociationType().equals(this.getAssociationType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getExternal() == null ^ this.getExternal() == null)
            return false;
        if (other.getExternal() != null && other.getExternal().equals(this.getExternal()) == false)
            return false;
        return true;
    }
}
