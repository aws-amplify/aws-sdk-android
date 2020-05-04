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
 * Describes a set of DHCP options.
 * </p>
 */
public class DhcpOptions implements Serializable {
    /**
     * <p>
     * One or more DHCP options in the set.
     * </p>
     */
    private java.util.List<DhcpConfiguration> dhcpConfigurations;

    /**
     * <p>
     * The ID of the set of DHCP options.
     * </p>
     */
    private String dhcpOptionsId;

    /**
     * <p>
     * The ID of the AWS account that owns the DHCP options set.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * Any tags assigned to the DHCP options set.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * One or more DHCP options in the set.
     * </p>
     *
     * @return <p>
     *         One or more DHCP options in the set.
     *         </p>
     */
    public java.util.List<DhcpConfiguration> getDhcpConfigurations() {
        return dhcpConfigurations;
    }

    /**
     * <p>
     * One or more DHCP options in the set.
     * </p>
     *
     * @param dhcpConfigurations <p>
     *            One or more DHCP options in the set.
     *            </p>
     */
    public void setDhcpConfigurations(java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        if (dhcpConfigurations == null) {
            this.dhcpConfigurations = null;
            return;
        }

        this.dhcpConfigurations = new java.util.ArrayList<DhcpConfiguration>(dhcpConfigurations);
    }

    /**
     * <p>
     * One or more DHCP options in the set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dhcpConfigurations <p>
     *            One or more DHCP options in the set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DhcpOptions withDhcpConfigurations(DhcpConfiguration... dhcpConfigurations) {
        if (getDhcpConfigurations() == null) {
            this.dhcpConfigurations = new java.util.ArrayList<DhcpConfiguration>(
                    dhcpConfigurations.length);
        }
        for (DhcpConfiguration value : dhcpConfigurations) {
            this.dhcpConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more DHCP options in the set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dhcpConfigurations <p>
     *            One or more DHCP options in the set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DhcpOptions withDhcpConfigurations(
            java.util.Collection<DhcpConfiguration> dhcpConfigurations) {
        setDhcpConfigurations(dhcpConfigurations);
        return this;
    }

    /**
     * <p>
     * The ID of the set of DHCP options.
     * </p>
     *
     * @return <p>
     *         The ID of the set of DHCP options.
     *         </p>
     */
    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }

    /**
     * <p>
     * The ID of the set of DHCP options.
     * </p>
     *
     * @param dhcpOptionsId <p>
     *            The ID of the set of DHCP options.
     *            </p>
     */
    public void setDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
    }

    /**
     * <p>
     * The ID of the set of DHCP options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dhcpOptionsId <p>
     *            The ID of the set of DHCP options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DhcpOptions withDhcpOptionsId(String dhcpOptionsId) {
        this.dhcpOptionsId = dhcpOptionsId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the DHCP options set.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the DHCP options set.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the DHCP options set.
     * </p>
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the DHCP options set.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the DHCP options set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the DHCP options set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DhcpOptions withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the DHCP options set.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the DHCP options set.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the DHCP options set.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the DHCP options set.
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
     * Any tags assigned to the DHCP options set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the DHCP options set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DhcpOptions withTags(Tag... tags) {
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
     * Any tags assigned to the DHCP options set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the DHCP options set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DhcpOptions withTags(java.util.Collection<Tag> tags) {
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
        if (getDhcpConfigurations() != null)
            sb.append("DhcpConfigurations: " + getDhcpConfigurations() + ",");
        if (getDhcpOptionsId() != null)
            sb.append("DhcpOptionsId: " + getDhcpOptionsId() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDhcpConfigurations() == null) ? 0 : getDhcpConfigurations().hashCode());
        hashCode = prime * hashCode
                + ((getDhcpOptionsId() == null) ? 0 : getDhcpOptionsId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DhcpOptions == false)
            return false;
        DhcpOptions other = (DhcpOptions) obj;

        if (other.getDhcpConfigurations() == null ^ this.getDhcpConfigurations() == null)
            return false;
        if (other.getDhcpConfigurations() != null
                && other.getDhcpConfigurations().equals(this.getDhcpConfigurations()) == false)
            return false;
        if (other.getDhcpOptionsId() == null ^ this.getDhcpOptionsId() == null)
            return false;
        if (other.getDhcpOptionsId() != null
                && other.getDhcpOptionsId().equals(this.getDhcpOptionsId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
