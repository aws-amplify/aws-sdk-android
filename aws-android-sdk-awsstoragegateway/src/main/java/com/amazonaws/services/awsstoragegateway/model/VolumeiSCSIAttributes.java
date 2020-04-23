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

/**
 * <p>
 * Lists iSCSI information about a volume.
 * </p>
 */
public class VolumeiSCSIAttributes implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     */
    private String targetARN;

    /**
     * <p>
     * The network interface identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]
     * ?\d?\d)){3}\z<br/>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * The port used to communicate with iSCSI targets.
     * </p>
     */
    private Integer networkInterfacePort;

    /**
     * <p>
     * The logical disk number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer lunNumber;

    /**
     * <p>
     * Indicates whether mutual CHAP is enabled for the iSCSI target.
     * </p>
     */
    private Boolean chapEnabled;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the volume target.
     *         </p>
     */
    public String getTargetARN() {
        return targetARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN <p>
     *            The Amazon Resource Name (ARN) of the volume target.
     *            </p>
     */
    public void setTargetARN(String targetARN) {
        this.targetARN = targetARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN <p>
     *            The Amazon Resource Name (ARN) of the volume target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeiSCSIAttributes withTargetARN(String targetARN) {
        this.targetARN = targetARN;
        return this;
    }

    /**
     * <p>
     * The network interface identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]
     * ?\d?\d)){3}\z<br/>
     *
     * @return <p>
     *         The network interface identifier.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * The network interface identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]
     * ?\d?\d)){3}\z<br/>
     *
     * @param networkInterfaceId <p>
     *            The network interface identifier.
     *            </p>
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The network interface identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]
     * ?\d?\d)){3}\z<br/>
     *
     * @param networkInterfaceId <p>
     *            The network interface identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeiSCSIAttributes withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * The port used to communicate with iSCSI targets.
     * </p>
     *
     * @return <p>
     *         The port used to communicate with iSCSI targets.
     *         </p>
     */
    public Integer getNetworkInterfacePort() {
        return networkInterfacePort;
    }

    /**
     * <p>
     * The port used to communicate with iSCSI targets.
     * </p>
     *
     * @param networkInterfacePort <p>
     *            The port used to communicate with iSCSI targets.
     *            </p>
     */
    public void setNetworkInterfacePort(Integer networkInterfacePort) {
        this.networkInterfacePort = networkInterfacePort;
    }

    /**
     * <p>
     * The port used to communicate with iSCSI targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfacePort <p>
     *            The port used to communicate with iSCSI targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeiSCSIAttributes withNetworkInterfacePort(Integer networkInterfacePort) {
        this.networkInterfacePort = networkInterfacePort;
        return this;
    }

    /**
     * <p>
     * The logical disk number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The logical disk number.
     *         </p>
     */
    public Integer getLunNumber() {
        return lunNumber;
    }

    /**
     * <p>
     * The logical disk number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param lunNumber <p>
     *            The logical disk number.
     *            </p>
     */
    public void setLunNumber(Integer lunNumber) {
        this.lunNumber = lunNumber;
    }

    /**
     * <p>
     * The logical disk number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param lunNumber <p>
     *            The logical disk number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeiSCSIAttributes withLunNumber(Integer lunNumber) {
        this.lunNumber = lunNumber;
        return this;
    }

    /**
     * <p>
     * Indicates whether mutual CHAP is enabled for the iSCSI target.
     * </p>
     *
     * @return <p>
     *         Indicates whether mutual CHAP is enabled for the iSCSI target.
     *         </p>
     */
    public Boolean isChapEnabled() {
        return chapEnabled;
    }

    /**
     * <p>
     * Indicates whether mutual CHAP is enabled for the iSCSI target.
     * </p>
     *
     * @return <p>
     *         Indicates whether mutual CHAP is enabled for the iSCSI target.
     *         </p>
     */
    public Boolean getChapEnabled() {
        return chapEnabled;
    }

    /**
     * <p>
     * Indicates whether mutual CHAP is enabled for the iSCSI target.
     * </p>
     *
     * @param chapEnabled <p>
     *            Indicates whether mutual CHAP is enabled for the iSCSI target.
     *            </p>
     */
    public void setChapEnabled(Boolean chapEnabled) {
        this.chapEnabled = chapEnabled;
    }

    /**
     * <p>
     * Indicates whether mutual CHAP is enabled for the iSCSI target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param chapEnabled <p>
     *            Indicates whether mutual CHAP is enabled for the iSCSI target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeiSCSIAttributes withChapEnabled(Boolean chapEnabled) {
        this.chapEnabled = chapEnabled;
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
        if (getTargetARN() != null)
            sb.append("TargetARN: " + getTargetARN() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getNetworkInterfacePort() != null)
            sb.append("NetworkInterfacePort: " + getNetworkInterfacePort() + ",");
        if (getLunNumber() != null)
            sb.append("LunNumber: " + getLunNumber() + ",");
        if (getChapEnabled() != null)
            sb.append("ChapEnabled: " + getChapEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetARN() == null) ? 0 : getTargetARN().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfacePort() == null) ? 0 : getNetworkInterfacePort().hashCode());
        hashCode = prime * hashCode + ((getLunNumber() == null) ? 0 : getLunNumber().hashCode());
        hashCode = prime * hashCode
                + ((getChapEnabled() == null) ? 0 : getChapEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeiSCSIAttributes == false)
            return false;
        VolumeiSCSIAttributes other = (VolumeiSCSIAttributes) obj;

        if (other.getTargetARN() == null ^ this.getTargetARN() == null)
            return false;
        if (other.getTargetARN() != null
                && other.getTargetARN().equals(this.getTargetARN()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getNetworkInterfacePort() == null ^ this.getNetworkInterfacePort() == null)
            return false;
        if (other.getNetworkInterfacePort() != null
                && other.getNetworkInterfacePort().equals(this.getNetworkInterfacePort()) == false)
            return false;
        if (other.getLunNumber() == null ^ this.getLunNumber() == null)
            return false;
        if (other.getLunNumber() != null
                && other.getLunNumber().equals(this.getLunNumber()) == false)
            return false;
        if (other.getChapEnabled() == null ^ this.getChapEnabled() == null)
            return false;
        if (other.getChapEnabled() != null
                && other.getChapEnabled().equals(this.getChapEnabled()) == false)
            return false;
        return true;
    }
}
