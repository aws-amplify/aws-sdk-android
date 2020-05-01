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
 * Creates a mount target for a file system. You can then mount the file system
 * on EC2 instances by using the mount target.
 * </p>
 * <p>
 * You can create one mount target in each Availability Zone in your VPC. All
 * EC2 instances in a VPC within a given Availability Zone share a single mount
 * target for a given file system. If you have multiple subnets in an
 * Availability Zone, you create a mount target in one of the subnets. EC2
 * instances do not need to be in the same subnet as the mount target in order
 * to access their file system. For more information, see <a
 * href="https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html">Amazon
 * EFS: How it Works</a>.
 * </p>
 * <p>
 * In the request, you also specify a file system ID for which you are creating
 * the mount target and the file system's lifecycle state must be
 * <code>available</code>. For more information, see <a>DescribeFileSystems</a>.
 * </p>
 * <p>
 * In the request, you also provide a subnet ID, which determines the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * VPC in which Amazon EFS creates the mount target
 * </p>
 * </li>
 * <li>
 * <p>
 * Availability Zone in which Amazon EFS creates the mount target
 * </p>
 * </li>
 * <li>
 * <p>
 * IP address range from which Amazon EFS selects the IP address of the mount
 * target (if you don't specify an IP address in the request)
 * </p>
 * </li>
 * </ul>
 * <p>
 * After creating the mount target, Amazon EFS returns a response that includes,
 * a <code>MountTargetId</code> and an <code>IpAddress</code>. You use this IP
 * address when mounting the file system in an EC2 instance. You can also use
 * the mount target's DNS name when mounting the file system. The EC2 instance
 * on which you mount the file system by using the mount target can resolve the
 * mount target's DNS name to its IP address. For more information, see <a href=
 * "https://docs.aws.amazon.com/efs/latest/ug/how-it-works.html#how-it-works-implementation"
 * >How it Works: Implementation Overview</a>.
 * </p>
 * <p>
 * Note that you can create mount targets for a file system in only one VPC, and
 * there can be only one mount target per Availability Zone. That is, if the
 * file system already has one or more mount targets created for it, the subnet
 * specified in the request to add another mount target must meet the following
 * requirements:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Must belong to the same VPC as the subnets of the existing mount targets
 * </p>
 * </li>
 * <li>
 * <p>
 * Must not be in the same Availability Zone as any of the subnets of the
 * existing mount targets
 * </p>
 * </li>
 * </ul>
 * <p>
 * If the request satisfies the requirements, Amazon EFS does the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Creates a new mount target in the specified subnet.
 * </p>
 * </li>
 * <li>
 * <p>
 * Also creates a new network interface in the subnet as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If the request provides an <code>IpAddress</code>, Amazon EFS assigns that IP
 * address to the network interface. Otherwise, Amazon EFS assigns a free
 * address in the subnet (in the same way that the Amazon EC2
 * <code>CreateNetworkInterface</code> call does when a request does not specify
 * a primary private IP address).
 * </p>
 * </li>
 * <li>
 * <p>
 * If the request provides <code>SecurityGroups</code>, this network interface
 * is associated with those security groups. Otherwise, it belongs to the
 * default security group for the subnet's VPC.
 * </p>
 * </li>
 * <li>
 * <p>
 * Assigns the description
 * <code>Mount target <i>fsmt-id</i> for file system <i>fs-id</i> </code> where
 * <code> <i>fsmt-id</i> </code> is the mount target ID, and
 * <code> <i>fs-id</i> </code> is the <code>FileSystemId</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Sets the <code>requesterManaged</code> property of the network interface to
 * <code>true</code>, and the <code>requesterId</code> value to <code>EFS</code>
 * .
 * </p>
 * </li>
 * </ul>
 * <p>
 * Each Amazon EFS mount target has one corresponding requester-managed EC2
 * network interface. After the network interface is created, Amazon EFS sets
 * the <code>NetworkInterfaceId</code> field in the mount target's description
 * to the network interface ID, and the <code>IpAddress</code> field to its
 * address. If network interface creation fails, the entire
 * <code>CreateMountTarget</code> operation fails.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * The <code>CreateMountTarget</code> call returns only after creating the
 * network interface, but while the mount target state is still
 * <code>creating</code>, you can check the mount target creation status by
 * calling the <a>DescribeMountTargets</a> operation, which among other things
 * returns the mount target state.
 * </p>
 * </note>
 * <p>
 * We recommend that you create a mount target in each of the Availability
 * Zones. There are cost considerations for using a file system in an
 * Availability Zone through a mount target created in another Availability
 * Zone. For more information, see <a href="http://aws.amazon.com/efs/">Amazon
 * EFS</a>. In addition, by always using a mount target local to the instance's
 * Availability Zone, you eliminate a partial failure scenario. If the
 * Availability Zone in which your mount target is created goes down, then you
 * can't access your file system through that mount target.
 * </p>
 * <p>
 * This operation requires permissions for the following action on the file
 * system:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>elasticfilesystem:CreateMountTarget</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * This operation also requires permissions for the following Amazon EC2
 * actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>ec2:DescribeSubnets</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ec2:DescribeNetworkInterfaces</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ec2:CreateNetworkInterface</code>
 * </p>
 * </li>
 * </ul>
 */
public class CreateMountTargetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the file system for which to create the mount target.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * The ID of the subnet to add the mount target in.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * Valid IPv4 address within the address range of the specified subnet.
     * </p>
     */
    private String ipAddress;

    /**
     * <p>
     * Up to five VPC security group IDs, of the form <code>sg-xxxxxxxx</code>.
     * These must be for the same VPC as subnet specified.
     * </p>
     */
    private java.util.List<String> securityGroups;

    /**
     * <p>
     * The ID of the file system for which to create the mount target.
     * </p>
     *
     * @return <p>
     *         The ID of the file system for which to create the mount target.
     *         </p>
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system for which to create the mount target.
     * </p>
     *
     * @param fileSystemId <p>
     *            The ID of the file system for which to create the mount
     *            target.
     *            </p>
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system for which to create the mount target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSystemId <p>
     *            The ID of the file system for which to create the mount
     *            target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMountTargetRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * <p>
     * The ID of the subnet to add the mount target in.
     * </p>
     *
     * @return <p>
     *         The ID of the subnet to add the mount target in.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The ID of the subnet to add the mount target in.
     * </p>
     *
     * @param subnetId <p>
     *            The ID of the subnet to add the mount target in.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet to add the mount target in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            The ID of the subnet to add the mount target in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMountTargetRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * Valid IPv4 address within the address range of the specified subnet.
     * </p>
     *
     * @return <p>
     *         Valid IPv4 address within the address range of the specified
     *         subnet.
     *         </p>
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * <p>
     * Valid IPv4 address within the address range of the specified subnet.
     * </p>
     *
     * @param ipAddress <p>
     *            Valid IPv4 address within the address range of the specified
     *            subnet.
     *            </p>
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * Valid IPv4 address within the address range of the specified subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipAddress <p>
     *            Valid IPv4 address within the address range of the specified
     *            subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMountTargetRequest withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * <p>
     * Up to five VPC security group IDs, of the form <code>sg-xxxxxxxx</code>.
     * These must be for the same VPC as subnet specified.
     * </p>
     *
     * @return <p>
     *         Up to five VPC security group IDs, of the form
     *         <code>sg-xxxxxxxx</code>. These must be for the same VPC as
     *         subnet specified.
     *         </p>
     */
    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * Up to five VPC security group IDs, of the form <code>sg-xxxxxxxx</code>.
     * These must be for the same VPC as subnet specified.
     * </p>
     *
     * @param securityGroups <p>
     *            Up to five VPC security group IDs, of the form
     *            <code>sg-xxxxxxxx</code>. These must be for the same VPC as
     *            subnet specified.
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
     * Up to five VPC security group IDs, of the form <code>sg-xxxxxxxx</code>.
     * These must be for the same VPC as subnet specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            Up to five VPC security group IDs, of the form
     *            <code>sg-xxxxxxxx</code>. These must be for the same VPC as
     *            subnet specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMountTargetRequest withSecurityGroups(String... securityGroups) {
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
     * Up to five VPC security group IDs, of the form <code>sg-xxxxxxxx</code>.
     * These must be for the same VPC as subnet specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            Up to five VPC security group IDs, of the form
     *            <code>sg-xxxxxxxx</code>. These must be for the same VPC as
     *            subnet specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMountTargetRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getIpAddress() != null)
            sb.append("IpAddress: " + getIpAddress() + ",");
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
                + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
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

        if (obj instanceof CreateMountTargetRequest == false)
            return false;
        CreateMountTargetRequest other = (CreateMountTargetRequest) obj;

        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null
                && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null
                && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        return true;
    }
}
