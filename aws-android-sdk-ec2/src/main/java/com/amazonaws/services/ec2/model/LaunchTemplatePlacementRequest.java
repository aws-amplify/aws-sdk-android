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
 * Describes the placement of an instance.
 * </p>
 */
public class LaunchTemplatePlacementRequest implements Serializable {
    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The affinity setting for an instance on a Dedicated Host.
     * </p>
     */
    private String affinity;

    /**
     * <p>
     * The name of the placement group for the instance.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * The ID of the Dedicated Host for the instance.
     * </p>
     */
    private String hostId;

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of dedicated runs on single-tenant hardware.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     */
    private String tenancy;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String spreadDomain;

    /**
     * <p>
     * The ARN of the host resource group in which to launch the instances. If
     * you specify a host resource group ARN, omit the <b>Tenancy</b> parameter
     * or set it to <code>host</code>.
     * </p>
     */
    private String hostResourceGroupArn;

    /**
     * <p>
     * The number of the partition the instance should launch in. Valid only if
     * the placement group strategy is set to <code>partition</code>.
     * </p>
     */
    private Integer partitionNumber;

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     *
     * @return <p>
     *         The Availability Zone for the instance.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone for the instance.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplatePlacementRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * The affinity setting for an instance on a Dedicated Host.
     * </p>
     *
     * @return <p>
     *         The affinity setting for an instance on a Dedicated Host.
     *         </p>
     */
    public String getAffinity() {
        return affinity;
    }

    /**
     * <p>
     * The affinity setting for an instance on a Dedicated Host.
     * </p>
     *
     * @param affinity <p>
     *            The affinity setting for an instance on a Dedicated Host.
     *            </p>
     */
    public void setAffinity(String affinity) {
        this.affinity = affinity;
    }

