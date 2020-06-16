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

public class GetRevisionResult implements Serializable {
    /**
     * <p>
     * The proof object in Amazon Ion format returned by a
     * <code>GetRevision</code> request. A proof contains the list of hash
     * values that are required to recalculate the specified digest using a
     * Merkle tree, starting with the specified document revision.
     * </p>
     */
    private ValueHolder proof;

    /**
     * <p>
     * The document revision data object in Amazon Ion format.
     * </p>
     */
    private ValueHolder revision;

    /**
     * <p>
     * The proof object in Amazon Ion format returned by a
     * <code>GetRevision</code> request. A proof contains the list of hash
     * values that are required to recalculate the specified digest using a
     * Merkle tree, starting with the specified document revision.
     * </p>
     *
     * @return <p>
     *         The proof object in Amazon Ion format returned by a
     *         <code>GetRevision</code> request. A proof contains the list of
     *         hash values that are required to recalculate the specified digest
     *         using a Merkle tree, starting with the specified document
     *         revision.
     *         </p>
     */
    public ValueHolder getProof() {
        return proof;
    }

    /**
     * <p>
     * The proof object in Amazon Ion format returned by a
     * <code>GetRevision</code> request. A proof contains the list of hash
     * values that are required to recalculate the specified digest using a
     * Merkle tree, starting with the specified document revision.
     * </p>
     *
     * @param proof <p>
     *            The proof object in Amazon Ion format returned by a
     *            <code>GetRevision</code> request. A proof contains the list of
     *            hash values that are required to recalculate the specified
     *            digest using a Merkle tree, starting with the specified
     *            document revision.
     *            </p>
     */
    public void setProof(ValueHolder proof) {
        this.proof = proof;
    }

    /**
     * <p>
     * The proof object in Amazon Ion format returned by a
     * <code>GetRevision</code> request. A proof contains the list of hash
     * values that are required to recalculate the specified digest using a
     * Merkle tree, starting with the specified document revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param proof <p>
     *            The proof object in Amazon Ion format returned by a
     *            <code>GetRevision</code> request. A proof contains the list of
     *            hash values that are required to recalculate the specified
     *            digest using a Merkle tree, starting with the specified
     *            document revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRevisionResult withProof(ValueHolder proof) {
        this.proof = proof;
        return this;
    }

    /**
     * <p>
     * The document revision data object in Amazon Ion format.
     * </p>
     *
     * @return <p>
     *         The document revision data object in Amazon Ion format.
     *         </p>
     */
    public ValueHolder getRevision() {
        return revision;
    }

    /**
     * <p>
     * The document revision data object in Amazon Ion format.
     * </p>
     *
     * @param revision <p>
     *            The document revision data object in Amazon Ion format.
     *            </p>
     */
    public void setRevision(ValueHolder revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The document revision data object in Amazon Ion format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revision <p>
     *            The document revision data object in Amazon Ion format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRevisionResult withRevision(ValueHolder revision) {
        this.revision = revision;
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
        if (getProof() != null)
            sb.append("Proof: " + getProof() + ",");
        if (getRevision() != null)
            sb.append("Revision: " + getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProof() == null) ? 0 : getProof().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRevisionResult == false)
            return false;
        GetRevisionResult other = (GetRevisionResult) obj;

        if (other.getProof() == null ^ this.getProof() == null)
            return false;
        if (other.getProof() != null && other.getProof().equals(this.getProof()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }
}
