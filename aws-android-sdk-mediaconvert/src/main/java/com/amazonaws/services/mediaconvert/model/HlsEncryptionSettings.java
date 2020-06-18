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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Settings for HLS encryption
 */
public class HlsEncryptionSettings implements Serializable {
    /**
     * This is a 128-bit, 16-byte hex value represented by a 32-character text
     * string. If this parameter is not set then the Initialization Vector will
     * follow the segment number by default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 32<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{32}$<br/>
     */
    private String constantInitializationVector;

    /**
     * Encrypts the segments with the given encryption scheme. Leave blank to
     * disable. Selecting 'Disabled' in the web interface also disables
     * encryption.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES128, SAMPLE_AES
     */
    private String encryptionMethod;

    /**
     * The Initialization Vector is a 128-bit number used in conjunction with
     * the key for encrypting blocks. If set to INCLUDE, Initialization Vector
     * is listed in the manifest. Otherwise Initialization Vector is not in the
     * manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     */
    private String initializationVectorInManifest;

    /**
     * Enable this setting to insert the EXT-X-SESSION-KEY element into the
     * master playlist. This allows for offline Apple HLS FairPlay content
     * protection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String offlineEncrypted;

    /**
     * If your output group type is HLS, DASH, or Microsoft Smooth, use these
     * settings when doing DRM encryption with a SPEKE-compliant key provider.
     * If your output group type is CMAF, use the SpekeKeyProviderCmaf settings
     * instead.
     */
    private SpekeKeyProvider spekeKeyProvider;

    /**
     * Use these settings to set up encryption with a static key provider.
     */
    private StaticKeyProvider staticKeyProvider;

    /**
     * Specify whether your DRM encryption key is static or from a key provider
     * that follows the SPEKE standard. For more information about SPEKE, see
     * https
     * ://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SPEKE, STATIC_KEY
     */
    private String type;

    /**
     * This is a 128-bit, 16-byte hex value represented by a 32-character text
     * string. If this parameter is not set then the Initialization Vector will
     * follow the segment number by default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 32<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{32}$<br/>
     *
     * @return This is a 128-bit, 16-byte hex value represented by a
     *         32-character text string. If this parameter is not set then the
     *         Initialization Vector will follow the segment number by default.
     */
    public String getConstantInitializationVector() {
        return constantInitializationVector;
    }

    /**
     * This is a 128-bit, 16-byte hex value represented by a 32-character text
     * string. If this parameter is not set then the Initialization Vector will
     * follow the segment number by default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 32<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{32}$<br/>
     *
     * @param constantInitializationVector This is a 128-bit, 16-byte hex value
     *            represented by a 32-character text string. If this parameter
     *            is not set then the Initialization Vector will follow the
     *            segment number by default.
     */
    public void setConstantInitializationVector(String constantInitializationVector) {
        this.constantInitializationVector = constantInitializationVector;
    }

    /**
     * This is a 128-bit, 16-byte hex value represented by a 32-character text
     * string. If this parameter is not set then the Initialization Vector will
     * follow the segment number by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 32<br/>
     * <b>Pattern: </b>^[0-9a-fA-F]{32}$<br/>
     *
     * @param constantInitializationVector This is a 128-bit, 16-byte hex value
     *            represented by a 32-character text string. If this parameter
     *            is not set then the Initialization Vector will follow the
     *            segment number by default.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsEncryptionSettings withConstantInitializationVector(
            String constantInitializationVector) {
        this.constantInitializationVector = constantInitializationVector;
        return this;
    }

    /**
     * Encrypts the segments with the given encryption scheme. Leave blank to
     * disable. Selecting 'Disabled' in the web interface also disables
     * encryption.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES128, SAMPLE_AES
     *
     * @return Encrypts the segments with the given encryption scheme. Leave
     *         blank to disable. Selecting 'Disabled' in the web interface also
     *         disables encryption.
     * @see HlsEncryptionType
     */
    public String getEncryptionMethod() {
        return encryptionMethod;
    }

