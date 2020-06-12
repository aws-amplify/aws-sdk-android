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

public class ListVolumeRecoveryPointsResult implements Serializable {
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
     * An array of <a>VolumeRecoveryPointInfo</a> objects.
     * </p>
     */
    private java.util.List<VolumeRecoveryPointInfo> volumeRecoveryPointInfos;

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
    public ListVolumeRecoveryPointsResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * An array of <a>VolumeRecoveryPointInfo</a> objects.
     * </p>
     *
     * @return <p>
     *         An array of <a>VolumeRecoveryPointInfo</a> objects.
     *         </p>
     */
    public java.util.List<VolumeRecoveryPointInfo> getVolumeRecoveryPointInfos() {
        return volumeRecoveryPointInfos;
    }

    /**
     * <p>
     * An array of <a>VolumeRecoveryPointInfo</a> objects.
     * </p>
     *
     * @param volumeRecoveryPointInfos <p>
     *            An array of <a>VolumeRecoveryPointInfo</a> objects.
     *            </p>
     */
    public void setVolumeRecoveryPointInfos(
            java.util.Collection<VolumeRecoveryPointInfo> volumeRecoveryPointInfos) {
        if (volumeRecoveryPointInfos == null) {
            this.volumeRecoveryPointInfos = null;
            return;
        }

        this.volumeRecoveryPointInfos = new java.util.ArrayList<VolumeRecoveryPointInfo>(
                volumeRecoveryPointInfos);
    }

    /**
     * <p>
     * An array of <a>VolumeRecoveryPointInfo</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeRecoveryPointInfos <p>
     *            An array of <a>VolumeRecoveryPointInfo</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVolumeRecoveryPointsResult withVolumeRecoveryPointInfos(
            VolumeRecoveryPointInfo... volumeRecoveryPointInfos) {
        if (getVolumeRecoveryPointInfos() == null) {
            this.volumeRecoveryPointInfos = new java.util.ArrayList<VolumeRecoveryPointInfo>(
                    volumeRecoveryPointInfos.length);
        }
        for (VolumeRecoveryPointInfo value : volumeRecoveryPointInfos) {
            this.volumeRecoveryPointInfos.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>VolumeRecoveryPointInfo</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeRecoveryPointInfos <p>
     *            An array of <a>VolumeRecoveryPointInfo</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVolumeRecoveryPointsResult withVolumeRecoveryPointInfos(
            java.util.Collection<VolumeRecoveryPointInfo> volumeRecoveryPointInfos) {
        setVolumeRecoveryPointInfos(volumeRecoveryPointInfos);
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
        if (getVolumeRecoveryPointInfos() != null)
            sb.append("VolumeRecoveryPointInfos: " + getVolumeRecoveryPointInfos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getVolumeRecoveryPointInfos() == null) ? 0 : getVolumeRecoveryPointInfos()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVolumeRecoveryPointsResult == false)
            return false;
        ListVolumeRecoveryPointsResult other = (ListVolumeRecoveryPointsResult) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getVolumeRecoveryPointInfos() == null
                ^ this.getVolumeRecoveryPointInfos() == null)
            return false;
        if (other.getVolumeRecoveryPointInfos() != null
                && other.getVolumeRecoveryPointInfos().equals(this.getVolumeRecoveryPointInfos()) == false)
            return false;
        return true;
    }
}
