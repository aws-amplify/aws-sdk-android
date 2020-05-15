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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

public class ListTypeVersionsResult implements Serializable {
    /**
     * <p>
     * A list of <code>TypeVersionSummary</code> structures that contain
     * information about the specified type's versions.
     * </p>
     */
    private java.util.List<TypeVersionSummary> typeVersionSummaries;

    /**
     * <p>
     * If the request doesn't return all of the remaining results,
     * <code>NextToken</code> is set to a token. To retrieve the next set of
     * results, call this action again and assign that token to the request
     * object's <code>NextToken</code> parameter. If the request returns all
     * results, <code>NextToken</code> is set to <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>TypeVersionSummary</code> structures that contain
     * information about the specified type's versions.
     * </p>
     *
     * @return <p>
     *         A list of <code>TypeVersionSummary</code> structures that contain
     *         information about the specified type's versions.
     *         </p>
     */
    public java.util.List<TypeVersionSummary> getTypeVersionSummaries() {
        return typeVersionSummaries;
    }

    /**
     * <p>
     * A list of <code>TypeVersionSummary</code> structures that contain
     * information about the specified type's versions.
     * </p>
     *
     * @param typeVersionSummaries <p>
     *            A list of <code>TypeVersionSummary</code> structures that
     *            contain information about the specified type's versions.
     *            </p>
     */
    public void setTypeVersionSummaries(
            java.util.Collection<TypeVersionSummary> typeVersionSummaries) {
        if (typeVersionSummaries == null) {
            this.typeVersionSummaries = null;
            return;
        }

        this.typeVersionSummaries = new java.util.ArrayList<TypeVersionSummary>(
                typeVersionSummaries);
    }

    /**
     * <p>
     * A list of <code>TypeVersionSummary</code> structures that contain
     * information about the specified type's versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param typeVersionSummaries <p>
     *            A list of <code>TypeVersionSummary</code> structures that
     *            contain information about the specified type's versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTypeVersionsResult withTypeVersionSummaries(
            TypeVersionSummary... typeVersionSummaries) {
        if (getTypeVersionSummaries() == null) {
            this.typeVersionSummaries = new java.util.ArrayList<TypeVersionSummary>(
                    typeVersionSummaries.length);
        }
        for (TypeVersionSummary value : typeVersionSummaries) {
            this.typeVersionSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>TypeVersionSummary</code> structures that contain
     * information about the specified type's versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param typeVersionSummaries <p>
     *            A list of <code>TypeVersionSummary</code> structures that
     *            contain information about the specified type's versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTypeVersionsResult withTypeVersionSummaries(
            java.util.Collection<TypeVersionSummary> typeVersionSummaries) {
        setTypeVersionSummaries(typeVersionSummaries);
        return this;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results,
     * <code>NextToken</code> is set to a token. To retrieve the next set of
     * results, call this action again and assign that token to the request
     * object's <code>NextToken</code> parameter. If the request returns all
     * results, <code>NextToken</code> is set to <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         If the request doesn't return all of the remaining results,
     *         <code>NextToken</code> is set to a token. To retrieve the next
     *         set of results, call this action again and assign that token to
     *         the request object's <code>NextToken</code> parameter. If the
     *         request returns all results, <code>NextToken</code> is set to
     *         <code>null</code>.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results,
     * <code>NextToken</code> is set to a token. To retrieve the next set of
     * results, call this action again and assign that token to the request
     * object's <code>NextToken</code> parameter. If the request returns all
     * results, <code>NextToken</code> is set to <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the request doesn't return all of the remaining results,
     *            <code>NextToken</code> is set to a token. To retrieve the next
     *            set of results, call this action again and assign that token
     *            to the request object's <code>NextToken</code> parameter. If
     *            the request returns all results, <code>NextToken</code> is set
     *            to <code>null</code>.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results,
     * <code>NextToken</code> is set to a token. To retrieve the next set of
     * results, call this action again and assign that token to the request
     * object's <code>NextToken</code> parameter. If the request returns all
     * results, <code>NextToken</code> is set to <code>null</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the request doesn't return all of the remaining results,
     *            <code>NextToken</code> is set to a token. To retrieve the next
     *            set of results, call this action again and assign that token
     *            to the request object's <code>NextToken</code> parameter. If
     *            the request returns all results, <code>NextToken</code> is set
     *            to <code>null</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTypeVersionsResult withNextToken(String nextToken) {
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
        if (getTypeVersionSummaries() != null)
            sb.append("TypeVersionSummaries: " + getTypeVersionSummaries() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTypeVersionSummaries() == null) ? 0 : getTypeVersionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTypeVersionsResult == false)
            return false;
        ListTypeVersionsResult other = (ListTypeVersionsResult) obj;

        if (other.getTypeVersionSummaries() == null ^ this.getTypeVersionSummaries() == null)
            return false;
        if (other.getTypeVersionSummaries() != null
                && other.getTypeVersionSummaries().equals(this.getTypeVersionSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
