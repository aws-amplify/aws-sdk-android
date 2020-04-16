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

package com.amazonaws.services.amazonimportexportsnowball.model;

import java.io.Serializable;

public class DescribeAddressesResult implements Serializable {
    /**
     * <p>
     * The Snowball shipping addresses that were created for this account.
     * </p>
     */
    private java.util.List<Address> addresses;

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated
     * <code>NextToken</code> value in your next <code>DescribeAddresses</code>
     * call, your list of returned addresses will start from this point in the
     * array.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The Snowball shipping addresses that were created for this account.
     * </p>
     *
     * @return <p>
     *         The Snowball shipping addresses that were created for this
     *         account.
     *         </p>
     */
    public java.util.List<Address> getAddresses() {
        return addresses;
    }

    /**
     * <p>
     * The Snowball shipping addresses that were created for this account.
     * </p>
     *
     * @param addresses <p>
     *            The Snowball shipping addresses that were created for this
     *            account.
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
     * The Snowball shipping addresses that were created for this account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addresses <p>
     *            The Snowball shipping addresses that were created for this
     *            account.
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
     * The Snowball shipping addresses that were created for this account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addresses <p>
     *            The Snowball shipping addresses that were created for this
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAddressesResult withAddresses(java.util.Collection<Address> addresses) {
        setAddresses(addresses);
        return this;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated
     * <code>NextToken</code> value in your next <code>DescribeAddresses</code>
     * call, your list of returned addresses will start from this point in the
     * array.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         HTTP requests are stateless. If you use the automatically
     *         generated <code>NextToken</code> value in your next
     *         <code>DescribeAddresses</code> call, your list of returned
     *         addresses will start from this point in the array.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated
     * <code>NextToken</code> value in your next <code>DescribeAddresses</code>
     * call, your list of returned addresses will start from this point in the
     * array.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            HTTP requests are stateless. If you use the automatically
     *            generated <code>NextToken</code> value in your next
     *            <code>DescribeAddresses</code> call, your list of returned
     *            addresses will start from this point in the array.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated
     * <code>NextToken</code> value in your next <code>DescribeAddresses</code>
     * call, your list of returned addresses will start from this point in the
     * array.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            HTTP requests are stateless. If you use the automatically
     *            generated <code>NextToken</code> value in your next
     *            <code>DescribeAddresses</code> call, your list of returned
     *            addresses will start from this point in the array.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAddressesResult withNextToken(String nextToken) {
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
        if (getAddresses() != null)
            sb.append("Addresses: " + getAddresses() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddresses() == null) ? 0 : getAddresses().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
