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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies the placement attributes for a specified instance. You can do the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Modify the affinity between an instance and a <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-overview.html"
 * >Dedicated Host</a>. When affinity is set to <code>host</code> and the
 * instance is not associated with a specific Dedicated Host, the next time the
 * instance is launched, it is automatically associated with the host on which
 * it lands. If the instance is restarted or rebooted, this relationship
 * persists.
 * </p>
 * </li>
 * <li>
 * <p>
 * Change the Dedicated Host with which an instance is associated.
 * </p>
 * </li>
 * <li>
 * <p>
 * Change the instance tenancy of an instance from <code>host</code> to
 * <code>dedicated</code>, or from <code>dedicated</code> to <code>host</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Move an instance to or from a <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
 * >placement group</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * At least one attribute for affinity, host ID, tenancy, or placement group
 * name must be specified in the request. Affinity and tenancy can be modified
 * in the same request.
 * </p>
 * <p>
 * To modify the host ID, tenancy, placement group, or partition for an
 * instance, the instance must be in the <code>stopped</code> state.
 * </p>
 */
public class ModifyInstancePlacementRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The affinity setting for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, host
     */
    private String affinity;

    /**
     * <p>
     * The name of the placement group in which to place the instance. For
     * spread placement groups, the instance must have a tenancy of
     * <code>default</code>. For cluster and partition placement groups, the
     * instance must have a tenancy of <code>default</code> or
     * <code>dedicated</code>.
     * </p>
     * <p>
     * To remove an instance from a placement group, specify an empty string
     * ("").
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * The ID of the Dedicated Host with which to associate the instance.
     * </p>
     */
    private String hostId;

    /**
     * <p>
     * The ID of the instance that you are modifying.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The tenancy for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>dedicated, host
     */
    private String tenancy;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private Integer partitionNumber;

    /**
     * <p>
     * The ARN of the host resource group in which to place the instance.
     * </p>
     */
    private String hostResourceGroupArn;

    /**
     * <p>
     * The affinity setting for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, host
     *
     * @return <p>
     *         The affinity setting for the instance.
     *         </p>
     * @see Affinity
     */
    public String getAffinity() {
        return affinity;
    }

    /**
     * <p>
     * The affinity setting for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, host
     *
     * @param affinity <p>
     *            The affinity setting for the instance.
     *            </p>
     * @see Affinity
     */
    public void setAffinity(String affinity) {
        this.affinity = affinity;
    }

    /**
     * <p>
     * The affinity setting for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, host
     *
     * @param affinity <p>
     *            The affinity setting for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Affinity
     */
    public ModifyInstancePlacementRequest withAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }

    /**
     * <p>
     * The affinity setting for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, host
     *
     * @param affinity <p>
     *            The affinity setting for the instance.
     *            </p>
     * @see Affinity
     */
    public void setAffinity(Affinity affinity) {
        this.affinity = affinity.toString();
    }

    /**
     * <p>
     * The affinity setting for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, host
     *
     * @param affinity <p>
     *            The affinity setting for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Affinity
     */
    public ModifyInstancePlacementRequest withAffinity(Affinity affinity) {
        this.affinity = affinity.toString();
        return this;
    }

    /**
     * <p>
     * The name of the placement group in which to place the instance. For
     * spread placement groups, the instance must have a tenancy of
     * <code>default</code>. For cluster and partition placement groups, the
     * instance must have a tenancy of <code>default</code> or
     * <code>dedicated</code>.
     * </p>
     * <p>
     * To remove an instance from a placement group, specify an empty string
     * ("").
     * </p>
     *
     * @return <p>
     *         The name of the placement group in which to place the instance.
     *         For spread placement groups, the instance must have a tenancy of
     *         <code>default</code>. For cluster and partition placement groups,
     *         the instance must have a tenancy of <code>default</code> or
     *         <code>dedicated</code>.
     *         </p>
     *         <p>
     *         To remove an instance from a placement group, specify an empty
     *         string ("").
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The name of the placement group in which to place the instance. For
     * spread placement groups, the instance must have a tenancy of
     * <code>default</code>. For cluster and partition placement groups, the
     * instance must have a tenancy of <code>default</code> or
     * <code>dedicated</code>.
     * </p>
     * <p>
     * To remove an instance from a placement group, specify an empty string
     * ("").
     * </p>
     *
     * @param groupName <p>
     *            The name of the placement group in which to place the
     *            instance. For spread placement groups, the instance must have
     *            a tenancy of <code>default</code>. For cluster and partition
     *            placement groups, the instance must have a tenancy of
     *            <code>default</code> or <code>dedicated</code>.
     *            </p>
     *            <p>
     *            To remove an instance from a placement group, specify an empty
     *            string ("").
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the placement group in which to place the instance. For
     * spread placement groups, the instance must have a tenancy of
     * <code>default</code>. For cluster and partition placement groups, the
     * instance must have a tenancy of <code>default</code> or
     * <code>dedicated</code>.
     * </p>
     * <p>
     * To remove an instance from a placement group, specify an empty string
     * ("").
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupName <p>
     *            The name of the placement group in which to place the
     *            instance. For spread placement groups, the instance must have
     *            a tenancy of <code>default</code>. For cluster and partition
     *            placement groups, the instance must have a tenancy of
     *            <code>default</code> or <code>dedicated</code>.
     *            </p>
     *            <p>
     *            To remove an instance from a placement group, specify an empty
     *            string ("").
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstancePlacementRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * The ID of the Dedicated Host with which to associate the instance.
     * </p>
     *
     * @return <p>
     *         The ID of the Dedicated Host with which to associate the
     *         instance.
     *         </p>
     */
    public String getHostId() {
        return hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host with which to associate the instance.
     * </p>
     *
     * @param hostId <p>
     *            The ID of the Dedicated Host with which to associate the
     *            instance.
     *            </p>
     */
    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    /**
     * <p>
     * The ID of the Dedicated Host with which to associate the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostId <p>
     *            The ID of the Dedicated Host with which to associate the
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstancePlacementRequest withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * <p>
     * The ID of the instance that you are modifying.
     * </p>
     *
     * @return <p>
     *         The ID of the instance that you are modifying.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance that you are modifying.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance that you are modifying.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance that you are modifying.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance that you are modifying.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstancePlacementRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The tenancy for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>dedicated, host
     *
     * @return <p>
     *         The tenancy for the instance.
     *         </p>
     * @see HostTenancy
     */
    public String getTenancy() {
        return tenancy;
    }

    /**
     * <p>
     * The tenancy for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>dedicated, host
     *
     * @param tenancy <p>
     *            The tenancy for the instance.
     *            </p>
     * @see HostTenancy
     */
    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * The tenancy for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>dedicated, host
     *
     * @param tenancy <p>
     *            The tenancy for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HostTenancy
     */
    public ModifyInstancePlacementRequest withTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * <p>
     * The tenancy for the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>dedicated, host
     *
     * @param tenancy <p>
     *            The tenancy for the instance.
     *            </p>
     * @see HostTenancy
     */
    public void setTenancy(HostTenancy tenancy) {
        this.tenancy = tenancy.toString();
    }

    /**
     * <p>
     * The tenancy for the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>dedicated, host
     *
     * @param tenancy <p>
     *            The tenancy for the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HostTenancy
     */
    public ModifyInstancePlacementRequest withTenancy(HostTenancy tenancy) {
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
    public Integer getPartitionNumber() {
        return partitionNumber;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param partitionNumber <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setPartitionNumber(Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partitionNumber <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstancePlacementRequest withPartitionNumber(Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
        return this;
    }

    /**
     * <p>
     * The ARN of the host resource group in which to place the instance.
     * </p>
     *
     * @return <p>
     *         The ARN of the host resource group in which to place the
     *         instance.
     *         </p>
     */
    public String getHostResourceGroupArn() {
        return hostResourceGroupArn;
    }

    /**
     * <p>
     * The ARN of the host resource group in which to place the instance.
     * </p>
     *
     * @param hostResourceGroupArn <p>
     *            The ARN of the host resource group in which to place the
     *            instance.
     *            </p>
     */
    public void setHostResourceGroupArn(String hostResourceGroupArn) {
        this.hostResourceGroupArn = hostResourceGroupArn;
    }

    /**
     * <p>
     * The ARN of the host resource group in which to place the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostResourceGroupArn <p>
     *            The ARN of the host resource group in which to place the
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyInstancePlacementRequest withHostResourceGroupArn(String hostResourceGroupArn) {
        this.hostResourceGroupArn = hostResourceGroupArn;
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
        if (getAffinity() != null)
            sb.append("Affinity: " + getAffinity() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getHostId() != null)
            sb.append("HostId: " + getHostId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getTenancy() != null)
            sb.append("Tenancy: " + getTenancy() + ",");
        if (getPartitionNumber() != null)
            sb.append("PartitionNumber: " + getPartitionNumber() + ",");
        if (getHostResourceGroupArn() != null)
            sb.append("HostResourceGroupArn: " + getHostResourceGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAffinity() == null) ? 0 : getAffinity().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getHostId() == null) ? 0 : getHostId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode
                + ((getPartitionNumber() == null) ? 0 : getPartitionNumber().hashCode());
        hashCode = prime * hashCode
                + ((getHostResourceGroupArn() == null) ? 0 : getHostResourceGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstancePlacementRequest == false)
            return false;
        ModifyInstancePlacementRequest other = (ModifyInstancePlacementRequest) obj;

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
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        if (other.getPartitionNumber() == null ^ this.getPartitionNumber() == null)
            return false;
        if (other.getPartitionNumber() != null
                && other.getPartitionNumber().equals(this.getPartitionNumber()) == false)
            return false;
        if (other.getHostResourceGroupArn() == null ^ this.getHostResourceGroupArn() == null)
            return false;
        if (other.getHostResourceGroupArn() != null
                && other.getHostResourceGroupArn().equals(this.getHostResourceGroupArn()) == false)
            return false;
        return true;
    }
}
