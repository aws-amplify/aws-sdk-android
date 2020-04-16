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
 * Specifies DRM settings for DASH outputs.
 */
public class DashIsoEncryptionSettings implements Serializable {
    /**
     * This setting can improve the compatibility of your output with video
     * players on obsolete devices. It applies only to DASH H.264 outputs with
     * DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct
     * problems with playback on older devices. Otherwise, keep the default
     * setting CENC v1 (CENC_V1). If you choose Unencrypted SEI, for that
     * output, the service will exclude the access unit delimiter and will leave
     * the SEI NAL units unencrypted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CENC_V1, UNENCRYPTED_SEI
     */
    private String playbackDeviceCompatibility;

    /**
     * If your output group type is HLS, DASH, or Microsoft Smooth, use these
     * settings when doing DRM encryption with a SPEKE-compliant key provider.
     * If your output group type is CMAF, use the SpekeKeyProviderCmaf settings
     * instead.
     */
    private SpekeKeyProvider spekeKeyProvider;

    /**
     * This setting can improve the compatibility of your output with video
     * players on obsolete devices. It applies only to DASH H.264 outputs with
     * DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct
     * problems with playback on older devices. Otherwise, keep the default
     * setting CENC v1 (CENC_V1). If you choose Unencrypted SEI, for that
     * output, the service will exclude the access unit delimiter and will leave
     * the SEI NAL units unencrypted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CENC_V1, UNENCRYPTED_SEI
     *
     * @return This setting can improve the compatibility of your output with
     *         video players on obsolete devices. It applies only to DASH H.264
     *         outputs with DRM encryption. Choose Unencrypted SEI
     *         (UNENCRYPTED_SEI) only to correct problems with playback on older
     *         devices. Otherwise, keep the default setting CENC v1 (CENC_V1).
     *         If you choose Unencrypted SEI, for that output, the service will
     *         exclude the access unit delimiter and will leave the SEI NAL
     *         units unencrypted.
     * @see DashIsoPlaybackDeviceCompatibility
     */
    public String getPlaybackDeviceCompatibility() {
        return playbackDeviceCompatibility;
    }

    /**
     * This setting can improve the compatibility of your output with video
     * players on obsolete devices. It applies only to DASH H.264 outputs with
     * DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct
     * problems with playback on older devices. Otherwise, keep the default
     * setting CENC v1 (CENC_V1). If you choose Unencrypted SEI, for that
     * output, the service will exclude the access unit delimiter and will leave
     * the SEI NAL units unencrypted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CENC_V1, UNENCRYPTED_SEI
     *
     * @param playbackDeviceCompatibility This setting can improve the
     *            compatibility of your output with video players on obsolete
     *            devices. It applies only to DASH H.264 outputs with DRM
     *            encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to
     *            correct problems with playback on older devices. Otherwise,
     *            keep the default setting CENC v1 (CENC_V1). If you choose
     *            Unencrypted SEI, for that output, the service will exclude the
     *            access unit delimiter and will leave the SEI NAL units
     *            unencrypted.
     * @see DashIsoPlaybackDeviceCompatibility
     */
    public void setPlaybackDeviceCompatibility(String playbackDeviceCompatibility) {
        this.playbackDeviceCompatibility = playbackDeviceCompatibility;
    }

    /**
     * This setting can improve the compatibility of your output with video
     * players on obsolete devices. It applies only to DASH H.264 outputs with
     * DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct
     * problems with playback on older devices. Otherwise, keep the default
     * setting CENC v1 (CENC_V1). If you choose Unencrypted SEI, for that
     * output, the service will exclude the access unit delimiter and will leave
     * the SEI NAL units unencrypted.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CENC_V1, UNENCRYPTED_SEI
     *
     * @param playbackDeviceCompatibility This setting can improve the
     *            compatibility of your output with video players on obsolete
     *            devices. It applies only to DASH H.264 outputs with DRM
     *            encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to
     *            correct problems with playback on older devices. Otherwise,
     *            keep the default setting CENC v1 (CENC_V1). If you choose
     *            Unencrypted SEI, for that output, the service will exclude the
     *            access unit delimiter and will leave the SEI NAL units
     *            unencrypted.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DashIsoPlaybackDeviceCompatibility
     */
    public DashIsoEncryptionSettings withPlaybackDeviceCompatibility(
            String playbackDeviceCompatibility) {
        this.playbackDeviceCompatibility = playbackDeviceCompatibility;
        return this;
    }

