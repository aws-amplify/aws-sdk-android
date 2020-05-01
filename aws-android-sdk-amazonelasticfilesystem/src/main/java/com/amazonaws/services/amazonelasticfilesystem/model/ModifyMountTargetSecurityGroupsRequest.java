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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies the set of security groups in effect for a mount target.
 * </p>
 * <p>
 * When you create a mount target, Amazon EFS also creates a new network
 * interface. For more information, see <a>CreateMountTarget</a>. This operation
 * replaces the security groups in effect for the network interface associated
 * with a mount target, with the <code>SecurityGroups</code> provided in the
 * request. This operation requires that the network interface of the mount
 * target has been created and the lifecycle state of the mount target is not
 * <code>deleted</code>.
 * </p>
 * <p>
 * The operation requires permissions for the following actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>elasticfilesystem:ModifyMountTargetSecurityGroups</code> action on the
 * mount target's file system.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ec2:ModifyNetworkInterfaceAttribute</code> action on the mount target's
 * network interface.
 * </p>
 * </li>
 * </ul>
 */
public class ModifyMountTargetSecurityGroupsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the mount target whose security groups you want to modify.
     * </p>
     */
    private String mountTargetId;

    /**
     * <p>
     * An array of up to five VPC security group IDs.
     * </p>
     */
    private java.util.List<String> securityGroups;

    /**
     * <p>
     * The ID of the mount target whose security groups you want to modify.
     * </p>
     *
     * @return <p>
     *         The ID of the mount target whose security groups you want to
     *         modify.
     *         </p>
     */
    public String getMountTargetId() {
        return mountTargetId;
    }

    /**
     * <p>
     * The ID of the mount target whose security groups you want to modify.
     * </p>
     *
     * @param mountTargetId <p>
     *            The ID of the mount target whose security groups you want to
     *            modify.
     *            </p>
     */
    public void setMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
    }

    /**
     * <p>
     * The ID of the mount target whose security groups you want to modify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mountTargetId <p>
     *            The ID of the mount target whose security groups you want to
     *            modify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyMountTargetSecurityGroupsRequest withMountTargetId(String mountTargetId) {
        this.mountTargetId = mountTargetId;
        return this;
    }

    /**
     * <p>
     * An array of up to five VPC security group IDs.
     * </p>
     *
     * @return <p>
     *         An array of up to five VPC security group IDs.
     *         </p>
     */
    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * An array of up to five VPC security group IDs.
     * </p>
     *
     * @param securityGroups <p>
     *            An array of up to five VPC security group IDs.
     *            </p>
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * An array of up to five VPC security group IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            An array of up to five VPC security group IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyMountTargetSecurityGroupsRequest withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) {
            this.securityGroups = new java.util.ArrayList<String>(securityGroups.length);
        }
        for (String value : securityGroups) {
            this.securityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of up to five VPC security group IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            An array of up to five VPC security group IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyMountTargetSecurityGroupsRequest withSecurityGroups(
            java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
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
        if (getMountTargetId() != null)
            sb.append("MountTargetId: " + getMountTargetId() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMountTargetId() == null) ? 0 : getMountTargetId().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyMountTargetSecurityGroupsRequest == false)
            return false;
        ModifyMountTargetSecurityGroupsRequest other = (ModifyMountTargetSecurityGroupsRequest) obj;

        if (other.getMountTargetId() == null ^ this.getMountTargetId() == null)
            return false;
        if (other.getMountTargetId() != null
                && other.getMountTargetId().equals(this.getMountTargetId()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        return true;
    }
}
