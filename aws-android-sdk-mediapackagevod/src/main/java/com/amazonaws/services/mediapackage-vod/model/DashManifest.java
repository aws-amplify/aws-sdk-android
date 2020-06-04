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
 * A DASH manifest configuration.
 */
public class DashManifest implements Serializable {
    /**
     * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, COMPACT
     */
    private String manifestLayout;

    /**
     * An optional string to include in the name of the manifest.
     */
    private String manifestName;

    /**
     * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     */
    private Integer minBufferTimeSeconds;

    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, HBBTV_1_5
     */
    private String profile;

    /**
     * A StreamSelection configuration.
     */
    private StreamSelection streamSelection;

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, COMPACT
     *
     * @return Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     *
     * @see ManifestLayout
     */
    public String getManifestLayout() {
        return manifestLayout;
    }

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, COMPACT
     *
     * @param manifestLayout Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     *
     * @see ManifestLayout
     */
    public void setManifestLayout(String manifestLayout) {
        this.manifestLayout = manifestLayout;
    }

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, COMPACT
     *
     * @param manifestLayout Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ManifestLayout
     */
    public DashManifest withManifestLayout(String manifestLayout) {
        this.manifestLayout = manifestLayout;
        return this;
    }

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, COMPACT
     *
     * @param manifestLayout Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     *
     * @see ManifestLayout
     */
    public void setManifestLayout(ManifestLayout manifestLayout) {
        this.manifestLayout = manifestLayout.toString();
    }

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, COMPACT
     *
     * @param manifestLayout Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see ManifestLayout
     */
    public DashManifest withManifestLayout(ManifestLayout manifestLayout) {
        this.manifestLayout = manifestLayout.toString();
        return this;
    }

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
    public DashManifest withManifestName(String manifestName) {
        this.manifestName = manifestName;
        return this;
    }

    /**
     * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     *
     * @return Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     */
    public Integer getMinBufferTimeSeconds() {
        return minBufferTimeSeconds;
    }

    /**
     * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     *
     * @param minBufferTimeSeconds Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     */
    public void setMinBufferTimeSeconds(Integer minBufferTimeSeconds) {
        this.minBufferTimeSeconds = minBufferTimeSeconds;
    }

    /**
     * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minBufferTimeSeconds Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DashManifest withMinBufferTimeSeconds(Integer minBufferTimeSeconds) {
        this.minBufferTimeSeconds = minBufferTimeSeconds;
        return this;
    }

    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, HBBTV_1_5
     *
     * @return The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
     *
     * @see Profile
     */
    public String getProfile() {
        return profile;
    }

    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, HBBTV_1_5
     *
     * @param profile The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
     *
     * @see Profile
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, HBBTV_1_5
     *
     * @param profile The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see Profile
     */
    public DashManifest withProfile(String profile) {
        this.profile = profile;
        return this;
    }

    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, HBBTV_1_5
     *
     * @param profile The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
     *
     * @see Profile
     */
    public void setProfile(Profile profile) {
        this.profile = profile.toString();
    }

    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, HBBTV_1_5
     *
     * @param profile The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see Profile
     */
    public DashManifest withProfile(Profile profile) {
        this.profile = profile.toString();
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
    public DashManifest withStreamSelection(StreamSelection streamSelection) {
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
        if (getManifestLayout() != null) sb.append("ManifestLayout: " + getManifestLayout() + ",");
        if (getManifestName() != null) sb.append("ManifestName: " + getManifestName() + ",");
        if (getMinBufferTimeSeconds() != null) sb.append("MinBufferTimeSeconds: " + getMinBufferTimeSeconds() + ",");
        if (getProfile() != null) sb.append("Profile: " + getProfile() + ",");
        if (getStreamSelection() != null) sb.append("StreamSelection: " + getStreamSelection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManifestLayout() == null) ? 0 : getManifestLayout().hashCode());
        hashCode = prime * hashCode + ((getManifestName() == null) ? 0 : getManifestName().hashCode());
        hashCode = prime * hashCode + ((getMinBufferTimeSeconds() == null) ? 0 : getMinBufferTimeSeconds().hashCode());
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        hashCode = prime * hashCode + ((getStreamSelection() == null) ? 0 : getStreamSelection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DashManifest == false) return false;
        DashManifest other = (DashManifest)obj;

        if (other.getManifestLayout() == null ^ this.getManifestLayout() == null) return false;
        if (other.getManifestLayout() != null && other.getManifestLayout().equals(this.getManifestLayout()) == false) return false;
        if (other.getManifestName() == null ^ this.getManifestName() == null) return false;
        if (other.getManifestName() != null && other.getManifestName().equals(this.getManifestName()) == false) return false;
        if (other.getMinBufferTimeSeconds() == null ^ this.getMinBufferTimeSeconds() == null) return false;
        if (other.getMinBufferTimeSeconds() != null && other.getMinBufferTimeSeconds().equals(this.getMinBufferTimeSeconds()) == false) return false;
        if (other.getProfile() == null ^ this.getProfile() == null) return false;
        if (other.getProfile() != null && other.getProfile().equals(this.getProfile()) == false) return false;
        if (other.getStreamSelection() == null ^ this.getStreamSelection() == null) return false;
        if (other.getStreamSelection() != null && other.getStreamSelection().equals(this.getStreamSelection()) == false) return false;
        return true;
    }
}
