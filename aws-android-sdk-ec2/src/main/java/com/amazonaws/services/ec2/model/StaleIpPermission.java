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

/**
 * <p>
 * Describes a stale rule in a security group.
 * </p>
 */
public class StaleIpPermission implements Serializable {

    /**
     * The start of the port range for the TCP and UDP protocols, or an ICMP
     * type number. A value of <code>-1</code> indicates all ICMP types.
     */
    private Integer fromPort;

    /**
     * The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     * <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     * Numbers)</a>.
     */
    private String ipProtocol;

    /**
     * One or more IP ranges. Not applicable for stale security group rules.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> ipRanges;

    /**
     * One or more prefix list IDs for an AWS service. Not applicable for
     * stale security group rules.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> prefixListIds;

    /**
     * The end of the port range for the TCP and UDP protocols, or an ICMP
     * type number. A value of <code>-1</code> indicates all ICMP types.
     */
    private Integer toPort;

    /**
     * One or more security group pairs. Returns the ID of the referenced
     * security group and VPC, and the ID and status of the VPC peering
     * connection.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<UserIdGroupPair> userIdGroupPairs;

    /**
     * The start of the port range for the TCP and UDP protocols, or an ICMP
     * type number. A value of <code>-1</code> indicates all ICMP types.
     *
     * @return The start of the port range for the TCP and UDP protocols, or an ICMP
     *         type number. A value of <code>-1</code> indicates all ICMP types.
     */
    public Integer getFromPort() {
        return fromPort;
    }
    
    /**
     * The start of the port range for the TCP and UDP protocols, or an ICMP
     * type number. A value of <code>-1</code> indicates all ICMP types.
     *
     * @param fromPort The start of the port range for the TCP and UDP protocols, or an ICMP
     *         type number. A value of <code>-1</code> indicates all ICMP types.
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }
    
    /**
     * The start of the port range for the TCP and UDP protocols, or an ICMP
     * type number. A value of <code>-1</code> indicates all ICMP types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fromPort The start of the port range for the TCP and UDP protocols, or an ICMP
     *         type number. A value of <code>-1</code> indicates all ICMP types.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleIpPermission withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     * <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     * Numbers)</a>.
     *
     * @return The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     *         <code>icmp</code>) or number (see <a
     *         href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     *         Numbers)</a>.
     */
    public String getIpProtocol() {
        return ipProtocol;
    }
    
