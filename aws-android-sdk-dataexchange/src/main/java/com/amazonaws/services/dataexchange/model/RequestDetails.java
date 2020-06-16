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
 * The details for the request.
 * </p>
 */
public class RequestDetails implements Serializable {
    /**
     * <p>
     * Details about the export to signed URL request.
     * </p>
     */
    private ExportAssetToSignedUrlRequestDetails exportAssetToSignedUrl;

    /**
     * <p>
     * Details about the export to Amazon S3 request.
     * </p>
     */
    private ExportAssetsToS3RequestDetails exportAssetsToS3;

    /**
     * <p>
     * Details about the import from signed URL request.
     * </p>
     */
    private ImportAssetFromSignedUrlRequestDetails importAssetFromSignedUrl;

    /**
     * <p>
     * Details about the import from Amazon S3 request.
     * </p>
     */
    private ImportAssetsFromS3RequestDetails importAssetsFromS3;

    /**
     * <p>
     * Details about the export to signed URL request.
     * </p>
     *
     * @return <p>
     *         Details about the export to signed URL request.
     *         </p>
     */
    public ExportAssetToSignedUrlRequestDetails getExportAssetToSignedUrl() {
        return exportAssetToSignedUrl;
    }

    /**
     * <p>
     * Details about the export to signed URL request.
     * </p>
     *
     * @param exportAssetToSignedUrl <p>
     *            Details about the export to signed URL request.
     *            </p>
     */
    public void setExportAssetToSignedUrl(
            ExportAssetToSignedUrlRequestDetails exportAssetToSignedUrl) {
        this.exportAssetToSignedUrl = exportAssetToSignedUrl;
    }

    /**
     * <p>
     * Details about the export to signed URL request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportAssetToSignedUrl <p>
     *            Details about the export to signed URL request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestDetails withExportAssetToSignedUrl(
            ExportAssetToSignedUrlRequestDetails exportAssetToSignedUrl) {
        this.exportAssetToSignedUrl = exportAssetToSignedUrl;
        return this;
    }

    /**
     * <p>
     * Details about the export to Amazon S3 request.
     * </p>
     *
     * @return <p>
     *         Details about the export to Amazon S3 request.
     *         </p>
     */
    public ExportAssetsToS3RequestDetails getExportAssetsToS3() {
        return exportAssetsToS3;
    }

    /**
     * <p>
     * Details about the export to Amazon S3 request.
     * </p>
     *
     * @param exportAssetsToS3 <p>
     *            Details about the export to Amazon S3 request.
     *            </p>
     */
    public void setExportAssetsToS3(ExportAssetsToS3RequestDetails exportAssetsToS3) {
        this.exportAssetsToS3 = exportAssetsToS3;
    }

    /**
     * <p>
     * Details about the export to Amazon S3 request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportAssetsToS3 <p>
     *            Details about the export to Amazon S3 request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestDetails withExportAssetsToS3(ExportAssetsToS3RequestDetails exportAssetsToS3) {
        this.exportAssetsToS3 = exportAssetsToS3;
        return this;
    }

    /**
     * <p>
     * Details about the import from signed URL request.
     * </p>
     *
     * @return <p>
     *         Details about the import from signed URL request.
     *         </p>
     */
    public ImportAssetFromSignedUrlRequestDetails getImportAssetFromSignedUrl() {
        return importAssetFromSignedUrl;
    }

    /**
     * <p>
     * Details about the import from signed URL request.
     * </p>
     *
     * @param importAssetFromSignedUrl <p>
     *            Details about the import from signed URL request.
     *            </p>
     */
    public void setImportAssetFromSignedUrl(
            ImportAssetFromSignedUrlRequestDetails importAssetFromSignedUrl) {
        this.importAssetFromSignedUrl = importAssetFromSignedUrl;
    }

    /**
     * <p>
     * Details about the import from signed URL request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importAssetFromSignedUrl <p>
     *            Details about the import from signed URL request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestDetails withImportAssetFromSignedUrl(
            ImportAssetFromSignedUrlRequestDetails importAssetFromSignedUrl) {
        this.importAssetFromSignedUrl = importAssetFromSignedUrl;
        return this;
    }

    /**
     * <p>
     * Details about the import from Amazon S3 request.
     * </p>
     *
     * @return <p>
     *         Details about the import from Amazon S3 request.
     *         </p>
     */
    public ImportAssetsFromS3RequestDetails getImportAssetsFromS3() {
        return importAssetsFromS3;
    }

    /**
     * <p>
     * Details about the import from Amazon S3 request.
     * </p>
     *
     * @param importAssetsFromS3 <p>
     *            Details about the import from Amazon S3 request.
     *            </p>
     */
    public void setImportAssetsFromS3(ImportAssetsFromS3RequestDetails importAssetsFromS3) {
        this.importAssetsFromS3 = importAssetsFromS3;
    }

    /**
     * <p>
     * Details about the import from Amazon S3 request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importAssetsFromS3 <p>
     *            Details about the import from Amazon S3 request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestDetails withImportAssetsFromS3(ImportAssetsFromS3RequestDetails importAssetsFromS3) {
        this.importAssetsFromS3 = importAssetsFromS3;
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
        if (getExportAssetToSignedUrl() != null)
            sb.append("ExportAssetToSignedUrl: " + getExportAssetToSignedUrl() + ",");
        if (getExportAssetsToS3() != null)
            sb.append("ExportAssetsToS3: " + getExportAssetsToS3() + ",");
        if (getImportAssetFromSignedUrl() != null)
            sb.append("ImportAssetFromSignedUrl: " + getImportAssetFromSignedUrl() + ",");
        if (getImportAssetsFromS3() != null)
            sb.append("ImportAssetsFromS3: " + getImportAssetsFromS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getExportAssetToSignedUrl() == null) ? 0 : getExportAssetToSignedUrl()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getExportAssetsToS3() == null) ? 0 : getExportAssetsToS3().hashCode());
        hashCode = prime
                * hashCode
                + ((getImportAssetFromSignedUrl() == null) ? 0 : getImportAssetFromSignedUrl()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getImportAssetsFromS3() == null) ? 0 : getImportAssetsFromS3().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestDetails == false)
            return false;
        RequestDetails other = (RequestDetails) obj;

        if (other.getExportAssetToSignedUrl() == null ^ this.getExportAssetToSignedUrl() == null)
            return false;
        if (other.getExportAssetToSignedUrl() != null
                && other.getExportAssetToSignedUrl().equals(this.getExportAssetToSignedUrl()) == false)
            return false;
        if (other.getExportAssetsToS3() == null ^ this.getExportAssetsToS3() == null)
            return false;
        if (other.getExportAssetsToS3() != null
                && other.getExportAssetsToS3().equals(this.getExportAssetsToS3()) == false)
            return false;
        if (other.getImportAssetFromSignedUrl() == null
                ^ this.getImportAssetFromSignedUrl() == null)
            return false;
        if (other.getImportAssetFromSignedUrl() != null
                && other.getImportAssetFromSignedUrl().equals(this.getImportAssetFromSignedUrl()) == false)
            return false;
        if (other.getImportAssetsFromS3() == null ^ this.getImportAssetsFromS3() == null)
            return false;
        if (other.getImportAssetsFromS3() != null
                && other.getImportAssetsFromS3().equals(this.getImportAssetsFromS3()) == false)
            return false;
        return true;
    }
}
