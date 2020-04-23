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
 * Describes a principal for use with AWS Resource Access Manager.
 * </p>
 */
public class Principal implements Serializable {
    /**
     * <p>
     * The ID of the principal.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     */
    private String resourceShareArn;

    /**
     * <p>
     * The time when the principal was associated with the resource share.
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
     * The ID of the principal.
     * </p>
     *
     * @return <p>
     *         The ID of the principal.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the principal.
     * </p>
     *
     * @param id <p>
     *            The ID of the principal.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the principal.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The ID of the principal.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Principal withId(String id) {
        this.id = id;
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
    public Principal withResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
        return this;
    }

    /**
     * <p>
     * The time when the principal was associated with the resource share.
     * </p>
     *
     * @return <p>
     *         The time when the principal was associated with the resource
     *         share.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time when the principal was associated with the resource share.
     * </p>
     *
     * @param creationTime <p>
     *            The time when the principal was associated with the resource
     *            share.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the principal was associated with the resource share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time when the principal was associated with the resource
     *            share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Principal withCreationTime(java.util.Date creationTime) {
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
    public Principal withLastUpdatedTime(java.util.Date lastUpdatedTime) {
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
    public Principal withExternal(Boolean external) {
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getResourceShareArn() != null)
            sb.append("resourceShareArn: " + getResourceShareArn() + ",");
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
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

        if (obj instanceof Principal == false)
            return false;
        Principal other = (Principal) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null
                && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
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
