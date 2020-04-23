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
 * Describes a resource associated with a resource share.
 * </p>
 */
public class Resource implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     */
    private String resourceShareArn;

    /**
     * <p>
     * The ARN of the resource group. This value is returned only if the
     * resource is a resource group.
     * </p>
     */
    private String resourceGroupArn;

    /**
     * <p>
     * The status of the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, ZONAL_RESOURCE_INACCESSIBLE,
     * LIMIT_EXCEEDED, UNAVAILABLE, PENDING
     */
    private String status;

    /**
     * <p>
     * A message about the status of the resource.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The time when the resource was associated with the resource share.
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
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the resource.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     *
     * @return <p>
     *         The resource type.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     *
     * @param type <p>
     *            The resource type.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withType(String type) {
        this.type = type;
        return this;
    }

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
    public Resource withResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the resource group. This value is returned only if the
     * resource is a resource group.
     * </p>
     *
     * @return <p>
     *         The ARN of the resource group. This value is returned only if the
     *         resource is a resource group.
     *         </p>
     */
    public String getResourceGroupArn() {
        return resourceGroupArn;
    }

    /**
     * <p>
     * The ARN of the resource group. This value is returned only if the
     * resource is a resource group.
     * </p>
     *
     * @param resourceGroupArn <p>
     *            The ARN of the resource group. This value is returned only if
     *            the resource is a resource group.
     *            </p>
     */
    public void setResourceGroupArn(String resourceGroupArn) {
        this.resourceGroupArn = resourceGroupArn;
    }

    /**
     * <p>
     * The ARN of the resource group. This value is returned only if the
     * resource is a resource group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceGroupArn <p>
     *            The ARN of the resource group. This value is returned only if
     *            the resource is a resource group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withResourceGroupArn(String resourceGroupArn) {
        this.resourceGroupArn = resourceGroupArn;
        return this;
    }

    /**
     * <p>
     * The status of the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, ZONAL_RESOURCE_INACCESSIBLE,
     * LIMIT_EXCEEDED, UNAVAILABLE, PENDING
     *
     * @return <p>
     *         The status of the resource.
     *         </p>
     * @see ResourceStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, ZONAL_RESOURCE_INACCESSIBLE,
     * LIMIT_EXCEEDED, UNAVAILABLE, PENDING
     *
     * @param status <p>
     *            The status of the resource.
     *            </p>
     * @see ResourceStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, ZONAL_RESOURCE_INACCESSIBLE,
     * LIMIT_EXCEEDED, UNAVAILABLE, PENDING
     *
     * @param status <p>
     *            The status of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceStatus
     */
    public Resource withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, ZONAL_RESOURCE_INACCESSIBLE,
     * LIMIT_EXCEEDED, UNAVAILABLE, PENDING
     *
     * @param status <p>
     *            The status of the resource.
     *            </p>
     * @see ResourceStatus
     */
    public void setStatus(ResourceStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, ZONAL_RESOURCE_INACCESSIBLE,
     * LIMIT_EXCEEDED, UNAVAILABLE, PENDING
     *
     * @param status <p>
     *            The status of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceStatus
     */
    public Resource withStatus(ResourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message about the status of the resource.
     * </p>
     *
     * @return <p>
     *         A message about the status of the resource.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * A message about the status of the resource.
     * </p>
     *
     * @param statusMessage <p>
     *            A message about the status of the resource.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message about the status of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            A message about the status of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The time when the resource was associated with the resource share.
     * </p>
     *
     * @return <p>
     *         The time when the resource was associated with the resource
     *         share.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time when the resource was associated with the resource share.
     * </p>
     *
     * @param creationTime <p>
     *            The time when the resource was associated with the resource
     *            share.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the resource was associated with the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time when the resource was associated with the resource
     *            share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Resource withCreationTime(java.util.Date creationTime) {
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
    public Resource withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getResourceShareArn() != null)
            sb.append("resourceShareArn: " + getResourceShareArn() + ",");
        if (getResourceGroupArn() != null)
            sb.append("resourceGroupArn: " + getResourceGroupArn() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("statusMessage: " + getStatusMessage() + ",");
        if (getCreationTime() != null)
            sb.append("creationTime: " + getCreationTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("lastUpdatedTime: " + getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        hashCode = prime * hashCode
                + ((getResourceGroupArn() == null) ? 0 : getResourceGroupArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null
                && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getResourceGroupArn() == null ^ this.getResourceGroupArn() == null)
            return false;
        if (other.getResourceGroupArn() != null
                && other.getResourceGroupArn().equals(this.getResourceGroupArn()) == false)
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
        return true;
    }
}
