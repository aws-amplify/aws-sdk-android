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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListVolumesOutput$Marker</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListVolumesOutput$VolumeInfos</a>
 * </p>
 * </li>
 * </ul>
 */
public class ListVolumesResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * Use the marker in your next request to continue pagination of iSCSI
     * volumes. If there are no more volumes to list, this field does not appear
     * in the response body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String marker;

    /**
     * <p>
     * An array of <a>VolumeInfo</a> objects, where each object describes an
     * iSCSI volume. If no volumes are defined for the gateway, then
     * <code>VolumeInfos</code> is an empty array "[]".
     * </p>
     */
    private java.util.List<VolumeInfo> volumeInfos;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for
     *         your account and AWS Region.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVolumesResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * Use the marker in your next request to continue pagination of iSCSI
     * volumes. If there are no more volumes to list, this field does not appear
     * in the response body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         Use the marker in your next request to continue pagination of
     *         iSCSI volumes. If there are no more volumes to list, this field
     *         does not appear in the response body.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Use the marker in your next request to continue pagination of iSCSI
     * volumes. If there are no more volumes to list, this field does not appear
     * in the response body.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            Use the marker in your next request to continue pagination of
     *            iSCSI volumes. If there are no more volumes to list, this
     *            field does not appear in the response body.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use the marker in your next request to continue pagination of iSCSI
     * volumes. If there are no more volumes to list, this field does not appear
     * in the response body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker <p>
     *            Use the marker in your next request to continue pagination of
     *            iSCSI volumes. If there are no more volumes to list, this
     *            field does not appear in the response body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVolumesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * An array of <a>VolumeInfo</a> objects, where each object describes an
     * iSCSI volume. If no volumes are defined for the gateway, then
     * <code>VolumeInfos</code> is an empty array "[]".
     * </p>
     *
     * @return <p>
     *         An array of <a>VolumeInfo</a> objects, where each object
     *         describes an iSCSI volume. If no volumes are defined for the
     *         gateway, then <code>VolumeInfos</code> is an empty array "[]".
     *         </p>
     */
    public java.util.List<VolumeInfo> getVolumeInfos() {
        return volumeInfos;
    }

    /**
     * <p>
     * An array of <a>VolumeInfo</a> objects, where each object describes an
     * iSCSI volume. If no volumes are defined for the gateway, then
     * <code>VolumeInfos</code> is an empty array "[]".
     * </p>
     *
     * @param volumeInfos <p>
     *            An array of <a>VolumeInfo</a> objects, where each object
     *            describes an iSCSI volume. If no volumes are defined for the
     *            gateway, then <code>VolumeInfos</code> is an empty array "[]".
     *            </p>
     */
    public void setVolumeInfos(java.util.Collection<VolumeInfo> volumeInfos) {
        if (volumeInfos == null) {
            this.volumeInfos = null;
            return;
        }

        this.volumeInfos = new java.util.ArrayList<VolumeInfo>(volumeInfos);
    }

    /**
     * <p>
     * An array of <a>VolumeInfo</a> objects, where each object describes an
     * iSCSI volume. If no volumes are defined for the gateway, then
     * <code>VolumeInfos</code> is an empty array "[]".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeInfos <p>
     *            An array of <a>VolumeInfo</a> objects, where each object
     *            describes an iSCSI volume. If no volumes are defined for the
     *            gateway, then <code>VolumeInfos</code> is an empty array "[]".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVolumesResult withVolumeInfos(VolumeInfo... volumeInfos) {
        if (getVolumeInfos() == null) {
            this.volumeInfos = new java.util.ArrayList<VolumeInfo>(volumeInfos.length);
        }
        for (VolumeInfo value : volumeInfos) {
            this.volumeInfos.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>VolumeInfo</a> objects, where each object describes an
     * iSCSI volume. If no volumes are defined for the gateway, then
     * <code>VolumeInfos</code> is an empty array "[]".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeInfos <p>
     *            An array of <a>VolumeInfo</a> objects, where each object
     *            describes an iSCSI volume. If no volumes are defined for the
     *            gateway, then <code>VolumeInfos</code> is an empty array "[]".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVolumesResult withVolumeInfos(java.util.Collection<VolumeInfo> volumeInfos) {
        setVolumeInfos(volumeInfos);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getVolumeInfos() != null)
            sb.append("VolumeInfos: " + getVolumeInfos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeInfos() == null) ? 0 : getVolumeInfos().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVolumesResult == false)
            return false;
        ListVolumesResult other = (ListVolumesResult) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getVolumeInfos() == null ^ this.getVolumeInfos() == null)
            return false;
        if (other.getVolumeInfos() != null
                && other.getVolumeInfos().equals(this.getVolumeInfos()) == false)
            return false;
        return true;
    }
}