    /**
     * The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     * <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     * Numbers)</a>.
     *
     * @param ipProtocol The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     *         <code>icmp</code>) or number (see <a
     *         href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     *         Numbers)</a>.
     */
    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }
    
    /**
     * The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     * <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     * Numbers)</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipProtocol The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     *         <code>icmp</code>) or number (see <a
     *         href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     *         Numbers)</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleIpPermission withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * One or more IP ranges. Not applicable for stale security group rules.
     *
     * @return One or more IP ranges. Not applicable for stale security group rules.
     */
    public java.util.List<String> getIpRanges() {
        if (ipRanges == null) {
              ipRanges = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              ipRanges.setAutoConstruct(true);
        }
        return ipRanges;
    }
    
    /**
     * One or more IP ranges. Not applicable for stale security group rules.
     *
     * @param ipRanges One or more IP ranges. Not applicable for stale security group rules.
     */
    public void setIpRanges(java.util.Collection<String> ipRanges) {
        if (ipRanges == null) {
            this.ipRanges = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> ipRangesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ipRanges.size());
        ipRangesCopy.addAll(ipRanges);
        this.ipRanges = ipRangesCopy;
    }
    
    /**
     * One or more IP ranges. Not applicable for stale security group rules.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipRanges One or more IP ranges. Not applicable for stale security group rules.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleIpPermission withIpRanges(String... ipRanges) {
        if (getIpRanges() == null) setIpRanges(new java.util.ArrayList<String>(ipRanges.length));
        for (String value : ipRanges) {
            getIpRanges().add(value);
        }
        return this;
    }
    
    /**
     * One or more IP ranges. Not applicable for stale security group rules.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipRanges One or more IP ranges. Not applicable for stale security group rules.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleIpPermission withIpRanges(java.util.Collection<String> ipRanges) {
        if (ipRanges == null) {
            this.ipRanges = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> ipRangesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ipRanges.size());
            ipRangesCopy.addAll(ipRanges);
            this.ipRanges = ipRangesCopy;
        }

        return this;
    }

    /**
     * One or more prefix list IDs for an AWS service. Not applicable for
     * stale security group rules.
     *
     * @return One or more prefix list IDs for an AWS service. Not applicable for
     *         stale security group rules.
     */
    public java.util.List<String> getPrefixListIds() {
        if (prefixListIds == null) {
              prefixListIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              prefixListIds.setAutoConstruct(true);
        }
        return prefixListIds;
    }
    
    /**
     * One or more prefix list IDs for an AWS service. Not applicable for
     * stale security group rules.
     *
     * @param prefixListIds One or more prefix list IDs for an AWS service. Not applicable for
     *         stale security group rules.
     */
    public void setPrefixListIds(java.util.Collection<String> prefixListIds) {
        if (prefixListIds == null) {
            this.prefixListIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> prefixListIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(prefixListIds.size());
        prefixListIdsCopy.addAll(prefixListIds);
        this.prefixListIds = prefixListIdsCopy;
    }
    
    /**
     * One or more prefix list IDs for an AWS service. Not applicable for
     * stale security group rules.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param prefixListIds One or more prefix list IDs for an AWS service. Not applicable for
     *         stale security group rules.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleIpPermission withPrefixListIds(String... prefixListIds) {
        if (getPrefixListIds() == null) setPrefixListIds(new java.util.ArrayList<String>(prefixListIds.length));
        for (String value : prefixListIds) {
            getPrefixListIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more prefix list IDs for an AWS service. Not applicable for
     * stale security group rules.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param prefixListIds One or more prefix list IDs for an AWS service. Not applicable for
     *         stale security group rules.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleIpPermission withPrefixListIds(java.util.Collection<String> prefixListIds) {
        if (prefixListIds == null) {
            this.prefixListIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> prefixListIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(prefixListIds.size());
            prefixListIdsCopy.addAll(prefixListIds);
            this.prefixListIds = prefixListIdsCopy;
        }

        return this;
    }

    /**
     * The end of the port range for the TCP and UDP protocols, or an ICMP
     * type number. A value of <code>-1</code> indicates all ICMP types.
     *
     * @return The end of the port range for the TCP and UDP protocols, or an ICMP
     *         type number. A value of <code>-1</code> indicates all ICMP types.
     */
    public Integer getToPort() {
        return toPort;
    }
    
    /**
     * The end of the port range for the TCP and UDP protocols, or an ICMP
     * type number. A value of <code>-1</code> indicates all ICMP types.
     *
     * @param toPort The end of the port range for the TCP and UDP protocols, or an ICMP
     *         type number. A value of <code>-1</code> indicates all ICMP types.
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }
    
    /**
     * The end of the port range for the TCP and UDP protocols, or an ICMP
     * type number. A value of <code>-1</code> indicates all ICMP types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param toPort The end of the port range for the TCP and UDP protocols, or an ICMP
     *         type number. A value of <code>-1</code> indicates all ICMP types.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleIpPermission withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    /**
     * One or more security group pairs. Returns the ID of the referenced
     * security group and VPC, and the ID and status of the VPC peering
     * connection.
     *
     * @return One or more security group pairs. Returns the ID of the referenced
     *         security group and VPC, and the ID and status of the VPC peering
     *         connection.
     */
    public java.util.List<UserIdGroupPair> getUserIdGroupPairs() {
        if (userIdGroupPairs == null) {
              userIdGroupPairs = new com.amazonaws.internal.ListWithAutoConstructFlag<UserIdGroupPair>();
              userIdGroupPairs.setAutoConstruct(true);
        }
        return userIdGroupPairs;
    }
    
    /**
     * One or more security group pairs. Returns the ID of the referenced
     * security group and VPC, and the ID and status of the VPC peering
     * connection.
     *
     * @param userIdGroupPairs One or more security group pairs. Returns the ID of the referenced
     *         security group and VPC, and the ID and status of the VPC peering
     *         connection.
     */
    public void setUserIdGroupPairs(java.util.Collection<UserIdGroupPair> userIdGroupPairs) {
        if (userIdGroupPairs == null) {
            this.userIdGroupPairs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<UserIdGroupPair> userIdGroupPairsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<UserIdGroupPair>(userIdGroupPairs.size());
        userIdGroupPairsCopy.addAll(userIdGroupPairs);
        this.userIdGroupPairs = userIdGroupPairsCopy;
    }
    
    /**
     * One or more security group pairs. Returns the ID of the referenced
     * security group and VPC, and the ID and status of the VPC peering
     * connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userIdGroupPairs One or more security group pairs. Returns the ID of the referenced
     *         security group and VPC, and the ID and status of the VPC peering
     *         connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleIpPermission withUserIdGroupPairs(UserIdGroupPair... userIdGroupPairs) {
        if (getUserIdGroupPairs() == null) setUserIdGroupPairs(new java.util.ArrayList<UserIdGroupPair>(userIdGroupPairs.length));
        for (UserIdGroupPair value : userIdGroupPairs) {
            getUserIdGroupPairs().add(value);
        }
        return this;
    }
    
    /**
     * One or more security group pairs. Returns the ID of the referenced
     * security group and VPC, and the ID and status of the VPC peering
     * connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userIdGroupPairs One or more security group pairs. Returns the ID of the referenced
     *         security group and VPC, and the ID and status of the VPC peering
     *         connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StaleIpPermission withUserIdGroupPairs(java.util.Collection<UserIdGroupPair> userIdGroupPairs) {
        if (userIdGroupPairs == null) {
            this.userIdGroupPairs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<UserIdGroupPair> userIdGroupPairsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<UserIdGroupPair>(userIdGroupPairs.size());
            userIdGroupPairsCopy.addAll(userIdGroupPairs);
            this.userIdGroupPairs = userIdGroupPairsCopy;
        }

        return this;
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
        if (getFromPort() != null) sb.append("FromPort: " + getFromPort() + ",");
        if (getIpProtocol() != null) sb.append("IpProtocol: " + getIpProtocol() + ",");
        if (getIpRanges() != null) sb.append("IpRanges: " + getIpRanges() + ",");
        if (getPrefixListIds() != null) sb.append("PrefixListIds: " + getPrefixListIds() + ",");
        if (getToPort() != null) sb.append("ToPort: " + getToPort() + ",");
        if (getUserIdGroupPairs() != null) sb.append("UserIdGroupPairs: " + getUserIdGroupPairs() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode()); 
        hashCode = prime * hashCode + ((getIpProtocol() == null) ? 0 : getIpProtocol().hashCode()); 
        hashCode = prime * hashCode + ((getIpRanges() == null) ? 0 : getIpRanges().hashCode()); 
        hashCode = prime * hashCode + ((getPrefixListIds() == null) ? 0 : getPrefixListIds().hashCode()); 
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode()); 
        hashCode = prime * hashCode + ((getUserIdGroupPairs() == null) ? 0 : getUserIdGroupPairs().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StaleIpPermission == false) return false;
        StaleIpPermission other = (StaleIpPermission)obj;
        
        if (other.getFromPort() == null ^ this.getFromPort() == null) return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false) return false; 
        if (other.getIpProtocol() == null ^ this.getIpProtocol() == null) return false;
        if (other.getIpProtocol() != null && other.getIpProtocol().equals(this.getIpProtocol()) == false) return false; 
        if (other.getIpRanges() == null ^ this.getIpRanges() == null) return false;
        if (other.getIpRanges() != null && other.getIpRanges().equals(this.getIpRanges()) == false) return false; 
        if (other.getPrefixListIds() == null ^ this.getPrefixListIds() == null) return false;
        if (other.getPrefixListIds() != null && other.getPrefixListIds().equals(this.getPrefixListIds()) == false) return false; 
        if (other.getToPort() == null ^ this.getToPort() == null) return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false) return false; 
        if (other.getUserIdGroupPairs() == null ^ this.getUserIdGroupPairs() == null) return false;
        if (other.getUserIdGroupPairs() != null && other.getUserIdGroupPairs().equals(this.getUserIdGroupPairs()) == false) return false; 
        return true;
    }
    
}
    