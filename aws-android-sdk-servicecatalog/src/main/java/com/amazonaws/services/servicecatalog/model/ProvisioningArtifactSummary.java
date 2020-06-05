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
 * Summary information about a provisioning artifact (also known as a version)
 * for a product.
 * </p>
 */
public class ProvisioningArtifactSummary implements Serializable {
    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String id;

    /**
     * <p>
     * The name of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     */
    private String description;

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The metadata for the provisioning artifact. This is used with AWS
     * Marketplace products.
     * </p>
     */
    private java.util.Map<String, String> provisioningArtifactMetadata;

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
    public String getId() {
        return id;
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
     * @param id <p>
     *            The identifier of the provisioning artifact.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
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
     * @param id <p>
     *            The identifier of the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @return <p>
     *         The name of the provisioning artifact.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param name <p>
     *            The name of the provisioning artifact.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param name <p>
     *            The name of the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @return <p>
     *         The description of the provisioning artifact.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param description <p>
     *            The description of the provisioning artifact.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param description <p>
     *            The description of the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactSummary withDescription(String description) {
        this.description = description;
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
    public ProvisioningArtifactSummary withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The metadata for the provisioning artifact. This is used with AWS
     * Marketplace products.
     * </p>
     *
     * @return <p>
     *         The metadata for the provisioning artifact. This is used with AWS
     *         Marketplace products.
     *         </p>
     */
    public java.util.Map<String, String> getProvisioningArtifactMetadata() {
        return provisioningArtifactMetadata;
    }

    /**
     * <p>
     * The metadata for the provisioning artifact. This is used with AWS
     * Marketplace products.
     * </p>
     *
     * @param provisioningArtifactMetadata <p>
     *            The metadata for the provisioning artifact. This is used with
     *            AWS Marketplace products.
     *            </p>
     */
    public void setProvisioningArtifactMetadata(
            java.util.Map<String, String> provisioningArtifactMetadata) {
        this.provisioningArtifactMetadata = provisioningArtifactMetadata;
    }

    /**
     * <p>
     * The metadata for the provisioning artifact. This is used with AWS
     * Marketplace products.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningArtifactMetadata <p>
     *            The metadata for the provisioning artifact. This is used with
     *            AWS Marketplace products.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactSummary withProvisioningArtifactMetadata(
            java.util.Map<String, String> provisioningArtifactMetadata) {
        this.provisioningArtifactMetadata = provisioningArtifactMetadata;
        return this;
    }

    /**
     * <p>
     * The metadata for the provisioning artifact. This is used with AWS
     * Marketplace products.
     * </p>
     * <p>
     * The method adds a new key-value pair into ProvisioningArtifactMetadata
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            ProvisioningArtifactMetadata.
     * @param value The corresponding value of the entry to be added into
     *            ProvisioningArtifactMetadata.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifactSummary addProvisioningArtifactMetadataEntry(String key, String value) {
        if (null == this.provisioningArtifactMetadata) {
            this.provisioningArtifactMetadata = new java.util.HashMap<String, String>();
        }
        if (this.provisioningArtifactMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.provisioningArtifactMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ProvisioningArtifactMetadata.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ProvisioningArtifactSummary clearProvisioningArtifactMetadataEntries() {
        this.provisioningArtifactMetadata = null;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getProvisioningArtifactMetadata() != null)
            sb.append("ProvisioningArtifactMetadata: " + getProvisioningArtifactMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactMetadata() == null) ? 0
                        : getProvisioningArtifactMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningArtifactSummary == false)
            return false;
        ProvisioningArtifactSummary other = (ProvisioningArtifactSummary) obj;

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
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getProvisioningArtifactMetadata() == null
                ^ this.getProvisioningArtifactMetadata() == null)
            return false;
        if (other.getProvisioningArtifactMetadata() != null
                && other.getProvisioningArtifactMetadata().equals(
                        this.getProvisioningArtifactMetadata()) == false)
            return false;
        return true;
    }
}
