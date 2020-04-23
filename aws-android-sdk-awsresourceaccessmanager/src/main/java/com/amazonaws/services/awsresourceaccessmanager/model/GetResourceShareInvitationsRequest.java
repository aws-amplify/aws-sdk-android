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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the invitations for resource sharing that you've received.
 * </p>
 */
public class GetResourceShareInvitationsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Names (ARN) of the invitations.
     * </p>
     */
    private java.util.List<String> resourceShareInvitationArns;

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     */
    private java.util.List<String> resourceShareArns;

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the invitations.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARN) of the invitations.
     *         </p>
     */
    public java.util.List<String> getResourceShareInvitationArns() {
        return resourceShareInvitationArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the invitations.
     * </p>
     *
     * @param resourceShareInvitationArns <p>
     *            The Amazon Resource Names (ARN) of the invitations.
     *            </p>
     */
    public void setResourceShareInvitationArns(
            java.util.Collection<String> resourceShareInvitationArns) {
        if (resourceShareInvitationArns == null) {
            this.resourceShareInvitationArns = null;
            return;
        }

        this.resourceShareInvitationArns = new java.util.ArrayList<String>(
                resourceShareInvitationArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the invitations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareInvitationArns <p>
     *            The Amazon Resource Names (ARN) of the invitations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceShareInvitationsRequest withResourceShareInvitationArns(
            String... resourceShareInvitationArns) {
        if (getResourceShareInvitationArns() == null) {
            this.resourceShareInvitationArns = new java.util.ArrayList<String>(
                    resourceShareInvitationArns.length);
        }
        for (String value : resourceShareInvitationArns) {
            this.resourceShareInvitationArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the invitations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareInvitationArns <p>
     *            The Amazon Resource Names (ARN) of the invitations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceShareInvitationsRequest withResourceShareInvitationArns(
            java.util.Collection<String> resourceShareInvitationArns) {
        setResourceShareInvitationArns(resourceShareInvitationArns);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARN) of the resource shares.
     *         </p>
     */
    public java.util.List<String> getResourceShareArns() {
        return resourceShareArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     *
     * @param resourceShareArns <p>
     *            The Amazon Resource Names (ARN) of the resource shares.
     *            </p>
     */
    public void setResourceShareArns(java.util.Collection<String> resourceShareArns) {
        if (resourceShareArns == null) {
            this.resourceShareArns = null;
            return;
        }

        this.resourceShareArns = new java.util.ArrayList<String>(resourceShareArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareArns <p>
     *            The Amazon Resource Names (ARN) of the resource shares.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceShareInvitationsRequest withResourceShareArns(String... resourceShareArns) {
        if (getResourceShareArns() == null) {
            this.resourceShareArns = new java.util.ArrayList<String>(resourceShareArns.length);
        }
        for (String value : resourceShareArns) {
            this.resourceShareArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceShareArns <p>
     *            The Amazon Resource Names (ARN) of the resource shares.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceShareInvitationsRequest withResourceShareArns(
            java.util.Collection<String> resourceShareArns) {
        setResourceShareArns(resourceShareArns);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     *
     * @return <p>
     *         The token for the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceShareInvitationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @return <p>
     *         The maximum number of results to return with a single call. To
     *         retrieve the remaining results, make another call with the
     *         returned <code>nextToken</code> value.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve
     * the remaining results, make another call with the returned
     * <code>nextToken</code> value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 500<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return with a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned <code>nextToken</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourceShareInvitationsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getResourceShareInvitationArns() != null)
            sb.append("resourceShareInvitationArns: " + getResourceShareInvitationArns() + ",");
        if (getResourceShareArns() != null)
            sb.append("resourceShareArns: " + getResourceShareArns() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceShareInvitationArns() == null) ? 0
                        : getResourceShareInvitationArns().hashCode());
        hashCode = prime * hashCode
                + ((getResourceShareArns() == null) ? 0 : getResourceShareArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceShareInvitationsRequest == false)
            return false;
        GetResourceShareInvitationsRequest other = (GetResourceShareInvitationsRequest) obj;

        if (other.getResourceShareInvitationArns() == null
                ^ this.getResourceShareInvitationArns() == null)
            return false;
        if (other.getResourceShareInvitationArns() != null
                && other.getResourceShareInvitationArns().equals(
                        this.getResourceShareInvitationArns()) == false)
            return false;
        if (other.getResourceShareArns() == null ^ this.getResourceShareArns() == null)
            return false;
        if (other.getResourceShareArns() != null
                && other.getResourceShareArns().equals(this.getResourceShareArns()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
