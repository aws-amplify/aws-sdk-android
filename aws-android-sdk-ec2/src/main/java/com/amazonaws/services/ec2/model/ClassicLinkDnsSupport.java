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
 * Describes the ClassicLink DNS support status of a VPC.
 * </p>
 */
public class ClassicLinkDnsSupport implements Serializable {
    /**
     * <p>
     * Indicates whether ClassicLink DNS support is enabled for the VPC.
     * </p>
     */
    private Boolean classicLinkDnsSupported;

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Indicates whether ClassicLink DNS support is enabled for the VPC.
     * </p>
     *
     * @return <p>
     *         Indicates whether ClassicLink DNS support is enabled for the VPC.
     *         </p>
     */
    public Boolean isClassicLinkDnsSupported() {
        return classicLinkDnsSupported;
    }

    /**
     * <p>
     * Indicates whether ClassicLink DNS support is enabled for the VPC.
     * </p>
     *
     * @return <p>
     *         Indicates whether ClassicLink DNS support is enabled for the VPC.
     *         </p>
     */
    public Boolean getClassicLinkDnsSupported() {
        return classicLinkDnsSupported;
    }

    /**
     * <p>
     * Indicates whether ClassicLink DNS support is enabled for the VPC.
     * </p>
     *
     * @param classicLinkDnsSupported <p>
     *            Indicates whether ClassicLink DNS support is enabled for the
     *            VPC.
     *            </p>
     */
    public void setClassicLinkDnsSupported(Boolean classicLinkDnsSupported) {
        this.classicLinkDnsSupported = classicLinkDnsSupported;
    }

    /**
     * <p>
     * Indicates whether ClassicLink DNS support is enabled for the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classicLinkDnsSupported <p>
     *            Indicates whether ClassicLink DNS support is enabled for the
     *            VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassicLinkDnsSupport withClassicLinkDnsSupported(Boolean classicLinkDnsSupported) {
        this.classicLinkDnsSupported = classicLinkDnsSupported;
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
    public ClassicLinkDnsSupport withVpcId(String vpcId) {
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
        if (getClassicLinkDnsSupported() != null)
            sb.append("ClassicLinkDnsSupported: " + getClassicLinkDnsSupported() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getClassicLinkDnsSupported() == null) ? 0 : getClassicLinkDnsSupported()
                        .hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassicLinkDnsSupport == false)
            return false;
        ClassicLinkDnsSupport other = (ClassicLinkDnsSupport) obj;

        if (other.getClassicLinkDnsSupported() == null ^ this.getClassicLinkDnsSupported() == null)
            return false;
        if (other.getClassicLinkDnsSupported() != null
                && other.getClassicLinkDnsSupported().equals(this.getClassicLinkDnsSupported()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }
}
