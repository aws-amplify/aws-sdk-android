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

/**
 * <p>
 * Describes the status of a volume.
 * </p>
 */
public class VolumeStatusInfo implements Serializable {
    /**
     * <p>
     * The details of the volume status.
     * </p>
     */
    private java.util.List<VolumeStatusDetails> details;

    /**
     * <p>
     * The status of the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired, insufficient-data
     */
    private String status;

    /**
     * <p>
     * The details of the volume status.
     * </p>
     *
     * @return <p>
     *         The details of the volume status.
     *         </p>
     */
    public java.util.List<VolumeStatusDetails> getDetails() {
        return details;
    }

    /**
     * <p>
     * The details of the volume status.
     * </p>
     *
     * @param details <p>
     *            The details of the volume status.
     *            </p>
     */
    public void setDetails(java.util.Collection<VolumeStatusDetails> details) {
        if (details == null) {
            this.details = null;
            return;
        }

        this.details = new java.util.ArrayList<VolumeStatusDetails>(details);
    }

    /**
     * <p>
     * The details of the volume status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param details <p>
     *            The details of the volume status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusInfo withDetails(VolumeStatusDetails... details) {
        if (getDetails() == null) {
            this.details = new java.util.ArrayList<VolumeStatusDetails>(details.length);
        }
        for (VolumeStatusDetails value : details) {
            this.details.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The details of the volume status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param details <p>
     *            The details of the volume status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusInfo withDetails(java.util.Collection<VolumeStatusDetails> details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * The status of the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired, insufficient-data
     *
     * @return <p>
     *         The status of the volume.
     *         </p>
     * @see VolumeStatusInfoStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired, insufficient-data
     *
     * @param status <p>
     *            The status of the volume.
     *            </p>
     * @see VolumeStatusInfoStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired, insufficient-data
     *
     * @param status <p>
     *            The status of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeStatusInfoStatus
     */
    public VolumeStatusInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the volume.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired, insufficient-data
     *
     * @param status <p>
     *            The status of the volume.
     *            </p>
     * @see VolumeStatusInfoStatus
     */
    public void setStatus(VolumeStatusInfoStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the volume.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired, insufficient-data
     *
     * @param status <p>
     *            The status of the volume.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeStatusInfoStatus
     */
    public VolumeStatusInfo withStatus(VolumeStatusInfoStatus status) {
        this.status = status.toString();
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
        if (getDetails() != null)
            sb.append("Details: " + getDetails() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeStatusInfo == false)
            return false;
        VolumeStatusInfo other = (VolumeStatusInfo) obj;

        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
