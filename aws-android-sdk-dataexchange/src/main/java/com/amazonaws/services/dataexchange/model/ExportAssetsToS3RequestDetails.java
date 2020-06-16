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
public class ExportAssetsToS3RequestDetails implements Serializable {
    /**
     * <p>
     * The destination for the asset.
     * </p>
     */
    private java.util.List<AssetDestinationEntry> assetDestinations;

    /**
     * <p>
     * The unique identifier for the data set associated with this export job.
     * </p>
     */
    private String dataSetId;

    /**
     * <p>
     * Encryption configuration for the export job.
     * </p>
     */
    private ExportServerSideEncryption encryption;

    /**
     * <p>
     * The unique identifier for the revision associated with this export
     * request.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The destination for the asset.
     * </p>
     *
     * @return <p>
     *         The destination for the asset.
     *         </p>
     */
    public java.util.List<AssetDestinationEntry> getAssetDestinations() {
        return assetDestinations;
    }

    /**
     * <p>
     * The destination for the asset.
     * </p>
     *
     * @param assetDestinations <p>
     *            The destination for the asset.
     *            </p>
     */
    public void setAssetDestinations(java.util.Collection<AssetDestinationEntry> assetDestinations) {
        if (assetDestinations == null) {
            this.assetDestinations = null;
            return;
        }

        this.assetDestinations = new java.util.ArrayList<AssetDestinationEntry>(assetDestinations);
    }

    /**
     * <p>
     * The destination for the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetDestinations <p>
     *            The destination for the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportAssetsToS3RequestDetails withAssetDestinations(
            AssetDestinationEntry... assetDestinations) {
        if (getAssetDestinations() == null) {
            this.assetDestinations = new java.util.ArrayList<AssetDestinationEntry>(
                    assetDestinations.length);
        }
        for (AssetDestinationEntry value : assetDestinations) {
            this.assetDestinations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The destination for the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assetDestinations <p>
     *            The destination for the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportAssetsToS3RequestDetails withAssetDestinations(
            java.util.Collection<AssetDestinationEntry> assetDestinations) {
        setAssetDestinations(assetDestinations);
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
    public ExportAssetsToS3RequestDetails withDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }

    /**
     * <p>
     * Encryption configuration for the export job.
     * </p>
     *
     * @return <p>
     *         Encryption configuration for the export job.
     *         </p>
     */
    public ExportServerSideEncryption getEncryption() {
        return encryption;
    }

    /**
     * <p>
     * Encryption configuration for the export job.
     * </p>
     *
     * @param encryption <p>
     *            Encryption configuration for the export job.
     *            </p>
     */
    public void setEncryption(ExportServerSideEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * <p>
     * Encryption configuration for the export job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryption <p>
     *            Encryption configuration for the export job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportAssetsToS3RequestDetails withEncryption(ExportServerSideEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this export
     * request.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the revision associated with this
     *         export request.
     *         </p>
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this export
     * request.
     * </p>
     *
     * @param revisionId <p>
     *            The unique identifier for the revision associated with this
     *            export request.
     *            </p>
     */
    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The unique identifier for the revision associated with this export
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionId <p>
     *            The unique identifier for the revision associated with this
     *            export request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportAssetsToS3RequestDetails withRevisionId(String revisionId) {
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
        if (getAssetDestinations() != null)
            sb.append("AssetDestinations: " + getAssetDestinations() + ",");
        if (getDataSetId() != null)
            sb.append("DataSetId: " + getDataSetId() + ",");
        if (getEncryption() != null)
            sb.append("Encryption: " + getEncryption() + ",");
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
                + ((getAssetDestinations() == null) ? 0 : getAssetDestinations().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportAssetsToS3RequestDetails == false)
            return false;
        ExportAssetsToS3RequestDetails other = (ExportAssetsToS3RequestDetails) obj;

        if (other.getAssetDestinations() == null ^ this.getAssetDestinations() == null)
            return false;
        if (other.getAssetDestinations() != null
                && other.getAssetDestinations().equals(this.getAssetDestinations()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null
                && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null
                && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null
                && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }
}