    /**
     * Encrypts the segments with the given encryption scheme. Leave blank to
     * disable. Selecting 'Disabled' in the web interface also disables
     * encryption.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES128, SAMPLE_AES
     *
     * @param encryptionMethod Encrypts the segments with the given encryption
     *            scheme. Leave blank to disable. Selecting 'Disabled' in the
     *            web interface also disables encryption.
     * @see HlsEncryptionType
     */
    public void setEncryptionMethod(String encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
    }

    /**
     * Encrypts the segments with the given encryption scheme. Leave blank to
     * disable. Selecting 'Disabled' in the web interface also disables
     * encryption.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES128, SAMPLE_AES
     *
     * @param encryptionMethod Encrypts the segments with the given encryption
     *            scheme. Leave blank to disable. Selecting 'Disabled' in the
     *            web interface also disables encryption.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsEncryptionType
     */
    public HlsEncryptionSettings withEncryptionMethod(String encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
        return this;
    }

    /**
     * Encrypts the segments with the given encryption scheme. Leave blank to
     * disable. Selecting 'Disabled' in the web interface also disables
     * encryption.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES128, SAMPLE_AES
     *
     * @param encryptionMethod Encrypts the segments with the given encryption
     *            scheme. Leave blank to disable. Selecting 'Disabled' in the
     *            web interface also disables encryption.
     * @see HlsEncryptionType
     */
    public void setEncryptionMethod(HlsEncryptionType encryptionMethod) {
        this.encryptionMethod = encryptionMethod.toString();
    }

    /**
     * Encrypts the segments with the given encryption scheme. Leave blank to
     * disable. Selecting 'Disabled' in the web interface also disables
     * encryption.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES128, SAMPLE_AES
     *
     * @param encryptionMethod Encrypts the segments with the given encryption
     *            scheme. Leave blank to disable. Selecting 'Disabled' in the
     *            web interface also disables encryption.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsEncryptionType
     */
    public HlsEncryptionSettings withEncryptionMethod(HlsEncryptionType encryptionMethod) {
        this.encryptionMethod = encryptionMethod.toString();
        return this;
    }

    /**
     * The Initialization Vector is a 128-bit number used in conjunction with
     * the key for encrypting blocks. If set to INCLUDE, Initialization Vector
     * is listed in the manifest. Otherwise Initialization Vector is not in the
     * manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @return The Initialization Vector is a 128-bit number used in conjunction
     *         with the key for encrypting blocks. If set to INCLUDE,
     *         Initialization Vector is listed in the manifest. Otherwise
     *         Initialization Vector is not in the manifest.
     * @see HlsInitializationVectorInManifest
     */
    public String getInitializationVectorInManifest() {
        return initializationVectorInManifest;
    }

    /**
     * The Initialization Vector is a 128-bit number used in conjunction with
     * the key for encrypting blocks. If set to INCLUDE, Initialization Vector
     * is listed in the manifest. Otherwise Initialization Vector is not in the
     * manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param initializationVectorInManifest The Initialization Vector is a
     *            128-bit number used in conjunction with the key for encrypting
     *            blocks. If set to INCLUDE, Initialization Vector is listed in
     *            the manifest. Otherwise Initialization Vector is not in the
     *            manifest.
     * @see HlsInitializationVectorInManifest
     */
    public void setInitializationVectorInManifest(String initializationVectorInManifest) {
        this.initializationVectorInManifest = initializationVectorInManifest;
    }

    /**
     * The Initialization Vector is a 128-bit number used in conjunction with
     * the key for encrypting blocks. If set to INCLUDE, Initialization Vector
     * is listed in the manifest. Otherwise Initialization Vector is not in the
     * manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param initializationVectorInManifest The Initialization Vector is a
     *            128-bit number used in conjunction with the key for encrypting
     *            blocks. If set to INCLUDE, Initialization Vector is listed in
     *            the manifest. Otherwise Initialization Vector is not in the
     *            manifest.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsInitializationVectorInManifest
     */
    public HlsEncryptionSettings withInitializationVectorInManifest(
            String initializationVectorInManifest) {
        this.initializationVectorInManifest = initializationVectorInManifest;
        return this;
    }

