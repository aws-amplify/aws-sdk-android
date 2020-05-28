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
 * Contains information about the EBS storage volumes attached to Kafka broker
 * nodes.
 * </p>
 */
public class EBSStorageInfo implements Serializable {
    /**
     * 
     <p>
     * The size in GiB of the EBS volume for the data drive on each broker node.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     */
    private Integer volumeSize;

    /**
     * 
     <p>
     * The size in GiB of the EBS volume for the data drive on each broker node.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     *
     * @return <p>
     *         The size in GiB of the EBS volume for the data drive on each
     *         broker node.
     *         </p>
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    /**
     * 
     <p>
     * The size in GiB of the EBS volume for the data drive on each broker node.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     *
     * @param volumeSize <p>
     *            The size in GiB of the EBS volume for the data drive on each
     *            broker node.
     *            </p>
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * 
     <p>
     * The size in GiB of the EBS volume for the data drive on each broker node.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 16384<br/>
     *
     * @param volumeSize <p>
     *            The size in GiB of the EBS volume for the data drive on each
     *            broker node.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EBSStorageInfo withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
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
        if (getVolumeSize() != null)
            sb.append("VolumeSize: " + getVolumeSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EBSStorageInfo == false)
            return false;
        EBSStorageInfo other = (EBSStorageInfo) obj;

        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null
                && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        return true;
    }
}
