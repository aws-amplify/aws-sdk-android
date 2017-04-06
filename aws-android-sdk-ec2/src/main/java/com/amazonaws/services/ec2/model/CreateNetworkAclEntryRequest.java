/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.CreateNetworkAclEntryRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createNetworkAclEntry(CreateNetworkAclEntryRequest) CreateNetworkAclEntry operation}.
 * <p>
 * Creates an entry (a rule) in a network ACL with the specified rule
 * number. Each network ACL has a set of numbered ingress rules and a
 * separate set of numbered egress rules. When determining whether a
 * packet should be allowed in or out of a subnet associated with the
 * ACL, we process the entries in the ACL according to the rule numbers,
 * in ascending order. Each network ACL has a set of ingress rules and a
 * separate set of egress rules.
 * </p>
 * <p>
 * We recommend that you leave room between the rule numbers (for
 * example, 100, 110, 120, ...), and not number them one right after the
 * other (for example, 101, 102, 103, ...). This makes it easier to add a
 * rule between existing ones without having to renumber the rules.
 * </p>
 * <p>
 * After you add an entry, you can't modify it; you must either replace
 * it, or create an entry and delete the old one.
 * </p>
 * <p>
 * For more information about network ACLs, see
 * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
 * in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createNetworkAclEntry(CreateNetworkAclEntryRequest)
 */
public class CreateNetworkAclEntryRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateNetworkAclEntryRequest> {

    /**
     * The ID of the network ACL.
     */
    private String networkAclId;

    /**
     * The rule number for the entry (for example, 100). ACL entries are
     * processed in ascending order by rule number. <p>Constraints: Positive
     * integer from 1 to 32766. The range 32767 to 65535 is reserved for
     * internal use.
     */
    private Integer ruleNumber;

    /**
     * The protocol. A value of -1 means all protocols.
     */
    private String protocol;

    /**
     * Indicates whether to allow or deny the traffic that matches the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     */
    private String ruleAction;

    /**
     * Indicates whether this is an egress rule (rule is applied to traffic
     * leaving the subnet).
     */
    private Boolean egress;

    /**
     * The network range to allow or deny, in CIDR notation (for example
     * <code>172.16.0.0/24</code>).
     */
    private String cidrBlock;

    /**
     * ICMP protocol: The ICMP type and code. Required if specifying ICMP for
     * the protocol.
     */
    private IcmpTypeCode icmpTypeCode;

    /**
     * TCP or UDP protocols: The range of ports the rule applies to.
     */
    private PortRange portRange;

    /**
     * The ID of the network ACL.
     *
     * @return The ID of the network ACL.
     */
    public String getNetworkAclId() {
        return networkAclId;
    }
    
