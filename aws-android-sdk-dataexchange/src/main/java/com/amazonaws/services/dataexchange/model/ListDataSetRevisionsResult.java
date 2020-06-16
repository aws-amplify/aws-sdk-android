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

package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;

public class ListDataSetRevisionsResult implements Serializable {
    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The asset objects listed by the request.
     * </p>
     */
    private java.util.List<RevisionEntry> revisions;

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of
     * results.
     * </p>
     *
     * @return <p>
     *         The token value retrieved from a previous call to access the next
     *         page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            The token value retrieved from a previous call to access the
     *            next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token value retrieved from a previous call to access the
     *            next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSetRevisionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The asset objects listed by the request.
     * </p>
     *
     * @return <p>
     *         The asset objects listed by the request.
     *         </p>
     */
    public java.util.List<RevisionEntry> getRevisions() {
        return revisions;
    }

    /**
     * <p>
     * The asset objects listed by the request.
     * </p>
     *
     * @param revisions <p>
     *            The asset objects listed by the request.
     *            </p>
     */
    public void setRevisions(java.util.Collection<RevisionEntry> revisions) {
        if (revisions == null) {
            this.revisions = null;
            return;
        }

        this.revisions = new java.util.ArrayList<RevisionEntry>(revisions);
    }

    /**
     * <p>
     * The asset objects listed by the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisions <p>
     *            The asset objects listed by the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSetRevisionsResult withRevisions(RevisionEntry... revisions) {
        if (getRevisions() == null) {
            this.revisions = new java.util.ArrayList<RevisionEntry>(revisions.length);
        }
        for (RevisionEntry value : revisions) {
            this.revisions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The asset objects listed by the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisions <p>
     *            The asset objects listed by the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSetRevisionsResult withRevisions(java.util.Collection<RevisionEntry> revisions) {
        setRevisions(revisions);
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
        if (getRevisions() != null)
            sb.append("Revisions: " + getRevisions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRevisions() == null) ? 0 : getRevisions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDataSetRevisionsResult == false)
            return false;
        ListDataSetRevisionsResult other = (ListDataSetRevisionsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRevisions() == null ^ this.getRevisions() == null)
            return false;
        if (other.getRevisions() != null
                && other.getRevisions().equals(this.getRevisions()) == false)
            return false;
        return true;
    }
}
