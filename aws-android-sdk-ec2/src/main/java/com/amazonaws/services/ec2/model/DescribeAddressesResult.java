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

public class DescribeAddressesResult implements Serializable {
    /**
     * <p>
     * Information about the Elastic IP addresses.
     * </p>
     */
    private java.util.List<Address> addresses;

    /**
     * <p>
     * Information about the Elastic IP addresses.
     * </p>
     *
     * @return <p>
     *         Information about the Elastic IP addresses.
     *         </p>
     */
    public java.util.List<Address> getAddresses() {
        return addresses;
    }

    /**
     * <p>
     * Information about the Elastic IP addresses.
     * </p>
     *
     * @param addresses <p>
     *            Information about the Elastic IP addresses.
     *            </p>
     */
    public void setAddresses(java.util.Collection<Address> addresses) {
        if (addresses == null) {
            this.addresses = null;
            return;
        }

        this.addresses = new java.util.ArrayList<Address>(addresses);
    }

    /**
     * <p>
     * Information about the Elastic IP addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addresses <p>
     *            Information about the Elastic IP addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAddressesResult withAddresses(Address... addresses) {
        if (getAddresses() == null) {
            this.addresses = new java.util.ArrayList<Address>(addresses.length);
        }
        for (Address value : addresses) {
            this.addresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Elastic IP addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addresses <p>
     *            Information about the Elastic IP addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAddressesResult withAddresses(java.util.Collection<Address> addresses) {
        setAddresses(addresses);
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
        if (getAddresses() != null)
            sb.append("Addresses: " + getAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddresses() == null) ? 0 : getAddresses().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAddressesResult == false)
            return false;
        DescribeAddressesResult other = (DescribeAddressesResult) obj;

        if (other.getAddresses() == null ^ this.getAddresses() == null)
            return false;
        if (other.getAddresses() != null
                && other.getAddresses().equals(this.getAddresses()) == false)
            return false;
        return true;
    }
}
