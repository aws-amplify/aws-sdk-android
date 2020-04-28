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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Network source to transcode. Must be accessible to the Elemental Live node
 * that is running the live event through a network connection.
 */
public class NetworkInputSettings implements Serializable {
    /**
     * Specifies HLS input settings when the uri is for a HLS manifest.
     */
    private HlsInputSettings hlsInputSettings;

    /**
     * Check HTTPS server certificates. When set to checkCryptographyOnly,
     * cryptography in the certificate will be checked, but not the server's
     * name. Certain subdomains (notably S3 buckets that use dots in the bucket
     * name) do not strictly match the corresponding certificate's wildcard
     * pattern and would otherwise cause the event to error. This setting is
     * ignored for protocols that do not use https.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME,
     * CHECK_CRYPTOGRAPHY_ONLY
     */
    private String serverValidation;

    /**
     * Specifies HLS input settings when the uri is for a HLS manifest.
     *
     * @return Specifies HLS input settings when the uri is for a HLS manifest.
     */
    public HlsInputSettings getHlsInputSettings() {
        return hlsInputSettings;
    }

    /**
     * Specifies HLS input settings when the uri is for a HLS manifest.
     *
     * @param hlsInputSettings Specifies HLS input settings when the uri is for
     *            a HLS manifest.
     */
    public void setHlsInputSettings(HlsInputSettings hlsInputSettings) {
        this.hlsInputSettings = hlsInputSettings;
    }

    /**
     * Specifies HLS input settings when the uri is for a HLS manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hlsInputSettings Specifies HLS input settings when the uri is for
     *            a HLS manifest.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NetworkInputSettings withHlsInputSettings(HlsInputSettings hlsInputSettings) {
        this.hlsInputSettings = hlsInputSettings;
        return this;
    }

    /**
     * Check HTTPS server certificates. When set to checkCryptographyOnly,
     * cryptography in the certificate will be checked, but not the server's
     * name. Certain subdomains (notably S3 buckets that use dots in the bucket
     * name) do not strictly match the corresponding certificate's wildcard
     * pattern and would otherwise cause the event to error. This setting is
     * ignored for protocols that do not use https.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME,
     * CHECK_CRYPTOGRAPHY_ONLY
     *
     * @return Check HTTPS server certificates. When set to
     *         checkCryptographyOnly, cryptography in the certificate will be
     *         checked, but not the server's name. Certain subdomains (notably
     *         S3 buckets that use dots in the bucket name) do not strictly
     *         match the corresponding certificate's wildcard pattern and would
     *         otherwise cause the event to error. This setting is ignored for
     *         protocols that do not use https.
     * @see NetworkInputServerValidation
     */
    public String getServerValidation() {
        return serverValidation;
    }

    /**
     * Check HTTPS server certificates. When set to checkCryptographyOnly,
     * cryptography in the certificate will be checked, but not the server's
     * name. Certain subdomains (notably S3 buckets that use dots in the bucket
     * name) do not strictly match the corresponding certificate's wildcard
     * pattern and would otherwise cause the event to error. This setting is
     * ignored for protocols that do not use https.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME,
     * CHECK_CRYPTOGRAPHY_ONLY
     *
     * @param serverValidation Check HTTPS server certificates. When set to
     *            checkCryptographyOnly, cryptography in the certificate will be
     *            checked, but not the server's name. Certain subdomains
     *            (notably S3 buckets that use dots in the bucket name) do not
     *            strictly match the corresponding certificate's wildcard
     *            pattern and would otherwise cause the event to error. This
     *            setting is ignored for protocols that do not use https.
     * @see NetworkInputServerValidation
     */
    public void setServerValidation(String serverValidation) {
        this.serverValidation = serverValidation;
    }

