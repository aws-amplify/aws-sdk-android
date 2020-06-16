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
 * Details of the operation to be performed by the job.
 * </p>
 */
public class ImportAssetFromSignedUrlRequestDetails implements Serializable {
    /**
     * <p>
     * The name of the asset. When importing from Amazon S3, the S3 object key
     * is used as the asset name.
     * </p>
     */
    private String assetName;

    /**
     * <p>
     * The unique identifier for the data set associated with this import job.
     * </p>
     */
    private String dataSetId;

    /**
     * <p>
     * The Base64-encoded Md5 hash for the asset, used to ensure the integrity
     * of the file at that location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 24<br/>
     * <b>Pattern:
     * </b>/^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$/
     * <br/>
     */
    private String md5Hash;

    /**
     * <p>
     * The unique identifier for the revision associated with this import
     * request.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The name of the asset. When importing from Amazon S3, the S3 object key
     * is used as the asset name.
     * </p>
     *
     * @return <p>
     *         The name of the asset. When importing from Amazon S3, the S3
     *         object key is used as the asset name.
     *         </p>
     */
    public String getAssetName() {
        return assetName;
    }

    /**
     * <p>
     * The name of the asset. When importing from Amazon S3, the S3 object key
     * is used as the asset name.
     * </p>
     *
     * @param assetName <p>
     *            The name of the asset. When importing from Amazon S3, the S3
     *            object key is used as the asset name.
     *            </p>
     */
    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    /**
     * <p>
     * The name of the asset. When importing from Amazon S3, the S3 object key
     * is used as the asset name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetName <p>
     *            The name of the asset. When importing from Amazon S3, the S3
     *            object key is used as the asset name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportAssetFromSignedUrlRequestDetails withAssetName(String assetName) {
        this.assetName = assetName;
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
    public ImportAssetFromSignedUrlRequestDetails withDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }

    /**
     * <p>
     * The Base64-encoded Md5 hash for the asset, used to ensure the integrity
     * of the file at that location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 24<br/>
     * <b>Pattern:
     * </b>/^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$/
     * <br/>
     *
     * @return <p>
     *         The Base64-encoded Md5 hash for the asset, used to ensure the
     *         integrity of the file at that location.
     *         </p>
     */
    public String getMd5Hash() {
        return md5Hash;
    }

    /**
     * <p>
     * The Base64-encoded Md5 hash for the asset, used to ensure the integrity
     * of the file at that location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 24<br/>
     * <b>Pattern:
     * </b>/^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$/
     * <br/>
     *
     * @param md5Hash <p>
     *            The Base64-encoded Md5 hash for the asset, used to ensure the
     *            integrity of the file at that location.
     *            </p>
     */
    public void setMd5Hash(String md5Hash) {
        this.md5Hash = md5Hash;
    }

    /**
     * <p>
     * The Base64-encoded Md5 hash for the asset, used to ensure the integrity
     * of the file at that location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>24 - 24<br/>
     * <b>Pattern:
     * </b>/^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$/
     * <br/>
     *
     * @param md5Hash <p>
     *            The Base64-encoded Md5 hash for the asset, used to ensure the
     *            integrity of the file at that location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportAssetFromSignedUrlRequestDetails withMd5Hash(String md5Hash) {
        this.md5Hash = md5Hash;
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
    public ImportAssetFromSignedUrlRequestDetails withRevisionId(String revisionId) {
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
        if (getAssetName() != null)
            sb.append("AssetName: " + getAssetName() + ",");
        if (getDataSetId() != null)
            sb.append("DataSetId: " + getDataSetId() + ",");
        if (getMd5Hash() != null)
            sb.append("Md5Hash: " + getMd5Hash() + ",");
        if (getRevisionId() != null)
            sb.append("RevisionId: " + getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetName() == null) ? 0 : getAssetName().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getMd5Hash() == null) ? 0 : getMd5Hash().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportAssetFromSignedUrlRequestDetails == false)
            return false;
        ImportAssetFromSignedUrlRequestDetails other = (ImportAssetFromSignedUrlRequestDetails) obj;

        if (other.getAssetName() == null ^ this.getAssetName() == null)
            return false;
        if (other.getAssetName() != null
                && other.getAssetName().equals(this.getAssetName()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null
                && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getMd5Hash() == null ^ this.getMd5Hash() == null)
            return false;
        if (other.getMd5Hash() != null && other.getMd5Hash().equals(this.getMd5Hash()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null
                && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }
}
