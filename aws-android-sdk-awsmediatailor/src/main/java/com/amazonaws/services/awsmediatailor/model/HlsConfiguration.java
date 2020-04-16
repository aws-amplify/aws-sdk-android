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

package com.amazonaws.services.awsmediatailor.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration for HLS content.
 * </p>
 */
public class HlsConfiguration implements Serializable {
    /**
     * <p>
     * The URL that is used to initiate a playback session for devices that
     * support Apple HLS. The session uses server-side reporting.
     * </p>
     */
    private String manifestEndpointPrefix;

    /**
     * <p>
     * The URL that is used to initiate a playback session for devices that
     * support Apple HLS. The session uses server-side reporting.
     * </p>
     *
     * @return <p>
     *         The URL that is used to initiate a playback session for devices
     *         that support Apple HLS. The session uses server-side reporting.
     *         </p>
     */
    public String getManifestEndpointPrefix() {
        return manifestEndpointPrefix;
    }

    /**
     * <p>
     * The URL that is used to initiate a playback session for devices that
     * support Apple HLS. The session uses server-side reporting.
     * </p>
     *
     * @param manifestEndpointPrefix <p>
     *            The URL that is used to initiate a playback session for
     *            devices that support Apple HLS. The session uses server-side
     *            reporting.
     *            </p>
     */
    public void setManifestEndpointPrefix(String manifestEndpointPrefix) {
        this.manifestEndpointPrefix = manifestEndpointPrefix;
    }

    /**
     * <p>
     * The URL that is used to initiate a playback session for devices that
     * support Apple HLS. The session uses server-side reporting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param manifestEndpointPrefix <p>
     *            The URL that is used to initiate a playback session for
     *            devices that support Apple HLS. The session uses server-side
     *            reporting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsConfiguration withManifestEndpointPrefix(String manifestEndpointPrefix) {
        this.manifestEndpointPrefix = manifestEndpointPrefix;
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
        if (getManifestEndpointPrefix() != null)
            sb.append("ManifestEndpointPrefix: " + getManifestEndpointPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getManifestEndpointPrefix() == null) ? 0 : getManifestEndpointPrefix()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsConfiguration == false)
            return false;
        HlsConfiguration other = (HlsConfiguration) obj;

        if (other.getManifestEndpointPrefix() == null ^ this.getManifestEndpointPrefix() == null)
            return false;
        if (other.getManifestEndpointPrefix() != null
                && other.getManifestEndpointPrefix().equals(this.getManifestEndpointPrefix()) == false)
            return false;
        return true;
    }
}
