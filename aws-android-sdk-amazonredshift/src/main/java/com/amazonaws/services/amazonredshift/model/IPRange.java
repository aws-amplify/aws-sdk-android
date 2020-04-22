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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an IP range used in a security group.
 * </p>
 */
public class IPRange implements Serializable {
    /**
     * <p>
     * The status of the IP range, for example, "authorized".
     * </p>
     */
    private String status;

    /**
     * <p>
     * The IP range in Classless Inter-Domain Routing (CIDR) notation.
     * </p>
     */
    private String cIDRIP;

    /**
     * <p>
     * The list of tags for the IP range.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The status of the IP range, for example, "authorized".
     * </p>
     *
     * @return <p>
     *         The status of the IP range, for example, "authorized".
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the IP range, for example, "authorized".
     * </p>
     *
     * @param status <p>
     *            The status of the IP range, for example, "authorized".
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the IP range, for example, "authorized".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the IP range, for example, "authorized".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IPRange withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The IP range in Classless Inter-Domain Routing (CIDR) notation.
     * </p>
     *
     * @return <p>
     *         The IP range in Classless Inter-Domain Routing (CIDR) notation.
     *         </p>
     */
    public String getCIDRIP() {
        return cIDRIP;
    }

    /**
     * <p>
     * The IP range in Classless Inter-Domain Routing (CIDR) notation.
     * </p>
     *
     * @param cIDRIP <p>
     *            The IP range in Classless Inter-Domain Routing (CIDR)
     *            notation.
     *            </p>
     */
    public void setCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
    }

    /**
     * <p>
     * The IP range in Classless Inter-Domain Routing (CIDR) notation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cIDRIP <p>
     *            The IP range in Classless Inter-Domain Routing (CIDR)
     *            notation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IPRange withCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
        return this;
    }

    /**
     * <p>
     * The list of tags for the IP range.
     * </p>
     *
     * @return <p>
     *         The list of tags for the IP range.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags for the IP range.
     * </p>
     *
     * @param tags <p>
     *            The list of tags for the IP range.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags for the IP range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags for the IP range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IPRange withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags for the IP range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tags for the IP range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IPRange withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCIDRIP() != null)
            sb.append("CIDRIP: " + getCIDRIP() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCIDRIP() == null) ? 0 : getCIDRIP().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IPRange == false)
            return false;
        IPRange other = (IPRange) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCIDRIP() == null ^ this.getCIDRIP() == null)
            return false;
        if (other.getCIDRIP() != null && other.getCIDRIP().equals(this.getCIDRIP()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
