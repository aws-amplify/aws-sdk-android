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

/**
 * <p>
 * A data set is an AWS resource with one or more revisions.
 * </p>
 */
public class DataSetEntry implements Serializable {
    /**
     * <p>
     * The ARN for the data set.
     * </p>
     */
    private String arn;

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
     * The date and time that the data set was created, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The description for the data set.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The unique identifier for the data set.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The name of the data set.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A property that defines the data set as OWNED by the account (for
     * providers) or ENTITLED to the account (for subscribers).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OWNED, ENTITLED
     */
    private String origin;

    /**
     * <p>
     * If the origin of this data set is ENTITLED, includes the details for the
     * product on AWS Marketplace.
     * </p>
     */
    private OriginDetails originDetails;

    /**
     * <p>
     * The data set ID of the owned data set corresponding to the entitled data
     * set being viewed. This parameter is returned when a data set owner is
     * viewing the entitled copy of its owned data set.
     * </p>
     */
    private String sourceId;

    /**
     * <p>
     * The date and time that the data set was last updated, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ARN for the data set.
     * </p>
     *
     * @return <p>
     *         The ARN for the data set.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN for the data set.
     * </p>
     *
     * @param arn <p>
     *            The ARN for the data set.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN for the data set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The ARN for the data set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSetEntry withArn(String arn) {
        this.arn = arn;
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
    public DataSetEntry withAssetType(String assetType) {
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
    public DataSetEntry withAssetType(AssetType assetType) {
        this.assetType = assetType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the data set was created, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The date and time that the data set was created, in ISO 8601
     *         format.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date and time that the data set was created, in ISO 8601 format.
     * </p>
     *
     * @param createdAt <p>
     *            The date and time that the data set was created, in ISO 8601
     *            format.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the data set was created, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date and time that the data set was created, in ISO 8601
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSetEntry withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The description for the data set.
     * </p>
     *
     * @return <p>
     *         The description for the data set.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for the data set.
     * </p>
     *
     * @param description <p>
     *            The description for the data set.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the data set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description for the data set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSetEntry withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the data set.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the data set.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the data set.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the data set.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the data set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the data set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSetEntry withId(String id) {
        this.id = id;
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
    public DataSetEntry withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A property that defines the data set as OWNED by the account (for
     * providers) or ENTITLED to the account (for subscribers).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OWNED, ENTITLED
     *
     * @return <p>
     *         A property that defines the data set as OWNED by the account (for
     *         providers) or ENTITLED to the account (for subscribers).
     *         </p>
     * @see Origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * <p>
     * A property that defines the data set as OWNED by the account (for
     * providers) or ENTITLED to the account (for subscribers).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OWNED, ENTITLED
     *
     * @param origin <p>
     *            A property that defines the data set as OWNED by the account
     *            (for providers) or ENTITLED to the account (for subscribers).
     *            </p>
     * @see Origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * A property that defines the data set as OWNED by the account (for
     * providers) or ENTITLED to the account (for subscribers).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OWNED, ENTITLED
     *
     * @param origin <p>
     *            A property that defines the data set as OWNED by the account
     *            (for providers) or ENTITLED to the account (for subscribers).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Origin
     */
    public DataSetEntry withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * <p>
     * A property that defines the data set as OWNED by the account (for
     * providers) or ENTITLED to the account (for subscribers).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OWNED, ENTITLED
     *
     * @param origin <p>
     *            A property that defines the data set as OWNED by the account
     *            (for providers) or ENTITLED to the account (for subscribers).
     *            </p>
     * @see Origin
     */
    public void setOrigin(Origin origin) {
        this.origin = origin.toString();
    }

    /**
     * <p>
     * A property that defines the data set as OWNED by the account (for
     * providers) or ENTITLED to the account (for subscribers).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OWNED, ENTITLED
     *
     * @param origin <p>
     *            A property that defines the data set as OWNED by the account
     *            (for providers) or ENTITLED to the account (for subscribers).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Origin
     */
    public DataSetEntry withOrigin(Origin origin) {
        this.origin = origin.toString();
        return this;
    }

