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

public class Details implements Serializable {
    /**
     * The new value for the importAssetFromSignedUrlJobErrorDetails property
     * for this object.
     */
    private ImportAssetFromSignedUrlJobErrorDetails importAssetFromSignedUrlJobErrorDetails;

    /**
     * <p>
     * The list of sources for the assets.
     * </p>
     */
    private java.util.List<AssetSourceEntry> importAssetsFromS3JobErrorDetails;

    /**
     * Returns the value of the importAssetFromSignedUrlJobErrorDetails property
     * for this object.
     *
     * @return The value of the importAssetFromSignedUrlJobErrorDetails property
     *         for this object.
     */
    public ImportAssetFromSignedUrlJobErrorDetails getImportAssetFromSignedUrlJobErrorDetails() {
        return importAssetFromSignedUrlJobErrorDetails;
    }

    /**
     * Sets the value of importAssetFromSignedUrlJobErrorDetails
     *
     * @param importAssetFromSignedUrlJobErrorDetails The new value for the
     *            importAssetFromSignedUrlJobErrorDetails property for this
     *            object.
     */
    public void setImportAssetFromSignedUrlJobErrorDetails(
            ImportAssetFromSignedUrlJobErrorDetails importAssetFromSignedUrlJobErrorDetails) {
        this.importAssetFromSignedUrlJobErrorDetails = importAssetFromSignedUrlJobErrorDetails;
    }

    /**
     * Sets the value of the importAssetFromSignedUrlJobErrorDetails property
     * for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importAssetFromSignedUrlJobErrorDetails The new value for the
     *            importAssetFromSignedUrlJobErrorDetails property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Details withImportAssetFromSignedUrlJobErrorDetails(
            ImportAssetFromSignedUrlJobErrorDetails importAssetFromSignedUrlJobErrorDetails) {
        this.importAssetFromSignedUrlJobErrorDetails = importAssetFromSignedUrlJobErrorDetails;
        return this;
    }

    /**
     * <p>
     * The list of sources for the assets.
     * </p>
     *
     * @return <p>
     *         The list of sources for the assets.
     *         </p>
     */
    public java.util.List<AssetSourceEntry> getImportAssetsFromS3JobErrorDetails() {
        return importAssetsFromS3JobErrorDetails;
    }

    /**
     * <p>
     * The list of sources for the assets.
     * </p>
     *
     * @param importAssetsFromS3JobErrorDetails <p>
     *            The list of sources for the assets.
     *            </p>
     */
    public void setImportAssetsFromS3JobErrorDetails(
            java.util.Collection<AssetSourceEntry> importAssetsFromS3JobErrorDetails) {
        if (importAssetsFromS3JobErrorDetails == null) {
            this.importAssetsFromS3JobErrorDetails = null;
            return;
        }

        this.importAssetsFromS3JobErrorDetails = new java.util.ArrayList<AssetSourceEntry>(
                importAssetsFromS3JobErrorDetails);
    }

    /**
     * <p>
     * The list of sources for the assets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importAssetsFromS3JobErrorDetails <p>
     *            The list of sources for the assets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Details withImportAssetsFromS3JobErrorDetails(
            AssetSourceEntry... importAssetsFromS3JobErrorDetails) {
        if (getImportAssetsFromS3JobErrorDetails() == null) {
            this.importAssetsFromS3JobErrorDetails = new java.util.ArrayList<AssetSourceEntry>(
                    importAssetsFromS3JobErrorDetails.length);
        }
        for (AssetSourceEntry value : importAssetsFromS3JobErrorDetails) {
            this.importAssetsFromS3JobErrorDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of sources for the assets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importAssetsFromS3JobErrorDetails <p>
     *            The list of sources for the assets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Details withImportAssetsFromS3JobErrorDetails(
            java.util.Collection<AssetSourceEntry> importAssetsFromS3JobErrorDetails) {
        setImportAssetsFromS3JobErrorDetails(importAssetsFromS3JobErrorDetails);
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
        if (getImportAssetFromSignedUrlJobErrorDetails() != null)
            sb.append("ImportAssetFromSignedUrlJobErrorDetails: "
                    + getImportAssetFromSignedUrlJobErrorDetails() + ",");
        if (getImportAssetsFromS3JobErrorDetails() != null)
            sb.append("ImportAssetsFromS3JobErrorDetails: "
                    + getImportAssetsFromS3JobErrorDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getImportAssetFromSignedUrlJobErrorDetails() == null) ? 0
                        : getImportAssetFromSignedUrlJobErrorDetails().hashCode());
        hashCode = prime
                * hashCode
                + ((getImportAssetsFromS3JobErrorDetails() == null) ? 0
                        : getImportAssetsFromS3JobErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Details == false)
            return false;
        Details other = (Details) obj;

        if (other.getImportAssetFromSignedUrlJobErrorDetails() == null
                ^ this.getImportAssetFromSignedUrlJobErrorDetails() == null)
            return false;
        if (other.getImportAssetFromSignedUrlJobErrorDetails() != null
                && other.getImportAssetFromSignedUrlJobErrorDetails().equals(
                        this.getImportAssetFromSignedUrlJobErrorDetails()) == false)
            return false;
        if (other.getImportAssetsFromS3JobErrorDetails() == null
                ^ this.getImportAssetsFromS3JobErrorDetails() == null)
            return false;
        if (other.getImportAssetsFromS3JobErrorDetails() != null
                && other.getImportAssetsFromS3JobErrorDetails().equals(
                        this.getImportAssetsFromS3JobErrorDetails()) == false)
            return false;
        return true;
    }
}
