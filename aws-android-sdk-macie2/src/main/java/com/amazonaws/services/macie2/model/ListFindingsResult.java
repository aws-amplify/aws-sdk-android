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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

public class ListFindingsResult implements Serializable {
    /**
     * <p>
     * An array of strings, where each string is the unique identifier for a
     * finding that meets the filter criteria specified in the request.
     * </p>
     */
    private java.util.List<String> findingIds;

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of strings, where each string is the unique identifier for a
     * finding that meets the filter criteria specified in the request.
     * </p>
     *
     * @return <p>
     *         An array of strings, where each string is the unique identifier
     *         for a finding that meets the filter criteria specified in the
     *         request.
     *         </p>
     */
    public java.util.List<String> getFindingIds() {
        return findingIds;
    }

    /**
     * <p>
     * An array of strings, where each string is the unique identifier for a
     * finding that meets the filter criteria specified in the request.
     * </p>
     *
     * @param findingIds <p>
     *            An array of strings, where each string is the unique
     *            identifier for a finding that meets the filter criteria
     *            specified in the request.
     *            </p>
     */
    public void setFindingIds(java.util.Collection<String> findingIds) {
        if (findingIds == null) {
            this.findingIds = null;
            return;
        }

        this.findingIds = new java.util.ArrayList<String>(findingIds);
    }

    /**
     * <p>
     * An array of strings, where each string is the unique identifier for a
     * finding that meets the filter criteria specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingIds <p>
     *            An array of strings, where each string is the unique
     *            identifier for a finding that meets the filter criteria
     *            specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFindingsResult withFindingIds(String... findingIds) {
        if (getFindingIds() == null) {
            this.findingIds = new java.util.ArrayList<String>(findingIds.length);
        }
        for (String value : findingIds) {
            this.findingIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings, where each string is the unique identifier for a
     * finding that meets the filter criteria specified in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingIds <p>
     *            An array of strings, where each string is the unique
     *            identifier for a finding that meets the filter criteria
     *            specified in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFindingsResult withFindingIds(java.util.Collection<String> findingIds) {
        setFindingIds(findingIds);
        return this;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     *
     * @return <p>
     *         The string to use in a subsequent request to get the next page of
     *         results in a paginated response. This value is null if there are
     *         no additional pages.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     *
     * @param nextToken <p>
     *            The string to use in a subsequent request to get the next page
     *            of results in a paginated response. This value is null if
     *            there are no additional pages.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results
     * in a paginated response. This value is null if there are no additional
     * pages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The string to use in a subsequent request to get the next page
     *            of results in a paginated response. This value is null if
     *            there are no additional pages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFindingsResult withNextToken(String nextToken) {
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
        if (getFindingIds() != null)
            sb.append("findingIds: " + getFindingIds() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingIds() == null) ? 0 : getFindingIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFindingsResult == false)
            return false;
        ListFindingsResult other = (ListFindingsResult) obj;

        if (other.getFindingIds() == null ^ this.getFindingIds() == null)
            return false;
        if (other.getFindingIds() != null
                && other.getFindingIds().equals(this.getFindingIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
