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
 * Describes a stale rule in a security group.
 * </p>
 */
public class StaleIpPermission implements Serializable {
    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an ICMP
     * type number. A value of <code>-1</code> indicates all ICMP types.
     * </p>
     */
    private Integer fromPort;

    /**
     * <p>
     * The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     * <code>icmp</code>) or number (see <a href=
     * "http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     * >Protocol Numbers)</a>.
     * </p>
     */
    private String ipProtocol;

    /**
     * <p>
     * The IP ranges. Not applicable for stale security group rules.
     * </p>
     */
    private java.util.List<String> ipRanges;

    /**
     * <p>
     * The prefix list IDs for an AWS service. Not applicable for stale security
     * group rules.
     * </p>
     */
    private java.util.List<String> prefixListIds;

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an ICMP type
     * number. A value of <code>-1</code> indicates all ICMP types.
     * </p>
     */
    private Integer toPort;

    /**
     * <p>
     * The security group pairs. Returns the ID of the referenced security group
     * and VPC, and the ID and status of the VPC peering connection.
     * </p>
     */
    private java.util.List<UserIdGroupPair> userIdGroupPairs;

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an ICMP
     * type number. A value of <code>-1</code> indicates all ICMP types.
     * </p>
     *
     * @return <p>
     *         The start of the port range for the TCP and UDP protocols, or an
     *         ICMP type number. A value of <code>-1</code> indicates all ICMP
     *         types.
     *         </p>
     */
    public Integer getFromPort() {
        return fromPort;
    }

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an ICMP
     * type number. A value of <code>-1</code> indicates all ICMP types.
     * </p>
     *
     * @param fromPort <p>
     *            The start of the port range for the TCP and UDP protocols, or
     *            an ICMP type number. A value of <code>-1</code> indicates all
     *            ICMP types.
     *            </p>
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an ICMP
     * type number. A value of <code>-1</code> indicates all ICMP types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fromPort <p>
     *            The start of the port range for the TCP and UDP protocols, or
     *            an ICMP type number. A value of <code>-1</code> indicates all
     *            ICMP types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaleIpPermission withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * <p>
     * The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     * <code>icmp</code>) or number (see <a href=
     * "http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     * >Protocol Numbers)</a>.
     * </p>
     *
     * @return <p>
     *         The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     *         <code>icmp</code>) or number (see <a href=
     *         "http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     *         >Protocol Numbers)</a>.
     *         </p>
     */
    public String getIpProtocol() {
        return ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     * <code>icmp</code>) or number (see <a href=
     * "http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     * >Protocol Numbers)</a>.
     * </p>
     *
     * @param ipProtocol <p>
     *            The IP protocol name (for <code>tcp</code>, <code>udp</code>,
     *            and <code>icmp</code>) or number (see <a href=
     *            "http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     *            >Protocol Numbers)</a>.
     *            </p>
     */
    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     * <code>icmp</code>) or number (see <a href=
     * "http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     * >Protocol Numbers)</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipProtocol <p>
     *            The IP protocol name (for <code>tcp</code>, <code>udp</code>,
     *            and <code>icmp</code>) or number (see <a href=
     *            "http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml"
     *            >Protocol Numbers)</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaleIpPermission withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * <p>
     * The IP ranges. Not applicable for stale security group rules.
     * </p>
     *
     * @return <p>
     *         The IP ranges. Not applicable for stale security group rules.
     *         </p>
     */
    public java.util.List<String> getIpRanges() {
        return ipRanges;
    }

    /**
     * <p>
     * The IP ranges. Not applicable for stale security group rules.
     * </p>
     *
     * @param ipRanges <p>
     *            The IP ranges. Not applicable for stale security group rules.
     *            </p>
     */
    public void setIpRanges(java.util.Collection<String> ipRanges) {
        if (ipRanges == null) {
            this.ipRanges = null;
            return;
        }

        this.ipRanges = new java.util.ArrayList<String>(ipRanges);
    }

    /**
     * <p>
     * The IP ranges. Not applicable for stale security group rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipRanges <p>
     *            The IP ranges. Not applicable for stale security group rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaleIpPermission withIpRanges(String... ipRanges) {
        if (getIpRanges() == null) {
            this.ipRanges = new java.util.ArrayList<String>(ipRanges.length);
        }
        for (String value : ipRanges) {
            this.ipRanges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IP ranges. Not applicable for stale security group rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipRanges <p>
     *            The IP ranges. Not applicable for stale security group rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaleIpPermission withIpRanges(java.util.Collection<String> ipRanges) {
        setIpRanges(ipRanges);
        return this;
    }

    /**
     * <p>
     * The prefix list IDs for an AWS service. Not applicable for stale security
     * group rules.
     * </p>
     *
     * @return <p>
     *         The prefix list IDs for an AWS service. Not applicable for stale
     *         security group rules.
     *         </p>
     */
    public java.util.List<String> getPrefixListIds() {
        return prefixListIds;
    }

    /**
     * <p>
     * The prefix list IDs for an AWS service. Not applicable for stale security
     * group rules.
     * </p>
     *
     * @param prefixListIds <p>
     *            The prefix list IDs for an AWS service. Not applicable for
     *            stale security group rules.
     *            </p>
     */
    public void setPrefixListIds(java.util.Collection<String> prefixListIds) {
        if (prefixListIds == null) {
            this.prefixListIds = null;
            return;
        }

        this.prefixListIds = new java.util.ArrayList<String>(prefixListIds);
    }

    /**
     * <p>
     * The prefix list IDs for an AWS service. Not applicable for stale security
     * group rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefixListIds <p>
     *            The prefix list IDs for an AWS service. Not applicable for
     *            stale security group rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaleIpPermission withPrefixListIds(String... prefixListIds) {
        if (getPrefixListIds() == null) {
            this.prefixListIds = new java.util.ArrayList<String>(prefixListIds.length);
        }
        for (String value : prefixListIds) {
            this.prefixListIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The prefix list IDs for an AWS service. Not applicable for stale security
     * group rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefixListIds <p>
     *            The prefix list IDs for an AWS service. Not applicable for
     *            stale security group rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaleIpPermission withPrefixListIds(java.util.Collection<String> prefixListIds) {
        setPrefixListIds(prefixListIds);
        return this;
    }

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an ICMP type
     * number. A value of <code>-1</code> indicates all ICMP types.
     * </p>
     *
     * @return <p>
     *         The end of the port range for the TCP and UDP protocols, or an
     *         ICMP type number. A value of <code>-1</code> indicates all ICMP
     *         types.
     *         </p>
     */
    public Integer getToPort() {
        return toPort;
    }

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an ICMP type
     * number. A value of <code>-1</code> indicates all ICMP types.
     * </p>
     *
     * @param toPort <p>
     *            The end of the port range for the TCP and UDP protocols, or an
     *            ICMP type number. A value of <code>-1</code> indicates all
     *            ICMP types.
     *            </p>
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an ICMP type
     * number. A value of <code>-1</code> indicates all ICMP types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param toPort <p>
     *            The end of the port range for the TCP and UDP protocols, or an
     *            ICMP type number. A value of <code>-1</code> indicates all
     *            ICMP types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaleIpPermission withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    /**
     * <p>
     * The security group pairs. Returns the ID of the referenced security group
     * and VPC, and the ID and status of the VPC peering connection.
     * </p>
     *
     * @return <p>
     *         The security group pairs. Returns the ID of the referenced
     *         security group and VPC, and the ID and status of the VPC peering
     *         connection.
     *         </p>
     */
    public java.util.List<UserIdGroupPair> getUserIdGroupPairs() {
        return userIdGroupPairs;
    }

    /**
     * <p>
     * The security group pairs. Returns the ID of the referenced security group
     * and VPC, and the ID and status of the VPC peering connection.
     * </p>
     *
     * @param userIdGroupPairs <p>
     *            The security group pairs. Returns the ID of the referenced
     *            security group and VPC, and the ID and status of the VPC
     *            peering connection.
     *            </p>
     */
    public void setUserIdGroupPairs(java.util.Collection<UserIdGroupPair> userIdGroupPairs) {
        if (userIdGroupPairs == null) {
            this.userIdGroupPairs = null;
            return;
        }

        this.userIdGroupPairs = new java.util.ArrayList<UserIdGroupPair>(userIdGroupPairs);
    }

    /**
     * <p>
     * The security group pairs. Returns the ID of the referenced security group
     * and VPC, and the ID and status of the VPC peering connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIdGroupPairs <p>
     *            The security group pairs. Returns the ID of the referenced
     *            security group and VPC, and the ID and status of the VPC
     *            peering connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaleIpPermission withUserIdGroupPairs(UserIdGroupPair... userIdGroupPairs) {
        if (getUserIdGroupPairs() == null) {
            this.userIdGroupPairs = new java.util.ArrayList<UserIdGroupPair>(
                    userIdGroupPairs.length);
        }
        for (UserIdGroupPair value : userIdGroupPairs) {
            this.userIdGroupPairs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The security group pairs. Returns the ID of the referenced security group
     * and VPC, and the ID and status of the VPC peering connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIdGroupPairs <p>
     *            The security group pairs. Returns the ID of the referenced
     *            security group and VPC, and the ID and status of the VPC
     *            peering connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaleIpPermission withUserIdGroupPairs(
            java.util.Collection<UserIdGroupPair> userIdGroupPairs) {
        setUserIdGroupPairs(userIdGroupPairs);
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
        if (getFromPort() != null)
            sb.append("FromPort: " + getFromPort() + ",");
        if (getIpProtocol() != null)
            sb.append("IpProtocol: " + getIpProtocol() + ",");
        if (getIpRanges() != null)
            sb.append("IpRanges: " + getIpRanges() + ",");
        if (getPrefixListIds() != null)
            sb.append("PrefixListIds: " + getPrefixListIds() + ",");
        if (getToPort() != null)
            sb.append("ToPort: " + getToPort() + ",");
        if (getUserIdGroupPairs() != null)
            sb.append("UserIdGroupPairs: " + getUserIdGroupPairs());
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
        hashCode = prime * hashCode
                + ((getPrefixListIds() == null) ? 0 : getPrefixListIds().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode
                + ((getUserIdGroupPairs() == null) ? 0 : getUserIdGroupPairs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StaleIpPermission == false)
            return false;
        StaleIpPermission other = (StaleIpPermission) obj;

        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getIpProtocol() == null ^ this.getIpProtocol() == null)
            return false;
        if (other.getIpProtocol() != null
                && other.getIpProtocol().equals(this.getIpProtocol()) == false)
            return false;
        if (other.getIpRanges() == null ^ this.getIpRanges() == null)
            return false;
        if (other.getIpRanges() != null && other.getIpRanges().equals(this.getIpRanges()) == false)
            return false;
        if (other.getPrefixListIds() == null ^ this.getPrefixListIds() == null)
            return false;
        if (other.getPrefixListIds() != null
                && other.getPrefixListIds().equals(this.getPrefixListIds()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        if (other.getUserIdGroupPairs() == null ^ this.getUserIdGroupPairs() == null)
            return false;
        if (other.getUserIdGroupPairs() != null
                && other.getUserIdGroupPairs().equals(this.getUserIdGroupPairs()) == false)
            return false;
        return true;
    }
}
