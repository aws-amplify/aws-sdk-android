/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a specific version from a software package.
 * </p>
 * <p>
 * <b>Note:</b> If a package version is designated as default, you must remove
 * the designation from the package using the <a>UpdatePackage</a> action.
 * </p>
 */
public class DeletePackageVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the associated package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     */
    private String packageName;

    /**
     * <p>
     * The name of the target package version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     */
    private String versionName;

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the associated package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     *
     * @return <p>
     *         The name of the associated package.
     *         </p>
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * <p>
     * The name of the associated package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     *
     * @param packageName <p>
     *            The name of the associated package.
     *            </p>
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The name of the associated package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     *
     * @param packageName <p>
     *            The name of the associated package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeletePackageVersionRequest withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * <p>
     * The name of the target package version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     *
     * @return <p>
     *         The name of the target package version.
     *         </p>
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * <p>
     * The name of the target package version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     *
     * @param versionName <p>
     *            The name of the target package version.
     *            </p>
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The name of the target package version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     *
     * @param versionName <p>
     *            The name of the target package version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeletePackageVersionRequest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @return <p>
     *         A unique case-sensitive identifier that you can provide to ensure
     *         the idempotency of the request. Don't reuse this client token if
     *         a new idempotent request is required.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @param clientToken <p>
     *            A unique case-sensitive identifier that you can provide to
     *            ensure the idempotency of the request. Don't reuse this client
     *            token if a new idempotent request is required.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the
     * idempotency of the request. Don't reuse this client token if a new
     * idempotent request is required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 64<br/>
     * <b>Pattern: </b>\S{36,64}<br/>
     *
     * @param clientToken <p>
     *            A unique case-sensitive identifier that you can provide to
     *            ensure the idempotency of the request. Don't reuse this client
     *            token if a new idempotent request is required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeletePackageVersionRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getPackageName() != null)
            sb.append("packageName: " + getPackageName() + ",");
        if (getVersionName() != null)
            sb.append("versionName: " + getVersionName() + ",");
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode
                + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePackageVersionRequest == false)
            return false;
        DeletePackageVersionRequest other = (DeletePackageVersionRequest) obj;

        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null
                && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null
                && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
