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

package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This operation creates a data set.
 * </p>
 */
public class CreateDataSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset
     * type is S3_SNAPSHOT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3_SNAPSHOT
     */
    private String assetType;

    /**
     * <p>
     * A description for the data set. This value can be up to 16,348 characters
     * long.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the data set.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A data set tag is an optional label that you can assign to a data set
     * when you create it. Each tag consists of a key and an optional value,
     * both of which you define. When you use tagging, you can also use
     * tag-based access control in IAM policies to control access to these data
     * sets and revisions.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset
     * type is S3_SNAPSHOT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3_SNAPSHOT
     *
     * @return <p>
     *         The type of file your data is stored in. Currently, the supported
     *         asset type is S3_SNAPSHOT.
     *         </p>
     * @see AssetType
     */
    public String getAssetType() {
        return assetType;
    }

    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset
     * type is S3_SNAPSHOT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3_SNAPSHOT
     *
     * @param assetType <p>
     *            The type of file your data is stored in. Currently, the
     *            supported asset type is S3_SNAPSHOT.
     *            </p>
     * @see AssetType
     */
    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset
     * type is S3_SNAPSHOT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3_SNAPSHOT
     *
     * @param assetType <p>
     *            The type of file your data is stored in. Currently, the
     *            supported asset type is S3_SNAPSHOT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssetType
     */
    public CreateDataSetRequest withAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset
     * type is S3_SNAPSHOT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3_SNAPSHOT
     *
     * @param assetType <p>
     *            The type of file your data is stored in. Currently, the
     *            supported asset type is S3_SNAPSHOT.
     *            </p>
     * @see AssetType
     */
    public void setAssetType(AssetType assetType) {
        this.assetType = assetType.toString();
    }

    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset
     * type is S3_SNAPSHOT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>S3_SNAPSHOT
     *
     * @param assetType <p>
     *            The type of file your data is stored in. Currently, the
     *            supported asset type is S3_SNAPSHOT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssetType
     */
    public CreateDataSetRequest withAssetType(AssetType assetType) {
        this.assetType = assetType.toString();
        return this;
    }

    /**
     * <p>
     * A description for the data set. This value can be up to 16,348 characters
     * long.
     * </p>
     *
     * @return <p>
     *         A description for the data set. This value can be up to 16,348
     *         characters long.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the data set. This value can be up to 16,348 characters
     * long.
     * </p>
     *
     * @param description <p>
     *            A description for the data set. This value can be up to 16,348
     *            characters long.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the data set. This value can be up to 16,348 characters
     * long.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the data set. This value can be up to 16,348
     *            characters long.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSetRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     *
     * @return <p>
     *         The name of the data set.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     *
     * @param name <p>
     *            The name of the data set.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the data set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSetRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A data set tag is an optional label that you can assign to a data set
     * when you create it. Each tag consists of a key and an optional value,
     * both of which you define. When you use tagging, you can also use
     * tag-based access control in IAM policies to control access to these data
     * sets and revisions.
     * </p>
     *
     * @return <p>
     *         A data set tag is an optional label that you can assign to a data
     *         set when you create it. Each tag consists of a key and an
     *         optional value, both of which you define. When you use tagging,
     *         you can also use tag-based access control in IAM policies to
     *         control access to these data sets and revisions.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A data set tag is an optional label that you can assign to a data set
     * when you create it. Each tag consists of a key and an optional value,
     * both of which you define. When you use tagging, you can also use
     * tag-based access control in IAM policies to control access to these data
     * sets and revisions.
     * </p>
     *
     * @param tags <p>
     *            A data set tag is an optional label that you can assign to a
     *            data set when you create it. Each tag consists of a key and an
     *            optional value, both of which you define. When you use
     *            tagging, you can also use tag-based access control in IAM
     *            policies to control access to these data sets and revisions.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A data set tag is an optional label that you can assign to a data set
     * when you create it. Each tag consists of a key and an optional value,
     * both of which you define. When you use tagging, you can also use
     * tag-based access control in IAM policies to control access to these data
     * sets and revisions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A data set tag is an optional label that you can assign to a
     *            data set when you create it. Each tag consists of a key and an
     *            optional value, both of which you define. When you use
     *            tagging, you can also use tag-based access control in IAM
     *            policies to control access to these data sets and revisions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDataSetRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A data set tag is an optional label that you can assign to a data set
     * when you create it. Each tag consists of a key and an optional value,
     * both of which you define. When you use tagging, you can also use
     * tag-based access control in IAM policies to control access to these data
     * sets and revisions.
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
    public CreateDataSetRequest addTagsEntry(String key, String value) {
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
    public CreateDataSetRequest clearTagsEntries() {
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
        if (getAssetType() != null)
            sb.append("AssetType: " + getAssetType() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetType() == null) ? 0 : getAssetType().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataSetRequest == false)
            return false;
        CreateDataSetRequest other = (CreateDataSetRequest) obj;

        if (other.getAssetType() == null ^ this.getAssetType() == null)
            return false;
        if (other.getAssetType() != null
                && other.getAssetType().equals(this.getAssetType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
