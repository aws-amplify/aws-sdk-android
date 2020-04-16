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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an Availability Zone.
 * </p>
 */
public class AvailabilityZone implements Serializable {
    /**
     * <p>
     * The name of the Availability Zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String zoneName;

    /**
     * <p>
     * The ID of the subnet. You can specify one subnet per Availability Zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String subnetId;

    /**
     * <p>
     * The name of the Availability Zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The name of the Availability Zone.
     *         </p>
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * <p>
     * The name of the Availability Zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param zoneName <p>
     *            The name of the Availability Zone.
     *            </p>
     */
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    /**
     * <p>
     * The name of the Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param zoneName <p>
     *            The name of the Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailabilityZone withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * <p>
     * The ID of the subnet. You can specify one subnet per Availability Zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID of the subnet. You can specify one subnet per Availability
     *         Zone.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The ID of the subnet. You can specify one subnet per Availability Zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param subnetId <p>
     *            The ID of the subnet. You can specify one subnet per
     *            Availability Zone.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet. You can specify one subnet per Availability Zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param subnetId <p>
     *            The ID of the subnet. You can specify one subnet per
     *            Availability Zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailabilityZone withSubnetId(String subnetId) {
        this.subnetId = subnetId;
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
        if (getZoneName() != null)
            sb.append("ZoneName: " + getZoneName() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getZoneName() == null) ? 0 : getZoneName().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailabilityZone == false)
            return false;
        AvailabilityZone other = (AvailabilityZone) obj;

        if (other.getZoneName() == null ^ this.getZoneName() == null)
            return false;
        if (other.getZoneName() != null && other.getZoneName().equals(this.getZoneName()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        return true;
    }
}
