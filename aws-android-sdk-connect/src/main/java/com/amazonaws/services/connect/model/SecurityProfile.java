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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a security profile.
 * </p>
 */
public class SecurityProfile implements Serializable {
    /**
     * <p>
     * The identifier for the security profile.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The organization resource identifier for the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String organizationResourceId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the secruity profile.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The name for the security profile.
     * </p>
     */
    private String securityProfileName;

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 250<br/>
     */
    private String description;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier for the security profile.
     * </p>
     *
     * @return <p>
     *         The identifier for the security profile.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier for the security profile.
     * </p>
     *
     * @param id <p>
     *            The identifier for the security profile.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the security profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier for the security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityProfile withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The organization resource identifier for the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The organization resource identifier for the security profile.
     *         </p>
     */
    public String getOrganizationResourceId() {
        return organizationResourceId;
    }

    /**
     * <p>
     * The organization resource identifier for the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param organizationResourceId <p>
     *            The organization resource identifier for the security profile.
     *            </p>
     */
    public void setOrganizationResourceId(String organizationResourceId) {
        this.organizationResourceId = organizationResourceId;
    }

    /**
     * <p>
     * The organization resource identifier for the security profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param organizationResourceId <p>
     *            The organization resource identifier for the security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityProfile withOrganizationResourceId(String organizationResourceId) {
        this.organizationResourceId = organizationResourceId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the secruity profile.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the secruity profile.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the secruity profile.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the secruity profile.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the secruity profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the secruity profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityProfile withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The name for the security profile.
     * </p>
     *
     * @return <p>
     *         The name for the security profile.
     *         </p>
     */
    public String getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * <p>
     * The name for the security profile.
     * </p>
     *
     * @param securityProfileName <p>
     *            The name for the security profile.
     *            </p>
     */
    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name for the security profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileName <p>
     *            The name for the security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityProfile withSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
        return this;
    }

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 250<br/>
     *
     * @return <p>
     *         The description of the security profile.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 250<br/>
     *
     * @param description <p>
     *            The description of the security profile.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 250<br/>
     *
     * @param description <p>
     *            The description of the security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityProfile withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     *
     * @return <p>
     *         The tags used to organize, track, or control access for this
     *         resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityProfile withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SecurityProfile addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SecurityProfile clearTagsEntries() {
        this.tags = null;
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
            sb.append("Id: " + getId() + ",");
        if (getOrganizationResourceId() != null)
            sb.append("OrganizationResourceId: " + getOrganizationResourceId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getSecurityProfileName() != null)
            sb.append("SecurityProfileName: " + getSecurityProfileName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime
                * hashCode
                + ((getOrganizationResourceId() == null) ? 0 : getOrganizationResourceId()
                        .hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityProfile == false)
            return false;
        SecurityProfile other = (SecurityProfile) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getOrganizationResourceId() == null ^ this.getOrganizationResourceId() == null)
            return false;
        if (other.getOrganizationResourceId() != null
                && other.getOrganizationResourceId().equals(this.getOrganizationResourceId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null
                && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
