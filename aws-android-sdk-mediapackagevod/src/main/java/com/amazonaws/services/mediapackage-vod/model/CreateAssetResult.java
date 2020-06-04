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
package com.amazonaws.services.mediapackage-vod.model;

import java.io.Serializable;


public class CreateAssetResult implements Serializable {
    /**
     * The ARN of the Asset.
     */
    private String arn;

    /**
     * The time the Asset was initially submitted for Ingest.
     */
    private String createdAt;

    /**
     * The list of egress endpoints available for the Asset.
     */
    private java.util.List<EgressEndpoint> egressEndpoints;

    /**
     * The unique identifier for the Asset.
     */
    private String id;

    /**
     * The ID of the PackagingGroup for the Asset.
     */
    private String packagingGroupId;

    /**
     * The resource ID to include in SPEKE key requests.
     */
    private String resourceId;

    /**
     * ARN of the source object in S3.
     */
    private String sourceArn;

    /**
     * The IAM role_arn used to access the source S3 bucket.
     */
    private String sourceRoleArn;

    /**
     * A collection of tags associated with a resource
     */
    private java.util.Map<String, String> tags;

    /**
     * The ARN of the Asset.
     *
     * @return The ARN of the Asset.
     */
    public String getArn() {
        return arn;
    }

    /**
     * The ARN of the Asset.
     *
     * @param arn The ARN of the Asset.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The ARN of the Asset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param arn The ARN of the Asset.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAssetResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The time the Asset was initially submitted for Ingest.
     *
     * @return The time the Asset was initially submitted for Ingest.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * The time the Asset was initially submitted for Ingest.
     *
     * @param createdAt The time the Asset was initially submitted for Ingest.
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The time the Asset was initially submitted for Ingest.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt The time the Asset was initially submitted for Ingest.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAssetResult withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The list of egress endpoints available for the Asset.
     *
     * @return The list of egress endpoints available for the Asset.
     */
    public java.util.List<EgressEndpoint> getEgressEndpoints() {
        return egressEndpoints;
    }

    /**
     * The list of egress endpoints available for the Asset.
     *
     * @param egressEndpoints The list of egress endpoints available for the Asset.
     */
    public void setEgressEndpoints(java.util.Collection<EgressEndpoint> egressEndpoints) {
        if (egressEndpoints == null) {
            this.egressEndpoints = null;
            return;
        }

        this.egressEndpoints = new java.util.ArrayList<EgressEndpoint>(egressEndpoints);
    }

    /**
     * The list of egress endpoints available for the Asset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param egressEndpoints The list of egress endpoints available for the Asset.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAssetResult withEgressEndpoints(EgressEndpoint... egressEndpoints) {
        if (getEgressEndpoints() == null) {
            this.egressEndpoints = new java.util.ArrayList<EgressEndpoint>(egressEndpoints.length);
        }
        for (EgressEndpoint value : egressEndpoints) {
            this.egressEndpoints.add(value);
        }
        return this;
    }

    /**
     * The list of egress endpoints available for the Asset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param egressEndpoints The list of egress endpoints available for the Asset.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAssetResult withEgressEndpoints(java.util.Collection<EgressEndpoint> egressEndpoints) {
        setEgressEndpoints(egressEndpoints);
        return this;
    }

    /**
     * The unique identifier for the Asset.
     *
     * @return The unique identifier for the Asset.
     */
    public String getId() {
        return id;
    }

    /**
     * The unique identifier for the Asset.
     *
     * @param id The unique identifier for the Asset.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique identifier for the Asset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The unique identifier for the Asset.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAssetResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the PackagingGroup for the Asset.
     *
     * @return The ID of the PackagingGroup for the Asset.
     */
    public String getPackagingGroupId() {
        return packagingGroupId;
    }

    /**
     * The ID of the PackagingGroup for the Asset.
     *
     * @param packagingGroupId The ID of the PackagingGroup for the Asset.
     */
    public void setPackagingGroupId(String packagingGroupId) {
        this.packagingGroupId = packagingGroupId;
    }

    /**
     * The ID of the PackagingGroup for the Asset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param packagingGroupId The ID of the PackagingGroup for the Asset.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAssetResult withPackagingGroupId(String packagingGroupId) {
        this.packagingGroupId = packagingGroupId;
        return this;
    }

    /**
     * The resource ID to include in SPEKE key requests.
     *
     * @return The resource ID to include in SPEKE key requests.
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The resource ID to include in SPEKE key requests.
     *
     * @param resourceId The resource ID to include in SPEKE key requests.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * The resource ID to include in SPEKE key requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceId The resource ID to include in SPEKE key requests.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAssetResult withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * ARN of the source object in S3.
     *
     * @return ARN of the source object in S3.
     */
    public String getSourceArn() {
        return sourceArn;
    }

    /**
     * ARN of the source object in S3.
     *
     * @param sourceArn ARN of the source object in S3.
     */
    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * ARN of the source object in S3.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceArn ARN of the source object in S3.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAssetResult withSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    /**
     * The IAM role_arn used to access the source S3 bucket.
     *
     * @return The IAM role_arn used to access the source S3 bucket.
     */
    public String getSourceRoleArn() {
        return sourceRoleArn;
    }

    /**
     * The IAM role_arn used to access the source S3 bucket.
     *
     * @param sourceRoleArn The IAM role_arn used to access the source S3 bucket.
     */
    public void setSourceRoleArn(String sourceRoleArn) {
        this.sourceRoleArn = sourceRoleArn;
    }

    /**
     * The IAM role_arn used to access the source S3 bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceRoleArn The IAM role_arn used to access the source S3 bucket.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAssetResult withSourceRoleArn(String sourceRoleArn) {
        this.sourceRoleArn = sourceRoleArn;
        return this;
    }

    /**
     * A collection of tags associated with a resource
     *
     * @return A collection of tags associated with a resource
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * A collection of tags associated with a resource
     *
     * @param tags A collection of tags associated with a resource
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * A collection of tags associated with a resource
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A collection of tags associated with a resource
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAssetResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * A collection of tags associated with a resource
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreateAssetResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public CreateAssetResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArn() != null) sb.append("Arn: " + getArn() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getEgressEndpoints() != null) sb.append("EgressEndpoints: " + getEgressEndpoints() + ",");
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getPackagingGroupId() != null) sb.append("PackagingGroupId: " + getPackagingGroupId() + ",");
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() + ",");
        if (getSourceArn() != null) sb.append("SourceArn: " + getSourceArn() + ",");
        if (getSourceRoleArn() != null) sb.append("SourceRoleArn: " + getSourceRoleArn() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getEgressEndpoints() == null) ? 0 : getEgressEndpoints().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPackagingGroupId() == null) ? 0 : getPackagingGroupId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getSourceRoleArn() == null) ? 0 : getSourceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateAssetResult == false) return false;
        CreateAssetResult other = (CreateAssetResult)obj;

        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false;
        if (other.getEgressEndpoints() == null ^ this.getEgressEndpoints() == null) return false;
        if (other.getEgressEndpoints() != null && other.getEgressEndpoints().equals(this.getEgressEndpoints()) == false) return false;
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false;
        if (other.getPackagingGroupId() == null ^ this.getPackagingGroupId() == null) return false;
        if (other.getPackagingGroupId() != null && other.getPackagingGroupId().equals(this.getPackagingGroupId()) == false) return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null) return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false) return false;
        if (other.getSourceRoleArn() == null ^ this.getSourceRoleArn() == null) return false;
        if (other.getSourceRoleArn() != null && other.getSourceRoleArn().equals(this.getSourceRoleArn()) == false) return false;
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false;
        return true;
    }
}
