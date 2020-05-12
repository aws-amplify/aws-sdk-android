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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Contains an access policy that defines an AWS SSO identity's access to an AWS
 * IoT SiteWise Monitor resource.
 * </p>
 */
public class AccessPolicySummary implements Serializable {
    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String id;

    /**
     * <p>
     * The AWS SSO identity (a user or group).
     * </p>
     */
    private Identity identity;

    /**
     * <p>
     * The AWS IoT SiteWise Monitor resource (a portal or project).
     * </p>
     */
    private Resource resource;

    /**
     * <p>
     * The permissions for the access policy. Note that a project
     * <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMINISTRATOR, VIEWER
     */
    private String permission;

    /**
     * <p>
     * The date the access policy was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date the access policy was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date lastUpdateDate;

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of the access policy.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param id <p>
     *            The ID of the access policy.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param id <p>
     *            The ID of the access policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPolicySummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The AWS SSO identity (a user or group).
     * </p>
     *
     * @return <p>
     *         The AWS SSO identity (a user or group).
     *         </p>
     */
    public Identity getIdentity() {
        return identity;
    }

    /**
     * <p>
     * The AWS SSO identity (a user or group).
     * </p>
     *
     * @param identity <p>
     *            The AWS SSO identity (a user or group).
     *            </p>
     */
    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The AWS SSO identity (a user or group).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identity <p>
     *            The AWS SSO identity (a user or group).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPolicySummary withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * <p>
     * The AWS IoT SiteWise Monitor resource (a portal or project).
     * </p>
     *
     * @return <p>
     *         The AWS IoT SiteWise Monitor resource (a portal or project).
     *         </p>
     */
    public Resource getResource() {
        return resource;
    }

    /**
     * <p>
     * The AWS IoT SiteWise Monitor resource (a portal or project).
     * </p>
     *
     * @param resource <p>
     *            The AWS IoT SiteWise Monitor resource (a portal or project).
     *            </p>
     */
    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The AWS IoT SiteWise Monitor resource (a portal or project).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resource <p>
     *            The AWS IoT SiteWise Monitor resource (a portal or project).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPolicySummary withResource(Resource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * <p>
     * The permissions for the access policy. Note that a project
     * <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMINISTRATOR, VIEWER
     *
     * @return <p>
     *         The permissions for the access policy. Note that a project
     *         <code>ADMINISTRATOR</code> is also known as a project owner.
     *         </p>
     * @see Permission
     */
    public String getPermission() {
        return permission;
    }

    /**
     * <p>
     * The permissions for the access policy. Note that a project
     * <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMINISTRATOR, VIEWER
     *
     * @param permission <p>
     *            The permissions for the access policy. Note that a project
     *            <code>ADMINISTRATOR</code> is also known as a project owner.
     *            </p>
     * @see Permission
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * <p>
     * The permissions for the access policy. Note that a project
     * <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMINISTRATOR, VIEWER
     *
     * @param permission <p>
     *            The permissions for the access policy. Note that a project
     *            <code>ADMINISTRATOR</code> is also known as a project owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Permission
     */
    public AccessPolicySummary withPermission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * <p>
     * The permissions for the access policy. Note that a project
     * <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMINISTRATOR, VIEWER
     *
     * @param permission <p>
     *            The permissions for the access policy. Note that a project
     *            <code>ADMINISTRATOR</code> is also known as a project owner.
     *            </p>
     * @see Permission
     */
    public void setPermission(Permission permission) {
        this.permission = permission.toString();
    }

    /**
     * <p>
     * The permissions for the access policy. Note that a project
     * <code>ADMINISTRATOR</code> is also known as a project owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMINISTRATOR, VIEWER
     *
     * @param permission <p>
     *            The permissions for the access policy. Note that a project
     *            <code>ADMINISTRATOR</code> is also known as a project owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Permission
     */
    public AccessPolicySummary withPermission(Permission permission) {
        this.permission = permission.toString();
        return this;
    }

    /**
     * <p>
     * The date the access policy was created, in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The date the access policy was created, in Unix epoch time.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date the access policy was created, in Unix epoch time.
     * </p>
     *
     * @param creationDate <p>
     *            The date the access policy was created, in Unix epoch time.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the access policy was created, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date the access policy was created, in Unix epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPolicySummary withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date the access policy was last updated, in Unix epoch time.
     * </p>
     *
     * @return <p>
     *         The date the access policy was last updated, in Unix epoch time.
     *         </p>
     */
    public java.util.Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * <p>
     * The date the access policy was last updated, in Unix epoch time.
     * </p>
     *
     * @param lastUpdateDate <p>
     *            The date the access policy was last updated, in Unix epoch
     *            time.
     *            </p>
     */
    public void setLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * <p>
     * The date the access policy was last updated, in Unix epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdateDate <p>
     *            The date the access policy was last updated, in Unix epoch
     *            time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessPolicySummary withLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
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
        if (getIdentity() != null)
            sb.append("identity: " + getIdentity() + ",");
        if (getResource() != null)
            sb.append("resource: " + getResource() + ",");
        if (getPermission() != null)
            sb.append("permission: " + getPermission() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastUpdateDate() != null)
            sb.append("lastUpdateDate: " + getLastUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessPolicySummary == false)
            return false;
        AccessPolicySummary other = (AccessPolicySummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null
                && other.getPermission().equals(this.getPermission()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastUpdateDate() == null ^ this.getLastUpdateDate() == null)
            return false;
        if (other.getLastUpdateDate() != null
                && other.getLastUpdateDate().equals(this.getLastUpdateDate()) == false)
            return false;
        return true;
    }
}
