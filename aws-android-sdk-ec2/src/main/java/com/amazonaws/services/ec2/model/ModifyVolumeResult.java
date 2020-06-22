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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class ModifyVolumeResult implements Serializable {
    /**
     * <p>
     * Information about the volume modification.
     * </p>
     */
    private VolumeModification volumeModification;

    /**
     * <p>
     * Information about the volume modification.
     * </p>
     *
     * @return <p>
     *         Information about the volume modification.
     *         </p>
     */
    public VolumeModification getVolumeModification() {
        return volumeModification;
    }

    /**
     * <p>
     * Information about the volume modification.
     * </p>
     *
     * @param volumeModification <p>
     *            Information about the volume modification.
     *            </p>
     */
    public void setVolumeModification(VolumeModification volumeModification) {
        this.volumeModification = volumeModification;
    }

    /**
     * <p>
     * Information about the volume modification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeModification <p>
     *            Information about the volume modification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyVolumeResult withVolumeModification(VolumeModification volumeModification) {
        this.volumeModification = volumeModification;
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
        if (getVolumeModification() != null)
            sb.append("VolumeModification: " + getVolumeModification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVolumeModification() == null) ? 0 : getVolumeModification().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVolumeResult == false)
            return false;
        ModifyVolumeResult other = (ModifyVolumeResult) obj;

        if (other.getVolumeModification() == null ^ this.getVolumeModification() == null)
            return false;
        if (other.getVolumeModification() != null
                && other.getVolumeModification().equals(this.getVolumeModification()) == false)
            return false;
        return true;
    }
}
