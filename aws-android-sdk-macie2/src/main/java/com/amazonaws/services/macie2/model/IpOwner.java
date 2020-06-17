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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Reserved for future use.
 * </p>
 */
public class IpOwner implements Serializable {
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String asn;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String asnOrg;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String isp;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String org;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getAsn() {
        return asn;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param asn <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setAsn(String asn) {
        this.asn = asn;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param asn <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IpOwner withAsn(String asn) {
        this.asn = asn;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getAsnOrg() {
        return asnOrg;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param asnOrg <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setAsnOrg(String asnOrg) {
        this.asnOrg = asnOrg;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param asnOrg <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IpOwner withAsnOrg(String asnOrg) {
        this.asnOrg = asnOrg;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getIsp() {
        return isp;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param isp <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setIsp(String isp) {
        this.isp = isp;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isp <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IpOwner withIsp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getOrg() {
        return org;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     *
     * @param org <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setOrg(String org) {
        this.org = org;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param org <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IpOwner withOrg(String org) {
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
            sb.append("asn: " + getAsn() + ",");
        if (getAsnOrg() != null)
            sb.append("asnOrg: " + getAsnOrg() + ",");
        if (getIsp() != null)
            sb.append("isp: " + getIsp() + ",");
        if (getOrg() != null)
            sb.append("org: " + getOrg());
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

        if (obj instanceof IpOwner == false)
            return false;
        IpOwner other = (IpOwner) obj;

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
