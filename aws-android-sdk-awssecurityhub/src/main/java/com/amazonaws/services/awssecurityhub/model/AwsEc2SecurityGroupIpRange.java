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
 * A range of IPv4 addresses.
 * </p>
 */
public class AwsEc2SecurityGroupIpRange implements Serializable {
    /**
     * <p>
     * The IPv4 CIDR range. You can either specify either a CIDR range or a
     * source security group, but not both. To specify a single IPv4 address,
     * use the /32 prefix length.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String cidrIp;

    /**
     * <p>
     * The IPv4 CIDR range. You can either specify either a CIDR range or a
     * source security group, but not both. To specify a single IPv4 address,
     * use the /32 prefix length.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The IPv4 CIDR range. You can either specify either a CIDR range
     *         or a source security group, but not both. To specify a single
     *         IPv4 address, use the /32 prefix length.
     *         </p>
     */
    public String getCidrIp() {
        return cidrIp;
    }

    /**
     * <p>
     * The IPv4 CIDR range. You can either specify either a CIDR range or a
     * source security group, but not both. To specify a single IPv4 address,
     * use the /32 prefix length.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param cidrIp <p>
     *            The IPv4 CIDR range. You can either specify either a CIDR
     *            range or a source security group, but not both. To specify a
     *            single IPv4 address, use the /32 prefix length.
     *            </p>
     */
    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }

    /**
     * <p>
     * The IPv4 CIDR range. You can either specify either a CIDR range or a
     * source security group, but not both. To specify a single IPv4 address,
     * use the /32 prefix length.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param cidrIp <p>
     *            The IPv4 CIDR range. You can either specify either a CIDR
     *            range or a source security group, but not both. To specify a
     *            single IPv4 address, use the /32 prefix length.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2SecurityGroupIpRange withCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
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
        if (getCidrIp() != null)
            sb.append("CidrIp: " + getCidrIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrIp() == null) ? 0 : getCidrIp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2SecurityGroupIpRange == false)
            return false;
        AwsEc2SecurityGroupIpRange other = (AwsEc2SecurityGroupIpRange) obj;

        if (other.getCidrIp() == null ^ this.getCidrIp() == null)
            return false;
        if (other.getCidrIp() != null && other.getCidrIp().equals(this.getCidrIp()) == false)
            return false;
        return true;
    }
}
