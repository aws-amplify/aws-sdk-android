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
 * Contains the output for DescribeNetworkInterfacePermissions.
 * </p>
 */
public class DescribeNetworkInterfacePermissionsResult implements Serializable {
    /**
     * <p>
     * The network interface permissions.
     * </p>
     */
    private java.util.List<NetworkInterfacePermission> networkInterfacePermissions;

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The network interface permissions.
     * </p>
     *
     * @return <p>
     *         The network interface permissions.
     *         </p>
     */
    public java.util.List<NetworkInterfacePermission> getNetworkInterfacePermissions() {
        return networkInterfacePermissions;
    }

    /**
     * <p>
     * The network interface permissions.
     * </p>
     *
     * @param networkInterfacePermissions <p>
     *            The network interface permissions.
     *            </p>
     */
    public void setNetworkInterfacePermissions(
            java.util.Collection<NetworkInterfacePermission> networkInterfacePermissions) {
        if (networkInterfacePermissions == null) {
            this.networkInterfacePermissions = null;
            return;
        }

        this.networkInterfacePermissions = new java.util.ArrayList<NetworkInterfacePermission>(
                networkInterfacePermissions);
    }

    /**
     * <p>
     * The network interface permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfacePermissions <p>
     *            The network interface permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfacePermissionsResult withNetworkInterfacePermissions(
            NetworkInterfacePermission... networkInterfacePermissions) {
        if (getNetworkInterfacePermissions() == null) {
            this.networkInterfacePermissions = new java.util.ArrayList<NetworkInterfacePermission>(
                    networkInterfacePermissions.length);
        }
        for (NetworkInterfacePermission value : networkInterfacePermissions) {
            this.networkInterfacePermissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The network interface permissions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkInterfacePermissions <p>
     *            The network interface permissions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfacePermissionsResult withNetworkInterfacePermissions(
            java.util.Collection<NetworkInterfacePermission> networkInterfacePermissions) {
        setNetworkInterfacePermissions(networkInterfacePermissions);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeNetworkInterfacePermissionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getNetworkInterfacePermissions() != null)
            sb.append("NetworkInterfacePermissions: " + getNetworkInterfacePermissions() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getNetworkInterfacePermissions() == null) ? 0
                        : getNetworkInterfacePermissions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNetworkInterfacePermissionsResult == false)
            return false;
        DescribeNetworkInterfacePermissionsResult other = (DescribeNetworkInterfacePermissionsResult) obj;

        if (other.getNetworkInterfacePermissions() == null
                ^ this.getNetworkInterfacePermissions() == null)
            return false;
        if (other.getNetworkInterfacePermissions() != null
                && other.getNetworkInterfacePermissions().equals(
                        this.getNetworkInterfacePermissions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
