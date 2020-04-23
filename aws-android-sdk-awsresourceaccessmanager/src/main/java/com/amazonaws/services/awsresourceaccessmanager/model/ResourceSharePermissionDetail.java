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
 * Information about an AWS RAM permission.
 * </p>
 */
public class ResourceSharePermissionDetail implements Serializable {
    /**
     * <p>
     * The ARN of the permission.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The identifier for the version of the permission.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The identifier for the version of the permission that is set as the
     * default version.
     * </p>
     */
    private Boolean defaultVersion;

    /**
     * <p>
     * The name of the permission.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The resource type to which the permission applies.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The permission's effect and actions in JSON format. The
     * <code>effect</code> indicates whether the actions are allowed or denied.
     * The <code>actions</code> list the API actions to which the principal is
     * granted or denied access.
     * </p>
     */
    private String permission;

    /**
     * <p>
     * The date and time when the permission was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The date and time when the permission was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The ARN of the permission.
     * </p>
     *
     * @return <p>
     *         The ARN of the permission.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN of the permission.
     * </p>
     *
     * @param arn <p>
     *            The ARN of the permission.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the permission.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The ARN of the permission.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSharePermissionDetail withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The identifier for the version of the permission.
     * </p>
     *
     * @return <p>
     *         The identifier for the version of the permission.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The identifier for the version of the permission.
     * </p>
     *
     * @param version <p>
     *            The identifier for the version of the permission.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The identifier for the version of the permission.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The identifier for the version of the permission.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSharePermissionDetail withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The identifier for the version of the permission that is set as the
     * default version.
     * </p>
     *
     * @return <p>
     *         The identifier for the version of the permission that is set as
     *         the default version.
     *         </p>
     */
    public Boolean isDefaultVersion() {
        return defaultVersion;
    }

    /**
     * <p>
     * The identifier for the version of the permission that is set as the
     * default version.
     * </p>
     *
     * @return <p>
     *         The identifier for the version of the permission that is set as
     *         the default version.
     *         </p>
     */
    public Boolean getDefaultVersion() {
        return defaultVersion;
    }

    /**
     * <p>
     * The identifier for the version of the permission that is set as the
     * default version.
     * </p>
     *
     * @param defaultVersion <p>
     *            The identifier for the version of the permission that is set
     *            as the default version.
     *            </p>
     */
    public void setDefaultVersion(Boolean defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    /**
     * <p>
     * The identifier for the version of the permission that is set as the
     * default version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultVersion <p>
     *            The identifier for the version of the permission that is set
     *            as the default version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSharePermissionDetail withDefaultVersion(Boolean defaultVersion) {
        this.defaultVersion = defaultVersion;
        return this;
    }

    /**
     * <p>
     * The name of the permission.
     * </p>
     *
     * @return <p>
     *         The name of the permission.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the permission.
     * </p>
     *
     * @param name <p>
     *            The name of the permission.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the permission.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the permission.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSharePermissionDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The resource type to which the permission applies.
     * </p>
     *
     * @return <p>
     *         The resource type to which the permission applies.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The resource type to which the permission applies.
     * </p>
     *
     * @param resourceType <p>
     *            The resource type to which the permission applies.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type to which the permission applies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceType <p>
     *            The resource type to which the permission applies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSharePermissionDetail withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The permission's effect and actions in JSON format. The
     * <code>effect</code> indicates whether the actions are allowed or denied.
     * The <code>actions</code> list the API actions to which the principal is
     * granted or denied access.
     * </p>
     *
     * @return <p>
     *         The permission's effect and actions in JSON format. The
     *         <code>effect</code> indicates whether the actions are allowed or
     *         denied. The <code>actions</code> list the API actions to which
     *         the principal is granted or denied access.
     *         </p>
     */
    public String getPermission() {
        return permission;
    }

    /**
     * <p>
     * The permission's effect and actions in JSON format. The
     * <code>effect</code> indicates whether the actions are allowed or denied.
     * The <code>actions</code> list the API actions to which the principal is
     * granted or denied access.
     * </p>
     *
     * @param permission <p>
     *            The permission's effect and actions in JSON format. The
     *            <code>effect</code> indicates whether the actions are allowed
     *            or denied. The <code>actions</code> list the API actions to
     *            which the principal is granted or denied access.
     *            </p>
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * <p>
     * The permission's effect and actions in JSON format. The
     * <code>effect</code> indicates whether the actions are allowed or denied.
     * The <code>actions</code> list the API actions to which the principal is
     * granted or denied access.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permission <p>
     *            The permission's effect and actions in JSON format. The
     *            <code>effect</code> indicates whether the actions are allowed
     *            or denied. The <code>actions</code> list the API actions to
     *            which the principal is granted or denied access.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSharePermissionDetail withPermission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * <p>
     * The date and time when the permission was created.
     * </p>
     *
     * @return <p>
     *         The date and time when the permission was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time when the permission was created.
     * </p>
     *
     * @param creationTime <p>
     *            The date and time when the permission was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time when the permission was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time when the permission was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSharePermissionDetail withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The date and time when the permission was last updated.
     * </p>
     *
     * @return <p>
     *         The date and time when the permission was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time when the permission was last updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The date and time when the permission was last updated.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time when the permission was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The date and time when the permission was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceSharePermissionDetail withLastUpdatedTime(java.util.Date lastUpdatedTime) {
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
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getDefaultVersion() != null)
            sb.append("defaultVersion: " + getDefaultVersion() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getPermission() != null)
            sb.append("permission: " + getPermission() + ",");
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
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultVersion() == null) ? 0 : getDefaultVersion().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
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

        if (obj instanceof ResourceSharePermissionDetail == false)
            return false;
        ResourceSharePermissionDetail other = (ResourceSharePermissionDetail) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getDefaultVersion() == null ^ this.getDefaultVersion() == null)
            return false;
        if (other.getDefaultVersion() != null
                && other.getDefaultVersion().equals(this.getDefaultVersion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null
                && other.getPermission().equals(this.getPermission()) == false)
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
