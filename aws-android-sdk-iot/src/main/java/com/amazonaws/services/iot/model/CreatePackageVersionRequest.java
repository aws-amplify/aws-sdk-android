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
 * Creates a new version for an existing IoT software package.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >CreatePackageVersion</a> and <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >GetIndexingConfiguration</a> actions.
 * </p>
 */
public class CreatePackageVersionRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The name of the new package version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     */
    private String versionName;

    /**
     * <p>
     * A summary of the package version being created. This can be used to
     * outline the package's contents or purpose.
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
     * The combined size of all the attributes on a package version is limited
     * to 3KB.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * Metadata that can be used to manage the package version.
     * </p>
     */
    private java.util.Map<String, String> tags;

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
    public CreatePackageVersionRequest withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * <p>
     * The name of the new package version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     *
     * @return <p>
     *         The name of the new package version.
     *         </p>
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * <p>
     * The name of the new package version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_.]+<br/>
     *
     * @param versionName <p>
     *            The name of the new package version.
     *            </p>
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The name of the new package version.
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
     *            The name of the new package version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePackageVersionRequest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * <p>
     * A summary of the package version being created. This can be used to
     * outline the package's contents or purpose.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         A summary of the package version being created. This can be used
     *         to outline the package's contents or purpose.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A summary of the package version being created. This can be used to
     * outline the package's contents or purpose.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            A summary of the package version being created. This can be
     *            used to outline the package's contents or purpose.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A summary of the package version being created. This can be used to
     * outline the package's contents or purpose.
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
     *            A summary of the package version being created. This can be
     *            used to outline the package's contents or purpose.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePackageVersionRequest withDescription(String description) {
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
     *            The combined size of all the attributes on a package version
     *            is limited to 3KB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePackageVersionRequest withAttributes(java.util.Map<String, String> attributes) {
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
    public CreatePackageVersionRequest addattributesEntry(String key, String value) {
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
    public CreatePackageVersionRequest clearattributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the package version.
     * </p>
     *
     * @return <p>
     *         Metadata that can be used to manage the package version.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the package version.
     * </p>
     *
     * @param tags <p>
     *            Metadata that can be used to manage the package version.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the package version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata that can be used to manage the package version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePackageVersionRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the package version.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePackageVersionRequest addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreatePackageVersionRequest cleartagsEntries() {
        this.tags = null;
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
    public CreatePackageVersionRequest withClientToken(String clientToken) {
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
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

        if (obj instanceof CreatePackageVersionRequest == false)
            return false;
        CreatePackageVersionRequest other = (CreatePackageVersionRequest) obj;

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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
