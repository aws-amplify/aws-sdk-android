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
 * Describes an IPv6 CIDR block association.
 * </p>
 */
public class Ipv6CidrAssociation implements Serializable {
    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     */
    private String ipv6Cidr;

    /**
     * <p>
     * The resource that's associated with the IPv6 CIDR block.
     * </p>
     */
    private String associatedResource;

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     *
     * @return <p>
     *         The IPv6 CIDR block.
     *         </p>
     */
    public String getIpv6Cidr() {
        return ipv6Cidr;
    }

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     *
     * @param ipv6Cidr <p>
     *            The IPv6 CIDR block.
     *            </p>
     */
    public void setIpv6Cidr(String ipv6Cidr) {
        this.ipv6Cidr = ipv6Cidr;
    }

    /**
     * <p>
     * The IPv6 CIDR block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipv6Cidr <p>
     *            The IPv6 CIDR block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ipv6CidrAssociation withIpv6Cidr(String ipv6Cidr) {
        this.ipv6Cidr = ipv6Cidr;
        return this;
    }

    /**
     * <p>
     * The resource that's associated with the IPv6 CIDR block.
     * </p>
     *
     * @return <p>
     *         The resource that's associated with the IPv6 CIDR block.
     *         </p>
     */
    public String getAssociatedResource() {
        return associatedResource;
    }

    /**
     * <p>
     * The resource that's associated with the IPv6 CIDR block.
     * </p>
     *
     * @param associatedResource <p>
     *            The resource that's associated with the IPv6 CIDR block.
     *            </p>
     */
    public void setAssociatedResource(String associatedResource) {
        this.associatedResource = associatedResource;
    }

    /**
     * <p>
     * The resource that's associated with the IPv6 CIDR block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedResource <p>
     *            The resource that's associated with the IPv6 CIDR block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ipv6CidrAssociation withAssociatedResource(String associatedResource) {
        this.associatedResource = associatedResource;
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
        if (getIpv6Cidr() != null)
            sb.append("Ipv6Cidr: " + getIpv6Cidr() + ",");
        if (getAssociatedResource() != null)
            sb.append("AssociatedResource: " + getAssociatedResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpv6Cidr() == null) ? 0 : getIpv6Cidr().hashCode());
        hashCode = prime * hashCode
                + ((getAssociatedResource() == null) ? 0 : getAssociatedResource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ipv6CidrAssociation == false)
            return false;
        Ipv6CidrAssociation other = (Ipv6CidrAssociation) obj;

        if (other.getIpv6Cidr() == null ^ this.getIpv6Cidr() == null)
            return false;
        if (other.getIpv6Cidr() != null && other.getIpv6Cidr().equals(this.getIpv6Cidr()) == false)
            return false;
        if (other.getAssociatedResource() == null ^ this.getAssociatedResource() == null)
            return false;
        if (other.getAssociatedResource() != null
                && other.getAssociatedResource().equals(this.getAssociatedResource()) == false)
            return false;
        return true;
    }
}
