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
 * Describes whether a VPC is enabled for ClassicLink.
 * </p>
 */
public class VpcClassicLink implements Serializable {
    /**
     * <p>
     * Indicates whether the VPC is enabled for ClassicLink.
     * </p>
     */
    private Boolean classicLinkEnabled;

    /**
     * <p>
     * Any tags assigned to the VPC.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Indicates whether the VPC is enabled for ClassicLink.
     * </p>
     *
     * @return <p>
     *         Indicates whether the VPC is enabled for ClassicLink.
     *         </p>
     */
    public Boolean isClassicLinkEnabled() {
        return classicLinkEnabled;
    }

    /**
     * <p>
     * Indicates whether the VPC is enabled for ClassicLink.
     * </p>
     *
     * @return <p>
     *         Indicates whether the VPC is enabled for ClassicLink.
     *         </p>
     */
    public Boolean getClassicLinkEnabled() {
        return classicLinkEnabled;
    }

    /**
     * <p>
     * Indicates whether the VPC is enabled for ClassicLink.
     * </p>
     *
     * @param classicLinkEnabled <p>
     *            Indicates whether the VPC is enabled for ClassicLink.
     *            </p>
     */
    public void setClassicLinkEnabled(Boolean classicLinkEnabled) {
        this.classicLinkEnabled = classicLinkEnabled;
    }

    /**
     * <p>
     * Indicates whether the VPC is enabled for ClassicLink.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classicLinkEnabled <p>
     *            Indicates whether the VPC is enabled for ClassicLink.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcClassicLink withClassicLinkEnabled(Boolean classicLinkEnabled) {
        this.classicLinkEnabled = classicLinkEnabled;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the VPC.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the VPC.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the VPC.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the VPC.
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
     * Any tags assigned to the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcClassicLink withTags(Tag... tags) {
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
     * Any tags assigned to the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcClassicLink withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the VPC.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VpcClassicLink withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
        if (getClassicLinkEnabled() != null)
            sb.append("ClassicLinkEnabled: " + getClassicLinkEnabled() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClassicLinkEnabled() == null) ? 0 : getClassicLinkEnabled().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcClassicLink == false)
            return false;
        VpcClassicLink other = (VpcClassicLink) obj;

        if (other.getClassicLinkEnabled() == null ^ this.getClassicLinkEnabled() == null)
            return false;
        if (other.getClassicLinkEnabled() != null
                && other.getClassicLinkEnabled().equals(this.getClassicLinkEnabled()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }
}
