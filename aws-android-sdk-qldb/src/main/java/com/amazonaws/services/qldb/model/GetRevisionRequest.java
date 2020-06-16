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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a revision data object for a specified document ID and block address.
 * Also returns a proof of the specified revision for verification if
 * <code>DigestTipAddress</code> is provided.
 * </p>
 */
public class GetRevisionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     */
    private String name;

    /**
     * <p>
     * The block location of the document revision to be verified. An address is
     * an Amazon Ion structure that has two fields: <code>strandId</code> and
     * <code>sequenceNo</code>.
     * </p>
     * <p>
     * For example:
     * <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14}</code>
     * </p>
     */
    private ValueHolder blockAddress;

    /**
     * <p>
     * The unique ID of the document to be verified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     */
    private String documentId;

    /**
     * <p>
     * The latest block location covered by the digest for which to request a
     * proof. An address is an Amazon Ion structure that has two fields:
     * <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     * <p>
     * For example:
     * <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49}</code>
     * </p>
     */
    private ValueHolder digestTipAddress;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @return <p>
     *         The name of the ledger.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param name <p>
     *            The name of the ledger.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param name <p>
     *            The name of the ledger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRevisionRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The block location of the document revision to be verified. An address is
     * an Amazon Ion structure that has two fields: <code>strandId</code> and
     * <code>sequenceNo</code>.
     * </p>
     * <p>
     * For example:
     * <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14}</code>
     * </p>
     *
     * @return <p>
     *         The block location of the document revision to be verified. An
     *         address is an Amazon Ion structure that has two fields:
     *         <code>strandId</code> and <code>sequenceNo</code>.
     *         </p>
     *         <p>
     *         For example:
     *         <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14}</code>
     *         </p>
     */
    public ValueHolder getBlockAddress() {
        return blockAddress;
    }

    /**
     * <p>
     * The block location of the document revision to be verified. An address is
     * an Amazon Ion structure that has two fields: <code>strandId</code> and
     * <code>sequenceNo</code>.
     * </p>
     * <p>
     * For example:
     * <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14}</code>
     * </p>
     *
     * @param blockAddress <p>
     *            The block location of the document revision to be verified. An
     *            address is an Amazon Ion structure that has two fields:
     *            <code>strandId</code> and <code>sequenceNo</code>.
     *            </p>
     *            <p>
     *            For example:
     *            <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14}</code>
     *            </p>
     */
    public void setBlockAddress(ValueHolder blockAddress) {
        this.blockAddress = blockAddress;
    }

    /**
     * <p>
     * The block location of the document revision to be verified. An address is
     * an Amazon Ion structure that has two fields: <code>strandId</code> and
     * <code>sequenceNo</code>.
     * </p>
     * <p>
     * For example:
     * <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14}</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockAddress <p>
     *            The block location of the document revision to be verified. An
     *            address is an Amazon Ion structure that has two fields:
     *            <code>strandId</code> and <code>sequenceNo</code>.
     *            </p>
     *            <p>
     *            For example:
     *            <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14}</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRevisionRequest withBlockAddress(ValueHolder blockAddress) {
        this.blockAddress = blockAddress;
        return this;
    }

    /**
     * <p>
     * The unique ID of the document to be verified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @return <p>
     *         The unique ID of the document to be verified.
     *         </p>
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * <p>
     * The unique ID of the document to be verified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @param documentId <p>
     *            The unique ID of the document to be verified.
     *            </p>
     */
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * <p>
     * The unique ID of the document to be verified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @param documentId <p>
     *            The unique ID of the document to be verified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRevisionRequest withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * <p>
     * The latest block location covered by the digest for which to request a
     * proof. An address is an Amazon Ion structure that has two fields:
     * <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     * <p>
     * For example:
     * <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49}</code>
     * </p>
     *
     * @return <p>
     *         The latest block location covered by the digest for which to
     *         request a proof. An address is an Amazon Ion structure that has
     *         two fields: <code>strandId</code> and <code>sequenceNo</code>.
     *         </p>
     *         <p>
     *         For example:
     *         <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49}</code>
     *         </p>
     */
    public ValueHolder getDigestTipAddress() {
        return digestTipAddress;
    }

    /**
     * <p>
     * The latest block location covered by the digest for which to request a
     * proof. An address is an Amazon Ion structure that has two fields:
     * <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     * <p>
     * For example:
     * <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49}</code>
     * </p>
     *
     * @param digestTipAddress <p>
     *            The latest block location covered by the digest for which to
     *            request a proof. An address is an Amazon Ion structure that
     *            has two fields: <code>strandId</code> and
     *            <code>sequenceNo</code>.
     *            </p>
     *            <p>
     *            For example:
     *            <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49}</code>
     *            </p>
     */
    public void setDigestTipAddress(ValueHolder digestTipAddress) {
        this.digestTipAddress = digestTipAddress;
    }

    /**
     * <p>
     * The latest block location covered by the digest for which to request a
     * proof. An address is an Amazon Ion structure that has two fields:
     * <code>strandId</code> and <code>sequenceNo</code>.
     * </p>
     * <p>
     * For example:
     * <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49}</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param digestTipAddress <p>
     *            The latest block location covered by the digest for which to
     *            request a proof. An address is an Amazon Ion structure that
     *            has two fields: <code>strandId</code> and
     *            <code>sequenceNo</code>.
     *            </p>
     *            <p>
     *            For example:
     *            <code>{strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49}</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRevisionRequest withDigestTipAddress(ValueHolder digestTipAddress) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getBlockAddress() != null)
            sb.append("BlockAddress: " + getBlockAddress() + ",");
        if (getDocumentId() != null)
            sb.append("DocumentId: " + getDocumentId() + ",");
        if (getDigestTipAddress() != null)
            sb.append("DigestTipAddress: " + getDigestTipAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getBlockAddress() == null) ? 0 : getBlockAddress().hashCode());
        hashCode = prime * hashCode + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
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

        if (obj instanceof GetRevisionRequest == false)
            return false;
        GetRevisionRequest other = (GetRevisionRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getBlockAddress() == null ^ this.getBlockAddress() == null)
            return false;
        if (other.getBlockAddress() != null
                && other.getBlockAddress().equals(this.getBlockAddress()) == false)
            return false;
        if (other.getDocumentId() == null ^ this.getDocumentId() == null)
            return false;
        if (other.getDocumentId() != null
                && other.getDocumentId().equals(this.getDocumentId()) == false)
            return false;
        if (other.getDigestTipAddress() == null ^ this.getDigestTipAddress() == null)
            return false;
        if (other.getDigestTipAddress() != null
                && other.getDigestTipAddress().equals(this.getDigestTipAddress()) == false)
            return false;
        return true;
    }
}
