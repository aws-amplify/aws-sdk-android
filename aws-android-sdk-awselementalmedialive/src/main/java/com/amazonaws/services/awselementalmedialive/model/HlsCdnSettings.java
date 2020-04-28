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
 * Hls Cdn Settings
 */
public class HlsCdnSettings implements Serializable {
    /**
     * Hls Akamai Settings
     */
    private HlsAkamaiSettings hlsAkamaiSettings;

    /**
     * Hls Basic Put Settings
     */
    private HlsBasicPutSettings hlsBasicPutSettings;

    /**
     * Hls Media Store Settings
     */
    private HlsMediaStoreSettings hlsMediaStoreSettings;

    /**
     * Hls Webdav Settings
     */
    private HlsWebdavSettings hlsWebdavSettings;

    /**
     * Hls Akamai Settings
     *
     * @return Hls Akamai Settings
     */
    public HlsAkamaiSettings getHlsAkamaiSettings() {
        return hlsAkamaiSettings;
    }

    /**
     * Hls Akamai Settings
     *
     * @param hlsAkamaiSettings Hls Akamai Settings
     */
    public void setHlsAkamaiSettings(HlsAkamaiSettings hlsAkamaiSettings) {
        this.hlsAkamaiSettings = hlsAkamaiSettings;
    }

    /**
     * Hls Akamai Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hlsAkamaiSettings Hls Akamai Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsCdnSettings withHlsAkamaiSettings(HlsAkamaiSettings hlsAkamaiSettings) {
        this.hlsAkamaiSettings = hlsAkamaiSettings;
        return this;
    }

    /**
     * Hls Basic Put Settings
     *
     * @return Hls Basic Put Settings
     */
    public HlsBasicPutSettings getHlsBasicPutSettings() {
        return hlsBasicPutSettings;
    }

    /**
     * Hls Basic Put Settings
     *
     * @param hlsBasicPutSettings Hls Basic Put Settings
     */
    public void setHlsBasicPutSettings(HlsBasicPutSettings hlsBasicPutSettings) {
        this.hlsBasicPutSettings = hlsBasicPutSettings;
    }

    /**
     * Hls Basic Put Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hlsBasicPutSettings Hls Basic Put Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsCdnSettings withHlsBasicPutSettings(HlsBasicPutSettings hlsBasicPutSettings) {
        this.hlsBasicPutSettings = hlsBasicPutSettings;
        return this;
    }

    /**
     * Hls Media Store Settings
     *
     * @return Hls Media Store Settings
     */
    public HlsMediaStoreSettings getHlsMediaStoreSettings() {
        return hlsMediaStoreSettings;
    }

    /**
     * Hls Media Store Settings
     *
     * @param hlsMediaStoreSettings Hls Media Store Settings
     */
    public void setHlsMediaStoreSettings(HlsMediaStoreSettings hlsMediaStoreSettings) {
        this.hlsMediaStoreSettings = hlsMediaStoreSettings;
    }

    /**
     * Hls Media Store Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hlsMediaStoreSettings Hls Media Store Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsCdnSettings withHlsMediaStoreSettings(HlsMediaStoreSettings hlsMediaStoreSettings) {
        this.hlsMediaStoreSettings = hlsMediaStoreSettings;
        return this;
    }

    /**
     * Hls Webdav Settings
     *
     * @return Hls Webdav Settings
     */
    public HlsWebdavSettings getHlsWebdavSettings() {
        return hlsWebdavSettings;
    }

    /**
     * Hls Webdav Settings
     *
     * @param hlsWebdavSettings Hls Webdav Settings
     */
    public void setHlsWebdavSettings(HlsWebdavSettings hlsWebdavSettings) {
        this.hlsWebdavSettings = hlsWebdavSettings;
    }

    /**
     * Hls Webdav Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hlsWebdavSettings Hls Webdav Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsCdnSettings withHlsWebdavSettings(HlsWebdavSettings hlsWebdavSettings) {
        this.hlsWebdavSettings = hlsWebdavSettings;
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
        if (getHlsAkamaiSettings() != null)
            sb.append("HlsAkamaiSettings: " + getHlsAkamaiSettings() + ",");
        if (getHlsBasicPutSettings() != null)
            sb.append("HlsBasicPutSettings: " + getHlsBasicPutSettings() + ",");
        if (getHlsMediaStoreSettings() != null)
            sb.append("HlsMediaStoreSettings: " + getHlsMediaStoreSettings() + ",");
        if (getHlsWebdavSettings() != null)
            sb.append("HlsWebdavSettings: " + getHlsWebdavSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHlsAkamaiSettings() == null) ? 0 : getHlsAkamaiSettings().hashCode());
        hashCode = prime * hashCode
                + ((getHlsBasicPutSettings() == null) ? 0 : getHlsBasicPutSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getHlsMediaStoreSettings() == null) ? 0 : getHlsMediaStoreSettings().hashCode());
        hashCode = prime * hashCode
                + ((getHlsWebdavSettings() == null) ? 0 : getHlsWebdavSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsCdnSettings == false)
            return false;
        HlsCdnSettings other = (HlsCdnSettings) obj;

        if (other.getHlsAkamaiSettings() == null ^ this.getHlsAkamaiSettings() == null)
            return false;
        if (other.getHlsAkamaiSettings() != null
                && other.getHlsAkamaiSettings().equals(this.getHlsAkamaiSettings()) == false)
            return false;
        if (other.getHlsBasicPutSettings() == null ^ this.getHlsBasicPutSettings() == null)
            return false;
        if (other.getHlsBasicPutSettings() != null
                && other.getHlsBasicPutSettings().equals(this.getHlsBasicPutSettings()) == false)
            return false;
        if (other.getHlsMediaStoreSettings() == null ^ this.getHlsMediaStoreSettings() == null)
            return false;
        if (other.getHlsMediaStoreSettings() != null
                && other.getHlsMediaStoreSettings().equals(this.getHlsMediaStoreSettings()) == false)
            return false;
        if (other.getHlsWebdavSettings() == null ^ this.getHlsWebdavSettings() == null)
            return false;
        if (other.getHlsWebdavSettings() != null
                && other.getHlsWebdavSettings().equals(this.getHlsWebdavSettings()) == false)
            return false;
        return true;
    }
}