    /**
     * The Initialization Vector is a 128-bit number used in conjunction with
     * the key for encrypting blocks. If set to INCLUDE, Initialization Vector
     * is listed in the manifest. Otherwise Initialization Vector is not in the
     * manifest.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param initializationVectorInManifest The Initialization Vector is a
     *            128-bit number used in conjunction with the key for encrypting
     *            blocks. If set to INCLUDE, Initialization Vector is listed in
     *            the manifest. Otherwise Initialization Vector is not in the
     *            manifest.
     * @see HlsInitializationVectorInManifest
     */
    public void setInitializationVectorInManifest(
            HlsInitializationVectorInManifest initializationVectorInManifest) {
        this.initializationVectorInManifest = initializationVectorInManifest.toString();
    }

    /**
     * The Initialization Vector is a 128-bit number used in conjunction with
     * the key for encrypting blocks. If set to INCLUDE, Initialization Vector
     * is listed in the manifest. Otherwise Initialization Vector is not in the
     * manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param initializationVectorInManifest The Initialization Vector is a
     *            128-bit number used in conjunction with the key for encrypting
     *            blocks. If set to INCLUDE, Initialization Vector is listed in
     *            the manifest. Otherwise Initialization Vector is not in the
     *            manifest.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsInitializationVectorInManifest
     */
    public HlsEncryptionSettings withInitializationVectorInManifest(
            HlsInitializationVectorInManifest initializationVectorInManifest) {
        this.initializationVectorInManifest = initializationVectorInManifest.toString();
        return this;
    }

    /**
     * Enable this setting to insert the EXT-X-SESSION-KEY element into the
     * master playlist. This allows for offline Apple HLS FairPlay content
     * protection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return Enable this setting to insert the EXT-X-SESSION-KEY element into
     *         the master playlist. This allows for offline Apple HLS FairPlay
     *         content protection.
     * @see HlsOfflineEncrypted
     */
    public String getOfflineEncrypted() {
        return offlineEncrypted;
    }

    /**
     * Enable this setting to insert the EXT-X-SESSION-KEY element into the
     * master playlist. This allows for offline Apple HLS FairPlay content
     * protection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param offlineEncrypted Enable this setting to insert the
     *            EXT-X-SESSION-KEY element into the master playlist. This
     *            allows for offline Apple HLS FairPlay content protection.
     * @see HlsOfflineEncrypted
     */
    public void setOfflineEncrypted(String offlineEncrypted) {
        this.offlineEncrypted = offlineEncrypted;
    }

    /**
     * Enable this setting to insert the EXT-X-SESSION-KEY element into the
     * master playlist. This allows for offline Apple HLS FairPlay content
     * protection.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param offlineEncrypted Enable this setting to insert the
     *            EXT-X-SESSION-KEY element into the master playlist. This
     *            allows for offline Apple HLS FairPlay content protection.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsOfflineEncrypted
     */
    public HlsEncryptionSettings withOfflineEncrypted(String offlineEncrypted) {
        this.offlineEncrypted = offlineEncrypted;
        return this;
    }

    /**
     * Enable this setting to insert the EXT-X-SESSION-KEY element into the
     * master playlist. This allows for offline Apple HLS FairPlay content
     * protection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param offlineEncrypted Enable this setting to insert the
     *            EXT-X-SESSION-KEY element into the master playlist. This
     *            allows for offline Apple HLS FairPlay content protection.
     * @see HlsOfflineEncrypted
     */
    public void setOfflineEncrypted(HlsOfflineEncrypted offlineEncrypted) {
        this.offlineEncrypted = offlineEncrypted.toString();
    }

    /**
     * Enable this setting to insert the EXT-X-SESSION-KEY element into the
     * master playlist. This allows for offline Apple HLS FairPlay content
     * protection.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param offlineEncrypted Enable this setting to insert the
     *            EXT-X-SESSION-KEY element into the master playlist. This
     *            allows for offline Apple HLS FairPlay content protection.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsOfflineEncrypted
     */
    public HlsEncryptionSettings withOfflineEncrypted(HlsOfflineEncrypted offlineEncrypted) {
        this.offlineEncrypted = offlineEncrypted.toString();
        return this;
    }

