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

package com.amazonaws.services.awsdataexchange.model;

import java.io.Serializable;

public class GetAssetResult implements Serializable {
    /**
     * <p>
     * The ARN for the asset.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * Information about the asset, including its size.
     * </p>
     */
    private AssetDetails assetDetails;

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
     * The date and time that the asset was created, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The unique identifier for the data set associated with this asset.
     * </p>
     */
    private String dataSetId;

    /**
     * <p>
     * The unique identifier for the asset.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The name of the asset When importing from Amazon S3, the S3 object key is
     * used as the asset name. When exporting to Amazon S3, the asset name is
     * used as default target S3 object key.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The unique identifier for the revision associated with this asset.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The asset ID of the owned asset corresponding to the entitled asset being
     * viewed. This parameter is returned when an asset owner is viewing the
     * entitled copy of its owned asset.
     * </p>
     */
    private String sourceId;

    /**
     * <p>
     * The date and time that the asset was last updated, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ARN for the asset.
     * </p>
     *
     * @return <p>
     *         The ARN for the asset.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN for the asset.
     * </p>
     *
     * @param arn <p>
     *            The ARN for the asset.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN for the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The ARN for the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * Information about the asset, including its size.
     * </p>
     *
     * @return <p>
     *         Information about the asset, including its size.
     *         </p>
     */
    public AssetDetails getAssetDetails() {
        return assetDetails;
    }

    /**
     * <p>
     * Information about the asset, including its size.
     * </p>
     *
     * @param assetDetails <p>
     *            Information about the asset, including its size.
     *            </p>
     */
    public void setAssetDetails(AssetDetails assetDetails) {
        this.assetDetails = assetDetails;
    }

    /**
     * <p>
     * Information about the asset, including its size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetDetails <p>
     *            Information about the asset, including its size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetResult withAssetDetails(AssetDetails assetDetails) {
        this.assetDetails = assetDetails;
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
    public GetAssetResult withAssetType(String assetType) {
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
    public GetAssetResult withAssetType(AssetType assetType) {
        this.assetType = assetType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the asset was created, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The date and time that the asset was created, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date and time that the asset was created, in ISO 8601 format.
     * </p>
     *
     * @param createdAt <p>
     *            The date and time that the asset was created, in ISO 8601
     *            format.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the asset was created, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date and time that the asset was created, in ISO 8601
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetResult withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this asset.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the data set associated with this
     *         asset.
     *         </p>
     */
    public String getDataSetId() {
        return dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this asset.
     * </p>
     *
     * @param dataSetId <p>
     *            The unique identifier for the data set associated with this
     *            asset.
     *            </p>
     */
    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetId <p>
     *            The unique identifier for the data set associated with this
     *            asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetResult withDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the asset.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the asset.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the asset.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the asset.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the asset When importing from Amazon S3, the S3 object key is
     * used as the asset name. When exporting to Amazon S3, the asset name is
     * used as default target S3 object key.
     * </p>
     *
     * @return <p>
     *         The name of the asset When importing from Amazon S3, the S3
     *         object key is used as the asset name. When exporting to Amazon
     *         S3, the asset name is used as default target S3 object key.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the asset When importing from Amazon S3, the S3 object key is
     * used as the asset name. When exporting to Amazon S3, the asset name is
     * used as default target S3 object key.
     * </p>
     *
     * @param name <p>
     *            The name of the asset When importing from Amazon S3, the S3
     *            object key is used as the asset name. When exporting to Amazon
     *            S3, the asset name is used as default target S3 object key.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the asset When importing from Amazon S3, the S3 object key is
     * used as the asset name. When exporting to Amazon S3, the asset name is
     * used as default target S3 object key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the asset When importing from Amazon S3, the S3
     *            object key is used as the asset name. When exporting to Amazon
     *            S3, the asset name is used as default target S3 object key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this asset.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the revision associated with this
     *         asset.
     *         </p>
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this asset.
     * </p>
     *
     * @param revisionId <p>
     *            The unique identifier for the revision associated with this
     *            asset.
     *            </p>
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionId <p>
     *            The unique identifier for the revision associated with this
     *            asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetResult withRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }

    /**
     * <p>
     * The asset ID of the owned asset corresponding to the entitled asset being
     * viewed. This parameter is returned when an asset owner is viewing the
     * entitled copy of its owned asset.
     * </p>
     *
     * @return <p>
     *         The asset ID of the owned asset corresponding to the entitled
     *         asset being viewed. This parameter is returned when an asset
     *         owner is viewing the entitled copy of its owned asset.
     *         </p>
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * <p>
     * The asset ID of the owned asset corresponding to the entitled asset being
     * viewed. This parameter is returned when an asset owner is viewing the
     * entitled copy of its owned asset.
     * </p>
     *
     * @param sourceId <p>
     *            The asset ID of the owned asset corresponding to the entitled
     *            asset being viewed. This parameter is returned when an asset
     *            owner is viewing the entitled copy of its owned asset.
     *            </p>
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * <p>
     * The asset ID of the owned asset corresponding to the entitled asset being
     * viewed. This parameter is returned when an asset owner is viewing the
     * entitled copy of its owned asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceId <p>
     *            The asset ID of the owned asset corresponding to the entitled
     *            asset being viewed. This parameter is returned when an asset
     *            owner is viewing the entitled copy of its owned asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetResult withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * <p>
     * The date and time that the asset was last updated, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The date and time that the asset was last updated, in ISO 8601
     *         format.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The date and time that the asset was last updated, in ISO 8601 format.
     * </p>
     *
     * @param updatedAt <p>
     *            The date and time that the asset was last updated, in ISO 8601
     *            format.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time that the asset was last updated, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The date and time that the asset was last updated, in ISO 8601
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAssetResult withUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
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
            sb.append("Arn: " + getArn() + ",");
        if (getAssetDetails() != null)
            sb.append("AssetDetails: " + getAssetDetails() + ",");
        if (getAssetType() != null)
            sb.append("AssetType: " + getAssetType() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getDataSetId() != null)
            sb.append("DataSetId: " + getDataSetId() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRevisionId() != null)
            sb.append("RevisionId: " + getRevisionId() + ",");
        if (getSourceId() != null)
            sb.append("SourceId: " + getSourceId() + ",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: " + getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getAssetDetails() == null) ? 0 : getAssetDetails().hashCode());
        hashCode = prime * hashCode + ((getAssetType() == null) ? 0 : getAssetType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssetResult == false)
            return false;
        GetAssetResult other = (GetAssetResult) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAssetDetails() == null ^ this.getAssetDetails() == null)
            return false;
        if (other.getAssetDetails() != null
                && other.getAssetDetails().equals(this.getAssetDetails()) == false)
            return false;
        if (other.getAssetType() == null ^ this.getAssetType() == null)
            return false;
        if (other.getAssetType() != null
                && other.getAssetType().equals(this.getAssetType()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null
                && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null
                && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getSourceId() == null ^ this.getSourceId() == null)
            return false;
        if (other.getSourceId() != null && other.getSourceId().equals(this.getSourceId()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null
                && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }
}
