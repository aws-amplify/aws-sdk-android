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
 * Describes Spot Instance placement.
 * </p>
 */
public class SpotPlacement implements Serializable {
    /**
     * <p>
     * The Availability Zone.
     * </p>
     * <p>
     * [Spot Fleet only] To specify multiple Availability Zones, separate them
     * using commas; for example, "us-west-2a, us-west-2b".
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The name of the placement group.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on single-tenant
     * hardware. The <code>host</code> tenancy is not supported for Spot
     * Instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     */
    private String tenancy;

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * <p>
     * [Spot Fleet only] To specify multiple Availability Zones, separate them
     * using commas; for example, "us-west-2a, us-west-2b".
     * </p>
     *
     * @return <p>
     *         The Availability Zone.
     *         </p>
     *         <p>
     *         [Spot Fleet only] To specify multiple Availability Zones,
     *         separate them using commas; for example,
     *         "us-west-2a, us-west-2b".
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * <p>
     * [Spot Fleet only] To specify multiple Availability Zones, separate them
     * using commas; for example, "us-west-2a, us-west-2b".
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone.
     *            </p>
     *            <p>
     *            [Spot Fleet only] To specify multiple Availability Zones,
     *            separate them using commas; for example,
     *            "us-west-2a, us-west-2b".
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone.
     * </p>
     * <p>
     * [Spot Fleet only] To specify multiple Availability Zones, separate them
     * using commas; for example, "us-west-2a, us-west-2b".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone.
     *            </p>
     *            <p>
     *            [Spot Fleet only] To specify multiple Availability Zones,
     *            separate them using commas; for example,
     *            "us-west-2a, us-west-2b".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotPlacement withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The name of the placement group.
     * </p>
     *
     * @return <p>
     *         The name of the placement group.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The name of the placement group.
     * </p>
     *
     * @param groupName <p>
     *            The name of the placement group.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the placement group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupName <p>
     *            The name of the placement group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotPlacement withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on single-tenant
     * hardware. The <code>host</code> tenancy is not supported for Spot
     * Instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @return <p>
     *         The tenancy of the instance (if the instance is running in a
     *         VPC). An instance with a tenancy of <code>dedicated</code> runs
     *         on single-tenant hardware. The <code>host</code> tenancy is not
     *         supported for Spot Instances.
     *         </p>
     * @see Tenancy
     */
    public String getTenancy() {
        return tenancy;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on single-tenant
     * hardware. The <code>host</code> tenancy is not supported for Spot
     * Instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param tenancy <p>
     *            The tenancy of the instance (if the instance is running in a
     *            VPC). An instance with a tenancy of <code>dedicated</code>
     *            runs on single-tenant hardware. The <code>host</code> tenancy
     *            is not supported for Spot Instances.
     *            </p>
     * @see Tenancy
     */
    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on single-tenant
     * hardware. The <code>host</code> tenancy is not supported for Spot
     * Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param tenancy <p>
     *            The tenancy of the instance (if the instance is running in a
     *            VPC). An instance with a tenancy of <code>dedicated</code>
     *            runs on single-tenant hardware. The <code>host</code> tenancy
     *            is not supported for Spot Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Tenancy
     */
    public SpotPlacement withTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on single-tenant
     * hardware. The <code>host</code> tenancy is not supported for Spot
     * Instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param tenancy <p>
     *            The tenancy of the instance (if the instance is running in a
     *            VPC). An instance with a tenancy of <code>dedicated</code>
     *            runs on single-tenant hardware. The <code>host</code> tenancy
     *            is not supported for Spot Instances.
     *            </p>
     * @see Tenancy
     */
    public void setTenancy(Tenancy tenancy) {
        this.tenancy = tenancy.toString();
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on single-tenant
     * hardware. The <code>host</code> tenancy is not supported for Spot
     * Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param tenancy <p>
     *            The tenancy of the instance (if the instance is running in a
     *            VPC). An instance with a tenancy of <code>dedicated</code>
     *            runs on single-tenant hardware. The <code>host</code> tenancy
     *            is not supported for Spot Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Tenancy
     */
    public SpotPlacement withTenancy(Tenancy tenancy) {
        this.tenancy = tenancy.toString();
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
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getTenancy() != null)
            sb.append("Tenancy: " + getTenancy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpotPlacement == false)
            return false;
        SpotPlacement other = (SpotPlacement) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        return true;
    }
}
