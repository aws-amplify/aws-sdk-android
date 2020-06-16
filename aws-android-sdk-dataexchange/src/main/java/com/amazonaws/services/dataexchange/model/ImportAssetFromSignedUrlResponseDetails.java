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
 * The details in the response for an import request, including the signed URL
 * and other information.
 * </p>
 */
public class ImportAssetFromSignedUrlResponseDetails implements Serializable {
    /**
     * <p>
     * The name for the asset associated with this import response.
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
     * response.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The signed URL.
     * </p>
     */
    private String signedUrl;

    /**
     * <p>
     * The time and date at which the signed URL expires, in ISO 8601 format.
     * </p>
     */
    private java.util.Date signedUrlExpiresAt;

    /**
     * <p>
     * The name for the asset associated with this import response.
     * </p>
     *
     * @return <p>
     *         The name for the asset associated with this import response.
     *         </p>
     */
    public String getAssetName() {
        return assetName;
    }

    /**
     * <p>
     * The name for the asset associated with this import response.
     * </p>
     *
     * @param assetName <p>
     *            The name for the asset associated with this import response.
     *            </p>
     */
    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    /**
     * <p>
     * The name for the asset associated with this import response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetName <p>
     *            The name for the asset associated with this import response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportAssetFromSignedUrlResponseDetails withAssetName(String assetName) {
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
    public ImportAssetFromSignedUrlResponseDetails withDataSetId(String dataSetId) {
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
    public ImportAssetFromSignedUrlResponseDetails withMd5Hash(String md5Hash) {
        this.md5Hash = md5Hash;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import
     * response.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the revision associated with this
     *         import response.
     *         </p>
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import
     * response.
     * </p>
     *
     * @param revisionId <p>
     *            The unique identifier for the revision associated with this
     *            import response.
     *            </p>
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this import
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionId <p>
     *            The unique identifier for the revision associated with this
     *            import response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportAssetFromSignedUrlResponseDetails withRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }

    /**
     * <p>
     * The signed URL.
     * </p>
     *
     * @return <p>
     *         The signed URL.
     *         </p>
     */
    public String getSignedUrl() {
        return signedUrl;
    }

    /**
     * <p>
     * The signed URL.
     * </p>
     *
     * @param signedUrl <p>
     *            The signed URL.
     *            </p>
     */
    public void setSignedUrl(String signedUrl) {
        this.signedUrl = signedUrl;
    }

    /**
     * <p>
     * The signed URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signedUrl <p>
     *            The signed URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportAssetFromSignedUrlResponseDetails withSignedUrl(String signedUrl) {
        this.signedUrl = signedUrl;
        return this;
    }

    /**
     * <p>
     * The time and date at which the signed URL expires, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The time and date at which the signed URL expires, in ISO 8601
     *         format.
     *         </p>
     */
    public java.util.Date getSignedUrlExpiresAt() {
        return signedUrlExpiresAt;
    }

    /**
     * <p>
     * The time and date at which the signed URL expires, in ISO 8601 format.
     * </p>
     *
     * @param signedUrlExpiresAt <p>
     *            The time and date at which the signed URL expires, in ISO 8601
     *            format.
     *            </p>
     */
    public void setSignedUrlExpiresAt(java.util.Date signedUrlExpiresAt) {
        this.signedUrlExpiresAt = signedUrlExpiresAt;
    }

    /**
     * <p>
     * The time and date at which the signed URL expires, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signedUrlExpiresAt <p>
     *            The time and date at which the signed URL expires, in ISO 8601
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportAssetFromSignedUrlResponseDetails withSignedUrlExpiresAt(
            java.util.Date signedUrlExpiresAt) {
        this.signedUrlExpiresAt = signedUrlExpiresAt;
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
            sb.append("RevisionId: " + getRevisionId() + ",");
        if (getSignedUrl() != null)
            sb.append("SignedUrl: " + getSignedUrl() + ",");
        if (getSignedUrlExpiresAt() != null)
            sb.append("SignedUrlExpiresAt: " + getSignedUrlExpiresAt());
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
        hashCode = prime * hashCode + ((getSignedUrl() == null) ? 0 : getSignedUrl().hashCode());
        hashCode = prime * hashCode
                + ((getSignedUrlExpiresAt() == null) ? 0 : getSignedUrlExpiresAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportAssetFromSignedUrlResponseDetails == false)
            return false;
        ImportAssetFromSignedUrlResponseDetails other = (ImportAssetFromSignedUrlResponseDetails) obj;

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
        if (other.getSignedUrl() == null ^ this.getSignedUrl() == null)
            return false;
        if (other.getSignedUrl() != null
                && other.getSignedUrl().equals(this.getSignedUrl()) == false)
            return false;
        if (other.getSignedUrlExpiresAt() == null ^ this.getSignedUrlExpiresAt() == null)
            return false;
        if (other.getSignedUrlExpiresAt() != null
                && other.getSignedUrlExpiresAt().equals(this.getSignedUrlExpiresAt()) == false)
            return false;
        return true;
    }
}
