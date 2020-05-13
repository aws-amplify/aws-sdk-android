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

public class ListMembersResult implements Serializable {
    /**
     * <p>
     * An array of objects, one for each account that's associated with the
     * master account and meets the criteria specified by the onlyAssociated
     * request parameter.
     * </p>
     */
    private java.util.List<Member> members;

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
     * An array of objects, one for each account that's associated with the
     * master account and meets the criteria specified by the onlyAssociated
     * request parameter.
     * </p>
     *
     * @return <p>
     *         An array of objects, one for each account that's associated with
     *         the master account and meets the criteria specified by the
     *         onlyAssociated request parameter.
     *         </p>
     */
    public java.util.List<Member> getMembers() {
        return members;
    }

    /**
     * <p>
     * An array of objects, one for each account that's associated with the
     * master account and meets the criteria specified by the onlyAssociated
     * request parameter.
     * </p>
     *
     * @param members <p>
     *            An array of objects, one for each account that's associated
     *            with the master account and meets the criteria specified by
     *            the onlyAssociated request parameter.
     *            </p>
     */
    public void setMembers(java.util.Collection<Member> members) {
        if (members == null) {
            this.members = null;
            return;
        }

        this.members = new java.util.ArrayList<Member>(members);
    }

    /**
     * <p>
     * An array of objects, one for each account that's associated with the
     * master account and meets the criteria specified by the onlyAssociated
     * request parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param members <p>
     *            An array of objects, one for each account that's associated
     *            with the master account and meets the criteria specified by
     *            the onlyAssociated request parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMembersResult withMembers(Member... members) {
        if (getMembers() == null) {
            this.members = new java.util.ArrayList<Member>(members.length);
        }
        for (Member value : members) {
            this.members.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each account that's associated with the
     * master account and meets the criteria specified by the onlyAssociated
     * request parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param members <p>
     *            An array of objects, one for each account that's associated
     *            with the master account and meets the criteria specified by
     *            the onlyAssociated request parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMembersResult withMembers(java.util.Collection<Member> members) {
        setMembers(members);
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
    public ListMembersResult withNextToken(String nextToken) {
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
        if (getMembers() != null)
            sb.append("members: " + getMembers() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembers() == null) ? 0 : getMembers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMembersResult == false)
            return false;
        ListMembersResult other = (ListMembersResult) obj;

        if (other.getMembers() == null ^ this.getMembers() == null)
            return false;
        if (other.getMembers() != null && other.getMembers().equals(this.getMembers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