    /**
     * <p>
     * If the origin of this data set is ENTITLED, includes the details for the
     * product on AWS Marketplace.
     * </p>
     *
     * @return <p>
     *         If the origin of this data set is ENTITLED, includes the details
     *         for the product on AWS Marketplace.
     *         </p>
     */
    public OriginDetails getOriginDetails() {
        return originDetails;
    }

    /**
     * <p>
     * If the origin of this data set is ENTITLED, includes the details for the
     * product on AWS Marketplace.
     * </p>
     *
     * @param originDetails <p>
     *            If the origin of this data set is ENTITLED, includes the
     *            details for the product on AWS Marketplace.
     *            </p>
     */
    public void setOriginDetails(OriginDetails originDetails) {
        this.originDetails = originDetails;
    }

    /**
     * <p>
     * If the origin of this data set is ENTITLED, includes the details for the
     * product on AWS Marketplace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param originDetails <p>
     *            If the origin of this data set is ENTITLED, includes the
     *            details for the product on AWS Marketplace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSetEntry withOriginDetails(OriginDetails originDetails) {
        this.originDetails = originDetails;
        return this;
    }

    /**
     * <p>
     * The data set ID of the owned data set corresponding to the entitled data
     * set being viewed. This parameter is returned when a data set owner is
     * viewing the entitled copy of its owned data set.
     * </p>
     *
     * @return <p>
     *         The data set ID of the owned data set corresponding to the
     *         entitled data set being viewed. This parameter is returned when a
     *         data set owner is viewing the entitled copy of its owned data
     *         set.
     *         </p>
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * <p>
     * The data set ID of the owned data set corresponding to the entitled data
     * set being viewed. This parameter is returned when a data set owner is
     * viewing the entitled copy of its owned data set.
     * </p>
     *
     * @param sourceId <p>
     *            The data set ID of the owned data set corresponding to the
     *            entitled data set being viewed. This parameter is returned
     *            when a data set owner is viewing the entitled copy of its
     *            owned data set.
     *            </p>
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * <p>
     * The data set ID of the owned data set corresponding to the entitled data
     * set being viewed. This parameter is returned when a data set owner is
     * viewing the entitled copy of its owned data set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceId <p>
     *            The data set ID of the owned data set corresponding to the
     *            entitled data set being viewed. This parameter is returned
     *            when a data set owner is viewing the entitled copy of its
     *            owned data set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSetEntry withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * <p>
     * The date and time that the data set was last updated, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The date and time that the data set was last updated, in ISO 8601
     *         format.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The date and time that the data set was last updated, in ISO 8601 format.
     * </p>
     *
     * @param updatedAt <p>
     *            The date and time that the data set was last updated, in ISO
     *            8601 format.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time that the data set was last updated, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The date and time that the data set was last updated, in ISO
     *            8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataSetEntry withUpdatedAt(java.util.Date updatedAt) {
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
        if (getAssetType() != null)
            sb.append("AssetType: " + getAssetType() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getOrigin() != null)
            sb.append("Origin: " + getOrigin() + ",");
        if (getOriginDetails() != null)
            sb.append("OriginDetails: " + getOriginDetails() + ",");
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
        hashCode = prime * hashCode + ((getAssetType() == null) ? 0 : getAssetType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime * hashCode
                + ((getOriginDetails() == null) ? 0 : getOriginDetails().hashCode());
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

        if (obj instanceof DataSetEntry == false)
            return false;
        DataSetEntry other = (DataSetEntry) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        if (other.getOriginDetails() == null ^ this.getOriginDetails() == null)
            return false;
        if (other.getOriginDetails() != null
                && other.getOriginDetails().equals(this.getOriginDetails()) == false)
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
