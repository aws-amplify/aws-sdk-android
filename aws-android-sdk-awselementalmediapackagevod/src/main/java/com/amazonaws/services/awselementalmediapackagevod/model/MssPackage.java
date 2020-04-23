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

package com.amazonaws.services.awselementalmediapackagevod.model;

import java.io.Serializable;

/**
 * A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
 */
public class MssPackage implements Serializable {
    /**
     * A Microsoft Smooth Streaming (MSS) encryption configuration.
     */
    private MssEncryption encryption;

    /**
     * A list of MSS manifest configurations.
     */
    private java.util.List<MssManifest> mssManifests;

    /**
     * The duration (in seconds) of each segment.
     */
    private Integer segmentDurationSeconds;

    /**
     * A Microsoft Smooth Streaming (MSS) encryption configuration.
     *
     * @return A Microsoft Smooth Streaming (MSS) encryption configuration.
     */
    public MssEncryption getEncryption() {
        return encryption;
    }

    /**
     * A Microsoft Smooth Streaming (MSS) encryption configuration.
     *
     * @param encryption A Microsoft Smooth Streaming (MSS) encryption
     *            configuration.
     */
    public void setEncryption(MssEncryption encryption) {
        this.encryption = encryption;
    }

    /**
     * A Microsoft Smooth Streaming (MSS) encryption configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryption A Microsoft Smooth Streaming (MSS) encryption
     *            configuration.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MssPackage withEncryption(MssEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * A list of MSS manifest configurations.
     *
     * @return A list of MSS manifest configurations.
     */
    public java.util.List<MssManifest> getMssManifests() {
        return mssManifests;
    }

    /**
     * A list of MSS manifest configurations.
     *
     * @param mssManifests A list of MSS manifest configurations.
     */
    public void setMssManifests(java.util.Collection<MssManifest> mssManifests) {
        if (mssManifests == null) {
            this.mssManifests = null;
            return;
        }

        this.mssManifests = new java.util.ArrayList<MssManifest>(mssManifests);
    }

    /**
     * A list of MSS manifest configurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mssManifests A list of MSS manifest configurations.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MssPackage withMssManifests(MssManifest... mssManifests) {
        if (getMssManifests() == null) {
            this.mssManifests = new java.util.ArrayList<MssManifest>(mssManifests.length);
        }
        for (MssManifest value : mssManifests) {
            this.mssManifests.add(value);
        }
        return this;
    }

    /**
     * A list of MSS manifest configurations.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mssManifests A list of MSS manifest configurations.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MssPackage withMssManifests(java.util.Collection<MssManifest> mssManifests) {
        setMssManifests(mssManifests);
        return this;
    }

    /**
     * The duration (in seconds) of each segment.
     *
     * @return The duration (in seconds) of each segment.
     */
    public Integer getSegmentDurationSeconds() {
        return segmentDurationSeconds;
    }

    /**
     * The duration (in seconds) of each segment.
     *
     * @param segmentDurationSeconds The duration (in seconds) of each segment.
     */
    public void setSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
    }

    /**
     * The duration (in seconds) of each segment.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentDurationSeconds The duration (in seconds) of each segment.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MssPackage withSegmentDurationSeconds(Integer segmentDurationSeconds) {
        this.segmentDurationSeconds = segmentDurationSeconds;
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
        if (getEncryption() != null)
            sb.append("Encryption: " + getEncryption() + ",");
        if (getMssManifests() != null)
            sb.append("MssManifests: " + getMssManifests() + ",");
        if (getSegmentDurationSeconds() != null)
            sb.append("SegmentDurationSeconds: " + getSegmentDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode
                + ((getMssManifests() == null) ? 0 : getMssManifests().hashCode());
        hashCode = prime
                * hashCode
                + ((getSegmentDurationSeconds() == null) ? 0 : getSegmentDurationSeconds()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MssPackage == false)
            return false;
        MssPackage other = (MssPackage) obj;

        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null
                && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getMssManifests() == null ^ this.getMssManifests() == null)
            return false;
        if (other.getMssManifests() != null
                && other.getMssManifests().equals(this.getMssManifests()) == false)
            return false;
        if (other.getSegmentDurationSeconds() == null ^ this.getSegmentDurationSeconds() == null)
            return false;
        if (other.getSegmentDurationSeconds() != null
                && other.getSegmentDurationSeconds().equals(this.getSegmentDurationSeconds()) == false)
            return false;
        return true;
    }
}
