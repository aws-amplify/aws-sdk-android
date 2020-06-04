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
package com.amazonaws.services.mediapackage-vod.model;

import java.io.Serializable;


/**
 * A Microsoft Smooth Streaming (MSS) manifest configuration.
 */
public class MssManifest implements Serializable {
    /**
     * An optional string to include in the name of the manifest.
     */
    private String manifestName;

    /**
     * A StreamSelection configuration.
     */
    private StreamSelection streamSelection;

    /**
     * An optional string to include in the name of the manifest.
     *
     * @return An optional string to include in the name of the manifest.
     */
    public String getManifestName() {
        return manifestName;
    }

    /**
     * An optional string to include in the name of the manifest.
     *
     * @param manifestName An optional string to include in the name of the manifest.
     */
    public void setManifestName(String manifestName) {
        this.manifestName = manifestName;
    }

    /**
     * An optional string to include in the name of the manifest.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param manifestName An optional string to include in the name of the manifest.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MssManifest withManifestName(String manifestName) {
        this.manifestName = manifestName;
        return this;
    }

    /**
     * A StreamSelection configuration.
     *
     * @return A StreamSelection configuration.
     */
    public StreamSelection getStreamSelection() {
        return streamSelection;
    }

    /**
     * A StreamSelection configuration.
     *
     * @param streamSelection A StreamSelection configuration.
     */
    public void setStreamSelection(StreamSelection streamSelection) {
        this.streamSelection = streamSelection;
    }

    /**
     * A StreamSelection configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param streamSelection A StreamSelection configuration.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public MssManifest withStreamSelection(StreamSelection streamSelection) {
        this.streamSelection = streamSelection;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getManifestName() != null) sb.append("ManifestName: " + getManifestName() + ",");
        if (getStreamSelection() != null) sb.append("StreamSelection: " + getStreamSelection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManifestName() == null) ? 0 : getManifestName().hashCode());
        hashCode = prime * hashCode + ((getStreamSelection() == null) ? 0 : getStreamSelection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MssManifest == false) return false;
        MssManifest other = (MssManifest)obj;

        if (other.getManifestName() == null ^ this.getManifestName() == null) return false;
        if (other.getManifestName() != null && other.getManifestName().equals(this.getManifestName()) == false) return false;
        if (other.getStreamSelection() == null ^ this.getStreamSelection() == null) return false;
        if (other.getStreamSelection() != null && other.getStreamSelection().equals(this.getStreamSelection()) == false) return false;
        return true;
    }
}
