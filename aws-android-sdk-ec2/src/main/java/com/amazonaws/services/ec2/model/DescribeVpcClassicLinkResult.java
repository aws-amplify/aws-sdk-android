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

public class DescribeVpcClassicLinkResult implements Serializable {
    /**
     * <p>
     * The ClassicLink status of one or more VPCs.
     * </p>
     */
    private java.util.List<VpcClassicLink> vpcs;

    /**
     * <p>
     * The ClassicLink status of one or more VPCs.
     * </p>
     *
     * @return <p>
     *         The ClassicLink status of one or more VPCs.
     *         </p>
     */
    public java.util.List<VpcClassicLink> getVpcs() {
        return vpcs;
    }

    /**
     * <p>
     * The ClassicLink status of one or more VPCs.
     * </p>
     *
     * @param vpcs <p>
     *            The ClassicLink status of one or more VPCs.
     *            </p>
     */
    public void setVpcs(java.util.Collection<VpcClassicLink> vpcs) {
        if (vpcs == null) {
            this.vpcs = null;
            return;
        }

        this.vpcs = new java.util.ArrayList<VpcClassicLink>(vpcs);
    }

    /**
     * <p>
     * The ClassicLink status of one or more VPCs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcs <p>
     *            The ClassicLink status of one or more VPCs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcClassicLinkResult withVpcs(VpcClassicLink... vpcs) {
        if (getVpcs() == null) {
            this.vpcs = new java.util.ArrayList<VpcClassicLink>(vpcs.length);
        }
        for (VpcClassicLink value : vpcs) {
            this.vpcs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ClassicLink status of one or more VPCs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcs <p>
     *            The ClassicLink status of one or more VPCs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcClassicLinkResult withVpcs(java.util.Collection<VpcClassicLink> vpcs) {
        setVpcs(vpcs);
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
        if (getVpcs() != null)
            sb.append("Vpcs: " + getVpcs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcs() == null) ? 0 : getVpcs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcClassicLinkResult == false)
            return false;
        DescribeVpcClassicLinkResult other = (DescribeVpcClassicLinkResult) obj;

        if (other.getVpcs() == null ^ this.getVpcs() == null)
            return false;
        if (other.getVpcs() != null && other.getVpcs().equals(this.getVpcs()) == false)
            return false;
        return true;
    }
}