    /**
     * Check HTTPS server certificates. When set to checkCryptographyOnly,
     * cryptography in the certificate will be checked, but not the server's
     * name. Certain subdomains (notably S3 buckets that use dots in the bucket
     * name) do not strictly match the corresponding certificate's wildcard
     * pattern and would otherwise cause the event to error. This setting is
     * ignored for protocols that do not use https.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME,
     * CHECK_CRYPTOGRAPHY_ONLY
     *
     * @param serverValidation Check HTTPS server certificates. When set to
     *            checkCryptographyOnly, cryptography in the certificate will be
     *            checked, but not the server's name. Certain subdomains
     *            (notably S3 buckets that use dots in the bucket name) do not
     *            strictly match the corresponding certificate's wildcard
     *            pattern and would otherwise cause the event to error. This
     *            setting is ignored for protocols that do not use https.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkInputServerValidation
     */
    public NetworkInputSettings withServerValidation(String serverValidation) {
        this.serverValidation = serverValidation;
        return this;
    }

    /**
     * Check HTTPS server certificates. When set to checkCryptographyOnly,
     * cryptography in the certificate will be checked, but not the server's
     * name. Certain subdomains (notably S3 buckets that use dots in the bucket
     * name) do not strictly match the corresponding certificate's wildcard
     * pattern and would otherwise cause the event to error. This setting is
     * ignored for protocols that do not use https.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME,
     * CHECK_CRYPTOGRAPHY_ONLY
     *
     * @param serverValidation Check HTTPS server certificates. When set to
     *            checkCryptographyOnly, cryptography in the certificate will be
     *            checked, but not the server's name. Certain subdomains
     *            (notably S3 buckets that use dots in the bucket name) do not
     *            strictly match the corresponding certificate's wildcard
     *            pattern and would otherwise cause the event to error. This
     *            setting is ignored for protocols that do not use https.
     * @see NetworkInputServerValidation
     */
    public void setServerValidation(NetworkInputServerValidation serverValidation) {
        this.serverValidation = serverValidation.toString();
    }

    /**
     * Check HTTPS server certificates. When set to checkCryptographyOnly,
     * cryptography in the certificate will be checked, but not the server's
     * name. Certain subdomains (notably S3 buckets that use dots in the bucket
     * name) do not strictly match the corresponding certificate's wildcard
     * pattern and would otherwise cause the event to error. This setting is
     * ignored for protocols that do not use https.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHECK_CRYPTOGRAPHY_AND_VALIDATE_NAME,
     * CHECK_CRYPTOGRAPHY_ONLY
     *
     * @param serverValidation Check HTTPS server certificates. When set to
     *            checkCryptographyOnly, cryptography in the certificate will be
     *            checked, but not the server's name. Certain subdomains
     *            (notably S3 buckets that use dots in the bucket name) do not
     *            strictly match the corresponding certificate's wildcard
     *            pattern and would otherwise cause the event to error. This
     *            setting is ignored for protocols that do not use https.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkInputServerValidation
     */
    public NetworkInputSettings withServerValidation(NetworkInputServerValidation serverValidation) {
        this.serverValidation = serverValidation.toString();
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
        if (getHlsInputSettings() != null)
            sb.append("HlsInputSettings: " + getHlsInputSettings() + ",");
        if (getServerValidation() != null)
            sb.append("ServerValidation: " + getServerValidation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHlsInputSettings() == null) ? 0 : getHlsInputSettings().hashCode());
        hashCode = prime * hashCode
                + ((getServerValidation() == null) ? 0 : getServerValidation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInputSettings == false)
            return false;
        NetworkInputSettings other = (NetworkInputSettings) obj;

        if (other.getHlsInputSettings() == null ^ this.getHlsInputSettings() == null)
            return false;
        if (other.getHlsInputSettings() != null
                && other.getHlsInputSettings().equals(this.getHlsInputSettings()) == false)
            return false;
        if (other.getServerValidation() == null ^ this.getServerValidation() == null)
            return false;
        if (other.getServerValidation() != null
                && other.getServerValidation().equals(this.getServerValidation()) == false)
            return false;
        return true;
    }
}
