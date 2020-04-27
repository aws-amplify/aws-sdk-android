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
 * The details of the export to signed URL response.
 * </p>
 */
public class ExportAssetToSignedUrlResponseDetails implements Serializable {
    /**
     * <p>
     * The unique identifier for the asset associated with this export job.
     * </p>
     */
    private String assetId;

    /**
     * <p>
     * The unique identifier for the data set associated with this export job.
     * </p>
     */
    private String dataSetId;

    /**
     * <p>
     * The unique identifier for the revision associated with this export
     * response.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The signed URL for the export request.
     * </p>
     */
    private String signedUrl;

    /**
     * <p>
     * The date and time that the signed URL expires, in ISO 8601 format.
     * </p>
     */
    private java.util.Date signedUrlExpiresAt;

    /**
     * <p>
     * The unique identifier for the asset associated with this export job.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the asset associated with this export
     *         job.
     *         </p>
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * <p>
     * The unique identifier for the asset associated with this export job.
     * </p>
     *
     * @param assetId <p>
     *            The unique identifier for the asset associated with this
     *            export job.
     *            </p>
     */
    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The unique identifier for the asset associated with this export job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetId <p>
     *            The unique identifier for the asset associated with this
     *            export job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportAssetToSignedUrlResponseDetails withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this export job.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the data set associated with this
     *         export job.
     *         </p>
     */
    public String getDataSetId() {
        return dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this export job.
     * </p>
     *
     * @param dataSetId <p>
     *            The unique identifier for the data set associated with this
     *            export job.
     *            </p>
     */
    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this export job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetId <p>
     *            The unique identifier for the data set associated with this
     *            export job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportAssetToSignedUrlResponseDetails withDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this export
     * response.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the revision associated with this
     *         export response.
     *         </p>
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this export
     * response.
     * </p>
     *
     * @param revisionId <p>
     *            The unique identifier for the revision associated with this
     *            export response.
     *            </p>
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this export
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionId <p>
     *            The unique identifier for the revision associated with this
     *            export response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportAssetToSignedUrlResponseDetails withRevisionId(String revisionId) {
        this.revisionId = revisionId;
        return this;
    }

    /**
     * <p>
     * The signed URL for the export request.
     * </p>
     *
     * @return <p>
     *         The signed URL for the export request.
     *         </p>
     */
    public String getSignedUrl() {
        return signedUrl;
    }

    /**
     * <p>
     * The signed URL for the export request.
     * </p>
     *
     * @param signedUrl <p>
     *            The signed URL for the export request.
     *            </p>
     */
    public void setSignedUrl(String signedUrl) {
        this.signedUrl = signedUrl;
    }

    /**
     * <p>
     * The signed URL for the export request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signedUrl <p>
     *            The signed URL for the export request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportAssetToSignedUrlResponseDetails withSignedUrl(String signedUrl) {
        this.signedUrl = signedUrl;
        return this;
    }

    /**
     * <p>
     * The date and time that the signed URL expires, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The date and time that the signed URL expires, in ISO 8601
     *         format.
     *         </p>
     */
    public java.util.Date getSignedUrlExpiresAt() {
        return signedUrlExpiresAt;
    }

    /**
     * <p>
     * The date and time that the signed URL expires, in ISO 8601 format.
     * </p>
     *
     * @param signedUrlExpiresAt <p>
     *            The date and time that the signed URL expires, in ISO 8601
     *            format.
     *            </p>
     */
    public void setSignedUrlExpiresAt(java.util.Date signedUrlExpiresAt) {
        this.signedUrlExpiresAt = signedUrlExpiresAt;
    }

    /**
     * <p>
     * The date and time that the signed URL expires, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signedUrlExpiresAt <p>
     *            The date and time that the signed URL expires, in ISO 8601
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportAssetToSignedUrlResponseDetails withSignedUrlExpiresAt(
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
        if (getAssetId() != null)
            sb.append("AssetId: " + getAssetId() + ",");
        if (getDataSetId() != null)
            sb.append("DataSetId: " + getDataSetId() + ",");
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

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
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

        if (obj instanceof ExportAssetToSignedUrlResponseDetails == false)
            return false;
        ExportAssetToSignedUrlResponseDetails other = (ExportAssetToSignedUrlResponseDetails) obj;

        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
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
