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

package com.amazonaws.services.api.ecr.model;

import java.io.Serializable;

public class GetDownloadUrlForLayerResult implements Serializable {
    /**
     * <p>
     * The pre-signed Amazon S3 download URL for the requested layer.
     * </p>
     */
    private String downloadUrl;

    /**
     * <p>
     * The digest of the image layer to download.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_+.]+:[a-fA-F0-9]+<br/>
     */
    private String layerDigest;

    /**
     * <p>
     * The pre-signed Amazon S3 download URL for the requested layer.
     * </p>
     *
     * @return <p>
     *         The pre-signed Amazon S3 download URL for the requested layer.
     *         </p>
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * <p>
     * The pre-signed Amazon S3 download URL for the requested layer.
     * </p>
     *
     * @param downloadUrl <p>
     *            The pre-signed Amazon S3 download URL for the requested layer.
     *            </p>
     */
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * <p>
     * The pre-signed Amazon S3 download URL for the requested layer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param downloadUrl <p>
     *            The pre-signed Amazon S3 download URL for the requested layer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDownloadUrlForLayerResult withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * <p>
     * The digest of the image layer to download.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_+.]+:[a-fA-F0-9]+<br/>
     *
     * @return <p>
     *         The digest of the image layer to download.
     *         </p>
     */
    public String getLayerDigest() {
        return layerDigest;
    }

    /**
     * <p>
     * The digest of the image layer to download.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_+.]+:[a-fA-F0-9]+<br/>
     *
     * @param layerDigest <p>
     *            The digest of the image layer to download.
     *            </p>
     */
    public void setLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
    }

    /**
     * <p>
     * The digest of the image layer to download.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_+.]+:[a-fA-F0-9]+<br/>
     *
     * @param layerDigest <p>
     *            The digest of the image layer to download.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDownloadUrlForLayerResult withLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
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
        if (getDownloadUrl() != null)
            sb.append("downloadUrl: " + getDownloadUrl() + ",");
        if (getLayerDigest() != null)
            sb.append("layerDigest: " + getLayerDigest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDownloadUrl() == null) ? 0 : getDownloadUrl().hashCode());
        hashCode = prime * hashCode
                + ((getLayerDigest() == null) ? 0 : getLayerDigest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDownloadUrlForLayerResult == false)
            return false;
        GetDownloadUrlForLayerResult other = (GetDownloadUrlForLayerResult) obj;

        if (other.getDownloadUrl() == null ^ this.getDownloadUrl() == null)
            return false;
        if (other.getDownloadUrl() != null
                && other.getDownloadUrl().equals(this.getDownloadUrl()) == false)
            return false;
        if (other.getLayerDigest() == null ^ this.getLayerDigest() == null)
            return false;
        if (other.getLayerDigest() != null
                && other.getLayerDigest().equals(this.getLayerDigest()) == false)
            return false;
        return true;
    }
}
