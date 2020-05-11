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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * The facet values for the documents in the response.
 * </p>
 */
public class FacetResult implements Serializable {
    /**
     * <p>
     * The key for the facet values. This is the same as the
     * <code>DocumentAttributeKey</code> provided in the query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_][a-zA-Z0-9_-]*<br/>
     */
    private String documentAttributeKey;

    /**
     * <p>
     * An array of key/value pairs, where the key is the value of the attribute
     * and the count is the number of documents that share the key value.
     * </p>
     */
    private java.util.List<DocumentAttributeValueCountPair> documentAttributeValueCountPairs;

    /**
     * <p>
     * The key for the facet values. This is the same as the
     * <code>DocumentAttributeKey</code> provided in the query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         The key for the facet values. This is the same as the
     *         <code>DocumentAttributeKey</code> provided in the query.
     *         </p>
     */
    public String getDocumentAttributeKey() {
        return documentAttributeKey;
    }

    /**
     * <p>
     * The key for the facet values. This is the same as the
     * <code>DocumentAttributeKey</code> provided in the query.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_][a-zA-Z0-9_-]*<br/>
     *
     * @param documentAttributeKey <p>
     *            The key for the facet values. This is the same as the
     *            <code>DocumentAttributeKey</code> provided in the query.
     *            </p>
     */
    public void setDocumentAttributeKey(String documentAttributeKey) {
        this.documentAttributeKey = documentAttributeKey;
    }

    /**
     * <p>
     * The key for the facet values. This is the same as the
     * <code>DocumentAttributeKey</code> provided in the query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_][a-zA-Z0-9_-]*<br/>
     *
     * @param documentAttributeKey <p>
     *            The key for the facet values. This is the same as the
     *            <code>DocumentAttributeKey</code> provided in the query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FacetResult withDocumentAttributeKey(String documentAttributeKey) {
        this.documentAttributeKey = documentAttributeKey;
        return this;
    }

    /**
     * <p>
     * An array of key/value pairs, where the key is the value of the attribute
     * and the count is the number of documents that share the key value.
     * </p>
     *
     * @return <p>
     *         An array of key/value pairs, where the key is the value of the
     *         attribute and the count is the number of documents that share the
     *         key value.
     *         </p>
     */
    public java.util.List<DocumentAttributeValueCountPair> getDocumentAttributeValueCountPairs() {
        return documentAttributeValueCountPairs;
    }

    /**
     * <p>
     * An array of key/value pairs, where the key is the value of the attribute
     * and the count is the number of documents that share the key value.
     * </p>
     *
     * @param documentAttributeValueCountPairs <p>
     *            An array of key/value pairs, where the key is the value of the
     *            attribute and the count is the number of documents that share
     *            the key value.
     *            </p>
     */
    public void setDocumentAttributeValueCountPairs(
            java.util.Collection<DocumentAttributeValueCountPair> documentAttributeValueCountPairs) {
        if (documentAttributeValueCountPairs == null) {
            this.documentAttributeValueCountPairs = null;
            return;
        }

        this.documentAttributeValueCountPairs = new java.util.ArrayList<DocumentAttributeValueCountPair>(
                documentAttributeValueCountPairs);
    }

    /**
     * <p>
     * An array of key/value pairs, where the key is the value of the attribute
     * and the count is the number of documents that share the key value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentAttributeValueCountPairs <p>
     *            An array of key/value pairs, where the key is the value of the
     *            attribute and the count is the number of documents that share
     *            the key value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FacetResult withDocumentAttributeValueCountPairs(
            DocumentAttributeValueCountPair... documentAttributeValueCountPairs) {
        if (getDocumentAttributeValueCountPairs() == null) {
            this.documentAttributeValueCountPairs = new java.util.ArrayList<DocumentAttributeValueCountPair>(
                    documentAttributeValueCountPairs.length);
        }
        for (DocumentAttributeValueCountPair value : documentAttributeValueCountPairs) {
            this.documentAttributeValueCountPairs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of key/value pairs, where the key is the value of the attribute
     * and the count is the number of documents that share the key value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentAttributeValueCountPairs <p>
     *            An array of key/value pairs, where the key is the value of the
     *            attribute and the count is the number of documents that share
     *            the key value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FacetResult withDocumentAttributeValueCountPairs(
            java.util.Collection<DocumentAttributeValueCountPair> documentAttributeValueCountPairs) {
        setDocumentAttributeValueCountPairs(documentAttributeValueCountPairs);
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
        if (getDocumentAttributeKey() != null)
            sb.append("DocumentAttributeKey: " + getDocumentAttributeKey() + ",");
        if (getDocumentAttributeValueCountPairs() != null)
            sb.append("DocumentAttributeValueCountPairs: " + getDocumentAttributeValueCountPairs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDocumentAttributeKey() == null) ? 0 : getDocumentAttributeKey().hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentAttributeValueCountPairs() == null) ? 0
                        : getDocumentAttributeValueCountPairs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FacetResult == false)
            return false;
        FacetResult other = (FacetResult) obj;

        if (other.getDocumentAttributeKey() == null ^ this.getDocumentAttributeKey() == null)
            return false;
        if (other.getDocumentAttributeKey() != null
                && other.getDocumentAttributeKey().equals(this.getDocumentAttributeKey()) == false)
            return false;
        if (other.getDocumentAttributeValueCountPairs() == null
                ^ this.getDocumentAttributeValueCountPairs() == null)
            return false;
        if (other.getDocumentAttributeValueCountPairs() != null
                && other.getDocumentAttributeValueCountPairs().equals(
                        this.getDocumentAttributeValueCountPairs()) == false)
            return false;
        return true;
    }
}
