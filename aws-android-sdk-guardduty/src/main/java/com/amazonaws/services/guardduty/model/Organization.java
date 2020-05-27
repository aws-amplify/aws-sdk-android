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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the ISP organization of the remote IP address.
 * </p>
 */
public class Organization implements Serializable {
    /**
     * <p>
     * The Autonomous System Number (ASN) of the internet provider of the remote
     * IP address.
     * </p>
     */
    private String asn;

    /**
     * <p>
     * The organization that registered this ASN.
     * </p>
     */
    private String asnOrg;

    /**
     * <p>
     * The ISP information for the internet provider.
     * </p>
     */
    private String isp;

    /**
     * <p>
     * The name of the internet provider.
     * </p>
     */
    private String org;

    /**
     * <p>
     * The Autonomous System Number (ASN) of the internet provider of the remote
     * IP address.
     * </p>
     *
     * @return <p>
     *         The Autonomous System Number (ASN) of the internet provider of
     *         the remote IP address.
     *         </p>
     */
    public String getAsn() {
        return asn;
    }

    /**
     * <p>
     * The Autonomous System Number (ASN) of the internet provider of the remote
     * IP address.
     * </p>
     *
     * @param asn <p>
     *            The Autonomous System Number (ASN) of the internet provider of
     *            the remote IP address.
     *            </p>
     */
    public void setAsn(String asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * The Autonomous System Number (ASN) of the internet provider of the remote
     * IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param asn <p>
     *            The Autonomous System Number (ASN) of the internet provider of
     *            the remote IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Organization withAsn(String asn) {
        this.asn = asn;
        return this;
    }

    /**
     * <p>
     * The organization that registered this ASN.
     * </p>
     *
     * @return <p>
     *         The organization that registered this ASN.
     *         </p>
     */
    public String getAsnOrg() {
        return asnOrg;
    }

    /**
     * <p>
     * The organization that registered this ASN.
     * </p>
     *
     * @param asnOrg <p>
     *            The organization that registered this ASN.
     *            </p>
     */
    public void setAsnOrg(String asnOrg) {
        this.asnOrg = asnOrg;
    }

    /**
     * <p>
     * The organization that registered this ASN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param asnOrg <p>
     *            The organization that registered this ASN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Organization withAsnOrg(String asnOrg) {
        this.asnOrg = asnOrg;
        return this;
    }

    /**
     * <p>
     * The ISP information for the internet provider.
     * </p>
     *
     * @return <p>
     *         The ISP information for the internet provider.
     *         </p>
     */
    public String getIsp() {
        return isp;
    }

    /**
     * <p>
     * The ISP information for the internet provider.
     * </p>
     *
     * @param isp <p>
     *            The ISP information for the internet provider.
     *            </p>
     */
    public void setIsp(String isp) {
        this.isp = isp;
    }

    /**
     * <p>
     * The ISP information for the internet provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isp <p>
     *            The ISP information for the internet provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Organization withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * <p>
     * The name of the internet provider.
     * </p>
     *
     * @return <p>
     *         The name of the internet provider.
     *         </p>
     */
    public String getOrg() {
        return org;
    }

    /**
     * <p>
     * The name of the internet provider.
     * </p>
     *
     * @param org <p>
     *            The name of the internet provider.
     *            </p>
     */
    public void setOrg(String org) {
        this.org = org;
    }

    /**
     * <p>
     * The name of the internet provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param org <p>
     *            The name of the internet provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Organization withOrg(String org) {
        this.org = org;
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
        if (getAsn() != null)
            sb.append("Asn: " + getAsn() + ",");
        if (getAsnOrg() != null)
            sb.append("AsnOrg: " + getAsnOrg() + ",");
        if (getIsp() != null)
            sb.append("Isp: " + getIsp() + ",");
        if (getOrg() != null)
            sb.append("Org: " + getOrg());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode());
        hashCode = prime * hashCode + ((getAsnOrg() == null) ? 0 : getAsnOrg().hashCode());
        hashCode = prime * hashCode + ((getIsp() == null) ? 0 : getIsp().hashCode());
        hashCode = prime * hashCode + ((getOrg() == null) ? 0 : getOrg().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Organization == false)
            return false;
        Organization other = (Organization) obj;

        if (other.getAsn() == null ^ this.getAsn() == null)
            return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false)
            return false;
        if (other.getAsnOrg() == null ^ this.getAsnOrg() == null)
            return false;
        if (other.getAsnOrg() != null && other.getAsnOrg().equals(this.getAsnOrg()) == false)
            return false;
        if (other.getIsp() == null ^ this.getIsp() == null)
            return false;
        if (other.getIsp() != null && other.getIsp().equals(this.getIsp()) == false)
            return false;
        if (other.getOrg() == null ^ this.getOrg() == null)
            return false;
        if (other.getOrg() != null && other.getOrg().equals(this.getOrg()) == false)
            return false;
        return true;
    }
}
