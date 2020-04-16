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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * If your output group type is HLS, DASH, or Microsoft Smooth, use these
 * settings when doing DRM encryption with a SPEKE-compliant key provider. If
 * your output group type is CMAF, use the SpekeKeyProviderCmaf settings
 * instead.
 */
public class SpekeKeyProvider implements Serializable {
    /**
     * If you want your key provider to encrypt the content keys that it
     * provides to MediaConvert, set up a certificate with a master key using
     * AWS Certificate Manager. Specify the certificate's Amazon Resource Name
     * (ARN) here.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws(-us-gov)?:acm:<br/>
     */
    private String certificateArn;

    /**
     * Specify the resource ID that your SPEKE-compliant key provider uses to
     * identify this content.
     */
    private String resourceId;

    /**
     * Relates to SPEKE implementation. DRM system identifiers. DASH output
     * groups support a max of two system ids. Other group types support one
     * system id. See https://dashif.org/identifiers/content_protection/ for
     * more details.
     */
    private java.util.List<String> systemIds;

    /**
     * Specify the URL to the key server that your SPEKE-compliant DRM key
     * provider uses to provide keys for encrypting your content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^https:\/\/<br/>
     */
    private String url;

    /**
     * If you want your key provider to encrypt the content keys that it
     * provides to MediaConvert, set up a certificate with a master key using
     * AWS Certificate Manager. Specify the certificate's Amazon Resource Name
     * (ARN) here.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws(-us-gov)?:acm:<br/>
     *
     * @return If you want your key provider to encrypt the content keys that it
     *         provides to MediaConvert, set up a certificate with a master key
     *         using AWS Certificate Manager. Specify the certificate's Amazon
     *         Resource Name (ARN) here.
     */
    public String getCertificateArn() {
        return certificateArn;
    }

    /**
     * If you want your key provider to encrypt the content keys that it
     * provides to MediaConvert, set up a certificate with a master key using
     * AWS Certificate Manager. Specify the certificate's Amazon Resource Name
     * (ARN) here.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws(-us-gov)?:acm:<br/>
     *
     * @param certificateArn If you want your key provider to encrypt the
     *            content keys that it provides to MediaConvert, set up a
     *            certificate with a master key using AWS Certificate Manager.
     *            Specify the certificate's Amazon Resource Name (ARN) here.
     */
    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * If you want your key provider to encrypt the content keys that it
     * provides to MediaConvert, set up a certificate with a master key using
     * AWS Certificate Manager. Specify the certificate's Amazon Resource Name
     * (ARN) here.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^arn:aws(-us-gov)?:acm:<br/>
     *
     * @param certificateArn If you want your key provider to encrypt the
     *            content keys that it provides to MediaConvert, set up a
     *            certificate with a master key using AWS Certificate Manager.
     *            Specify the certificate's Amazon Resource Name (ARN) here.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpekeKeyProvider withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * Specify the resource ID that your SPEKE-compliant key provider uses to
     * identify this content.
     *
     * @return Specify the resource ID that your SPEKE-compliant key provider
     *         uses to identify this content.
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Specify the resource ID that your SPEKE-compliant key provider uses to
     * identify this content.
     *
     * @param resourceId Specify the resource ID that your SPEKE-compliant key
     *            provider uses to identify this content.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Specify the resource ID that your SPEKE-compliant key provider uses to
     * identify this content.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceId Specify the resource ID that your SPEKE-compliant key
     *            provider uses to identify this content.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpekeKeyProvider withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Relates to SPEKE implementation. DRM system identifiers. DASH output
     * groups support a max of two system ids. Other group types support one
     * system id. See https://dashif.org/identifiers/content_protection/ for
     * more details.
     *
     * @return Relates to SPEKE implementation. DRM system identifiers. DASH
     *         output groups support a max of two system ids. Other group types
     *         support one system id. See
     *         https://dashif.org/identifiers/content_protection/ for more
     *         details.
     */
    public java.util.List<String> getSystemIds() {
        return systemIds;
    }

    /**
     * Relates to SPEKE implementation. DRM system identifiers. DASH output
     * groups support a max of two system ids. Other group types support one
     * system id. See https://dashif.org/identifiers/content_protection/ for
     * more details.
     *
     * @param systemIds Relates to SPEKE implementation. DRM system identifiers.
     *            DASH output groups support a max of two system ids. Other
     *            group types support one system id. See
     *            https://dashif.org/identifiers/content_protection/ for more
     *            details.
     */
    public void setSystemIds(java.util.Collection<String> systemIds) {
        if (systemIds == null) {
            this.systemIds = null;
            return;
        }

        this.systemIds = new java.util.ArrayList<String>(systemIds);
    }

    /**
     * Relates to SPEKE implementation. DRM system identifiers. DASH output
     * groups support a max of two system ids. Other group types support one
     * system id. See https://dashif.org/identifiers/content_protection/ for
     * more details.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param systemIds Relates to SPEKE implementation. DRM system identifiers.
     *            DASH output groups support a max of two system ids. Other
     *            group types support one system id. See
     *            https://dashif.org/identifiers/content_protection/ for more
     *            details.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpekeKeyProvider withSystemIds(String... systemIds) {
        if (getSystemIds() == null) {
            this.systemIds = new java.util.ArrayList<String>(systemIds.length);
        }
        for (String value : systemIds) {
            this.systemIds.add(value);
        }
        return this;
    }

    /**
     * Relates to SPEKE implementation. DRM system identifiers. DASH output
     * groups support a max of two system ids. Other group types support one
     * system id. See https://dashif.org/identifiers/content_protection/ for
     * more details.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param systemIds Relates to SPEKE implementation. DRM system identifiers.
     *            DASH output groups support a max of two system ids. Other
     *            group types support one system id. See
     *            https://dashif.org/identifiers/content_protection/ for more
     *            details.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpekeKeyProvider withSystemIds(java.util.Collection<String> systemIds) {
        setSystemIds(systemIds);
        return this;
    }

    /**
     * Specify the URL to the key server that your SPEKE-compliant DRM key
     * provider uses to provide keys for encrypting your content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^https:\/\/<br/>
     *
     * @return Specify the URL to the key server that your SPEKE-compliant DRM
     *         key provider uses to provide keys for encrypting your content.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Specify the URL to the key server that your SPEKE-compliant DRM key
     * provider uses to provide keys for encrypting your content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^https:\/\/<br/>
     *
     * @param url Specify the URL to the key server that your SPEKE-compliant
     *            DRM key provider uses to provide keys for encrypting your
     *            content.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Specify the URL to the key server that your SPEKE-compliant DRM key
     * provider uses to provide keys for encrypting your content.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^https:\/\/<br/>
     *
     * @param url Specify the URL to the key server that your SPEKE-compliant
     *            DRM key provider uses to provide keys for encrypting your
     *            content.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpekeKeyProvider withUrl(String url) {
        this.url = url;
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: " + getCertificateArn() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getSystemIds() != null)
            sb.append("SystemIds: " + getSystemIds() + ",");
        if (getUrl() != null)
            sb.append("Url: " + getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getSystemIds() == null) ? 0 : getSystemIds().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpekeKeyProvider == false)
            return false;
        SpekeKeyProvider other = (SpekeKeyProvider) obj;

        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getSystemIds() == null ^ this.getSystemIds() == null)
            return false;
        if (other.getSystemIds() != null
                && other.getSystemIds().equals(this.getSystemIds()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }
}
