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
 * Updates the supported fields for a specific package version.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >UpdatePackageVersion</a> and <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >GetIndexingConfiguration</a> actions.
 * </p>
 */
public class UpdatePackageVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the associated software package.
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
     * The package version description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     */
    private String description;

    /**
     * <p>
     * Metadata that can be used to define a package version’s configuration.
     * For example, the S3 file location, configuration options that are being
     * sent to the device or fleet.
     * </p>
     * <p>
     * <b>Note:</b> Attributes can be updated only when the package version is
     * in a draft state.
     * </p>
     * <p>
     * The combined size of all the attributes on a package version is limited
     * to 3KB.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The status that the package version should be assigned. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISH, DEPRECATE
     */
    private String action;

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
     * The name of the associated software package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     *
     * @return <p>
     *         The name of the associated software package.
     *         </p>
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * <p>
     * The name of the associated software package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     *
     * @param packageName <p>
     *            The name of the associated software package.
     *            </p>
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The name of the associated software package.
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
     *            The name of the associated software package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePackageVersionRequest withPackageName(String packageName) {
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
    public UpdatePackageVersionRequest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * <p>
     * The package version description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         The package version description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The package version description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            The package version description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The package version description.
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
     *            The package version description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePackageVersionRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to define a package version’s configuration.
     * For example, the S3 file location, configuration options that are being
     * sent to the device or fleet.
     * </p>
     * <p>
     * <b>Note:</b> Attributes can be updated only when the package version is
     * in a draft state.
     * </p>
     * <p>
     * The combined size of all the attributes on a package version is limited
     * to 3KB.
     * </p>
     *
     * @return <p>
     *         Metadata that can be used to define a package version’s
     *         configuration. For example, the S3 file location, configuration
     *         options that are being sent to the device or fleet.
     *         </p>
     *         <p>
     *         <b>Note:</b> Attributes can be updated only when the package
     *         version is in a draft state.
     *         </p>
     *         <p>
     *         The combined size of all the attributes on a package version is
     *         limited to 3KB.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Metadata that can be used to define a package version’s configuration.
     * For example, the S3 file location, configuration options that are being
     * sent to the device or fleet.
     * </p>
     * <p>
     * <b>Note:</b> Attributes can be updated only when the package version is
     * in a draft state.
     * </p>
     * <p>
     * The combined size of all the attributes on a package version is limited
     * to 3KB.
     * </p>
     *
     * @param attributes <p>
     *            Metadata that can be used to define a package version’s
     *            configuration. For example, the S3 file location,
     *            configuration options that are being sent to the device or
     *            fleet.
     *            </p>
     *            <p>
     *            <b>Note:</b> Attributes can be updated only when the package
     *            version is in a draft state.
     *            </p>
     *            <p>
     *            The combined size of all the attributes on a package version
     *            is limited to 3KB.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Metadata that can be used to define a package version’s configuration.
     * For example, the S3 file location, configuration options that are being
     * sent to the device or fleet.
     * </p>
     * <p>
     * <b>Note:</b> Attributes can be updated only when the package version is
     * in a draft state.
     * </p>
     * <p>
     * The combined size of all the attributes on a package version is limited
     * to 3KB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            Metadata that can be used to define a package version’s
     *            configuration. For example, the S3 file location,
     *            configuration options that are being sent to the device or
     *            fleet.
     *            </p>
     *            <p>
     *            <b>Note:</b> Attributes can be updated only when the package
     *            version is in a draft state.
     *            </p>
     *            <p>
     *            The combined size of all the attributes on a package version
     *            is limited to 3KB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePackageVersionRequest withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to define a package version’s configuration.
     * For example, the S3 file location, configuration options that are being
     * sent to the device or fleet.
     * </p>
     * <p>
     * <b>Note:</b> Attributes can be updated only when the package version is
     * in a draft state.
     * </p>
     * <p>
     * The combined size of all the attributes on a package version is limited
     * to 3KB.
     * </p>
     * <p>
     * The method adds a new key-value pair into attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into attributes.
     * @param value The corresponding value of the entry to be added into
     *            attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePackageVersionRequest addattributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdatePackageVersionRequest clearattributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The status that the package version should be assigned. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISH, DEPRECATE
     *
     * @return <p>
     *         The status that the package version should be assigned. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *         >Package version lifecycle</a>.
     *         </p>
     * @see PackageVersionAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The status that the package version should be assigned. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISH, DEPRECATE
     *
     * @param action <p>
     *            The status that the package version should be assigned. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *            >Package version lifecycle</a>.
     *            </p>
     * @see PackageVersionAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The status that the package version should be assigned. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISH, DEPRECATE
     *
     * @param action <p>
     *            The status that the package version should be assigned. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *            >Package version lifecycle</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PackageVersionAction
     */
    public UpdatePackageVersionRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The status that the package version should be assigned. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISH, DEPRECATE
     *
     * @param action <p>
     *            The status that the package version should be assigned. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *            >Package version lifecycle</a>.
     *            </p>
     * @see PackageVersionAction
     */
    public void setAction(PackageVersionAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The status that the package version should be assigned. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLISH, DEPRECATE
     *
     * @param action <p>
     *            The status that the package version should be assigned. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *            >Package version lifecycle</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PackageVersionAction
     */
    public UpdatePackageVersionRequest withAction(PackageVersionAction action) {
        this.action = action.toString();
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
    public UpdatePackageVersionRequest withClientToken(String clientToken) {
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
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes() + ",");
        if (getAction() != null)
            sb.append("action: " + getAction() + ",");
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
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
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

        if (obj instanceof UpdatePackageVersionRequest == false)
            return false;
        UpdatePackageVersionRequest other = (UpdatePackageVersionRequest) obj;

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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
