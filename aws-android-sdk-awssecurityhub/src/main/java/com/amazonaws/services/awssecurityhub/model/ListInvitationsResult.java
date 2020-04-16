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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

public class ListInvitationsResult implements Serializable {
    /**
     * <p>
     * The details of the invitations returned by the operation.
     * </p>
     */
    private java.util.List<Invitation> invitations;

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The details of the invitations returned by the operation.
     * </p>
     *
     * @return <p>
     *         The details of the invitations returned by the operation.
     *         </p>
     */
    public java.util.List<Invitation> getInvitations() {
        return invitations;
    }

    /**
     * <p>
     * The details of the invitations returned by the operation.
     * </p>
     *
     * @param invitations <p>
     *            The details of the invitations returned by the operation.
     *            </p>
     */
    public void setInvitations(java.util.Collection<Invitation> invitations) {
        if (invitations == null) {
            this.invitations = null;
            return;
        }

        this.invitations = new java.util.ArrayList<Invitation>(invitations);
    }

    /**
     * <p>
     * The details of the invitations returned by the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invitations <p>
     *            The details of the invitations returned by the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInvitationsResult withInvitations(Invitation... invitations) {
        if (getInvitations() == null) {
            this.invitations = new java.util.ArrayList<Invitation>(invitations.length);
        }
        for (Invitation value : invitations) {
            this.invitations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The details of the invitations returned by the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invitations <p>
     *            The details of the invitations returned by the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInvitationsResult withInvitations(java.util.Collection<Invitation> invitations) {
        setInvitations(invitations);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The pagination token to use to request the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextToken <p>
     *            The pagination token to use to request the next page of
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextToken <p>
     *            The pagination token to use to request the next page of
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListInvitationsResult withNextToken(String nextToken) {
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
        if (getInvitations() != null)
            sb.append("Invitations: " + getInvitations() + ",");
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
                + ((getInvitations() == null) ? 0 : getInvitations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInvitationsResult == false)
            return false;
        ListInvitationsResult other = (ListInvitationsResult) obj;

        if (other.getInvitations() == null ^ this.getInvitations() == null)
            return false;
        if (other.getInvitations() != null
                && other.getInvitations().equals(this.getInvitations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