    /**
     * If your output group type is HLS, DASH, or Microsoft Smooth, use these
     * settings when doing DRM encryption with a SPEKE-compliant key provider.
     * If your output group type is CMAF, use the SpekeKeyProviderCmaf settings
     * instead.
     *
     * @return If your output group type is HLS, DASH, or Microsoft Smooth, use
     *         these settings when doing DRM encryption with a SPEKE-compliant
     *         key provider. If your output group type is CMAF, use the
     *         SpekeKeyProviderCmaf settings instead.
     */
    public SpekeKeyProvider getSpekeKeyProvider() {
        return spekeKeyProvider;
    }

    /**
     * If your output group type is HLS, DASH, or Microsoft Smooth, use these
     * settings when doing DRM encryption with a SPEKE-compliant key provider.
     * If your output group type is CMAF, use the SpekeKeyProviderCmaf settings
     * instead.
     *
     * @param spekeKeyProvider If your output group type is HLS, DASH, or
     *            Microsoft Smooth, use these settings when doing DRM encryption
     *            with a SPEKE-compliant key provider. If your output group type
     *            is CMAF, use the SpekeKeyProviderCmaf settings instead.
     */
    public void setSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = spekeKeyProvider;
    }

    /**
     * If your output group type is HLS, DASH, or Microsoft Smooth, use these
     * settings when doing DRM encryption with a SPEKE-compliant key provider.
     * If your output group type is CMAF, use the SpekeKeyProviderCmaf settings
     * instead.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spekeKeyProvider If your output group type is HLS, DASH, or
     *            Microsoft Smooth, use these settings when doing DRM encryption
     *            with a SPEKE-compliant key provider. If your output group type
     *            is CMAF, use the SpekeKeyProviderCmaf settings instead.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsEncryptionSettings withSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = spekeKeyProvider;
        return this;
    }

    /**
     * Use these settings to set up encryption with a static key provider.
     *
     * @return Use these settings to set up encryption with a static key
     *         provider.
     */
    public StaticKeyProvider getStaticKeyProvider() {
        return staticKeyProvider;
    }

    /**
     * Use these settings to set up encryption with a static key provider.
     *
     * @param staticKeyProvider Use these settings to set up encryption with a
     *            static key provider.
     */
    public void setStaticKeyProvider(StaticKeyProvider staticKeyProvider) {
        this.staticKeyProvider = staticKeyProvider;
    }

    /**
     * Use these settings to set up encryption with a static key provider.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param staticKeyProvider Use these settings to set up encryption with a
     *            static key provider.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsEncryptionSettings withStaticKeyProvider(StaticKeyProvider staticKeyProvider) {
        this.staticKeyProvider = staticKeyProvider;
        return this;
    }

    /**
     * Specify whether your DRM encryption key is static or from a key provider
     * that follows the SPEKE standard. For more information about SPEKE, see
     * https
     * ://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SPEKE, STATIC_KEY
     *
     * @return Specify whether your DRM encryption key is static or from a key
     *         provider that follows the SPEKE standard. For more information
     *         about SPEKE, see
     *         https://docs.aws.amazon.com/speke/latest/documentation
     *         /what-is-speke.html.
     * @see HlsKeyProviderType
     */
    public String getType() {
        return type;
    }

    /**
     * Specify whether your DRM encryption key is static or from a key provider
     * that follows the SPEKE standard. For more information about SPEKE, see
     * https
     * ://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SPEKE, STATIC_KEY
     *
     * @param type Specify whether your DRM encryption key is static or from a
     *            key provider that follows the SPEKE standard. For more
     *            information about SPEKE, see
     *            https://docs.aws.amazon.com/speke/
     *            latest/documentation/what-is-speke.html.
     * @see HlsKeyProviderType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Specify whether your DRM encryption key is static or from a key provider
     * that follows the SPEKE standard. For more information about SPEKE, see
     * https
     * ://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SPEKE, STATIC_KEY
     *
     * @param type Specify whether your DRM encryption key is static or from a
     *            key provider that follows the SPEKE standard. For more
     *            information about SPEKE, see
     *            https://docs.aws.amazon.com/speke/
     *            latest/documentation/what-is-speke.html.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsKeyProviderType
     */
    public HlsEncryptionSettings withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Specify whether your DRM encryption key is static or from a key provider
     * that follows the SPEKE standard. For more information about SPEKE, see
     * https
     * ://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SPEKE, STATIC_KEY
     *
     * @param type Specify whether your DRM encryption key is static or from a
     *            key provider that follows the SPEKE standard. For more
     *            information about SPEKE, see
     *            https://docs.aws.amazon.com/speke/
     *            latest/documentation/what-is-speke.html.
     * @see HlsKeyProviderType
     */
    public void setType(HlsKeyProviderType type) {
        this.type = type.toString();
    }

    /**
     * Specify whether your DRM encryption key is static or from a key provider
     * that follows the SPEKE standard. For more information about SPEKE, see
     * https
     * ://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SPEKE, STATIC_KEY
     *
     * @param type Specify whether your DRM encryption key is static or from a
     *            key provider that follows the SPEKE standard. For more
     *            information about SPEKE, see
     *            https://docs.aws.amazon.com/speke/
     *            latest/documentation/what-is-speke.html.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HlsKeyProviderType
     */
    public HlsEncryptionSettings withType(HlsKeyProviderType type) {
        this.type = type.toString();
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
        if (getConstantInitializationVector() != null)
            sb.append("ConstantInitializationVector: " + getConstantInitializationVector() + ",");
        if (getEncryptionMethod() != null)
            sb.append("EncryptionMethod: " + getEncryptionMethod() + ",");
        if (getInitializationVectorInManifest() != null)
            sb.append("InitializationVectorInManifest: " + getInitializationVectorInManifest()
                    + ",");
        if (getOfflineEncrypted() != null)
            sb.append("OfflineEncrypted: " + getOfflineEncrypted() + ",");
        if (getSpekeKeyProvider() != null)
            sb.append("SpekeKeyProvider: " + getSpekeKeyProvider() + ",");
        if (getStaticKeyProvider() != null)
            sb.append("StaticKeyProvider: " + getStaticKeyProvider() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getConstantInitializationVector() == null) ? 0
                        : getConstantInitializationVector().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionMethod() == null) ? 0 : getEncryptionMethod().hashCode());
        hashCode = prime
                * hashCode
                + ((getInitializationVectorInManifest() == null) ? 0
                        : getInitializationVectorInManifest().hashCode());
        hashCode = prime * hashCode
                + ((getOfflineEncrypted() == null) ? 0 : getOfflineEncrypted().hashCode());
        hashCode = prime * hashCode
                + ((getSpekeKeyProvider() == null) ? 0 : getSpekeKeyProvider().hashCode());
        hashCode = prime * hashCode
                + ((getStaticKeyProvider() == null) ? 0 : getStaticKeyProvider().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsEncryptionSettings == false)
            return false;
        HlsEncryptionSettings other = (HlsEncryptionSettings) obj;

        if (other.getConstantInitializationVector() == null
                ^ this.getConstantInitializationVector() == null)
            return false;
        if (other.getConstantInitializationVector() != null
                && other.getConstantInitializationVector().equals(
                        this.getConstantInitializationVector()) == false)
            return false;
        if (other.getEncryptionMethod() == null ^ this.getEncryptionMethod() == null)
            return false;
        if (other.getEncryptionMethod() != null
                && other.getEncryptionMethod().equals(this.getEncryptionMethod()) == false)
            return false;
        if (other.getInitializationVectorInManifest() == null
                ^ this.getInitializationVectorInManifest() == null)
            return false;
        if (other.getInitializationVectorInManifest() != null
                && other.getInitializationVectorInManifest().equals(
                        this.getInitializationVectorInManifest()) == false)
            return false;
        if (other.getOfflineEncrypted() == null ^ this.getOfflineEncrypted() == null)
            return false;
        if (other.getOfflineEncrypted() != null
                && other.getOfflineEncrypted().equals(this.getOfflineEncrypted()) == false)
            return false;
        if (other.getSpekeKeyProvider() == null ^ this.getSpekeKeyProvider() == null)
            return false;
        if (other.getSpekeKeyProvider() != null
                && other.getSpekeKeyProvider().equals(this.getSpekeKeyProvider()) == false)
            return false;
        if (other.getStaticKeyProvider() == null ^ this.getStaticKeyProvider() == null)
            return false;
        if (other.getStaticKeyProvider() != null
                && other.getStaticKeyProvider().equals(this.getStaticKeyProvider()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
