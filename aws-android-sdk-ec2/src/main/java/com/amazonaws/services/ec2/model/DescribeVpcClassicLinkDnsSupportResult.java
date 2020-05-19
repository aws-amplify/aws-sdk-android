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

public class DescribeVpcClassicLinkDnsSupportResult implements Serializable {
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the ClassicLink DNS support status of the VPCs.
     * </p>
     */
    private java.util.List<ClassicLinkDnsSupport> vpcs;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. This value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcClassicLinkDnsSupportResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Information about the ClassicLink DNS support status of the VPCs.
     * </p>
     *
     * @return <p>
     *         Information about the ClassicLink DNS support status of the VPCs.
     *         </p>
     */
    public java.util.List<ClassicLinkDnsSupport> getVpcs() {
        return vpcs;
    }

    /**
     * <p>
     * Information about the ClassicLink DNS support status of the VPCs.
     * </p>
     *
     * @param vpcs <p>
     *            Information about the ClassicLink DNS support status of the
     *            VPCs.
     *            </p>
     */
    public void setVpcs(java.util.Collection<ClassicLinkDnsSupport> vpcs) {
        if (vpcs == null) {
            this.vpcs = null;
            return;
        }

        this.vpcs = new java.util.ArrayList<ClassicLinkDnsSupport>(vpcs);
    }

    /**
     * <p>
     * Information about the ClassicLink DNS support status of the VPCs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcs <p>
     *            Information about the ClassicLink DNS support status of the
     *            VPCs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcClassicLinkDnsSupportResult withVpcs(ClassicLinkDnsSupport... vpcs) {
        if (getVpcs() == null) {
            this.vpcs = new java.util.ArrayList<ClassicLinkDnsSupport>(vpcs.length);
        }
        for (ClassicLinkDnsSupport value : vpcs) {
            this.vpcs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the ClassicLink DNS support status of the VPCs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcs <p>
     *            Information about the ClassicLink DNS support status of the
     *            VPCs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcClassicLinkDnsSupportResult withVpcs(
            java.util.Collection<ClassicLinkDnsSupport> vpcs) {
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getVpcs() != null)
            sb.append("Vpcs: " + getVpcs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVpcs() == null) ? 0 : getVpcs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcClassicLinkDnsSupportResult == false)
            return false;
        DescribeVpcClassicLinkDnsSupportResult other = (DescribeVpcClassicLinkDnsSupportResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVpcs() == null ^ this.getVpcs() == null)
            return false;
        if (other.getVpcs() != null && other.getVpcs().equals(this.getVpcs()) == false)
            return false;
        return true;
    }
}
