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

/**
 * <p>
 * Details of the operation to be performed by the job.
 * </p>
 */
public class ImportAssetsFromS3RequestDetails implements Serializable {
    /**
     * <p>
     * Is a list of S3 bucket and object key pairs.
     * </p>
     */
    private java.util.List<AssetSourceEntry> assetSources;

    /**
     * <p>
     * The unique identifier for the data set associated with this import job.
     * </p>
     */
    private String dataSetId;

    /**
     * <p>
     * The unique identifier for the revision associated with this import
     * request.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * Is a list of S3 bucket and object key pairs.
     * </p>
     *
     * @return <p>
     *         Is a list of S3 bucket and object key pairs.
     *         </p>
     */
    public java.util.List<AssetSourceEntry> getAssetSources() {
        return assetSources;
    }

    /**
     * <p>
     * Is a list of S3 bucket and object key pairs.
     * </p>
     *
     * @param assetSources <p>
     *            Is a list of S3 bucket and object key pairs.
     *            </p>
     */
    public void setAssetSources(java.util.Collection<AssetSourceEntry> assetSources) {
        if (assetSources == null) {
            this.assetSources = null;
            return;
        }

        this.assetSources = new java.util.ArrayList<AssetSourceEntry>(assetSources);
    }

    /**
     * <p>
     * Is a list of S3 bucket and object key pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetSources <p>
     *            Is a list of S3 bucket and object key pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportAssetsFromS3RequestDetails withAssetSources(AssetSourceEntry... assetSources) {
        if (getAssetSources() == null) {
            this.assetSources = new java.util.ArrayList<AssetSourceEntry>(assetSources.length);
        }
        for (AssetSourceEntry value : assetSources) {
            this.assetSources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Is a list of S3 bucket and object key pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetSources <p>
     *            Is a list of S3 bucket and object key pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportAssetsFromS3RequestDetails withAssetSources(
            java.util.Collection<AssetSourceEntry> assetSources) {
        setAssetSources(assetSources);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this import job.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the data set associated with this
     *         import job.
     *         </p>
     */
    public String getDataSetId() {
        return dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this import job.
     * </p>
     *
     * @param dataSetId <p>
     *            The unique identifier for the data set associated with this
     *            import job.
     *            </p>
     */
    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this import job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetId <p>
     *            The unique identifier for the data set associated with this
     *            import job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportAssetsFromS3RequestDetails withDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import
     * request.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the revision associated with this
     *         import request.
     *         </p>
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import
     * request.
     * </p>
     *
     * @param revisionId <p>
     *            The unique identifier for the revision associated with this
     *            import request.
     *            </p>
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionId <p>
     *            The unique identifier for the revision associated with this
     *            import request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportAssetsFromS3RequestDetails withRevisionId(String revisionId) {
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
        if (getAssetSources() != null)
            sb.append("AssetSources: " + getAssetSources() + ",");
        if (getDataSetId() != null)
            sb.append("DataSetId: " + getDataSetId() + ",");
        if (getRevisionId() != null)
            sb.append("RevisionId: " + getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssetSources() == null) ? 0 : getAssetSources().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportAssetsFromS3RequestDetails == false)
            return false;
        ImportAssetsFromS3RequestDetails other = (ImportAssetsFromS3RequestDetails) obj;

        if (other.getAssetSources() == null ^ this.getAssetSources() == null)
            return false;
        if (other.getAssetSources() != null
                && other.getAssetSources().equals(this.getAssetSources()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null
                && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null
                && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }
}
