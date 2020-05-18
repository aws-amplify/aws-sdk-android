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

package com.amazonaws.services.qldb.model;

import java.io.Serializable;

public class GetDigestResult implements Serializable {
    /**
     * <p>
     * The 256-bit hash value representing the digest returned by a
     * <code>GetDigest</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 32<br/>
     */
    private java.nio.ByteBuffer digest;

    /**
     * <p>
     * The latest block location covered by the digest that you requested. An
     * address is an Amazon Ion structure that has two fields:
     * <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     */
    private ValueHolder digestTipAddress;

    /**
     * <p>
     * The 256-bit hash value representing the digest returned by a
     * <code>GetDigest</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 32<br/>
     *
     * @return <p>
     *         The 256-bit hash value representing the digest returned by a
     *         <code>GetDigest</code> request.
     *         </p>
     */
    public java.nio.ByteBuffer getDigest() {
        return digest;
    }

    /**
     * <p>
     * The 256-bit hash value representing the digest returned by a
     * <code>GetDigest</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 32<br/>
     *
     * @param digest <p>
     *            The 256-bit hash value representing the digest returned by a
     *            <code>GetDigest</code> request.
     *            </p>
     */
    public void setDigest(java.nio.ByteBuffer digest) {
        this.digest = digest;
    }

    /**
     * <p>
     * The 256-bit hash value representing the digest returned by a
     * <code>GetDigest</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>32 - 32<br/>
     *
     * @param digest <p>
     *            The 256-bit hash value representing the digest returned by a
     *            <code>GetDigest</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDigestResult withDigest(java.nio.ByteBuffer digest) {
        this.digest = digest;
        return this;
    }

    /**
     * <p>
     * The latest block location covered by the digest that you requested. An
     * address is an Amazon Ion structure that has two fields:
     * <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     *
     * @return <p>
     *         The latest block location covered by the digest that you
     *         requested. An address is an Amazon Ion structure that has two
     *         fields: <code>strandId</code> and <code>sequenceNo</code>.
     *         </p>
     */
    public ValueHolder getDigestTipAddress() {
        return digestTipAddress;
    }

    /**
     * <p>
     * The latest block location covered by the digest that you requested. An
     * address is an Amazon Ion structure that has two fields:
     * <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     *
     * @param digestTipAddress <p>
     *            The latest block location covered by the digest that you
     *            requested. An address is an Amazon Ion structure that has two
     *            fields: <code>strandId</code> and <code>sequenceNo</code>.
     *            </p>
     */
    public void setDigestTipAddress(ValueHolder digestTipAddress) {
        this.digestTipAddress = digestTipAddress;
    }

    /**
     * <p>
     * The latest block location covered by the digest that you requested. An
     * address is an Amazon Ion structure that has two fields:
     * <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param digestTipAddress <p>
     *            The latest block location covered by the digest that you
     *            requested. An address is an Amazon Ion structure that has two
     *            fields: <code>strandId</code> and <code>sequenceNo</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDigestResult withDigestTipAddress(ValueHolder digestTipAddress) {
        this.digestTipAddress = digestTipAddress;
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
        if (getDigest() != null)
            sb.append("Digest: " + getDigest() + ",");
        if (getDigestTipAddress() != null)
            sb.append("DigestTipAddress: " + getDigestTipAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDigest() == null) ? 0 : getDigest().hashCode());
        hashCode = prime * hashCode
                + ((getDigestTipAddress() == null) ? 0 : getDigestTipAddress().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDigestResult == false)
            return false;
        GetDigestResult other = (GetDigestResult) obj;

        if (other.getDigest() == null ^ this.getDigest() == null)
            return false;
        if (other.getDigest() != null && other.getDigest().equals(this.getDigest()) == false)
            return false;
        if (other.getDigestTipAddress() == null ^ this.getDigestTipAddress() == null)
            return false;
        if (other.getDigestTipAddress() != null
                && other.getDigestTipAddress().equals(this.getDigestTipAddress()) == false)
            return false;
        return true;
    }
}
