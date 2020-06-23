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

package com.amazonaws.services.api.mediatailor.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration for DASH PUT operations.
 * </p>
 */
public class DashConfigurationForPut implements Serializable {
    /**
     * <p>
     * The setting that controls whether MediaTailor includes the Location tag
     * in DASH manifests. MediaTailor populates the Location tag with the URL
     * for manifest update requests, to be used by players that don't support
     * sticky redirects. Disable this if you have CDN routing rules set up for
     * accessing MediaTailor manifests, and you are either using client-side
     * reporting or your players support sticky HTTP redirects. Valid values are
     * DISABLED and EMT_DEFAULT. The EMT_DEFAULT setting enables the inclusion
     * of the tag and is the default value.
     * </p>
     */
    private String mpdLocation;

    /**
     * <p>
     * The setting that controls whether MediaTailor handles manifests from the
     * origin server as multi-period manifests or single-period manifests. If
     * your origin server produces single-period manifests, set this to
     * SINGLE_PERIOD. The default setting is MULTI_PERIOD. For multi-period
     * manifests, omit this setting or set it to MULTI_PERIOD.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PERIOD, MULTI_PERIOD
     */
    private String originManifestType;

    /**
     * <p>
     * The setting that controls whether MediaTailor includes the Location tag
     * in DASH manifests. MediaTailor populates the Location tag with the URL
     * for manifest update requests, to be used by players that don't support
     * sticky redirects. Disable this if you have CDN routing rules set up for
     * accessing MediaTailor manifests, and you are either using client-side
     * reporting or your players support sticky HTTP redirects. Valid values are
     * DISABLED and EMT_DEFAULT. The EMT_DEFAULT setting enables the inclusion
     * of the tag and is the default value.
     * </p>
     *
     * @return <p>
     *         The setting that controls whether MediaTailor includes the
     *         Location tag in DASH manifests. MediaTailor populates the
     *         Location tag with the URL for manifest update requests, to be
     *         used by players that don't support sticky redirects. Disable this
     *         if you have CDN routing rules set up for accessing MediaTailor
     *         manifests, and you are either using client-side reporting or your
     *         players support sticky HTTP redirects. Valid values are DISABLED
     *         and EMT_DEFAULT. The EMT_DEFAULT setting enables the inclusion of
     *         the tag and is the default value.
     *         </p>
     */
    public String getMpdLocation() {
        return mpdLocation;
    }

    /**
     * <p>
     * The setting that controls whether MediaTailor includes the Location tag
     * in DASH manifests. MediaTailor populates the Location tag with the URL
     * for manifest update requests, to be used by players that don't support
     * sticky redirects. Disable this if you have CDN routing rules set up for
     * accessing MediaTailor manifests, and you are either using client-side
     * reporting or your players support sticky HTTP redirects. Valid values are
     * DISABLED and EMT_DEFAULT. The EMT_DEFAULT setting enables the inclusion
     * of the tag and is the default value.
     * </p>
     *
     * @param mpdLocation <p>
     *            The setting that controls whether MediaTailor includes the
     *            Location tag in DASH manifests. MediaTailor populates the
     *            Location tag with the URL for manifest update requests, to be
     *            used by players that don't support sticky redirects. Disable
     *            this if you have CDN routing rules set up for accessing
     *            MediaTailor manifests, and you are either using client-side
     *            reporting or your players support sticky HTTP redirects. Valid
     *            values are DISABLED and EMT_DEFAULT. The EMT_DEFAULT setting
     *            enables the inclusion of the tag and is the default value.
     *            </p>
     */
    public void setMpdLocation(String mpdLocation) {
        this.mpdLocation = mpdLocation;
    }

    /**
     * <p>
     * The setting that controls whether MediaTailor includes the Location tag
     * in DASH manifests. MediaTailor populates the Location tag with the URL
     * for manifest update requests, to be used by players that don't support
     * sticky redirects. Disable this if you have CDN routing rules set up for
     * accessing MediaTailor manifests, and you are either using client-side
     * reporting or your players support sticky HTTP redirects. Valid values are
     * DISABLED and EMT_DEFAULT. The EMT_DEFAULT setting enables the inclusion
     * of the tag and is the default value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mpdLocation <p>
     *            The setting that controls whether MediaTailor includes the
     *            Location tag in DASH manifests. MediaTailor populates the
     *            Location tag with the URL for manifest update requests, to be
     *            used by players that don't support sticky redirects. Disable
     *            this if you have CDN routing rules set up for accessing
     *            MediaTailor manifests, and you are either using client-side
     *            reporting or your players support sticky HTTP redirects. Valid
     *            values are DISABLED and EMT_DEFAULT. The EMT_DEFAULT setting
     *            enables the inclusion of the tag and is the default value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DashConfigurationForPut withMpdLocation(String mpdLocation) {
        this.mpdLocation = mpdLocation;
        return this;
    }

    /**
     * <p>
     * The setting that controls whether MediaTailor handles manifests from the
     * origin server as multi-period manifests or single-period manifests. If
     * your origin server produces single-period manifests, set this to
     * SINGLE_PERIOD. The default setting is MULTI_PERIOD. For multi-period
     * manifests, omit this setting or set it to MULTI_PERIOD.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PERIOD, MULTI_PERIOD
     *
     * @return <p>
     *         The setting that controls whether MediaTailor handles manifests
     *         from the origin server as multi-period manifests or single-period
     *         manifests. If your origin server produces single-period
     *         manifests, set this to SINGLE_PERIOD. The default setting is
     *         MULTI_PERIOD. For multi-period manifests, omit this setting or
     *         set it to MULTI_PERIOD.
     *         </p>
     * @see OriginManifestType
     */
    public String getOriginManifestType() {
        return originManifestType;
    }

