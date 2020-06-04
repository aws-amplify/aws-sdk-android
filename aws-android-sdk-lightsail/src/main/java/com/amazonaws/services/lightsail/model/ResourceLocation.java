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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the resource location.
 * </p>
 */
public class ResourceLocation implements Serializable {
    /**
     * <p>
     * The Availability Zone. Follows the format <code>us-east-2a</code>
     * (case-sensitive).
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The AWS Region name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     */
    private String regionName;

    /**
     * <p>
     * The Availability Zone. Follows the format <code>us-east-2a</code>
     * (case-sensitive).
     * </p>
     *
     * @return <p>
     *         The Availability Zone. Follows the format <code>us-east-2a</code>
     *         (case-sensitive).
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone. Follows the format <code>us-east-2a</code>
     * (case-sensitive).
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone. Follows the format
     *            <code>us-east-2a</code> (case-sensitive).
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone. Follows the format <code>us-east-2a</code>
     * (case-sensitive).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone. Follows the format
     *            <code>us-east-2a</code> (case-sensitive).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceLocation withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The AWS Region name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     *
     * @return <p>
     *         The AWS Region name.
     *         </p>
     * @see RegionName
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * <p>
     * The AWS Region name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     *
     * @param regionName <p>
     *            The AWS Region name.
     *            </p>
     * @see RegionName
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The AWS Region name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     *
     * @param regionName <p>
     *            The AWS Region name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegionName
     */
    public ResourceLocation withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * <p>
     * The AWS Region name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     *
     * @param regionName <p>
     *            The AWS Region name.
     *            </p>
     * @see RegionName
     */
    public void setRegionName(RegionName regionName) {
        this.regionName = regionName.toString();
    }

    /**
     * <p>
     * The AWS Region name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ca-central-1, ap-south-1,
     * ap-southeast-1, ap-southeast-2, ap-northeast-1, ap-northeast-2
     *
     * @param regionName <p>
     *            The AWS Region name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RegionName
     */
    public ResourceLocation withRegionName(RegionName regionName) {
        this.regionName = regionName.toString();
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
        if (getAvailabilityZone() != null)
            sb.append("availabilityZone: " + getAvailabilityZone() + ",");
        if (getRegionName() != null)
            sb.append("regionName: " + getRegionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceLocation == false)
            return false;
        ResourceLocation other = (ResourceLocation) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null
                && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        return true;
    }
}
