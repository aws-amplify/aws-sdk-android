/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.AuthorizeSecurityGroupIngressRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest) AuthorizeSecurityGroupIngress operation}.
 * <p>
 * Adds one or more ingress rules to a security group.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> EC2-Classic: You can have up to 100 rules per group.
 * EC2-VPC: You can have up to 50 rules per group (covering both ingress
 * and egress rules).
 * </p>
 * <p>
 * Rule changes are propagated to instances within the security group as
 * quickly as possible. However, a small delay might occur.
 * </p>
 * <p>
 * [EC2-Classic] This action gives one or more CIDR IP address ranges
 * permission to access a security group in your account, or gives one or
 * more security groups (called the <i>source groups</i> ) permission to
 * access a security group for your account. A source group can be for
 * your own AWS account, or another.
 * </p>
 * <p>
 * [EC2-VPC] This action gives one or more CIDR IP address ranges
 * permission to access a security group in your VPC, or gives one or
 * more other security groups (called the <i>source groups</i> )
 * permission to access a security group for your VPC. The security
 * groups must all be for the same VPC.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest)
 */
public class AuthorizeSecurityGroupIngressRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<AuthorizeSecurityGroupIngressRequest> {

    /**
     * [EC2-Classic, default VPC] The name of the security group.
     */
    private String groupName;

    /**
     * The ID of the security group. Required for a nondefault VPC.
     */
    private String groupId;

    /**
     * [EC2-Classic, default VPC] The name of the source security group. You
     * can't specify this parameter in combination with the following
     * parameters: the CIDR IP address range, the start of the port range,
     * the IP protocol, and the end of the port range. Creates rules that
     * grant full ICMP, UDP, and TCP access. To create a rule with a specific
     * IP protocol and port range, use a set of IP permissions instead. For
     * EC2-VPC, the source security group must be in the same VPC.
     */
    private String sourceSecurityGroupName;

    /**
     * [EC2-Classic] The AWS account number for the source security group, if
     * the source security group is in a different account. You can't specify
     * this parameter in combination with the following parameters: the CIDR
     * IP address range, the IP protocol, the start of the port range, and
     * the end of the port range. Creates rules that grant full ICMP, UDP,
     * and TCP access. To create a rule with a specific IP protocol and port
     * range, use a set of IP permissions instead.
     */
    private String sourceSecurityGroupOwnerId;

    /**
     * The IP protocol name (<code>tcp</code>, <code>udp</code>,
     * <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     * Numbers</a>). (VPC only) Use <code>-1</code> to specify all.
     */
    private String ipProtocol;

    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP type
     * number. For the ICMP type number, use <code>-1</code> to specify all
     * ICMP types.
     */
    private Integer fromPort;

    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP code
     * number. For the ICMP code number, use <code>-1</code> to specify all
     * ICMP codes for the ICMP type.
     */
    private Integer toPort;

    /**
     * The CIDR IP address range. You can't specify this parameter when
     * specifying a source security group.
     */
    private String cidrIp;

    /**
     * A set of IP permissions. Can be used to specify multiple rules in a
     * single command.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission> ipPermissions;

    /**
     * Default constructor for a new AuthorizeSecurityGroupIngressRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AuthorizeSecurityGroupIngressRequest() {}
    
    /**
     * Constructs a new AuthorizeSecurityGroupIngressRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param groupName [EC2-Classic, default VPC] The name of the security
     * group.
     * @param ipPermissions A set of IP permissions. Can be used to specify
     * multiple rules in a single command.
     */
    public AuthorizeSecurityGroupIngressRequest(String groupName, java.util.List<IpPermission> ipPermissions) {
        setGroupName(groupName);
        setIpPermissions(ipPermissions);
    }

