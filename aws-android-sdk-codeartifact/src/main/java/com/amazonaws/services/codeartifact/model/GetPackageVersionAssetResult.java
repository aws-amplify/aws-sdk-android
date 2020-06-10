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

package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;

public class GetPackageVersionAssetResult implements Serializable {
    /**
     * <p>
     * The binary file, or asset, that is downloaded.
     * </p>
     */
    private java.io.InputStream asset;

    /**
     * <p>
     * The name of the asset that is downloaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>\P{C}+<br/>
     */
    private String assetName;

    /**
     * <p>
     * A string that contains the package version (for example,
     * <code>3.5.2</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     */
    private String packageVersion;

    /**
     * <p>
     * The name of the package version revision that contains the downloaded
     * asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>\S+<br/>
     */
    private String packageVersionRevision;

    /**
     * <p>
     * The binary file, or asset, that is downloaded.
     * </p>
     *
     * @return <p>
     *         The binary file, or asset, that is downloaded.
     *         </p>
     */
    public java.io.InputStream getAsset() {
        return asset;
    }

    /**
     * <p>
     * The binary file, or asset, that is downloaded.
     * </p>
     *
     * @param asset <p>
     *            The binary file, or asset, that is downloaded.
     *            </p>
     */
    public void setAsset(java.io.InputStream asset) {
        this.asset = asset;
    }

    /**
     * <p>
     * The binary file, or asset, that is downloaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param asset <p>
     *            The binary file, or asset, that is downloaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPackageVersionAssetResult withAsset(java.io.InputStream asset) {
        this.asset = asset;
        return this;
    }

    /**
     * <p>
     * The name of the asset that is downloaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>\P{C}+<br/>
     *
     * @return <p>
     *         The name of the asset that is downloaded.
     *         </p>
     */
    public String getAssetName() {
        return assetName;
    }

    /**
     * <p>
     * The name of the asset that is downloaded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>\P{C}+<br/>
     *
     * @param assetName <p>
     *            The name of the asset that is downloaded.
     *            </p>
     */
    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    /**
     * <p>
     * The name of the asset that is downloaded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>\P{C}+<br/>
     *
     * @param assetName <p>
     *            The name of the asset that is downloaded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPackageVersionAssetResult withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * <p>
     * A string that contains the package version (for example,
     * <code>3.5.2</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @return <p>
     *         A string that contains the package version (for example,
     *         <code>3.5.2</code>).
     *         </p>
     */
    public String getPackageVersion() {
        return packageVersion;
    }

    /**
     * <p>
     * A string that contains the package version (for example,
     * <code>3.5.2</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param packageVersion <p>
     *            A string that contains the package version (for example,
     *            <code>3.5.2</code>).
     *            </p>
     */
    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p>
     * A string that contains the package version (for example,
     * <code>3.5.2</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param packageVersion <p>
     *            A string that contains the package version (for example,
     *            <code>3.5.2</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPackageVersionAssetResult withPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }

    /**
     * <p>
     * The name of the package version revision that contains the downloaded
     * asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @return <p>
     *         The name of the package version revision that contains the
     *         downloaded asset.
     *         </p>
     */
    public String getPackageVersionRevision() {
        return packageVersionRevision;
    }

    /**
     * <p>
     * The name of the package version revision that contains the downloaded
     * asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param packageVersionRevision <p>
     *            The name of the package version revision that contains the
     *            downloaded asset.
     *            </p>
     */
    public void setPackageVersionRevision(String packageVersionRevision) {
        this.packageVersionRevision = packageVersionRevision;
    }

    /**
     * <p>
     * The name of the package version revision that contains the downloaded
     * asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param packageVersionRevision <p>
     *            The name of the package version revision that contains the
     *            downloaded asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPackageVersionAssetResult withPackageVersionRevision(String packageVersionRevision) {
        this.packageVersionRevision = packageVersionRevision;
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
        if (getAsset() != null)
            sb.append("asset: " + getAsset() + ",");
        if (getAssetName() != null)
            sb.append("assetName: " + getAssetName() + ",");
        if (getPackageVersion() != null)
            sb.append("packageVersion: " + getPackageVersion() + ",");
        if (getPackageVersionRevision() != null)
            sb.append("packageVersionRevision: " + getPackageVersionRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAsset() == null) ? 0 : getAsset().hashCode());
        hashCode = prime * hashCode + ((getAssetName() == null) ? 0 : getAssetName().hashCode());
        hashCode = prime * hashCode
                + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getPackageVersionRevision() == null) ? 0 : getPackageVersionRevision()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPackageVersionAssetResult == false)
            return false;
        GetPackageVersionAssetResult other = (GetPackageVersionAssetResult) obj;

        if (other.getAsset() == null ^ this.getAsset() == null)
            return false;
        if (other.getAsset() != null && other.getAsset().equals(this.getAsset()) == false)
            return false;
        if (other.getAssetName() == null ^ this.getAssetName() == null)
            return false;
        if (other.getAssetName() != null
                && other.getAssetName().equals(this.getAssetName()) == false)
            return false;
        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null)
            return false;
        if (other.getPackageVersion() != null
                && other.getPackageVersion().equals(this.getPackageVersion()) == false)
            return false;
        if (other.getPackageVersionRevision() == null ^ this.getPackageVersionRevision() == null)
            return false;
        if (other.getPackageVersionRevision() != null
                && other.getPackageVersionRevision().equals(this.getPackageVersionRevision()) == false)
            return false;
        return true;
    }
}