    /**
     * <p>
     * The setting that controls whether MediaTailor handles manifests from the
     * origin server as multi-period manifests or single-period manifests. If
     * your origin server produces single-period manifests, set this to
     * SINGLE_PERIOD. The default setting is MULTI_PERIOD. For multi-period
     * manifests, omit this setting or set it to MULTI_PERIOD.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PERIOD, MULTI_PERIOD
     *
     * @param originManifestType <p>
     *            The setting that controls whether MediaTailor handles
     *            manifests from the origin server as multi-period manifests or
     *            single-period manifests. If your origin server produces
     *            single-period manifests, set this to SINGLE_PERIOD. The
     *            default setting is MULTI_PERIOD. For multi-period manifests,
     *            omit this setting or set it to MULTI_PERIOD.
     *            </p>
     * @see OriginManifestType
     */
    public void setOriginManifestType(String originManifestType) {
        this.originManifestType = originManifestType;
    }

    /**
     * <p>
     * The setting that controls whether MediaTailor handles manifests from the
     * origin server as multi-period manifests or single-period manifests. If
     * your origin server produces single-period manifests, set this to
     * SINGLE_PERIOD. The default setting is MULTI_PERIOD. For multi-period
     * manifests, omit this setting or set it to MULTI_PERIOD.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PERIOD, MULTI_PERIOD
     *
     * @param originManifestType <p>
     *            The setting that controls whether MediaTailor handles
     *            manifests from the origin server as multi-period manifests or
     *            single-period manifests. If your origin server produces
     *            single-period manifests, set this to SINGLE_PERIOD. The
     *            default setting is MULTI_PERIOD. For multi-period manifests,
     *            omit this setting or set it to MULTI_PERIOD.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OriginManifestType
     */
    public DashConfigurationForPut withOriginManifestType(String originManifestType) {
        this.originManifestType = originManifestType;
        return this;
    }

    /**
     * <p>
     * The setting that controls whether MediaTailor handles manifests from the
     * origin server as multi-period manifests or single-period manifests. If
     * your origin server produces single-period manifests, set this to
     * SINGLE_PERIOD. The default setting is MULTI_PERIOD. For multi-period
     * manifests, omit this setting or set it to MULTI_PERIOD.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PERIOD, MULTI_PERIOD
     *
     * @param originManifestType <p>
     *            The setting that controls whether MediaTailor handles
     *            manifests from the origin server as multi-period manifests or
     *            single-period manifests. If your origin server produces
     *            single-period manifests, set this to SINGLE_PERIOD. The
     *            default setting is MULTI_PERIOD. For multi-period manifests,
     *            omit this setting or set it to MULTI_PERIOD.
     *            </p>
     * @see OriginManifestType
     */
    public void setOriginManifestType(OriginManifestType originManifestType) {
        this.originManifestType = originManifestType.toString();
    }

    /**
     * <p>
     * The setting that controls whether MediaTailor handles manifests from the
     * origin server as multi-period manifests or single-period manifests. If
     * your origin server produces single-period manifests, set this to
     * SINGLE_PERIOD. The default setting is MULTI_PERIOD. For multi-period
     * manifests, omit this setting or set it to MULTI_PERIOD.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PERIOD, MULTI_PERIOD
     *
     * @param originManifestType <p>
     *            The setting that controls whether MediaTailor handles
     *            manifests from the origin server as multi-period manifests or
     *            single-period manifests. If your origin server produces
     *            single-period manifests, set this to SINGLE_PERIOD. The
     *            default setting is MULTI_PERIOD. For multi-period manifests,
     *            omit this setting or set it to MULTI_PERIOD.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OriginManifestType
     */
    public DashConfigurationForPut withOriginManifestType(OriginManifestType originManifestType) {
        this.originManifestType = originManifestType.toString();
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
        if (getMpdLocation() != null)
            sb.append("MpdLocation: " + getMpdLocation() + ",");
        if (getOriginManifestType() != null)
            sb.append("OriginManifestType: " + getOriginManifestType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMpdLocation() == null) ? 0 : getMpdLocation().hashCode());
        hashCode = prime * hashCode
                + ((getOriginManifestType() == null) ? 0 : getOriginManifestType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashConfigurationForPut == false)
            return false;
        DashConfigurationForPut other = (DashConfigurationForPut) obj;

        if (other.getMpdLocation() == null ^ this.getMpdLocation() == null)
            return false;
        if (other.getMpdLocation() != null
                && other.getMpdLocation().equals(this.getMpdLocation()) == false)
            return false;
        if (other.getOriginManifestType() == null ^ this.getOriginManifestType() == null)
            return false;
        if (other.getOriginManifestType() != null
                && other.getOriginManifestType().equals(this.getOriginManifestType()) == false)
            return false;
        return true;
    }
}
