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
 * If your output group type is CMAF, use these settings when doing DRM
 * encryption with a SPEKE-compliant key provider. If your output group type is
 * HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider settings instead.
 */
public class SpekeKeyProviderCmaf implements Serializable {
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
     * Specify the DRM system IDs that you want signaled in the DASH manifest
     * that MediaConvert creates as part of this CMAF package. The DASH manifest
     * can currently signal up to three system IDs. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     */
    private java.util.List<String> dashSignaledSystemIds;

    /**
     * Specify the DRM system ID that you want signaled in the HLS manifest that
     * MediaConvert creates as part of this CMAF package. The HLS manifest can
     * currently signal only one system ID. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     */
    private java.util.List<String> hlsSignaledSystemIds;

    /**
     * Specify the resource ID that your SPEKE-compliant key provider uses to
     * identify this content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[\w-]+$<br/>
     */
    private String resourceId;

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
    public SpekeKeyProviderCmaf withCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
        return this;
    }

    /**
     * Specify the DRM system IDs that you want signaled in the DASH manifest
     * that MediaConvert creates as part of this CMAF package. The DASH manifest
     * can currently signal up to three system IDs. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     *
     * @return Specify the DRM system IDs that you want signaled in the DASH
     *         manifest that MediaConvert creates as part of this CMAF package.
     *         The DASH manifest can currently signal up to three system IDs.
     *         For more information, see
     *         https://dashif.org/identifiers/content_protection/.
     */
    public java.util.List<String> getDashSignaledSystemIds() {
        return dashSignaledSystemIds;
    }

    /**
     * Specify the DRM system IDs that you want signaled in the DASH manifest
     * that MediaConvert creates as part of this CMAF package. The DASH manifest
     * can currently signal up to three system IDs. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     *
     * @param dashSignaledSystemIds Specify the DRM system IDs that you want
     *            signaled in the DASH manifest that MediaConvert creates as
     *            part of this CMAF package. The DASH manifest can currently
     *            signal up to three system IDs. For more information, see
     *            https://dashif.org/identifiers/content_protection/.
     */
    public void setDashSignaledSystemIds(java.util.Collection<String> dashSignaledSystemIds) {
        if (dashSignaledSystemIds == null) {
            this.dashSignaledSystemIds = null;
            return;
        }

        this.dashSignaledSystemIds = new java.util.ArrayList<String>(dashSignaledSystemIds);
    }

    /**
     * Specify the DRM system IDs that you want signaled in the DASH manifest
     * that MediaConvert creates as part of this CMAF package. The DASH manifest
     * can currently signal up to three system IDs. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dashSignaledSystemIds Specify the DRM system IDs that you want
     *            signaled in the DASH manifest that MediaConvert creates as
     *            part of this CMAF package. The DASH manifest can currently
     *            signal up to three system IDs. For more information, see
     *            https://dashif.org/identifiers/content_protection/.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpekeKeyProviderCmaf withDashSignaledSystemIds(String... dashSignaledSystemIds) {
        if (getDashSignaledSystemIds() == null) {
            this.dashSignaledSystemIds = new java.util.ArrayList<String>(
                    dashSignaledSystemIds.length);
        }
        for (String value : dashSignaledSystemIds) {
            this.dashSignaledSystemIds.add(value);
        }
        return this;
    }

    /**
     * Specify the DRM system IDs that you want signaled in the DASH manifest
     * that MediaConvert creates as part of this CMAF package. The DASH manifest
     * can currently signal up to three system IDs. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dashSignaledSystemIds Specify the DRM system IDs that you want
     *            signaled in the DASH manifest that MediaConvert creates as
     *            part of this CMAF package. The DASH manifest can currently
     *            signal up to three system IDs. For more information, see
     *            https://dashif.org/identifiers/content_protection/.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpekeKeyProviderCmaf withDashSignaledSystemIds(
            java.util.Collection<String> dashSignaledSystemIds) {
        setDashSignaledSystemIds(dashSignaledSystemIds);
        return this;
    }

    /**
     * Specify the DRM system ID that you want signaled in the HLS manifest that
     * MediaConvert creates as part of this CMAF package. The HLS manifest can
     * currently signal only one system ID. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     *
     * @return Specify the DRM system ID that you want signaled in the HLS
     *         manifest that MediaConvert creates as part of this CMAF package.
     *         The HLS manifest can currently signal only one system ID. For
     *         more information, see
     *         https://dashif.org/identifiers/content_protection/.
     */
    public java.util.List<String> getHlsSignaledSystemIds() {
        return hlsSignaledSystemIds;
    }

    /**
     * Specify the DRM system ID that you want signaled in the HLS manifest that
     * MediaConvert creates as part of this CMAF package. The HLS manifest can
     * currently signal only one system ID. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     *
     * @param hlsSignaledSystemIds Specify the DRM system ID that you want
     *            signaled in the HLS manifest that MediaConvert creates as part
     *            of this CMAF package. The HLS manifest can currently signal
     *            only one system ID. For more information, see
     *            https://dashif.org/identifiers/content_protection/.
     */
    public void setHlsSignaledSystemIds(java.util.Collection<String> hlsSignaledSystemIds) {
        if (hlsSignaledSystemIds == null) {
            this.hlsSignaledSystemIds = null;
            return;
        }

        this.hlsSignaledSystemIds = new java.util.ArrayList<String>(hlsSignaledSystemIds);
    }

    /**
     * Specify the DRM system ID that you want signaled in the HLS manifest that
     * MediaConvert creates as part of this CMAF package. The HLS manifest can
     * currently signal only one system ID. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hlsSignaledSystemIds Specify the DRM system ID that you want
     *            signaled in the HLS manifest that MediaConvert creates as part
     *            of this CMAF package. The HLS manifest can currently signal
     *            only one system ID. For more information, see
     *            https://dashif.org/identifiers/content_protection/.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpekeKeyProviderCmaf withHlsSignaledSystemIds(String... hlsSignaledSystemIds) {
        if (getHlsSignaledSystemIds() == null) {
            this.hlsSignaledSystemIds = new java.util.ArrayList<String>(hlsSignaledSystemIds.length);
        }
        for (String value : hlsSignaledSystemIds) {
            this.hlsSignaledSystemIds.add(value);
        }
        return this;
    }

    /**
     * Specify the DRM system ID that you want signaled in the HLS manifest that
     * MediaConvert creates as part of this CMAF package. The HLS manifest can
     * currently signal only one system ID. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hlsSignaledSystemIds Specify the DRM system ID that you want
     *            signaled in the HLS manifest that MediaConvert creates as part
     *            of this CMAF package. The HLS manifest can currently signal
     *            only one system ID. For more information, see
     *            https://dashif.org/identifiers/content_protection/.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpekeKeyProviderCmaf withHlsSignaledSystemIds(
            java.util.Collection<String> hlsSignaledSystemIds) {
        setHlsSignaledSystemIds(hlsSignaledSystemIds);
        return this;
    }

    /**
     * Specify the resource ID that your SPEKE-compliant key provider uses to
     * identify this content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[\w-]+$<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[\w-]+$<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[\w-]+$<br/>
     *
     * @param resourceId Specify the resource ID that your SPEKE-compliant key
     *            provider uses to identify this content.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpekeKeyProviderCmaf withResourceId(String resourceId) {
        this.resourceId = resourceId;
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
    public SpekeKeyProviderCmaf withUrl(String url) {
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
        if (getDashSignaledSystemIds() != null)
            sb.append("DashSignaledSystemIds: " + getDashSignaledSystemIds() + ",");
        if (getHlsSignaledSystemIds() != null)
            sb.append("HlsSignaledSystemIds: " + getHlsSignaledSystemIds() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
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
        hashCode = prime
                * hashCode
                + ((getDashSignaledSystemIds() == null) ? 0 : getDashSignaledSystemIds().hashCode());
        hashCode = prime * hashCode
                + ((getHlsSignaledSystemIds() == null) ? 0 : getHlsSignaledSystemIds().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpekeKeyProviderCmaf == false)
            return false;
        SpekeKeyProviderCmaf other = (SpekeKeyProviderCmaf) obj;

        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getDashSignaledSystemIds() == null ^ this.getDashSignaledSystemIds() == null)
            return false;
        if (other.getDashSignaledSystemIds() != null
                && other.getDashSignaledSystemIds().equals(this.getDashSignaledSystemIds()) == false)
            return false;
        if (other.getHlsSignaledSystemIds() == null ^ this.getHlsSignaledSystemIds() == null)
            return false;
        if (other.getHlsSignaledSystemIds() != null
                && other.getHlsSignaledSystemIds().equals(this.getHlsSignaledSystemIds()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }
}