    /**
     * This setting can improve the compatibility of your output with video
     * players on obsolete devices. It applies only to DASH H.264 outputs with
     * DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct
     * problems with playback on older devices. Otherwise, keep the default
     * setting CENC v1 (CENC_V1). If you choose Unencrypted SEI, for that
     * output, the service will exclude the access unit delimiter and will leave
     * the SEI NAL units unencrypted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CENC_V1, UNENCRYPTED_SEI
     *
     * @param playbackDeviceCompatibility This setting can improve the
     *            compatibility of your output with video players on obsolete
     *            devices. It applies only to DASH H.264 outputs with DRM
     *            encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to
     *            correct problems with playback on older devices. Otherwise,
     *            keep the default setting CENC v1 (CENC_V1). If you choose
     *            Unencrypted SEI, for that output, the service will exclude the
     *            access unit delimiter and will leave the SEI NAL units
     *            unencrypted.
     * @see DashIsoPlaybackDeviceCompatibility
     */
    public void setPlaybackDeviceCompatibility(
            DashIsoPlaybackDeviceCompatibility playbackDeviceCompatibility) {
        this.playbackDeviceCompatibility = playbackDeviceCompatibility.toString();
    }

    /**
     * This setting can improve the compatibility of your output with video
     * players on obsolete devices. It applies only to DASH H.264 outputs with
     * DRM encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to correct
     * problems with playback on older devices. Otherwise, keep the default
     * setting CENC v1 (CENC_V1). If you choose Unencrypted SEI, for that
     * output, the service will exclude the access unit delimiter and will leave
     * the SEI NAL units unencrypted.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CENC_V1, UNENCRYPTED_SEI
     *
     * @param playbackDeviceCompatibility This setting can improve the
     *            compatibility of your output with video players on obsolete
     *            devices. It applies only to DASH H.264 outputs with DRM
     *            encryption. Choose Unencrypted SEI (UNENCRYPTED_SEI) only to
     *            correct problems with playback on older devices. Otherwise,
     *            keep the default setting CENC v1 (CENC_V1). If you choose
     *            Unencrypted SEI, for that output, the service will exclude the
     *            access unit delimiter and will leave the SEI NAL units
     *            unencrypted.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DashIsoPlaybackDeviceCompatibility
     */
    public DashIsoEncryptionSettings withPlaybackDeviceCompatibility(
            DashIsoPlaybackDeviceCompatibility playbackDeviceCompatibility) {
        this.playbackDeviceCompatibility = playbackDeviceCompatibility.toString();
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
    public DashIsoEncryptionSettings withSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = spekeKeyProvider;
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
        if (getPlaybackDeviceCompatibility() != null)
            sb.append("PlaybackDeviceCompatibility: " + getPlaybackDeviceCompatibility() + ",");
        if (getSpekeKeyProvider() != null)
            sb.append("SpekeKeyProvider: " + getSpekeKeyProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPlaybackDeviceCompatibility() == null) ? 0
                        : getPlaybackDeviceCompatibility().hashCode());
        hashCode = prime * hashCode
                + ((getSpekeKeyProvider() == null) ? 0 : getSpekeKeyProvider().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashIsoEncryptionSettings == false)
            return false;
        DashIsoEncryptionSettings other = (DashIsoEncryptionSettings) obj;

        if (other.getPlaybackDeviceCompatibility() == null
                ^ this.getPlaybackDeviceCompatibility() == null)
            return false;
        if (other.getPlaybackDeviceCompatibility() != null
                && other.getPlaybackDeviceCompatibility().equals(
                        this.getPlaybackDeviceCompatibility()) == false)
            return false;
        if (other.getSpekeKeyProvider() == null ^ this.getSpekeKeyProvider() == null)
            return false;
        if (other.getSpekeKeyProvider() != null
                && other.getSpekeKeyProvider().equals(this.getSpekeKeyProvider()) == false)
            return false;
        return true;
    }
}
