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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

/**
 * 
 <p>
 * Specifies the EBS volume upgrade information. The broker identifier must be
 * set to the keyword ALL. This means the changes apply to all the brokers in
 * the cluster.
 * </p>
 */
public class BrokerEBSVolumeInfo implements Serializable {
    /**
     * 
     <p>
     * The ID of the broker to update.
     * </p>
     */
    private String kafkaBrokerNodeId;

    /**
     * 
     <p>
     * Size of the EBS volume to update.
     * </p>
     */
    private Integer volumeSizeGB;

    /**
     * 
     <p>
     * The ID of the broker to update.
     * </p>
     * 
     * @return <p>
     *         The ID of the broker to update.
     *         </p>
     */
    public String getKafkaBrokerNodeId() {
        return kafkaBrokerNodeId;
    }

    /**
     * 
     <p>
     * The ID of the broker to update.
     * </p>
     * 
     * @param kafkaBrokerNodeId <p>
     *            The ID of the broker to update.
     *            </p>
     */
    public void setKafkaBrokerNodeId(String kafkaBrokerNodeId) {
        this.kafkaBrokerNodeId = kafkaBrokerNodeId;
    }

    /**
     * 
     <p>
     * The ID of the broker to update.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kafkaBrokerNodeId <p>
     *            The ID of the broker to update.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerEBSVolumeInfo withKafkaBrokerNodeId(String kafkaBrokerNodeId) {
        this.kafkaBrokerNodeId = kafkaBrokerNodeId;
        return this;
    }

    /**
     * 
     <p>
     * Size of the EBS volume to update.
     * </p>
     * 
     * @return <p>
     *         Size of the EBS volume to update.
     *         </p>
     */
    public Integer getVolumeSizeGB() {
        return volumeSizeGB;
    }

    /**
     * 
     <p>
     * Size of the EBS volume to update.
     * </p>
     * 
     * @param volumeSizeGB <p>
     *            Size of the EBS volume to update.
     *            </p>
     */
    public void setVolumeSizeGB(Integer volumeSizeGB) {
        this.volumeSizeGB = volumeSizeGB;
    }

    /**
     * 
     <p>
     * Size of the EBS volume to update.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeSizeGB <p>
     *            Size of the EBS volume to update.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerEBSVolumeInfo withVolumeSizeGB(Integer volumeSizeGB) {
        this.volumeSizeGB = volumeSizeGB;
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
        if (getKafkaBrokerNodeId() != null)
            sb.append("KafkaBrokerNodeId: " + getKafkaBrokerNodeId() + ",");
        if (getVolumeSizeGB() != null)
            sb.append("VolumeSizeGB: " + getVolumeSizeGB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKafkaBrokerNodeId() == null) ? 0 : getKafkaBrokerNodeId().hashCode());
        hashCode = prime * hashCode
                + ((getVolumeSizeGB() == null) ? 0 : getVolumeSizeGB().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BrokerEBSVolumeInfo == false)
            return false;
        BrokerEBSVolumeInfo other = (BrokerEBSVolumeInfo) obj;

        if (other.getKafkaBrokerNodeId() == null ^ this.getKafkaBrokerNodeId() == null)
            return false;
        if (other.getKafkaBrokerNodeId() != null
                && other.getKafkaBrokerNodeId().equals(this.getKafkaBrokerNodeId()) == false)
            return false;
        if (other.getVolumeSizeGB() == null ^ this.getVolumeSizeGB() == null)
            return false;
        if (other.getVolumeSizeGB() != null
                && other.getVolumeSizeGB().equals(this.getVolumeSizeGB()) == false)
            return false;
        return true;
    }
}
