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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains other private IP address information of the EC2 instance.
 * </p>
 */
public class PrivateIpAddressDetails implements Serializable {
    /**
     * <p>
     * The private DNS name of the EC2 instance.
     * </p>
     */
    private String privateDnsName;

    /**
     * <p>
     * The private IP address of the EC2 instance.
     * </p>
     */
    private String privateIpAddress;

    /**
     * <p>
     * The private DNS name of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The private DNS name of the EC2 instance.
     *         </p>
     */
    public String getPrivateDnsName() {
        return privateDnsName;
    }

    /**
     * <p>
     * The private DNS name of the EC2 instance.
     * </p>
     *
     * @param privateDnsName <p>
     *            The private DNS name of the EC2 instance.
     *            </p>
     */
    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * The private DNS name of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateDnsName <p>
     *            The private DNS name of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PrivateIpAddressDetails withPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
        return this;
    }

    /**
     * <p>
     * The private IP address of the EC2 instance.
     * </p>
     *
     * @return <p>
     *         The private IP address of the EC2 instance.
     *         </p>
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the EC2 instance.
     * </p>
     *
     * @param privateIpAddress <p>
     *            The private IP address of the EC2 instance.
     *            </p>
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the EC2 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddress <p>
     *            The private IP address of the EC2 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PrivateIpAddressDetails withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
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
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: " + getPrivateDnsName() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrivateIpAddressDetails == false)
            return false;
        PrivateIpAddressDetails other = (PrivateIpAddressDetails) obj;

        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null
                && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null
                && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        return true;
    }
}
