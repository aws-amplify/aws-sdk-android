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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

public class ListRecoveryPointsByResourceResult implements Serializable {
    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return <code>maxResults</code> number of items,
     * <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects that contain detailed information about recovery
     * points of the specified resource type.
     * </p>
     */
    private java.util.List<RecoveryPointByResource> recoveryPoints;

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return <code>maxResults</code> number of items,
     * <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     *
     * @return <p>
     *         The next item following a partial list of returned items. For
     *         example, if a request is made to return <code>maxResults</code>
     *         number of items, <code>NextToken</code> allows you to return more
     *         items in your list starting at the location pointed to by the
     *         next token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return <code>maxResults</code> number of items,
     * <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     *
     * @param nextToken <p>
     *            The next item following a partial list of returned items. For
     *            example, if a request is made to return
     *            <code>maxResults</code> number of items,
     *            <code>NextToken</code> allows you to return more items in your
     *            list starting at the location pointed to by the next token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if
     * a request is made to return <code>maxResults</code> number of items,
     * <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The next item following a partial list of returned items. For
     *            example, if a request is made to return
     *            <code>maxResults</code> number of items,
     *            <code>NextToken</code> allows you to return more items in your
     *            list starting at the location pointed to by the next token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecoveryPointsByResourceResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * An array of objects that contain detailed information about recovery
     * points of the specified resource type.
     * </p>
     *
     * @return <p>
     *         An array of objects that contain detailed information about
     *         recovery points of the specified resource type.
     *         </p>
     */
    public java.util.List<RecoveryPointByResource> getRecoveryPoints() {
        return recoveryPoints;
    }

    /**
     * <p>
     * An array of objects that contain detailed information about recovery
     * points of the specified resource type.
     * </p>
     *
     * @param recoveryPoints <p>
     *            An array of objects that contain detailed information about
     *            recovery points of the specified resource type.
     *            </p>
     */
    public void setRecoveryPoints(java.util.Collection<RecoveryPointByResource> recoveryPoints) {
        if (recoveryPoints == null) {
            this.recoveryPoints = null;
            return;
        }

        this.recoveryPoints = new java.util.ArrayList<RecoveryPointByResource>(recoveryPoints);
    }

    /**
     * <p>
     * An array of objects that contain detailed information about recovery
     * points of the specified resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recoveryPoints <p>
     *            An array of objects that contain detailed information about
     *            recovery points of the specified resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecoveryPointsByResourceResult withRecoveryPoints(
            RecoveryPointByResource... recoveryPoints) {
        if (getRecoveryPoints() == null) {
            this.recoveryPoints = new java.util.ArrayList<RecoveryPointByResource>(
                    recoveryPoints.length);
        }
        for (RecoveryPointByResource value : recoveryPoints) {
            this.recoveryPoints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that contain detailed information about recovery
     * points of the specified resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recoveryPoints <p>
     *            An array of objects that contain detailed information about
     *            recovery points of the specified resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecoveryPointsByResourceResult withRecoveryPoints(
            java.util.Collection<RecoveryPointByResource> recoveryPoints) {
        setRecoveryPoints(recoveryPoints);
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
        if (getRecoveryPoints() != null)
            sb.append("RecoveryPoints: " + getRecoveryPoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getRecoveryPoints() == null) ? 0 : getRecoveryPoints().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecoveryPointsByResourceResult == false)
            return false;
        ListRecoveryPointsByResourceResult other = (ListRecoveryPointsByResourceResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecoveryPoints() == null ^ this.getRecoveryPoints() == null)
            return false;
        if (other.getRecoveryPoints() != null
                && other.getRecoveryPoints().equals(this.getRecoveryPoints()) == false)
            return false;
        return true;
    }
}