    /**
     * [EC2-Classic, default VPC] The name of the security group.
     *
     * @return [EC2-Classic, default VPC] The name of the security group.
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * [EC2-Classic, default VPC] The name of the security group.
     *
     * @param groupName [EC2-Classic, default VPC] The name of the security group.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * [EC2-Classic, default VPC] The name of the security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName [EC2-Classic, default VPC] The name of the security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AuthorizeSecurityGroupIngressRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * The ID of the security group. Required for a nondefault VPC.
     *
     * @return The ID of the security group. Required for a nondefault VPC.
     */
    public String getGroupId() {
        return groupId;
    }
    
    /**
     * The ID of the security group. Required for a nondefault VPC.
     *
     * @param groupId The ID of the security group. Required for a nondefault VPC.
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    /**
     * The ID of the security group. Required for a nondefault VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupId The ID of the security group. Required for a nondefault VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AuthorizeSecurityGroupIngressRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * [EC2-Classic, default VPC] The name of the source security group. You
     * can't specify this parameter in combination with the following
     * parameters: the CIDR IP address range, the start of the port range,
     * the IP protocol, and the end of the port range. Creates rules that
     * grant full ICMP, UDP, and TCP access. To create a rule with a specific
     * IP protocol and port range, use a set of IP permissions instead. For
     * EC2-VPC, the source security group must be in the same VPC.
     *
     * @return [EC2-Classic, default VPC] The name of the source security group. You
     *         can't specify this parameter in combination with the following
     *         parameters: the CIDR IP address range, the start of the port range,
     *         the IP protocol, and the end of the port range. Creates rules that
     *         grant full ICMP, UDP, and TCP access. To create a rule with a specific
     *         IP protocol and port range, use a set of IP permissions instead. For
     *         EC2-VPC, the source security group must be in the same VPC.
     */
    public String getSourceSecurityGroupName() {
        return sourceSecurityGroupName;
    }
    
