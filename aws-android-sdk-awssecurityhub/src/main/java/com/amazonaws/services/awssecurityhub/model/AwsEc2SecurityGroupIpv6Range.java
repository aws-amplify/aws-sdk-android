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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * A range of IPv6 addresses.
 * </p>
 */
public class AwsEc2SecurityGroupIpv6Range implements Serializable {
    /**
     * <p>
     * The IPv6 CIDR range. You can either specify either a CIDR range or a
     * source security group, but not both. To specify a single IPv6 address,
     * use the /128 prefix length.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String cidrIpv6;

    /**
     * <p>
     * The IPv6 CIDR range. You can either specify either a CIDR range or a
     * source security group, but not both. To specify a single IPv6 address,
     * use the /128 prefix length.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The IPv6 CIDR range. You can either specify either a CIDR range
     *         or a source security group, but not both. To specify a single
     *         IPv6 address, use the /128 prefix length.
     *         </p>
     */
    public String getCidrIpv6() {
        return cidrIpv6;
    }

    /**
     * <p>
     * The IPv6 CIDR range. You can either specify either a CIDR range or a
     * source security group, but not both. To specify a single IPv6 address,
     * use the /128 prefix length.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param cidrIpv6 <p>
     *            The IPv6 CIDR range. You can either specify either a CIDR
     *            range or a source security group, but not both. To specify a
     *            single IPv6 address, use the /128 prefix length.
     *            </p>
     */
    public void setCidrIpv6(String cidrIpv6) {
        this.cidrIpv6 = cidrIpv6;
    }

    /**
     * <p>
     * The IPv6 CIDR range. You can either specify either a CIDR range or a
     * source security group, but not both. To specify a single IPv6 address,
     * use the /128 prefix length.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param cidrIpv6 <p>
     *            The IPv6 CIDR range. You can either specify either a CIDR
     *            range or a source security group, but not both. To specify a
     *            single IPv6 address, use the /128 prefix length.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupIpv6Range withCidrIpv6(String cidrIpv6) {
        this.cidrIpv6 = cidrIpv6;
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
        if (getCidrIpv6() != null)
            sb.append("CidrIpv6: " + getCidrIpv6());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrIpv6() == null) ? 0 : getCidrIpv6().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2SecurityGroupIpv6Range == false)
            return false;
        AwsEc2SecurityGroupIpv6Range other = (AwsEc2SecurityGroupIpv6Range) obj;

        if (other.getCidrIpv6() == null ^ this.getCidrIpv6() == null)
            return false;
        if (other.getCidrIpv6() != null && other.getCidrIpv6().equals(this.getCidrIpv6()) == false)
            return false;
        return true;
    }
}
