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
 * [VPC only] Adds the specified egress rules to a security group for use with a
 * VPC.
 * </p>
 * <p>
 * An outbound rule permits instances to send traffic to the specified IPv4 or
 * IPv6 CIDR address ranges, or to the instances associated with the specified
 * destination security groups.
 * </p>
 * <p>
 * You specify a protocol for each rule (for example, TCP). For the TCP and UDP
 * protocols, you must also specify the destination port or port range. For the
 * ICMP protocol, you must also specify the ICMP type and code. You can use -1
 * for the type or code to mean all types or all codes.
 * </p>
 * <p>
 * Rule changes are propagated to affected instances as quickly as possible.
 * However, a small delay might occur.
 * </p>
 * <p>
 * For more information about VPC security group limits, see <a href=
 * "https://docs.aws.amazon.com/vpc/latest/userguide/amazon-vpc-limits.html"
 * >Amazon VPC Limits</a>.
 * </p>
 */
public class AuthorizeSecurityGroupEgressRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The ID of the security group.
     * </p>
     */
    private String groupId;

    /**
     * <p>
     * The sets of IP permissions. You can't specify a destination security
     * group and a CIDR IP address range in the same set of permissions.
     * </p>
     */
    private java.util.List<IpPermission> ipPermissions;

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the CIDR.
     * </p>
     */
    private String cidrIp;

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the port.
     * </p>
     */
    private Integer fromPort;

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the protocol name
     * or number.
     * </p>
     */
    private String ipProtocol;

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the port.
     * </p>
     */
    private Integer toPort;

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify a destination
     * security group.
     * </p>
     */
    private String sourceSecurityGroupName;

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify a destination
     * security group.
     * </p>
     */
    private String sourceSecurityGroupOwnerId;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupEgressRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     *
     * @return <p>
     *         The ID of the security group.
     *         </p>
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     *
     * @param groupId <p>
     *            The ID of the security group.
     *            </p>
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupId <p>
     *            The ID of the security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupEgressRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * <p>
     * The sets of IP permissions. You can't specify a destination security
     * group and a CIDR IP address range in the same set of permissions.
     * </p>
     *
     * @return <p>
     *         The sets of IP permissions. You can't specify a destination
     *         security group and a CIDR IP address range in the same set of
     *         permissions.
     *         </p>
     */
    public java.util.List<IpPermission> getIpPermissions() {
        return ipPermissions;
    }

    /**
     * <p>
     * The sets of IP permissions. You can't specify a destination security
     * group and a CIDR IP address range in the same set of permissions.
     * </p>
     *
     * @param ipPermissions <p>
     *            The sets of IP permissions. You can't specify a destination
     *            security group and a CIDR IP address range in the same set of
     *            permissions.
     *            </p>
     */
    public void setIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        if (ipPermissions == null) {
            this.ipPermissions = null;
            return;
        }

        this.ipPermissions = new java.util.ArrayList<IpPermission>(ipPermissions);
    }

    /**
     * <p>
     * The sets of IP permissions. You can't specify a destination security
     * group and a CIDR IP address range in the same set of permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipPermissions <p>
     *            The sets of IP permissions. You can't specify a destination
     *            security group and a CIDR IP address range in the same set of
     *            permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupEgressRequest withIpPermissions(IpPermission... ipPermissions) {
        if (getIpPermissions() == null) {
            this.ipPermissions = new java.util.ArrayList<IpPermission>(ipPermissions.length);
        }
        for (IpPermission value : ipPermissions) {
            this.ipPermissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The sets of IP permissions. You can't specify a destination security
     * group and a CIDR IP address range in the same set of permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipPermissions <p>
     *            The sets of IP permissions. You can't specify a destination
     *            security group and a CIDR IP address range in the same set of
     *            permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupEgressRequest withIpPermissions(
            java.util.Collection<IpPermission> ipPermissions) {
        setIpPermissions(ipPermissions);
        return this;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the CIDR.
     * </p>
     *
     * @return <p>
     *         Not supported. Use a set of IP permissions to specify the CIDR.
     *         </p>
     */
    public String getCidrIp() {
        return cidrIp;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the CIDR.
     * </p>
     *
     * @param cidrIp <p>
     *            Not supported. Use a set of IP permissions to specify the
     *            CIDR.
     *            </p>
     */
    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the CIDR.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrIp <p>
     *            Not supported. Use a set of IP permissions to specify the
     *            CIDR.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupEgressRequest withCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the port.
     * </p>
     *
     * @return <p>
     *         Not supported. Use a set of IP permissions to specify the port.
     *         </p>
     */
    public Integer getFromPort() {
        return fromPort;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the port.
     * </p>
     *
     * @param fromPort <p>
     *            Not supported. Use a set of IP permissions to specify the
     *            port.
     *            </p>
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the port.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromPort <p>
     *            Not supported. Use a set of IP permissions to specify the
     *            port.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupEgressRequest withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the protocol name
     * or number.
     * </p>
     *
     * @return <p>
     *         Not supported. Use a set of IP permissions to specify the
     *         protocol name or number.
     *         </p>
     */
    public String getIpProtocol() {
        return ipProtocol;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the protocol name
     * or number.
     * </p>
     *
     * @param ipProtocol <p>
     *            Not supported. Use a set of IP permissions to specify the
     *            protocol name or number.
     *            </p>
     */
    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the protocol name
     * or number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipProtocol <p>
     *            Not supported. Use a set of IP permissions to specify the
     *            protocol name or number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupEgressRequest withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the port.
     * </p>
     *
     * @return <p>
     *         Not supported. Use a set of IP permissions to specify the port.
     *         </p>
     */
    public Integer getToPort() {
        return toPort;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the port.
     * </p>
     *
     * @param toPort <p>
     *            Not supported. Use a set of IP permissions to specify the
     *            port.
     *            </p>
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify the port.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param toPort <p>
     *            Not supported. Use a set of IP permissions to specify the
     *            port.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupEgressRequest withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify a destination
     * security group.
     * </p>
     *
     * @return <p>
     *         Not supported. Use a set of IP permissions to specify a
     *         destination security group.
     *         </p>
     */
    public String getSourceSecurityGroupName() {
        return sourceSecurityGroupName;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify a destination
     * security group.
     * </p>
     *
     * @param sourceSecurityGroupName <p>
     *            Not supported. Use a set of IP permissions to specify a
     *            destination security group.
     *            </p>
     */
    public void setSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify a destination
     * security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSecurityGroupName <p>
     *            Not supported. Use a set of IP permissions to specify a
     *            destination security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupEgressRequest withSourceSecurityGroupName(
            String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
        return this;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify a destination
     * security group.
     * </p>
     *
     * @return <p>
     *         Not supported. Use a set of IP permissions to specify a
     *         destination security group.
     *         </p>
     */
    public String getSourceSecurityGroupOwnerId() {
        return sourceSecurityGroupOwnerId;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify a destination
     * security group.
     * </p>
     *
     * @param sourceSecurityGroupOwnerId <p>
     *            Not supported. Use a set of IP permissions to specify a
     *            destination security group.
     *            </p>
     */
    public void setSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
    }

    /**
     * <p>
     * Not supported. Use a set of IP permissions to specify a destination
     * security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSecurityGroupOwnerId <p>
     *            Not supported. Use a set of IP permissions to specify a
     *            destination security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AuthorizeSecurityGroupEgressRequest withSourceSecurityGroupOwnerId(
            String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getGroupId() != null)
            sb.append("GroupId: " + getGroupId() + ",");
        if (getIpPermissions() != null)
            sb.append("IpPermissions: " + getIpPermissions() + ",");
        if (getCidrIp() != null)
            sb.append("CidrIp: " + getCidrIp() + ",");
        if (getFromPort() != null)
            sb.append("FromPort: " + getFromPort() + ",");
        if (getIpProtocol() != null)
            sb.append("IpProtocol: " + getIpProtocol() + ",");
        if (getToPort() != null)
            sb.append("ToPort: " + getToPort() + ",");
        if (getSourceSecurityGroupName() != null)
            sb.append("SourceSecurityGroupName: " + getSourceSecurityGroupName() + ",");
        if (getSourceSecurityGroupOwnerId() != null)
            sb.append("SourceSecurityGroupOwnerId: " + getSourceSecurityGroupOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getIpPermissions() == null) ? 0 : getIpPermissions().hashCode());
        hashCode = prime * hashCode + ((getCidrIp() == null) ? 0 : getCidrIp().hashCode());
        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getIpProtocol() == null) ? 0 : getIpProtocol().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceSecurityGroupName() == null) ? 0 : getSourceSecurityGroupName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceSecurityGroupOwnerId() == null) ? 0 : getSourceSecurityGroupOwnerId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizeSecurityGroupEgressRequest == false)
            return false;
        AuthorizeSecurityGroupEgressRequest other = (AuthorizeSecurityGroupEgressRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getIpPermissions() == null ^ this.getIpPermissions() == null)
            return false;
        if (other.getIpPermissions() != null
                && other.getIpPermissions().equals(this.getIpPermissions()) == false)
            return false;
        if (other.getCidrIp() == null ^ this.getCidrIp() == null)
            return false;
        if (other.getCidrIp() != null && other.getCidrIp().equals(this.getCidrIp()) == false)
            return false;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getIpProtocol() == null ^ this.getIpProtocol() == null)
            return false;
        if (other.getIpProtocol() != null
                && other.getIpProtocol().equals(this.getIpProtocol()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        if (other.getSourceSecurityGroupName() == null ^ this.getSourceSecurityGroupName() == null)
            return false;
        if (other.getSourceSecurityGroupName() != null
                && other.getSourceSecurityGroupName().equals(this.getSourceSecurityGroupName()) == false)
            return false;
        if (other.getSourceSecurityGroupOwnerId() == null
                ^ this.getSourceSecurityGroupOwnerId() == null)
            return false;
        if (other.getSourceSecurityGroupOwnerId() != null
                && other.getSourceSecurityGroupOwnerId().equals(
                        this.getSourceSecurityGroupOwnerId()) == false)
            return false;
        return true;
    }
}
