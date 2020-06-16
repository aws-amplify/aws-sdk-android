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

public class ImportAssetFromSignedUrlJobErrorDetails implements Serializable {
    /**
     * <p>
     * The name of the asset. When importing from Amazon S3, the S3 object key
     * is used as the asset name. When exporting to Amazon S3, the asset name is
     * used as default target S3 object key.
     * </p>
     */
    private String assetName;

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
    public String getAssetName() {
        return assetName;
    }

    /**
     * <p>
     * The name of the asset. When importing from Amazon S3, the S3 object key
     * is used as the asset name. When exporting to Amazon S3, the asset name is
     * used as default target S3 object key.
     * </p>
     *
     * @param assetName <p>
     *            The name of the asset. When importing from Amazon S3, the S3
     *            object key is used as the asset name. When exporting to Amazon
     *            S3, the asset name is used as default target S3 object key.
     *            </p>
     */
    public void setAssetName(String assetName) {
        this.assetName = assetName;
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
     * @param assetName <p>
     *            The name of the asset. When importing from Amazon S3, the S3
     *            object key is used as the asset name. When exporting to Amazon
     *            S3, the asset name is used as default target S3 object key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportAssetFromSignedUrlJobErrorDetails withAssetName(String assetName) {
        this.assetName = assetName;
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
            sb.append("AssetName: " + getAssetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetName() == null) ? 0 : getAssetName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportAssetFromSignedUrlJobErrorDetails == false)
            return false;
        ImportAssetFromSignedUrlJobErrorDetails other = (ImportAssetFromSignedUrlJobErrorDetails) obj;

        if (other.getAssetName() == null ^ this.getAssetName() == null)
            return false;
        if (other.getAssetName() != null
                && other.getAssetName().equals(this.getAssetName()) == false)
            return false;
        return true;
    }
}
