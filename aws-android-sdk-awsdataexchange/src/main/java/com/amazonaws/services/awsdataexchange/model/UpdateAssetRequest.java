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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This operation updates an asset.
 * </p>
 */
public class UpdateAssetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier for an asset.
     * </p>
     */
    private String assetId;

    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     */
    private String dataSetId;

    /**
     * <p>
     * The name of the asset. When importing from Amazon S3, the S3 object key
     * is used as the asset name. When exporting to Amazon S3, the asset name is
     * used as default target S3 object key.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The unique identifier for an asset.
     * </p>
     *
     * @return <p>
     *         The unique identifier for an asset.
     *         </p>
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * <p>
     * The unique identifier for an asset.
     * </p>
     *
     * @param assetId <p>
     *            The unique identifier for an asset.
     *            </p>
     */
    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The unique identifier for an asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetId <p>
     *            The unique identifier for an asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAssetRequest withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     *
     * @return <p>
     *         The unique identifier for a data set.
     *         </p>
     */
    public String getDataSetId() {
        return dataSetId;
    }

    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     *
     * @param dataSetId <p>
     *            The unique identifier for a data set.
     *            </p>
     */
    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetId <p>
     *            The unique identifier for a data set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAssetRequest withDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }

    /**
     * <p>
     * The name of the asset. When importing from Amazon S3, the S3 object key
     * is used as the asset name. When exporting to Amazon S3, the asset name is
     * used as default target S3 object key.
     * </p>
     *
     * @return <p>
     *         The name of the asset. When importing from Amazon S3, the S3
     *         object key is used as the asset name. When exporting to Amazon
     *         S3, the asset name is used as default target S3 object key.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the asset. When importing from Amazon S3, the S3 object key
     * is used as the asset name. When exporting to Amazon S3, the asset name is
     * used as default target S3 object key.
     * </p>
     *
     * @param name <p>
     *            The name of the asset. When importing from Amazon S3, the S3
     *            object key is used as the asset name. When exporting to Amazon
     *            S3, the asset name is used as default target S3 object key.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the asset. When importing from Amazon S3, the S3 object key
     * is used as the asset name. When exporting to Amazon S3, the asset name is
     * used as default target S3 object key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the asset. When importing from Amazon S3, the S3
     *            object key is used as the asset name. When exporting to Amazon
     *            S3, the asset name is used as default target S3 object key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAssetRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     *
     * @return <p>
     *         The unique identifier for a revision.
     *         </p>
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     *
     * @param revisionId <p>
     *            The unique identifier for a revision.
     *            </p>
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionId <p>
     *            The unique identifier for a revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAssetRequest withRevisionId(String revisionId) {
        this.revisionId = revisionId;
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
        if (getAssetId() != null)
            sb.append("AssetId: " + getAssetId() + ",");
        if (getDataSetId() != null)
            sb.append("DataSetId: " + getDataSetId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRevisionId() != null)
            sb.append("RevisionId: " + getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAssetRequest == false)
            return false;
        UpdateAssetRequest other = (UpdateAssetRequest) obj;

        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null
                && other.getDataSetId().equals(this.getDataSetId()) == false)
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
        return true;
    }
}
