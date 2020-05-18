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

public class GetBlockResult implements Serializable {
    /**
     * <p>
     * The block data object in Amazon Ion format.
     * </p>
     */
    private ValueHolder block;

    /**
     * <p>
     * The proof object in Amazon Ion format returned by a <code>GetBlock</code>
     * request. A proof contains the list of hash values required to recalculate
     * the specified digest using a Merkle tree, starting with the specified
     * block.
     * </p>
     */
    private ValueHolder proof;

    /**
     * <p>
     * The block data object in Amazon Ion format.
     * </p>
     *
     * @return <p>
     *         The block data object in Amazon Ion format.
     *         </p>
     */
    public ValueHolder getBlock() {
        return block;
    }

    /**
     * <p>
     * The block data object in Amazon Ion format.
     * </p>
     *
     * @param block <p>
     *            The block data object in Amazon Ion format.
     *            </p>
     */
    public void setBlock(ValueHolder block) {
        this.block = block;
    }

    /**
     * <p>
     * The block data object in Amazon Ion format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param block <p>
     *            The block data object in Amazon Ion format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBlockResult withBlock(ValueHolder block) {
        this.block = block;
        return this;
    }

    /**
     * <p>
     * The proof object in Amazon Ion format returned by a <code>GetBlock</code>
     * request. A proof contains the list of hash values required to recalculate
     * the specified digest using a Merkle tree, starting with the specified
     * block.
     * </p>
     *
     * @return <p>
     *         The proof object in Amazon Ion format returned by a
     *         <code>GetBlock</code> request. A proof contains the list of hash
     *         values required to recalculate the specified digest using a
     *         Merkle tree, starting with the specified block.
     *         </p>
     */
    public ValueHolder getProof() {
        return proof;
    }

    /**
     * <p>
     * The proof object in Amazon Ion format returned by a <code>GetBlock</code>
     * request. A proof contains the list of hash values required to recalculate
     * the specified digest using a Merkle tree, starting with the specified
     * block.
     * </p>
     *
     * @param proof <p>
     *            The proof object in Amazon Ion format returned by a
     *            <code>GetBlock</code> request. A proof contains the list of
     *            hash values required to recalculate the specified digest using
     *            a Merkle tree, starting with the specified block.
     *            </p>
     */
    public void setProof(ValueHolder proof) {
        this.proof = proof;
    }

    /**
     * <p>
     * The proof object in Amazon Ion format returned by a <code>GetBlock</code>
     * request. A proof contains the list of hash values required to recalculate
     * the specified digest using a Merkle tree, starting with the specified
     * block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param proof <p>
     *            The proof object in Amazon Ion format returned by a
     *            <code>GetBlock</code> request. A proof contains the list of
     *            hash values required to recalculate the specified digest using
     *            a Merkle tree, starting with the specified block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBlockResult withProof(ValueHolder proof) {
        this.proof = proof;
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
        if (getBlock() != null)
            sb.append("Block: " + getBlock() + ",");
        if (getProof() != null)
            sb.append("Proof: " + getProof());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlock() == null) ? 0 : getBlock().hashCode());
        hashCode = prime * hashCode + ((getProof() == null) ? 0 : getProof().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBlockResult == false)
            return false;
        GetBlockResult other = (GetBlockResult) obj;

        if (other.getBlock() == null ^ this.getBlock() == null)
            return false;
        if (other.getBlock() != null && other.getBlock().equals(this.getBlock()) == false)
            return false;
        if (other.getProof() == null ^ this.getProof() == null)
            return false;
        if (other.getProof() != null && other.getProof().equals(this.getProof()) == false)
            return false;
        return true;
    }
}