    /**
     * [EC2-Classic, default VPC] The name of the source security group. You
     * can't specify this parameter in combination with the following
     * parameters: the CIDR IP address range, the start of the port range,
     * the IP protocol, and the end of the port range. Creates rules that
     * grant full ICMP, UDP, and TCP access. To create a rule with a specific
     * IP protocol and port range, use a set of IP permissions instead. For
     * EC2-VPC, the source security group must be in the same VPC.
     *
     * @param sourceSecurityGroupName [EC2-Classic, default VPC] The name of the source security group. You
     *         can't specify this parameter in combination with the following
     *         parameters: the CIDR IP address range, the start of the port range,
     *         the IP protocol, and the end of the port range. Creates rules that
     *         grant full ICMP, UDP, and TCP access. To create a rule with a specific
     *         IP protocol and port range, use a set of IP permissions instead. For
     *         EC2-VPC, the source security group must be in the same VPC.
     */
    public void setSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
    }
    
    /**
     * [EC2-Classic, default VPC] The name of the source security group. You
     * can't specify this parameter in combination with the following
     * parameters: the CIDR IP address range, the start of the port range,
     * the IP protocol, and the end of the port range. Creates rules that
     * grant full ICMP, UDP, and TCP access. To create a rule with a specific
     * IP protocol and port range, use a set of IP permissions instead. For
     * EC2-VPC, the source security group must be in the same VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSecurityGroupName [EC2-Classic, default VPC] The name of the source security group. You
     *         can't specify this parameter in combination with the following
     *         parameters: the CIDR IP address range, the start of the port range,
     *         the IP protocol, and the end of the port range. Creates rules that
     *         grant full ICMP, UDP, and TCP access. To create a rule with a specific
     *         IP protocol and port range, use a set of IP permissions instead. For
     *         EC2-VPC, the source security group must be in the same VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AuthorizeSecurityGroupIngressRequest withSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
        return this;
    }

    /**
     * [EC2-Classic] The AWS account number for the source security group, if
     * the source security group is in a different account. You can't specify
     * this parameter in combination with the following parameters: the CIDR
     * IP address range, the IP protocol, the start of the port range, and
     * the end of the port range. Creates rules that grant full ICMP, UDP,
     * and TCP access. To create a rule with a specific IP protocol and port
     * range, use a set of IP permissions instead.
     *
     * @return [EC2-Classic] The AWS account number for the source security group, if
     *         the source security group is in a different account. You can't specify
     *         this parameter in combination with the following parameters: the CIDR
     *         IP address range, the IP protocol, the start of the port range, and
     *         the end of the port range. Creates rules that grant full ICMP, UDP,
     *         and TCP access. To create a rule with a specific IP protocol and port
     *         range, use a set of IP permissions instead.
     */
    public String getSourceSecurityGroupOwnerId() {
        return sourceSecurityGroupOwnerId;
    }
    
    /**
     * [EC2-Classic] The AWS account number for the source security group, if
     * the source security group is in a different account. You can't specify
     * this parameter in combination with the following parameters: the CIDR
     * IP address range, the IP protocol, the start of the port range, and
     * the end of the port range. Creates rules that grant full ICMP, UDP,
     * and TCP access. To create a rule with a specific IP protocol and port
     * range, use a set of IP permissions instead.
     *
     * @param sourceSecurityGroupOwnerId [EC2-Classic] The AWS account number for the source security group, if
     *         the source security group is in a different account. You can't specify
     *         this parameter in combination with the following parameters: the CIDR
     *         IP address range, the IP protocol, the start of the port range, and
     *         the end of the port range. Creates rules that grant full ICMP, UDP,
     *         and TCP access. To create a rule with a specific IP protocol and port
     *         range, use a set of IP permissions instead.
     */
    public void setSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
    }
    
    /**
     * [EC2-Classic] The AWS account number for the source security group, if
     * the source security group is in a different account. You can't specify
     * this parameter in combination with the following parameters: the CIDR
     * IP address range, the IP protocol, the start of the port range, and
     * the end of the port range. Creates rules that grant full ICMP, UDP,
     * and TCP access. To create a rule with a specific IP protocol and port
     * range, use a set of IP permissions instead.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSecurityGroupOwnerId [EC2-Classic] The AWS account number for the source security group, if
     *         the source security group is in a different account. You can't specify
     *         this parameter in combination with the following parameters: the CIDR
     *         IP address range, the IP protocol, the start of the port range, and
     *         the end of the port range. Creates rules that grant full ICMP, UDP,
     *         and TCP access. To create a rule with a specific IP protocol and port
     *         range, use a set of IP permissions instead.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AuthorizeSecurityGroupIngressRequest withSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
        return this;
    }

    /**
     * The IP protocol name (<code>tcp</code>, <code>udp</code>,
     * <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     * Numbers</a>). (VPC only) Use <code>-1</code> to specify all.
     *
     * @return The IP protocol name (<code>tcp</code>, <code>udp</code>,
     *         <code>icmp</code>) or number (see <a
     *         href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     *         Numbers</a>). (VPC only) Use <code>-1</code> to specify all.
     */
    public String getIpProtocol() {
        return ipProtocol;
    }
    
    /**
     * The IP protocol name (<code>tcp</code>, <code>udp</code>,
     * <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     * Numbers</a>). (VPC only) Use <code>-1</code> to specify all.
     *
     * @param ipProtocol The IP protocol name (<code>tcp</code>, <code>udp</code>,
     *         <code>icmp</code>) or number (see <a
     *         href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     *         Numbers</a>). (VPC only) Use <code>-1</code> to specify all.
     */
    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }
    
    /**
     * The IP protocol name (<code>tcp</code>, <code>udp</code>,
     * <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     * Numbers</a>). (VPC only) Use <code>-1</code> to specify all.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipProtocol The IP protocol name (<code>tcp</code>, <code>udp</code>,
     *         <code>icmp</code>) or number (see <a
     *         href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     *         Numbers</a>). (VPC only) Use <code>-1</code> to specify all.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AuthorizeSecurityGroupIngressRequest withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP type
     * number. For the ICMP type number, use <code>-1</code> to specify all
     * ICMP types.
     *
     * @return The start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. For the ICMP type number, use <code>-1</code> to specify all
     *         ICMP types.
     */
    public Integer getFromPort() {
        return fromPort;
    }
    
    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP type
     * number. For the ICMP type number, use <code>-1</code> to specify all
     * ICMP types.
     *
     * @param fromPort The start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. For the ICMP type number, use <code>-1</code> to specify all
     *         ICMP types.
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }
    
    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP type
     * number. For the ICMP type number, use <code>-1</code> to specify all
     * ICMP types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fromPort The start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. For the ICMP type number, use <code>-1</code> to specify all
     *         ICMP types.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AuthorizeSecurityGroupIngressRequest withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP code
     * number. For the ICMP code number, use <code>-1</code> to specify all
     * ICMP codes for the ICMP type.
     *
     * @return The end of port range for the TCP and UDP protocols, or an ICMP code
     *         number. For the ICMP code number, use <code>-1</code> to specify all
     *         ICMP codes for the ICMP type.
     */
    public Integer getToPort() {
        return toPort;
    }
    
    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP code
     * number. For the ICMP code number, use <code>-1</code> to specify all
     * ICMP codes for the ICMP type.
     *
     * @param toPort The end of port range for the TCP and UDP protocols, or an ICMP code
     *         number. For the ICMP code number, use <code>-1</code> to specify all
     *         ICMP codes for the ICMP type.
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }
    
    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP code
     * number. For the ICMP code number, use <code>-1</code> to specify all
     * ICMP codes for the ICMP type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param toPort The end of port range for the TCP and UDP protocols, or an ICMP code
     *         number. For the ICMP code number, use <code>-1</code> to specify all
     *         ICMP codes for the ICMP type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AuthorizeSecurityGroupIngressRequest withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    /**
     * The CIDR IP address range. You can't specify this parameter when
     * specifying a source security group.
     *
     * @return The CIDR IP address range. You can't specify this parameter when
     *         specifying a source security group.
     */
    public String getCidrIp() {
        return cidrIp;
    }
    
    /**
     * The CIDR IP address range. You can't specify this parameter when
     * specifying a source security group.
     *
     * @param cidrIp The CIDR IP address range. You can't specify this parameter when
     *         specifying a source security group.
     */
    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }
    
    /**
     * The CIDR IP address range. You can't specify this parameter when
     * specifying a source security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrIp The CIDR IP address range. You can't specify this parameter when
     *         specifying a source security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AuthorizeSecurityGroupIngressRequest withCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }

    /**
     * A set of IP permissions. Can be used to specify multiple rules in a
     * single command.
     *
     * @return A set of IP permissions. Can be used to specify multiple rules in a
     *         single command.
     */
    public java.util.List<IpPermission> getIpPermissions() {
        if (ipPermissions == null) {
              ipPermissions = new com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission>();
              ipPermissions.setAutoConstruct(true);
        }
        return ipPermissions;
    }
    
    /**
     * A set of IP permissions. Can be used to specify multiple rules in a
     * single command.
     *
     * @param ipPermissions A set of IP permissions. Can be used to specify multiple rules in a
     *         single command.
     */
    public void setIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        if (ipPermissions == null) {
            this.ipPermissions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission> ipPermissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission>(ipPermissions.size());
        ipPermissionsCopy.addAll(ipPermissions);
        this.ipPermissions = ipPermissionsCopy;
    }
    
    /**
     * A set of IP permissions. Can be used to specify multiple rules in a
     * single command.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipPermissions A set of IP permissions. Can be used to specify multiple rules in a
     *         single command.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AuthorizeSecurityGroupIngressRequest withIpPermissions(IpPermission... ipPermissions) {
        if (getIpPermissions() == null) setIpPermissions(new java.util.ArrayList<IpPermission>(ipPermissions.length));
        for (IpPermission value : ipPermissions) {
            getIpPermissions().add(value);
        }
        return this;
    }
    
    /**
     * A set of IP permissions. Can be used to specify multiple rules in a
     * single command.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipPermissions A set of IP permissions. Can be used to specify multiple rules in a
     *         single command.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AuthorizeSecurityGroupIngressRequest withIpPermissions(java.util.Collection<IpPermission> ipPermissions) {
        if (ipPermissions == null) {
            this.ipPermissions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission> ipPermissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IpPermission>(ipPermissions.size());
            ipPermissionsCopy.addAll(ipPermissions);
            this.ipPermissions = ipPermissionsCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<AuthorizeSecurityGroupIngressRequest> getDryRunRequest() {
        Request<AuthorizeSecurityGroupIngressRequest> request = new AuthorizeSecurityGroupIngressRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGroupName() != null) sb.append("GroupName: " + getGroupName() + ",");
        if (getGroupId() != null) sb.append("GroupId: " + getGroupId() + ",");
        if (getSourceSecurityGroupName() != null) sb.append("SourceSecurityGroupName: " + getSourceSecurityGroupName() + ",");
        if (getSourceSecurityGroupOwnerId() != null) sb.append("SourceSecurityGroupOwnerId: " + getSourceSecurityGroupOwnerId() + ",");
        if (getIpProtocol() != null) sb.append("IpProtocol: " + getIpProtocol() + ",");
        if (getFromPort() != null) sb.append("FromPort: " + getFromPort() + ",");
        if (getToPort() != null) sb.append("ToPort: " + getToPort() + ",");
        if (getCidrIp() != null) sb.append("CidrIp: " + getCidrIp() + ",");
        if (getIpPermissions() != null) sb.append("IpPermissions: " + getIpPermissions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getSourceSecurityGroupName() == null) ? 0 : getSourceSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getSourceSecurityGroupOwnerId() == null) ? 0 : getSourceSecurityGroupOwnerId().hashCode()); 
        hashCode = prime * hashCode + ((getIpProtocol() == null) ? 0 : getIpProtocol().hashCode()); 
        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode()); 
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode()); 
        hashCode = prime * hashCode + ((getCidrIp() == null) ? 0 : getCidrIp().hashCode()); 
        hashCode = prime * hashCode + ((getIpPermissions() == null) ? 0 : getIpPermissions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AuthorizeSecurityGroupIngressRequest == false) return false;
        AuthorizeSecurityGroupIngressRequest other = (AuthorizeSecurityGroupIngressRequest)obj;
        
        if (other.getGroupName() == null ^ this.getGroupName() == null) return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false) return false; 
        if (other.getGroupId() == null ^ this.getGroupId() == null) return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false) return false; 
        if (other.getSourceSecurityGroupName() == null ^ this.getSourceSecurityGroupName() == null) return false;
        if (other.getSourceSecurityGroupName() != null && other.getSourceSecurityGroupName().equals(this.getSourceSecurityGroupName()) == false) return false; 
        if (other.getSourceSecurityGroupOwnerId() == null ^ this.getSourceSecurityGroupOwnerId() == null) return false;
        if (other.getSourceSecurityGroupOwnerId() != null && other.getSourceSecurityGroupOwnerId().equals(this.getSourceSecurityGroupOwnerId()) == false) return false; 
        if (other.getIpProtocol() == null ^ this.getIpProtocol() == null) return false;
        if (other.getIpProtocol() != null && other.getIpProtocol().equals(this.getIpProtocol()) == false) return false; 
        if (other.getFromPort() == null ^ this.getFromPort() == null) return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false) return false; 
        if (other.getToPort() == null ^ this.getToPort() == null) return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false) return false; 
        if (other.getCidrIp() == null ^ this.getCidrIp() == null) return false;
        if (other.getCidrIp() != null && other.getCidrIp().equals(this.getCidrIp()) == false) return false; 
        if (other.getIpPermissions() == null ^ this.getIpPermissions() == null) return false;
        if (other.getIpPermissions() != null && other.getIpPermissions().equals(this.getIpPermissions()) == false) return false; 
        return true;
    }
    
}
    