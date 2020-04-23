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

package com.amazonaws.services.awsresourceaccessmanager.model;

import java.io.Serializable;

public class GetResourceShareInvitationsResult implements Serializable {
    /**
     * <p>
     * Information about the invitations.
     * </p>
     */
    private java.util.List<ResourceShareInvitation> resourceShareInvitations;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the invitations.
     * </p>
     *
     * @return <p>
     *         Information about the invitations.
     *         </p>
     */
    public java.util.List<ResourceShareInvitation> getResourceShareInvitations() {
        return resourceShareInvitations;
    }

    /**
     * <p>
     * Information about the invitations.
     * </p>
     *
     * @param resourceShareInvitations <p>
     *            Information about the invitations.
     *            </p>
     */
    public void setResourceShareInvitations(
            java.util.Collection<ResourceShareInvitation> resourceShareInvitations) {
        if (resourceShareInvitations == null) {
            this.resourceShareInvitations = null;
            return;
        }

        this.resourceShareInvitations = new java.util.ArrayList<ResourceShareInvitation>(
                resourceShareInvitations);
    }

    /**
     * <p>
     * Information about the invitations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareInvitations <p>
     *            Information about the invitations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceShareInvitationsResult withResourceShareInvitations(
            ResourceShareInvitation... resourceShareInvitations) {
        if (getResourceShareInvitations() == null) {
            this.resourceShareInvitations = new java.util.ArrayList<ResourceShareInvitation>(
                    resourceShareInvitations.length);
        }
        for (ResourceShareInvitation value : resourceShareInvitations) {
            this.resourceShareInvitations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the invitations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareInvitations <p>
     *            Information about the invitations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceShareInvitationsResult withResourceShareInvitations(
            java.util.Collection<ResourceShareInvitation> resourceShareInvitations) {
        setResourceShareInvitations(resourceShareInvitations);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. This value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceShareInvitationsResult withNextToken(String nextToken) {
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
        if (getResourceShareInvitations() != null)
            sb.append("resourceShareInvitations: " + getResourceShareInvitations() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceShareInvitations() == null) ? 0 : getResourceShareInvitations()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceShareInvitationsResult == false)
            return false;
        GetResourceShareInvitationsResult other = (GetResourceShareInvitationsResult) obj;

        if (other.getResourceShareInvitations() == null
                ^ this.getResourceShareInvitations() == null)
            return false;
        if (other.getResourceShareInvitations() != null
                && other.getResourceShareInvitations().equals(this.getResourceShareInvitations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
