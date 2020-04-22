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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Options to enable, disable, and specify the properties of EBS storage
 * volumes. For more information, see <a href=
 * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs"
 * target="_blank"> Configuring EBS-based Storage</a>.
 * </p>
 */
public class EBSOptions implements Serializable {
    /**
     * <p>
     * Specifies whether EBS-based storage is enabled.
     * </p>
     */
    private Boolean eBSEnabled;

    /**
     * <p>
     * Specifies the volume type for EBS-based storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, gp2, io1
     */
    private String volumeType;

    /**
     * <p>
     * Integer to specify the size of an EBS volume.
     * </p>
     */
    private Integer volumeSize;

    /**
     * <p>
     * Specifies the IOPD for a Provisioned IOPS EBS volume (SSD).
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * Specifies whether EBS-based storage is enabled.
     * </p>
     *
     * @return <p>
     *         Specifies whether EBS-based storage is enabled.
     *         </p>
     */
    public Boolean isEBSEnabled() {
        return eBSEnabled;
    }

    /**
     * <p>
     * Specifies whether EBS-based storage is enabled.
     * </p>
     *
     * @return <p>
     *         Specifies whether EBS-based storage is enabled.
     *         </p>
     */
    public Boolean getEBSEnabled() {
        return eBSEnabled;
    }

    /**
     * <p>
     * Specifies whether EBS-based storage is enabled.
     * </p>
     *
     * @param eBSEnabled <p>
     *            Specifies whether EBS-based storage is enabled.
     *            </p>
     */
    public void setEBSEnabled(Boolean eBSEnabled) {
        this.eBSEnabled = eBSEnabled;
    }

    /**
     * <p>
     * Specifies whether EBS-based storage is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eBSEnabled <p>
     *            Specifies whether EBS-based storage is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EBSOptions withEBSEnabled(Boolean eBSEnabled) {
        this.eBSEnabled = eBSEnabled;
        return this;
    }

    /**
     * <p>
     * Specifies the volume type for EBS-based storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, gp2, io1
     *
     * @return <p>
     *         Specifies the volume type for EBS-based storage.
     *         </p>
     * @see VolumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    /**
     * <p>
     * Specifies the volume type for EBS-based storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, gp2, io1
     *
     * @param volumeType <p>
     *            Specifies the volume type for EBS-based storage.
     *            </p>
     * @see VolumeType
     */
    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * Specifies the volume type for EBS-based storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, gp2, io1
     *
     * @param volumeType <p>
     *            Specifies the volume type for EBS-based storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeType
     */
    public EBSOptions withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * <p>
     * Specifies the volume type for EBS-based storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, gp2, io1
     *
     * @param volumeType <p>
     *            Specifies the volume type for EBS-based storage.
     *            </p>
     * @see VolumeType
     */
    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
    }

    /**
     * <p>
     * Specifies the volume type for EBS-based storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>standard, gp2, io1
     *
     * @param volumeType <p>
     *            Specifies the volume type for EBS-based storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeType
     */
    public EBSOptions withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * Integer to specify the size of an EBS volume.
     * </p>
     *
     * @return <p>
     *         Integer to specify the size of an EBS volume.
     *         </p>
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    /**
     * <p>
     * Integer to specify the size of an EBS volume.
     * </p>
     *
     * @param volumeSize <p>
     *            Integer to specify the size of an EBS volume.
     *            </p>
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * Integer to specify the size of an EBS volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeSize <p>
     *            Integer to specify the size of an EBS volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EBSOptions withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * <p>
     * Specifies the IOPD for a Provisioned IOPS EBS volume (SSD).
     * </p>
     *
     * @return <p>
     *         Specifies the IOPD for a Provisioned IOPS EBS volume (SSD).
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * Specifies the IOPD for a Provisioned IOPS EBS volume (SSD).
     * </p>
     *
     * @param iops <p>
     *            Specifies the IOPD for a Provisioned IOPS EBS volume (SSD).
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * Specifies the IOPD for a Provisioned IOPS EBS volume (SSD).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iops <p>
     *            Specifies the IOPD for a Provisioned IOPS EBS volume (SSD).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EBSOptions withIops(Integer iops) {
        this.iops = iops;
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
        if (getEBSEnabled() != null)
            sb.append("EBSEnabled: " + getEBSEnabled() + ",");
        if (getVolumeType() != null)
            sb.append("VolumeType: " + getVolumeType() + ",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: " + getVolumeSize() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEBSEnabled() == null) ? 0 : getEBSEnabled().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EBSOptions == false)
            return false;
        EBSOptions other = (EBSOptions) obj;

        if (other.getEBSEnabled() == null ^ this.getEBSEnabled() == null)
            return false;
        if (other.getEBSEnabled() != null
                && other.getEBSEnabled().equals(this.getEBSEnabled()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null
                && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null
                && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        return true;
    }
}
