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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

public class BatchGetNamedQueryResult implements Serializable {
    /**
     * <p>
     * Information about the named query IDs submitted.
     * </p>
     */
    private java.util.List<NamedQuery> namedQueries;

    /**
     * <p>
     * Information about provided query IDs.
     * </p>
     */
    private java.util.List<UnprocessedNamedQueryId> unprocessedNamedQueryIds;

    /**
     * <p>
     * Information about the named query IDs submitted.
     * </p>
     *
     * @return <p>
     *         Information about the named query IDs submitted.
     *         </p>
     */
    public java.util.List<NamedQuery> getNamedQueries() {
        return namedQueries;
    }

    /**
     * <p>
     * Information about the named query IDs submitted.
     * </p>
     *
     * @param namedQueries <p>
     *            Information about the named query IDs submitted.
     *            </p>
     */
    public void setNamedQueries(java.util.Collection<NamedQuery> namedQueries) {
        if (namedQueries == null) {
            this.namedQueries = null;
            return;
        }

        this.namedQueries = new java.util.ArrayList<NamedQuery>(namedQueries);
    }

    /**
     * <p>
     * Information about the named query IDs submitted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namedQueries <p>
     *            Information about the named query IDs submitted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetNamedQueryResult withNamedQueries(NamedQuery... namedQueries) {
        if (getNamedQueries() == null) {
            this.namedQueries = new java.util.ArrayList<NamedQuery>(namedQueries.length);
        }
        for (NamedQuery value : namedQueries) {
            this.namedQueries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the named query IDs submitted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namedQueries <p>
     *            Information about the named query IDs submitted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetNamedQueryResult withNamedQueries(java.util.Collection<NamedQuery> namedQueries) {
        setNamedQueries(namedQueries);
        return this;
    }

    /**
     * <p>
     * Information about provided query IDs.
     * </p>
     *
     * @return <p>
     *         Information about provided query IDs.
     *         </p>
     */
    public java.util.List<UnprocessedNamedQueryId> getUnprocessedNamedQueryIds() {
        return unprocessedNamedQueryIds;
    }

    /**
     * <p>
     * Information about provided query IDs.
     * </p>
     *
     * @param unprocessedNamedQueryIds <p>
     *            Information about provided query IDs.
     *            </p>
     */
    public void setUnprocessedNamedQueryIds(
            java.util.Collection<UnprocessedNamedQueryId> unprocessedNamedQueryIds) {
        if (unprocessedNamedQueryIds == null) {
            this.unprocessedNamedQueryIds = null;
            return;
        }

        this.unprocessedNamedQueryIds = new java.util.ArrayList<UnprocessedNamedQueryId>(
                unprocessedNamedQueryIds);
    }

    /**
     * <p>
     * Information about provided query IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedNamedQueryIds <p>
     *            Information about provided query IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetNamedQueryResult withUnprocessedNamedQueryIds(
            UnprocessedNamedQueryId... unprocessedNamedQueryIds) {
        if (getUnprocessedNamedQueryIds() == null) {
            this.unprocessedNamedQueryIds = new java.util.ArrayList<UnprocessedNamedQueryId>(
                    unprocessedNamedQueryIds.length);
        }
        for (UnprocessedNamedQueryId value : unprocessedNamedQueryIds) {
            this.unprocessedNamedQueryIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about provided query IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unprocessedNamedQueryIds <p>
     *            Information about provided query IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetNamedQueryResult withUnprocessedNamedQueryIds(
            java.util.Collection<UnprocessedNamedQueryId> unprocessedNamedQueryIds) {
        setUnprocessedNamedQueryIds(unprocessedNamedQueryIds);
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
        if (getNamedQueries() != null)
            sb.append("NamedQueries: " + getNamedQueries() + ",");
        if (getUnprocessedNamedQueryIds() != null)
            sb.append("UnprocessedNamedQueryIds: " + getUnprocessedNamedQueryIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNamedQueries() == null) ? 0 : getNamedQueries().hashCode());
        hashCode = prime
                * hashCode
                + ((getUnprocessedNamedQueryIds() == null) ? 0 : getUnprocessedNamedQueryIds()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetNamedQueryResult == false)
            return false;
        BatchGetNamedQueryResult other = (BatchGetNamedQueryResult) obj;

        if (other.getNamedQueries() == null ^ this.getNamedQueries() == null)
            return false;
        if (other.getNamedQueries() != null
                && other.getNamedQueries().equals(this.getNamedQueries()) == false)
            return false;
        if (other.getUnprocessedNamedQueryIds() == null
                ^ this.getUnprocessedNamedQueryIds() == null)
            return false;
        if (other.getUnprocessedNamedQueryIds() != null
                && other.getUnprocessedNamedQueryIds().equals(this.getUnprocessedNamedQueryIds()) == false)
            return false;
        return true;
    }
}
