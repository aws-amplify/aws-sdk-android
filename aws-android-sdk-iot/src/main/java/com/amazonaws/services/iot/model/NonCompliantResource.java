/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Information about the resource that was non-compliant with the audit check.
 * </p>
 */
public class NonCompliantResource implements Serializable {
    /**
     * <p>
     * The type of the non-compliant resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVICE_CERTIFICATE, CA_CERTIFICATE, IOT_POLICY,
     * COGNITO_IDENTITY_POOL, CLIENT_ID, ACCOUNT_SETTINGS
     */
    private String resourceType;

    /**
     * <p>
     * Information identifying the non-compliant resource.
     * </p>
     */
    private ResourceIdentifier resourceIdentifier;

    /**
     * <p>
     * Additional information about the non-compliant resource.
     * </p>
     */
    private java.util.Map<String, String> additionalInfo;

    /**
     * <p>
     * The type of the non-compliant resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVICE_CERTIFICATE, CA_CERTIFICATE, IOT_POLICY,
     * COGNITO_IDENTITY_POOL, CLIENT_ID, ACCOUNT_SETTINGS
     *
     * @return <p>
     *         The type of the non-compliant resource.
     *         </p>
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of the non-compliant resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVICE_CERTIFICATE, CA_CERTIFICATE, IOT_POLICY,
     * COGNITO_IDENTITY_POOL, CLIENT_ID, ACCOUNT_SETTINGS
     *
     * @param resourceType <p>
     *            The type of the non-compliant resource.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the non-compliant resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVICE_CERTIFICATE, CA_CERTIFICATE, IOT_POLICY,
     * COGNITO_IDENTITY_POOL, CLIENT_ID, ACCOUNT_SETTINGS
     *
     * @param resourceType <p>
     *            The type of the non-compliant resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public NonCompliantResource withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of the non-compliant resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVICE_CERTIFICATE, CA_CERTIFICATE, IOT_POLICY,
     * COGNITO_IDENTITY_POOL, CLIENT_ID, ACCOUNT_SETTINGS
     *
     * @param resourceType <p>
     *            The type of the non-compliant resource.
     *            </p>
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of the non-compliant resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEVICE_CERTIFICATE, CA_CERTIFICATE, IOT_POLICY,
     * COGNITO_IDENTITY_POOL, CLIENT_ID, ACCOUNT_SETTINGS
     *
     * @param resourceType <p>
     *            The type of the non-compliant resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public NonCompliantResource withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Information identifying the non-compliant resource.
     * </p>
     *
     * @return <p>
     *         Information identifying the non-compliant resource.
     *         </p>
     */
    public ResourceIdentifier getResourceIdentifier() {
        return resourceIdentifier;
    }

    /**
     * <p>
     * Information identifying the non-compliant resource.
     * </p>
     *
     * @param resourceIdentifier <p>
     *            Information identifying the non-compliant resource.
     *            </p>
     */
    public void setResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * Information identifying the non-compliant resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceIdentifier <p>
     *            Information identifying the non-compliant resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NonCompliantResource withResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }

    /**
     * <p>
     * Additional information about the non-compliant resource.
     * </p>
     *
     * @return <p>
     *         Additional information about the non-compliant resource.
     *         </p>
     */
    public java.util.Map<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * <p>
     * Additional information about the non-compliant resource.
     * </p>
     *
     * @param additionalInfo <p>
     *            Additional information about the non-compliant resource.
     *            </p>
     */
    public void setAdditionalInfo(java.util.Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * Additional information about the non-compliant resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalInfo <p>
     *            Additional information about the non-compliant resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NonCompliantResource withAdditionalInfo(java.util.Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * <p>
     * Additional information about the non-compliant resource.
     * </p>
     * <p>
     * The method adds a new key-value pair into additionalInfo parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into additionalInfo.
     * @param value The corresponding value of the entry to be added into
     *            additionalInfo.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NonCompliantResource addadditionalInfoEntry(String key, String value) {
        if (null == this.additionalInfo) {
            this.additionalInfo = new java.util.HashMap<String, String>();
        }
        if (this.additionalInfo.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.additionalInfo.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into additionalInfo.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public NonCompliantResource clearadditionalInfoEntries() {
        this.additionalInfo = null;
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
        if (getResourceType() != null)
            sb.append("resourceType: " + getResourceType() + ",");
        if (getResourceIdentifier() != null)
            sb.append("resourceIdentifier: " + getResourceIdentifier() + ",");
        if (getAdditionalInfo() != null)
            sb.append("additionalInfo: " + getAdditionalInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NonCompliantResource == false)
            return false;
        NonCompliantResource other = (NonCompliantResource) obj;

        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null
                && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null
                && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        return true;
    }
}
