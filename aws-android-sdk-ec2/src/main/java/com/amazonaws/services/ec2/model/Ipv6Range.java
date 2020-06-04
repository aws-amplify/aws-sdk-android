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
 * [EC2-VPC only] Describes an IPv6 range.
 * </p>
 */
public class Ipv6Range implements Serializable {
    /**
     * <p>
     * The IPv6 CIDR range. You can either specify a CIDR range or a source
     * security group, not both. To specify a single IPv6 address, use the /128
     * prefix length.
     * </p>
     */
    private String cidrIpv6;

    /**
     * <p>
     * A description for the security group rule that references this IPv6
     * address range.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Allowed characters are a-z,
     * A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     */
    private String description;

    /**
     * <p>
     * The IPv6 CIDR range. You can either specify a CIDR range or a source
     * security group, not both. To specify a single IPv6 address, use the /128
     * prefix length.
     * </p>
     *
     * @return <p>
     *         The IPv6 CIDR range. You can either specify a CIDR range or a
     *         source security group, not both. To specify a single IPv6
     *         address, use the /128 prefix length.
     *         </p>
     */
    public String getCidrIpv6() {
        return cidrIpv6;
    }

    /**
     * <p>
     * The IPv6 CIDR range. You can either specify a CIDR range or a source
     * security group, not both. To specify a single IPv6 address, use the /128
     * prefix length.
     * </p>
     *
     * @param cidrIpv6 <p>
     *            The IPv6 CIDR range. You can either specify a CIDR range or a
     *            source security group, not both. To specify a single IPv6
     *            address, use the /128 prefix length.
     *            </p>
     */
    public void setCidrIpv6(String cidrIpv6) {
        this.cidrIpv6 = cidrIpv6;
    }

    /**
     * <p>
     * The IPv6 CIDR range. You can either specify a CIDR range or a source
     * security group, not both. To specify a single IPv6 address, use the /128
     * prefix length.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrIpv6 <p>
     *            The IPv6 CIDR range. You can either specify a CIDR range or a
     *            source security group, not both. To specify a single IPv6
     *            address, use the /128 prefix length.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ipv6Range withCidrIpv6(String cidrIpv6) {
        this.cidrIpv6 = cidrIpv6;
        return this;
    }

    /**
     * <p>
     * A description for the security group rule that references this IPv6
     * address range.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Allowed characters are a-z,
     * A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     *
     * @return <p>
     *         A description for the security group rule that references this
     *         IPv6 address range.
     *         </p>
     *         <p>
     *         Constraints: Up to 255 characters in length. Allowed characters
     *         are a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the security group rule that references this IPv6
     * address range.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Allowed characters are a-z,
     * A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     *
     * @param description <p>
     *            A description for the security group rule that references this
     *            IPv6 address range.
     *            </p>
     *            <p>
     *            Constraints: Up to 255 characters in length. Allowed
     *            characters are a-z, A-Z, 0-9, spaces, and
     *            ._-:/()#,@[]+=&amp;;{}!$*
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the security group rule that references this IPv6
     * address range.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Allowed characters are a-z,
     * A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the security group rule that references this
     *            IPv6 address range.
     *            </p>
     *            <p>
     *            Constraints: Up to 255 characters in length. Allowed
     *            characters are a-z, A-Z, 0-9, spaces, and
     *            ._-:/()#,@[]+=&amp;;{}!$*
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ipv6Range withDescription(String description) {
        this.description = description;
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
            sb.append("CidrIpv6: " + getCidrIpv6() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrIpv6() == null) ? 0 : getCidrIpv6().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ipv6Range == false)
            return false;
        Ipv6Range other = (Ipv6Range) obj;

        if (other.getCidrIpv6() == null ^ this.getCidrIpv6() == null)
            return false;
        if (other.getCidrIpv6() != null && other.getCidrIpv6().equals(this.getCidrIpv6()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
