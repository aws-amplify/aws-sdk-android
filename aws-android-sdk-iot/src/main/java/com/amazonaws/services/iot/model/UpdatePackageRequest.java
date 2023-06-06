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
 * Updates the supported fields for a specific package.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >UpdatePackage</a> and <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >GetIndexingConfiguration</a> actions.
 * </p>
 */
public class UpdatePackageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the target package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     */
    private String packageName;

    /**
     * <p>
     * The package description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     */
    private String description;

    /**
     * <p>
     * The name of the default package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set
     * <code>unsetDefaultVersion</code> equal to <code>true</code> at the same
     * time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     */
    private String defaultVersionName;

    /**
     * <p>
     * Indicates whether you want to remove the named default package version
     * from the software package. Set as <code>true</code> to remove the default
     * package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set
     * <code>unsetDefaultVersion</code> equal to <code>true</code> at the same
     * time.
     * </p>
     */
    private Boolean unsetDefaultVersion;

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
     * The name of the target package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     *
     * @return <p>
     *         The name of the target package.
     *         </p>
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * <p>
     * The name of the target package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     *
     * @param packageName <p>
     *            The name of the target package.
     *            </p>
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The name of the target package.
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
     *            The name of the target package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePackageRequest withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * <p>
     * The package description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         The package description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The package description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            The package description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The package description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            The package description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePackageRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The name of the default package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set
     * <code>unsetDefaultVersion</code> equal to <code>true</code> at the same
     * time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     *
     * @return <p>
     *         The name of the default package version.
     *         </p>
     *         <p>
     *         <b>Note:</b> You cannot name a <code>defaultVersion</code> and
     *         set <code>unsetDefaultVersion</code> equal to <code>true</code>
     *         at the same time.
     *         </p>
     */
    public String getDefaultVersionName() {
        return defaultVersionName;
    }

    /**
     * <p>
     * The name of the default package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set
     * <code>unsetDefaultVersion</code> equal to <code>true</code> at the same
     * time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     *
     * @param defaultVersionName <p>
     *            The name of the default package version.
     *            </p>
     *            <p>
     *            <b>Note:</b> You cannot name a <code>defaultVersion</code> and
     *            set <code>unsetDefaultVersion</code> equal to
     *            <code>true</code> at the same time.
     *            </p>
     */
    public void setDefaultVersionName(String defaultVersionName) {
        this.defaultVersionName = defaultVersionName;
    }

    /**
     * <p>
     * The name of the default package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set
     * <code>unsetDefaultVersion</code> equal to <code>true</code> at the same
     * time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     *
     * @param defaultVersionName <p>
     *            The name of the default package version.
     *            </p>
     *            <p>
     *            <b>Note:</b> You cannot name a <code>defaultVersion</code> and
     *            set <code>unsetDefaultVersion</code> equal to
     *            <code>true</code> at the same time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePackageRequest withDefaultVersionName(String defaultVersionName) {
        this.defaultVersionName = defaultVersionName;
        return this;
    }

    /**
     * <p>
     * Indicates whether you want to remove the named default package version
     * from the software package. Set as <code>true</code> to remove the default
     * package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set
     * <code>unsetDefaultVersion</code> equal to <code>true</code> at the same
     * time.
     * </p>
     *
     * @return <p>
     *         Indicates whether you want to remove the named default package
     *         version from the software package. Set as <code>true</code> to
     *         remove the default package version.
     *         </p>
     *         <p>
     *         <b>Note:</b> You cannot name a <code>defaultVersion</code> and
     *         set <code>unsetDefaultVersion</code> equal to <code>true</code>
     *         at the same time.
     *         </p>
     */
    public Boolean isUnsetDefaultVersion() {
        return unsetDefaultVersion;
    }

    /**
     * <p>
     * Indicates whether you want to remove the named default package version
     * from the software package. Set as <code>true</code> to remove the default
     * package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set
     * <code>unsetDefaultVersion</code> equal to <code>true</code> at the same
     * time.
     * </p>
     *
     * @return <p>
     *         Indicates whether you want to remove the named default package
     *         version from the software package. Set as <code>true</code> to
     *         remove the default package version.
     *         </p>
     *         <p>
     *         <b>Note:</b> You cannot name a <code>defaultVersion</code> and
     *         set <code>unsetDefaultVersion</code> equal to <code>true</code>
     *         at the same time.
     *         </p>
     */
    public Boolean getUnsetDefaultVersion() {
        return unsetDefaultVersion;
    }

    /**
     * <p>
     * Indicates whether you want to remove the named default package version
     * from the software package. Set as <code>true</code> to remove the default
     * package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set
     * <code>unsetDefaultVersion</code> equal to <code>true</code> at the same
     * time.
     * </p>
     *
     * @param unsetDefaultVersion <p>
     *            Indicates whether you want to remove the named default package
     *            version from the software package. Set as <code>true</code> to
     *            remove the default package version.
     *            </p>
     *            <p>
     *            <b>Note:</b> You cannot name a <code>defaultVersion</code> and
     *            set <code>unsetDefaultVersion</code> equal to
     *            <code>true</code> at the same time.
     *            </p>
     */
    public void setUnsetDefaultVersion(Boolean unsetDefaultVersion) {
        this.unsetDefaultVersion = unsetDefaultVersion;
    }

    /**
     * <p>
     * Indicates whether you want to remove the named default package version
     * from the software package. Set as <code>true</code> to remove the default
     * package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set
     * <code>unsetDefaultVersion</code> equal to <code>true</code> at the same
     * time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsetDefaultVersion <p>
     *            Indicates whether you want to remove the named default package
     *            version from the software package. Set as <code>true</code> to
     *            remove the default package version.
     *            </p>
     *            <p>
     *            <b>Note:</b> You cannot name a <code>defaultVersion</code> and
     *            set <code>unsetDefaultVersion</code> equal to
     *            <code>true</code> at the same time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePackageRequest withUnsetDefaultVersion(Boolean unsetDefaultVersion) {
        this.unsetDefaultVersion = unsetDefaultVersion;
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
    public UpdatePackageRequest withClientToken(String clientToken) {
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
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getDefaultVersionName() != null)
            sb.append("defaultVersionName: " + getDefaultVersionName() + ",");
        if (getUnsetDefaultVersion() != null)
            sb.append("unsetDefaultVersion: " + getUnsetDefaultVersion() + ",");
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
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultVersionName() == null) ? 0 : getDefaultVersionName().hashCode());
        hashCode = prime * hashCode
                + ((getUnsetDefaultVersion() == null) ? 0 : getUnsetDefaultVersion().hashCode());
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

        if (obj instanceof UpdatePackageRequest == false)
            return false;
        UpdatePackageRequest other = (UpdatePackageRequest) obj;

        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null
                && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefaultVersionName() == null ^ this.getDefaultVersionName() == null)
            return false;
        if (other.getDefaultVersionName() != null
                && other.getDefaultVersionName().equals(this.getDefaultVersionName()) == false)
            return false;
        if (other.getUnsetDefaultVersion() == null ^ this.getUnsetDefaultVersion() == null)
            return false;
        if (other.getUnsetDefaultVersion() != null
                && other.getUnsetDefaultVersion().equals(this.getUnsetDefaultVersion()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