    /**
     * The ID of the network ACL.
     *
     * @param networkAclId The ID of the network ACL.
     */
    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }
    
    /**
     * The ID of the network ACL.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAclId The ID of the network ACL.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNetworkAclEntryRequest withNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }

    /**
     * The rule number for the entry (for example, 100). ACL entries are
     * processed in ascending order by rule number. <p>Constraints: Positive
     * integer from 1 to 32766. The range 32767 to 65535 is reserved for
     * internal use.
     *
     * @return The rule number for the entry (for example, 100). ACL entries are
     *         processed in ascending order by rule number. <p>Constraints: Positive
     *         integer from 1 to 32766. The range 32767 to 65535 is reserved for
     *         internal use.
     */
    public Integer getRuleNumber() {
        return ruleNumber;
    }
    
    /**
     * The rule number for the entry (for example, 100). ACL entries are
     * processed in ascending order by rule number. <p>Constraints: Positive
     * integer from 1 to 32766. The range 32767 to 65535 is reserved for
     * internal use.
     *
     * @param ruleNumber The rule number for the entry (for example, 100). ACL entries are
     *         processed in ascending order by rule number. <p>Constraints: Positive
     *         integer from 1 to 32766. The range 32767 to 65535 is reserved for
     *         internal use.
     */
    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }
    
    /**
     * The rule number for the entry (for example, 100). ACL entries are
     * processed in ascending order by rule number. <p>Constraints: Positive
     * integer from 1 to 32766. The range 32767 to 65535 is reserved for
     * internal use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ruleNumber The rule number for the entry (for example, 100). ACL entries are
     *         processed in ascending order by rule number. <p>Constraints: Positive
     *         integer from 1 to 32766. The range 32767 to 65535 is reserved for
     *         internal use.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNetworkAclEntryRequest withRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
        return this;
    }

    /**
     * The protocol. A value of -1 means all protocols.
     *
     * @return The protocol. A value of -1 means all protocols.
     */
    public String getProtocol() {
        return protocol;
    }
    
    /**
     * The protocol. A value of -1 means all protocols.
     *
     * @param protocol The protocol. A value of -1 means all protocols.
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    
    /**
     * The protocol. A value of -1 means all protocols.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param protocol The protocol. A value of -1 means all protocols.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNetworkAclEntryRequest withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Indicates whether to allow or deny the traffic that matches the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @return Indicates whether to allow or deny the traffic that matches the rule.
     *
     * @see RuleAction
     */
    public String getRuleAction() {
        return ruleAction;
    }
    
    /**
     * Indicates whether to allow or deny the traffic that matches the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction Indicates whether to allow or deny the traffic that matches the rule.
     *
     * @see RuleAction
     */
    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }
    
    /**
     * Indicates whether to allow or deny the traffic that matches the rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction Indicates whether to allow or deny the traffic that matches the rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RuleAction
     */
    public CreateNetworkAclEntryRequest withRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }

    /**
     * Indicates whether to allow or deny the traffic that matches the rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction Indicates whether to allow or deny the traffic that matches the rule.
     *
     * @see RuleAction
     */
    public void setRuleAction(RuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
    }
    
    /**
     * Indicates whether to allow or deny the traffic that matches the rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow, deny
     *
     * @param ruleAction Indicates whether to allow or deny the traffic that matches the rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RuleAction
     */
    public CreateNetworkAclEntryRequest withRuleAction(RuleAction ruleAction) {
        this.ruleAction = ruleAction.toString();
        return this;
    }

    /**
     * Indicates whether this is an egress rule (rule is applied to traffic
     * leaving the subnet).
     *
     * @return Indicates whether this is an egress rule (rule is applied to traffic
     *         leaving the subnet).
     */
    public Boolean isEgress() {
        return egress;
    }
    
    /**
     * Indicates whether this is an egress rule (rule is applied to traffic
     * leaving the subnet).
     *
     * @param egress Indicates whether this is an egress rule (rule is applied to traffic
     *         leaving the subnet).
     */
    public void setEgress(Boolean egress) {
        this.egress = egress;
    }
    
    /**
     * Indicates whether this is an egress rule (rule is applied to traffic
     * leaving the subnet).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param egress Indicates whether this is an egress rule (rule is applied to traffic
     *         leaving the subnet).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNetworkAclEntryRequest withEgress(Boolean egress) {
        this.egress = egress;
        return this;
    }

    /**
     * Indicates whether this is an egress rule (rule is applied to traffic
     * leaving the subnet).
     *
     * @return Indicates whether this is an egress rule (rule is applied to traffic
     *         leaving the subnet).
     */
    public Boolean getEgress() {
        return egress;
    }

    /**
     * The network range to allow or deny, in CIDR notation (for example
     * <code>172.16.0.0/24</code>).
     *
     * @return The network range to allow or deny, in CIDR notation (for example
     *         <code>172.16.0.0/24</code>).
     */
    public String getCidrBlock() {
        return cidrBlock;
    }
    
    /**
     * The network range to allow or deny, in CIDR notation (for example
     * <code>172.16.0.0/24</code>).
     *
     * @param cidrBlock The network range to allow or deny, in CIDR notation (for example
     *         <code>172.16.0.0/24</code>).
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }
    
    /**
     * The network range to allow or deny, in CIDR notation (for example
     * <code>172.16.0.0/24</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrBlock The network range to allow or deny, in CIDR notation (for example
     *         <code>172.16.0.0/24</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNetworkAclEntryRequest withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * ICMP protocol: The ICMP type and code. Required if specifying ICMP for
     * the protocol.
     *
     * @return ICMP protocol: The ICMP type and code. Required if specifying ICMP for
     *         the protocol.
     */
    public IcmpTypeCode getIcmpTypeCode() {
        return icmpTypeCode;
    }
    
    /**
     * ICMP protocol: The ICMP type and code. Required if specifying ICMP for
     * the protocol.
     *
     * @param icmpTypeCode ICMP protocol: The ICMP type and code. Required if specifying ICMP for
     *         the protocol.
     */
    public void setIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
    }
    
    /**
     * ICMP protocol: The ICMP type and code. Required if specifying ICMP for
     * the protocol.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param icmpTypeCode ICMP protocol: The ICMP type and code. Required if specifying ICMP for
     *         the protocol.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNetworkAclEntryRequest withIcmpTypeCode(IcmpTypeCode icmpTypeCode) {
        this.icmpTypeCode = icmpTypeCode;
        return this;
    }

    /**
     * TCP or UDP protocols: The range of ports the rule applies to.
     *
     * @return TCP or UDP protocols: The range of ports the rule applies to.
     */
    public PortRange getPortRange() {
        return portRange;
    }
    
    /**
     * TCP or UDP protocols: The range of ports the rule applies to.
     *
     * @param portRange TCP or UDP protocols: The range of ports the rule applies to.
     */
    public void setPortRange(PortRange portRange) {
        this.portRange = portRange;
    }
    
    /**
     * TCP or UDP protocols: The range of ports the rule applies to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param portRange TCP or UDP protocols: The range of ports the rule applies to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateNetworkAclEntryRequest withPortRange(PortRange portRange) {
        this.portRange = portRange;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateNetworkAclEntryRequest> getDryRunRequest() {
        Request<CreateNetworkAclEntryRequest> request = new CreateNetworkAclEntryRequestMarshaller().marshall(this);
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
        if (getNetworkAclId() != null) sb.append("NetworkAclId: " + getNetworkAclId() + ",");
        if (getRuleNumber() != null) sb.append("RuleNumber: " + getRuleNumber() + ",");
        if (getProtocol() != null) sb.append("Protocol: " + getProtocol() + ",");
        if (getRuleAction() != null) sb.append("RuleAction: " + getRuleAction() + ",");
        if (isEgress() != null) sb.append("Egress: " + isEgress() + ",");
        if (getCidrBlock() != null) sb.append("CidrBlock: " + getCidrBlock() + ",");
        if (getIcmpTypeCode() != null) sb.append("IcmpTypeCode: " + getIcmpTypeCode() + ",");
        if (getPortRange() != null) sb.append("PortRange: " + getPortRange() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkAclId() == null) ? 0 : getNetworkAclId().hashCode()); 
        hashCode = prime * hashCode + ((getRuleNumber() == null) ? 0 : getRuleNumber().hashCode()); 
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode()); 
        hashCode = prime * hashCode + ((getRuleAction() == null) ? 0 : getRuleAction().hashCode()); 
        hashCode = prime * hashCode + ((isEgress() == null) ? 0 : isEgress().hashCode()); 
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode()); 
        hashCode = prime * hashCode + ((getIcmpTypeCode() == null) ? 0 : getIcmpTypeCode().hashCode()); 
        hashCode = prime * hashCode + ((getPortRange() == null) ? 0 : getPortRange().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateNetworkAclEntryRequest == false) return false;
        CreateNetworkAclEntryRequest other = (CreateNetworkAclEntryRequest)obj;
        
        if (other.getNetworkAclId() == null ^ this.getNetworkAclId() == null) return false;
        if (other.getNetworkAclId() != null && other.getNetworkAclId().equals(this.getNetworkAclId()) == false) return false; 
        if (other.getRuleNumber() == null ^ this.getRuleNumber() == null) return false;
        if (other.getRuleNumber() != null && other.getRuleNumber().equals(this.getRuleNumber()) == false) return false; 
        if (other.getProtocol() == null ^ this.getProtocol() == null) return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false) return false; 
        if (other.getRuleAction() == null ^ this.getRuleAction() == null) return false;
        if (other.getRuleAction() != null && other.getRuleAction().equals(this.getRuleAction()) == false) return false; 
        if (other.isEgress() == null ^ this.isEgress() == null) return false;
        if (other.isEgress() != null && other.isEgress().equals(this.isEgress()) == false) return false; 
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null) return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false) return false; 
        if (other.getIcmpTypeCode() == null ^ this.getIcmpTypeCode() == null) return false;
        if (other.getIcmpTypeCode() != null && other.getIcmpTypeCode().equals(this.getIcmpTypeCode()) == false) return false; 
        if (other.getPortRange() == null ^ this.getPortRange() == null) return false;
        if (other.getPortRange() != null && other.getPortRange().equals(this.getPortRange()) == false) return false; 
        return true;
    }
    
}
    