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

package com.amazonaws.services.workmail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Puts a retention policy to the specified organization.
 * </p>
 */
public class PutRetentionPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The organization ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     */
    private String organizationId;

    /**
     * <p>
     * The retention policy ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String id;

    /**
     * <p>
     * The retention policy name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String name;

    /**
     * <p>
     * The retention policy description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\w\d\s\S\-!?=,.;:'_]+<br/>
     */
    private String description;

    /**
     * <p>
     * The retention policy folder configurations.
     * </p>
     */
    private java.util.List<FolderConfiguration> folderConfigurations;

    /**
     * <p>
     * The organization ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @return <p>
     *         The organization ID.
     *         </p>
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * <p>
     * The organization ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The organization ID.
     *            </p>
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The organization ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The organization ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRetentionPolicyRequest withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * <p>
     * The retention policy ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The retention policy ID.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The retention policy ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param id <p>
     *            The retention policy ID.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The retention policy ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param id <p>
     *            The retention policy ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRetentionPolicyRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The retention policy name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The retention policy name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The retention policy name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param name <p>
     *            The retention policy name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The retention policy name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param name <p>
     *            The retention policy name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRetentionPolicyRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The retention policy description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\w\d\s\S\-!?=,.;:'_]+<br/>
     *
     * @return <p>
     *         The retention policy description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The retention policy description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\w\d\s\S\-!?=,.;:'_]+<br/>
     *
     * @param description <p>
     *            The retention policy description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The retention policy description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\w\d\s\S\-!?=,.;:'_]+<br/>
     *
     * @param description <p>
     *            The retention policy description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRetentionPolicyRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The retention policy folder configurations.
     * </p>
     *
     * @return <p>
     *         The retention policy folder configurations.
     *         </p>
     */
    public java.util.List<FolderConfiguration> getFolderConfigurations() {
        return folderConfigurations;
    }

    /**
     * <p>
     * The retention policy folder configurations.
     * </p>
     *
     * @param folderConfigurations <p>
     *            The retention policy folder configurations.
     *            </p>
     */
    public void setFolderConfigurations(
            java.util.Collection<FolderConfiguration> folderConfigurations) {
        if (folderConfigurations == null) {
            this.folderConfigurations = null;
            return;
        }

        this.folderConfigurations = new java.util.ArrayList<FolderConfiguration>(
                folderConfigurations);
    }

    /**
     * <p>
     * The retention policy folder configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param folderConfigurations <p>
     *            The retention policy folder configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRetentionPolicyRequest withFolderConfigurations(
            FolderConfiguration... folderConfigurations) {
        if (getFolderConfigurations() == null) {
            this.folderConfigurations = new java.util.ArrayList<FolderConfiguration>(
                    folderConfigurations.length);
        }
        for (FolderConfiguration value : folderConfigurations) {
            this.folderConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The retention policy folder configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param folderConfigurations <p>
     *            The retention policy folder configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRetentionPolicyRequest withFolderConfigurations(
            java.util.Collection<FolderConfiguration> folderConfigurations) {
        setFolderConfigurations(folderConfigurations);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: " + getOrganizationId() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getFolderConfigurations() != null)
            sb.append("FolderConfigurations: " + getFolderConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getFolderConfigurations() == null) ? 0 : getFolderConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRetentionPolicyRequest == false)
            return false;
        PutRetentionPolicyRequest other = (PutRetentionPolicyRequest) obj;

        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null
                && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFolderConfigurations() == null ^ this.getFolderConfigurations() == null)
            return false;
        if (other.getFolderConfigurations() != null
                && other.getFolderConfigurations().equals(this.getFolderConfigurations()) == false)
            return false;
        return true;
    }
}
