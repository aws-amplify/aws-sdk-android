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
 * Specific settings for this type of output.
 */
public class OutputSettings implements Serializable {
    /**
     * Settings for HLS output groups
     */
    private HlsSettings hlsSettings;

    /**
     * Settings for HLS output groups
     *
     * @return Settings for HLS output groups
     */
    public HlsSettings getHlsSettings() {
        return hlsSettings;
    }

    /**
     * Settings for HLS output groups
     *
     * @param hlsSettings Settings for HLS output groups
     */
    public void setHlsSettings(HlsSettings hlsSettings) {
        this.hlsSettings = hlsSettings;
    }

    /**
     * Settings for HLS output groups
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hlsSettings Settings for HLS output groups
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputSettings withHlsSettings(HlsSettings hlsSettings) {
        this.hlsSettings = hlsSettings;
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
        if (getHlsSettings() != null)
            sb.append("HlsSettings: " + getHlsSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHlsSettings() == null) ? 0 : getHlsSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputSettings == false)
            return false;
        OutputSettings other = (OutputSettings) obj;

        if (other.getHlsSettings() == null ^ this.getHlsSettings() == null)
            return false;
        if (other.getHlsSettings() != null
                && other.getHlsSettings().equals(this.getHlsSettings()) == false)
            return false;
        return true;
    }
}
