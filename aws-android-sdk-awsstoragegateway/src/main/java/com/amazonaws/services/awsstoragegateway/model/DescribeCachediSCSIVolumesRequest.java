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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a description of the gateway volumes specified in the request. This
 * operation is only supported in the cached volume gateway types.
 * </p>
 * <p>
 * The list of gateway volumes in the request must be from one gateway. In the
 * response, AWS Storage Gateway returns volume information sorted by volume
 * Amazon Resource Name (ARN).
 * </p>
 */
public class DescribeCachediSCSIVolumesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * An array of strings where each string represents the Amazon Resource Name
     * (ARN) of a cached volume. All of the specified cached volumes must be
     * from the same gateway. Use <a>ListVolumes</a> to get volume ARNs for a
     * gateway.
     * </p>
     */
    private java.util.List<String> volumeARNs;

    /**
     * <p>
     * An array of strings where each string represents the Amazon Resource Name
     * (ARN) of a cached volume. All of the specified cached volumes must be
     * from the same gateway. Use <a>ListVolumes</a> to get volume ARNs for a
     * gateway.
     * </p>
     *
     * @return <p>
     *         An array of strings where each string represents the Amazon
     *         Resource Name (ARN) of a cached volume. All of the specified
     *         cached volumes must be from the same gateway. Use
     *         <a>ListVolumes</a> to get volume ARNs for a gateway.
     *         </p>
     */
    public java.util.List<String> getVolumeARNs() {
        return volumeARNs;
    }

    /**
     * <p>
     * An array of strings where each string represents the Amazon Resource Name
     * (ARN) of a cached volume. All of the specified cached volumes must be
     * from the same gateway. Use <a>ListVolumes</a> to get volume ARNs for a
     * gateway.
     * </p>
     *
     * @param volumeARNs <p>
     *            An array of strings where each string represents the Amazon
     *            Resource Name (ARN) of a cached volume. All of the specified
     *            cached volumes must be from the same gateway. Use
     *            <a>ListVolumes</a> to get volume ARNs for a gateway.
     *            </p>
     */
    public void setVolumeARNs(java.util.Collection<String> volumeARNs) {
        if (volumeARNs == null) {
            this.volumeARNs = null;
            return;
        }

        this.volumeARNs = new java.util.ArrayList<String>(volumeARNs);
    }

    /**
     * <p>
     * An array of strings where each string represents the Amazon Resource Name
     * (ARN) of a cached volume. All of the specified cached volumes must be
     * from the same gateway. Use <a>ListVolumes</a> to get volume ARNs for a
     * gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeARNs <p>
     *            An array of strings where each string represents the Amazon
     *            Resource Name (ARN) of a cached volume. All of the specified
     *            cached volumes must be from the same gateway. Use
     *            <a>ListVolumes</a> to get volume ARNs for a gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCachediSCSIVolumesRequest withVolumeARNs(String... volumeARNs) {
        if (getVolumeARNs() == null) {
            this.volumeARNs = new java.util.ArrayList<String>(volumeARNs.length);
        }
        for (String value : volumeARNs) {
            this.volumeARNs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings where each string represents the Amazon Resource Name
     * (ARN) of a cached volume. All of the specified cached volumes must be
     * from the same gateway. Use <a>ListVolumes</a> to get volume ARNs for a
     * gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeARNs <p>
     *            An array of strings where each string represents the Amazon
     *            Resource Name (ARN) of a cached volume. All of the specified
     *            cached volumes must be from the same gateway. Use
     *            <a>ListVolumes</a> to get volume ARNs for a gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCachediSCSIVolumesRequest withVolumeARNs(java.util.Collection<String> volumeARNs) {
        setVolumeARNs(volumeARNs);
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
        if (getVolumeARNs() != null)
            sb.append("VolumeARNs: " + getVolumeARNs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARNs() == null) ? 0 : getVolumeARNs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCachediSCSIVolumesRequest == false)
            return false;
        DescribeCachediSCSIVolumesRequest other = (DescribeCachediSCSIVolumesRequest) obj;

        if (other.getVolumeARNs() == null ^ this.getVolumeARNs() == null)
            return false;
        if (other.getVolumeARNs() != null
                && other.getVolumeARNs().equals(this.getVolumeARNs()) == false)
            return false;
        return true;
    }
}