    /**
     * <p>
     * The affinity setting for an instance on a Dedicated Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param affinity <p>
     *            The affinity setting for an instance on a Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplatePlacementRequest withAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }

    /**
     * <p>
     * The name of the placement group for the instance.
     * </p>
     *
     * @return <p>
     *         The name of the placement group for the instance.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The name of the placement group for the instance.
     * </p>
     *
     * @param groupName <p>
     *            The name of the placement group for the instance.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the placement group for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupName <p>
     *            The name of the placement group for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplatePlacementRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * The ID of the Dedicated Host for the instance.
     * </p>
     *
     * @return <p>
     *         The ID of the Dedicated Host for the instance.
     *         </p>
     */
    public String getHostId() {
        return hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host for the instance.
     * </p>
     *
     * @param hostId <p>
     *            The ID of the Dedicated Host for the instance.
     *            </p>
     */
    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostId <p>
     *            The ID of the Dedicated Host for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplatePlacementRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of dedicated runs on single-tenant hardware.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @return <p>
     *         The tenancy of the instance (if the instance is running in a
     *         VPC). An instance with a tenancy of dedicated runs on
     *         single-tenant hardware.
     *         </p>
     * @see Tenancy
     */
    public String getTenancy() {
        return tenancy;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of dedicated runs on single-tenant hardware.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param tenancy <p>
     *            The tenancy of the instance (if the instance is running in a
     *            VPC). An instance with a tenancy of dedicated runs on
     *            single-tenant hardware.
     *            </p>
     * @see Tenancy
     */
    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of dedicated runs on single-tenant hardware.
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
     *            VPC). An instance with a tenancy of dedicated runs on
     *            single-tenant hardware.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Tenancy
     */
    public LaunchTemplatePlacementRequest withTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of dedicated runs on single-tenant hardware.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param tenancy <p>
     *            The tenancy of the instance (if the instance is running in a
     *            VPC). An instance with a tenancy of dedicated runs on
     *            single-tenant hardware.
     *            </p>
     * @see Tenancy
     */
    public void setTenancy(Tenancy tenancy) {
        this.tenancy = tenancy.toString();
    }

    /**
     * <p>
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of dedicated runs on single-tenant hardware.
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
     *            VPC). An instance with a tenancy of dedicated runs on
     *            single-tenant hardware.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Tenancy
     */
    public LaunchTemplatePlacementRequest withTenancy(Tenancy tenancy) {
        this.tenancy = tenancy.toString();
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getSpreadDomain() {
        return spreadDomain;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param spreadDomain <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setSpreadDomain(String spreadDomain) {
        this.spreadDomain = spreadDomain;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spreadDomain <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplatePlacementRequest withSpreadDomain(String spreadDomain) {
        this.spreadDomain = spreadDomain;
        return this;
    }

    /**
     * <p>
     * The ARN of the host resource group in which to launch the instances. If
     * you specify a host resource group ARN, omit the <b>Tenancy</b> parameter
     * or set it to <code>host</code>.
     * </p>
     *
     * @return <p>
     *         The ARN of the host resource group in which to launch the
     *         instances. If you specify a host resource group ARN, omit the
     *         <b>Tenancy</b> parameter or set it to <code>host</code>.
     *         </p>
     */
    public String getHostResourceGroupArn() {
        return hostResourceGroupArn;
    }

    /**
     * <p>
     * The ARN of the host resource group in which to launch the instances. If
     * you specify a host resource group ARN, omit the <b>Tenancy</b> parameter
     * or set it to <code>host</code>.
     * </p>
     *
     * @param hostResourceGroupArn <p>
     *            The ARN of the host resource group in which to launch the
     *            instances. If you specify a host resource group ARN, omit the
     *            <b>Tenancy</b> parameter or set it to <code>host</code>.
     *            </p>
     */
    public void setHostResourceGroupArn(String hostResourceGroupArn) {
        this.hostResourceGroupArn = hostResourceGroupArn;
    }

    /**
     * <p>
     * The ARN of the host resource group in which to launch the instances. If
     * you specify a host resource group ARN, omit the <b>Tenancy</b> parameter
     * or set it to <code>host</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostResourceGroupArn <p>
     *            The ARN of the host resource group in which to launch the
     *            instances. If you specify a host resource group ARN, omit the
     *            <b>Tenancy</b> parameter or set it to <code>host</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplatePlacementRequest withHostResourceGroupArn(String hostResourceGroupArn) {
        this.hostResourceGroupArn = hostResourceGroupArn;
        return this;
    }

    /**
     * <p>
     * The number of the partition the instance should launch in. Valid only if
     * the placement group strategy is set to <code>partition</code>.
     * </p>
     *
     * @return <p>
     *         The number of the partition the instance should launch in. Valid
     *         only if the placement group strategy is set to
     *         <code>partition</code>.
     *         </p>
     */
    public Integer getPartitionNumber() {
        return partitionNumber;
    }

    /**
     * <p>
     * The number of the partition the instance should launch in. Valid only if
     * the placement group strategy is set to <code>partition</code>.
     * </p>
     *
     * @param partitionNumber <p>
     *            The number of the partition the instance should launch in.
     *            Valid only if the placement group strategy is set to
     *            <code>partition</code>.
     *            </p>
     */
    public void setPartitionNumber(Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
    }

    /**
     * <p>
     * The number of the partition the instance should launch in. Valid only if
     * the placement group strategy is set to <code>partition</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitionNumber <p>
     *            The number of the partition the instance should launch in.
     *            Valid only if the placement group strategy is set to
     *            <code>partition</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplatePlacementRequest withPartitionNumber(Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
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
        if (getAffinity() != null)
            sb.append("Affinity: " + getAffinity() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getHostId() != null)
            sb.append("HostId: " + getHostId() + ",");
        if (getTenancy() != null)
            sb.append("Tenancy: " + getTenancy() + ",");
        if (getSpreadDomain() != null)
            sb.append("SpreadDomain: " + getSpreadDomain() + ",");
        if (getHostResourceGroupArn() != null)
            sb.append("HostResourceGroupArn: " + getHostResourceGroupArn() + ",");
        if (getPartitionNumber() != null)
            sb.append("PartitionNumber: " + getPartitionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getAffinity() == null) ? 0 : getAffinity().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getHostId() == null) ? 0 : getHostId().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode
                + ((getSpreadDomain() == null) ? 0 : getSpreadDomain().hashCode());
        hashCode = prime * hashCode
                + ((getHostResourceGroupArn() == null) ? 0 : getHostResourceGroupArn().hashCode());
        hashCode = prime * hashCode
                + ((getPartitionNumber() == null) ? 0 : getPartitionNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplatePlacementRequest == false)
            return false;
        LaunchTemplatePlacementRequest other = (LaunchTemplatePlacementRequest) obj;

        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAffinity() == null ^ this.getAffinity() == null)
            return false;
        if (other.getAffinity() != null && other.getAffinity().equals(this.getAffinity()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getHostId() == null ^ this.getHostId() == null)
            return false;
        if (other.getHostId() != null && other.getHostId().equals(this.getHostId()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        if (other.getSpreadDomain() == null ^ this.getSpreadDomain() == null)
            return false;
        if (other.getSpreadDomain() != null
                && other.getSpreadDomain().equals(this.getSpreadDomain()) == false)
            return false;
        if (other.getHostResourceGroupArn() == null ^ this.getHostResourceGroupArn() == null)
            return false;
        if (other.getHostResourceGroupArn() != null
                && other.getHostResourceGroupArn().equals(this.getHostResourceGroupArn()) == false)
            return false;
        if (other.getPartitionNumber() == null ^ this.getPartitionNumber() == null)
            return false;
        if (other.getPartitionNumber() != null
                && other.getPartitionNumber().equals(this.getPartitionNumber()) == false)
            return false;
        return true;
    }
}
